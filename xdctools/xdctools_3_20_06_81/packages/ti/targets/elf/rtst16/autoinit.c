/*
 *  Copyright 2010 by Texas Instruments Incorporated.
 *
 */

/*****************************************************************************/
/* _AUTO_INIT()   v1.0.0A10308 - Perform initialization of C variables.      */
/*                                                                           */
/* Copyright (c) 1993-2010 Texas Instruments Incorporated                    */
/* http://www.ti.com/                                                        */
/*                                                                           */
/*  Redistribution and  use in source  and binary forms, with  or without    */
/*  modification,  are permitted provided  that the  following conditions    */
/*  are met:                                                                 */
/*                                                                           */
/*     Redistributions  of source  code must  retain the  above copyright    */
/*     notice, this list of conditions and the following disclaimer.         */
/*                                                                           */
/*     Redistributions in binary form  must reproduce the above copyright    */
/*     notice, this  list of conditions  and the following  disclaimer in    */
/*     the  documentation  and/or   other  materials  provided  with  the    */
/*     distribution.                                                         */
/*                                                                           */
/*     Neither the  name of Texas Instruments Incorporated  nor the names    */
/*     of its  contributors may  be used to  endorse or  promote products    */
/*     derived  from   this  software  without   specific  prior  written    */
/*     permission.                                                           */
/*                                                                           */
/*  THIS SOFTWARE  IS PROVIDED BY THE COPYRIGHT  HOLDERS AND CONTRIBUTORS    */
/*  "AS IS"  AND ANY  EXPRESS OR IMPLIED  WARRANTIES, INCLUDING,  BUT NOT    */
/*  LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR    */
/*  A PARTICULAR PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT    */
/*  OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,    */
/*  SPECIAL,  EXEMPLARY,  OR CONSEQUENTIAL  DAMAGES  (INCLUDING, BUT  NOT    */
/*  LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,    */
/*  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY    */
/*  THEORY OF  LIABILITY, WHETHER IN CONTRACT, STRICT  LIABILITY, OR TORT    */
/*  (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE    */
/*  OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.     */
/*                                                                           */
/*****************************************************************************/
#include <string.h>
#include <stddef.h>
#include <xdc/runtime/Startup.h>

#define CINIT ((void*)&__cinit__)

#define ALIGN_MASK 0x3
#define ALIGN_PTR(ptr) ((unsigned*)(((size_t)ptr + ALIGN_MASK) & ~ALIGN_MASK))

extern  int __cinit__;
typedef void (*PTRFUNC)();
extern  const PTRFUNC __pinit__[];
extern __FAR__ int xdc_runtime_Startup__EXECFXN__C;
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
         to   = (void*) *recptr++; 
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
   if ((int)__pinit__ != -1)
   {
      int i = 0;
      while (__pinit__[i] != NULL )
         __pinit__[i++]();
   }
}


/*
 *  @(#) ti.targets.elf.rtst16; 1, 0, 0, 0,10; 12-7-2010 15:19:26; /db/ztree/library/trees/xdctargets/xdctargets-c37x/src/ xlibrary

 */

