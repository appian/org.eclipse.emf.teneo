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
 * $Id: ListAsIdBagAction.java,v 1.1 2008/12/16 20:40:36 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.samples.issues.bz237790.Bz237790Factory;
import org.eclipse.emf.teneo.samples.issues.bz237790.Bz237790Package;
import org.eclipse.emf.teneo.samples.issues.bz237790.Many;
import org.eclipse.emf.teneo.samples.issues.bz237790.One;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class ListAsIdBagAction extends AbstractTestAction {

	private final Bz237790Factory factory = Bz237790Factory.eINSTANCE;

	public ListAsIdBagAction() {
		super(Bz237790Package.eINSTANCE);
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.MAP_ALL_LISTS_AS_IDBAG, "true");
		return props;
	}

	@Override
	public void doAction(TestStore store) {
		store.disableDrop();
		{
			store.beginTransaction();
			addDataSet(store, 1);
			addDataSet(store, 2);
			store.commitTransaction();
		}

		// read the writers and add the second book to the second writer
		{
			store.beginTransaction();
			final List<One> os = store.getObjects(One.class);
			One o1 = null;
			One o2 = null;
			for (One o : os) {
				if (o.getManies().size() == 2) {
					o1 = o;
				} else {
					o2 = o;
				}
			}
			final List<Many> reserve = new ArrayList<Many>(o1.getManies());
			o1.getManies().clear();
			reserve.add(1, o2.getManies().get(1));
			o1.getManies().addAll(reserve);
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			final List<One> os = store.getObjects(One.class);
			for (One o : os) {
				assertEquals(3, o.getManies().size());
			}
			store.commitTransaction();
		}
	}

	private void addDataSet(TestStore store, int index) {
		{
			final One one = factory.createOne();
			store.store(one);
			int num = 3;
			if (index == 2) {
				num = 2;
			}
			for (int i = 0; i < num; i++) {
				final Many many = factory.createMany();
				many.setName("" + index);
				one.getManies().add(many);
				store.store(many);
			}
		}

	}
}
