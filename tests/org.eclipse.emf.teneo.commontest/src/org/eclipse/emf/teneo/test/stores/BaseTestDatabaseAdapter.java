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
 * $Id: BaseTestDatabaseAdapter.java,v 1.1 2006/07/04 22:12:14 mtaal Exp $
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
 * Is a general test database adapter. This adapter hides details related to running the testcass with different databases. The
 * database specific actions are relatively simple, drop and create a database and possibly specific such as setting lower or uppercase
 * name handling in the database. For handling other databases this class can be extended.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */

public class BaseTestDatabaseAdapter implements TestDatabaseAdapter {
	/** The logger */
	private static Log log = LogFactory.getLog(BaseTestDatabaseAdapter.class);

	/** The database url */
	protected String dbUrl;

	/** The database driver */
	protected String dbDriver;

	/** The database user */
	protected String dbUser;

	/** The database pwd */
	protected String dbPwd;

	/** The database name */
	protected String dbName = null;

	/** The logInfo, is used to display connection information */
	protected String logInfo = "Replace this with a meaningfull message";

	/** Use optimistic transactions or not */
	protected boolean optimistic;

	/** Initializes the database adapter */
	public void initialize(Properties props) {
		dbUrl = props.getProperty("dburl");
		dbDriver = props.getProperty("dbdriver");
		dbUser = props.getProperty("dbuser");
		dbPwd = props.getProperty("dbpassword");
		optimistic = props.getProperty("optimistic") != null && props.getProperty("optimistic").compareTo("true") == 0;
		logInfo = " adapter|dbName|url|user|pwd|driver "
				+ this.getClass().getName().substring(this.getClass().getName().lastIndexOf(".") + 1) + "|" + dbName + "|" + dbUrl
				+ "|" + dbUser + "|" + dbPwd + "|" + dbDriver;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.test.stores.TestDatabaseAdapter#isOptimistic()
	 */
	public boolean isOptimistic() {
		return optimistic;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.test.stores.TestDatabaseAdapter#getDbDriver()
	 */
	public String getDbDriver() {
		return dbDriver;
	}

	/** Returns a log messages which is placed when a testrun starts for this database adapter */
	public String getLogMessage() {
		return "Starting run for database: " + logInfo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.test.stores.TestDatabaseAdapter#getDbName()
	 */
	public String getDbName() {
		return dbName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.test.stores.TestDatabaseAdapter#setDbName(java.lang.String)
	 */
	public void setDbName(String databaseName) {
		dbName = databaseName;

		// set the loginfo
		logInfo = " adapter|dbName|url|user|pwd|driver "
				+ this.getClass().getName().substring(this.getClass().getName().lastIndexOf(".") + 1) + "|" + dbName + "|" + dbUrl
				+ "|" + dbUser + "|" + dbPwd + "|" + dbDriver;

		log.debug("Initialized database adapter: " + logInfo);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.test.stores.TestDatabaseAdapter#getDbPwd()
	 */
	public String getDbPwd() {
		return dbPwd;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.test.stores.TestDatabaseAdapter#getDbUrl()
	 */
	public String getDbUrl() {
		if (dbUrl.endsWith("/")) {
			return dbUrl + dbName;
		} else {
			return dbUrl + "/" + dbName;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.test.stores.TestDatabaseAdapter#getDbUser()
	 */
	public String getDbUser() {
		return dbUser;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.test.stores.TestDatabaseAdapter#createDatabase()
	 */
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
				conn = driver.connect(dbUrl, info);
				stmt = conn.createStatement();
				conn.setAutoCommit(true);
				stmt.execute("CREATE DATABASE " + dbName + ";");
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.test.stores.TestDatabaseAdapter#dropDatabase()
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
				conn = driver.connect(dbUrl, info);
				final ResultSet rs = conn.getMetaData().getCatalogs();
				boolean exists = false;
				while (rs.next()) {
					final String existingDb = rs.getString(1);
					exists |= existingDb.compareToIgnoreCase(dbName) == 0;
				}
				rs.close();

				if (exists) {
					stmt = conn.createStatement();
					conn.setAutoCommit(true);
					log.info("Dropping database: " + logInfo);
					stmt.execute("DROP DATABASE " + dbName + ";");
				} else {
					log.info("Database does not exist, not dropped, " + logInfo);
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
			throw new StoreTestException("Exception while dropping database: " + logInfo, e);
		}
	}

	/** Gets a database connection using the adapters connection info */
	public Connection getConnection() {
		try {
			final Driver driver = (Driver) Class.forName(dbDriver).newInstance();
			Properties info = new Properties();
			info.put("user", dbUser);
			info.put("password", dbPwd);
			return driver.connect(getDbUrl(), info);
		} catch (Exception e) {
			throw new StoreTestException("Exception while creating database: " + logInfo, e);
		}
	}

	/** Returns true if the passed database exists */
	protected boolean databaseExists(Connection conn) throws Exception {
		final String localDbName = getDbName();
		final ResultSet rs = conn.getMetaData().getCatalogs();
		boolean exists = false;
		while (rs.next()) {
			final String existingDb = rs.getString(1);
			exists = exists || existingDb.compareTo(localDbName) == 0;
		}
		rs.close();
		return exists;
	}

}