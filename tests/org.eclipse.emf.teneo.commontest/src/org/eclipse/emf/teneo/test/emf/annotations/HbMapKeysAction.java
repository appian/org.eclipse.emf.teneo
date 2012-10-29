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
 * $Id: HbMapKeysAction.java,v 1.2 2010/04/03 12:55:13 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;

import java.util.List;
import java.util.Properties;

import org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.Book;
import org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.City;
import org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.HbmapkeysFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.HbmapkeysPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.Writer;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests HbMapKey and MapKeyManyToMany annotations
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class HbMapKeysAction extends AbstractTestAction {
	public HbMapKeysAction() {
		super(HbmapkeysPackage.eINSTANCE);
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		// props.put(PersistenceOptions.EMAP_AS_TRUE_MAP, "true");
		return props;
	}

	/**
	 * Check test set, note a where clause has been set on the relation Only writers with name martin
	 * are returned
	 */
	private void checkTestSet(Book bk) {
		// final String prefix = bk.getTitle();
		for (final Object element : bk.getWritersByName().keySet()) {
			final String key = (String) element;
			final Writer w = bk.getWritersByName().get(key);
			assertEquals(key, w.getName());
			assertTrue(key.startsWith(bk.getTitle()));
		}
		for (final Object element : bk.getCityByWriter().keySet()) {
			final Writer key = (Writer) element;
			final City c = bk.getCityByWriter().get(key);
			assertEquals(key, c.getCityWriter());
		}
	}

	/** Create test set */
	private Book createTestSet(String prefix) {
		final HbmapkeysFactory factory = HbmapkeysFactory.eINSTANCE;
		final Writer w1 = factory.createWriter();
		w1.setName(prefix + "martin");
		final Writer w2 = factory.createWriter();
		w2.setName(prefix + "martin2");
		final Book bk = factory.createBook();
		bk.setTitle(prefix);
		bk.getWritersByName().put(w1.getName(), w1);
		bk.getWritersByName().put(w2.getName(), w2);
		final City ct1 = factory.createCity();
		ct1.setName(prefix + "CityOne");
		ct1.setCityWriter(w1);
		bk.getCityByWriter().put(w1, ct1);
		final City ct2 = factory.createCity();
		ct2.setName(prefix + "CityTwo");
		ct2.setCityWriter(w2);
		bk.getCityByWriter().put(w2, ct2);
		return bk;
	}

	@Override
	public void doAction(TestStore store) {
		{
			store.beginTransaction();
			store.store(createTestSet(""));
			store.store(createTestSet("prefix2"));
			store.commitTransaction();
		}

		try {
			store.beginTransaction();
			final List<?> lst = store.getObjects(Book.class);
			for (Object name : lst) {
				checkTestSet((Book) name);
			}
			store.commitTransaction();
		} catch (final Exception e) {
			throw new StoreTestException("Exception when testing with resource", e);
		}
	}
}
