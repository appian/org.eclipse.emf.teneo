/**
 * <copyright>
 *
 * Copyright (c) 2013 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: Bz331953Action.java,v 1.1 2011/02/21 05:23:17 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.sample;

import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.mapping.elist.HibernatePersistableEList;
import org.eclipse.emf.teneo.samples.emf.sample.library.Book;
import org.eclipse.emf.teneo.samples.emf.sample.library.BookCategory;
import org.eclipse.emf.teneo.samples.emf.sample.library.Library;
import org.eclipse.emf.teneo.samples.emf.sample.library.LibraryFactory;
import org.eclipse.emf.teneo.samples.emf.sample.library.LibraryPackage;
import org.eclipse.emf.teneo.samples.emf.sample.library.Writer;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests {@link PersistenceOptions#ELIST_EFFICIENT_SIZE_OPERATION}
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class EfficientSizeTestAction extends AbstractTestAction {

	public EfficientSizeTestAction() {
		super(LibraryPackage.eINSTANCE);
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = super.getExtraConfigurationProperties();
		props.setProperty(PersistenceOptions.ELIST_EFFICIENT_SIZE_OPERATION, "true");
		return props;
	}

	@Override
	public void doAction(TestStore store) {
		final LibraryFactory factory = LibraryFactory.eINSTANCE;
		// create a book, writer and library
		{
			store.beginTransaction();

			final Writer writer = factory.createWriter();
			writer.setName("w1");
			final Book bk1 = factory.createBook();
			bk1.setAuthor(writer);
			bk1.setPages(5);
			bk1.setTitle("t1");
			bk1.setCategory(BookCategory.SCIENCE_FICTION_LITERAL);

			final Book bk2 = factory.createBook();
			bk2.setAuthor(writer);
			bk2.setTitle("t2");
			bk2.setPages(5);
			bk2.setCategory(BookCategory.SCIENCE_FICTION_LITERAL);

			final Library library = factory.createLibrary();
			library.getBooks().add(bk1);
			library.getBooks().add(bk2);
			library.setName("Science Fiction Library");
			library.getWriters().add(writer);
			store.store(library);
			store.commitTransaction();
		}

		{
			Library library = store.getObject(Library.class);
			int bkSize = library.getBooks().size();
			assertEquals(2, bkSize);
			HibernatePersistableEList<?> persistableEList = (HibernatePersistableEList<?>) library
					.getBooks();
			assertFalse(persistableEList.isLoaded());
			assertFalse(persistableEList.wasInitialized());
			library.getBooks().get(0);
			assertTrue(persistableEList.isLoaded());
			assertTrue(persistableEList.wasInitialized());
		}
	}

}
