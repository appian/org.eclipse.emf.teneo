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

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.teneo.eclipselink.examples.library.Book;
import org.eclipse.emf.teneo.eclipselink.examples.library.Library;
import org.eclipse.emf.teneo.eclipselink.examples.library.Writer;

public class LibraryXMIPersistenceTest extends LibraryJPATest {

	public LibraryXMIPersistenceTest(String name) {
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
	 * The test case creates a library object model holding a library, writer and
	 * book object.
	 * It generates a XMI file using the build in persistency API of EMF.
	 * The first XMI file is generated directly after creation of the library
	 * object model.
	 * A second XMI file is created based on the library object model which is 
	 * read back from the data base. Both files shall be identical.
	 *
	 * @param checkCache
	 */
	private void verifyInsertWriterBookLibrary(boolean checkCache) throws Exception {
		beginTransaction();
		Writer writer = createAnonymousWriterWithOneBook(em);
		String writerName = writer.getName();
		Book book = writer.getBooks().get(0);
		String bookTitle = book.getTitle();
		Library library = createAnonymousLibrary(em);
		String libraryName = library.getName();
		library.getBooks().put(book.getTitle(), book);
		library.getWriters().add(writer);

		saveToXMIFile(library,
				"file://c:/temp/LibraryXMIPersistenceTestBefore.library");

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
		assertEquals("number of writer books", 1, actualWriter.getBooks()
				.size());
		Book actualWriterBook = actualWriter.getBooks().get(0);
		assertEquals("book/writer book", actualBook, actualWriterBook);
		assertEquals("writer book", actualWriter.getBooks().get(0),
				actualBook);

		Library actualLibrary = findLibraryWithName(em, libraryName);
		Book actualLibraryBook = actualLibrary.getBooks().get(
				bookTitle);
		assertEquals("book/library book", actualBook, actualLibraryBook);
		Writer actualLibraryWriter = actualLibrary.getWriters()
				.get(0);
		assertEquals("writer/library writer", actualWriter,
				actualLibraryWriter);

		// Start the writing to XMI

		saveToXMIFile(actualLibrary,
				"file://c:/temp/LibraryXMIPersistenceTestAfter.library");

	}

	/**
	 * The private method saveToXMIFile allocates a resource set and
	 * stores the contents of the library object model to a XMI file.
	 *  
	 * @param library The root object of the library object model
	 * @param fileURI The name of the file "file://C:/<file name>"
	 * @throws IOException
	 */
	private void saveToXMIFile(Library library, String fileURI)
			throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		URI resURI = URI.createURI(fileURI);
		Resource res = resourceSet.createResource(resURI);

		res.getContents().add(library);
		res.save(Collections.EMPTY_MAP);
	}
}
