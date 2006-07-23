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
 * $Id: JPOXTestStore.java,v 1.3 2006/07/23 19:28:58 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.test.stores;

import java.sql.Connection;
import java.util.Collection;
import java.util.List;
import java.util.Properties;

import javax.jdo.Extent;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;
import javax.jdo.Transaction;

import junit.framework.TestCase;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.teneo.ERuntime;
import org.eclipse.emf.teneo.StoreException;
import org.eclipse.emf.teneo.annotations.pannotation.InheritanceType;
import org.eclipse.emf.teneo.jpox.emf.JpoxConstants;
import org.eclipse.emf.teneo.jpox.emf.JpoxDataStore;
import org.eclipse.emf.teneo.jpox.emf.JpoxHelper;
import org.eclipse.emf.teneo.jpox.emf.resource.JPOXResource;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.AbstractTestStore;
import org.eclipse.emf.teneo.test.stores.TestDatabaseAdapter;
import org.jpox.JDOClassLoaderResolver;
import org.jpox.PMFConfiguration;
import org.jpox.PersistenceManagerFactoryImpl;
import org.jpox.metadata.ClassMetaData;
import org.jpox.metadata.InheritanceStrategy;

/**
 * The jpox test store encapsulates the datastore actions to a jpox store.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class JPOXTestStore extends AbstractTestStore {
	/** The logger */
	private static Log log = LogFactory.getLog(JPOXTestStore.class);

	/** The emf resource set used during the test */
	protected final ResourceSet resourceSet = new ResourceSetImpl();

	/** The persistence manager factory */
	private PersistenceManagerFactory pmf;

	/** The EMFDatastore */
	private JpoxDataStore emfDataStore;

	/** The persistence manager for this test store */
	private PersistenceManager pm;

	/** The transaction object */
	private Transaction tx;

	/** Used to disable drop */
	private boolean donotDrop = false;

	/** The jdo classloader */
	private JDOClassLoaderResolver clr = new JDOClassLoaderResolver();

	/** The epackages */
	private EPackage[] epackages;

	/** The properties */
	private Properties props;

	/** The inheritance type */
	private InheritanceType inheritanceType;

	/**
	 * Constructor for emf test cases
	 */
	public JPOXTestStore(TestDatabaseAdapter adapter, EPackage[] epackages, String jdoLocation, Properties props,
			InheritanceType inheritanceType) {
		super(adapter);
		this.epackages = epackages;
		this.props = props;
		this.inheritanceType = inheritanceType;
		ERuntime.INSTANCE.clear();
		init(adapter, jdoLocation);
	}

	/** Creates/sets the persistence manager */
	private void init(TestDatabaseAdapter adapter, String jdoLocation) {
		if (jdoLocation != null) {
			props.put(JpoxConstants.PACKAGE_JDO_LOCATION, jdoLocation);
		}
		Properties properties = new Properties();
		properties.putAll(props);

		properties.setProperty(PMFConfiguration.JDO_DATASTORE_DRIVERNAME_PROPERTY, adapter.getDbDriver());
		properties.setProperty(PMFConfiguration.JDO_DATASTORE_URL_PROPERTY, adapter.getDbUrl());
		properties.setProperty(PMFConfiguration.JDO_DATASTORE_USERNAME_PROPERTY, adapter.getDbUser());
		properties.setProperty(PMFConfiguration.JDO_DATASTORE_PASSWORD_PROPERTY, adapter.getDbPwd());
		// properties.setProperty(PMFConfiguration.JDO_MAPPING_CATALOG_PROPERTY, adapter.getDbName());

		if (inheritanceType.getValue() == InheritanceType.JOINED) {
			properties.setProperty(PMFConfiguration.DEFAULT_INHERITANCE_STRATEGY_PROPERTY, "JPOX");
		} else {
			properties.setProperty(PMFConfiguration.DEFAULT_INHERITANCE_STRATEGY_PROPERTY, "JDO2");
		}

		emfDataStore = JpoxHelper.INSTANCE.createRegisterDataStore(adapter.getDbName());
		emfDataStore.setProperties(properties);
		emfDataStore.setEPackages(epackages);
		emfDataStore.initialize();
		pmf = emfDataStore.getPMF();
		pm = pmf.getPersistenceManager();

		// this is really a hack because it showed that if multiple test cases where run after
		// eachother that jpox was not cleaned up correctly.
		// JPOXHelper.init(pm);

		tx = pm.currentTransaction();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.test.stores.TestStore#addEPackage(org.eclipse.emf.ecore.EPackage)
	 */
	public void addEPackage(EPackage epackage) {
		throw new StoreException("Not supported");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.test.stores.TestStore#updateSchema()
	 */
	public void updateSchema() {
		throw new StoreException("Not supported");
	}

	/** Creates a new persistence manager, actually to clear the cache */
	public void refresh() {
		if (tx.isActive()) {
			tx.rollback();
		}
		pm.close();
		pm = pmf.getPersistenceManager();
		tx = pm.currentTransaction();
	}

	/** Returns the current persistence manager */
	public PersistenceManager getPersistenceManager() {
		return pm;
	}

	/** Begin transaction */
	public void beginTransaction() {
		tx.begin();
	}

	/** Commit transaction */
	public void commitTransaction() {
		tx.commit();

		refresh();
	}

	/** Rollback transaction */
	public void rollbackTransaction() {
		if (tx.isActive())
			tx.rollback();
		refresh();
	}

	/** Store/Makepersistent */
	public void store(Object object) {
		pm.makePersistent(object);
	}

	/** Deletes an object */
	public void deleteObject(Object obj) {
		pm.deletePersistent(obj);
	}

	/** Test if a delete fails */
	public void checkDeleteFails(Class clazz) {
		checkDelete(clazz, false); // replace class is called in checkDelete/getObjects
	}

	/** Test if a delete fails */
	public void checkDeleteSucceeds(Class clazz) {
		checkDelete(clazz, true); // replace class is called in CheckDelete/getObjects
	}

	/** Query for a class using a field and value pair */
	public List query(Class clazz, String field, String value, int checkCount) {
		final Class interf = replaceClass(clazz);
		return query("SELECT FROM " + interf.getName() + " WHERE " + field + "==\"" + value + "\"", checkCount);
	}

	/** Queries for an object */
	public List query(Object query) {
		return query(query, -1);
	}

	/** Queries for an object and checks the number */
	public List query(Object query, int checkCount) {
		final String qryStr = (String) query;
		final Query qry = pm.newQuery(query);
		final List result = (List) qry.execute();

		if (checkCount > 0) {
			TestCase.assertTrue("Expected " + checkCount + " object(s) for this query but there are " + result.size()
					+ " object(s) for the query " + qryStr, result.size() == checkCount);
		}
		return result;
	}

	/** Test if a delete fails */
	private void checkDelete(Class clazz, boolean shouldSucceed) {
		beginTransaction();
		final List l = getObjects(clazz); // replace class is called in getObjects
		try {
			for (int i = 0; i < l.size(); i++) {
				pm.deletePersistent(l.get(i));
			}
			commitTransaction();
			TestCase.assertTrue("The objects of class: " + clazz.getName()
					+ " was deleted while this should not be possible", shouldSucceed);
		} catch (Exception e) {
			// e.printStackTrace(System.err);
			TestCase.assertTrue("The objects of class: " + clazz.getName()
					+ " was not deleted while this should be possible", !shouldSucceed);
			if (tx.isActive())
				rollbackTransaction();
		}
	}

	/** Return an object of a certain class, there should only be one in the databases */
	public Object getObject(Class clazz) {
		List l = getObjects(clazz); // replace class is called in getObjects
		TestCase
				.assertTrue("There are " + l.size()
						+ " object(s) of this class in the datastore, 1 was expected, class: " + clazz.getName(), l
						.size() == 1);
		return l.get(0);
	}

	/** Returns a list of object of a certain class */
	public List getObjects(Class clazz) {
		final Class concrete = replaceClass(clazz);
		Extent e = pm.getExtent(concrete, true);
		Query q = pm.newQuery(e);

		List c = (List) q.execute();
		return c;
	}

	/** Test the amount of objects of a certain class in the db */
	public void checkNumber(Class clazz, int count) {
		final Class interf = replaceClass(clazz);
		Extent e = pm.getExtent(interf, true);
		Query q = pm.newQuery(e);

		Collection c = (Collection) q.execute();
		TestCase.assertTrue("Expected " + count + " object(s) but there are " + c.size()
				+ " object(s) of this class in the datastore: " + clazz.getName(), c.size() == count);
		q.closeAll();
	}

	/** Flushes all updates to the underlying datastore */
	public void flush() {
		pm.flush();
	}

	/** Is called just before the test */
	public void setUp() {

	}

	/** Can be used to disabled dropping of the store, convenience for testing */
	public void disableDrop() {
		donotDrop = true;
	}

	/**
	 * Is called just after the test, the dropStore parameter can be used to prevent dropping the database when an error
	 */
	public void doTearDown() {
		// AssertUtil.assertTrue("Transaction is still active at end of test", !pm.currentTransaction().isActive());

		if (pm.currentTransaction().isActive()) {
			pm.currentTransaction().rollback();
		}

		if (!pm.isClosed()) {
			pm.close();
		}

		// JpoxHelper.INSTANCE.closeAll();

		if (!donotDrop) {
			dropDatabase();
		}

		ERuntime.INSTANCE.clear();
	}

	/** Returns true if the transaction is still active */
	public boolean transactionActive() {
		return pm.currentTransaction().isActive();
	}

	/** Base method to get a resource belonging to the pmf of this test case */
	public Resource getResource() {
		return getResource(null);
	}

	/** Returns the underlying EMFDataStore */
	public JpoxDataStore getDataStore() {
		return emfDataStore;
	}

	/** Base method to get a resource belonging to the pmf of this test case */
	public Resource getResource(String extraParam) {
		String uriStr = "jpoxdao://?" + JPOXResource.DS_NAME_PARAM + "=" + getDatabaseAdapter().getDbName();

		if (extraParam != null) {
			uriStr += "&" + extraParam;
		}
		final URI uri = URI.createURI(uriStr);
		log.debug("Getting resource using uri: " + uri.toString());
		final Resource res = resourceSet.createResource(uri);
		assert (res instanceof JPOXResource);
		return res;
	}

	/** Replaces a passed EMF Interface by its concrete class */
	private Class replaceClass(Class interfaze) {
		if (!interfaze.isInterface())
			return interfaze;
		if (!EObject.class.isAssignableFrom(interfaze))
			return interfaze;

		return JpoxHelper.INSTANCE.getInstanceClass(interfaze);
	}

	/** Gets the referedto list */
	public Object[] getCrossReferencers(EObject obj, boolean container) {
		if (container) {
			return new EObject[] { ((JpoxDataStore) emfDataStore).getContainer(pm, obj) };
		} else {
			return ((JpoxDataStore) emfDataStore).getCrossReferencers(pm, obj);
		}
	}

	/** Gets the container list */
	public boolean setContainer(EObject obj) {
		return ((JpoxDataStore) emfDataStore).setContainer(pm, obj);
	}

	/** Refreshes the object from the datastore */
	public void refresh(Object obj) {
		pm.refresh(obj);
	}

	/** Check inheritance strategy */
	public boolean isInheritanceStrategy(String name, InheritanceType strategy) {
		final Class clazz = clr.classForName(name);
		final ClassMetaData cmd = ((PersistenceManagerFactoryImpl) pmf).getPMFContext().getMetaDataManager()
				.getMetaDataForClass(clazz, clr);
		if (strategy.equals(InheritanceType.SINGLE_TABLE_LITERAL)) {
			return cmd.getInheritanceMetaData().getStrategyValue() == InheritanceStrategy.SUPERCLASS_TABLE;
		}
		if (strategy.equals(InheritanceType.JOINED_LITERAL)) {
			return cmd.getInheritanceMetaData().getStrategyValue() == InheritanceStrategy.NEW_TABLE;
		}
		throw new StoreTestException("Strategy: " + strategy.toString() + " not supported ");
	}

	/** Gets a database connection using the adapters connection info */
	public Connection getConnection() {
		return getDatabaseAdapter().getConnection();
	}

	/**
	 * @return the emfDataStore
	 */
	public JpoxDataStore getEmfDataStore() {
		return emfDataStore;
	}

	/**
	 * @return the inheritanceType
	 */
	public InheritanceType getInheritanceType() {
		return inheritanceType;
	}
}