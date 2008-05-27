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
 *   Davide Marchignoli
 * </copyright>
 *
 * $Id: ConfigurableTestSuite.java,v 1.5 2008/05/27 07:42:12 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.conf;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestResult;
import junit.framework.TestSuite;

import org.eclipse.emf.teneo.test.AbstractActionTest;
import org.eclipse.emf.teneo.test.AbstractTestAction;

/**
 * The configurable test suite takes care of setting the active configuration before starting the
 * test.
 * 
 * @author Davide Marchignoli
 * @author Martin Taal
 * @version $Revision: 1.5 $
 */
public class ConfigurableTestSuite extends TestSuite {

	/** the configuration that will be used to rn the tests */
	final TestConfiguration runConfiguration;

	/**
	 * Constructs a TestSuite whose tests will be run in the given configuration.
	 */
	public ConfigurableTestSuite(TestConfiguration cfg, String name) {
		super(name);
		this.runConfiguration = cfg;
	}

	/**
	 * Constructs a TestSuite whose tests will be run in the given configuration.
	 */
	public ConfigurableTestSuite(TestConfiguration cfg) {
		this(cfg, cfg == null ? "Null configuration" : cfg.getName());
	}

	/** Gets the configuration of this run */
	public TestConfiguration getRunConfiguration() {
		return runConfiguration;
	}

	/** Run the test using the specified configuration */
	@Override
	public void runTest(Test test, TestResult result) {
		if (Testbed.instance().getActiveConfiguration() != runConfiguration) {
			Testbed.instance().setActiveConfiguration(getRunConfiguration());
		}
		super.runTest(test, result);
	}

	/**
	 * Returns a test which will fail and log a warning message.
	 */
	public static Test warning(final String message) {
		return new TestCase("warning") {
			@Override
			protected void runTest() {
				fail(message);
			}
		};
	}

	/** Encapsulates an action object in a test */
	protected TestSuite createTestForAction(Class actionClass) {
		TestSuite componentSuite = new TestSuite(actionClass.getName());
		Test componentTest;
		try {
			componentTest = new AbstractActionTest((AbstractTestAction) actionClass.newInstance());
		} catch (Throwable e) {
			componentTest = warning("Cannot istantiate " + actionClass.getName() + " due to\n" + e.getMessage());
		}
		componentSuite.addTest(componentTest);
		return componentSuite;
	}

	/**
	 * Handles specially testClass derived from AbstractTestAction. For this class a suite is
	 * created acting as a corresponding subclass of AbstractHibernateActionTest
	 */
	@Override
	public void addTestSuite(Class testClass) {
		if (AbstractTestAction.class.isAssignableFrom(testClass)) {
			super.addTest(createTestForAction(testClass));
		} else {
			super.addTestSuite(testClass);
		}
	}
}