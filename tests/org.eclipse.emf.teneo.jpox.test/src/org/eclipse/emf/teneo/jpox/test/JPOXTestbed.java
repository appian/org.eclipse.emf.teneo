/*
 *	Copyright 2005-2006, Elver.org (http://www.elver.org).
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
package org.eclipse.emf.teneo.jpox.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.annotations.pannotation.InheritanceType;
import org.eclipse.emf.teneo.jpox.emf.JpoxHelper;
import org.eclipse.emf.teneo.jpox.test.stores.JPOXTestStoreFactory;
import org.eclipse.emf.teneo.samples.SamplesSource;
import org.eclipse.emf.teneo.test.AbstractTest;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.Utils;
import org.eclipse.emf.teneo.test.conf.TestConfiguration;
import org.eclipse.emf.teneo.test.conf.Testbed;
import org.eclipse.emf.teneo.test.stores.TestStore;
import org.jpox.enhancer.JPOXEnhancer;

/**
 * The jpox test bed controls the creation of the store and the generation of the mapping file.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class JPOXTestbed extends Testbed {

	/** If we get here then this should be the testbed! */
	static {
		Testbed.setTestBed(new JPOXTestbed());
	}

	/** Delegates to the test bed */
	public static Testbed instance() {
		return Testbed.instance();
	}

	/** The logger */
	private static Log log = LogFactory.getLog(JPOXTestbed.class);

	/**
	 * The directory in which the mapping files are generated TODO make insesitive to user.dir
	 */
	private static String RUN_BASE_DIR = System.getProperty("user.dir") + File.separatorChar + "run";

	/** The factory responsible for creating a store */
	private JPOXTestStoreFactory storeFactory;

	/** is compile required */
	private boolean isCompileRequired = false;

	/** Constructor */
	private JPOXTestbed() {
		storeFactory = new JPOXTestStoreFactory();
	}

	/** Generate the mapping file for the test case */
	public void doMapping(AbstractTest testCase) {
		isCompileRequired = true;
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
			copyMappingToClassesDir(testCase, mappingFile, getActiveConfiguration().isOptimistic());

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.test.conf.Testbed#isCompileRequired(org.eclipse.emf.ecore.EPackage[])
	 */
	protected boolean isCompileRequired(EPackage[] epackages) {
		return isCompileRequired;
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

			// Compile the sources again because feature map entries may have
			// generated new files
			if (isCompileRequired(test.getEPackages())) {
				EPackage[] epackages = test.getEPackages();
				String[] sourceLocations = new String[epackages.length];
				for (int i = 0; i < epackages.length; i++) {
					sourceLocations[i] = SamplesSource.getSourceDirectory(epackages[i]).getAbsolutePath();
				}

				doCompile(sourceLocations);
			}
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
			JPOXEnhancer.main(new String[] { destination.getAbsolutePath() });
		} catch (Exception e) {
			throw new StoreTestException("Exception while enhancing", e);
		}
	}

	/** Copies the mapping file to the bin directory */
	private File copyMappingToClassesDir(AbstractTest test, File mappingFile, boolean optimistic) {
		try {
			final File destination;
			if (test.getEPackages() != null) {

				// the package.jdo is copied to the root of the classes dir to
				// ensure that it is also
				// found when a test case contains multiple packages
				String name = test.getEPackages()[0].getClass().getName();
				// truncate the name to something like org.elver
				int indexTil = name.indexOf('.');
				indexTil = name.indexOf('.', indexTil + 1);

				destination = new File(SamplesSource.getOutputDirectory(name.substring(0, indexTil), false)
						+ File.separator + "package.jdo");
			} else {
				destination = new File(SamplesSource.getOutputDirectory(test.getTestPackageName(), true)
						+ File.separator + "package.jdo");
			}

			if (destination.exists())
				destination.delete();

			Utils.copyFile(mappingFile, destination);
			return destination;
		} catch (Exception e) {
			throw new StoreTestException("Exception while enhancing", e);
		}
	}
}