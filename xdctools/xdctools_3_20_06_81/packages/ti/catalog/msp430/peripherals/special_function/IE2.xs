/*
 *  ======== instance$meta$init ========
 */
function instance$meta$init() 
{
}

/*
 *  ======== module$meta$init ========
 */
function module$meta$init() 
{
}

/*
 *  ======== getUCB0TXIE ========
 */
function getUCB0TXIE() 
{
    var REGS = this.$module;
    if(this.IE2.UCB0TXIE == REGS.UCB0TXIE)
    {
        return true;
    }
    else
    {
        return false;
    }
}

/*
 *  ======== setUCB0TXIE ========
 */
function setUCB0TXIE(set) 
{
    var REGS = this.$module;
    
    if(set)
    {
        this.IE2.UCB0TXIE = REGS.UCB0TXIE;
    }
    else
    {
        this.IE2.UCB0TXIE = REGS.UCB0TXIE_OFF;
    }
    
    return set;
}

/*
 *  ======== getUCB0RXIE ========
 */
function getUCB0RXIE() 
{
    var REGS = this.$module;
    if(this.IE2.UCB0RXIE == REGS.UCB0RXIE)
    {
        return true;
    }
    else
    {
        return false;
    }
}

/*
 *  ======== setUCB0RXIE ========
 */
function setUCB0RXIE(set) 
{
    var REGS = this.$module;
    
    if(set)
    {
        this.IE2.UCB0RXIE = REGS.UCB0RXIE;
    }
    else
    {
        this.IE2.UCB0RXIE = REGS.UCB0RXIE_OFF;
    }
    
    return set;
}

/*
 *  ======== getUCA0TXIE ========
 */
function getUCA0TXIE() 
{
	print("executing getUCA0TXIE() inside IE2");
    var REGS = this.$module;
    if(this.IE2.UCA0TXIE == REGS.UCA0TXIE)
    {
        return true;
    }
    else
    {
        return false;
    }
}

/*
 *  ======== setUCA0TXIE ========
 */
function setUCA0TXIE(set) 
{
	print("executing setUCA0TXIE() inside IE2");

    var REGS = this.$module;
    
    if(set)
    {
        this.IE2.UCA0TXIE = REGS.UCA0TXIE;
    }
    else
    {
        this.IE2.UCA0TXIE = REGS.UCA0TXIE_OFF;
    }
    
    return set;
}

/*
 *  ======== getUCA0RXIE ========
 */
function getUCA0RXIE() 
{
    var REGS = this.$module;
    if(this.IE2.UCA0RXIE == REGS.UCA0RXIE)
    {
        return true;
    }
    else
    {
        return false;
    }
}

/*
 *  ======== setUCB0TXIE ========
 */
function setUCA0RXIE(set) 
{
	print("executing setUCA0TXIE() inside IE2 = " + set);
    var REGS = this.$module;
    
    if(set)
    {
        this.IE2.UCA0RXIE = REGS.UCA0RXIE;
    }
    else
    {
        this.IE2.UCA0RXIE = REGS.UCA0RXIE_OFF;
    }
    
    return set;
}
