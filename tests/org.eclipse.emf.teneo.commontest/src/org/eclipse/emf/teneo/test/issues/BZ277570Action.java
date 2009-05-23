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
 * $Id: BZ277570Action.java,v 1.1.2.1 2009/05/23 13:09:20 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.issues;

import java.util.Properties;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.samples.issues.adept.Bar;
import org.eclipse.emf.teneo.samples.issues.adept.Biff;
import org.eclipse.emf.teneo.samples.issues.adept.Bz277570Factory;
import org.eclipse.emf.teneo.samples.issues.adept.Bz277570Package;
import org.eclipse.emf.teneo.samples.issues.adept.Foo;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Testcase for bugzilla 277570.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1.2.1 $
 */
public class BZ277570Action extends AbstractTestAction {
	public BZ277570Action() {
		super(new EPackage[] { Bz277570Package.eINSTANCE });
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties(super.getExtraConfigurationProperties());
		props.put(PersistenceOptions.DISABLE_ECONTAINER_MAPPING, "true");
		props.put(PersistenceOptions.ALWAYS_VERSION, "false");
		return props;
	}

	@Override
	public void doAction(TestStore store) {
		store.disableDrop();
		final Bz277570Factory factory = Bz277570Factory.eINSTANCE;
		store.beginTransaction();
		{
			final Foo foo = factory.createFoo();
			foo.setId(1);
			store.store(foo);
		}
		store.commitTransaction();

		store.refresh();

		final Foo foo = factory.createFoo();
		foo.setId(1);
		final Bar bar = factory.createBar();
		foo.getBars().add(bar);
		final Biff biff = factory.createBiff();
		biff.setId(2);
		biff.setName("name");
		foo.getBiffs().add(biff);
		bar.setBaz(biff);
		bar.setId(3);
		bar.setName("name");

		store.beginTransaction();
		store.merge(foo);
		store.commitTransaction();
	}
}