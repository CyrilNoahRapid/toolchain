var USCI;
var GetSet;

/*
 *  ======== module$meta$init ========
 */
function module$meta$init() 
{
    USCI = this;
    GetSet = xdc.module("xdc.services.getset.GetSet");
}

/*
 *  ======== instance$meta$init ========
 */
function instance$meta$init(clock , interruptEnableRegister2) 
{
    this.clock = clock;
    this.interruptEnableRegister2 = interruptEnableRegister2;
}

/*
 *  ======== getInputClockHz ========
 */
function getInputClockHz()
{
    var clockSource = (this.CTL1 & USCI.UCSSELx) / USCI.UCSSEL0;
    switch (clockSource) {
        case 0:
            return this.UCLKHz;
        case 1:
            return this.clock.ACLKHz;
        case 2:
        case 3:
            return this.clock.SMCLKHz;
    }

    return 0;
}

/*
 *  ======== setBaudRateHz ========
 */
function setBaudRateHz(baudRateHz)
{
    var inputClockHz = this.getInputClockHz();
    var prescaler = inputClockHz / baudRateHz;
    var OS16 = this.MCTL & USCI.UCOS16;

    if (OS16) {
        prescaler *= 16;
        prescaler = Math.round(prescaler*16)/16;
    }
    else {
        prescaler = Math.round(prescaler*8)/8;
    }

    /* set the integer part of the divider */
    var BR = Math.floor(prescaler);
    this.BR1 = BR / 256;
    this.BR0 = BR - this.BR1 * 256;

    /* set the fractional part */
    if (OS16) {
        var BRF = (prescaler - BR)*16;
        this.MCTL &= ~USCI.UCBRFx;
        this.MCTL |= BRF * USCI.UCBRF0;
    }
    else {
        var BRS = (prescaler - BR)*8;
        this.MCTL &= ~USCI.UCBRSx;
        this.MCTL |= BRS * USCI.UCBRS0;
    }

    /* calculate the actual value */
    return getOutputClockHz();
}

/*
 *  ======== getBaudRateHz ========
 */
function getBaudRateHz()
{
    var OS16 = this.MCTL & USCI.UCOS16;
    var BR = this.BR0 + this.BR1 * 256;
    var BRF = (this.MCTL & USCI.UCBRFx) / USCI.UCBRF0;
    var BRS = (this.MCTL & USCI.UCBRSx) / USCI.UCBRS0;

    if (OS16) {
        var prescaler = (16 + BRS/8)*BR + BRF/16;
    }
    else {
        var prescaler = BR + BRS/8;
    }

    return getInputClockHz() / prescaler;
}
