/* --COPYRIGHT--,EPL
 *  Copyright (c) 2008 Texas Instruments and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *      Texas Instruments - initial implementation
 * 
 * --/COPYRIGHT--*/

/*
 *  ======== IMSP430.xdc ========
 */
package ti.catalog.msp430;

/*!
 *  ======== IMSP430 ========
 *  An interface implemented by all MSP430 devices.
 *
 *  This interface is defined to factor common data about this family into
 *  a single place; all MSP430 devices extend this interface.
 */
metaonly interface IMSP430 inherits ti.catalog.ICpuDataSheet
{
instance:
    override config string   cpuCore	    = "MSP430";
    override config string   isa            = "430";
    override config int	    minProgUnitSize = 1;
    override config int	    minDataUnitSize = 1;    
    override config int	    dataWordSize    = 2;
};
