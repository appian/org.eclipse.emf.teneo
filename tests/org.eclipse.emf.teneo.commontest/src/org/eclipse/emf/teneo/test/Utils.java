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
 * $Id: Utils.java,v 1.3 2007/02/01 12:35:37 mtaal Exp $
 */

package org.eclipse.emf.teneo.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import org.eclipse.emf.teneo.samples.SamplesSource;

/**
 * Contains utility methods for testing.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $ $Date: 2007/02/01 12:35:37 $
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

	// /**
	// * Returns an array of test properties for one or more databases.
	// */
	// public static Properties[] getAllTestProperties()
	// {
	// // read all the testproperties
	// final Properties props = new Properties();
	// try
	// {
	// final InputStream is = Utils.class.getResourceAsStream("/test.properties");
	// props.load(is);
	// is.close();
	// }
	// catch (Exception e)
	// {
	// throw new StoreTestException("Exception when loading properties file test.properties", e);
	// }
	//		
	// return hiearchizeProps(props);
	// }

	public static Map hiearchizeProps(final Properties props) {
		Map hProps = new HashMap();
		for (Iterator i = props.keySet().iterator(); i.hasNext();) {
			String propName = (String) i.next();
			int delimitAt = propName.indexOf('.');
			String propPrefix = (delimitAt < 0) ? propName : propName.substring(0, delimitAt);
			String propSuffix = (delimitAt < 0) ? "." : propName.substring(delimitAt + 1);

			Properties subProps = (Properties) hProps.get(propPrefix);
			if (subProps == null) {
				subProps = new Properties();
				hProps.put(propPrefix, subProps);
			}
			subProps.put(propSuffix, props.getProperty(propName));
		}
		return hProps;
	}

	/**
	 * Returns the directory which contains the sources which are to be parsed.
	 */
	public static String getStartSource(String packageName) {
		try {
			return SamplesSource.getSourceDirectory(packageName).getAbsolutePath();
		} catch (FileNotFoundException e) {
			throw new StoreTestException("Cannot find source folder for package " + packageName, e);
		}
	}

	/**
	 * Returns the outputdirectory
	 */
	public static String getOutputDirectory() {
		// this file is now in test/src/org/elver/store/test/Utils.class
		File file = new File(Utils.class.getResource('/' + Utils.class.getName().replace('.', '/') + ".class").getFile());

		// now go up 5 directories:
		// Utils test store elver org bin
		return file.getParentFile().getParentFile().getParentFile().getParentFile().getParentFile().getAbsolutePath();
	}

	/**
	 * Returns the outputlocation of the package of the passed class
	 */
	public static String getOutputDirectory(String className) {
		// this file is now in test/src/org/elver/store/test/Utils.class
		File file = new File(Utils.class.getResource('/' + Utils.class.getName().replace('.', '/') + ".class").getFile());

		// now go up 5 directories:
		// Utils test store elver org bin
		file = file.getParentFile().getParentFile().getParentFile().getParentFile().getParentFile();

		// now go down again to the package
		String path = className.replace('.', File.separatorChar);
		path = path.substring(0, path.lastIndexOf(File.separatorChar));

		file = new File(file, path);

		if (!file.exists()) {
			throw new StoreTestException("Directory " + file.getAbsolutePath() + " within test directory does not exist. Tried path: "
					+ file.getAbsolutePath());
		}
		return file.getAbsolutePath();
	}

	/** Copies a file */
	public static void copyFile(File src, File dst) throws IOException {
		InputStream in = new FileInputStream(src);
		OutputStream out = new FileOutputStream(dst);

		// Transfer bytes from in to out
		byte[] buf = new byte[1024];
		int len;
		while ((len = in.read(buf)) > 0) {
			out.write(buf, 0, len);
		}
		in.close();
		out.close();
	}
	
	/** Returns the output location of the passed class, only supports directories (no jars!) */
	public static File getClassParentDirectory(Class cls) {
		final ClassLoader clsl = cls.getClassLoader();
		final String clsFile = cls.getName ().replace ('.', '/').concat (".class");
		final URL url = clsl != null ? clsl.getResource(clsFile) :
			ClassLoader.getSystemResource(clsFile);
		final File file = new File(url.getFile());
		return file.getParentFile();
	}
}
