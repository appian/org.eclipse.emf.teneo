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
 *   Davide Marchignoli
 * </copyright>
 *
 * $Id: BookAction.java,v 1.2 2006/07/22 10:16:31 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;


import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.samples.emf.annotations.column.Book;
import org.eclipse.emf.teneo.samples.emf.annotations.column.ColumnFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.column.ColumnPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Testcase
 *  
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
*/
public class BookAction extends AbstractTestAction 
{
	/**
	 * Constructor for ClassHierarchyParsing.
	 * @param arg0
	 */
	public BookAction()  
	{
		super(ColumnPackage.eINSTANCE);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.teneo.test.AbstractTestAction#getExtraConfigurationProperties()
	 */
	public Properties getExtraConfigurationProperties() {
		Properties props = new Properties();
		props.setProperty(PersistenceOptions.SQL_CASE_STRATEGY, "uppercase");
		return props;
	}

	/** Creates an item, an address and links them to a po. */
	public void doAction(TestStore store)
	{
		BigDecimal testDbl = new BigDecimal("12456677.90123");
		final ColumnFactory factory = ColumnFactory.eINSTANCE;
	    	try {
	    		store.beginTransaction();
	    		Book book = factory.createBook();
	    		book.setAuthor("martin");
	    		book.setTitle("012345678901234567890123456789");
	    		book.setPages(1000);
	    		book.setWeight(new BigDecimal("12456677.90123"));
	    		store.store(book);
	    		store.commitTransaction();
	    	} catch (Exception e) {
	    		// in this case the constraint checking fails directly stop with this
	    		return;
	    	}

	    	// check unique constraint on title column
	    	{
	    		try
	    		{
		    		store.beginTransaction();
		    		Book book = factory.createBook();
		    		book.setAuthor("martin");
		    		book.setTitle("012345678901234567890123456789");
		    		book.setPages(1000);
		    		book.setWeight(new BigDecimal("12456677.90123"));
		    		store.store(book);
		    		store.commitTransaction();
		    		fail("The unique constraint on title is violated");
	    		} catch (Exception e) {
	    			// no fail, this good
	    			store.rollbackTransaction();
	    		}
	    	}
    	
	    	// read back and check it
	    	{
	    		store.beginTransaction();
	    		Book book = (Book)store.getObject(Book.class);
	    		assertTrue("The length of the booktitle should not be more than 25: " + book.getTitle().length(), 
	    				book.getTitle().length() <= 25);
	    		System.err.println(book.getWeight());
	    		assertTrue("Only a precision of 5 is defined, so weight is not correctly stored as it has more digits", 
	    			Math.abs(testDbl.subtract(book.getWeight()).doubleValue()) > 1.0);
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
		    		ResultSet rs = stmt.executeQuery("SELECT * FROM MYBOOKTABLE WHERE TITEL='' AND GEWICHT IS NULL");
		    		assertTrue(rs != null); //dummy to get rid of warning
	    		} catch (SQLException s) {
	    			throw new StoreTestException("SQL Exception", s);
	    		} finally {
	    			try {
		    			if (stmt != null) stmt.close();
		    			if (conn != null) conn.close();
	    			} catch (SQLException s) {
		    			throw new StoreTestException("SQL Exception", s);
	    			}
	    		}
	    	}
	    	
	    	// read back and check it
	    	{
	    		store.beginTransaction();
	    		Book book = (Book)store.getObject(Book.class);
	    		assertTrue(255 == (int)(book.getWeight().doubleValue() * 10));
	    		store.store(book);
	    		store.commitTransaction();
	    	}
	}	
}