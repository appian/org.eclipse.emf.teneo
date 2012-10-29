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
 * $Id: HibernateTestbed.java,v 1.27 2010/11/12 14:18:09 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.emf.teneo.extension.ExtensionManager;
import org.eclipse.emf.teneo.extension.ExtensionManagerFactory;
import org.eclipse.emf.teneo.hibernate.HbConstants;
import org.eclipse.emf.teneo.hibernate.mapping.identifier.IdentifierCacheHandler;
import org.eclipse.emf.teneo.hibernate.test.stores.HibernateTestStoreFactory;
import org.eclipse.emf.teneo.test.AbstractTest;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.conf.TestConfiguration;
import org.eclipse.emf.teneo.test.conf.Testbed;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Is the testbed which models the base in which a testrun is run.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.27 $
 */
public class HibernateTestbed extends Testbed {

	/** The logger */
	// private static Log log = LogFactory.getLog(HibernateTestbed.class);

	/** The property file to use */
	private static final String propFileName;

	/**
	 * The directory in which the mapping files are generated TODO make insesitive to user.dir
	 */
	private static String RUN_BASE_DIR = System.getProperty("user.dir") + File.separatorChar + "hbm";

	/** Test the rundir */
	static {
		try {
			if (RUN_BASE_DIR.indexOf("hudson") != -1) { // UGLY, replace with
				// smarter solution!
				propFileName = "/hudson_test.properties";
			} else {
				propFileName = "/hudson_test.properties";
				// propFileName = "/local_test.properties";
				deleteHsqldbFile(new File("/tmp/hsqldb"));
			}
			Testbed.setTestBed(new HibernateTestbed());

		} catch (Exception e) {
			throw new StoreTestException("Exception while checking directory " + RUN_BASE_DIR, e);
		}
	}

	public static boolean isRunningOnBuildServer() {
		return RUN_BASE_DIR.indexOf("www-data") != -1;
	}

	// remove all hsqldb files before each run
	private static void deleteHsqldbFile(File file) {
		if (!file.exists()) {
			return;
		}
		if (file.isDirectory()) {
			for (File f : file.listFiles()) {
				deleteHsqldbFile(f);
			}
		}
		file.delete();
	}

	/** Delegates to the test bed */
	public static Testbed instance() {
		return Testbed.instance();
	}

	/** The factory which creates test stores */
	private HibernateTestStoreFactory storeFactory;

	/** Constructor */
	private HibernateTestbed() {
		super(propFileName);
		storeFactory = new HibernateTestStoreFactory();
	}

	/**
	 * Request a store for the given configuration.
	 */
	@Override
	public TestStore createStore(AbstractTest testCase) {
		try {

			IdentifierCacheHandler.getInstance().clear();
			final ExtensionManager extensionManager = ExtensionManagerFactory.getInstance().create();
			testCase.setExtensions(extensionManager);

			TestStore store = storeFactory.get(getDbName(testCase, getActiveConfiguration()),
					testCase.getEPackages(), null, getActiveConfiguration(),
					testCase.getExtraConfigurationProperties(), extensionManager);

			// setup store
			try {
				store.setUp();

				writeMappingToFile(store.getMappingXML(), testCase, extensionManager);
			} catch (Throwable t) {

				writeMappingToFile(store.getMappingXML(), testCase, extensionManager);
				throw new IllegalStateException(t);
			}

			return store;
		} catch (IOException e) {
			throw new StoreTestException(
					"Exception while writing hbm file/creating mapping file and setting up the store"
							+ e.getMessage(), e);
		}
	}

	/** Creates the mapping xml and writes it to a mapping file */
	private void writeMappingToFile(String mappingXML, AbstractTest testCase,
			ExtensionManager extensionManager) throws IOException {

		if (isRunningOnBuildServer()) {
			return;
		}
		if (mappingXML == null) {
			return;
		}

		// System.err.println(mappingXML);
		final File file = getHBMFile(testCase, getActiveConfiguration());
		writeMappingToFile(file, mappingXML);
	}

	/** Write the mapping file for debugging purposes */
	private void writeMappingToFile(File mappingFile, String mappingXML) throws IOException {
		if (mappingFile.exists()) {
			mappingFile.delete();
		}
		mappingFile.createNewFile();
		final FileWriter fileWriter = new FileWriter(mappingFile);

		fileWriter.write(mappingXML);
		fileWriter.close();
	}

	/** Returns the file to which the mapping file is written */
	protected File getHBMFile(AbstractTest testCase, TestConfiguration cfg) {
		return new File(getRunTestDir(testCase), testCase.getSimpleName() + "_" + cfg.getName() + "_"
				+ HbConstants.HBM_FILE_NAME);
	}

	/** Return the directory in which the mapping file is stored */
	protected File getRunTestDir(AbstractTest testCase) {
		File dir = new File(new File(RUN_BASE_DIR), testCase.getTestPackage().getName());
		dir.mkdirs();
		return dir;
	}
}
