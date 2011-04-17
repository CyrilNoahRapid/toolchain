/* --COPYRIGHT--,EPL
 *  Copyright (c) 2008 Texas Instruments and others.
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
 *  ======== getMemoryMap ========
 *  Returns the memory map as seen by a program running on this device
 *  when the registers are set as specified by the regs hash.
 */
function getMemoryMap(regs)
{
    /* add common memory blocks to this device's memory map */
    for (var key in this.commonMap) {
        this.memMap[key] = this.commonMap[key];
    }
    return (this.memMap);
}

/*
 *  ======== instance$meta$init ========
 */
function instance$meta$init()
{
    var Clock = xdc.useModule("ti.catalog.msp430.peripherals.clock.Clock2xx");
    var TIMER_A3 = xdc.useModule("ti.catalog.msp430.peripherals.timer.Timer_A3");
    var TIMER_B3 = xdc.useModule("ti.catalog.msp430.peripherals.timer.Timer_B3");
    var USCI_A0_UART = 
        xdc.useModule("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx");
    var USCI_A0_SPI = 
        xdc.useModule("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx");
    var USCI_B0_SPI = 
        xdc.useModule("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx");
    var USCI_B0_I2C = 
        xdc.useModule("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx");
    var ADC10 = xdc.useModule("ti.catalog.msp430.peripherals.adc.ADC10");
    var WDTPlus =
        xdc.useModule("ti.catalog.msp430.peripherals.watchdog.WDTPlus");
    var OA = xdc.useModule("ti.catalog.msp430.peripherals.oa.OA_2");
    var GPIO = xdc.useModule("ti.catalog.msp430.peripherals.gpio.GPIO_MSP430x22xx");
    var IE1 = xdc.useModule("ti.catalog.msp430.peripherals.special_function.IE1");
    var IE2 = xdc.useModule("ti.catalog.msp430.peripherals.special_function.IE2");
    var FLASH = xdc.useModule("ti.catalog.msp430.peripherals.memory.Flash_2xx");
    var IC = xdc.useModule("ti.catalog.msp430.peripherals.interrupt."
        + "Interrupt_Controller");
    
    this.interruptEnableRegister1 = IE1.create({name: "interruptEnableRegister1"});
    this.interruptEnableRegister2 = IE2.create({name: "interruptEnableRegister2"});
    this.clock = Clock.create(this.interruptEnableRegister1, {name: "clock", baseAddr: 0x53});
    this.timer_A3 = TIMER_A3.create(this.clock,
    	{name: "Timer_A3", baseAddr: 0x160, intNum: 9});
    this.timer_B3 = TIMER_B3.create(this.clock,
    	{name: "Timer_B3", baseAddr: 0x180, intNum: 13});
    this.flash = FLASH.create(this.clock, {name: "flash"});
    this.usci_A0_UART = USCI_A0_UART.create(this.clock, this.interruptEnableRegister2,
    	{name: "usci_A0_UART"});
    this.usci_A0_SPI = USCI_A0_SPI.create(this.clock, this.interruptEnableRegister2,
    	{name: "usci_A0_SPI"});
    this.usci_B0_SPI = USCI_B0_SPI.create(this.clock, this.interruptEnableRegister2,
    	{name: "usci_B0_SPI"});
    this.usci_B0_I2C = USCI_B0_I2C.create(this.clock, this.interruptEnableRegister2,
    	{name: "usci_B0_I2C"});
    this.adc10 = ADC10.create(this.clock, this.timer_A3, {name: "adc10"});
    this.wdtPlus = WDTPlus.create(this.clock, this.interruptEnableRegister1,
        {name: "wdtPlus", baseAddr: 0x120});
    this.oa = OA.create({name: "oa"});
    this.gpio = GPIO.create(this.adc10, {name: "gpio"});
    this.interruptController = IC.create(
        {name: "interruptController", baseAddr: 0xFFE0, numInterrupts: 16});
}
