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



import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.teneo.eclipselink.examples.library.Book;
import org.eclipse.emf.teneo.eclipselink.examples.library.Library;
import org.eclipse.emf.teneo.eclipselink.examples.library.Writer;


public class EListTest extends LibraryJPATest {


	public EListTest(String name) {
		super(name);
	}


	public void testInsertWriterAndBooksWithCache() throws Exception {
		boolean checkCache = true;
		verifyInsertWriterBook(checkCache);
	}

	public void testInsertWriterAndBooksNoCache() throws Exception {
		boolean checkCache = false;
		verifyInsertWriterBook(checkCache);
	}

	private void verifyInsertWriterBook(boolean checkCache) {
		beginTransaction();
		Writer writer = createAnonymousWriterWithOneBook(em);
		String writerName = writer.getName();
		Book book = writer.getBooks().get(0);
		String bookTitle = book.getTitle();
		commitTransaction();
		
		// verify
		if (!checkCache) {
			reinitializeCachesAndEntityManager();
		}
		Writer actualWriter = findWriterWithName(em, writerName);
		assertNotNull("writer", actualWriter);
		EList<Book> actualBooks = actualWriter.getBooks();
		assertEquals("number writer's books", 1, actualBooks.size());
		Book actualBook = findBookWithTitle(em, bookTitle);
		assertNotNull("book", actualBook);
		assertEquals("writer book", actualBooks.get(0), actualBook);
		assertEquals("book author", actualWriter, actualBook.getAuthor());
	}


	public void testAddBookToWriterWithCache() throws Exception {
		boolean checkCache = true;
		verifyAddBookToWriter(checkCache);
	}

	public void testAddBookToWriterNoCache() throws Exception {
		boolean checkCache = false;
		verifyAddBookToWriter(checkCache);
	}

	private void verifyAddBookToWriter(boolean checkCache) {
		// setup fixture
		beginTransaction();
		Writer writer = createAnonymousWriter(em);
		Book firstBook = createAnonymousBookForWriter(em, writer);
		String writerName = writer.getName();
		commitTransaction();
		
		// exercise SUT
		if (!checkCache) {
			reinitializeCachesAndEntityManager();
		}
		
		beginTransaction();
		writer = findWriterWithName(em, writerName);
		Book secondBook = createAnonymousBookForWriter(em, writer);
		commitTransaction();

		// verify
		if (!checkCache) {
			reinitializeCachesAndEntityManager();
		}
		Writer actualWriter = findWriterWithName(em, writerName);
		List<Book> actualBooks = actualWriter.getBooks();
		assertEquals("number of books",2, actualBooks.size());
		assertBookListContains(actualBooks, firstBook);
		assertBookListContains(actualBooks, secondBook);
	}
	
	public void testRemoveBookFromWriterWithCache() throws Exception {
		boolean checkCache = true;
		verifyRemoveBookFromWriter(checkCache);
	}

	public void testRemoveBookFromWriterNoCache() throws Exception {
		boolean checkCache = false;
		verifyRemoveBookFromWriter(checkCache);
	}

	private void verifyRemoveBookFromWriter(boolean checkCache) {
		beginTransaction();
		// fixture
		Writer writer = createAnonymousWriterWithOneBook(em);	
		String writerName = writer.getName();
		commitTransaction();
		// exercise SUT
		if (!checkCache) {
			reinitializeCachesAndEntityManager();
		}
		beginTransaction();
		writer = findWriterWithName(em, writerName);
		Book book = writer.getBooks().get(0);
		writer.getBooks().remove(book);
		em.remove(book);
		commitTransaction();
		// verify
		if (!checkCache) {
			reinitializeCachesAndEntityManager();
		}
		Writer actualWriter = findWriterWithName(em, writerName);
		List<Book> actualBooks = actualWriter.getBooks();
		assertEquals("number of books", 0, actualBooks.size());
	}
		

	public void testInsertLibraryWriterWithCache() throws Exception {
		boolean checkCache = true;
		verifyInsertLibraryWriter(checkCache);
	}

	public void testInsertLibraryWriterNoCache() throws Exception {
		boolean checkCache = false;
		verifyInsertLibraryWriter(checkCache);
	}

	private void verifyInsertLibraryWriter(boolean checkCache) {
		beginTransaction();
		Library library = createAnonymousLibrary(em);
		Writer writer = createAnonymousWriter(em);
		String libraryName = library.getName();
		String writerName = writer.getName();
		library.getWriters().add(writer);
		commitTransaction();
		// verify
		if (!checkCache) {
			reinitializeCachesAndEntityManager();
		}
		Writer actualWriter = findWriterWithName(em, writerName);
		assertNotNull("writer", actualWriter);
		Library actualLibrary = findLibraryWithName(em, libraryName);
		assertNotNull("library", actualLibrary);
		EList<Writer> actualLibraryWriters = actualLibrary.getWriters();
		assertEquals("library writers", 1, actualLibraryWriters.size());
		Writer actualLibraryWriter = actualLibraryWriters.get(0);
		assertEquals("writer/library writer", actualWriter, actualLibraryWriter);
		
		EObject actualWriterEContainer = actualWriter.eContainer();
		assertEquals("library", actualLibrary, actualWriterEContainer);
	}




}
