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
 * $Id: MapKeyAction.java,v 1.1 2007/03/18 19:18:27 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

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

/**
 * Tests support for emaps.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
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

	/* (non-Javadoc)
	 * @see org.eclipse.emf.teneo.test.AbstractTestAction#getExtraConfigurationProperties()
	 */
	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.put(PersistenceOptions.EMAP_AS_TRUE_MAP, "true");
		return props;
	}

	/** Creates an item, an address and links them to a po. */
	public void doAction(TestStore store) {
//		store.disableDrop();
		{
			store.beginTransaction();
			store.store(createTestSet(""));
			store.store(createTestSet("prefix2"));
			store.commitTransaction();
		}
		
		{
			store.beginTransaction();
			List lst = store.getObjects(Book.class);
			for (Iterator it = lst.iterator(); it.hasNext();) {
				checkTestSet((Book)it.next());
			}
			store.commitTransaction();
		}
		
		try {
			final Resource res = store.getResource();
			final ArrayList bks = new ArrayList();
			final ArrayList ws = new ArrayList();
			for (Iterator it = res.getContents().iterator(); it.hasNext();) {
				final Object obj = it.next();
				if (obj instanceof Book) {
					final Book bk = (Book)obj;
					if (bk.getWriters() instanceof PersistableDelegateList) {
						// check lazy load
						//assertTrue(!((PersistableDelegateList)bk.getWriters()).isLoaded());
						// now load
						if (bk.getTitle().length() == 0) {
							assertEquals(1, bk.getWriters().size());
						} else {
							assertEquals(0, bk.getWriters().size());
						}
						
						// disabled as hibernate and jpox differ here
						assertTrue(!((PersistableDelegateList)bk.getWriters()).isLoaded());
					} else {
						fail("Type not supported " + bk.getWriters().getClass().getName());
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
		} catch (Exception e) {
			throw new StoreTestException("Exception when testing with resource", e);
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
	
	/** 
	 * Check test set, note a where clause has been set on the relation
	 * Only writers with name martin are returned 
	 */
	private void checkTestSet(Book bk) {
		final String prefix = bk.getTitle();
		final ArrayList writers = new ArrayList();
		for (Iterator it = bk.getWriters().keySet().iterator(); it.hasNext();) {
			final String key = (String)it.next();
			final Writer w = (Writer)bk.getWriters().get(key);
			assertEquals(key, w.getName());
			assertTrue(key.startsWith(bk.getTitle()));
			writers.add(w);
		}
		if (bk.getTitle().length() == 0) {
			assertEquals(1, writers.size());
			final Writer writerOne = (Writer)writers.get(0);
			assertEquals(writerOne.getName(), "martin");
		} else {
			assertEquals(0, writers.size());
		}
	}
}
