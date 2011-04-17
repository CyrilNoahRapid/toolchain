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
 *  ======== Tesla.xs ========
 *
 */

/*
 *  ======== Tesla.getMemoryMap ========
 *  Returns the memory map as seen by a program running on this device
 *  when the registers are set as specified by the regs hash.
 */
function getMemoryMap(regs)
{
    return (this.memMap);
}

/*
 *  ======== module$validate ========
 */
function module$validate() 
{
    this.$logWarning("This catalog module is deprecated.  The module " +
        "ti.catalog.c6000.OMAP4430 should be used instead.", 
        this);
}
/*
 *  @(#) ti.catalog.c6000.nda; 1, 0, 0, 0,133; 12-3-2010 12:36:31; /db/ztree/library/trees/platform/platform-l29x/src/
 */

