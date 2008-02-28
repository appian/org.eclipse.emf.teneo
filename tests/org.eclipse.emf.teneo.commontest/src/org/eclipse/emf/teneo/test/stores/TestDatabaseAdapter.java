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
 * $Id: TestDatabaseAdapter.java,v 1.4 2008/02/28 07:08:13 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.stores;

import java.sql.Connection;

/**
 * The test bed encapsulates the environment of a test action.
 * 
 * @author Davide Marchignoli
 * @author Martin Taal
 * @version $Revision: 1.4 $
 */
public interface TestDatabaseAdapter {

	public static interface Factory {
		public BaseTestDatabaseAdapter[] getConfiguredAdapters();
	}

	/** Returns true if optimistic transactions should be enabled */
	public abstract boolean isOptimistic();
	
	/**
	 * @return Returns the dbDriver.
	 */
	public abstract String getDbDriver();

	/**
	 * @return Returns the dbName.
	 */
	public abstract String getDbName();

	/** Sets the dbName */
	public abstract void setDbName(String databaseName);

	/**
	 * @return Returns the dbPwd.
	 */
	public abstract String getDbPwd();

	/**
	 * @return Returns the dbUrl.
	 */
	public abstract String getDbUrl();

	/**
	 * @return Returns the dbUser.
	 */
	public abstract String getDbUser();

	/** Drops the database and creates a new one */
	public abstract void createDatabase();

	/** Gets a database connection using the adapters connection info */
	public abstract Connection getConnection();

	/**
	 * Drops the database, uses the conn.getMetaData().getCatalogs() method to determine if the database already exists. This should be
	 * supported by the database driver. Assumes that the DBMS does not allow multiple database with names that differ only in case.
	 */
	public abstract void dropDatabase();

}