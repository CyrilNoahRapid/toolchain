/*
 *  ======== Registry.xs ========
 */

var Text;

/*
 *  ======== module$use ========
 */
function module$use() 
{
    xdc.useModule('xdc.runtime.Assert');
    xdc.useModule('xdc.runtime.Types');
    
    Text = xdc.useModule('xdc.runtime.Text');
}

/*
 *  ======== module$static$init ========
 */
function module$static$init(mod) 
{
    mod.listHead = null;
    
    /* Registry module ids start at the max and count down. */
    // TODO - Does it make more sense for them to count up?
    mod.curId = Text.registryModsLastId;
}
/*
 *  @(#) xdc.runtime; 2, 1, 0,296; 11-16-2010 11:20:24; /db/ztree/library/trees/xdc/xdc-v53x/src/packages/
 */

