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
 * $Id: BZ277546Action.java,v 1.2 2009/05/23 10:51:26 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.issues;

import java.util.Properties;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.samples.issues.bz277546.Bz277546Factory;
import org.eclipse.emf.teneo.samples.issues.bz277546.Bz277546Package;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Testcase for bugzilla 277546
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class BZ277546Action extends AbstractTestAction {
	public BZ277546Action() {
		super(new EPackage[] { Bz277546Package.eINSTANCE });
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties(super.getExtraConfigurationProperties());
		// props.put(PersistenceOptions.XSDDATE_CLASS, "java.util.Date");
		// props.put(PersistenceOptions.USER_XSDDATETIME_TYPE, "timestamp");
		return props;
	}

	@Override
	public void doAction(TestStore store) {
		final Bz277546Factory factory = Bz277546Factory.eINSTANCE;
		store.beginTransaction();
		store.store(factory.createDateVersion());
		store.store(factory.createSimpleVersion());
		store.store(factory.createAnotherVersion());
		store.commitTransaction();
	}
}