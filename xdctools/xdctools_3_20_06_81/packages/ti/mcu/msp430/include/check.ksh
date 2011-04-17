#!/bin/sh
prefix=.tmp$$

# get list of include files from msp430.h
grep -h '#include' *.h | sed -e 's|#include [<"]||' -e 's|[>"]||' | sort | uniq > $prefix.inc
dos2unix $prefix.inc 2&>1 > /dev/null

# get sorted list of include files in this directory
ls *.h | sort > $prefix.dev

# get list of files included that exist
cat $prefix.dev $prefix.inc | sort | uniq -d > $prefix.check

# check that the included files that exist == the list of included files
fail="`cat $prefix.check  $prefix.check $prefix.inc | sort | uniq -u`"

if [ -n "$fail" ]; then
    echo included that don\'t exist:
    echo $fail
fi

rm $prefix.*
