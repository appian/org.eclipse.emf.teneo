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
 * $Id: Tutorial1.java,v 1.21 2007/11/22 11:51:55 mtaal Exp $
 */

package hbtutorial;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.example.library.Book;
import org.eclipse.example.library.BookCategory;
import org.eclipse.example.library.Library;
import org.eclipse.example.library.LibraryFactory;
import org.eclipse.example.library.LibraryPackage;
import org.eclipse.example.library.Writer;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.eclipse.emf.teneo.hibernate.resource.HibernateResource;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Quick Start Tutorial
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.21 $
 */
public class Tutorial1 {

	/** The main method */
	public static void main(String[] args) {

		// Create the DataStore.
		final String dataStoreName = "LibraryDataStore";
		final HbDataStore dataStore = (HbDataStore)HbHelper.INSTANCE.createRegisterDataStore(dataStoreName);

		// the name of the database, this database should exist but does not
		// need to contain tables
		// String dbName = "library";

		// To configure Hibernate, supply properties describing the JDBC driver,
		// URL, username/password and SQL dialect.
		// By default the properties are obtained from the file
		// "hibernate.properties" at the classpath root.
		//
		// Alternatively, you can set the properties programmatically:
		//
		// Properties hibernateProperties = new Properties();
		//
		// 1) From a ".properties" file or stream.
		// InputStream in = ...
		// hibernateProperties.load(in);
		//
		// 2) or populated manually:
		// hibernateProperties.setProperty(Environment.DRIVER,
		// "com.mysql.jdbc.Driver");
		// hibernateProperties.setProperty(Environment.USER, "root");
		// hibernateProperties.setProperty(Environment.URL,
		// "jdbc:mysql://127.0.0.1:3306/library" + dbName
		// hibernateProperties.setProperty(Environment.PASS, "root");
		// hibernateProperties.setProperty(Environment.DIALECT,
		// "org.hibernate.dialect.MySQLInnoDBDialect");
		//
		// dataStore.setHibernateProperties(props);
		// 
		// For more information see <a
		// href="http://www.hibernate.org/hib_docs/v3/reference/en/html/session-configuration.html#configuration-programmatic">
		// section 3.1 of the Hibernate manual</a>.

		// Configure the EPackages used by this DataStore.
		dataStore.setEPackages(new EPackage[] { LibraryPackage.eINSTANCE });

		// Initialize the DataStore. This sets up the Hibernate mapping and, in
		// turn, creates the corresponding tables in the database.
		dataStore.initialize();

		final SessionFactory sessionFactory = dataStore.getSessionFactory();
		{
			// Open a new Session and start transaction.
			final Session session = sessionFactory.openSession();
			session.beginTransaction();

			// Create a library.
			Library library = LibraryFactory.eINSTANCE.createLibrary();
			library.setName("My Library");
			// Make it persistent.
			session.save(library);

			// Create a writer...
			Writer writer = LibraryFactory.eINSTANCE.createWriter();
			writer.setName("JRR Tolkien");

			// ...and one of his books.
			Book book = LibraryFactory.eINSTANCE.createBook();
			book.setAuthor(writer);
			book.setPages(305);
			book.setTitle("The Hobbit");
			book.setCategory(BookCategory.SCIENCE_FICTION_LITERAL);

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
			Writer writer = (Writer) library.getWriters().get(0);
			System.out.println(writer.getName());
			Book book = (Book) library.getBooks().get(0);
			System.out.println(book.getTitle());

			// Verify that the eContainer and references are set correctly. 
			assert (book.eContainer() == library);
			assert (writer.getBooks().get(0) == book); 

			// Add a new Writer and Book
			Writer georgeOrwell = LibraryFactory.eINSTANCE.createWriter();
			georgeOrwell.setName("G. Orwell");

			// Create a new Book and set the Writer and Library.
			Book georgesBook = LibraryFactory.eINSTANCE.createBook();
			georgesBook.setPages(250);
			georgesBook.setTitle("1984");
			georgesBook.setCategory(BookCategory.SCIENCE_FICTION_LITERAL);
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

			Library libNew = LibraryFactory.eINSTANCE.createLibrary();
			libNew.setName("My Second Library");

			// create a writer
			Writer writerNew = LibraryFactory.eINSTANCE.createWriter();
			writerNew.setName("I. Asimov");

			// and one of his books
			Book bookNew = LibraryFactory.eINSTANCE.createBook();
			bookNew.setAuthor(writerNew);
			bookNew.setPages(305);
			bookNew.setTitle("Foundation and Empire");
			bookNew.setCategory(BookCategory.SCIENCE_FICTION_LITERAL);

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
