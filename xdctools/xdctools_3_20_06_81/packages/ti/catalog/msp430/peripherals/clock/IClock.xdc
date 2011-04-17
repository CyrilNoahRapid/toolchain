/*!
 *  ======== Clock ========
 *  MSP430 Master Clock
 */
metaonly interface IClock inherits xdc.platform.IPeripheral {

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

    /*!
     *  ======== baseAddr ========
     *  Address of the peripheral's control register.
     *
     *  A peripheral's registers are commonly accessed through a structure
     *  that defines the offsets of a particular register from the lowest
     *  address mapped to a peripheral. That lowest address is specified by
     *  this parameter.
     */
    config UInt baseAddr;

    /*!
     * Stores the DCO clock frequency in float
     */
    readonly config float DCOCLKHz = 1000000;

    /*!
     *  ======== ACLKHz Frequency ========
     *  Stores ACLK as frequency in float
     */    
    readonly config float ACLKHz;

    /*!
     *  ======== MCLKHz Frequency ========
     *  Stores MCLK as frequency in float
     */    
    readonly config float MCLKHz;

    /*!
     *  ======== SMCLKHz Frequency ========
     *  Stores SMCLK as frequency in float
     */
    readonly config float SMCLKHz;

    /*!
     *  ======== computeDCOCLKHz ========
     *  Initialize to the nearest available DCO clock frequency
     */
    void computeDCOCLKHz(float DCOCLKHz);
}
