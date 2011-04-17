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

public class ti_catalog_msp430_peripherals_adc
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
        Global.callFxn("loadPackage", xdcO, "xdc");
        Global.callFxn("loadPackage", xdcO, "xdc.corevers");
        Global.callFxn("loadPackage", xdcO, "ti.catalog.msp430.peripherals.clock");
        Global.callFxn("loadPackage", xdcO, "xdc.platform");
        Global.callFxn("loadPackage", xdcO, "ti.catalog.msp430.peripherals.timer");
    }

    void $$OBJECTS()
    {
        pkgP = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.adc.Package", new Proto.Obj());
        pkgV = (Value.Obj)om.bind("ti.catalog.msp430.peripherals.adc", new Value.Obj("ti.catalog.msp430.peripherals.adc", pkgP));
    }

    void IADC$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.adc.IADC.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.msp430.peripherals.adc.IADC", new Value.Obj("ti.catalog.msp430.peripherals.adc.IADC", po));
        pkgV.bind("IADC", vo);
        // decls 
        spo = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.adc.IADC$$ForceSetDefaultRegister_t", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.adc.IADC.ForceSetDefaultRegister_t", new Proto.Str(spo, true));
        // insts 
        Object insP = om.bind("ti.catalog.msp430.peripherals.adc.IADC.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.adc.IADC$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.msp430.peripherals.adc.IADC.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.adc.IADC$$Params", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.adc.IADC.Params", new Proto.Str(po, true));
    }

    void ADC10$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.adc.ADC10.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.msp430.peripherals.adc.ADC10", new Value.Obj("ti.catalog.msp430.peripherals.adc.ADC10", po));
        pkgV.bind("ADC10", vo);
        // decls 
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ForceSetDefaultRegister_t", om.findStrict("ti.catalog.msp430.peripherals.adc.IADC.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.adc"));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SC_t", new Proto.Enm("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SC_t"));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ENC_t", new Proto.Enm("ti.catalog.msp430.peripherals.adc.ADC10.ENC_t"));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10IFG_t", new Proto.Enm("ti.catalog.msp430.peripherals.adc.ADC10.ADC10IFG_t"));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10IE_t", new Proto.Enm("ti.catalog.msp430.peripherals.adc.ADC10.ADC10IE_t"));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10ON_t", new Proto.Enm("ti.catalog.msp430.peripherals.adc.ADC10.ADC10ON_t"));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.REFON_t", new Proto.Enm("ti.catalog.msp430.peripherals.adc.ADC10.REFON_t"));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.REF2_5V_t", new Proto.Enm("ti.catalog.msp430.peripherals.adc.ADC10.REF2_5V_t"));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.MSC_t", new Proto.Enm("ti.catalog.msp430.peripherals.adc.ADC10.MSC_t"));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.REFBURST_t", new Proto.Enm("ti.catalog.msp430.peripherals.adc.ADC10.REFBURST_t"));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.REFOUT_t", new Proto.Enm("ti.catalog.msp430.peripherals.adc.ADC10.REFOUT_t"));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SR_t", new Proto.Enm("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SR_t"));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SHT_t", new Proto.Enm("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SHT_t"));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.SREF_t", new Proto.Enm("ti.catalog.msp430.peripherals.adc.ADC10.SREF_t"));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10BUSY_t", new Proto.Enm("ti.catalog.msp430.peripherals.adc.ADC10.ADC10BUSY_t"));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.CONSEQ_t", new Proto.Enm("ti.catalog.msp430.peripherals.adc.ADC10.CONSEQ_t"));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SSEL_t", new Proto.Enm("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SSEL_t"));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DIV_t", new Proto.Enm("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DIV_t"));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ISSH_t", new Proto.Enm("ti.catalog.msp430.peripherals.adc.ADC10.ISSH_t"));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DF_t", new Proto.Enm("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DF_t"));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.SHS_t", new Proto.Enm("ti.catalog.msp430.peripherals.adc.ADC10.SHS_t"));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.INCH_t", new Proto.Enm("ti.catalog.msp430.peripherals.adc.ADC10.INCH_t"));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10CT_t", new Proto.Enm("ti.catalog.msp430.peripherals.adc.ADC10.ADC10CT_t"));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10TB_t", new Proto.Enm("ti.catalog.msp430.peripherals.adc.ADC10.ADC10TB_t"));
        spo = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.adc.ADC10$$ADC10CTL0_t", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10CTL0_t", new Proto.Str(spo, true));
        spo = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.adc.ADC10$$ADC10CTL1_t", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10CTL1_t", new Proto.Str(spo, true));
        spo = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.adc.ADC10$$ADC10DTC0_t", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DTC0_t", new Proto.Str(spo, true));
        // insts 
        Object insP = om.bind("ti.catalog.msp430.peripherals.adc.ADC10.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.adc.ADC10$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.msp430.peripherals.adc.ADC10.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.adc.ADC10$$Params", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.Params", new Proto.Str(po, true));
    }

    void IADC$$CONSTS()
    {
        // interface IADC
    }

    void ADC10$$CONSTS()
    {
        // module ADC10
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SC_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SC_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.ADC10SC_OFF", xdc.services.intern.xsr.Enum.intValue(0x000L)+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SC", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SC_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.ADC10SC", xdc.services.intern.xsr.Enum.intValue(0x001L)+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ENC_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ENC_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.ENC_OFF", xdc.services.intern.xsr.Enum.intValue(0x000L)+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ENC", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ENC_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.ENC", xdc.services.intern.xsr.Enum.intValue(0x002L)+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10IFG_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10IFG_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.ADC10IFG_OFF", xdc.services.intern.xsr.Enum.intValue(0x000L)+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10IFG", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10IFG_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.ADC10IFG", xdc.services.intern.xsr.Enum.intValue(0x004L)+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10IE_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10IE_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.ADC10IE_OFF", xdc.services.intern.xsr.Enum.intValue(0x000L)+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10IE", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10IE_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.ADC10IE", xdc.services.intern.xsr.Enum.intValue(0x008L)+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10ON_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10ON_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.ADC10ON_OFF", xdc.services.intern.xsr.Enum.intValue(0x000L)+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10ON", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10ON_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.ADC10ON", xdc.services.intern.xsr.Enum.intValue(0x010L)+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.REFON_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.REFON_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.REFON_OFF", xdc.services.intern.xsr.Enum.intValue(0x000L)+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.REFON", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.REFON_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.REFON", xdc.services.intern.xsr.Enum.intValue(0x020L)+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.REF2_5V_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.REF2_5V_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.REF2_5V_OFF", xdc.services.intern.xsr.Enum.intValue(0x000L)+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.REF2_5V", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.REF2_5V_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.REF2_5V", xdc.services.intern.xsr.Enum.intValue(0x040L)+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.MSC_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.MSC_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.MSC_OFF", xdc.services.intern.xsr.Enum.intValue(0x000L)+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.MSC", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.MSC_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.MSC", xdc.services.intern.xsr.Enum.intValue(0x080L)+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.REFBURST_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.REFBURST_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.REFBURST_OFF", xdc.services.intern.xsr.Enum.intValue(0x000L)+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.REFBURST", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.REFBURST_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.REFBURST", xdc.services.intern.xsr.Enum.intValue(0x100L)+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.REFOUT_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.REFOUT_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.REFOUT_OFF", xdc.services.intern.xsr.Enum.intValue(0x000L)+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.REFOUT", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.REFOUT_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.REFOUT", xdc.services.intern.xsr.Enum.intValue(0x200L)+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SR_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SR_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.ADC10SR_OFF", xdc.services.intern.xsr.Enum.intValue(0x000L)+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SR", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SR_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.ADC10SR", xdc.services.intern.xsr.Enum.intValue(0x400L)+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SHT_0", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SHT_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.ADC10SHT_0", xdc.services.intern.xsr.Enum.intValue((Global.eval("0 * 0x800")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SHT_1", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SHT_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.ADC10SHT_1", xdc.services.intern.xsr.Enum.intValue((Global.eval("1 * 0x800")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SHT_2", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SHT_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.ADC10SHT_2", xdc.services.intern.xsr.Enum.intValue((Global.eval("2 * 0x800")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SHT_3", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SHT_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.ADC10SHT_3", xdc.services.intern.xsr.Enum.intValue(Global.eval("3 * 0x800"))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.SREF_0", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.SREF_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.SREF_0", xdc.services.intern.xsr.Enum.intValue((Global.eval("0 * 0x2000")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.SREF_1", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.SREF_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.SREF_1", xdc.services.intern.xsr.Enum.intValue((Global.eval("1 * 0x2000")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.SREF_2", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.SREF_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.SREF_2", xdc.services.intern.xsr.Enum.intValue((Global.eval("2 * 0x2000")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.SREF_3", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.SREF_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.SREF_3", xdc.services.intern.xsr.Enum.intValue((Global.eval("3 * 0x2000")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.SREF_4", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.SREF_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.SREF_4", xdc.services.intern.xsr.Enum.intValue((Global.eval("4 * 0x2000")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.SREF_5", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.SREF_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.SREF_5", xdc.services.intern.xsr.Enum.intValue((Global.eval("5 * 0x2000")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.SREF_6", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.SREF_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.SREF_6", xdc.services.intern.xsr.Enum.intValue((Global.eval("6 * 0x2000")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.SREF_7", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.SREF_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.SREF_7", xdc.services.intern.xsr.Enum.intValue(Global.eval("7 * 0x2000"))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10BUSY_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10BUSY_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.ADC10BUSY_OFF", xdc.services.intern.xsr.Enum.intValue(0x0000L)+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10BUSY", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10BUSY_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.ADC10BUSY", xdc.services.intern.xsr.Enum.intValue(0x0001L)+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.CONSEQ_0", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.CONSEQ_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.CONSEQ_0", xdc.services.intern.xsr.Enum.intValue((Global.eval("0 * 2")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.CONSEQ_1", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.CONSEQ_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.CONSEQ_1", xdc.services.intern.xsr.Enum.intValue((Global.eval("1 * 2")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.CONSEQ_2", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.CONSEQ_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.CONSEQ_2", xdc.services.intern.xsr.Enum.intValue((Global.eval("2 * 2")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.CONSEQ_3", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.CONSEQ_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.CONSEQ_3", xdc.services.intern.xsr.Enum.intValue(Global.eval("3 * 2"))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SSEL_0", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SSEL_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.ADC10SSEL_0", xdc.services.intern.xsr.Enum.intValue((Global.eval("0 * 8")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SSEL_1", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SSEL_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.ADC10SSEL_1", xdc.services.intern.xsr.Enum.intValue((Global.eval("1 * 8")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SSEL_2", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SSEL_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.ADC10SSEL_2", xdc.services.intern.xsr.Enum.intValue((Global.eval("2 * 8")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SSEL_3", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SSEL_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.ADC10SSEL_3", xdc.services.intern.xsr.Enum.intValue(Global.eval("3 * 8"))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DIV_0", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DIV_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.ADC10DIV_0", xdc.services.intern.xsr.Enum.intValue((Global.eval("0 * 0x20")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DIV_1", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DIV_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.ADC10DIV_1", xdc.services.intern.xsr.Enum.intValue((Global.eval("1 * 0x20")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DIV_2", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DIV_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.ADC10DIV_2", xdc.services.intern.xsr.Enum.intValue((Global.eval("2 * 0x20")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DIV_3", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DIV_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.ADC10DIV_3", xdc.services.intern.xsr.Enum.intValue((Global.eval("3 * 0x20")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DIV_4", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DIV_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.ADC10DIV_4", xdc.services.intern.xsr.Enum.intValue((Global.eval("4 * 0x20")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DIV_5", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DIV_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.ADC10DIV_5", xdc.services.intern.xsr.Enum.intValue((Global.eval("5 * 0x20")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DIV_6", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DIV_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.ADC10DIV_6", xdc.services.intern.xsr.Enum.intValue((Global.eval("6 * 0x20")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DIV_7", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DIV_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.ADC10DIV_7", xdc.services.intern.xsr.Enum.intValue(Global.eval("7 * 0x20"))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ISSH_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ISSH_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.ISSH_OFF", xdc.services.intern.xsr.Enum.intValue(0x0000L)+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ISSH", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ISSH_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.ISSH", xdc.services.intern.xsr.Enum.intValue(0x0100L)+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DF_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DF_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.ADC10DF_OFF", xdc.services.intern.xsr.Enum.intValue(0x0000L)+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DF_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.ADC10DF", xdc.services.intern.xsr.Enum.intValue(0x0200L)+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.SHS_0", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.SHS_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.SHS_0", xdc.services.intern.xsr.Enum.intValue((Global.eval("0 * 0x400")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.SHS_1", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.SHS_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.SHS_1", xdc.services.intern.xsr.Enum.intValue((Global.eval("1 * 0x400")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.SHS_2", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.SHS_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.SHS_2", xdc.services.intern.xsr.Enum.intValue((Global.eval("2 * 0x400")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.SHS_3", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.SHS_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.SHS_3", xdc.services.intern.xsr.Enum.intValue(Global.eval("3 * 0x400"))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.INCH_0", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.INCH_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.INCH_0", xdc.services.intern.xsr.Enum.intValue((Global.eval("0 * 0x1000")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.INCH_1", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.INCH_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.INCH_1", xdc.services.intern.xsr.Enum.intValue((Global.eval("1 * 0x1000")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.INCH_2", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.INCH_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.INCH_2", xdc.services.intern.xsr.Enum.intValue((Global.eval("2 * 0x1000")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.INCH_3", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.INCH_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.INCH_3", xdc.services.intern.xsr.Enum.intValue((Global.eval("3 * 0x1000")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.INCH_4", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.INCH_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.INCH_4", xdc.services.intern.xsr.Enum.intValue((Global.eval("4 * 0x1000")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.INCH_5", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.INCH_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.INCH_5", xdc.services.intern.xsr.Enum.intValue((Global.eval("5 * 0x1000")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.INCH_6", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.INCH_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.INCH_6", xdc.services.intern.xsr.Enum.intValue((Global.eval("6 * 0x1000")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.INCH_7", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.INCH_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.INCH_7", xdc.services.intern.xsr.Enum.intValue((Global.eval("7 * 0x1000")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.INCH_8", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.INCH_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.INCH_8", xdc.services.intern.xsr.Enum.intValue((Global.eval("8 * 0x1000")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.INCH_9", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.INCH_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.INCH_9", xdc.services.intern.xsr.Enum.intValue((Global.eval("9 * 0x1000")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.INCH_10", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.INCH_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.INCH_10", xdc.services.intern.xsr.Enum.intValue((Global.eval("10 * 0x1000")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.INCH_11", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.INCH_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.INCH_11", xdc.services.intern.xsr.Enum.intValue((Global.eval("11 * 0x1000")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.INCH_12", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.INCH_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.INCH_12", xdc.services.intern.xsr.Enum.intValue((Global.eval("12 * 0x1000")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.INCH_13", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.INCH_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.INCH_13", xdc.services.intern.xsr.Enum.intValue((Global.eval("13 * 0x1000")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.INCH_14", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.INCH_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.INCH_14", xdc.services.intern.xsr.Enum.intValue((Global.eval("14 * 0x1000")))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.INCH_15", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.INCH_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.INCH_15", xdc.services.intern.xsr.Enum.intValue(Global.eval("15 * 0x1000"))+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10CT_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10CT_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.ADC10CT_OFF", xdc.services.intern.xsr.Enum.intValue(0x000L)+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10CT", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10CT_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.ADC10CT", xdc.services.intern.xsr.Enum.intValue(0x004L)+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10TB_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10TB_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.ADC10TB_OFF", xdc.services.intern.xsr.Enum.intValue(0x000L)+0));
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10.ADC10TB", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10TB_t", "ti.catalog.msp430.peripherals.adc"), "ti.catalog.msp430.peripherals.adc.ADC10.ADC10TB", xdc.services.intern.xsr.Enum.intValue(0x008L)+0));
    }

    void IADC$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

    }

    void ADC10$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.adc.ADC10$$create", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.Module", "ti.catalog.msp430.peripherals.adc"), om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.Instance", "ti.catalog.msp430.peripherals.adc"), 3, 2, false));
                fxn.addArg(0, "clock", (Proto)om.findStrict("ti.catalog.msp430.peripherals.clock.IClock.Instance", "ti.catalog.msp430.peripherals.adc"), $$UNDEF);
                fxn.addArg(1, "timerA", (Proto)om.findStrict("ti.catalog.msp430.peripherals.timer.ITimer_A.Instance", "ti.catalog.msp430.peripherals.adc"), $$UNDEF);
                fxn.addArg(2, "__params", (Proto)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.Params", "ti.catalog.msp430.peripherals.adc"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$msp430$peripherals$adc$ADC10$$create = function( clock, timerA, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.msp430.peripherals.adc.ADC10'];\n");
            sb.append("var __inst = xdc.om['ti.catalog.msp430.peripherals.adc.ADC10.Instance'].$$make();\n");
            sb.append("__inst.$$bind('$package', xdc.om['ti.catalog.msp430.peripherals.adc']);\n");
            sb.append("__inst.$$bind('$index', __mod.$instances.length);\n");
            sb.append("__inst.$$bind('$category', 'Instance');\n");
            sb.append("__inst.$$bind('$args', {clock:clock, timerA:timerA});\n");
            sb.append("__inst.$$bind('$module', __mod);\n");
            sb.append("__mod.$instances.$add(__inst);\n");
            sb.append("__inst.name = __mod.PARAMS.name;\n");
            sb.append("__inst.owner = __mod.PARAMS.owner;\n");
            sb.append("__inst.clock = __mod.PARAMS.clock;\n");
            sb.append("__inst.timerA = __mod.PARAMS.timerA;\n");
            sb.append("for (__p in __params) __inst[__p] = __params[__p];\n");
            sb.append("var save = xdc.om.$curpkg;\n");
            sb.append("xdc.om.$$bind('$curpkg', __mod.$package.$name);\n");
            sb.append("__mod.instance$meta$init.$fxn.apply(__inst, [clock, timerA]);\n");
            sb.append("xdc.om.$$bind('$curpkg', save);\n");
            sb.append("__inst.$$bless();\n");
            sb.append("return __inst;\n");
        sb.append("}\n");
        Global.eval(sb.toString());
        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.adc.ADC10$$construct", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.Module", "ti.catalog.msp430.peripherals.adc"), null, 4, 2, false));
                fxn.addArg(0, "__obj", (Proto)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10$$Object", "ti.catalog.msp430.peripherals.adc"), null);
                fxn.addArg(1, "clock", (Proto)om.findStrict("ti.catalog.msp430.peripherals.clock.IClock.Instance", "ti.catalog.msp430.peripherals.adc"), $$UNDEF);
                fxn.addArg(2, "timerA", (Proto)om.findStrict("ti.catalog.msp430.peripherals.timer.ITimer_A.Instance", "ti.catalog.msp430.peripherals.adc"), $$UNDEF);
                fxn.addArg(3, "__params", (Proto)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.Params", "ti.catalog.msp430.peripherals.adc"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$msp430$peripherals$adc$ADC10$$construct = function( __obj, clock, timerA, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.msp430.peripherals.adc.ADC10'];\n");
            sb.append("var __inst = __obj;\n");
            sb.append("__inst.$$bind('$args', {clock:clock, timerA:timerA});\n");
            sb.append("__inst.$$bind('$module', __mod);\n");
            sb.append("__mod.$objects.$add(__inst);\n");
            sb.append("__inst.name = __mod.PARAMS.name;\n");
            sb.append("__inst.owner = __mod.PARAMS.owner;\n");
            sb.append("__inst.clock = __mod.PARAMS.clock;\n");
            sb.append("__inst.timerA = __mod.PARAMS.timerA;\n");
            sb.append("for (__p in __params) __inst[__p] = __params[__p];\n");
            sb.append("__inst.$$bless();\n");
            sb.append("return null;\n");
        sb.append("}\n");
        Global.eval(sb.toString());
    }

    void IADC$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void ADC10$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void IADC$$SIZES()
    {
    }

    void ADC10$$SIZES()
    {
    }

    void IADC$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.adc.IADC.Module", "ti.catalog.msp430.peripherals.adc");
        po.init("ti.catalog.msp430.peripherals.adc.IADC.Module", om.findStrict("xdc.platform.IPeripheral.Module", "ti.catalog.msp430.peripherals.adc"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.adc.IADC.Instance", "ti.catalog.msp430.peripherals.adc");
        po.init("ti.catalog.msp430.peripherals.adc.IADC.Instance", om.findStrict("xdc.platform.IPeripheral.Instance", "ti.catalog.msp430.peripherals.adc"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("clock", (Proto)om.findStrict("ti.catalog.msp430.peripherals.clock.IClock.Instance", "ti.catalog.msp430.peripherals.adc"), $$UNDEF, "wh");
        po.addFld("timerA", (Proto)om.findStrict("ti.catalog.msp430.peripherals.timer.ITimer_A.Instance", "ti.catalog.msp430.peripherals.adc"), $$UNDEF, "wh");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.adc.IADC$$Params", "ti.catalog.msp430.peripherals.adc");
        po.init("ti.catalog.msp430.peripherals.adc.IADC.Params", om.findStrict("xdc.platform.IPeripheral$$Params", "ti.catalog.msp430.peripherals.adc"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("clock", (Proto)om.findStrict("ti.catalog.msp430.peripherals.clock.IClock.Instance", "ti.catalog.msp430.peripherals.adc"), $$UNDEF, "wh");
        po.addFld("timerA", (Proto)om.findStrict("ti.catalog.msp430.peripherals.timer.ITimer_A.Instance", "ti.catalog.msp430.peripherals.adc"), $$UNDEF, "wh");
        // struct IADC.ForceSetDefaultRegister_t
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.adc.IADC$$ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.adc");
        po.init("ti.catalog.msp430.peripherals.adc.IADC.ForceSetDefaultRegister_t", null);
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFld("register", $$T_Str, $$UNDEF, "w");
                po.addFld("regForceSet", $$T_Bool, $$UNDEF, "w");
    }

    void ADC10$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        cap = (Scriptable)Global.callFxn("loadCapsule", xdcO, "ti/catalog/msp430/peripherals/adc/ADC10.xs");
        om.bind("ti.catalog.msp430.peripherals.adc.ADC10$$capsule", cap);
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.Module", "ti.catalog.msp430.peripherals.adc");
        po.init("ti.catalog.msp430.peripherals.adc.ADC10.Module", om.findStrict("ti.catalog.msp430.peripherals.adc.IADC.Module", "ti.catalog.msp430.peripherals.adc"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("create", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10$$create", "ti.catalog.msp430.peripherals.adc"), Global.get("ti$catalog$msp430$peripherals$adc$ADC10$$create"));
                po.addFxn("construct", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10$$construct", "ti.catalog.msp430.peripherals.adc"), Global.get("ti$catalog$msp430$peripherals$adc$ADC10$$construct"));
        fxn = Global.get(cap, "module$use");
        if (fxn != null) om.bind("ti.catalog.msp430.peripherals.adc.ADC10$$module$use", true);
        if (fxn != null) po.addFxn("module$use", $$T_Met, fxn);
        fxn = Global.get(cap, "module$meta$init");
        if (fxn != null) om.bind("ti.catalog.msp430.peripherals.adc.ADC10$$module$meta$init", true);
        if (fxn != null) po.addFxn("module$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "instance$meta$init");
        if (fxn != null) om.bind("ti.catalog.msp430.peripherals.adc.ADC10$$instance$meta$init", true);
        if (fxn != null) po.addFxn("instance$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "module$validate");
        if (fxn != null) om.bind("ti.catalog.msp430.peripherals.adc.ADC10$$module$validate", true);
        if (fxn != null) po.addFxn("module$validate", $$T_Met, fxn);
                fxn = Global.get(cap, "addPeripheralsMap");
                if (fxn != null) po.addFxn("addPeripheralsMap", (Proto.Fxn)om.findStrict("xdc.platform.IPeripheral$$addPeripheralsMap", "ti.catalog.msp430.peripherals.adc"), fxn);
                fxn = Global.get(cap, "getAll");
                if (fxn != null) po.addFxn("getAll", (Proto.Fxn)om.findStrict("xdc.platform.IPeripheral$$getAll", "ti.catalog.msp430.peripherals.adc"), fxn);
                fxn = Global.get(cap, "getRegisters");
                if (fxn != null) po.addFxn("getRegisters", (Proto.Fxn)om.findStrict("xdc.platform.IPeripheral$$getRegisters", "ti.catalog.msp430.peripherals.adc"), fxn);
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.Instance", "ti.catalog.msp430.peripherals.adc");
        po.init("ti.catalog.msp430.peripherals.adc.ADC10.Instance", om.findStrict("ti.catalog.msp430.peripherals.adc.IADC.Instance", "ti.catalog.msp430.peripherals.adc"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("ADC10CTL0", (Proto)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10CTL0_t", "ti.catalog.msp430.peripherals.adc"), Global.newObject("ADC10SC", om.find("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SC_OFF"), "ENC", om.find("ti.catalog.msp430.peripherals.adc.ADC10.ENC_OFF"), "ADC10IFG", om.find("ti.catalog.msp430.peripherals.adc.ADC10.ADC10IFG_OFF"), "ADC10IE", om.find("ti.catalog.msp430.peripherals.adc.ADC10.ADC10IE_OFF"), "ADC10ON", om.find("ti.catalog.msp430.peripherals.adc.ADC10.ADC10ON_OFF"), "REFON", om.find("ti.catalog.msp430.peripherals.adc.ADC10.REFON_OFF"), "REF2_5V", om.find("ti.catalog.msp430.peripherals.adc.ADC10.REF2_5V_OFF"), "MSC", om.find("ti.catalog.msp430.peripherals.adc.ADC10.MSC_OFF"), "REFBURST", om.find("ti.catalog.msp430.peripherals.adc.ADC10.REFBURST_OFF"), "REFOUT", om.find("ti.catalog.msp430.peripherals.adc.ADC10.REFOUT_OFF"), "ADC10SR", om.find("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SR_OFF"), "ADC10SHT", om.find("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SHT_0"), "SREF", om.find("ti.catalog.msp430.peripherals.adc.ADC10.SREF_0")), "wh");
        po.addFld("ADC10CTL1", (Proto)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10CTL1_t", "ti.catalog.msp430.peripherals.adc"), Global.newObject("ADC10BUSY", om.find("ti.catalog.msp430.peripherals.adc.ADC10.ADC10BUSY_OFF"), "CONSEQ", om.find("ti.catalog.msp430.peripherals.adc.ADC10.CONSEQ_0"), "ADC10SSEL", om.find("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SSEL_0"), "ADC10DIV", om.find("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DIV_0"), "ISSH", om.find("ti.catalog.msp430.peripherals.adc.ADC10.ISSH_OFF"), "ADC10DF", om.find("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DF_OFF"), "SHS", om.find("ti.catalog.msp430.peripherals.adc.ADC10.SHS_0"), "INCH", om.find("ti.catalog.msp430.peripherals.adc.ADC10.INCH_0")), "wh");
        po.addFld("ADC10AE0", Proto.Elm.newCNum("(xdc_Bits16)"), 0L, "wh");
        po.addFld("ADC10AE1", Proto.Elm.newCNum("(xdc_Bits16)"), 0L, "wh");
        po.addFld("ADC10DTC0", (Proto)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DTC0_t", "ti.catalog.msp430.peripherals.adc"), Global.newObject("ADC10TB", om.find("ti.catalog.msp430.peripherals.adc.ADC10.ADC10TB_OFF"), "ADC10CT", om.find("ti.catalog.msp430.peripherals.adc.ADC10.ADC10CT_OFF")), "wh");
        po.addFld("ADC10DTC1", Proto.Elm.newCNum("(xdc_Bits8)"), 0L, "wh");
        po.addFld("ADC10SA", Proto.Elm.newCNum("(xdc_Bits16)"), 0x200L, "wh");
        po.addFld("forceSetDefaultRegister", new Proto.Arr((Proto)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.adc"), false), Global.newArray(new Object[]{Global.newObject("register", "ADC10CTL0", "regForceSet", false), Global.newObject("register", "ADC10CTL1", "regForceSet", false), Global.newObject("register", "ADC10AE0", "regForceSet", false), Global.newObject("register", "ADC10AE1", "regForceSet", false), Global.newObject("register", "ADC10DTC0", "regForceSet", false), Global.newObject("register", "ADC10DTC1", "regForceSet", false), Global.newObject("register", "ADC10SA", "regForceSet", false)}), "rh");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10$$Params", "ti.catalog.msp430.peripherals.adc");
        po.init("ti.catalog.msp430.peripherals.adc.ADC10.Params", om.findStrict("ti.catalog.msp430.peripherals.adc.IADC$$Params", "ti.catalog.msp430.peripherals.adc"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("ADC10CTL0", (Proto)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10CTL0_t", "ti.catalog.msp430.peripherals.adc"), Global.newObject("ADC10SC", om.find("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SC_OFF"), "ENC", om.find("ti.catalog.msp430.peripherals.adc.ADC10.ENC_OFF"), "ADC10IFG", om.find("ti.catalog.msp430.peripherals.adc.ADC10.ADC10IFG_OFF"), "ADC10IE", om.find("ti.catalog.msp430.peripherals.adc.ADC10.ADC10IE_OFF"), "ADC10ON", om.find("ti.catalog.msp430.peripherals.adc.ADC10.ADC10ON_OFF"), "REFON", om.find("ti.catalog.msp430.peripherals.adc.ADC10.REFON_OFF"), "REF2_5V", om.find("ti.catalog.msp430.peripherals.adc.ADC10.REF2_5V_OFF"), "MSC", om.find("ti.catalog.msp430.peripherals.adc.ADC10.MSC_OFF"), "REFBURST", om.find("ti.catalog.msp430.peripherals.adc.ADC10.REFBURST_OFF"), "REFOUT", om.find("ti.catalog.msp430.peripherals.adc.ADC10.REFOUT_OFF"), "ADC10SR", om.find("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SR_OFF"), "ADC10SHT", om.find("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SHT_0"), "SREF", om.find("ti.catalog.msp430.peripherals.adc.ADC10.SREF_0")), "wh");
        po.addFld("ADC10CTL1", (Proto)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10CTL1_t", "ti.catalog.msp430.peripherals.adc"), Global.newObject("ADC10BUSY", om.find("ti.catalog.msp430.peripherals.adc.ADC10.ADC10BUSY_OFF"), "CONSEQ", om.find("ti.catalog.msp430.peripherals.adc.ADC10.CONSEQ_0"), "ADC10SSEL", om.find("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SSEL_0"), "ADC10DIV", om.find("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DIV_0"), "ISSH", om.find("ti.catalog.msp430.peripherals.adc.ADC10.ISSH_OFF"), "ADC10DF", om.find("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DF_OFF"), "SHS", om.find("ti.catalog.msp430.peripherals.adc.ADC10.SHS_0"), "INCH", om.find("ti.catalog.msp430.peripherals.adc.ADC10.INCH_0")), "wh");
        po.addFld("ADC10AE0", Proto.Elm.newCNum("(xdc_Bits16)"), 0L, "wh");
        po.addFld("ADC10AE1", Proto.Elm.newCNum("(xdc_Bits16)"), 0L, "wh");
        po.addFld("ADC10DTC0", (Proto)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DTC0_t", "ti.catalog.msp430.peripherals.adc"), Global.newObject("ADC10TB", om.find("ti.catalog.msp430.peripherals.adc.ADC10.ADC10TB_OFF"), "ADC10CT", om.find("ti.catalog.msp430.peripherals.adc.ADC10.ADC10CT_OFF")), "wh");
        po.addFld("ADC10DTC1", Proto.Elm.newCNum("(xdc_Bits8)"), 0L, "wh");
        po.addFld("ADC10SA", Proto.Elm.newCNum("(xdc_Bits16)"), 0x200L, "wh");
        po.addFld("forceSetDefaultRegister", new Proto.Arr((Proto)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.adc"), false), Global.newArray(new Object[]{Global.newObject("register", "ADC10CTL0", "regForceSet", false), Global.newObject("register", "ADC10CTL1", "regForceSet", false), Global.newObject("register", "ADC10AE0", "regForceSet", false), Global.newObject("register", "ADC10AE1", "regForceSet", false), Global.newObject("register", "ADC10DTC0", "regForceSet", false), Global.newObject("register", "ADC10DTC1", "regForceSet", false), Global.newObject("register", "ADC10SA", "regForceSet", false)}), "rh");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10$$Object", "ti.catalog.msp430.peripherals.adc");
        po.init("ti.catalog.msp430.peripherals.adc.ADC10.Object", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.Instance", "ti.catalog.msp430.peripherals.adc"));
        // struct ADC10.ADC10CTL0_t
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10$$ADC10CTL0_t", "ti.catalog.msp430.peripherals.adc");
        po.init("ti.catalog.msp430.peripherals.adc.ADC10.ADC10CTL0_t", null);
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFld("ADC10SC", (Proto)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SC_t", "ti.catalog.msp430.peripherals.adc"), $$UNDEF, "w");
                po.addFld("ENC", (Proto)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ENC_t", "ti.catalog.msp430.peripherals.adc"), $$UNDEF, "w");
                po.addFld("ADC10IFG", (Proto)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10IFG_t", "ti.catalog.msp430.peripherals.adc"), $$UNDEF, "w");
                po.addFld("ADC10IE", (Proto)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10IE_t", "ti.catalog.msp430.peripherals.adc"), $$UNDEF, "w");
                po.addFld("ADC10ON", (Proto)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10ON_t", "ti.catalog.msp430.peripherals.adc"), $$UNDEF, "w");
                po.addFld("REFON", (Proto)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.REFON_t", "ti.catalog.msp430.peripherals.adc"), $$UNDEF, "w");
                po.addFld("REF2_5V", (Proto)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.REF2_5V_t", "ti.catalog.msp430.peripherals.adc"), $$UNDEF, "w");
                po.addFld("MSC", (Proto)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.MSC_t", "ti.catalog.msp430.peripherals.adc"), $$UNDEF, "w");
                po.addFld("REFBURST", (Proto)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.REFBURST_t", "ti.catalog.msp430.peripherals.adc"), $$UNDEF, "w");
                po.addFld("REFOUT", (Proto)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.REFOUT_t", "ti.catalog.msp430.peripherals.adc"), $$UNDEF, "w");
                po.addFld("ADC10SR", (Proto)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SR_t", "ti.catalog.msp430.peripherals.adc"), $$UNDEF, "w");
                po.addFld("ADC10SHT", (Proto)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SHT_t", "ti.catalog.msp430.peripherals.adc"), $$UNDEF, "w");
                po.addFld("SREF", (Proto)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.SREF_t", "ti.catalog.msp430.peripherals.adc"), $$UNDEF, "w");
        // struct ADC10.ADC10CTL1_t
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10$$ADC10CTL1_t", "ti.catalog.msp430.peripherals.adc");
        po.init("ti.catalog.msp430.peripherals.adc.ADC10.ADC10CTL1_t", null);
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFld("ADC10BUSY", (Proto)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10BUSY_t", "ti.catalog.msp430.peripherals.adc"), $$UNDEF, "w");
                po.addFld("CONSEQ", (Proto)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.CONSEQ_t", "ti.catalog.msp430.peripherals.adc"), $$UNDEF, "w");
                po.addFld("ADC10SSEL", (Proto)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SSEL_t", "ti.catalog.msp430.peripherals.adc"), $$UNDEF, "w");
                po.addFld("ADC10DIV", (Proto)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DIV_t", "ti.catalog.msp430.peripherals.adc"), $$UNDEF, "w");
                po.addFld("ISSH", (Proto)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ISSH_t", "ti.catalog.msp430.peripherals.adc"), $$UNDEF, "w");
                po.addFld("ADC10DF", (Proto)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DF_t", "ti.catalog.msp430.peripherals.adc"), $$UNDEF, "w");
                po.addFld("SHS", (Proto)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.SHS_t", "ti.catalog.msp430.peripherals.adc"), $$UNDEF, "w");
                po.addFld("INCH", (Proto)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.INCH_t", "ti.catalog.msp430.peripherals.adc"), $$UNDEF, "w");
        // struct ADC10.ADC10DTC0_t
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10$$ADC10DTC0_t", "ti.catalog.msp430.peripherals.adc");
        po.init("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DTC0_t", null);
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFld("ADC10TB", (Proto)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10TB_t", "ti.catalog.msp430.peripherals.adc"), $$UNDEF, "w");
                po.addFld("ADC10CT", (Proto)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10CT_t", "ti.catalog.msp430.peripherals.adc"), $$UNDEF, "w");
    }

    void IADC$$ROV()
    {
    }

    void ADC10$$ROV()
    {
    }

    void $$SINGLETONS()
    {
        pkgP.init("ti.catalog.msp430.peripherals.adc.Package", (Proto.Obj)om.findStrict("xdc.IPackage.Module", "ti.catalog.msp430.peripherals.adc"));
        pkgP.bind("$capsule", $$UNDEF);
        pkgV.init2(pkgP, "ti.catalog.msp430.peripherals.adc", Value.DEFAULT, false);
        pkgV.bind("$name", "ti.catalog.msp430.peripherals.adc");
        pkgV.bind("$category", "Package");
        pkgV.bind("$$qn", "ti.catalog.msp430.peripherals.adc.");
        pkgV.bind("$vers", Global.newArray());
        Value.Map atmap = (Value.Map)pkgV.getv("$attr");
        atmap.seal("length");
        imports.clear();
        pkgV.bind("$imports", imports);
        StringBuilder sb = new StringBuilder();
        sb.append("var pkg = xdc.om['ti.catalog.msp430.peripherals.adc'];\n");
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

    void IADC$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.msp430.peripherals.adc.IADC", "ti.catalog.msp430.peripherals.adc");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.adc.IADC.Module", "ti.catalog.msp430.peripherals.adc");
        vo.init2(po, "ti.catalog.msp430.peripherals.adc.IADC", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Interface");
        vo.bind("$capsule", $$UNDEF);
        vo.bind("Instance", om.findStrict("ti.catalog.msp430.peripherals.adc.IADC.Instance", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("Params", om.findStrict("ti.catalog.msp430.peripherals.adc.IADC.Params", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.msp430.peripherals.adc.IADC.Params", "ti.catalog.msp430.peripherals.adc")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.msp430.peripherals.adc", "ti.catalog.msp430.peripherals.adc"));
        tdefs.clear();
        proxies.clear();
        vo.bind("IPeripheralArray", om.findStrict("xdc.platform.IPeripheral.IPeripheralArray", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("StringArray", om.findStrict("xdc.platform.IPeripheral.StringArray", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ForceSetDefaultRegister_t", om.findStrict("ti.catalog.msp430.peripherals.adc.IADC.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.adc"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.adc.IADC.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        ((Value.Arr)pkgV.getv("$interfaces")).add(vo);
        pkgV.bind("IADC", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("IADC");
        vo.seal(null);
    }

    void ADC10$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10", "ti.catalog.msp430.peripherals.adc");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.Module", "ti.catalog.msp430.peripherals.adc");
        vo.init2(po, "ti.catalog.msp430.peripherals.adc.ADC10", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10$$capsule", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("Instance", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.Instance", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("Params", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.Params", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.Params", "ti.catalog.msp430.peripherals.adc")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.msp430.peripherals.adc", "ti.catalog.msp430.peripherals.adc"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        vo.bind("IPeripheralArray", om.findStrict("xdc.platform.IPeripheral.IPeripheralArray", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("StringArray", om.findStrict("xdc.platform.IPeripheral.StringArray", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ForceSetDefaultRegister_t", om.findStrict("ti.catalog.msp430.peripherals.adc.IADC.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.adc"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.adc.IADC.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10SC_t", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SC_t", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ENC_t", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ENC_t", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10IFG_t", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10IFG_t", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10IE_t", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10IE_t", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10ON_t", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10ON_t", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("REFON_t", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.REFON_t", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("REF2_5V_t", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.REF2_5V_t", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("MSC_t", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.MSC_t", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("REFBURST_t", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.REFBURST_t", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("REFOUT_t", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.REFOUT_t", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10SR_t", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SR_t", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10SHT_t", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SHT_t", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("SREF_t", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.SREF_t", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10BUSY_t", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10BUSY_t", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("CONSEQ_t", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.CONSEQ_t", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10SSEL_t", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SSEL_t", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10DIV_t", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DIV_t", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ISSH_t", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ISSH_t", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10DF_t", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DF_t", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("SHS_t", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.SHS_t", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("INCH_t", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.INCH_t", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10CT_t", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10CT_t", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10TB_t", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10TB_t", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10CTL0_t", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10CTL0_t", "ti.catalog.msp430.peripherals.adc"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10CTL0_t", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10CTL1_t", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10CTL1_t", "ti.catalog.msp430.peripherals.adc"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10CTL1_t", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10DTC0_t", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DTC0_t", "ti.catalog.msp430.peripherals.adc"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DTC0_t", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10SC_OFF", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SC_OFF", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10SC", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SC", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ENC_OFF", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ENC_OFF", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ENC", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ENC", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10IFG_OFF", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10IFG_OFF", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10IFG", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10IFG", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10IE_OFF", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10IE_OFF", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10IE", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10IE", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10ON_OFF", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10ON_OFF", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10ON", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10ON", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("REFON_OFF", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.REFON_OFF", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("REFON", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.REFON", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("REF2_5V_OFF", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.REF2_5V_OFF", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("REF2_5V", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.REF2_5V", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("MSC_OFF", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.MSC_OFF", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("MSC", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.MSC", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("REFBURST_OFF", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.REFBURST_OFF", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("REFBURST", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.REFBURST", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("REFOUT_OFF", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.REFOUT_OFF", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("REFOUT", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.REFOUT", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10SR_OFF", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SR_OFF", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10SR", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SR", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10SHT_0", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SHT_0", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10SHT_1", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SHT_1", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10SHT_2", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SHT_2", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10SHT_3", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SHT_3", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("SREF_0", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.SREF_0", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("SREF_1", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.SREF_1", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("SREF_2", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.SREF_2", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("SREF_3", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.SREF_3", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("SREF_4", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.SREF_4", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("SREF_5", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.SREF_5", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("SREF_6", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.SREF_6", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("SREF_7", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.SREF_7", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10BUSY_OFF", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10BUSY_OFF", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10BUSY", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10BUSY", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("CONSEQ_0", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.CONSEQ_0", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("CONSEQ_1", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.CONSEQ_1", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("CONSEQ_2", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.CONSEQ_2", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("CONSEQ_3", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.CONSEQ_3", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10SSEL_0", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SSEL_0", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10SSEL_1", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SSEL_1", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10SSEL_2", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SSEL_2", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10SSEL_3", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10SSEL_3", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10DIV_0", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DIV_0", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10DIV_1", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DIV_1", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10DIV_2", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DIV_2", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10DIV_3", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DIV_3", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10DIV_4", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DIV_4", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10DIV_5", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DIV_5", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10DIV_6", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DIV_6", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10DIV_7", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DIV_7", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ISSH_OFF", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ISSH_OFF", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ISSH", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ISSH", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10DF_OFF", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DF_OFF", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10DF", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10DF", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("SHS_0", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.SHS_0", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("SHS_1", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.SHS_1", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("SHS_2", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.SHS_2", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("SHS_3", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.SHS_3", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("INCH_0", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.INCH_0", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("INCH_1", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.INCH_1", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("INCH_2", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.INCH_2", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("INCH_3", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.INCH_3", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("INCH_4", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.INCH_4", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("INCH_5", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.INCH_5", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("INCH_6", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.INCH_6", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("INCH_7", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.INCH_7", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("INCH_8", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.INCH_8", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("INCH_9", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.INCH_9", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("INCH_10", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.INCH_10", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("INCH_11", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.INCH_11", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("INCH_12", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.INCH_12", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("INCH_13", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.INCH_13", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("INCH_14", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.INCH_14", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("INCH_15", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.INCH_15", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10CT_OFF", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10CT_OFF", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10CT", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10CT", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10TB_OFF", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10TB_OFF", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("ADC10TB", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.ADC10TB", "ti.catalog.msp430.peripherals.adc"));
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "ti.catalog.msp430.peripherals.adc")).add(vo);
        vo.bind("$$instflag", 1);
        vo.bind("$$iobjflag", 1);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 1);
        vo.bind("$$romcfgs", "|");
        Proto.Str ps = (Proto.Str)vo.find("Module_State");
        if (ps != null) vo.bind("$object", ps.newInstance());
        vo.bind("$$meta_iobj", om.has("ti.catalog.msp430.peripherals.adc.ADC10$$instance$static$init", null) ? 1 : 0);
        vo.bind("$$fxntab", Global.newArray());
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray());
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.seal("length");
        vo.bind("Object", om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10.Object", "ti.catalog.msp430.peripherals.adc"));
        pkgV.bind("ADC10", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("ADC10");
    }

    void $$INITIALIZATION()
    {
        Value.Obj vo;

        if (isCFG) {
        }//isCFG
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("ti.catalog.msp430.peripherals.adc.ADC10", "ti.catalog.msp430.peripherals.adc"));
        Global.callFxn("init", pkgV);
        ((Value.Obj)om.getv("ti.catalog.msp430.peripherals.adc.IADC")).bless();
        ((Value.Obj)om.getv("ti.catalog.msp430.peripherals.adc.ADC10")).bless();
        ((Value.Arr)om.findStrict("$packages", "ti.catalog.msp430.peripherals.adc")).add(pkgV);
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
        IADC$$OBJECTS();
        ADC10$$OBJECTS();
        IADC$$CONSTS();
        ADC10$$CONSTS();
        IADC$$CREATES();
        ADC10$$CREATES();
        IADC$$FUNCTIONS();
        ADC10$$FUNCTIONS();
        IADC$$SIZES();
        ADC10$$SIZES();
        IADC$$TYPES();
        ADC10$$TYPES();
        if (isROV) {
            IADC$$ROV();
            ADC10$$ROV();
        }//isROV
        $$SINGLETONS();
        IADC$$SINGLETONS();
        ADC10$$SINGLETONS();
        $$INITIALIZATION();
    }
}
