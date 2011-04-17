#ifndef ti_catalog_msp430_peripherals_clock_clock_h
#define ti_catalog_msp430_peripherals_clock_clock_h

#include <xdc/std.h>

typedef volatile struct ti_catalog_msp430_peripherals_clock_ClockRegs {
    UInt UCSCTL0; 	/* 0x00 UCS control 0 */
    UInt UCSCTL1; 	/* 0x02 UCS control 1 */
    UInt UCSCTL2; 	/* 0x04 UCS control 2 */
    UInt UCSCTL3; 	/* 0x06 UCS control 3 */
    UInt UCSCTL4; 	/* 0x08 UCS control 4 */
    UInt UCSCTL5; 	/* 0x0A UCS control 5 */
    UInt UCSCTL6; 	/* 0x0C UCS control 6 */
    UInt UCSCTL7; 	/* 0x0E UCS control 7 */
    UInt UCSCTL8; 	/* 0x10 UCS control 8 */
} ti_catalog_msp430_peripherals_clock_ClockRegs;

#endif
