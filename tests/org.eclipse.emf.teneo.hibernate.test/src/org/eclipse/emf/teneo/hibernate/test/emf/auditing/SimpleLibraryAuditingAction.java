/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * DynamicAction.java,v 1.4 2007/03/20 23:33:38 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.auditing;

import java.util.List;
import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.auditing.AuditVersionProvider;
import org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditEntry;
import org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditKind;
import org.eclipse.emf.teneo.hibernate.mapping.identifier.IdentifierCacheHandler;
import org.eclipse.emf.teneo.hibernate.test.stores.HibernateTestStore;
import org.eclipse.emf.teneo.samples.emf.sample.library.Book;
import org.eclipse.emf.teneo.samples.emf.sample.library.Library;
import org.eclipse.emf.teneo.samples.emf.sample.library.LibraryFactory;
import org.eclipse.emf.teneo.samples.emf.sample.library.LibraryPackage;
import org.eclipse.emf.teneo.samples.emf.sample.library.Writer;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;
import org.hibernate.Query;

/**
 * Simple testcase to test auditing.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.17 $
 */
public class SimpleLibraryAuditingAction extends AbstractTestAction {
	/**
	 * Constructor.
	 * 
	 * @param arg0
	 */
	public SimpleLibraryAuditingAction() {
		super(LibraryPackage.eINSTANCE);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.test.AbstractTestAction#getExtraConfigurationProperties ()
	 */
	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		// props.put(PersistenceOptions.AUDITING_DB_SCHEMA, "dbschema");
		props.put(PersistenceOptions.AUDITING_PRUNE_OLD_ENTRIES_DAYS, "1");
		props.put(PersistenceOptions.AUDITING_PRUNE_COMMIT_INTERVAL, "10");
		props.setProperty(PersistenceOptions.ENABLE_AUDITING, "true");
		return props;
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		System.err.println(store.getMappingXML());

		testSimpleChange(store);
		testContainer(store);
		testQuery(store);
		testEntryPruning(store);
	}

	private void testSimpleChange(TestStore store) {
		int name = 0;
		{
			store.beginTransaction();
			final Writer writer = LibraryFactory.eINSTANCE.createWriter();
			writer.setName(name++ + "");
			store.store(writer);
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			final Writer writer = store.getObject(Writer.class);
			writer.setName(name++ + "");
			store.store(writer);
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			final Writer writer = store.getObject(Writer.class);
			writer.setName(name++ + "");
			store.store(writer);
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			final Writer writer = store.getObject(Writer.class);
			writer.setName(name++ + "");
			store.store(writer);
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			final Writer writer = store.getObject(Writer.class);
			writer.setName(name++ + "");
			store.store(writer);
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			final Writer writer = store.getObject(Writer.class);
			writer.setName(name++ + "");
			final Book bk1 = LibraryFactory.eINSTANCE.createBook();
			bk1.setTitle("1-simple");
			bk1.setPages(0);
			final Book bk2 = LibraryFactory.eINSTANCE.createBook();
			bk2.setTitle("2-simple");
			bk2.setPages(0);
			writer.getBooks().add(bk1);
			writer.getBooks().add(bk2);
			store.store(writer);
			store.store(bk1);
			store.store(bk2);
			store.commitTransaction();
			final Object id = IdentifierCacheHandler.getInstance().getID(writer);
			for (int i = 0; i < 5; i++) {
				store.beginTransaction();
				final Writer w = store.getObject(Writer.class);
				w.setName("" + name++);
				w.getBooks().get(0).setPages(i + 1);
				w.getBooks().get(1).setPages(i + 1);
				store.commitTransaction();
			}

			// and delete
			store.beginTransaction();
			final Writer w = store.getObject(Writer.class);
			writer.setName(name++ + "");
			store.deleteObject(w.getBooks().get(1));
			store.deleteObject(w.getBooks().get(0));
			store.deleteObject(w);
			store.commitTransaction();

			store.beginTransaction();
			final HibernateTestStore testStore = (HibernateTestStore) store;
			final AuditVersionProvider auditVersionProvider = testStore.getEmfDataStore()
					.getAuditVersionProvider();
			final List<TeneoAuditEntry> revisions = auditVersionProvider.getAllAuditEntries(
					LibraryPackage.eINSTANCE.getWriter(), id);
			assertTrue(revisions.size() == 12);
			for (int i = 0; i < 12; i++) {
				if (i == 0) {
					assertTrue(revisions.get(i).getTeneo_audit_kind() == TeneoAuditKind.ADD);
				} else if (i == 11) {
					assertTrue(revisions.get(i).getTeneo_audit_kind() == TeneoAuditKind.DELETE);
				} else {
					assertTrue(revisions.get(i).getTeneo_audit_kind() == TeneoAuditKind.UPDATE);
				}
			}

			// now get the revisions one by one, not the last one
			final AuditVersionProvider vp = testStore.getEmfDataStore().getAuditVersionProvider();
			for (int i = 0; i < 12; i++) {
				final TeneoAuditEntry audit = revisions.get(i);
				final Writer testW = (Writer) vp.getRevision(LibraryPackage.eINSTANCE.getWriter(), id,
						audit.getTeneo_start());

				System.err.println(testW.getName());
				if (audit.getTeneo_audit_kind() != TeneoAuditKind.DELETE) {
					assertEquals("" + i, testW.getName());
				}
				if (testW.getBooks().size() > 0) {
					// check the books that they are in the correct revision to
					assertFalse(testW.getBooks().get(0).eIsProxy());
					assertFalse(testW.getBooks().get(1).eIsProxy());
					assertEquals(i - 5, testW.getBooks().get(0).getPages());
					assertEquals(i - 5, testW.getBooks().get(1).getPages());
				}
			}

			store.commitTransaction();
		}
	}

	private void testContainer(TestStore store) {

		{
			store.beginTransaction();
			final Library library = LibraryFactory.eINSTANCE.createLibrary();
			library.setName("0");
			final Writer writer = LibraryFactory.eINSTANCE.createWriter();
			writer.setName("0");
			final Book bk1 = LibraryFactory.eINSTANCE.createBook();
			bk1.setTitle("1");
			bk1.setPages(0);
			writer.getBooks().add(bk1);
			library.getWriters().add(writer);
			library.getBooks().add(bk1);
			store.store(library);
			store.store(bk1);
			store.commitTransaction();
			final Object id = IdentifierCacheHandler.getInstance().getID(writer);
			for (int i = 0; i < 5; i++) {
				store.beginTransaction();
				final Writer w = store.getObject(Writer.class);
				w.setName("" + (i + 1));
				w.getBooks().get(0).setPages(i + 1);
				store.commitTransaction();
			}

			{
				// and delete
				store.beginTransaction();
				final Library l = store.getObject(Library.class);
				store.deleteObject(l);
				store.commitTransaction();
			}

			store.beginTransaction();
			final HibernateTestStore testStore = (HibernateTestStore) store;
			final AuditVersionProvider auditVersionProvider = testStore.getEmfDataStore()
					.getAuditVersionProvider();
			final List<TeneoAuditEntry> auditEntries = auditVersionProvider.getAllAuditEntries(
					LibraryPackage.eINSTANCE.getWriter(), id);

			// now get the revisions one by one, not the last one
			final AuditVersionProvider vp = testStore.getEmfDataStore().getAuditVersionProvider();
			for (int i = 0; i < 6; i++) {
				final TeneoAuditEntry audit = auditEntries.get(i);
				final Writer testW = (Writer) vp.getRevision(LibraryPackage.eINSTANCE.getWriter(), id,
						audit.getTeneo_start());
				assertTrue(testW.eContainer() instanceof Library);
			}

			store.commitTransaction();
		}
	}

	private void testQuery(TestStore store) {

		Writer w = null;
		{
			store.beginTransaction();
			final Library library = LibraryFactory.eINSTANCE.createLibrary();
			library.setName("0");
			final Writer writer = LibraryFactory.eINSTANCE.createWriter();
			writer.setName("0");
			final Book bk1 = LibraryFactory.eINSTANCE.createBook();
			bk1.setTitle("0");
			bk1.setPages(0);
			writer.getBooks().add(bk1);
			w = writer;
			library.getWriters().add(writer);
			library.getBooks().add(bk1);
			store.store(library);
			store.store(bk1);
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			final Book bk = store.getObject(Book.class);
			bk.setPages(1);
			store.commitTransaction();
		}
		{
			final HibernateTestStore testStore = (HibernateTestStore) store;
			{
				store.beginTransaction();
				final AuditVersionProvider vp = testStore.getEmfDataStore().getAuditVersionProvider();
				final Query qry = testStore.getSession().createQuery(
						"select e from " + getAuditEntityName("Book") + " e where author=:author");
				final String idString = vp.getIdString(w);
				qry.setParameter("author", idString);
				final List<?> list = qry.list();
				assertTrue(list.size() == 2);
				Book bk1 = (Book) vp.getRevision((TeneoAuditEntry) list.get(0));
				assertTrue(bk1.getPages() == 0);
				Book bk2 = (Book) vp.getRevision((TeneoAuditEntry) list.get(1));
				assertTrue(bk2.getPages() == 1);
				store.commitTransaction();
			}
			{
				store.beginTransaction();
				final AuditVersionProvider vp = testStore.getEmfDataStore().getAuditVersionProvider();
				final Query qry = testStore.getSession().createQuery(
						"select e from " + getAuditEntityName("Book") + " e where pages=1 and author=:author");
				qry.setParameter("author", vp.getIdString(w));
				final List<?> list = qry.list();
				assertTrue(list.size() == 1);
				Book bk1 = (Book) vp.getRevision((TeneoAuditEntry) list.get(0));
				assertTrue(bk1.getPages() == 1);
				store.commitTransaction();
			}
		}
	}

	private void testEntryPruning(TestStore store) {
		{
			store.beginTransaction();
			final Library library = store.getObject(Library.class);
			store.deleteObject(library);
			store.commitTransaction();
		}

		final HibernateTestStore testStore = (HibernateTestStore) store;
		final HbDataStore dataStore = testStore.getEmfDataStore();
		final long currentPruneTime = dataStore.getAuditProcessHandler().getPruneTime();
		assertTrue(currentPruneTime == (24 * 1000 * 3600));
		dataStore.getAuditProcessHandler().setPruneTime(500);
		Object id = null;
		{
			store.beginTransaction();
			final Library library = LibraryFactory.eINSTANCE.createLibrary();
			library.setName("abc");
			store.store(library);
			store.commitTransaction();
			id = IdentifierCacheHandler.getInstance().getID(library);
		}
		{
			for (int i = 0; i < 8; i++) {
				store.beginTransaction();
				final Library library = store.getObject(Library.class);
				library.setName("def" + i + System.currentTimeMillis());
				store.store(library);
				store.commitTransaction();
			}
		}

		int size1 = 0;
		{
			store.beginTransaction();
			final AuditVersionProvider vp = testStore.getEmfDataStore().getAuditVersionProvider();
			final List<TeneoAuditEntry> entries = vp.getAllAuditEntries(
					LibraryPackage.eINSTANCE.getLibrary(), id);
			size1 = entries.size();
			store.commitTransaction();
		}
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		{
			for (int i = 0; i < 5; i++) {
				store.beginTransaction();
				final Library library = store.getObject(Library.class);
				library.setName("def" + i + System.currentTimeMillis());
				store.store(library);
				store.commitTransaction();
			}
		}
		{
			store.beginTransaction();
			final AuditVersionProvider vp = testStore.getEmfDataStore().getAuditVersionProvider();
			final List<TeneoAuditEntry> entries = vp.getAllAuditEntries(
					LibraryPackage.eINSTANCE.getLibrary(), id);
			assertTrue(size1 > entries.size());
			store.commitTransaction();
		}
	}

	protected String getAuditEntityName(String eClassName) {
		return eClassName + "Auditing";
	}
}