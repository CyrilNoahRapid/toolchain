/* 
 *  Copyright (c) 2008 Texas Instruments and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *      Texas Instruments - initial implementation
 * 
 * */
/*
 *  ======== IArm.asmName ========
 */
function asmName(CName)
{
    return (CName);
}

/*
 *  ======== IArm.link ========
 */
function _hide_link(goal)
{
    var target = this;
    
    var cap = xdc.loadCapsule("ti/targets/ITarget.xs");
    var _bldUtils = xdc.useModule('xdc.bld.Utils');

    cap._initTabs();

    var compString = this.getVersion().split('{')[1];
    var compVersion = compString.split(',');
          
    /* Partial link can be used only in compilers with the fix for SDOCM31285 */
    if (compVersion[2] < "4.6"
        || (compVersion[2] == "4.6" && compVersion[3] < "3")) {
         return (cap.link.call(this, goal));
    }

    var result = null;
    var tool2cmd = cap._targetCmds[target.suffix];

    if (tool2cmd != null) {
        result = new xdc.om['xdc.bld.ITarget'].CommandSet;
        result.msg = "lnk" + target.suffix + " $@ ...";
        cap._setEnv(target, result);

        var lib = "";
        if (("linkLib" in target) && target.linkLib != null) {
            lib = " -l $(rootDir)/lib/" + target.linkLib;
        }

        var cmd = tool2cmd["link"];
        var pre = target.lnkOpts == null ? "" :
            (goal.dllMode ? "" : target.lnkOpts.prefix);

        if (goal.profile.match(/whole_program/)) {
            /* If the linkOpts are set for the 'whole_program' profile or the
             * 'whole_progam_debug' profile, and these options set compile
             * options, then an additional set of the compile options should
             * not be added. This is intended for the internal use only.
             */
            if (this.profiles[goal.profile].linkOpts == undefined ||
                !this.profiles[goal.profile].linkOpts.match(/--opt/)) {
                var allOpts = target.cc.opts + " " + target.ccOpts.prefix
                    + " " + target.ccOpts.suffix
                    + " " + "--diag_suppress=23000"
                    + " " + this.profiles[goal.profile].compileOpts.copts
                    + " -op2 -O3";

                /* The profile "whole_program" compiles with '-O2' because we
                 * want the standard object code to be optimized at O2 level in
                 * case it is linked without invoking the optimizer from the
                 * linker. However, we already added '-O3' for the case when
                 * the linker invokes the optimizer, so we need to remove '-O2'
                 * to avoid confusion.
                 */
                allOpts = allOpts.replace(" -O2", " ");
                if (goal.profile == "whole_program_debug") {
                    allOpts += " --optimize_with_debug";
                }

                pre += " --opt='" + allOpts + " --inline_recursion_limit=20'";

            }
        }

        result.cmds = _bldUtils.expandString(cmd, {
            LOPTS_P: pre,
            LOPTS_S: target.lnkOpts == null ? "" :
                (goal.dllMode ? "-r -m $(XDCCFGDIR)/$@.map" :
                                target.lnkOpts.suffix + lib),
            lopts:   goal.opts,
            files:   goal.files
        });

        if (goal.dllMode) {
            result.cmds += "$(MV) $@ $(XDCCFGDIR)/$@.obj\n";
            result.cmds += "$(TOUCH) $@\n";
        }
    }

    return (result);
}
/*
 *  @(#) ti.targets.arm.elf; 1, 0, 0,178; 12-7-2010 14:48:17; /db/ztree/library/trees/xdctargets/xdctargets-c37x/src/ xlibrary

 */

