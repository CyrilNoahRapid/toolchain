/*!
 * Universal Serial Communication Interface A0 SPI 2xx
 */
metaonly interface IUSCI_A0_SPI inherits IUSCI_SPI {

instance:
	/*! Control Register 0 */
    config UCxCTL0_t UCA0CTL0 = {
        UCCKPH      : UCCKPH_OFF,
        UCCKPL      : UCCKPL_OFF,
        UCMSB       : UCMSB_OFF,
        UC7BIT      : UC7BIT_OFF,
        UCMST       : UCMST_OFF,
        UCMODE      : UCMODE_0,
        UCSYNC      : UCSYNC,
    };

	/*! Control Register 1 */    
    config UCxCTL1_t UCA0CTL1 = {
        UCSSEL      : UCSSEL_0,
        UCSWRST     : UCSWRST,
    };
  
    /*! Status Register */
    config UCxSTAT_t UCA0STAT = {
        UCLISTEN    : UCLISTEN_OFF,
        UCFE        : UCFE_OFF,
        UCOE        : UCOE_OFF,
        UCBUSY      : UCBUSY,
    };

    /*! Bit Rate Control Register 0 */
    config unsigned char UCA0BR0 = 0;
    
    /*! Bit Rate Control Register 1 */
    config unsigned char UCA0BR1 = 0;
    
    /*! Receive Buffer Register */
    config unsigned char UCA0RXBUF = 0;
    
    /*! Transmit Buffer Register */
    config unsigned char UCA0TXBUF = 0;
}
