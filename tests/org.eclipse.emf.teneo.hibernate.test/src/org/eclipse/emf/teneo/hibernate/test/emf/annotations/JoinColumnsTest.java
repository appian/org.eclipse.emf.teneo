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
 * $Id: JoinColumnsTest.java,v 1.5 2008/02/28 07:08:57 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.annotations;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.eclipse.emf.teneo.test.AbstractActionTest;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.emf.annotations.JoinColumnsAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests import export
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */
public class JoinColumnsTest extends AbstractActionTest {

	private static JoinColumnsAction testAction = new JoinColumnsAction() {
		
		/** Checks the version column */
		protected void checkVersion(TestStore store) { 
    		Connection conn = null;
    		Statement stmt = null;
	    	try {
			try {
	    			conn = store.getConnection();
	    			stmt = conn.createStatement();
	    			// check version column name
		    		ResultSet rs = stmt.executeQuery("select myversion from person");
		    		assertTrue(rs.next());
	    		} finally {
	    			if (stmt != null) stmt.close();
	    			if (conn != null) conn.close();
	    		}
	    	} catch (SQLException e) {
	    		throw new StoreTestException("Sql exception when checking db schema", e);
	    	}
		}
	};

	public JoinColumnsTest() {
		super(testAction);
	}
}
