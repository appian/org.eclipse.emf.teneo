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

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.teneo.hibernate.resource.HibernateResource;
import org.eclipse.emf.teneo.resource.StoreResource;
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
 * Tests the refreshing of an object using a resource.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.20 $
 */
public class RefreshObjectWithResourceTestAction extends AbstractTestAction {
	public RefreshObjectWithResourceTestAction() {
		super(RefreshextraPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		try {
			testNonContained(store);
			testContained(store);
			testContainedBidir(store);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private void testContained(TestStore store) throws Exception {
		final RefreshextraFactory factory = RefreshextraFactory.eINSTANCE;

		{
			Resource res = store.getResource();
			res.load(null);
			final ItemContainer ic = factory.createItemContainer();
			ic.setName("ic1");
			final ItemElement element = factory.createItemElement();
			element.setName("ie1");
			ic.getElements().add(element);
			res.getContents().add(ic);
			res.save(null);
		}
		{
			Resource res = store.getResource();
			res.load(null);
			final ItemContainer ic = (ItemContainer) res.getContents().get(0);
			assertTrue(ic.getElements().size() == 1);
			Object collection = ic.getElements();
			ItemElement ie = ic.getElements().get(0);
			assertTrue(ie.eContainer() == ic);

			((HibernateResource) res).getSessionWrapper().refresh(ic);

			// after refresh the collection is the same and the element
			// is also the same object and the parent should be the same to
			assertTrue(ie == ic.getElements().get(0));
			assertTrue(collection == ic.getElements());
			assertTrue(ie.eContainer() == ic);

			// clean up
			res.getContents().remove(0);
			res.save(null);

			// was contained relation so child should gave gone to
			store.beginTransaction();
			store.checkNumber(ItemElement.class, 0);
			store.checkNumber(ItemContainer.class, 0);
			store.commitTransaction();
		}
	}

	private void testContainedBidir(TestStore store) throws Exception {
		final RefreshextraFactory factory = RefreshextraFactory.eINSTANCE;

		{
			Resource res = store.getResource();
			res.load(null);
			final ItemContainer2 ic2 = factory.createItemContainer2();
			ic2.setName("ic1");
			final ItemElementBidir element = factory.createItemElementBidir();
			element.setName("ie1");
			ic2.getElements().add(element);
			res.getContents().add(ic2);
			res.save(null);

			// check the counts
			store.beginTransaction();
			store.checkNumber(ItemContainer2.class, 1);
			store.checkNumber(ItemElementBidir.class, 1);
			store.commitTransaction();
		}
		{
			Resource res = store.getResource();
			res.load(null);
			final ItemContainer2 ic = (ItemContainer2) res.getContents().get(0);
			assertTrue(ic.getElements().size() == 1);
			Object collection = ic.getElements();
			ItemElementBidir ie = ic.getElements().get(0);
			assertTrue(ie.eContainer() == ic);
			assertTrue(ie.getItem() == ic);

			((HibernateResource) res).getSessionWrapper().refresh(ic);

			// after refresh the collection is the same and the element
			// is also the same object and the parent is the same object
			assertTrue(ie == ic.getElements().get(0));
			assertTrue(collection == ic.getElements());
			assertTrue(ie.eContainer() == ic);
			assertTrue(ie.getItem() == ic);

			// clean up
			res.getContents().clear();
			res.save(null);

			// was contained relation so child should gave gone to
			store.beginTransaction();
			store.checkNumber(ItemContainer2.class, 0);
			store.checkNumber(ItemElementBidir.class, 0);
			store.commitTransaction();
		}
	}

	private void testNonContained(TestStore store) throws Exception {
		final RefreshextraFactory factory = RefreshextraFactory.eINSTANCE;

		{
			Resource res = store.getResource();
			res.load(null);
			final ItemNonContainer inc = factory.createItemNonContainer();
			inc.setName("inc1");
			final ItemElement element = factory.createItemElement();
			element.setName("ie1");
			inc.getElements().add(element);
			res.getContents().add(inc);
			res.getContents().add(element);
			res.save(null);

			store.beginTransaction();
			store.checkNumber(ItemElement.class, 1);
			store.checkNumber(ItemNonContainer.class, 1);
			store.commitTransaction();
		}
		{
			Resource res = store.getResource();
			res.load(null);
			final ItemNonContainer inc = (ItemNonContainer) res.getContents().get(0);
			assertTrue(inc.getElements().size() == 1);
			Object collection = inc.getElements();
			ItemElement ie = inc.getElements().get(0);

			((HibernateResource) res).getSessionWrapper().refresh(inc);

			assertTrue(ie == inc.getElements().get(0));
			assertTrue(collection == inc.getElements());
			res.unload();
		}
		{
			Resource res = store.getResource();
			Map<String, String> options = new HashMap<String, String>();
			options.put(StoreResource.LOAD_STRATEGY_PARAM, StoreResource.ADD_TO_CONTENTS);
			res.load(options);
			final ItemNonContainer inc = (ItemNonContainer) res.getContents().get(0);
			((HibernateResource) res).getSessionWrapper().refresh(inc);
			assertTrue(inc.getElements().size() == 1);

			// clean up
			final Collection<?> collection = res.getContents();
			collection.clear();
			res.save(null);

			store.beginTransaction();
			store.checkNumber(ItemElement.class, 0);
			store.checkNumber(ItemNonContainer.class, 0);
			store.commitTransaction();
		}
	}
}
