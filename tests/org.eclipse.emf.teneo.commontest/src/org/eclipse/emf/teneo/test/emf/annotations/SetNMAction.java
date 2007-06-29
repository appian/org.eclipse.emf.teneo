/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: SetNMAction.java,v 1.3 2007/06/29 07:35:43 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.teneo.samples.emf.annotations.nmset.MyItem;
import org.eclipse.emf.teneo.samples.emf.annotations.nmset.NmsetFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.nmset.NmsetPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.nmset.YourItem;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests an nm relation using sets on both sides.
 *  
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $ 
 */
public class SetNMAction extends AbstractTestAction {
	/** The number of testitems created */
	private static int NO_ITEMS = 10;

	/**
	 * Constructor for ClassHierarchyParsing.
	 * @param arg0
	 */
	public SetNMAction() {
		super(NmsetPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		final NmsetFactory factory = NmsetFactory.eINSTANCE;
		// create a book, writer and library
		{
			store.beginTransaction();

			final ArrayList<MyItem> myItems = new ArrayList<MyItem>();
			for (int i = 0; i < NO_ITEMS; i++) {
				final MyItem myitem = factory.createMyItem();
				myitem.setName("myname_" + i);
				myItems.add(myitem);
				store.store(myitem);
			}
			for (int i = 0; i < NO_ITEMS; i++) {
				final YourItem youritem = factory.createYourItem();
				youritem.setName("yourname_" + i);
				youritem.getMyItem().addAll(myItems);
				store.store(youritem);
			}
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			final List<?> list = store.getObjects(MyItem.class);
			assertTrue(list.size() == NO_ITEMS);
			for (int i = 0; i < list.size(); i++) {
				assertEquals(NO_ITEMS, ((MyItem) list.get(i)).getYourItem().size());
				((MyItem) list.get(i)).getYourItem().remove(i);
			}
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			final List<?> list = store.getObjects(MyItem.class);
			assertTrue(list.size() == NO_ITEMS);
			for (int i = 0; i < list.size(); i++) {
				assertEquals(NO_ITEMS - 1, ((MyItem) list.get(i)).getYourItem().size());
				if (i < list.size() - 1) {
					assertEquals("yourname_" + (i + 1), (((MyItem) list.get(i)).getYourItem().get(i)).getName());
				}
			}
			store.commitTransaction();
		}
	}
}
