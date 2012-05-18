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
 * $Id: LibraryExtraLazyAction.java,v 1.1 2010/03/24 17:33:56 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.sample;

import java.util.List;
import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.LazyCollectionUtils;
import org.eclipse.emf.teneo.mapping.elist.PersistableEList;
import org.eclipse.emf.teneo.samples.emf.sample.library.Book;
import org.eclipse.emf.teneo.samples.emf.sample.library.BookCategory;
import org.eclipse.emf.teneo.samples.emf.sample.library.Library;
import org.eclipse.emf.teneo.samples.emf.sample.library.LibraryFactory;
import org.eclipse.emf.teneo.samples.emf.sample.library.LibraryPackage;
import org.eclipse.emf.teneo.samples.emf.sample.library.Writer;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;
import org.hibernate.collection.spi.PersistentCollection;

/**
 * Tests the extra lazy behavior of collections.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class LibraryExtraLazyAction extends AbstractTestAction {

	public LibraryExtraLazyAction() {
		super(LibraryPackage.eINSTANCE);
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.FETCH_ASSOCIATION_EXTRA_LAZY, "true");
		return props;
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		final LibraryFactory factory = LibraryFactory.eINSTANCE;
		// create a book, writer and library
		{
			store.beginTransaction();

			final Writer writer = factory.createWriter();
			writer.setName("JRR Tolkien");

			final Book book = factory.createBook();

			book.setAuthor(writer);
			book.setPages(5);
			book.setTitle("The Hobbit");
			book.setCategory(BookCategory.SCIENCE_FICTION_LITERAL);

			final Book book2 = factory.createBook();
			book2.setAuthor(writer);
			book2.setPages(5);
			book2.setTitle("The fellowship of the ring");
			book2.setCategory(BookCategory.SCIENCE_FICTION_LITERAL);

			final Library library = factory.createLibrary();
			library.getBooks().add(book);
			library.setName("Science Fiction Library");
			library.getBooks().add(book2);
			library.getWriters().add(writer);
			store.store(library);

			store.commitTransaction();
			assertEquals(2, writer.getBooks().size());
		}

		{
			store.beginTransaction();
			Library lib = (Library) store.query(Library.class, "name", "Science Fiction Library", 1).get(0);
			
			testLazySize(lib.getWriters());
			testLazySize(lib.getBooks());
			
			assertTrue((lib.getWriters().get(0)).getName().compareTo("JRR Tolkien") == 0);
			testLazySize(lib.getWriters().get(0).getBooks());
			store.commitTransaction();
		}

		// check container relations
		{
			store.beginTransaction();

			final Writer writ = store.getObjects(Writer.class).get(0);
			final Library lib = (Library)writ.eContainer();

			final Book book = factory.createBook();
			book.setAuthor(writ);
			book.setPages(5);
			book.setTitle("test");
			book.setCategory(BookCategory.SCIENCE_FICTION_LITERAL);
			checkIsStillLazy(writ.getBooks());
			lib.getBooks().add(book);
			checkIsStillLazy(lib.getBooks());
			store.commitTransaction();
			checkIsStillLazy(lib.getBooks());
		}
	}

	protected void testLazySize(List<?> list) {
		final PersistableEList<?> persistableEList = (PersistableEList<?>)list;
		final PersistentCollection persistentCollection = (PersistentCollection)persistableEList.getDelegate();
		assertFalse(persistentCollection.wasInitialized());
		assertFalse(persistableEList.isLoaded());
		int size = LazyCollectionUtils.size(list);
		assertTrue(size > 0);
		assertFalse(persistentCollection.wasInitialized());
		assertFalse(persistableEList.isLoaded());
	}

	protected void checkIsStillLazy(List<?> list) {
		final PersistableEList<?> persistableEList = (PersistableEList<?>)list;
		final PersistentCollection persistentCollection = (PersistentCollection)persistableEList.getDelegate();
		assertFalse(persistentCollection.wasInitialized());
		assertFalse(persistableEList.isLoaded());
	}

}
