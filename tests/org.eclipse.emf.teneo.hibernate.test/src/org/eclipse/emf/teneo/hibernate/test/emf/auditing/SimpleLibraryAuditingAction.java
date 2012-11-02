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

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.put(PersistenceOptions.ENABLE_AUDITING, "true");
		return props;
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		testSimpleChange(store);
		testContainer(store);
	}

	private void testSimpleChange(TestStore store) {
		{
			store.beginTransaction();
			final Writer writer = LibraryFactory.eINSTANCE.createWriter();
			writer.setName("0");
			final Book bk1 = LibraryFactory.eINSTANCE.createBook();
			bk1.setTitle("1");
			bk1.setPages(0);
			final Book bk2 = LibraryFactory.eINSTANCE.createBook();
			bk2.setTitle("2");
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
				w.setName("" + (i + 1));
				w.getBooks().get(0).setPages(i + 1);
				w.getBooks().get(1).setPages(i + 1);
				store.commitTransaction();
			}

			// and delete
			store.beginTransaction();
			final Writer w = store.getObject(Writer.class);
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
			assertTrue(revisions.size() == 7);
			for (int i = 0; i < 7; i++) {
				if (i == 0) {
					assertTrue(revisions.get(i).getTeneo_audit_kind() == TeneoAuditKind.ADD);
				} else if (i == 6) {
					assertTrue(revisions.get(i).getTeneo_audit_kind() == TeneoAuditKind.DELETE);
				} else {
					assertTrue(revisions.get(i).getTeneo_audit_kind() == TeneoAuditKind.UPDATE);
				}
			}

			// now get the revisions one by one, not the last one
			final AuditVersionProvider vp = testStore.getEmfDataStore().getAuditVersionProvider();
			for (int i = 0; i < 6; i++) {
				final TeneoAuditEntry audit = revisions.get(i);
				final Writer testW = (Writer) vp.getRevision(LibraryPackage.eINSTANCE.getWriter(), id,
						audit.getTeneo_start());

				assertTrue(testW.getName().equals("" + i));
				// check the books that they are in the correct revision to
				assertFalse(testW.getBooks().get(0).eIsProxy());
				assertFalse(testW.getBooks().get(1).eIsProxy());
				assertTrue(testW.getBooks().get(0).getPages() == i);
				assertTrue(testW.getBooks().get(1).getPages() == i);
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

}