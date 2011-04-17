/*
 *  ======== package.xs ========
 *
 *! Revision History
 *! ================
 *! 02-Mar-2010 sg      Initial.
 */

/*
 *  ======== Package.getLibs ========
 */
function getLibs(prog)
{
    var libs = "lib/ti.catalog.msp430.init.a" + prog.build.target.suffix;

    return (libs);
}
