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
 * $Id: EnumTestAction.java,v 1.6 2008/02/28 07:08:16 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.issues;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.teneo.samples.issues.enumtest.EnumtestFactory;
import org.eclipse.emf.teneo.samples.issues.enumtest.EnumtestPackage;
import org.eclipse.emf.teneo.samples.issues.enumtest.Item;
import org.eclipse.emf.teneo.samples.issues.enumtest.ItemType;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests nullable enum and enum as id
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $
 */
public class EnumTestAction extends AbstractTestAction {
	/**
	 * Constructor.
	 * 
	 * @param arg0
	 */
	public EnumTestAction() {
		super(EnumtestPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	public void doAction(TestStore store) {
		{
			store.beginTransaction();
			Item itemFamily = EnumtestFactory.eINSTANCE.createItem();
			itemFamily.setItemType(ItemType.PRODUCT_FAMILY_LITERAL);
			itemFamily.setNullableItemType(null);
			store.store(itemFamily);
			Item item = EnumtestFactory.eINSTANCE.createItem();
			item.setItemType(ItemType.PRODUCT_LITERAL);
			item.setNullableItemType(ItemType.PRODUCT_LITERAL);
			store.store(item);
			store.commitTransaction();
		}

		{
			try {
				store.beginTransaction();
				Item itemFamily = EnumtestFactory.eINSTANCE.createItem();
				itemFamily.setItemType(ItemType.PRODUCT_FAMILY_LITERAL);
				store.store(itemFamily);
				store.commitTransaction();
				fail("Enum primary key does not work");
			} catch (Exception e) {
				// correct this should fail
				store.rollbackTransaction();
			}
		}

		{
			store.beginTransaction();
			List<?> list = store.getObjects(Item.class);
			assertEquals(2, list.size());
			for (Iterator<?> it = list.iterator(); it.hasNext();) {
				Item item = (Item) it.next();
				if (item.getItemType().getValue() == ItemType.PRODUCT_FAMILY) {
					assertTrue(item.getNullableItemType() == null);
				} else if (item.getItemType().getValue() == ItemType.PRODUCT) {
					assertTrue(item.getNullableItemType().getValue() == ItemType.PRODUCT);
				} else {
					fail("Unknown item");
				}
			}
			store.commitTransaction();
		}
		/*
		 * // do save action with a resource try { final Resource rs = store.getResource(); final Item
		 * item1 = EnumtestFactory.eINSTANCE.createItem();
		 * item1.setItemType(ItemType.PRODUCT_FAMILY_LITERAL); item1.setNullableItemType(null);
		 * rs.getContents().add(item1); final Item item2 = EnumtestFactory.eINSTANCE.createItem();
		 * item2.setItemType(ItemType.PRODUCT_FAMILY_LITERAL);
		 * item2.setNullableItemType(ItemType.PRODUCT_LITERAL); rs.getContents().add(item2);
		 * rs.save(Collections.EMPTY_MAP); } catch (IOException e) { throw new
		 * StoreTestException("Exception while saving resource", e); }
		 */
	}
}
