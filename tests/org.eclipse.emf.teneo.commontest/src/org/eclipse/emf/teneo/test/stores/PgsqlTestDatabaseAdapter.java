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
 * $Id: PgsqlTestDatabaseAdapter.java,v 1.1 2006/07/04 22:12:14 mtaal Exp $
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
 * Test database adapter for postgressql. Overrides the database create and drop actions because these require the database name in the
 * url.
 * 
 * The specific issue with the test environment was that at start and cleanup of the test (create and drop of the database), postgresql
 * apparently does not release closed connections quick enough. Therefore create or drop database failed sometimes. Therefore a very
 * rough workaround has been implemented, i.e. the drop/create is retried a number of times before failing.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */

public class PgsqlTestDatabaseAdapter extends BaseTestDatabaseAdapter {
	/** The logger */
	private static Log log = LogFactory.getLog(PgsqlTestDatabaseAdapter.class);

	/** The number of tries a create database or drop database is run before giving up */
	private static int NO_TRIES = 20;

	/** The amount of milliseconds to wait for postgres to nicely clean up connections */
	// private static long WAIT_TIME = 10000;
	/** Sets the dbName */
	public void setDbName(String databaseName) {
		super.setDbName(databaseName.toLowerCase());
	}

	/** Drops the database and creates a new one */
	public void createDatabase() {
		try {
			log.info("Creating database: " + logInfo);

			final Driver driver = (Driver) Class.forName(dbDriver).newInstance();
			Properties info = new Properties();
			info.put("user", dbUser);
			info.put("password", dbPwd);
			Connection conn = null;
			Statement stmt = null;
			try {
				final String useUrl = dbUrl + "template1";
				conn = driver.connect(useUrl, info);
				if (!databaseExists(conn)) {
					int tries = 0;
					while (true) {
						try {
							tries++;
							stmt = conn.createStatement();
							stmt.execute("CREATE DATABASE " + dbName + ";");
							//conn.commit();
							return;
						} catch (Exception e) {
							System.err.println(e.getMessage());
							Thread.sleep(500);
							log.warn("Exception (" + e.getMessage() + ") while creating database (" + getDbName()
									+ "), num of tries: " + tries + ", the create database gives up at: " + NO_TRIES);
							// log.warn("Waiting for " + WAIT_TIME + " milli seconds on postgresql to release connections");
							// wait(WAIT_TIME);							
							if (tries == NO_TRIES) throw e;
						} finally {
							if (stmt != null) stmt.close();
							if (conn != null) conn.close();
							conn = driver.connect(useUrl, info);
						}
					}
				}
			} finally {
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			}
		} catch (Exception e) {
			throw new StoreTestException("Exception while creating database: " + logInfo, e);
		}
	}

	/**
	 * Drops the database, uses the conn.getMetaData().getCatalogs() method to determine if the database already exists. This should be
	 * supported by the database driver.
	 */
	public void dropDatabase() {
		try {
			final Driver driver = (Driver) Class.forName(dbDriver).newInstance();
			Properties info = new Properties();
			info.put("user", dbUser);
			info.put("password", dbPwd);
			Connection conn = null;
			Statement stmt = null;
			try {
				final String useUrl = dbUrl + "template1";
				conn = driver.connect(useUrl, info);

				// check if the database exists
				stmt = conn.createStatement();
				log.info("Dropping database: " + logInfo);
				ResultSet rs = stmt.executeQuery("SELECT datname FROM pg_database");
				boolean exists = false;
				while (rs.next()) {
					exists |= dbName.compareTo(rs.getString("datname")) == 0;
					if (exists) break;
				}
				rs.close();
				stmt.close();
				if (exists) {
					int tries = 0;
					while (true) {
						try {
							tries++;
							stmt = conn.createStatement();
							stmt.execute("DROP DATABASE " + dbName + ";");
							//conn.commit();
							return;
						} catch (Exception e) {
							System.err.println(e.getMessage());
							Thread.sleep(500);
							log.warn("Exception (" + e.getMessage() + ") while creating database (" + getDbName()
									+ "), num of tries: " + tries + ", the create database gives up at: " + NO_TRIES);
							// log.warn("Waiting for " + WAIT_TIME + " milli seconds on postgresql to release connections");
							// wait(WAIT_TIME);							
							if (tries == NO_TRIES) throw e;
						} finally {
							if (stmt != null) stmt.close();
							if (conn != null) conn.close();
							conn = driver.connect(useUrl, info);
						}
					}
				}
				//conn.commit();
				return;
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