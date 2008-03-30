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
 * $Id: HsqldbTestDatabaseAdapter.java,v 1.4 2008/03/30 15:12:08 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.stores;

import java.io.File;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Test database adapter for HSQLDB. Overrides the database create and drop actions because these
 * require the database name in the url.
 * 
 * @author <a href="mailto:marchign@fastmail.fm">Davide Marchignoli</a>
 * @version $Revision: 1.4 $
 */

public class HsqldbTestDatabaseAdapter extends BaseTestDatabaseAdapter {
	/** The logger */
	private static Log log = LogFactory.getLog(HsqldbTestDatabaseAdapter.class);

	@Override
	public void createDatabase() {
		// nothing to do for HSQLDB in memory/file
		log.info("Creating database: " + logInfo + " is done automatically at connection time");
	}

	@Override
	public void dropDatabase() {
		// just delete all files in the hsqldb directory
		deleteFile(new File("/tmp/hsqldb"));
//		
//		
// try {
// final Driver driver = (Driver) Class.forName(dbDriver).newInstance();
// Properties info = new Properties();
// info.put("user", dbUser);
// info.put("password", dbPwd);
// Connection conn = null;
// Statement stmt = null;
// try {
// conn = driver.connect(dbUrl, info);
// conn.setAutoCommit(true);
// final ResultSet rs = conn.getMetaData().getSchemas();
//
// stmt = conn.createStatement();
//
// while (rs.next()) {
// final String schemaName = rs.getString(1);
// if (!"INFORMATION_SCHEMA".equals(schemaName)) {
// log.info("Dropping schema: " + schemaName);
// stmt.execute("DROP SCHEMA " + schemaName + " CASCADE;");
// }
// }
// rs.close();
// } finally {
// if (stmt != null) {
// stmt.close();
// }
// if (conn != null) {
// conn.close();
// }
// }
// } catch (Exception e) {
// throw new StoreTestException("Exception while dropping database: " + logInfo, e);
// }
	}

	private void deleteFile(File file) {
		if (!file.exists()) {
			return;
		}
		if (file.isDirectory()) {
			for (File f : file.listFiles()) {
				deleteFile(f);
			}
		}
		if (file.getName().contains(getDbName())) {
			file.delete();
		}
	}
}