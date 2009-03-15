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
 * $Id: MapKeyAction.java,v 1.7 2009/03/15 08:09:27 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.mapping.elist.PersistableDelegateList;
import org.eclipse.emf.teneo.samples.emf.annotations.mapkey.Book;
import org.eclipse.emf.teneo.samples.emf.annotations.mapkey.MapkeyFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.mapkey.MapkeyPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.mapkey.Writer;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;
import org.eclipse.emf.teneo.type.PersistentStoreAdapter;
import org.eclipse.emf.teneo.util.StoreUtil;

/**
 * Tests support for emaps.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.7 $
 */
public class MapKeyAction extends AbstractTestAction {
	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public MapKeyAction() {
		super(MapkeyPackage.eINSTANCE);
	}

	// set the table/column names to uppercase otherwise this testcase will fail
	// with hsqldb because hibernate does not escape the order by clause in a
	// query.
	// Caused by: java.sql.SQLException: Column not found: ITEM0_.NAME in
	// statement [select item0_."item_itemlist_e_id" as item4_1_,
	// item0_.e_id as e1_1_, item0_.e_id as e1_575_0_, item0_.e_version as
	// e2_575_0_, item0_."name" as name3_575_0_, item0_."item_itemlist_e_id"
	// as item4_575_0_ from "testset_item" item0_ where
	// item0_."item_itemlist_e_id"=?
	// order by item0_.name desc]
	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.SQL_CASE_STRATEGY, "uppercase");
		props.put(PersistenceOptions.EMAP_AS_TRUE_MAP, "true");
		return props;
	}

	/**
	 * Check test set, note a where clause has been set on the relation Only
	 * writers with name martin are returned
	 */
	private void checkTestSet(Book bk) {
		// final String prefix = bk.getTitle();
		final ArrayList<Writer> writers = new ArrayList<Writer>();
		for (final Object element : bk.getWriters().keySet()) {
			final String key = (String) element;
			final Writer w = bk.getWriters().get(key);
			assertEquals(key, w.getName());
			assertTrue(key.startsWith(bk.getTitle()));
			writers.add(w);
		}
		if (bk.getTitle().length() == 0) {
			assertEquals(1, writers.size());
			final Writer writerOne = writers.get(0);
			assertEquals(writerOne.getName(), "martin");
		} else {
			assertEquals(0, writers.size());
		}
	}

	/** Create test set */
	private Book createTestSet(String prefix) {
		final MapkeyFactory factory = MapkeyFactory.eINSTANCE;
		final Writer w1 = factory.createWriter();
		w1.setName(prefix + "martin");
		final Writer w2 = factory.createWriter();
		w2.setName(prefix + "martin2");
		final Book bk = factory.createBook();
		bk.setTitle(prefix);
		bk.getWriters().put(w1.getName(), w1);
		bk.getWriters().put(w2.getName(), w2);
		return bk;
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		{
			store.beginTransaction();
			store.store(createTestSet(""));
			store.store(createTestSet("prefix2"));
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			final List<?> lst = store.getObjects(Book.class);
			for (Object name : lst) {
				checkTestSet((Book) name);
			}
			store.commitTransaction();
		}

		try {
			final Resource res = store.getResource();
			res.load(null);
			final ArrayList<Book> bks = new ArrayList<Book>();
			final ArrayList<Object> ws = new ArrayList<Object>();
			for (final Object obj : res.getContents()) {
				if (obj instanceof Book) {
					final Book bk = (Book) obj;
					if (bk.getWriters() instanceof PersistableDelegateList) {
						// check lazy load
						// assertTrue(!((PersistableDelegateList)bk.getWriters()).isLoaded());
						// now load
						if (bk.getTitle().length() == 0) {
							assertEquals(1, bk.getWriters().size());
						} else {
							assertEquals(0, bk.getWriters().size());
						}

						// disabled as hibernate and jpox differ here
						assertTrue(!((PersistableDelegateList<?>) bk
								.getWriters()).isLoaded());
					} else {
						fail("Type not supported "
								+ bk.getWriters().getClass().getName());
					}
					bks.add(bk);
				} else {
					ws.add(obj);
				}
			}
			assertTrue(bks.size() == 2);
			assertTrue(ws.size() == 4);
			res.save(Collections.EMPTY_MAP);
			res.save(Collections.EMPTY_MAP);
			res.unload();
		} catch (final Exception e) {
			throw new StoreTestException(
					"Exception when testing with resource", e);
		}

		// test PersistentStoreAdapter
		{
			store.beginTransaction();
			final Book bk = createTestSet("PSA");
			store.store(bk);
			store.commitTransaction();
			final Writer w = MapkeyFactory.eINSTANCE.createWriter();
			w.setName("PSAmartin2");
			bk.getWriters().put(w.getName(), w);

			PersistentStoreAdapter adapter = StoreUtil
					.getPersistentStoreAdapter(bk);
			final Object value = adapter
					.getStoreCollection(MapkeyPackage.eINSTANCE
							.getBook_Writers());
			compareMaps((Map<?, ?>) value, bk.getWriters());
		}
	}

	// compare maps
	private void compareMaps(Map<?, ?> m1, EMap<?, ?> m2) {
		assertTrue(m1 != m2);
		assertEquals(m1.size(), m2.size());
		for (Object key1 : m1.keySet()) {
			final Object v2 = m2.get(key1);
			final Object v1 = m1.get(key1);
			assertTrue(v1 == v2);
		}
	}

}
