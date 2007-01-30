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
 * $Id: HibernateTestStore.java,v 1.10 2007/01/30 10:51:36 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.stores;

import java.sql.Connection;
import java.util.List;
import java.util.Properties;

import junit.framework.TestCase;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.annotations.pannotation.InheritanceType;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.eclipse.emf.teneo.hibernate.resource.HbResource;
import org.eclipse.emf.teneo.hibernate.resource.HibernateResource;
import org.eclipse.emf.teneo.hibernate.test.stores.adapters.HibernateTestDBAdapter;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.AbstractTestStore;
import org.eclipse.emf.teneo.util.AssertUtil;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Environment;
import org.hibernate.impl.SessionImpl;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.persister.entity.JoinedSubclassEntityPersister;
import org.hibernate.persister.entity.SingleTableEntityPersister;
import org.hibernate.persister.entity.UnionSubclassEntityPersister;

/**
 * The hibernate test store encapsulates the datastore actions to a hibernate store.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.10 $
 */
public class HibernateTestStore extends AbstractTestStore {
	/** The logger */
	private static Log log = LogFactory.getLog(HibernateTestStore.class);

	/** The emf resource set used during the test */
	protected final ResourceSet resourceSet = new ResourceSetImpl();

	/** The EMFDatastore */
	private HbDataStore emfDataStore;

	/** The persistence manager for this test store */
	private Session session;

	/** The transaction object */
	private Transaction tx;

	/** The props used to create it all */
	private Properties props;

	/** the used epackages */
	private EPackage[] epackages;

	/** The inheritance logic followed */
	private InheritanceType inheritanceType;

	/**
	 * Constructor for emf test cases
	 */
	public HibernateTestStore(HibernateTestDBAdapter adapter, EPackage[] epackages, Properties props, InheritanceType inheritanceType) {
		super(adapter);
		this.props = props;
		this.epackages = epackages;
		this.inheritanceType = inheritanceType;
		init();
	}

	/** Creates/sets the persistence manager */
	private void init() {
		final HibernateTestDBAdapter adapter = (HibernateTestDBAdapter) getDatabaseAdapter();

		props.setProperty(PersistenceOptions.INHERITANCE_MAPPING, inheritanceType.getName());

		for (int i = 0; i < epackages.length; i++) {
			log.debug("Creating HibernateTeststore for " + epackages[i].getName() + " adapter " + adapter.getClass().getName());
		}

		setDataStore();

		log.debug("HibernateTestStore initialized");
	}

	/** Creates a Hibernate property set from the databaseadapter */
	private Properties getHibernateProperties(HibernateTestDBAdapter dbadapter) {
		final Properties props = new Properties();
		props.setProperty(Environment.DRIVER, dbadapter.getDbDriver());
		props.setProperty(Environment.USER, dbadapter.getDbUser());
		props.setProperty(Environment.URL, dbadapter.getDbUrl());
		props.setProperty(Environment.PASS, dbadapter.getDbPwd());
		props.setProperty(Environment.DIALECT, dbadapter.getDialect());
		return props;
	}

	/** Sets the emfDataStore */
	private void setDataStore() {
		// currentTimeMillis is added to make it unique
		emfDataStore = (HbDataStore)HbHelper.INSTANCE.createRegisterDataStore(getDatabaseAdapter().getDbName());
		emfDataStore.setEPackages(epackages);
		// set both hibernate and persistence props as we do not know the difference right now
		emfDataStore.setHibernateProperties(getHibernateProperties((HibernateTestDBAdapter)getDatabaseAdapter()));
		emfDataStore.setPersistenceProperties(props);
		emfDataStore.initialize();
		if (session != null) {
			refresh();
		} else {
			session = emfDataStore.getSessionFactory().openSession();
			tx = session.getTransaction();
		}
	}

	/** Returns the mapping xml */
	public String getMappingXML() {
		return emfDataStore.getMappingXML();
	}

	/** Add an epackage to the list of epackages */
	public void addEPackage(EPackage epackage) {
		EPackage[] newEPacks = new EPackage[epackages.length + 1];
		newEPacks[0] = epackage;
		for (int i = 0; i < epackages.length; i++) {
			newEPacks[i + 1] = epackages[i];
		}
		epackages = newEPacks;
	}

	/** Update the database schema */
	public void updateSchema() {
		emfDataStore.setEPackages(epackages);
		emfDataStore.initialize();
		refresh();
	}

	/** Creates a new persistence manager, actually to clear the cache */
	public void refresh() {
		if (tx != null && tx.isActive()) {
			tx.rollback();
		}
		session.close();
		session = emfDataStore.getSessionFactory().openSession();
		tx = session.getTransaction();
	}

	/** Returns session */
	public Session getSession() {
		return session;
	}

	/** Returns a new session */
	public Session getNewSession() {
		return emfDataStore.getSessionFactory().openSession();
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
		if (tx.isActive()) tx.rollback();
		refresh();
	}

	/** Store/Makepersistent */
	public void store(Object object) {
		session.saveOrUpdate(object);
	}

	/** Deletes an object */
	public void deleteObject(Object obj) {
		session.delete(obj);
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
		// final Class interf = replaceClass(clazz);
		return query("FROM " + getEntityName(clazz) + " WHERE " + field + "=\'" + value + "\'", checkCount);
	}

	/** Queries for an object */
	public List query(Object query) {
		return query(query, -1);
	}

	/** Queries for an object and checks the number */
	public List query(Object query, int checkCount) {
		final String qryStr = (String) query;
		final Query qry = session.createQuery(qryStr);
		final List result = qry.list();

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
				session.delete(l.get(i));
			}
			commitTransaction();
			TestCase.assertTrue("The objects of class: " + clazz.getName() + " was deleted while this should not be possible",
					shouldSucceed);
		} catch (Exception e) {
			e.printStackTrace(System.err);
			TestCase.assertTrue("The objects of class: " + clazz.getName() + " was not deleted while this should be possible",
					!shouldSucceed);
			if (tx.isActive()) rollbackTransaction();
		}
	}

	/** Return an object of a certain class, there should only be one in the databases */
	public Object getObject(Class clazz) {
		List l = getObjects(clazz); // replace class is called in getObjects
		TestCase.assertTrue("There are " + l.size() + " object(s) of this class in the datastore, 1 was expected, class: "
				+ clazz.getName(), l.size() == 1);
		return l.get(0);
	}

	/** Returns a list of object of a certain class */
	public List getObjects(Class clazz) {
		// final Class concrete = replaceClass(clazz);
		final Query q = session.createQuery("FROM " + getEntityName(clazz));

		return q.list();
	}

	/** Test the amount of objects of a certain class in the db */
	public void checkNumber(Class clazz, int count) {
		final List list = getObjects(clazz);
		TestCase.assertTrue("Expected " + count + " object(s) but there are " + list.size()
				+ " object(s) of this class in the datastore: " + clazz.getName(), list.size() == count);
	}

	/** Flushes all updates to the underlying datastore */
	public void flush() {
		session.flush();
	}

	/** Is called just before the test */
	public void setUp() {

	}

	/**
	 * Is called just after the test, the dropStore parameter can be used to prevent dropping the database when an error
	 */
	public void doTearDown() {
		AssertUtil.assertTrue("Transaction is still active at end of test", !((SessionImpl) session).isTransactionInProgress());

		if (tx.isActive() || ((SessionImpl) session).isTransactionInProgress()) {
			tx.rollback();
		}

		if (session.isOpen()) {
			session.close();
		}

		HbHelper.INSTANCE.closeAll();

		if (!donotDrop) {
			dropDatabase();
		}
	}

	/** Returns true if the transaction is still active */
	public boolean transactionActive() {
		return ((SessionImpl) session).isTransactionInProgress();
	}

	/** Base method to get a resource belonging to the pmf of this test case */
	public Resource getResource() {
		return getResource(null);
	}

	/** Base method to get a resource belonging to the session of this test case */
	public Resource getResource(String extraParam) {
		String uriStr = "hibernate://?" + HibernateResource.DS_NAME_PARAM + "=" + emfDataStore.getName();

		if (extraParam != null) {
			uriStr += "&" + extraParam;
		}
		final URI uri = URI.createURI(uriStr);
		log.debug("Getting resource using uri: " + uri.toString());
		final Resource res = resourceSet.createResource(uri);
		assert (res instanceof HbResource);
		return res;
	}

	/**
	 * Replaces a passed EMF Interface by its concrete class private Class replaceClass(Class interfaze) { if
	 * (!interfaze.isInterface()) return interfaze; if (!EObject.class.isAssignableFrom(interfaze)) return interfaze;
	 * 
	 * return HibernateHelper.INSTANCE.getInstanceClass(interfaze); }
	 */

	/** Gets the referedto list */
	public Object[] getCrossReferencers(EObject obj, boolean container) {
		if (container) {
			return new Object[]{obj.eContainer()};
			// final EObject eobj = ((HbDataStore)emfDataStore).getContainer(session, obj);
			// if (eobj == null)
			// {
			// return new EObject[0];
			// }
			// return new EObject[] {eobj};
		} else {
			return emfDataStore.getCrossReferencers(session, obj);
		}
	}

	/** Gets the container list */
	public boolean setContainer(EObject obj) {
		return true;
	}

	/** Refreshes the object from the datastore */
	public void refresh(Object obj) {
		session.refresh(obj, LockMode.NONE);
	}

	/** Check inheritance strategy */
	public boolean isInheritanceStrategy(String name, InheritanceType strategy) {
		final String realName = name.substring(name.lastIndexOf('.') + 1, name.length() - 4);
		final ClassMetadata cmd = session.getSessionFactory().getClassMetadata(realName);
		if (strategy.equals(InheritanceType.SINGLE_TABLE_LITERAL)) {
			return cmd instanceof SingleTableEntityPersister;
		}
		if (strategy.equals(InheritanceType.JOINED_LITERAL)) {
			return cmd instanceof JoinedSubclassEntityPersister;
		}
		if (strategy.equals(InheritanceType.TABLE_PER_CLASS_LITERAL)) {
			return cmd instanceof UnionSubclassEntityPersister;
		}
		throw new StoreTestException("Strategy: " + strategy.toString() + " not supported ");
	}

	/** Gets a database connection using the adapters connection info */
	public Connection getConnection() {
		return getDatabaseAdapter().getConnection();
	}

	/** Returns the query name to use for the instance */
	private String getEntityName(Class clazz) {
		return clazz.getName().substring(clazz.getName().lastIndexOf('.') + 1);
	}

	/**
	 * @return the emfDataStore
	 */
	public HbDataStore getEmfDataStore() {
		return emfDataStore;
	}

	/**
	 * @return the inheritanceType
	 */
	public InheritanceType getInheritanceType() {
		return inheritanceType;
	}
	
	/** Is this a hibernate test store */ 
	public boolean isHibernateTestStore() {
		return true;
	}
}