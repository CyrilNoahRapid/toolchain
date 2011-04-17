/* 
 *  Copyright (c) 2009 Texas Instruments and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *      Texas Instruments - initial implementation
 * 
 * */
package xdc.tools.product;

/*!
 *  ======== IProductView ========
 *  Define a product as a logical group of RTSC modules
 *
 *  This interface allows a product to define
 *  logical groups of RTSC modules delivered with it. Implementations
 *  maybe consumed within development environments like IDE's to render a
 *  graphical tree view of the product comprising of these groups.
 *  This is an experimental interface and is subject to change.
 *
 */ 
metaonly interface IProductView
{
    /*!
     *  ======== ProductElemDesc ======== 
     *  ProductElemDesc structure
     * 
     *  Structure that should be used by the implementor to
     *  define the logical tree "view" of the product. The product view is 
     *  composed of elements that are either modules or groups.
     *  Groups can contain other groups or modules. The implementor will 
     *  start with a root node and then logically build a tree
     *  comprising of groups and modules.
     *
     *  @field(elemName)        Name of element. Elements can be either
     *                          groups or modules
     *  @field(moduleName)      In case of a leaf node this field will
     *                          contain the module name. For intermediate
     *                          tree nodes the module name will be set to 
     *                          `null`
     *  @field(iconFileName)    The name of the icon file that is associated
     *                          with this element
     *  @field(elemArray)       Array used to define children of a node.
     */ 
    metaonly struct ProductElemDesc {
        String elemName;             /*! Name of group or module */
        String moduleName;           /*! Name of module */
        String iconFileName;         /*! Icon file name representing element */
        ProductElemDesc elemArray[]; /*! Array of `ProductElemDesc` */
    };
    
    /*!
     *  ======== getProductDescriptor ========
     *  Return product descriptor
     *
     *  This method is typically invoked by development tools like IDE's 
     *  to get the product view tree structure.
     *
     *  @a(returns)
     *  Returns root node of the tree of `{@link #ProductElemDesc}` structures
     */ 
    ProductElemDesc getProductDescriptor();
}
/*
 *  @(#) xdc.tools.product; 1, 0, 0,40; 10-15-2010 11:41:34; /db/ztree/library/trees/xdctools/xdctools-d45x/src/
 */

