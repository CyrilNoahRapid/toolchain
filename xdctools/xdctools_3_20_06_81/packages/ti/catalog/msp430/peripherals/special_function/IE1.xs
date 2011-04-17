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
 *  ======== getWDTIE ========
 */
function getWDTIE() 
{
    var REGS = this.$module;
    if(this.IE1.WDTIE == REGS.WDTIE)
    {
        return true;
    }
    else
    {
        return false;
    }
}

/*
 *  ======== setWDTIE ========
 */
function setWDTIE(set) 
{
    var REGS = this.$module;
    
    if(set)
    {
        this.IE1.WDTIE = REGS.WDTIE;
    }
    else
    {
        this.IE1.WDTIE = REGS.WDTIE_OFF;
    }
    
    return set;
}

/*
 *  ======== getOFIE ========
 */
function getOFIE() 
{
    var REGS = this.$module;
    if(this.IE1.OFIE == REGS.OFIE)
    {
        return true;
    }
    else
    {
        return false;
    }
}

/*
 *  ======== setOFIE ========
 */
function setOFIE(set) 
{
    var REGS = this.$module;
    
    if(set)
    {
        this.IE1.OFIE = REGS.OFIE;
    }
    else
    {
        this.IE1.OFIE = REGS.OFIE_OFF;
    }
    
    return set;
}

/*
 *  ======== getNMIE ========
 */
function getNMIE() 
{
    var REGS = this.$module;
    if(this.IE1.NMIE == REGS.NMIE)
    {
        return true;
    }
    else
    {
        return false;
    }
}

/*
 *  ======== setNMIE ========
 */
function setNMIE(set) 
{
    var REGS = this.$module;
    
    if(set)
    {
        this.IE1.NMIE = REGS.NMIE;
    }
    else
    {
        this.IE1.NMIE = REGS.NMIE_OFF;
    }
    
    return set;
}
