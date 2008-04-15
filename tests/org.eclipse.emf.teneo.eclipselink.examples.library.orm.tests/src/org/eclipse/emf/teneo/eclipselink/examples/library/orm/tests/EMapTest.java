/*******************************************************************************
 * Copyright (c) 2008 Oracle and Geensys.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oracle and Geensys - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.teneo.eclipselink.examples.library.orm.tests;

import java.util.Map.Entry;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.teneo.eclipselink.examples.library.Book;
import org.eclipse.emf.teneo.eclipselink.examples.library.Library;
import org.eclipse.emf.teneo.eclipselink.examples.library.Writer;

public class EMapTest extends LibraryJPATest {

	public EMapTest(String name) {
		super(name);
	}

	public void testInsertLibraryAndBooksWithCache() throws Exception {
		boolean checkCache = true;
		verifyInsertLibraryAndBooks(checkCache);
	}

	public void testInsertLibaryAndBooksNoCache() throws Exception {
		boolean checkCache = false;
		verifyInsertLibraryAndBooks(checkCache);
	}

	private void verifyInsertLibraryAndBooks(boolean checkCache) {
		beginTransaction();
		Library library = createAnonymousLibrary(em);
		String libraryName = library.getName();
		Book book = createAnonymousBook(em);
		String bookTitle = book.getTitle();
		library.getBooks().put(bookTitle, book);
		commitTransaction();
		// verify
		if (!checkCache) {
			reinitializeCachesAndEntityManager();
		}
		Library actualLibrary = findLibraryWithName(em, libraryName);
		assertNotNull("library", actualLibrary);
		Book actualBook = findBookWithTitle(em, bookTitle);
		assertNotNull("book", actualBook);
		EMap<String, Book> actualBooks = actualLibrary.getBooks();
		int numberActualBooks = actualBooks.size();
		assertEquals("number of book", 1, numberActualBooks);
		EObject actualLibraryBook = actualBooks.get(bookTitle);
		assertEquals("library book", actualBook, actualLibraryBook);

		EObject bookContainer = actualBook.eContainer();
		EObject libraryBookContainer = actualLibraryBook.eContainer();
		assertEquals("book container", bookContainer, libraryBookContainer);

		EObject bookEntryContainer = bookContainer.eContainer();
		EObject libraryBookEntryContainer = libraryBookContainer.eContainer();
		assertEquals("entry container", bookEntryContainer,
				libraryBookEntryContainer);
		assertEquals("entry container", actualLibrary, bookEntryContainer);
		assertEquals("entry container", actualLibrary,
				libraryBookEntryContainer);
	}

	public void testAddBookToLibraryWithCache() throws Exception {
		boolean checkCache = true;
		verifyAddBookToLibrary(checkCache);
	}

	public void testAddBookToLibraryNoCache() throws Exception {
		boolean checkCache = false;
		verifyAddBookToLibrary(checkCache);
	}

	private void verifyAddBookToLibrary(boolean checkCache) {
		beginTransaction();
		// setup fixture
		Library library = createAnonymousLibrary(em);
		Writer writer = createAnonymousWriter(em);
		Book bookOne = createAnonymousBookForWriter(em, writer);
		String bookOneTitle = bookOne.getTitle();
		library.getBooks().put(bookOneTitle, bookOne);
		library.getWriters().add(writer);
		String libraryName = library.getName();
		String writerName = writer.getName();
		commitTransaction();
		// exercise SUT
		if (!checkCache) {
			reinitializeCachesAndEntityManager();
		}

		beginTransaction();
		library = findLibraryWithName(em, libraryName);
		writer = findWriterWithName(em, writerName);
		Book bookTwo = createAnonymousBookForWriter(em, writer);
		String bookTwoTitle = bookTwo.getTitle();
		library.getBooks().put(bookTwoTitle, bookTwo);
		commitTransaction();

		// verify - cache
		if (!checkCache) {
			reinitializeCachesAndEntityManager();
		}

		Library actualLibrary = findLibraryWithName(em, libraryName);
		Book actualBookOne = findBookWithTitle(em, bookOneTitle);
		Book actualBookTwo = findBookWithTitle(em, bookTwoTitle);
		EMap<String, Book> libraryBooks = actualLibrary.getBooks();
		assertEquals("number of books", 2, libraryBooks.size());
		assertEquals("first library book", actualBookOne, libraryBooks
				.get(bookOneTitle));
		assertEquals("second library book", actualBookTwo, libraryBooks
				.get(bookTwoTitle));
	}

	public void testRemoveBookFromLibraryWithCache() throws Exception {
		boolean checkCache = true;
		verifyRemoveBookFromLibrary(checkCache);
	}

	public void testRemoveBookFromLibraryNoCache() throws Exception {
		boolean checkCache = false;
		verifyRemoveBookFromLibrary(checkCache);
	}

	private void verifyRemoveBookFromLibrary(boolean checkCache) {
		beginTransaction();
		// fixture
		Writer writer = createAnonymousWriter(em);
		Book bookOne = createAnonymousBookForWriter(em, writer);
		Book bookTwo = createAnonymousBookForWriter(em, writer);
		Library library = createAnonymousLibrary(em);
		library.getBooks().put(bookOne.getTitle(), bookOne);
		library.getBooks().put(bookTwo.getTitle(), bookTwo);
		String libraryName = library.getName();
		String bookOneTitle = bookOne.getTitle();
		String bookTwoTitle = bookTwo.getTitle();
		commitTransaction();
		// exercise SUT
		if (!checkCache) {
			reinitializeCachesAndEntityManager();
		}
		beginTransaction();
		library = findLibraryWithName(em, libraryName);
		bookTwo = findBookWithTitle(em, bookTwoTitle);
		Book bookTwoFromLibrary = library.getBooks().removeKey(bookTwoTitle);
		assertEquals(bookTwo, bookTwoFromLibrary);
		// TODO: ResourceImpl will get callback to delete MapEntry
		EObject bookTwoEContainer = bookTwo.eContainer();
		if ((bookTwoEContainer != null) && (bookTwoEContainer instanceof Entry)) {
			em.remove(bookTwoEContainer);
		}
		em.remove(bookTwo);
		commitTransaction();
		// verify
		if (!checkCache) {
			reinitializeCachesAndEntityManager();
		}

		Library actualLibrary = findLibraryWithName(em, libraryName);
		Book actualBookOne = findBookWithTitle(em, bookOneTitle);
		EMap<String, Book> actualBooks = actualLibrary.getBooks();
		assertEquals("number of books", 1, actualBooks.size());
		Book actualLibraryBook = actualBooks.get(bookOneTitle);
		assertEquals("book in library", actualBookOne, actualLibraryBook);
	}

}
