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
 * $Id: TestLazyUtilsAction.java,v 1.4 2010/03/27 21:14:42 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.sample;

import java.util.Iterator;
import java.util.List;

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
 * Tests the LazyUtils class.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
public class TestLazyUtilsAction extends AbstractTestAction {

	private static int BOOK_COUNT = 100;

	public TestLazyUtilsAction() {
		super(LibraryPackage.eINSTANCE);
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
			Library lib = (Library) store.query(Library.class, "name", "Science Fiction Library", 1).get(
					0);

			testLazySize(lib.getWriters());
			testLazySize(lib.getBooks());

			assertTrue((lib.getWriters().get(0)).getName().compareTo("JRR Tolkien") == 0);
			testLazySize(lib.getWriters().get(0).getBooks());
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			final Library library = store.getObject(Library.class);
			final Writer writer = store.getObject(Writer.class);
			library.getBooks().clear();
			writer.getBooks().clear();
			// create and store a BOOK_COUNT books
			for (int i = 0; i < BOOK_COUNT; i++) {
				final Book book = factory.createBook();
				book.setAuthor(writer);
				book.setPages(i);
				book.setTitle("bk" + i);
				book.setCategory(BookCategory.SCIENCE_FICTION_LITERAL);
				library.getBooks().add(book);
			}
			store.commitTransaction();
		}
		store.checkNumber(Book.class, BOOK_COUNT);
		{
			store.beginTransaction();
			final Library library = store.getObject(Library.class);
			final Iterator<Book> books = LazyCollectionUtils.getPagedLoadingIterator(library.getBooks(),
					10);
			int bkCount = 0;
			while (books.hasNext()) {
				final Book bk = books.next();
				assertEquals("bk" + bkCount, bk.getTitle());
				bkCount++;
			}
			checkIsStillLazy(library.getBooks());
			assertEquals(BOOK_COUNT, bkCount);
		}
	}

	protected void testLazySize(List<?> list) {
		final PersistableEList<?> persistableEList = (PersistableEList<?>) list;
		final PersistentCollection persistentCollection = (PersistentCollection) persistableEList
				.getDelegate();
		assertFalse(persistentCollection.wasInitialized());
		assertFalse(persistableEList.isLoaded());
		int size = LazyCollectionUtils.size(list);
		assertTrue(size > 0);
		assertFalse(persistentCollection.wasInitialized());
		assertFalse(persistableEList.isLoaded());
	}

	protected void checkIsStillLazy(List<?> list) {
		final PersistableEList<?> persistableEList = (PersistableEList<?>) list;
		final PersistentCollection persistentCollection = (PersistentCollection) persistableEList
				.getDelegate();
		assertFalse(persistentCollection.wasInitialized());
		assertFalse(persistableEList.isLoaded());
	}

}
