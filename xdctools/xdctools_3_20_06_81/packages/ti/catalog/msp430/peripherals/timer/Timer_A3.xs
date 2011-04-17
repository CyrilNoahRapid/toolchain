/*
 *  ======== getNumberOfTimers ========
 */
function getNumberOfTimers()
{
    return 3;
}

function _calculateTimerOut(Timer_Ax , timerBlock)
{
    var TimerA3 = Timer_Ax.$module;
    var CCRx;
    var TACCTLx;
    var calculatedTimerOut = 0;
    
    if (Timer_Ax.TACTL.MC != TimerA3.MC_0) {
        /* Configure common variables */
        switch(timerBlock) {
            case 0:
                CCRx = Timer_Ax.TACCR0;
                TACCTLx = Timer_Ax.TACCTL0;
                break;
            case 1:
                CCRx = Timer_Ax.TACCR1;
                TACCTLx = Timer_Ax.TACCTL1;
                break;
            case 2:
                CCRx = Timer_Ax.TACCR2;
                TACCTLx = Timer_Ax.TACCTL2;
                break;
        }
    
        /* Get clock frequency */
        var timerClock = 0;
        var inputFrequency = 0;
        var divider = 1;
        
        switch (Timer_Ax.TACTL.TASSEL) {
            case TimerA3.TASSEL_0:
                inputFrequency = Timer_Ax.TACLK;
                break;
            case TimerA3.TASSEL_1:
                inputFrequency = Timer_Ax.clock.ACLKHz;
                break;
            case TimerA3.TASSEL_2:
                inputFrequency = Timer_Ax.clock.SMCLKHz;
                break;
            case TimerA3.TASSEL_3:
                inputFrequency = Timer_Ax.INCLK;
                break;
        }
        
        print("inputFrequency = " + inputFrequency);
        
        switch (Timer_Ax.TACTL.ID) {
            case TimerA3.ID_0:
                divider = 1;
                break;
            case TimerA3.ID_1:
                divider = 2;
                break;
            case TimerA3.ID_2:
                divider = 4;
                break;
            case TimerA3.ID_3:
                divider = 8;
                break;
        }
        
        if (inputFrequency != 0) {
            timerClock = 1 / (inputFrequency/divider);
        }
        else {
            timerClock = 0;
        }
    
        print("timerClock = " + timerClock);
        
        calculatedTimerOut = (CCRx - 1) * timerClock;
        if (calculatedTimerOut > 0) {
            calculatedTimerOut = 1 / calculatedTimerOut;
        }
        else {
            calculatedTimerOut = 0;
        }
    
        // Get output mode type
        switch (TACCTLx.OUTMOD) {
            case TimerA3.OUTMOD_0:
                calculatedTimerOut = 0;
                break;
            case TimerA3.OUTMOD_1:
                calculatedTimerOut = 0;
                break;
            case TimerA3.OUTMOD_2:
                break;
            case TimerA3.OUTMOD_3:
                break;
            case TimerA3.OUTMOD_4:
                calculatedTimerOut = calculatedTimerOut * 2;
                break;
            case TimerA3.OUTMOD_5:
                calculatedTimerOut = 0;
                break;
            case TimerA3.OUTMOD_6:
                break;
            case TimerA3.OUTMOD_7:
                break;
        }
    }
    print("calculatedTimerOut = " + calculatedTimerOut);
    
    /* Calculate frequency */
    return calculatedTimerOut;
}

/*
 *  ======== getTimer_A_OUT ========
 */
function getTimer_A_OUT(channel) 
{
    return _calculateTimerOut(this , channel);
}
