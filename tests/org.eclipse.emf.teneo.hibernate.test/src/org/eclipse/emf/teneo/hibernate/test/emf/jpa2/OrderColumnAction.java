/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * SetResourceAction.java,v 1.4 2007/02/08 23:11:22 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.jpa2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.samples.emf.jpa2.ordercolumn.Item;
import org.eclipse.emf.teneo.samples.emf.jpa2.ordercolumn.ItemList;
import org.eclipse.emf.teneo.samples.emf.jpa2.ordercolumn.OrdercolumnFactory;
import org.eclipse.emf.teneo.samples.emf.jpa2.ordercolumn.OrdercolumnPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * OrderColumn test
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.8 $
 */
public class OrderColumnAction extends AbstractTestAction {
	/** The number of testitems created */
	private static int NO_ITEMS = 10;

	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public OrderColumnAction() {
		super(OrdercolumnPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		final OrdercolumnFactory factory = OrdercolumnFactory.eINSTANCE;

		// create a book, writer and library
		try {
			final ArrayList<String> names = new ArrayList<String>();
			{
				final Resource res = store.getResource();
				res.load(null);

				final ItemList list = factory.createItemList();
				list.setName("name");

				for (int i = 0; i < NO_ITEMS; i++) {
					final Item item = factory.createItem();
					item.setName("aaa_" + (i-10));
					item.setName2("name_" + (i-10));
					names.add("name_" + (i-10));
					list.getItem().add(item);
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

				assert (list != null);
				assertEquals(NO_ITEMS, list.getItem().size());

				// test move (should not really change anything)
				final Object obj = list.getItem().get(3);
				list.getItem().move(1, 3);
				assertEquals(1, list.getItem().indexOf(obj));

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

				assert (list != null);

				for (int i = 0; i < list.getItem().size(); i++) {
					assertTrue(list.getItem().get(i).getName2().equals(names.get(i)));
				}
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
