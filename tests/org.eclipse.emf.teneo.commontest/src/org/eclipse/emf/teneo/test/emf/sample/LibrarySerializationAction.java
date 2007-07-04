/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: LibrarySerializationAction.java,v 1.6 2007/07/04 19:28:21 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

import org.eclipse.emf.teneo.classloader.ClassLoaderResolver;
import org.eclipse.emf.teneo.samples.emf.sample.library.Book;
import org.eclipse.emf.teneo.samples.emf.sample.library.BookCategory;
import org.eclipse.emf.teneo.samples.emf.sample.library.Library;
import org.eclipse.emf.teneo.samples.emf.sample.library.LibraryFactory;
import org.eclipse.emf.teneo.samples.emf.sample.library.LibraryPackage;
import org.eclipse.emf.teneo.samples.emf.sample.library.Writer;
import org.eclipse.emf.teneo.samples.emf.sample.library.impl.BookImpl;
import org.eclipse.emf.teneo.samples.emf.sample.library.impl.LibraryImpl;
import org.eclipse.emf.teneo.samples.emf.sample.library.impl.WriterImpl;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests serialization of the library example, also after persistence solution has replaced members.
 * 
 * Test case uses Impl classes to facilitate build on emft server (encountered class loading errors).
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $
 */
public class LibrarySerializationAction extends AbstractTestAction {
	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public LibrarySerializationAction() {
		super(LibraryPackage.eINSTANCE);
	}

	/** Does its thing */
	@Override
	@SuppressWarnings("unchecked")
	public void doAction(TestStore store) {
		final LibraryFactory factory = LibraryFactory.eINSTANCE;

		// first serialize a non persisted document set
		serialize(getTestSet(factory, "one"), "one");

		// then persist a set and check serialization after persisting
		{
			store.beginTransaction();
			Library lib = getTestSet(factory, "two");
			store.store(lib);
			store.commitTransaction();
			serialize(lib, "two");
		}

		// then serialize after reading
		{
			store.beginTransaction();
			LibraryImpl lib = (LibraryImpl) store.getObject(Library.class);
			assertEquals(2, lib.getBooks().size());
			assertEquals(1, lib.getWriters().size());
			assertEquals(2, ((Writer) lib.getWriters().get(0)).getBooks().size());
			serialize(lib, "two");
			store.commitTransaction();
		}
	}

	/** Serialize and check result */
	private void serialize(Library lib, String prefix) {
		try {
			final ByteArrayOutputStream bos = new ByteArrayOutputStream();
			final ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(lib);
			oos.close();

			final byte[] bytes = bos.toByteArray();

			final ObjectInputStream ois = new ElverObjectInputStream(new ByteArrayInputStream(bytes));
			checkTestSet((Library) ois.readObject(), prefix);
			ois.close();
		} catch (Exception e) {
			throw new StoreTestException("IOException during serialization test", e);
		}

	}

	/** Creates a test set and returns a library */
	@SuppressWarnings("unchecked")
	private Library getTestSet(LibraryFactory factory, String preFix) {
		final WriterImpl writer = (WriterImpl) factory.createWriter();
		writer.setName(preFix + "JRR Tolkien");

		final BookImpl book = (BookImpl) factory.createBook();
		book.setAuthor(writer);
		book.setPages(5);
		book.setTitle(preFix + "The Hobbit");
		book.setCategory(BookCategory.SCIENCE_FICTION_LITERAL);

		final Book book2 = factory.createBook();
		book2.setAuthor(writer);
		book2.setPages(7);
		book2.setTitle(preFix + "The fellowship of the ring");
		book2.setCategory(BookCategory.SCIENCE_FICTION_LITERAL);

		final Library library = factory.createLibrary();
		library.getBooks().add(book);
		library.setName(preFix + "Science Fiction Library");
		library.getBooks().add(book2);
		library.getWriters().add(writer);
		return library;
	}

	/** Checks the test set */
	@SuppressWarnings("unchecked")
	private void checkTestSet(Library library, String preFix) {
		assertEquals(preFix + "Science Fiction Library", library.getName());
		assertEquals(2, library.getBooks().size());
		assertEquals(1, library.getWriters().size());

		Writer writer = (Writer) library.getWriters().get(0);
		assertEquals(preFix + "JRR Tolkien", writer.getName());
		assertEquals(2, writer.getBooks().size());

		Book bk1 = (Book) library.getBooks().get(0);
		assertEquals(preFix + "The Hobbit", bk1.getTitle());
		assertEquals(5, bk1.getPages());
		assertEquals(BookCategory.SCIENCE_FICTION_LITERAL, bk1.getCategory());

		Book bk2 = (Book) library.getBooks().get(1);
		assertEquals(preFix + "The fellowship of the ring", bk2.getTitle());
		assertEquals(7, bk2.getPages());
		assertEquals(BookCategory.SCIENCE_FICTION_LITERAL, bk2.getCategory());
	}

	/** Specific Object input stream to get rid of classloading issue */
	private class ElverObjectInputStream extends ObjectInputStream {

		/** Constructor */
		public ElverObjectInputStream(InputStream in) throws IOException {
			super(in);
		}

		/** Constructor */
		public ElverObjectInputStream() throws IOException {
			super();
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.io.ObjectInputStream#resolveClass(java.io.ObjectStreamClass)
		 */
		@Override
		protected Class<?> resolveClass(ObjectStreamClass desc) throws IOException, ClassNotFoundException {
			final String clsName = desc.getName();
			final Class<?> cls = ClassLoaderResolver.classForName(clsName);
			if (cls == null) {
				return super.resolveClass(desc);
			}
			return cls;
		}
	}
}
