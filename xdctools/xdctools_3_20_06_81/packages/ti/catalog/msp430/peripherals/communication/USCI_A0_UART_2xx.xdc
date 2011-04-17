import ti.catalog.msp430.peripherals.clock.IClock;
import ti.catalog.msp430.peripherals.special_function.IE2;

/*!
 * Universal Serial Communication Interface A0 UART 2xx
 */
metaonly module USCI_A0_UART_2xx inherits IUSCI_A0_UART {
    /* Add 2xx-specific stuff here */
    
    /*
     *  ======== create ========
     */
    create(IClock.Instance clock , IE2.Instance interruptEnableRegister2);
    
instance:
    /*! @_nodoc */
    config IClock.Instance clock;
    /*! @_nodoc */
    config IE2.Instance interruptEnableRegister2;

    /*! Determine if each Register needs to be forced set or not */
    readonly config ForceSetDefaultRegister_t forceSetDefaultRegister[] =
    [
        { register : "UCA0CTL0"   , regForceSet : false },
        { register : "UCA0CTL1"   , regForceSet : false },
        { register : "UCA0BR0"    , regForceSet : false },
        { register : "UCA0BR1"    , regForceSet : false },
        { register : "UCA0MCTL"   , regForceSet : false },
        { register : "UCA0STAT"   , regForceSet : false },
        { register : "UCA0RXBUF"  , regForceSet : false },
        { register : "UCA0TXBUF"  , regForceSet : false },
        { register : "UCA0ABCTL"  , regForceSet : false },
        { register : "UCA0IRTCTL" , regForceSet : false },
        { register : "UCA0IRRCTL" , regForceSet : false }
    ];
}
