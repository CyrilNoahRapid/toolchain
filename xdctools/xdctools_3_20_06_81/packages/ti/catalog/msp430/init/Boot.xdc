/*
 *  ======== Boot.xdc ========
 *
 *! Revision History
 *! ================
 *! 17-Nov-2009 sg     Added WDT address and configureDCO flag.
 *! 20-Oct-2009 sg     Initial.
 */

package ti.catalog.msp430.init;

import xdc.rov.ViewInfo;

@Template("./Boot.xdt")

metaonly module Boot
{
    metaonly struct ModuleView {
        Bool         disableWatchdog;
        UInt         watchdogAddress;
        Bool         configureDCO;
    }

    @Facet
    metaonly config ViewInfo.Instance rovViewInfo = 
        ViewInfo.create({
            viewMap: [
            [
                'Module',
                {
                    type: ViewInfo.MODULE,
                    viewInitFxn: 'viewInitModule',
                    structName: 'ModuleView'
                }
            ],
            ]
        });
    
    /*! 
     *  Watchdog disable flag; default is true.
     *
     *  Set to false to not automatically disable the watchdog timer.
     */
    config Bool disableWatchdog = true;

    /*! 
     *  Watchdog control register address; default for MSP430F54xx and
     *  MSP430F552x.
     *
     *  Change for other devices.
     */
    config UInt watchdogAddress = 0x15c;

    /*! 
     *  Configure DCO flag; default is false.
     *
     *  Set to true to initialize DCO at boot.
     */
    config Bool configureDCO = false;

    /*! 
     *  Code section that Boot module code is in.
     *
     *  To place this section into a memory segment yourself, add the 
     *  following to your configuration file: 
     *
     *  @p(code)
     *  Program.sectMap[Boot.bootCodeSection] = new Program.SectionSpec();
     *  Program.sectMap[Boot.bootCodeSection].loadSegment = "yourBootCodeMemorySegment";
     *  @p
     *
     *  or to place the code at a specific address: 
     *
     *  @p(code)
     *  Program.sectMap[Boot.bootCodeSection] = new Program.SectionSpec();
     *  Program.sectMap[Boot.bootCodeSection].loadAdress = yourBootCodeAddress;
     *  @p
     *
     */
    readonly config String bootCodeSection = ".bootCodeSection";
    
};
