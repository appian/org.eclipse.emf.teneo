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
 * $Id: HibernateTestStore.java,v 1.14 2007/03/20 23:34:25 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.stores;

import java.sql.Connection;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.persistence.EntityManager;

import junit.framework.TestCase;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xml.type.internal.XMLCalendar;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.annotations.pannotation.InheritanceType;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbEntityDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.eclipse.emf.teneo.hibernate.SessionWrapper;
import org.eclipse.emf.teneo.hibernate.resource.HbResource;
import org.eclipse.emf.teneo.hibernate.resource.HibernateResource;
import org.eclipse.emf.teneo.hibernate.test.stores.adapters.HibernateTestDBAdapter;
import org.eclipse.emf.teneo.test.stores.AbstractTestStore;
import org.eclipse.emf.teneo.util.AssertUtil;
import org.hibernate.Session;
import org.hibernate.cfg.Environment;

/**
 * The hibernate test store encapsulates the datastore actions to a hibernate store.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.14 $
 */
public class HibernateTestStore extends AbstractTestStore {
	/** The logger */
	private static Log log = LogFactory.getLog(HibernateTestStore.class);

	/** The emf resource set used during the test */
	protected final ResourceSet resourceSet = new ResourceSetImpl();

	/** The EMFDatastore */
	private HbDataStore emfDataStore;

	/** The persistence manager for this test store */
	private SessionWrapper sessionWrapper;

	/** The props used to create it all */
	private Properties props;

	/** the used epackages */
	private EPackage[] epackages;

	/** The inheritance logic followed */
	private InheritanceType inheritanceType;

	/** Do ejb3 */
	private final boolean ejb3;
	
	/**
	 * Constructor for emf test cases
	 */
	public HibernateTestStore(HibernateTestDBAdapter adapter, EPackage[] epackages, Properties props, InheritanceType inheritanceType, boolean ejb3) {
		super(adapter);
		this.props = props;
		this.epackages = epackages;
		this.inheritanceType = inheritanceType;
		this.ejb3 = ejb3;
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
		if (ejb3) {
			emfDataStore = new HbEntityDataStore(); //(HbDataStore)HbHelper.INSTANCE.createRegisterDataStore(getDatabaseAdapter().getDbName());
		} else {
			emfDataStore = (HbDataStore)HbHelper.INSTANCE.createRegisterDataStore(getDatabaseAdapter().getDbName());
		}
		emfDataStore.setName(getDatabaseAdapter().getDbName());
		emfDataStore.setEPackages(epackages);
		// set both hibernate and persistence props as we do not know the difference right now
		emfDataStore.setHibernateProperties(getHibernateProperties((HibernateTestDBAdapter)getDatabaseAdapter()));
		emfDataStore.setPersistenceProperties(props);
		emfDataStore.initialize();
		if (sessionWrapper != null) {
			refresh();
		} else {
			sessionWrapper = emfDataStore.createSessionWrapper();
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
		
		if (sessionWrapper.isTransactionActive()) {
			sessionWrapper.rollbackTransaction();
		}
		sessionWrapper.close();
		sessionWrapper = emfDataStore.createSessionWrapper();
	}

	/** Returns session */
	public Session getSession() {
		return (Session)sessionWrapper.getSession();
	}

	/** Return the sessionwrapper */
	public SessionWrapper getSessionWrapper() {
		return sessionWrapper;
	}
	
	/** Return the entityManager */
	public EntityManager getEntityManager() {
		return (EntityManager)sessionWrapper.getSession();
	}
	
	/** Returns a new session */
	public Session getNewSession() {
		return emfDataStore.getSessionFactory().openSession();
	}

	/** Begin transaction */
	public void beginTransaction() {
		sessionWrapper.beginTransaction();
	}

	/** Commit transaction */
	public void commitTransaction() {
		sessionWrapper.commitTransaction();
		refresh();
	}

	/** Rollback transaction */
	public void rollbackTransaction() {
		if (sessionWrapper.isTransactionActive()) sessionWrapper.rollbackTransaction();
		refresh();
	}

	/** Store/Makepersistent */
	public void store(Object object) {
		sessionWrapper.saveOrUpdate(object);
	}

	/** Deletes an object */
	public void deleteObject(Object obj) {
		sessionWrapper.delete(obj);
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
	public List<?> query(Class clazz, String field, String value, int checkCount) {
		// final Class interf = replaceClass(clazz);
		if (sessionWrapper.isEJB3EntityManager()) {
			return query("select o from " + getEntityName(clazz) + " o where o." + field + "=\'" + value + "\'", checkCount);
		} else {
			return query("from " + getEntityName(clazz) + " where " + field + "=\'" + value + "\'", checkCount);
		}
	}

	/** Queries for an object */
	public List<?> query(Object query) {
		return query(query, -1);
	}

	/** Queries for an object and checks the number */
	public List<?> query(Object query, int checkCount) {
		final String qryStr = (String) query;
		final List<?> result = sessionWrapper.executeQuery(qryStr);

		if (checkCount > 0) {
			TestCase.assertTrue("Expected " + checkCount + " object(s) for this query but there are " + result.size()
					+ " object(s) for the query " + qryStr, result.size() == checkCount);
		}
		return result;
	}

	/** Test if a delete fails */
	private void checkDelete(Class<?> clazz, boolean shouldSucceed) {
		beginTransaction();
		final List<?> l = getObjects(clazz); // replace class is called in getObjects
		try {
			for (int i = 0; i < l.size(); i++) {
				sessionWrapper.delete(l.get(i));
			}
			commitTransaction();
			TestCase.assertTrue("The objects of class: " + clazz.getName() + " was deleted while this should not be possible",
					shouldSucceed);
		} catch (Exception e) {
			//e.printStackTrace(System.err);
			TestCase.assertTrue("The objects of class: " + clazz.getName() + " was not deleted while this should be possible",
					!shouldSucceed);
			if (sessionWrapper.isTransactionActive()) {
				rollbackTransaction();
			}
			refresh();
		}
	}

	/** Return an object of a certain class, there should only be one in the databases */
	public Object getObject(Class clazz) {
		List<?> l = getObjects(clazz); // replace class is called in getObjects
		TestCase.assertTrue("There are " + l.size() + " object(s) of this class in the datastore, 1 was expected, class: "
				+ clazz.getName(), l.size() == 1);
		return l.get(0);
	}

	/** Returns a list of object of a certain class */
	public List<?> getObjects(Class clazz) {
		// final Class concrete = replaceClass(clazz);
		if (sessionWrapper.isEJB3EntityManager()) {
			return sessionWrapper.executeQuery("select o from " + getEntityName(clazz) + " o");
		} else {
			return sessionWrapper.executeQuery("FROM " + getEntityName(clazz));
		}
	}

	/** Test the amount of objects of a certain class in the db */
	public void checkNumber(Class clazz, int count) {
		final List<?> list = getObjects(clazz);
		TestCase.assertTrue("Expected " + count + " object(s) but there are " + list.size()
				+ " object(s) of this class in the datastore: " + clazz.getName(), list.size() == count);
	}

	/** Flushes all updates to the underlying datastore */
	public void flush() {
		sessionWrapper.flush();
	}

	/** Is called just before the test */
	public void setUp() {

	}

	/**
	 * Is called just after the test, the dropStore parameter can be used to prevent dropping the database when an error
	 */
	public void doTearDown() {
		AssertUtil.assertTrue("Transaction is still active at end of test", !sessionWrapper.isTransactionActive());

		if (sessionWrapper.isTransactionActive()) {
			rollbackTransaction();
		}

		sessionWrapper.close();

		HbHelper.INSTANCE.closeAll();

		if (!donotDrop) {
			dropDatabase();
		}
	}

	/** Returns true if the transaction is still active */
	public boolean transactionActive() {
		return sessionWrapper.isTransactionActive();
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
			return emfDataStore.getCrossReferencers(sessionWrapper, obj);
		}
	}

	/** Gets the container list */
	public boolean setContainer(EObject obj) {
		return true;
	}

	/** Refreshes the object from the datastore */
	public void refresh(Object obj) {
		sessionWrapper.refresh(obj);
	}

	/** Check inheritance strategy */
	public boolean isInheritanceStrategy(Class<?> cls, InheritanceType strategy) {
		return sessionWrapper.isInheritanceStrategy(cls, strategy);
	}

	/** Gets a database connection using the adapters connection info */
	public Connection getConnection() {
		return getDatabaseAdapter().getConnection();
	}

	/** Returns the query name to use for the instance */
	private String getEntityName(Class clazz) {
		final String entityName = clazz.getName().substring(clazz.getName().lastIndexOf('.') + 1);
		if (props.get(PersistenceOptions.QUALIFY_ENTITY_NAME) != null && 
				props.get(PersistenceOptions.QUALIFY_ENTITY_NAME).equals(PersistenceOptions.QUALIFY_ENTITY_NAME_NSPREFIX)) {
			return epackages[0].getNsPrefix() + "." + entityName;
		} else {
			return entityName;
		}
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
	
	/** Set the xmlcalendar date */
	public Object getDate(Date date) {
		return new XMLCalendar(date, XMLCalendar.DATETIME);
	}
}