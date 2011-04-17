import ti.catalog.msp430.peripherals.clock.IClock;
import ti.catalog.msp430.peripherals.special_function.IE2;

/*!
 * Universal Serial Communication Interface B0 SPI 2xx
 */
metaonly module USCI_B0_SPI_2xx inherits IUSCI_B0_SPI {

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
        { register : "UCB0CTL0"   , regForceSet : false },
        { register : "UCB0CTL1"   , regForceSet : false },
        { register : "UCB0BR0"    , regForceSet : false },
        { register : "UCB0BR1"    , regForceSet : false },
        { register : "UCB0STAT"   , regForceSet : false },
        { register : "UCB0RXBUF"  , regForceSet : false },
        { register : "UCB0TXBUF"  , regForceSet : false }
    ];
}
