/*
 *	Copyright 2004-2006, Elver.org (http://www.elver.org).
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *
 *		http://www.apache.org/licenses/LICENSE-2.0
 *
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 */
package org.eclipse.emf.teneo.hibernate.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.HbConstants;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.eclipse.emf.teneo.hibernate.mapper.MappingException;
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
 * @version $Revision: 1.1 $
 */
public class HibernateTestbed extends Testbed {

	/** The logger */
	private static Log log = LogFactory.getLog(HibernateTestbed.class);

	/** If we get here then this should be the testbed! */
	static {
		Testbed.setTestBed(new HibernateTestbed());
	}

	/** Delegates to the test bed */
	public static Testbed instance() {
		return Testbed.instance();
	}

	/**
	 * The directory in which the mapping files are generated TODO make insesitive to user.dir
	 */
	private static String RUN_BASE_DIR = System.getProperty("user.dir") + File.separatorChar + "run";

	/** The factory which creates test stores */
	private HibernateTestStoreFactory storeFactory;

	/** Constructor */
	private HibernateTestbed() {
		storeFactory = new HibernateTestStoreFactory();
	}

	/**
	 * Request a store for the given configuration.
	 */
	public TestStore createStore(AbstractTest testCase) {
		try {

			// get and write the mapping xml for debugging purposes.
			// this is actually double as the storeFactory.get does the same thing
			// but okay
			writeMappingToFile(testCase);

			TestStore store = storeFactory.get(getDbName(testCase, getActiveConfiguration()), testCase.getEPackages(), null,
					getActiveConfiguration(), testCase.getExtraConfigurationProperties());

			// setup store
			store.setUp();

			return store;
		} catch (IOException e) {
			throw new StoreTestException("Exception while writing hbm file " + e.getMessage(), e);
		} catch (MappingException m) {
			throw new StoreTestException("Exception while creating mapping file: " + m.getMessage(), m);
		}
	}

	/** Creates the mapping xml and writes it to a mapping file */
	private void writeMappingToFile(AbstractTest testCase) throws MappingException, IOException {
		final Properties props = testCase.getExtraConfigurationProperties();
		props.put(PersistenceOptions.INHERITANCE_MAPPING, getActiveConfiguration().getMappingStrategy().getName());
		final Properties properties = new Properties();
		properties.putAll(props);
		final String mappingXML = HbHelper.INSTANCE.generateMapping(testCase.getEPackages(), properties); 
		writeMappingToFile(getHBMFile(testCase, getActiveConfiguration()), mappingXML);
	}

	/** Write the mapping file for debugging purposes */
	private void writeMappingToFile(File mappingFile, String mappingXML) throws IOException {
		if (mappingFile.exists()) mappingFile.delete();
		mappingFile.createNewFile();
		final FileWriter fileWriter = new FileWriter(mappingFile);
		fileWriter.write(mappingXML);
		fileWriter.close();
	}

	/** Returns the file to which the mapping file is written */
	protected File getHBMFile(AbstractTest testCase, TestConfiguration cfg) {
		return new File(getRunTestDir(testCase, cfg), HbConstants.HBM_FILE_NAME);
	}

	/** Return the directory in which the mapping file is stored */
	protected File getRunTestDir(AbstractTest testCase, TestConfiguration cfg) {
		File dir = new File(new File(RUN_BASE_DIR, testCase.getName()), cfg.getName());
		dir.mkdirs();
		return dir;
	}
}
