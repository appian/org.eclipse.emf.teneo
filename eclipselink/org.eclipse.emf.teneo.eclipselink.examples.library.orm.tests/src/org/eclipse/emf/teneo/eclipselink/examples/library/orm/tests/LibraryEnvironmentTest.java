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

import org.eclipse.emf.teneo.eclipselink.examples.library.Address;
import org.eclipse.emf.teneo.eclipselink.examples.library.Book;
import org.eclipse.emf.teneo.eclipselink.examples.library.Library;
import org.eclipse.emf.teneo.eclipselink.examples.library.Publisher;
import org.eclipse.emf.teneo.eclipselink.examples.library.Style;
import org.eclipse.emf.teneo.eclipselink.examples.library.Translator;
import org.eclipse.emf.teneo.eclipselink.examples.library.Writer;

public class LibraryEnvironmentTest extends LibraryJPATest {

	public LibraryEnvironmentTest(String name) {

		super(name);
	}

	public void testLibraryEnvironmentWithCache() throws Exception {

		boolean checkCache = true;
		verifyLibraryEnvironment(checkCache);
	}

	public void testLibraryEnvironmentNoCache() throws Exception {

		boolean checkCache = false;
		verifyLibraryEnvironment(checkCache);
	}

	private void verifyLibraryEnvironment(boolean checkCache) {

		beginTransaction();

		// Create the Test Environment

		Library library = setupLibraryEnvironment(em);

		String libraryName = library.getName();

		// put the data to the data base

		commitTransaction();

		// set the cache usage

		if (!checkCache) {
			reinitializeCachesAndEntityManager();
		}

		// fetch back the library

		Library dbLibrary = findLibraryWithName(em, libraryName);

		// verify

		assertNotNull("dbLibray not found", dbLibrary);
		assertEquals("dbLibrary.name", libraryName, dbLibrary.getName());

		Book dbBook = (Book) dbLibrary.getBooks().values().toArray()[0];
		Writer dbWriter = dbLibrary.getWriters().get(0);

		assertNotNull("dbBook not found", dbBook);
		assertNotNull("dbWriter not found", dbWriter);

		Translator dbTranslator = dbBook.getTranslator();
		Address dbAddress = dbWriter.getAddress();
		Publisher dbPublisher = dbWriter.getPublishers().get(0);
		Style dbStyle = (Style) dbBook.getStyles().values().toArray()[0];

		assertNotNull("dbTranslator not found", dbTranslator);
		assertNotNull("dbAddress not found", dbAddress);
		assertNotNull("dbPublisher not found", dbPublisher);
		assertNotNull("dbStyle not found", dbStyle);
	}
}
