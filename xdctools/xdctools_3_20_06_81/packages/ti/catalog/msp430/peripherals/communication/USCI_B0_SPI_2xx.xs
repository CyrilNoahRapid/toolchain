/*
 *  ======== module$meta$init ========
 */
function module$meta$init() 
{
}

/*
 *  ======== instance$meta$init ========
 */
function instance$meta$init(clock , interruptEnableRegister2) 
{
    this.clock = clock;
    this.interruptEnableRegister2 = interruptEnableRegister2;
}

function setUCTXIE(set)
{
  	this.interruptEnableRegister2.setUCB0TXIE(set);
}

function getUCTXIE()
{
    return this.interruptEnableRegister2.getUCB0TXIE();
}

function setUCRXIE(set)
{
  	this.interruptEnableRegister2.setUCB0RXIE(set);
}

function getUCRXIE()
{
    return this.interruptEnableRegister2.getUCB0RXIE();
}