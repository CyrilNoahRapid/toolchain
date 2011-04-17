/*
 *  Copyright 2010 by Texas Instruments Incorporated.
 *
 */

/*!
 *  ======== Main ========
 *  Command-line tool for generating eclipse plugins for RTSC content
 *
 *  The `plugingen` tool allows RTSC content producers to
 *  create eclipse plugins that allows their content to be 
 *  integrated in the CCS4 environment. As input, the tool requires 
 *  @p(blist)
 *      - a RTSC module implementing {@link xdc.tools.product.IProduct}
 *  @p
 *  Refer to {@link ./doc-files/ExampleProduct.xdc ExampleProduct}
 *  for an implementation of {@link xdc.tools.product.IProduct IProduct}.
 *
 *  The tool may also be used to generate starter examples that will showup 
 *  in the new project wizard. This is accomplished by implementing
 *  {@link xdc.tools.product.IProductTemplate IProductTemplate} and setting
 *  the {@link xdc.tools.product.IProduct#templateModule templateModule} 
 *  configuration parameter of the {@link xdc.tools.product.IProduct IProduct} 
 *  implementation to the name of the implementation module. 
 *  Refer to {@link ./doc-files/Examples.xdc Examples}
 *  for a sample implementation of {@link
 *  xdc.tools.product.IProductTemplate IProductTemplate}.
 *  
 *  The XGCONF product view maybe developed by implementing
 *  {@link xdc.tools.product.IProductView IProductView} and setting
 *  the {@link xdc.tools.product.IProduct#productViewModule productViewModule} 
 *  configuration parameter of the {@link xdc.tools.product.IProduct IProduct} 
 *  implementation to the name of the implementation module.
 *  Refer to {@link ./doc-files/ProductView.xdc ProductView.xdc} and 
 *  {@link ./doc-files/ProductView.xs ProductView.xs}
 *  for a sample implementation of {@link
 *  xdc.tools.product.IProductView IProductView}.
 *
 *  The tool operates on a product that is either specified by the `-p`
 *  option or is present in the folder from which the tool is executed.
 *  The tool will create the plugin in a sub-folder named `eclipse`
 *  in the output directory specified with `-o` option. If the `-o`
 *  option is not specified the plugin is created in the product root
 *  directory. 
 *  The tool will search the repositories specified in the module
 *  implementing {@link xdc.tools.product.IProduct} for RTSC platforms.
 *  This search can be disabled by specifying the`--disable_repo_search` 
 *  option. The user needs to ensure that the repositories are installed 
 *  in the product root directory before using the tool.
 *
 *
 *
 *  @a(Example)
 *  @p(code)
 *  xs xdc.tools.product.plugingen 
 *                      -p exampleprod_1_0_0_00
 *                      -m xdc.tools.product.plugingen.examples.ExampleProduct
 
 *
 */
metaonly module Main inherits xdc.tools.ICmd
{
    override config String usage[] = [
        '[-p product_root_directory]',
        ' -m module',
        '[-o outdir]',
        '[--suppress_product_type_info]',
        '[--disable_repo_search]'
    ];

instance:

    /*!
     *  ======== productDir ========
     *  Product root directory
     *
     *  This option names the product root directory that is used by the 
     *  tool to generate the plugin. If the '-o' option is not
     *  specified the tool generates the plugin in a sub-directory
     *  called `eclipse` in the product root directory.
     *
     */
    @CommandOption("p")
    config String productDir = "./";

    /*!
     *  ======== schemaFile ========
     *  Input description of the plug-in to be specified
     *
     *  This required option names a module that implements
     *  `{@link xdc.tools.product.IProduct}`.
     *
     */
    @CommandOption("m")
    config String productModule;

    /*!
     *  ======== outputDir ========
     *  Output directory in which the plugin will be generated.
     *
     *  This option names the directory in which the plugin 
     *  will be generated in a sub-directory named `eclipse`.
     *  If this option is not specified the tool will generate
     *  the plugin in the product root directory specified with
     *  the '-p' option.
     *
     */
    @CommandOption("o")
    config String outputDir = null;

    /*!
     *  ======== suppress_product_type_info ========
     *  Suppress generation of product type information in the 
     *  generated plugin
     *
     * This option generates eclipse plugin without the product
     * type information. Should be invoked to generate plugins whose
     * product type is declared elsewhere 
     *
     */
    @CommandOption("suppress_product_type_info")
    config Bool suppressProductTypeInfo = false;


    /*!
     *  ======== disable_repo_search ========
     *  Suppress search of product repositories
     *
     *  If this option is specified the tool does not
     *  search the product repositories for RTSC platforms.
     */
    @CommandOption("disable_repo_search")
    config Bool suppressSearch = false;

        
    /*!
     *  ======== run ========
     */
    override Any run(xdc.tools.Cmdr.Instance cmdr, String args[]);
}
/*
 *  @(#) xdc.tools.product.plugingen; 1, 0, 0,39; 10-15-2010 11:41:40; /db/ztree/library/trees/xdctools/xdctools-d45x/src/
 */

