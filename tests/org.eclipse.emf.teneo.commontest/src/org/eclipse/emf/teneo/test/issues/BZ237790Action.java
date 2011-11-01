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
 * $Id: BZ237790Action.java,v 1.1 2008/06/28 23:11:49 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.issues;

import java.util.Properties;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.samples.issues.bz237790.Bz237790Factory;
import org.eclipse.emf.teneo.samples.issues.bz237790.Bz237790Package;
import org.eclipse.emf.teneo.samples.issues.bz237790.Many;
import org.eclipse.emf.teneo.samples.issues.bz237790.One;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Testcase for bugzilla 237790
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class BZ237790Action extends AbstractTestAction {
	public BZ237790Action() {
		super(new EPackage[] { Bz237790Package.eINSTANCE });
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.test.AbstractTestAction#getExtraConfigurationProperties()
	 */
	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.MAP_ALL_LISTS_AS_IDBAG, "true");
		return props;
	}

	@Override
	public void doAction(TestStore store) {
		final Bz237790Factory factory = Bz237790Factory.eINSTANCE;
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
			assertEquals("zzz", m1.getName());
			final Many m2 = one.getManies().get(1);
			assertEquals("aaa", m2.getName());
			store.commitTransaction();
		}
	}
}