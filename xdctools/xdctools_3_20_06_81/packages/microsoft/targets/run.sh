#
#  Copyright 2010 by Texas Instruments Incorporated.
#  
#

#!/bin/sh
#
unset INCLUDE
unset LIB
unset CL

dir=${1%/*}
cmdbin=/cygdrive/${dir%%:*}${dir#?:}
export PATH=$cmdbin:$cmdbin/../../common/msdev98/bin

"$@"
#
#  @(#) microsoft.targets; 1, 0, 2, 0,431; 12-7-2010 14:48:07; /db/ztree/library/trees/xdctargets/xdctargets-c37x/src/ xlibrary

#

