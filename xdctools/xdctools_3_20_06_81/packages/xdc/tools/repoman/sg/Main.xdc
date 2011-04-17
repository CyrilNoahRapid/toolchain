/* 
 *Copyright (c) 2008 Texas Instruments and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *      Texas Instruments - initial implementation
 *
 * */
/*!
 *  ======== Main ========
 *  Graphical interface to repoman tool
 *
 */
metaonly module Main inherits xdc.tools.ICmd {

    override config String usage[] = [
       '[--packagepath PATH]'
    ];
    /*!
     *  ======== createPartControl ========
     *  @_nodoc
     */
    function createPartControl(parent);
instance:
    //! repositories to scan for packages
    @CommandOption('packagepath')
    config string pathArg = null;
}
/*
 *  @(#) xdc.tools.repoman.sg; 1, 0, 0,186; 10-15-2010 11:41:53; /db/ztree/library/trees/xdctools/xdctools-d45x/src/
 */

