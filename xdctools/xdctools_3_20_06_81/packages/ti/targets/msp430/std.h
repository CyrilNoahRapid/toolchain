/* --COPYRIGHT--,EPL
 *  Copyright (c) 2010 Texas Instruments and others.
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
 *  ======== ti/targets/msp430/std.h ========
 *  Standard types for supported TI MSP430 compilers
 */

#ifndef ti_targets_msp430_STD_
#define ti_targets_msp430_STD_

/*  Define target-specific "portable" macros
 *
 *  The build command-line define xdc_target_name__ to be the value
 *  of the target's name config parameter.  We use this to include the
 *  target-specific definitions for the required target-independent
 *  xdc_target* macros.
 */
#if defined(xdc_target_name__) & !defined(xdc_target_macros_include__)
#include xdc__local_include(xdc_target_name__)
#endif

/* "inherit" (i.e., include) all ti.targets standard types */
#include <ti/targets/std.h>

/* On MSP430 large code and large or restricted data model, Ptr and Fxn are
 * 20 bits long and the compiler warns about casting from a 32-bit Arg to a
 * smaller pointer. However, we know that there is nothing in these 12 bits
 * that are cut and we use these pragmas to suppress the warning.
 */
#if !defined(xdc__ARGTOPTR) && !defined(xdc__ARGTOFXN)
#if (defined(__LARGE_CODE_MODEL__) && defined(__LARGE_DATA_MODEL__))
#pragma diag_suppress 1107
#define xdc__ARGTOPTR
#define xdc__ARGTOFXN
static inline xdc_Ptr xdc_iargToPtr(xdc_IArg a) { return ((xdc_Ptr)a); }
static inline xdc_Ptr xdc_uargToPtr(xdc_UArg a) { return ((xdc_Ptr)a); }
static inline xdc_Fxn xdc_iargToFxn(xdc_IArg a) { return ((xdc_Fxn)a); }
static inline xdc_Fxn xdc_uargToFxn(xdc_UArg a) { return ((xdc_Fxn)a); }
#pragma diag_default 1107
#endif

#endif

#endif /* ti_targets_msp430_STD_ */
