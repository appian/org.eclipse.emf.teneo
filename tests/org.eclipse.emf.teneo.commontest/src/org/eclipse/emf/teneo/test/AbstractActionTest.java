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
 * $Id: AbstractActionTest.java,v 1.6 2007/07/09 12:54:54 mtaal Exp $
 */

package org.eclipse.emf.teneo.test;

import java.util.Properties;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.PersistenceOptions;

/**
 * Hibernate test based on abstract action.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $
 */
public class AbstractActionTest extends AbstractTest {
	/** The action contains the real test */
	protected AbstractTestAction itsTestAction;

	private Properties properties;

	/** Constructor */
	public AbstractActionTest(Class<?> testActionClass) {
		super("testAction");
		try {
			itsTestAction = (AbstractTestAction) testActionClass.newInstance();
		} catch (Exception e) {
			throw new StoreTestException("Exception while instantiating " + testActionClass.getName(), e);
		}
	}

	/** Constructor */
	public AbstractActionTest(AbstractTestAction itsTestAction) {
		this(itsTestAction, null);
	}

	/**
	 * Constructs an instance with additional OR-mapping properties.
	 * @param itsTestAction
	 * @param properties
	 */
	public AbstractActionTest(AbstractTestAction itsTestAction, Properties properties) {
		super("testAction");
		this.itsTestAction = itsTestAction;
		this.properties = properties;
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
	@Override
	public EPackage[] getEPackages() {
		return getTestAction().getEPackages();
	}

	/** Return the test package name */
	@Override
	public String getTestPackageName() {
		return getTestAction().getTestPackageName();
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties props) {
		properties = props;
	}

	/** Return the test package name */
	@Override
	public Package getTestPackage() {
		return getTestAction().getClass().getPackage();
	}

	/** Returns extra properties which are passed to the or layer for additional configuration */
	@Override
	public Properties getExtraConfigurationProperties() {
		Properties allProperties = getTestAction().getExtraConfigurationProperties();

		// override some defaults
		if (allProperties.get(PersistenceOptions.SET_DEFAULT_CASCADE_ON_NON_CONTAINMENT) == null) {
			allProperties.setProperty(PersistenceOptions.SET_DEFAULT_CASCADE_ON_NON_CONTAINMENT, "true");
		}

		if (allProperties.get(PersistenceOptions.JOIN_TABLE_NAMING_STRATEGY) == null) {
			allProperties.setProperty(PersistenceOptions.JOIN_TABLE_NAMING_STRATEGY, "ejb3");
		}

		if (this.properties != null) {
			allProperties.putAll(this.properties);
		}
		return allProperties;
	}

	/** Returns a unique name based on the class name of the testAction class */
	@Override
	public String getName() {
		return itsTestAction.getClass().getName();
	}

	/** Returns a simple name based on the class name of the testAction class. */
	@Override
	public String getSimpleName() {
		final String name = getName();
		return name.substring(name.lastIndexOf(".") + 1);
	}
}