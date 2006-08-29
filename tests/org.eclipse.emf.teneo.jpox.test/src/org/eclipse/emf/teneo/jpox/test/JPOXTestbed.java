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
 * $Id: JPOXTestbed.java,v 1.9 2006/08/29 09:34:22 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.annotations.pannotation.InheritanceType;
import org.eclipse.emf.teneo.jpox.emf.JpoxHelper;
import org.eclipse.emf.teneo.jpox.test.stores.JPOXTestStoreFactory;
import org.eclipse.emf.teneo.test.AbstractTest;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.conf.TestConfiguration;
import org.eclipse.emf.teneo.test.conf.Testbed;
import org.eclipse.emf.teneo.test.stores.TestStore;
import org.eclipse.emf.teneo.util.StoreUtil;
import org.jpox.enhancer.JPOXEnhancer;

/**
 * The jpox test bed controls the creation of the store and the generation of the mapping file.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.9 $
 */
public class JPOXTestbed extends Testbed {
	
	/** The logger for this class */
	private static Log log = LogFactory.getLog(JPOXTestbed.class);

	/** If we get here then this should be the testbed! */
	static {
		Testbed.setTestBed(new JPOXTestbed());
	}

	/** Delegates to the test bed */
	public static Testbed instance() {
		return Testbed.instance();
	}

	/** The logger */
//	private static Log log = LogFactory.getLog(JPOXTestbed.class);

	/**
	 * The directory in which the mapping files are generated TODO make insesitive to user.dir
	 */
	private static String RUN_BASE_DIR = System.getProperty("user.dir") + File.separatorChar + "run";

	/** The factory responsible for creating a store */
	private JPOXTestStoreFactory storeFactory;

	/** Constructor */
	private JPOXTestbed() {
		storeFactory = new JPOXTestStoreFactory();
	}

	/** Generate the mapping file for the test case */
	public void doMapping(AbstractTest testCase) {
		File mappingFile = getMappingFile(testCase, getActiveConfiguration());
		generateMappingFile(testCase, mappingFile, getActiveConfiguration().isOptimistic(), getActiveConfiguration()
				.getMappingStrategy());
	}

	/**
	 * Request a store for the given configuration.
	 */
	public TestStore createStore(AbstractTest testCase) {
		try {
			File mappingFile = getMappingFile(testCase, getActiveConfiguration());
			//copyMappingToClassesDir(testCase, mappingFile, getActiveConfiguration().isOptimistic());

			final TestStore store = storeFactory.get(getDbName(testCase, getActiveConfiguration()), testCase
					.getEPackages(), mappingFile, getActiveConfiguration(), testCase.getExtraConfigurationProperties());

			// setup store
			getActiveConfiguration().getDbAdapter().setDbName(getDbName(testCase, getActiveConfiguration()));
			store.setUp();

			return store;
		} catch (FileNotFoundException e) {
			throw new StoreTestException("Exception while getting hbm file", e);
		}
	}

	/**
	 * Creates a file with the extension based on the type of inheritance mapping strategy
	 */
	protected File getMappingFile(AbstractTest testCase, TestConfiguration cfg) {
		return new File(getRunTestDir(testCase, cfg), "package.jdo");
	}

	/** Returns the directory in which to put the generated mapping files */
	protected File getRunTestDir(AbstractTest testCase, TestConfiguration cfg) {
		File dir = new File(new File(RUN_BASE_DIR, testCase.getName()), cfg.getName());
		dir.mkdirs();
		return dir;
	}

	/**
	 * Generates the mapping file by calling the superclass and then enhances the compiled classes
	 */
	protected void generateMappingFile(AbstractTest test, File mappingFile, boolean optimistic,
			InheritanceType inheritanceType) {
		if (test.getEPackages() == null)
			return; // only support tests with epackages

		try {
			if (mappingFile.exists()) {
				mappingFile.delete();
			}
			mappingFile.createNewFile();

			final FileWriter fileWriter = new FileWriter(mappingFile);

			final Properties options = new Properties();
			if (optimistic) {
				options.put(PersistenceOptions.OPTIMISTIC, "true");
			} else {
				options.put(PersistenceOptions.OPTIMISTIC, "false");
			}

			options.put(PersistenceOptions.INHERITANCE_MAPPING, inheritanceType.getName());
			fileWriter.write(JpoxHelper.INSTANCE.generateMapping(test.getEPackages(), options));
			fileWriter.close();
		} catch (Exception e) {
			throw new StoreTestException("Exception while creating package.jdo file", e);
		}

		// enhance the classes!
		// use the resource path
		// for the enhancement a copy has to be made to a filename with a jdo as
		// the extension,
		// otherwise the jpox enhancement fails! When enhancing a subclass B it
		// will not the package.JPOX
		// for superclass A because it will always search for package.jdo
		try {
			File destination = copyMappingToClassesDir(test, mappingFile, optimistic);
			log.debug("JDO FILE: " + destination.getAbsolutePath());
			JPOXEnhancer.main(new String[] { destination.getAbsolutePath(), "-v" });
		} catch (Exception e) {
			throw new StoreTestException("Exception while enhancing", e);
		}
	}

	/** Copies the mapping file to the bin directory */
	private File copyMappingToClassesDir(AbstractTest test, File mappingFile, boolean optimistic) {
		try {
			final File destination;
			// the package.jdo is copied to the root of the classes dir to
			// ensure that it is also
			// found when a test case contains multiple packages
			final Class packageClass = test.getEPackages()[0].getClass();
			
			// get the location of the class file
			
			destination = new File(Utils.getParentDirThreeLevels(packageClass), "package.jdo");

			if (destination.exists())
				destination.delete();

			StoreUtil.copyFile(mappingFile, destination);
			return destination;
		} catch (Exception e) {
			throw new StoreTestException("Exception while enhancing", e);
		}
	}
}