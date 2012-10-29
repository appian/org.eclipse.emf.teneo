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
 * $Id: ExtraLazySetAction.java,v 1.2 2010/04/04 12:12:22 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.annotations;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.LazyCollectionUtils;
import org.eclipse.emf.teneo.mapping.elist.PersistableEList;
import org.eclipse.emf.teneo.samples.emf.annotations.set.ItemList;
import org.eclipse.emf.teneo.test.stores.TestStore;
import org.hibernate.collection.spi.PersistentCollection;

/**
 * Tests the Set collection in extra lazy mode.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class ExtraLazySetAction extends SetAction {

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		// this option is required, see comment in superclass
		props.setProperty(PersistenceOptions.SQL_CASE_STRATEGY, "uppercase");
		props.setProperty(PersistenceOptions.FETCH_ASSOCIATION_EXTRA_LAZY, "true");
		return props;
	}

	@Override
	public void doAction(TestStore store) {
		super.doAction(store);
		{
			store.beginTransaction();
			final ItemList itemList = store.getObject(ItemList.class);
			testLazyList(itemList.getItem());
			testLazyList(itemList.getJoinedItem());
			store.commitTransaction();
		}

		doCleanListItem(store);
	}

	protected void cleanListItem(TestStore store) {

	}

	// delete, this prevents an error in hsqldb when SetAction and
	// ExtraLazySetAction
	// are both run
	protected void doCleanListItem(TestStore store) {
		store.beginTransaction();
		final ItemList itemList = store.getObject(ItemList.class);
		for (Object o : itemList.getItem()) {
			store.deleteObject(o);
		}
		for (Object o : itemList.getJoinedItem()) {
			store.deleteObject(o);
		}
		store.deleteObject(itemList);
		store.commitTransaction();
	}

	protected void testLazyList(List<?> list) {
		final PersistableEList<?> persistableEList = (PersistableEList<?>) list;
		final PersistentCollection persistentCollection = (PersistentCollection) persistableEList
				.getDelegate();
		assertFalse(persistentCollection.wasInitialized());
		assertFalse(persistableEList.isLoaded());

		// test the size operation
		int size = LazyCollectionUtils.size(list);
		assertTrue(size > 0);
		size = list.size();
		assertTrue(size > 0);
		assertFalse(persistentCollection.wasInitialized());
		assertFalse(persistableEList.isLoaded());

		// test the iterator
		int index = 0;
		for (Object o : list) {
			index++;
			assertTrue(o != null);
		}
		assertEquals(size, index);
		assertFalse(persistentCollection.wasInitialized());
		assertFalse(persistableEList.isLoaded());

		final Iterator<?> iterator = LazyCollectionUtils.getPagedLoadingIterator(list, 5);
		index = 0;
		while (iterator.hasNext()) {
			index++;
			Object o = iterator.next();
			assertTrue(o != null);
		}
		assertEquals(size, index);
		assertFalse(persistentCollection.wasInitialized());
		assertFalse(persistableEList.isLoaded());

	}
}