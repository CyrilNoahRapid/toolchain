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

/*! 
 *  ======== IProduct ========
 *  Interface specifying product details. 
 *
 *  This interface allows products describe themselves for the benefit
 *  of development tools such as IDE's.  For example, a tool
 *  can read the information provided by a product that implements this
 *  interface and generate an eclipse plugin that leverages the product's
 *  "resources".
 *
 *  By expressing the product's information in this interface, a product
 *  can be delivered into multiple development tools without explicit
 *  knowledge of these tools.  For example, an online "product repository"
 *  can extract sufficient information from this interface to enable it
 *  to provide a searchable catalog of interesting products.
 *
 *  This is an experimental interface and is subject to change
 */
metaonly interface IProduct
{
    /*!
     *  ======== HelpToc ========    
     *  Help table of contents (TOC) element
     *
     *  A help element is a file inside the product that may be referenced 
     *  from a global table of contents.
     *
     *  @field(label)    Summary description of help element
     *  @field(filePath) Path to help documentation relative to  
     *                   directory specified in {@link #docsLoc} 
     *  @field(tocFile)  Flag indicates whether the element is a 
     *                   table of content(TOC) file. Tools may
     *                   process TOC files in a special way. For
     *                   example a tool to generate eclipse plugins may
     *                   want to copy the TOC file in the plugin folder
     *                   for integrating with eclipse help.
     */
    struct HelpToc {
        String label;       /*! Help element description */   
        String filePath;    /*! Path to help doc */
        Bool   tocFile;     /*! Indicates whether element is a TOC file  */
    };
     
    /*!
     *  ========= Target ==============
     *  Structure containing information on RTSC targets
     *
     *  Products may specify RTSC target modules by associating
     *  them with device name and family regular expressions. This
     *  information may be leveraged by tools to derive the RTSC target
     *  given a device name and family. Devices implement the
     *  {@link xdc.platform.ICpuDataSheet} interface. Devices may be
     *  grouped in a family and delivered as a package.
     *
     *  For example, the device module  TMS320DA830 in the package 
     *  `ti.catalog.C6000` may be associated  with a RTSC target 
     *  `ti.targets.C674` by setting  `deviceNamePattern` to `TMS320DA8*`,
     *  `deviceFamilyPattern` to `C6*`, `packageName` to 
     *  `ti.targets` and `baseTargetName` to `C674`. 
     *
     *  @field(deviceNamePattern)   A regular expression for device names
     *  @field(deviceFamilyPattern) A regular expression for device families
     *  @field(packageName)         The name of a package containing a
     *                              target module that  can be used with
     *                              the  devices that match the
     *                              device name and family patterns
     *  @field(baseTargetName)      The name of the module 
     *                              (without the package prefix) in 
     *                              the package named by `packageName`.
     */
    struct Target {
        String deviceNamePattern;   /*! Device name regex eg. MSP430*  */
        String deviceFamilyPattern; /*! Device family regex eg. C6* */
        String packageName;         /*! Package containing RTSC target  */
        String baseTargetName;      /*! Name of RTSC target module */
    };

    /*!
     *  ======== UrlDescriptor ========
     *  URL Descriptor structure
     *
     *  @field(url)  Uniform Resource Locator(URL)
     *  @field(text) Summary text for the URL
     */
    struct UrlDescriptor {
        String url;     /*! Uniform Resource Locator(URL) */
        String text;    /*! Summary text for the URL */
    };

    /*!
     *  ======== name ========
     *  Product name
     *
     *  String containing product name eg. System BIOS
     */
    config String name;

    /*!
     *  ======== id ========
     *  A unique product id 
     *
     *  For example, product developers may choose to  follow namespace
     *  conventions for Java packages or Eclipse plugins to specify a
     *  unique id like `org.eclipse.rtsc.xdctools.product`.
     *
     */
    config String id;


    /*!
     *  ======== version ========
     *  Product version
     *
     *  The product version should follow the format 
     *  -`major.minor.service.qualifier`  where 
     *  `major`,`minor` and `service` are integers and 
     *  `qualifier` is a string. Example - 3.16.02.31-eng. 
     *
     *  Products may  specify their own guidelines for
     *  updating `major`,`minor`,`service` and `qualifier` portions of the
     *  version number as long as they are unique for the product.
     *  Products may also choose to follow popular versioning conventions
     *  like those followed for versioning Eclipse plugins.
     */
    config String version;

    /*!
     *  ======== featureId ========
     *  A unique feature id
     *
     *  A feature maybe used by a system to install product upgrades.
     *  Typically a system will look at various versions of a
     *  feature available in the system and allow the user to upgrade
     *  to the latest version. The product developer can use the `featureId`
     *  to manage the granularity of product upgrades in a system. For 
     *  example the version `3.20.0.00` for product 
     *  `org.eclipse.rtsc.xdctools.product` may have the `featureId`
     *  `org.eclipse.rtsc.xdctools.product_3.20`.
     *  The product developer may allow the upgrade system to pick up
     *  patch releases to `3.20.0.00` release by specifying different
     *  versions of the product (eg. 3.20.0.01) with `featureId` 
     *  `org.eclipse.rtsc.xdctools.product_3.20`
     */
    config String featureId;


    /*!
     *  ======== updateSite ========
     *  Update site for product
     *
     *  @field(url) the `url` field should contain the URL containing
     *  product upgrades.
     *
     *  @field(text) the `text` field should contain summary description of
     *  the update site
     */
    config  UrlDescriptor updateSite;


    /*!
     *  ======== companyName ========
     *  Name of company releasing product
     *
     *  Example : "Texas Instruments"
     */
    config String companyName;

    /*!
     *  ======== productDescriptor ========
     *  Product description
     *
     *  @field(url) the `url` field should contain the URL of the organization
     *  releasing the product.
     *
     *  @field(text) the `text` field should contain summary description of
     *  the product
     */
    config UrlDescriptor productDescriptor;

    /*!
     *  ======== licenseDescriptor ========
     *  License information for product
     *
     *  @field(url) field should contain the URL containing the 
     *  license text.
     *
     *  @field(text) field should contain a summary description of the license
     */
    config UrlDescriptor licenseDescriptor;

    /*!
     *  ======== copyRightNotice ========
     *  Copyright notice for product
     *
     */
    config String copyRightNotice;
    
    /*!
     *  ======== repositoryArr ========
     *  Repositories contained in product
     *
     *  Repositories are specified relative to the product installation
     *  directory.
     */
    config String repositoryArr[];

    /*!
     *  ======== docsLoc ========
     *  Directories containing documents in the product
     *
     *  Directories are specified relative to the product installation
     *  directory.
     */
    config String docsLocArr[];

    /*!
     *  ======== templateModule ========
     *  Name of module implementing {@link xdc.tools.product.IProductTemplate}
     *
     *  Template module should be delivered
     *  in the repositories defined in {@link #repositoryArr}
     */
    config String templateModule;
    
    /*!
     *  ======== productViewModule ========
     *  Name of module implementing {@link xdc.tools.product.IProductView}
     *
     *  Product view module should be delivered
     *  in the repositories defined in {@link #repositoryArr}
     */
    config String productViewModule;

    /*!
     *  ======== bundleName ========
     *  Product bundle name
     *  
     *  Product bundle name is embedded in the top level folder name of
     *  the product. Example: The top level folder for XDCtools version 
     *  3.16.02.31-eng is `xdctools_3_16_02_31-eng`. In this case the 
     *  bundle name is `xdctools`.
     *  The bundle name maybe used by tools to discover the product 
     *  installed on a filesystem.
     */
    config String bundleName;

    /*!
     *  ======== targetArr ========
     *  RTSC target modules contained in product
     *
     *  The RTSC target modules should be delivered
     *  in the repositories defined in {@link #repositoryArr}
     *
     */
    config Target targetArr[];

    
    /*!
     *  ======== helpTocArr ========
     *  Array of table of contents elements in product
     * 
     *  Tools generating table of contents are required
     *  to preserve the order of elements specified in this array
     */ 
    config HelpToc helpTocArr[];


    /*!
     *  ======== tocIndexFile ========
     *  Top level index file referred in table of contents
     */
    config String tocIndexFile;


    /*!
     *  ======== exclusive ========
     *  Indicates whether product allows existence of multiple 
     *  versions in a system
     *
     *  When flag is set to `true` it indicates that only one 
     *  version of the product can be active in the system. Otherwise
     *  the system can handle multiple versions of the same product. 
     */
    config Bool exclusive = false;

    /*!
     *  ======== otherFiles ========
     *  Array of paths to files that describe the product
     *
     *  A product may wish to supply files that describing certain aspects 
     *  of itself. For example a product may provide text, images and video
     *  files that provide branding information for the product. 
     *  These files may then be consumed by tools like IDE's via 
     *  hooks defined in the IDE framework.
     *  The file path is defined relative to the directory containing the
     *  implementation  of this interface
     *
     */
    config String otherFiles[];

}
/*
 *  @(#) xdc.tools.product; 1, 0, 0,40; 10-15-2010 11:41:34; /db/ztree/library/trees/xdctools/xdctools-d45x/src/
 */

