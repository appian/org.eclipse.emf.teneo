/**
 * <copyright> Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * SetAction.java,v 1.6 2007/02/08 23:11:22 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;

import java.util.ArrayList;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.teneo.extension.ExtensionManager;
import org.eclipse.emf.teneo.mapping.strategy.EntityNameStrategy;
import org.eclipse.emf.teneo.mapping.strategy.impl.QualifyingEntityNameStrategy;
import org.eclipse.emf.teneo.samples.emf.annotations.set.ContainedItem;
import org.eclipse.emf.teneo.samples.emf.annotations.set.Item;
import org.eclipse.emf.teneo.samples.emf.annotations.set.ItemList;
import org.eclipse.emf.teneo.samples.emf.annotations.set.SetFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.set.SetPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Test 1n relation (contained and non-contained) using sets.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.9 $
 */
public class SetAction extends AbstractTestAction {
	/** The number of testitems created */
	private static int NO_ITEMS = 10;

	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public SetAction() {
		super(SetPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		final SetFactory factory = SetFactory.eINSTANCE;
		// create a book, writer and library
		final ArrayList<String> names = new ArrayList<String>();
		final ArrayList<String> cnames = new ArrayList<String>();
		{
			store.beginTransaction();

			final ItemList list = factory.createItemList();
			list.setName("mylist");

			for (int i = 0; i < NO_ITEMS; i++) {
				final Item item = factory.createItem();
				item.setName("name_" + i);
				names.add("name_" + i);

				list.getItem().add(item);
				list.getJoinedItem().add(item);

				final ContainedItem citem = factory.createContainedItem();
				citem.setName("cname_" + i);
				cnames.add("cname_" + i);
				list.getContainedItem().add(citem);
			}

			store.store(list.getItem());
			store.store(list);
			store.commitTransaction();
		}

		// remove(i), removeAll, move
		int removedContainedItems = 0;
		{
			store.beginTransaction();
			final ItemList list = store.getObject(ItemList.class);

			assertEquals(NO_ITEMS, list.getItem().size());
			assertEquals(NO_ITEMS, list.getContainedItem().size());

			// do some actions
			// remove from a certain position
			for (int i = 0; i < list.getContainedItem().size(); i++) {
				assertEquals(list, ((InternalEObject) list.getContainedItem().get(i)).eContainer());

				if (i % 2 == 0) {
					final String name = list.getContainedItem().get(i).getName();
					list.getContainedItem().remove(i);
					removedContainedItems++;
					cnames.remove(name); // remove from here to check later
				}
			}

			// test removeall
			final ArrayList<Item> tobeDeleted = new ArrayList<Item>();
			for (int i = 0; i < NO_ITEMS; i++) {
				assertTrue(list == list.getItem().get(i).getItemList());
				if (i % 2 == 0) {
					tobeDeleted.add(list.getItem().get(i));
					names.remove(list.getItem().get(i).getName());
				}
			}
			for (final Object o : tobeDeleted) {
				list.getItem().remove(o);
			}
			assertEquals(names.size(), list.getItem().size());

			// test move (should not really change anything)
			final Object obj = list.getItem().get(3);
			list.getItem().move(1, 3);
			assertEquals(1, list.getItem().indexOf(obj));

			store.store(list);
			store.commitTransaction();
		}

		int newCount = 0;
		{
			store.beginTransaction();
			final ItemList list = store.getObject(ItemList.class);

			final ArrayList<String> checkNames = new ArrayList<String>(names);
			final String lastName = "name_zzzz";
			for (int i = 0; i < list.getItem().size(); i++) {
				assertTrue(list.getItem().get(i).getName().compareTo(lastName) < 0);
				assertTrue(checkNames.remove(list.getItem().get(i).getName()));
			}
			assertEquals(0, checkNames.size());

			final ArrayList<String> checkCNames = new ArrayList<String>(cnames);
			for (int i = 0; i < list.getContainedItem().size(); i++) {
				assertTrue(checkCNames.remove(list.getContainedItem().get(i).getName()));
			}
			assertEquals(0, checkCNames.size());

			final ArrayList<Item> newList = new ArrayList<Item>();
			newCount = list.getItem().size();
			for (int i = 0; i < NO_ITEMS; i++) {
				final Item item = SetFactory.eINSTANCE.createItem();
				item.setName("do " + i);
				newList.add(item);
				newCount++;
				list.getItem().add(item);
			}
			// list.getItem().addAll(newList);

			store.store(list.getItem());
			store.store(list);
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			final ItemList list = store.getObject(ItemList.class);
			assertEquals(newCount, list.getItem().size());

			// all contained items should have been deleted
			assertEquals(NO_ITEMS - removedContainedItems, store.getObjects(ContainedItem.class).size());

			store.store(list.getItem());
			store.store(list);
			store.commitTransaction();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.test.AbstractTestAction#setExtensions(org.eclipse.emf.teneo.extension.ExtensionManager)
	 */
	@Override
	public void setExtensions(ExtensionManager extensionManager) {
		extensionManager.registerExtension(EntityNameStrategy.class.getName(), QualifyingEntityNameStrategy.class
			.getName());
		super.setExtensions(extensionManager);
	}
}