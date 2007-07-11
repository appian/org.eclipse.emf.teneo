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
 * $Id: AbstractTestStoreFactory.java,v 1.7 2007/07/11 14:42:21 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.stores;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.annotations.pannotation.InheritanceType;
import org.eclipse.emf.teneo.extension.ExtensionManager;
import org.eclipse.emf.teneo.test.AbstractTest;
import org.eclipse.emf.teneo.test.conf.TestConfiguration;

/**
 * Generic part of the store creation.
 * 
 * @author Davide Marchignoli
 * @author Martin Taal
 * @version $Revision: 1.7 $
 */
public abstract class AbstractTestStoreFactory {

	/** The logger */
	private static String RUN_BASE_DIR = System.getProperty("user.dir") + File.separatorChar + "run";

	/**
	 * Request a store for the given configuration. No other store can be requested until this one
	 * is tear down. NOTE: dbName must be a key: no equals dbName for difference usedEPackages/cfg
	 */
	public TestStore get(String dbName, EPackage[] usedEPackages, String mappingFilePath, TestConfiguration cfg,
			Properties extraConfigProps, ExtensionManager extensionManager) throws FileNotFoundException {
		cfg.getDbAdapter().setDbName(dbName);
		return createStoreInstance(cfg.getDbAdapter(), usedEPackages, mappingFilePath, extraConfigProps, cfg
			.getMappingStrategy(), cfg.isEjb3(), extensionManager);
	}

	/** Ensures that the run directory exists, this directory contains the mapping files */
	protected File getRunTestDir(AbstractTest testCase, TestConfiguration cfg) {
		File dir = new File(RUN_BASE_DIR, testCase.getClass().getName());
		dir.mkdirs();
		return dir;
	}

	/** Creates the actual specific test store */
	protected abstract TestStore createStoreInstance(TestDatabaseAdapter adapter, EPackage[] epackages,
			String mappingFileLocation, Properties props, InheritanceType inheritanceType, boolean ejb3,
			ExtensionManager extensionManager);
}