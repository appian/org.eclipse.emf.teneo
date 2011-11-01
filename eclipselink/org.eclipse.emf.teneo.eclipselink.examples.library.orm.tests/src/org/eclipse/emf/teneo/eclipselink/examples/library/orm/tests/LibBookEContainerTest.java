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

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.teneo.eclipselink.examples.library.Book;
import org.eclipse.emf.teneo.eclipselink.examples.library.Library;

public class LibBookEContainerTest extends LibraryJPATest {

	public LibBookEContainerTest(String name) {
		super(name);
	}

	public void testInsertBookAndLibraryWithCache() throws Exception {
		boolean checkCache = true;
		verifyInsertBookLibrary(checkCache);
	}

	public void testInsertBookAndLibraryNoCache() throws Exception {
		boolean checkCache = false;
		verifyInsertBookLibrary(checkCache);
	}

	/**
	 * Create the library and a book within the library.<br>
	 * Store the library to the data base.<br>
	 * Fetch back the library from the data base.<br>
	 * Identify the book object assigned to libray.<br>
	 * Check whether the attribute eContainer is set at the book object.
	 * 
	 * @param checkCache
	 */
	private void verifyInsertBookLibrary(boolean checkCache) {

		beginTransaction();
		Book book = createAnonymousBook(em);
		String bookTitle = book.getTitle();
		Library library = createAnonymousLibrary(em);
		String libraryName = library.getName();
		library.getBooks().put(book.getTitle(), book);
		commitTransaction();

		// verify
		if (!checkCache) {
			reinitializeCachesAndEntityManager();
		}

		// Check whether the book as been allocated at the data base.
		Book actualBook = findBookWithTitle(em, bookTitle);
		assertNotNull("book", actualBook);
		assertNotNull("Field Actual/Book.eContainer not set", actualBook.eContainer());
		int containerFeatureID = ((InternalEObject) book).eContainerFeatureID();
		int actualContainerFeatureID = ((InternalEObject) actualBook).eContainerFeatureID();
		assertEquals("Containment Feature Id DB Book", containerFeatureID, actualContainerFeatureID);

		Library actualLibrary = findLibraryWithName(em, libraryName);
		assertNotNull("library missing", actualLibrary);

		Book actualLibraryBook = actualLibrary.getBooks().get(bookTitle);
		assertNotNull("book missing", actualLibraryBook);
		assertEquals("book title", bookTitle, actualLibraryBook.getTitle());
		assertEquals("Book Check", actualBook, actualLibraryBook);

		// verify whether the field eContainer is set
		assertNotNull("Field Library/Book.eContainer not set", actualLibraryBook.eContainer());
		assertEquals("Containment Relationship", actualLibrary, actualLibraryBook.eContainer().eContainer());

	}

}
