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
 * $Id: MultiCfgTestSuite.java,v 1.1 2006/07/04 22:12:17 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.conf;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.teneo.test.AbstractActionTest;
import org.eclipse.emf.teneo.test.AbstractTest;
import org.eclipse.emf.teneo.test.AbstractTestAction;

/**
 * Test suite containing a subsuite for each configuration.
 * 
 * @author Davide Marchignoli
 * @author Martin Taal
 * @version $Revision: 1.1 $
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

	/** Add one test suite for a specific config */
	protected void addTest(AbstractActionTest test, TestConfiguration cfg) {
		((ConfigurableTestSuite) suitesByCfg.get(cfg)).addTest(test);
	}

	/** Add a test class */
	public void addTestSuite(Class testClass) {
		if (AbstractTest.class.isAssignableFrom(testClass) || AbstractTestAction.class.isAssignableFrom(testClass))
			for (Iterator i = suitesByCfg.keySet().iterator(); i.hasNext();)
				addTestSuite(testClass, (TestConfiguration) i.next());
		else
			super.addTestSuite(testClass);
	}

	/** Add a test action */
	public void addTest(AbstractActionTest test) {
		for (Iterator i = suitesByCfg.keySet().iterator(); i.hasNext();)
			addTest(test, (TestConfiguration) i.next());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestSuite#addTest(junit.framework.Test)
	 */
	public void addTest(Test test) {
		if (test instanceof AbstractActionTest) {
			addTest((AbstractActionTest) test);
		} else {
			super.addTest(test);
		}
	}
}