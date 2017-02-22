/**
 * <copyright>
 *
 * Copyright (c) 2017 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: LibraryResourceAction.java,v 1.20 2010/02/07 23:12:02 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.issues;

import org.eclipse.emf.teneo.samples.issues.refreshextra.ItemContainer;
import org.eclipse.emf.teneo.samples.issues.refreshextra.ItemContainer2;
import org.eclipse.emf.teneo.samples.issues.refreshextra.ItemElement;
import org.eclipse.emf.teneo.samples.issues.refreshextra.ItemElementBidir;
import org.eclipse.emf.teneo.samples.issues.refreshextra.ItemNonContainer;
import org.eclipse.emf.teneo.samples.issues.refreshextra.RefreshextraFactory;
import org.eclipse.emf.teneo.samples.issues.refreshextra.RefreshextraPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests the refreshing of an object outside of a resource.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.20 $
 */
public class RefreshObjectNoResourceTestAction extends AbstractTestAction {
	public RefreshObjectNoResourceTestAction() {
		super(RefreshextraPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		testNonContained(store);
		testContained(store);
		testContainedBidir(store);
	}

	private void testContained(TestStore store) {
		final RefreshextraFactory factory = RefreshextraFactory.eINSTANCE;

		{
			store.beginTransaction();
			final ItemContainer ic = factory.createItemContainer();
			ic.setName("ic1");
			final ItemElement element = factory.createItemElement();
			element.setName("ie1");
			ic.getElements().add(element);
			store.store(element);
			store.store(ic);
			store.commitTransaction();
		}

		// with pre-accessing the list
		{
			store.beginTransaction();
			final ItemContainer ic = store.getObject(ItemContainer.class);
			assertTrue(ic.getElements().size() == 1);
			Object collection = ic.getElements();
			ItemElement ie = ic.getElements().get(0);
			assertTrue(ie.eContainer() == ic);

			store.refresh(ic);

			// after refresh the collection is the same and the element
			// is also the same object and the parent should be the same to
			assertTrue(ie == ic.getElements().get(0));
			assertTrue(collection == ic.getElements());
			assertTrue(ie.eContainer() == ic);
			store.commitTransaction();
		}

		// with pre-accessing the list
		{
			store.beginTransaction();
			final ItemContainer ic = store.getObject(ItemContainer.class);

			store.refresh(ic);

			// after refresh the collection is the same and the element
			// is also the same object and the parent should be the same to
			ItemElement ie = ic.getElements().get(0);
			assertTrue(ie == ic.getElements().get(0));
			assertTrue(ie.eContainer() == ic);

			// clean up
			store.deleteObject(ic);
			store.flush();

			// was contained relation so child should gave gone to
			store.checkNumber(ItemElement.class, 0);
			store.checkNumber(ItemContainer.class, 0);
			store.commitTransaction();
		}
	}

	private void testContainedBidir(TestStore store) {
		final RefreshextraFactory factory = RefreshextraFactory.eINSTANCE;

		{
			store.beginTransaction();
			final ItemContainer2 ic2 = factory.createItemContainer2();
			ic2.setName("ic1");
			final ItemElementBidir element = factory.createItemElementBidir();
			element.setName("ie1");
			ic2.getElements().add(element);
			store.store(ic2);
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			final ItemContainer2 ic = store.getObject(ItemContainer2.class);
			assertTrue(ic.getElements().size() == 1);
			Object collection = ic.getElements();
			ItemElementBidir ie = ic.getElements().get(0);
			assertTrue(ie.eContainer() == ic);
			assertTrue(ie.getItem() == ic);

			store.refresh(ic);

			// after refresh the collection is the same and the element
			// is also the same object and the parent is the same object
			assertTrue(ie == ic.getElements().get(0));
			assertTrue(collection == ic.getElements());
			assertTrue(ie.eContainer() == ic);
			assertTrue(ie.getItem() == ic);

			// clean up
			store.deleteObject(ic);
			store.flush();

			// was contained relation so child should gave gone to
			store.checkNumber(ItemContainer2.class, 0);
			store.checkNumber(ItemElementBidir.class, 0);
			store.commitTransaction();
		}
	}

	private void testNonContained(TestStore store) {
		final RefreshextraFactory factory = RefreshextraFactory.eINSTANCE;

		{
			store.beginTransaction();
			final ItemNonContainer inc = factory.createItemNonContainer();
			inc.setName("inc1");
			final ItemElement element = factory.createItemElement();
			element.setName("ie1");
			inc.getElements().add(element);
			store.store(element);
			store.store(inc);
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			final ItemNonContainer inc = store.getObject(ItemNonContainer.class);
			assertTrue(inc.getElements().size() == 1);
			Object collection = inc.getElements();
			ItemElement ie = inc.getElements().get(0);
			store.refresh(inc);
			assertTrue(ie == inc.getElements().get(0));
			assertTrue(collection == inc.getElements());
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			final ItemNonContainer inc = store.getObject(ItemNonContainer.class);
			store.refresh(inc);
			assertTrue(inc.getElements().size() == 1);
			final ItemElement ie = inc.getElements().get(0);

			// clean up
			inc.getElements().clear();
			store.deleteObject(ie);
			store.deleteObject(inc);
			store.flush();

			store.checkNumber(ItemElement.class, 0);
			store.checkNumber(ItemNonContainer.class, 0);

			store.commitTransaction();
		}
	}
}
