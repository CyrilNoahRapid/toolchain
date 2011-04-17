import ti.catalog.msp430.peripherals.clock.IClock;
import ti.catalog.msp430.peripherals.timer.ITimer_A;

/*!
 *  ======== IADC ========
 *  MSP430 Analog to Digital Converter Interface
 */
metaonly interface IADC inherits xdc.platform.IPeripheral {

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
    
    /*!
     *  ======== create ========
     *  Create an instance of this peripheral
     */
    create(IClock.Instance clock, ITimer_A.Instance timerA);

instance:
    /*! @_nodoc */
    config IClock.Instance clock;
    
    /*! @_nodoc */
    config ITimer_A.Instance timerA;
}
