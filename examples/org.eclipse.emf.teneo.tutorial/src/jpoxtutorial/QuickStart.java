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
 * $Id: QuickStart.java,v 1.6 2008/02/28 07:08:40 mtaal Exp $
 */

package jpoxtutorial;

import java.util.Properties;

import javax.jdo.PersistenceManager;
import javax.jdo.Transaction;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.example.library.Book;
import org.eclipse.example.library.BookCategory;
import org.eclipse.example.library.Library;
import org.eclipse.example.library.LibraryFactory;
import org.eclipse.example.library.LibraryPackage;
import org.eclipse.example.library.Writer;
import org.eclipse.emf.teneo.jpox.JpoxDataStore;
import org.eclipse.emf.teneo.jpox.JpoxHelper;
import org.jpox.PMFConfiguration;

/**
 * Quick Start Tutorial
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $
 */
public class QuickStart {

	/** The main method */
	public static void main(String[] args) {
		// the name of the database, this database should exist but does not need to contain tables
		String dbName = "library";
		doQuickStart(dbName); // ignore return
	}

	/** Methodn which can be called by others */
	public static JpoxDataStore doQuickStart(String dbName) {
		// Now create and register a JpoxDataStore
		String pmfName = "MyPMF"; // the name of the JpoxDataStore

		// db connection info, replace with your own database connection information
		Properties properties = new Properties();
		properties.setProperty(PMFConfiguration.JDO_DATASTORE_DRIVERNAME_PROPERTY, "com.mysql.jdbc.Driver");
		properties.setProperty(PMFConfiguration.JDO_DATASTORE_URL_PROPERTY, "jdbc:mysql://127.0.0.1:3306/mylibrary");
		properties.setProperty(PMFConfiguration.JDO_DATASTORE_USERNAME_PROPERTY, "root");
		properties.setProperty(PMFConfiguration.JDO_DATASTORE_PASSWORD_PROPERTY, "root");

		// create the data store
		JpoxDataStore jpoxDataStore = JpoxHelper.INSTANCE.createRegisterDataStore(pmfName);
		jpoxDataStore.setProperties(properties);
		jpoxDataStore.setEPackages(new EPackage[] { LibraryPackage.eINSTANCE });
		jpoxDataStore.initialize();

		// Now create a persistence manager and a transaction
		PersistenceManager pm = jpoxDataStore.getPMF().getPersistenceManager();
		Transaction tx = pm.currentTransaction();

		// Start a transaction, create a library and make it persistent
		tx.begin();
		Library lib = LibraryFactory.eINSTANCE.createLibrary();
		lib.setName("My Library");
		pm.makePersistent(lib);

		// create a writer
		Writer writer = LibraryFactory.eINSTANCE.createWriter();
		writer.setName("JRR Tolkien");

		// and one of his books
		Book book = LibraryFactory.eINSTANCE.createBook();
		book.setAuthor(writer);
		book.setPages(305);
		book.setTitle("The Hobbit");
		book.setCategory(BookCategory.SCIENCE_FICTION);

		// add the writer/book to the library. The writer and book are automatically
		// made persistent because they are added to the library which is already
		// made persistent
		lib.getWriters().add(writer);
		lib.getBooks().add(book);

		// at commit the objects will be present in the database
		tx.commit();
		// and close of, this should actually be done in a finally block
		pm.close();

		return jpoxDataStore;
	}
}