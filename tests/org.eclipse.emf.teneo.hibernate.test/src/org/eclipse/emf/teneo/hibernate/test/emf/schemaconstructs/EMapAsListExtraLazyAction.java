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
 * $Id: EMapAsListExtraLazyAction.java,v 1.3 2010/04/05 06:00:48 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.schemaconstructs;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.LazyCollectionUtils;
import org.eclipse.emf.teneo.mapping.elist.PersistableDelegateList;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.Book;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.EmapFactory;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.Writer;
import org.eclipse.emf.teneo.test.stores.TestStore;
import org.hibernate.collection.spi.PersistentCollection;

/**
 * Tests support for emaps with extra lazy.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class EMapAsListExtraLazyAction extends EMapAsListAction {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.test.AbstractTestAction#getExtraConfigurationProperties ()
	 */
	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.put(PersistenceOptions.EMAP_AS_TRUE_MAP, "false");
		props.put(PersistenceOptions.FETCH_ASSOCIATION_EXTRA_LAZY, "true");
		return props;
	}

	@Override
	public void doAction(TestStore store) {
		super.doAction(store);

		// test lazy behavior of the collection itself
		{
			store.beginTransaction();
			List<Book> lst = store.getObjects(Book.class);
			for (Iterator<Book> it = lst.iterator(); it.hasNext();) {
				Book bk = it.next();
				// size
				final int initialSize = bk.getWriters().size();
				assertEquals(2, initialSize);
				testLazy(bk.getWriters());

				// isEmpty
				assertTrue(!bk.getWriters().isEmpty());
				testLazy(bk.getWriters());

				// iteration
				final Iterator<?> iterator = bk.getWriters().iterator();
				assertTrue(iterator instanceof LazyCollectionUtils.PagingIterator<?>);
				while (iterator.hasNext()) {
					assertNotNull(iterator.next());
				}
				testLazy(bk.getWriters());

				// get
				final Writer w1 = bk.getWriters().get(bk.getTitle() + "name1");
				final Writer w2 = bk.getWriters().get(bk.getTitle() + "name2");
				assertNotNull(w1);
				assertNotNull(w2);
				testLazy(bk.getWriters());

				// put
				final Writer w3 = EmapFactory.eINSTANCE.createWriter();
				w3.setName(bk.getTitle() + "name3");
				bk.getWriters().put(w3.getName(), w3);
				assertEquals(initialSize + 1, bk.getWriters().size());
				testLazy(bk.getWriters());
			}
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			for (Book bk : store.getObjects(Book.class)) {
				store.deleteObject(bk);
			}
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			final EmapFactory factory = EmapFactory.eINSTANCE;
			final Book bk = factory.createBook();
			bk.setTitle("title");

			final Writer w1 = factory.createWriter();
			w1.setName("name1");
			bk.getWriters().put(w1.getName(), w1);

			store.store(bk);

			final Writer w2 = factory.createWriter();
			w2.setName("name2");
			bk.getWriters().put(w2.getName(), w2);
			bk.getKeyWords().put("1", "1_value");
			bk.getKeyWords().put("2", "2_value");
			bk.getCityByWriter().put(w1, w2.getName());
			bk.getCityByWriter().put(w2, w1.getName());
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			final Book bk = store.getObject(Book.class);
			assertNotNull(bk.getWriters().get("name1"));
			assertNotNull(bk.getWriters().get("name2"));
			assertEquals(2, bk.getWriters().size());
			assertNotNull(bk.getKeyWords().get("1"));
			assertNotNull(bk.getKeyWords().get("2"));
			assertEquals(2, bk.getKeyWords().size());
			assertNotNull(bk.getCityByWriter().get(bk.getWriters().get(0).getValue()));
			assertNotNull(bk.getCityByWriter().get(bk.getWriters().get(1).getValue()));
			store.commitTransaction();
		}
	}

	protected void testLazy(List<?> list) {
		final PersistableDelegateList<?> persistableEList = (PersistableDelegateList<?>) list;
		final PersistentCollection persistentCollection = (PersistentCollection) persistableEList
				.getDelegate();
		assertFalse(persistentCollection.wasInitialized());
		assertFalse(persistableEList.isLoaded());
	}

	protected void testLazyCollectionUtils(List<?> list) {
		final PersistableDelegateList<?> persistableEList = (PersistableDelegateList<?>) list;
		final PersistentCollection persistentCollection = (PersistentCollection) persistableEList
				.getDelegate();
		assertFalse(persistentCollection.wasInitialized());
		assertFalse(persistableEList.isLoaded());

		// test the size operation
		int size = LazyCollectionUtils.size(list);
		assertTrue(size > 0);
		assertFalse(persistentCollection.wasInitialized());
		assertFalse(persistableEList.isLoaded());

		final LazyCollectionUtils.PagingIterator<?> iterator = (LazyCollectionUtils.PagingIterator<?>) LazyCollectionUtils
				.getPagedLoadingIterator(list, 5);
		int index = 0;
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
