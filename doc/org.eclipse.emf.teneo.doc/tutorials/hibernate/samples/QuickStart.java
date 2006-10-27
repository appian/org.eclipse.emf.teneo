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
 * $Id: QuickStart.java,v 1.4 2006/10/27 16:25:38 mtaal Exp $
 */

package hbtutorial;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.example.library.Book;
import org.eclipse.example.library.BookCategory;
import org.eclipse.example.library.Library;
import org.eclipse.example.library.LibraryFactory;
import org.eclipse.example.library.LibraryPackage;
import org.eclipse.example.library.Writer;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Quick Start Tutorial
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
*/
public class QuickStart {

	/** The main method */
	public static void main(String[] args) {
		// the name of the database, this database should exist but does not need to contain tables
		String dbName = "library"; 
		doQuickStart(dbName); //ignore return
	}
	
	/** Methodn which can be called by others */
	public static HbDataStore doQuickStart(String dbName) {
		// the name of the session factory
		String hbName = "MySF"; 
	
		// create the HbDataStore
		HbDataStore hbds = (HbDataStore)HbHelper.INSTANCE.createRegisterDataStore(hbName);
		
		// The hibernate properties can be set by having a hibernate.properties file in the root of the classpath.
		// Another approach is setting the properties in the HbDataStore. To do this comment out the following lines
		// For more information see section 3.1 of the Hibernate manual
		//final Properties props = new Properties();
		//props.setProperty(Environment.DRIVER, "com.mysql.jdbc.Driver");
		//props.setProperty(Environment.USER, "root");
		//props.setProperty(Environment.URL, "jdbc:mysql://127.0.0.1:3306/" + dbName);
		//props.setProperty(Environment.PASS, "root");
		//props.setProperty(Environment.DIALECT, org.hibernate.dialect.MySQLInnoDBDialect.class.getName());
		//hbds.setHibernateProperties(props);

		// sets its epackages stored in this datastore
		hbds.setEPackages(new EPackage[]{LibraryPackage.eINSTANCE});
		
		// initialize, also creates the database tables
		hbds.initialize();
		
		SessionFactory sessionFactory = hbds.getSessionFactory();
		
		// Create a session and a transaction
		Session session = sessionFactory.openSession();
		Transaction tx = session.getTransaction();
		
		// Start a transaction, create a library and make it persistent
		tx.begin();
		Library lib = LibraryFactory.eINSTANCE.createLibrary();
		lib.setName("My Library");
		session.save(lib);
		
		// create a writer
		Writer writer = LibraryFactory.eINSTANCE.createWriter();
		writer.setName("JRR Tolkien");
			       
		// and one of his books
		Book book = LibraryFactory.eINSTANCE.createBook();
		book.setAuthor(writer);
		book.setPages(305);
		book.setTitle("The Hobbit");
		book.setCategory(BookCategory.SCIENCE_FICTION_LITERAL);
			
		// add the writer/book to the library. The writer and book are automatically
		// made persistent because they are added to the library which is already
		// made persistent
		lib.getWriters().add(writer);
		lib.getBooks().add(book);
			        
		// at commit the objects will be present in the database
		tx.commit();
		// and close of, this should actually be done in a finally block
		session.close();
		
		return hbds;
	}
}