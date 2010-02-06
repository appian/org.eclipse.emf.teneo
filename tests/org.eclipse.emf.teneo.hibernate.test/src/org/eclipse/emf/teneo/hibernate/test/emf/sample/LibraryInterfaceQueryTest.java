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
 * $Id: LibraryInterfaceQueryTest.java,v 1.4 2010/02/06 20:50:47 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.sample;

import java.util.Properties;

import javax.persistence.EntityManager;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.extension.ExtensionManager;
import org.eclipse.emf.teneo.hibernate.SessionWrapper;
import org.eclipse.emf.teneo.hibernate.test.stores.HibernateTestStore;
import org.eclipse.emf.teneo.mapping.strategy.EntityNameStrategy;
import org.eclipse.emf.teneo.mapping.strategy.impl.EntityInterfaceNameStrategy;
import org.eclipse.emf.teneo.samples.emf.sample.library.Book;
import org.eclipse.emf.teneo.samples.emf.sample.library.BookCategory;
import org.eclipse.emf.teneo.samples.emf.sample.library.Library;
import org.eclipse.emf.teneo.samples.emf.sample.library.LibraryFactory;
import org.eclipse.emf.teneo.samples.emf.sample.library.LibraryPackage;
import org.eclipse.emf.teneo.samples.emf.sample.library.Writer;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 * Test interface entity naming strategy.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
public class LibraryInterfaceQueryTest extends AbstractTestAction {
	public LibraryInterfaceQueryTest() {
		super(LibraryPackage.eINSTANCE);
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.ID_FEATURE_AS_PRIMARY_KEY, "false");
		return props;
	}

	/** Add extensions if you want */
	@Override
	public void setExtensions(ExtensionManager extensionManager) {
		extensionManager.registerExtension(EntityNameStrategy.class.getName(), EntityInterfaceNameStrategy.class
				.getName());
	}

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

		// walk through the structure starting from the library
		{
			final HibernateTestStore hbstore = (HibernateTestStore) store;
			assertTrue(hbstore.getMappingXML().indexOf(
					"entity-name=\"org.eclipse.emf.teneo.samples.emf.sample.library.Writer\"") != -1);
			// System.err.println(hbstore.getMappingXML());
			store.beginTransaction();
			final SessionWrapper sw = ((HibernateTestStore) store).getSessionWrapper();

			if (sw.isEJB3EntityManager()) {
				final EntityManager em = (EntityManager) sw.getSession();
				final Book b = em.getReference(Book.class, new Long(1));
				assertTrue(b instanceof Book);
			} else {
				final Session s = sw.getHibernateSession();
				final Book b = (Book) s.get(Book.class, new Long(1));
				assertTrue(b instanceof Book);

				final Criteria c = s.createCriteria(Writer.class);
				final Writer w = (Writer) c.list().get(0);
				assertTrue(w != null);
			}
			store.commitTransaction();
		}
	}
}
