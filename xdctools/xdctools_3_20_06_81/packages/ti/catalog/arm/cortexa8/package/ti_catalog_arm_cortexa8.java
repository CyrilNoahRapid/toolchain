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

public class ti_catalog_arm_cortexa8
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
        Global.callFxn("loadPackage", xdcO, "ti.catalog.peripherals.hdvicp2");
        Global.callFxn("loadPackage", xdcO, "xdc");
        Global.callFxn("loadPackage", xdcO, "xdc.corevers");
        Global.callFxn("loadPackage", xdcO, "ti.catalog");
    }

    void $$OBJECTS()
    {
        pkgP = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.Package", new Proto.Obj());
        pkgV = (Value.Obj)om.bind("ti.catalog.arm.cortexa8", new Value.Obj("ti.catalog.arm.cortexa8", pkgP));
    }

    void IOMAP3xxx$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.IOMAP3xxx.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.arm.cortexa8.IOMAP3xxx", new Value.Obj("ti.catalog.arm.cortexa8.IOMAP3xxx", po));
        pkgV.bind("IOMAP3xxx", vo);
        // decls 
        // insts 
        Object insP = om.bind("ti.catalog.arm.cortexa8.IOMAP3xxx.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.IOMAP3xxx$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.arm.cortexa8.IOMAP3xxx.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.IOMAP3xxx$$Params", new Proto.Obj());
        om.bind("ti.catalog.arm.cortexa8.IOMAP3xxx.Params", new Proto.Str(po, true));
    }

    void OMAP3403$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.OMAP3403.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.arm.cortexa8.OMAP3403", new Value.Obj("ti.catalog.arm.cortexa8.OMAP3403", po));
        pkgV.bind("OMAP3403", vo);
        // decls 
        // insts 
        Object insP = om.bind("ti.catalog.arm.cortexa8.OMAP3403.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.OMAP3403$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.arm.cortexa8.OMAP3403.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.OMAP3403$$Params", new Proto.Obj());
        om.bind("ti.catalog.arm.cortexa8.OMAP3403.Params", new Proto.Str(po, true));
    }

    void OMAP3405$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.OMAP3405.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.arm.cortexa8.OMAP3405", new Value.Obj("ti.catalog.arm.cortexa8.OMAP3405", po));
        pkgV.bind("OMAP3405", vo);
        // decls 
        // insts 
        Object insP = om.bind("ti.catalog.arm.cortexa8.OMAP3405.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.OMAP3405$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.arm.cortexa8.OMAP3405.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.OMAP3405$$Params", new Proto.Obj());
        om.bind("ti.catalog.arm.cortexa8.OMAP3405.Params", new Proto.Str(po, true));
    }

    void OMAP3503$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.OMAP3503.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.arm.cortexa8.OMAP3503", new Value.Obj("ti.catalog.arm.cortexa8.OMAP3503", po));
        pkgV.bind("OMAP3503", vo);
        // decls 
        // insts 
        Object insP = om.bind("ti.catalog.arm.cortexa8.OMAP3503.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.OMAP3503$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.arm.cortexa8.OMAP3503.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.OMAP3503$$Params", new Proto.Obj());
        om.bind("ti.catalog.arm.cortexa8.OMAP3503.Params", new Proto.Str(po, true));
    }

    void OMAP3505$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.OMAP3505.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.arm.cortexa8.OMAP3505", new Value.Obj("ti.catalog.arm.cortexa8.OMAP3505", po));
        pkgV.bind("OMAP3505", vo);
        // decls 
        // insts 
        Object insP = om.bind("ti.catalog.arm.cortexa8.OMAP3505.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.OMAP3505$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.arm.cortexa8.OMAP3505.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.OMAP3505$$Params", new Proto.Obj());
        om.bind("ti.catalog.arm.cortexa8.OMAP3505.Params", new Proto.Str(po, true));
    }

    void OMAP3515$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.OMAP3515.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.arm.cortexa8.OMAP3515", new Value.Obj("ti.catalog.arm.cortexa8.OMAP3515", po));
        pkgV.bind("OMAP3515", vo);
        // decls 
        // insts 
        Object insP = om.bind("ti.catalog.arm.cortexa8.OMAP3515.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.OMAP3515$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.arm.cortexa8.OMAP3515.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.OMAP3515$$Params", new Proto.Obj());
        om.bind("ti.catalog.arm.cortexa8.OMAP3515.Params", new Proto.Str(po, true));
    }

    void OMAP3517$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.OMAP3517.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.arm.cortexa8.OMAP3517", new Value.Obj("ti.catalog.arm.cortexa8.OMAP3517", po));
        pkgV.bind("OMAP3517", vo);
        // decls 
        // insts 
        Object insP = om.bind("ti.catalog.arm.cortexa8.OMAP3517.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.OMAP3517$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.arm.cortexa8.OMAP3517.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.OMAP3517$$Params", new Proto.Obj());
        om.bind("ti.catalog.arm.cortexa8.OMAP3517.Params", new Proto.Str(po, true));
    }

    void OMAP3425$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.OMAP3425.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.arm.cortexa8.OMAP3425", new Value.Obj("ti.catalog.arm.cortexa8.OMAP3425", po));
        pkgV.bind("OMAP3425", vo);
        // decls 
        // insts 
        Object insP = om.bind("ti.catalog.arm.cortexa8.OMAP3425.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.OMAP3425$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.arm.cortexa8.OMAP3425.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.OMAP3425$$Params", new Proto.Obj());
        om.bind("ti.catalog.arm.cortexa8.OMAP3425.Params", new Proto.Str(po, true));
    }

    void OMAP3525$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.OMAP3525.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.arm.cortexa8.OMAP3525", new Value.Obj("ti.catalog.arm.cortexa8.OMAP3525", po));
        pkgV.bind("OMAP3525", vo);
        // decls 
        // insts 
        Object insP = om.bind("ti.catalog.arm.cortexa8.OMAP3525.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.OMAP3525$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.arm.cortexa8.OMAP3525.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.OMAP3525$$Params", new Proto.Obj());
        om.bind("ti.catalog.arm.cortexa8.OMAP3525.Params", new Proto.Str(po, true));
    }

    void TMS320C3430$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.TMS320C3430.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.arm.cortexa8.TMS320C3430", new Value.Obj("ti.catalog.arm.cortexa8.TMS320C3430", po));
        pkgV.bind("TMS320C3430", vo);
        // decls 
        // insts 
        Object insP = om.bind("ti.catalog.arm.cortexa8.TMS320C3430.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.TMS320C3430$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.arm.cortexa8.TMS320C3430.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.TMS320C3430$$Params", new Proto.Obj());
        om.bind("ti.catalog.arm.cortexa8.TMS320C3430.Params", new Proto.Str(po, true));
    }

    void OMAP3530$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.OMAP3530.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.arm.cortexa8.OMAP3530", new Value.Obj("ti.catalog.arm.cortexa8.OMAP3530", po));
        pkgV.bind("OMAP3530", vo);
        // decls 
        // insts 
        Object insP = om.bind("ti.catalog.arm.cortexa8.OMAP3530.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.OMAP3530$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.arm.cortexa8.OMAP3530.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.OMAP3530$$Params", new Proto.Obj());
        om.bind("ti.catalog.arm.cortexa8.OMAP3530.Params", new Proto.Str(po, true));
    }

    void ITI8168$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.ITI8168.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.arm.cortexa8.ITI8168", new Value.Obj("ti.catalog.arm.cortexa8.ITI8168", po));
        pkgV.bind("ITI8168", vo);
        // decls 
        // insts 
        Object insP = om.bind("ti.catalog.arm.cortexa8.ITI8168.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.ITI8168$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.arm.cortexa8.ITI8168.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.ITI8168$$Params", new Proto.Obj());
        om.bind("ti.catalog.arm.cortexa8.ITI8168.Params", new Proto.Str(po, true));
    }

    void TMS320TI816X$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.TMS320TI816X.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.arm.cortexa8.TMS320TI816X", new Value.Obj("ti.catalog.arm.cortexa8.TMS320TI816X", po));
        pkgV.bind("TMS320TI816X", vo);
        // decls 
        // insts 
        Object insP = om.bind("ti.catalog.arm.cortexa8.TMS320TI816X.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.TMS320TI816X$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.arm.cortexa8.TMS320TI816X.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.TMS320TI816X$$Params", new Proto.Obj());
        om.bind("ti.catalog.arm.cortexa8.TMS320TI816X.Params", new Proto.Str(po, true));
    }

    void TMS320DM8168$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.TMS320DM8168.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.arm.cortexa8.TMS320DM8168", new Value.Obj("ti.catalog.arm.cortexa8.TMS320DM8168", po));
        pkgV.bind("TMS320DM8168", vo);
        // decls 
        // insts 
        Object insP = om.bind("ti.catalog.arm.cortexa8.TMS320DM8168.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.TMS320DM8168$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.arm.cortexa8.TMS320DM8168.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.TMS320DM8168$$Params", new Proto.Obj());
        om.bind("ti.catalog.arm.cortexa8.TMS320DM8168.Params", new Proto.Str(po, true));
    }

    void TMS320C6A8168$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.TMS320C6A8168.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.arm.cortexa8.TMS320C6A8168", new Value.Obj("ti.catalog.arm.cortexa8.TMS320C6A8168", po));
        pkgV.bind("TMS320C6A8168", vo);
        // decls 
        // insts 
        Object insP = om.bind("ti.catalog.arm.cortexa8.TMS320C6A8168.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.TMS320C6A8168$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.arm.cortexa8.TMS320C6A8168.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.TMS320C6A8168$$Params", new Proto.Obj());
        om.bind("ti.catalog.arm.cortexa8.TMS320C6A8168.Params", new Proto.Str(po, true));
    }

    void ITI8148$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.ITI8148.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.arm.cortexa8.ITI8148", new Value.Obj("ti.catalog.arm.cortexa8.ITI8148", po));
        pkgV.bind("ITI8148", vo);
        // decls 
        // insts 
        Object insP = om.bind("ti.catalog.arm.cortexa8.ITI8148.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.ITI8148$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.arm.cortexa8.ITI8148.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.ITI8148$$Params", new Proto.Obj());
        om.bind("ti.catalog.arm.cortexa8.ITI8148.Params", new Proto.Str(po, true));
    }

    void TMS320TI814X$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.TMS320TI814X.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.arm.cortexa8.TMS320TI814X", new Value.Obj("ti.catalog.arm.cortexa8.TMS320TI814X", po));
        pkgV.bind("TMS320TI814X", vo);
        // decls 
        // insts 
        Object insP = om.bind("ti.catalog.arm.cortexa8.TMS320TI814X.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.TMS320TI814X$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.arm.cortexa8.TMS320TI814X.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.TMS320TI814X$$Params", new Proto.Obj());
        om.bind("ti.catalog.arm.cortexa8.TMS320TI814X.Params", new Proto.Str(po, true));
    }

    void TMS320DM8148$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.TMS320DM8148.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.arm.cortexa8.TMS320DM8148", new Value.Obj("ti.catalog.arm.cortexa8.TMS320DM8148", po));
        pkgV.bind("TMS320DM8148", vo);
        // decls 
        // insts 
        Object insP = om.bind("ti.catalog.arm.cortexa8.TMS320DM8148.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.TMS320DM8148$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.arm.cortexa8.TMS320DM8148.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexa8.TMS320DM8148$$Params", new Proto.Obj());
        om.bind("ti.catalog.arm.cortexa8.TMS320DM8148.Params", new Proto.Str(po, true));
    }

    void IOMAP3xxx$$CONSTS()
    {
        // interface IOMAP3xxx
    }

    void OMAP3403$$CONSTS()
    {
        // module OMAP3403
    }

    void OMAP3405$$CONSTS()
    {
        // module OMAP3405
    }

    void OMAP3503$$CONSTS()
    {
        // module OMAP3503
    }

    void OMAP3505$$CONSTS()
    {
        // module OMAP3505
    }

    void OMAP3515$$CONSTS()
    {
        // module OMAP3515
    }

    void OMAP3517$$CONSTS()
    {
        // module OMAP3517
    }

    void OMAP3425$$CONSTS()
    {
        // module OMAP3425
    }

    void OMAP3525$$CONSTS()
    {
        // module OMAP3525
    }

    void TMS320C3430$$CONSTS()
    {
        // module TMS320C3430
    }

    void OMAP3530$$CONSTS()
    {
        // module OMAP3530
    }

    void ITI8168$$CONSTS()
    {
        // interface ITI8168
    }

    void TMS320TI816X$$CONSTS()
    {
        // module TMS320TI816X
    }

    void TMS320DM8168$$CONSTS()
    {
        // module TMS320DM8168
    }

    void TMS320C6A8168$$CONSTS()
    {
        // module TMS320C6A8168
    }

    void ITI8148$$CONSTS()
    {
        // interface ITI8148
    }

    void TMS320TI814X$$CONSTS()
    {
        // module TMS320TI814X
    }

    void TMS320DM8148$$CONSTS()
    {
        // module TMS320DM8148
    }

    void IOMAP3xxx$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

    }

    void OMAP3403$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

        fxn = (Proto.Fxn)om.bind("ti.catalog.arm.cortexa8.OMAP3403$$create", new Proto.Fxn(om.findStrict("ti.catalog.arm.cortexa8.OMAP3403.Module", "ti.catalog.arm.cortexa8"), om.findStrict("ti.catalog.arm.cortexa8.OMAP3403.Instance", "ti.catalog.arm.cortexa8"), 2, 1, false));
                fxn.addArg(0, "revision", $$T_Str, $$UNDEF);
                fxn.addArg(1, "__params", (Proto)om.findStrict("ti.catalog.arm.cortexa8.OMAP3403.Params", "ti.catalog.arm.cortexa8"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$arm$cortexa8$OMAP3403$$create = function( revision, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.arm.cortexa8.OMAP3403'];\n");
            sb.append("var __inst = xdc.om['ti.catalog.arm.cortexa8.OMAP3403.Instance'].$$make();\n");
            sb.append("__inst.$$bind('$package', xdc.om['ti.catalog.arm.cortexa8']);\n");
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
        fxn = (Proto.Fxn)om.bind("ti.catalog.arm.cortexa8.OMAP3403$$construct", new Proto.Fxn(om.findStrict("ti.catalog.arm.cortexa8.OMAP3403.Module", "ti.catalog.arm.cortexa8"), null, 3, 1, false));
                fxn.addArg(0, "__obj", (Proto)om.findStrict("ti.catalog.arm.cortexa8.OMAP3403$$Object", "ti.catalog.arm.cortexa8"), null);
                fxn.addArg(1, "revision", $$T_Str, $$UNDEF);
                fxn.addArg(2, "__params", (Proto)om.findStrict("ti.catalog.arm.cortexa8.OMAP3403.Params", "ti.catalog.arm.cortexa8"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$arm$cortexa8$OMAP3403$$construct = function( __obj, revision, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.arm.cortexa8.OMAP3403'];\n");
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

    void OMAP3405$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

        fxn = (Proto.Fxn)om.bind("ti.catalog.arm.cortexa8.OMAP3405$$create", new Proto.Fxn(om.findStrict("ti.catalog.arm.cortexa8.OMAP3405.Module", "ti.catalog.arm.cortexa8"), om.findStrict("ti.catalog.arm.cortexa8.OMAP3405.Instance", "ti.catalog.arm.cortexa8"), 2, 1, false));
                fxn.addArg(0, "revision", $$T_Str, $$UNDEF);
                fxn.addArg(1, "__params", (Proto)om.findStrict("ti.catalog.arm.cortexa8.OMAP3405.Params", "ti.catalog.arm.cortexa8"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$arm$cortexa8$OMAP3405$$create = function( revision, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.arm.cortexa8.OMAP3405'];\n");
            sb.append("var __inst = xdc.om['ti.catalog.arm.cortexa8.OMAP3405.Instance'].$$make();\n");
            sb.append("__inst.$$bind('$package', xdc.om['ti.catalog.arm.cortexa8']);\n");
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
        fxn = (Proto.Fxn)om.bind("ti.catalog.arm.cortexa8.OMAP3405$$construct", new Proto.Fxn(om.findStrict("ti.catalog.arm.cortexa8.OMAP3405.Module", "ti.catalog.arm.cortexa8"), null, 3, 1, false));
                fxn.addArg(0, "__obj", (Proto)om.findStrict("ti.catalog.arm.cortexa8.OMAP3405$$Object", "ti.catalog.arm.cortexa8"), null);
                fxn.addArg(1, "revision", $$T_Str, $$UNDEF);
                fxn.addArg(2, "__params", (Proto)om.findStrict("ti.catalog.arm.cortexa8.OMAP3405.Params", "ti.catalog.arm.cortexa8"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$arm$cortexa8$OMAP3405$$construct = function( __obj, revision, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.arm.cortexa8.OMAP3405'];\n");
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

    void OMAP3503$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

        fxn = (Proto.Fxn)om.bind("ti.catalog.arm.cortexa8.OMAP3503$$create", new Proto.Fxn(om.findStrict("ti.catalog.arm.cortexa8.OMAP3503.Module", "ti.catalog.arm.cortexa8"), om.findStrict("ti.catalog.arm.cortexa8.OMAP3503.Instance", "ti.catalog.arm.cortexa8"), 2, 1, false));
                fxn.addArg(0, "revision", $$T_Str, $$UNDEF);
                fxn.addArg(1, "__params", (Proto)om.findStrict("ti.catalog.arm.cortexa8.OMAP3503.Params", "ti.catalog.arm.cortexa8"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$arm$cortexa8$OMAP3503$$create = function( revision, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.arm.cortexa8.OMAP3503'];\n");
            sb.append("var __inst = xdc.om['ti.catalog.arm.cortexa8.OMAP3503.Instance'].$$make();\n");
            sb.append("__inst.$$bind('$package', xdc.om['ti.catalog.arm.cortexa8']);\n");
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
        fxn = (Proto.Fxn)om.bind("ti.catalog.arm.cortexa8.OMAP3503$$construct", new Proto.Fxn(om.findStrict("ti.catalog.arm.cortexa8.OMAP3503.Module", "ti.catalog.arm.cortexa8"), null, 3, 1, false));
                fxn.addArg(0, "__obj", (Proto)om.findStrict("ti.catalog.arm.cortexa8.OMAP3503$$Object", "ti.catalog.arm.cortexa8"), null);
                fxn.addArg(1, "revision", $$T_Str, $$UNDEF);
                fxn.addArg(2, "__params", (Proto)om.findStrict("ti.catalog.arm.cortexa8.OMAP3503.Params", "ti.catalog.arm.cortexa8"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$arm$cortexa8$OMAP3503$$construct = function( __obj, revision, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.arm.cortexa8.OMAP3503'];\n");
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

    void OMAP3505$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

        fxn = (Proto.Fxn)om.bind("ti.catalog.arm.cortexa8.OMAP3505$$create", new Proto.Fxn(om.findStrict("ti.catalog.arm.cortexa8.OMAP3505.Module", "ti.catalog.arm.cortexa8"), om.findStrict("ti.catalog.arm.cortexa8.OMAP3505.Instance", "ti.catalog.arm.cortexa8"), 2, 1, false));
                fxn.addArg(0, "revision", $$T_Str, $$UNDEF);
                fxn.addArg(1, "__params", (Proto)om.findStrict("ti.catalog.arm.cortexa8.OMAP3505.Params", "ti.catalog.arm.cortexa8"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$arm$cortexa8$OMAP3505$$create = function( revision, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.arm.cortexa8.OMAP3505'];\n");
            sb.append("var __inst = xdc.om['ti.catalog.arm.cortexa8.OMAP3505.Instance'].$$make();\n");
            sb.append("__inst.$$bind('$package', xdc.om['ti.catalog.arm.cortexa8']);\n");
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
        fxn = (Proto.Fxn)om.bind("ti.catalog.arm.cortexa8.OMAP3505$$construct", new Proto.Fxn(om.findStrict("ti.catalog.arm.cortexa8.OMAP3505.Module", "ti.catalog.arm.cortexa8"), null, 3, 1, false));
                fxn.addArg(0, "__obj", (Proto)om.findStrict("ti.catalog.arm.cortexa8.OMAP3505$$Object", "ti.catalog.arm.cortexa8"), null);
                fxn.addArg(1, "revision", $$T_Str, $$UNDEF);
                fxn.addArg(2, "__params", (Proto)om.findStrict("ti.catalog.arm.cortexa8.OMAP3505.Params", "ti.catalog.arm.cortexa8"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$arm$cortexa8$OMAP3505$$construct = function( __obj, revision, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.arm.cortexa8.OMAP3505'];\n");
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

    void OMAP3515$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

        fxn = (Proto.Fxn)om.bind("ti.catalog.arm.cortexa8.OMAP3515$$create", new Proto.Fxn(om.findStrict("ti.catalog.arm.cortexa8.OMAP3515.Module", "ti.catalog.arm.cortexa8"), om.findStrict("ti.catalog.arm.cortexa8.OMAP3515.Instance", "ti.catalog.arm.cortexa8"), 2, 1, false));
                fxn.addArg(0, "revision", $$T_Str, $$UNDEF);
                fxn.addArg(1, "__params", (Proto)om.findStrict("ti.catalog.arm.cortexa8.OMAP3515.Params", "ti.catalog.arm.cortexa8"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$arm$cortexa8$OMAP3515$$create = function( revision, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.arm.cortexa8.OMAP3515'];\n");
            sb.append("var __inst = xdc.om['ti.catalog.arm.cortexa8.OMAP3515.Instance'].$$make();\n");
            sb.append("__inst.$$bind('$package', xdc.om['ti.catalog.arm.cortexa8']);\n");
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
        fxn = (Proto.Fxn)om.bind("ti.catalog.arm.cortexa8.OMAP3515$$construct", new Proto.Fxn(om.findStrict("ti.catalog.arm.cortexa8.OMAP3515.Module", "ti.catalog.arm.cortexa8"), null, 3, 1, false));
                fxn.addArg(0, "__obj", (Proto)om.findStrict("ti.catalog.arm.cortexa8.OMAP3515$$Object", "ti.catalog.arm.cortexa8"), null);
                fxn.addArg(1, "revision", $$T_Str, $$UNDEF);
                fxn.addArg(2, "__params", (Proto)om.findStrict("ti.catalog.arm.cortexa8.OMAP3515.Params", "ti.catalog.arm.cortexa8"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$arm$cortexa8$OMAP3515$$construct = function( __obj, revision, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.arm.cortexa8.OMAP3515'];\n");
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

    void OMAP3517$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

        fxn = (Proto.Fxn)om.bind("ti.catalog.arm.cortexa8.OMAP3517$$create", new Proto.Fxn(om.findStrict("ti.catalog.arm.cortexa8.OMAP3517.Module", "ti.catalog.arm.cortexa8"), om.findStrict("ti.catalog.arm.cortexa8.OMAP3517.Instance", "ti.catalog.arm.cortexa8"), 2, 1, false));
                fxn.addArg(0, "revision", $$T_Str, $$UNDEF);
                fxn.addArg(1, "__params", (Proto)om.findStrict("ti.catalog.arm.cortexa8.OMAP3517.Params", "ti.catalog.arm.cortexa8"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$arm$cortexa8$OMAP3517$$create = function( revision, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.arm.cortexa8.OMAP3517'];\n");
            sb.append("var __inst = xdc.om['ti.catalog.arm.cortexa8.OMAP3517.Instance'].$$make();\n");
            sb.append("__inst.$$bind('$package', xdc.om['ti.catalog.arm.cortexa8']);\n");
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
        fxn = (Proto.Fxn)om.bind("ti.catalog.arm.cortexa8.OMAP3517$$construct", new Proto.Fxn(om.findStrict("ti.catalog.arm.cortexa8.OMAP3517.Module", "ti.catalog.arm.cortexa8"), null, 3, 1, false));
                fxn.addArg(0, "__obj", (Proto)om.findStrict("ti.catalog.arm.cortexa8.OMAP3517$$Object", "ti.catalog.arm.cortexa8"), null);
                fxn.addArg(1, "revision", $$T_Str, $$UNDEF);
                fxn.addArg(2, "__params", (Proto)om.findStrict("ti.catalog.arm.cortexa8.OMAP3517.Params", "ti.catalog.arm.cortexa8"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$arm$cortexa8$OMAP3517$$construct = function( __obj, revision, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.arm.cortexa8.OMAP3517'];\n");
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

    void OMAP3425$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

        fxn = (Proto.Fxn)om.bind("ti.catalog.arm.cortexa8.OMAP3425$$create", new Proto.Fxn(om.findStrict("ti.catalog.arm.cortexa8.OMAP3425.Module", "ti.catalog.arm.cortexa8"), om.findStrict("ti.catalog.arm.cortexa8.OMAP3425.Instance", "ti.catalog.arm.cortexa8"), 2, 1, false));
                fxn.addArg(0, "revision", $$T_Str, $$UNDEF);
                fxn.addArg(1, "__params", (Proto)om.findStrict("ti.catalog.arm.cortexa8.OMAP3425.Params", "ti.catalog.arm.cortexa8"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$arm$cortexa8$OMAP3425$$create = function( revision, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.arm.cortexa8.OMAP3425'];\n");
            sb.append("var __inst = xdc.om['ti.catalog.arm.cortexa8.OMAP3425.Instance'].$$make();\n");
            sb.append("__inst.$$bind('$package', xdc.om['ti.catalog.arm.cortexa8']);\n");
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
        fxn = (Proto.Fxn)om.bind("ti.catalog.arm.cortexa8.OMAP3425$$construct", new Proto.Fxn(om.findStrict("ti.catalog.arm.cortexa8.OMAP3425.Module", "ti.catalog.arm.cortexa8"), null, 3, 1, false));
                fxn.addArg(0, "__obj", (Proto)om.findStrict("ti.catalog.arm.cortexa8.OMAP3425$$Object", "ti.catalog.arm.cortexa8"), null);
                fxn.addArg(1, "revision", $$T_Str, $$UNDEF);
                fxn.addArg(2, "__params", (Proto)om.findStrict("ti.catalog.arm.cortexa8.OMAP3425.Params", "ti.catalog.arm.cortexa8"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$arm$cortexa8$OMAP3425$$construct = function( __obj, revision, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.arm.cortexa8.OMAP3425'];\n");
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

    void OMAP3525$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

        fxn = (Proto.Fxn)om.bind("ti.catalog.arm.cortexa8.OMAP3525$$create", new Proto.Fxn(om.findStrict("ti.catalog.arm.cortexa8.OMAP3525.Module", "ti.catalog.arm.cortexa8"), om.findStrict("ti.catalog.arm.cortexa8.OMAP3525.Instance", "ti.catalog.arm.cortexa8"), 2, 1, false));
                fxn.addArg(0, "revision", $$T_Str, $$UNDEF);
                fxn.addArg(1, "__params", (Proto)om.findStrict("ti.catalog.arm.cortexa8.OMAP3525.Params", "ti.catalog.arm.cortexa8"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$arm$cortexa8$OMAP3525$$create = function( revision, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.arm.cortexa8.OMAP3525'];\n");
            sb.append("var __inst = xdc.om['ti.catalog.arm.cortexa8.OMAP3525.Instance'].$$make();\n");
            sb.append("__inst.$$bind('$package', xdc.om['ti.catalog.arm.cortexa8']);\n");
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
        fxn = (Proto.Fxn)om.bind("ti.catalog.arm.cortexa8.OMAP3525$$construct", new Proto.Fxn(om.findStrict("ti.catalog.arm.cortexa8.OMAP3525.Module", "ti.catalog.arm.cortexa8"), null, 3, 1, false));
                fxn.addArg(0, "__obj", (Proto)om.findStrict("ti.catalog.arm.cortexa8.OMAP3525$$Object", "ti.catalog.arm.cortexa8"), null);
                fxn.addArg(1, "revision", $$T_Str, $$UNDEF);
                fxn.addArg(2, "__params", (Proto)om.findStrict("ti.catalog.arm.cortexa8.OMAP3525.Params", "ti.catalog.arm.cortexa8"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$arm$cortexa8$OMAP3525$$construct = function( __obj, revision, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.arm.cortexa8.OMAP3525'];\n");
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

    void TMS320C3430$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

        fxn = (Proto.Fxn)om.bind("ti.catalog.arm.cortexa8.TMS320C3430$$create", new Proto.Fxn(om.findStrict("ti.catalog.arm.cortexa8.TMS320C3430.Module", "ti.catalog.arm.cortexa8"), om.findStrict("ti.catalog.arm.cortexa8.TMS320C3430.Instance", "ti.catalog.arm.cortexa8"), 2, 1, false));
                fxn.addArg(0, "revision", $$T_Str, $$UNDEF);
                fxn.addArg(1, "__params", (Proto)om.findStrict("ti.catalog.arm.cortexa8.TMS320C3430.Params", "ti.catalog.arm.cortexa8"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$arm$cortexa8$TMS320C3430$$create = function( revision, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.arm.cortexa8.TMS320C3430'];\n");
            sb.append("var __inst = xdc.om['ti.catalog.arm.cortexa8.TMS320C3430.Instance'].$$make();\n");
            sb.append("__inst.$$bind('$package', xdc.om['ti.catalog.arm.cortexa8']);\n");
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
        fxn = (Proto.Fxn)om.bind("ti.catalog.arm.cortexa8.TMS320C3430$$construct", new Proto.Fxn(om.findStrict("ti.catalog.arm.cortexa8.TMS320C3430.Module", "ti.catalog.arm.cortexa8"), null, 3, 1, false));
                fxn.addArg(0, "__obj", (Proto)om.findStrict("ti.catalog.arm.cortexa8.TMS320C3430$$Object", "ti.catalog.arm.cortexa8"), null);
                fxn.addArg(1, "revision", $$T_Str, $$UNDEF);
                fxn.addArg(2, "__params", (Proto)om.findStrict("ti.catalog.arm.cortexa8.TMS320C3430.Params", "ti.catalog.arm.cortexa8"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$arm$cortexa8$TMS320C3430$$construct = function( __obj, revision, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.arm.cortexa8.TMS320C3430'];\n");
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

    void OMAP3530$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

        fxn = (Proto.Fxn)om.bind("ti.catalog.arm.cortexa8.OMAP3530$$create", new Proto.Fxn(om.findStrict("ti.catalog.arm.cortexa8.OMAP3530.Module", "ti.catalog.arm.cortexa8"), om.findStrict("ti.catalog.arm.cortexa8.OMAP3530.Instance", "ti.catalog.arm.cortexa8"), 2, 1, false));
                fxn.addArg(0, "revision", $$T_Str, $$UNDEF);
                fxn.addArg(1, "__params", (Proto)om.findStrict("ti.catalog.arm.cortexa8.OMAP3530.Params", "ti.catalog.arm.cortexa8"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$arm$cortexa8$OMAP3530$$create = function( revision, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.arm.cortexa8.OMAP3530'];\n");
            sb.append("var __inst = xdc.om['ti.catalog.arm.cortexa8.OMAP3530.Instance'].$$make();\n");
            sb.append("__inst.$$bind('$package', xdc.om['ti.catalog.arm.cortexa8']);\n");
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
        fxn = (Proto.Fxn)om.bind("ti.catalog.arm.cortexa8.OMAP3530$$construct", new Proto.Fxn(om.findStrict("ti.catalog.arm.cortexa8.OMAP3530.Module", "ti.catalog.arm.cortexa8"), null, 3, 1, false));
                fxn.addArg(0, "__obj", (Proto)om.findStrict("ti.catalog.arm.cortexa8.OMAP3530$$Object", "ti.catalog.arm.cortexa8"), null);
                fxn.addArg(1, "revision", $$T_Str, $$UNDEF);
                fxn.addArg(2, "__params", (Proto)om.findStrict("ti.catalog.arm.cortexa8.OMAP3530.Params", "ti.catalog.arm.cortexa8"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$arm$cortexa8$OMAP3530$$construct = function( __obj, revision, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.arm.cortexa8.OMAP3530'];\n");
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

    void ITI8168$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

    }

    void TMS320TI816X$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

        fxn = (Proto.Fxn)om.bind("ti.catalog.arm.cortexa8.TMS320TI816X$$create", new Proto.Fxn(om.findStrict("ti.catalog.arm.cortexa8.TMS320TI816X.Module", "ti.catalog.arm.cortexa8"), om.findStrict("ti.catalog.arm.cortexa8.TMS320TI816X.Instance", "ti.catalog.arm.cortexa8"), 2, 1, false));
                fxn.addArg(0, "revision", $$T_Str, $$UNDEF);
                fxn.addArg(1, "__params", (Proto)om.findStrict("ti.catalog.arm.cortexa8.TMS320TI816X.Params", "ti.catalog.arm.cortexa8"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$arm$cortexa8$TMS320TI816X$$create = function( revision, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.arm.cortexa8.TMS320TI816X'];\n");
            sb.append("var __inst = xdc.om['ti.catalog.arm.cortexa8.TMS320TI816X.Instance'].$$make();\n");
            sb.append("__inst.$$bind('$package', xdc.om['ti.catalog.arm.cortexa8']);\n");
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
            sb.append("__inst.hdvicp0 = __mod.PARAMS.hdvicp0;\n");
            sb.append("__inst.hdvicp1 = __mod.PARAMS.hdvicp1;\n");
            sb.append("__inst.hdvicp2 = __mod.PARAMS.hdvicp2;\n");
            sb.append("for (__p in __params) __inst[__p] = __params[__p];\n");
            sb.append("var save = xdc.om.$curpkg;\n");
            sb.append("xdc.om.$$bind('$curpkg', __mod.$package.$name);\n");
            sb.append("__mod.instance$meta$init.$fxn.apply(__inst, [revision]);\n");
            sb.append("xdc.om.$$bind('$curpkg', save);\n");
            sb.append("__inst.$$bless();\n");
            sb.append("return __inst;\n");
        sb.append("}\n");
        Global.eval(sb.toString());
        fxn = (Proto.Fxn)om.bind("ti.catalog.arm.cortexa8.TMS320TI816X$$construct", new Proto.Fxn(om.findStrict("ti.catalog.arm.cortexa8.TMS320TI816X.Module", "ti.catalog.arm.cortexa8"), null, 3, 1, false));
                fxn.addArg(0, "__obj", (Proto)om.findStrict("ti.catalog.arm.cortexa8.TMS320TI816X$$Object", "ti.catalog.arm.cortexa8"), null);
                fxn.addArg(1, "revision", $$T_Str, $$UNDEF);
                fxn.addArg(2, "__params", (Proto)om.findStrict("ti.catalog.arm.cortexa8.TMS320TI816X.Params", "ti.catalog.arm.cortexa8"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$arm$cortexa8$TMS320TI816X$$construct = function( __obj, revision, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.arm.cortexa8.TMS320TI816X'];\n");
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
            sb.append("__inst.hdvicp0 = __mod.PARAMS.hdvicp0;\n");
            sb.append("__inst.hdvicp1 = __mod.PARAMS.hdvicp1;\n");
            sb.append("__inst.hdvicp2 = __mod.PARAMS.hdvicp2;\n");
            sb.append("for (__p in __params) __inst[__p] = __params[__p];\n");
            sb.append("__inst.$$bless();\n");
            sb.append("return null;\n");
        sb.append("}\n");
        Global.eval(sb.toString());
    }

    void TMS320DM8168$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

        fxn = (Proto.Fxn)om.bind("ti.catalog.arm.cortexa8.TMS320DM8168$$create", new Proto.Fxn(om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8168.Module", "ti.catalog.arm.cortexa8"), om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8168.Instance", "ti.catalog.arm.cortexa8"), 2, 1, false));
                fxn.addArg(0, "revision", $$T_Str, $$UNDEF);
                fxn.addArg(1, "__params", (Proto)om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8168.Params", "ti.catalog.arm.cortexa8"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$arm$cortexa8$TMS320DM8168$$create = function( revision, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.arm.cortexa8.TMS320DM8168'];\n");
            sb.append("var __inst = xdc.om['ti.catalog.arm.cortexa8.TMS320DM8168.Instance'].$$make();\n");
            sb.append("__inst.$$bind('$package', xdc.om['ti.catalog.arm.cortexa8']);\n");
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
            sb.append("__inst.hdvicp0 = __mod.PARAMS.hdvicp0;\n");
            sb.append("__inst.hdvicp1 = __mod.PARAMS.hdvicp1;\n");
            sb.append("__inst.hdvicp2 = __mod.PARAMS.hdvicp2;\n");
            sb.append("for (__p in __params) __inst[__p] = __params[__p];\n");
            sb.append("var save = xdc.om.$curpkg;\n");
            sb.append("xdc.om.$$bind('$curpkg', __mod.$package.$name);\n");
            sb.append("__mod.instance$meta$init.$fxn.apply(__inst, [revision]);\n");
            sb.append("xdc.om.$$bind('$curpkg', save);\n");
            sb.append("__inst.$$bless();\n");
            sb.append("return __inst;\n");
        sb.append("}\n");
        Global.eval(sb.toString());
        fxn = (Proto.Fxn)om.bind("ti.catalog.arm.cortexa8.TMS320DM8168$$construct", new Proto.Fxn(om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8168.Module", "ti.catalog.arm.cortexa8"), null, 3, 1, false));
                fxn.addArg(0, "__obj", (Proto)om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8168$$Object", "ti.catalog.arm.cortexa8"), null);
                fxn.addArg(1, "revision", $$T_Str, $$UNDEF);
                fxn.addArg(2, "__params", (Proto)om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8168.Params", "ti.catalog.arm.cortexa8"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$arm$cortexa8$TMS320DM8168$$construct = function( __obj, revision, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.arm.cortexa8.TMS320DM8168'];\n");
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
            sb.append("__inst.hdvicp0 = __mod.PARAMS.hdvicp0;\n");
            sb.append("__inst.hdvicp1 = __mod.PARAMS.hdvicp1;\n");
            sb.append("__inst.hdvicp2 = __mod.PARAMS.hdvicp2;\n");
            sb.append("for (__p in __params) __inst[__p] = __params[__p];\n");
            sb.append("__inst.$$bless();\n");
            sb.append("return null;\n");
        sb.append("}\n");
        Global.eval(sb.toString());
    }

    void TMS320C6A8168$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

        fxn = (Proto.Fxn)om.bind("ti.catalog.arm.cortexa8.TMS320C6A8168$$create", new Proto.Fxn(om.findStrict("ti.catalog.arm.cortexa8.TMS320C6A8168.Module", "ti.catalog.arm.cortexa8"), om.findStrict("ti.catalog.arm.cortexa8.TMS320C6A8168.Instance", "ti.catalog.arm.cortexa8"), 2, 1, false));
                fxn.addArg(0, "revision", $$T_Str, $$UNDEF);
                fxn.addArg(1, "__params", (Proto)om.findStrict("ti.catalog.arm.cortexa8.TMS320C6A8168.Params", "ti.catalog.arm.cortexa8"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$arm$cortexa8$TMS320C6A8168$$create = function( revision, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.arm.cortexa8.TMS320C6A8168'];\n");
            sb.append("var __inst = xdc.om['ti.catalog.arm.cortexa8.TMS320C6A8168.Instance'].$$make();\n");
            sb.append("__inst.$$bind('$package', xdc.om['ti.catalog.arm.cortexa8']);\n");
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
            sb.append("__inst.hdvicp0 = __mod.PARAMS.hdvicp0;\n");
            sb.append("__inst.hdvicp1 = __mod.PARAMS.hdvicp1;\n");
            sb.append("__inst.hdvicp2 = __mod.PARAMS.hdvicp2;\n");
            sb.append("for (__p in __params) __inst[__p] = __params[__p];\n");
            sb.append("var save = xdc.om.$curpkg;\n");
            sb.append("xdc.om.$$bind('$curpkg', __mod.$package.$name);\n");
            sb.append("__mod.instance$meta$init.$fxn.apply(__inst, [revision]);\n");
            sb.append("xdc.om.$$bind('$curpkg', save);\n");
            sb.append("__inst.$$bless();\n");
            sb.append("return __inst;\n");
        sb.append("}\n");
        Global.eval(sb.toString());
        fxn = (Proto.Fxn)om.bind("ti.catalog.arm.cortexa8.TMS320C6A8168$$construct", new Proto.Fxn(om.findStrict("ti.catalog.arm.cortexa8.TMS320C6A8168.Module", "ti.catalog.arm.cortexa8"), null, 3, 1, false));
                fxn.addArg(0, "__obj", (Proto)om.findStrict("ti.catalog.arm.cortexa8.TMS320C6A8168$$Object", "ti.catalog.arm.cortexa8"), null);
                fxn.addArg(1, "revision", $$T_Str, $$UNDEF);
                fxn.addArg(2, "__params", (Proto)om.findStrict("ti.catalog.arm.cortexa8.TMS320C6A8168.Params", "ti.catalog.arm.cortexa8"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$arm$cortexa8$TMS320C6A8168$$construct = function( __obj, revision, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.arm.cortexa8.TMS320C6A8168'];\n");
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
            sb.append("__inst.hdvicp0 = __mod.PARAMS.hdvicp0;\n");
            sb.append("__inst.hdvicp1 = __mod.PARAMS.hdvicp1;\n");
            sb.append("__inst.hdvicp2 = __mod.PARAMS.hdvicp2;\n");
            sb.append("for (__p in __params) __inst[__p] = __params[__p];\n");
            sb.append("__inst.$$bless();\n");
            sb.append("return null;\n");
        sb.append("}\n");
        Global.eval(sb.toString());
    }

    void ITI8148$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

    }

    void TMS320TI814X$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

        fxn = (Proto.Fxn)om.bind("ti.catalog.arm.cortexa8.TMS320TI814X$$create", new Proto.Fxn(om.findStrict("ti.catalog.arm.cortexa8.TMS320TI814X.Module", "ti.catalog.arm.cortexa8"), om.findStrict("ti.catalog.arm.cortexa8.TMS320TI814X.Instance", "ti.catalog.arm.cortexa8"), 2, 1, false));
                fxn.addArg(0, "revision", $$T_Str, $$UNDEF);
                fxn.addArg(1, "__params", (Proto)om.findStrict("ti.catalog.arm.cortexa8.TMS320TI814X.Params", "ti.catalog.arm.cortexa8"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$arm$cortexa8$TMS320TI814X$$create = function( revision, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.arm.cortexa8.TMS320TI814X'];\n");
            sb.append("var __inst = xdc.om['ti.catalog.arm.cortexa8.TMS320TI814X.Instance'].$$make();\n");
            sb.append("__inst.$$bind('$package', xdc.om['ti.catalog.arm.cortexa8']);\n");
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
            sb.append("__inst.hdvicp0 = __mod.PARAMS.hdvicp0;\n");
            sb.append("for (__p in __params) __inst[__p] = __params[__p];\n");
            sb.append("var save = xdc.om.$curpkg;\n");
            sb.append("xdc.om.$$bind('$curpkg', __mod.$package.$name);\n");
            sb.append("__mod.instance$meta$init.$fxn.apply(__inst, [revision]);\n");
            sb.append("xdc.om.$$bind('$curpkg', save);\n");
            sb.append("__inst.$$bless();\n");
            sb.append("return __inst;\n");
        sb.append("}\n");
        Global.eval(sb.toString());
        fxn = (Proto.Fxn)om.bind("ti.catalog.arm.cortexa8.TMS320TI814X$$construct", new Proto.Fxn(om.findStrict("ti.catalog.arm.cortexa8.TMS320TI814X.Module", "ti.catalog.arm.cortexa8"), null, 3, 1, false));
                fxn.addArg(0, "__obj", (Proto)om.findStrict("ti.catalog.arm.cortexa8.TMS320TI814X$$Object", "ti.catalog.arm.cortexa8"), null);
                fxn.addArg(1, "revision", $$T_Str, $$UNDEF);
                fxn.addArg(2, "__params", (Proto)om.findStrict("ti.catalog.arm.cortexa8.TMS320TI814X.Params", "ti.catalog.arm.cortexa8"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$arm$cortexa8$TMS320TI814X$$construct = function( __obj, revision, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.arm.cortexa8.TMS320TI814X'];\n");
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
            sb.append("__inst.hdvicp0 = __mod.PARAMS.hdvicp0;\n");
            sb.append("for (__p in __params) __inst[__p] = __params[__p];\n");
            sb.append("__inst.$$bless();\n");
            sb.append("return null;\n");
        sb.append("}\n");
        Global.eval(sb.toString());
    }

    void TMS320DM8148$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

        fxn = (Proto.Fxn)om.bind("ti.catalog.arm.cortexa8.TMS320DM8148$$create", new Proto.Fxn(om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8148.Module", "ti.catalog.arm.cortexa8"), om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8148.Instance", "ti.catalog.arm.cortexa8"), 2, 1, false));
                fxn.addArg(0, "revision", $$T_Str, $$UNDEF);
                fxn.addArg(1, "__params", (Proto)om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8148.Params", "ti.catalog.arm.cortexa8"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$arm$cortexa8$TMS320DM8148$$create = function( revision, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.arm.cortexa8.TMS320DM8148'];\n");
            sb.append("var __inst = xdc.om['ti.catalog.arm.cortexa8.TMS320DM8148.Instance'].$$make();\n");
            sb.append("__inst.$$bind('$package', xdc.om['ti.catalog.arm.cortexa8']);\n");
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
            sb.append("__inst.hdvicp0 = __mod.PARAMS.hdvicp0;\n");
            sb.append("for (__p in __params) __inst[__p] = __params[__p];\n");
            sb.append("var save = xdc.om.$curpkg;\n");
            sb.append("xdc.om.$$bind('$curpkg', __mod.$package.$name);\n");
            sb.append("__mod.instance$meta$init.$fxn.apply(__inst, [revision]);\n");
            sb.append("xdc.om.$$bind('$curpkg', save);\n");
            sb.append("__inst.$$bless();\n");
            sb.append("return __inst;\n");
        sb.append("}\n");
        Global.eval(sb.toString());
        fxn = (Proto.Fxn)om.bind("ti.catalog.arm.cortexa8.TMS320DM8148$$construct", new Proto.Fxn(om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8148.Module", "ti.catalog.arm.cortexa8"), null, 3, 1, false));
                fxn.addArg(0, "__obj", (Proto)om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8148$$Object", "ti.catalog.arm.cortexa8"), null);
                fxn.addArg(1, "revision", $$T_Str, $$UNDEF);
                fxn.addArg(2, "__params", (Proto)om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8148.Params", "ti.catalog.arm.cortexa8"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$arm$cortexa8$TMS320DM8148$$construct = function( __obj, revision, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.arm.cortexa8.TMS320DM8148'];\n");
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
            sb.append("__inst.hdvicp0 = __mod.PARAMS.hdvicp0;\n");
            sb.append("for (__p in __params) __inst[__p] = __params[__p];\n");
            sb.append("__inst.$$bless();\n");
            sb.append("return null;\n");
        sb.append("}\n");
        Global.eval(sb.toString());
    }

    void IOMAP3xxx$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void OMAP3403$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void OMAP3405$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void OMAP3503$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void OMAP3505$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void OMAP3515$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void OMAP3517$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void OMAP3425$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void OMAP3525$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void TMS320C3430$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void OMAP3530$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void ITI8168$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void TMS320TI816X$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void TMS320DM8168$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void TMS320C6A8168$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void ITI8148$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void TMS320TI814X$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void TMS320DM8148$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void IOMAP3xxx$$SIZES()
    {
    }

    void OMAP3403$$SIZES()
    {
    }

    void OMAP3405$$SIZES()
    {
    }

    void OMAP3503$$SIZES()
    {
    }

    void OMAP3505$$SIZES()
    {
    }

    void OMAP3515$$SIZES()
    {
    }

    void OMAP3517$$SIZES()
    {
    }

    void OMAP3425$$SIZES()
    {
    }

    void OMAP3525$$SIZES()
    {
    }

    void TMS320C3430$$SIZES()
    {
    }

    void OMAP3530$$SIZES()
    {
    }

    void ITI8168$$SIZES()
    {
    }

    void TMS320TI816X$$SIZES()
    {
    }

    void TMS320DM8168$$SIZES()
    {
    }

    void TMS320C6A8168$$SIZES()
    {
    }

    void ITI8148$$SIZES()
    {
    }

    void TMS320TI814X$$SIZES()
    {
    }

    void TMS320DM8148$$SIZES()
    {
    }

    void IOMAP3xxx$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        cap = (Scriptable)Global.callFxn("loadCapsule", xdcO, "ti/catalog/arm/cortexa8/IOMAP3xxx.xs");
        om.bind("ti.catalog.arm.cortexa8.IOMAP3xxx$$capsule", cap);
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.IOMAP3xxx.Module", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.IOMAP3xxx.Module", om.findStrict("ti.catalog.ICpuDataSheet.Module", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        fxn = Global.get(cap, "module$use");
        if (fxn != null) om.bind("ti.catalog.arm.cortexa8.IOMAP3xxx$$module$use", true);
        if (fxn != null) po.addFxn("module$use", $$T_Met, fxn);
        fxn = Global.get(cap, "module$meta$init");
        if (fxn != null) om.bind("ti.catalog.arm.cortexa8.IOMAP3xxx$$module$meta$init", true);
        if (fxn != null) po.addFxn("module$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "instance$meta$init");
        if (fxn != null) om.bind("ti.catalog.arm.cortexa8.IOMAP3xxx$$instance$meta$init", true);
        if (fxn != null) po.addFxn("instance$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "module$validate");
        if (fxn != null) om.bind("ti.catalog.arm.cortexa8.IOMAP3xxx$$module$validate", true);
        if (fxn != null) po.addFxn("module$validate", $$T_Met, fxn);
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.IOMAP3xxx.Instance", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.IOMAP3xxx.Instance", om.findStrict("ti.catalog.ICpuDataSheet.Instance", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("cpuCore", $$T_Str, "v7A", "wh");
        po.addFld("isa", $$T_Str, "v7A", "wh");
        po.addFld("cpuCoreRevision", $$T_Str, "1.0", "wh");
        po.addFld("minProgUnitSize", Proto.Elm.newCNum("(xdc_Int)"), 1L, "wh");
        po.addFld("minDataUnitSize", Proto.Elm.newCNum("(xdc_Int)"), 1L, "wh");
        po.addFld("dataWordSize", Proto.Elm.newCNum("(xdc_Int)"), 4L, "wh");
        po.addFld("memMap", new Proto.Map((Proto)om.findStrict("xdc.platform.IPlatform.Memory", "ti.catalog.arm.cortexa8")), Global.newArray(new Object[]{Global.newArray(new Object[]{"SRAM", Global.newObject("comment", "On-Chip SRAM", "name", "SRAM", "base", 0x40200000L, "len", 0x00010000L, "space", "code/data", "access", "RWX")})}), "wh");
                fxn = Global.get(cap, "getMemoryMap");
                if (fxn != null) po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.arm.cortexa8"), fxn);
                fxn = Global.get(cap, "getRegisterSet");
                if (fxn != null) po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.arm.cortexa8"), fxn);
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.IOMAP3xxx$$Params", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.IOMAP3xxx.Params", om.findStrict("ti.catalog.ICpuDataSheet$$Params", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("cpuCore", $$T_Str, "v7A", "wh");
        po.addFld("isa", $$T_Str, "v7A", "wh");
        po.addFld("cpuCoreRevision", $$T_Str, "1.0", "wh");
        po.addFld("minProgUnitSize", Proto.Elm.newCNum("(xdc_Int)"), 1L, "wh");
        po.addFld("minDataUnitSize", Proto.Elm.newCNum("(xdc_Int)"), 1L, "wh");
        po.addFld("dataWordSize", Proto.Elm.newCNum("(xdc_Int)"), 4L, "wh");
        po.addFld("memMap", new Proto.Map((Proto)om.findStrict("xdc.platform.IPlatform.Memory", "ti.catalog.arm.cortexa8")), Global.newArray(new Object[]{Global.newArray(new Object[]{"SRAM", Global.newObject("comment", "On-Chip SRAM", "name", "SRAM", "base", 0x40200000L, "len", 0x00010000L, "space", "code/data", "access", "RWX")})}), "wh");
    }

    void OMAP3403$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3403.Module", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.OMAP3403.Module", om.findStrict("ti.catalog.arm.cortexa8.IOMAP3xxx.Module", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("create", (Proto.Fxn)om.findStrict("ti.catalog.arm.cortexa8.OMAP3403$$create", "ti.catalog.arm.cortexa8"), Global.get("ti$catalog$arm$cortexa8$OMAP3403$$create"));
                po.addFxn("construct", (Proto.Fxn)om.findStrict("ti.catalog.arm.cortexa8.OMAP3403$$construct", "ti.catalog.arm.cortexa8"), Global.get("ti$catalog$arm$cortexa8$OMAP3403$$construct"));
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3403.Instance", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.OMAP3403.Instance", om.findStrict("ti.catalog.arm.cortexa8.IOMAP3xxx.Instance", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.arm.cortexa8"), $$UNDEF);
                po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.arm.cortexa8"), $$UNDEF);
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3403$$Params", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.OMAP3403.Params", om.findStrict("ti.catalog.arm.cortexa8.IOMAP3xxx$$Params", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3403$$Object", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.OMAP3403.Object", om.findStrict("ti.catalog.arm.cortexa8.OMAP3403.Instance", "ti.catalog.arm.cortexa8"));
                po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.arm.cortexa8"), $$UNDEF);
                po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.arm.cortexa8"), $$UNDEF);
    }

    void OMAP3405$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3405.Module", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.OMAP3405.Module", om.findStrict("ti.catalog.arm.cortexa8.IOMAP3xxx.Module", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("create", (Proto.Fxn)om.findStrict("ti.catalog.arm.cortexa8.OMAP3405$$create", "ti.catalog.arm.cortexa8"), Global.get("ti$catalog$arm$cortexa8$OMAP3405$$create"));
                po.addFxn("construct", (Proto.Fxn)om.findStrict("ti.catalog.arm.cortexa8.OMAP3405$$construct", "ti.catalog.arm.cortexa8"), Global.get("ti$catalog$arm$cortexa8$OMAP3405$$construct"));
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3405.Instance", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.OMAP3405.Instance", om.findStrict("ti.catalog.arm.cortexa8.IOMAP3xxx.Instance", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.arm.cortexa8"), $$UNDEF);
                po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.arm.cortexa8"), $$UNDEF);
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3405$$Params", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.OMAP3405.Params", om.findStrict("ti.catalog.arm.cortexa8.IOMAP3xxx$$Params", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3405$$Object", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.OMAP3405.Object", om.findStrict("ti.catalog.arm.cortexa8.OMAP3405.Instance", "ti.catalog.arm.cortexa8"));
                po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.arm.cortexa8"), $$UNDEF);
                po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.arm.cortexa8"), $$UNDEF);
    }

    void OMAP3503$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3503.Module", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.OMAP3503.Module", om.findStrict("ti.catalog.arm.cortexa8.IOMAP3xxx.Module", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("create", (Proto.Fxn)om.findStrict("ti.catalog.arm.cortexa8.OMAP3503$$create", "ti.catalog.arm.cortexa8"), Global.get("ti$catalog$arm$cortexa8$OMAP3503$$create"));
                po.addFxn("construct", (Proto.Fxn)om.findStrict("ti.catalog.arm.cortexa8.OMAP3503$$construct", "ti.catalog.arm.cortexa8"), Global.get("ti$catalog$arm$cortexa8$OMAP3503$$construct"));
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3503.Instance", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.OMAP3503.Instance", om.findStrict("ti.catalog.arm.cortexa8.IOMAP3xxx.Instance", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.arm.cortexa8"), $$UNDEF);
                po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.arm.cortexa8"), $$UNDEF);
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3503$$Params", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.OMAP3503.Params", om.findStrict("ti.catalog.arm.cortexa8.IOMAP3xxx$$Params", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3503$$Object", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.OMAP3503.Object", om.findStrict("ti.catalog.arm.cortexa8.OMAP3503.Instance", "ti.catalog.arm.cortexa8"));
                po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.arm.cortexa8"), $$UNDEF);
                po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.arm.cortexa8"), $$UNDEF);
    }

    void OMAP3505$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3505.Module", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.OMAP3505.Module", om.findStrict("ti.catalog.arm.cortexa8.IOMAP3xxx.Module", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("create", (Proto.Fxn)om.findStrict("ti.catalog.arm.cortexa8.OMAP3505$$create", "ti.catalog.arm.cortexa8"), Global.get("ti$catalog$arm$cortexa8$OMAP3505$$create"));
                po.addFxn("construct", (Proto.Fxn)om.findStrict("ti.catalog.arm.cortexa8.OMAP3505$$construct", "ti.catalog.arm.cortexa8"), Global.get("ti$catalog$arm$cortexa8$OMAP3505$$construct"));
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3505.Instance", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.OMAP3505.Instance", om.findStrict("ti.catalog.arm.cortexa8.IOMAP3xxx.Instance", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.arm.cortexa8"), $$UNDEF);
                po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.arm.cortexa8"), $$UNDEF);
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3505$$Params", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.OMAP3505.Params", om.findStrict("ti.catalog.arm.cortexa8.IOMAP3xxx$$Params", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3505$$Object", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.OMAP3505.Object", om.findStrict("ti.catalog.arm.cortexa8.OMAP3505.Instance", "ti.catalog.arm.cortexa8"));
                po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.arm.cortexa8"), $$UNDEF);
                po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.arm.cortexa8"), $$UNDEF);
    }

    void OMAP3515$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3515.Module", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.OMAP3515.Module", om.findStrict("ti.catalog.arm.cortexa8.IOMAP3xxx.Module", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("create", (Proto.Fxn)om.findStrict("ti.catalog.arm.cortexa8.OMAP3515$$create", "ti.catalog.arm.cortexa8"), Global.get("ti$catalog$arm$cortexa8$OMAP3515$$create"));
                po.addFxn("construct", (Proto.Fxn)om.findStrict("ti.catalog.arm.cortexa8.OMAP3515$$construct", "ti.catalog.arm.cortexa8"), Global.get("ti$catalog$arm$cortexa8$OMAP3515$$construct"));
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3515.Instance", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.OMAP3515.Instance", om.findStrict("ti.catalog.arm.cortexa8.IOMAP3xxx.Instance", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.arm.cortexa8"), $$UNDEF);
                po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.arm.cortexa8"), $$UNDEF);
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3515$$Params", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.OMAP3515.Params", om.findStrict("ti.catalog.arm.cortexa8.IOMAP3xxx$$Params", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3515$$Object", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.OMAP3515.Object", om.findStrict("ti.catalog.arm.cortexa8.OMAP3515.Instance", "ti.catalog.arm.cortexa8"));
                po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.arm.cortexa8"), $$UNDEF);
                po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.arm.cortexa8"), $$UNDEF);
    }

    void OMAP3517$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3517.Module", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.OMAP3517.Module", om.findStrict("ti.catalog.arm.cortexa8.IOMAP3xxx.Module", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("create", (Proto.Fxn)om.findStrict("ti.catalog.arm.cortexa8.OMAP3517$$create", "ti.catalog.arm.cortexa8"), Global.get("ti$catalog$arm$cortexa8$OMAP3517$$create"));
                po.addFxn("construct", (Proto.Fxn)om.findStrict("ti.catalog.arm.cortexa8.OMAP3517$$construct", "ti.catalog.arm.cortexa8"), Global.get("ti$catalog$arm$cortexa8$OMAP3517$$construct"));
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3517.Instance", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.OMAP3517.Instance", om.findStrict("ti.catalog.arm.cortexa8.IOMAP3xxx.Instance", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.arm.cortexa8"), $$UNDEF);
                po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.arm.cortexa8"), $$UNDEF);
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3517$$Params", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.OMAP3517.Params", om.findStrict("ti.catalog.arm.cortexa8.IOMAP3xxx$$Params", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3517$$Object", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.OMAP3517.Object", om.findStrict("ti.catalog.arm.cortexa8.OMAP3517.Instance", "ti.catalog.arm.cortexa8"));
                po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.arm.cortexa8"), $$UNDEF);
                po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.arm.cortexa8"), $$UNDEF);
    }

    void OMAP3425$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3425.Module", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.OMAP3425.Module", om.findStrict("ti.catalog.arm.cortexa8.IOMAP3xxx.Module", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("create", (Proto.Fxn)om.findStrict("ti.catalog.arm.cortexa8.OMAP3425$$create", "ti.catalog.arm.cortexa8"), Global.get("ti$catalog$arm$cortexa8$OMAP3425$$create"));
                po.addFxn("construct", (Proto.Fxn)om.findStrict("ti.catalog.arm.cortexa8.OMAP3425$$construct", "ti.catalog.arm.cortexa8"), Global.get("ti$catalog$arm$cortexa8$OMAP3425$$construct"));
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3425.Instance", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.OMAP3425.Instance", om.findStrict("ti.catalog.arm.cortexa8.IOMAP3xxx.Instance", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.arm.cortexa8"), $$UNDEF);
                po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.arm.cortexa8"), $$UNDEF);
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3425$$Params", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.OMAP3425.Params", om.findStrict("ti.catalog.arm.cortexa8.IOMAP3xxx$$Params", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3425$$Object", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.OMAP3425.Object", om.findStrict("ti.catalog.arm.cortexa8.OMAP3425.Instance", "ti.catalog.arm.cortexa8"));
                po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.arm.cortexa8"), $$UNDEF);
                po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.arm.cortexa8"), $$UNDEF);
    }

    void OMAP3525$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3525.Module", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.OMAP3525.Module", om.findStrict("ti.catalog.arm.cortexa8.IOMAP3xxx.Module", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("create", (Proto.Fxn)om.findStrict("ti.catalog.arm.cortexa8.OMAP3525$$create", "ti.catalog.arm.cortexa8"), Global.get("ti$catalog$arm$cortexa8$OMAP3525$$create"));
                po.addFxn("construct", (Proto.Fxn)om.findStrict("ti.catalog.arm.cortexa8.OMAP3525$$construct", "ti.catalog.arm.cortexa8"), Global.get("ti$catalog$arm$cortexa8$OMAP3525$$construct"));
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3525.Instance", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.OMAP3525.Instance", om.findStrict("ti.catalog.arm.cortexa8.IOMAP3xxx.Instance", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.arm.cortexa8"), $$UNDEF);
                po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.arm.cortexa8"), $$UNDEF);
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3525$$Params", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.OMAP3525.Params", om.findStrict("ti.catalog.arm.cortexa8.IOMAP3xxx$$Params", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3525$$Object", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.OMAP3525.Object", om.findStrict("ti.catalog.arm.cortexa8.OMAP3525.Instance", "ti.catalog.arm.cortexa8"));
                po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.arm.cortexa8"), $$UNDEF);
                po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.arm.cortexa8"), $$UNDEF);
    }

    void TMS320C3430$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.TMS320C3430.Module", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.TMS320C3430.Module", om.findStrict("ti.catalog.arm.cortexa8.IOMAP3xxx.Module", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("create", (Proto.Fxn)om.findStrict("ti.catalog.arm.cortexa8.TMS320C3430$$create", "ti.catalog.arm.cortexa8"), Global.get("ti$catalog$arm$cortexa8$TMS320C3430$$create"));
                po.addFxn("construct", (Proto.Fxn)om.findStrict("ti.catalog.arm.cortexa8.TMS320C3430$$construct", "ti.catalog.arm.cortexa8"), Global.get("ti$catalog$arm$cortexa8$TMS320C3430$$construct"));
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.TMS320C3430.Instance", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.TMS320C3430.Instance", om.findStrict("ti.catalog.arm.cortexa8.IOMAP3xxx.Instance", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.arm.cortexa8"), $$UNDEF);
                po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.arm.cortexa8"), $$UNDEF);
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.TMS320C3430$$Params", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.TMS320C3430.Params", om.findStrict("ti.catalog.arm.cortexa8.IOMAP3xxx$$Params", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.TMS320C3430$$Object", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.TMS320C3430.Object", om.findStrict("ti.catalog.arm.cortexa8.TMS320C3430.Instance", "ti.catalog.arm.cortexa8"));
                po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.arm.cortexa8"), $$UNDEF);
                po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.arm.cortexa8"), $$UNDEF);
    }

    void OMAP3530$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3530.Module", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.OMAP3530.Module", om.findStrict("ti.catalog.arm.cortexa8.IOMAP3xxx.Module", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("create", (Proto.Fxn)om.findStrict("ti.catalog.arm.cortexa8.OMAP3530$$create", "ti.catalog.arm.cortexa8"), Global.get("ti$catalog$arm$cortexa8$OMAP3530$$create"));
                po.addFxn("construct", (Proto.Fxn)om.findStrict("ti.catalog.arm.cortexa8.OMAP3530$$construct", "ti.catalog.arm.cortexa8"), Global.get("ti$catalog$arm$cortexa8$OMAP3530$$construct"));
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3530.Instance", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.OMAP3530.Instance", om.findStrict("ti.catalog.arm.cortexa8.IOMAP3xxx.Instance", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.arm.cortexa8"), $$UNDEF);
                po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.arm.cortexa8"), $$UNDEF);
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3530$$Params", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.OMAP3530.Params", om.findStrict("ti.catalog.arm.cortexa8.IOMAP3xxx$$Params", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3530$$Object", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.OMAP3530.Object", om.findStrict("ti.catalog.arm.cortexa8.OMAP3530.Instance", "ti.catalog.arm.cortexa8"));
                po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.arm.cortexa8"), $$UNDEF);
                po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.arm.cortexa8"), $$UNDEF);
    }

    void ITI8168$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        cap = (Scriptable)Global.callFxn("loadCapsule", xdcO, "ti/catalog/arm/cortexa8/ITI8168.xs");
        om.bind("ti.catalog.arm.cortexa8.ITI8168$$capsule", cap);
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.ITI8168.Module", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.ITI8168.Module", om.findStrict("ti.catalog.ICpuDataSheet.Module", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        fxn = Global.get(cap, "module$use");
        if (fxn != null) om.bind("ti.catalog.arm.cortexa8.ITI8168$$module$use", true);
        if (fxn != null) po.addFxn("module$use", $$T_Met, fxn);
        fxn = Global.get(cap, "module$meta$init");
        if (fxn != null) om.bind("ti.catalog.arm.cortexa8.ITI8168$$module$meta$init", true);
        if (fxn != null) po.addFxn("module$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "instance$meta$init");
        if (fxn != null) om.bind("ti.catalog.arm.cortexa8.ITI8168$$instance$meta$init", true);
        if (fxn != null) po.addFxn("instance$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "module$validate");
        if (fxn != null) om.bind("ti.catalog.arm.cortexa8.ITI8168$$module$validate", true);
        if (fxn != null) po.addFxn("module$validate", $$T_Met, fxn);
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.ITI8168.Instance", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.ITI8168.Instance", om.findStrict("ti.catalog.ICpuDataSheet.Instance", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("hdvicp0", (Proto)om.findStrict("ti.catalog.peripherals.hdvicp2.HDVICP2.Instance", "ti.catalog.arm.cortexa8"), $$UNDEF, "wh");
        po.addFld("hdvicp1", (Proto)om.findStrict("ti.catalog.peripherals.hdvicp2.HDVICP2.Instance", "ti.catalog.arm.cortexa8"), $$UNDEF, "wh");
        po.addFld("hdvicp2", (Proto)om.findStrict("ti.catalog.peripherals.hdvicp2.HDVICP2.Instance", "ti.catalog.arm.cortexa8"), $$UNDEF, "wh");
        po.addFld("cpuCore", $$T_Str, "v7A", "wh");
        po.addFld("isa", $$T_Str, "v7A", "wh");
        po.addFld("cpuCoreRevision", $$T_Str, "1.0", "wh");
        po.addFld("minProgUnitSize", Proto.Elm.newCNum("(xdc_Int)"), 1L, "wh");
        po.addFld("minDataUnitSize", Proto.Elm.newCNum("(xdc_Int)"), 1L, "wh");
        po.addFld("dataWordSize", Proto.Elm.newCNum("(xdc_Int)"), 4L, "wh");
        po.addFld("memMap", new Proto.Map((Proto)om.findStrict("xdc.platform.IPlatform.Memory", "ti.catalog.arm.cortexa8")), Global.newArray(new Object[]{Global.newArray(new Object[]{"SRAM", Global.newObject("comment", "On-Chip SRAM", "name", "SRAM", "base", 0x402F0000L, "len", 0x00010000L, "space", "code/data", "access", "RWX")}), Global.newArray(new Object[]{"OCMC_0", Global.newObject("name", "OCMC_0", "base", 0x40300000L, "len", 0x00020000L)}), Global.newArray(new Object[]{"OCMC_1", Global.newObject("name", "OCMC_1", "base", 0x40400000L, "len", 0x00020000L)})}), "wh");
                fxn = Global.get(cap, "getMemoryMap");
                if (fxn != null) po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.arm.cortexa8"), fxn);
                fxn = Global.get(cap, "getRegisterSet");
                if (fxn != null) po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.arm.cortexa8"), fxn);
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.ITI8168$$Params", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.ITI8168.Params", om.findStrict("ti.catalog.ICpuDataSheet$$Params", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("hdvicp0", (Proto)om.findStrict("ti.catalog.peripherals.hdvicp2.HDVICP2.Instance", "ti.catalog.arm.cortexa8"), $$UNDEF, "wh");
        po.addFld("hdvicp1", (Proto)om.findStrict("ti.catalog.peripherals.hdvicp2.HDVICP2.Instance", "ti.catalog.arm.cortexa8"), $$UNDEF, "wh");
        po.addFld("hdvicp2", (Proto)om.findStrict("ti.catalog.peripherals.hdvicp2.HDVICP2.Instance", "ti.catalog.arm.cortexa8"), $$UNDEF, "wh");
        po.addFld("cpuCore", $$T_Str, "v7A", "wh");
        po.addFld("isa", $$T_Str, "v7A", "wh");
        po.addFld("cpuCoreRevision", $$T_Str, "1.0", "wh");
        po.addFld("minProgUnitSize", Proto.Elm.newCNum("(xdc_Int)"), 1L, "wh");
        po.addFld("minDataUnitSize", Proto.Elm.newCNum("(xdc_Int)"), 1L, "wh");
        po.addFld("dataWordSize", Proto.Elm.newCNum("(xdc_Int)"), 4L, "wh");
        po.addFld("memMap", new Proto.Map((Proto)om.findStrict("xdc.platform.IPlatform.Memory", "ti.catalog.arm.cortexa8")), Global.newArray(new Object[]{Global.newArray(new Object[]{"SRAM", Global.newObject("comment", "On-Chip SRAM", "name", "SRAM", "base", 0x402F0000L, "len", 0x00010000L, "space", "code/data", "access", "RWX")}), Global.newArray(new Object[]{"OCMC_0", Global.newObject("name", "OCMC_0", "base", 0x40300000L, "len", 0x00020000L)}), Global.newArray(new Object[]{"OCMC_1", Global.newObject("name", "OCMC_1", "base", 0x40400000L, "len", 0x00020000L)})}), "wh");
    }

    void TMS320TI816X$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.TMS320TI816X.Module", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.TMS320TI816X.Module", om.findStrict("ti.catalog.arm.cortexa8.ITI8168.Module", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("create", (Proto.Fxn)om.findStrict("ti.catalog.arm.cortexa8.TMS320TI816X$$create", "ti.catalog.arm.cortexa8"), Global.get("ti$catalog$arm$cortexa8$TMS320TI816X$$create"));
                po.addFxn("construct", (Proto.Fxn)om.findStrict("ti.catalog.arm.cortexa8.TMS320TI816X$$construct", "ti.catalog.arm.cortexa8"), Global.get("ti$catalog$arm$cortexa8$TMS320TI816X$$construct"));
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.TMS320TI816X.Instance", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.TMS320TI816X.Instance", om.findStrict("ti.catalog.arm.cortexa8.ITI8168.Instance", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.arm.cortexa8"), $$UNDEF);
                po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.arm.cortexa8"), $$UNDEF);
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.TMS320TI816X$$Params", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.TMS320TI816X.Params", om.findStrict("ti.catalog.arm.cortexa8.ITI8168$$Params", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.TMS320TI816X$$Object", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.TMS320TI816X.Object", om.findStrict("ti.catalog.arm.cortexa8.TMS320TI816X.Instance", "ti.catalog.arm.cortexa8"));
                po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.arm.cortexa8"), $$UNDEF);
                po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.arm.cortexa8"), $$UNDEF);
    }

    void TMS320DM8168$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8168.Module", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.TMS320DM8168.Module", om.findStrict("ti.catalog.arm.cortexa8.ITI8168.Module", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("create", (Proto.Fxn)om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8168$$create", "ti.catalog.arm.cortexa8"), Global.get("ti$catalog$arm$cortexa8$TMS320DM8168$$create"));
                po.addFxn("construct", (Proto.Fxn)om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8168$$construct", "ti.catalog.arm.cortexa8"), Global.get("ti$catalog$arm$cortexa8$TMS320DM8168$$construct"));
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8168.Instance", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.TMS320DM8168.Instance", om.findStrict("ti.catalog.arm.cortexa8.ITI8168.Instance", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.arm.cortexa8"), $$UNDEF);
                po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.arm.cortexa8"), $$UNDEF);
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8168$$Params", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.TMS320DM8168.Params", om.findStrict("ti.catalog.arm.cortexa8.ITI8168$$Params", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8168$$Object", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.TMS320DM8168.Object", om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8168.Instance", "ti.catalog.arm.cortexa8"));
                po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.arm.cortexa8"), $$UNDEF);
                po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.arm.cortexa8"), $$UNDEF);
    }

    void TMS320C6A8168$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.TMS320C6A8168.Module", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.TMS320C6A8168.Module", om.findStrict("ti.catalog.arm.cortexa8.ITI8168.Module", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("create", (Proto.Fxn)om.findStrict("ti.catalog.arm.cortexa8.TMS320C6A8168$$create", "ti.catalog.arm.cortexa8"), Global.get("ti$catalog$arm$cortexa8$TMS320C6A8168$$create"));
                po.addFxn("construct", (Proto.Fxn)om.findStrict("ti.catalog.arm.cortexa8.TMS320C6A8168$$construct", "ti.catalog.arm.cortexa8"), Global.get("ti$catalog$arm$cortexa8$TMS320C6A8168$$construct"));
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.TMS320C6A8168.Instance", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.TMS320C6A8168.Instance", om.findStrict("ti.catalog.arm.cortexa8.ITI8168.Instance", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.arm.cortexa8"), $$UNDEF);
                po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.arm.cortexa8"), $$UNDEF);
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.TMS320C6A8168$$Params", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.TMS320C6A8168.Params", om.findStrict("ti.catalog.arm.cortexa8.ITI8168$$Params", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.TMS320C6A8168$$Object", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.TMS320C6A8168.Object", om.findStrict("ti.catalog.arm.cortexa8.TMS320C6A8168.Instance", "ti.catalog.arm.cortexa8"));
                po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.arm.cortexa8"), $$UNDEF);
                po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.arm.cortexa8"), $$UNDEF);
    }

    void ITI8148$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        cap = (Scriptable)Global.callFxn("loadCapsule", xdcO, "ti/catalog/arm/cortexa8/ITI8148.xs");
        om.bind("ti.catalog.arm.cortexa8.ITI8148$$capsule", cap);
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.ITI8148.Module", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.ITI8148.Module", om.findStrict("ti.catalog.ICpuDataSheet.Module", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        fxn = Global.get(cap, "module$use");
        if (fxn != null) om.bind("ti.catalog.arm.cortexa8.ITI8148$$module$use", true);
        if (fxn != null) po.addFxn("module$use", $$T_Met, fxn);
        fxn = Global.get(cap, "module$meta$init");
        if (fxn != null) om.bind("ti.catalog.arm.cortexa8.ITI8148$$module$meta$init", true);
        if (fxn != null) po.addFxn("module$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "instance$meta$init");
        if (fxn != null) om.bind("ti.catalog.arm.cortexa8.ITI8148$$instance$meta$init", true);
        if (fxn != null) po.addFxn("instance$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "module$validate");
        if (fxn != null) om.bind("ti.catalog.arm.cortexa8.ITI8148$$module$validate", true);
        if (fxn != null) po.addFxn("module$validate", $$T_Met, fxn);
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.ITI8148.Instance", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.ITI8148.Instance", om.findStrict("ti.catalog.ICpuDataSheet.Instance", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("hdvicp0", (Proto)om.findStrict("ti.catalog.peripherals.hdvicp2.HDVICP2.Instance", "ti.catalog.arm.cortexa8"), $$UNDEF, "wh");
        po.addFld("cpuCore", $$T_Str, "v7A", "wh");
        po.addFld("isa", $$T_Str, "v7A", "wh");
        po.addFld("cpuCoreRevision", $$T_Str, "1.0", "wh");
        po.addFld("minProgUnitSize", Proto.Elm.newCNum("(xdc_Int)"), 1L, "wh");
        po.addFld("minDataUnitSize", Proto.Elm.newCNum("(xdc_Int)"), 1L, "wh");
        po.addFld("dataWordSize", Proto.Elm.newCNum("(xdc_Int)"), 4L, "wh");
        po.addFld("memMap", new Proto.Map((Proto)om.findStrict("xdc.platform.IPlatform.Memory", "ti.catalog.arm.cortexa8")), Global.newArray(new Object[]{Global.newArray(new Object[]{"SRAM", Global.newObject("comment", "On-Chip SRAM", "name", "SRAM", "base", 0x402F0000L, "len", 0x00010000L, "space", "code/data", "access", "RWX")}), Global.newArray(new Object[]{"OCMC_0", Global.newObject("name", "OCMC_0", "base", 0x40300000L, "len", 0x00020000L)}), Global.newArray(new Object[]{"OCMC_1", Global.newObject("name", "OCMC_1", "base", 0x40400000L, "len", 0x00020000L)})}), "wh");
                fxn = Global.get(cap, "getMemoryMap");
                if (fxn != null) po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.arm.cortexa8"), fxn);
                fxn = Global.get(cap, "getRegisterSet");
                if (fxn != null) po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.arm.cortexa8"), fxn);
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.ITI8148$$Params", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.ITI8148.Params", om.findStrict("ti.catalog.ICpuDataSheet$$Params", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("hdvicp0", (Proto)om.findStrict("ti.catalog.peripherals.hdvicp2.HDVICP2.Instance", "ti.catalog.arm.cortexa8"), $$UNDEF, "wh");
        po.addFld("cpuCore", $$T_Str, "v7A", "wh");
        po.addFld("isa", $$T_Str, "v7A", "wh");
        po.addFld("cpuCoreRevision", $$T_Str, "1.0", "wh");
        po.addFld("minProgUnitSize", Proto.Elm.newCNum("(xdc_Int)"), 1L, "wh");
        po.addFld("minDataUnitSize", Proto.Elm.newCNum("(xdc_Int)"), 1L, "wh");
        po.addFld("dataWordSize", Proto.Elm.newCNum("(xdc_Int)"), 4L, "wh");
        po.addFld("memMap", new Proto.Map((Proto)om.findStrict("xdc.platform.IPlatform.Memory", "ti.catalog.arm.cortexa8")), Global.newArray(new Object[]{Global.newArray(new Object[]{"SRAM", Global.newObject("comment", "On-Chip SRAM", "name", "SRAM", "base", 0x402F0000L, "len", 0x00010000L, "space", "code/data", "access", "RWX")}), Global.newArray(new Object[]{"OCMC_0", Global.newObject("name", "OCMC_0", "base", 0x40300000L, "len", 0x00020000L)}), Global.newArray(new Object[]{"OCMC_1", Global.newObject("name", "OCMC_1", "base", 0x40400000L, "len", 0x00020000L)})}), "wh");
    }

    void TMS320TI814X$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.TMS320TI814X.Module", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.TMS320TI814X.Module", om.findStrict("ti.catalog.arm.cortexa8.ITI8148.Module", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("create", (Proto.Fxn)om.findStrict("ti.catalog.arm.cortexa8.TMS320TI814X$$create", "ti.catalog.arm.cortexa8"), Global.get("ti$catalog$arm$cortexa8$TMS320TI814X$$create"));
                po.addFxn("construct", (Proto.Fxn)om.findStrict("ti.catalog.arm.cortexa8.TMS320TI814X$$construct", "ti.catalog.arm.cortexa8"), Global.get("ti$catalog$arm$cortexa8$TMS320TI814X$$construct"));
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.TMS320TI814X.Instance", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.TMS320TI814X.Instance", om.findStrict("ti.catalog.arm.cortexa8.ITI8148.Instance", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.arm.cortexa8"), $$UNDEF);
                po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.arm.cortexa8"), $$UNDEF);
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.TMS320TI814X$$Params", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.TMS320TI814X.Params", om.findStrict("ti.catalog.arm.cortexa8.ITI8148$$Params", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.TMS320TI814X$$Object", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.TMS320TI814X.Object", om.findStrict("ti.catalog.arm.cortexa8.TMS320TI814X.Instance", "ti.catalog.arm.cortexa8"));
                po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.arm.cortexa8"), $$UNDEF);
                po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.arm.cortexa8"), $$UNDEF);
    }

    void TMS320DM8148$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8148.Module", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.TMS320DM8148.Module", om.findStrict("ti.catalog.arm.cortexa8.ITI8148.Module", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("create", (Proto.Fxn)om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8148$$create", "ti.catalog.arm.cortexa8"), Global.get("ti$catalog$arm$cortexa8$TMS320DM8148$$create"));
                po.addFxn("construct", (Proto.Fxn)om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8148$$construct", "ti.catalog.arm.cortexa8"), Global.get("ti$catalog$arm$cortexa8$TMS320DM8148$$construct"));
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8148.Instance", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.TMS320DM8148.Instance", om.findStrict("ti.catalog.arm.cortexa8.ITI8148.Instance", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.arm.cortexa8"), $$UNDEF);
                po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.arm.cortexa8"), $$UNDEF);
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8148$$Params", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.TMS320DM8148.Params", om.findStrict("ti.catalog.arm.cortexa8.ITI8148$$Params", "ti.catalog.arm.cortexa8"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8148$$Object", "ti.catalog.arm.cortexa8");
        po.init("ti.catalog.arm.cortexa8.TMS320DM8148.Object", om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8148.Instance", "ti.catalog.arm.cortexa8"));
                po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.arm.cortexa8"), $$UNDEF);
                po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.arm.cortexa8"), $$UNDEF);
    }

    void IOMAP3xxx$$ROV()
    {
    }

    void OMAP3403$$ROV()
    {
    }

    void OMAP3405$$ROV()
    {
    }

    void OMAP3503$$ROV()
    {
    }

    void OMAP3505$$ROV()
    {
    }

    void OMAP3515$$ROV()
    {
    }

    void OMAP3517$$ROV()
    {
    }

    void OMAP3425$$ROV()
    {
    }

    void OMAP3525$$ROV()
    {
    }

    void TMS320C3430$$ROV()
    {
    }

    void OMAP3530$$ROV()
    {
    }

    void ITI8168$$ROV()
    {
    }

    void TMS320TI816X$$ROV()
    {
    }

    void TMS320DM8168$$ROV()
    {
    }

    void TMS320C6A8168$$ROV()
    {
    }

    void ITI8148$$ROV()
    {
    }

    void TMS320TI814X$$ROV()
    {
    }

    void TMS320DM8148$$ROV()
    {
    }

    void $$SINGLETONS()
    {
        pkgP.init("ti.catalog.arm.cortexa8.Package", (Proto.Obj)om.findStrict("xdc.IPackage.Module", "ti.catalog.arm.cortexa8"));
        pkgP.bind("$capsule", $$UNDEF);
        pkgV.init2(pkgP, "ti.catalog.arm.cortexa8", Value.DEFAULT, false);
        pkgV.bind("$name", "ti.catalog.arm.cortexa8");
        pkgV.bind("$category", "Package");
        pkgV.bind("$$qn", "ti.catalog.arm.cortexa8.");
        pkgV.bind("$vers", Global.newArray("1, 0, 0"));
        Value.Map atmap = (Value.Map)pkgV.getv("$attr");
        atmap.seal("length");
        imports.clear();
        imports.add(Global.newArray("xdc.platform", Global.newArray()));
        imports.add(Global.newArray("ti.catalog.peripherals.hdvicp2", Global.newArray()));
        pkgV.bind("$imports", imports);
        StringBuilder sb = new StringBuilder();
        sb.append("var pkg = xdc.om['ti.catalog.arm.cortexa8'];\n");
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

    void IOMAP3xxx$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.arm.cortexa8.IOMAP3xxx", "ti.catalog.arm.cortexa8");
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.IOMAP3xxx.Module", "ti.catalog.arm.cortexa8");
        vo.init2(po, "ti.catalog.arm.cortexa8.IOMAP3xxx", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Interface");
        vo.bind("$capsule", om.findStrict("ti.catalog.arm.cortexa8.IOMAP3xxx$$capsule", "ti.catalog.arm.cortexa8"));
        vo.bind("Instance", om.findStrict("ti.catalog.arm.cortexa8.IOMAP3xxx.Instance", "ti.catalog.arm.cortexa8"));
        vo.bind("Params", om.findStrict("ti.catalog.arm.cortexa8.IOMAP3xxx.Params", "ti.catalog.arm.cortexa8"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.arm.cortexa8.IOMAP3xxx.Params", "ti.catalog.arm.cortexa8")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.arm.cortexa8", "ti.catalog.arm.cortexa8"));
        tdefs.clear();
        proxies.clear();
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        ((Value.Arr)pkgV.getv("$interfaces")).add(vo);
        pkgV.bind("IOMAP3xxx", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("IOMAP3xxx");
        vo.seal(null);
    }

    void OMAP3403$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3403", "ti.catalog.arm.cortexa8");
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3403.Module", "ti.catalog.arm.cortexa8");
        vo.init2(po, "ti.catalog.arm.cortexa8.OMAP3403", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", $$UNDEF);
        vo.bind("Instance", om.findStrict("ti.catalog.arm.cortexa8.OMAP3403.Instance", "ti.catalog.arm.cortexa8"));
        vo.bind("Params", om.findStrict("ti.catalog.arm.cortexa8.OMAP3403.Params", "ti.catalog.arm.cortexa8"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.arm.cortexa8.OMAP3403.Params", "ti.catalog.arm.cortexa8")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.arm.cortexa8", "ti.catalog.arm.cortexa8"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "ti.catalog.arm.cortexa8")).add(vo);
        vo.bind("$$instflag", 1);
        vo.bind("$$iobjflag", 1);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 1);
        vo.bind("$$romcfgs", "|");
        Proto.Str ps = (Proto.Str)vo.find("Module_State");
        if (ps != null) vo.bind("$object", ps.newInstance());
        vo.bind("$$meta_iobj", om.has("ti.catalog.arm.cortexa8.OMAP3403$$instance$static$init", null) ? 1 : 0);
        vo.bind("$$fxntab", Global.newArray());
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray());
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.seal("length");
        vo.bind("Object", om.findStrict("ti.catalog.arm.cortexa8.OMAP3403.Object", "ti.catalog.arm.cortexa8"));
        pkgV.bind("OMAP3403", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("OMAP3403");
    }

    void OMAP3405$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3405", "ti.catalog.arm.cortexa8");
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3405.Module", "ti.catalog.arm.cortexa8");
        vo.init2(po, "ti.catalog.arm.cortexa8.OMAP3405", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", $$UNDEF);
        vo.bind("Instance", om.findStrict("ti.catalog.arm.cortexa8.OMAP3405.Instance", "ti.catalog.arm.cortexa8"));
        vo.bind("Params", om.findStrict("ti.catalog.arm.cortexa8.OMAP3405.Params", "ti.catalog.arm.cortexa8"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.arm.cortexa8.OMAP3405.Params", "ti.catalog.arm.cortexa8")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.arm.cortexa8", "ti.catalog.arm.cortexa8"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "ti.catalog.arm.cortexa8")).add(vo);
        vo.bind("$$instflag", 1);
        vo.bind("$$iobjflag", 1);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 1);
        vo.bind("$$romcfgs", "|");
        Proto.Str ps = (Proto.Str)vo.find("Module_State");
        if (ps != null) vo.bind("$object", ps.newInstance());
        vo.bind("$$meta_iobj", om.has("ti.catalog.arm.cortexa8.OMAP3405$$instance$static$init", null) ? 1 : 0);
        vo.bind("$$fxntab", Global.newArray());
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray());
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.seal("length");
        vo.bind("Object", om.findStrict("ti.catalog.arm.cortexa8.OMAP3405.Object", "ti.catalog.arm.cortexa8"));
        pkgV.bind("OMAP3405", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("OMAP3405");
    }

    void OMAP3503$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3503", "ti.catalog.arm.cortexa8");
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3503.Module", "ti.catalog.arm.cortexa8");
        vo.init2(po, "ti.catalog.arm.cortexa8.OMAP3503", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", $$UNDEF);
        vo.bind("Instance", om.findStrict("ti.catalog.arm.cortexa8.OMAP3503.Instance", "ti.catalog.arm.cortexa8"));
        vo.bind("Params", om.findStrict("ti.catalog.arm.cortexa8.OMAP3503.Params", "ti.catalog.arm.cortexa8"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.arm.cortexa8.OMAP3503.Params", "ti.catalog.arm.cortexa8")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.arm.cortexa8", "ti.catalog.arm.cortexa8"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "ti.catalog.arm.cortexa8")).add(vo);
        vo.bind("$$instflag", 1);
        vo.bind("$$iobjflag", 1);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 1);
        vo.bind("$$romcfgs", "|");
        Proto.Str ps = (Proto.Str)vo.find("Module_State");
        if (ps != null) vo.bind("$object", ps.newInstance());
        vo.bind("$$meta_iobj", om.has("ti.catalog.arm.cortexa8.OMAP3503$$instance$static$init", null) ? 1 : 0);
        vo.bind("$$fxntab", Global.newArray());
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray());
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.seal("length");
        vo.bind("Object", om.findStrict("ti.catalog.arm.cortexa8.OMAP3503.Object", "ti.catalog.arm.cortexa8"));
        pkgV.bind("OMAP3503", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("OMAP3503");
    }

    void OMAP3505$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3505", "ti.catalog.arm.cortexa8");
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3505.Module", "ti.catalog.arm.cortexa8");
        vo.init2(po, "ti.catalog.arm.cortexa8.OMAP3505", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", $$UNDEF);
        vo.bind("Instance", om.findStrict("ti.catalog.arm.cortexa8.OMAP3505.Instance", "ti.catalog.arm.cortexa8"));
        vo.bind("Params", om.findStrict("ti.catalog.arm.cortexa8.OMAP3505.Params", "ti.catalog.arm.cortexa8"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.arm.cortexa8.OMAP3505.Params", "ti.catalog.arm.cortexa8")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.arm.cortexa8", "ti.catalog.arm.cortexa8"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "ti.catalog.arm.cortexa8")).add(vo);
        vo.bind("$$instflag", 1);
        vo.bind("$$iobjflag", 1);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 1);
        vo.bind("$$romcfgs", "|");
        Proto.Str ps = (Proto.Str)vo.find("Module_State");
        if (ps != null) vo.bind("$object", ps.newInstance());
        vo.bind("$$meta_iobj", om.has("ti.catalog.arm.cortexa8.OMAP3505$$instance$static$init", null) ? 1 : 0);
        vo.bind("$$fxntab", Global.newArray());
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray());
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.seal("length");
        vo.bind("Object", om.findStrict("ti.catalog.arm.cortexa8.OMAP3505.Object", "ti.catalog.arm.cortexa8"));
        pkgV.bind("OMAP3505", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("OMAP3505");
    }

    void OMAP3515$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3515", "ti.catalog.arm.cortexa8");
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3515.Module", "ti.catalog.arm.cortexa8");
        vo.init2(po, "ti.catalog.arm.cortexa8.OMAP3515", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", $$UNDEF);
        vo.bind("Instance", om.findStrict("ti.catalog.arm.cortexa8.OMAP3515.Instance", "ti.catalog.arm.cortexa8"));
        vo.bind("Params", om.findStrict("ti.catalog.arm.cortexa8.OMAP3515.Params", "ti.catalog.arm.cortexa8"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.arm.cortexa8.OMAP3515.Params", "ti.catalog.arm.cortexa8")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.arm.cortexa8", "ti.catalog.arm.cortexa8"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "ti.catalog.arm.cortexa8")).add(vo);
        vo.bind("$$instflag", 1);
        vo.bind("$$iobjflag", 1);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 1);
        vo.bind("$$romcfgs", "|");
        Proto.Str ps = (Proto.Str)vo.find("Module_State");
        if (ps != null) vo.bind("$object", ps.newInstance());
        vo.bind("$$meta_iobj", om.has("ti.catalog.arm.cortexa8.OMAP3515$$instance$static$init", null) ? 1 : 0);
        vo.bind("$$fxntab", Global.newArray());
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray());
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.seal("length");
        vo.bind("Object", om.findStrict("ti.catalog.arm.cortexa8.OMAP3515.Object", "ti.catalog.arm.cortexa8"));
        pkgV.bind("OMAP3515", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("OMAP3515");
    }

    void OMAP3517$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3517", "ti.catalog.arm.cortexa8");
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3517.Module", "ti.catalog.arm.cortexa8");
        vo.init2(po, "ti.catalog.arm.cortexa8.OMAP3517", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", $$UNDEF);
        vo.bind("Instance", om.findStrict("ti.catalog.arm.cortexa8.OMAP3517.Instance", "ti.catalog.arm.cortexa8"));
        vo.bind("Params", om.findStrict("ti.catalog.arm.cortexa8.OMAP3517.Params", "ti.catalog.arm.cortexa8"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.arm.cortexa8.OMAP3517.Params", "ti.catalog.arm.cortexa8")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.arm.cortexa8", "ti.catalog.arm.cortexa8"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "ti.catalog.arm.cortexa8")).add(vo);
        vo.bind("$$instflag", 1);
        vo.bind("$$iobjflag", 1);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 1);
        vo.bind("$$romcfgs", "|");
        Proto.Str ps = (Proto.Str)vo.find("Module_State");
        if (ps != null) vo.bind("$object", ps.newInstance());
        vo.bind("$$meta_iobj", om.has("ti.catalog.arm.cortexa8.OMAP3517$$instance$static$init", null) ? 1 : 0);
        vo.bind("$$fxntab", Global.newArray());
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray());
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.seal("length");
        vo.bind("Object", om.findStrict("ti.catalog.arm.cortexa8.OMAP3517.Object", "ti.catalog.arm.cortexa8"));
        pkgV.bind("OMAP3517", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("OMAP3517");
    }

    void OMAP3425$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3425", "ti.catalog.arm.cortexa8");
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3425.Module", "ti.catalog.arm.cortexa8");
        vo.init2(po, "ti.catalog.arm.cortexa8.OMAP3425", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", $$UNDEF);
        vo.bind("Instance", om.findStrict("ti.catalog.arm.cortexa8.OMAP3425.Instance", "ti.catalog.arm.cortexa8"));
        vo.bind("Params", om.findStrict("ti.catalog.arm.cortexa8.OMAP3425.Params", "ti.catalog.arm.cortexa8"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.arm.cortexa8.OMAP3425.Params", "ti.catalog.arm.cortexa8")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.arm.cortexa8", "ti.catalog.arm.cortexa8"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "ti.catalog.arm.cortexa8")).add(vo);
        vo.bind("$$instflag", 1);
        vo.bind("$$iobjflag", 1);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 1);
        vo.bind("$$romcfgs", "|");
        Proto.Str ps = (Proto.Str)vo.find("Module_State");
        if (ps != null) vo.bind("$object", ps.newInstance());
        vo.bind("$$meta_iobj", om.has("ti.catalog.arm.cortexa8.OMAP3425$$instance$static$init", null) ? 1 : 0);
        vo.bind("$$fxntab", Global.newArray());
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray());
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.seal("length");
        vo.bind("Object", om.findStrict("ti.catalog.arm.cortexa8.OMAP3425.Object", "ti.catalog.arm.cortexa8"));
        pkgV.bind("OMAP3425", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("OMAP3425");
    }

    void OMAP3525$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3525", "ti.catalog.arm.cortexa8");
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3525.Module", "ti.catalog.arm.cortexa8");
        vo.init2(po, "ti.catalog.arm.cortexa8.OMAP3525", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", $$UNDEF);
        vo.bind("Instance", om.findStrict("ti.catalog.arm.cortexa8.OMAP3525.Instance", "ti.catalog.arm.cortexa8"));
        vo.bind("Params", om.findStrict("ti.catalog.arm.cortexa8.OMAP3525.Params", "ti.catalog.arm.cortexa8"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.arm.cortexa8.OMAP3525.Params", "ti.catalog.arm.cortexa8")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.arm.cortexa8", "ti.catalog.arm.cortexa8"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "ti.catalog.arm.cortexa8")).add(vo);
        vo.bind("$$instflag", 1);
        vo.bind("$$iobjflag", 1);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 1);
        vo.bind("$$romcfgs", "|");
        Proto.Str ps = (Proto.Str)vo.find("Module_State");
        if (ps != null) vo.bind("$object", ps.newInstance());
        vo.bind("$$meta_iobj", om.has("ti.catalog.arm.cortexa8.OMAP3525$$instance$static$init", null) ? 1 : 0);
        vo.bind("$$fxntab", Global.newArray());
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray());
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.seal("length");
        vo.bind("Object", om.findStrict("ti.catalog.arm.cortexa8.OMAP3525.Object", "ti.catalog.arm.cortexa8"));
        pkgV.bind("OMAP3525", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("OMAP3525");
    }

    void TMS320C3430$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.arm.cortexa8.TMS320C3430", "ti.catalog.arm.cortexa8");
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.TMS320C3430.Module", "ti.catalog.arm.cortexa8");
        vo.init2(po, "ti.catalog.arm.cortexa8.TMS320C3430", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", $$UNDEF);
        vo.bind("Instance", om.findStrict("ti.catalog.arm.cortexa8.TMS320C3430.Instance", "ti.catalog.arm.cortexa8"));
        vo.bind("Params", om.findStrict("ti.catalog.arm.cortexa8.TMS320C3430.Params", "ti.catalog.arm.cortexa8"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.arm.cortexa8.TMS320C3430.Params", "ti.catalog.arm.cortexa8")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.arm.cortexa8", "ti.catalog.arm.cortexa8"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "ti.catalog.arm.cortexa8")).add(vo);
        vo.bind("$$instflag", 1);
        vo.bind("$$iobjflag", 1);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 1);
        vo.bind("$$romcfgs", "|");
        Proto.Str ps = (Proto.Str)vo.find("Module_State");
        if (ps != null) vo.bind("$object", ps.newInstance());
        vo.bind("$$meta_iobj", om.has("ti.catalog.arm.cortexa8.TMS320C3430$$instance$static$init", null) ? 1 : 0);
        vo.bind("$$fxntab", Global.newArray());
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray());
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.seal("length");
        vo.bind("Object", om.findStrict("ti.catalog.arm.cortexa8.TMS320C3430.Object", "ti.catalog.arm.cortexa8"));
        pkgV.bind("TMS320C3430", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("TMS320C3430");
    }

    void OMAP3530$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3530", "ti.catalog.arm.cortexa8");
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.OMAP3530.Module", "ti.catalog.arm.cortexa8");
        vo.init2(po, "ti.catalog.arm.cortexa8.OMAP3530", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", $$UNDEF);
        vo.bind("Instance", om.findStrict("ti.catalog.arm.cortexa8.OMAP3530.Instance", "ti.catalog.arm.cortexa8"));
        vo.bind("Params", om.findStrict("ti.catalog.arm.cortexa8.OMAP3530.Params", "ti.catalog.arm.cortexa8"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.arm.cortexa8.OMAP3530.Params", "ti.catalog.arm.cortexa8")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.arm.cortexa8", "ti.catalog.arm.cortexa8"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "ti.catalog.arm.cortexa8")).add(vo);
        vo.bind("$$instflag", 1);
        vo.bind("$$iobjflag", 1);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 1);
        vo.bind("$$romcfgs", "|");
        Proto.Str ps = (Proto.Str)vo.find("Module_State");
        if (ps != null) vo.bind("$object", ps.newInstance());
        vo.bind("$$meta_iobj", om.has("ti.catalog.arm.cortexa8.OMAP3530$$instance$static$init", null) ? 1 : 0);
        vo.bind("$$fxntab", Global.newArray());
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray());
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.seal("length");
        vo.bind("Object", om.findStrict("ti.catalog.arm.cortexa8.OMAP3530.Object", "ti.catalog.arm.cortexa8"));
        pkgV.bind("OMAP3530", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("OMAP3530");
    }

    void ITI8168$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.arm.cortexa8.ITI8168", "ti.catalog.arm.cortexa8");
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.ITI8168.Module", "ti.catalog.arm.cortexa8");
        vo.init2(po, "ti.catalog.arm.cortexa8.ITI8168", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Interface");
        vo.bind("$capsule", om.findStrict("ti.catalog.arm.cortexa8.ITI8168$$capsule", "ti.catalog.arm.cortexa8"));
        vo.bind("Instance", om.findStrict("ti.catalog.arm.cortexa8.ITI8168.Instance", "ti.catalog.arm.cortexa8"));
        vo.bind("Params", om.findStrict("ti.catalog.arm.cortexa8.ITI8168.Params", "ti.catalog.arm.cortexa8"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.arm.cortexa8.ITI8168.Params", "ti.catalog.arm.cortexa8")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.arm.cortexa8", "ti.catalog.arm.cortexa8"));
        tdefs.clear();
        proxies.clear();
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        ((Value.Arr)pkgV.getv("$interfaces")).add(vo);
        pkgV.bind("ITI8168", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("ITI8168");
        vo.seal(null);
    }

    void TMS320TI816X$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.arm.cortexa8.TMS320TI816X", "ti.catalog.arm.cortexa8");
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.TMS320TI816X.Module", "ti.catalog.arm.cortexa8");
        vo.init2(po, "ti.catalog.arm.cortexa8.TMS320TI816X", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", $$UNDEF);
        vo.bind("Instance", om.findStrict("ti.catalog.arm.cortexa8.TMS320TI816X.Instance", "ti.catalog.arm.cortexa8"));
        vo.bind("Params", om.findStrict("ti.catalog.arm.cortexa8.TMS320TI816X.Params", "ti.catalog.arm.cortexa8"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.arm.cortexa8.TMS320TI816X.Params", "ti.catalog.arm.cortexa8")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.arm.cortexa8", "ti.catalog.arm.cortexa8"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "ti.catalog.arm.cortexa8")).add(vo);
        vo.bind("$$instflag", 1);
        vo.bind("$$iobjflag", 1);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 1);
        vo.bind("$$romcfgs", "|");
        Proto.Str ps = (Proto.Str)vo.find("Module_State");
        if (ps != null) vo.bind("$object", ps.newInstance());
        vo.bind("$$meta_iobj", om.has("ti.catalog.arm.cortexa8.TMS320TI816X$$instance$static$init", null) ? 1 : 0);
        vo.bind("$$fxntab", Global.newArray());
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray());
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.seal("length");
        vo.bind("Object", om.findStrict("ti.catalog.arm.cortexa8.TMS320TI816X.Object", "ti.catalog.arm.cortexa8"));
        pkgV.bind("TMS320TI816X", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("TMS320TI816X");
    }

    void TMS320DM8168$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8168", "ti.catalog.arm.cortexa8");
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8168.Module", "ti.catalog.arm.cortexa8");
        vo.init2(po, "ti.catalog.arm.cortexa8.TMS320DM8168", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", $$UNDEF);
        vo.bind("Instance", om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8168.Instance", "ti.catalog.arm.cortexa8"));
        vo.bind("Params", om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8168.Params", "ti.catalog.arm.cortexa8"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8168.Params", "ti.catalog.arm.cortexa8")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.arm.cortexa8", "ti.catalog.arm.cortexa8"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "ti.catalog.arm.cortexa8")).add(vo);
        vo.bind("$$instflag", 1);
        vo.bind("$$iobjflag", 1);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 1);
        vo.bind("$$romcfgs", "|");
        Proto.Str ps = (Proto.Str)vo.find("Module_State");
        if (ps != null) vo.bind("$object", ps.newInstance());
        vo.bind("$$meta_iobj", om.has("ti.catalog.arm.cortexa8.TMS320DM8168$$instance$static$init", null) ? 1 : 0);
        vo.bind("$$fxntab", Global.newArray());
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray());
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.seal("length");
        vo.bind("Object", om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8168.Object", "ti.catalog.arm.cortexa8"));
        pkgV.bind("TMS320DM8168", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("TMS320DM8168");
    }

    void TMS320C6A8168$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.arm.cortexa8.TMS320C6A8168", "ti.catalog.arm.cortexa8");
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.TMS320C6A8168.Module", "ti.catalog.arm.cortexa8");
        vo.init2(po, "ti.catalog.arm.cortexa8.TMS320C6A8168", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", $$UNDEF);
        vo.bind("Instance", om.findStrict("ti.catalog.arm.cortexa8.TMS320C6A8168.Instance", "ti.catalog.arm.cortexa8"));
        vo.bind("Params", om.findStrict("ti.catalog.arm.cortexa8.TMS320C6A8168.Params", "ti.catalog.arm.cortexa8"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.arm.cortexa8.TMS320C6A8168.Params", "ti.catalog.arm.cortexa8")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.arm.cortexa8", "ti.catalog.arm.cortexa8"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "ti.catalog.arm.cortexa8")).add(vo);
        vo.bind("$$instflag", 1);
        vo.bind("$$iobjflag", 1);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 1);
        vo.bind("$$romcfgs", "|");
        Proto.Str ps = (Proto.Str)vo.find("Module_State");
        if (ps != null) vo.bind("$object", ps.newInstance());
        vo.bind("$$meta_iobj", om.has("ti.catalog.arm.cortexa8.TMS320C6A8168$$instance$static$init", null) ? 1 : 0);
        vo.bind("$$fxntab", Global.newArray());
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray());
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.seal("length");
        vo.bind("Object", om.findStrict("ti.catalog.arm.cortexa8.TMS320C6A8168.Object", "ti.catalog.arm.cortexa8"));
        pkgV.bind("TMS320C6A8168", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("TMS320C6A8168");
    }

    void ITI8148$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.arm.cortexa8.ITI8148", "ti.catalog.arm.cortexa8");
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.ITI8148.Module", "ti.catalog.arm.cortexa8");
        vo.init2(po, "ti.catalog.arm.cortexa8.ITI8148", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Interface");
        vo.bind("$capsule", om.findStrict("ti.catalog.arm.cortexa8.ITI8148$$capsule", "ti.catalog.arm.cortexa8"));
        vo.bind("Instance", om.findStrict("ti.catalog.arm.cortexa8.ITI8148.Instance", "ti.catalog.arm.cortexa8"));
        vo.bind("Params", om.findStrict("ti.catalog.arm.cortexa8.ITI8148.Params", "ti.catalog.arm.cortexa8"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.arm.cortexa8.ITI8148.Params", "ti.catalog.arm.cortexa8")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.arm.cortexa8", "ti.catalog.arm.cortexa8"));
        tdefs.clear();
        proxies.clear();
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        ((Value.Arr)pkgV.getv("$interfaces")).add(vo);
        pkgV.bind("ITI8148", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("ITI8148");
        vo.seal(null);
    }

    void TMS320TI814X$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.arm.cortexa8.TMS320TI814X", "ti.catalog.arm.cortexa8");
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.TMS320TI814X.Module", "ti.catalog.arm.cortexa8");
        vo.init2(po, "ti.catalog.arm.cortexa8.TMS320TI814X", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", $$UNDEF);
        vo.bind("Instance", om.findStrict("ti.catalog.arm.cortexa8.TMS320TI814X.Instance", "ti.catalog.arm.cortexa8"));
        vo.bind("Params", om.findStrict("ti.catalog.arm.cortexa8.TMS320TI814X.Params", "ti.catalog.arm.cortexa8"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.arm.cortexa8.TMS320TI814X.Params", "ti.catalog.arm.cortexa8")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.arm.cortexa8", "ti.catalog.arm.cortexa8"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "ti.catalog.arm.cortexa8")).add(vo);
        vo.bind("$$instflag", 1);
        vo.bind("$$iobjflag", 1);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 1);
        vo.bind("$$romcfgs", "|");
        Proto.Str ps = (Proto.Str)vo.find("Module_State");
        if (ps != null) vo.bind("$object", ps.newInstance());
        vo.bind("$$meta_iobj", om.has("ti.catalog.arm.cortexa8.TMS320TI814X$$instance$static$init", null) ? 1 : 0);
        vo.bind("$$fxntab", Global.newArray());
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray());
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.seal("length");
        vo.bind("Object", om.findStrict("ti.catalog.arm.cortexa8.TMS320TI814X.Object", "ti.catalog.arm.cortexa8"));
        pkgV.bind("TMS320TI814X", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("TMS320TI814X");
    }

    void TMS320DM8148$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8148", "ti.catalog.arm.cortexa8");
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8148.Module", "ti.catalog.arm.cortexa8");
        vo.init2(po, "ti.catalog.arm.cortexa8.TMS320DM8148", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", $$UNDEF);
        vo.bind("Instance", om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8148.Instance", "ti.catalog.arm.cortexa8"));
        vo.bind("Params", om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8148.Params", "ti.catalog.arm.cortexa8"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8148.Params", "ti.catalog.arm.cortexa8")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.arm.cortexa8", "ti.catalog.arm.cortexa8"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "ti.catalog.arm.cortexa8")).add(vo);
        vo.bind("$$instflag", 1);
        vo.bind("$$iobjflag", 1);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 1);
        vo.bind("$$romcfgs", "|");
        Proto.Str ps = (Proto.Str)vo.find("Module_State");
        if (ps != null) vo.bind("$object", ps.newInstance());
        vo.bind("$$meta_iobj", om.has("ti.catalog.arm.cortexa8.TMS320DM8148$$instance$static$init", null) ? 1 : 0);
        vo.bind("$$fxntab", Global.newArray());
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray());
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.seal("length");
        vo.bind("Object", om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8148.Object", "ti.catalog.arm.cortexa8"));
        pkgV.bind("TMS320DM8148", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("TMS320DM8148");
    }

    void $$INITIALIZATION()
    {
        Value.Obj vo;

        if (isCFG) {
        }//isCFG
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("ti.catalog.arm.cortexa8.OMAP3403", "ti.catalog.arm.cortexa8"));
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("ti.catalog.arm.cortexa8.OMAP3405", "ti.catalog.arm.cortexa8"));
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("ti.catalog.arm.cortexa8.OMAP3503", "ti.catalog.arm.cortexa8"));
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("ti.catalog.arm.cortexa8.OMAP3505", "ti.catalog.arm.cortexa8"));
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("ti.catalog.arm.cortexa8.OMAP3515", "ti.catalog.arm.cortexa8"));
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("ti.catalog.arm.cortexa8.OMAP3517", "ti.catalog.arm.cortexa8"));
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("ti.catalog.arm.cortexa8.OMAP3425", "ti.catalog.arm.cortexa8"));
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("ti.catalog.arm.cortexa8.OMAP3525", "ti.catalog.arm.cortexa8"));
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("ti.catalog.arm.cortexa8.TMS320C3430", "ti.catalog.arm.cortexa8"));
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("ti.catalog.arm.cortexa8.OMAP3530", "ti.catalog.arm.cortexa8"));
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("ti.catalog.arm.cortexa8.TMS320TI816X", "ti.catalog.arm.cortexa8"));
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8168", "ti.catalog.arm.cortexa8"));
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("ti.catalog.arm.cortexa8.TMS320C6A8168", "ti.catalog.arm.cortexa8"));
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("ti.catalog.arm.cortexa8.TMS320TI814X", "ti.catalog.arm.cortexa8"));
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("ti.catalog.arm.cortexa8.TMS320DM8148", "ti.catalog.arm.cortexa8"));
        Global.callFxn("init", pkgV);
        ((Value.Obj)om.getv("ti.catalog.arm.cortexa8.IOMAP3xxx")).bless();
        ((Value.Obj)om.getv("ti.catalog.arm.cortexa8.OMAP3403")).bless();
        ((Value.Obj)om.getv("ti.catalog.arm.cortexa8.OMAP3405")).bless();
        ((Value.Obj)om.getv("ti.catalog.arm.cortexa8.OMAP3503")).bless();
        ((Value.Obj)om.getv("ti.catalog.arm.cortexa8.OMAP3505")).bless();
        ((Value.Obj)om.getv("ti.catalog.arm.cortexa8.OMAP3515")).bless();
        ((Value.Obj)om.getv("ti.catalog.arm.cortexa8.OMAP3517")).bless();
        ((Value.Obj)om.getv("ti.catalog.arm.cortexa8.OMAP3425")).bless();
        ((Value.Obj)om.getv("ti.catalog.arm.cortexa8.OMAP3525")).bless();
        ((Value.Obj)om.getv("ti.catalog.arm.cortexa8.TMS320C3430")).bless();
        ((Value.Obj)om.getv("ti.catalog.arm.cortexa8.OMAP3530")).bless();
        ((Value.Obj)om.getv("ti.catalog.arm.cortexa8.ITI8168")).bless();
        ((Value.Obj)om.getv("ti.catalog.arm.cortexa8.TMS320TI816X")).bless();
        ((Value.Obj)om.getv("ti.catalog.arm.cortexa8.TMS320DM8168")).bless();
        ((Value.Obj)om.getv("ti.catalog.arm.cortexa8.TMS320C6A8168")).bless();
        ((Value.Obj)om.getv("ti.catalog.arm.cortexa8.ITI8148")).bless();
        ((Value.Obj)om.getv("ti.catalog.arm.cortexa8.TMS320TI814X")).bless();
        ((Value.Obj)om.getv("ti.catalog.arm.cortexa8.TMS320DM8148")).bless();
        ((Value.Arr)om.findStrict("$packages", "ti.catalog.arm.cortexa8")).add(pkgV);
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
        IOMAP3xxx$$OBJECTS();
        OMAP3403$$OBJECTS();
        OMAP3405$$OBJECTS();
        OMAP3503$$OBJECTS();
        OMAP3505$$OBJECTS();
        OMAP3515$$OBJECTS();
        OMAP3517$$OBJECTS();
        OMAP3425$$OBJECTS();
        OMAP3525$$OBJECTS();
        TMS320C3430$$OBJECTS();
        OMAP3530$$OBJECTS();
        ITI8168$$OBJECTS();
        TMS320TI816X$$OBJECTS();
        TMS320DM8168$$OBJECTS();
        TMS320C6A8168$$OBJECTS();
        ITI8148$$OBJECTS();
        TMS320TI814X$$OBJECTS();
        TMS320DM8148$$OBJECTS();
        IOMAP3xxx$$CONSTS();
        OMAP3403$$CONSTS();
        OMAP3405$$CONSTS();
        OMAP3503$$CONSTS();
        OMAP3505$$CONSTS();
        OMAP3515$$CONSTS();
        OMAP3517$$CONSTS();
        OMAP3425$$CONSTS();
        OMAP3525$$CONSTS();
        TMS320C3430$$CONSTS();
        OMAP3530$$CONSTS();
        ITI8168$$CONSTS();
        TMS320TI816X$$CONSTS();
        TMS320DM8168$$CONSTS();
        TMS320C6A8168$$CONSTS();
        ITI8148$$CONSTS();
        TMS320TI814X$$CONSTS();
        TMS320DM8148$$CONSTS();
        IOMAP3xxx$$CREATES();
        OMAP3403$$CREATES();
        OMAP3405$$CREATES();
        OMAP3503$$CREATES();
        OMAP3505$$CREATES();
        OMAP3515$$CREATES();
        OMAP3517$$CREATES();
        OMAP3425$$CREATES();
        OMAP3525$$CREATES();
        TMS320C3430$$CREATES();
        OMAP3530$$CREATES();
        ITI8168$$CREATES();
        TMS320TI816X$$CREATES();
        TMS320DM8168$$CREATES();
        TMS320C6A8168$$CREATES();
        ITI8148$$CREATES();
        TMS320TI814X$$CREATES();
        TMS320DM8148$$CREATES();
        IOMAP3xxx$$FUNCTIONS();
        OMAP3403$$FUNCTIONS();
        OMAP3405$$FUNCTIONS();
        OMAP3503$$FUNCTIONS();
        OMAP3505$$FUNCTIONS();
        OMAP3515$$FUNCTIONS();
        OMAP3517$$FUNCTIONS();
        OMAP3425$$FUNCTIONS();
        OMAP3525$$FUNCTIONS();
        TMS320C3430$$FUNCTIONS();
        OMAP3530$$FUNCTIONS();
        ITI8168$$FUNCTIONS();
        TMS320TI816X$$FUNCTIONS();
        TMS320DM8168$$FUNCTIONS();
        TMS320C6A8168$$FUNCTIONS();
        ITI8148$$FUNCTIONS();
        TMS320TI814X$$FUNCTIONS();
        TMS320DM8148$$FUNCTIONS();
        IOMAP3xxx$$SIZES();
        OMAP3403$$SIZES();
        OMAP3405$$SIZES();
        OMAP3503$$SIZES();
        OMAP3505$$SIZES();
        OMAP3515$$SIZES();
        OMAP3517$$SIZES();
        OMAP3425$$SIZES();
        OMAP3525$$SIZES();
        TMS320C3430$$SIZES();
        OMAP3530$$SIZES();
        ITI8168$$SIZES();
        TMS320TI816X$$SIZES();
        TMS320DM8168$$SIZES();
        TMS320C6A8168$$SIZES();
        ITI8148$$SIZES();
        TMS320TI814X$$SIZES();
        TMS320DM8148$$SIZES();
        IOMAP3xxx$$TYPES();
        OMAP3403$$TYPES();
        OMAP3405$$TYPES();
        OMAP3503$$TYPES();
        OMAP3505$$TYPES();
        OMAP3515$$TYPES();
        OMAP3517$$TYPES();
        OMAP3425$$TYPES();
        OMAP3525$$TYPES();
        TMS320C3430$$TYPES();
        OMAP3530$$TYPES();
        ITI8168$$TYPES();
        TMS320TI816X$$TYPES();
        TMS320DM8168$$TYPES();
        TMS320C6A8168$$TYPES();
        ITI8148$$TYPES();
        TMS320TI814X$$TYPES();
        TMS320DM8148$$TYPES();
        if (isROV) {
            IOMAP3xxx$$ROV();
            OMAP3403$$ROV();
            OMAP3405$$ROV();
            OMAP3503$$ROV();
            OMAP3505$$ROV();
            OMAP3515$$ROV();
            OMAP3517$$ROV();
            OMAP3425$$ROV();
            OMAP3525$$ROV();
            TMS320C3430$$ROV();
            OMAP3530$$ROV();
            ITI8168$$ROV();
            TMS320TI816X$$ROV();
            TMS320DM8168$$ROV();
            TMS320C6A8168$$ROV();
            ITI8148$$ROV();
            TMS320TI814X$$ROV();
            TMS320DM8148$$ROV();
        }//isROV
        $$SINGLETONS();
        IOMAP3xxx$$SINGLETONS();
        OMAP3403$$SINGLETONS();
        OMAP3405$$SINGLETONS();
        OMAP3503$$SINGLETONS();
        OMAP3505$$SINGLETONS();
        OMAP3515$$SINGLETONS();
        OMAP3517$$SINGLETONS();
        OMAP3425$$SINGLETONS();
        OMAP3525$$SINGLETONS();
        TMS320C3430$$SINGLETONS();
        OMAP3530$$SINGLETONS();
        ITI8168$$SINGLETONS();
        TMS320TI816X$$SINGLETONS();
        TMS320DM8168$$SINGLETONS();
        TMS320C6A8168$$SINGLETONS();
        ITI8148$$SINGLETONS();
        TMS320TI814X$$SINGLETONS();
        TMS320DM8148$$SINGLETONS();
        $$INITIALIZATION();
    }
}
