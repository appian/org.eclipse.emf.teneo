/**
 * <copyright> Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * JPOXTestbed.java,v 1.39 2007/03/30 19:50:15 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.annotations.pannotation.InheritanceType;
import org.eclipse.emf.teneo.extension.DefaultExtensionManager;
import org.eclipse.emf.teneo.extension.ExtensionManager;
import org.eclipse.emf.teneo.jpox.JpoxHelper;
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
 * @version $Revision: 1.41 $
 */
public class JPOXTestbed extends Testbed {

	/** The logger */
	private static final Log log = LogFactory.getLog(JPOXTestbed.class);

	/** The logger for this class */
	// private static Log log = LogFactory.getLog(JPOXTestbed.class);
	/** The property file to use */
	private static final String propFileName;

	/** Delegates to the test bed */
	public static Testbed instance() {
		return Testbed.instance();
	}

	/** The logger */
	// private static Log log = LogFactory.getLog(JPOXTestbed.class);
	/** Is set to true if running on the emft server */
	private static boolean runningOnEMFTServer = false;

	/**
	 * The directory in which the mapping files are generated TODO make insesitive to user.dir
	 */
	private static String RUN_BASE_DIR = System.getProperty("user.dir") + File.separatorChar + "jdo";

	/** Test the rundir */
	static {
		try {
			if (RUN_BASE_DIR.indexOf("www-data") != -1) { // UGLY, replace with smarter solution!
				propFileName = "/emft_test.properties";
				runningOnEMFTServer = true;
				log.debug("Path to jdo file directory does not exist: " + RUN_BASE_DIR);
				final File pluginsDir = new File(System.getProperty("user.dir"), "plugins");
				final File pluginDir = Utils.getPluginDir(pluginsDir, "org.eclipse.emf.teneo.jpox.test");
				if (pluginDir != null) {
					RUN_BASE_DIR = pluginDir.getAbsolutePath() + File.separator + "jdo";
				} else {
					// error will be thrown later because class initialization errors are sometimes
					// difficult to find
					log.error("Directory for jdo files does not exist! " + pluginsDir.getAbsolutePath() +
							File.separator + "org.eclipse.emf.teneo.jpox.test....");
				}
			} else {
				propFileName = "/local_test.properties";
			}
			Testbed.setTestBed(new JPOXTestbed());
		} catch (Exception e) {
			throw new StoreTestException("Exception while checking directory " + RUN_BASE_DIR, e);
		}
	}

	/** True if running on emft server */
	public static boolean isRunningOnEMFTServer() {
		return runningOnEMFTServer;
	}

	/** The factory responsible for creating a store */
	private JPOXTestStoreFactory storeFactory;

	/** Constructor */
	private JPOXTestbed() {
		super(propFileName);
		storeFactory = new JPOXTestStoreFactory();
	}

	/** Generate the mapping file for the test case */
	public void doMapping(AbstractTest testCase) {
		try {
			final File mappingFile = getMappingFile(testCase, getActiveConfiguration());
			generateMappingFile(testCase, mappingFile, getActiveConfiguration().isOptimistic(),
				getActiveConfiguration().getMappingStrategy());
		} catch (Exception e) {
			throw new StoreTestException("Exception while doing mapping", e);
		}
	}

	/**
	 * Request a store for the given configuration.
	 */
	@Override
	public TestStore createStore(AbstractTest testCase) {
		System.err.println("RUNNING TEST " + testCase.getName() + " - " + getActiveConfiguration().getName());
		try {
			if (!new File(RUN_BASE_DIR).exists()) {
				log.error("Directory for jdo files does not exist " + RUN_BASE_DIR);
				throw new StoreTestException("Directory for jdo files does not exist " + RUN_BASE_DIR);
			}

			File mappingFile = getMappingFile(testCase, getActiveConfiguration());
			// copyMappingToClassesDir(testCase, mappingFile,
			// getActiveConfiguration().isOptimistic());

			final ExtensionManager extensionManager = new DefaultExtensionManager();
			testCase.setExtensions(extensionManager);

			final TestStore store =
					storeFactory.get(getDbName(testCase, getActiveConfiguration()), testCase.getEPackages(),
						mappingFile.getAbsolutePath(), getActiveConfiguration(), testCase
							.getExtraConfigurationProperties(), extensionManager);

			// setup store
			getActiveConfiguration().getDbAdapter().setDbName(getDbName(testCase, getActiveConfiguration()));
			store.setUp();

			return store;
		} catch (Exception e) {
			throw new StoreTestException("Exception while getting jdo file", e);
		}
	}

	/**
	 * Creates a file with the extension based on the type of inheritance mapping strategy
	 */
	protected File getMappingFile(AbstractTest testCase, TestConfiguration cfg) throws IOException {
		return new File(getRunTestDir(testCase), cfg.getName() + "_package.jdo");
	}

	/** Returns the directory in which to put the generated mapping files */
	protected File getRunTestDir(AbstractTest testCase) throws IOException {
		File dir = new File(RUN_BASE_DIR, testCase.getName());
		dir.mkdirs();
		return dir;
	}

	/**
	 * Generates the mapping file by calling the superclass and then enhances the compiled classes
	 */
	protected void generateMappingFile(AbstractTest test, File mappingFile, boolean optimistic,
			InheritanceType inheritanceType) {
		if (test.getEPackages() == null) {
			return; // only support tests with epackages
		}

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
			options.put(PersistenceOptions.EMAP_AS_TRUE_MAP, "false");
			// options.put(PersistenceOptions.QUALIFY_ENTITY_NAME,
			// PersistenceOptions.QUALIFY_ENTITY_NAME_NSPREFIX);

			fileWriter.write(JpoxHelper.INSTANCE.generateMapping(test.getEPackages(), options));
			fileWriter.close();

			// now copy the file to the samples plugin
			final File projectDir = mappingFile.getParentFile().getParentFile().getParentFile().getParentFile();
			final File samplesProject = new File(projectDir, "org.eclipse.emf.teneo.samples");
			final File jdoFiles = new File(samplesProject, "jdofiles");
			if (!jdoFiles.exists()) {
				jdoFiles.mkdirs();
			}
			// just choose a name based on one of the classes in the package
			final String fileName = (test.getEPackages()[0].getEClassifiers().get(0)).getInstanceClassName() + ".jdo";
			final File jdoFile = new File(jdoFiles, fileName);
			if (jdoFile.exists()) {
				jdoFile.delete();
			}
			jdoFile.createNewFile();
			StoreUtil.copyFile(mappingFile, jdoFile);

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
			// File destination = copyMappingToClassesDir(test, mappingFile, optimistic);
			JPOXEnhancer.main(new String[] { mappingFile.getAbsolutePath() });
		} catch (Exception e) {
			System.err.println("JDO FILE: " + mappingFile.getAbsolutePath());
			throw new StoreTestException("Exception while enhancing", e);
		}
	}
}