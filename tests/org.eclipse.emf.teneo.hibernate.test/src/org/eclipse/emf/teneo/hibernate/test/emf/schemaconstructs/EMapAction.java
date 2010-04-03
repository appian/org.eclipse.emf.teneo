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
 * $Id: EMapAction.java,v 1.1 2010/04/03 12:55:19 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.schemaconstructs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.LazyCollectionUtils;
import org.eclipse.emf.teneo.mapping.elist.PersistableDelegateList;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.Book;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.Category;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.EmapFactory;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.EmapPackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.Writer;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;
import org.eclipse.emf.teneo.type.PersistentStoreAdapter;
import org.eclipse.emf.teneo.util.StoreUtil;
import org.hibernate.collection.PersistentCollection;

/**
 * Tests support for emaps.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class EMapAction extends AbstractTestAction {

	private Date testDate = new Date();
	private long ONE_DAY = (long) 3600 * (long) 1000 * 24;

	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public EMapAction() {
		super(EmapPackage.eINSTANCE);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.teneo.test.AbstractTestAction#getExtraConfigurationProperties
	 * ()
	 */
	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.put(PersistenceOptions.EMAP_AS_TRUE_MAP, "true");
		return props;
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		{
			store.beginTransaction();
			store.store(createTestSet("prefix1"));
			store.store(createTestSet("prefix2"));
			store.commitTransaction();
		}
		
		// test lazy collections utils
		{
			store.beginTransaction();
			List<Book> lst = store.getObjects(Book.class);
			for (Iterator<Book> it = lst.iterator(); it.hasNext();) {
				final Book bk = it.next();
				testLazyCollectionUtils(bk.getWriters());
			}
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			List<Book> lst = store.getObjects(Book.class);
			for (Iterator<Book> it = lst.iterator(); it.hasNext();) {
				checkTestSet(it.next());
			}
			store.commitTransaction();
		}

		try {
			final Resource res = store.getResource();
			try {
				res.load(null);
			} catch (IOException e) {
				throw new IllegalStateException(e);
			}
			final ArrayList<Book> bks = new ArrayList<Book>();
			final ArrayList<Writer> ws = new ArrayList<Writer>();
			for (Object obj : res.getContents()) {
				if (obj instanceof Book) {
					final Book bk = (Book) obj;
					// check lazy load
					// assertTrue(!((PersistableDelegateList)bk.getWriters()).isLoaded());
					// now load
					assertTrue(bk.getWriters().size() == 2);
					bks.add(bk);
				} else {
					ws.add((Writer)obj);
				}
			}
			assertEquals(2, bks.size());
			assertEquals(4, ws.size());
			for (Iterator<Book> it = bks.iterator(); it.hasNext();) {
				final Book bk = it.next();
				int cntMatch = 0;
				for (int i = 0; i < ws.size(); i++) {
					if (bk.getCityByWriter().get(ws.get(i)) != null) {
						cntMatch++;
					}
				}
				assertEquals(2, cntMatch);
			}
			res.save(Collections.EMPTY_MAP);
			res.save(Collections.EMPTY_MAP);
			res.unload();
		} catch (Exception e) {
			throw new StoreTestException(
					"Exception when testing with resource", e);
		}

		{
			store.beginTransaction();
			List<Book> lst = store.getObjects(Book.class);
			for (Iterator<Book> it = lst.iterator(); it.hasNext();) {
				store.deleteObject(it.next());
			}
			store.commitTransaction();
		}

		try {
			store.beginTransaction();
			final Resource res = store.getResource();
			res.getContents().add(createTestSet("prefix1"));
			res.getContents().add(createTestSet("prefix1"));
			res.save(Collections.EMPTY_MAP);
			store.commitTransaction();
		} catch (Exception e) {
			throw new StoreTestException(
					"Exception when testing with resource", e);
		}

		{
			store.beginTransaction();
			final Book bk = createTestSet("prefix10");
			store.store(bk);			
			store.commitTransaction();

			final Writer w1 = EmapFactory.eINSTANCE.createWriter();
			w1.setName("10name1");
			bk.getWriters().put(w1.getName(), w1);
			bk.getCityByWriter().put(w1, "Utrecht");
			if (!isEAVTest()) {
				final PersistentStoreAdapter adapter = StoreUtil
						.getPersistentStoreAdapter(bk);
				final Object ws = adapter
						.getStoreCollection(EmapPackage.eINSTANCE
								.getBook_Writers());
				final Object cbws = adapter
						.getStoreCollection(EmapPackage.eINSTANCE
								.getBook_CityByWriter());
				checkEqual(ws, bk.getWriters());
				checkEqual(cbws, bk.getCityByWriter());
			}
		}
	}

	protected void checkEqual(Object o, List<?> l2) {
		final Map<?, ?> m1 = (Map<?, ?>) o;
		assertTrue(m1 != l2);
		assertTrue(m1.size() == l2.size());
		for (Object c : l2) {
			final Map.Entry<?, ?> entry = (Map.Entry<?, ?>) c;
			assertTrue(m1.get(entry.getKey()) != null);
		}
	}

	/** Create test set */
	private Book createTestSet(String prefix) {
		final EmapFactory factory = EmapFactory.eINSTANCE;
		final Writer w1 = factory.createWriter();
		w1.setName(prefix + "name1");
		final Writer w2 = factory.createWriter();
		w2.setName(prefix + "name2");
		final Book bk = factory.createBook();
		bk.setTitle(prefix);
		bk.getWriters().put(w1.getName(), w1);
		bk.getWriters().put(w2.getName(), w2);
		bk.getKeyWords().put(prefix + "_1", prefix + "_1_value");
		bk.getKeyWords().put(prefix + "_2", prefix + "_2_value");
		bk.getCityByWriter().put(w1, w2.getName());
		bk.getCityByWriter().put(w2, w1.getName());
		bk.getCategoryByDate().put(testDate, Category.COMPLEX);
		return bk;
	}

	/** Check test set */
	private void checkTestSet(Book bk) {
		final String prefix = bk.getTitle();
		final ArrayList<Writer> writers = new ArrayList<Writer>();
		for (Object element : bk.getWriters().keySet()) {
			final String key = (String) element;
			final Writer w = bk.getWriters().get(key);
			assertEquals(key, w.getName());
			assertTrue(key.startsWith(bk.getTitle()));
			writers.add(w);
		}
		assertEquals(2, writers.size());
		for (Object element : bk.getKeyWords().keySet()) {
			final String key = (String) element;
			final String value = bk.getKeyWords().get(key);
			assertTrue(key.startsWith(prefix));
			assertTrue(value.startsWith(key));
			assertTrue(value.endsWith("_value"));
		}
		final Writer writerOne = (Writer) writers.get(0);
		final Writer writerTwo = (Writer) writers.get(1);
		final String c1 = bk.getCityByWriter().get(writerOne);
		final String c2 = bk.getCityByWriter().get(writerTwo);
		assertEquals(c1, writerTwo.getName());
		assertEquals(c2, writerOne.getName());

		Date dt = bk.getCategoryByDate().get(0).getKey();
		assertTrue(Math.abs(testDate.getTime() - dt.getTime()) < ONE_DAY);
		assertEquals(bk.getCategoryByDate().get(0).getValue(), Category.COMPLEX);
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

		final LazyCollectionUtils.PagingIterator<?> iterator = (LazyCollectionUtils.PagingIterator<?>)LazyCollectionUtils
				.getPagedLoadingIterator(list, 5);
		iterator.setOrderBy("order by this.name desc");
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
