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
 *   Davide Marchignoli
 * </copyright>
 *
 * $Id: EDataTypeAction.java,v 1.6 2008/03/30 15:12:08 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.eclipse.emf.teneo.samples.emf.annotations.edatatypeColumn.Book;
import org.eclipse.emf.teneo.samples.emf.annotations.edatatypeColumn.EdatatypeColumnFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.edatatypeColumn.EdatatypeColumnPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.HsqldbTestDatabaseAdapter;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Testcase
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $
 */
public class EDataTypeAction extends AbstractTestAction {
	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public EDataTypeAction() {
		super(EdatatypeColumnPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		final BigDecimal testDbl = new BigDecimal("12456677.90123");
		final EdatatypeColumnFactory factory = EdatatypeColumnFactory.eINSTANCE;
		try {
			store.beginTransaction();
			final Book book = factory.createBook();
			book.setAuthor("martin");
			book.setTitle("012345678901234567890123456789");
			book.setPages(1000);
			book.setWeight(new BigDecimal("12456677.90123"));
			store.store(book);
			store.commitTransaction();
		} catch (final Exception e) {
			// in this case the constraint checking fails directly stop with this
			return;
		}

		// check unique constraint on title column
		{
			try {
				store.beginTransaction();
				final Book book = factory.createBook();
				book.setAuthor("martin");
				book.setTitle("012345678901234567890123456789");
				book.setPages(1000);
				book.setWeight(new BigDecimal("12456677.90123"));
				store.store(book);
				store.commitTransaction();
				fail("The unique constraint on title is violated");
			} catch (final Exception e) {
				// no fail, this good
				store.rollbackTransaction();
			}
		}

		// read back and check it
		{
			store.beginTransaction();
			final Book book = store.getObject(Book.class);
			// hsqldb does not support column length, at least not in in-mem mode
			if (!(store.getDatabaseAdapter() instanceof HsqldbTestDatabaseAdapter)) {
				assertTrue("The length of the booktitle should not be more than 25: " + book.getTitle().length(), book
					.getTitle().length() <= 25);
				assertTrue("Only a precision of 5 is defined, so weight is not correctly stored as it has more digits",
					Math.abs(testDbl.subtract(book.getWeight()).doubleValue()) > 1.0);
			}
			book.setWeight(new BigDecimal("25.5"));
			store.store(book);
			store.commitTransaction();
		}

		// check if the column names have landed
		{
			Connection conn = null;
			Statement stmt = null;
			try {
				conn = store.getConnection();
				stmt = conn.createStatement();
				final ResultSet rs = stmt.executeQuery("SELECT * FROM mybooktable WHERE titel='' AND gewicht IS NULL");
				assertTrue(rs != null); // dummy to get rid of warning
			} catch (final SQLException s) {
				throw new StoreTestException("SQL Exception", s);
			} finally {
				try {
					if (stmt != null) {
						stmt.close();
					}
					if (conn != null) {
						conn.close();
					}
				} catch (final SQLException s) {
					throw new StoreTestException("SQL Exception", s);
				}
			}
		}

		// read back and check it
		{
			store.beginTransaction();
			final Book book = store.getObject(Book.class);
			assertTrue(255 == (int) (book.getWeight().doubleValue() * 10));
			store.store(book);
			store.commitTransaction();
		}
	}
}