/*!
 *  ======== IWDT ========
 *  MSP430 Watchdog Timer Interface
 */
metaonly interface IWDT inherits xdc.platform.IPeripheral {
    
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

}
