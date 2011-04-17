/* 
 *  Copyright (c) 2010 Texas Instruments and others.
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
 *  ======== addPeripheralsMap ========
 */
function addPeripheralsMap(cpu) {
   var IPeripheral = xdc.module('xdc.platform.IPeripheral');
   
   var device = cpu.$orig;
   for (var prop in device) {
       if (device[prop] instanceof $$Instance
           && device[prop].$module instanceof IPeripheral.Module) {
           device.peripherals[device[prop].name] = device[prop];
       }
   }
}

/*
 *  ======== getAll ========
 */
function getAll() {
    var insts = [];
    var i = 0;
    var peripherals = xdc.module('xdc.cfg.Program').cpu.attrs.peripherals;
    for (var key in peripherals) {
        if (peripherals[key].$module instanceof this.$orig.Module) {
            insts[i++] = peripherals[key];
        }
    }
    
    return (insts);
}

/*
 *  ======== getRegisters ========
 */
function getRegisters() {
    var regs = [];
    
    for (var prop in this.$orig.params) {
        if (prop[0] == prop[0].toUpperCase()) {
            regs.push(prop);
        }    
    }
    return (regs);
}
/*
 *  @(#) xdc.platform; 1, 0, 1, 0,296; 11-16-2010 11:20:10; /db/ztree/library/trees/xdc/xdc-v53x/src/packages/
 */

