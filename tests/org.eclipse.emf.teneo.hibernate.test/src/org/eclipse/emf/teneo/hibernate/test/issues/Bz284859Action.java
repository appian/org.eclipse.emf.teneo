/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * AgilAction.java,v 1.1 2007/03/28 13:58:33 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.issues;

import java.util.List;
import java.util.Properties;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.samples.issues.bz284859.Bar;
import org.eclipse.emf.teneo.samples.issues.bz284859.BarDerived;
import org.eclipse.emf.teneo.samples.issues.bz284859.Bz284859Factory;
import org.eclipse.emf.teneo.samples.issues.bz284859.Bz284859Package;
import org.eclipse.emf.teneo.samples.issues.bz284859.Foo;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class Bz284859Action extends AbstractTestAction {

	public Bz284859Action() {
		super(new EPackage[] { Bz284859Package.eINSTANCE });
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.USE_MAPPING_FILE, "true");
		return props;
	}

	@Override
	public void doAction(TestStore store) {
		store.disableDrop();
		{
			store.beginTransaction();
			final Foo foo = Bz284859Factory.eINSTANCE.createFoo();
			foo.setName("foo");
			store.store(foo);
			final Bar bar = Bz284859Factory.eINSTANCE.createBar();
			bar.setName("bar");
			store.store(bar);
			final BarDerived barDerived = Bz284859Factory.eINSTANCE.createBarDerived();
			barDerived.setName("barDerived");
			store.store(barDerived);
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			final List<Foo> foos = store.getObjects(Foo.class);
			assertEquals(2, foos.size());

			final List<Bar> bars = store.getObjects(Bar.class);
			assertEquals(2, bars.size());

			final List<BarDerived> barDeriveds = store.getObjects(BarDerived.class);
			assertEquals(1, barDeriveds.size());
			store.commitTransaction();
		}
	}
}
