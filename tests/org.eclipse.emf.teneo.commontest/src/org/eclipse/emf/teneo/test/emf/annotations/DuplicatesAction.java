/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * DuplicatesAction.java,v 1.3 2007/02/05 15:35:34 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;

import org.eclipse.emf.teneo.samples.emf.annotations.duplicates.ChildItem;
import org.eclipse.emf.teneo.samples.emf.annotations.duplicates.DuplicatesFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.duplicates.DuplicatesPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.duplicates.Item;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Testcase
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */
public class DuplicatesAction extends AbstractTestAction {
	/** No of childitems */
	private static final int NO_CHILDS = 5;

	/**
	 * Constructor
	 */
	public DuplicatesAction() {
		super(DuplicatesPackage.eINSTANCE);
	}

	/** Test */
	@Override
	public void doAction(TestStore store) {
		final DuplicatesFactory factory = DuplicatesFactory.eINSTANCE;
		// create a book, writer and library
		{
			store.beginTransaction();

			final Item item = factory.createItem();
			final ChildItem ci = factory.createChildItem();
			ci.setName("mychild");
			for (int i = 0; i < NO_CHILDS; i++) {
				item.getChildItem().add(ci);
			}

			item.setName("myitem");
			store.store(item);
			store.commitTransaction();
		}

		// read back and check it
		{
			store.beginTransaction();
			final Item item = (Item) store.getObject(Item.class);
			// assertEquals(NO_CHILDS, item.getChildItem().size());
			for (int i = 0; i < item.getChildItem().size(); i++) {
				assertTrue(item.getChildItem().get(i) == item.getChildItem().get(0));
			}
			store.commitTransaction();
		}
	}
}