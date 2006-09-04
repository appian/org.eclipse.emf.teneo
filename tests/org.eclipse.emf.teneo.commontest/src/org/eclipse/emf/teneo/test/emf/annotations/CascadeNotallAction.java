/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: CascadeNotallAction.java,v 1.3 2006/09/04 08:38:59 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.teneo.samples.emf.annotations.cascadenotall.Book;
import org.eclipse.emf.teneo.samples.emf.annotations.cascadenotall.BookCategory;
import org.eclipse.emf.teneo.samples.emf.annotations.cascadenotall.CascadenotallFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.cascadenotall.CascadenotallPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.cascadenotall.Library;
import org.eclipse.emf.teneo.samples.emf.annotations.cascadenotall.Writer;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests the library example without orphan delete or dependent element
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class CascadeNotallAction extends AbstractTestAction {
	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public CascadeNotallAction() {
		super(CascadenotallPackage.eINSTANCE);
	}

	protected boolean hibernateEnabled() {
		return true;
	}

	/** Creates an item, an address and links them to a po. */
	public void doAction(TestStore store) {
		final CascadenotallFactory factory = CascadenotallFactory.eINSTANCE;

		// create a book, writer and library
		try {
			{
				Resource res = store.getResource();
				res.load(null);

				final Writer writer = factory.createWriter();
				writer.setName("JRR Tolkien");

				final Book book = factory.createBook();
				book.setAuthor(writer);
				book.setPages(510);
				book.setTitle("Fellowship of the Ring");
				book.setCategory(BookCategory.SCIENCE_FICTION_LITERAL);

				final Book book2 = factory.createBook();
				book2.setAuthor(writer);
				book2.setPages(500);
				book2.setTitle("The Hobbit");
				book2.setCategory(BookCategory.SCIENCE_FICTION_LITERAL);

				// sorry george making a mistake here, will correct this below
				final Book book3 = factory.createBook();
				book3.setAuthor(writer);
				book3.setPages(500);
				book3.setTitle("1984");
				book3.setCategory(BookCategory.SCIENCE_FICTION_LITERAL);

				final Library library = factory.createLibrary();
				library.setName("Science Fiction");
				library.getBooks().add(book);
				library.getBooks().add(book2);
				library.getBooks().add(book3);
				library.getWriters().add(writer);

				res.getContents().add(library);
				res.save(null);
				res.save(null);
			}

			// walk through the structure starting from the library
			{
				Resource res = store.getResource();
				res.load(null);

				Library lib = (Library) res.getContents().get(0);

				Writer tolkien = (Writer) lib.getWriters().get(0);

				/*
				 * final Object[] obj = ((StoreResource)res).getCrossReferencers(tolkien); for (int i = 0; i < obj.length; i++) {
				 * System.err.println(obj.getClass().getName()); }
				 */

				/*
				 * assertEquals(3, tolkien.getBooks().size());
				 * 
				 * assertEquals(0 , tolkien.getName().compareTo("JRR Tolkien")); Book wBook = (Book)tolkien.getBooks().get(0); Book
				 * lBook = (Book)lib.getBooks().get(0); assertTrue("Book is contained in the library", wBook.eContainer() == lib);
				 * assertTrue("Book is contained in the library", lBook.eContainer() == lib);
				 * 
				 * assertTrue(lBook.getAuthor() == tolkien); assertTrue(tolkien.getBooks().contains(lBook));
				 * assertTrue(tolkien.getBooks().contains(wBook));
				 *  // ordering is the same assertTrue(wBook.getTitle().compareTo(lBook.getTitle()) == 0); assertTrue(wBook.getPages() ==
				 * lBook.getPages()); assertTrue(wBook.getCategory() instanceof BookCategory); assertTrue(wBook.getCategory() ==
				 * BookCategory.SCIENCE_FICTION_LITERAL);
				 */
				// correct the mistake we made
				Book orwellsBook = (Book) tolkien.getBooks().get(2);
				assertTrue(orwellsBook.getTitle().compareTo("1984") == 0);

				// add orwell as a writer
				final Writer george = factory.createWriter();
				george.setName("George Orwell");
				orwellsBook.setAuthor(george);

				// and put george in our library
				lib.getWriters().add(george);

				assertEquals(2, tolkien.getBooks().size());

				// and save it all
				res.save(null);
				res.save(null);

				george.setName("G. Orwell"); // there was a bug in which this failed, reported by Georgi Manev
				res.save(null);
				res.save(null);
			}

			// TODO put in JPOX specific test code
			// // now retrieve the writer using a simple query
			// if (store instanceof JPOXTestStore)
			// {
			// store.beginTransaction();
			// Writer george = (Writer)store.query("SELECT FROM " + JPOXHelper.INSTANCE.getInstanceClassName(Writer.class) +
			// " WHERE name == \"G. Orwell\"", 1).get(0);
			// assertTrue(george.getBooks().size() == 1);
			// Book georgesBook = (Book)george.getBooks().get(0);
			// assertTrue(georgesBook.getAuthor() == george);
			// store.commitTransaction();
			// }
		} catch (IOException e) {
			throw new StoreTestException("IOException during save", e);
		}
		
		try {
			Resource res = store.getResource();
			res.load(null);

			Library lib = (Library) res.getContents().get(0);

			Writer writer = (Writer) lib.getWriters().get(0);
			
			Library newLib = factory.createLibrary();
			newLib.setName("tstlib");
			res.getContents().add(newLib);
			lib.getWriters().remove(writer);
			assertTrue(lib.getBooks().size() > 0); // force load of books to prevent dangling error in jpox
			newLib.getWriters().add(writer);
			res.save(null);
			
		} catch (IOException e) {
			throw new StoreTestException("IOException during save", e);
		}
		
		// and check if cascade delete works!
		
		try {
			Resource res = store.getResource();
			res.load(null);

			Library lib = (Library) res.getContents().get(0);
			
			assertTrue(lib.getName() != null); //get rid of warning
			
			// delete both libraries
			res.getContents().remove(0); 
			res.getContents().remove(0);			
			res.save(null);
		} catch (IOException e) {
			throw new StoreTestException("IOException during save", e);
		}
		
		store.beginTransaction();
		store.checkNumber(Writer.class, 0);
		store.checkNumber(Book.class, 0);
		store.checkNumber(Library.class, 0);
		store.commitTransaction();
	}
}
