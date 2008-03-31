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
 * $Id: SimpleLibraryResourceAction.java,v 1.1 2008/03/31 07:04:20 mtaal Exp $
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
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class SimpleLibraryResourceAction extends AbstractTestAction {
	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public SimpleLibraryResourceAction() {
		super(LibraryPackage.eINSTANCE);
	}

	protected boolean hibernateEnabled() {
		return true;
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
				writer.setName("JRR Tolkien");

				final Book book = factory.createBook();
				book.setAuthor(writer);
				book.setPages(510);
				book.setTitle("Fellowship of the Ring");
				book.setCategory(BookCategory.SCIENCE_FICTION_LITERAL);

				final Library library = factory.createLibrary();
				library.setName("Science Fiction");
				library.getBooks().add(book);
				library.getWriters().add(writer);

				res.getContents().add(library);
				assertTrue(book.eDeliver());
				assertTrue(writer.eDeliver());
				res.save(null);
				assertTrue(book.eDeliver());
				assertTrue(writer.eDeliver());
				res.unload();
			}

			// walk through the structure starting from the library
			{
				Resource res = getResource(store);
				res.load(null);

				Library lib = (Library) res.getContents().get(0);
				Writer tolkien = lib.getWriters().get(0);
				assertEquals("JRR Tolkien", tolkien.getName());
				tolkien.setName("Tolkien");
				assertTrue(tolkien.eDeliver());
				res.save(null);
				assertTrue(tolkien.eDeliver());
				assertTrue(lib.getBooks().get(0).eDeliver());
			}
		} catch (IOException e) {
			throw new StoreTestException("IOException during save", e);
		}
	}

	protected Resource getResource(TestStore store) {
		return store.getResource();
	}
}
