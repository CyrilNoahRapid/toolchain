import ti.catalog.msp430.peripherals.clock.IClock;
import ti.catalog.msp430.peripherals.special_function.IE1;

/*!
 *  ======== WDT+ ========
 *  MSP430 Watchdog Timer+
 */
metaonly module WDTPlus inherits IWDT {

    enum WDTPW_t {
        WDTPW_OFF = 0x00,
        WDTPW = 0x5A00
    };
    
    enum WDTHOLD_t {
        WDTHOLD_OFF = 0x0000,
        WDTHOLD     = (0x0080)
    };
    
    enum WDTNMIES_t {
        WDTNMIES_OFF = (0x0000),
        WDTNMIES     = (0x0040)
    };
    
    enum WDTNMI_t {
        WDTNMI_OFF = (0x0000),
        WDTNMI     = (0x0020)
    };

    enum WDTTMSEL_t {
        WDTTMSEL_OFF = (0x0000),
        WDTTMSEL     = (0x0010)
    };
    
    enum WDTCNTCL_t {
        WDTCNTCL_OFF = (0x0000),
        WDTCNTCL     = (0x0008)
    };
    
    enum WDTSSEL_t {
        WDTSSEL_OFF = (0x0000),
        WDTSSEL     = (0x0004)
    };

    enum WDTIS1_t {
        WDTIS1_OFF = (0x0000),
        WDTIS1     = (0x0002)
    };
    
    enum WDTIS0_t {
        WDTIS0_OFF = (0x0000),
        WDTIS0     = (0x0001)
    };
    
    /* WDTCTL Register */
    struct WDTCTL_t {
        WDTPW_t     WDTPW;                  /*! WDT+ password */
        WDTHOLD_t   WDTHOLD;                /*! Watchdog timer+ hold. This bit stops the watchdog timer+. Setting
                                               *WDTHOLD = 1 when the WDT+ is not in use conserves power.
                                               *  0    Watchdog timer+ is not stopped
                                               *  1    Watchdog timer+ is stopped
                                               */
        WDTNMIES_t  WDTNMIES;               /*! Watchdog timer+ NMI edge select. This bit selects the interrupt edge for the
                                               *NMI interrupt when WDTNMI = 1. Modifying this bit can trigger an NMI. Modify
                                               *this bit when WDTIE = 0 to avoid triggering an accidental NMI.
                                               *  0    NMI on rising edge
                                               *  1    NMI on falling edge
                                               */
        WDTNMI_t    WDTNMI;                 /*! Watchdog timer+ NMI select. This bit selects the function for the RST/NMI pin.
                                               *  0    Reset function
                                               *  1    NMI function
                                               */
        WDTTMSEL_t  WDTTMSEL;               /*! Watchdog timer+ mode select
                                               *  0    Watchdog mode
                                               *  1    Interval timer mode
                                               */
        WDTCNTCL_t  WDTCNTCL;               /*! Watchdog timer+ counter clear. Setting WDTCNTCL = 1 clears the count
                                               *value to 0000h. WDTCNTCL is automatically reset.
                                               *  0    No action
                                               *  1    WDTCNT = 0000h
                                               */
        WDTSSEL_t   WDTSSEL;                /*! Watchdog timer+ clock source select
                                               *  0    SMCLK
                                               *  1    ACLK
                                               */
        WDTIS0_t    WDTIS0;                 /*! Watchdog timer+ interval select. These bits select the watchdog timer+
                                               *interval to set the WDTIFG flag and/or generate a PUC.
                                               *  00   Watchdog clock source /32768
                                               *  01   Watchdog clock source /8192
                                               *  10   Watchdog clock source /512
                                               *  11   Watchdog clock source /64
                                               */
        WDTIS1_t    WDTIS1;                 /*! Watchdog timer+ interval select. These bits select the watchdog timer+
                                               *interval to set the WDTIFG flag and/or generate a PUC.
                                               *  00   Watchdog clock source /32768
                                               *  01   Watchdog clock source /8192
                                               *  10   Watchdog clock source /512
                                               *  11   Watchdog clock source /64
                                               */
    }
    
    create(IClock.Instance clock , IE1.Instance interruptEnableRegister1);
    
instance:
    /*! WDTCTL, Watchdog Timer+ Register */
    config WDTCTL_t WDTCTL = {
        WDTPW       : WDTPW,
        WDTHOLD     : WDTHOLD_OFF,
        WDTNMIES    : WDTNMIES_OFF,
        WDTNMI      : WDTNMI_OFF,
        WDTTMSEL    : WDTTMSEL_OFF,
        WDTCNTCL    : WDTCNTCL_OFF,
        WDTSSEL     : WDTSSEL_OFF,
        WDTIS0      : WDTIS0_OFF,
        WDTIS1      : WDTIS1_OFF,
    };

    /*! Determine if each Register needs to be forced set or not */
    readonly config ForceSetDefaultRegister_t forceSetDefaultRegister[] =
    [
        { register : "WDTCTL" , regForceSet : false }
    ];
    
    /*!
     *  ======== baseAddr ========
     *  Address of the peripheral's control register.
     *
     *  A peripheral's registers are commonly accessed through a structure
     *  that defines the offsets of a particular register from the lowest
     *  address mapped to a peripheral. That lowest address is specified by
     *  this parameter.
     */
    config UInt baseAddr;

    /*! @_nodoc */
    config IClock.Instance clock;
    
    /*! @_nodoc */
    config IE1.Instance interruptEnableRegister1;
}
