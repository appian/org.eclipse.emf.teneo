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
 * $Id: LibraryQualifyActionHB.java,v 1.2 2006/07/22 10:16:32 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

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
 * Tests setting of qualified enames
 *  
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $ 
*/
public class LibraryQualifyActionHB extends AbstractTestAction 
{
	/**
	 * Constructor for ClassHierarchyParsing.
	 * @param arg0
	 */
	public LibraryQualifyActionHB()  
	{
		super(LibraryPackage.eINSTANCE);
		
	}
	
	/** 
	 * Can be overridden by subclass returns properties which control the or layer.
	 * Such as setting of eager loading. 
	 */
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.put(PersistenceOptions.QUALIFY_ENTITY_NAME, PersistenceOptions.QUALIFY_ENTITY_NAME_NSPREFIX);
		return props;
	}

	/** Creates an item, an address and links them to a po. */
	public void doAction(TestStore store)
	{
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

		// now test some qualified queries
		{
			store.beginTransaction();
			Library lib = (Library)store.query("FROM " + LibraryPackage.eNS_PREFIX + ".Library").get(0);
			assertTrue(lib != null);
			Writer writ = (Writer)store.query("FROM " + LibraryPackage.eNS_PREFIX + ".Writer").get(0);
			assertTrue(writ != null);
			Book bk = (Book)store.query("FROM " + LibraryPackage.eNS_PREFIX + ".Book").get(0);
			assertTrue(bk != null);
			store.commitTransaction();
		}
	}	
}