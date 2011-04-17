/*!
 *  ======== Interrupt_Controller ========
 *  MSP430 Interrupt_Controller
 */
metaonly module Interrupt_Controller inherits xdc.platform.IPeripheral {

instance:

    config UInt baseAddr;
    config UInt numInterrupts;
}
