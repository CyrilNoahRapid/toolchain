/* 
 *  Copyright (c) 2008 Texas Instruments and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *      Texas Instruments - initial implementation
 * 
 * */
function init()
{
    switch (String(environment['os.name'])) {

    case 'Linux':
        xdc.loadPackage('xdc.tools.sg.swt_linux');
        break;
    case 'SunOS':
        xdc.loadPackage('xdc.tools.sg.swt_solaris');
        break;
    default:
        xdc.loadPackage('xdc.tools.sg.swt_win32');
        break;
    }
}
/*
 *  @(#) xdc.tools.sg; 1, 0, 0, 0,305; 11-16-2010 11:20:55; /db/ztree/library/trees/xdc/xdc-v53x/src/packages/
 */

