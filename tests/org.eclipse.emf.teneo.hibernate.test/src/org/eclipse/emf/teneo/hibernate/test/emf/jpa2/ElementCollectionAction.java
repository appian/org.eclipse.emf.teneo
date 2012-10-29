/**
 * <copyright> Copyright (c) 2012 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * EmbeddedIdAction.java,v 1.3 2007/03/20 23:33:38 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.jpa2;

import org.eclipse.emf.teneo.samples.emf.jpa2.elementcollection.ElementcollectionFactory;
import org.eclipse.emf.teneo.samples.emf.jpa2.elementcollection.ElementcollectionPackage;
import org.eclipse.emf.teneo.samples.emf.jpa2.elementcollection.Item;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

public class ElementCollectionAction extends AbstractTestAction {

	private static final ElementcollectionFactory FACTORY = ElementcollectionFactory.eINSTANCE;

	public ElementCollectionAction() {
		super(ElementcollectionPackage.eINSTANCE);
	}

	@Override
	public void doAction(TestStore store) {
		final String baseName = "NAME";
		final int itemCount = 50;
		{
			final Item item = FACTORY.createItem();
			for (int i = 0; i < itemCount; i++) {
				item.getNames().add(baseName + i);
			}
			store.beginTransaction();
			store.store(item);
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			final Item item = store.getObject(Item.class);
			assertTrue(item.getNames().size() == itemCount);
			for (int i = 0; i < itemCount; i++) {
				assertTrue(item.getNames().get(i).equals(baseName + i));
			}
			assertTrue(item.getNames().contains(baseName + "40"));
			assertTrue(item.getNames().contains(baseName + "30"));
			item.getNames().remove(40);
			item.getNames().remove(30);
			assertTrue(!item.getNames().contains(baseName + "40"));
			assertTrue(!item.getNames().contains(baseName + "30"));
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			final Item item = store.getObject(Item.class);
			assertTrue(item.getNames().size() == (itemCount - 2));
			assertTrue(!item.getNames().contains(baseName + "40"));
			assertTrue(!item.getNames().contains(baseName + "30"));
			assertTrue(item.getNames().contains(baseName + "10"));
			assertTrue(item.getNames().contains(baseName + "20"));
			store.commitTransaction();
		}
	}

}
