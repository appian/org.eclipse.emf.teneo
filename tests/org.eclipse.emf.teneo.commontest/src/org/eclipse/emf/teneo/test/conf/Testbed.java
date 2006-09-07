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
 *   Davide Marchignoli
 * </copyright>
 *
 * $Id: Testbed.java,v 1.5 2006/09/07 07:51:51 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.conf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.samples.SamplesSource;
import org.eclipse.emf.teneo.test.AbstractTest;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.Utils;
import org.eclipse.emf.teneo.test.stores.TestDBAdapters;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * The test bed encapsulates the environment of a test action. It has 2 functions: 1) to encapsulate the possible
 * configurations/dbadapters, and 2) to keep the current running configuration.
 * 
 * @author Davide Marchignoli
 * @author Martin Taal
 * @version $Revision: 1.5 $
 */
public abstract class Testbed {
	/** The logger */
	private static Log log = LogFactory.getLog(Testbed.class);

	/** The testbed instance */
	private static Testbed testBed = null;

	/** Return an instance of the testbed */
	public static Testbed instance() {
		return testBed;
	}

	/** Set the testbed */
	public static void setTestBed(Testbed setTestBed) {
		testBed = setTestBed;
	}

	/** Default naming of the current properties */
	public static final String DBADAPTERS_PROP_RESOURCE = "/dbadapters.properties";

	public static final String TEST_CFG_PROP_RESOURCE = "/test.properties";

	/** loaded dbAdapters and test configs */
	private TestDBAdapters dbAdapters;

	/** The list of configs (different test settings) which will be run */
	private TestConfigurations testConfigs;

	/** current configuration */
	private TestConfiguration currentCfg;

	/**
	 * Constructor, the constructor assumes that the test and db properties are located in the same location as the non-abstract
	 * subclass
	 */
	protected Testbed() {
		dbAdapters = new TestDBAdapters();
		try {
			dbAdapters.addDBAdapters(this.getClass().getResourceAsStream(DBADAPTERS_PROP_RESOURCE));
			testConfigs = new TestConfigurations(dbAdapters);
			testConfigs.addConfigurations(getClass().getResourceAsStream(TEST_CFG_PROP_RESOURCE));
			currentCfg = (TestConfiguration) testConfigs.getConfigurations().iterator().next();
		} catch (IOException e) {
			throw new StoreTestException("Unable to initialize TestSetting", e);
		}
	}

	/**
	 * Constructor, the constructor assumes that the test and db properties are located in the same location as the non-abstract
	 * subclass
	 */
	protected Testbed(String configPropertiesFile) {
		dbAdapters = new TestDBAdapters();
		try {
			dbAdapters.addDBAdapters(this.getClass().getResourceAsStream(DBADAPTERS_PROP_RESOURCE));
			testConfigs = new TestConfigurations(dbAdapters);
			testConfigs.addConfigurations(getClass().getResourceAsStream(configPropertiesFile));
			currentCfg = (TestConfiguration) testConfigs.getConfigurations().iterator().next();
		} catch (IOException e) {
			throw new StoreTestException("Unable to initialize TestSetting", e);
		}
	}

	/**
	 * Request a store for the given configuration. No other store can be requested until this one is tear down.
	 */
	public abstract TestStore createStore(AbstractTest testCase);

	/** Returns the database name */
	protected String getDbName(AbstractTest testCase, TestConfiguration cfg) {
		// TODO maybe should shorten the name?
		// first try in that direction, the testname is a classname
		final String className = testCase.getName();
		return className.substring(className.lastIndexOf('.') + 1) + "_" + cfg.getName();
	}

	/** Compile the source code */
	protected void doCompile(String[] sourceLocations) {
		// delete old binary files
		// deleteFiles(new File(Utils.getOutputDirectory(this.getClass().getName())));

		// FIXME
		final ArrayList args = new ArrayList();
		args.add("-d");
		args.add(Utils.getOutputDirectory());
		args.add("-classpath");
		args.add(System.getProperty("java.class.path"));
		args.add("-source");
		args.add("1.4");
		args.add("-target");
		args.add("1.4");

		File[] sourceDirs = new File[sourceLocations.length];
		for (int i = 0; i < sourceLocations.length; i++)
			sourceDirs[i] = new File(sourceLocations[i]);
		collectSourceFiles(args, sourceDirs);

		// compile
		log.debug("Re-Compiling......");
		com.sun.tools.javac.Main.compile((String[]) args.toArray(new String[args.size()]));
	}

	/** Returns the sourcelocations for the given epackages */
	protected String[] getSourceLocations(EPackage[] usedEPackages) throws FileNotFoundException {
		String[] sourceLocations;
		sourceLocations = new String[usedEPackages.length];
		for (int i = 0; i < usedEPackages.length; i++)
			sourceLocations[i] = SamplesSource.getSourceDirectory(usedEPackages[i]).getAbsolutePath();
		return sourceLocations;
	}

	/** Collects source files from a certain sourcedirectory and further */
	private void collectSourceFiles(ArrayList sourceFiles, File file) {
		if (file.isDirectory()) {
			collectSourceFiles(sourceFiles, file.listFiles());
		}
		if (file.getName().endsWith(".java")) {
			sourceFiles.add(file.getAbsolutePath());
		}
	}

	/** Collects source files from the given sourcedirectories and further */
	private void collectSourceFiles(ArrayList sourceFiles, File[] dirs) {
		for (int i = 0; i < dirs.length; i++)
			collectSourceFiles(sourceFiles, dirs[i]);
	}

	/** Deletes the current binary files
	private void deleteFiles(File directory) {
		File[] files = directory.listFiles();
		for (int i = 0; i < files.length; i++) {
			if (files[i].isDirectory()) {
				deleteFiles(files[i]);
			}
			if (files[i].getName().endsWith(".class") || files[i].getName().endsWith(".jdo")) files[i].delete();
		}
	}
	*/

	/** Get the current configuration, for which the current test is run */
	public TestConfiguration getActiveConfiguration() {
		return currentCfg;
	}

	/** And set the current configuration */
	public void setActiveConfiguration(TestConfiguration newConfiguration) {
		if (!testConfigs.getConfigurations().contains(newConfiguration))
			throw new IllegalArgumentException("Cannot to switch to not configuration " + newConfiguration);
		this.currentCfg = newConfiguration;
	}

	/** Return the test configurations */
	public TestConfigurations getConfigurations() {
		return testConfigs;
	}

	/** Get the db Adapters */
	public TestDBAdapters getDBAdapters() {
		return dbAdapters;
	}
}