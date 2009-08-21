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
 * $Id: EMapEAVAction.java,v 1.1 2009/08/21 15:02:11 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.annotations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.samples.emf.annotations.mapkey.Book;
import org.eclipse.emf.teneo.samples.emf.annotations.mapkey.MapkeyFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.mapkey.MapkeyPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.mapkey.Writer;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests featuremap with a EAV mapping.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class EMapEAVAction extends AbstractTestAction {

	public EMapEAVAction() {
		super(MapkeyPackage.eINSTANCE);
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.EAV_MAPPING, "true");
		props.setProperty(PersistenceOptions.EMAP_AS_TRUE_MAP, "false");
		return props;
	}

	/**
	 * Check test set, note a where clause has been set on the relation Only writers with name martin are returned
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
		assertEquals(2, writers.size());
		if (bk.getTitle().length() == 0) {
			final Writer writerOne = writers.get(0);
			assertEquals(writerOne.getName(), "martin");
		} else {
			final Writer writerOne = writers.get(1);
			assertEquals(writerOne.getName(), "prefix2martin2");
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
					assertEquals(2, bk.getWriters().size());
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
			throw new StoreTestException("Exception when testing with resource", e);
		}

		{
			store.beginTransaction();
			final Book bk = createTestSet("PSA");
			store.store(bk);
			store.commitTransaction();
			final Writer w = MapkeyFactory.eINSTANCE.createWriter();
			w.setName("PSAmartin2");
			bk.getWriters().put(w.getName(), w);
			store.beginTransaction();
			store.store(bk);
			store.commitTransaction();
		}
	}
}
