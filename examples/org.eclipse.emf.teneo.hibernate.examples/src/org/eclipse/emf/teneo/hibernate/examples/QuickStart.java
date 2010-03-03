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
 * $Id: QuickStart.java,v 1.3 2010/03/03 10:48:41 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.examples;

import java.util.Properties;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.eclipse.emf.teneo.hibernate.examples.extlibrary.Book;
import org.eclipse.emf.teneo.hibernate.examples.extlibrary.BookCategory;
import org.eclipse.emf.teneo.hibernate.examples.extlibrary.ExtlibraryFactory;
import org.eclipse.emf.teneo.hibernate.examples.extlibrary.ExtlibraryPackage;
import org.eclipse.emf.teneo.hibernate.examples.extlibrary.Library;
import org.eclipse.emf.teneo.hibernate.examples.extlibrary.Writer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Environment;

/**
 * Quick Start Tutorial for the <a href="http://wiki.eclipse.org/Teneo">Teneo</a> project.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class QuickStart {

	/** The main method */
	public static void main(String[] args) {
		// the name of the database, this database should exist but does not need to contain tables
		String dbName = "library";
		doQuickStart(dbName); // ignore return
	}

	/**
	 * The method performing the real action. This method is used by other tutorials therefore has it been made public
	 * and expects the database name and returns an instance of the HbDataStore.
	 */
	public static HbDataStore doQuickStart(String dbName) {
		// the name of the session factory
		String hbName = "Library";

		// create the HbDataStore using the name
		final HbDataStore hbds = HbHelper.INSTANCE.createRegisterDataStore(hbName);

		// 
		// The hibernate properties can be set by having a hibernate.properties file in the root of
		// the classpath.
		// Another approach is setting the properties in the HbDataStore.
		// For more information see section 3.1 of the Hibernate manual
		final Properties props = new Properties();
//		props.setProperty(Environment.DRIVER, "com.mysql.jdbc.Driver");
//		props.setProperty(Environment.USER, "root");
//		props.setProperty(Environment.URL, "jdbc:mysql://127.0.0.1:3306/" + dbName);
//		props.setProperty(Environment.PASS, "root");
//		props.setProperty(Environment.DIALECT, org.hibernate.dialect.MySQLInnoDBDialect.class.getName());

		props.setProperty(Environment.DRIVER, "org.hsqldb.jdbcDriver");
		props.setProperty(Environment.USER, "sa");
		props.setProperty(Environment.URL, "jdbc:hsqldb:file:/tmp/hsqldb");
		props.setProperty(Environment.PASS, "");
		props.setProperty(Environment.DIALECT, org.hibernate.dialect.HSQLDialect.class.getName());

		// set a specific option
		// see this page http://wiki.eclipse.org/Teneo/Hibernate/Configuration_Options
		// for all the available options
		props.setProperty(PersistenceOptions.CASCADE_POLICY_ON_NON_CONTAINMENT, "REFRESH,PERSIST,MERGE");
		
		hbds.setProperties(props);

		// sets its epackages stored in this datastore
		hbds.setEPackages(new EPackage[] { ExtlibraryPackage.eINSTANCE });

		// initialize, also creates the database tables
		try {
		hbds.initialize();
		} finally {
			// print the generated mapping
			System.err.println(hbds.getMappingXML());			
		}

		SessionFactory sessionFactory = hbds.getSessionFactory();

		// Create a session and a transaction
		Session session = sessionFactory.openSession();
		Transaction tx = session.getTransaction();

		// Start a transaction, create a library and make it persistent
		tx.begin();
		Library lib = ExtlibraryFactory.eINSTANCE.createLibrary();
		lib.setName("My Library");
		session.save(lib);

		// create a writer
		Writer writer = ExtlibraryFactory.eINSTANCE.createWriter();
		writer.setName("JRR Tolkien");

		// and one of his books
		Book book = ExtlibraryFactory.eINSTANCE.createBook();
		book.setAuthor(writer);
		book.setPages(305);
		book.setTitle("The Hobbit");
		book.setCategory(BookCategory.SCIENCE_FICTION);
		session.save(book);
		
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