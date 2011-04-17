#ifndef ti_catalog_msp430_peripherals_timers_timer_h
#define ti_catalog_msp430_peripherals_timers_timer_h

#include <xdc/std.h>
/* timer register structure (common offsets for type A and B) */ 
typedef volatile struct ti_catalog_msp430_peripherals_timers_TimerRegs {
    UInt control;
    UInt cctl_0;
    UInt cctl_1;
    UInt cctl_2;
    UInt cctl_3;
    UInt cctl_4;
    UInt cctl_5;
    UInt cctl_6;
    UInt count;
    UInt cc_compare_0;
    UInt cc_compare_1;
    UInt cc_compare_2;
    UInt cc_compare_3;
    UInt cc_compare_4;
    UInt cc_compare_5;
    UInt cc_compare_6;
    UInt vector;
    UInt extension;
} ti_catalog_msp430_peripherals_timers_TimerRegs;

#endif
