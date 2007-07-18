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
 * $Id: LibraryColLengthAction.java,v 1.7 2007/07/18 16:09:58 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.extension.ExtensionManager;
import org.eclipse.emf.teneo.mapping.strategy.SQLNameStrategy;
import org.eclipse.emf.teneo.mapping.strategy.impl.ClassicSQLNameStrategy;
import org.eclipse.emf.teneo.samples.emf.sample.library.Book;
import org.eclipse.emf.teneo.samples.emf.sample.library.BookCategory;
import org.eclipse.emf.teneo.samples.emf.sample.library.Library;
import org.eclipse.emf.teneo.samples.emf.sample.library.LibraryFactory;
import org.eclipse.emf.teneo.samples.emf.sample.library.LibraryPackage;
import org.eclipse.emf.teneo.samples.emf.sample.library.Writer;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests the library example of emf/xsd.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.7 $
 */
public class LibraryColLengthAction extends AbstractTestAction {
	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public LibraryColLengthAction() {
		super(LibraryPackage.eINSTANCE);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.test.AbstractTestAction#setExtensions(org.eclipse.emf.teneo.extension.ExtensionManager)
	 */
	@Override
	public void setExtensions(ExtensionManager extensionManager) {
		extensionManager.registerExtension(SQLNameStrategy.class.getName(), ClassicSQLNameStrategy.class.getName());
		extensionManager.registerExtension("org.eclipse.emf.teneo.hibernate.mapper.MappingContext",
			"org.eclipse.emf.teneo.hibernate.mapper.classic.ClassicMappingContext");
		super.setExtensions(extensionManager);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.test.AbstractTestAction#getExtraConfigurationProperties()
	 */
	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.put(PersistenceOptions.MAXIMUM_SQL_NAME_LENGTH, "5");
		props.put(PersistenceOptions.ID_COLUMN_NAME, "myID");
		return props;
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	@SuppressWarnings("unchecked")
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

		if (true) {
			Connection conn = null;
			Statement stmt = null;
			try {
				conn = store.getConnection();
				stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(getTestQuery());
				assertTrue(rs.next());
			} catch (SQLException s) {
				throw new StoreTestException("SQL Exception", s);
			} finally {
				try {
					if (stmt != null) {
						stmt.close();
						stmt = null;
					}

					if (conn != null) {
						conn.close();
						conn = null;
					}
				} catch (SQLException s) {
					throw new StoreTestException("SQL Exception", s);
				}
			}
		}
	}

	protected String getTestQuery() {
		return "SELECT * FROM BOOK WHERE BO_ID<>0 AND L_IDX>0 AND W_IDX>0".toLowerCase();
	}
}
