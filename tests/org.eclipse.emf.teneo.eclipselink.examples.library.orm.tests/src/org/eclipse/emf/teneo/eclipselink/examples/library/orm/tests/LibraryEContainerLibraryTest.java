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

import org.eclipse.emf.teneo.eclipselink.examples.library.Book;
import org.eclipse.emf.teneo.eclipselink.examples.library.Library;
import org.eclipse.emf.teneo.eclipselink.examples.library.Writer;

public class LibraryEContainerLibraryTest extends LibraryJPATest {

	public LibraryEContainerLibraryTest(String name) {
		super(name);
	}

	public void testInsertWriterAndBooksAndLibraryWithCache() throws Exception {
		boolean checkCache = true;
		verifyInsertWriterBookLibrary(checkCache);
	}

	public void testInsertWriterAndBooksAndLibraryNoCache() throws Exception {
		boolean checkCache = false;
		verifyInsertWriterBookLibrary(checkCache);
	}

	/**
	 * Create a library object model holding a library, writer and
	 * book object.
	 * Fetches back the library object from the data base. 
	 * Check whether the containment relationship is correctly set up at the
	 * field eContainer of the book and writer objects.
	 * 
	 * @param checkCache
	 */
	private void verifyInsertWriterBookLibrary(boolean checkCache) {
		
		beginTransaction();
		Writer writer = createAnonymousWriterWithOneBook(em);
		String writerName = writer.getName();
		Book book = writer.getBooks().get(0);
		String bookTitle = book.getTitle();
		Library library = createAnonymousLibrary(em);
		String libraryName = library.getName();
		library.getBooks().put(book.getTitle(), book);
		library.getWriters().add(writer);

		commitTransaction();

		// verify
		if (!checkCache) {
			reinitializeCachesAndEntityManager();
		}

		Library actualLibrary = findLibraryWithName(em, libraryName);
		Book actualLibraryBook = actualLibrary.getBooks().get(bookTitle);
		assertNotNull("book missing", actualLibraryBook);

		Writer actualLibraryWriter = actualLibrary.getWriters().get(0);
		assertNotNull("writer missing", actualLibraryWriter);
		assertEquals("writer name", writerName, actualLibraryWriter.getName());
		
		// verify whether the field eContainer is set
		assertNotNull("Field Library/Book.eContainer not set", actualLibraryBook.eContainer());
		assertNotNull("Field Library/Writer.eContainer not set", actualLibraryWriter.eContainer());
	}

}
