#!/bin/sh
tp=".tmp$$"

printgroup() {
    first="`head -1 $1`"
    for f in `cat $1`; do
	cd="`cdiff $f $first | head -1`"
	if [ -z "$cd" ]; then
	    echo $f
	fi
    done
}

ls *.h > $tp.list

while true; do
    # all done if list is empty
    if [ "`ls -s $tp.list | cut -f1 -d' '`" = "0" ]; then
        rm -f $tp.list $tp.group
        exit 0
    fi
    
    # find group of files equivalent to the first one
    echo "checking `head -1 $tp.list`" ...
    printgroup $tp.list | tee $tp.group
    echo
    
    # remove this group from list and rerun on new list
    cat $tp.group $tp.list | sort | uniq -u > $tp.new
    mv $tp.new $tp.list
done
