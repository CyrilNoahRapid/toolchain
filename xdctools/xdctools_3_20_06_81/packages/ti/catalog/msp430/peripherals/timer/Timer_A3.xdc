/*!
 *  ======== Timer_A3 ========
 *  MSP430 Timer_A3 timer
 */
metaonly module Timer_A3 inherits ITimer_A {

instance:
    /*! TACTL, Timer_A3 Control Register */
    config TACTL_t TACTL = {
        TASSEL : TASSEL_0,
        ID : ID_0,    
        MC : MC_0,          
        TACLR : TACLR_OFF, 
        TAIE : TAIE_OFF,       
        TAIFG : TAIFG_OFF
    };
    
    /*! TACCTL0, Capture/Compare Control Register 0 */    
    config TACCTLx_t TACCTL0 = {
        CM : CM_0,
        CCIS : CCIS_0,
        SCS : SCS_OFF,
        SCCI : SCCI_OFF,
        CAP : CAP_OFF,
        OUTMOD : OUTMOD_0,
        CCIE : CCIE_OFF,
        CCI : CCI_OFF,
        OUT : OUT_OFF,
        COV : COV_OFF,
        CCIFG : CCIFG_OFF
    };
    
    /*! TACCTL1, Capture/Compare Control Register 1 */
    config TACCTLx_t TACCTL1 = {
        CM : CM_0,
        CCIS : CCIS_0,
        SCS : SCS_OFF,
        SCCI : SCCI_OFF,
        CAP : CAP_OFF,
        OUTMOD : OUTMOD_0,
        CCIE : CCIE_OFF,
        CCI : CCI_OFF,
        OUT : OUT_OFF,
        COV : COV_OFF,
        CCIFG : CCIFG_OFF
    };
    
    /*! TACCTL2, Capture/Compare Control Register 2 */
    config TACCTLx_t TACCTL2 = {
        CM : CM_0,
        CCIS : CCIS_0,
        SCS : SCS_OFF,
        SCCI : SCCI_OFF,
        CAP : CAP_OFF,
        OUTMOD : OUTMOD_0,
        CCIE : CCIE_OFF,
        CCI : CCI_OFF,
        OUT : OUT_OFF,
        COV : COV_OFF,
        CCIFG : CCIFG_OFF
    };
    
    /*! TACCR0, Timer_A Capture/Compare Register 0 */
    config int TACCR0 = 0;
    /*! TACCR1, Timer_A Capture/Compare Register 1 */
    config int TACCR1 = 0;                         
    /*! TACCR2, Timer_A Capture/Compare Register 2 */
    config int TACCR2 = 0;

    /*! Determine if each Register needs to be forced set or not */
    readonly config ForceSetDefaultRegister_t forceSetDefaultRegister[] =
    [
        { register : "TACTL"   , regForceSet : false },
        { register : "TACCTL0" , regForceSet : false },
        { register : "TACCTL1" , regForceSet : false },
        { register : "TACCTL2" , regForceSet : false },
        { register : "TACCR0"  , regForceSet : false },
        { register : "TACCR1"  , regForceSet : false },
        { register : "TACCR2"  , regForceSet : false }
    ];
    
    /*!
    *  ======== getTimer_A_OUT ========
    *  Returns Timer_A OUT in ms rising-edge interval based on a channel input
    *
    *  This function calculates a time base rising-edge of clock based on
    *  clock source, TxCCRx register and OUTMOD settings.
    *
    *  @see #getTimer_A_OUT
    */
    Float getTimer_A_OUT(UChar channel);
}
