/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * AbstractTestStore.java,v 1.4 2007/03/28 13:58:33 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.stores;

import java.util.Collection;
import java.util.List;

import junit.framework.TestCase;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * Base abstractteststore
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.8 $
 */
public abstract class AbstractTestStore implements TestStore {
	/** The logger */
	private static Log log = LogFactory.getLog(AbstractTestStore.class);

	/**
	 * Property defining that the mapping file should be saved one directory higher. This is
	 * sometimes required if an epackage has subpackages.
	 */
	public static String STORE_MAPPING_FILE_ONE_DIRECTORY_HIGHER =
			AbstractTestStore.class.getName() + ".StoreMappingFileOneDirectoryHigher";

	/** Used to disable drop */
	protected boolean donotDrop = false;

	/** Test properties, eg. database login */
	private TestDatabaseAdapter testDatabaseAdapter;

	/** Constructor sets the database adapter */
	protected AbstractTestStore(TestDatabaseAdapter tda) {
		testDatabaseAdapter = tda;

		// recreate the database
		testDatabaseAdapter.dropDatabase();
		testDatabaseAdapter.createDatabase();
	}

	/** Queries for an object */
	public List<?> query(Object query) {
		return query(query, -1);
	}

	/**
	 * Return an object of a certain class, there should only be one in the databases
	 */
	@SuppressWarnings("unchecked")
	public <T> T getObject(Class<T> clazz) {
		List<?> l = getObjects(clazz); // replace class is called in getObjects
		TestCase.assertTrue("There are " + l.size() +
				" object(s) of this class in the datastore, 1 was expected, class: " + clazz.getName(), l.size() == 1);
		return (T) l.get(0);
	}

	/** Test the amount of objects of a certain class in the db */
	public void checkNumber(Class<?> clazz, int count) {
		final List<?> list = getObjects(clazz);
		TestCase.assertTrue("Expected " + count + " object(s) but there are " + list.size() +
				" object(s) of this class in the datastore: " + clazz.getName(), list.size() == count);
	}

	/** Is called just before the test */
	public abstract void setUp();

	/** Can be used to disabled dropping of the store, convenience for testing */
	public void disableDrop() {
		donotDrop = true;
	}

	/** Store/Makepersistent */
	public void store(Collection<?> objects) {
		for (Object o : objects) {
			store(o);
		}
	}

	/**
	 * Is called just after the test, the dropStore parameter can be used to prevent dropping the
	 * database when an error
	 */
	public void tearDown(boolean successfullyCompleted) {
		if (transactionActive()) {
			if (successfullyCompleted) {
				log.error("Transaction active while tearing down store " + toString());
			}
			rollbackTransaction();
		}

		if (!successfullyCompleted) {
			// TODO do not drop otherwise?
			disableDrop();
		}
		doTearDown();
	}

	/** Do tear down */
	protected abstract void doTearDown();

	/** Returns the database adapter */
	public TestDatabaseAdapter getDatabaseAdapter() {
		return testDatabaseAdapter;
	}

	/** Drops the database */
	public void dropDatabase() {
		testDatabaseAdapter.dropDatabase();
	}

	/** Base method to get a resource belonging to the pmf of this test case */
	public Resource getResource() {
		return getResource(null);
	}

	/** Gets the container list */
	public boolean setContainer(EObject obj) {
		return true;
	}

	/** Is this a hibernate test store */
	public boolean isHibernateTestStore() {
		return false;
	}

	/** Is this a jpox test store */
	public boolean isJPOXTestStore() {
		return false;
	}

	/** Return the mapping xml used */
	public String getMappingXML() {
		throw new UnsupportedOperationException();
	}

}