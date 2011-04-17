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
 *  ======== T16v200.xdc ========
 */

package ti.catalog.t16;

/*!
 *  ======== T16v200 ========
 *  The T16v200 device data sheet module.
 *
 *  This module implements the xdc.platform.ICpuDataSheet interface and is 
 *  used by platforms to obtain "data sheet" information about this device.
 *
 */
metaonly module T16v200 inherits ti.catalog.ICpuDataSheet
{
instance:
    override config string cpuCore           = "TORRENT_T16";
    override config string isa               = "t16";
    override config string cpuCoreRevision   = "1.0";
    override config int    minProgUnitSize   = 1;
    override config int    minDataUnitSize   = 1;
    override config int    dataWordSize      = 4;

    /*!
     *  ======== memMap ========
     *  The memory map returned be getMemoryMap().
     */
    config xdc.platform.IPlatform.Memory memMap[string]  = [

        /*
         *  This segment is a workaround because the simulator does not
         *  support MMU and the vecs need to be placed starting at address 0.
         */
        ["CODEMEM", {
            comment: "256MB T16 code memory",
            name: "CODEMEM",
            base: 0x0,
            len:  0x10000000,
            space: "code",
            access: "RX"
        }],
    
        ["DMEM", {
            comment: "32KB T16 data memory",
            name: "DMEM",
            base: 0x10020000,
            len:  0x8000,
            space: "data",
            access: "RW"
        }],
    
        ["WBUF", {
            comment: "VCOP work buffer",
            name: "WBUF",
            base: 0x10040000,
            len:  0x8000,
            space: "data",
            access: "RW"
        }],

        ["IBUFLA", {
            comment: "Image buffer low copy A",
            name: "IBUFLA",
            base: 0x10050000,
            len:  0x4000,
            space: "data",
            access: "RW"
        }],

        ["IBUFHA", {
            comment: "Image buffer high copy A",
            name: "IBUFHA",
            base: 0x10054000,
            len:  0x4000,
            space: "data",
            access: "RW"
        }],

        ["IBUFLB", {
            comment: "Image buffer low copy B",
            name: "IBUFLB",
            base: 0x10070000,
            len:  0x4000,
            space: "data",
            access: "RW"
        }],

        ["IBUFHB", {
            comment: "Image buffer high copy B",
            name: "IBUFHB",
            base: 0x10074000,
            len:  0x4000,
            space: "data",
            access: "RW"
        }],

        ["L3MEM", {
            comment:    "1MB L3 Memory",
            name:       "L3MEM",
            base:       0x7FF00000,
            len:        0x00100000,
            space:      "code/data",
            access:     "RWX"
        }],
    ];
};
/*
 *  @(#) ti.catalog.t16; 1, 0, 0, 0,6; 12-3-2010 12:36:37; /db/ztree/library/trees/platform/platform-l29x/src/
 */

