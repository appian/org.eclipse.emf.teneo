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
 * $Id: LibraryResourceAction.java,v 1.20 2010/02/07 23:12:02 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.teneo.resource.StoreResource;
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
 * @version $Revision: 1.20 $
 */
public class LibraryResourceAction extends AbstractTestAction {
	public LibraryResourceAction() {
		super(LibraryPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		final LibraryFactory factory = LibraryFactory.eINSTANCE;

		// create a book, writer and library
		try {
			{
				Resource res = getResource(store);
				res.load(null);

				final Writer writer = factory.createWriter();
				writer.setName("JRR_Tolkien");

				final Book book = factory.createBook();
				book.setAuthor(writer);
				book.setPages(510);
				book.setTitle("Fellowship_of_the_Ring");
				book.setCategory(BookCategory.SCIENCE_FICTION_LITERAL);
				final Book book2 = factory.createBook();
				book2.setAuthor(writer);
				book2.setPages(500);
				book2.setTitle("The_Hobbit");
				book2.setCategory(BookCategory.SCIENCE_FICTION_LITERAL);

				// sorry george making a mistake here, will correct this below
				final Book book3 = factory.createBook();
				book3.setAuthor(writer);
				book3.setPages(500);
				book3.setTitle("nineteeneightyfour");
				book3.setCategory(BookCategory.SCIENCE_FICTION_LITERAL);
				final Library library = factory.createLibrary();
				library.setName("Science_Fiction");
				library.getBooks().add(book);
				library.getBooks().add(book2);
				library.getBooks().add(book3);
				library.getWriters().add(writer);

				res.getContents().add(library);
				res.save(null);
				res.save(null);
				res.unload();
				assertTrue(res.getContents().size() == 0);
				assertTrue(library.getBooks().size() > 0);
				assertTrue(library.getWriters().size() > 0);
			}

			// walk through the structure starting from the library
			String libURI = null;
			String writerURI = null;
			{
				Resource res = getResource(store);
				// res.setTrackingModification(true);
				res.load(null);

				Library lib = (Library) res.getContents().get(0);

				Writer tolkien = lib.getWriters().get(0);

				libURI = res.getURIFragment(lib);
				writerURI = res.getURIFragment(tolkien);

				/*
				 * final Object[] obj = ((StoreResource)res).getCrossReferencers(tolkien); for (int i = 0; i
				 * < obj.length; i++) {
				 */

				/*
				 * assertEquals(3, tolkien.getBooks().size());
				 * 
				 * assertEquals(0 , tolkien.getName().compareTo("JRR Tolkien")); Book wBook =
				 * (Book)tolkien.getBooks().get(0); Book lBook = (Book)lib.getBooks().get(0);
				 * assertTrue("Book is contained in the library", wBook.eContainer() == lib);
				 * assertTrue("Book is contained in the library", lBook.eContainer() == lib);
				 * 
				 * assertTrue(lBook.getAuthor() == tolkien); assertTrue(tolkien.getBooks().contains(lBook));
				 * assertTrue(tolkien.getBooks().contains(wBook)); // ordering is the same
				 * assertTrue(wBook.getTitle().compareTo(lBook.getTitle()) == 0);
				 * assertTrue(wBook.getPages() == lBook.getPages()); assertTrue(wBook.getCategory()
				 * instanceof BookCategory); assertTrue(wBook.getCategory() ==
				 * BookCategory.SCIENCE_FICTION_LITERAL);
				 */
				// correct the mistake we made
				Book orwellsBook = tolkien.getBooks().get(2);
				assertTrue(orwellsBook.getTitle().compareTo("nineteeneightyfour") == 0);

				// add orwell as a writer
				final Writer george = factory.createWriter();
				george.setName("George_Orwell");
				orwellsBook.setAuthor(george);

				// and put george in our library
				lib.getWriters().add(george);

				if (!isEAVTest()) {
					assertEquals(2, tolkien.getBooks().size());
					assertEquals(3, lib.getBooks().size());
				}

				// and save it all
				res.save(null);
				res.save(null);

				george.setName("G._Orwell"); // there was a bug in which this
				// failed, reported by
				// Georgi Manev
				res.save(null);
				res.save(null);
				res.unload();
				assertTrue(res.getContents().size() == 0);
				assertTrue(lib.getBooks().size() > 0);
				assertTrue(lib.getWriters().size() > 0);
			}

			{
				Resource res = getResource(store);
				Library lib = (Library) res.getEObject(libURI);

				final StoreResource sr = (StoreResource) res;
				assertFalse(sr.getNewEObjects().contains(lib));

				Writer w = (Writer) res.getEObject(writerURI);
				assertFalse(sr.getNewEObjects().contains(w));
				assertEquals("JRR_Tolkien", w.getName());
				if (!isEAVTest()) {
					assertEquals(2, w.getBooks().size());
				}
				assertEquals("The_Hobbit", w.getBooks().get(1).getTitle());
				assertEquals(lib.getName(), "Science_Fiction");
				assertTrue(lib.getWriters().contains(w));
				assertTrue(lib.getBooks().contains(w.getBooks().get(0)));
				res.unload();
				assertTrue(res.getContents().size() == 0);
				assertTrue(lib.getBooks().size() > 0);
				assertTrue(lib.getWriters().size() > 0);
			}

			{
				Resource res = getResource(store);
				Library lib = (Library) res.getEObject(libURI);
				Writer w = factory.createWriter();
				w.setName("writer");
				Book b = factory.createBook();
				b.setTitle("title");
				b.setPages(1);
				b.setCategory(BookCategory.SCIENCE_FICTION_LITERAL);
				w.getBooks().add(b);
				lib.getWriters().add(0, w);
				lib.getBooks().add(b);
				res.save(null);
				assertTrue(lib.getBooks().size() > 0);
				assertTrue(lib.getWriters().size() > 0);
			}

			// {
			//
			// XMLResourceImpl xi = new XMLResourceImpl();
			// xi.getContents().add(tolkien);
			// FileOutputStream fos = new
			// FileOutputStream("/home/mtaal/mytmp/test.xml");
			// xi.save(fos, Collections.EMPTY_MAP);
			//
			// ResourceSet rs = new ResourceSetImpl();
			// Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xml",
			// new
			// XMLResourceFactoryImpl());
			//
			// Resource xi =
			// rs.createResource(URI.createFileURI("/home/mtaal/mytmp/test.xml"));
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
			Resource res = getResource(store);
			res.load(null);
			Library lib = (Library) res.getContents().get(0);
			assertTrue(lib.getBooks().size() > 0);
			assertTrue(lib.getWriters().size() > 0);
			res.unload();
			assertTrue(res.getContents().size() == 0);
			assertTrue(lib.getBooks().size() > 0);
			assertTrue(lib.getWriters().size() > 0);
		} catch (IOException e) {
			throw new StoreTestException(e.getMessage(), e);
		}

		try {
			Resource res = getResource(store);
			res.load(null);

			Library lib = (Library) res.getContents().get(0);

			Writer writer = lib.getWriters().get(0);

			Library newLib = factory.createLibrary();
			newLib.setName("tstlib");
			res.getContents().add(newLib);
			lib.getWriters().remove(writer);
			assertTrue(lib.getBooks().get(0) != null); // force load of books to
			// prevent dangling error
			// in jpox
			newLib.getWriters().add(writer);
			res.save(null);
			res.unload();
			fail("Orphan delete was not set"); // should fail
		} catch (Exception e) {
			// note the above fail will throw an error so that one
			// does not end up here
		}
	}

	protected Resource getResource(TestStore store) {
		return store.getResource();
	}
}
