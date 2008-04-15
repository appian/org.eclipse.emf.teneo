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
import org.eclipse.emf.teneo.eclipselink.examples.library.Cover;

public class BookCoverTest extends LibraryJPATest {

	public BookCoverTest(String name) {
		super(name);
	}

	public void testInsertWriterAndCoverWithCache() throws Exception {
		boolean checkCache = true;
		verifyInsertWriterAddress(checkCache);
	}

	public void testInsertWriterAndCoverNoCache() throws Exception {
		boolean checkCache = false;
		verifyInsertWriterAddress(checkCache);
	}

	private void verifyInsertWriterAddress(boolean checkCache) {
		
		beginTransaction();

		Book book = createAnonymousBookWithCover(em);
		String bookTitle = book.getTitle();
		Cover cover = book.getCover();

		// put the data to the data base
		commitTransaction();
		
		// verify
		
		if (!checkCache) {
			reinitializeCachesAndEntityManager();
		}
		// Check whether the Book as been allocated at the data base.
		
		Book dbBook = findBookWithTitle(em, bookTitle);
		assertNotNull("Book not found", dbBook);
		Cover dbCover = dbBook.getCover();

		assertNotNull("dbCover not found", dbCover);
		assertNotNull("eContainer not set", dbCover.eContainer());
		int containerFeatureID = ((InternalEObject)cover).eContainerFeatureID();
		int dbContainerFeatureID = ((InternalEObject)dbCover).eContainerFeatureID();
		assertEquals("Containment Feature Id DB Cover", containerFeatureID, dbContainerFeatureID);
	}
}
