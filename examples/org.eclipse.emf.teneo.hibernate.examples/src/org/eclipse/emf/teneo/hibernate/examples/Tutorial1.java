/**
 * <copyright>
 *
 * Copyright (c) 2010 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 * 
 * $Id: Tutorial1.java,v 1.2 2010/03/02 06:08:41 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.examples;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.eclipse.emf.teneo.hibernate.examples.extlibrary.Book;
import org.eclipse.emf.teneo.hibernate.examples.extlibrary.BookCategory;
import org.eclipse.emf.teneo.hibernate.examples.extlibrary.ExtlibraryFactory;
import org.eclipse.emf.teneo.hibernate.examples.extlibrary.ExtlibraryPackage;
import org.eclipse.emf.teneo.hibernate.examples.extlibrary.Library;
import org.eclipse.emf.teneo.hibernate.examples.extlibrary.Writer;
import org.eclipse.emf.teneo.hibernate.resource.HibernateResource;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;

/**
 * Quick Start Tutorial
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class Tutorial1 {

	/** The main method */
	public static void main(String[] args) {

		// Create the DataStore.
		final String dataStoreName = "LibraryDataStore";
		final HbDataStore dataStore = HbHelper.INSTANCE.createRegisterDataStore(dataStoreName);

		// To configure Hibernate, supply properties describing the JDBC driver,
		// URL, username/password and SQL dialect.
		// By default the properties are obtained from the file
		// "hibernate.properties" at the classpath root.
		//
		// Alternatively, you can set the properties programmatically:
		//
		Properties hibernateProperties = new Properties();
		//
		// 1) From a ".properties" file or stream.
		// InputStream in = ...
		// hibernateProperties.load(in);
		//
		// 2) or populated manually:
		hibernateProperties.setProperty(Environment.DRIVER, "com.mysql.jdbc.Driver");
		hibernateProperties.setProperty(Environment.USER, "root");
		hibernateProperties.setProperty(Environment.URL, "jdbc:mysql://127.0.0.1:3306/library");
		hibernateProperties.setProperty(Environment.PASS, "root");
		hibernateProperties.setProperty(Environment.DIALECT, "org.hibernate.dialect.MySQLInnoDBDialect");
		//
		dataStore.setProperties(hibernateProperties);
		// 
		// For more information see <a
		// href="http://www.hibernate.org/hib_docs/v3/reference/en/html/session-configuration.html#configuration-programmatic">
		// section 3.1 of the Hibernate manual</a>.

		// Configure the EPackages used by this DataStore.
		dataStore.setEPackages(new EPackage[] { ExtlibraryPackage.eINSTANCE });

		// Initialize the DataStore. This sets up the Hibernate mapping and, in
		// turn, creates the corresponding tables in the database.
		dataStore.initialize();

		final SessionFactory sessionFactory = dataStore.getSessionFactory();
		{
			// Open a new Session and start transaction.
			final Session session = sessionFactory.openSession();
			session.beginTransaction();

			// Create a library.
			Library library = ExtlibraryFactory.eINSTANCE.createLibrary();
			library.setName("My Library");
			// Make it persistent.
			session.save(library);

			// Create a writer...
			Writer writer = ExtlibraryFactory.eINSTANCE.createWriter();
			writer.setName("JRR Tolkien");

			// ...and one of his books.
			Book book = ExtlibraryFactory.eINSTANCE.createBook();
			book.setAuthor(writer);
			book.setPages(305);
			book.setTitle("The Hobbit");
			book.setCategory(BookCategory.SCIENCE_FICTION);

			// Add the Writer and Book to the Library. They are made
			// persistent automatically because the Library is already
			// persistent.
			library.getWriters().add(writer);
			library.getBooks().add(book);

			// Commit the changes to the database.
			session.getTransaction().commit();
			// Close the session. Not necessary if
			session.close();
		}

		{
			final Session session = sessionFactory.openSession();
			session.beginTransaction();

			// Retrieve the Library and its child objects.
			// Note that you must use the EClass name in the HQL query.
			Query query = session.createQuery("FROM Library");
			List libraries = query.list();
			Library library = (Library) libraries.get(0);

			// Obtain the Writer and Book
			Writer writer = library.getWriters().get(0);
			System.out.println(writer.getName());
			Book book = library.getBooks().get(0);
			System.out.println(book.getTitle());

			// Verify that the eContainer and references are set correctly.
			assert (book.eContainer() == library);
			assert (writer.getBooks().get(0) == book);

			// Add a new Writer and Book
			Writer georgeOrwell = ExtlibraryFactory.eINSTANCE.createWriter();
			georgeOrwell.setName("G. Orwell");

			// Create a new Book and set the Writer and Library.
			Book georgesBook = ExtlibraryFactory.eINSTANCE.createBook();
			georgesBook.setPages(250);
			georgesBook.setTitle("1984");
			georgesBook.setCategory(BookCategory.SCIENCE_FICTION);
			georgesBook.setAuthor(georgeOrwell);

			library.getBooks().add(georgesBook);
			library.getWriters().add(georgeOrwell);

			// Commit.
			session.getTransaction().commit();
			session.close();
		}

		{
			final Session session = sessionFactory.openSession();
			session.beginTransaction();

			// Retrieve all Books and display their titles.
			Query query = session.createQuery("FROM Book");
			List books = query.list();
			for (Iterator it = books.iterator(); it.hasNext();) {
				Book book = (Book) it.next();
				System.out.println(book.getTitle());
			}

			// Retrieve George Orwell's book.
			query = session.createQuery("SELECT book FROM Book book, Writer writ WHERE "
					+ " book.title='1984' AND book.author=writ AND writ.name='G. Orwell'");
			books = query.list();

			// Show some results
			System.out.println("There are " + books.size() + " in the Library."); // should be 1
			System.out.println(books.get(0).getClass().getName());
			Book book = (Book) books.get(0);
			System.out.println(book.getTitle()); // should be 1984
			System.out.println(book.getAuthor().getName()); // should be G. Orwell

			// Count the number of books in the library
			query = session.createQuery("SELECT count(allbooks) FROM Library lib LEFT JOIN lib.books AS allbooks "
					+ " WHERE lib.name='My Library'");
			int count = ((Number) query.uniqueResult()).intValue();
			// there should be 2 books
			System.out.println("There are " + count + " books in the library");
			session.getTransaction().commit();
		}

		try {
			String uriStr = "hibernate://?" + HibernateResource.DS_NAME_PARAM + "=" + dataStoreName;
			final URI uri = URI.createURI(uriStr);
			ResourceSet resourceSet = new ResourceSetImpl();
			final Resource res = resourceSet.createResource(uri);

			res.load(Collections.EMPTY_MAP);
			Iterator it = res.getContents().iterator();
			Library libTest;
			while (it.hasNext()) {
				libTest = (Library) it.next();
				System.out.println(libTest.getName());
			}

			Library libNew = ExtlibraryFactory.eINSTANCE.createLibrary();
			libNew.setName("My Second Library");

			// create a writer
			Writer writerNew = ExtlibraryFactory.eINSTANCE.createWriter();
			writerNew.setName("I. Asimov");

			// and one of his books
			Book bookNew = ExtlibraryFactory.eINSTANCE.createBook();
			bookNew.setAuthor(writerNew);
			bookNew.setPages(305);
			bookNew.setTitle("Foundation and Empire");
			bookNew.setCategory(BookCategory.SCIENCE_FICTION);

			// add the writer/book to the library.
			libNew.getWriters().add(writerNew);
			libNew.getBooks().add(bookNew);

			// now add the top-level object to the resource
			res.getContents().add(libNew);

			res.save(null);
		} catch (IOException e) {
			throw new Error("IOException", e);
		}
	}
}
