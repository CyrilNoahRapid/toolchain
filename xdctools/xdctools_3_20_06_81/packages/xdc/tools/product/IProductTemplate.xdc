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
package xdc.tools.product;

/*!
 *  ======== IProductTemplate ========
 *  Interface to provide examples for a product
 *  
 *  This interface allows products to contribute examples to
 *  development environments like IDE's. This is an experimental 
 *  interface and is subject to change.
 */
metaonly interface IProductTemplate
{

    /*!
     *  ======== FileDesc ========
     *  Structure defining properties of a file included in an example
     *
     *  @field(path)                    Path to file relative to the package
     *                                  containing the implementation of 
     *                                  `IProductTemplate`
     *  @field(excludeFromBuild)        Flag indicating whether file
     *                                  should be excluded from build inside
     *                                  an IDE project 
     *  @field(openOnCreation)          Flag indicating whether the file
     *                                  should be opened when a project
     *                                  containing the example file is created
     *                                  by the IDE. 
     *  @field(copyIntoConfiguration)   Flag indicating whether the file
     *                                  should be copied into RTSC 
     *                                  configuration. This flag 
     *                                  applies only when the `isHybrid`
     *                                  flag of the {@link #TemplateInfo template} is set to
     *                                  `false`.
     *
     */ 
    struct FileDesc {
        String path;             /*! Path to file */
        Bool   excludeFromBuild; /*! Indicates whether file should be
                                     excluded from build 
                                  */
        Bool   openOnCreation;   /*! Indicates whether file should be
                                     opened on project creation
                                  */
        Bool   copyIntoConfiguration; /*! Indicates whether file should be
                                       *   copied into RTSC configuration 
                                       */
    };

    /*!
     *  ======== Filter ========
     *  Structure defining filter properties for an example
     *
     *  This structure allows example providers to define
     *  constraints for their examples. 
     *  IDEs may use the `Filter` properties of an example
     *  to decide whether the example should be presented to the user.
     *  
     *  The filter is evaluated by performing an 'AND' operation
     *  on its individual elements. In other words all the defined
     *  elements must evaluate to `true` for the filter to evaluate
     *  to `true`.
     *
     *  Example {@link #TemplateInfo providers} typically define an 
     *  array of filters. The filter array is evaluated using the 'OR' operation.
     *
     *  The filter allows the user to define the NOT property by
     *  inserting a "~" character at the start of the string. For
     *  example if the deviceFamily field is set to "~MSP430" the example
     *  will be displayed for all device families except MSP430.
     *
     *  @field(deviceFamily)   String indicating the device family 
     *                         eg. "MSP430","C6000"
     *  @field(deviceVariant)  String indicating device variant
     *                         eg. "C674X", "CortexA8"
     *  @field(deviceId)       String indicating the device part number
     *                         eg. "TMS320C6747"
     *  @field(endianness)     String indicating the device endianness
     *                         eg. "little", "big"
     *  @field(toolChain)      String indicating the tool chain
     *                         eg. "TI", "GNU"
     *  @field(outputFormat)   String indicating the object file format
     *                         eg. "COFF", "ELF"
     */ 
    struct Filter {
        String deviceFamily; 
        String deviceVariant;
        String deviceId;    
        String endianness;
        String toolChain;
        String outputFormat;
    }; 

    /*!
     *  ======== TemplateInfo ========
     *  TemplateInfo structure 
     *
     *  @field(title)             String containing the title of the template
     *  @field(fileList)          Array of {@link #FileDesc} defining the
     *                            properties of the files contributed by this example.
     *  @field(description)       String containing  description of example
     *  @field(target)            String containing RTSC target
     *  @field(platform)          String containing RTSC platform
     *  @field(buildProfile)      String containing RTSC build profile
     *  @field(linkerCommandFile) Linker command file for the example. If
     *                            this is set to the empty string then no
     *                            linker command file is added by the IDE
     *                            to the example. If this is not defined 
     *                            then the wizard picks the default
     *                            linker command file for the selected device. 
     *  @field(requiredProducts)  Products required to build this
     *                            example. Products are  identified by
     *                            their globally unique 
     *                            {@link xdc.tools.product.IProduct#id} 
     *                            eg. 'com.ti.bios'. Dependency on a 
     *                            minimum version of a product maybe
     *                            defined in the following manner
     *                            : <product-id>:<min-version>
     *  @field(groups)            Array of strings referring example groups
     *                            that a particular example may
     *                            belong. Example providers may want to
     *                            provide examples that are part of an
     *                            existing example group eg."Empty Projects" 
     *                            that are defined elsewhere. The
     *                            groups are identified by an unique id.
     *  @field(configOnly)        Flag indicating to the IDE
     *                            whether example contributes only
     *                            to a RTSC configuration project.
     *  @field(isHybrid)          Flag indicating to the IDE 
     *                            whether example contains RTSC 
     *                            configuration  and target 
     *                            content files in one project.
     *                            If this field is set to `true` 
     *                            then the IDE consuming this example will 
     *                            create one project with all the
     *                            files. Otherwise multiple projects will 
     *                            be created - one containing the
     *                            target content and the other containing 
     *                            the RTSC configuration files. This flag
     *                            is applies only when `configOnly`
     *                            flag is set to `false`.
     *  @field(filterArr)         Array of {@link #Filter}. Used to specify
     *                            the constraints for a particular
     *                            example. The filter array is evaluated using
     *                            an OR operation on the individual array
     *                            elements. Note that individual elements 
     *                            within a {@link #Filter filter} is evaluated with the 
     *                            'AND' operation. 
     *                          
     */ 
    struct TemplateInfo {
        String   title;              /*! Title of example */
        FileDesc fileList[];         /*! List of files along with properties 
                                      * for example
                                      */
        String   description;        /*! Description of example */
        String   target;             /*! RTSC target */
        String   platform;           /*! RTSC platform */
        String   buildProfile;       /*! RTSC build profile */
        String   linkerCommandFile;  /*! Linker command file for the example */
        String   requiredProducts[]; /*! List of products required to build
                                      *  this example
                                      */
        String   groups[];           /*! Array of group ids */ 
        Bool     legacyTcf;          
        Bool     configOnly;         /*! Indicates whether only a RTSC
                                      *  configuration project should
                                      *  be created for this example.
                                      */
        Bool     isHybrid;           /*! Indicates whether application and
                                      * configuration content exists in
                                      * one project
                                      */ 
        Filter   filterArr[];        /*! Array of filters for example */
    };


    /*!
     *  ======== TemplateGroup ========
     *  TemplateGroup structure
     *
     *  This structure maybe used to define a hierarchy of examples
     *  for the product. Examples maybe logically organized into groups 
     *  with an unique `id` and may specify membership of other groups  
     *  by referring to their ids in the `groups` array. In this manner 
     *  the example producer can define a tree topology of examples for 
     *  their product.  Once the template groups are defined the  
     *  individual examples may specify their membership of a template 
     *  group in the `groups` array of {@link #TemplateInfo}. The example
     *  provider may specify all the defined groups for their product in 
     *  {@link #templateGroupArr}.
     *
     *  @field(id) Unique id for the template group
     *  @field(name) Name of the group
     *  @field(description) Description of the group
     *  @field(groups) Array of group ids used to specify
     *                 membership of other groups.
     * 
     */ 

   struct TemplateGroup {
        String id;
        String name;
        String description;
        String groups[];
   }; 

    
    /*!
     *  ======== templateArr ========
     *  Examples contained in the product
     *
     */ 
    config TemplateInfo templateArr[];


    /*!
     *  ======== templateGroupArr ========
     *  Array fo template group ids
     *
     *  This maybe optionally specified by example providers who want to
     *  organize their examples in groups. 
     */

    config TemplateGroup templateGroupArr[] = [];

}
/*
 *  @(#) xdc.tools.product; 1, 0, 0,40; 10-15-2010 11:41:34; /db/ztree/library/trees/xdctools/xdctools-d45x/src/
 */

