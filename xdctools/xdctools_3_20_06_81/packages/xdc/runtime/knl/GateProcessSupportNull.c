/*
 *  ======== GateProcessSupportNull.c ========
 */

#include <xdc/std.h>
#include <xdc/runtime/Error.h>

#include "package/internal/GateProcessSupportNull.xdc.h"

/*
 *  ======== GateProcessSupportNull_Instance_init ========
 */
Void GateProcessSupportNull_Instance_init(GateProcessSupportNull_Handle gate,
    const GateProcessSupportNull_Params* params)
{
}

/*
 *  ======== GateProcessSupportNull_enter ========
 */
IArg GateProcessSupportNull_enter(GateProcessSupportNull_Handle gate)
{
    return (0);
}

/*
 *  ======== GateProcessSupportNull_leave ========
 */
Void GateProcessSupportNull_leave(GateProcessSupportNull_Handle gate, IArg key)
{
}

/*
 *  ======== GateProcessSupportNull_getReferenceCount ========
 */
Int GateProcessSupportNull_getReferenceCount(GateProcessSupportNull_Handle gate,   Error_Block* eb)
{
    return (0);
}

/*
 *  ======== GateProcessSupportNull_query ========
 */
Bool GateProcessSupportNull_query(Int qual)
{
    return (TRUE);
}
/*
 *  @(#) xdc.runtime.knl; 1, 0, 0,105; 11-16-2010 11:20:23; /db/ztree/library/trees/xdc/xdc-v53x/src/packages/
 */

