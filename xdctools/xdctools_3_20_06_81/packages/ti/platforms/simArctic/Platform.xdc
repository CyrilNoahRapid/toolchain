/*
 *  Copyright (c) 2010 by Texas Instruments and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *      Texas Instruments - initial implementation
 *
 * */

/*
 *  ======== Platform.xdc ========
 */

package ti.platforms.simArctic;

/*!
 *  ======== Platform ========
 *  Platform support for the simArctic
 *
 *  This module implements xdc.platform.IPlatform and defines configuration
 *  parameters that correspond to this platform's Cpu's, Board's, etc.
 *
 *  The configuration parameters are initialized in this package's
 *  configuration script (package.cfg) and "bound" to the TCOM object
 *  model.  Once they are part of the model, these parameters are
 *  queried by a program's configuration script.
 *
 *  This particular platform has a single Cpu, and therefore, only
 *  declares a single CPU configuration object.  Multi-CPU platforms
 *  would declare multiple Cpu configuration parameters (one per
 *  platform CPU).
 */
metaonly module Platform inherits xdc.platform.IPlatform
{
    readonly config xdc.platform.IPlatform.Board BOARD = {      
        id:             "0",
        boardName:      "simArctic",
        boardFamily:    "simArctic",
        boardRevision:  null,
    };

    readonly config xdc.platform.IExeContext.Cpu T16 = {
        id:             "0",
        clockRate:      200.0,
        catalogName:    "ti.catalog.t16",
        deviceName:     "T16v200",
        revision:       "",
    };

    readonly config xdc.platform.IExeContext.Cpu DSP = {        
        id:             "1",
        clockRate:      300.0,
        catalogName:    "ti.catalog.c6000",
        deviceName:     "Arctic",
        revision:       "",
    };


instance:

    /* 
     *  DDR is 2GByte but we need to share it with T16.
     */
    override readonly config xdc.platform.IPlatform.Memory
        externalMemoryMap[string] = [
            ["DDR",  {name: "DDR",  base: 0x80000000, len: 0x80000000}],
        ];

    /*
     *  ======== sectMap ========
     *  Define a placement of compiler generated output sections into
     *  memory regions defined in the memTab above.
     */
    override config string codeMemory = "DDR";
    
    override config string dataMemory = "DDR";

    override config string stackMemory = "DDR";

    /*
     *  ======== l1PMode ========
     *  Define the amount of L1P RAM used for L1 Program Cache.
     *
     *  Check the device documentation for valid values.
     */
    config String l1PMode = "32k";
    
    /*
     *  ======== l1DMode ========
     *  Define the amount of L1D RAM used for L1 Data Cache.
     *
     *  Check the device documentation for valid values.
     */
    config String l1DMode = "32k";
    
    /*
     *  ======== l2Mode ========
     *  Define the amount of L2 RAM used for L2 Cache.
     *
     *  Check the device documentation for valid values.
     */
    config String l2Mode = "0k";
};
/*
 *  @(#) ti.platforms.simArctic; 1, 0, 0,1; 12-3-2010 12:57:59; /db/ztree/library/trees/platform/platform-l29x/src/
 */

