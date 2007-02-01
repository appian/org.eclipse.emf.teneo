/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: TestDBAdapters.java,v 1.4 2007/02/01 12:35:36 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.stores;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.Utils;

/**
 * Encapsulates multiple database adapters.
 * 
 * @author Davide Marchignoli
 * @author Martin Taal
 * @version $Revision: 1.4 $
 */
public class TestDBAdapters {

	/** Map fo adapters by name */
	private Map dbAdapters = new HashMap();

	/** Add db adapter */
	public void addDBAdapter(String name, BaseTestDatabaseAdapter dbAdapter) {
		if (dbAdapters.containsKey(name)) throw new IllegalArgumentException("Duplicate db adapter " + name);
		dbAdapters.put(name, dbAdapter);
	}

	/** Add db adapter */
	public void addDBAdapter(String name, Properties initProps) {
		String dbAdapterClassName = initProps.getProperty("dbadapter");
		BaseTestDatabaseAdapter testAdapter = null;
		if (dbAdapterClassName == null) {
			testAdapter = new BaseTestDatabaseAdapter();
		} else {
			try {
				final Class adapterClass = Class.forName(dbAdapterClassName);
				testAdapter = (BaseTestDatabaseAdapter) adapterClass.newInstance();
			} catch (Exception e) {
				throw new StoreTestException("Exception when creating TestDatabaseAdapter using classname: " + dbAdapterClassName
						+ ", db identifier used in property file: " + initProps.getProperty(Utils.DATABASE_PROP_NAME), e);
			}
		}
		testAdapter.initialize(initProps);
		addDBAdapter(name, testAdapter);
	}

	/** Add database adapters */
	public void addDBAdapters(Properties props) {
		final Map hProps = Utils.hiearchizeProps(props);
		for (Iterator i = hProps.keySet().iterator(); i.hasNext();) {
			String adapterName = (String) i.next();
			addDBAdapter(adapterName, (Properties) hProps.get(adapterName));
		}
	}

	/** Return all db adapters */
	public Collection getAdapters() {
		return dbAdapters.values();
	}

	/** Return names of database adapters */
	public Set getAdapterNames() {
		return dbAdapters.keySet();
	}

	/** Get one adapter by name */
	public BaseTestDatabaseAdapter get(String adapterName) {
		return (BaseTestDatabaseAdapter) dbAdapters.get(adapterName);
	}

	/** Add a database adapter */
	public void addDBAdapters(InputStream propertiesStream) throws IOException {
		Properties props = new Properties();
		props.load(propertiesStream);
		addDBAdapters(props);
	}
}