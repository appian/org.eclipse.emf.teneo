/**
 * <copyright>
 *
 * Copyright (c) 2017 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: LibraryResourceAction.java,v 1.20 2010/02/07 23:12:02 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.issues;

import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;
import org.eclipse.example.library.Book;
import org.eclipse.example.library.BookCategory;
import org.eclipse.example.library.Library;
import org.eclipse.example.library.LibraryFactory;
import org.eclipse.example.library.LibraryPackage;
import org.eclipse.example.library.Writer;

/**
 * Tests the refreshing of an object outside of a resource.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.20 $
 */
public class RefreshObjectLibraryNoResourceTestAction extends AbstractTestAction {
	public RefreshObjectLibraryNoResourceTestAction() {
		super(LibraryPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		final LibraryFactory factory = LibraryFactory.eINSTANCE;

		// create a book, writer and library
		try {
			{
				store.beginTransaction();
				final Writer writer = factory.createWriter();
				writer.setName("JRR_Tolkien");

				final Book book = factory.createBook();
				book.setAuthor(writer);
				book.setPages(510);
				book.setTitle("Fellowship_of_the_Ring");
				book.setCategory(BookCategory.SCIENCE_FICTION);
				final Book book2 = factory.createBook();
				book2.setAuthor(writer);
				book2.setPages(500);
				book2.setTitle("The_Hobbit");
				book2.setCategory(BookCategory.SCIENCE_FICTION);

				// sorry george making a mistake here, will correct this below
				final Book book3 = factory.createBook();
				book3.setAuthor(writer);
				book3.setPages(500);
				book3.setTitle("nineteeneightyfour");
				book3.setCategory(BookCategory.SCIENCE_FICTION);
				final Library library = factory.createLibrary();
				library.setName("Science_Fiction");
				library.getBooks().add(book);
				library.getBooks().add(book2);
				library.getBooks().add(book3);
				library.getWriters().add(writer);
				store.store(library);
				store.commitTransaction();
			}

			// walk through the structure starting from the library
			{
				store.beginTransaction();
				Library lib = (Library) store.getObject(Library.class);
				store.refresh(lib);

				Writer tolkien = lib.getWriters().get(0);
				assertTrue(tolkien.getName().equals("JRR_Tolkien"));
				Book orwellsBook = tolkien.getBooks().get(2);
				assertTrue(orwellsBook.getTitle().compareTo("nineteeneightyfour") == 0);

				// add orwell as a writer
				final Writer george = factory.createWriter();
				george.setName("George_Orwell");
				orwellsBook.setAuthor(george);

				// and put george in our library
				lib.getWriters().add(george);

				assertEquals(2, tolkien.getBooks().size());
				assertEquals(3, lib.getBooks().size());

				// and save it all
				store.store(lib);
				store.flush();
				store.refresh(lib);

				george.setName("G._Orwell"); // there was a bug in which this
				assertTrue(lib.getBooks().size() > 0);
				assertTrue(lib.getWriters().size() > 0);
				store.commitTransaction();
			}

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
