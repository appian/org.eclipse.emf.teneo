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
 * $Id: EMapAction.java,v 1.7 2007/03/20 23:33:38 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.schemaconstructs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.mapping.elist.PersistableDelegateList;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.Book;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.EmapFactory;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.EmapPackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.Writer;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests support for emaps.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.7 $
 */
public class EMapAction extends AbstractTestAction {
	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public EMapAction() {
		super(EmapPackage.eINSTANCE);
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
		{
			store.beginTransaction();
			store.store(createTestSet("prefix1"));
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
						assertTrue(bk.getWriters().size() == 2);
						
						// disabled as hibernate and jpox differ here
						//assertTrue(!((PersistableDelegateList)bk.getWriters()).isLoaded());
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
			for (Iterator it = bks.iterator(); it.hasNext();) {
				final Book bk = (Book)it.next();
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
			throw new StoreTestException("Exception when testing with resource", e);
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
		return bk;
	}
	
	/** Check test set */
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
		assertEquals(2, writers.size());
		for (Iterator itWords = bk.getKeyWords().keySet().iterator(); itWords.hasNext();) {
			final String key = (String)itWords.next();
			final String value = (String)bk.getKeyWords().get(key);
			assertTrue(key.startsWith(prefix));
			assertTrue(value.startsWith(key));
			assertTrue(value.endsWith("_value"));
		}
		final Writer writerOne = (Writer)writers.get(0);
		final Writer writerTwo = (Writer)writers.get(1);
		final String c1 = (String)bk.getCityByWriter().get(writerOne);
		final String c2 = (String)bk.getCityByWriter().get(writerTwo);
		assertEquals(c1, writerTwo.getName());
		assertEquals(c2, writerOne.getName());
	}
}
