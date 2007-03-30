/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: TestPluginRegistry.java,v 1.1.2.1 2007/03/30 15:38:40 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import javax.jdo.JDOFatalException;

import org.eclipse.emf.teneo.test.StoreTestException;
import org.jpox.ClassLoaderResolver;
import org.jpox.plugin.NonManagedPluginRegistry;

/**
 * Simple registry which only reads the plugin.xml from the jpox jars. Makes tests much faster.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1.2.1 $ $Date: 2007/03/30 15:38:40 $
 */

public class TestPluginRegistry extends NonManagedPluginRegistry {

    /** directories that are searched for plugin files **/
    // use trailing slash!
    private static final String[] PLUGIN_DIRS = {"/", "/META-INF/plugins/"};

    /** names of additional plugin files have to match this regular expression **/
    private static final String PLUGIN_FILE_REGEX = "plugin(.+)\\.xml$";

    /** ClassLoaderResolver corresponding to the PMF **/
    private final ClassLoaderResolver clr;

    /**
     * Constructor
     * @param clr the ClassLoaderResolver
     */
    public TestPluginRegistry(ClassLoaderResolver clr)
    {
    	super(clr);
        this.clr = clr;
    }

    /**
     * Register ExtensionPoints and Extensions declared in plugin files
     */
    public void registerExtensions()
    {
        //use a set to remove any duplicates
        Set set = new HashSet();

        try
        {
            for (int i = 0; i < PLUGIN_DIRS.length; i++)
            {
                // First add all plugin.xml...
                Enumeration paths = clr.getResources(PLUGIN_DIRS[i] + "plugin.xml",null);
                while (paths.hasMoreElements())
                {
                    set.add(paths.nextElement());
                }
                // ...then search for plugins with more complicated 
                // file names in the same directory
                //findAdditionalPluginFiles(set, clr.getResources(PLUGIN_DIRS[i],null));
            }
        }
        catch (IOException e)
        { //TODO: Localisation?
            throw new JDOFatalException("Error loading resource", e);
        }

        //parse the files (Extensions are automatically added to ExtensionPoint)
        Iterator it = set.iterator();
        while (it.hasNext())
        {
            URL plugin = (URL) it.next();
            registerExtensionPoints(plugin);
        }

        it = set.iterator();
        while (it.hasNext())
        {
            URL plugin = (URL) it.next();
            registerExtensions(plugin);
        }
    }

}
