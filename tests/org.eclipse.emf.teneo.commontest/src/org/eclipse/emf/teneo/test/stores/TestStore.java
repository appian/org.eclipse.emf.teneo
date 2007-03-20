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
 * $Id: TestStore.java,v 1.6 2007/03/20 23:33:38 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.stores;

import java.sql.Connection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.teneo.annotations.pannotation.InheritanceType;

/**
 * The test store encapsulates the datastore actions to different store types (ojb, jpox, etc.). In this way different test cases can
 * be reused.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $
 */
public interface TestStore {

	/** Refreshes this store, can for example be used to clear a cache etc. */
	public void refresh();

	/** Is called just before the test */
	public void setUp();

	/**
	 * Is called just after the test.
	 */
	public void tearDown(boolean successFullCompletion);

	/**
	 * Can be used to disabled dropping of the store, convenience for testing (for example when an error occured)
	 */
	public void disableDrop();

	/** Begin transaction */
	public void beginTransaction();

	/** Commit transaction */
	public void commitTransaction();

	/** Rollback transaction */
	public void rollbackTransaction();

	/** Returns true if the transaction is still active */
	public boolean transactionActive();

	/** Store/Makepersistent */
	public void store(Object object);

	/** Add an epackage to the list of epackages */
	public void addEPackage(EPackage epackage);

	/** Update the database schema */
	public void updateSchema();

	/** Test if a delete fails */
	public void checkDeleteFails(Class clazz);

	/** Test if a delete fails */
	public void checkDeleteSucceeds(Class clazz);

	/** Return an object of a certain class, there should only be one in the databases */
	public Object getObject(Class clazz);

	/** Returns a list of object of a certain class */
	public List getObjects(Class clazz);

	/** Deletes an object */
	public void deleteObject(Object obj);

	/** Query for a class using a field and value pair */
	public List query(Class clazz, String field, String value, int checkCount);

	/** Query for an object */
	public List query(Object query);

	/** Queries for an object and checks the number */
	public List query(Object query, int checkCount);

	/** Test the amount of objects of a certain class in the db */
	public void checkNumber(Class clazz, int count);

	/** Returns the database adapter */
	public TestDatabaseAdapter getDatabaseAdapter();

	/** Flushes all updates to the underlying datastore */
	public void flush();

	/** Base method to get a resource belonging to the pmf of this test case */
	public Resource getResource();

	/** Base method to get a resource belonging to the pmf of this test case */
	public Resource getResource(String extraParam);

	/** Gets the referedto list */
	public Object[] getCrossReferencers(EObject obj, boolean container);

	/** Gets the container list */
	public boolean setContainer(EObject obj);

	/** Refreshes the object from the datastore */
	public void refresh(Object obj);

	/** Check inheritance strategy */
	public boolean isInheritanceStrategy(Class<?> cls, InheritanceType strategy);

	/** Gets a database connection using the adapters connection info */
	public abstract Connection getConnection();
	
	/**
	 * @return the inheritanceType
	 */
	public InheritanceType getInheritanceType();
	
	/** Is this a hibernate test store */ 
	public boolean isHibernateTestStore();
	
	/** Is this a jpox test store */ 
	public boolean isJPOXTestStore();
	
	/** Get the xmlcalendar date (hibernate) or normal date (jpox) */
	public Object getDate(Date date);
}