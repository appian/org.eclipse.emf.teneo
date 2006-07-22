/*
 *	Copyright 2005-2006, Elver.org (http://www.elver.org).
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *
 *		http://www.apache.org/licenses/LICENSE-2.0
 *
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
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
 * @version $Revision: 1.2 $
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
