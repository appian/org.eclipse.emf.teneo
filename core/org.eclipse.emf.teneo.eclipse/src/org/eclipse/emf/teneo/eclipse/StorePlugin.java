/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: StorePlugin.java,v 1.4 2008/02/28 07:07:29 mtaal Exp $
 */

package org.eclipse.emf.teneo.eclipse;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The main plugin class which is used for all plugins of elver.
 */
public class StorePlugin extends AbstractUIPlugin {

	// The shared instance.
	private static StorePlugin plugin;

	/**
	 * The constructor.
	 */
	public StorePlugin() {
		plugin = this;
	}

	/**
	 * This method is called upon plug-in activation
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);

// See bugzilla 207170
//		
// Properties props = new Properties();
// try
// {
// props.load(StorePlugin.class.getResourceAsStream("log4j.properties"));
// }
// catch (IOException e)
// {
// throw new StoreEclipseException("Exception when reading log4j props", e);
// }
//		
// // place the log file in the allowed location
// final File file = getStateLocation().makeAbsolute().toFile();
// props.setProperty("log4j.appender.A1.File", file.getAbsolutePath() +
// File.separator + props.getProperty("log4j.appender.A1.File"));
//		
// PropertyConfigurator.configure(props);
	}

	/**
	 * This method is called when the plug-in is stopped
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
		plugin = null;
	}

	/**
	 * Returns the shared instance.
	 */
	public static StorePlugin getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in relative path.
	 * 
	 * @param path
	 *            the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return AbstractUIPlugin.imageDescriptorFromPlugin("org.eclipse.emf.teneo.hibernate.eclipse", path);
	}
}
