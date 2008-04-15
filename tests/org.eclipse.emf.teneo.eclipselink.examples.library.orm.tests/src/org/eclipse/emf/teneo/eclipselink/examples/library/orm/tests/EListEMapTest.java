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


public class EListEMapTest extends LibraryJPATest {
	
	public EListEMapTest(String name) {
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
		
		Writer actualWriter = findWriterWithName(em, writerName);
		assertNotNull("writer", actualWriter);
		assertEquals("writer name", writerName, actualWriter.getName());
		Book actualBook = findBookWithTitle(em, bookTitle);
		assertNotNull("book", actualBook);
		assertEquals("number of writer books", 1, actualWriter.getBooks().size());
		Book actualWriterBook = actualWriter.getBooks().get(0);
		assertEquals("book/writer book", actualBook, actualWriterBook);
		assertEquals("writer book", actualWriter.getBooks().get(0), actualBook);
		Library actualLibrary = findLibraryWithName(em, libraryName);
		Book actualLibraryBook = actualLibrary.getBooks().get(bookTitle);
		assertEquals("book/library book", actualBook, actualLibraryBook);
		Writer actualLibraryWriter = actualLibrary.getWriters().get(0);
		assertEquals("writer/library writer", actualWriter, actualLibraryWriter);
	}


}
