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
import org.eclipse.emf.teneo.eclipselink.examples.library.Translator;

public class BookTranslatorTest extends LibraryJPATest {

	public BookTranslatorTest(String name) {
		super(name);
	}

	public void testInsertBookWithTranslatorWithCache() throws Exception {
		boolean checkCache = true;
		verifyInsertBookTranslator(checkCache);
	}

	public void testInsertBookWithTranslatorNoCache() throws Exception {
		boolean checkCache = false;
		verifyInsertBookTranslator(checkCache);
	}

	private void verifyInsertBookTranslator(boolean checkCache) {

		beginTransaction();
		Book book = createAnonymousBookWithTranslator(em);
		String bookTitle = book.getTitle();
		Translator translator = book.getTranslator();
		commitTransaction();

		if (!checkCache) {
			reinitializeCachesAndEntityManager();
		}

		Book dbBook = findBookWithTitle(em, bookTitle);
		assertNotNull("dbBook not found", dbBook);
		Translator dbTranslator = dbBook.getTranslator();
		assertNotNull("dbTranslator not found", dbTranslator);
		assertEquals("dbTranslator.location", translator.getLocation(), dbTranslator.getLocation());
	}

}
