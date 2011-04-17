#
#  Copyright 2010 by Texas Instruments Incorporated.
#  
#

include $(XDCROOT)/packages/xdc/bld/xdc_java.mak

CLASSES  = $(patsubst %.java,%,$(wildcard *.java))
JARFILE  = java/package.jar

JCPATH:=$(XDCROOT)/packages/xdc/rta/java/package.jar

.libraries: $(JARFILE)
$(JARFILE): $(patsubst %,$(CLASSDIR)/%.class,$(CLASSES))

clean::
	$(RM) $(JARFILE)

#
#  need xdc.rta.IOFReader interface to run the test
#
JTEST = java -classpath java/package.jar:$(XDCROOT)/packages/xdc/rta/java/package.jar ti.targets.omf.elf.Elf32
java.test: java/package.jar
	$(JTEST) tests/repo/sanity/hello.xet16 0x10022678

.regress:
	./test.ksh
#
#  @(#) ti.targets.omf.elf; 1,0,0,56; 12-7-2010 15:19:42; /db/ztree/library/trees/xdctargets/xdctargets-c37x/src/ xlibrary

#

