/* --COPYRIGHT--,EPL
 *  Copyright (c) 2010 Texas Instruments and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *      Texas Instruments - initial implementation
 * 
 * --/COPYRIGHT--*/
/*
 *  ======== Platform.xs ========
 *  Generic platform support for MSP430 devices.
 */

/*
 *  ======== Platform.getCpuDataSheet ========
 *  This Platform's implementation xdc.platform.IPlatform.getCpuDataSheet.
 *
 *  Return the xdc.platform.ICpuDataSheet.Instance object that corresponds
 *  to the device that runs executables loaded on the specified cpuId.
 */
function getCpuDataSheet(cpuId)
{
    var Utils = xdc.useModule('xdc.platform.Utils');
    var cpuAttrs = this.CPU.$copy();
    cpuAttrs.deviceName = this.deviceName;
    return (Utils.getCpuDataSheet(cpuAttrs));
}

/*
 *  ======== Platform.getExeContext ========
 *  This Platform's implementation xdc.platform.IPlatform.getExeContext.
 *
 *  Return the xdc.platform.IExeContext.Instance object that will run the
 *  specified program prog.
 */
function getExeContext(prog)
{
    var Utils = xdc.module("xdc.platform.Utils");

    /* create a default ExeContext execution context */
    var ExeContext = xdc.useModule('xdc.platform.ExeContext');
    var cpu = ExeContext.create(this.CPU, this.$module.BOARD);

    /* This is where we have peripherals available, so we can get their base
     * addresses and other info.
     */

    cpu.memoryMap = Utils.assembleMemoryMap(cpu, this);
    cpu.deviceName = this.CPU.revision;
    cpu.revision = "";
    
    /* check for the overlap in the memory map */
    var overlap = Utils.checkOverlap(cpu.memoryMap);

    if (overlap != null) {
        this.$module.$logError("Memory objects " + overlap + " overlap", this,
            overlap);
    }

    /* This platform does not perform section allocation for the target
     * sections, so the default memory objects are not needed. However,
     * Program.getSectMap expects them to be defined. Program.getSectMap() is
     * invoked from genSections() invoked in the linker command template.
     * Therefore, we need to initialize default memory object as we do for any
     * other platform.
     */
    _initDefaultMemory(this, cpu.memoryMap);
    Utils.checkDefaults(this, cpu.memoryMap);
    this.$seal();
    return (cpu);
}

/*
 *  ======== Platform.getExecCmd ========
 *  This Platform's implementation xdc.platform.IPlatform.getExecCmd.
 */
function getExecCmd(prog, packagePath)
{
    var os = environment["xdc.hostOS"];
    var doNotKnow = "@$(ECHO) ti.platforms.msp430 platform package cannot "
        + "execute " + prog.name + " on " + os + "\n";
    return (doNotKnow);
}

/*
 *  ======== Platform.getLinkTemplate ========
 *  This Platform's implementation xdc.platform.IPlatform.getLinkTemplate
 */
function getLinkTemplate(prog)
{
    return ("ti/platforms/msp430/linkcmd.xdt");
}

/*
 *  ======== Platform.Instance.init ========
 *  This function is called to initialize a newly created instance of a
 *  platform.  Platform instances are created just prior to running
 *  program configuration scripts.
 *
 *  Platform instances may also be created in the build domain.
 *
 *  name is the name used to identify this instance (without the package
 *  name prefix).
 *
 *  args is a deprecated parameter that shouldn't be used.
 */
function instance$meta$init(name, args)
{
    if (name != "" && this.deviceName != null && this.deviceName != name) {
        this.$module.$logError(this.$package.$name 
            + " was passed two different device names: '"
            + name + "' and '" + this.deviceName + "'.",
            this, this.deviceName);
    }
    else if (name != "") {
        this.deviceName = name;
    }

    if (this.deviceName == null) {
        this.$module.$logFatal("A device name must be specified for the "
            + "platform '" + this.$package.$name + "'. A device name can be "
            + "specified in the platform name, as "
            + "'ti.platforms.msp430:MSP430XYZ', where MSP430XYZ is the name "
            + "of the selected device.", this, this.deviceName);
    }

    if (this.externalMemoryMap.length != 0) {
        this.$module.$logWarning(this.$package.$name + " does not support "
            + "external memory map, and the parameter 'externalMemoryMap' is "
            + "ignored.", this, this.externalMemoryMap);    
    }

    /* We use 'revision' to pass 'the real device name' to the generic MSP430
     * device.
     */
    this.CPU.revision = this.deviceName;
    this.CPU.clockRate = this.clockRate;
}

/*
 *  ======== _initDefaultMemory ========
 *  Initialize platform's config parameters that define in which memory segments
 *  to place code and data sections
 */
function _initDefaultMemory(plat, memMap)
{

    /* We need to automatically select codeMemory, dataMemory and stackMemory
     * if they are not defined. The three flags defined below are used to
     * differentiate between user selected objects and selections made in this
     * function. If we already selected a memory object, when we later find
     * another one that could be used and has more space, we switch to that
     * new one. But, if the user selected a memory object, we don't want to
     * redefine it.
     */ 
    var userCodeMem = (plat.codeMemory != null);
    var userDataMem = (plat.dataMemory != null);
    var userStackMem = (plat.stackMemory != null);

    /* The references to the select memory objects are needed to be able to
     * quickly read their 'len' parameters.
     */
    var codeObj = null;
    var dataObj = null;

    /* look for a memory of the right type */
    for (var j = 0; j < memMap.length; j++) {
        var mem = memMap[j];

        /* If we find RAM/FLASH, we put data/code there. In most MSP430 devices
         * these memories are available, and we want data in RAM and code in
         * FLASH.
         */ 
        if (mem.name == "RAM") {
            plat.dataMemory = "RAM";
            userDataMem = true;
            continue;
        }
        if (mem.name == "FLASH") {
            plat.codeMemory = "FLASH";
            userCodeMem = true;
            continue;
        }

        /* If neither 'space' nor 'page' are defined, the memory segment
         * can be used for both, code and data.
         */
        if (mem.space == undefined && mem.page == undefined) {
            if (!userCodeMem && (codeObj == null || codeObj.len < mem.len)) {
                codeObj = mem;
                plat.codeMemory = codeObj.name;
            }
            if (!userDataMem && (dataObj == null || dataObj.len < mem.len)) {
                dataObj = mem;
                plat.dataMemory = dataObj.name;
            }
        }

        else if (mem.space != undefined) {
            if (mem.space.indexOf("code") >= 0) {
                if (!userCodeMem &&
                    (codeObj == null || codeObj.len < mem.len)) {
                    codeObj = mem;
                    plat.codeMemory = codeObj.name;
                }
            }
            if (mem.space.indexOf("data") >= 0) {
                if (!userDataMem &&
                    (dataObj == null || dataObj.len < mem.len)) {
                    dataObj = mem;
                    plat.dataMemory = dataObj.name;
                }
            }
        }

        else if (mem.page != undefined) {
            if (mem.page == 0) {
                if (!userCodeMem &&
                    (codeObj == null || codeObj.len < mem.len)) {
                    codeObj = mem;
                    plat.codeMemory = codeObj.name;
                }
            }
            if (mem.page == 1) {
                if (!userDataMem &&
                    (dataObj == null || dataObj.len < mem.len)) {
                    dataObj = mem;
                    plat.dataMemory = dataObj.name;
                }
            }
        }
    }

    /* if any of two config parameters is null, we cannot continue because the
     * name of the segment for some section would be 'null'.
     */
    if (plat.dataMemory == null) {
        throw new Error("dataMemory in the generic platform is null");
    }
    if (plat.codeMemory == null) {
        throw new Error("codeMemory in the generic platform is null");
    }
    if (!userStackMem) {
        plat.stackMemory = plat.dataMemory;
    }
}
