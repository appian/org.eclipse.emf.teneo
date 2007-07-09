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
 *   Davide Marchignoli
 * </copyright>
 *
 * $Id: MultiCfgTestSuite.java,v 1.4 2007/07/09 12:54:54 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.conf;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.test.AbstractActionTest;
import org.eclipse.emf.teneo.test.AbstractTest;
import org.eclipse.emf.teneo.test.AbstractTestAction;

/**
 * Test suite containing a subsuite for each configuration.
 * 
 * @author Davide Marchignoli
 * @author Martin Taal
 * @version $Revision: 1.4 $
 */
public class MultiCfgTestSuite extends TestSuite {

	/** map indexed by available configurations with values on ConfigurableTestSuite */
	private Map suitesByCfg = new HashMap();

	/** Constructor */
	public MultiCfgTestSuite(String name, TestConfigurations availableCfgs) {
		this(availableCfgs);
		setName(name);
	}

	/** Constructor with the available configs */
	public MultiCfgTestSuite(TestConfigurations availableCfgs) {
		super();
		for (Iterator i = availableCfgs.getConfigurations().iterator(); i.hasNext();) {
			TestConfiguration cfg = (TestConfiguration) i.next();
			ConfigurableTestSuite innerSuite = new ConfigurableTestSuite(cfg);
			addTest(innerSuite);
			suitesByCfg.put(cfg, innerSuite);
		}
	}

	/** Add one test suite for a specific config */
	protected void addTestSuite(Class testSuite, TestConfiguration cfg) {
		((ConfigurableTestSuite) suitesByCfg.get(cfg)).addTestSuite(testSuite);
	}

	/**
	 * Adds a persistence XML test suite if the TestAction has an associated "&ltActionClass&gt;.persistence.xml" file.
	 * 
	 * @param testActionClass
	 * @param testConfiguration
	 */
	private void addPersistenceXmlTestSuite(Class testActionClass, TestConfiguration testConfiguration) {
		final AbstractTestAction testAction;
		try {
			testAction = (AbstractTestAction) testActionClass.newInstance();
		} catch (Exception e) {
			throw new AssertionError(e);
		}

		final String xmlPersistenceMappingPath = testAction.getPersistenceXmlPath();
		if (xmlPersistenceMappingPath != null) {
			// Run this TestAction with XML persistence mapping.
			final Properties properties = new Properties();
			properties.setProperty(PersistenceOptions.PERSISTENCE_XML, xmlPersistenceMappingPath);
			// Ignore the existing EAnnotations, since we want to test only the XML mapping.
			properties.setProperty(PersistenceOptions.IGNORE_EANNOTATIONS, "true");

			TestSuite testSuite = new TestSuite(testActionClass.getName() + " (persistence.xml)");
			testSuite.addTest(new AbstractActionTest(testAction, properties));
			((TestSuite) suitesByCfg.get(testConfiguration)).addTest(testSuite);
		}
	}

	/** Add one test suite for a specific config */
	protected void addTest(AbstractActionTest test, TestConfiguration cfg) {
		((ConfigurableTestSuite) suitesByCfg.get(cfg)).addTest(test);
	}

	/** Add a test class */
	@Override
	public void addTestSuite(Class testClass) {
		if (AbstractTest.class.isAssignableFrom(testClass) || AbstractTestAction.class.isAssignableFrom(testClass)) {
			for (Iterator i = suitesByCfg.keySet().iterator(); i.hasNext();) {
				final TestConfiguration testConfiguration = (TestConfiguration) i.next();
				if (!testConfiguration.isXml()) {
					addTestSuite(testClass, testConfiguration);
				} else if (AbstractTestAction.class.isAssignableFrom(testClass)) {
					addPersistenceXmlTestSuite(testClass, testConfiguration);
				}
			}
		} else {
			super.addTestSuite(testClass);
		}
	}

	/** Add a test action */
	public void addTest(AbstractActionTest test) {
		for (Iterator i = suitesByCfg.keySet().iterator(); i.hasNext();) {
			final TestConfiguration tc = (TestConfiguration) i.next();
			if (tc.isXml()) {
				if (test.getTestAction().getPersistenceXmlPath() != null) {
					if (test.getProperties() == null) {
						test.setProperties(new Properties());
					}
					final Properties properties = test.getProperties();
					properties.setProperty(PersistenceOptions.PERSISTENCE_XML, test.getTestAction()
						.getPersistenceXmlPath());
					properties.setProperty(PersistenceOptions.IGNORE_EANNOTATIONS, "true");
					addTest(test, tc);
				}
			} else {
				addTest(test, tc);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestSuite#addTest(junit.framework.Test)
	 */
	@Override
	public void addTest(Test test) {
		if (test instanceof AbstractActionTest) {
			addTest((AbstractActionTest) test);
		} else {
			super.addTest(test);
		}
	}
}