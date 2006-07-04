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
 * $Id: MssqlJDBCTestDatabaseAdapter.java,v 1.1 2006/07/04 22:12:14 mtaal Exp $
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
 * Overrides geturl to add specific ms string: ;DatabaseName=
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */

public class MssqlJDBCTestDatabaseAdapter extends BaseTestDatabaseAdapter {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.test.stores.TestDatabaseAdapter#getDbUrl()
	 */
	public String getDbUrl() {
		return dbUrl + ";DatabaseName=" + dbName + ";SelectMethod=cursor";
	}
}