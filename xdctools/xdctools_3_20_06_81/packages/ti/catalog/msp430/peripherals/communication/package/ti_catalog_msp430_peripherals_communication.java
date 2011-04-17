/*
 *  Do not modify this file; it is automatically 
 *  generated and any modifications will be overwritten.
 *
 * @(#) xdc-v49
 */
import java.util.*;
import org.mozilla.javascript.*;
import xdc.services.intern.xsr.*;
import xdc.services.spec.*;

public class ti_catalog_msp430_peripherals_communication
{
    static final String VERS = "@(#) xdc-v49\n";

    static final Proto.Elm $$T_Bool = Proto.Elm.newBool();
    static final Proto.Elm $$T_Num = Proto.Elm.newNum();
    static final Proto.Elm $$T_Str = Proto.Elm.newStr();
    static final Proto.Elm $$T_Obj = Proto.Elm.newObj();

    static final Proto.Fxn $$T_Met = new Proto.Fxn(null, null, 0, -1, false);
    static final Proto.Map $$T_Map = new Proto.Map($$T_Obj);
    static final Proto.Arr $$T_Vec = new Proto.Arr($$T_Obj);

    static final XScriptO $$DEFAULT = Value.DEFAULT;
    static final Object $$UNDEF = Undefined.instance;

    static final Proto.Obj $$Package = (Proto.Obj)Global.get("$$Package");
    static final Proto.Obj $$Module = (Proto.Obj)Global.get("$$Module");
    static final Proto.Obj $$Instance = (Proto.Obj)Global.get("$$Instance");
    static final Proto.Obj $$Params = (Proto.Obj)Global.get("$$Params");

    static final Object $$objFldGet = Global.get("$$objFldGet");
    static final Object $$objFldSet = Global.get("$$objFldSet");
    static final Object $$proxyGet = Global.get("$$proxyGet");
    static final Object $$proxySet = Global.get("$$proxySet");
    static final Object $$delegGet = Global.get("$$delegGet");
    static final Object $$delegSet = Global.get("$$delegSet");

    Scriptable xdcO;
    Session ses;
    Value.Obj om;

    boolean isROV;
    boolean isCFG;

    Proto.Obj pkgP;
    Value.Obj pkgV;

    ArrayList<Object> imports = new ArrayList<Object>();
    ArrayList<Object> loggables = new ArrayList<Object>();
    ArrayList<Object> mcfgs = new ArrayList<Object>();
    ArrayList<Object> proxies = new ArrayList<Object>();
    ArrayList<Object> sizes = new ArrayList<Object>();
    ArrayList<Object> tdefs = new ArrayList<Object>();

    void $$IMPORTS()
    {
        Global.callFxn("loadPackage", xdcO, "ti.catalog.msp430.peripherals.clock");
        Global.callFxn("loadPackage", xdcO, "ti.catalog.msp430.peripherals.special_function");
        Global.callFxn("loadPackage", xdcO, "xdc");
        Global.callFxn("loadPackage", xdcO, "xdc.corevers");
        Global.callFxn("loadPackage", xdcO, "xdc.platform");
    }

    void $$OBJECTS()
    {
        pkgP = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.Package", new Proto.Obj());
        pkgV = (Value.Obj)om.bind("ti.catalog.msp430.peripherals.communication", new Value.Obj("ti.catalog.msp430.peripherals.communication", pkgP));
    }

    void IUSCI$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI", new Value.Obj("ti.catalog.msp430.peripherals.communication.IUSCI", po));
        pkgV.bind("IUSCI", vo);
        // decls 
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_SYNC_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_SYNC_t"));
        spo = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI$$ForceSetDefaultRegister_t", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", new Proto.Str(spo, true));
        // insts 
        Object insP = om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI$$Params", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.Params", new Proto.Str(po, true));
    }

    void IUSCI_UART$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART", new Value.Obj("ti.catalog.msp430.peripherals.communication.IUSCI_UART", po));
        pkgV.bind("IUSCI_UART", vo);
        // decls 
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMSB_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UC7BIT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCRXEIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRKIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDORM_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCTXADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCTXBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSWRST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCLISTEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCFE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCRXERR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIDLE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBUSY_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_SYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_SYNC_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.ForceSetDefaultRegister_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPEN_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPEN_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPAR_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPAR_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSPB_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSPB_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCOS16_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCOS16_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL5_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL5_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL4_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL4_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL3_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL3_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL2_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL2_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL1_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL1_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL0_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL0_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXCLK_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXCLK_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIREN_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIREN_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL5_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL5_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL4_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL4_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL3_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL3_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL2_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL2_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL1_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL1_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL0_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL0_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXPL_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXPL_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFE_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFE_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM0_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM0_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM1_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM1_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSTOE_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSTOE_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBTOE_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBTOE_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCABDEN_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCABDEN_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_ASYNC_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_ASYNC_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_UART_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_UART_t"));
        spo = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART$$UCxCTL0_t", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxCTL0_t", new Proto.Str(spo, true));
        spo = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART$$UCxCTL1_t", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxCTL1_t", new Proto.Str(spo, true));
        spo = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART$$UCxMCTL_t", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxMCTL_t", new Proto.Str(spo, true));
        spo = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART$$UCxSTAT_t", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxSTAT_t", new Proto.Str(spo, true));
        spo = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART$$UCxIRTCTL_t", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxIRTCTL_t", new Proto.Str(spo, true));
        spo = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART$$UCxIRRCTL_t", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxIRRCTL_t", new Proto.Str(spo, true));
        spo = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART$$UCxABCTL_t", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxABCTL_t", new Proto.Str(spo, true));
        // insts 
        Object insP = om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART$$Params", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.Params", new Proto.Str(po, true));
    }

    void IUSCI_A0_UART$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART", new Value.Obj("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART", po));
        pkgV.bind("IUSCI_A0_UART", vo);
        // decls 
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCMSB_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UC7BIT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCSYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCRXEIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCBRKIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCDORM_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCTXADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCTXBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCSWRST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCLISTEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCFE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCPE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCRXERR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCIDLE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCBUSY_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCMODE_SYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_SYNC_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.ForceSetDefaultRegister_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCPEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPEN_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCPAR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPAR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCSPB_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSPB_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCBRF_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCBRS_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCOS16_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCOS16_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCIRTXPL5_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL5_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCIRTXPL4_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL4_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCIRTXPL3_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL3_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCIRTXPL2_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL2_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCIRTXPL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL1_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCIRTXPL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL0_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCIRTXCLK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXCLK_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCIREN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIREN_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCIRRXFL5_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL5_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCIRRXFL4_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL4_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCIRRXFL3_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL3_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCIRRXFL2_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL2_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCIRRXFL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL1_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCIRRXFL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL0_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCIRRXPL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXPL_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCIRRXFE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCDELIM0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM0_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCDELIM1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM1_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCSTOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSTOE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCBTOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBTOE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCABDEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCABDEN_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCMODE_ASYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_ASYNC_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCSSEL_UART_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_UART_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCxCTL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCxCTL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCxMCTL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxMCTL_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCxSTAT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCxIRTCTL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxIRTCTL_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCxIRRCTL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxIRRCTL_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCxABCTL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxABCTL_t", "ti.catalog.msp430.peripherals.communication"));
        // insts 
        Object insP = om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART$$Params", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.Params", new Proto.Str(po, true));
    }

    void USCI_A0_UART_2xx$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx", new Value.Obj("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx", po));
        pkgV.bind("USCI_A0_UART_2xx", vo);
        // decls 
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCMSB_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UC7BIT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCSYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCRXEIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCBRKIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCDORM_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCTXADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCTXBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCSWRST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCLISTEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCFE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCPE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCRXERR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCIDLE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCBUSY_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCMODE_SYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_SYNC_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.ForceSetDefaultRegister_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCPEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPEN_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCPAR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPAR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCSPB_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSPB_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCBRF_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCBRS_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCOS16_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCOS16_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCIRTXPL5_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL5_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCIRTXPL4_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL4_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCIRTXPL3_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL3_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCIRTXPL2_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL2_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCIRTXPL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL1_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCIRTXPL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL0_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCIRTXCLK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXCLK_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCIREN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIREN_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCIRRXFL5_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL5_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCIRRXFL4_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL4_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCIRRXFL3_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL3_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCIRRXFL2_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL2_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCIRRXFL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL1_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCIRRXFL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL0_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCIRRXPL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXPL_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCIRRXFE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCDELIM0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM0_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCDELIM1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM1_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCSTOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSTOE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCBTOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBTOE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCABDEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCABDEN_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCMODE_ASYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_ASYNC_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCSSEL_UART_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_UART_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCxCTL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCxCTL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCxMCTL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxMCTL_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCxSTAT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCxIRTCTL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxIRTCTL_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCxIRRCTL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxIRRCTL_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.UCxABCTL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxABCTL_t", "ti.catalog.msp430.peripherals.communication"));
        // insts 
        Object insP = om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx$$Params", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.Params", new Proto.Str(po, true));
    }

    void IUSCI_SPI$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI", new Value.Obj("ti.catalog.msp430.peripherals.communication.IUSCI_SPI", po));
        pkgV.bind("IUSCI_SPI", vo);
        // decls 
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCMSB_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UC7BIT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCRXEIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCBRKIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCDORM_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCTXADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCTXBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSWRST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCLISTEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCFE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCPE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCRXERR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCIDLE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCBUSY_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCMODE_SYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_SYNC_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.ForceSetDefaultRegister_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPH_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPH_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPL_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPL_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCMST_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCMST_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_SPI_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_SPI_t"));
        spo = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI$$UCxCTL0_t", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxCTL0_t", new Proto.Str(spo, true));
        spo = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI$$UCxCTL1_t", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxCTL1_t", new Proto.Str(spo, true));
        spo = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI$$UCxSTAT_t", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxSTAT_t", new Proto.Str(spo, true));
        // insts 
        Object insP = om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI$$Params", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.Params", new Proto.Str(po, true));
    }

    void IUSCI_A0_SPI$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI", new Value.Obj("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI", po));
        pkgV.bind("IUSCI_A0_SPI", vo);
        // decls 
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.UCMSB_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.UC7BIT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.UCSYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.UCRXEIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.UCBRKIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.UCDORM_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.UCTXADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.UCTXBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.UCSWRST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.UCLISTEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.UCFE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.UCOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.UCPE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.UCBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.UCRXERR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.UCADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.UCIDLE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.UCBUSY_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.UCMODE_SYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_SYNC_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.ForceSetDefaultRegister_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.UCCKPH_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPH_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.UCCKPL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPL_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.UCMST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCMST_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.UCSSEL_SPI_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_SPI_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.UCxCTL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.UCxCTL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.UCxSTAT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"));
        // insts 
        Object insP = om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI$$Params", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.Params", new Proto.Str(po, true));
    }

    void USCI_A0_SPI_2xx$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx", new Value.Obj("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx", po));
        pkgV.bind("USCI_A0_SPI_2xx", vo);
        // decls 
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.UCMSB_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.UC7BIT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.UCSYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.UCRXEIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.UCBRKIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.UCDORM_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.UCTXADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.UCTXBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.UCSWRST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.UCLISTEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.UCFE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.UCOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.UCPE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.UCBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.UCRXERR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.UCADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.UCIDLE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.UCBUSY_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.UCMODE_SYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_SYNC_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.ForceSetDefaultRegister_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.UCCKPH_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPH_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.UCCKPL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPL_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.UCMST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCMST_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.UCSSEL_SPI_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_SPI_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.UCxCTL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.UCxCTL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.UCxSTAT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"));
        // insts 
        Object insP = om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx$$Params", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.Params", new Proto.Str(po, true));
    }

    void IUSCI_B0_SPI$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI", new Value.Obj("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI", po));
        pkgV.bind("IUSCI_B0_SPI", vo);
        // decls 
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.UCMSB_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.UC7BIT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.UCSYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.UCRXEIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.UCBRKIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.UCDORM_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.UCTXADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.UCTXBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.UCSWRST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.UCLISTEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.UCFE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.UCOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.UCPE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.UCBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.UCRXERR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.UCADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.UCIDLE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.UCBUSY_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.UCMODE_SYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_SYNC_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.ForceSetDefaultRegister_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.UCCKPH_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPH_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.UCCKPL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPL_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.UCMST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCMST_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.UCSSEL_SPI_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_SPI_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.UCxCTL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.UCxCTL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.UCxSTAT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"));
        // insts 
        Object insP = om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI$$Params", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.Params", new Proto.Str(po, true));
    }

    void USCI_B0_SPI_2xx$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx", new Value.Obj("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx", po));
        pkgV.bind("USCI_B0_SPI_2xx", vo);
        // decls 
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.UCMSB_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.UC7BIT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.UCSYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.UCRXEIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.UCBRKIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.UCDORM_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.UCTXADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.UCTXBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.UCSWRST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.UCLISTEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.UCFE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.UCOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.UCPE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.UCBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.UCRXERR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.UCADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.UCIDLE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.UCBUSY_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.UCMODE_SYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_SYNC_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.ForceSetDefaultRegister_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.UCCKPH_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPH_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.UCCKPL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPL_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.UCMST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCMST_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.UCSSEL_SPI_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_SPI_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.UCxCTL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.UCxCTL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.UCxSTAT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"));
        // insts 
        Object insP = om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx$$Params", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.Params", new Proto.Str(po, true));
    }

    void IUSCI_I2C$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C", new Value.Obj("ti.catalog.msp430.peripherals.communication.IUSCI_I2C", po));
        pkgV.bind("IUSCI_I2C", vo);
        // decls 
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMSB_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UC7BIT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCRXEIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCBRKIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCDORM_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSWRST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCLISTEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCFE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCPE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCRXERR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCIDLE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCBUSY_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMODE_SYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_SYNC_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.ForceSetDefaultRegister_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCA10_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCA10_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSLA10_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSLA10_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMM_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMM_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMST_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMST_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSSEL_I2C_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSSEL_I2C_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTR_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTR_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXNACK_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXNACK_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTP_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTP_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTT_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTT_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSCLLOW_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSCLLOW_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGC_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGC_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCBBUSY_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCBBUSY_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCNACKIFG_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCNACKIFG_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTPIFG_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTPIFG_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTTIFG_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTTIFG_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCALIFG_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCALIFG_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGCEN_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGCEN_t"));
        spo = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C$$UCxCTL0_t", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCxCTL0_t", new Proto.Str(spo, true));
        spo = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C$$UCxCTL1_t", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCxCTL1_t", new Proto.Str(spo, true));
        spo = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C$$UCxSTAT_t", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCxSTAT_t", new Proto.Str(spo, true));
        spo = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C$$UCBxI2COA_t", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCBxI2COA_t", new Proto.Str(spo, true));
        // insts 
        Object insP = om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C$$Params", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.Params", new Proto.Str(po, true));
    }

    void IUSCI_B0_I2C$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C", new Value.Obj("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C", po));
        pkgV.bind("IUSCI_B0_I2C", vo);
        // decls 
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCMSB_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UC7BIT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCSYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCRXEIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCBRKIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCDORM_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCTXADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCTXBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCSWRST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCLISTEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCFE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCPE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCRXERR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCIDLE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCBUSY_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCMODE_SYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_SYNC_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.ForceSetDefaultRegister_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCA10_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCA10_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCSLA10_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSLA10_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCMM_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMM_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCMST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMST_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCSSEL_I2C_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSSEL_I2C_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCTR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCTXNACK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXNACK_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCTXSTP_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTP_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCTXSTT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTT_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCSCLLOW_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSCLLOW_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCGC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGC_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCBBUSY_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCBBUSY_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCNACKIFG_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCNACKIFG_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCSTPIFG_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTPIFG_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCSTTIFG_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTTIFG_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCALIFG_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCALIFG_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCGCEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGCEN_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCxCTL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCxCTL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCxSTAT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCBxI2COA_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCBxI2COA_t", "ti.catalog.msp430.peripherals.communication"));
        // insts 
        Object insP = om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C$$Params", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.Params", new Proto.Str(po, true));
    }

    void USCI_B0_I2C_2xx$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx", new Value.Obj("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx", po));
        pkgV.bind("USCI_B0_I2C_2xx", vo);
        // decls 
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCMSB_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UC7BIT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCSYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCRXEIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCBRKIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCDORM_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCTXADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCTXBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCSWRST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCLISTEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCFE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCPE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCRXERR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCIDLE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCBUSY_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCMODE_SYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_SYNC_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.ForceSetDefaultRegister_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCA10_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCA10_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCSLA10_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSLA10_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCMM_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMM_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCMST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMST_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCSSEL_I2C_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSSEL_I2C_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCTR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCTXNACK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXNACK_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCTXSTP_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTP_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCTXSTT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTT_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCSCLLOW_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSCLLOW_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCGC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGC_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCBBUSY_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCBBUSY_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCNACKIFG_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCNACKIFG_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCSTPIFG_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTPIFG_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCSTTIFG_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTTIFG_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCALIFG_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCALIFG_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCGCEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGCEN_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCxCTL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCxCTL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCxSTAT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCBxI2COA_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCBxI2COA_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCNACKIE_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCNACKIE_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCSTPIE_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCSTPIE_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCSTTIE_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCSTTIE_t"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCALIE_t", new Proto.Enm("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCALIE_t"));
        spo = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$UCBxI2CIE_t", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCBxI2CIE_t", new Proto.Str(spo, true));
        // insts 
        Object insP = om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$Params", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.Params", new Proto.Str(po, true));
    }

    void USCI_A1_UART_2xx$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx", new Value.Obj("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx", po));
        pkgV.bind("USCI_A1_UART_2xx", vo);
        // decls 
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCMSB_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UC7BIT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCSYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCRXEIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCBRKIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCDORM_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCTXADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCTXBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCSWRST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCLISTEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCFE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCPE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCRXERR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCIDLE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCBUSY_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCMODE_SYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_SYNC_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.ForceSetDefaultRegister_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCPEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPEN_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCPAR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPAR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCSPB_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSPB_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCBRF_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCBRS_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCOS16_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCOS16_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCIRTXPL5_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL5_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCIRTXPL4_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL4_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCIRTXPL3_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL3_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCIRTXPL2_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL2_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCIRTXPL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL1_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCIRTXPL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL0_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCIRTXCLK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXCLK_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCIREN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIREN_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCIRRXFL5_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL5_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCIRRXFL4_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL4_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCIRRXFL3_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL3_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCIRRXFL2_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL2_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCIRRXFL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL1_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCIRRXFL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL0_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCIRRXPL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXPL_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCIRRXFE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCDELIM0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM0_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCDELIM1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM1_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCSTOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSTOE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCBTOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBTOE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCABDEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCABDEN_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCMODE_ASYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_ASYNC_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCSSEL_UART_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_UART_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCxCTL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCxCTL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCxMCTL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxMCTL_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCxSTAT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCxIRTCTL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxIRTCTL_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCxIRRCTL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxIRRCTL_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.UCxABCTL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxABCTL_t", "ti.catalog.msp430.peripherals.communication"));
        // insts 
        Object insP = om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx$$Params", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.Params", new Proto.Str(po, true));
    }

    void IUSCI_A1_UART$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART", new Value.Obj("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART", po));
        pkgV.bind("IUSCI_A1_UART", vo);
        // decls 
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCMSB_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UC7BIT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCSYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCRXEIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCBRKIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCDORM_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCTXADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCTXBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCSWRST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCLISTEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCFE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCPE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCRXERR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCIDLE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCBUSY_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCMODE_SYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_SYNC_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.ForceSetDefaultRegister_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCPEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPEN_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCPAR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPAR_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCSPB_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSPB_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCBRF_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCBRS_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCOS16_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCOS16_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCIRTXPL5_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL5_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCIRTXPL4_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL4_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCIRTXPL3_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL3_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCIRTXPL2_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL2_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCIRTXPL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL1_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCIRTXPL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL0_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCIRTXCLK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXCLK_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCIREN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIREN_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCIRRXFL5_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL5_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCIRRXFL4_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL4_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCIRRXFL3_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL3_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCIRRXFL2_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL2_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCIRRXFL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL1_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCIRRXFL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL0_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCIRRXPL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXPL_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCIRRXFE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCDELIM0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM0_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCDELIM1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM1_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCSTOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSTOE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCBTOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBTOE_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCABDEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCABDEN_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCMODE_ASYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_ASYNC_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCSSEL_UART_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_UART_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCxCTL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCxCTL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCxMCTL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxMCTL_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCxSTAT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCxIRTCTL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxIRTCTL_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCxIRRCTL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxIRRCTL_t", "ti.catalog.msp430.peripherals.communication"));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCxABCTL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxABCTL_t", "ti.catalog.msp430.peripherals.communication"));
        // insts 
        Object insP = om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART$$Params", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.Params", new Proto.Str(po, true));
    }

    void IUSCI$$CONSTS()
    {
        // interface IUSCI
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB", xdc.services.intern.xsr.Enum.intValue(0x02L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT", xdc.services.intern.xsr.Enum.intValue(0x02L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC", xdc.services.intern.xsr.Enum.intValue(0x02L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE", xdc.services.intern.xsr.Enum.intValue(0x02L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE", xdc.services.intern.xsr.Enum.intValue(0x02L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM", xdc.services.intern.xsr.Enum.intValue(0x02L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR", xdc.services.intern.xsr.Enum.intValue(0x02L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK", xdc.services.intern.xsr.Enum.intValue(0x02L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST", xdc.services.intern.xsr.Enum.intValue(0x02L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN", xdc.services.intern.xsr.Enum.intValue(0x02L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UCFE", xdc.services.intern.xsr.Enum.intValue(0x02L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UCOE", xdc.services.intern.xsr.Enum.intValue(0x02L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UCPE", xdc.services.intern.xsr.Enum.intValue(0x02L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK", xdc.services.intern.xsr.Enum.intValue(0x02L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR", xdc.services.intern.xsr.Enum.intValue(0x02L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR", xdc.services.intern.xsr.Enum.intValue(0x02L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE", xdc.services.intern.xsr.Enum.intValue(0x02L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY", xdc.services.intern.xsr.Enum.intValue(0x01L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_0", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_SYNC_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_0", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_1", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_SYNC_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_1", xdc.services.intern.xsr.Enum.intValue(0x01L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_2", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_SYNC_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_2", xdc.services.intern.xsr.Enum.intValue(0x02L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_3", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_SYNC_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_3", xdc.services.intern.xsr.Enum.intValue(0x04L)+0));
    }

    void IUSCI_UART$$CONSTS()
    {
        // interface IUSCI_UART
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPEN_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPEN_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPEN_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPEN", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPEN_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPEN", xdc.services.intern.xsr.Enum.intValue(0x02L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPAR_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPAR_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPAR_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPAR", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPAR_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPAR", xdc.services.intern.xsr.Enum.intValue(0x02L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSPB_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSPB_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSPB_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSPB", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSPB_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSPB", xdc.services.intern.xsr.Enum.intValue(0x02L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_0", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_0", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_1", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_1", xdc.services.intern.xsr.Enum.intValue(0x10L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_2", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_2", xdc.services.intern.xsr.Enum.intValue(0x20L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_3", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_3", xdc.services.intern.xsr.Enum.intValue(0x30L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_4", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_4", xdc.services.intern.xsr.Enum.intValue(0x40L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_5", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_5", xdc.services.intern.xsr.Enum.intValue(0x50L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_6", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_6", xdc.services.intern.xsr.Enum.intValue(0x60L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_7", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_7", xdc.services.intern.xsr.Enum.intValue(0x70L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_8", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_8", xdc.services.intern.xsr.Enum.intValue(0x80L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_9", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_9", xdc.services.intern.xsr.Enum.intValue(0x90L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_10", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_10", xdc.services.intern.xsr.Enum.intValue(0xA0L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_11", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_11", xdc.services.intern.xsr.Enum.intValue(0xB0L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_12", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_12", xdc.services.intern.xsr.Enum.intValue(0xC0L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_13", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_13", xdc.services.intern.xsr.Enum.intValue(0xD0L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_14", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_14", xdc.services.intern.xsr.Enum.intValue(0xE0L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_15", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_15", xdc.services.intern.xsr.Enum.intValue(0xF0L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_0", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_0", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_1", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_1", xdc.services.intern.xsr.Enum.intValue(0x02L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_2", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_2", xdc.services.intern.xsr.Enum.intValue(0x04L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_3", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_3", xdc.services.intern.xsr.Enum.intValue(0x06L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_4", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_4", xdc.services.intern.xsr.Enum.intValue(0x08L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_5", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_5", xdc.services.intern.xsr.Enum.intValue(0x0AL)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_6", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_6", xdc.services.intern.xsr.Enum.intValue(0x0CL)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_7", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_7", xdc.services.intern.xsr.Enum.intValue(0x0EL)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCOS16_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCOS16_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCOS16_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCOS16", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCOS16_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCOS16", xdc.services.intern.xsr.Enum.intValue(0x02L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL5_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL5_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL5_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL5", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL5_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL5", xdc.services.intern.xsr.Enum.intValue(0x80L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL4_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL4_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL4_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL4", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL4_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL4", xdc.services.intern.xsr.Enum.intValue(0x40L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL3_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL3_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL3_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL3", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL3_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL3", xdc.services.intern.xsr.Enum.intValue(0x20L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL2_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL2_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL2_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL2", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL2_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL2", xdc.services.intern.xsr.Enum.intValue(0x10L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL1_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL1_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL1_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL1", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL1_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL1", xdc.services.intern.xsr.Enum.intValue(0x08L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL0_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL0_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL0_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL0", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL0_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL0", xdc.services.intern.xsr.Enum.intValue(0x04L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXCLK_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXCLK_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXCLK_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXCLK", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXCLK_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXCLK", xdc.services.intern.xsr.Enum.intValue(0x02L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIREN_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIREN_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIREN_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIREN", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIREN_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIREN", xdc.services.intern.xsr.Enum.intValue(0x02L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL5_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL5_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL5_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL5", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL5_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL5", xdc.services.intern.xsr.Enum.intValue(0x80L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL4_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL4_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL4_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL4", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL4_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL4", xdc.services.intern.xsr.Enum.intValue(0x40L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL3_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL3_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL3_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL3", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL3_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL3", xdc.services.intern.xsr.Enum.intValue(0x20L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL2_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL2_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL2_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL2", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL2_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL2", xdc.services.intern.xsr.Enum.intValue(0x10L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL1_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL1_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL1_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL1", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL1_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL1", xdc.services.intern.xsr.Enum.intValue(0x08L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL0_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL0_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL0_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL0", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL0_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL0", xdc.services.intern.xsr.Enum.intValue(0x04L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXPL_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXPL_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXPL_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXPL", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXPL_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXPL", xdc.services.intern.xsr.Enum.intValue(0x02L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFE_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFE_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFE_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFE", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFE_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFE", xdc.services.intern.xsr.Enum.intValue(0x02L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM0_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM0_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM0_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM0", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM0_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM0", xdc.services.intern.xsr.Enum.intValue(0x02L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM1_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM1_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM1_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM1", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM1_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM1", xdc.services.intern.xsr.Enum.intValue(0x02L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSTOE_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSTOE_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSTOE_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSTOE", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSTOE_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSTOE", xdc.services.intern.xsr.Enum.intValue(0x02L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBTOE_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBTOE_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBTOE_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBTOE", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBTOE_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBTOE", xdc.services.intern.xsr.Enum.intValue(0x02L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCABDEN_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCABDEN_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCABDEN_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCABDEN", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCABDEN_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCABDEN", xdc.services.intern.xsr.Enum.intValue(0x02L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_0", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_ASYNC_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_0", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_1", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_ASYNC_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_1", xdc.services.intern.xsr.Enum.intValue(0x01L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_2", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_ASYNC_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_2", xdc.services.intern.xsr.Enum.intValue(0x02L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_3", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_ASYNC_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_3", xdc.services.intern.xsr.Enum.intValue(0x04L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_0", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_UART_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_0", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_1", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_UART_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_1", xdc.services.intern.xsr.Enum.intValue(0x01L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_2", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_UART_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_2", xdc.services.intern.xsr.Enum.intValue(0x02L)+0));
    }

    void IUSCI_A0_UART$$CONSTS()
    {
        // interface IUSCI_A0_UART
    }

    void USCI_A0_UART_2xx$$CONSTS()
    {
        // module USCI_A0_UART_2xx
    }

    void IUSCI_SPI$$CONSTS()
    {
        // interface IUSCI_SPI
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPH_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPH_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPH_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPH", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPH_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPH", xdc.services.intern.xsr.Enum.intValue(0x80L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPL_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPL_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPL_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPL", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPL_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPL", xdc.services.intern.xsr.Enum.intValue(0x40L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCMST_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCMST_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCMST_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCMST", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCMST_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCMST", xdc.services.intern.xsr.Enum.intValue(0x40L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_0", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_SPI_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_0", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_1", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_SPI_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_1", xdc.services.intern.xsr.Enum.intValue(0x01L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_2", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_SPI_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_2", xdc.services.intern.xsr.Enum.intValue(0x02L)+0));
    }

    void IUSCI_A0_SPI$$CONSTS()
    {
        // interface IUSCI_A0_SPI
    }

    void USCI_A0_SPI_2xx$$CONSTS()
    {
        // module USCI_A0_SPI_2xx
    }

    void IUSCI_B0_SPI$$CONSTS()
    {
        // interface IUSCI_B0_SPI
    }

    void USCI_B0_SPI_2xx$$CONSTS()
    {
        // module USCI_B0_SPI_2xx
    }

    void IUSCI_I2C$$CONSTS()
    {
        // interface IUSCI_I2C
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCA10_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCA10_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCA10_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCA10", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCA10_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCA10", xdc.services.intern.xsr.Enum.intValue(0x80L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSLA10_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSLA10_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSLA10_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSLA10", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSLA10_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSLA10", xdc.services.intern.xsr.Enum.intValue(0x40L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMM_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMM_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMM_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMM", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMM_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMM", xdc.services.intern.xsr.Enum.intValue(0x20L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMST_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMST_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMST_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMST", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMST_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMST", xdc.services.intern.xsr.Enum.intValue(0x40L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSSEL_0", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSSEL_I2C_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSSEL_0", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSSEL_1", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSSEL_I2C_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSSEL_1", xdc.services.intern.xsr.Enum.intValue(0x01L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSSEL_2", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSSEL_I2C_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSSEL_2", xdc.services.intern.xsr.Enum.intValue(0x02L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTR_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTR_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTR_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTR", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTR_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTR", xdc.services.intern.xsr.Enum.intValue(0x10L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXNACK_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXNACK_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXNACK_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXNACK", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXNACK_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXNACK", xdc.services.intern.xsr.Enum.intValue(0x08L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTP_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTP_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTP_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTP", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTP_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTP", xdc.services.intern.xsr.Enum.intValue(0x10L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTT_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTT_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTT_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTT", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTT_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTT", xdc.services.intern.xsr.Enum.intValue(0x10L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSCLLOW_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSCLLOW_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSCLLOW_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSCLLOW", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSCLLOW_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSCLLOW", xdc.services.intern.xsr.Enum.intValue(0x10L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGC_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGC_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGC_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGC", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGC_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGC", xdc.services.intern.xsr.Enum.intValue(0x10L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCBBUSY_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCBBUSY_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCBBUSY_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCBBUSY", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCBBUSY_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCBBUSY", xdc.services.intern.xsr.Enum.intValue(0x10L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCNACKIFG_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCNACKIFG_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCNACKIFG_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCNACKIFG", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCNACKIFG_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCNACKIFG", xdc.services.intern.xsr.Enum.intValue(0x10L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTPIFG_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTPIFG_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTPIFG_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTPIFG", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTPIFG_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTPIFG", xdc.services.intern.xsr.Enum.intValue(0x10L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTTIFG_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTTIFG_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTTIFG_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTTIFG", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTTIFG_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTTIFG", xdc.services.intern.xsr.Enum.intValue(0x10L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCALIFG_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCALIFG_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCALIFG_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCALIFG", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCALIFG_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCALIFG", xdc.services.intern.xsr.Enum.intValue(0x10L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGCEN_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGCEN_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGCEN_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGCEN", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGCEN_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGCEN", xdc.services.intern.xsr.Enum.intValue(0x80L)+0));
    }

    void IUSCI_B0_I2C$$CONSTS()
    {
        // interface IUSCI_B0_I2C
    }

    void USCI_B0_I2C_2xx$$CONSTS()
    {
        // module USCI_B0_I2C_2xx
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCNACKIE_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCNACKIE_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCNACKIE_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCNACKIE", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCNACKIE_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCNACKIE", xdc.services.intern.xsr.Enum.intValue(0x80L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCSTPIE_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCSTPIE_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCSTPIE_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCSTPIE", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCSTPIE_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCSTPIE", xdc.services.intern.xsr.Enum.intValue(0x80L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCSTTIE_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCSTTIE_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCSTTIE_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCSTTIE", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCSTTIE_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCSTTIE", xdc.services.intern.xsr.Enum.intValue(0x80L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCALIE_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCALIE_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCALIE_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCALIE", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCALIE_t", "ti.catalog.msp430.peripherals.communication"), "ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCALIE", xdc.services.intern.xsr.Enum.intValue(0x80L)+0));
    }

    void USCI_A1_UART_2xx$$CONSTS()
    {
        // module USCI_A1_UART_2xx
    }

    void IUSCI_A1_UART$$CONSTS()
    {
        // interface IUSCI_A1_UART
    }

    void IUSCI$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

    }

    void IUSCI_UART$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

    }

    void IUSCI_A0_UART$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

    }

    void USCI_A0_UART_2xx$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx$$create", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.Module", "ti.catalog.msp430.peripherals.communication"), om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.Instance", "ti.catalog.msp430.peripherals.communication"), 3, 2, false));
                fxn.addArg(0, "clock", (Proto)om.findStrict("ti.catalog.msp430.peripherals.clock.IClock.Instance", "ti.catalog.msp430.peripherals.communication"), $$UNDEF);
                fxn.addArg(1, "interruptEnableRegister2", (Proto)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.Instance", "ti.catalog.msp430.peripherals.communication"), $$UNDEF);
                fxn.addArg(2, "__params", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.Params", "ti.catalog.msp430.peripherals.communication"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$msp430$peripherals$communication$USCI_A0_UART_2xx$$create = function( clock, interruptEnableRegister2, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx'];\n");
            sb.append("var __inst = xdc.om['ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.Instance'].$$make();\n");
            sb.append("__inst.$$bind('$package', xdc.om['ti.catalog.msp430.peripherals.communication']);\n");
            sb.append("__inst.$$bind('$index', __mod.$instances.length);\n");
            sb.append("__inst.$$bind('$category', 'Instance');\n");
            sb.append("__inst.$$bind('$args', {clock:clock, interruptEnableRegister2:interruptEnableRegister2});\n");
            sb.append("__inst.$$bind('$module', __mod);\n");
            sb.append("__mod.$instances.$add(__inst);\n");
            sb.append("__inst.name = __mod.PARAMS.name;\n");
            sb.append("__inst.owner = __mod.PARAMS.owner;\n");
            sb.append("__inst.clock = __mod.PARAMS.clock;\n");
            sb.append("__inst.interruptEnableRegister2 = __mod.PARAMS.interruptEnableRegister2;\n");
            sb.append("for (__p in __params) __inst[__p] = __params[__p];\n");
            sb.append("var save = xdc.om.$curpkg;\n");
            sb.append("xdc.om.$$bind('$curpkg', __mod.$package.$name);\n");
            sb.append("__mod.instance$meta$init.$fxn.apply(__inst, [clock, interruptEnableRegister2]);\n");
            sb.append("xdc.om.$$bind('$curpkg', save);\n");
            sb.append("__inst.$$bless();\n");
            sb.append("return __inst;\n");
        sb.append("}\n");
        Global.eval(sb.toString());
        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx$$construct", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.Module", "ti.catalog.msp430.peripherals.communication"), null, 4, 2, false));
                fxn.addArg(0, "__obj", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx$$Object", "ti.catalog.msp430.peripherals.communication"), null);
                fxn.addArg(1, "clock", (Proto)om.findStrict("ti.catalog.msp430.peripherals.clock.IClock.Instance", "ti.catalog.msp430.peripherals.communication"), $$UNDEF);
                fxn.addArg(2, "interruptEnableRegister2", (Proto)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.Instance", "ti.catalog.msp430.peripherals.communication"), $$UNDEF);
                fxn.addArg(3, "__params", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.Params", "ti.catalog.msp430.peripherals.communication"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$msp430$peripherals$communication$USCI_A0_UART_2xx$$construct = function( __obj, clock, interruptEnableRegister2, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx'];\n");
            sb.append("var __inst = __obj;\n");
            sb.append("__inst.$$bind('$args', {clock:clock, interruptEnableRegister2:interruptEnableRegister2});\n");
            sb.append("__inst.$$bind('$module', __mod);\n");
            sb.append("__mod.$objects.$add(__inst);\n");
            sb.append("__inst.name = __mod.PARAMS.name;\n");
            sb.append("__inst.owner = __mod.PARAMS.owner;\n");
            sb.append("__inst.clock = __mod.PARAMS.clock;\n");
            sb.append("__inst.interruptEnableRegister2 = __mod.PARAMS.interruptEnableRegister2;\n");
            sb.append("for (__p in __params) __inst[__p] = __params[__p];\n");
            sb.append("__inst.$$bless();\n");
            sb.append("return null;\n");
        sb.append("}\n");
        Global.eval(sb.toString());
    }

    void IUSCI_SPI$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

    }

    void IUSCI_A0_SPI$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

    }

    void USCI_A0_SPI_2xx$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx$$create", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.Module", "ti.catalog.msp430.peripherals.communication"), om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.Instance", "ti.catalog.msp430.peripherals.communication"), 3, 2, false));
                fxn.addArg(0, "clock", (Proto)om.findStrict("ti.catalog.msp430.peripherals.clock.IClock.Instance", "ti.catalog.msp430.peripherals.communication"), $$UNDEF);
                fxn.addArg(1, "interruptEnableRegister2", (Proto)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.Instance", "ti.catalog.msp430.peripherals.communication"), $$UNDEF);
                fxn.addArg(2, "__params", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.Params", "ti.catalog.msp430.peripherals.communication"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$msp430$peripherals$communication$USCI_A0_SPI_2xx$$create = function( clock, interruptEnableRegister2, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx'];\n");
            sb.append("var __inst = xdc.om['ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.Instance'].$$make();\n");
            sb.append("__inst.$$bind('$package', xdc.om['ti.catalog.msp430.peripherals.communication']);\n");
            sb.append("__inst.$$bind('$index', __mod.$instances.length);\n");
            sb.append("__inst.$$bind('$category', 'Instance');\n");
            sb.append("__inst.$$bind('$args', {clock:clock, interruptEnableRegister2:interruptEnableRegister2});\n");
            sb.append("__inst.$$bind('$module', __mod);\n");
            sb.append("__mod.$instances.$add(__inst);\n");
            sb.append("__inst.name = __mod.PARAMS.name;\n");
            sb.append("__inst.owner = __mod.PARAMS.owner;\n");
            sb.append("__inst.clock = __mod.PARAMS.clock;\n");
            sb.append("__inst.interruptEnableRegister2 = __mod.PARAMS.interruptEnableRegister2;\n");
            sb.append("for (__p in __params) __inst[__p] = __params[__p];\n");
            sb.append("var save = xdc.om.$curpkg;\n");
            sb.append("xdc.om.$$bind('$curpkg', __mod.$package.$name);\n");
            sb.append("__mod.instance$meta$init.$fxn.apply(__inst, [clock, interruptEnableRegister2]);\n");
            sb.append("xdc.om.$$bind('$curpkg', save);\n");
            sb.append("__inst.$$bless();\n");
            sb.append("return __inst;\n");
        sb.append("}\n");
        Global.eval(sb.toString());
        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx$$construct", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.Module", "ti.catalog.msp430.peripherals.communication"), null, 4, 2, false));
                fxn.addArg(0, "__obj", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx$$Object", "ti.catalog.msp430.peripherals.communication"), null);
                fxn.addArg(1, "clock", (Proto)om.findStrict("ti.catalog.msp430.peripherals.clock.IClock.Instance", "ti.catalog.msp430.peripherals.communication"), $$UNDEF);
                fxn.addArg(2, "interruptEnableRegister2", (Proto)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.Instance", "ti.catalog.msp430.peripherals.communication"), $$UNDEF);
                fxn.addArg(3, "__params", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.Params", "ti.catalog.msp430.peripherals.communication"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$msp430$peripherals$communication$USCI_A0_SPI_2xx$$construct = function( __obj, clock, interruptEnableRegister2, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx'];\n");
            sb.append("var __inst = __obj;\n");
            sb.append("__inst.$$bind('$args', {clock:clock, interruptEnableRegister2:interruptEnableRegister2});\n");
            sb.append("__inst.$$bind('$module', __mod);\n");
            sb.append("__mod.$objects.$add(__inst);\n");
            sb.append("__inst.name = __mod.PARAMS.name;\n");
            sb.append("__inst.owner = __mod.PARAMS.owner;\n");
            sb.append("__inst.clock = __mod.PARAMS.clock;\n");
            sb.append("__inst.interruptEnableRegister2 = __mod.PARAMS.interruptEnableRegister2;\n");
            sb.append("for (__p in __params) __inst[__p] = __params[__p];\n");
            sb.append("__inst.$$bless();\n");
            sb.append("return null;\n");
        sb.append("}\n");
        Global.eval(sb.toString());
    }

    void IUSCI_B0_SPI$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

    }

    void USCI_B0_SPI_2xx$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx$$create", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.Module", "ti.catalog.msp430.peripherals.communication"), om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.Instance", "ti.catalog.msp430.peripherals.communication"), 3, 2, false));
                fxn.addArg(0, "clock", (Proto)om.findStrict("ti.catalog.msp430.peripherals.clock.IClock.Instance", "ti.catalog.msp430.peripherals.communication"), $$UNDEF);
                fxn.addArg(1, "interruptEnableRegister2", (Proto)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.Instance", "ti.catalog.msp430.peripherals.communication"), $$UNDEF);
                fxn.addArg(2, "__params", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.Params", "ti.catalog.msp430.peripherals.communication"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$msp430$peripherals$communication$USCI_B0_SPI_2xx$$create = function( clock, interruptEnableRegister2, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx'];\n");
            sb.append("var __inst = xdc.om['ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.Instance'].$$make();\n");
            sb.append("__inst.$$bind('$package', xdc.om['ti.catalog.msp430.peripherals.communication']);\n");
            sb.append("__inst.$$bind('$index', __mod.$instances.length);\n");
            sb.append("__inst.$$bind('$category', 'Instance');\n");
            sb.append("__inst.$$bind('$args', {clock:clock, interruptEnableRegister2:interruptEnableRegister2});\n");
            sb.append("__inst.$$bind('$module', __mod);\n");
            sb.append("__mod.$instances.$add(__inst);\n");
            sb.append("__inst.name = __mod.PARAMS.name;\n");
            sb.append("__inst.owner = __mod.PARAMS.owner;\n");
            sb.append("__inst.clock = __mod.PARAMS.clock;\n");
            sb.append("__inst.interruptEnableRegister2 = __mod.PARAMS.interruptEnableRegister2;\n");
            sb.append("for (__p in __params) __inst[__p] = __params[__p];\n");
            sb.append("var save = xdc.om.$curpkg;\n");
            sb.append("xdc.om.$$bind('$curpkg', __mod.$package.$name);\n");
            sb.append("__mod.instance$meta$init.$fxn.apply(__inst, [clock, interruptEnableRegister2]);\n");
            sb.append("xdc.om.$$bind('$curpkg', save);\n");
            sb.append("__inst.$$bless();\n");
            sb.append("return __inst;\n");
        sb.append("}\n");
        Global.eval(sb.toString());
        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx$$construct", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.Module", "ti.catalog.msp430.peripherals.communication"), null, 4, 2, false));
                fxn.addArg(0, "__obj", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx$$Object", "ti.catalog.msp430.peripherals.communication"), null);
                fxn.addArg(1, "clock", (Proto)om.findStrict("ti.catalog.msp430.peripherals.clock.IClock.Instance", "ti.catalog.msp430.peripherals.communication"), $$UNDEF);
                fxn.addArg(2, "interruptEnableRegister2", (Proto)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.Instance", "ti.catalog.msp430.peripherals.communication"), $$UNDEF);
                fxn.addArg(3, "__params", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.Params", "ti.catalog.msp430.peripherals.communication"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$msp430$peripherals$communication$USCI_B0_SPI_2xx$$construct = function( __obj, clock, interruptEnableRegister2, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx'];\n");
            sb.append("var __inst = __obj;\n");
            sb.append("__inst.$$bind('$args', {clock:clock, interruptEnableRegister2:interruptEnableRegister2});\n");
            sb.append("__inst.$$bind('$module', __mod);\n");
            sb.append("__mod.$objects.$add(__inst);\n");
            sb.append("__inst.name = __mod.PARAMS.name;\n");
            sb.append("__inst.owner = __mod.PARAMS.owner;\n");
            sb.append("__inst.clock = __mod.PARAMS.clock;\n");
            sb.append("__inst.interruptEnableRegister2 = __mod.PARAMS.interruptEnableRegister2;\n");
            sb.append("for (__p in __params) __inst[__p] = __params[__p];\n");
            sb.append("__inst.$$bless();\n");
            sb.append("return null;\n");
        sb.append("}\n");
        Global.eval(sb.toString());
    }

    void IUSCI_I2C$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

    }

    void IUSCI_B0_I2C$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

    }

    void USCI_B0_I2C_2xx$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$create", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.Module", "ti.catalog.msp430.peripherals.communication"), om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.Instance", "ti.catalog.msp430.peripherals.communication"), 3, 2, false));
                fxn.addArg(0, "clock", (Proto)om.findStrict("ti.catalog.msp430.peripherals.clock.IClock.Instance", "ti.catalog.msp430.peripherals.communication"), $$UNDEF);
                fxn.addArg(1, "interruptEnableRegister2", (Proto)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.Instance", "ti.catalog.msp430.peripherals.communication"), $$UNDEF);
                fxn.addArg(2, "__params", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.Params", "ti.catalog.msp430.peripherals.communication"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$msp430$peripherals$communication$USCI_B0_I2C_2xx$$create = function( clock, interruptEnableRegister2, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx'];\n");
            sb.append("var __inst = xdc.om['ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.Instance'].$$make();\n");
            sb.append("__inst.$$bind('$package', xdc.om['ti.catalog.msp430.peripherals.communication']);\n");
            sb.append("__inst.$$bind('$index', __mod.$instances.length);\n");
            sb.append("__inst.$$bind('$category', 'Instance');\n");
            sb.append("__inst.$$bind('$args', {clock:clock, interruptEnableRegister2:interruptEnableRegister2});\n");
            sb.append("__inst.$$bind('$module', __mod);\n");
            sb.append("__mod.$instances.$add(__inst);\n");
            sb.append("__inst.name = __mod.PARAMS.name;\n");
            sb.append("__inst.owner = __mod.PARAMS.owner;\n");
            sb.append("__inst.clock = __mod.PARAMS.clock;\n");
            sb.append("__inst.interruptEnableRegister2 = __mod.PARAMS.interruptEnableRegister2;\n");
            sb.append("for (__p in __params) __inst[__p] = __params[__p];\n");
            sb.append("var save = xdc.om.$curpkg;\n");
            sb.append("xdc.om.$$bind('$curpkg', __mod.$package.$name);\n");
            sb.append("__mod.instance$meta$init.$fxn.apply(__inst, [clock, interruptEnableRegister2]);\n");
            sb.append("xdc.om.$$bind('$curpkg', save);\n");
            sb.append("__inst.$$bless();\n");
            sb.append("return __inst;\n");
        sb.append("}\n");
        Global.eval(sb.toString());
        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$construct", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.Module", "ti.catalog.msp430.peripherals.communication"), null, 4, 2, false));
                fxn.addArg(0, "__obj", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$Object", "ti.catalog.msp430.peripherals.communication"), null);
                fxn.addArg(1, "clock", (Proto)om.findStrict("ti.catalog.msp430.peripherals.clock.IClock.Instance", "ti.catalog.msp430.peripherals.communication"), $$UNDEF);
                fxn.addArg(2, "interruptEnableRegister2", (Proto)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.Instance", "ti.catalog.msp430.peripherals.communication"), $$UNDEF);
                fxn.addArg(3, "__params", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.Params", "ti.catalog.msp430.peripherals.communication"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$msp430$peripherals$communication$USCI_B0_I2C_2xx$$construct = function( __obj, clock, interruptEnableRegister2, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx'];\n");
            sb.append("var __inst = __obj;\n");
            sb.append("__inst.$$bind('$args', {clock:clock, interruptEnableRegister2:interruptEnableRegister2});\n");
            sb.append("__inst.$$bind('$module', __mod);\n");
            sb.append("__mod.$objects.$add(__inst);\n");
            sb.append("__inst.name = __mod.PARAMS.name;\n");
            sb.append("__inst.owner = __mod.PARAMS.owner;\n");
            sb.append("__inst.clock = __mod.PARAMS.clock;\n");
            sb.append("__inst.interruptEnableRegister2 = __mod.PARAMS.interruptEnableRegister2;\n");
            sb.append("for (__p in __params) __inst[__p] = __params[__p];\n");
            sb.append("__inst.$$bless();\n");
            sb.append("return null;\n");
        sb.append("}\n");
        Global.eval(sb.toString());
    }

    void USCI_A1_UART_2xx$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx$$create", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.Module", "ti.catalog.msp430.peripherals.communication"), om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.Instance", "ti.catalog.msp430.peripherals.communication"), 1, 0, false));
                fxn.addArg(0, "__params", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.Params", "ti.catalog.msp430.peripherals.communication"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$msp430$peripherals$communication$USCI_A1_UART_2xx$$create = function( __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx'];\n");
            sb.append("var __inst = xdc.om['ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.Instance'].$$make();\n");
            sb.append("__inst.$$bind('$package', xdc.om['ti.catalog.msp430.peripherals.communication']);\n");
            sb.append("__inst.$$bind('$index', __mod.$instances.length);\n");
            sb.append("__inst.$$bind('$category', 'Instance');\n");
            sb.append("__inst.$$bind('$args', {});\n");
            sb.append("__inst.$$bind('$module', __mod);\n");
            sb.append("__mod.$instances.$add(__inst);\n");
            sb.append("__inst.name = __mod.PARAMS.name;\n");
            sb.append("__inst.owner = __mod.PARAMS.owner;\n");
            sb.append("for (__p in __params) __inst[__p] = __params[__p];\n");
            sb.append("var save = xdc.om.$curpkg;\n");
            sb.append("xdc.om.$$bind('$curpkg', __mod.$package.$name);\n");
            sb.append("__mod.instance$meta$init.$fxn.apply(__inst, []);\n");
            sb.append("xdc.om.$$bind('$curpkg', save);\n");
            sb.append("__inst.$$bless();\n");
            sb.append("return __inst;\n");
        sb.append("}\n");
        Global.eval(sb.toString());
        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx$$construct", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.Module", "ti.catalog.msp430.peripherals.communication"), null, 2, 0, false));
                fxn.addArg(0, "__obj", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx$$Object", "ti.catalog.msp430.peripherals.communication"), null);
                fxn.addArg(1, "__params", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.Params", "ti.catalog.msp430.peripherals.communication"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$msp430$peripherals$communication$USCI_A1_UART_2xx$$construct = function( __obj, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx'];\n");
            sb.append("var __inst = __obj;\n");
            sb.append("__inst.$$bind('$args', {});\n");
            sb.append("__inst.$$bind('$module', __mod);\n");
            sb.append("__mod.$objects.$add(__inst);\n");
            sb.append("__inst.name = __mod.PARAMS.name;\n");
            sb.append("__inst.owner = __mod.PARAMS.owner;\n");
            sb.append("for (__p in __params) __inst[__p] = __params[__p];\n");
            sb.append("__inst.$$bless();\n");
            sb.append("return null;\n");
        sb.append("}\n");
        Global.eval(sb.toString());
    }

    void IUSCI_A1_UART$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

    }

    void IUSCI$$FUNCTIONS()
    {
        Proto.Fxn fxn;

        // fxn IUSCI.setUCTXIE
        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI$$setUCTXIE", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.Instance", "ti.catalog.msp430.peripherals.communication"), $$T_Bool, 1, 1, false));
                fxn.addArg(0, "set", $$T_Bool, $$UNDEF);
        // fxn IUSCI.getUCTXIE
        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI$$getUCTXIE", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.Instance", "ti.catalog.msp430.peripherals.communication"), $$T_Bool, 0, 0, false));
        // fxn IUSCI.setUCRXIE
        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI$$setUCRXIE", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.Instance", "ti.catalog.msp430.peripherals.communication"), $$T_Bool, 1, 1, false));
                fxn.addArg(0, "set", $$T_Bool, $$UNDEF);
        // fxn IUSCI.getUCRXIE
        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.communication.IUSCI$$getUCRXIE", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.Instance", "ti.catalog.msp430.peripherals.communication"), $$T_Bool, 0, 0, false));
    }

    void IUSCI_UART$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void IUSCI_A0_UART$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void USCI_A0_UART_2xx$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void IUSCI_SPI$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void IUSCI_A0_SPI$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void USCI_A0_SPI_2xx$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void IUSCI_B0_SPI$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void USCI_B0_SPI_2xx$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void IUSCI_I2C$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void IUSCI_B0_I2C$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void USCI_B0_I2C_2xx$$FUNCTIONS()
    {
        Proto.Fxn fxn;

        // fxn USCI_B0_I2C_2xx.setUCNACKIE
        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$setUCNACKIE", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.Instance", "ti.catalog.msp430.peripherals.communication"), $$T_Bool, 1, 1, false));
                fxn.addArg(0, "set", $$T_Bool, $$UNDEF);
        // fxn USCI_B0_I2C_2xx.getUCNACKIE
        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$getUCNACKIE", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.Instance", "ti.catalog.msp430.peripherals.communication"), $$T_Bool, 0, 0, false));
        // fxn USCI_B0_I2C_2xx.setUCSTPIE
        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$setUCSTPIE", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.Instance", "ti.catalog.msp430.peripherals.communication"), $$T_Bool, 1, 1, false));
                fxn.addArg(0, "set", $$T_Bool, $$UNDEF);
        // fxn USCI_B0_I2C_2xx.getUCSTPIE
        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$getUCSTPIE", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.Instance", "ti.catalog.msp430.peripherals.communication"), $$T_Bool, 0, 0, false));
        // fxn USCI_B0_I2C_2xx.setUCSTTIE
        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$setUCSTTIE", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.Instance", "ti.catalog.msp430.peripherals.communication"), $$T_Bool, 1, 1, false));
                fxn.addArg(0, "set", $$T_Bool, $$UNDEF);
        // fxn USCI_B0_I2C_2xx.getUCSTTIE
        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$getUCSTTIE", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.Instance", "ti.catalog.msp430.peripherals.communication"), $$T_Bool, 0, 0, false));
        // fxn USCI_B0_I2C_2xx.setUCALIE
        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$setUCALIE", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.Instance", "ti.catalog.msp430.peripherals.communication"), $$T_Bool, 1, 1, false));
                fxn.addArg(0, "set", $$T_Bool, $$UNDEF);
        // fxn USCI_B0_I2C_2xx.getUCALIE
        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$getUCALIE", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.Instance", "ti.catalog.msp430.peripherals.communication"), $$T_Bool, 0, 0, false));
    }

    void USCI_A1_UART_2xx$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void IUSCI_A1_UART$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void IUSCI$$SIZES()
    {
    }

    void IUSCI_UART$$SIZES()
    {
    }

    void IUSCI_A0_UART$$SIZES()
    {
    }

    void USCI_A0_UART_2xx$$SIZES()
    {
    }

    void IUSCI_SPI$$SIZES()
    {
    }

    void IUSCI_A0_SPI$$SIZES()
    {
    }

    void USCI_A0_SPI_2xx$$SIZES()
    {
    }

    void IUSCI_B0_SPI$$SIZES()
    {
    }

    void USCI_B0_SPI_2xx$$SIZES()
    {
    }

    void IUSCI_I2C$$SIZES()
    {
    }

    void IUSCI_B0_I2C$$SIZES()
    {
    }

    void USCI_B0_I2C_2xx$$SIZES()
    {
    }

    void USCI_A1_UART_2xx$$SIZES()
    {
    }

    void IUSCI_A1_UART$$SIZES()
    {
    }

    void IUSCI$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        cap = (Scriptable)Global.callFxn("loadCapsule", xdcO, "ti/catalog/msp430/peripherals/communication/IUSCI.xs");
        om.bind("ti.catalog.msp430.peripherals.communication.IUSCI$$capsule", cap);
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.Module", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI.Module", om.findStrict("xdc.platform.IPeripheral.Module", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        fxn = Global.get(cap, "module$use");
        if (fxn != null) om.bind("ti.catalog.msp430.peripherals.communication.IUSCI$$module$use", true);
        if (fxn != null) po.addFxn("module$use", $$T_Met, fxn);
        fxn = Global.get(cap, "module$meta$init");
        if (fxn != null) om.bind("ti.catalog.msp430.peripherals.communication.IUSCI$$module$meta$init", true);
        if (fxn != null) po.addFxn("module$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "instance$meta$init");
        if (fxn != null) om.bind("ti.catalog.msp430.peripherals.communication.IUSCI$$instance$meta$init", true);
        if (fxn != null) po.addFxn("instance$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "module$validate");
        if (fxn != null) om.bind("ti.catalog.msp430.peripherals.communication.IUSCI$$module$validate", true);
        if (fxn != null) po.addFxn("module$validate", $$T_Met, fxn);
                fxn = Global.get(cap, "addPeripheralsMap");
                if (fxn != null) po.addFxn("addPeripheralsMap", (Proto.Fxn)om.findStrict("xdc.platform.IPeripheral$$addPeripheralsMap", "ti.catalog.msp430.peripherals.communication"), fxn);
                fxn = Global.get(cap, "getAll");
                if (fxn != null) po.addFxn("getAll", (Proto.Fxn)om.findStrict("xdc.platform.IPeripheral$$getAll", "ti.catalog.msp430.peripherals.communication"), fxn);
                fxn = Global.get(cap, "getRegisters");
                if (fxn != null) po.addFxn("getRegisters", (Proto.Fxn)om.findStrict("xdc.platform.IPeripheral$$getRegisters", "ti.catalog.msp430.peripherals.communication"), fxn);
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.Instance", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI.Instance", om.findStrict("xdc.platform.IPeripheral.Instance", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("UCLKHz", Proto.Elm.newCNum("(xdc_Float)"), 1000000L, "wh");
                fxn = Global.get(cap, "setUCTXIE");
                if (fxn != null) po.addFxn("setUCTXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$setUCTXIE", "ti.catalog.msp430.peripherals.communication"), fxn);
                fxn = Global.get(cap, "getUCTXIE");
                if (fxn != null) po.addFxn("getUCTXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$getUCTXIE", "ti.catalog.msp430.peripherals.communication"), fxn);
                fxn = Global.get(cap, "setUCRXIE");
                if (fxn != null) po.addFxn("setUCRXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$setUCRXIE", "ti.catalog.msp430.peripherals.communication"), fxn);
                fxn = Global.get(cap, "getUCRXIE");
                if (fxn != null) po.addFxn("getUCRXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$getUCRXIE", "ti.catalog.msp430.peripherals.communication"), fxn);
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$Params", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI.Params", om.findStrict("xdc.platform.IPeripheral$$Params", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("UCLKHz", Proto.Elm.newCNum("(xdc_Float)"), 1000000L, "wh");
        // struct IUSCI.ForceSetDefaultRegister_t
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", null);
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFld("register", $$T_Str, $$UNDEF, "w");
                po.addFld("regForceSet", $$T_Bool, $$UNDEF, "w");
    }

    void IUSCI_UART$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.Module", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI_UART.Module", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.Module", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.Instance", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI_UART.Instance", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.Instance", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART$$Params", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI_UART.Params", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$Params", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        // struct IUSCI_UART.UCxCTL0_t
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART$$UCxCTL0_t", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxCTL0_t", null);
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFld("UCPEN", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPEN_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCPAR", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPAR_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCMSB", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMSB_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UC7BIT", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UC7BIT_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCSPB", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSPB_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCMODE", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_ASYNC_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCSYNC", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSYNC_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
        // struct IUSCI_UART.UCxCTL1_t
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART$$UCxCTL1_t", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxCTL1_t", null);
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFld("UCSSEL", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_UART_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCRXEIE", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCRXEIE_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCBRKIE", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRKIE_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCDORM", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDORM_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCTXADDR", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCTXADDR_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCTXBRK", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCTXBRK_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCSWRST", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSWRST_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
        // struct IUSCI_UART.UCxMCTL_t
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART$$UCxMCTL_t", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxMCTL_t", null);
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFld("UCBRF", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCBRS", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCOS16", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCOS16_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
        // struct IUSCI_UART.UCxSTAT_t
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART$$UCxSTAT_t", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxSTAT_t", null);
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFld("UCLISTEN", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCLISTEN_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCFE", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCFE_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCOE", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCOE_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCPE", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPE_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCBRK", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRK_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCRXERR", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCRXERR_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCADDR", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCADDR_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCIDLE", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIDLE_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCBUSY", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBUSY_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
        // struct IUSCI_UART.UCxIRTCTL_t
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART$$UCxIRTCTL_t", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxIRTCTL_t", null);
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFld("UCIRTXPL5", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL5_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCIRTXPL4", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL4_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCIRTXPL3", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL3_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCIRTXPL2", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL2_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCIRTXPL1", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL1_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCIRTXPL0", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL0_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCIRTXCLK", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXCLK_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCIREN", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIREN_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
        // struct IUSCI_UART.UCxIRRCTL_t
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART$$UCxIRRCTL_t", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxIRRCTL_t", null);
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFld("UCIRRXFL5", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL5_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCIRRXFL4", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL4_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCIRRXFL3", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL3_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCIRRXFL2", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL2_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCIRRXFL1", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL1_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCIRRXFL0", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL0_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCIRRXPL", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXPL_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCIRRXFE", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFE_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
        // struct IUSCI_UART.UCxABCTL_t
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART$$UCxABCTL_t", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxABCTL_t", null);
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFld("UCDELIM1", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM1_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCDELIM0", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM0_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCSTOE", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSTOE_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCBTOE", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBTOE_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCABDEN", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCABDEN_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
    }

    void IUSCI_A0_UART$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.Module", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.Module", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.Module", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.Instance", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.Instance", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.Instance", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("UCA0CTL0", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCPEN", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPEN_OFF"), "UCPAR", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPAR_OFF"), "UCMSB", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_OFF"), "UC7BIT", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_OFF"), "UCSPB", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSPB_OFF"), "UCMODE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_0"), "UCSYNC", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_OFF")), "wh");
        po.addFld("UCA0CTL1", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCSSEL", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_0"), "UCRXEIE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_OFF"), "UCBRKIE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_OFF"), "UCDORM", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_OFF"), "UCTXADDR", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_OFF"), "UCTXBRK", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_OFF"), "UCSWRST", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST")), "wh");
        po.addFld("UCA0MCTL", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCxMCTL_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCBRF", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_0"), "UCBRS", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_0"), "UCOS16", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCOS16_OFF")), "wh");
        po.addFld("UCA0STAT", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCLISTEN", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_OFF"), "UCFE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_OFF"), "UCOE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_OFF"), "UCPE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_OFF"), "UCBRK", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_OFF"), "UCRXERR", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_OFF"), "UCADDR", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_OFF"), "UCIDLE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_OFF"), "UCBUSY", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY")), "wh");
        po.addFld("UCA0IRTCTL", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCxIRTCTL_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCIRTXPL5", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL5_OFF"), "UCIRTXPL4", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL4_OFF"), "UCIRTXPL3", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL3_OFF"), "UCIRTXPL2", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL2_OFF"), "UCIRTXPL1", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL1_OFF"), "UCIRTXPL0", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL0_OFF"), "UCIRTXCLK", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXCLK_OFF"), "UCIREN", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIREN_OFF")), "wh");
        po.addFld("UCA0IRRCTL", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCxIRRCTL_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCIRRXFL5", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL5_OFF"), "UCIRRXFL4", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL4_OFF"), "UCIRRXFL3", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL3_OFF"), "UCIRRXFL2", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL2_OFF"), "UCIRRXFL1", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL1_OFF"), "UCIRRXFL0", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL0_OFF"), "UCIRRXPL", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXPL_OFF"), "UCIRRXFE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFE_OFF")), "wh");
        po.addFld("UCA0ABCTL", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCxABCTL_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCDELIM1", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM1_OFF"), "UCDELIM0", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM0_OFF"), "UCSTOE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSTOE_OFF"), "UCBTOE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBTOE_OFF"), "UCABDEN", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCABDEN_OFF")), "wh");
        po.addFld("UCA0RXBUF", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
        po.addFld("UCA0TXBUF", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
        po.addFld("UCA0BR0", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
        po.addFld("UCA0BR1", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART$$Params", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.Params", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART$$Params", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("UCA0CTL0", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCPEN", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPEN_OFF"), "UCPAR", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPAR_OFF"), "UCMSB", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_OFF"), "UC7BIT", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_OFF"), "UCSPB", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSPB_OFF"), "UCMODE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_0"), "UCSYNC", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_OFF")), "wh");
        po.addFld("UCA0CTL1", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCSSEL", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_0"), "UCRXEIE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_OFF"), "UCBRKIE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_OFF"), "UCDORM", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_OFF"), "UCTXADDR", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_OFF"), "UCTXBRK", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_OFF"), "UCSWRST", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST")), "wh");
        po.addFld("UCA0MCTL", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCxMCTL_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCBRF", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_0"), "UCBRS", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_0"), "UCOS16", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCOS16_OFF")), "wh");
        po.addFld("UCA0STAT", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCLISTEN", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_OFF"), "UCFE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_OFF"), "UCOE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_OFF"), "UCPE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_OFF"), "UCBRK", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_OFF"), "UCRXERR", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_OFF"), "UCADDR", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_OFF"), "UCIDLE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_OFF"), "UCBUSY", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY")), "wh");
        po.addFld("UCA0IRTCTL", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCxIRTCTL_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCIRTXPL5", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL5_OFF"), "UCIRTXPL4", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL4_OFF"), "UCIRTXPL3", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL3_OFF"), "UCIRTXPL2", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL2_OFF"), "UCIRTXPL1", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL1_OFF"), "UCIRTXPL0", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL0_OFF"), "UCIRTXCLK", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXCLK_OFF"), "UCIREN", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIREN_OFF")), "wh");
        po.addFld("UCA0IRRCTL", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCxIRRCTL_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCIRRXFL5", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL5_OFF"), "UCIRRXFL4", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL4_OFF"), "UCIRRXFL3", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL3_OFF"), "UCIRRXFL2", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL2_OFF"), "UCIRRXFL1", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL1_OFF"), "UCIRRXFL0", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL0_OFF"), "UCIRRXPL", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXPL_OFF"), "UCIRRXFE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFE_OFF")), "wh");
        po.addFld("UCA0ABCTL", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.UCxABCTL_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCDELIM1", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM1_OFF"), "UCDELIM0", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM0_OFF"), "UCSTOE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSTOE_OFF"), "UCBTOE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBTOE_OFF"), "UCABDEN", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCABDEN_OFF")), "wh");
        po.addFld("UCA0RXBUF", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
        po.addFld("UCA0TXBUF", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
        po.addFld("UCA0BR0", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
        po.addFld("UCA0BR1", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
    }

    void USCI_A0_UART_2xx$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        cap = (Scriptable)Global.callFxn("loadCapsule", xdcO, "ti/catalog/msp430/peripherals/communication/USCI_A0_UART_2xx.xs");
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx$$capsule", cap);
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.Module", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.Module", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.Module", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("create", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx$$create", "ti.catalog.msp430.peripherals.communication"), Global.get("ti$catalog$msp430$peripherals$communication$USCI_A0_UART_2xx$$create"));
                po.addFxn("construct", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx$$construct", "ti.catalog.msp430.peripherals.communication"), Global.get("ti$catalog$msp430$peripherals$communication$USCI_A0_UART_2xx$$construct"));
        fxn = Global.get(cap, "module$use");
        if (fxn != null) om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx$$module$use", true);
        if (fxn != null) po.addFxn("module$use", $$T_Met, fxn);
        fxn = Global.get(cap, "module$meta$init");
        if (fxn != null) om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx$$module$meta$init", true);
        if (fxn != null) po.addFxn("module$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "instance$meta$init");
        if (fxn != null) om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx$$instance$meta$init", true);
        if (fxn != null) po.addFxn("instance$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "module$validate");
        if (fxn != null) om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx$$module$validate", true);
        if (fxn != null) po.addFxn("module$validate", $$T_Met, fxn);
                fxn = Global.get(cap, "addPeripheralsMap");
                if (fxn != null) po.addFxn("addPeripheralsMap", (Proto.Fxn)om.findStrict("xdc.platform.IPeripheral$$addPeripheralsMap", "ti.catalog.msp430.peripherals.communication"), fxn);
                fxn = Global.get(cap, "getAll");
                if (fxn != null) po.addFxn("getAll", (Proto.Fxn)om.findStrict("xdc.platform.IPeripheral$$getAll", "ti.catalog.msp430.peripherals.communication"), fxn);
                fxn = Global.get(cap, "getRegisters");
                if (fxn != null) po.addFxn("getRegisters", (Proto.Fxn)om.findStrict("xdc.platform.IPeripheral$$getRegisters", "ti.catalog.msp430.peripherals.communication"), fxn);
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.Instance", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.Instance", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.Instance", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("clock", (Proto)om.findStrict("ti.catalog.msp430.peripherals.clock.IClock.Instance", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "wh");
        po.addFld("interruptEnableRegister2", (Proto)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.Instance", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "wh");
        po.addFld("forceSetDefaultRegister", new Proto.Arr((Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"), false), Global.newArray(new Object[]{Global.newObject("register", "UCA0CTL0", "regForceSet", false), Global.newObject("register", "UCA0CTL1", "regForceSet", false), Global.newObject("register", "UCA0BR0", "regForceSet", false), Global.newObject("register", "UCA0BR1", "regForceSet", false), Global.newObject("register", "UCA0MCTL", "regForceSet", false), Global.newObject("register", "UCA0STAT", "regForceSet", false), Global.newObject("register", "UCA0RXBUF", "regForceSet", false), Global.newObject("register", "UCA0TXBUF", "regForceSet", false), Global.newObject("register", "UCA0ABCTL", "regForceSet", false), Global.newObject("register", "UCA0IRTCTL", "regForceSet", false), Global.newObject("register", "UCA0IRRCTL", "regForceSet", false)}), "rh");
                fxn = Global.get(cap, "setUCTXIE");
                if (fxn != null) po.addFxn("setUCTXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$setUCTXIE", "ti.catalog.msp430.peripherals.communication"), fxn);
                fxn = Global.get(cap, "getUCTXIE");
                if (fxn != null) po.addFxn("getUCTXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$getUCTXIE", "ti.catalog.msp430.peripherals.communication"), fxn);
                fxn = Global.get(cap, "setUCRXIE");
                if (fxn != null) po.addFxn("setUCRXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$setUCRXIE", "ti.catalog.msp430.peripherals.communication"), fxn);
                fxn = Global.get(cap, "getUCRXIE");
                if (fxn != null) po.addFxn("getUCRXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$getUCRXIE", "ti.catalog.msp430.peripherals.communication"), fxn);
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx$$Params", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.Params", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART$$Params", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("clock", (Proto)om.findStrict("ti.catalog.msp430.peripherals.clock.IClock.Instance", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "wh");
        po.addFld("interruptEnableRegister2", (Proto)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.Instance", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "wh");
        po.addFld("forceSetDefaultRegister", new Proto.Arr((Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"), false), Global.newArray(new Object[]{Global.newObject("register", "UCA0CTL0", "regForceSet", false), Global.newObject("register", "UCA0CTL1", "regForceSet", false), Global.newObject("register", "UCA0BR0", "regForceSet", false), Global.newObject("register", "UCA0BR1", "regForceSet", false), Global.newObject("register", "UCA0MCTL", "regForceSet", false), Global.newObject("register", "UCA0STAT", "regForceSet", false), Global.newObject("register", "UCA0RXBUF", "regForceSet", false), Global.newObject("register", "UCA0TXBUF", "regForceSet", false), Global.newObject("register", "UCA0ABCTL", "regForceSet", false), Global.newObject("register", "UCA0IRTCTL", "regForceSet", false), Global.newObject("register", "UCA0IRRCTL", "regForceSet", false)}), "rh");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx$$Object", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.Object", om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.Instance", "ti.catalog.msp430.peripherals.communication"));
                fxn = Global.get(cap, "setUCTXIE");
                if (fxn != null) po.addFxn("setUCTXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$setUCTXIE", "ti.catalog.msp430.peripherals.communication"), fxn);
                fxn = Global.get(cap, "getUCTXIE");
                if (fxn != null) po.addFxn("getUCTXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$getUCTXIE", "ti.catalog.msp430.peripherals.communication"), fxn);
                fxn = Global.get(cap, "setUCRXIE");
                if (fxn != null) po.addFxn("setUCRXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$setUCRXIE", "ti.catalog.msp430.peripherals.communication"), fxn);
                fxn = Global.get(cap, "getUCRXIE");
                if (fxn != null) po.addFxn("getUCRXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$getUCRXIE", "ti.catalog.msp430.peripherals.communication"), fxn);
    }

    void IUSCI_SPI$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.Module", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.Module", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.Module", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.Instance", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.Instance", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.Instance", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI$$Params", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.Params", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$Params", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        // struct IUSCI_SPI.UCxCTL0_t
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI$$UCxCTL0_t", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxCTL0_t", null);
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFld("UCCKPH", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPH_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCCKPL", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPL_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCMSB", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCMSB_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UC7BIT", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UC7BIT_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCMST", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCMST_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCMODE", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCMODE_SYNC_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCSYNC", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSYNC_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
        // struct IUSCI_SPI.UCxCTL1_t
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI$$UCxCTL1_t", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxCTL1_t", null);
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFld("UCSSEL", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_SPI_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCSWRST", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSWRST_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
        // struct IUSCI_SPI.UCxSTAT_t
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI$$UCxSTAT_t", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxSTAT_t", null);
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFld("UCLISTEN", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCLISTEN_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCFE", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCFE_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCOE", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCOE_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCBUSY", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCBUSY_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
    }

    void IUSCI_A0_SPI$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.Module", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.Module", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.Module", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.Instance", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.Instance", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.Instance", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("UCA0CTL0", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCCKPH", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPH_OFF"), "UCCKPL", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPL_OFF"), "UCMSB", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_OFF"), "UC7BIT", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_OFF"), "UCMST", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCMST_OFF"), "UCMODE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_0"), "UCSYNC", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC")), "wh");
        po.addFld("UCA0CTL1", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCSSEL", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_0"), "UCSWRST", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST")), "wh");
        po.addFld("UCA0STAT", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCLISTEN", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_OFF"), "UCFE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_OFF"), "UCOE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_OFF"), "UCBUSY", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY")), "wh");
        po.addFld("UCA0BR0", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
        po.addFld("UCA0BR1", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
        po.addFld("UCA0RXBUF", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
        po.addFld("UCA0TXBUF", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI$$Params", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.Params", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI$$Params", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("UCA0CTL0", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCCKPH", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPH_OFF"), "UCCKPL", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPL_OFF"), "UCMSB", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_OFF"), "UC7BIT", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_OFF"), "UCMST", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCMST_OFF"), "UCMODE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_0"), "UCSYNC", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC")), "wh");
        po.addFld("UCA0CTL1", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCSSEL", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_0"), "UCSWRST", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST")), "wh");
        po.addFld("UCA0STAT", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCLISTEN", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_OFF"), "UCFE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_OFF"), "UCOE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_OFF"), "UCBUSY", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY")), "wh");
        po.addFld("UCA0BR0", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
        po.addFld("UCA0BR1", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
        po.addFld("UCA0RXBUF", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
        po.addFld("UCA0TXBUF", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
    }

    void USCI_A0_SPI_2xx$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        cap = (Scriptable)Global.callFxn("loadCapsule", xdcO, "ti/catalog/msp430/peripherals/communication/USCI_A0_SPI_2xx.xs");
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx$$capsule", cap);
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.Module", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.Module", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.Module", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("create", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx$$create", "ti.catalog.msp430.peripherals.communication"), Global.get("ti$catalog$msp430$peripherals$communication$USCI_A0_SPI_2xx$$create"));
                po.addFxn("construct", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx$$construct", "ti.catalog.msp430.peripherals.communication"), Global.get("ti$catalog$msp430$peripherals$communication$USCI_A0_SPI_2xx$$construct"));
        fxn = Global.get(cap, "module$use");
        if (fxn != null) om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx$$module$use", true);
        if (fxn != null) po.addFxn("module$use", $$T_Met, fxn);
        fxn = Global.get(cap, "module$meta$init");
        if (fxn != null) om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx$$module$meta$init", true);
        if (fxn != null) po.addFxn("module$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "instance$meta$init");
        if (fxn != null) om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx$$instance$meta$init", true);
        if (fxn != null) po.addFxn("instance$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "module$validate");
        if (fxn != null) om.bind("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx$$module$validate", true);
        if (fxn != null) po.addFxn("module$validate", $$T_Met, fxn);
                fxn = Global.get(cap, "addPeripheralsMap");
                if (fxn != null) po.addFxn("addPeripheralsMap", (Proto.Fxn)om.findStrict("xdc.platform.IPeripheral$$addPeripheralsMap", "ti.catalog.msp430.peripherals.communication"), fxn);
                fxn = Global.get(cap, "getAll");
                if (fxn != null) po.addFxn("getAll", (Proto.Fxn)om.findStrict("xdc.platform.IPeripheral$$getAll", "ti.catalog.msp430.peripherals.communication"), fxn);
                fxn = Global.get(cap, "getRegisters");
                if (fxn != null) po.addFxn("getRegisters", (Proto.Fxn)om.findStrict("xdc.platform.IPeripheral$$getRegisters", "ti.catalog.msp430.peripherals.communication"), fxn);
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.Instance", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.Instance", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.Instance", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("clock", (Proto)om.findStrict("ti.catalog.msp430.peripherals.clock.IClock.Instance", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "wh");
        po.addFld("interruptEnableRegister2", (Proto)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.Instance", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "wh");
        po.addFld("forceSetDefaultRegister", new Proto.Arr((Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"), false), Global.newArray(new Object[]{Global.newObject("register", "UCA0CTL0", "regForceSet", false), Global.newObject("register", "UCA0CTL1", "regForceSet", false), Global.newObject("register", "UCA0BR0", "regForceSet", false), Global.newObject("register", "UCA0BR1", "regForceSet", false), Global.newObject("register", "UCA0STAT", "regForceSet", false), Global.newObject("register", "UCA0RXBUF", "regForceSet", false), Global.newObject("register", "UCA0TXBUF", "regForceSet", false)}), "rh");
                fxn = Global.get(cap, "setUCTXIE");
                if (fxn != null) po.addFxn("setUCTXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$setUCTXIE", "ti.catalog.msp430.peripherals.communication"), fxn);
                fxn = Global.get(cap, "getUCTXIE");
                if (fxn != null) po.addFxn("getUCTXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$getUCTXIE", "ti.catalog.msp430.peripherals.communication"), fxn);
                fxn = Global.get(cap, "setUCRXIE");
                if (fxn != null) po.addFxn("setUCRXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$setUCRXIE", "ti.catalog.msp430.peripherals.communication"), fxn);
                fxn = Global.get(cap, "getUCRXIE");
                if (fxn != null) po.addFxn("getUCRXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$getUCRXIE", "ti.catalog.msp430.peripherals.communication"), fxn);
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx$$Params", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.Params", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI$$Params", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("clock", (Proto)om.findStrict("ti.catalog.msp430.peripherals.clock.IClock.Instance", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "wh");
        po.addFld("interruptEnableRegister2", (Proto)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.Instance", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "wh");
        po.addFld("forceSetDefaultRegister", new Proto.Arr((Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"), false), Global.newArray(new Object[]{Global.newObject("register", "UCA0CTL0", "regForceSet", false), Global.newObject("register", "UCA0CTL1", "regForceSet", false), Global.newObject("register", "UCA0BR0", "regForceSet", false), Global.newObject("register", "UCA0BR1", "regForceSet", false), Global.newObject("register", "UCA0STAT", "regForceSet", false), Global.newObject("register", "UCA0RXBUF", "regForceSet", false), Global.newObject("register", "UCA0TXBUF", "regForceSet", false)}), "rh");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx$$Object", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.Object", om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.Instance", "ti.catalog.msp430.peripherals.communication"));
                fxn = Global.get(cap, "setUCTXIE");
                if (fxn != null) po.addFxn("setUCTXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$setUCTXIE", "ti.catalog.msp430.peripherals.communication"), fxn);
                fxn = Global.get(cap, "getUCTXIE");
                if (fxn != null) po.addFxn("getUCTXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$getUCTXIE", "ti.catalog.msp430.peripherals.communication"), fxn);
                fxn = Global.get(cap, "setUCRXIE");
                if (fxn != null) po.addFxn("setUCRXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$setUCRXIE", "ti.catalog.msp430.peripherals.communication"), fxn);
                fxn = Global.get(cap, "getUCRXIE");
                if (fxn != null) po.addFxn("getUCRXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$getUCRXIE", "ti.catalog.msp430.peripherals.communication"), fxn);
    }

    void IUSCI_B0_SPI$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.Module", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.Module", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.Module", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.Instance", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.Instance", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.Instance", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("UCB0CTL0", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCCKPH", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPH_OFF"), "UCCKPL", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPL_OFF"), "UCMSB", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_OFF"), "UC7BIT", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_OFF"), "UCMST", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCMST_OFF"), "UCMODE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_0"), "UCSYNC", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC")), "wh");
        po.addFld("UCB0CTL1", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCSSEL", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_0"), "UCSWRST", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST")), "wh");
        po.addFld("UCB0STAT", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCLISTEN", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_OFF"), "UCFE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_OFF"), "UCOE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_OFF"), "UCBUSY", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY")), "wh");
        po.addFld("UCB0BR0", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
        po.addFld("UCB0BR1", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
        po.addFld("UCB0RXBUF", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
        po.addFld("UCB0TXBUF", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI$$Params", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.Params", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI$$Params", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("UCB0CTL0", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCCKPH", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPH_OFF"), "UCCKPL", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPL_OFF"), "UCMSB", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_OFF"), "UC7BIT", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_OFF"), "UCMST", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCMST_OFF"), "UCMODE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_0"), "UCSYNC", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC")), "wh");
        po.addFld("UCB0CTL1", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCSSEL", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_0"), "UCSWRST", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST")), "wh");
        po.addFld("UCB0STAT", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCLISTEN", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_OFF"), "UCFE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_OFF"), "UCOE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_OFF"), "UCBUSY", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY")), "wh");
        po.addFld("UCB0BR0", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
        po.addFld("UCB0BR1", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
        po.addFld("UCB0RXBUF", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
        po.addFld("UCB0TXBUF", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
    }

    void USCI_B0_SPI_2xx$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        cap = (Scriptable)Global.callFxn("loadCapsule", xdcO, "ti/catalog/msp430/peripherals/communication/USCI_B0_SPI_2xx.xs");
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx$$capsule", cap);
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.Module", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.Module", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.Module", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("create", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx$$create", "ti.catalog.msp430.peripherals.communication"), Global.get("ti$catalog$msp430$peripherals$communication$USCI_B0_SPI_2xx$$create"));
                po.addFxn("construct", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx$$construct", "ti.catalog.msp430.peripherals.communication"), Global.get("ti$catalog$msp430$peripherals$communication$USCI_B0_SPI_2xx$$construct"));
        fxn = Global.get(cap, "module$use");
        if (fxn != null) om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx$$module$use", true);
        if (fxn != null) po.addFxn("module$use", $$T_Met, fxn);
        fxn = Global.get(cap, "module$meta$init");
        if (fxn != null) om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx$$module$meta$init", true);
        if (fxn != null) po.addFxn("module$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "instance$meta$init");
        if (fxn != null) om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx$$instance$meta$init", true);
        if (fxn != null) po.addFxn("instance$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "module$validate");
        if (fxn != null) om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx$$module$validate", true);
        if (fxn != null) po.addFxn("module$validate", $$T_Met, fxn);
                fxn = Global.get(cap, "addPeripheralsMap");
                if (fxn != null) po.addFxn("addPeripheralsMap", (Proto.Fxn)om.findStrict("xdc.platform.IPeripheral$$addPeripheralsMap", "ti.catalog.msp430.peripherals.communication"), fxn);
                fxn = Global.get(cap, "getAll");
                if (fxn != null) po.addFxn("getAll", (Proto.Fxn)om.findStrict("xdc.platform.IPeripheral$$getAll", "ti.catalog.msp430.peripherals.communication"), fxn);
                fxn = Global.get(cap, "getRegisters");
                if (fxn != null) po.addFxn("getRegisters", (Proto.Fxn)om.findStrict("xdc.platform.IPeripheral$$getRegisters", "ti.catalog.msp430.peripherals.communication"), fxn);
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.Instance", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.Instance", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.Instance", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("clock", (Proto)om.findStrict("ti.catalog.msp430.peripherals.clock.IClock.Instance", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "wh");
        po.addFld("interruptEnableRegister2", (Proto)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.Instance", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "wh");
        po.addFld("forceSetDefaultRegister", new Proto.Arr((Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"), false), Global.newArray(new Object[]{Global.newObject("register", "UCB0CTL0", "regForceSet", false), Global.newObject("register", "UCB0CTL1", "regForceSet", false), Global.newObject("register", "UCB0BR0", "regForceSet", false), Global.newObject("register", "UCB0BR1", "regForceSet", false), Global.newObject("register", "UCB0STAT", "regForceSet", false), Global.newObject("register", "UCB0RXBUF", "regForceSet", false), Global.newObject("register", "UCB0TXBUF", "regForceSet", false)}), "rh");
                fxn = Global.get(cap, "setUCTXIE");
                if (fxn != null) po.addFxn("setUCTXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$setUCTXIE", "ti.catalog.msp430.peripherals.communication"), fxn);
                fxn = Global.get(cap, "getUCTXIE");
                if (fxn != null) po.addFxn("getUCTXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$getUCTXIE", "ti.catalog.msp430.peripherals.communication"), fxn);
                fxn = Global.get(cap, "setUCRXIE");
                if (fxn != null) po.addFxn("setUCRXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$setUCRXIE", "ti.catalog.msp430.peripherals.communication"), fxn);
                fxn = Global.get(cap, "getUCRXIE");
                if (fxn != null) po.addFxn("getUCRXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$getUCRXIE", "ti.catalog.msp430.peripherals.communication"), fxn);
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx$$Params", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.Params", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI$$Params", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("clock", (Proto)om.findStrict("ti.catalog.msp430.peripherals.clock.IClock.Instance", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "wh");
        po.addFld("interruptEnableRegister2", (Proto)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.Instance", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "wh");
        po.addFld("forceSetDefaultRegister", new Proto.Arr((Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"), false), Global.newArray(new Object[]{Global.newObject("register", "UCB0CTL0", "regForceSet", false), Global.newObject("register", "UCB0CTL1", "regForceSet", false), Global.newObject("register", "UCB0BR0", "regForceSet", false), Global.newObject("register", "UCB0BR1", "regForceSet", false), Global.newObject("register", "UCB0STAT", "regForceSet", false), Global.newObject("register", "UCB0RXBUF", "regForceSet", false), Global.newObject("register", "UCB0TXBUF", "regForceSet", false)}), "rh");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx$$Object", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.Object", om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.Instance", "ti.catalog.msp430.peripherals.communication"));
                fxn = Global.get(cap, "setUCTXIE");
                if (fxn != null) po.addFxn("setUCTXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$setUCTXIE", "ti.catalog.msp430.peripherals.communication"), fxn);
                fxn = Global.get(cap, "getUCTXIE");
                if (fxn != null) po.addFxn("getUCTXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$getUCTXIE", "ti.catalog.msp430.peripherals.communication"), fxn);
                fxn = Global.get(cap, "setUCRXIE");
                if (fxn != null) po.addFxn("setUCRXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$setUCRXIE", "ti.catalog.msp430.peripherals.communication"), fxn);
                fxn = Global.get(cap, "getUCRXIE");
                if (fxn != null) po.addFxn("getUCRXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$getUCRXIE", "ti.catalog.msp430.peripherals.communication"), fxn);
    }

    void IUSCI_I2C$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.Module", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.Module", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.Module", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.Instance", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.Instance", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.Instance", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C$$Params", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.Params", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$Params", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        // struct IUSCI_I2C.UCxCTL0_t
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C$$UCxCTL0_t", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCxCTL0_t", null);
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFld("UCA10", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCA10_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCSLA10", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSLA10_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCMM", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMM_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCMST", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMST_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCMODE", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMODE_SYNC_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCSYNC", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSYNC_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
        // struct IUSCI_I2C.UCxCTL1_t
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C$$UCxCTL1_t", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCxCTL1_t", null);
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFld("UCSSEL", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSSEL_I2C_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCTR", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTR_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCTXNACK", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXNACK_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCTXSTP", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTP_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCTXSTT", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTT_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCSWRST", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSWRST_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
        // struct IUSCI_I2C.UCxSTAT_t
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C$$UCxSTAT_t", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCxSTAT_t", null);
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFld("UCSCLLOW", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSCLLOW_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCGC", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGC_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCBBUSY", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCBBUSY_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCNACKIFG", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCNACKIFG_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCSTPIFG", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTPIFG_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCSTTIFG", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTTIFG_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCALIFG", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCALIFG_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
        // struct IUSCI_I2C.UCBxI2COA_t
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C$$UCBxI2COA_t", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCBxI2COA_t", null);
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFld("UCGCEN", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGCEN_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("I2COA", Proto.Elm.newCNum("(xdc_UChar)"), $$UNDEF, "w");
    }

    void IUSCI_B0_I2C$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.Module", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.Module", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.Module", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.Instance", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.Instance", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.Instance", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("UCB0CTL0", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCA10", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCA10_OFF"), "UCSLA10", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSLA10_OFF"), "UCMM", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMM_OFF"), "UCMST", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMST_OFF"), "UCMODE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_0"), "UCSYNC", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC")), "wh");
        po.addFld("UCB0CTL1", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCSSEL", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSSEL_0"), "UCTR", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTR_OFF"), "UCTXNACK", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXNACK_OFF"), "UCTXSTP", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTP_OFF"), "UCTXSTT", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTT_OFF"), "UCSWRST", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST")), "wh");
        po.addFld("UCB0STAT", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCSCLLOW", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSCLLOW"), "UCGC", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGC"), "UCBBUSY", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCBBUSY"), "UCNACKIFG", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCNACKIFG"), "UCSTPIFG", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTPIFG"), "UCSTTIFG", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTTIFG"), "UCALIFG", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCALIFG")), "wh");
        po.addFld("UCB0I2COA", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCBxI2COA_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCGCEN", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGCEN_OFF"), "I2COA", 0L), "wh");
        po.addFld("UCB0I2CSA", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
        po.addFld("UCB0RXBUF", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
        po.addFld("UCB0TXBUF", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
        po.addFld("UCB0BR0", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
        po.addFld("UCB0BR1", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C$$Params", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.Params", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C$$Params", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("UCB0CTL0", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCA10", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCA10_OFF"), "UCSLA10", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSLA10_OFF"), "UCMM", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMM_OFF"), "UCMST", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMST_OFF"), "UCMODE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_0"), "UCSYNC", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC")), "wh");
        po.addFld("UCB0CTL1", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCSSEL", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSSEL_0"), "UCTR", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTR_OFF"), "UCTXNACK", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXNACK_OFF"), "UCTXSTP", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTP_OFF"), "UCTXSTT", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTT_OFF"), "UCSWRST", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST")), "wh");
        po.addFld("UCB0STAT", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCSCLLOW", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSCLLOW"), "UCGC", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGC"), "UCBBUSY", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCBBUSY"), "UCNACKIFG", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCNACKIFG"), "UCSTPIFG", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTPIFG"), "UCSTTIFG", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTTIFG"), "UCALIFG", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCALIFG")), "wh");
        po.addFld("UCB0I2COA", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.UCBxI2COA_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCGCEN", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGCEN_OFF"), "I2COA", 0L), "wh");
        po.addFld("UCB0I2CSA", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
        po.addFld("UCB0RXBUF", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
        po.addFld("UCB0TXBUF", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
        po.addFld("UCB0BR0", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
        po.addFld("UCB0BR1", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
    }

    void USCI_B0_I2C_2xx$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        cap = (Scriptable)Global.callFxn("loadCapsule", xdcO, "ti/catalog/msp430/peripherals/communication/USCI_B0_I2C_2xx.xs");
        om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$capsule", cap);
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.Module", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.Module", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.Module", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("create", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$create", "ti.catalog.msp430.peripherals.communication"), Global.get("ti$catalog$msp430$peripherals$communication$USCI_B0_I2C_2xx$$create"));
                po.addFxn("construct", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$construct", "ti.catalog.msp430.peripherals.communication"), Global.get("ti$catalog$msp430$peripherals$communication$USCI_B0_I2C_2xx$$construct"));
        fxn = Global.get(cap, "module$use");
        if (fxn != null) om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$module$use", true);
        if (fxn != null) po.addFxn("module$use", $$T_Met, fxn);
        fxn = Global.get(cap, "module$meta$init");
        if (fxn != null) om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$module$meta$init", true);
        if (fxn != null) po.addFxn("module$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "instance$meta$init");
        if (fxn != null) om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$instance$meta$init", true);
        if (fxn != null) po.addFxn("instance$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "module$validate");
        if (fxn != null) om.bind("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$module$validate", true);
        if (fxn != null) po.addFxn("module$validate", $$T_Met, fxn);
                fxn = Global.get(cap, "addPeripheralsMap");
                if (fxn != null) po.addFxn("addPeripheralsMap", (Proto.Fxn)om.findStrict("xdc.platform.IPeripheral$$addPeripheralsMap", "ti.catalog.msp430.peripherals.communication"), fxn);
                fxn = Global.get(cap, "getAll");
                if (fxn != null) po.addFxn("getAll", (Proto.Fxn)om.findStrict("xdc.platform.IPeripheral$$getAll", "ti.catalog.msp430.peripherals.communication"), fxn);
                fxn = Global.get(cap, "getRegisters");
                if (fxn != null) po.addFxn("getRegisters", (Proto.Fxn)om.findStrict("xdc.platform.IPeripheral$$getRegisters", "ti.catalog.msp430.peripherals.communication"), fxn);
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.Instance", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.Instance", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.Instance", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("clock", (Proto)om.findStrict("ti.catalog.msp430.peripherals.clock.IClock.Instance", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "wh");
        po.addFld("interruptEnableRegister2", (Proto)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.Instance", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "wh");
        po.addFld("UCB0I2CIE", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCBxI2CIE_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCNACKIE", om.find("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCNACKIE_OFF"), "UCSTPIE", om.find("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCSTPIE_OFF"), "UCSTTIE", om.find("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCSTTIE_OFF"), "UCALIE", om.find("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCALIE_OFF")), "wh");
        po.addFld("forceSetDefaultRegister", new Proto.Arr((Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"), false), Global.newArray(new Object[]{Global.newObject("register", "UCB0CTL0", "regForceSet", false), Global.newObject("register", "UCB0CTL1", "regForceSet", false), Global.newObject("register", "UCB0BR0", "regForceSet", false), Global.newObject("register", "UCB0BR1", "regForceSet", false), Global.newObject("register", "UCB0STAT", "regForceSet", false), Global.newObject("register", "UCB0RXBUF", "regForceSet", false), Global.newObject("register", "UCB0TXBUF", "regForceSet", false), Global.newObject("register", "UCB0I2COA", "regForceSet", false), Global.newObject("register", "UCB0I2CSA", "regForceSet", false), Global.newObject("register", "UCB0I2CIE", "regForceSet", false)}), "rh");
                fxn = Global.get(cap, "setUCTXIE");
                if (fxn != null) po.addFxn("setUCTXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$setUCTXIE", "ti.catalog.msp430.peripherals.communication"), fxn);
                fxn = Global.get(cap, "getUCTXIE");
                if (fxn != null) po.addFxn("getUCTXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$getUCTXIE", "ti.catalog.msp430.peripherals.communication"), fxn);
                fxn = Global.get(cap, "setUCRXIE");
                if (fxn != null) po.addFxn("setUCRXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$setUCRXIE", "ti.catalog.msp430.peripherals.communication"), fxn);
                fxn = Global.get(cap, "getUCRXIE");
                if (fxn != null) po.addFxn("getUCRXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$getUCRXIE", "ti.catalog.msp430.peripherals.communication"), fxn);
                po.addFxn("setUCNACKIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$setUCNACKIE", "ti.catalog.msp430.peripherals.communication"), Global.get(cap, "setUCNACKIE"));
                po.addFxn("getUCNACKIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$getUCNACKIE", "ti.catalog.msp430.peripherals.communication"), Global.get(cap, "getUCNACKIE"));
                po.addFxn("setUCSTPIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$setUCSTPIE", "ti.catalog.msp430.peripherals.communication"), Global.get(cap, "setUCSTPIE"));
                po.addFxn("getUCSTPIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$getUCSTPIE", "ti.catalog.msp430.peripherals.communication"), Global.get(cap, "getUCSTPIE"));
                po.addFxn("setUCSTTIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$setUCSTTIE", "ti.catalog.msp430.peripherals.communication"), Global.get(cap, "setUCSTTIE"));
                po.addFxn("getUCSTTIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$getUCSTTIE", "ti.catalog.msp430.peripherals.communication"), Global.get(cap, "getUCSTTIE"));
                po.addFxn("setUCALIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$setUCALIE", "ti.catalog.msp430.peripherals.communication"), Global.get(cap, "setUCALIE"));
                po.addFxn("getUCALIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$getUCALIE", "ti.catalog.msp430.peripherals.communication"), Global.get(cap, "getUCALIE"));
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$Params", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.Params", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C$$Params", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("clock", (Proto)om.findStrict("ti.catalog.msp430.peripherals.clock.IClock.Instance", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "wh");
        po.addFld("interruptEnableRegister2", (Proto)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.Instance", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "wh");
        po.addFld("UCB0I2CIE", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCBxI2CIE_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCNACKIE", om.find("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCNACKIE_OFF"), "UCSTPIE", om.find("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCSTPIE_OFF"), "UCSTTIE", om.find("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCSTTIE_OFF"), "UCALIE", om.find("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCALIE_OFF")), "wh");
        po.addFld("forceSetDefaultRegister", new Proto.Arr((Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"), false), Global.newArray(new Object[]{Global.newObject("register", "UCB0CTL0", "regForceSet", false), Global.newObject("register", "UCB0CTL1", "regForceSet", false), Global.newObject("register", "UCB0BR0", "regForceSet", false), Global.newObject("register", "UCB0BR1", "regForceSet", false), Global.newObject("register", "UCB0STAT", "regForceSet", false), Global.newObject("register", "UCB0RXBUF", "regForceSet", false), Global.newObject("register", "UCB0TXBUF", "regForceSet", false), Global.newObject("register", "UCB0I2COA", "regForceSet", false), Global.newObject("register", "UCB0I2CSA", "regForceSet", false), Global.newObject("register", "UCB0I2CIE", "regForceSet", false)}), "rh");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$Object", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.Object", om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.Instance", "ti.catalog.msp430.peripherals.communication"));
                fxn = Global.get(cap, "setUCTXIE");
                if (fxn != null) po.addFxn("setUCTXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$setUCTXIE", "ti.catalog.msp430.peripherals.communication"), fxn);
                fxn = Global.get(cap, "getUCTXIE");
                if (fxn != null) po.addFxn("getUCTXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$getUCTXIE", "ti.catalog.msp430.peripherals.communication"), fxn);
                fxn = Global.get(cap, "setUCRXIE");
                if (fxn != null) po.addFxn("setUCRXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$setUCRXIE", "ti.catalog.msp430.peripherals.communication"), fxn);
                fxn = Global.get(cap, "getUCRXIE");
                if (fxn != null) po.addFxn("getUCRXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$getUCRXIE", "ti.catalog.msp430.peripherals.communication"), fxn);
                po.addFxn("setUCNACKIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$setUCNACKIE", "ti.catalog.msp430.peripherals.communication"), Global.get(cap, "setUCNACKIE"));
                po.addFxn("getUCNACKIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$getUCNACKIE", "ti.catalog.msp430.peripherals.communication"), Global.get(cap, "getUCNACKIE"));
                po.addFxn("setUCSTPIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$setUCSTPIE", "ti.catalog.msp430.peripherals.communication"), Global.get(cap, "setUCSTPIE"));
                po.addFxn("getUCSTPIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$getUCSTPIE", "ti.catalog.msp430.peripherals.communication"), Global.get(cap, "getUCSTPIE"));
                po.addFxn("setUCSTTIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$setUCSTTIE", "ti.catalog.msp430.peripherals.communication"), Global.get(cap, "setUCSTTIE"));
                po.addFxn("getUCSTTIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$getUCSTTIE", "ti.catalog.msp430.peripherals.communication"), Global.get(cap, "getUCSTTIE"));
                po.addFxn("setUCALIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$setUCALIE", "ti.catalog.msp430.peripherals.communication"), Global.get(cap, "setUCALIE"));
                po.addFxn("getUCALIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$getUCALIE", "ti.catalog.msp430.peripherals.communication"), Global.get(cap, "getUCALIE"));
        // struct USCI_B0_I2C_2xx.UCBxI2CIE_t
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$UCBxI2CIE_t", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCBxI2CIE_t", null);
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFld("UCNACKIE", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCNACKIE_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCSTPIE", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCSTPIE_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCSTTIE", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCSTTIE_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
                po.addFld("UCALIE", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCALIE_t", "ti.catalog.msp430.peripherals.communication"), $$UNDEF, "w");
    }

    void USCI_A1_UART_2xx$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.Module", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.Module", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.Module", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("create", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx$$create", "ti.catalog.msp430.peripherals.communication"), Global.get("ti$catalog$msp430$peripherals$communication$USCI_A1_UART_2xx$$create"));
                po.addFxn("construct", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx$$construct", "ti.catalog.msp430.peripherals.communication"), Global.get("ti$catalog$msp430$peripherals$communication$USCI_A1_UART_2xx$$construct"));
                po.addFxn("addPeripheralsMap", (Proto.Fxn)om.findStrict("xdc.platform.IPeripheral$$addPeripheralsMap", "ti.catalog.msp430.peripherals.communication"), $$UNDEF);
                po.addFxn("getAll", (Proto.Fxn)om.findStrict("xdc.platform.IPeripheral$$getAll", "ti.catalog.msp430.peripherals.communication"), $$UNDEF);
                po.addFxn("getRegisters", (Proto.Fxn)om.findStrict("xdc.platform.IPeripheral$$getRegisters", "ti.catalog.msp430.peripherals.communication"), $$UNDEF);
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.Instance", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.Instance", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.Instance", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("forceSetDefaultRegister", new Proto.Arr((Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"), false), Global.newArray(new Object[]{Global.newObject("register", "UCA1CTL0", "regForceSet", false), Global.newObject("register", "UCA1CTL1", "regForceSet", false), Global.newObject("register", "UCA1BR0", "regForceSet", false), Global.newObject("register", "UCA1BR1", "regForceSet", false), Global.newObject("register", "UCA1MCTL", "regForceSet", false), Global.newObject("register", "UCA1STAT", "regForceSet", false), Global.newObject("register", "UCA1RXBUF", "regForceSet", false), Global.newObject("register", "UCA1TXBUF", "regForceSet", false), Global.newObject("register", "UCA1ABCTL", "regForceSet", false), Global.newObject("register", "UCA1IRTCTL", "regForceSet", false), Global.newObject("register", "UCA1IRRCTL", "regForceSet", false)}), "rh");
                po.addFxn("setUCTXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$setUCTXIE", "ti.catalog.msp430.peripherals.communication"), $$UNDEF);
                po.addFxn("getUCTXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$getUCTXIE", "ti.catalog.msp430.peripherals.communication"), $$UNDEF);
                po.addFxn("setUCRXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$setUCRXIE", "ti.catalog.msp430.peripherals.communication"), $$UNDEF);
                po.addFxn("getUCRXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$getUCRXIE", "ti.catalog.msp430.peripherals.communication"), $$UNDEF);
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx$$Params", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.Params", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART$$Params", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("forceSetDefaultRegister", new Proto.Arr((Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"), false), Global.newArray(new Object[]{Global.newObject("register", "UCA1CTL0", "regForceSet", false), Global.newObject("register", "UCA1CTL1", "regForceSet", false), Global.newObject("register", "UCA1BR0", "regForceSet", false), Global.newObject("register", "UCA1BR1", "regForceSet", false), Global.newObject("register", "UCA1MCTL", "regForceSet", false), Global.newObject("register", "UCA1STAT", "regForceSet", false), Global.newObject("register", "UCA1RXBUF", "regForceSet", false), Global.newObject("register", "UCA1TXBUF", "regForceSet", false), Global.newObject("register", "UCA1ABCTL", "regForceSet", false), Global.newObject("register", "UCA1IRTCTL", "regForceSet", false), Global.newObject("register", "UCA1IRRCTL", "regForceSet", false)}), "rh");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx$$Object", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.Object", om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.Instance", "ti.catalog.msp430.peripherals.communication"));
                po.addFxn("setUCTXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$setUCTXIE", "ti.catalog.msp430.peripherals.communication"), $$UNDEF);
                po.addFxn("getUCTXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$getUCTXIE", "ti.catalog.msp430.peripherals.communication"), $$UNDEF);
                po.addFxn("setUCRXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$setUCRXIE", "ti.catalog.msp430.peripherals.communication"), $$UNDEF);
                po.addFxn("getUCRXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$getUCRXIE", "ti.catalog.msp430.peripherals.communication"), $$UNDEF);
    }

    void IUSCI_A1_UART$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.Module", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.Module", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.Module", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.Instance", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.Instance", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.Instance", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("UCA1CTL0", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCPEN", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPEN_OFF"), "UCPAR", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPAR_OFF"), "UCMSB", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_OFF"), "UC7BIT", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_OFF"), "UCSPB", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSPB_OFF"), "UCMODE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_0"), "UCSYNC", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_OFF")), "wh");
        po.addFld("UCA1CTL1", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCSSEL", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_0"), "UCRXEIE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_OFF"), "UCBRKIE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_OFF"), "UCDORM", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_OFF"), "UCTXADDR", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_OFF"), "UCTXBRK", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_OFF"), "UCSWRST", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST")), "wh");
        po.addFld("UCA1MCTL", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCxMCTL_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCBRF", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_0"), "UCBRS", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_0"), "UCOS16", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCOS16_OFF")), "wh");
        po.addFld("UCA1STAT", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCLISTEN", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_OFF"), "UCFE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_OFF"), "UCOE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_OFF"), "UCPE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_OFF"), "UCBRK", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_OFF"), "UCRXERR", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_OFF"), "UCADDR", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_OFF"), "UCIDLE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_OFF"), "UCBUSY", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY")), "wh");
        po.addFld("UCA1IRTCTL", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCxIRTCTL_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCIRTXPL5", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL5_OFF"), "UCIRTXPL4", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL4_OFF"), "UCIRTXPL3", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL3_OFF"), "UCIRTXPL2", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL2_OFF"), "UCIRTXPL1", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL1_OFF"), "UCIRTXPL0", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL0_OFF"), "UCIRTXCLK", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXCLK_OFF"), "UCIREN", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIREN_OFF")), "wh");
        po.addFld("UCA1IRRCTL", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCxIRRCTL_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCIRRXFL5", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL5_OFF"), "UCIRRXFL4", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL4_OFF"), "UCIRRXFL3", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL3_OFF"), "UCIRRXFL2", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL2_OFF"), "UCIRRXFL1", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL1_OFF"), "UCIRRXFL0", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL0_OFF"), "UCIRRXPL", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXPL_OFF"), "UCIRRXFE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFE_OFF")), "wh");
        po.addFld("UCA1ABCTL", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCxABCTL_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCDELIM1", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM1_OFF"), "UCDELIM0", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM0_OFF"), "UCSTOE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSTOE_OFF"), "UCBTOE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBTOE_OFF"), "UCABDEN", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCABDEN_OFF")), "wh");
        po.addFld("UCA1RXBUF", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
        po.addFld("UCA1TXBUF", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
        po.addFld("UCA1BR0", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
        po.addFld("UCA1BR1", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART$$Params", "ti.catalog.msp430.peripherals.communication");
        po.init("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.Params", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART$$Params", "ti.catalog.msp430.peripherals.communication"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("UCA1CTL0", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCPEN", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPEN_OFF"), "UCPAR", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPAR_OFF"), "UCMSB", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_OFF"), "UC7BIT", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_OFF"), "UCSPB", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSPB_OFF"), "UCMODE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_0"), "UCSYNC", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_OFF")), "wh");
        po.addFld("UCA1CTL1", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCSSEL", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_0"), "UCRXEIE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_OFF"), "UCBRKIE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_OFF"), "UCDORM", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_OFF"), "UCTXADDR", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_OFF"), "UCTXBRK", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_OFF"), "UCSWRST", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST")), "wh");
        po.addFld("UCA1MCTL", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCxMCTL_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCBRF", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_0"), "UCBRS", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_0"), "UCOS16", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCOS16_OFF")), "wh");
        po.addFld("UCA1STAT", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCLISTEN", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_OFF"), "UCFE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_OFF"), "UCOE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_OFF"), "UCPE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_OFF"), "UCBRK", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_OFF"), "UCRXERR", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_OFF"), "UCADDR", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_OFF"), "UCIDLE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_OFF"), "UCBUSY", om.find("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY")), "wh");
        po.addFld("UCA1IRTCTL", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCxIRTCTL_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCIRTXPL5", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL5_OFF"), "UCIRTXPL4", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL4_OFF"), "UCIRTXPL3", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL3_OFF"), "UCIRTXPL2", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL2_OFF"), "UCIRTXPL1", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL1_OFF"), "UCIRTXPL0", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL0_OFF"), "UCIRTXCLK", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXCLK_OFF"), "UCIREN", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIREN_OFF")), "wh");
        po.addFld("UCA1IRRCTL", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCxIRRCTL_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCIRRXFL5", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL5_OFF"), "UCIRRXFL4", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL4_OFF"), "UCIRRXFL3", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL3_OFF"), "UCIRRXFL2", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL2_OFF"), "UCIRRXFL1", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL1_OFF"), "UCIRRXFL0", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL0_OFF"), "UCIRRXPL", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXPL_OFF"), "UCIRRXFE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFE_OFF")), "wh");
        po.addFld("UCA1ABCTL", (Proto)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.UCxABCTL_t", "ti.catalog.msp430.peripherals.communication"), Global.newObject("UCDELIM1", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM1_OFF"), "UCDELIM0", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM0_OFF"), "UCSTOE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSTOE_OFF"), "UCBTOE", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBTOE_OFF"), "UCABDEN", om.find("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCABDEN_OFF")), "wh");
        po.addFld("UCA1RXBUF", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
        po.addFld("UCA1TXBUF", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
        po.addFld("UCA1BR0", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
        po.addFld("UCA1BR1", Proto.Elm.newCNum("(xdc_UChar)"), 0L, "wh");
    }

    void IUSCI$$ROV()
    {
    }

    void IUSCI_UART$$ROV()
    {
    }

    void IUSCI_A0_UART$$ROV()
    {
    }

    void USCI_A0_UART_2xx$$ROV()
    {
    }

    void IUSCI_SPI$$ROV()
    {
    }

    void IUSCI_A0_SPI$$ROV()
    {
    }

    void USCI_A0_SPI_2xx$$ROV()
    {
    }

    void IUSCI_B0_SPI$$ROV()
    {
    }

    void USCI_B0_SPI_2xx$$ROV()
    {
    }

    void IUSCI_I2C$$ROV()
    {
    }

    void IUSCI_B0_I2C$$ROV()
    {
    }

    void USCI_B0_I2C_2xx$$ROV()
    {
    }

    void USCI_A1_UART_2xx$$ROV()
    {
    }

    void IUSCI_A1_UART$$ROV()
    {
    }

    void $$SINGLETONS()
    {
        pkgP.init("ti.catalog.msp430.peripherals.communication.Package", (Proto.Obj)om.findStrict("xdc.IPackage.Module", "ti.catalog.msp430.peripherals.communication"));
        pkgP.bind("$capsule", $$UNDEF);
        pkgV.init2(pkgP, "ti.catalog.msp430.peripherals.communication", Value.DEFAULT, false);
        pkgV.bind("$name", "ti.catalog.msp430.peripherals.communication");
        pkgV.bind("$category", "Package");
        pkgV.bind("$$qn", "ti.catalog.msp430.peripherals.communication.");
        pkgV.bind("$vers", Global.newArray());
        Value.Map atmap = (Value.Map)pkgV.getv("$attr");
        atmap.seal("length");
        imports.clear();
        imports.add(Global.newArray("ti.catalog.msp430.peripherals.clock", Global.newArray()));
        imports.add(Global.newArray("ti.catalog.msp430.peripherals.special_function", Global.newArray()));
        pkgV.bind("$imports", imports);
        StringBuilder sb = new StringBuilder();
        sb.append("var pkg = xdc.om['ti.catalog.msp430.peripherals.communication'];\n");
        sb.append("if (pkg.$vers.length >= 3) {\n");
            sb.append("pkg.$vers.push(Packages.xdc.services.global.Vers.getDate(xdc.csd() + '/..'));\n");
        sb.append("}\n");
        sb.append("pkg.build.libraries = [\n");
        sb.append("];\n");
        sb.append("pkg.build.libDesc = [\n");
        sb.append("];\n");
        sb.append("if('suffix' in xdc.om['xdc.IPackage$$LibDesc']) {\n");
        sb.append("}\n");
        Global.eval(sb.toString());
    }

    void IUSCI$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI", "ti.catalog.msp430.peripherals.communication");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.Module", "ti.catalog.msp430.peripherals.communication");
        vo.init2(po, "ti.catalog.msp430.peripherals.communication.IUSCI", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Interface");
        vo.bind("$capsule", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI$$capsule", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("Instance", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.Instance", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("Params", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.Params", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.Params", "ti.catalog.msp430.peripherals.communication")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.msp430.peripherals.communication", "ti.catalog.msp430.peripherals.communication"));
        tdefs.clear();
        proxies.clear();
        vo.bind("IPeripheralArray", om.findStrict("xdc.platform.IPeripheral.IPeripheralArray", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("StringArray", om.findStrict("xdc.platform.IPeripheral.StringArray", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_SYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_SYNC_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("ForceSetDefaultRegister_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_3", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_3", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        ((Value.Arr)pkgV.getv("$interfaces")).add(vo);
        pkgV.bind("IUSCI", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("IUSCI");
        vo.seal(null);
    }

    void IUSCI_UART$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART", "ti.catalog.msp430.peripherals.communication");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.Module", "ti.catalog.msp430.peripherals.communication");
        vo.init2(po, "ti.catalog.msp430.peripherals.communication.IUSCI_UART", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Interface");
        vo.bind("$capsule", $$UNDEF);
        vo.bind("Instance", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.Instance", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("Params", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.Params", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.Params", "ti.catalog.msp430.peripherals.communication")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.msp430.peripherals.communication", "ti.catalog.msp430.peripherals.communication"));
        tdefs.clear();
        proxies.clear();
        vo.bind("IPeripheralArray", om.findStrict("xdc.platform.IPeripheral.IPeripheralArray", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("StringArray", om.findStrict("xdc.platform.IPeripheral.StringArray", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_SYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_SYNC_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("ForceSetDefaultRegister_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPEN_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPAR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPAR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSPB_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSPB_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOS16_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCOS16_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL5_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL5_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL4_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL4_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL3_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL3_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL2_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL2_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL1_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL0_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXCLK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXCLK_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIREN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIREN_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL5_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL5_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL4_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL4_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL3_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL3_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL2_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL2_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL1_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL0_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXPL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXPL_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDELIM0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM0_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDELIM1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM1_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSTOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSTOE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBTOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBTOE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCABDEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCABDEN_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_ASYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_ASYNC_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_UART_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_UART_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxCTL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxCTL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxMCTL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxMCTL_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxMCTL_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxSTAT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxIRTCTL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxIRTCTL_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxIRTCTL_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxIRRCTL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxIRRCTL_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxIRRCTL_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxABCTL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxABCTL_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxABCTL_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_3", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_3", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPEN_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPEN_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPEN", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPEN", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPAR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPAR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPAR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPAR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSPB_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSPB_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSPB", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSPB", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_3", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_3", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_4", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_4", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_5", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_5", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_6", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_6", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_7", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_7", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_8", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_8", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_9", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_9", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_10", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_10", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_11", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_11", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_12", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_12", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_13", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_13", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_14", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_14", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_15", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_15", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_3", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_3", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_4", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_4", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_5", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_5", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_6", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_6", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_7", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_7", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOS16_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCOS16_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOS16", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCOS16", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL5_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL5_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL5", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL5", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL4_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL4_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL4", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL4", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL3_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL3_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL3", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL3", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL2_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL2_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL1_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL1_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL0_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL0_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXCLK_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXCLK_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXCLK", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXCLK", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIREN_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIREN_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIREN", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIREN", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL5_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL5_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL5", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL5", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL4_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL4_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL4", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL4", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL3_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL3_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL3", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL3", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL2_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL2_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL1_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL1_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL0_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL0_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXPL_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXPL_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXPL", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXPL", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDELIM0_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM0_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDELIM0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDELIM1_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM1_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDELIM1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSTOE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSTOE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSTOE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSTOE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBTOE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBTOE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBTOE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBTOE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCABDEN_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCABDEN_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCABDEN", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCABDEN", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_3", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_3", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        ((Value.Arr)pkgV.getv("$interfaces")).add(vo);
        pkgV.bind("IUSCI_UART", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("IUSCI_UART");
        vo.seal(null);
    }

    void IUSCI_A0_UART$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART", "ti.catalog.msp430.peripherals.communication");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.Module", "ti.catalog.msp430.peripherals.communication");
        vo.init2(po, "ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Interface");
        vo.bind("$capsule", $$UNDEF);
        vo.bind("Instance", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.Instance", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("Params", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.Params", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART.Params", "ti.catalog.msp430.peripherals.communication")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.msp430.peripherals.communication", "ti.catalog.msp430.peripherals.communication"));
        tdefs.clear();
        proxies.clear();
        vo.bind("IPeripheralArray", om.findStrict("xdc.platform.IPeripheral.IPeripheralArray", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("StringArray", om.findStrict("xdc.platform.IPeripheral.StringArray", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_SYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_SYNC_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("ForceSetDefaultRegister_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPEN_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPAR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPAR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSPB_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSPB_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOS16_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCOS16_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL5_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL5_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL4_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL4_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL3_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL3_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL2_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL2_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL1_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL0_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXCLK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXCLK_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIREN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIREN_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL5_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL5_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL4_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL4_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL3_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL3_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL2_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL2_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL1_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL0_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXPL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXPL_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDELIM0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM0_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDELIM1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM1_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSTOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSTOE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBTOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBTOE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCABDEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCABDEN_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_ASYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_ASYNC_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_UART_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_UART_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxCTL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxCTL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxMCTL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxMCTL_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxMCTL_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxSTAT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxIRTCTL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxIRTCTL_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxIRTCTL_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxIRRCTL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxIRRCTL_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxIRRCTL_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxABCTL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxABCTL_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxABCTL_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_3", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_3", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPEN_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPEN_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPEN", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPEN", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPAR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPAR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPAR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPAR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSPB_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSPB_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSPB", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSPB", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_3", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_3", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_4", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_4", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_5", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_5", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_6", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_6", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_7", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_7", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_8", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_8", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_9", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_9", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_10", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_10", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_11", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_11", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_12", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_12", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_13", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_13", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_14", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_14", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_15", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_15", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_3", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_3", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_4", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_4", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_5", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_5", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_6", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_6", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_7", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_7", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOS16_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCOS16_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOS16", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCOS16", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL5_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL5_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL5", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL5", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL4_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL4_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL4", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL4", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL3_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL3_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL3", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL3", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL2_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL2_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL1_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL1_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL0_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL0_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXCLK_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXCLK_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXCLK", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXCLK", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIREN_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIREN_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIREN", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIREN", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL5_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL5_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL5", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL5", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL4_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL4_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL4", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL4", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL3_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL3_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL3", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL3", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL2_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL2_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL1_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL1_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL0_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL0_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXPL_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXPL_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXPL", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXPL", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDELIM0_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM0_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDELIM0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDELIM1_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM1_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDELIM1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSTOE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSTOE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSTOE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSTOE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBTOE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBTOE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBTOE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBTOE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCABDEN_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCABDEN_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCABDEN", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCABDEN", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_3", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_3", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        ((Value.Arr)pkgV.getv("$interfaces")).add(vo);
        pkgV.bind("IUSCI_A0_UART", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("IUSCI_A0_UART");
        vo.seal(null);
    }

    void USCI_A0_UART_2xx$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx", "ti.catalog.msp430.peripherals.communication");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.Module", "ti.catalog.msp430.peripherals.communication");
        vo.init2(po, "ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx$$capsule", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("Instance", om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.Instance", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("Params", om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.Params", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.Params", "ti.catalog.msp430.peripherals.communication")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.msp430.peripherals.communication", "ti.catalog.msp430.peripherals.communication"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        vo.bind("IPeripheralArray", om.findStrict("xdc.platform.IPeripheral.IPeripheralArray", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("StringArray", om.findStrict("xdc.platform.IPeripheral.StringArray", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_SYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_SYNC_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("ForceSetDefaultRegister_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPEN_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPAR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPAR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSPB_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSPB_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOS16_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCOS16_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL5_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL5_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL4_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL4_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL3_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL3_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL2_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL2_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL1_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL0_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXCLK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXCLK_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIREN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIREN_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL5_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL5_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL4_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL4_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL3_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL3_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL2_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL2_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL1_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL0_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXPL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXPL_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDELIM0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM0_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDELIM1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM1_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSTOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSTOE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBTOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBTOE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCABDEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCABDEN_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_ASYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_ASYNC_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_UART_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_UART_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxCTL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxCTL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxMCTL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxMCTL_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxMCTL_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxSTAT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxIRTCTL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxIRTCTL_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxIRTCTL_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxIRRCTL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxIRRCTL_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxIRRCTL_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxABCTL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxABCTL_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxABCTL_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_3", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_3", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPEN_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPEN_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPEN", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPEN", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPAR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPAR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPAR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPAR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSPB_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSPB_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSPB", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSPB", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_3", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_3", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_4", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_4", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_5", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_5", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_6", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_6", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_7", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_7", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_8", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_8", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_9", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_9", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_10", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_10", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_11", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_11", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_12", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_12", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_13", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_13", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_14", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_14", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_15", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_15", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_3", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_3", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_4", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_4", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_5", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_5", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_6", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_6", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_7", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_7", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOS16_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCOS16_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOS16", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCOS16", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL5_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL5_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL5", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL5", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL4_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL4_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL4", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL4", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL3_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL3_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL3", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL3", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL2_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL2_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL1_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL1_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL0_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL0_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXCLK_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXCLK_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXCLK", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXCLK", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIREN_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIREN_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIREN", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIREN", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL5_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL5_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL5", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL5", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL4_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL4_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL4", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL4", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL3_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL3_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL3", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL3", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL2_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL2_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL1_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL1_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL0_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL0_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXPL_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXPL_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXPL", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXPL", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDELIM0_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM0_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDELIM0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDELIM1_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM1_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDELIM1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSTOE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSTOE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSTOE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSTOE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBTOE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBTOE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBTOE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBTOE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCABDEN_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCABDEN_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCABDEN", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCABDEN", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_3", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_3", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "ti.catalog.msp430.peripherals.communication")).add(vo);
        vo.bind("$$instflag", 1);
        vo.bind("$$iobjflag", 1);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 1);
        vo.bind("$$romcfgs", "|");
        Proto.Str ps = (Proto.Str)vo.find("Module_State");
        if (ps != null) vo.bind("$object", ps.newInstance());
        vo.bind("$$meta_iobj", om.has("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx$$instance$static$init", null) ? 1 : 0);
        vo.bind("$$fxntab", Global.newArray());
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray());
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.seal("length");
        vo.bind("Object", om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx.Object", "ti.catalog.msp430.peripherals.communication"));
        pkgV.bind("USCI_A0_UART_2xx", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("USCI_A0_UART_2xx");
    }

    void IUSCI_SPI$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI", "ti.catalog.msp430.peripherals.communication");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.Module", "ti.catalog.msp430.peripherals.communication");
        vo.init2(po, "ti.catalog.msp430.peripherals.communication.IUSCI_SPI", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Interface");
        vo.bind("$capsule", $$UNDEF);
        vo.bind("Instance", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.Instance", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("Params", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.Params", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.Params", "ti.catalog.msp430.peripherals.communication")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.msp430.peripherals.communication", "ti.catalog.msp430.peripherals.communication"));
        tdefs.clear();
        proxies.clear();
        vo.bind("IPeripheralArray", om.findStrict("xdc.platform.IPeripheral.IPeripheralArray", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("StringArray", om.findStrict("xdc.platform.IPeripheral.StringArray", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_SYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_SYNC_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("ForceSetDefaultRegister_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCCKPH_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPH_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCCKPL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPL_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCMST_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_SPI_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_SPI_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxCTL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxCTL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxSTAT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_3", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_3", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCCKPH_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPH_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCCKPH", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPH", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCCKPL_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPL_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCCKPL", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPL", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMST_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCMST_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMST", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCMST", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        ((Value.Arr)pkgV.getv("$interfaces")).add(vo);
        pkgV.bind("IUSCI_SPI", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("IUSCI_SPI");
        vo.seal(null);
    }

    void IUSCI_A0_SPI$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI", "ti.catalog.msp430.peripherals.communication");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.Module", "ti.catalog.msp430.peripherals.communication");
        vo.init2(po, "ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Interface");
        vo.bind("$capsule", $$UNDEF);
        vo.bind("Instance", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.Instance", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("Params", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.Params", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI.Params", "ti.catalog.msp430.peripherals.communication")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.msp430.peripherals.communication", "ti.catalog.msp430.peripherals.communication"));
        tdefs.clear();
        proxies.clear();
        vo.bind("IPeripheralArray", om.findStrict("xdc.platform.IPeripheral.IPeripheralArray", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("StringArray", om.findStrict("xdc.platform.IPeripheral.StringArray", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_SYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_SYNC_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("ForceSetDefaultRegister_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCCKPH_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPH_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCCKPL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPL_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCMST_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_SPI_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_SPI_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxCTL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxCTL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxSTAT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_3", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_3", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCCKPH_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPH_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCCKPH", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPH", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCCKPL_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPL_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCCKPL", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPL", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMST_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCMST_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMST", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCMST", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        ((Value.Arr)pkgV.getv("$interfaces")).add(vo);
        pkgV.bind("IUSCI_A0_SPI", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("IUSCI_A0_SPI");
        vo.seal(null);
    }

    void USCI_A0_SPI_2xx$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx", "ti.catalog.msp430.peripherals.communication");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.Module", "ti.catalog.msp430.peripherals.communication");
        vo.init2(po, "ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx$$capsule", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("Instance", om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.Instance", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("Params", om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.Params", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.Params", "ti.catalog.msp430.peripherals.communication")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.msp430.peripherals.communication", "ti.catalog.msp430.peripherals.communication"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        vo.bind("IPeripheralArray", om.findStrict("xdc.platform.IPeripheral.IPeripheralArray", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("StringArray", om.findStrict("xdc.platform.IPeripheral.StringArray", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_SYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_SYNC_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("ForceSetDefaultRegister_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCCKPH_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPH_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCCKPL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPL_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCMST_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_SPI_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_SPI_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxCTL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxCTL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxSTAT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_3", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_3", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCCKPH_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPH_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCCKPH", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPH", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCCKPL_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPL_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCCKPL", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPL", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMST_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCMST_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMST", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCMST", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "ti.catalog.msp430.peripherals.communication")).add(vo);
        vo.bind("$$instflag", 1);
        vo.bind("$$iobjflag", 1);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 1);
        vo.bind("$$romcfgs", "|");
        Proto.Str ps = (Proto.Str)vo.find("Module_State");
        if (ps != null) vo.bind("$object", ps.newInstance());
        vo.bind("$$meta_iobj", om.has("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx$$instance$static$init", null) ? 1 : 0);
        vo.bind("$$fxntab", Global.newArray());
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray());
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.seal("length");
        vo.bind("Object", om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx.Object", "ti.catalog.msp430.peripherals.communication"));
        pkgV.bind("USCI_A0_SPI_2xx", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("USCI_A0_SPI_2xx");
    }

    void IUSCI_B0_SPI$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI", "ti.catalog.msp430.peripherals.communication");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.Module", "ti.catalog.msp430.peripherals.communication");
        vo.init2(po, "ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Interface");
        vo.bind("$capsule", $$UNDEF);
        vo.bind("Instance", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.Instance", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("Params", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.Params", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI.Params", "ti.catalog.msp430.peripherals.communication")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.msp430.peripherals.communication", "ti.catalog.msp430.peripherals.communication"));
        tdefs.clear();
        proxies.clear();
        vo.bind("IPeripheralArray", om.findStrict("xdc.platform.IPeripheral.IPeripheralArray", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("StringArray", om.findStrict("xdc.platform.IPeripheral.StringArray", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_SYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_SYNC_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("ForceSetDefaultRegister_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCCKPH_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPH_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCCKPL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPL_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCMST_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_SPI_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_SPI_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxCTL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxCTL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxSTAT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_3", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_3", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCCKPH_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPH_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCCKPH", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPH", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCCKPL_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPL_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCCKPL", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPL", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMST_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCMST_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMST", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCMST", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        ((Value.Arr)pkgV.getv("$interfaces")).add(vo);
        pkgV.bind("IUSCI_B0_SPI", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("IUSCI_B0_SPI");
        vo.seal(null);
    }

    void USCI_B0_SPI_2xx$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx", "ti.catalog.msp430.peripherals.communication");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.Module", "ti.catalog.msp430.peripherals.communication");
        vo.init2(po, "ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx$$capsule", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("Instance", om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.Instance", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("Params", om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.Params", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.Params", "ti.catalog.msp430.peripherals.communication")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.msp430.peripherals.communication", "ti.catalog.msp430.peripherals.communication"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        vo.bind("IPeripheralArray", om.findStrict("xdc.platform.IPeripheral.IPeripheralArray", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("StringArray", om.findStrict("xdc.platform.IPeripheral.StringArray", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_SYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_SYNC_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("ForceSetDefaultRegister_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCCKPH_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPH_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCCKPL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPL_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCMST_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_SPI_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_SPI_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxCTL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxCTL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxSTAT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_3", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_3", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCCKPH_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPH_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCCKPH", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPH", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCCKPL_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPL_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCCKPL", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCCKPL", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMST_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCMST_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMST", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCMST", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_SPI.UCSSEL_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "ti.catalog.msp430.peripherals.communication")).add(vo);
        vo.bind("$$instflag", 1);
        vo.bind("$$iobjflag", 1);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 1);
        vo.bind("$$romcfgs", "|");
        Proto.Str ps = (Proto.Str)vo.find("Module_State");
        if (ps != null) vo.bind("$object", ps.newInstance());
        vo.bind("$$meta_iobj", om.has("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx$$instance$static$init", null) ? 1 : 0);
        vo.bind("$$fxntab", Global.newArray());
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray());
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.seal("length");
        vo.bind("Object", om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx.Object", "ti.catalog.msp430.peripherals.communication"));
        pkgV.bind("USCI_B0_SPI_2xx", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("USCI_B0_SPI_2xx");
    }

    void IUSCI_I2C$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C", "ti.catalog.msp430.peripherals.communication");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.Module", "ti.catalog.msp430.peripherals.communication");
        vo.init2(po, "ti.catalog.msp430.peripherals.communication.IUSCI_I2C", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Interface");
        vo.bind("$capsule", $$UNDEF);
        vo.bind("Instance", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.Instance", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("Params", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.Params", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.Params", "ti.catalog.msp430.peripherals.communication")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.msp430.peripherals.communication", "ti.catalog.msp430.peripherals.communication"));
        tdefs.clear();
        proxies.clear();
        vo.bind("IPeripheralArray", om.findStrict("xdc.platform.IPeripheral.IPeripheralArray", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("StringArray", om.findStrict("xdc.platform.IPeripheral.StringArray", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_SYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_SYNC_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("ForceSetDefaultRegister_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCA10_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCA10_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSLA10_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSLA10_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMM_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMM_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMST_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_I2C_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSSEL_I2C_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXNACK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXNACK_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXSTP_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTP_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXSTT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTT_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSCLLOW_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSCLLOW_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCGC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGC_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBBUSY_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCBBUSY_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCNACKIFG_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCNACKIFG_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSTPIFG_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTPIFG_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSTTIFG_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTTIFG_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCALIFG_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCALIFG_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCGCEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGCEN_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxCTL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxCTL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxSTAT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBxI2COA_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCBxI2COA_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCBxI2COA_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_3", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_3", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCA10_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCA10_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCA10", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCA10", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSLA10_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSLA10_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSLA10", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSLA10", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMM_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMM_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMM", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMM", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMST_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMST_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMST", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMST", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSSEL_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSSEL_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSSEL_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXNACK_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXNACK_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXNACK", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXNACK", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXSTP_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTP_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXSTP", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTP", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXSTT_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTT_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXSTT", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTT", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSCLLOW_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSCLLOW_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSCLLOW", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSCLLOW", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCGC_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGC_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCGC", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGC", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBBUSY_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCBBUSY_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBBUSY", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCBBUSY", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCNACKIFG_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCNACKIFG_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCNACKIFG", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCNACKIFG", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSTPIFG_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTPIFG_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSTPIFG", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTPIFG", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSTTIFG_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTTIFG_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSTTIFG", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTTIFG", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCALIFG_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCALIFG_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCALIFG", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCALIFG", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCGCEN_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGCEN_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCGCEN", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGCEN", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        ((Value.Arr)pkgV.getv("$interfaces")).add(vo);
        pkgV.bind("IUSCI_I2C", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("IUSCI_I2C");
        vo.seal(null);
    }

    void IUSCI_B0_I2C$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C", "ti.catalog.msp430.peripherals.communication");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.Module", "ti.catalog.msp430.peripherals.communication");
        vo.init2(po, "ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Interface");
        vo.bind("$capsule", $$UNDEF);
        vo.bind("Instance", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.Instance", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("Params", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.Params", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C.Params", "ti.catalog.msp430.peripherals.communication")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.msp430.peripherals.communication", "ti.catalog.msp430.peripherals.communication"));
        tdefs.clear();
        proxies.clear();
        vo.bind("IPeripheralArray", om.findStrict("xdc.platform.IPeripheral.IPeripheralArray", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("StringArray", om.findStrict("xdc.platform.IPeripheral.StringArray", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_SYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_SYNC_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("ForceSetDefaultRegister_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCA10_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCA10_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSLA10_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSLA10_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMM_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMM_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMST_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_I2C_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSSEL_I2C_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXNACK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXNACK_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXSTP_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTP_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXSTT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTT_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSCLLOW_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSCLLOW_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCGC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGC_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBBUSY_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCBBUSY_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCNACKIFG_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCNACKIFG_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSTPIFG_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTPIFG_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSTTIFG_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTTIFG_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCALIFG_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCALIFG_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCGCEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGCEN_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxCTL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxCTL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxSTAT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBxI2COA_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCBxI2COA_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCBxI2COA_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_3", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_3", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCA10_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCA10_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCA10", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCA10", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSLA10_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSLA10_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSLA10", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSLA10", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMM_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMM_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMM", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMM", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMST_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMST_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMST", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMST", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSSEL_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSSEL_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSSEL_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXNACK_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXNACK_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXNACK", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXNACK", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXSTP_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTP_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXSTP", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTP", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXSTT_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTT_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXSTT", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTT", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSCLLOW_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSCLLOW_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSCLLOW", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSCLLOW", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCGC_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGC_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCGC", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGC", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBBUSY_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCBBUSY_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBBUSY", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCBBUSY", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCNACKIFG_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCNACKIFG_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCNACKIFG", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCNACKIFG", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSTPIFG_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTPIFG_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSTPIFG", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTPIFG", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSTTIFG_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTTIFG_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSTTIFG", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTTIFG", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCALIFG_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCALIFG_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCALIFG", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCALIFG", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCGCEN_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGCEN_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCGCEN", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGCEN", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        ((Value.Arr)pkgV.getv("$interfaces")).add(vo);
        pkgV.bind("IUSCI_B0_I2C", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("IUSCI_B0_I2C");
        vo.seal(null);
    }

    void USCI_B0_I2C_2xx$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx", "ti.catalog.msp430.peripherals.communication");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.Module", "ti.catalog.msp430.peripherals.communication");
        vo.init2(po, "ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$capsule", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("Instance", om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.Instance", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("Params", om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.Params", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.Params", "ti.catalog.msp430.peripherals.communication")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.msp430.peripherals.communication", "ti.catalog.msp430.peripherals.communication"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        vo.bind("IPeripheralArray", om.findStrict("xdc.platform.IPeripheral.IPeripheralArray", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("StringArray", om.findStrict("xdc.platform.IPeripheral.StringArray", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_SYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_SYNC_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("ForceSetDefaultRegister_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCA10_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCA10_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSLA10_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSLA10_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMM_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMM_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMST_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_I2C_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSSEL_I2C_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXNACK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXNACK_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXSTP_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTP_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXSTT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTT_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSCLLOW_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSCLLOW_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCGC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGC_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBBUSY_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCBBUSY_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCNACKIFG_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCNACKIFG_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSTPIFG_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTPIFG_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSTTIFG_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTTIFG_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCALIFG_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCALIFG_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCGCEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGCEN_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxCTL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxCTL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxSTAT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBxI2COA_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCBxI2COA_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCBxI2COA_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCNACKIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCNACKIE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSTPIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCSTPIE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSTTIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCSTTIE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCALIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCALIE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBxI2CIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCBxI2CIE_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCBxI2CIE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_3", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_3", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCA10_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCA10_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCA10", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCA10", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSLA10_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSLA10_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSLA10", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSLA10", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMM_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMM_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMM", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMM", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMST_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMST_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMST", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCMST", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSSEL_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSSEL_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSSEL_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXNACK_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXNACK_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXNACK", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXNACK", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXSTP_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTP_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXSTP", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTP", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXSTT_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTT_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXSTT", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCTXSTT", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSCLLOW_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSCLLOW_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSCLLOW", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSCLLOW", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCGC_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGC_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCGC", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGC", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBBUSY_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCBBUSY_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBBUSY", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCBBUSY", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCNACKIFG_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCNACKIFG_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCNACKIFG", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCNACKIFG", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSTPIFG_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTPIFG_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSTPIFG", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTPIFG", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSTTIFG_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTTIFG_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSTTIFG", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCSTTIFG", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCALIFG_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCALIFG_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCALIFG", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCALIFG", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCGCEN_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGCEN_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCGCEN", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_I2C.UCGCEN", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCNACKIE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCNACKIE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCNACKIE", om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCNACKIE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSTPIE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCSTPIE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSTPIE", om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCSTPIE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSTTIE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCSTTIE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSTTIE", om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCSTTIE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCALIE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCALIE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCALIE", om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.UCALIE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "ti.catalog.msp430.peripherals.communication")).add(vo);
        vo.bind("$$instflag", 1);
        vo.bind("$$iobjflag", 1);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 1);
        vo.bind("$$romcfgs", "|");
        Proto.Str ps = (Proto.Str)vo.find("Module_State");
        if (ps != null) vo.bind("$object", ps.newInstance());
        vo.bind("$$meta_iobj", om.has("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx$$instance$static$init", null) ? 1 : 0);
        vo.bind("$$fxntab", Global.newArray());
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray());
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.seal("length");
        vo.bind("Object", om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx.Object", "ti.catalog.msp430.peripherals.communication"));
        pkgV.bind("USCI_B0_I2C_2xx", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("USCI_B0_I2C_2xx");
    }

    void USCI_A1_UART_2xx$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx", "ti.catalog.msp430.peripherals.communication");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.Module", "ti.catalog.msp430.peripherals.communication");
        vo.init2(po, "ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", $$UNDEF);
        vo.bind("Instance", om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.Instance", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("Params", om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.Params", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.Params", "ti.catalog.msp430.peripherals.communication")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.msp430.peripherals.communication", "ti.catalog.msp430.peripherals.communication"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        vo.bind("IPeripheralArray", om.findStrict("xdc.platform.IPeripheral.IPeripheralArray", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("StringArray", om.findStrict("xdc.platform.IPeripheral.StringArray", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_SYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_SYNC_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("ForceSetDefaultRegister_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPEN_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPAR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPAR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSPB_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSPB_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOS16_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCOS16_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL5_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL5_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL4_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL4_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL3_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL3_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL2_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL2_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL1_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL0_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXCLK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXCLK_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIREN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIREN_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL5_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL5_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL4_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL4_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL3_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL3_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL2_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL2_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL1_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL0_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXPL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXPL_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDELIM0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM0_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDELIM1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM1_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSTOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSTOE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBTOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBTOE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCABDEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCABDEN_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_ASYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_ASYNC_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_UART_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_UART_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxCTL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxCTL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxMCTL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxMCTL_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxMCTL_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxSTAT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxIRTCTL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxIRTCTL_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxIRTCTL_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxIRRCTL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxIRRCTL_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxIRRCTL_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxABCTL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxABCTL_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxABCTL_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_3", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_3", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPEN_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPEN_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPEN", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPEN", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPAR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPAR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPAR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPAR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSPB_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSPB_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSPB", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSPB", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_3", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_3", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_4", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_4", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_5", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_5", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_6", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_6", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_7", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_7", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_8", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_8", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_9", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_9", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_10", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_10", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_11", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_11", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_12", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_12", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_13", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_13", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_14", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_14", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_15", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_15", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_3", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_3", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_4", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_4", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_5", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_5", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_6", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_6", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_7", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_7", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOS16_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCOS16_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOS16", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCOS16", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL5_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL5_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL5", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL5", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL4_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL4_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL4", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL4", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL3_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL3_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL3", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL3", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL2_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL2_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL1_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL1_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL0_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL0_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXCLK_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXCLK_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXCLK", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXCLK", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIREN_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIREN_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIREN", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIREN", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL5_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL5_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL5", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL5", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL4_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL4_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL4", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL4", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL3_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL3_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL3", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL3", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL2_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL2_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL1_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL1_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL0_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL0_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXPL_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXPL_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXPL", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXPL", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDELIM0_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM0_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDELIM0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDELIM1_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM1_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDELIM1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSTOE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSTOE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSTOE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSTOE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBTOE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBTOE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBTOE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBTOE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCABDEN_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCABDEN_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCABDEN", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCABDEN", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_3", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_3", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "ti.catalog.msp430.peripherals.communication")).add(vo);
        vo.bind("$$instflag", 1);
        vo.bind("$$iobjflag", 1);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 1);
        vo.bind("$$romcfgs", "|");
        Proto.Str ps = (Proto.Str)vo.find("Module_State");
        if (ps != null) vo.bind("$object", ps.newInstance());
        vo.bind("$$meta_iobj", om.has("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx$$instance$static$init", null) ? 1 : 0);
        vo.bind("$$fxntab", Global.newArray());
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray());
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.seal("length");
        vo.bind("Object", om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx.Object", "ti.catalog.msp430.peripherals.communication"));
        pkgV.bind("USCI_A1_UART_2xx", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("USCI_A1_UART_2xx");
    }

    void IUSCI_A1_UART$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART", "ti.catalog.msp430.peripherals.communication");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.Module", "ti.catalog.msp430.peripherals.communication");
        vo.init2(po, "ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Interface");
        vo.bind("$capsule", $$UNDEF);
        vo.bind("Instance", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.Instance", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("Params", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.Params", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART.Params", "ti.catalog.msp430.peripherals.communication")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.msp430.peripherals.communication", "ti.catalog.msp430.peripherals.communication"));
        tdefs.clear();
        proxies.clear();
        vo.bind("IPeripheralArray", om.findStrict("xdc.platform.IPeripheral.IPeripheralArray", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("StringArray", om.findStrict("xdc.platform.IPeripheral.StringArray", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_SYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_SYNC_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("ForceSetDefaultRegister_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPEN_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPAR_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPAR_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSPB_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSPB_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOS16_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCOS16_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL5_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL5_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL4_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL4_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL3_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL3_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL2_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL2_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL1_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL0_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXCLK_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXCLK_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIREN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIREN_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL5_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL5_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL4_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL4_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL3_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL3_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL2_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL2_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL1_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL0_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXPL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXPL_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDELIM0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM0_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDELIM1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM1_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSTOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSTOE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBTOE_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBTOE_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCABDEN_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCABDEN_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_ASYNC_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_ASYNC_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_UART_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_UART_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxCTL0_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxCTL0_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxCTL1_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxCTL1_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxMCTL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxMCTL_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxMCTL_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxSTAT_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxSTAT_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxIRTCTL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxIRTCTL_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxIRTCTL_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxIRRCTL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxIRRCTL_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxIRRCTL_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCxABCTL_t", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxABCTL_t", "ti.catalog.msp430.peripherals.communication"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCxABCTL_t", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMSB", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMSB", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UC7BIT", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UC7BIT", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSYNC", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSYNC", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXEIE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXEIE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRKIE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRKIE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDORM", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCDORM", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXADDR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXADDR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCTXBRK", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCTXBRK", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSWRST", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCSWRST", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCLISTEN", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCLISTEN", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCFE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCFE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCOE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCPE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRK", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBRK", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCRXERR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCRXERR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCADDR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCADDR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIDLE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCIDLE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBUSY", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCBUSY", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_3", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI.UCMODE_3", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPEN_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPEN_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPEN", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPEN", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPAR_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPAR_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCPAR", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCPAR", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSPB_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSPB_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSPB", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSPB", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_3", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_3", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_4", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_4", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_5", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_5", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_6", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_6", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_7", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_7", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_8", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_8", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_9", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_9", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_10", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_10", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_11", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_11", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_12", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_12", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_13", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_13", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_14", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_14", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRF_15", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRF_15", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_3", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_3", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_4", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_4", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_5", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_5", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_6", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_6", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBRS_7", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBRS_7", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOS16_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCOS16_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCOS16", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCOS16", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL5_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL5_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL5", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL5", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL4_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL4_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL4", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL4", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL3_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL3_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL3", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL3", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL2_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL2_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL1_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL1_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL0_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL0_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXPL0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXPL0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXCLK_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXCLK_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRTXCLK", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRTXCLK", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIREN_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIREN_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIREN", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIREN", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL5_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL5_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL5", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL5", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL4_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL4_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL4", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL4", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL3_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL3_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL3", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL3", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL2_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL2_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL1_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL1_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL0_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL0_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFL0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFL0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXPL_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXPL_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXPL", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXPL", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCIRRXFE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCIRRXFE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDELIM0_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM0_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDELIM0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDELIM1_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM1_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCDELIM1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCDELIM1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSTOE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSTOE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSTOE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSTOE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBTOE_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBTOE_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCBTOE", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCBTOE", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCABDEN_OFF", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCABDEN_OFF", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCABDEN", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCABDEN", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCMODE_3", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCMODE_3", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_0", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_0", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_1", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_1", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("UCSSEL_2", om.findStrict("ti.catalog.msp430.peripherals.communication.IUSCI_UART.UCSSEL_2", "ti.catalog.msp430.peripherals.communication"));
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        ((Value.Arr)pkgV.getv("$interfaces")).add(vo);
        pkgV.bind("IUSCI_A1_UART", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("IUSCI_A1_UART");
        vo.seal(null);
    }

    void $$INITIALIZATION()
    {
        Value.Obj vo;

        if (isCFG) {
        }//isCFG
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx", "ti.catalog.msp430.peripherals.communication"));
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx", "ti.catalog.msp430.peripherals.communication"));
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx", "ti.catalog.msp430.peripherals.communication"));
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx", "ti.catalog.msp430.peripherals.communication"));
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx", "ti.catalog.msp430.peripherals.communication"));
        Global.callFxn("init", pkgV);
        ((Value.Obj)om.getv("ti.catalog.msp430.peripherals.communication.IUSCI")).bless();
        ((Value.Obj)om.getv("ti.catalog.msp430.peripherals.communication.IUSCI_UART")).bless();
        ((Value.Obj)om.getv("ti.catalog.msp430.peripherals.communication.IUSCI_A0_UART")).bless();
        ((Value.Obj)om.getv("ti.catalog.msp430.peripherals.communication.USCI_A0_UART_2xx")).bless();
        ((Value.Obj)om.getv("ti.catalog.msp430.peripherals.communication.IUSCI_SPI")).bless();
        ((Value.Obj)om.getv("ti.catalog.msp430.peripherals.communication.IUSCI_A0_SPI")).bless();
        ((Value.Obj)om.getv("ti.catalog.msp430.peripherals.communication.USCI_A0_SPI_2xx")).bless();
        ((Value.Obj)om.getv("ti.catalog.msp430.peripherals.communication.IUSCI_B0_SPI")).bless();
        ((Value.Obj)om.getv("ti.catalog.msp430.peripherals.communication.USCI_B0_SPI_2xx")).bless();
        ((Value.Obj)om.getv("ti.catalog.msp430.peripherals.communication.IUSCI_I2C")).bless();
        ((Value.Obj)om.getv("ti.catalog.msp430.peripherals.communication.IUSCI_B0_I2C")).bless();
        ((Value.Obj)om.getv("ti.catalog.msp430.peripherals.communication.USCI_B0_I2C_2xx")).bless();
        ((Value.Obj)om.getv("ti.catalog.msp430.peripherals.communication.USCI_A1_UART_2xx")).bless();
        ((Value.Obj)om.getv("ti.catalog.msp430.peripherals.communication.IUSCI_A1_UART")).bless();
        ((Value.Arr)om.findStrict("$packages", "ti.catalog.msp430.peripherals.communication")).add(pkgV);
    }

    public void exec( Scriptable xdcO, Session ses )
    {
        this.xdcO = xdcO;
        this.ses = ses;
        om = (Value.Obj)xdcO.get("om", null);

        Object o = om.geto("$name");
        String s = o instanceof String ? (String)o : null;
        isCFG = s != null && s.equals("cfg");
        isROV = s != null && s.equals("rov");

        $$IMPORTS();
        $$OBJECTS();
        IUSCI$$OBJECTS();
        IUSCI_UART$$OBJECTS();
        IUSCI_A0_UART$$OBJECTS();
        USCI_A0_UART_2xx$$OBJECTS();
        IUSCI_SPI$$OBJECTS();
        IUSCI_A0_SPI$$OBJECTS();
        USCI_A0_SPI_2xx$$OBJECTS();
        IUSCI_B0_SPI$$OBJECTS();
        USCI_B0_SPI_2xx$$OBJECTS();
        IUSCI_I2C$$OBJECTS();
        IUSCI_B0_I2C$$OBJECTS();
        USCI_B0_I2C_2xx$$OBJECTS();
        USCI_A1_UART_2xx$$OBJECTS();
        IUSCI_A1_UART$$OBJECTS();
        IUSCI$$CONSTS();
        IUSCI_UART$$CONSTS();
        IUSCI_A0_UART$$CONSTS();
        USCI_A0_UART_2xx$$CONSTS();
        IUSCI_SPI$$CONSTS();
        IUSCI_A0_SPI$$CONSTS();
        USCI_A0_SPI_2xx$$CONSTS();
        IUSCI_B0_SPI$$CONSTS();
        USCI_B0_SPI_2xx$$CONSTS();
        IUSCI_I2C$$CONSTS();
        IUSCI_B0_I2C$$CONSTS();
        USCI_B0_I2C_2xx$$CONSTS();
        USCI_A1_UART_2xx$$CONSTS();
        IUSCI_A1_UART$$CONSTS();
        IUSCI$$CREATES();
        IUSCI_UART$$CREATES();
        IUSCI_A0_UART$$CREATES();
        USCI_A0_UART_2xx$$CREATES();
        IUSCI_SPI$$CREATES();
        IUSCI_A0_SPI$$CREATES();
        USCI_A0_SPI_2xx$$CREATES();
        IUSCI_B0_SPI$$CREATES();
        USCI_B0_SPI_2xx$$CREATES();
        IUSCI_I2C$$CREATES();
        IUSCI_B0_I2C$$CREATES();
        USCI_B0_I2C_2xx$$CREATES();
        USCI_A1_UART_2xx$$CREATES();
        IUSCI_A1_UART$$CREATES();
        IUSCI$$FUNCTIONS();
        IUSCI_UART$$FUNCTIONS();
        IUSCI_A0_UART$$FUNCTIONS();
        USCI_A0_UART_2xx$$FUNCTIONS();
        IUSCI_SPI$$FUNCTIONS();
        IUSCI_A0_SPI$$FUNCTIONS();
        USCI_A0_SPI_2xx$$FUNCTIONS();
        IUSCI_B0_SPI$$FUNCTIONS();
        USCI_B0_SPI_2xx$$FUNCTIONS();
        IUSCI_I2C$$FUNCTIONS();
        IUSCI_B0_I2C$$FUNCTIONS();
        USCI_B0_I2C_2xx$$FUNCTIONS();
        USCI_A1_UART_2xx$$FUNCTIONS();
        IUSCI_A1_UART$$FUNCTIONS();
        IUSCI$$SIZES();
        IUSCI_UART$$SIZES();
        IUSCI_A0_UART$$SIZES();
        USCI_A0_UART_2xx$$SIZES();
        IUSCI_SPI$$SIZES();
        IUSCI_A0_SPI$$SIZES();
        USCI_A0_SPI_2xx$$SIZES();
        IUSCI_B0_SPI$$SIZES();
        USCI_B0_SPI_2xx$$SIZES();
        IUSCI_I2C$$SIZES();
        IUSCI_B0_I2C$$SIZES();
        USCI_B0_I2C_2xx$$SIZES();
        USCI_A1_UART_2xx$$SIZES();
        IUSCI_A1_UART$$SIZES();
        IUSCI$$TYPES();
        IUSCI_UART$$TYPES();
        IUSCI_A0_UART$$TYPES();
        USCI_A0_UART_2xx$$TYPES();
        IUSCI_SPI$$TYPES();
        IUSCI_A0_SPI$$TYPES();
        USCI_A0_SPI_2xx$$TYPES();
        IUSCI_B0_SPI$$TYPES();
        USCI_B0_SPI_2xx$$TYPES();
        IUSCI_I2C$$TYPES();
        IUSCI_B0_I2C$$TYPES();
        USCI_B0_I2C_2xx$$TYPES();
        USCI_A1_UART_2xx$$TYPES();
        IUSCI_A1_UART$$TYPES();
        if (isROV) {
            IUSCI$$ROV();
            IUSCI_UART$$ROV();
            IUSCI_A0_UART$$ROV();
            USCI_A0_UART_2xx$$ROV();
            IUSCI_SPI$$ROV();
            IUSCI_A0_SPI$$ROV();
            USCI_A0_SPI_2xx$$ROV();
            IUSCI_B0_SPI$$ROV();
            USCI_B0_SPI_2xx$$ROV();
            IUSCI_I2C$$ROV();
            IUSCI_B0_I2C$$ROV();
            USCI_B0_I2C_2xx$$ROV();
            USCI_A1_UART_2xx$$ROV();
            IUSCI_A1_UART$$ROV();
        }//isROV
        $$SINGLETONS();
        IUSCI$$SINGLETONS();
        IUSCI_UART$$SINGLETONS();
        IUSCI_A0_UART$$SINGLETONS();
        USCI_A0_UART_2xx$$SINGLETONS();
        IUSCI_SPI$$SINGLETONS();
        IUSCI_A0_SPI$$SINGLETONS();
        USCI_A0_SPI_2xx$$SINGLETONS();
        IUSCI_B0_SPI$$SINGLETONS();
        USCI_B0_SPI_2xx$$SINGLETONS();
        IUSCI_I2C$$SINGLETONS();
        IUSCI_B0_I2C$$SINGLETONS();
        USCI_B0_I2C_2xx$$SINGLETONS();
        USCI_A1_UART_2xx$$SINGLETONS();
        IUSCI_A1_UART$$SINGLETONS();
        $$INITIALIZATION();
    }
}
