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
 * $Id: LibraryNotifyingTestAction.java,v 1.1 2009/03/15 08:09:27 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.teneo.samples.emf.sample.library.Book;
import org.eclipse.emf.teneo.samples.emf.sample.library.BookCategory;
import org.eclipse.emf.teneo.samples.emf.sample.library.Library;
import org.eclipse.emf.teneo.samples.emf.sample.library.LibraryFactory;
import org.eclipse.emf.teneo.samples.emf.sample.library.LibraryPackage;
import org.eclipse.emf.teneo.samples.emf.sample.library.Writer;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;
import org.eclipse.emf.teneo.type.PersistentStoreAdapter;
import org.eclipse.emf.teneo.util.StoreUtil;

/**
 * Tests the library example of emf/xsd and specifically the notifications when
 * objects are updated. Tests the new PersistentStoreAdapter which keeps the
 * persistentList in the adapter.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class LibraryNotifyingTestAction extends AbstractTestAction {
	public LibraryNotifyingTestAction() {
		super(LibraryPackage.eINSTANCE);
	}

	@Override
	public void doAction(TestStore store) {
		final LibraryFactory factory = LibraryFactory.eINSTANCE;

		// create a book, writer and library
		{
			store.beginTransaction();

			final Writer writer = factory.createWriter();
			writer.setName("JRR Tolkien");

			final Book book = factory.createBook();

			book.setAuthor(writer);
			book.setPages(5);
			book.setTitle("The Hobbit");
			book.setCategory(BookCategory.SCIENCE_FICTION_LITERAL);

			final Book book2 = factory.createBook();
			book2.setAuthor(writer);
			book2.setPages(5);
			book2.setTitle("The fellowship of the ring");
			book2.setCategory(BookCategory.SCIENCE_FICTION_LITERAL);

			final Library library = factory.createLibrary();

			// set name
			library.setName("Science Fiction Library");

			library.getBooks().add(book);
			library.getBooks().add(book2);
			library.getWriters().add(writer);

			final EList<?> libraryBooks = library.getBooks();
			final EList<?> libraryWriters = library.getWriters();
			final EList<?> writerBooks = writer.getBooks();

			store.store(library);
			store.commitTransaction();

			store.beginTransaction();

			library.getBooks().clear();

			// add action
			library.getBooks().add(book);

			// remove action
			library.getBooks().remove(book);

			// add action
			library.getBooks().add(book2);

			// set action
			library.getBooks().set(0, book);

			// add again
			library.getBooks().add(book2);

			// move it
			library.getBooks().move(0, 1);

			library.getBooks().move(1, book2);

			// count them
			assertTrue(library.getBooks().size() == 2);

			// clear it all
			library.getBooks().clear();

			final List<Book> books = new ArrayList<Book>();
			books.add(book);
			books.add(book2);
			library.getBooks().addAll(books);

			library.getBooks().removeAll(books);

			library.getWriters().add(writer);

			store.commitTransaction();
			store.beginTransaction();
			{
				assertTrue(libraryBooks == library.getBooks());
				assertTrue(libraryWriters == library.getWriters());
				assertTrue(writerBooks == writer.getBooks());
				PersistentStoreAdapter libraryAdapter = StoreUtil
						.getPersistentStoreAdapter(library);
				final List<?> persistentLibraryBooks = (List<?>) libraryAdapter
						.getStoreCollection(LibraryPackage.eINSTANCE
								.getLibrary_Books());
				final List<?> persistentLibraryWriters = (List<?>) libraryAdapter
						.getStoreCollection(LibraryPackage.eINSTANCE
								.getLibrary_Writers());
				PersistentStoreAdapter writerAdapter = StoreUtil
						.getPersistentStoreAdapter(writer);
				final List<?> persistentWriterBooks = (List<?>) writerAdapter
						.getStoreCollection(LibraryPackage.eINSTANCE
								.getWriter_Books());
				checkEqualList(persistentLibraryWriters, libraryWriters);
				checkEqualList(persistentLibraryBooks, libraryBooks);
				checkEqualList(persistentWriterBooks, writerBooks);
			}
			store.commitTransaction();
			{
				assertTrue(libraryBooks == library.getBooks());
				assertTrue(libraryWriters == library.getWriters());
				assertTrue(writerBooks == writer.getBooks());
				PersistentStoreAdapter libraryAdapter = StoreUtil
						.getPersistentStoreAdapter(library);
				final List<?> persistentLibraryBooks = (List<?>) libraryAdapter
						.getStoreCollection(LibraryPackage.eINSTANCE
								.getLibrary_Books());
				final List<?> persistentLibraryWriters = (List<?>) libraryAdapter
						.getStoreCollection(LibraryPackage.eINSTANCE
								.getLibrary_Writers());
				PersistentStoreAdapter writerAdapter = StoreUtil
						.getPersistentStoreAdapter(writer);
				final List<?> persistentWriterBooks = (List<?>) writerAdapter
						.getStoreCollection(LibraryPackage.eINSTANCE
								.getWriter_Books());
				checkEqualList(persistentLibraryWriters, libraryWriters);
				checkEqualList(persistentLibraryBooks, libraryBooks);
				checkEqualList(persistentWriterBooks, writerBooks);
			}
		}
	}

	private void checkEqualList(List<?> l1, List<?> l2) {
		assertTrue(l1 != l2);
		assertTrue(l1.size() == l2.size());
		for (Object o : l1) {
			assertEquals(l1.indexOf(o), l2.indexOf(o));
		}
	}
}
