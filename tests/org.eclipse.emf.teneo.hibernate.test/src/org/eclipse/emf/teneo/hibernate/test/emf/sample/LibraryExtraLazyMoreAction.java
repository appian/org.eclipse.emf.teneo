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
 * $Id: LibraryExtraLazyMoreAction.java,v 1.2 2010/03/25 01:05:23 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.sample;

import java.util.List;
import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.mapping.elist.PersistableEList;
import org.eclipse.emf.teneo.samples.emf.sample.library.Book;
import org.eclipse.emf.teneo.samples.emf.sample.library.Library;
import org.eclipse.emf.teneo.samples.emf.sample.library.LibraryFactory;
import org.eclipse.emf.teneo.samples.emf.sample.library.LibraryPackage;
import org.eclipse.emf.teneo.samples.emf.sample.library.Writer;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;
import org.hibernate.collection.PersistentCollection;

/**
 * Tests the extra lazy behavior of collections. Tests move, delete, etc.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class LibraryExtraLazyMoreAction extends AbstractTestAction {

	public LibraryExtraLazyMoreAction() {
		super(LibraryPackage.eINSTANCE);
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.FETCH_ASSOCIATION_EXTRA_LAZY, "true");
		return props;
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		final LibraryFactory factory = LibraryFactory.eINSTANCE;
		// create a book, writer and library
		{
			store.beginTransaction();

			final Writer w1 = factory.createWriter();
			w1.setName("w1");
			final Writer w2 = factory.createWriter();
			w2.setName("w2");
			final Book bk1 = factory.createBook();
			bk1.setAuthor(w1);
			bk1.setTitle("bk1");
			final Book bk2 = factory.createBook();
			bk2.setAuthor(w1);
			bk2.setTitle("bk2");
			final Book bk3 = factory.createBook();
			bk3.setAuthor(w1);
			bk3.setTitle("bk3");

			final Library library = factory.createLibrary();
			library.getBooks().add(bk1);
			library.getBooks().add(bk2);
			library.getBooks().add(bk3);
			library.setName("l1");
			library.getWriters().add(w1);
			store.store(library);
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			Library lib = store.getObject(Library.class);		
			testLazySize(lib.getWriters());
			testLazySize(lib.getBooks());
			testLazySize(lib.getWriters().get(0).getBooks());
			lib.getWriters().get(0);
			store.getObjects(Book.class).get(0);
			assertNotNull(lib.getWriters().get(0).getBooks().get(0));
			store.commitTransaction();
		}

		// test non containment
		{
			store.beginTransaction();
			final Writer w1 = store.getObjects(Writer.class).get(0);

			final Book bk4 = factory.createBook();
			bk4.setAuthor(w1);
			bk4.setTitle("bk4");
			checkIsStillLazy(w1.getBooks());
			final Library l1 = (Library)w1.eContainer(); 
			checkIsStillLazy(l1.getBooks());
			l1.getBooks().add(0, bk4);
			checkIsNotLazy(l1.getBooks());
			assertEquals(l1.getBooks().get(0).getTitle(), "bk4");
			assertEquals(l1.getBooks().get(1).getTitle(), "bk1");
			assertEquals(l1.getBooks().get(2).getTitle(), "bk2");
			assertEquals(l1.getBooks().get(3).getTitle(), "bk3");
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			final Library l1 = store.getObject(Library.class);
			checkIsStillLazy(l1.getBooks());
			assertEquals(l1.getBooks().get(0).getTitle(), "bk4");
			assertEquals(l1.getBooks().get(1).getTitle(), "bk1");
			assertEquals(l1.getBooks().get(2).getTitle(), "bk2");
			assertEquals(l1.getBooks().get(3).getTitle(), "bk3");
			checkIsStillLazy(l1.getBooks());
			Book oldBk1 = l1.getBooks().remove(3);
			checkIsStillLazy(l1.getBooks());
			Book oldBk2 = l1.getBooks().remove(1);
			checkIsNotLazy(l1.getBooks());
			l1.getWriters().get(0).getBooks().remove(oldBk1);
			checkIsNotLazy(l1.getWriters().get(0).getBooks());
			l1.getWriters().get(0).getBooks().remove(oldBk2);
			store.commitTransaction();
		}
		
		{
			store.beginTransaction();
			final Library l1 = store.getObject(Library.class);
			checkIsStillLazy(l1.getBooks());
			assertEquals(l1.getBooks().get(0).getTitle(), "bk4");
			assertEquals(l1.getBooks().get(1).getTitle(), "bk2");
			assertTrue(2 == l1.getBooks().size());
			checkIsStillLazy(l1.getBooks());
			store.commitTransaction();
		}
		
		{
			store.beginTransaction();
			final Writer w1 = store.getObject(Writer.class);
			checkIsStillLazy(w1.getBooks());
			w1.getBooks().clear();
			store.commitTransaction();
		}
		
		{
			store.beginTransaction();
			final Writer w1 = store.getObject(Writer.class);
			assertEquals(0, w1.getBooks().size());
			store.commitTransaction();
		}
		store.checkNumber(Book.class, 2);
		
		{
			store.beginTransaction();
			final Library l1 = store.getObject(Library.class);
			l1.getBooks().clear();
			store.commitTransaction();
		}
		store.checkNumber(Book.class, 0);
	}

	protected void testLazySize(List<?> list) {
		final PersistableEList<?> persistableEList = (PersistableEList<?>)list;
		final PersistentCollection persistentCollection = (PersistentCollection)persistableEList.getDelegate();
		assertFalse(persistentCollection.wasInitialized());
		assertFalse(persistableEList.isLoaded());
		int size = list.size();
		assertTrue(size > 0);
		assertFalse(persistentCollection.wasInitialized());
		assertFalse(persistableEList.isLoaded());
	}

	protected void checkIsStillLazy(List<?> list) {
		final PersistableEList<?> persistableEList = (PersistableEList<?>)list;
		final PersistentCollection persistentCollection = (PersistentCollection)persistableEList.getDelegate();
		assertFalse(persistentCollection.wasInitialized());
		assertFalse(persistableEList.isLoaded());
	}

	protected void checkIsNotLazy(List<?> list) {
		final PersistableEList<?> persistableEList = (PersistableEList<?>)list;
		final PersistentCollection persistentCollection = (PersistentCollection)persistableEList.getDelegate();
		assertTrue(persistentCollection.wasInitialized());
		assertTrue(persistableEList.isLoaded());
	}
}
