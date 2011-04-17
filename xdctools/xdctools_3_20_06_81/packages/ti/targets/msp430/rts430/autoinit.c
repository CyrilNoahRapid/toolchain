/*****************************************************************************/
/* _AUTO_INIT()   v3.3.0B2 - Perform initialization of C variables.            */
/*  Copyright (c) 1993-2010  Texas Instruments Incorporated                  */
/*****************************************************************************/
#include <string.h>
#include <stddef.h>

#include <xdc/runtime/Startup.h>
extern int xdc_runtime_Startup__EXECFXN__C;

#define CINIT ((void*)&__cinit__)

#define ALIGN_MASK 0x1
#if defined(__LARGE_DATA_MODEL__)
#define ALIGN_PTR(ptr) ((unsigned*)(((unsigned long)ptr + ALIGN_MASK) & ~ALIGN_MASK))
#else
#define ALIGN_PTR(ptr) ((unsigned*)(((unsigned)ptr + ALIGN_MASK) & ~ALIGN_MASK))
#endif
extern  int __cinit__;
typedef void (*PTRFUNC)();
extern  const PTRFUNC __pinit__[];

/*---------------------------------------------------------------------------*/
/* __TI_auto_init indicates that the default TI auto initialization routine  */
/* is being used.  The linker makes assumptions about how initialization is  */
/* being performed when this symbols is seen.  This symbol should NOT be     */
/* defined if a customized auto initialization routine is used.              */
/*---------------------------------------------------------------------------*/
__asm("\t.global __TI_auto_init");
__asm("__TI_auto_init .set 1");

void _auto_init()
{
   const unsigned int *recptr = CINIT;
   int length;

   if (recptr != (unsigned int*)-1)
      while ((length = *recptr++) != 0)
      {
	 char *to, *from;
#if defined(__LARGE_DATA_MODEL__)
	 to      = (void*) *((unsigned long*)recptr);
	 recptr += 2;
#else
	 to      = (void*) *recptr++; 
#endif
	 from = (void*) recptr; 

	 memcpy(to, from, length); 

	 from   += length;
	 recptr  = ALIGN_PTR(from);
      }

   /*------------------------------------------------------------------------*/
   /* Process XDC Startup                                                    */
   /*------------------------------------------------------------------------*/
   if (&xdc_runtime_Startup__EXECFXN__C == (int*)1) {
      xdc_runtime_Startup_exec__E();
   }

   /*------------------------------------------------------------------------*/
   /* Process Pinit table.                                                   */
   /* consists of pointers to init functions.                                */
   /* section is NULL terminated                                             */
   /* pointer is = -1 if section does not exist.                             */
   /*------------------------------------------------------------------------*/
#pragma diag_suppress 770
#pragma diag_suppress 70 
   if ((int)__pinit__ != -1)
#pragma diag_default 70
#pragma diag_default 770
   {
      int i = 0;
      while (__pinit__[i] != NULL )
         __pinit__[i++]();
   }
}
