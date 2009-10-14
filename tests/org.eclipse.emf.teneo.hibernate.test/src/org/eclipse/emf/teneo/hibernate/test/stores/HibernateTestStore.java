/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * HibernateTestStore.java,v 1.16 2007/03/29 15:00:21 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.stores;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.persistence.EntityManager;

import junit.framework.TestCase;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.teneo.DataStore;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.annotations.pannotation.InheritanceType;
import org.eclipse.emf.teneo.ecore.EModelResolver;
import org.eclipse.emf.teneo.extension.ExtensionManager;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbEntityDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.eclipse.emf.teneo.hibernate.SessionWrapper;
import org.eclipse.emf.teneo.hibernate.resource.HbResource;
import org.eclipse.emf.teneo.hibernate.resource.HibernateResource;
import org.eclipse.emf.teneo.hibernate.test.stores.adapters.HibernateTestDBAdapter;
import org.eclipse.emf.teneo.mapping.strategy.EntityNameStrategy;
import org.eclipse.emf.teneo.test.stores.AbstractTestStore;
import org.eclipse.emf.teneo.test.stores.HsqldbTestDatabaseAdapter;
import org.eclipse.emf.teneo.util.AssertUtil;
import org.eclipse.emf.teneo.util.EcoreDataTypes;
import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.cfg.Environment;
import org.hibernate.ejb.EntityManagerImpl;

/**
 * The hibernate test store encapsulates the datastore actions to a hibernate store.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.34 $
 */
public class HibernateTestStore extends AbstractTestStore {
	/** The logger */
	private static Log log = LogFactory.getLog(HibernateTestStore.class);

	public static final String EPACKAGE_INIT_MODE = "epackageinitmode";
	public static final String EPACKAGE_INIT_MODE_CLASS = "class";
	public static final String EPACKAGE_INIT_MODE_ECORE = "ecore";
	public static final String EPACKAGE_INIT_MODE_ECORE_VALUE = "ecorefile";

	/** The emf resource set used during the test */
	protected ResourceSet resourceSet;

	/** The EMFDatastore */
	private HbDataStore emfDataStore;

	/** The persistence manager for this test store */
	private SessionWrapper sessionWrapper;

	/** The props used to create it all */
	private final Properties props;

	/** the used epackages */
	private EPackage[] epackages;

	/** The inheritance logic followed */
	private final InheritanceType inheritanceType;

	/** Do ejb3 */
	private final boolean ejb3;

	/** The extensionManager */
	private final ExtensionManager extensionManager;

	/**
	 * Constructor for emf test cases
	 */
	public HibernateTestStore(HibernateTestDBAdapter adapter, EPackage[] epackages, Properties props,
			InheritanceType inheritanceType, boolean ejb3, ExtensionManager extensionManager) {
		super(adapter);
		this.props = props;
		this.epackages = epackages;
		this.inheritanceType = inheritanceType;
		this.ejb3 = ejb3;
		this.extensionManager = extensionManager;
		init();
	}

	/** Creates/sets the persistence manager */
	private void init() {
		final HibernateTestDBAdapter adapter = (HibernateTestDBAdapter) getDatabaseAdapter();

		props.setProperty(PersistenceOptions.INHERITANCE_MAPPING, inheritanceType.getName());

		for (EPackage element : epackages) {
			log.debug("Creating HibernateTeststore for " + element.getName() + " adapter "
					+ adapter.getClass().getName());
		}

		setDataStore();

		log.debug("HibernateTestStore initialized");
		resourceSet = new ResourceSetImpl();
	}

	/** Creates a Hibernate property set from the databaseadapter */
	private Properties getHibernateProperties(HibernateTestDBAdapter dbadapter) {
		final Properties props = new Properties();
		props.setProperty(Environment.DRIVER, dbadapter.getDbDriver());
		props.setProperty(Environment.USER, dbadapter.getDbUser());
		props.setProperty(Environment.URL, dbadapter.getDbUrl());
		props.setProperty(Environment.PASS, dbadapter.getDbPwd());
		props.setProperty(Environment.DIALECT, dbadapter.getDialect());
		props.setProperty(Environment.BYTECODE_PROVIDER, "cglib");
		return props;
	}

	/** Sets the emfDataStore */
	private void setDataStore() {
		// currentTimeMillis is added to make it unique
		if (ejb3) {
			emfDataStore = new HbEntityDataStore(); // (HbDataStore)HbHelper.INSTANCE.
			// createRegisterDataStore
			// (getDatabaseAdapter().getDbName());
		} else {
			emfDataStore = HbHelper.INSTANCE.createRegisterDataStore(getDatabaseAdapter().getDbName());
		}
		emfDataStore.setExtensionManager(extensionManager);
		emfDataStore.setName(getDatabaseAdapter().getDbName());
		if (props.getProperty(EPACKAGE_INIT_MODE) != null) {
			if (props.getProperty(EPACKAGE_INIT_MODE).compareTo(EPACKAGE_INIT_MODE_CLASS) == 0) {
				final List<String> clss = new ArrayList<String>();
				for (EPackage epackage : epackages) {
					clss.add(epackage.getClass().getName());
				}
				emfDataStore.setEPackageClasses(clss);
			} else if (props.getProperty(EPACKAGE_INIT_MODE).compareTo(EPACKAGE_INIT_MODE_ECORE) == 0) {
				final List<String> ecores = new ArrayList<String>();
				ecores.add(props.getProperty(EPACKAGE_INIT_MODE_ECORE_VALUE));
				emfDataStore.setEPackageFiles(ecores);
			}
		} else {
			emfDataStore.setEPackages(epackages);
		}
		// set both hibernate and persistence props as we do not know the difference right now
		props.putAll(getHibernateProperties((HibernateTestDBAdapter) getDatabaseAdapter()));

		if (!props.containsKey(PersistenceOptions.JOIN_TABLE_FOR_NON_CONTAINED_ASSOCIATIONS)) {
			props.setProperty(PersistenceOptions.JOIN_TABLE_FOR_NON_CONTAINED_ASSOCIATIONS, "false");
		}

		// do a special trick for hsqldb, because hsqldb expects all identifiers to be
		// escaped or otherwise uppercases them, so uppercase everything automatically
		if (getDatabaseAdapter() instanceof HsqldbTestDatabaseAdapter
				&& !props.containsKey(PersistenceOptions.SQL_CASE_STRATEGY)) {
			props.setProperty(PersistenceOptions.SQL_CASE_STRATEGY, "uppercase");
		}

		emfDataStore.setProperties(props);
		emfDataStore.initialize();
		if (sessionWrapper != null) {
			refresh();
		} else {
			sessionWrapper = emfDataStore.createSessionWrapper();
			sessionWrapper.getHibernateSession().setFlushMode(FlushMode.COMMIT);
		}
	}

	/** Returns the mapping xml */
	@Override
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
		sessionWrapper.getHibernateSession().setFlushMode(FlushMode.COMMIT);
	}

	/** Returns session */
	public Session getSession() {
		final Object obj = sessionWrapper.getSession();
		if (obj instanceof Session) {
			return (Session) obj;
		} else {
			return ((EntityManagerImpl) obj).getSession();
		}
	}

	/** Return the sessionwrapper */
	public SessionWrapper getSessionWrapper() {
		return sessionWrapper;
	}

	/** Return the entityManager */
	public EntityManager getEntityManager() {
		return (EntityManager) sessionWrapper.getSession();
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
		if (sessionWrapper.isTransactionActive()) {
			sessionWrapper.rollbackTransaction();
		}
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
	public void checkDeleteFails(Class<?> clazz) {
		checkDelete(clazz, false); // replace class is called in checkDelete/getObjects
	}

	/** Test if a delete fails */
	public void checkDeleteSucceeds(Class<?> clazz) {
		checkDelete(clazz, true); // replace class is called in CheckDelete/getObjects
	}

	/** Query for a class using a field and value pair */
	public List<?> query(Class<?> clazz, String field, String value, int checkCount) {
		// final Class interf = replaceClass(clazz);
		if (sessionWrapper.isEJB3EntityManager()) {
			return query("select o from " + getEntityName(clazz) + " o where o." + field + "=\'" + value + "\'",
					checkCount);
		} else {
			return query("from " + getEntityName(clazz) + " where " + field + "=\'" + value + "\'", checkCount);
		}
	}

	/** Queries for an object */
	@Override
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
			TestCase.assertTrue("The objects of class: " + clazz.getName()
					+ " was deleted while this should not be possible", shouldSucceed);
		} catch (Exception e) {
			TestCase.assertTrue("The objects of class: " + clazz.getName()
					+ " was not deleted while this should be possible", !shouldSucceed);
			if (sessionWrapper.isTransactionActive()) {
				rollbackTransaction();
			}
			refresh();
		}
	}

	/** Return an object of a certain class, there should only be one in the databases */
	@Override
	@SuppressWarnings("unchecked")
	public <T> T getObject(Class<T> clazz) {
		List<?> l = getObjects(clazz); // replace class is called in getObjects
		TestCase
				.assertTrue("There are " + l.size()
						+ " object(s) of this class in the datastore, 1 was expected, class: " + clazz.getName(), l
						.size() == 1);
		return (T) l.get(0);
	}

	/** Returns a list of object of a certain class */
	@SuppressWarnings("unchecked")
	public <T> List<T> getObjects(Class<T> clazz) {
		// final Class concrete = replaceClass(clazz);
		if (sessionWrapper.isEJB3EntityManager()) {
			return (List<T>) sessionWrapper.executeQuery("select o from " + getEntityName(clazz) + " o");
		} else {
			return (List<T>) sessionWrapper.executeQuery("FROM " + getEntityName(clazz));
		}
	}

	/** Test the amount of objects of a certain class in the db */
	@Override
	public void checkNumber(Class<?> clazz, int count) {
		final List<?> list = getObjects(clazz);
		TestCase.assertTrue("Expected " + count + " object(s) but there are " + list.size()
				+ " object(s) of this class in the datastore: " + clazz.getName(), list.size() == count);
	}

	/** Flushes all updates to the underlying datastore */
	public void flush() {
		sessionWrapper.flush();
	}

	/** Is called just before the test */
	@Override
	public void setUp() {

	}

	/**
	 * Is called just after the test, the dropStore parameter can be used to prevent dropping the database when an error
	 */
	@Override
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
	@Override
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
	 * return HibernateHelper.INSTANCE.getInstanceClass(interfaze); }
	 */

	/** Gets the referedto list */
	public Object[] getCrossReferencers(EObject obj, boolean container) {
		if (container) {
			return new Object[] { obj.eContainer() };
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
	@Override
	public boolean setContainer(EObject obj) {
		return true;
	}

	/** Refreshes the object from the datastore */
	public void refresh(Object obj) {
		sessionWrapper.refresh(obj);
	}

	public Object merge(Object object) {
		return sessionWrapper.merge(object);
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
	private String getEntityName(Class<?> clazz) {
		final EModelResolver emodelResolver = EModelResolver.instance();
		final EClass eclass = emodelResolver.getEClass(clazz);
		return getDataStore().getExtensionManager().getExtension(EntityNameStrategy.class).toEntityName(eclass);
	}

	/**
	 * @return the emfDataStore
	 */
	public HbDataStore getEmfDataStore() {
		return emfDataStore;
	}

	/** Return the datastore */
	public DataStore getDataStore() {
		return getEmfDataStore();
	}

	/**
	 * @return the inheritanceType
	 */
	public InheritanceType getInheritanceType() {
		return inheritanceType;
	}

	/** Is this a hibernate test store */
	@Override
	public boolean isHibernateTestStore() {
		return true;
	}

	/** Set the xmlgregoriancalendar date */
	public Object getDate(Date date) {
		return EcoreDataTypes.INSTANCE.getXMLGregorianCalendar(date);
	}
}