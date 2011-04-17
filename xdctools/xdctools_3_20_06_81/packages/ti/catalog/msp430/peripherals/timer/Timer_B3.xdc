/*!
 *  ======== Timer_B3 ========
 *  MSP430 Timer_B timer
 */
metaonly module Timer_B3 inherits ITimer_B {

    /*! TB3IV Definitions */
    enum IVValues {
        TBIV_NONE = 0x0000,                 /*! No Interrupt pending */
        TBIV_TBCCR1 = 0x0002,               /*! TBCCR1_CCIFG */
        TBIV_TBCCR2 = 0x0004,               /*! TBCCR2_CCIFG */
        TBIV_6 = 0x0006,                    /*! Reserved */
        TBIV_8 = 0x0008,                    /*! Reserved */
        TBIV_TBIFG = 0x000A                 /*! TBIFG */
    };

instance:
    /*! TBCTL, Timer_B3 Control Register */
    config TBCTL_t TBCTL = {
        TBCLGRP : TBCLGRP_0,
        CNTL : CNTL_0,
        TBSSEL : TBSSEL_0,
        ID : ID_0,
        MC : MC_0,  
        TBCLR : TBCLR_OFF,
        TBIE : TBIE_OFF,
        TBIFG : TBIFG_OFF
    };               

    /*! TBCCTL0, Capture/Compare Control Register 0 */    
    config TBCCTLx_t TBCCTL0 = {
        CM : CM_0,
        CCIS : CCIS_0,
        SCS : SCS_OFF,
        CLLD : CLLD_0,
        CAP : CAP_OFF,
        OUTMOD : OUTMOD_0,
        CCIE : CCIE_OFF,
        CCI : CCI_OFF,
        OUT : OUT_OFF,
        COV : COV_OFF,
        CCIFG : CCIFG_OFF
    };
    
    /*! TBCCTL1, Capture/Compare Control Register 1 */
    config TBCCTLx_t TBCCTL1 = {
        CM : CM_0,
        CCIS : CCIS_0,
        SCS : SCS_OFF,
        CLLD : CLLD_0,
        CAP : CAP_OFF,
        OUTMOD : OUTMOD_0,
        CCIE : CCIE_OFF,
        CCI : CCI_OFF,
        OUT : OUT_OFF,
        COV : COV_OFF,
        CCIFG : CCIFG_OFF
    };
    
    /*! TBCCTL2, Capture/Compare Control Register 2 */
    config TBCCTLx_t TBCCTL2 = {
        CM : CM_0,
        CCIS : CCIS_0,
        SCS : SCS_OFF,
        CLLD : CLLD_0,
        CAP : CAP_OFF,
        OUTMOD : OUTMOD_0,
        CCIE : CCIE_OFF,
        CCI : CCI_OFF,
        OUT : OUT_OFF,
        COV : COV_OFF,
        CCIFG : CCIFG_OFF
    };
    
    /*! TBCCR0, Timer_B Capture/Compare Register 0 */
    config int TBCCR0 = 0;
    /*! TBCCR1, Timer_B Capture/Compare Register 1 */
    config int TBCCR1 = 0; 
    /*! TBCCR2, Timer_B Capture/Compare Register 2 */
    config int TBCCR2 = 0;

	/*! Determine if each Register needs to be forced set or not */
	readonly config ForceSetDefaultRegister_t forceSetDefaultRegister[] =
	[
		{ register : "TBCTL"   , regForceSet : false },
		{ register : "TBCCTL0" , regForceSet : false },
		{ register : "TBCCTL1" , regForceSet : false },
		{ register : "TBCCTL2" , regForceSet : false },
		{ register : "TBCCR0"  , regForceSet : false },
		{ register : "TBCCR1"  , regForceSet : false },
		{ register : "TBCCR2"  , regForceSet : false }
	];
}
