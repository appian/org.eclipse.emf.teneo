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
 * $Id: AbstractTestAction.java,v 1.7 2008/06/02 07:15:40 mtaal Exp $
 */

package org.eclipse.emf.teneo.test;

import java.net.URL;
import java.util.Properties;

import junit.framework.Assert;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.extension.ExtensionManager;
import org.eclipse.emf.teneo.test.conf.ConfigurableTestSuite;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Abstract TestAction used in backend specific test cases.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.7 $
 */
public abstract class AbstractTestAction extends Assert {
	// very strange but there was a compile (or runtime) error in one of the ecore packages, had to
	// set this
	static {
		System.setProperty("org.eclipse.emf.ecore.EPackage.Registry.INSTANCE",
			"org.eclipse.emf.ecore.impl.EPackageRegistryImpl");
	}

	/** The epackage */
	private EPackage[] epackages = null;

	/**
	 * Constructor for test without epackages
	 */
	public AbstractTestAction() {
		this((EPackage[]) null);
	}

	/**
	 * Constructor
	 * 
	 * @param the
	 *            epackage for which this test is run
	 */
	public AbstractTestAction(EPackage epackage) {
		this(new EPackage[] { epackage });
	}

	/**
	 * Constructor for array of epackages
	 * 
	 * @param epackages
	 */
	public AbstractTestAction(EPackage[] epackages) {
		this.epackages = epackages;
	}

	public EPackage[] getEPackages() {
		return epackages;
	}

	/** Return the packagename of the test sample, Is needed in case of non emf test cases */
	public String getTestPackageName() {
		throw new UnsupportedOperationException("Not supported");
	}

	/** Performs the actual test action */
	public abstract void doAction(TestStore store);

	/**
	 * Can be overridden by subclass returns properties which control the or layer. Such as setting
	 * of eager loading.
	 */
	public Properties getExtraConfigurationProperties() {
		return new Properties();
	}

	/** Add extensions if you want */
	public void setExtensions(ExtensionManager extensionManager) {

	}

	/**
	 * Returns the path of the XML persistence mapping file on the classpath or null if none is
	 * available.
	 * <p>
	 * Returning non-null will cause the TestAction to be run twice: first for a PAnnotatedModel
	 * populated from EAnnotations and then for a PAnnotatedModel populated from the XML persistence
	 * mapping.
	 * <p>
	 * This implementation looks for a mapping file on the classpath named &lt;class
	 * name&gt;.persistence.xml, returning its path if it exists or null if it does not.
	 * 
	 * @see ConfigurableTestSuite
	 */
	public String getPersistenceXmlPath() {
		final String path = getClass().getName().replace('.', '/') + ".persistence.xml";
		// Note: use ClassLoader.getResource() instead of Class.getResource().
		final URL resource = getClass().getClassLoader().getResource(path);
		if (resource == null) {
			return null;
		}
		return path;
	}
}