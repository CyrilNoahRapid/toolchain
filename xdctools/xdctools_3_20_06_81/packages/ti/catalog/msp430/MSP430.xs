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

var peripheralsTable = {};

peripheralsTable["MSP430F2274"] = [
    {
        factory: "ti.catalog.msp430.peripherals.special_function.IE1",
        params: {name: "interruptEnableRegister1"}
    },
    {
        factory: "ti.catalog.msp430.peripherals.special_function.IE2",
        params: {name: "interruptEnableRegister2"}
    },
    {
        factory: "ti.catalog.msp430.peripherals.clock.Clock2xx",
        required: ["interruptEnableRegister1"],
        params: {name: "clock", baseAddr: 0x53}
    },
    {
        factory: "ti.catalog.msp430.peripherals.oa.OA_2",
        params: {name: "oa"}
    },
    {
        factory: "ti.catalog.msp430.peripherals.watchdog.WDTPlus",
        required: ["clock", "interruptEnableRegister1"],
        params: {name: "wdtPlus", baseAddr: 0x120}
    },
    {
        factory: "ti.catalog.msp430.peripherals.memory.Flash_2xx",
        required: ["clock"],
        params: {name: "flash"}
    },
    {
        factory: "ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx",
        required: ["clock", "interruptEnableRegister2"],
        params: {name: "usci_A0_UART"}
    },
    {
        factory: "ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx",
        required: ["clock", "interruptEnableRegister2"],
        params: {name: "usci_A0_SPI"}
    },
    {
        factory: "ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx",
        required: ["clock", "interruptEnableRegister2"],
        params: {name: "usci_B0_SPI"}
    },
    {
        factory: "ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx",
        required: ["clock", "interruptEnableRegister2"],
        params: {name: "usci_B0_I2C"}
    },
    {
        factory: "ti.catalog.msp430.peripherals.timer.Timer_A3",
        required: ["clock"],
        params: {name: "Timer_A3", baseAddr: 0x160, intNum: 9}
    },
    {
        factory: "ti.catalog.msp430.peripherals.timer.Timer_B3",
        required: ["clock"],
        params: {name: "Timer_B3", baseAddr: 0x180, intNum: 13}
    },
    {
        factory: "ti.catalog.msp430.peripherals.adc.ADC10",
        required: ["clock", "Timer_A3"],
        params: {name: "adc10"}
    },
    {
        factory: "ti.catalog.msp430.peripherals.gpio.GPIO_MSP430x22xx",
        required: ["adc10"],
        params: {name: "gpio"}
    },
];

peripheralsTable["MSP430F5438"] = [
    {
        factory: "ti.catalog.msp430.peripherals.special_function.IE1",
        params: {name: "interruptEnableRegister1"}
    },
    {
        factory: "ti.catalog.msp430.peripherals.clock.Clock2xx",
        required: ["interruptEnableRegister1"],
        params: {name: "clock", baseAddr: 0x160}
    },
    {
        factory: "ti.catalog.msp430.peripherals.timer.Timer_A3",
        required: ["clock"],
        params: {name: "TA0", baseAddr: 0x340, intNum: 54}
    },
    {
        factory: "ti.catalog.msp430.peripherals.timer.Timer_A5",
        required: ["clock"],
        params: {name: "TA1", baseAddr: 0x380, intNum: 49}
    },
    {
        factory: "ti.catalog.msp430.peripherals.timer.Timer_B7",
        required: ["clock"],
        params: {name: "TB0", baseAddr: 0x3C0, intNum: 60}
    },
    {
        factory: "ti.catalog.msp430.peripherals.watchdog.WDTPlus",
        required: ["clock", "interruptEnableRegister1"],
        params: {name: "wdtPlus", baseAddr: 0x15c}
    },
];

peripheralsTable["MSP430F5529"] = [
    {
        factory: "ti.catalog.msp430.peripherals.special_function.IE1",
        params: {name: "interruptEnableRegister1"}
    },
    {
        factory: "ti.catalog.msp430.peripherals.clock.Clock2xx",
        required: ["interruptEnableRegister1"],
        params: {name: "clock", baseAddr: 0x160}
    },
    {
        factory: "ti.catalog.msp430.peripherals.timer.Timer_A5",
        required: ["clock"],
        params: {name: "TA0", baseAddr: 0x340, intNum: 53}
    },
    {
        factory: "ti.catalog.msp430.peripherals.timer.Timer_A3",
        required: ["clock"],
        params: {name: "TA1", baseAddr: 0x380, intNum: 49}
    },
    {
        factory: "ti.catalog.msp430.peripherals.timer.Timer_A3",
        required: ["clock"],
        params: {name: "TA2", baseAddr: 0x400, intNum: 44}
    },
    {
        factory: "ti.catalog.msp430.peripherals.timer.Timer_B7",
        required: ["clock"],
        params: {name: "TB0", baseAddr: 0x3C0, intNum: 59}
    },
    {
        factory: "ti.catalog.msp430.peripherals.watchdog.WDTPlus",
        required: ["clock", "interruptEnableRegister1"],
        params: {name: "wdtPlus", baseAddr: 0x15c}
    },
];

/*
 *  ======== instance$meta$init ========
 */
function instance$meta$init(revision)
{
    this.$private.realDevice = revision;
    var IC = xdc.useModule(
        "ti.catalog.msp430.peripherals.interrupt.Interrupt_Controller"
    );
    var Boot = xdc.useModule('ti.catalog.msp430.init.Boot');
    Boot.disableWatchdog = true;

    var tableEntry;    
    /* F2274 represents all F22, F23, F43, F477, F478 and F479 devices for
     * peripherals important to BIOS.
     *
     * F5438 represents all F54 and F55 devices for peripherals 
     * important to BIOS.
     */
    if (this.$private.realDevice.match(/^MSP430F(22|23|4(3|77|78|79))\d+/)) {
        this.peripherals["interruptController"] = IC.create(
            {name: "interruptController", baseAddr: 0xFFE0, numInterrupts: 16}
        );
        Boot.configureDCO = false;
        tableEntry = "MSP430F2274";
    }
    else if (this.$private.realDevice.match(/^MSP430F54\d+/)) {
        this.peripherals["interruptController"] = IC.create(
            {name: "interruptController", baseAddr: 0xFF80, numInterrupts: 64}
        );
        Boot.configureDCO = true;
        tableEntry = "MSP430F5438";
    }
    else if (this.$private.realDevice.match(/^MSP430F55\d+/)) {
        this.peripherals["interruptController"] = IC.create(
            {name: "interruptController", baseAddr: 0xFF80, numInterrupts: 64}
        );
        Boot.configureDCO = true;
        tableEntry = "MSP430F5529";
    }
    else {
        this.$module.$logFatal("Device " + revision + " is not supported.",
            this.$module);
    }

    if (peripheralsTable[tableEntry] != null) {
        for (var i = 0; i < peripheralsTable[tableEntry].length; i++) {
            var entry = peripheralsTable[tableEntry][i];
            var modName = entry.factory;
            var mod = xdc.useModule(modName);
            var params = entry.params;

            /* construct the create arguments */
            var args = [];
            if ("required" in entry) {
                for (var j = 0; j < entry.required.length; j++) {
                    var peripheralName = entry.required[j];
                    var peripheral = this.peripherals[peripheralName];
                    if (!peripheral) {
                        this.$module.$logWarning(peripheralName +
                            " must be initialized before " + params.name,
                            this, "peripherals");
                    }
                    args.push(peripheral);
                }
            }
            args.push(params);

            /* construct the peripheral */
            this.peripherals[params.name] = mod.create.$apply(mod, args);
        }
    }

    Boot.watchdogAddress = this.peripherals["wdtPlus"].$orig.baseAddr;
}

/*
 *  ======== MSP430.getMemoryMap ========
 *  Returns the memory map as seen by a program running on this device.
 */
function getMemoryMap(regs)
{
    var linkerFile = xdc.findFile("ti/mcu/msp430/include/lnk_"
        + this.$private.realDevice.toLowerCase() + ".cmd");
    if (linkerFile == null) {
        this.$module.$logFatal("Device " + this.$private.realDevice
            + " is not supported.", this.$module);
    }
    
    var file = xdc.module("xdc.services.io.File").open(linkerFile, "r");
    
    var memoryMode = false;
    var memMap = new xdc.om['xdc.platform.IPlatform'].MemoryMap();
    var i = 0;
    var line;
    while ((line = file.readLine()) != null) {
        if (!memoryMode) {
            if (line.match(/^\s*MEMORY\s*\{*/)) {
                memoryMode = true;
            }
        }
        else {
            if (line.match(/\}/)) {
                memoryMode = false;
            }
            var memoryObject = 
                line.match(/^\s*(\w+)\s*:\s*origin\s*=\s*(0x\w+),\s*length\s*=\s*(0x\w+)/);
            if (memoryObject) {
                memMap[memoryObject[1]] = {
                    comment: memoryObject[1],
                    name: memoryObject[1],
                    base: parseInt(memoryObject[2]),
                    len: parseInt(memoryObject[3]),
                }
            }
        }
    }
    file.close();
    
    return (memMap);
}
