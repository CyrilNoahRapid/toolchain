/*
 *  ======== Platform.xdc ========
 */
package ti.platforms.msp430;

/*!
 *  ======== Platform ========
 *  A generic platform that supports any MSP430 device
 *
 *  The device to be used by this platform is passed as the platform instance
 *  name. On the `xdc.tools.configuro` command line, it is done in the
 *  following way:
 *  @p(code)
 *  xs xdc.tools.configuro ... -p "ti.platforms.msp430:MSP430F2274"
 *  @p
 *
 *  In package.bld, the platform instance is selected as in:
 *  @p(code)
 *  Pkg.addExecutable("test", target, "ti.platforms.msp430:MSP430F5438");
 *  @
 */
metaonly module Platform inherits xdc.platform.IPlatform
{
    config xdc.platform.IPlatform.Board BOARD = { 
        id:             "0",
        boardName:      "msp430",
        boardFamily:    null,
        boardRevision:  null
    };

instance:

    config xdc.platform.IExeContext.Cpu CPU = { 
        id:             "0",
        clockRate:      0,
        catalogName:    "ti.catalog.msp430",
        deviceName:     "MSP430",
        revision:       "",
    };

    /*!
     *  ======== deviceName ========
     *  The name of an `ICpuDataSheet` module for the device
     *
     *  This parameter is optional; the device name name also be specified
     *  in the name of the the instance.
     */
    config string deviceName;

    /*!
     *  ======== clockRate ========
     *  The clock rate for this device.
     */
    config Double clockRate = 0;

    override config string codeMemory = null;
    
    override config string dataMemory = null;

    override config string stackMemory = null;
};

