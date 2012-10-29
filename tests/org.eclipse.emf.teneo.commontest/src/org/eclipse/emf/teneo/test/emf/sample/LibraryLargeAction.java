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
 * $Id: LibraryLargeAction.java,v 1.3 2008/10/12 11:24:40 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.samples.emf.sample.library.Book;
import org.eclipse.emf.teneo.samples.emf.sample.library.BookCategory;
import org.eclipse.emf.teneo.samples.emf.sample.library.Library;
import org.eclipse.emf.teneo.samples.emf.sample.library.LibraryFactory;
import org.eclipse.emf.teneo.samples.emf.sample.library.LibraryPackage;
import org.eclipse.emf.teneo.samples.emf.sample.library.Writer;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests the library example of emf/xsd using a larger dataset.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class LibraryLargeAction extends AbstractTestAction {

	private static final int BK_CNT = 1000;
	private static final int WRITER_CNT = 100;
	private static final int LIB_CNT = 1;
	private static final int NUM_OF_TRANS = 3;

	private static final int NUM_WRITER_TRANSACTION = LIB_CNT * WRITER_CNT;
	private static final int NUM_BOOK_TRANSACTION = NUM_WRITER_TRANSACTION * BK_CNT;

	public LibraryLargeAction() {
		super(LibraryPackage.eINSTANCE);
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		// props.setProperty(PersistenceOptions.MAP_ALL_LISTS_AS_IDBAG, "true");
		props.setProperty(PersistenceOptions.ALWAYS_MAP_LIST_AS_BAG, "true");
		return props;
	}

	@Override
	public void doAction(TestStore store) {
		{
			long t = System.currentTimeMillis();
			for (int j = 0; j < NUM_OF_TRANS; j++) {
				store.beginTransaction();
				for (int i = 0; i < LIB_CNT; i++) {
					store.store(createLibrary(i + " Number " + j));
				}
				System.err.println("before commit");
				long commitTime = System.currentTimeMillis();
				store.commitTransaction();
				System.err.println("Transaction " + (j + 1) + " inserted library(#" + LIB_CNT
						+ ") and Writer(#" + NUM_WRITER_TRANSACTION + ") and Book(#" + NUM_BOOK_TRANSACTION
						+ ") in " + ((System.currentTimeMillis() - t) / 1000)
						+ " seconds of which the commit took "
						+ ((System.currentTimeMillis() - commitTime) / 1000));
				t = System.currentTimeMillis();
			}
		}

		// load each writer and add a book
		{
			long t = System.currentTimeMillis();
			store.beginTransaction();
			final List<?> ls = store.getObjects(Library.class);
			for (Object o : ls) {
				final Library l = (Library) o;
				System.err.println(l.getName());
				for (Writer w : l.getWriters()) {
					// removed the book in the middle
					final Book removeBk = w.getBooks().remove(BK_CNT / 2);
					l.getBooks().remove(removeBk);

					// and add a book in the middle
					final Book bk = LibraryFactory.eINSTANCE.createBook();
					bk.setPages(BK_CNT);
					bk.setTitle(w.getName() + "bk");
					bk.setCategory(BookCategory.MYSTERY_LITERAL);
					bk.setAuthor(w);

					l.getBooks().add(BK_CNT / 2, bk);
				}
			}
			store.commitTransaction();
			System.err.println("Time to remove and add " + (LIB_CNT * WRITER_CNT) + " books: "
					+ ((System.currentTimeMillis() - t) / 1000) + " seconds ");
		}
	}

	private Library createLibrary(String prefix) {
		final LibraryFactory factory = LibraryFactory.eINSTANCE;
		final Library l = factory.createLibrary();
		l.setName(prefix + " Library");
		for (int i = 0; i < WRITER_CNT; i++) {
			final Writer w = factory.createWriter();
			w.setName(prefix + " Writer " + i);
			l.getWriters().add(w);
			createBooks(l, w, prefix);
		}
		return l;
	}

	private void createBooks(Library l, Writer w, String prefix) {
		final LibraryFactory factory = LibraryFactory.eINSTANCE;
		for (int i = 0; i < BK_CNT; i++) {
			final Book bk = factory.createBook();
			bk.setTitle(prefix + " Book " + i);
			bk.setAuthor(w);
			bk.setPages(i);
			bk.setCategory(BookCategory.BIOGRAPHY_LITERAL);
			l.getBooks().add(bk);
		}
	}

	/** Reads objects in multiple sessions and checks that they are unequal */
	@SuppressWarnings("unchecked")
	protected void checkUseCache(TestStore store) {
		// read the writers in the cache
		store.refresh();
		store.beginTransaction();
		final Writer writer = store.getObject(Writer.class);
		assertTrue(writer != null);
		store.commitTransaction();
		store.refresh();
		store.beginTransaction();
		final List books1 = new ArrayList(store.getObjects(Book.class));
		store.commitTransaction();
		store.refresh();
		store.beginTransaction();
		final List books2 = new ArrayList(store.getObjects(Book.class));
		assertTrue(books1.size() == books2.size());
		store.commitTransaction();
		for (int i = 0; i < books1.size(); i++) {
			final Book bk1 = (Book) books1.get(i);
			final Book bk2 = (Book) books2.get(i);
			assertEquals(bk1.getTitle(), bk2.getTitle());
			assertTrue(bk1 != bk2);
			assertTrue(bk1.getAuthor() != bk2.getAuthor());
		}
	}
}
