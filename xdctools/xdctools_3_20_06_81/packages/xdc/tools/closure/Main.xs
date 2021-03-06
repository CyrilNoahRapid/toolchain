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

/*
 *  ======== Main.xs ========
 */

/* verbose flag */
var vfl = false;

/*
 *  ======== run ========
 */
function run(cmdr, args)
{
    if (args.length < 1) {
        cmdr.usage("Error: package base directory must be supplied");
    }
    else if (args.length > 1) {
        cmdr.usage("Warning: only one argument is needed, all additional"
            + " arguments are ignored");
    }

    /* pkgDir is the name of the config directory passed on the command line */
    var pkgDir = new java.io.File(args[0]);
    if (!pkgDir.exists()) {
        print("Error: The directory " + args[0] + " cannot be found!");
        return (1);
    }
    if (!pkgDir.isDirectory()) {
        print("Error: The file " + args[0] + " is not a directory!");
        return (2);
    }

    if (this.verboseFlag) {
        vfl = true;
    }

    var configPkgPath = (pkgDir.getCanonicalPath() + "").replace(/\\/g, "/");

    var bldxml = _openXML(configPkgPath + "/package/package.bld.xml");
    if (bldxml == null) {
        print("Error: The directory " + configPkgPath + " does not contain "
            + "a program configuration!");
        return (3);
    }
    var program = bldxml.executables.executable[0].@pname + "";
    var programProfile = bldxml.executables.executable[0].@profile + "";
    var trd = bldxml.targets.target[0].@rootDir + "";
    var targetName = bldxml.targets.target[0].@name + "";
    var targetRootDir = null;
    if (trd != "") {
        targetRootDir = java.io.File(trd).getCanonicalPath() + "";
    }
    if (vfl) {
        print("Reading " + configPkgPath + "/package/package.bld.xml");
        print("Executable: " + program);
        print("Profile: " + programProfile);
        print("Target: " + targetName);
        print("Compiler: " + targetRootDir);
    }

    var cfgxml = _openXML(configPkgPath + "/package/cfg/"
        + program.replace(/\./, "_") + ".cfg.xml");
    if (cfgxml == null) {
        print("Error: The configuration for the executable " + program
            + " cannot be found!");
        return (4);
    }

    /* configPkgName could be also extracted from the 'pkgDir' parameter
     * passed on the command line, but since we are already opening cfg.xml,
     * we get it form there because we know the exact format of @name.
     */
    var configPkgName = cfgxml.@name.substr(0, cfgxml.@name.indexOf("/"));
    if (vfl) {
        print("Reading " + configPkgPath + "/package/cfg/"
            + program.replace(/\./, "_") + ".cfg.xml");
    }

    var counter = 0;
    var pkgName = [];
    var pkgBase = [];
    var uniqReps = {};

    /* exeDir is the directory above configPkg, where the application is
     * located.
     */
    var exeDir = "";
    for each (item in cfgxml.imports["package"]) {
        pkgName[counter] = item.@name + "";
        pkgBase[counter] = (item.@repository + "").replace(/\\/g, "/");
        if (!(pkgBase[counter] in uniqReps)) {
            uniqReps[pkgBase[counter]] = 1;
        }
        counter++;
        if (configPkgName == item.@name) {
            exeDir = (item.@repository + "").replace(/\\/g, "/");
        }
    }

    /* We need target packages for their header files, and we need to add
     * additional packages passed using '-i' option.
     */
    for each (item in cfgxml.targets["target"]) {
        this.includes[this.includes.length++] =
            (item.@name.substring(0, item.@name.lastIndexOf('.')) + "");
    }

    var pathTool = xdc.module("xdc.tools.path.Main");
    for each (var p in this.includes) {
        pkgName[counter] = p;

        if (pkgName[counter] == pkgName[counter - 1]) {
            continue;
        }
        var packageFound = false;
        var repString = "";
        for (var rep in uniqReps) {
            repString += rep + ";";
            var res = pathTool.exec(
                ["-a", "-P", rep + pkgName[counter].replace(/\./g, '/')]);
            if (res.length != 0) {
                pkgBase[counter] = rep.replace(/\\/g, "/");
                packageFound = true;
                break;
            }
        }
        if (!packageFound) {
            // replace ';' with '.'
            repString = repString.substring(0, repString.length - 1) + ".";
            
            print("Warning: Cannot find the included package '" + p
                + "' along the path: " + repString);
            continue;
        }
        counter++;
    }

    /* The default location for the bundle is alongside configPkg, in the same
     * directory where the application is originally built.
     */
    var newRep = java.io.File(program.replace(/\./, "_") + "_rep");
    if (this.destination != "") {
        newRep = java.io.File(this.destination);
    }
    var newRepName = newRep.toString() + "";

    if (newRep.exists()) {
        if (!newRep.isDirectory()) {
            print("Error: File " + newRepName + " already exists!");
            return(5);
        }
        else if (!newRep["delete"]()) {
            print("Error: The repository " + newRepName + " already exists,"
                + " and it is not empty!");
            return(6);
        }
        else {
            newRep.mkdir();
        }
    }
    else {
        newRep.mkdir();
    }

    var newRepName = (newRep.getCanonicalPath() + "").replace(/\\/g, "/");
    if (vfl) {
        print("Bundle repository: " + newRepName);
    }

    var nl = "";

    if (!vfl) {
        java.lang.System.out.print("Copying ");
        nl = "\n"
    }

    var repoman = xdc.module("xdc.tools.repoman.Main");
    for (var i = 0; i < counter; i++) {
        if (vfl) {
            print("Copying '" + pkgName[i] + "' from " + pkgBase[i] + " to "
                + newRepName);
        }
        else {
            java.lang.System.out.print(".");
        }

        var remoteRep = new java.io.File(pkgBase[i]);
        if (remoteRep.exists()) {
            if (newRepName == remoteRep.getCanonicalPath() + "") {
                print(nl + "Warning: The package '" + pkgName[i] + "' is "
                    + "already in " + newRepName);
            }
            else {
                repoman.exec(["-c", "-r" + newRepName, "-p", pkgBase[i],
                    pkgName[i]]);
            }
        }
        else {
            print(nl + "Error: Repository " + pkgBase[i] + " cannot be found!");
            return(7);
        }
    }
    print();

    /* Replace all includes in compiler.opt with one newRep include, and
     * one include pointing to a level above configPkg.
     */
    var compOptFile = configPkgPath + "/compiler.opt";
    if (_replaceComp(compOptFile, newRepName + "/compiler.opt", exeDir)
        == false) {
        print("Error: The file " + compOptFile + " cannot be found!");
        return(8);
    }

    var linkCmdFile = configPkgPath + "/linker.cmd";

    /* We keep the list of libraries found in the linker command files to
     * use them as a filter for removing unnecessary libraries.
     */
    var libs = _replaceLink(linkCmdFile, newRepName + "/linker.cmd", uniqReps,
        exeDir);
    if (libs.length == 0) {
        /* no required libraries in the bundle */
    }
    else if (libs == false) {
        print("Error: The file " + linkCmdFile + " cannot be found!");
        return(9);
    }

    if (targetName.search("ti.targets") == 0
        && programProfile.search("whole_program") == 0) {
        if (vfl) {
            print("Special case: TI target and the whole_program profile");
        }
        var xdlFile = configPkgPath + "/package/cfg/"
            + program.replace(/\./, "_") + "_x.xdl";
        var newXdlFile = newRepName + "/" + configPkgName + "/package/cfg/"
            + program.replace(/\./, "_") + "_x.xdl";
        var xlibs = _replaceLink(xdlFile, newXdlFile, uniqReps, exeDir);
        if (xlibs == false) {
            print("Error: The file " + xdlFile + " cannot be found!");
            return(10);
        }
        libs = libs.concat(xlibs);
    }

    libs.sort();
    var libsSave = [];
    libsSave = libsSave.concat(libs);
    if (vfl) {
        print("Required libraries");
    }
    for (var i = 0; i < libs.length; i++) {
        if (vfl) {
            print(i + ". " + libs[i]);
        }
    }

    /* Filtering out files */
    if (!vfl) {
        java.lang.System.out.print("Filtering libraries ");
    }

    /* This loop removes the libraries that are not being referenced by the
     * linker command files. This is not aggressive filtering, the aggressive
     * filtering is removing everything except referenced libraries.
     */ 
    for (var i = 0; i < pkgName.length; i++) {
        var newBaseDir = newRepName + "/" + pkgName[i].replace(/\./g, "/");
        var f = newBaseDir + "/package/package.bld.xml";

        if (vfl) {
            print("Filtering libraries from " + newBaseDir);
        }
        else {
            java.lang.System.out.print(".");
        }

        var pkgXml = _openXML(f);
        if (pkgXml == null) {
            if (vfl) {
                print("Cannot find " + f);
            }
            continue;
        }
        for each (item in pkgXml.libraries["library"]) {
            var libRelName = pkgName[i].replace(/\./g, "/") + "/" + item.@pname;
            var libFullName = newRepName + "/" + libRelName;
            /* Find (efficiently!?) if libRelName shows up in libs, otherwise
             * find its java.io.File representation and remove it.
             */
            if (libs.length == 0) {
                java.io.File(libFullName)["delete"]();
                java.io.File(libFullName + ".mak")["delete"]();
            }

            for (var j = 0; j < libs.length; j++) {
                if (libs[j] == libRelName) {
                    libs.splice(j, 1);
                    java.io.File(libFullName + ".mak")["delete"]();
                    break;
                }
                /* We passed the point where 'libRelName' would be if it were
                 * in the list of the required libraries, or we reached the
                 * last required library, and haven't found 'libRelName'
                 * among them.
                 */
                else if (libs[j] > libRelName || j == libs.length - 1) {
                    java.io.File(libFullName)["delete"]();
                    java.io.File(libFullName + ".mak")["delete"]();
                    break;
                }
            }
        }
    }

    libs = libsSave;
    for (var i = 0; i < libs.length; i++) {
        if (vfl) {
            print(i + ". " + libs[i]);
        }
    }
    
    for (var i = 0; i < pkgName.length; i++) {
        var newBaseDir = newRepName + "/" + pkgName[i].replace(/\./g, "/");
        var pkgLibDir = java.io.File(newBaseDir + "/package/lib");
        /* The object files in /package/lib directory are not needed anymore,
         * so we remove them too even if the aggressive filtering flag is not
         * set.
         */
        if (pkgLibDir.exists()) {
            _deleteDir(pkgLibDir);
        }
        /* This is the only place where we use this.aggFilter. */
        _deleteMisc(java.io.File(newBaseDir), this.aggFilter, newRepName, libs);
    }
    print();
    return (0);
}

/*
 *  ======== _deleteDir ========
 */
function _deleteDir(dir) {
    var files = dir.list();
    for (var i = 0; i < files.length; i++) {
        var f = java.io.File(dir, files[i]);
        if (f.isDirectory()) {
            _deleteDir(f);
        }
        else {
            f["delete"]();
        }
    }
    dir["delete"]();
}

/*
 *  ======== _deleteMisc ========
 *  @param(dir)         directory whose content is filtered
 *  @param(agg)         aggressive filtering flag; it determines if we
 *                      remove files of unknown extensions
 *  @param(base)        repository path; used to determine the file path
 *                      relative to the repository
 *  @param(libs)        array of required libraries
 */
function _deleteMisc(dir, agg, base, libs) {
    if (agg && vfl) {
        print("Filtering " + dir.toString());
    }
    var files = dir.list();
    for (var i = 0; i < files.length; i++) {
        var f = java.io.File(dir, files[i]);
        if (f.isDirectory()) {
            _deleteMisc(f, agg, base, libs);
        }
        else if (files[i].match(/.*(\.java|\.class|\.jar|\.xml|\.ccs|\.sch)$/)
            || files[i].match(/.*(\.pdf|\.c|\.opt|\.pobj|\.html)$/)) {
            f["delete"]();
        }
        else if (agg) {
            if (!files[i].match(/.*\.h$/)) {
                var neededLib = false;
                var relFile = (f.toString() + "").replace(/\\/g, "/");
                relFile = relFile.replace(base + "/", "");
                for (var j = 0; j < libs.length; j++) {
                    if (libs[j] == relFile) {
                        neededLib = true;
                        break;
                    }
                }
                if (!neededLib) {
                    f["delete"]();
                }
            }
        }
    }
}

/*
 *  ======== _replaceComp ========
 *  @param(of)          name of the original file
 *  @param(nf)          new copy of the file
 *  @param(exePath)     path to the directory containing the config package, we
 *                      need to remove that string from all references to
 *                      end up with only relative paths starting with the
 *                      name of the config package.
 */
function _replaceComp(of, nf, exePath)
{

    if (vfl) {
        print(of + " processed and copied to " + nf);
    }
    var File = xdc.module('xdc.services.io.File');
    var oldFile = File.open(of, "r");
    if (oldFile == null) {
        return (false);
    }
    var newFile = File.open(nf, "w");
    var line;
    while ((line = oldFile.readLine()) != null) {
        var newLine = line;

        /* Replace the absolute path to the config directory with only the
         * name of the config directory.
         */
        if (exePath != "") {
            regexp = new RegExp(exePath, "gi");
            newLine = newLine.replace(regexp, "");

            exePathInv = exePath.replace(/\//g, "\\\\");
            regexp = new RegExp(exePathInv, "gi");
            newLine = newLine.replace(regexp, "");
        }

        /* We are removing all -I options because all copied header files will
         * be rooted in the top directory of the new bundle directory, so
         * the user only has to specify -I<bundle_dir> in his makefile. At
         * this time we don't even know that <bundle_dir> because the whole
         * bundle can be moved to any new directory or even a new host.
         */        
        newLine = newLine.replace(/-I"[^"]*"/g, "");
        newLine = newLine.replace(/-I\S+/g, "");

        newFile.writeLine(newLine);
    }
    newFile.close();
    oldFile.close();

    return (true);
}

/*
 *  ======== _replaceLink ========
 *  @param(of)          name of the original file
 *  @param(nf)          new copy of the file
 *  @param(reps)        list of all repositories
 *  @param(exePath)     path to the directory containing the config package, we
 *                      need to remove that string from all references to
 *                      end up with only relative paths starting with the
 *                      name of the config package.
 */
function _replaceLink(of, nf, reps, exePath)
{
    var counter = 0;
    var lib = [];
    var File = xdc.module('xdc.services.io.File');
    var oldFile = File.open(of, "r");
    if (oldFile == null) {
        return (false);
    }

    var newFile = File.open(nf, "w");

    var inputFlag = false;
    var line;
    while ((line = oldFile.readLine()) != null) {
        var newLine = line;

        /* Replace the absolute path to the config directory with only the
         * name of the config directory. This has to be done first in the
         * case one of the repositories is a substring of the config
         * directory path. If that substring is replaced first, the resulting
         * string points to a nonexisting directory and exePath replacement
         * never happens
         */
        if (exePath != "") {
            regexp = new RegExp(exePath, "gi");
            newLine = newLine.replace(regexp, "");

            exePathInv = exePath.replace(/\//g, "\\\\");
            regexp = new RegExp(exePathInv, "gi");
            newLine = newLine.replace(regexp, "");
        }

        for (var prop in reps) {
            if (prop[prop.length - 1] != '/') {
                prop = prop + "/";
            }
            var regexp = new RegExp(prop, "gi");
            newLine = newLine.replace(regexp, "");

            prop = prop.replace(/\//g, "\\\\");
            regexp = new RegExp(prop);
            newLine = newLine.replace(regexp, "");
        }

        /* We are assuming that if we find something in quotes, it's the name
         * of a library, an object file, or a linker command file. That works
         * for TI targets and some GNU targets. For GNU targets, we can also
         * look for 'INPUT(' and the ')' to determine the strings that
         * represent libraries.
         */
        if (inputFlag && newLine.match(/\)/)) {
            inputFlag = false;
        }
        var wholeMatch = newLine.match(/"([^"]*)"/);
        /* We use inputFlag here as a flag for "not TI target"). */
        if (wholeMatch && !inputFlag) {
            lib[counter++] = wholeMatch[1].replace(/\\/g, "/");
            if (newLine.substring(0, 2) != "-l") {
                newLine = "-l" + newLine;
            }
        }
        if (inputFlag) {
            if (!wholeMatch) {
                lib[counter++] = newLine.match(/\S+/)[0].replace(/\\/g, "/");
            }
            else {
                lib[counter++] = wholeMatch[1].replace(/\\/g, "/");
            }
        }
        if (newLine.match(/INPUT/)) {
            inputFlag = true;
        }

        newFile.writeLine(newLine);
    }
    newFile.close();
    oldFile.close();

    if (vfl) {
        print(of + " processed and copied to " + nf);
    }

    return (lib);
}

/*
 *  ======== _backup ========
 */
function _backup(oldName, newName)
{
    var o = new java.io.File(oldName);
    var n = new java.io.File(newName);
    if (o.exists() && !n.exists()) {
        return (o.renameTo(n));
    }
    else {
        return (false);
    }
}

/*
 *  ======== _openXML ========
 */
function _openXML(fileName)
{
    var f = new java.io.File(fileName);
    if (!f.exists()) {
        return (null);
    }
    return (xdc.loadXML(fileName));
}

/*
 *  @(#) xdc.tools.closure; 1, 0, 0, 0,92; 10-15-2010 11:40:04; /db/ztree/library/trees/xdctools/xdctools-d45x/src/
 */

