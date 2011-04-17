/* --COPYRIGHT--,BSD
 * Copyright (c) $(CPYYEAR), Texas Instruments Incorporated
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * *  Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * *  Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 * *  Neither the name of Texas Instruments Incorporated nor the names of
 *    its contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR
 * OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * --/COPYRIGHT--*/

/*
 *  ======== Examples.xdc ========
 */
import xdc.tools.product.IProductTemplate;

/*!
 *  ======== Examples ========
 *  DSP/BIOS examples 
 */
metaonly module Examples inherits IProductTemplate 
{
    config IProductTemplate.Filter genericFilterArray[] = [
            {deviceVariant:"C64X+", toolChain:"TI"},
            {deviceVariant:"C674X", toolChain:"TI"},
    ];

    config IProductTemplate.TemplateGroup root = {
        id          : "ti.bios.examples.root",
        name        : "DSP/BIOS v5.xx Examples",
        description : "DSP/BIOS v5.xx Examples"
    };
    config IProductTemplate.TemplateGroup ezdsp2812 = {
        id          : "ti.bios.examples.root.ezdsp2812",
        name        : "ezdsp2812 Examples",
        description : "ezdsp2812 specific DSP/BIOS Examples.",
	 groups      : ["ti.bios.examples.root"]
    };
    config IProductTemplate.TemplateGroup ezdsp28335 = {
        id          : "ti.bios.examples.root.ezdsp28335",
        name        : "ezdsp28335 Examples",
        description : "ezdsp28335 specific DSP/BIOS Examples.",
	 groups      : ["ti.bios.examples.root"]
    };
    config IProductTemplate.TemplateGroup evm5505 = {
        id          : "ti.bios.examples.root.evm5505",
        name        : "evm5505 Examples",
        description : "evm5505 specific DSP/BIOS Examples.",
	 groups      : ["ti.bios.examples.root"]
    };
    config IProductTemplate.TemplateGroup evm5515 = {
        id          : "ti.bios.examples.root.evm5515",
        name        : "evm5515 Examples",
        description : "evm5515 specific DSP/BIOS Examples.",
	 groups      : ["ti.bios.examples.root"]
    };
    config IProductTemplate.TemplateGroup dsk5510 = {
        id          : "ti.bios.examples.root.dsk5510",
        name        : "dsk5510 Examples",
        description : "dsk5510 specific DSP/BIOS Examples.",
	 groups      : ["ti.bios.examples.root"]
    };
    config IProductTemplate.TemplateGroup dsk6416 = {
        id          : "ti.bios.examples.root.dsk6416",
        name        : "dsk6416 Examples",
        description : "dsk6416 specific DSP/BIOS Examples.",
	 groups      : ["ti.bios.examples.root"]
    };
    config IProductTemplate.TemplateGroup dsk6455 = {
        id          : "ti.bios.examples.root.dsk6455",
        name        : "dsk6455 Examples",
        description : "dsk6455 specific DSP/BIOS Examples.",
	 groups      : ["ti.bios.examples.root"]
    };
    config IProductTemplate.TemplateGroup evm6424 = {
        id          : "ti.bios.examples.root.evm6424",
        name        : "evm6424 Examples",
        description : "evm6424 specific DSP/BIOS Examples.",
	 groups      : ["ti.bios.examples.root"]
    };
    config IProductTemplate.TemplateGroup evm6474 = {
        id          : "ti.bios.examples.root.evm6474",
        name        : "evm6474 Examples",
        description : "evm6474 specific DSP/BIOS Examples.",
	 groups      : ["ti.bios.examples.root"]
    };
    config IProductTemplate.TemplateGroup evm6747 = {
        id          : "ti.bios.examples.root.evm6747",
        name        : "evm6747 Examples",
        description : "evm6747 specific DSP/BIOS Examples.",
	 groups      : ["ti.bios.examples.root"]
    };
    config IProductTemplate.TemplateGroup evm6748 = {
        id          : "ti.bios.examples.root.evm6748",
        name        : "evm6748 Examples",
        description : "evm6748 specific DSP/BIOS Examples.",
	 groups      : ["ti.bios.examples.root"]
    };
    config IProductTemplate.TemplateGroup evmDM6437 = {
        id          : "ti.bios.examples.root.evmDM6437",
        name        : "evmDM6437 Examples",
        description : "evmDM6437 specific DSP/BIOS Examples.",
	 groups      : ["ti.bios.examples.root"]
    };
    config IProductTemplate.TemplateGroup evmDM6446 = {
        id          : "ti.bios.examples.root.evmDM6446",
        name        : "evmDM6446 Examples",
        description : "evmDM6446 specific DSP/BIOS Examples.",
	 groups      : ["ti.bios.examples.root"]
    };
    config IProductTemplate.TemplateGroup evmDM6467 = {
        id          : "ti.bios.examples.root.evmDM6467",
        name        : "evmDM6467 Examples",
        description : "evmDM6467 specific DSP/BIOS Examples.",
	 groups      : ["ti.bios.examples.root"]
    };
    config IProductTemplate.TemplateGroup evmOMAPL137 = {
        id          : "ti.bios.examples.root.evmOMAPL137",
        name        : "evmOMAPL137 Examples",
        description : "evmOMAPL137 specific DSP/BIOS Examples.",
	 groups      : ["ti.bios.examples.root"]
    };
    config IProductTemplate.TemplateGroup evmOMAPL138 = {
        id          : "ti.bios.examples.root.evmOMAPL138",
        name        : "evmOMAPL138 Examples",
        description : "evmOMAPL138 specific DSP/BIOS Examples.",
	 groups      : ["ti.bios.examples.root"]
    };
    config IProductTemplate.TemplateGroup padk6727 = {
        id          : "ti.bios.examples.root.padk6727",
        name        : "padk6727 Examples",
        description : "padk6727 specific DSP/BIOS Examples.",
	 groups      : ["ti.bios.examples.root"]
    };
    config IProductTemplate.TemplateGroup sim6416 = {
        id          : "ti.bios.examples.root.sim6416",
        name        : "sim6416 Examples",
        description : "sim6416 specific DSP/BIOS Examples.",
	 groups      : ["ti.bios.examples.root"]
    };
    override config IProductTemplate.TemplateGroup templateGroupArr [] =
        [root, 
	ezdsp2812, 
	ezdsp28335, 
	evm5505, 
	evm5515, 
	dsk5510, 
	dsk6416, 
	dsk6455, 
	evm6424, 
	evm6474, 
	evm6747, 
	evm6748, 
	evmDM6437, 
	evmDM6446, 
	evmDM6467, 
	evmOMAPL137, 
	evmOMAPL138, 
	padk6727, 
	sim6416, 
	];

// Empty project

    config IProductTemplate.TemplateInfo empty = {
        title: "Empty Example",
        description: "The empty example does not contain any source files. Please add .c and .tcf files to this project.",
        filterArr:[
            {deviceFamily:"C2000",toolChain:"TI"},
            {deviceFamily:"C5500",toolChain:"TI"},
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        linkerCommandFile:"",
        legacyTcf:true,
        groups:["ti.bios.examples.root"]

    };

//ezdsp2812

    config IProductTemplate.TemplateInfo bigtime_ezdsp2812 = {
        title: "bigtime Example",
        fileList: [
            {path: "bigtime.cpp"},
            {path: "ezdsp2812/bigtime.tcf"},
        ],
        description: "This is an example of using statically created DSP/BIOS objects, idle (IDL), period (PRD), and task (TSK), along with some C++ objects.  In this program, C++ is used to create a real-time clock/calendar.  The C++ class object, Clock, is driven by a variety of DSP/BIOS objects: two PRD objects, two TSK objects, and an IDL object, which are created through the DSP/BIOS Textual Configuration (TConf) Tools.",
        filterArr:[
            {deviceFamily:"C2000",toolChain:"TI"},
        ],
	linkerCommandFile:"",
        legacyTcf:true,
        groups:["ti.bios.examples.root.ezdsp2812"]
    };

//ezdsp2812

    config IProductTemplate.TemplateInfo clk_ezdsp2812 = {
        title: "clk Example",
        fileList: [
            {path: "clk.c"},
            {path: "ezdsp2812/clk.tcf"},
        ],
        description: "This example simply shows a statically recreated DSP/BIOS TSK object, task, using LOG_printf to print clock ticks. In this example, a task goes to sleep some number of ticks and prints the time after it wakes up.",
        filterArr:[
            {deviceFamily:"C2000",toolChain:"TI"},
        ],
	linkerCommandFile:"",
        legacyTcf:true,
        groups:["ti.bios.examples.root.ezdsp2812"]
    };

//ezdsp2812

    config IProductTemplate.TemplateInfo hello_ezdsp2812 = {
        title: "hello Example",
        fileList: [
            {path: "hello.c"},
            {path: "ezdsp2812/hello.tcf"},
        ],
        description: "This example serves as a basic sanity check program for DSP/BIOS. It demonstrates how to print the string 'hello world!' to the DSP/BIOS message log. This example also introduces new users to DSP/BIOS by performing basic string output using a LOG object.",
        filterArr:[
            {deviceFamily:"C2000",toolChain:"TI"},
        ],
	linkerCommandFile:"",
        legacyTcf:true,
        groups:["ti.bios.examples.root.ezdsp2812"]
    };

//ezdsp2812

    config IProductTemplate.TemplateInfo mailbox_ezdsp2812 = {
        title: "mailbox Example",
        fileList: [
            {path: "mailbox.c"},
            {path: "ezdsp2812/mailbox.tcf"},
        ],
        description: "This example uses a mailbox (from the MBX module of DSP/BIOS)to send messages from multiple writer tasks to a single reader task.  In this example, the mailbox, the reader task, and three writer tasks are created by the Configuration Tool.",
        filterArr:[
            {deviceFamily:"C2000",toolChain:"TI"},
        ],
	linkerCommandFile:"",
        legacyTcf:true,
        groups:["ti.bios.examples.root.ezdsp2812"]
    };

//ezdsp2812

    config IProductTemplate.TemplateInfo semaphore_ezdsp2812 = {
        title: "semaphore Example",
        fileList: [
            {path: "semaphore.c"},
            {path: "ezdsp2812/semaphore.tcf"},
        ],
        description: "This is an example of using statically created DSP/BIOS objects, semaphore (SEM) and task (TSK) and dynamically created queue (QUE) objects. This example will show you how to use DSP/BIOS's QUE and SEM APIs to synchronize message sending among tasks.",
        filterArr:[
            {deviceFamily:"C2000",toolChain:"TI"},
        ],
	linkerCommandFile:"",
        legacyTcf:true,
        groups:["ti.bios.examples.root.ezdsp2812"]
    };

//ezdsp2812

    config IProductTemplate.TemplateInfo stairstep_ezdsp2812 = {
        title: "stairstep Example",
        fileList: [
            {path: "stairstep.c"},
            {path: "ezdsp2812/stairstep.tcf"},
        ],
        description: "The purpose of this example is to illustrate the cpuload graph.  In cpuloadInit it gets the CPU frequency using an API and fills the loadValue array with load values corresponding to 25, 50, 75 and 98 percent cpuload. The loadPrd which has a small period calls AUDIO_load function with loadValue. The stepPrd which has a very long period changes the loadValue in a circular fashion.",
        filterArr:[
            {deviceFamily:"C2000",toolChain:"TI"},
        ],
	linkerCommandFile:"",
        legacyTcf:true,
        groups:["ti.bios.examples.root.ezdsp2812"]
    };

//ezdsp2812

    config IProductTemplate.TemplateInfo swi_ezdsp2812 = {
        title: "swi Example",
        fileList: [
            {path: "swi.c"},
            {path: "ezdsp2812/swi.tcf"},
        ],
        description: "This example shows how a lower priority software interrupt (SWI) can interrupt itself by posting a higher priority software interrupt.",
        filterArr:[
            {deviceFamily:"C2000",toolChain:"TI"},
        ],
	linkerCommandFile:"",
        legacyTcf:true,
        groups:["ti.bios.examples.root.ezdsp2812"]
    };

//ezdsp2812

    config IProductTemplate.TemplateInfo tsk_ezdsp2812 = {
        title: "tsk Example",
        fileList: [
            {path: "tsk.c"},
            {path: "ezdsp2812/tsk.tcf"},
        ],
        description: "This example shows the round robin scheduling scheme for tasks of equal priority.",
        filterArr:[
            {deviceFamily:"C2000",toolChain:"TI"},
        ],
	linkerCommandFile:"",
        legacyTcf:true,
        groups:["ti.bios.examples.root.ezdsp2812"]
    };

//ezdsp28335

    config IProductTemplate.TemplateInfo bigtime_ezdsp28335 = {
        title: "bigtime Example",
        fileList: [
            {path: "bigtime.cpp"},
            {path: "ezdsp28335/bigtime.tcf"},
        ],
        description: "This is an example of using statically created DSP/BIOS objects, idle (IDL), period (PRD), and task (TSK), along with some C++ objects.  In this program, C++ is used to create a real-time clock/calendar.  The C++ class object, Clock, is driven by a variety of DSP/BIOS objects: two PRD objects, two TSK objects, and an IDL object, which are created through the DSP/BIOS Textual Configuration (TConf) Tools.",
        filterArr:[
            {deviceFamily:"C2000",toolChain:"TI"},
        ],
	linkerCommandFile:"",
        legacyTcf:true,
        groups:["ti.bios.examples.root.ezdsp28335"]
    };

//ezdsp28335

    config IProductTemplate.TemplateInfo clk_ezdsp28335 = {
        title: "clk Example",
        fileList: [
            {path: "clk.c"},
            {path: "ezdsp28335/clk.tcf"},
        ],
        description: "This example simply shows a statically recreated DSP/BIOS TSK object, task, using LOG_printf to print clock ticks. In this example, a task goes to sleep some number of ticks and prints the time after it wakes up.",
        filterArr:[
            {deviceFamily:"C2000",toolChain:"TI"},
        ],
	linkerCommandFile:"",
        legacyTcf:true,
        groups:["ti.bios.examples.root.ezdsp28335"]
    };

//ezdsp28335

    config IProductTemplate.TemplateInfo hello_ezdsp28335 = {
        title: "hello Example",
        fileList: [
            {path: "hello.c"},
            {path: "ezdsp28335/hello.tcf"},
        ],
        description: "This example serves as a basic sanity check program for DSP/BIOS. It demonstrates how to print the string 'hello world!' to the DSP/BIOS message log. This example also introduces new users to DSP/BIOS by performing basic string output using a LOG object.",
        filterArr:[
            {deviceFamily:"C2000",toolChain:"TI"},
        ],
	linkerCommandFile:"",
        legacyTcf:true,
        groups:["ti.bios.examples.root.ezdsp28335"]
    };

//ezdsp28335

    config IProductTemplate.TemplateInfo mailbox_ezdsp28335 = {
        title: "mailbox Example",
        fileList: [
            {path: "mailbox.c"},
            {path: "ezdsp28335/mailbox.tcf"},
        ],
        description: "This example uses a mailbox (from the MBX module of DSP/BIOS)to send messages from multiple writer tasks to a single reader task.  In this example, the mailbox, the reader task, and three writer tasks are created by the Configuration Tool.",
        filterArr:[
            {deviceFamily:"C2000",toolChain:"TI"},
        ],
	linkerCommandFile:"",
        legacyTcf:true,
        groups:["ti.bios.examples.root.ezdsp28335"]
    };

//ezdsp28335

    config IProductTemplate.TemplateInfo semaphore_ezdsp28335 = {
        title: "semaphore Example",
        fileList: [
            {path: "semaphore.c"},
            {path: "ezdsp28335/semaphore.tcf"},
        ],
        description: "This is an example of using statically created DSP/BIOS objects, semaphore (SEM) and task (TSK) and dynamically created queue (QUE) objects. This example will show you how to use DSP/BIOS's QUE and SEM APIs to synchronize message sending among tasks.",
        filterArr:[
            {deviceFamily:"C2000",toolChain:"TI"},
        ],
	linkerCommandFile:"",
        legacyTcf:true,
        groups:["ti.bios.examples.root.ezdsp28335"]
    };

//ezdsp28335

    config IProductTemplate.TemplateInfo stairstep_ezdsp28335 = {
        title: "stairstep Example",
        fileList: [
            {path: "stairstep.c"},
            {path: "ezdsp28335/stairstep.tcf"},
        ],
        description: "The purpose of this example is to illustrate the cpuload graph.  In cpuloadInit it gets the CPU frequency using an API and fills the loadValue array with load values corresponding to 25, 50, 75 and 98 percent cpuload. The loadPrd which has a small period calls AUDIO_load function with loadValue. The stepPrd which has a very long period changes the loadValue in a circular fashion.",
        filterArr:[
            {deviceFamily:"C2000",toolChain:"TI"},
        ],
	linkerCommandFile:"",
        legacyTcf:true,
        groups:["ti.bios.examples.root.ezdsp28335"]
    };

//ezdsp28335

    config IProductTemplate.TemplateInfo swi_ezdsp28335 = {
        title: "swi Example",
        fileList: [
            {path: "swi.c"},
            {path: "ezdsp28335/swi.tcf"},
        ],
        description: "This example shows how a lower priority software interrupt (SWI) can interrupt itself by posting a higher priority software interrupt.",
        filterArr:[
            {deviceFamily:"C2000",toolChain:"TI"},
        ],
	linkerCommandFile:"",
        legacyTcf:true,
        groups:["ti.bios.examples.root.ezdsp28335"]
    };

//ezdsp28335

    config IProductTemplate.TemplateInfo tsk_ezdsp28335 = {
        title: "tsk Example",
        fileList: [
            {path: "tsk.c"},
            {path: "ezdsp28335/tsk.tcf"},
        ],
        description: "This example shows the round robin scheduling scheme for tasks of equal priority.",
        filterArr:[
            {deviceFamily:"C2000",toolChain:"TI"},
        ],
	linkerCommandFile:"",
        legacyTcf:true,
        groups:["ti.bios.examples.root.ezdsp28335"]
    };

//evm5505

    config IProductTemplate.TemplateInfo bigtime_evm5505 = {
        title: "bigtime Example",
        fileList: [
            {path: "bigtime.cpp"},
            {path: "evm5505/bigtime.tcf"},
        ],
        description: "This is an example of using statically created DSP/BIOS objects, idle (IDL), period (PRD), and task (TSK), along with some C++ objects.  In this program, C++ is used to create a real-time clock/calendar.  The C++ class object, Clock, is driven by a variety of DSP/BIOS objects: two PRD objects, two TSK objects, and an IDL object, which are created through the DSP/BIOS Textual Configuration (TConf) Tools.",
        filterArr:[
            {deviceFamily:"C5500",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm5505"]
    };

//evm5505

    config IProductTemplate.TemplateInfo clk_evm5505 = {
        title: "clk Example",
        fileList: [
            {path: "clk.c"},
            {path: "evm5505/clk.tcf"},
        ],
        description: "This example simply shows a statically recreated DSP/BIOS TSK object, task, using LOG_printf to print clock ticks. In this example, a task goes to sleep some number of ticks and prints the time after it wakes up.",
        filterArr:[
            {deviceFamily:"C5500",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm5505"]
    };

//evm5505

    config IProductTemplate.TemplateInfo hello_evm5505 = {
        title: "hello Example",
        fileList: [
            {path: "hello.c"},
            {path: "evm5505/hello.tcf"},
        ],
        description: "This example serves as a basic sanity check program for DSP/BIOS. It demonstrates how to print the string 'hello world!' to the DSP/BIOS message log. This example also introduces new users to DSP/BIOS by performing basic string output using a LOG object.",
        filterArr:[
            {deviceFamily:"C5500",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm5505"]
    };

//evm5505

    config IProductTemplate.TemplateInfo mailbox_evm5505 = {
        title: "mailbox Example",
        fileList: [
            {path: "mailbox.c"},
            {path: "evm5505/mailbox.tcf"},
        ],
        description: "This example uses a mailbox (from the MBX module of DSP/BIOS)to send messages from multiple writer tasks to a single reader task.  In this example, the mailbox, the reader task, and three writer tasks are created by the Configuration Tool.",
        filterArr:[
            {deviceFamily:"C5500",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm5505"]
    };

//evm5505

    config IProductTemplate.TemplateInfo semaphore_evm5505 = {
        title: "semaphore Example",
        fileList: [
            {path: "semaphore.c"},
            {path: "evm5505/semaphore.tcf"},
        ],
        description: "This is an example of using statically created DSP/BIOS objects, semaphore (SEM) and task (TSK) and dynamically created queue (QUE) objects. This example will show you how to use DSP/BIOS's QUE and SEM APIs to synchronize message sending among tasks.",
        filterArr:[
            {deviceFamily:"C5500",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm5505"]
    };

//evm5505

    config IProductTemplate.TemplateInfo stairstep_evm5505 = {
        title: "stairstep Example",
        fileList: [
            {path: "stairstep.c"},
            {path: "evm5505/stairstep.tcf"},
        ],
        description: "The purpose of this example is to illustrate the cpuload graph.  In cpuloadInit it gets the CPU frequency using an API and fills the loadValue array with load values corresponding to 25, 50, 75 and 98 percent cpuload. The loadPrd which has a small period calls AUDIO_load function with loadValue. The stepPrd which has a very long period changes the loadValue in a circular fashion.",
        filterArr:[
            {deviceFamily:"C5500",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm5505"]
    };

//evm5505

    config IProductTemplate.TemplateInfo swi_evm5505 = {
        title: "swi Example",
        fileList: [
            {path: "swi.c"},
            {path: "evm5505/swi.tcf"},
        ],
        description: "This example shows how a lower priority software interrupt (SWI) can interrupt itself by posting a higher priority software interrupt.",
        filterArr:[
            {deviceFamily:"C5500",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm5505"]
    };

//evm5505

    config IProductTemplate.TemplateInfo tsk_evm5505 = {
        title: "tsk Example",
        fileList: [
            {path: "tsk.c"},
            {path: "evm5505/tsk.tcf"},
        ],
        description: "This example shows the round robin scheduling scheme for tasks of equal priority.",
        filterArr:[
            {deviceFamily:"C5500",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm5505"]
    };

//evm5515

    config IProductTemplate.TemplateInfo bigtime_evm5515 = {
        title: "bigtime Example",
        fileList: [
            {path: "bigtime.cpp"},
            {path: "evm5515/bigtime.tcf"},
        ],
        description: "This is an example of using statically created DSP/BIOS objects, idle (IDL), period (PRD), and task (TSK), along with some C++ objects.  In this program, C++ is used to create a real-time clock/calendar.  The C++ class object, Clock, is driven by a variety of DSP/BIOS objects: two PRD objects, two TSK objects, and an IDL object, which are created through the DSP/BIOS Textual Configuration (TConf) Tools.",
        filterArr:[
            {deviceFamily:"C5500",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm5515"]
    };

//evm5515

    config IProductTemplate.TemplateInfo clk_evm5515 = {
        title: "clk Example",
        fileList: [
            {path: "clk.c"},
            {path: "evm5515/clk.tcf"},
        ],
        description: "This example simply shows a statically recreated DSP/BIOS TSK object, task, using LOG_printf to print clock ticks. In this example, a task goes to sleep some number of ticks and prints the time after it wakes up.",
        filterArr:[
            {deviceFamily:"C5500",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm5515"]
    };

//evm5515

    config IProductTemplate.TemplateInfo hello_evm5515 = {
        title: "hello Example",
        fileList: [
            {path: "hello.c"},
            {path: "evm5515/hello.tcf"},
        ],
        description: "This example serves as a basic sanity check program for DSP/BIOS. It demonstrates how to print the string 'hello world!' to the DSP/BIOS message log. This example also introduces new users to DSP/BIOS by performing basic string output using a LOG object.",
        filterArr:[
            {deviceFamily:"C5500",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm5515"]
    };

//evm5515

    config IProductTemplate.TemplateInfo mailbox_evm5515 = {
        title: "mailbox Example",
        fileList: [
            {path: "mailbox.c"},
            {path: "evm5515/mailbox.tcf"},
        ],
        description: "This example uses a mailbox (from the MBX module of DSP/BIOS)to send messages from multiple writer tasks to a single reader task.  In this example, the mailbox, the reader task, and three writer tasks are created by the Configuration Tool.",
        filterArr:[
            {deviceFamily:"C5500",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm5515"]
    };

//evm5515

    config IProductTemplate.TemplateInfo semaphore_evm5515 = {
        title: "semaphore Example",
        fileList: [
            {path: "semaphore.c"},
            {path: "evm5515/semaphore.tcf"},
        ],
        description: "This is an example of using statically created DSP/BIOS objects, semaphore (SEM) and task (TSK) and dynamically created queue (QUE) objects. This example will show you how to use DSP/BIOS's QUE and SEM APIs to synchronize message sending among tasks.",
        filterArr:[
            {deviceFamily:"C5500",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm5515"]
    };

//evm5515

    config IProductTemplate.TemplateInfo stairstep_evm5515 = {
        title: "stairstep Example",
        fileList: [
            {path: "stairstep.c"},
            {path: "evm5515/stairstep.tcf"},
        ],
        description: "The purpose of this example is to illustrate the cpuload graph.  In cpuloadInit it gets the CPU frequency using an API and fills the loadValue array with load values corresponding to 25, 50, 75 and 98 percent cpuload. The loadPrd which has a small period calls AUDIO_load function with loadValue. The stepPrd which has a very long period changes the loadValue in a circular fashion.",
        filterArr:[
            {deviceFamily:"C5500",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm5515"]
    };

//evm5515

    config IProductTemplate.TemplateInfo swi_evm5515 = {
        title: "swi Example",
        fileList: [
            {path: "swi.c"},
            {path: "evm5515/swi.tcf"},
        ],
        description: "This example shows how a lower priority software interrupt (SWI) can interrupt itself by posting a higher priority software interrupt.",
        filterArr:[
            {deviceFamily:"C5500",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm5515"]
    };

//evm5515

    config IProductTemplate.TemplateInfo tsk_evm5515 = {
        title: "tsk Example",
        fileList: [
            {path: "tsk.c"},
            {path: "evm5515/tsk.tcf"},
        ],
        description: "This example shows the round robin scheduling scheme for tasks of equal priority.",
        filterArr:[
            {deviceFamily:"C5500",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm5515"]
    };

//dsk5510

    config IProductTemplate.TemplateInfo bigtime_dsk5510 = {
        title: "bigtime Example",
        fileList: [
            {path: "bigtime.cpp"},
            {path: "dsk5510/bigtime.tcf"},
        ],
        description: "This is an example of using statically created DSP/BIOS objects, idle (IDL), period (PRD), and task (TSK), along with some C++ objects.  In this program, C++ is used to create a real-time clock/calendar.  The C++ class object, Clock, is driven by a variety of DSP/BIOS objects: two PRD objects, two TSK objects, and an IDL object, which are created through the DSP/BIOS Textual Configuration (TConf) Tools.",
        filterArr:[
            {deviceFamily:"C5500",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.dsk5510"]
    };

//dsk5510

    config IProductTemplate.TemplateInfo clk_dsk5510 = {
        title: "clk Example",
        fileList: [
            {path: "clk.c"},
            {path: "dsk5510/clk.tcf"},
        ],
        description: "This example simply shows a statically recreated DSP/BIOS TSK object, task, using LOG_printf to print clock ticks. In this example, a task goes to sleep some number of ticks and prints the time after it wakes up.",
        filterArr:[
            {deviceFamily:"C5500",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.dsk5510"]
    };

//dsk5510

    config IProductTemplate.TemplateInfo hello_dsk5510 = {
        title: "hello Example",
        fileList: [
            {path: "hello.c"},
            {path: "dsk5510/hello.tcf"},
        ],
        description: "This example serves as a basic sanity check program for DSP/BIOS. It demonstrates how to print the string 'hello world!' to the DSP/BIOS message log. This example also introduces new users to DSP/BIOS by performing basic string output using a LOG object.",
        filterArr:[
            {deviceFamily:"C5500",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.dsk5510"]
    };

//dsk5510

    config IProductTemplate.TemplateInfo mailbox_dsk5510 = {
        title: "mailbox Example",
        fileList: [
            {path: "mailbox.c"},
            {path: "dsk5510/mailbox.tcf"},
        ],
        description: "This example uses a mailbox (from the MBX module of DSP/BIOS)to send messages from multiple writer tasks to a single reader task.  In this example, the mailbox, the reader task, and three writer tasks are created by the Configuration Tool.",
        filterArr:[
            {deviceFamily:"C5500",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.dsk5510"]
    };

//dsk5510

    config IProductTemplate.TemplateInfo semaphore_dsk5510 = {
        title: "semaphore Example",
        fileList: [
            {path: "semaphore.c"},
            {path: "dsk5510/semaphore.tcf"},
        ],
        description: "This is an example of using statically created DSP/BIOS objects, semaphore (SEM) and task (TSK) and dynamically created queue (QUE) objects. This example will show you how to use DSP/BIOS's QUE and SEM APIs to synchronize message sending among tasks.",
        filterArr:[
            {deviceFamily:"C5500",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.dsk5510"]
    };

//dsk5510

    config IProductTemplate.TemplateInfo stairstep_dsk5510 = {
        title: "stairstep Example",
        fileList: [
            {path: "stairstep.c"},
            {path: "dsk5510/stairstep.tcf"},
        ],
        description: "The purpose of this example is to illustrate the cpuload graph.  In cpuloadInit it gets the CPU frequency using an API and fills the loadValue array with load values corresponding to 25, 50, 75 and 98 percent cpuload. The loadPrd which has a small period calls AUDIO_load function with loadValue. The stepPrd which has a very long period changes the loadValue in a circular fashion.",
        filterArr:[
            {deviceFamily:"C5500",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.dsk5510"]
    };

//dsk5510

    config IProductTemplate.TemplateInfo swi_dsk5510 = {
        title: "swi Example",
        fileList: [
            {path: "swi.c"},
            {path: "dsk5510/swi.tcf"},
        ],
        description: "This example shows how a lower priority software interrupt (SWI) can interrupt itself by posting a higher priority software interrupt.",
        filterArr:[
            {deviceFamily:"C5500",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.dsk5510"]
    };

//dsk5510

    config IProductTemplate.TemplateInfo tsk_dsk5510 = {
        title: "tsk Example",
        fileList: [
            {path: "tsk.c"},
            {path: "dsk5510/tsk.tcf"},
        ],
        description: "This example shows the round robin scheduling scheme for tasks of equal priority.",
        filterArr:[
            {deviceFamily:"C5500",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.dsk5510"]
    };

//dsk6416

    config IProductTemplate.TemplateInfo bigtime_dsk6416 = {
        title: "bigtime Example",
        fileList: [
            {path: "bigtime.cpp"},
            {path: "dsk6416/bigtime.tcf"},
        ],
        description: "This is an example of using statically created DSP/BIOS objects, idle (IDL), period (PRD), and task (TSK), along with some C++ objects.  In this program, C++ is used to create a real-time clock/calendar.  The C++ class object, Clock, is driven by a variety of DSP/BIOS objects: two PRD objects, two TSK objects, and an IDL object, which are created through the DSP/BIOS Textual Configuration (TConf) Tools.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.dsk6416"]
    };

//dsk6416

    config IProductTemplate.TemplateInfo clk_dsk6416 = {
        title: "clk Example",
        fileList: [
            {path: "clk.c"},
            {path: "dsk6416/clk.tcf"},
        ],
        description: "This example simply shows a statically recreated DSP/BIOS TSK object, task, using LOG_printf to print clock ticks. In this example, a task goes to sleep some number of ticks and prints the time after it wakes up.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.dsk6416"]
    };

//dsk6416

    config IProductTemplate.TemplateInfo hello_dsk6416 = {
        title: "hello Example",
        fileList: [
            {path: "hello.c"},
            {path: "dsk6416/hello.tcf"},
        ],
        description: "This example serves as a basic sanity check program for DSP/BIOS. It demonstrates how to print the string 'hello world!' to the DSP/BIOS message log. This example also introduces new users to DSP/BIOS by performing basic string output using a LOG object.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.dsk6416"]
    };

//dsk6416

    config IProductTemplate.TemplateInfo mailbox_dsk6416 = {
        title: "mailbox Example",
        fileList: [
            {path: "mailbox.c"},
            {path: "dsk6416/mailbox.tcf"},
        ],
        description: "This example uses a mailbox (from the MBX module of DSP/BIOS)to send messages from multiple writer tasks to a single reader task.  In this example, the mailbox, the reader task, and three writer tasks are created by the Configuration Tool.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.dsk6416"]
    };

//dsk6416

    config IProductTemplate.TemplateInfo semaphore_dsk6416 = {
        title: "semaphore Example",
        fileList: [
            {path: "semaphore.c"},
            {path: "dsk6416/semaphore.tcf"},
        ],
        description: "This is an example of using statically created DSP/BIOS objects, semaphore (SEM) and task (TSK) and dynamically created queue (QUE) objects. This example will show you how to use DSP/BIOS's QUE and SEM APIs to synchronize message sending among tasks.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.dsk6416"]
    };

//dsk6416

    config IProductTemplate.TemplateInfo stairstep_dsk6416 = {
        title: "stairstep Example",
        fileList: [
            {path: "stairstep.c"},
            {path: "dsk6416/stairstep.tcf"},
        ],
        description: "The purpose of this example is to illustrate the cpuload graph.  In cpuloadInit it gets the CPU frequency using an API and fills the loadValue array with load values corresponding to 25, 50, 75 and 98 percent cpuload. The loadPrd which has a small period calls AUDIO_load function with loadValue. The stepPrd which has a very long period changes the loadValue in a circular fashion.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.dsk6416"]
    };

//dsk6416

    config IProductTemplate.TemplateInfo swi_dsk6416 = {
        title: "swi Example",
        fileList: [
            {path: "swi.c"},
            {path: "dsk6416/swi.tcf"},
        ],
        description: "This example shows how a lower priority software interrupt (SWI) can interrupt itself by posting a higher priority software interrupt.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.dsk6416"]
    };

//dsk6416

    config IProductTemplate.TemplateInfo tsk_dsk6416 = {
        title: "tsk Example",
        fileList: [
            {path: "tsk.c"},
            {path: "dsk6416/tsk.tcf"},
        ],
        description: "This example shows the round robin scheduling scheme for tasks of equal priority.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.dsk6416"]
    };

//dsk6455

    config IProductTemplate.TemplateInfo bigtime_dsk6455 = {
        title: "bigtime Example",
        fileList: [
            {path: "bigtime.cpp"},
            {path: "dsk6455/bigtime.tcf"},
        ],
        description: "This is an example of using statically created DSP/BIOS objects, idle (IDL), period (PRD), and task (TSK), along with some C++ objects.  In this program, C++ is used to create a real-time clock/calendar.  The C++ class object, Clock, is driven by a variety of DSP/BIOS objects: two PRD objects, two TSK objects, and an IDL object, which are created through the DSP/BIOS Textual Configuration (TConf) Tools.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.dsk6455"]
    };

//dsk6455

    config IProductTemplate.TemplateInfo clk_dsk6455 = {
        title: "clk Example",
        fileList: [
            {path: "clk.c"},
            {path: "dsk6455/clk.tcf"},
        ],
        description: "This example simply shows a statically recreated DSP/BIOS TSK object, task, using LOG_printf to print clock ticks. In this example, a task goes to sleep some number of ticks and prints the time after it wakes up.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.dsk6455"]
    };

//dsk6455

    config IProductTemplate.TemplateInfo hello_dsk6455 = {
        title: "hello Example",
        fileList: [
            {path: "hello.c"},
            {path: "dsk6455/hello.tcf"},
        ],
        description: "This example serves as a basic sanity check program for DSP/BIOS. It demonstrates how to print the string 'hello world!' to the DSP/BIOS message log. This example also introduces new users to DSP/BIOS by performing basic string output using a LOG object.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.dsk6455"]
    };

//dsk6455

    config IProductTemplate.TemplateInfo mailbox_dsk6455 = {
        title: "mailbox Example",
        fileList: [
            {path: "mailbox.c"},
            {path: "dsk6455/mailbox.tcf"},
        ],
        description: "This example uses a mailbox (from the MBX module of DSP/BIOS)to send messages from multiple writer tasks to a single reader task.  In this example, the mailbox, the reader task, and three writer tasks are created by the Configuration Tool.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.dsk6455"]
    };

//dsk6455

    config IProductTemplate.TemplateInfo semaphore_dsk6455 = {
        title: "semaphore Example",
        fileList: [
            {path: "semaphore.c"},
            {path: "dsk6455/semaphore.tcf"},
        ],
        description: "This is an example of using statically created DSP/BIOS objects, semaphore (SEM) and task (TSK) and dynamically created queue (QUE) objects. This example will show you how to use DSP/BIOS's QUE and SEM APIs to synchronize message sending among tasks.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.dsk6455"]
    };

//dsk6455

    config IProductTemplate.TemplateInfo stairstep_dsk6455 = {
        title: "stairstep Example",
        fileList: [
            {path: "stairstep.c"},
            {path: "dsk6455/stairstep.tcf"},
        ],
        description: "The purpose of this example is to illustrate the cpuload graph.  In cpuloadInit it gets the CPU frequency using an API and fills the loadValue array with load values corresponding to 25, 50, 75 and 98 percent cpuload. The loadPrd which has a small period calls AUDIO_load function with loadValue. The stepPrd which has a very long period changes the loadValue in a circular fashion.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.dsk6455"]
    };

//dsk6455

    config IProductTemplate.TemplateInfo swi_dsk6455 = {
        title: "swi Example",
        fileList: [
            {path: "swi.c"},
            {path: "dsk6455/swi.tcf"},
        ],
        description: "This example shows how a lower priority software interrupt (SWI) can interrupt itself by posting a higher priority software interrupt.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.dsk6455"]
    };

//dsk6455

    config IProductTemplate.TemplateInfo tsk_dsk6455 = {
        title: "tsk Example",
        fileList: [
            {path: "tsk.c"},
            {path: "dsk6455/tsk.tcf"},
        ],
        description: "This example shows the round robin scheduling scheme for tasks of equal priority.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.dsk6455"]
    };

//evm6424

    config IProductTemplate.TemplateInfo bigtime_evm6424 = {
        title: "bigtime Example",
        fileList: [
            {path: "bigtime.cpp"},
            {path: "evm6424/bigtime.tcf"},
        ],
        description: "This is an example of using statically created DSP/BIOS objects, idle (IDL), period (PRD), and task (TSK), along with some C++ objects.  In this program, C++ is used to create a real-time clock/calendar.  The C++ class object, Clock, is driven by a variety of DSP/BIOS objects: two PRD objects, two TSK objects, and an IDL object, which are created through the DSP/BIOS Textual Configuration (TConf) Tools.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm6424"]
    };

//evm6424

    config IProductTemplate.TemplateInfo clk_evm6424 = {
        title: "clk Example",
        fileList: [
            {path: "clk.c"},
            {path: "evm6424/clk.tcf"},
        ],
        description: "This example simply shows a statically recreated DSP/BIOS TSK object, task, using LOG_printf to print clock ticks. In this example, a task goes to sleep some number of ticks and prints the time after it wakes up.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm6424"]
    };

//evm6424

    config IProductTemplate.TemplateInfo hello_evm6424 = {
        title: "hello Example",
        fileList: [
            {path: "hello.c"},
            {path: "evm6424/hello.tcf"},
        ],
        description: "This example serves as a basic sanity check program for DSP/BIOS. It demonstrates how to print the string 'hello world!' to the DSP/BIOS message log. This example also introduces new users to DSP/BIOS by performing basic string output using a LOG object.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm6424"]
    };

//evm6424

    config IProductTemplate.TemplateInfo mailbox_evm6424 = {
        title: "mailbox Example",
        fileList: [
            {path: "mailbox.c"},
            {path: "evm6424/mailbox.tcf"},
        ],
        description: "This example uses a mailbox (from the MBX module of DSP/BIOS)to send messages from multiple writer tasks to a single reader task.  In this example, the mailbox, the reader task, and three writer tasks are created by the Configuration Tool.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm6424"]
    };

//evm6424

    config IProductTemplate.TemplateInfo semaphore_evm6424 = {
        title: "semaphore Example",
        fileList: [
            {path: "semaphore.c"},
            {path: "evm6424/semaphore.tcf"},
        ],
        description: "This is an example of using statically created DSP/BIOS objects, semaphore (SEM) and task (TSK) and dynamically created queue (QUE) objects. This example will show you how to use DSP/BIOS's QUE and SEM APIs to synchronize message sending among tasks.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm6424"]
    };

//evm6424

    config IProductTemplate.TemplateInfo stairstep_evm6424 = {
        title: "stairstep Example",
        fileList: [
            {path: "stairstep.c"},
            {path: "evm6424/stairstep.tcf"},
        ],
        description: "The purpose of this example is to illustrate the cpuload graph.  In cpuloadInit it gets the CPU frequency using an API and fills the loadValue array with load values corresponding to 25, 50, 75 and 98 percent cpuload. The loadPrd which has a small period calls AUDIO_load function with loadValue. The stepPrd which has a very long period changes the loadValue in a circular fashion.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm6424"]
    };

//evm6424

    config IProductTemplate.TemplateInfo swi_evm6424 = {
        title: "swi Example",
        fileList: [
            {path: "swi.c"},
            {path: "evm6424/swi.tcf"},
        ],
        description: "This example shows how a lower priority software interrupt (SWI) can interrupt itself by posting a higher priority software interrupt.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm6424"]
    };

//evm6424

    config IProductTemplate.TemplateInfo tsk_evm6424 = {
        title: "tsk Example",
        fileList: [
            {path: "tsk.c"},
            {path: "evm6424/tsk.tcf"},
        ],
        description: "This example shows the round robin scheduling scheme for tasks of equal priority.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm6424"]
    };

//evm6474

    config IProductTemplate.TemplateInfo bigtime_evm6474 = {
        title: "bigtime Example",
        fileList: [
            {path: "bigtime.cpp"},
            {path: "evm6474/bigtime.tcf"},
        ],
        description: "This is an example of using statically created DSP/BIOS objects, idle (IDL), period (PRD), and task (TSK), along with some C++ objects.  In this program, C++ is used to create a real-time clock/calendar.  The C++ class object, Clock, is driven by a variety of DSP/BIOS objects: two PRD objects, two TSK objects, and an IDL object, which are created through the DSP/BIOS Textual Configuration (TConf) Tools.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm6474"]
    };

//evm6474

    config IProductTemplate.TemplateInfo clk_evm6474 = {
        title: "clk Example",
        fileList: [
            {path: "clk.c"},
            {path: "evm6474/clk.tcf"},
        ],
        description: "This example simply shows a statically recreated DSP/BIOS TSK object, task, using LOG_printf to print clock ticks. In this example, a task goes to sleep some number of ticks and prints the time after it wakes up.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm6474"]
    };

//evm6474

    config IProductTemplate.TemplateInfo hello_evm6474 = {
        title: "hello Example",
        fileList: [
            {path: "hello.c"},
            {path: "evm6474/hello.tcf"},
        ],
        description: "This example serves as a basic sanity check program for DSP/BIOS. It demonstrates how to print the string 'hello world!' to the DSP/BIOS message log. This example also introduces new users to DSP/BIOS by performing basic string output using a LOG object.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm6474"]
    };

//evm6474

    config IProductTemplate.TemplateInfo mailbox_evm6474 = {
        title: "mailbox Example",
        fileList: [
            {path: "mailbox.c"},
            {path: "evm6474/mailbox.tcf"},
        ],
        description: "This example uses a mailbox (from the MBX module of DSP/BIOS)to send messages from multiple writer tasks to a single reader task.  In this example, the mailbox, the reader task, and three writer tasks are created by the Configuration Tool.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm6474"]
    };

//evm6474

    config IProductTemplate.TemplateInfo semaphore_evm6474 = {
        title: "semaphore Example",
        fileList: [
            {path: "semaphore.c"},
            {path: "evm6474/semaphore.tcf"},
        ],
        description: "This is an example of using statically created DSP/BIOS objects, semaphore (SEM) and task (TSK) and dynamically created queue (QUE) objects. This example will show you how to use DSP/BIOS's QUE and SEM APIs to synchronize message sending among tasks.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm6474"]
    };

//evm6474

    config IProductTemplate.TemplateInfo stairstep_evm6474 = {
        title: "stairstep Example",
        fileList: [
            {path: "stairstep.c"},
            {path: "evm6474/stairstep.tcf"},
        ],
        description: "The purpose of this example is to illustrate the cpuload graph.  In cpuloadInit it gets the CPU frequency using an API and fills the loadValue array with load values corresponding to 25, 50, 75 and 98 percent cpuload. The loadPrd which has a small period calls AUDIO_load function with loadValue. The stepPrd which has a very long period changes the loadValue in a circular fashion.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm6474"]
    };

//evm6474

    config IProductTemplate.TemplateInfo swi_evm6474 = {
        title: "swi Example",
        fileList: [
            {path: "swi.c"},
            {path: "evm6474/swi.tcf"},
        ],
        description: "This example shows how a lower priority software interrupt (SWI) can interrupt itself by posting a higher priority software interrupt.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm6474"]
    };

//evm6474

    config IProductTemplate.TemplateInfo tsk_evm6474 = {
        title: "tsk Example",
        fileList: [
            {path: "tsk.c"},
            {path: "evm6474/tsk.tcf"},
        ],
        description: "This example shows the round robin scheduling scheme for tasks of equal priority.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm6474"]
    };

//evm6747

    config IProductTemplate.TemplateInfo bigtime_evm6747 = {
        title: "bigtime Example",
        fileList: [
            {path: "bigtime.cpp"},
            {path: "evm6747/bigtime.tcf"},
        ],
        description: "This is an example of using statically created DSP/BIOS objects, idle (IDL), period (PRD), and task (TSK), along with some C++ objects.  In this program, C++ is used to create a real-time clock/calendar.  The C++ class object, Clock, is driven by a variety of DSP/BIOS objects: two PRD objects, two TSK objects, and an IDL object, which are created through the DSP/BIOS Textual Configuration (TConf) Tools.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm6747"]
    };

//evm6747

    config IProductTemplate.TemplateInfo clk_evm6747 = {
        title: "clk Example",
        fileList: [
            {path: "clk.c"},
            {path: "evm6747/clk.tcf"},
        ],
        description: "This example simply shows a statically recreated DSP/BIOS TSK object, task, using LOG_printf to print clock ticks. In this example, a task goes to sleep some number of ticks and prints the time after it wakes up.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm6747"]
    };

//evm6747

    config IProductTemplate.TemplateInfo hello_evm6747 = {
        title: "hello Example",
        fileList: [
            {path: "hello.c"},
            {path: "evm6747/hello.tcf"},
        ],
        description: "This example serves as a basic sanity check program for DSP/BIOS. It demonstrates how to print the string 'hello world!' to the DSP/BIOS message log. This example also introduces new users to DSP/BIOS by performing basic string output using a LOG object.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm6747"]
    };

//evm6747

    config IProductTemplate.TemplateInfo mailbox_evm6747 = {
        title: "mailbox Example",
        fileList: [
            {path: "mailbox.c"},
            {path: "evm6747/mailbox.tcf"},
        ],
        description: "This example uses a mailbox (from the MBX module of DSP/BIOS)to send messages from multiple writer tasks to a single reader task.  In this example, the mailbox, the reader task, and three writer tasks are created by the Configuration Tool.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm6747"]
    };

//evm6747

    config IProductTemplate.TemplateInfo semaphore_evm6747 = {
        title: "semaphore Example",
        fileList: [
            {path: "semaphore.c"},
            {path: "evm6747/semaphore.tcf"},
        ],
        description: "This is an example of using statically created DSP/BIOS objects, semaphore (SEM) and task (TSK) and dynamically created queue (QUE) objects. This example will show you how to use DSP/BIOS's QUE and SEM APIs to synchronize message sending among tasks.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm6747"]
    };

//evm6747

    config IProductTemplate.TemplateInfo stairstep_evm6747 = {
        title: "stairstep Example",
        fileList: [
            {path: "stairstep.c"},
            {path: "evm6747/stairstep.tcf"},
        ],
        description: "The purpose of this example is to illustrate the cpuload graph.  In cpuloadInit it gets the CPU frequency using an API and fills the loadValue array with load values corresponding to 25, 50, 75 and 98 percent cpuload. The loadPrd which has a small period calls AUDIO_load function with loadValue. The stepPrd which has a very long period changes the loadValue in a circular fashion.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm6747"]
    };

//evm6747

    config IProductTemplate.TemplateInfo swi_evm6747 = {
        title: "swi Example",
        fileList: [
            {path: "swi.c"},
            {path: "evm6747/swi.tcf"},
        ],
        description: "This example shows how a lower priority software interrupt (SWI) can interrupt itself by posting a higher priority software interrupt.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm6747"]
    };

//evm6747

    config IProductTemplate.TemplateInfo tsk_evm6747 = {
        title: "tsk Example",
        fileList: [
            {path: "tsk.c"},
            {path: "evm6747/tsk.tcf"},
        ],
        description: "This example shows the round robin scheduling scheme for tasks of equal priority.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm6747"]
    };

//evm6748

    config IProductTemplate.TemplateInfo bigtime_evm6748 = {
        title: "bigtime Example",
        fileList: [
            {path: "bigtime.cpp"},
            {path: "evm6748/bigtime.tcf"},
        ],
        description: "This is an example of using statically created DSP/BIOS objects, idle (IDL), period (PRD), and task (TSK), along with some C++ objects.  In this program, C++ is used to create a real-time clock/calendar.  The C++ class object, Clock, is driven by a variety of DSP/BIOS objects: two PRD objects, two TSK objects, and an IDL object, which are created through the DSP/BIOS Textual Configuration (TConf) Tools.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm6748"]
    };

//evm6748

    config IProductTemplate.TemplateInfo clk_evm6748 = {
        title: "clk Example",
        fileList: [
            {path: "clk.c"},
            {path: "evm6748/clk.tcf"},
        ],
        description: "This example simply shows a statically recreated DSP/BIOS TSK object, task, using LOG_printf to print clock ticks. In this example, a task goes to sleep some number of ticks and prints the time after it wakes up.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm6748"]
    };

//evm6748

    config IProductTemplate.TemplateInfo hello_evm6748 = {
        title: "hello Example",
        fileList: [
            {path: "hello.c"},
            {path: "evm6748/hello.tcf"},
        ],
        description: "This example serves as a basic sanity check program for DSP/BIOS. It demonstrates how to print the string 'hello world!' to the DSP/BIOS message log. This example also introduces new users to DSP/BIOS by performing basic string output using a LOG object.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm6748"]
    };

//evm6748

    config IProductTemplate.TemplateInfo mailbox_evm6748 = {
        title: "mailbox Example",
        fileList: [
            {path: "mailbox.c"},
            {path: "evm6748/mailbox.tcf"},
        ],
        description: "This example uses a mailbox (from the MBX module of DSP/BIOS)to send messages from multiple writer tasks to a single reader task.  In this example, the mailbox, the reader task, and three writer tasks are created by the Configuration Tool.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm6748"]
    };

//evm6748

    config IProductTemplate.TemplateInfo semaphore_evm6748 = {
        title: "semaphore Example",
        fileList: [
            {path: "semaphore.c"},
            {path: "evm6748/semaphore.tcf"},
        ],
        description: "This is an example of using statically created DSP/BIOS objects, semaphore (SEM) and task (TSK) and dynamically created queue (QUE) objects. This example will show you how to use DSP/BIOS's QUE and SEM APIs to synchronize message sending among tasks.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm6748"]
    };

//evm6748

    config IProductTemplate.TemplateInfo stairstep_evm6748 = {
        title: "stairstep Example",
        fileList: [
            {path: "stairstep.c"},
            {path: "evm6748/stairstep.tcf"},
        ],
        description: "The purpose of this example is to illustrate the cpuload graph.  In cpuloadInit it gets the CPU frequency using an API and fills the loadValue array with load values corresponding to 25, 50, 75 and 98 percent cpuload. The loadPrd which has a small period calls AUDIO_load function with loadValue. The stepPrd which has a very long period changes the loadValue in a circular fashion.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm6748"]
    };

//evm6748

    config IProductTemplate.TemplateInfo swi_evm6748 = {
        title: "swi Example",
        fileList: [
            {path: "swi.c"},
            {path: "evm6748/swi.tcf"},
        ],
        description: "This example shows how a lower priority software interrupt (SWI) can interrupt itself by posting a higher priority software interrupt.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm6748"]
    };

//evm6748

    config IProductTemplate.TemplateInfo tsk_evm6748 = {
        title: "tsk Example",
        fileList: [
            {path: "tsk.c"},
            {path: "evm6748/tsk.tcf"},
        ],
        description: "This example shows the round robin scheduling scheme for tasks of equal priority.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evm6748"]
    };

//evmDM6437

    config IProductTemplate.TemplateInfo bigtime_evmDM6437 = {
        title: "bigtime Example",
        fileList: [
            {path: "bigtime.cpp"},
            {path: "evmDM6437/bigtime.tcf"},
        ],
        description: "This is an example of using statically created DSP/BIOS objects, idle (IDL), period (PRD), and task (TSK), along with some C++ objects.  In this program, C++ is used to create a real-time clock/calendar.  The C++ class object, Clock, is driven by a variety of DSP/BIOS objects: two PRD objects, two TSK objects, and an IDL object, which are created through the DSP/BIOS Textual Configuration (TConf) Tools.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmDM6437"]
    };

//evmDM6437

    config IProductTemplate.TemplateInfo clk_evmDM6437 = {
        title: "clk Example",
        fileList: [
            {path: "clk.c"},
            {path: "evmDM6437/clk.tcf"},
        ],
        description: "This example simply shows a statically recreated DSP/BIOS TSK object, task, using LOG_printf to print clock ticks. In this example, a task goes to sleep some number of ticks and prints the time after it wakes up.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmDM6437"]
    };

//evmDM6437

    config IProductTemplate.TemplateInfo hello_evmDM6437 = {
        title: "hello Example",
        fileList: [
            {path: "hello.c"},
            {path: "evmDM6437/hello.tcf"},
        ],
        description: "This example serves as a basic sanity check program for DSP/BIOS. It demonstrates how to print the string 'hello world!' to the DSP/BIOS message log. This example also introduces new users to DSP/BIOS by performing basic string output using a LOG object.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmDM6437"]
    };

//evmDM6437

    config IProductTemplate.TemplateInfo mailbox_evmDM6437 = {
        title: "mailbox Example",
        fileList: [
            {path: "mailbox.c"},
            {path: "evmDM6437/mailbox.tcf"},
        ],
        description: "This example uses a mailbox (from the MBX module of DSP/BIOS)to send messages from multiple writer tasks to a single reader task.  In this example, the mailbox, the reader task, and three writer tasks are created by the Configuration Tool.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmDM6437"]
    };

//evmDM6437

    config IProductTemplate.TemplateInfo semaphore_evmDM6437 = {
        title: "semaphore Example",
        fileList: [
            {path: "semaphore.c"},
            {path: "evmDM6437/semaphore.tcf"},
        ],
        description: "This is an example of using statically created DSP/BIOS objects, semaphore (SEM) and task (TSK) and dynamically created queue (QUE) objects. This example will show you how to use DSP/BIOS's QUE and SEM APIs to synchronize message sending among tasks.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmDM6437"]
    };

//evmDM6437

    config IProductTemplate.TemplateInfo stairstep_evmDM6437 = {
        title: "stairstep Example",
        fileList: [
            {path: "stairstep.c"},
            {path: "evmDM6437/stairstep.tcf"},
        ],
        description: "The purpose of this example is to illustrate the cpuload graph.  In cpuloadInit it gets the CPU frequency using an API and fills the loadValue array with load values corresponding to 25, 50, 75 and 98 percent cpuload. The loadPrd which has a small period calls AUDIO_load function with loadValue. The stepPrd which has a very long period changes the loadValue in a circular fashion.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmDM6437"]
    };

//evmDM6437

    config IProductTemplate.TemplateInfo swi_evmDM6437 = {
        title: "swi Example",
        fileList: [
            {path: "swi.c"},
            {path: "evmDM6437/swi.tcf"},
        ],
        description: "This example shows how a lower priority software interrupt (SWI) can interrupt itself by posting a higher priority software interrupt.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmDM6437"]
    };

//evmDM6437

    config IProductTemplate.TemplateInfo tsk_evmDM6437 = {
        title: "tsk Example",
        fileList: [
            {path: "tsk.c"},
            {path: "evmDM6437/tsk.tcf"},
        ],
        description: "This example shows the round robin scheduling scheme for tasks of equal priority.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmDM6437"]
    };

//evmDM6446

    config IProductTemplate.TemplateInfo bigtime_evmDM6446 = {
        title: "bigtime Example",
        fileList: [
            {path: "bigtime.cpp"},
            {path: "evmDM6446/bigtime.tcf"},
        ],
        description: "This is an example of using statically created DSP/BIOS objects, idle (IDL), period (PRD), and task (TSK), along with some C++ objects.  In this program, C++ is used to create a real-time clock/calendar.  The C++ class object, Clock, is driven by a variety of DSP/BIOS objects: two PRD objects, two TSK objects, and an IDL object, which are created through the DSP/BIOS Textual Configuration (TConf) Tools.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmDM6446"]
    };

//evmDM6446

    config IProductTemplate.TemplateInfo clk_evmDM6446 = {
        title: "clk Example",
        fileList: [
            {path: "clk.c"},
            {path: "evmDM6446/clk.tcf"},
        ],
        description: "This example simply shows a statically recreated DSP/BIOS TSK object, task, using LOG_printf to print clock ticks. In this example, a task goes to sleep some number of ticks and prints the time after it wakes up.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmDM6446"]
    };

//evmDM6446

    config IProductTemplate.TemplateInfo hello_evmDM6446 = {
        title: "hello Example",
        fileList: [
            {path: "hello.c"},
            {path: "evmDM6446/hello.tcf"},
        ],
        description: "This example serves as a basic sanity check program for DSP/BIOS. It demonstrates how to print the string 'hello world!' to the DSP/BIOS message log. This example also introduces new users to DSP/BIOS by performing basic string output using a LOG object.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmDM6446"]
    };

//evmDM6446

    config IProductTemplate.TemplateInfo mailbox_evmDM6446 = {
        title: "mailbox Example",
        fileList: [
            {path: "mailbox.c"},
            {path: "evmDM6446/mailbox.tcf"},
        ],
        description: "This example uses a mailbox (from the MBX module of DSP/BIOS)to send messages from multiple writer tasks to a single reader task.  In this example, the mailbox, the reader task, and three writer tasks are created by the Configuration Tool.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmDM6446"]
    };

//evmDM6446

    config IProductTemplate.TemplateInfo semaphore_evmDM6446 = {
        title: "semaphore Example",
        fileList: [
            {path: "semaphore.c"},
            {path: "evmDM6446/semaphore.tcf"},
        ],
        description: "This is an example of using statically created DSP/BIOS objects, semaphore (SEM) and task (TSK) and dynamically created queue (QUE) objects. This example will show you how to use DSP/BIOS's QUE and SEM APIs to synchronize message sending among tasks.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmDM6446"]
    };

//evmDM6446

    config IProductTemplate.TemplateInfo stairstep_evmDM6446 = {
        title: "stairstep Example",
        fileList: [
            {path: "stairstep.c"},
            {path: "evmDM6446/stairstep.tcf"},
        ],
        description: "The purpose of this example is to illustrate the cpuload graph.  In cpuloadInit it gets the CPU frequency using an API and fills the loadValue array with load values corresponding to 25, 50, 75 and 98 percent cpuload. The loadPrd which has a small period calls AUDIO_load function with loadValue. The stepPrd which has a very long period changes the loadValue in a circular fashion.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmDM6446"]
    };

//evmDM6446

    config IProductTemplate.TemplateInfo swi_evmDM6446 = {
        title: "swi Example",
        fileList: [
            {path: "swi.c"},
            {path: "evmDM6446/swi.tcf"},
        ],
        description: "This example shows how a lower priority software interrupt (SWI) can interrupt itself by posting a higher priority software interrupt.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmDM6446"]
    };

//evmDM6446

    config IProductTemplate.TemplateInfo tsk_evmDM6446 = {
        title: "tsk Example",
        fileList: [
            {path: "tsk.c"},
            {path: "evmDM6446/tsk.tcf"},
        ],
        description: "This example shows the round robin scheduling scheme for tasks of equal priority.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmDM6446"]
    };

//evmDM6467

    config IProductTemplate.TemplateInfo bigtime_evmDM6467 = {
        title: "bigtime Example",
        fileList: [
            {path: "bigtime.cpp"},
            {path: "evmDM6467/bigtime.tcf"},
        ],
        description: "This is an example of using statically created DSP/BIOS objects, idle (IDL), period (PRD), and task (TSK), along with some C++ objects.  In this program, C++ is used to create a real-time clock/calendar.  The C++ class object, Clock, is driven by a variety of DSP/BIOS objects: two PRD objects, two TSK objects, and an IDL object, which are created through the DSP/BIOS Textual Configuration (TConf) Tools.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmDM6467"]
    };

//evmDM6467

    config IProductTemplate.TemplateInfo clk_evmDM6467 = {
        title: "clk Example",
        fileList: [
            {path: "clk.c"},
            {path: "evmDM6467/clk.tcf"},
        ],
        description: "This example simply shows a statically recreated DSP/BIOS TSK object, task, using LOG_printf to print clock ticks. In this example, a task goes to sleep some number of ticks and prints the time after it wakes up.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmDM6467"]
    };

//evmDM6467

    config IProductTemplate.TemplateInfo hello_evmDM6467 = {
        title: "hello Example",
        fileList: [
            {path: "hello.c"},
            {path: "evmDM6467/hello.tcf"},
        ],
        description: "This example serves as a basic sanity check program for DSP/BIOS. It demonstrates how to print the string 'hello world!' to the DSP/BIOS message log. This example also introduces new users to DSP/BIOS by performing basic string output using a LOG object.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmDM6467"]
    };

//evmDM6467

    config IProductTemplate.TemplateInfo mailbox_evmDM6467 = {
        title: "mailbox Example",
        fileList: [
            {path: "mailbox.c"},
            {path: "evmDM6467/mailbox.tcf"},
        ],
        description: "This example uses a mailbox (from the MBX module of DSP/BIOS)to send messages from multiple writer tasks to a single reader task.  In this example, the mailbox, the reader task, and three writer tasks are created by the Configuration Tool.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmDM6467"]
    };

//evmDM6467

    config IProductTemplate.TemplateInfo semaphore_evmDM6467 = {
        title: "semaphore Example",
        fileList: [
            {path: "semaphore.c"},
            {path: "evmDM6467/semaphore.tcf"},
        ],
        description: "This is an example of using statically created DSP/BIOS objects, semaphore (SEM) and task (TSK) and dynamically created queue (QUE) objects. This example will show you how to use DSP/BIOS's QUE and SEM APIs to synchronize message sending among tasks.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmDM6467"]
    };

//evmDM6467

    config IProductTemplate.TemplateInfo stairstep_evmDM6467 = {
        title: "stairstep Example",
        fileList: [
            {path: "stairstep.c"},
            {path: "evmDM6467/stairstep.tcf"},
        ],
        description: "The purpose of this example is to illustrate the cpuload graph.  In cpuloadInit it gets the CPU frequency using an API and fills the loadValue array with load values corresponding to 25, 50, 75 and 98 percent cpuload. The loadPrd which has a small period calls AUDIO_load function with loadValue. The stepPrd which has a very long period changes the loadValue in a circular fashion.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmDM6467"]
    };

//evmDM6467

    config IProductTemplate.TemplateInfo swi_evmDM6467 = {
        title: "swi Example",
        fileList: [
            {path: "swi.c"},
            {path: "evmDM6467/swi.tcf"},
        ],
        description: "This example shows how a lower priority software interrupt (SWI) can interrupt itself by posting a higher priority software interrupt.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmDM6467"]
    };

//evmDM6467

    config IProductTemplate.TemplateInfo tsk_evmDM6467 = {
        title: "tsk Example",
        fileList: [
            {path: "tsk.c"},
            {path: "evmDM6467/tsk.tcf"},
        ],
        description: "This example shows the round robin scheduling scheme for tasks of equal priority.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmDM6467"]
    };

//evmOMAPL137

    config IProductTemplate.TemplateInfo bigtime_evmOMAPL137 = {
        title: "bigtime Example",
        fileList: [
            {path: "bigtime.cpp"},
            {path: "evmOMAPL137/bigtime.tcf"},
        ],
        description: "This is an example of using statically created DSP/BIOS objects, idle (IDL), period (PRD), and task (TSK), along with some C++ objects.  In this program, C++ is used to create a real-time clock/calendar.  The C++ class object, Clock, is driven by a variety of DSP/BIOS objects: two PRD objects, two TSK objects, and an IDL object, which are created through the DSP/BIOS Textual Configuration (TConf) Tools.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmOMAPL137"]
    };

//evmOMAPL137

    config IProductTemplate.TemplateInfo clk_evmOMAPL137 = {
        title: "clk Example",
        fileList: [
            {path: "clk.c"},
            {path: "evmOMAPL137/clk.tcf"},
        ],
        description: "This example simply shows a statically recreated DSP/BIOS TSK object, task, using LOG_printf to print clock ticks. In this example, a task goes to sleep some number of ticks and prints the time after it wakes up.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmOMAPL137"]
    };

//evmOMAPL137

    config IProductTemplate.TemplateInfo hello_evmOMAPL137 = {
        title: "hello Example",
        fileList: [
            {path: "hello.c"},
            {path: "evmOMAPL137/hello.tcf"},
        ],
        description: "This example serves as a basic sanity check program for DSP/BIOS. It demonstrates how to print the string 'hello world!' to the DSP/BIOS message log. This example also introduces new users to DSP/BIOS by performing basic string output using a LOG object.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmOMAPL137"]
    };

//evmOMAPL137

    config IProductTemplate.TemplateInfo mailbox_evmOMAPL137 = {
        title: "mailbox Example",
        fileList: [
            {path: "mailbox.c"},
            {path: "evmOMAPL137/mailbox.tcf"},
        ],
        description: "This example uses a mailbox (from the MBX module of DSP/BIOS)to send messages from multiple writer tasks to a single reader task.  In this example, the mailbox, the reader task, and three writer tasks are created by the Configuration Tool.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmOMAPL137"]
    };

//evmOMAPL137

    config IProductTemplate.TemplateInfo semaphore_evmOMAPL137 = {
        title: "semaphore Example",
        fileList: [
            {path: "semaphore.c"},
            {path: "evmOMAPL137/semaphore.tcf"},
        ],
        description: "This is an example of using statically created DSP/BIOS objects, semaphore (SEM) and task (TSK) and dynamically created queue (QUE) objects. This example will show you how to use DSP/BIOS's QUE and SEM APIs to synchronize message sending among tasks.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmOMAPL137"]
    };

//evmOMAPL137

    config IProductTemplate.TemplateInfo stairstep_evmOMAPL137 = {
        title: "stairstep Example",
        fileList: [
            {path: "stairstep.c"},
            {path: "evmOMAPL137/stairstep.tcf"},
        ],
        description: "The purpose of this example is to illustrate the cpuload graph.  In cpuloadInit it gets the CPU frequency using an API and fills the loadValue array with load values corresponding to 25, 50, 75 and 98 percent cpuload. The loadPrd which has a small period calls AUDIO_load function with loadValue. The stepPrd which has a very long period changes the loadValue in a circular fashion.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmOMAPL137"]
    };

//evmOMAPL137

    config IProductTemplate.TemplateInfo swi_evmOMAPL137 = {
        title: "swi Example",
        fileList: [
            {path: "swi.c"},
            {path: "evmOMAPL137/swi.tcf"},
        ],
        description: "This example shows how a lower priority software interrupt (SWI) can interrupt itself by posting a higher priority software interrupt.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmOMAPL137"]
    };

//evmOMAPL137

    config IProductTemplate.TemplateInfo tsk_evmOMAPL137 = {
        title: "tsk Example",
        fileList: [
            {path: "tsk.c"},
            {path: "evmOMAPL137/tsk.tcf"},
        ],
        description: "This example shows the round robin scheduling scheme for tasks of equal priority.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmOMAPL137"]
    };

//evmOMAPL138

    config IProductTemplate.TemplateInfo bigtime_evmOMAPL138 = {
        title: "bigtime Example",
        fileList: [
            {path: "bigtime.cpp"},
            {path: "evmOMAPL138/bigtime.tcf"},
        ],
        description: "This is an example of using statically created DSP/BIOS objects, idle (IDL), period (PRD), and task (TSK), along with some C++ objects.  In this program, C++ is used to create a real-time clock/calendar.  The C++ class object, Clock, is driven by a variety of DSP/BIOS objects: two PRD objects, two TSK objects, and an IDL object, which are created through the DSP/BIOS Textual Configuration (TConf) Tools.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmOMAPL138"]
    };

//evmOMAPL138

    config IProductTemplate.TemplateInfo clk_evmOMAPL138 = {
        title: "clk Example",
        fileList: [
            {path: "clk.c"},
            {path: "evmOMAPL138/clk.tcf"},
        ],
        description: "This example simply shows a statically recreated DSP/BIOS TSK object, task, using LOG_printf to print clock ticks. In this example, a task goes to sleep some number of ticks and prints the time after it wakes up.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmOMAPL138"]
    };

//evmOMAPL138

    config IProductTemplate.TemplateInfo hello_evmOMAPL138 = {
        title: "hello Example",
        fileList: [
            {path: "hello.c"},
            {path: "evmOMAPL138/hello.tcf"},
        ],
        description: "This example serves as a basic sanity check program for DSP/BIOS. It demonstrates how to print the string 'hello world!' to the DSP/BIOS message log. This example also introduces new users to DSP/BIOS by performing basic string output using a LOG object.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmOMAPL138"]
    };

//evmOMAPL138

    config IProductTemplate.TemplateInfo mailbox_evmOMAPL138 = {
        title: "mailbox Example",
        fileList: [
            {path: "mailbox.c"},
            {path: "evmOMAPL138/mailbox.tcf"},
        ],
        description: "This example uses a mailbox (from the MBX module of DSP/BIOS)to send messages from multiple writer tasks to a single reader task.  In this example, the mailbox, the reader task, and three writer tasks are created by the Configuration Tool.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmOMAPL138"]
    };

//evmOMAPL138

    config IProductTemplate.TemplateInfo semaphore_evmOMAPL138 = {
        title: "semaphore Example",
        fileList: [
            {path: "semaphore.c"},
            {path: "evmOMAPL138/semaphore.tcf"},
        ],
        description: "This is an example of using statically created DSP/BIOS objects, semaphore (SEM) and task (TSK) and dynamically created queue (QUE) objects. This example will show you how to use DSP/BIOS's QUE and SEM APIs to synchronize message sending among tasks.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmOMAPL138"]
    };

//evmOMAPL138

    config IProductTemplate.TemplateInfo stairstep_evmOMAPL138 = {
        title: "stairstep Example",
        fileList: [
            {path: "stairstep.c"},
            {path: "evmOMAPL138/stairstep.tcf"},
        ],
        description: "The purpose of this example is to illustrate the cpuload graph.  In cpuloadInit it gets the CPU frequency using an API and fills the loadValue array with load values corresponding to 25, 50, 75 and 98 percent cpuload. The loadPrd which has a small period calls AUDIO_load function with loadValue. The stepPrd which has a very long period changes the loadValue in a circular fashion.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmOMAPL138"]
    };

//evmOMAPL138

    config IProductTemplate.TemplateInfo swi_evmOMAPL138 = {
        title: "swi Example",
        fileList: [
            {path: "swi.c"},
            {path: "evmOMAPL138/swi.tcf"},
        ],
        description: "This example shows how a lower priority software interrupt (SWI) can interrupt itself by posting a higher priority software interrupt.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmOMAPL138"]
    };

//evmOMAPL138

    config IProductTemplate.TemplateInfo tsk_evmOMAPL138 = {
        title: "tsk Example",
        fileList: [
            {path: "tsk.c"},
            {path: "evmOMAPL138/tsk.tcf"},
        ],
        description: "This example shows the round robin scheduling scheme for tasks of equal priority.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.evmOMAPL138"]
    };

//padk6727

    config IProductTemplate.TemplateInfo bigtime_padk6727 = {
        title: "bigtime Example",
        fileList: [
            {path: "bigtime.cpp"},
            {path: "padk6727/bigtime.tcf"},
        ],
        description: "This is an example of using statically created DSP/BIOS objects, idle (IDL), period (PRD), and task (TSK), along with some C++ objects.  In this program, C++ is used to create a real-time clock/calendar.  The C++ class object, Clock, is driven by a variety of DSP/BIOS objects: two PRD objects, two TSK objects, and an IDL object, which are created through the DSP/BIOS Textual Configuration (TConf) Tools.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.padk6727"]
    };

//padk6727

    config IProductTemplate.TemplateInfo clk_padk6727 = {
        title: "clk Example",
        fileList: [
            {path: "clk.c"},
            {path: "padk6727/clk.tcf"},
        ],
        description: "This example simply shows a statically recreated DSP/BIOS TSK object, task, using LOG_printf to print clock ticks. In this example, a task goes to sleep some number of ticks and prints the time after it wakes up.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.padk6727"]
    };

//padk6727

    config IProductTemplate.TemplateInfo hello_padk6727 = {
        title: "hello Example",
        fileList: [
            {path: "hello.c"},
            {path: "padk6727/hello.tcf"},
        ],
        description: "This example serves as a basic sanity check program for DSP/BIOS. It demonstrates how to print the string 'hello world!' to the DSP/BIOS message log. This example also introduces new users to DSP/BIOS by performing basic string output using a LOG object.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.padk6727"]
    };

//padk6727

    config IProductTemplate.TemplateInfo mailbox_padk6727 = {
        title: "mailbox Example",
        fileList: [
            {path: "mailbox.c"},
            {path: "padk6727/mailbox.tcf"},
        ],
        description: "This example uses a mailbox (from the MBX module of DSP/BIOS)to send messages from multiple writer tasks to a single reader task.  In this example, the mailbox, the reader task, and three writer tasks are created by the Configuration Tool.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.padk6727"]
    };

//padk6727

    config IProductTemplate.TemplateInfo semaphore_padk6727 = {
        title: "semaphore Example",
        fileList: [
            {path: "semaphore.c"},
            {path: "padk6727/semaphore.tcf"},
        ],
        description: "This is an example of using statically created DSP/BIOS objects, semaphore (SEM) and task (TSK) and dynamically created queue (QUE) objects. This example will show you how to use DSP/BIOS's QUE and SEM APIs to synchronize message sending among tasks.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.padk6727"]
    };

//padk6727

    config IProductTemplate.TemplateInfo stairstep_padk6727 = {
        title: "stairstep Example",
        fileList: [
            {path: "stairstep.c"},
            {path: "padk6727/stairstep.tcf"},
        ],
        description: "The purpose of this example is to illustrate the cpuload graph.  In cpuloadInit it gets the CPU frequency using an API and fills the loadValue array with load values corresponding to 25, 50, 75 and 98 percent cpuload. The loadPrd which has a small period calls AUDIO_load function with loadValue. The stepPrd which has a very long period changes the loadValue in a circular fashion.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.padk6727"]
    };

//padk6727

    config IProductTemplate.TemplateInfo swi_padk6727 = {
        title: "swi Example",
        fileList: [
            {path: "swi.c"},
            {path: "padk6727/swi.tcf"},
        ],
        description: "This example shows how a lower priority software interrupt (SWI) can interrupt itself by posting a higher priority software interrupt.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.padk6727"]
    };

//padk6727

    config IProductTemplate.TemplateInfo tsk_padk6727 = {
        title: "tsk Example",
        fileList: [
            {path: "tsk.c"},
            {path: "padk6727/tsk.tcf"},
        ],
        description: "This example shows the round robin scheduling scheme for tasks of equal priority.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.padk6727"]
    };

//sim6416

    config IProductTemplate.TemplateInfo bigtime_sim6416 = {
        title: "bigtime Example",
        fileList: [
            {path: "bigtime.cpp"},
            {path: "sim6416/bigtime.tcf"},
        ],
        description: "This is an example of using statically created DSP/BIOS objects, idle (IDL), period (PRD), and task (TSK), along with some C++ objects.  In this program, C++ is used to create a real-time clock/calendar.  The C++ class object, Clock, is driven by a variety of DSP/BIOS objects: two PRD objects, two TSK objects, and an IDL object, which are created through the DSP/BIOS Textual Configuration (TConf) Tools.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.sim6416"]
    };

//sim6416

    config IProductTemplate.TemplateInfo clk_sim6416 = {
        title: "clk Example",
        fileList: [
            {path: "clk.c"},
            {path: "sim6416/clk.tcf"},
        ],
        description: "This example simply shows a statically recreated DSP/BIOS TSK object, task, using LOG_printf to print clock ticks. In this example, a task goes to sleep some number of ticks and prints the time after it wakes up.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.sim6416"]
    };

//sim6416

    config IProductTemplate.TemplateInfo hello_sim6416 = {
        title: "hello Example",
        fileList: [
            {path: "hello.c"},
            {path: "sim6416/hello.tcf"},
        ],
        description: "This example serves as a basic sanity check program for DSP/BIOS. It demonstrates how to print the string 'hello world!' to the DSP/BIOS message log. This example also introduces new users to DSP/BIOS by performing basic string output using a LOG object.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.sim6416"]
    };

//sim6416

    config IProductTemplate.TemplateInfo mailbox_sim6416 = {
        title: "mailbox Example",
        fileList: [
            {path: "mailbox.c"},
            {path: "sim6416/mailbox.tcf"},
        ],
        description: "This example uses a mailbox (from the MBX module of DSP/BIOS)to send messages from multiple writer tasks to a single reader task.  In this example, the mailbox, the reader task, and three writer tasks are created by the Configuration Tool.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.sim6416"]
    };

//sim6416

    config IProductTemplate.TemplateInfo semaphore_sim6416 = {
        title: "semaphore Example",
        fileList: [
            {path: "semaphore.c"},
            {path: "sim6416/semaphore.tcf"},
        ],
        description: "This is an example of using statically created DSP/BIOS objects, semaphore (SEM) and task (TSK) and dynamically created queue (QUE) objects. This example will show you how to use DSP/BIOS's QUE and SEM APIs to synchronize message sending among tasks.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.sim6416"]
    };

//sim6416

    config IProductTemplate.TemplateInfo stairstep_sim6416 = {
        title: "stairstep Example",
        fileList: [
            {path: "stairstep.c"},
            {path: "sim6416/stairstep.tcf"},
        ],
        description: "The purpose of this example is to illustrate the cpuload graph.  In cpuloadInit it gets the CPU frequency using an API and fills the loadValue array with load values corresponding to 25, 50, 75 and 98 percent cpuload. The loadPrd which has a small period calls AUDIO_load function with loadValue. The stepPrd which has a very long period changes the loadValue in a circular fashion.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.sim6416"]
    };

//sim6416

    config IProductTemplate.TemplateInfo swi_sim6416 = {
        title: "swi Example",
        fileList: [
            {path: "swi.c"},
            {path: "sim6416/swi.tcf"},
        ],
        description: "This example shows how a lower priority software interrupt (SWI) can interrupt itself by posting a higher priority software interrupt.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.sim6416"]
    };

//sim6416

    config IProductTemplate.TemplateInfo tsk_sim6416 = {
        title: "tsk Example",
        fileList: [
            {path: "tsk.c"},
            {path: "sim6416/tsk.tcf"},
        ],
        description: "This example shows the round robin scheduling scheme for tasks of equal priority.",
        filterArr:[
            {deviceFamily:"C6000",toolChain:"TI"},
        ],
        legacyTcf:true,
        groups:["ti.bios.examples.root.sim6416"]
    };
    override config IProductTemplate.TemplateInfo templateArr [] = [ empty, 
	bigtime_ezdsp2812,
	clk_ezdsp2812,
	hello_ezdsp2812,
	mailbox_ezdsp2812,
	semaphore_ezdsp2812,
	stairstep_ezdsp2812,
	swi_ezdsp2812,
	tsk_ezdsp2812,
	bigtime_ezdsp28335,
	clk_ezdsp28335,
	hello_ezdsp28335,
	mailbox_ezdsp28335,
	semaphore_ezdsp28335,
	stairstep_ezdsp28335,
	swi_ezdsp28335,
	tsk_ezdsp28335,
	bigtime_evm5505,
	clk_evm5505,
	hello_evm5505,
	mailbox_evm5505,
	semaphore_evm5505,
	stairstep_evm5505,
	swi_evm5505,
	tsk_evm5505,
	bigtime_evm5515,
	clk_evm5515,
	hello_evm5515,
	mailbox_evm5515,
	semaphore_evm5515,
	stairstep_evm5515,
	swi_evm5515,
	tsk_evm5515,
	bigtime_dsk5510,
	clk_dsk5510,
	hello_dsk5510,
	mailbox_dsk5510,
	semaphore_dsk5510,
	stairstep_dsk5510,
	swi_dsk5510,
	tsk_dsk5510,
	bigtime_dsk6416,
	clk_dsk6416,
	hello_dsk6416,
	mailbox_dsk6416,
	semaphore_dsk6416,
	stairstep_dsk6416,
	swi_dsk6416,
	tsk_dsk6416,
	bigtime_dsk6455,
	clk_dsk6455,
	hello_dsk6455,
	mailbox_dsk6455,
	semaphore_dsk6455,
	stairstep_dsk6455,
	swi_dsk6455,
	tsk_dsk6455,
	bigtime_evm6424,
	clk_evm6424,
	hello_evm6424,
	mailbox_evm6424,
	semaphore_evm6424,
	stairstep_evm6424,
	swi_evm6424,
	tsk_evm6424,
	bigtime_evm6474,
	clk_evm6474,
	hello_evm6474,
	mailbox_evm6474,
	semaphore_evm6474,
	stairstep_evm6474,
	swi_evm6474,
	tsk_evm6474,
	bigtime_evm6747,
	clk_evm6747,
	hello_evm6747,
	mailbox_evm6747,
	semaphore_evm6747,
	stairstep_evm6747,
	swi_evm6747,
	tsk_evm6747,
	bigtime_evm6748,
	clk_evm6748,
	hello_evm6748,
	mailbox_evm6748,
	semaphore_evm6748,
	stairstep_evm6748,
	swi_evm6748,
	tsk_evm6748,
	bigtime_evmDM6437,
	clk_evmDM6437,
	hello_evmDM6437,
	mailbox_evmDM6437,
	semaphore_evmDM6437,
	stairstep_evmDM6437,
	swi_evmDM6437,
	tsk_evmDM6437,
	bigtime_evmDM6446,
	clk_evmDM6446,
	hello_evmDM6446,
	mailbox_evmDM6446,
	semaphore_evmDM6446,
	stairstep_evmDM6446,
	swi_evmDM6446,
	tsk_evmDM6446,
	bigtime_evmDM6467,
	clk_evmDM6467,
	hello_evmDM6467,
	mailbox_evmDM6467,
	semaphore_evmDM6467,
	stairstep_evmDM6467,
	swi_evmDM6467,
	tsk_evmDM6467,
	bigtime_evmOMAPL137,
	clk_evmOMAPL137,
	hello_evmOMAPL137,
	mailbox_evmOMAPL137,
	semaphore_evmOMAPL137,
	stairstep_evmOMAPL137,
	swi_evmOMAPL137,
	tsk_evmOMAPL137,
	bigtime_evmOMAPL138,
	clk_evmOMAPL138,
	hello_evmOMAPL138,
	mailbox_evmOMAPL138,
	semaphore_evmOMAPL138,
	stairstep_evmOMAPL138,
	swi_evmOMAPL138,
	tsk_evmOMAPL138,
	bigtime_padk6727,
	clk_padk6727,
	hello_padk6727,
	mailbox_padk6727,
	semaphore_padk6727,
	stairstep_padk6727,
	swi_padk6727,
	tsk_padk6727,
	bigtime_sim6416,
	clk_sim6416,
	hello_sim6416,
	mailbox_sim6416,
	semaphore_sim6416,
	stairstep_sim6416,
	swi_sim6416,
	tsk_sim6416,
	]; 
}
