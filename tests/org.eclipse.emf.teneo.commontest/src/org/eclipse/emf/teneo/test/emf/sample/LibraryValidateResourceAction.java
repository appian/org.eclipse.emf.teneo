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
 * $Id: LibraryValidateResourceAction.java,v 1.9 2009/04/03 06:15:39 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.teneo.StoreValidationException;
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
 * Tests if simple validation works for the resource implementation.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.9 $
 */
public class LibraryValidateResourceAction extends AbstractTestAction {
	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public LibraryValidateResourceAction() {
		super(LibraryPackage.eINSTANCE);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.test.AbstractTestAction#hibernateEnabled()
	 */
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
				writer.setName("JRR_Tolkien");

				final Book book = factory.createBook();
				book.setAuthor(writer);
				book.setPages(510);
				book.setCategory(BookCategory.SCIENCE_FICTION_LITERAL);

				final Library library = factory.createLibrary();
				library.getBooks().add(book);
				library.getWriters().add(writer);

				res.getContents().add(library);
				try {
					res.save(null);
					fail("Validation did not work");
				} catch (StoreValidationException e) {
					library.setName("Science_Fiction");
					book.setTitle("Fellowship_of_the_Ring");
					res.save(null);
					res.save(null);
				}

				res.save(null);
				res.unload();
			}

			{
				Resource res = store.getResource();
				res.load(null);

				// test tracking modification
				res.setTrackingModification(true);

				Library lib = null;
				for (int i = 0; i < res.getContents().size(); i++) {
					Object obj = res.getContents().get(i);
					if (obj instanceof Library) {
						lib = (Library) obj;
						break;
					}
				}

				assert (lib != null);
				Writer tolkien = lib.getWriters().get(0);

				tolkien.setName("Mr._Tolkien");

				Writer orwell = factory.createWriter();
				orwell.setName("G._Orwell");
				lib.getWriters().add(orwell);

				final StoreResource sr = (StoreResource) res;
				final List<EObject> ca = sr.getNewEObjects();
				final HashSet<EObject> cm = sr.getModifiedEObjects();
				assertEquals(2, ca.size() + cm.size());
				assertTrue(cm.contains(tolkien));
				assertTrue(ca.contains(orwell));

				res.save(null);
				res.unload();
			}

			{
				// special test case which occurs when an invalid object is added to an elist which
				// was
				Resource res = store.getResource();
				res.load(null);

				Library lib = (Library) res.getContents().get(0);

				// create a writer
				Writer martin = factory.createWriter();

				// and then set the name
				martin.setName("martin");

				// add to library, writer name not set so invalid
				lib.getWriters().add(martin);

				// now we can savely save
				res.save(null);
				res.unload();
			}

			{
				Resource res = store.getResource();
				res.load(null);
				Library lib = (Library) res.getContents().get(0);
				boolean martinFound = false;
				for (int i = 0; i < lib.getWriters().size(); i++) {
					Writer wt = lib.getWriters().get(i);
					martinFound = martinFound || wt.getName().compareTo("martin") == 0;
				}
				assertTrue("New writer martin was not committed", martinFound);
				res.unload();
			}
		} catch (IOException e) {
			throw new StoreTestException("IOException during save", e);
		}
	}

	/** Specific Hibernate flush test */
	protected void testFlush(Resource res) {
		/*
		 * if (res instanceof HibernateResource) { HibernateResource hres = (HibernateResource)res; Session session =
		 * hres.getSession(); Transaction tx = session.beginTransaction(); // this should not fail! try { tx.commit(); }
		 * // there should be a finally block but this is only a test catch (Exception e) { fail("The transaction commit
		 * should not flush illegal objects to the database"); } }
		 */
	}
}
