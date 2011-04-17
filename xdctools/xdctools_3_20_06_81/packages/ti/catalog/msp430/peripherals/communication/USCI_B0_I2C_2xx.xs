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

function setUCNACKIE(set)
{
    print("executing setUCNACKIE() = " + set);

    var REGS = this.$module;
    if(set)
    {
        this.USCI_B0_I2C_2xx.UCB0I2CIE.UCNACKIE = REGS.UCNACKIE;
    }
    else
    {
        this.USCI_B0_I2C_2xx.UCB0I2CIE.UCNACKIE = REGS.UCNACKIE_OFF;
    }
    return set;
}

function getUCNACKIE()
{
    var REGS = this.$module;
    if(this.USCI_B0_I2C_2xx.UCB0I2CIE.UCNACKIE == REGS.UCNACKIE)
    {
        return true;
    }
    else
    {
        return false;
    }
}

function setUCSTPIE(set)
{
    print("executing setUCSTPIE() = " + set);

    var REGS = this.$module;
    if(set)
    {
        this.USCI_B0_I2C_2xx.UCB0I2CIE.UCSTPIE = REGS.UCSTPIE;
    }
    else
    {
        this.USCI_B0_I2C_2xx.UCB0I2CIE.UCSTPIE = REGS.UCSTPIE_OFF;
    }
    return set;
}

function getUCSTPIE()
{
    var REGS = this.$module;
    if(this.USCI_B0_I2C_2xx.UCB0I2CIE.UCSTPIE == REGS.UCSTPIE)
    {
        return true;
    }
    else
    {
        return false;
    }
}
    
function setUCSTTIE(set)
{
    print("executing setUCSTTIE() = " + set);

    var REGS = this.$module;
    if(set)
    {
        this.USCI_B0_I2C_2xx.UCB0I2CIE.UCSTTIE = REGS.UCSTTIE;
    }
    else
    {
        this.USCI_B0_I2C_2xx.UCB0I2CIE.UCSTTIE = REGS.UCSTTIE_OFF;
    }
    return set;
}

function getUCSTTIE()
{
    var REGS = this.$module;
    if(this.USCI_B0_I2C_2xx.UCB0I2CIE.UCSTTIE == REGS.UCSTTIE)
    {
        return true;
    }
    else
    {
        return false;
    }
}
    
function setUCALIE(set)
{
    print("executing setUCALIE() = " + set);

    var REGS = this.$module;
    if(set)
    {
        this.USCI_B0_I2C_2xx.UCB0I2CIE.UCALIE = REGS.UCALIE;
    }
    else
    {
        this.USCI_B0_I2C_2xx.UCB0I2CIE.UCALIE = REGS.UCALIE_OFF;
    }
    return set;
}

function getUCALIE()
{
    var REGS = this.$module;
    if(this.USCI_B0_I2C_2xx.UCB0I2CIE.UCALIE == REGS.UCALIE)
    {
        return true;
    }
    else
    {
        return false;
    }
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