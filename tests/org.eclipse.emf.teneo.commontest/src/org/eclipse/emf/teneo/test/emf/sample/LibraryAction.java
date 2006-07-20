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
 * $Id: LibraryAction.java,v 1.2 2006/07/20 06:53:02 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.teneo.samples.emf.sample.library.Book;
import org.eclipse.emf.teneo.samples.emf.sample.library.BookCategory;
import org.eclipse.emf.teneo.samples.emf.sample.library.Library;
import org.eclipse.emf.teneo.samples.emf.sample.library.LibraryFactory;
import org.eclipse.emf.teneo.samples.emf.sample.library.LibraryPackage;
import org.eclipse.emf.teneo.samples.emf.sample.library.Writer;
import org.eclipse.emf.teneo.Constants;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests the library example of emf/xsd.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class LibraryAction extends AbstractTestAction {
	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public LibraryAction() {
		super(LibraryPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
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

		// walk through the structure starting from the library
		{
			store.beginTransaction();
			Library lib = (Library) store.query(Library.class, "name", "Science Fiction Library", 1).get(0);
			assertTrue(((Writer) lib.getWriters().get(0)).getName().compareTo("JRR Tolkien") == 0);

			final Object[] eobjs = store.getCrossReferencers((EObject)lib.getWriters().get(0), false);
			
			// these two books should be the same as this book is the first in the writers collection
			// and in the library collection
			Book wBook = (Book) ((Writer) lib.getWriters().get(0)).getBooks().get(0);
			Book lBook = (Book) lib.getBooks().get(0);

			// check container
			assertTrue(lBook.eContainer() == lib);

			assertTrue(wBook.getTitle().compareTo(lBook.getTitle()) == 0);
			assertTrue(wBook.getPages() == lBook.getPages());
			assertTrue(wBook.getCategory() instanceof BookCategory);
			assertTrue(wBook.getCategory() == BookCategory.SCIENCE_FICTION_LITERAL);
			store.commitTransaction();
		}

		// check container relations
		if (true) {
			store.beginTransaction();

			final Writer writ = (Writer) store.getObjects(Writer.class).get(0);

			// store.refresh(writ);

			// test notifications of the elist
			// disabled this test as the elist notifications have been disabled
			// WriterAdapter writerAdapter = new WriterAdapter();
			// writ.eAdapters().add(writerAdapter);
			// assertEquals(2, writ.getBooks().size()); // this should not trigger the adapter to be called
			// assertEquals(1, writerAdapter.getCountNotifications());

			checkContainerAfterWriterRetrieve(store, writ);

			Library lib = (Library) store.getCrossReferencers(writ, true)[0];
			checkContainerAfterLibraryRetrieve(store, writ);
			checkDetachCopy(store, writ);
			
			// now set the container of the writer
			assertTrue("The container of the writer should be set!", store.setContainer(writ));

			assertEquals(LibraryPackage.eINSTANCE.getLibrary_Writers().getFeatureID(), writ.eContainingFeature().getFeatureID());

			assertTrue("The container of the writer should be equal to the earlier retrieved Library", lib == writ.eContainer());

			final Object[] eobjs = store.getCrossReferencers(writ, false);
			assertEquals(3, eobjs.length);
			for (int i = 0; i < eobjs.length; i++) {
				final Object obj = eobjs[i];
				if (obj instanceof Library) {
					assertTrue(obj == lib);
				} else {
					assertTrue(((Book) obj).getAuthor() == writ);
					assertTrue(lib.getBooks().contains(obj));
				}
			}

			final Book bk = (Book) store.getObjects(Book.class).get(0);
			assertTrue(bk.eContainer() == lib);

			// check if the containing feature is also set correctly
			assertTrue(bk.eContainingFeature() == LibraryPackage.eINSTANCE.getLibrary_Books());

			assertTrue(lib.getBooks().contains(bk));

			store.refresh(lib);

			store.commitTransaction();
		}
	}
	
	// check detachcopy for jpox
	protected void checkDetachCopy(TestStore store, Writer writ) { }

	protected void checkContainerAfterLibraryRetrieve(TestStore store, final Writer writ) {
		// TODO specialize for Hibernate/JPOX, was:
		// if (store instanceof JPOXTestStore)
		// {
		// assertTrue("Container of writer is not yet set now, because of lazy loading of container relations",
		// writ.eContainer() == null);
		// }
	}

	protected void checkContainerAfterWriterRetrieve(TestStore store, final Writer writ) {
		// TODO specialize for Hibernate/JPOX, was:
		// if (store instanceof HibernateTestStore)
		// {
		// assertTrue(writ.eContainer() != null);
		// assertTrue(writ.eContainer() instanceof Library);
		// }
	}

	/**
	 * @return Returns <code>true</code> the given value indeed encodes a list
	 */
	protected boolean listValueOfCorrectType(Object value) {
		// TODO specialize hibernate/jpox, was
		// return (value instanceof PersistableEList || value instanceof org.eclipse.emf.teneo.jpox.emf.elist.EListWrapper)
		return true;
	}

	/** Small adapter test */
	private class WriterAdapter extends AdapterImpl {
		/** Counts the number of changes */
		private int countNotifications = 0;

		/**
		 * Returns <code>false</code>
		 * 
		 * @param type
		 *            the type.
		 * @return <code>false</code>
		 */
		public boolean isAdapterForType(Object type) {
			return type instanceof Writer;
		}

		/**
		 * Does nothing; clients may override so that it does something.
		 */
		public void notifyChanged(Notification msg) {
			assertTrue("The new value is of type: " + msg.getNewValue().getClass().getName(),
					listValueOfCorrectType(msg.getNewValue()));

			// must be a load event
			assertTrue("Eventtype is not load notification but: " + msg.getEventType(),
					msg.getEventType() == Constants.ELIST_LOAD_NOTIFICATION);

			countNotifications++;
		}

		/** Returns the number of notifications */
		public int getCountNotifications() {
			return countNotifications;
		}
	}
}
