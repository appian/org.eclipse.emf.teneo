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
 * $Id: HsqldbTestDatabaseAdapter.java,v 1.1 2006/07/04 22:12:14 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.stores;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.teneo.test.StoreTestException;

/**
 * Test database adapter for HSQLDB. Overrides the database create and drop actions because these require the database name in the url.
 * 
 * @author <a href="mailto:marchign@fastmail.fm">Davide Marchignoli</a>
 * @version $Revision: 1.1 $
 */

public class HsqldbTestDatabaseAdapter extends BaseTestDatabaseAdapter {
	/** The logger */
	private static Log log = LogFactory.getLog(HsqldbTestDatabaseAdapter.class);

	public void createDatabase() {
		// nothing to do for HSQLDB in memory
		log.info("Creating database: " + logInfo);

	}

	public void dropDatabase() {
		try {
			final Driver driver = (Driver) Class.forName(dbDriver).newInstance();
			Properties info = new Properties();
			info.put("user", dbUser);
			info.put("password", dbPwd);
			Connection conn = null;
			Statement stmt = null;
			try {
				conn = driver.connect(dbUrl, info);
				conn.setAutoCommit(true);
				final ResultSet rs = conn.getMetaData().getSchemas();

				stmt = conn.createStatement();

				while (rs.next()) {
					final String schemaName = rs.getString(1);
					if (!"INFORMATION_SCHEMA".equals(schemaName)) {
						log.info("Dropping schema: " + schemaName);
						stmt.execute("DROP SCHEMA " + schemaName + " CASCADE;");
					}
				}
				rs.close();
			} finally {
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			}
		} catch (Exception e) {
			throw new StoreTestException("Exception while dropping database: " + logInfo, e);
		}
	}

}