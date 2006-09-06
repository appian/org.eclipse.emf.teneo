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
 * $Id: AbstractTestStoreFactory.java,v 1.4 2006/09/06 06:55:46 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.stores;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.annotations.pannotation.InheritanceType;
import org.eclipse.emf.teneo.test.AbstractTest;
import org.eclipse.emf.teneo.test.conf.TestConfiguration;

/**
 * Generic part of the store creation.
 * 
 * @author Davide Marchignoli
 * @author Martin Taal
 * @version $Revision: 1.4 $
 */
public abstract class AbstractTestStoreFactory {

	/** The logger */
//	private static Log log = LogFactory.getLog(AbstractTestStoreFactory.class);
 
	// TODO make insesitive to user.dir
	private static String RUN_BASE_DIR = System.getProperty("user.dir") + File.separatorChar + "run";
	
	/**
	 * Request a store for the given configuration. No other store can be requested until this one is tear down. NOTE: dbName must be a
	 * key: no equals dbName for difference usedEPackages/cfg
	 */
	public TestStore get(String dbName, EPackage[] usedEPackages, TestConfiguration cfg, Properties extraConfigProps)
			throws FileNotFoundException {
		return createTestStore(dbName, usedEPackages, null, cfg, extraConfigProps);
	}

	/**
	 * Request a store for the given configuration. No other store can be requested until this one is tear down. NOTE: dbName must be a
	 * key: no equals dbName for difference usedEPackages/cfg
	 */
	public TestStore get(String dbName, EPackage[] usedEPackages, String mappingFilePath, TestConfiguration cfg,
			Properties extraConfigProps) throws FileNotFoundException {
		return createTestStore(dbName, usedEPackages, mappingFilePath, cfg, extraConfigProps);
	}

	/**
	 * Request a store for the given configuration. No other store can be requested until this one is tear down. NOTE: dbName must be a
	 * key: no equals dbName for difference usedEPackages/cfg
	 */
	public TestStore get(String dbName, EPackage[] usedEPackages, File mappingFile, TestConfiguration cfg,
			Properties extraConfigProps) throws FileNotFoundException {
		return createTestStore(dbName, usedEPackages, 
				(mappingFile != null ? mappingFile.getAbsolutePath() : null), cfg, extraConfigProps);
	}

	/** Creates the test store for emf test case */
	protected TestStore createTestStore(String dbName, EPackage[] usedEPackages, String mappingFile, TestConfiguration cfg,
			Properties props) throws FileNotFoundException {
		cfg.getDbAdapter().setDbName(dbName);
		// TODO: mappingfile is null for hibernate but set for jpox make this nicer than
		// passing null value around
		return createStoreInstance((TestDatabaseAdapter) cfg.getDbAdapter(), usedEPackages, 
				mappingFile, props, cfg.getMappingStrategy());
	}

	/** Ensures that the run directory exists, this directory contains the mapping files */
	protected File getRunTestDir(AbstractTest testCase, TestConfiguration cfg) {
		File dir = new File(RUN_BASE_DIR, testCase.getClass().getName());
		dir.mkdirs();
		return dir;
	}

	/** Creates the actual specific test store */
	protected abstract TestStore createStoreInstance(TestDatabaseAdapter adapter, EPackage[] epackages, String mappingFileLocation,
			Properties props, InheritanceType inheritanceType);
}