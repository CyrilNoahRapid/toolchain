/*!
 *  ======== IE2 ========
 *  MSP430 Interrupt Enable Register 2
 */
metaonly module IE2 inherits xdc.platform.IPeripheral {

    /* USCI_B0 transmit interrupt enable */
    enum UCB0TXIE_t {
        UCB0TXIE_OFF = 0x00,            /*! Interrupt disabled */
        UCB0TXIE     = 0x08             /*! Interrupt enabled */
    };

    /* USCI_B0 receive interrupt enable */
    enum UCB0RXIE_t {
        UCB0RXIE_OFF = 0x00,            /*! Interrupt disabled */
        UCB0RXIE     = 0x04             /*! Interrupt enabled */
    };
    
    /* USCI_A0 transmit interrupt enable */
    enum UCA0TXIE_t {
        UCA0TXIE_OFF = 0x00,            /*! Interrupt disabled */
        UCA0TXIE     = 0x02             /*! Interrupt enabled */
    };
    
    /* USCI_A0 receive interrupt enable */
    enum UCA0RXIE_t {
        UCA0RXIE_OFF = 0x00,            /*! Interrupt disabled */
        UCA0RXIE     = 0x01             /*! Interrupt enabled */
    };
    
    
    /*! IE2, Interrupt Enable Register 2 */
    struct IE2_t {
        UCB0TXIE_t  UCB0TXIE;           /*! USCI_B0 transmit interrupt enable
                                         *  0 Interrupt disabled
                                         *  1 Interrupt enabled */
        UCB0RXIE_t  UCB0RXIE;           /*! USCI_B0 receive interrupt enable
                                         *  0 Interrupt disabled
                                         *  1 Interrupt enabled */
        UCA0TXIE_t  UCA0TXIE;           /*! USCI_A0 transmit interrupt enable
                                         *  0 Interrupt disabled
                                         *  1 Interrupt enabled */
        UCA0RXIE_t  UCA0RXIE;           /*! USCI_A0 receive interrupt enable
                                         *  0 Interrupt disabled
                                         *  1 Interrupt enabled */
    }

    /*!
    *  ======== ForceSetDefaultRegister_t ========
    *  Force Set Default Register
    *
    *  Type to store if each register needs to be forced initialized
    *  even if the register is in default state.
    *
    *  @see #ForceSetDefaultRegister_t
    */
    struct ForceSetDefaultRegister_t {
        String     register;
        Bool       regForceSet;
    }
    
instance:
    /*! IE2, Interrupt Enable Register 2 */
    config IE2_t IE2 = {
        UCB0TXIE    : UCB0TXIE_OFF,
        UCB0RXIE    : UCB0RXIE_OFF,
        UCA0TXIE    : UCA0TXIE_OFF,
        UCA0RXIE    : UCA0RXIE_OFF,
    };
    
   /*!
    *  ======== getUCB0TXIE ========
    *  Gets UCB0TXIE bit
    *
    *  @see #getUCB0TXIE
    */
    Bool    getUCB0TXIE();
    
   /*!
    *  ======== setUCB0TXIE ========
    *  Sets UCB0TXIE bit
    *
    *  @see #setUCB0TXIE
    */
    Bool    setUCB0TXIE(Bool set);
    
   /*!
    *  ======== getUCB0RXIE ========
    *  Gets UCB0RXIE bit
    *
    *  @see #getUCB0RXIE
    */
    Bool    getUCB0RXIE();
    
   /*!
    *  ======== setUCB0RXIE ========
    *  Sets UCB0RXIE bit
    *
    *  @see #setUCB0RXIE
    */
    Bool    setUCB0RXIE(Bool set);
    
   /*!
    *  ======== getUCA0TXIE ========
    *  Gets UCA0TXIE bit
    *
    *  @see #getUCA0TXIE
    */
    Bool    getUCA0TXIE();
    
   /*!
    *  ======== setUCA0TXIE ========
    *  Sets UCA0TXIE bit
    *
    *  @see #setUCA0TXIE
    */
    Bool    setUCA0TXIE(Bool set);
    
   /*!
    *  ======== getUCA0RXIE ========
    *  Gets UCA0RXIE bit
    *
    *  @see #getUCA0RXIE
    */
    Bool    getUCA0RXIE();
    
   /*!
    *  ======== setUCA0RXIE ========
    *  Sets UCA0RXIE bit
    *
    *  @see #setUCA0RXIE
    */
    Bool    setUCA0RXIE(Bool set);

    /*! Determine if each Register needs to be forced set or not */
    readonly config ForceSetDefaultRegister_t forceSetDefaultRegister[] =
    [
        { register : "IE2" , regForceSet : false },
    ];
}
