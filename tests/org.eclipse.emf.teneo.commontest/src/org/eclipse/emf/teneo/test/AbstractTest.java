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
 * $Id: AbstractTest.java,v 1.5 2008/02/28 07:08:16 mtaal Exp $
 */

package org.eclipse.emf.teneo.test;

import java.util.Properties;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.extension.ExtensionManager;
import org.eclipse.emf.teneo.test.conf.Testbed;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Base class for hibernate store based tests. The tests inheriting from this class will get a
 * dedicated store to be used in order to perform the test.
 * 
 * <p>
 * The standard test suite will run such tests once for each configured test setting (see
 * test.properties).
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */
public abstract class AbstractTest extends TestCase {
	// very strange but there was a compile (or runtime) error in one of the ecore packages, had to
	// set this
	static {
		System.setProperty("org.eclipse.emf.ecore.EPackage.Registry.INSTANCE",
				"org.eclipse.emf.ecore.impl.EPackageRegistryImpl");
	}

	/** The test store is the connection to the database and specific datalayer actions */
	private TestStore itsStore;

	/** Keep track if the run failed (exception occured) */
	private boolean lastRunFailed;

	/**
	 * @return Returrns true if last run failed. Meaningless if invoked before the test method
	 *         completes, reports correct value if invoked in tearDown.
	 */
	public final boolean lastRunFailed() {
		return lastRunFailed;
	}

	/** Set of epackages for which this test runs */
	public abstract EPackage[] getEPackages();

	/** Return the test package name */
	public abstract String getTestPackageName();

	/** The test method (testAction) */
	AbstractTest(String testMethod) {
		super(testMethod);
	}

	/** Return the store used */
	protected TestStore getStore() {
		return itsStore;
	}

	/** Setup the store */
	@Override
	public void setUp() throws Exception {
		itsStore = Testbed.instance().createStore(this);
	}

	/** Run the test */
	@Override
	protected void runTest() throws Throwable {
		try {
			lastRunFailed = false;
			super.runTest();
		} catch (Throwable t) {
			lastRunFailed = true;
			throw t;
		}
	}

	/** Tear down after the test */
	@Override
	public void tearDown() {
		getStore().tearDown(!lastRunFailed);
	}

	/** Returns extra properties which are passed to the or layer for additional configuration */
	public Properties getExtraConfigurationProperties() {
		return new Properties();
	}

	/** Add extensions if you want */
	public void setExtensions(ExtensionManager extensionManager) {

	}

	/** Returns a name based on the class name of the testAction class. */
	@Override
	public String getName() {
		return this.getClass().getName();
	}

	/** Returns a simple name based on the class name of the testAction class. */
	public String getSimpleName() {
		return this.getClass().getSimpleName();
	}

	/** Return the test package name */
	public abstract Package getTestPackage();

}