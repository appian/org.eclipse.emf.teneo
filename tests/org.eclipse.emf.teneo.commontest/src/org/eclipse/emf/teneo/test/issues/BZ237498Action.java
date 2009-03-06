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
 * $Id: BZ237498Action.java,v 1.3 2009/03/06 12:31:21 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.issues;

import java.util.Properties;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.samples.issues.bz237498.Bz237498Factory;
import org.eclipse.emf.teneo.samples.issues.bz237498.Bz237498Package;
import org.eclipse.emf.teneo.samples.issues.bz237498.Many;
import org.eclipse.emf.teneo.samples.issues.bz237498.One;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Testcase for bugzilla 237498
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class BZ237498Action extends AbstractTestAction {
	public BZ237498Action() {
		super(new EPackage[] { Bz237498Package.eINSTANCE });
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.teneo.test.AbstractTestAction#getExtraConfigurationProperties
	 * ()
	 */
	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.ALWAYS_MAP_LIST_AS_BAG, "true");
		return props;
	}

	@Override
	public void doAction(TestStore store) {

		// don't do anything for now
		if (store.getDatabaseAdapter().getDbDriver().indexOf("hsqldb") != -1) {
			return;
		}

		final Bz237498Factory factory = Bz237498Factory.eINSTANCE;
		{
			store.beginTransaction();
			final One one = factory.createOne();
			final Many many1 = factory.createMany();
			many1.setName("zzz");
			final Many many2 = factory.createMany();
			many2.setName("aaa");
			one.getManies().add(many1);
			one.getManies().add(many2);
			store.store(one);
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			final One one = store.getObject(One.class);
			final Many m1 = one.getManies().get(0);
			assertEquals("aaa", m1.getName());
			final Many m2 = one.getManies().get(1);
			assertEquals("zzz", m2.getName());
			store.commitTransaction();
		}
	}
}