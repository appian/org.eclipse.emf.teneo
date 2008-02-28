/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: LibraryResourceAction.java,v 1.11 2008/02/28 07:08:16 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.teneo.samples.emf.sample.library.Book;
import org.eclipse.emf.teneo.samples.emf.sample.library.BookCategory;
import org.eclipse.emf.teneo.samples.emf.sample.library.Library;
import org.eclipse.emf.teneo.samples.emf.sample.library.LibraryFactory;
import org.eclipse.emf.teneo.samples.emf.sample.library.LibraryPackage;
import org.eclipse.emf.teneo.samples.emf.sample.library.Writer;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests the library example of emf/xsd using a resource. Actually tests bidirectional references
 * using resources. Most other aspects of resources are handled in the Catalog example.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.11 $
 */
public class LibraryResourceAction extends AbstractTestAction {
	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public LibraryResourceAction() {
		super(LibraryPackage.eINSTANCE);
	}

	protected boolean hibernateEnabled() {
		return true;
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	@SuppressWarnings("unchecked")
	public void doAction(TestStore store) {
		final LibraryFactory factory = LibraryFactory.eINSTANCE;

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
				res.unload();
			}

			// walk through the structure starting from the library
			String libURI = null;
			String writerURI = null;
			{
				Resource res = store.getResource();
				res.setTrackingModification(true);
				res.load(null);

				Library lib = (Library) res.getContents().get(0);

				Writer tolkien = lib.getWriters().get(0);

				libURI = res.getURIFragment(lib);
				writerURI = res.getURIFragment(tolkien);

				/*
				 * final Object[] obj = ((StoreResource)res).getCrossReferencers(tolkien); for (int
				 * i = 0; i < obj.length; i++) {
				 */

				/*
				 * assertEquals(3, tolkien.getBooks().size());
				 * 
				 * assertEquals(0 , tolkien.getName().compareTo("JRR Tolkien")); Book wBook =
				 * (Book)tolkien.getBooks().get(0); Book lBook = (Book)lib.getBooks().get(0);
				 * assertTrue("Book is contained in the library", wBook.eContainer() == lib);
				 * assertTrue("Book is contained in the library", lBook.eContainer() == lib);
				 * 
				 * assertTrue(lBook.getAuthor() == tolkien);
				 * assertTrue(tolkien.getBooks().contains(lBook));
				 * assertTrue(tolkien.getBooks().contains(wBook)); // ordering is the same
				 * assertTrue(wBook.getTitle().compareTo(lBook.getTitle()) == 0);
				 * assertTrue(wBook.getPages() == lBook.getPages()); assertTrue(wBook.getCategory()
				 * instanceof BookCategory); assertTrue(wBook.getCategory() ==
				 * BookCategory.SCIENCE_FICTION_LITERAL);
				 */
				// correct the mistake we made
				Book orwellsBook = tolkien.getBooks().get(2);
				assertTrue(orwellsBook.getTitle().compareTo("1984") == 0);

				// add orwell as a writer
				final Writer george = factory.createWriter();
				george.setName("George Orwell");
				orwellsBook.setAuthor(george);

				// and put george in our library
				lib.getWriters().add(george);

				assertEquals(2, tolkien.getBooks().size());
				assertEquals(3, lib.getBooks().size());

				// and save it all
				res.save(null);
				res.save(null);

				george.setName("G. Orwell"); // there was a bug in which this failed, reported by
				// Georgi Manev
				res.save(null);
				res.save(null);
				res.unload();
			}

			{
				Resource res = store.getResource();
				Library lib = (Library) res.getEObject(libURI);
				Writer w = (Writer) res.getEObject(writerURI);
				assertEquals("JRR Tolkien", w.getName());
				assertEquals(2, w.getBooks().size());
				assertEquals("The Hobbit", w.getBooks().get(1).getTitle());
				assertEquals(lib.getName(), "Science Fiction");
				assertTrue(lib.getWriters().contains(w));
				assertTrue(lib.getBooks().contains(w.getBooks().get(0)));
				res.unload();
			}

			// {
			//				
			// XMLResourceImpl xi = new XMLResourceImpl();
			// xi.getContents().add(tolkien);
			// FileOutputStream fos = new FileOutputStream("/home/mtaal/mytmp/test.xml");
			// xi.save(fos, Collections.EMPTY_MAP);
			//
			// ResourceSet rs = new ResourceSetImpl();
			// Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xml", new
			// XMLResourceFactoryImpl());
			//
			// Resource xi = rs.createResource(URI.createFileURI("/home/mtaal/mytmp/test.xml"));
			// //xi.load(fis, Collections.EMPTY_MAP);
			// xi.load(Collections.EMPTY_MAP);
			// Writer wt = (Writer)xi.getContents().get(0);
			// }

			// TODO put in JPOX specific test code
			// // now retrieve the writer using a simple query
			// if (store instanceof JPOXTestStore)
			// {
			// store.beginTransaction();
			// Writer george = (Writer)store.query("SELECT FROM " +
			// JPOXHelper.INSTANCE.getInstanceClassName(Writer.class) +
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

			Writer writer = lib.getWriters().get(0);

			Library newLib = factory.createLibrary();
			newLib.setName("tstlib");
			res.getContents().add(newLib);
			lib.getWriters().remove(writer);
			assertTrue(lib.getBooks().size() > 0); // force load of books to prevent dangling error
			// in jpox
			newLib.getWriters().add(writer);
			res.save(null);
			res.unload();
			fail("Orphan delete was not set"); // should fail
		} catch (Exception e) {
		}
	}
}
