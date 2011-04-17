/*!
 * Universal Serial Communication Interface B0 SPI 2xx
 */
metaonly interface IUSCI_B0_SPI inherits IUSCI_SPI {

instance:
    /*! Control Register 0 */
    config UCxCTL0_t UCB0CTL0 = {
        UCCKPH      : UCCKPH_OFF,
        UCCKPL      : UCCKPL_OFF,
        UCMSB       : UCMSB_OFF,
        UC7BIT      : UC7BIT_OFF,
        UCMST       : UCMST_OFF,
        UCMODE      : UCMODE_0,
        UCSYNC      : UCSYNC,
    };

    /*! Control Register 1 */       
    config UCxCTL1_t UCB0CTL1 = {
        UCSSEL      : UCSSEL_0,
        UCSWRST     : UCSWRST,
    };

    /*! Status Register */
    config UCxSTAT_t UCB0STAT = {
        UCLISTEN    : UCLISTEN_OFF,
        UCFE        : UCFE_OFF,
        UCOE        : UCOE_OFF,
        UCBUSY      : UCBUSY,
    };

    /*! Bit Rate Control Register 0 */
    config unsigned char UCB0BR0 = 0;
    
    /*! Bit Rate Control Register 1 */
    config unsigned char UCB0BR1 = 0;

    /*! Receive Buffer Register */    
    config unsigned char UCB0RXBUF = 0;
    
    /*! Transmit Buffer Register */    
    config unsigned char UCB0TXBUF = 0;
}
