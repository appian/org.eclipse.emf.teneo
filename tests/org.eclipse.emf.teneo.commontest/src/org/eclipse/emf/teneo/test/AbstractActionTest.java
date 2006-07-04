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
 * $Id: AbstractActionTest.java,v 1.1 2006/07/04 22:12:17 mtaal Exp $
 */

package org.eclipse.emf.teneo.test;

import java.util.Properties;

import org.eclipse.emf.ecore.EPackage;

/**
 * Hibernate test based on abstract action.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class AbstractActionTest extends AbstractTest {
	/** The action contains the real test */
	protected AbstractTestAction itsTestAction;

	/** Constructor */
	public AbstractActionTest(Class testActionClass) {
		super("testAction");
		try {
			itsTestAction = (AbstractTestAction) testActionClass.newInstance();
		} catch (Exception e) {
			throw new StoreTestException("Exception while instantiating " + testActionClass.getName(), e);
		}
	}

	/** Constructor */
	public AbstractActionTest(AbstractTestAction itsTestAction) {
		super("testAction");
		this.itsTestAction = itsTestAction;
	}

	/** returns the underlying test action */
	public AbstractTestAction getTestAction() {
		return itsTestAction;
	}

	/** The actual test run */
	public void testAction() {
		getTestAction().doAction(getStore());
	}

	/** Return the epackages for which this test is done */
	public EPackage[] getEPackages() {
		return getTestAction().getEPackages();
	}

	/** Return the test package name */
	public String getTestPackageName() {
		return getTestAction().getTestPackageName();
	}

	/** Returns extra properties which are passed to the or layer for additional configuration */
	public Properties getExtraConfigurationProperties() {
		return getTestAction().getExtraConfigurationProperties();
	}

	/** Returns a unique name based on the class name of the testAction class */
	public String getName() {
		return itsTestAction.getClass().getName();
	}
}