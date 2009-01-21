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
import org.eclipse.emf.teneo.eclipselink.examples.library.BookCategory;
import org.eclipse.emf.teneo.eclipselink.examples.library.Library;
import org.eclipse.emf.teneo.eclipselink.examples.library.Writer;

public class EObjectTest extends LibraryJPATest {

	public EObjectTest(String name) {
		super(name);
	}

	public void testInsertWriterWithCache() throws Exception {
		boolean checkCache = true;
		verifyInsertWriter(checkCache);
	}

	public void testInsertWriterNoCache() throws Exception {
		boolean checkCache = false;
		verifyInsertWriter(checkCache);
	}

	private void verifyInsertWriter(boolean checkCache) {
		beginTransaction();
		Writer writer = createAnonymousWriter(em);
		String writerName = writer.getName();
		commitTransaction();

		// verify
		if (!checkCache) {
			reinitializeCachesAndEntityManager();
		}

		beginTransaction();
		Writer actualWriter = findWriterWithName(em, writerName);
		assertNotNull("writer", actualWriter);
		rollbackTransaction();
	}

	public void testInsertBookWithCache() throws Exception {
		boolean checkCache = true;
		verifyInsertBook(checkCache);
	}

	public void testInsertBookNoCache() throws Exception {
		boolean checkCache = false;
		verifyInsertBook(checkCache);
	}

	private void verifyInsertBook(boolean checkCache) {
		beginTransaction();
		Book book = createAnonymousBook(em);
		String title = book.getTitle();
		BookCategory category = book.getCategory();
		commitTransaction();

		// verify
		if (!checkCache) {
			reinitializeCachesAndEntityManager();
		}

		beginTransaction();
		Book actualBook = findBookWithTitle(em, title);
		assertNotNull("book", actualBook);
		assertEquals("category", category, actualBook.getCategory());
		rollbackTransaction();
	}

	public void testInsertLibraryWithCache() throws Exception {
		boolean checkCache = true;
		verifyInsertLibrary(checkCache);
	}

	public void testInsertLibraryNoCache() throws Exception {
		boolean checkCache = false;
		verifyInsertLibrary(checkCache);
	}

	private void verifyInsertLibrary(boolean checkCache) {
		beginTransaction();
		Library library = createAnonymousLibrary(em);
		String name = library.getName();
		commitTransaction();

		// verify
		if (!checkCache) {
			reinitializeCachesAndEntityManager();
		}

		beginTransaction();
		Library actualLibrary = findLibraryWithName(em, name);
		assertNotNull("library", actualLibrary);
		rollbackTransaction();
	}

}
