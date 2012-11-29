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
 * $Id: EMapAction.java,v 1.2 2010/04/04 12:12:22 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.auditing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.auditing.AuditVersionProvider;
import org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditEntry;
import org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditKind;
import org.eclipse.emf.teneo.hibernate.mapping.identifier.IdentifierCacheHandler;
import org.eclipse.emf.teneo.hibernate.test.stores.HibernateTestStore;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.Book;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.Category;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.EmapFactory;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.EmapPackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.Writer;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests support for emaps and auditing.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class EMapAuditingTrueEMapAction extends AbstractTestAction {

	private Date testDate = new Date();
	private Date testDate2 = new Date(System.currentTimeMillis() + 1000);

	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public EMapAuditingTrueEMapAction() {
		super(EmapPackage.eINSTANCE);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.test.AbstractTestAction#getExtraConfigurationProperties ()
	 */
	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.put(PersistenceOptions.EMAP_AS_TRUE_MAP, "true");
		props.setProperty(PersistenceOptions.ENABLE_AUDITING, "true");
		return props;
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		final String pre1 = "prefix1";
		final String pre2 = "prefix2";
		{
			store.beginTransaction();
			store.store(createTestSet(pre1));
			store.store(createTestSet(pre2));
			store.commitTransaction();
		}

		Writer w3 = null;
		{
			// update some stuff
			store.beginTransaction();
			List<Book> lst = store.getObjects(Book.class);
			for (Iterator<Book> it = lst.iterator(); it.hasNext();) {
				final Book bk = it.next();
				if (bk.getTitle().equals(pre1)) {
					bk.setTitle("updated_" + pre1);
					bk.getKeyWords().remove(pre1 + "_2");
					bk.getKeyWords().put(pre1 + "abc", "abc");
					bk.getCityByWriter().clear();
					bk.getCategoryByDate().put(testDate, Category.SIMPLE);
					bk.getCategoryByDate().put(testDate2, Category.SIMPLE);
				}
				if (bk.getTitle().equals(pre2)) {
					bk.getCategoryByDate().clear();
					for (Writer w : bk.getWriters().values()) {
						w.setName("abc" + w.getName());
					}
					w3 = EmapFactory.eINSTANCE.createWriter();
					w3.setName(pre2 + "name3");
					store.store(w3);
					bk.getCityByWriter().put(w3, w3.getName());
				}
			}
			store.commitTransaction();
		}

		Object id = null;
		final HibernateTestStore testStore = (HibernateTestStore) store;
		{
			final AuditVersionProvider auditVersionProvider = testStore.getEmfDataStore()
					.getAuditVersionProvider();

			for (Book bk : store.getObjects(Book.class)) {
				id = IdentifierCacheHandler.getInstance().getID(bk);
				final List<TeneoAuditEntry> auditEntries = auditVersionProvider.getAllAuditEntries(bk);
				assertEquals(2, auditEntries.size());
				assertEquals(TeneoAuditKind.ADD, auditEntries.get(0).getTeneo_audit_kind());
				assertEquals(TeneoAuditKind.UPDATE, auditEntries.get(1).getTeneo_audit_kind());
				final Book bkAdd = (Book) auditVersionProvider.getRevision(auditEntries.get(0));
				final Book bkUpdate = (Book) auditVersionProvider.getRevision(auditEntries.get(1));
				assertTrue(bkAdd != bkUpdate);

				final Collection<Writer> updateWriters = bkUpdate.getWriters().values();
				for (Writer w : bkAdd.getWriters().values()) {
					assertFalse(updateWriters.contains(w));
				}

				if (bk.getTitle().equals("updated_" + pre1)) {
					assertTrue(bkAdd.getTitle().equals(pre1));
					assertTrue(bkAdd.getKeyWords().size() == 2);
					assertTrue(bkAdd.getKeyWords().containsKey(pre1 + "_2"));
					assertFalse(bkAdd.getKeyWords().containsKey(pre1 + "abc"));
					assertTrue(bkAdd.getCityByWriter().size() == 2);
					assertTrue(bkAdd.getCategoryByDate().size() == 1);
					assertTrue(bkAdd.getCategoryByDate().containsKey(testDate));

					assertTrue(bkUpdate.getTitle().equals("updated_" + pre1));
					assertTrue(bkUpdate.getKeyWords().size() == 2);
					assertFalse(bkUpdate.getKeyWords().containsKey(pre1 + "_2"));
					assertTrue(bkUpdate.getKeyWords().containsKey(pre1 + "abc"));
					assertTrue(bkUpdate.getCityByWriter().size() == 0);
					assertTrue(bkUpdate.getCategoryByDate().size() == 2);
					assertTrue(bkUpdate.getCategoryByDate().containsKey(testDate));
					assertTrue(bkUpdate.getCategoryByDate().containsKey(testDate));
				} else {
					// test bk2
					assertTrue(bkAdd.getWriters().size() == 2);
					for (Writer w : bkAdd.getWriters().values()) {
						// emap entry does not resolve automatically
						w = auditVersionProvider.resolve(w);
						assertTrue(w.getName().startsWith(pre2));
					}
					assertTrue(bkAdd.getCategoryByDate().size() == 1);
					assertTrue(bkUpdate.getCategoryByDate().size() == 0);

					List<Writer> writers = new ArrayList<Writer>();
					for (Writer w : bkUpdate.getWriters().values()) {
						// emap entry does not resolve automatically
						w = auditVersionProvider.resolve(w);
						writers.add(w);
						assertTrue(w.getName().startsWith("abc"));
					}

					assertTrue(bkUpdate.getCityByWriter().keySet().size() == 3);
					for (Writer w : bkUpdate.getCityByWriter().keySet()) {
						// emap entry does not resolve automatically
						w = auditVersionProvider.resolve(w);
						// check that the resolve in the previous for-loop
						// and this one, give the exact same objects
						if (w.getName().startsWith("abc")) {
							assertTrue(writers.contains(w));
						}

						assertTrue(w.getName().startsWith("abc") || w.getName().equals(pre2 + "name3"));
						if (w.getName().equals(pre2 + "name3")) {
							final List<TeneoAuditEntry> wAuditEntries = auditVersionProvider
									.getAllAuditEntries(w3);
							assertTrue(wAuditEntries.size() == 1);
							assertTrue(wAuditEntries.get(0).getTeneo_audit_kind() == TeneoAuditKind.ADD);
						}
					}
				}
			}
			auditVersionProvider.close();
		}

		{
			store.beginTransaction();
			List<Book> lst = store.getObjects(Book.class);
			for (Iterator<Book> it = lst.iterator(); it.hasNext();) {
				final Book bk = it.next();
				store.deleteObject(bk);
			}
			store.commitTransaction();
		}

		{
			final AuditVersionProvider auditVersionProvider = testStore.getEmfDataStore()
					.getAuditVersionProvider();
			store.beginTransaction();
			final List<TeneoAuditEntry> auditEntries = auditVersionProvider.getAllAuditEntries(
					EmapPackage.eINSTANCE.getBook(), id);
			assertTrue(auditEntries.size() == 3);
			TeneoAuditEntry e0 = auditEntries.get(0);
			TeneoAuditEntry e1 = auditEntries.get(1);
			TeneoAuditEntry e2 = auditEntries.get(2);
			assertTrue(e0.getTeneo_audit_kind() == TeneoAuditKind.ADD);
			assertTrue(e1.getTeneo_audit_kind() == TeneoAuditKind.UPDATE);
			assertTrue(e2.getTeneo_audit_kind() == TeneoAuditKind.DELETE);

			assertTrue(e0.getTeneo_previous_start() == -1);
			assertTrue(e1.getTeneo_previous_start() == e0.getTeneo_start());
			assertTrue(e1.getTeneo_start() == (e0.getTeneo_end() + 1));
			assertTrue(e2.getTeneo_previous_start() == e1.getTeneo_start());
			assertTrue(e2.getTeneo_start() == (e1.getTeneo_end() + 1));
			assertTrue(e2.getTeneo_end() == -1);

			assertTrue(e1 == auditVersionProvider.getNextEntry(e0));
			assertTrue(e0 == auditVersionProvider.getPreviousEntry(e1));
			assertTrue(e2 == auditVersionProvider
					.getLatestAuditEntry(EmapPackage.eINSTANCE.getBook(), id));

			store.commitTransaction();
			auditVersionProvider.close();
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

}
