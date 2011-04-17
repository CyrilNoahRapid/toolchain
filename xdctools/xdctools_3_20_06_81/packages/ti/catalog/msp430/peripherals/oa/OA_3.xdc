/*!
 *  ======== OA ========
 *  MSP430 General Purpose Operational Amplifier
 */
metaonly module OA_3 inherits IOA {
    /*!
     *  ======== create ========
     *  Create an instance of this peripheral
     */
    create();
    
instance:
    /*! OA0 control register 0 */    
    config OAxCTL0_t OA0CTL0 = {
      OAN : OAN_0,
      OAP : OAP_0,
      OAPM : OAPM_0,
      OAADC0 : OAADC0_OFF,
      OAADC1 : OAADC1_OFF 
    };

    /*! OA0 control register 1 */    
    config OAxCTL1_t OA0CTL1 = {
      OAFBR : OAFBR_0,
      OAFC : OAFC_0,
      OANEXT : OANEXT_OFF,
      OARRIP : OARRIP_OFF, 
    };
    
    /*! OA1 control register 0 */    
    config OAxCTL0_t OA1CTL0 = {
      OAN : OAN_0,
      OAP : OAP_0,
      OAPM : OAPM_0,
      OAADC0 : OAADC0_OFF,
      OAADC1 : OAADC1_OFF 
    };

    /*! OA1 control register 1 */    
    config OAxCTL1_t OA1CTL1 = {
      OAFBR : OAFBR_0,
      OAFC : OAFC_0,
      OANEXT : OANEXT_OFF,
      OARRIP : OARRIP_OFF, 
    };

    /*! OA2 control register 0 */    
    config OAxCTL0_t OA2CTL0 = {
      OAN : OAN_0,
      OAP : OAP_0,
      OAPM : OAPM_0,
      OAADC0 : OAADC0_OFF,
      OAADC1 : OAADC1_OFF 
    };

    /*! OA2 control register 1 */    
    config OAxCTL1_t OA2CTL1 = {
      OAFBR : OAFBR_0,
      OAFC : OAFC_0,
      OANEXT : OANEXT_OFF,
      OARRIP : OARRIP_OFF, 
    };

    /*! Determine if each Register needs to be forced set or not */
    readonly config ForceSetDefaultRegister_t forceSetDefaultRegister[] =
    [
        { register : "OA0CTL0" , regForceSet : false },
        { register : "OA0CTL1" , regForceSet : false },
        { register : "OA1CTL0" , regForceSet : false },
        { register : "OA1CTL1" , regForceSet : false },
        { register : "OA2CTL0" , regForceSet : false },
        { register : "OA2CTL1" , regForceSet : false }
    ];    
}