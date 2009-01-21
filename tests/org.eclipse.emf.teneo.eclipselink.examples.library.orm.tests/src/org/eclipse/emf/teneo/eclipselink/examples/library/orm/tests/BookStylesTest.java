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
import org.eclipse.emf.teneo.eclipselink.examples.library.Style;
import org.eclipse.emf.teneo.eclipselink.examples.library.impl.BookStylesMapEntryImpl;

public class BookStylesTest extends LibraryJPATest {

	public BookStylesTest(String name) {
		super(name);
	}

	public void testInsertBookWithStylesWithCache() throws Exception {
		boolean checkCache = true;
		verifyInsertBookStyles(checkCache);
	}

	public void testInsertBookWithStylesNoCache() throws Exception {
		boolean checkCache = false;
		verifyInsertBookStyles(checkCache);
	}

	private void verifyInsertBookStyles(boolean checkCache) {

		beginTransaction();

		Book book = createAnonymousBook(em);
		String bookTitle = book.getTitle();
		Style style1 = createAnonymousStyle(em);
		String style1Name = style1.getName();
		Style style2 = createAnonymousStyle(em);
		String style2Name = style2.getName();
		book.getStyles().put(style1Name, style1);
		book.getStyles().put(style2Name, style2);
		int eContFeatId = ((BookStylesMapEntryImpl) book.getStyles().get(0)).eContainerFeatureID();

		commitTransaction();

		if (!checkCache) {
			reinitializeCachesAndEntityManager();
		}

		Book dbBook = findBookWithTitle(em, bookTitle);
		assertNotNull("dbBook not found", dbBook);
		assertEquals("dbBook nbr of styles", book.getStyles().size(), dbBook.getStyles().size());

		// check the containment setting for the BookStyleMapEntry

		BookStylesMapEntryImpl bookStyleMapEntry = (BookStylesMapEntryImpl) dbBook.getStyles().get(0);
		assertEquals("eContainer of the BookStylesMapEntryImpl", dbBook, bookStyleMapEntry.eContainer());
		assertEquals("eContainerFeatureId of the BookStylesMapEntryImpl", eContFeatId, ((BookStylesMapEntryImpl) dbBook
				.getStyles().get(0)).eContainerFeatureID());

		Style dbStyle1 = dbBook.getStyles().get(style1Name);
		Style dbStyle2 = dbBook.getStyles().get(style2Name);

		assertNotNull("First Style", dbStyle1);
		assertNotNull("Second Style", dbStyle2);

		// There is no containment relationshsip given for the Style objects
		assertNull("no containment of the style object", dbStyle1.eContainer());
		assertNull("no containment of the style object", dbStyle2.eContainer());
	}
}