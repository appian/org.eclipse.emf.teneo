/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: Utils.java,v 1.3 2006/08/03 09:58:22 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Properties;

import org.eclipse.emf.teneo.test.StoreTestException;

/**
 * Contains utility methods for testing.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $ $Date: 2006/08/03 09:58:22 $
 */

public class Utils {
	/** The propertyname used to specify which database to use */
	public static String DATABASE_PROP_NAME = "database";

	/**
	 * Returns test properties.
	 */
	public static Properties getTestProperties() {
		// set the log4j properties
		// PropertyConfigurator.configure(Utils.class.getResource("log4j.properties"));

		final Properties props = new Properties();
		try {
			final InputStream is = Utils.class.getResourceAsStream("test.properties");
			props.load(is);
			is.close();
		} catch (Exception e) {
			throw new StoreTestException("Exception when loading properties file test.properties", e);
		}
		return props;
	}

	/**
	 * Returns an array of test properties for one or more databases.
	 */
	public static Properties[] getAllTestProperties() {
		// read all the testproperties
		final Properties props = new Properties();
		try {
			final InputStream is = Utils.class.getResourceAsStream("test.properties");
			props.load(is);
			is.close();
		} catch (Exception e) {
			throw new StoreTestException("Exception when loading properties file test.properties", e);
		}

		// read the database property to get the list
		final String[] dbs = props.getProperty(DATABASE_PROP_NAME).split(",");
		final Properties[] result = new Properties[dbs.length];

		// for each database fill a Properties object
		for (int i = 0; i < dbs.length; i++) {
			final String filter = dbs[i].trim();
			final Iterator it = props.keySet().iterator();
			result[i] = new Properties();
			while (it.hasNext()) {
				final String key = (String) it.next();
				if (key.startsWith(filter)) {
					final String newkey = key.substring(filter.length() + 1);
					// added trim() to cover small typing errors
					result[i].setProperty(newkey, props.getProperty(key).trim());
				} else if (key.indexOf('.') == -1) // keys without a filter
				{
					// added trim() to cover small typing errors
					result[i].setProperty(key, props.getProperty(key).trim());
				}
			}
			result[i].setProperty(DATABASE_PROP_NAME, filter);
		}
		return result;
	}

	/**
	 * Returns the directory which contains the sources which are to be parsed.
	 */
	public static String getStartSource(String packageName) {
		// this file is now in test/src/org/elver/store/test/Utils.class
		File file = new File(Utils.class.getResource('/' + Utils.class.getName().replace('.', '/') + ".class")
				.getFile());

		// now go up 5 directories:
		// Utils test store elver org bin root
		file = file.getParentFile().getParentFile().getParentFile().getParentFile().getParentFile().getParentFile();
		file = new File(file, "test");
		file = new File(file, "src");

		// now go down again to the package
		String path = packageName.replace('.', File.separatorChar);
		path = path.substring(0, path.lastIndexOf(File.separatorChar));

		file = new File(file, path);

		if (!file.exists()) {
			throw new StoreTestException("Directory " + file.getAbsolutePath()
					+ " within test directory does not exist. Tried path: " + file.getAbsolutePath());
		}
		return file.getAbsolutePath();
	}

	/**
	 * Returns the outputdirectory
	 */
	public static String getOutputDirectory() {
		// this file is now in test/src/org/elver/store/test/Utils.class
		File file = new File(Utils.class.getResource('/' + Utils.class.getName().replace('.', '/') + ".class")
				.getFile());

		// now go up 5 directories:
		// Utils test store elver org bin
		return file.getParentFile().getParentFile().getParentFile().getParentFile().getParentFile().getAbsolutePath();
	}

	/**
	 * Returns the outputlocation of the package of the passed class
	 */
	public static String getOutputDirectory(String className) {
		// this file is now in test/src/org/elver/store/test/Utils.class
		File file = new File(Utils.class.getResource('/' + Utils.class.getName().replace('.', '/') + ".class")
				.getFile());

		// now go up 5 directories:
		// Utils test store elver org bin
		file = file.getParentFile().getParentFile().getParentFile().getParentFile().getParentFile();

		// now go down again to the package
		String path = className.replace('.', File.separatorChar);
		path = path.substring(0, path.lastIndexOf(File.separatorChar));

		file = new File(file, path);

		if (!file.exists()) {
			throw new StoreTestException("Directory " + file.getAbsolutePath()
					+ " within test directory does not exist. Tried path: " + file.getAbsolutePath());
		}
		return file.getAbsolutePath();
	}
}
