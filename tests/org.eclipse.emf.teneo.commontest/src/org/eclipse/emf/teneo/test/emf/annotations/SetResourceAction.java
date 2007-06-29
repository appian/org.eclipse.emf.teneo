/**
 * <copyright> Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * SetResourceAction.java,v 1.4 2007/02/08 23:11:22 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.samples.emf.annotations.set.ContainedItem;
import org.eclipse.emf.teneo.samples.emf.annotations.set.Item;
import org.eclipse.emf.teneo.samples.emf.annotations.set.ItemList;
import org.eclipse.emf.teneo.samples.emf.annotations.set.SetFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.set.SetPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests the library example of emf/xsd using a resource. Actually tests bidirectional references
 * using resources. Most other aspects of resources are handled in the Catalog example.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $
 */
public class SetResourceAction extends AbstractTestAction {
	/** The number of testitems created */
	private static int NO_ITEMS = 10;

	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public SetResourceAction() {
		super(SetPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		final SetFactory factory = SetFactory.eINSTANCE;

		// create a book, writer and library
		try {
			final ArrayList<String> names = new ArrayList<String>();
			final ArrayList<String> cnames = new ArrayList<String>();
			{
				final Resource res = store.getResource();
				res.load(null);

				final ItemList list = factory.createItemList();
				list.setName("name");

				for (int i = 0; i < NO_ITEMS; i++) {
					final Item item = factory.createItem();
					item.setName("name_" + i);
					names.add("name_" + i);
					list.getItem().add(item);

					final ContainedItem citem = factory.createContainedItem();
					citem.setName("cname_" + i);
					cnames.add("cname_" + i);
					list.getContainedItem().add(citem);

					final Item joinedItem = factory.createItem();
					joinedItem.setName("joinedname_" + i);
					list.getJoinedItem().add(joinedItem);
				}

				res.getContents().add(list);
				res.save(null);
				res.unload();
			}

			// remove(i), removeAll, move
			{
				final Resource res = store.getResource();
				res.load(null);
				ItemList list = null;
				for (int i = 0; i < res.getContents().size(); i++) {
					if (res.getContents().get(i) instanceof ItemList) {
						list = (ItemList) res.getContents().get(i);
					}
				}

				assertEquals(NO_ITEMS, list.getItem().size());
				assertEquals(NO_ITEMS, list.getContainedItem().size());
				assertEquals(NO_ITEMS, list.getJoinedItem().size());

				// do some actions
				// remove from a certain position
				for (int i = 0; i < list.getContainedItem().size(); i++) {
					assertEquals(list, ((InternalEObject) list.getContainedItem().get(i)).eContainer());
					if (i % 2 == 0) {
						final ContainedItem citem = list.getContainedItem().get(i);
						cnames.remove(citem.getName()); // remove from here to check later
						list.getContainedItem().remove(i);
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

				res.save(null);
				res.unload();
			}

			int newCount = 0;
			{
				final Resource res = store.getResource();
				res.load(null);
				ItemList list = null;
				for (int i = 0; i < res.getContents().size(); i++) {
					if (res.getContents().get(i) instanceof ItemList) {
						list = (ItemList) res.getContents().get(i);
					}
				}

				final ArrayList<String> checkNames = new ArrayList<String>(names);
				for (int i = 0; i < list.getItem().size(); i++) {
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
				}
				final EList<Item> myList = list.getItem();
				myList.addAll(newList);
				res.save(null);
				res.unload();
			}

			{
				final Resource res = store.getResource();
				res.load(null);
				ItemList list = null;
				for (int i = 0; i < res.getContents().size(); i++) {
					if (res.getContents().get(i) instanceof ItemList) {
						list = (ItemList) res.getContents().get(i);
					}
				}
				assertEquals(newCount, list.getItem().size());
				res.save(null);
				res.unload();
			}
		} catch (final IOException e) {
			throw new StoreTestException("IOException during save", e);
		}
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.SET_DEFAULT_CASCADE_ON_NON_CONTAINMENT, "true");
		return props;
	}
}
