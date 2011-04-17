/*!
 * Universal Serial Communication Interface B0 I2C 2xx
 */
metaonly interface IUSCI_B0_I2C inherits IUSCI_I2C {

instance:
	/*! Control Register 0 */
    config UCxCTL0_t UCB0CTL0 = {
        UCA10       : UCA10_OFF,
        UCSLA10     : UCSLA10_OFF,
        UCMM        : UCMM_OFF,
        UCMST       : UCMST_OFF,
        UCMODE      : UCMODE_0,
        UCSYNC      : UCSYNC,
    };

	/*! Control Register 1 */
    config UCxCTL1_t UCB0CTL1 = {
        UCSSEL      : UCSSEL_0,
        UCTR        : UCTR_OFF,
        UCTXNACK    : UCTXNACK_OFF,
        UCTXSTP     : UCTXSTP_OFF,
        UCTXSTT     : UCTXSTT_OFF,
        UCSWRST     : UCSWRST,
    };

	/*! Status Register */
    config UCxSTAT_t UCB0STAT = {
        UCSCLLOW    : UCSCLLOW,
        UCGC        : UCGC,
        UCBBUSY     : UCBBUSY,
        UCNACKIFG   : UCNACKIFG,
        UCSTPIFG    : UCSTPIFG,
        UCSTTIFG    : UCSTTIFG,
        UCALIFG     : UCALIFG,
    };
    
	/*! I2C Own Address Register */
    config UCBxI2COA_t UCB0I2COA = {
        UCGCEN      : UCGCEN_OFF,
        I2COA       : 0,
    };

    /*! I2C Slave Address Register */
    config UChar UCB0I2CSA = 0;
    
    /*! Receive Buffer Register */
    config UChar UCB0RXBUF = 0;
    
	/*! Transmit Buffer Register */
    config UChar UCB0TXBUF = 0;
    
    /*! Bit Rate Control Register 0 */
    config UChar UCB0BR0 = 0;
    
    /*! Bit Rate Control Register 1 */
    config UChar UCB0BR1 = 0;
}
