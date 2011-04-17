/*!
 *  ======== IE1 ========
 *  MSP430 Interrupt Enable Register 1
 */
metaonly module IE1 inherits xdc.platform.IPeripheral {

    enum NMIE_t {
        NMIE_OFF = 0x00,
        NMIE = 0x5A00
    };
    
    enum WDTIE_t {
        WDTIE_OFF = 0x0000,
        WDTIE     = (0x0080)
    };
    
    enum OFIE_t {
        OFIE_OFF = 0x00,    /*! Interrupt not enabled */
        OFIE = 0x01         /*! Interrupt enabled */
    };
    
    /* IE1 */
    struct IE1_t {
        NMIE_t      NMIE;
        OFIE_t      OFIE;
        WDTIE_t     WDTIE;
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
    /*! IE1, Interrupt Enable Register 1 */
    config IE1_t IE1 = {
        NMIE        : NMIE_OFF,
        OFIE        : OFIE_OFF,
        WDTIE       : WDTIE_OFF,
    };
    
   /*!
    *  ======== getWDTIE ========
    *  Gets WDTIE bit
    *
    *  @see #getWDTIE
    */
    Bool    getWDTIE();
    
   /*!
    *  ======== setWDTIE ========
    *  Sets WDTIE bit
    *
    *  @see #setWDTIE
    */
    Bool    setWDTIE(Bool set);

   /*!
    *  ======== getOFIE ========
    *  Gets OFIE bit
    *
    *  @see #getOFIE
    */
    Bool    getOFIE();
    
   /*!
    *  ======== setOFIE ========
    *  Sets OFIE bit
    *
    *  @see #setOFIE
    */
    Bool    setOFIE(Bool set);
    
   /*!
    *  ======== getNMIE ========
    *  Gets NMIE bit
    *
    *  @see #getNMIE
    */
    Bool    getNMIE();
    
   /*!
    *  ======== setNMIE ========
    *  Sets NMIE bit
    *
    *  @see #setNMIE
    */
    Bool    setNMIE(Bool set);

    /*! Determine if each Register needs to be forced set or not */
    readonly config ForceSetDefaultRegister_t forceSetDefaultRegister[] =
    [
        { register : "IE1" , regForceSet : false },
    ];
}
