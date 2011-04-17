/*
 *  Do not modify this file; it is automatically 
 *  generated and any modifications will be overwritten.
 *
 * @(#) xdc-v53
 */
import java.util.*;
import org.mozilla.javascript.*;
import xdc.services.intern.xsr.*;
import xdc.services.spec.*;

public class ti_catalog_t16
{
    static final String VERS = "@(#) xdc-v53\n";

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
        Global.callFxn("loadPackage", xdcO, "xdc.platform");
        Global.callFxn("loadPackage", xdcO, "xdc");
        Global.callFxn("loadPackage", xdcO, "xdc.corevers");
        Global.callFxn("loadPackage", xdcO, "ti.catalog");
    }

    void $$OBJECTS()
    {
        pkgP = (Proto.Obj)om.bind("ti.catalog.t16.Package", new Proto.Obj());
        pkgV = (Value.Obj)om.bind("ti.catalog.t16", new Value.Obj("ti.catalog.t16", pkgP));
    }

    void T16v200$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.t16.T16v200.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.t16.T16v200", new Value.Obj("ti.catalog.t16.T16v200", po));
        pkgV.bind("T16v200", vo);
        // decls 
        // insts 
        Object insP = om.bind("ti.catalog.t16.T16v200.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.t16.T16v200$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.t16.T16v200.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.t16.T16v200$$Params", new Proto.Obj());
        om.bind("ti.catalog.t16.T16v200.Params", new Proto.Str(po, true));
    }

    void T16v200$$CONSTS()
    {
        // module T16v200
    }

    void T16v200$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

        fxn = (Proto.Fxn)om.bind("ti.catalog.t16.T16v200$$create", new Proto.Fxn(om.findStrict("ti.catalog.t16.T16v200.Module", "ti.catalog.t16"), om.findStrict("ti.catalog.t16.T16v200.Instance", "ti.catalog.t16"), 2, 1, false));
                fxn.addArg(0, "revision", $$T_Str, $$UNDEF);
                fxn.addArg(1, "__params", (Proto)om.findStrict("ti.catalog.t16.T16v200.Params", "ti.catalog.t16"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$t16$T16v200$$create = function( revision, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.t16.T16v200'];\n");
            sb.append("var __inst = xdc.om['ti.catalog.t16.T16v200.Instance'].$$make();\n");
            sb.append("__inst.$$bind('$package', xdc.om['ti.catalog.t16']);\n");
            sb.append("__inst.$$bind('$index', __mod.$instances.length);\n");
            sb.append("__inst.$$bind('$category', 'Instance');\n");
            sb.append("__inst.$$bind('$args', {revision:revision});\n");
            sb.append("__inst.$$bind('$module', __mod);\n");
            sb.append("__mod.$instances.$add(__inst);\n");
            sb.append("__inst.cpuCore = __mod.PARAMS.cpuCore;\n");
            sb.append("__inst.cpuCoreRevision = __mod.PARAMS.cpuCoreRevision;\n");
            sb.append("__inst.minProgUnitSize = __mod.PARAMS.minProgUnitSize;\n");
            sb.append("__inst.minDataUnitSize = __mod.PARAMS.minDataUnitSize;\n");
            sb.append("__inst.dataWordSize = __mod.PARAMS.dataWordSize;\n");
            sb.append("__inst.peripherals = __mod.PARAMS.peripherals;\n");
            sb.append("__inst.deviceHeader = __mod.PARAMS.deviceHeader;\n");
            sb.append("__inst.isa = __mod.PARAMS.isa;\n");
            sb.append("for (__p in __params) __inst[__p] = __params[__p];\n");
            sb.append("var save = xdc.om.$curpkg;\n");
            sb.append("xdc.om.$$bind('$curpkg', __mod.$package.$name);\n");
            sb.append("__mod.instance$meta$init.$fxn.apply(__inst, [revision]);\n");
            sb.append("xdc.om.$$bind('$curpkg', save);\n");
            sb.append("__inst.$$bless();\n");
            sb.append("return __inst;\n");
        sb.append("}\n");
        Global.eval(sb.toString());
        fxn = (Proto.Fxn)om.bind("ti.catalog.t16.T16v200$$construct", new Proto.Fxn(om.findStrict("ti.catalog.t16.T16v200.Module", "ti.catalog.t16"), null, 3, 1, false));
                fxn.addArg(0, "__obj", (Proto)om.findStrict("ti.catalog.t16.T16v200$$Object", "ti.catalog.t16"), null);
                fxn.addArg(1, "revision", $$T_Str, $$UNDEF);
                fxn.addArg(2, "__params", (Proto)om.findStrict("ti.catalog.t16.T16v200.Params", "ti.catalog.t16"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$t16$T16v200$$construct = function( __obj, revision, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.t16.T16v200'];\n");
            sb.append("var __inst = __obj;\n");
            sb.append("__inst.$$bind('$args', {revision:revision});\n");
            sb.append("__inst.$$bind('$module', __mod);\n");
            sb.append("__mod.$objects.$add(__inst);\n");
            sb.append("__inst.cpuCore = __mod.PARAMS.cpuCore;\n");
            sb.append("__inst.cpuCoreRevision = __mod.PARAMS.cpuCoreRevision;\n");
            sb.append("__inst.minProgUnitSize = __mod.PARAMS.minProgUnitSize;\n");
            sb.append("__inst.minDataUnitSize = __mod.PARAMS.minDataUnitSize;\n");
            sb.append("__inst.dataWordSize = __mod.PARAMS.dataWordSize;\n");
            sb.append("__inst.peripherals = __mod.PARAMS.peripherals;\n");
            sb.append("__inst.deviceHeader = __mod.PARAMS.deviceHeader;\n");
            sb.append("__inst.isa = __mod.PARAMS.isa;\n");
            sb.append("for (__p in __params) __inst[__p] = __params[__p];\n");
            sb.append("__inst.$$bless();\n");
            sb.append("return null;\n");
        sb.append("}\n");
        Global.eval(sb.toString());
    }

    void T16v200$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void T16v200$$SIZES()
    {
    }

    void T16v200$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        cap = (Scriptable)Global.callFxn("loadCapsule", xdcO, "ti/catalog/t16/T16v200.xs");
        om.bind("ti.catalog.t16.T16v200$$capsule", cap);
        po = (Proto.Obj)om.findStrict("ti.catalog.t16.T16v200.Module", "ti.catalog.t16");
        po.init("ti.catalog.t16.T16v200.Module", om.findStrict("ti.catalog.ICpuDataSheet.Module", "ti.catalog.t16"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("create", (Proto.Fxn)om.findStrict("ti.catalog.t16.T16v200$$create", "ti.catalog.t16"), Global.get("ti$catalog$t16$T16v200$$create"));
                po.addFxn("construct", (Proto.Fxn)om.findStrict("ti.catalog.t16.T16v200$$construct", "ti.catalog.t16"), Global.get("ti$catalog$t16$T16v200$$construct"));
        fxn = Global.get(cap, "module$use");
        if (fxn != null) om.bind("ti.catalog.t16.T16v200$$module$use", true);
        if (fxn != null) po.addFxn("module$use", $$T_Met, fxn);
        fxn = Global.get(cap, "module$meta$init");
        if (fxn != null) om.bind("ti.catalog.t16.T16v200$$module$meta$init", true);
        if (fxn != null) po.addFxn("module$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "instance$meta$init");
        if (fxn != null) om.bind("ti.catalog.t16.T16v200$$instance$meta$init", true);
        if (fxn != null) po.addFxn("instance$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "module$validate");
        if (fxn != null) om.bind("ti.catalog.t16.T16v200$$module$validate", true);
        if (fxn != null) po.addFxn("module$validate", $$T_Met, fxn);
        po = (Proto.Obj)om.findStrict("ti.catalog.t16.T16v200.Instance", "ti.catalog.t16");
        po.init("ti.catalog.t16.T16v200.Instance", om.findStrict("ti.catalog.ICpuDataSheet.Instance", "ti.catalog.t16"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("cpuCore", $$T_Str, "TORRENT_T16", "wh");
        po.addFld("isa", $$T_Str, "t16", "wh");
        po.addFld("cpuCoreRevision", $$T_Str, "1.0", "wh");
        po.addFld("minProgUnitSize", Proto.Elm.newCNum("(xdc_Int)"), 1L, "wh");
        po.addFld("minDataUnitSize", Proto.Elm.newCNum("(xdc_Int)"), 1L, "wh");
        po.addFld("dataWordSize", Proto.Elm.newCNum("(xdc_Int)"), 4L, "wh");
        po.addFld("memMap", new Proto.Map((Proto)om.findStrict("xdc.platform.IPlatform.Memory", "ti.catalog.t16")), Global.newArray(new Object[]{Global.newArray(new Object[]{"CODEMEM", Global.newObject("comment", "256MB T16 code memory", "name", "CODEMEM", "base", 0x0L, "len", 0x10000000L, "space", "code", "access", "RX")}), Global.newArray(new Object[]{"DMEM", Global.newObject("comment", "32KB T16 data memory", "name", "DMEM", "base", 0x10020000L, "len", 0x8000L, "space", "data", "access", "RW")}), Global.newArray(new Object[]{"WBUF", Global.newObject("comment", "VCOP work buffer", "name", "WBUF", "base", 0x10040000L, "len", 0x8000L, "space", "data", "access", "RW")}), Global.newArray(new Object[]{"IBUFLA", Global.newObject("comment", "Image buffer low copy A", "name", "IBUFLA", "base", 0x10050000L, "len", 0x4000L, "space", "data", "access", "RW")}), Global.newArray(new Object[]{"IBUFHA", Global.newObject("comment", "Image buffer high copy A", "name", "IBUFHA", "base", 0x10054000L, "len", 0x4000L, "space", "data", "access", "RW")}), Global.newArray(new Object[]{"IBUFLB", Global.newObject("comment", "Image buffer low copy B", "name", "IBUFLB", "base", 0x10070000L, "len", 0x4000L, "space", "data", "access", "RW")}), Global.newArray(new Object[]{"IBUFHB", Global.newObject("comment", "Image buffer high copy B", "name", "IBUFHB", "base", 0x10074000L, "len", 0x4000L, "space", "data", "access", "RW")}), Global.newArray(new Object[]{"L3MEM", Global.newObject("comment", "1MB L3 Memory", "name", "L3MEM", "base", 0x7FF00000L, "len", 0x00100000L, "space", "code/data", "access", "RWX")})}), "wh");
                fxn = Global.get(cap, "getMemoryMap");
                if (fxn != null) po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.t16"), fxn);
                fxn = Global.get(cap, "getRegisterSet");
                if (fxn != null) po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.t16"), fxn);
        po = (Proto.Obj)om.findStrict("ti.catalog.t16.T16v200$$Params", "ti.catalog.t16");
        po.init("ti.catalog.t16.T16v200.Params", om.findStrict("ti.catalog.ICpuDataSheet$$Params", "ti.catalog.t16"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("cpuCore", $$T_Str, "TORRENT_T16", "wh");
        po.addFld("isa", $$T_Str, "t16", "wh");
        po.addFld("cpuCoreRevision", $$T_Str, "1.0", "wh");
        po.addFld("minProgUnitSize", Proto.Elm.newCNum("(xdc_Int)"), 1L, "wh");
        po.addFld("minDataUnitSize", Proto.Elm.newCNum("(xdc_Int)"), 1L, "wh");
        po.addFld("dataWordSize", Proto.Elm.newCNum("(xdc_Int)"), 4L, "wh");
        po.addFld("memMap", new Proto.Map((Proto)om.findStrict("xdc.platform.IPlatform.Memory", "ti.catalog.t16")), Global.newArray(new Object[]{Global.newArray(new Object[]{"CODEMEM", Global.newObject("comment", "256MB T16 code memory", "name", "CODEMEM", "base", 0x0L, "len", 0x10000000L, "space", "code", "access", "RX")}), Global.newArray(new Object[]{"DMEM", Global.newObject("comment", "32KB T16 data memory", "name", "DMEM", "base", 0x10020000L, "len", 0x8000L, "space", "data", "access", "RW")}), Global.newArray(new Object[]{"WBUF", Global.newObject("comment", "VCOP work buffer", "name", "WBUF", "base", 0x10040000L, "len", 0x8000L, "space", "data", "access", "RW")}), Global.newArray(new Object[]{"IBUFLA", Global.newObject("comment", "Image buffer low copy A", "name", "IBUFLA", "base", 0x10050000L, "len", 0x4000L, "space", "data", "access", "RW")}), Global.newArray(new Object[]{"IBUFHA", Global.newObject("comment", "Image buffer high copy A", "name", "IBUFHA", "base", 0x10054000L, "len", 0x4000L, "space", "data", "access", "RW")}), Global.newArray(new Object[]{"IBUFLB", Global.newObject("comment", "Image buffer low copy B", "name", "IBUFLB", "base", 0x10070000L, "len", 0x4000L, "space", "data", "access", "RW")}), Global.newArray(new Object[]{"IBUFHB", Global.newObject("comment", "Image buffer high copy B", "name", "IBUFHB", "base", 0x10074000L, "len", 0x4000L, "space", "data", "access", "RW")}), Global.newArray(new Object[]{"L3MEM", Global.newObject("comment", "1MB L3 Memory", "name", "L3MEM", "base", 0x7FF00000L, "len", 0x00100000L, "space", "code/data", "access", "RWX")})}), "wh");
        po = (Proto.Obj)om.findStrict("ti.catalog.t16.T16v200$$Object", "ti.catalog.t16");
        po.init("ti.catalog.t16.T16v200.Object", om.findStrict("ti.catalog.t16.T16v200.Instance", "ti.catalog.t16"));
                fxn = Global.get(cap, "getMemoryMap");
                if (fxn != null) po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.t16"), fxn);
                fxn = Global.get(cap, "getRegisterSet");
                if (fxn != null) po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.t16"), fxn);
    }

    void T16v200$$ROV()
    {
    }

    void $$SINGLETONS()
    {
        pkgP.init("ti.catalog.t16.Package", (Proto.Obj)om.findStrict("xdc.IPackage.Module", "ti.catalog.t16"));
        pkgP.bind("$capsule", $$UNDEF);
        pkgV.init2(pkgP, "ti.catalog.t16", Value.DEFAULT, false);
        pkgV.bind("$name", "ti.catalog.t16");
        pkgV.bind("$category", "Package");
        pkgV.bind("$$qn", "ti.catalog.t16.");
        pkgV.bind("$vers", Global.newArray("1, 0, 0, 0"));
        Value.Map atmap = (Value.Map)pkgV.getv("$attr");
        atmap.seal("length");
        imports.clear();
        imports.add(Global.newArray("xdc.platform", Global.newArray()));
        pkgV.bind("$imports", imports);
        StringBuilder sb = new StringBuilder();
        sb.append("var pkg = xdc.om['ti.catalog.t16'];\n");
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

    void T16v200$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.t16.T16v200", "ti.catalog.t16");
        po = (Proto.Obj)om.findStrict("ti.catalog.t16.T16v200.Module", "ti.catalog.t16");
        vo.init2(po, "ti.catalog.t16.T16v200", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", om.findStrict("ti.catalog.t16.T16v200$$capsule", "ti.catalog.t16"));
        vo.bind("Instance", om.findStrict("ti.catalog.t16.T16v200.Instance", "ti.catalog.t16"));
        vo.bind("Params", om.findStrict("ti.catalog.t16.T16v200.Params", "ti.catalog.t16"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.t16.T16v200.Params", "ti.catalog.t16")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.t16", "ti.catalog.t16"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "ti.catalog.t16")).add(vo);
        vo.bind("$$instflag", 1);
        vo.bind("$$iobjflag", 1);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 1);
        vo.bind("$$romcfgs", "|");
        Proto.Str ps = (Proto.Str)vo.find("Module_State");
        if (ps != null) vo.bind("$object", ps.newInstance());
        vo.bind("$$meta_iobj", om.has("ti.catalog.t16.T16v200$$instance$static$init", null) ? 1 : 0);
        vo.bind("$$fxntab", Global.newArray());
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray());
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.seal("length");
        vo.bind("Object", om.findStrict("ti.catalog.t16.T16v200.Object", "ti.catalog.t16"));
        pkgV.bind("T16v200", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("T16v200");
    }

    void $$INITIALIZATION()
    {
        Value.Obj vo;

        if (isCFG) {
        }//isCFG
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("ti.catalog.t16.T16v200", "ti.catalog.t16"));
        Global.callFxn("init", pkgV);
        ((Value.Obj)om.getv("ti.catalog.t16.T16v200")).bless();
        ((Value.Arr)om.findStrict("$packages", "ti.catalog.t16")).add(pkgV);
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
        T16v200$$OBJECTS();
        T16v200$$CONSTS();
        T16v200$$CREATES();
        T16v200$$FUNCTIONS();
        T16v200$$SIZES();
        T16v200$$TYPES();
        if (isROV) {
            T16v200$$ROV();
        }//isROV
        $$SINGLETONS();
        T16v200$$SINGLETONS();
        $$INITIALIZATION();
    }
}
