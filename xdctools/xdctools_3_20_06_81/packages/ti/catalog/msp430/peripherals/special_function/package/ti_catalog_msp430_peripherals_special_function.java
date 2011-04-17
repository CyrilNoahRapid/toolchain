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

public class ti_catalog_msp430_peripherals_special_function
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
        Global.callFxn("loadPackage", xdcO, "xdc.platform");
    }

    void $$OBJECTS()
    {
        pkgP = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.special_function.Package", new Proto.Obj());
        pkgV = (Value.Obj)om.bind("ti.catalog.msp430.peripherals.special_function", new Value.Obj("ti.catalog.msp430.peripherals.special_function", pkgP));
    }

    void IE1$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.special_function.IE1.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.msp430.peripherals.special_function.IE1", new Value.Obj("ti.catalog.msp430.peripherals.special_function.IE1", po));
        pkgV.bind("IE1", vo);
        // decls 
        om.bind("ti.catalog.msp430.peripherals.special_function.IE1.NMIE_t", new Proto.Enm("ti.catalog.msp430.peripherals.special_function.IE1.NMIE_t"));
        om.bind("ti.catalog.msp430.peripherals.special_function.IE1.WDTIE_t", new Proto.Enm("ti.catalog.msp430.peripherals.special_function.IE1.WDTIE_t"));
        om.bind("ti.catalog.msp430.peripherals.special_function.IE1.OFIE_t", new Proto.Enm("ti.catalog.msp430.peripherals.special_function.IE1.OFIE_t"));
        spo = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.special_function.IE1$$IE1_t", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.special_function.IE1.IE1_t", new Proto.Str(spo, true));
        spo = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.special_function.IE1$$ForceSetDefaultRegister_t", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.special_function.IE1.ForceSetDefaultRegister_t", new Proto.Str(spo, true));
        // insts 
        Object insP = om.bind("ti.catalog.msp430.peripherals.special_function.IE1.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.special_function.IE1$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.msp430.peripherals.special_function.IE1.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.special_function.IE1$$Params", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.special_function.IE1.Params", new Proto.Str(po, true));
    }

    void IE2$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.special_function.IE2.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.msp430.peripherals.special_function.IE2", new Value.Obj("ti.catalog.msp430.peripherals.special_function.IE2", po));
        pkgV.bind("IE2", vo);
        // decls 
        om.bind("ti.catalog.msp430.peripherals.special_function.IE2.UCB0TXIE_t", new Proto.Enm("ti.catalog.msp430.peripherals.special_function.IE2.UCB0TXIE_t"));
        om.bind("ti.catalog.msp430.peripherals.special_function.IE2.UCB0RXIE_t", new Proto.Enm("ti.catalog.msp430.peripherals.special_function.IE2.UCB0RXIE_t"));
        om.bind("ti.catalog.msp430.peripherals.special_function.IE2.UCA0TXIE_t", new Proto.Enm("ti.catalog.msp430.peripherals.special_function.IE2.UCA0TXIE_t"));
        om.bind("ti.catalog.msp430.peripherals.special_function.IE2.UCA0RXIE_t", new Proto.Enm("ti.catalog.msp430.peripherals.special_function.IE2.UCA0RXIE_t"));
        spo = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.special_function.IE2$$IE2_t", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.special_function.IE2.IE2_t", new Proto.Str(spo, true));
        spo = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.special_function.IE2$$ForceSetDefaultRegister_t", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.special_function.IE2.ForceSetDefaultRegister_t", new Proto.Str(spo, true));
        // insts 
        Object insP = om.bind("ti.catalog.msp430.peripherals.special_function.IE2.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.special_function.IE2$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.msp430.peripherals.special_function.IE2.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.msp430.peripherals.special_function.IE2$$Params", new Proto.Obj());
        om.bind("ti.catalog.msp430.peripherals.special_function.IE2.Params", new Proto.Str(po, true));
    }

    void IE1$$CONSTS()
    {
        // module IE1
        om.bind("ti.catalog.msp430.peripherals.special_function.IE1.NMIE_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.NMIE_t", "ti.catalog.msp430.peripherals.special_function"), "ti.catalog.msp430.peripherals.special_function.IE1.NMIE_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.special_function.IE1.NMIE", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.NMIE_t", "ti.catalog.msp430.peripherals.special_function"), "ti.catalog.msp430.peripherals.special_function.IE1.NMIE", xdc.services.intern.xsr.Enum.intValue(0x5A00L)+0));
        om.bind("ti.catalog.msp430.peripherals.special_function.IE1.WDTIE_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.WDTIE_t", "ti.catalog.msp430.peripherals.special_function"), "ti.catalog.msp430.peripherals.special_function.IE1.WDTIE_OFF", xdc.services.intern.xsr.Enum.intValue(0x0000L)+0));
        om.bind("ti.catalog.msp430.peripherals.special_function.IE1.WDTIE", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.WDTIE_t", "ti.catalog.msp430.peripherals.special_function"), "ti.catalog.msp430.peripherals.special_function.IE1.WDTIE", xdc.services.intern.xsr.Enum.intValue((0x0080L))+0));
        om.bind("ti.catalog.msp430.peripherals.special_function.IE1.OFIE_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.OFIE_t", "ti.catalog.msp430.peripherals.special_function"), "ti.catalog.msp430.peripherals.special_function.IE1.OFIE_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.special_function.IE1.OFIE", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.OFIE_t", "ti.catalog.msp430.peripherals.special_function"), "ti.catalog.msp430.peripherals.special_function.IE1.OFIE", xdc.services.intern.xsr.Enum.intValue(0x01L)+0));
    }

    void IE2$$CONSTS()
    {
        // module IE2
        om.bind("ti.catalog.msp430.peripherals.special_function.IE2.UCB0TXIE_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.UCB0TXIE_t", "ti.catalog.msp430.peripherals.special_function"), "ti.catalog.msp430.peripherals.special_function.IE2.UCB0TXIE_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.special_function.IE2.UCB0TXIE", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.UCB0TXIE_t", "ti.catalog.msp430.peripherals.special_function"), "ti.catalog.msp430.peripherals.special_function.IE2.UCB0TXIE", xdc.services.intern.xsr.Enum.intValue(0x08L)+0));
        om.bind("ti.catalog.msp430.peripherals.special_function.IE2.UCB0RXIE_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.UCB0RXIE_t", "ti.catalog.msp430.peripherals.special_function"), "ti.catalog.msp430.peripherals.special_function.IE2.UCB0RXIE_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.special_function.IE2.UCB0RXIE", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.UCB0RXIE_t", "ti.catalog.msp430.peripherals.special_function"), "ti.catalog.msp430.peripherals.special_function.IE2.UCB0RXIE", xdc.services.intern.xsr.Enum.intValue(0x04L)+0));
        om.bind("ti.catalog.msp430.peripherals.special_function.IE2.UCA0TXIE_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.UCA0TXIE_t", "ti.catalog.msp430.peripherals.special_function"), "ti.catalog.msp430.peripherals.special_function.IE2.UCA0TXIE_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.special_function.IE2.UCA0TXIE", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.UCA0TXIE_t", "ti.catalog.msp430.peripherals.special_function"), "ti.catalog.msp430.peripherals.special_function.IE2.UCA0TXIE", xdc.services.intern.xsr.Enum.intValue(0x02L)+0));
        om.bind("ti.catalog.msp430.peripherals.special_function.IE2.UCA0RXIE_OFF", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.UCA0RXIE_t", "ti.catalog.msp430.peripherals.special_function"), "ti.catalog.msp430.peripherals.special_function.IE2.UCA0RXIE_OFF", xdc.services.intern.xsr.Enum.intValue(0x00L)+0));
        om.bind("ti.catalog.msp430.peripherals.special_function.IE2.UCA0RXIE", xdc.services.intern.xsr.Enum.make((Proto.Enm)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.UCA0RXIE_t", "ti.catalog.msp430.peripherals.special_function"), "ti.catalog.msp430.peripherals.special_function.IE2.UCA0RXIE", xdc.services.intern.xsr.Enum.intValue(0x01L)+0));
    }

    void IE1$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.special_function.IE1$$create", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.Module", "ti.catalog.msp430.peripherals.special_function"), om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.Instance", "ti.catalog.msp430.peripherals.special_function"), 1, 0, false));
                fxn.addArg(0, "__params", (Proto)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.Params", "ti.catalog.msp430.peripherals.special_function"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$msp430$peripherals$special_function$IE1$$create = function( __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.msp430.peripherals.special_function.IE1'];\n");
            sb.append("var __inst = xdc.om['ti.catalog.msp430.peripherals.special_function.IE1.Instance'].$$make();\n");
            sb.append("__inst.$$bind('$package', xdc.om['ti.catalog.msp430.peripherals.special_function']);\n");
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
        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.special_function.IE1$$construct", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.Module", "ti.catalog.msp430.peripherals.special_function"), null, 2, 0, false));
                fxn.addArg(0, "__obj", (Proto)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1$$Object", "ti.catalog.msp430.peripherals.special_function"), null);
                fxn.addArg(1, "__params", (Proto)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.Params", "ti.catalog.msp430.peripherals.special_function"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$msp430$peripherals$special_function$IE1$$construct = function( __obj, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.msp430.peripherals.special_function.IE1'];\n");
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

    void IE2$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.special_function.IE2$$create", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.Module", "ti.catalog.msp430.peripherals.special_function"), om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.Instance", "ti.catalog.msp430.peripherals.special_function"), 1, 0, false));
                fxn.addArg(0, "__params", (Proto)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.Params", "ti.catalog.msp430.peripherals.special_function"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$msp430$peripherals$special_function$IE2$$create = function( __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.msp430.peripherals.special_function.IE2'];\n");
            sb.append("var __inst = xdc.om['ti.catalog.msp430.peripherals.special_function.IE2.Instance'].$$make();\n");
            sb.append("__inst.$$bind('$package', xdc.om['ti.catalog.msp430.peripherals.special_function']);\n");
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
        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.special_function.IE2$$construct", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.Module", "ti.catalog.msp430.peripherals.special_function"), null, 2, 0, false));
                fxn.addArg(0, "__obj", (Proto)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2$$Object", "ti.catalog.msp430.peripherals.special_function"), null);
                fxn.addArg(1, "__params", (Proto)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.Params", "ti.catalog.msp430.peripherals.special_function"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$msp430$peripherals$special_function$IE2$$construct = function( __obj, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.msp430.peripherals.special_function.IE2'];\n");
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

    void IE1$$FUNCTIONS()
    {
        Proto.Fxn fxn;

        // fxn IE1.getWDTIE
        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.special_function.IE1$$getWDTIE", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.Instance", "ti.catalog.msp430.peripherals.special_function"), $$T_Bool, 0, 0, false));
        // fxn IE1.setWDTIE
        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.special_function.IE1$$setWDTIE", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.Instance", "ti.catalog.msp430.peripherals.special_function"), $$T_Bool, 1, 1, false));
                fxn.addArg(0, "set", $$T_Bool, $$UNDEF);
        // fxn IE1.getOFIE
        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.special_function.IE1$$getOFIE", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.Instance", "ti.catalog.msp430.peripherals.special_function"), $$T_Bool, 0, 0, false));
        // fxn IE1.setOFIE
        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.special_function.IE1$$setOFIE", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.Instance", "ti.catalog.msp430.peripherals.special_function"), $$T_Bool, 1, 1, false));
                fxn.addArg(0, "set", $$T_Bool, $$UNDEF);
        // fxn IE1.getNMIE
        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.special_function.IE1$$getNMIE", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.Instance", "ti.catalog.msp430.peripherals.special_function"), $$T_Bool, 0, 0, false));
        // fxn IE1.setNMIE
        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.special_function.IE1$$setNMIE", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.Instance", "ti.catalog.msp430.peripherals.special_function"), $$T_Bool, 1, 1, false));
                fxn.addArg(0, "set", $$T_Bool, $$UNDEF);
    }

    void IE2$$FUNCTIONS()
    {
        Proto.Fxn fxn;

        // fxn IE2.getUCB0TXIE
        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.special_function.IE2$$getUCB0TXIE", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.Instance", "ti.catalog.msp430.peripherals.special_function"), $$T_Bool, 0, 0, false));
        // fxn IE2.setUCB0TXIE
        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.special_function.IE2$$setUCB0TXIE", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.Instance", "ti.catalog.msp430.peripherals.special_function"), $$T_Bool, 1, 1, false));
                fxn.addArg(0, "set", $$T_Bool, $$UNDEF);
        // fxn IE2.getUCB0RXIE
        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.special_function.IE2$$getUCB0RXIE", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.Instance", "ti.catalog.msp430.peripherals.special_function"), $$T_Bool, 0, 0, false));
        // fxn IE2.setUCB0RXIE
        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.special_function.IE2$$setUCB0RXIE", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.Instance", "ti.catalog.msp430.peripherals.special_function"), $$T_Bool, 1, 1, false));
                fxn.addArg(0, "set", $$T_Bool, $$UNDEF);
        // fxn IE2.getUCA0TXIE
        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.special_function.IE2$$getUCA0TXIE", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.Instance", "ti.catalog.msp430.peripherals.special_function"), $$T_Bool, 0, 0, false));
        // fxn IE2.setUCA0TXIE
        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.special_function.IE2$$setUCA0TXIE", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.Instance", "ti.catalog.msp430.peripherals.special_function"), $$T_Bool, 1, 1, false));
                fxn.addArg(0, "set", $$T_Bool, $$UNDEF);
        // fxn IE2.getUCA0RXIE
        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.special_function.IE2$$getUCA0RXIE", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.Instance", "ti.catalog.msp430.peripherals.special_function"), $$T_Bool, 0, 0, false));
        // fxn IE2.setUCA0RXIE
        fxn = (Proto.Fxn)om.bind("ti.catalog.msp430.peripherals.special_function.IE2$$setUCA0RXIE", new Proto.Fxn(om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.Instance", "ti.catalog.msp430.peripherals.special_function"), $$T_Bool, 1, 1, false));
                fxn.addArg(0, "set", $$T_Bool, $$UNDEF);
    }

    void IE1$$SIZES()
    {
    }

    void IE2$$SIZES()
    {
    }

    void IE1$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        cap = (Scriptable)Global.callFxn("loadCapsule", xdcO, "ti/catalog/msp430/peripherals/special_function/IE1.xs");
        om.bind("ti.catalog.msp430.peripherals.special_function.IE1$$capsule", cap);
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.Module", "ti.catalog.msp430.peripherals.special_function");
        po.init("ti.catalog.msp430.peripherals.special_function.IE1.Module", om.findStrict("xdc.platform.IPeripheral.Module", "ti.catalog.msp430.peripherals.special_function"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("create", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1$$create", "ti.catalog.msp430.peripherals.special_function"), Global.get("ti$catalog$msp430$peripherals$special_function$IE1$$create"));
                po.addFxn("construct", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1$$construct", "ti.catalog.msp430.peripherals.special_function"), Global.get("ti$catalog$msp430$peripherals$special_function$IE1$$construct"));
        fxn = Global.get(cap, "module$use");
        if (fxn != null) om.bind("ti.catalog.msp430.peripherals.special_function.IE1$$module$use", true);
        if (fxn != null) po.addFxn("module$use", $$T_Met, fxn);
        fxn = Global.get(cap, "module$meta$init");
        if (fxn != null) om.bind("ti.catalog.msp430.peripherals.special_function.IE1$$module$meta$init", true);
        if (fxn != null) po.addFxn("module$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "instance$meta$init");
        if (fxn != null) om.bind("ti.catalog.msp430.peripherals.special_function.IE1$$instance$meta$init", true);
        if (fxn != null) po.addFxn("instance$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "module$validate");
        if (fxn != null) om.bind("ti.catalog.msp430.peripherals.special_function.IE1$$module$validate", true);
        if (fxn != null) po.addFxn("module$validate", $$T_Met, fxn);
                fxn = Global.get(cap, "addPeripheralsMap");
                if (fxn != null) po.addFxn("addPeripheralsMap", (Proto.Fxn)om.findStrict("xdc.platform.IPeripheral$$addPeripheralsMap", "ti.catalog.msp430.peripherals.special_function"), fxn);
                fxn = Global.get(cap, "getAll");
                if (fxn != null) po.addFxn("getAll", (Proto.Fxn)om.findStrict("xdc.platform.IPeripheral$$getAll", "ti.catalog.msp430.peripherals.special_function"), fxn);
                fxn = Global.get(cap, "getRegisters");
                if (fxn != null) po.addFxn("getRegisters", (Proto.Fxn)om.findStrict("xdc.platform.IPeripheral$$getRegisters", "ti.catalog.msp430.peripherals.special_function"), fxn);
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.Instance", "ti.catalog.msp430.peripherals.special_function");
        po.init("ti.catalog.msp430.peripherals.special_function.IE1.Instance", om.findStrict("xdc.platform.IPeripheral.Instance", "ti.catalog.msp430.peripherals.special_function"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("IE1", (Proto)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.IE1_t", "ti.catalog.msp430.peripherals.special_function"), Global.newObject("NMIE", om.find("ti.catalog.msp430.peripherals.special_function.IE1.NMIE_OFF"), "OFIE", om.find("ti.catalog.msp430.peripherals.special_function.IE1.OFIE_OFF"), "WDTIE", om.find("ti.catalog.msp430.peripherals.special_function.IE1.WDTIE_OFF")), "wh");
        po.addFld("forceSetDefaultRegister", new Proto.Arr((Proto)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.special_function"), false), Global.newArray(new Object[]{Global.newObject("register", "IE1", "regForceSet", false)}), "rh");
                po.addFxn("getWDTIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1$$getWDTIE", "ti.catalog.msp430.peripherals.special_function"), Global.get(cap, "getWDTIE"));
                po.addFxn("setWDTIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1$$setWDTIE", "ti.catalog.msp430.peripherals.special_function"), Global.get(cap, "setWDTIE"));
                po.addFxn("getOFIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1$$getOFIE", "ti.catalog.msp430.peripherals.special_function"), Global.get(cap, "getOFIE"));
                po.addFxn("setOFIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1$$setOFIE", "ti.catalog.msp430.peripherals.special_function"), Global.get(cap, "setOFIE"));
                po.addFxn("getNMIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1$$getNMIE", "ti.catalog.msp430.peripherals.special_function"), Global.get(cap, "getNMIE"));
                po.addFxn("setNMIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1$$setNMIE", "ti.catalog.msp430.peripherals.special_function"), Global.get(cap, "setNMIE"));
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1$$Params", "ti.catalog.msp430.peripherals.special_function");
        po.init("ti.catalog.msp430.peripherals.special_function.IE1.Params", om.findStrict("xdc.platform.IPeripheral$$Params", "ti.catalog.msp430.peripherals.special_function"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("IE1", (Proto)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.IE1_t", "ti.catalog.msp430.peripherals.special_function"), Global.newObject("NMIE", om.find("ti.catalog.msp430.peripherals.special_function.IE1.NMIE_OFF"), "OFIE", om.find("ti.catalog.msp430.peripherals.special_function.IE1.OFIE_OFF"), "WDTIE", om.find("ti.catalog.msp430.peripherals.special_function.IE1.WDTIE_OFF")), "wh");
        po.addFld("forceSetDefaultRegister", new Proto.Arr((Proto)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.special_function"), false), Global.newArray(new Object[]{Global.newObject("register", "IE1", "regForceSet", false)}), "rh");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1$$Object", "ti.catalog.msp430.peripherals.special_function");
        po.init("ti.catalog.msp430.peripherals.special_function.IE1.Object", om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.Instance", "ti.catalog.msp430.peripherals.special_function"));
                po.addFxn("getWDTIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1$$getWDTIE", "ti.catalog.msp430.peripherals.special_function"), Global.get(cap, "getWDTIE"));
                po.addFxn("setWDTIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1$$setWDTIE", "ti.catalog.msp430.peripherals.special_function"), Global.get(cap, "setWDTIE"));
                po.addFxn("getOFIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1$$getOFIE", "ti.catalog.msp430.peripherals.special_function"), Global.get(cap, "getOFIE"));
                po.addFxn("setOFIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1$$setOFIE", "ti.catalog.msp430.peripherals.special_function"), Global.get(cap, "setOFIE"));
                po.addFxn("getNMIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1$$getNMIE", "ti.catalog.msp430.peripherals.special_function"), Global.get(cap, "getNMIE"));
                po.addFxn("setNMIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1$$setNMIE", "ti.catalog.msp430.peripherals.special_function"), Global.get(cap, "setNMIE"));
        // struct IE1.IE1_t
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1$$IE1_t", "ti.catalog.msp430.peripherals.special_function");
        po.init("ti.catalog.msp430.peripherals.special_function.IE1.IE1_t", null);
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFld("NMIE", (Proto)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.NMIE_t", "ti.catalog.msp430.peripherals.special_function"), $$UNDEF, "w");
                po.addFld("OFIE", (Proto)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.OFIE_t", "ti.catalog.msp430.peripherals.special_function"), $$UNDEF, "w");
                po.addFld("WDTIE", (Proto)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.WDTIE_t", "ti.catalog.msp430.peripherals.special_function"), $$UNDEF, "w");
        // struct IE1.ForceSetDefaultRegister_t
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1$$ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.special_function");
        po.init("ti.catalog.msp430.peripherals.special_function.IE1.ForceSetDefaultRegister_t", null);
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFld("register", $$T_Str, $$UNDEF, "w");
                po.addFld("regForceSet", $$T_Bool, $$UNDEF, "w");
    }

    void IE2$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        cap = (Scriptable)Global.callFxn("loadCapsule", xdcO, "ti/catalog/msp430/peripherals/special_function/IE2.xs");
        om.bind("ti.catalog.msp430.peripherals.special_function.IE2$$capsule", cap);
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.Module", "ti.catalog.msp430.peripherals.special_function");
        po.init("ti.catalog.msp430.peripherals.special_function.IE2.Module", om.findStrict("xdc.platform.IPeripheral.Module", "ti.catalog.msp430.peripherals.special_function"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("create", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2$$create", "ti.catalog.msp430.peripherals.special_function"), Global.get("ti$catalog$msp430$peripherals$special_function$IE2$$create"));
                po.addFxn("construct", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2$$construct", "ti.catalog.msp430.peripherals.special_function"), Global.get("ti$catalog$msp430$peripherals$special_function$IE2$$construct"));
        fxn = Global.get(cap, "module$use");
        if (fxn != null) om.bind("ti.catalog.msp430.peripherals.special_function.IE2$$module$use", true);
        if (fxn != null) po.addFxn("module$use", $$T_Met, fxn);
        fxn = Global.get(cap, "module$meta$init");
        if (fxn != null) om.bind("ti.catalog.msp430.peripherals.special_function.IE2$$module$meta$init", true);
        if (fxn != null) po.addFxn("module$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "instance$meta$init");
        if (fxn != null) om.bind("ti.catalog.msp430.peripherals.special_function.IE2$$instance$meta$init", true);
        if (fxn != null) po.addFxn("instance$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "module$validate");
        if (fxn != null) om.bind("ti.catalog.msp430.peripherals.special_function.IE2$$module$validate", true);
        if (fxn != null) po.addFxn("module$validate", $$T_Met, fxn);
                fxn = Global.get(cap, "addPeripheralsMap");
                if (fxn != null) po.addFxn("addPeripheralsMap", (Proto.Fxn)om.findStrict("xdc.platform.IPeripheral$$addPeripheralsMap", "ti.catalog.msp430.peripherals.special_function"), fxn);
                fxn = Global.get(cap, "getAll");
                if (fxn != null) po.addFxn("getAll", (Proto.Fxn)om.findStrict("xdc.platform.IPeripheral$$getAll", "ti.catalog.msp430.peripherals.special_function"), fxn);
                fxn = Global.get(cap, "getRegisters");
                if (fxn != null) po.addFxn("getRegisters", (Proto.Fxn)om.findStrict("xdc.platform.IPeripheral$$getRegisters", "ti.catalog.msp430.peripherals.special_function"), fxn);
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.Instance", "ti.catalog.msp430.peripherals.special_function");
        po.init("ti.catalog.msp430.peripherals.special_function.IE2.Instance", om.findStrict("xdc.platform.IPeripheral.Instance", "ti.catalog.msp430.peripherals.special_function"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("IE2", (Proto)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.IE2_t", "ti.catalog.msp430.peripherals.special_function"), Global.newObject("UCB0TXIE", om.find("ti.catalog.msp430.peripherals.special_function.IE2.UCB0TXIE_OFF"), "UCB0RXIE", om.find("ti.catalog.msp430.peripherals.special_function.IE2.UCB0RXIE_OFF"), "UCA0TXIE", om.find("ti.catalog.msp430.peripherals.special_function.IE2.UCA0TXIE_OFF"), "UCA0RXIE", om.find("ti.catalog.msp430.peripherals.special_function.IE2.UCA0RXIE_OFF")), "wh");
        po.addFld("forceSetDefaultRegister", new Proto.Arr((Proto)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.special_function"), false), Global.newArray(new Object[]{Global.newObject("register", "IE2", "regForceSet", false)}), "rh");
                po.addFxn("getUCB0TXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2$$getUCB0TXIE", "ti.catalog.msp430.peripherals.special_function"), Global.get(cap, "getUCB0TXIE"));
                po.addFxn("setUCB0TXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2$$setUCB0TXIE", "ti.catalog.msp430.peripherals.special_function"), Global.get(cap, "setUCB0TXIE"));
                po.addFxn("getUCB0RXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2$$getUCB0RXIE", "ti.catalog.msp430.peripherals.special_function"), Global.get(cap, "getUCB0RXIE"));
                po.addFxn("setUCB0RXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2$$setUCB0RXIE", "ti.catalog.msp430.peripherals.special_function"), Global.get(cap, "setUCB0RXIE"));
                po.addFxn("getUCA0TXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2$$getUCA0TXIE", "ti.catalog.msp430.peripherals.special_function"), Global.get(cap, "getUCA0TXIE"));
                po.addFxn("setUCA0TXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2$$setUCA0TXIE", "ti.catalog.msp430.peripherals.special_function"), Global.get(cap, "setUCA0TXIE"));
                po.addFxn("getUCA0RXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2$$getUCA0RXIE", "ti.catalog.msp430.peripherals.special_function"), Global.get(cap, "getUCA0RXIE"));
                po.addFxn("setUCA0RXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2$$setUCA0RXIE", "ti.catalog.msp430.peripherals.special_function"), Global.get(cap, "setUCA0RXIE"));
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2$$Params", "ti.catalog.msp430.peripherals.special_function");
        po.init("ti.catalog.msp430.peripherals.special_function.IE2.Params", om.findStrict("xdc.platform.IPeripheral$$Params", "ti.catalog.msp430.peripherals.special_function"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("IE2", (Proto)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.IE2_t", "ti.catalog.msp430.peripherals.special_function"), Global.newObject("UCB0TXIE", om.find("ti.catalog.msp430.peripherals.special_function.IE2.UCB0TXIE_OFF"), "UCB0RXIE", om.find("ti.catalog.msp430.peripherals.special_function.IE2.UCB0RXIE_OFF"), "UCA0TXIE", om.find("ti.catalog.msp430.peripherals.special_function.IE2.UCA0TXIE_OFF"), "UCA0RXIE", om.find("ti.catalog.msp430.peripherals.special_function.IE2.UCA0RXIE_OFF")), "wh");
        po.addFld("forceSetDefaultRegister", new Proto.Arr((Proto)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.special_function"), false), Global.newArray(new Object[]{Global.newObject("register", "IE2", "regForceSet", false)}), "rh");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2$$Object", "ti.catalog.msp430.peripherals.special_function");
        po.init("ti.catalog.msp430.peripherals.special_function.IE2.Object", om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.Instance", "ti.catalog.msp430.peripherals.special_function"));
                po.addFxn("getUCB0TXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2$$getUCB0TXIE", "ti.catalog.msp430.peripherals.special_function"), Global.get(cap, "getUCB0TXIE"));
                po.addFxn("setUCB0TXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2$$setUCB0TXIE", "ti.catalog.msp430.peripherals.special_function"), Global.get(cap, "setUCB0TXIE"));
                po.addFxn("getUCB0RXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2$$getUCB0RXIE", "ti.catalog.msp430.peripherals.special_function"), Global.get(cap, "getUCB0RXIE"));
                po.addFxn("setUCB0RXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2$$setUCB0RXIE", "ti.catalog.msp430.peripherals.special_function"), Global.get(cap, "setUCB0RXIE"));
                po.addFxn("getUCA0TXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2$$getUCA0TXIE", "ti.catalog.msp430.peripherals.special_function"), Global.get(cap, "getUCA0TXIE"));
                po.addFxn("setUCA0TXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2$$setUCA0TXIE", "ti.catalog.msp430.peripherals.special_function"), Global.get(cap, "setUCA0TXIE"));
                po.addFxn("getUCA0RXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2$$getUCA0RXIE", "ti.catalog.msp430.peripherals.special_function"), Global.get(cap, "getUCA0RXIE"));
                po.addFxn("setUCA0RXIE", (Proto.Fxn)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2$$setUCA0RXIE", "ti.catalog.msp430.peripherals.special_function"), Global.get(cap, "setUCA0RXIE"));
        // struct IE2.IE2_t
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2$$IE2_t", "ti.catalog.msp430.peripherals.special_function");
        po.init("ti.catalog.msp430.peripherals.special_function.IE2.IE2_t", null);
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFld("UCB0TXIE", (Proto)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.UCB0TXIE_t", "ti.catalog.msp430.peripherals.special_function"), $$UNDEF, "w");
                po.addFld("UCB0RXIE", (Proto)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.UCB0RXIE_t", "ti.catalog.msp430.peripherals.special_function"), $$UNDEF, "w");
                po.addFld("UCA0TXIE", (Proto)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.UCA0TXIE_t", "ti.catalog.msp430.peripherals.special_function"), $$UNDEF, "w");
                po.addFld("UCA0RXIE", (Proto)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.UCA0RXIE_t", "ti.catalog.msp430.peripherals.special_function"), $$UNDEF, "w");
        // struct IE2.ForceSetDefaultRegister_t
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2$$ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.special_function");
        po.init("ti.catalog.msp430.peripherals.special_function.IE2.ForceSetDefaultRegister_t", null);
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFld("register", $$T_Str, $$UNDEF, "w");
                po.addFld("regForceSet", $$T_Bool, $$UNDEF, "w");
    }

    void IE1$$ROV()
    {
    }

    void IE2$$ROV()
    {
    }

    void $$SINGLETONS()
    {
        pkgP.init("ti.catalog.msp430.peripherals.special_function.Package", (Proto.Obj)om.findStrict("xdc.IPackage.Module", "ti.catalog.msp430.peripherals.special_function"));
        pkgP.bind("$capsule", $$UNDEF);
        pkgV.init2(pkgP, "ti.catalog.msp430.peripherals.special_function", Value.DEFAULT, false);
        pkgV.bind("$name", "ti.catalog.msp430.peripherals.special_function");
        pkgV.bind("$category", "Package");
        pkgV.bind("$$qn", "ti.catalog.msp430.peripherals.special_function.");
        pkgV.bind("$vers", Global.newArray());
        Value.Map atmap = (Value.Map)pkgV.getv("$attr");
        atmap.seal("length");
        imports.clear();
        pkgV.bind("$imports", imports);
        StringBuilder sb = new StringBuilder();
        sb.append("var pkg = xdc.om['ti.catalog.msp430.peripherals.special_function'];\n");
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

    void IE1$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1", "ti.catalog.msp430.peripherals.special_function");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.Module", "ti.catalog.msp430.peripherals.special_function");
        vo.init2(po, "ti.catalog.msp430.peripherals.special_function.IE1", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1$$capsule", "ti.catalog.msp430.peripherals.special_function"));
        vo.bind("Instance", om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.Instance", "ti.catalog.msp430.peripherals.special_function"));
        vo.bind("Params", om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.Params", "ti.catalog.msp430.peripherals.special_function"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.Params", "ti.catalog.msp430.peripherals.special_function")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.msp430.peripherals.special_function", "ti.catalog.msp430.peripherals.special_function"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        vo.bind("IPeripheralArray", om.findStrict("xdc.platform.IPeripheral.IPeripheralArray", "ti.catalog.msp430.peripherals.special_function"));
        vo.bind("StringArray", om.findStrict("xdc.platform.IPeripheral.StringArray", "ti.catalog.msp430.peripherals.special_function"));
        vo.bind("NMIE_t", om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.NMIE_t", "ti.catalog.msp430.peripherals.special_function"));
        vo.bind("WDTIE_t", om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.WDTIE_t", "ti.catalog.msp430.peripherals.special_function"));
        vo.bind("OFIE_t", om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.OFIE_t", "ti.catalog.msp430.peripherals.special_function"));
        vo.bind("IE1_t", om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.IE1_t", "ti.catalog.msp430.peripherals.special_function"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.IE1_t", "ti.catalog.msp430.peripherals.special_function"));
        vo.bind("ForceSetDefaultRegister_t", om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.special_function"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.special_function"));
        vo.bind("NMIE_OFF", om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.NMIE_OFF", "ti.catalog.msp430.peripherals.special_function"));
        vo.bind("NMIE", om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.NMIE", "ti.catalog.msp430.peripherals.special_function"));
        vo.bind("WDTIE_OFF", om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.WDTIE_OFF", "ti.catalog.msp430.peripherals.special_function"));
        vo.bind("WDTIE", om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.WDTIE", "ti.catalog.msp430.peripherals.special_function"));
        vo.bind("OFIE_OFF", om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.OFIE_OFF", "ti.catalog.msp430.peripherals.special_function"));
        vo.bind("OFIE", om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.OFIE", "ti.catalog.msp430.peripherals.special_function"));
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "ti.catalog.msp430.peripherals.special_function")).add(vo);
        vo.bind("$$instflag", 1);
        vo.bind("$$iobjflag", 1);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 1);
        vo.bind("$$romcfgs", "|");
        Proto.Str ps = (Proto.Str)vo.find("Module_State");
        if (ps != null) vo.bind("$object", ps.newInstance());
        vo.bind("$$meta_iobj", om.has("ti.catalog.msp430.peripherals.special_function.IE1$$instance$static$init", null) ? 1 : 0);
        vo.bind("$$fxntab", Global.newArray());
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray());
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.seal("length");
        vo.bind("Object", om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1.Object", "ti.catalog.msp430.peripherals.special_function"));
        pkgV.bind("IE1", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("IE1");
    }

    void IE2$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2", "ti.catalog.msp430.peripherals.special_function");
        po = (Proto.Obj)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.Module", "ti.catalog.msp430.peripherals.special_function");
        vo.init2(po, "ti.catalog.msp430.peripherals.special_function.IE2", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2$$capsule", "ti.catalog.msp430.peripherals.special_function"));
        vo.bind("Instance", om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.Instance", "ti.catalog.msp430.peripherals.special_function"));
        vo.bind("Params", om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.Params", "ti.catalog.msp430.peripherals.special_function"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.Params", "ti.catalog.msp430.peripherals.special_function")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.msp430.peripherals.special_function", "ti.catalog.msp430.peripherals.special_function"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        vo.bind("IPeripheralArray", om.findStrict("xdc.platform.IPeripheral.IPeripheralArray", "ti.catalog.msp430.peripherals.special_function"));
        vo.bind("StringArray", om.findStrict("xdc.platform.IPeripheral.StringArray", "ti.catalog.msp430.peripherals.special_function"));
        vo.bind("UCB0TXIE_t", om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.UCB0TXIE_t", "ti.catalog.msp430.peripherals.special_function"));
        vo.bind("UCB0RXIE_t", om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.UCB0RXIE_t", "ti.catalog.msp430.peripherals.special_function"));
        vo.bind("UCA0TXIE_t", om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.UCA0TXIE_t", "ti.catalog.msp430.peripherals.special_function"));
        vo.bind("UCA0RXIE_t", om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.UCA0RXIE_t", "ti.catalog.msp430.peripherals.special_function"));
        vo.bind("IE2_t", om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.IE2_t", "ti.catalog.msp430.peripherals.special_function"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.IE2_t", "ti.catalog.msp430.peripherals.special_function"));
        vo.bind("ForceSetDefaultRegister_t", om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.special_function"));
        tdefs.add(om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.ForceSetDefaultRegister_t", "ti.catalog.msp430.peripherals.special_function"));
        vo.bind("UCB0TXIE_OFF", om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.UCB0TXIE_OFF", "ti.catalog.msp430.peripherals.special_function"));
        vo.bind("UCB0TXIE", om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.UCB0TXIE", "ti.catalog.msp430.peripherals.special_function"));
        vo.bind("UCB0RXIE_OFF", om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.UCB0RXIE_OFF", "ti.catalog.msp430.peripherals.special_function"));
        vo.bind("UCB0RXIE", om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.UCB0RXIE", "ti.catalog.msp430.peripherals.special_function"));
        vo.bind("UCA0TXIE_OFF", om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.UCA0TXIE_OFF", "ti.catalog.msp430.peripherals.special_function"));
        vo.bind("UCA0TXIE", om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.UCA0TXIE", "ti.catalog.msp430.peripherals.special_function"));
        vo.bind("UCA0RXIE_OFF", om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.UCA0RXIE_OFF", "ti.catalog.msp430.peripherals.special_function"));
        vo.bind("UCA0RXIE", om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.UCA0RXIE", "ti.catalog.msp430.peripherals.special_function"));
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "ti.catalog.msp430.peripherals.special_function")).add(vo);
        vo.bind("$$instflag", 1);
        vo.bind("$$iobjflag", 1);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 1);
        vo.bind("$$romcfgs", "|");
        Proto.Str ps = (Proto.Str)vo.find("Module_State");
        if (ps != null) vo.bind("$object", ps.newInstance());
        vo.bind("$$meta_iobj", om.has("ti.catalog.msp430.peripherals.special_function.IE2$$instance$static$init", null) ? 1 : 0);
        vo.bind("$$fxntab", Global.newArray());
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray());
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.seal("length");
        vo.bind("Object", om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2.Object", "ti.catalog.msp430.peripherals.special_function"));
        pkgV.bind("IE2", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("IE2");
    }

    void $$INITIALIZATION()
    {
        Value.Obj vo;

        if (isCFG) {
        }//isCFG
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE1", "ti.catalog.msp430.peripherals.special_function"));
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("ti.catalog.msp430.peripherals.special_function.IE2", "ti.catalog.msp430.peripherals.special_function"));
        Global.callFxn("init", pkgV);
        ((Value.Obj)om.getv("ti.catalog.msp430.peripherals.special_function.IE1")).bless();
        ((Value.Obj)om.getv("ti.catalog.msp430.peripherals.special_function.IE2")).bless();
        ((Value.Arr)om.findStrict("$packages", "ti.catalog.msp430.peripherals.special_function")).add(pkgV);
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
        IE1$$OBJECTS();
        IE2$$OBJECTS();
        IE1$$CONSTS();
        IE2$$CONSTS();
        IE1$$CREATES();
        IE2$$CREATES();
        IE1$$FUNCTIONS();
        IE2$$FUNCTIONS();
        IE1$$SIZES();
        IE2$$SIZES();
        IE1$$TYPES();
        IE2$$TYPES();
        if (isROV) {
            IE1$$ROV();
            IE2$$ROV();
        }//isROV
        $$SINGLETONS();
        IE1$$SINGLETONS();
        IE2$$SINGLETONS();
        $$INITIALIZATION();
    }
}
