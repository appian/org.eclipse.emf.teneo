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
 * $Id: LibraryResourceCutPasteAction.java,v 1.1 2006/07/04 22:12:15 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.io.IOException;
import java.util.Collections;
import java.util.Properties;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.teneo.samples.emf.sample.library.Book;
import org.eclipse.emf.teneo.samples.emf.sample.library.BookCategory;
import org.eclipse.emf.teneo.samples.emf.sample.library.Library;
import org.eclipse.emf.teneo.samples.emf.sample.library.LibraryFactory;
import org.eclipse.emf.teneo.samples.emf.sample.library.LibraryPackage;
import org.eclipse.emf.teneo.samples.emf.sample.library.Writer;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests cut/paste action
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class LibraryResourceCutPasteAction extends AbstractTestAction {
	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public LibraryResourceCutPasteAction() {
		super(LibraryPackage.eINSTANCE);
	}

	
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.teneo.test.AbstractTestAction#getExtraConfigurationProperties()
	 */
	public Properties getExtraConfigurationProperties() {
		Properties props = new Properties();
		props.setProperty(PersistenceOptions.SET_CASCADE_ALL_ON_CONTAINMENT, "false");
		return props;
	}

	/** Runs testcase */
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

				final Library library = factory.createLibrary();
				library.setName("Science Fiction");
				library.getBooks().add(book);
				library.getBooks().add(book2);
				library.getWriters().add(writer);

				final Library library2 = factory.createLibrary();
				library2.setName("Literature");

				res.getContents().add(library);
				res.getContents().add(library2);
				res.save(null);
			}

			// walk through the structure starting from the library
			{
				Resource res = store.getResource();
				res.load(null);

				Library lib = (Library) res.getContents().get(0);
				Library lib2 = (Library) res.getContents().get(1);

				// cut from paste to
				Library from = null;
				Library to = null;

				if (lib.getName().compareTo("Literature") == 0) {
					from = lib2;
					to = lib;
				} else {
					to = lib2;
					from = lib;
				}

				Writer tolkien = (Writer) from.getWriters().remove(0);
				to.getWriters().add(tolkien);
				res.save(Collections.EMPTY_MAP);
			}
			
			// check cascade deletes
			{
				Resource res = store.getResource();
				res.load(null);
				res.getContents().remove(0);
				res.getContents().remove(0);
				res.save(null);
			}
			
			store.checkNumber(Writer.class, 0);
			store.checkNumber(Book.class, 0);
			store.checkNumber(Library.class, 0);
		} catch (IOException e) {
			throw new StoreTestException("IOException during save", e);
		}
	}
}
