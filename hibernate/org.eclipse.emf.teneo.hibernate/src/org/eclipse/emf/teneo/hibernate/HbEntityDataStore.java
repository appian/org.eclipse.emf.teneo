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
 * $Id: HbEntityDataStore.java,v 1.37 2011/07/05 05:09:41 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.persistence.Cache;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.FlushModeType;
import javax.persistence.LockModeType;
import javax.persistence.Parameter;
import javax.persistence.PersistenceUnitUtil;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.metamodel.Metamodel;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.teneo.PackageRegistryProvider;
import org.eclipse.emf.teneo.annotations.mapper.PersistenceFileProvider;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage;
import org.eclipse.emf.teneo.hibernate.mapper.MappingUtil;
import org.eclipse.emf.teneo.hibernate.mapping.EMFInitializeCollectionEventListener;
import org.eclipse.emf.teneo.hibernate.mapping.eav.EAVGenericIDUserType;
import org.hibernate.Interceptor;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.ejb.Ejb3Configuration;
import org.hibernate.ejb.EntityManagerFactoryImpl;
import org.hibernate.ejb.QueryImpl;
import org.hibernate.engine.query.spi.NamedParameterDescriptor;
import org.hibernate.event.service.spi.EventListenerRegistry;
import org.hibernate.event.spi.EventType;
import org.hibernate.internal.AbstractQueryImpl;
import org.hibernate.internal.SessionFactoryImpl;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.EntityType;
import org.hibernate.type.Type;

/**
 * Adds Hibernate Entitymanager behavior to the hbDataStore.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.37 $
 */
@SuppressWarnings("deprecation")
public class HbEntityDataStore extends HbDataStore implements
		EntityManagerFactory {

	/** The logger */
	private static Log log = LogFactory.getLog(HbEntityDataStore.class);

	/** The persistency manager factory */
	private EntityManagerFactory entityManagerFactory;

	/** The used Hibernate configuration */
	private Ejb3Configuration ejb3Configuration;

	private Field queryParametersField;

	/** Initializes this Data Store */
	@Override
	public void initialize() {
		if (ejb3Configuration != null && isResetConfigurationOnInitialization()) {
			ejb3Configuration = null;
		}

		MappingUtil.registerHbExtensions(getExtensionManager());

		try {
			PackageRegistryProvider.getInstance().setThreadPackageRegistry(
					getPackageRegistry());

			if (log.isDebugEnabled()) {
				log.debug("Initializing EJB3 Hb Entity DataStore");
			}
			// check a few things
			if (getEPackages() == null) {
				throw new HbMapperException("EPackages are not set");
				// if (getName() == null)
				// throw new HbStoreException("Name is not set");
			}

			// reset interceptor
			setInterceptor(null);

			mapModel();

			setPropertiesInConfiguration();

			initializeDataStore();

			// wait for the session factory until the database is (re)created
			if (entityManagerFactory != null && entityManagerFactory.isOpen()) {
				entityManagerFactory.close();
			}
			entityManagerFactory = buildEntityManagerFactory();

			// register ourselves
			HbHelper.INSTANCE.register(this);

			setInitialized(true);
			
			setEventListeners();
		} finally {
			PackageRegistryProvider.getInstance()
					.setThreadPackageRegistry(null);
		}
	}

	/** Build the mappings in the configuration */
	@Override
	protected void buildMappings() {
		getConfiguration().buildMappings();
	}

	/** Set the event listener, can be overridden, in this impl. it does nothing */
	@Override
	protected void setEventListeners() {
		final EMFInitializeCollectionEventListener eventListener = getExtensionManager()
				.getExtension(EMFInitializeCollectionEventListener.class);
		EntityManagerFactory emf = getEntityManagerFactory();
		if (emf instanceof WrappedEntityManagerFactory) {
			emf = ((WrappedEntityManagerFactory)emf).getDelegate();
		}
		final ServiceRegistry serviceRegistry = ((SessionFactoryImpl)((EntityManagerFactoryImpl)emf).getSessionFactory()).getServiceRegistry();
		final EventListenerRegistry eventListenerRegistry = serviceRegistry.getService( EventListenerRegistry.class );
		eventListenerRegistry.setListeners(EventType.INIT_COLLECTION, eventListener);
	}

	/** Sets the interceptor */
	@Override
	protected void setInterceptor() {
		if (getInterceptor() != null) {
			return;
		}
		final Interceptor interceptor = getHbContext().createInterceptor(
				getHibernateConfiguration(), getEntityNameStrategy());
		getConfiguration().setInterceptor(interceptor);
		setInterceptor(interceptor);
	}

	/** Returns a new ejb3 configuration object */
	protected Ejb3Configuration createConfiguration() {
		return new Ejb3Configuration();
	}

	/** Sets the properties in the Hibernate Configuration. */
	protected void setPropertiesInConfiguration() {
		Properties properties = getDataStoreProperties();
		if (properties != null) {
			setDefaultProperties(properties);
			// set this as this gives errors in the hibernate entity manager
			// see this bugzilla:
			// https://bugs.eclipse.org/bugs/show_bug.cgi?id=330855
			// Using HbEntityDataStore causes org.hibernate.MappingException:
			// Unknown entity:...
			if (!properties.containsKey("hibernate.ejb.metamodel.generation")) {
				properties.setProperty("hibernate.ejb.metamodel.generation",
						"disabled");
			}
			getConfiguration().addProperties(properties);
		}
	}

	/**
	 * Maps an ecore model of one ore more epackages into a hibernate xml String
	 * which is added to the passed configuration
	 */
	protected void mapModel() {
		if (getPersistenceOptions().isUseMappingFile()
				|| getPersistenceOptions().getMappingFilePath() != null) {
			if (log.isDebugEnabled()) {
				log.debug("Searching hbm files in class paths of epackages");
			}
			final String[] fileList = getMappingFileList();
			for (String element : fileList) {
				if (log.isDebugEnabled()) {
					log.debug("Adding file " + element
						+ " to Hibernate Configuration");
				}
				final PersistenceFileProvider pfp = getExtensionManager()
						.getExtension(PersistenceFileProvider.class);
				final InputStream is = pfp.getFileContent(this.getClass(),
						element);
				if (is == null) {
					throw new HbStoreException("Path to mapping file: "
							+ element + " does not exist!");
				}
				getConfiguration().addInputStream(is);
			}
		} else {
			setMappingXML(mapEPackages());

			boolean hasEAVMapping = false;
			for (PAnnotatedEPackage aPackage : getPaModel().getPaEPackages()) {
				for (PAnnotatedEClass aClass : aPackage.getPaEClasses()) {
					if (aClass.getEavMapping() != null) {
						hasEAVMapping = true;
						break;
					}
				}
			}
			if (hasEAVMapping) {
				try {
					if (getPersistenceOptions().getEAVMappingFile() != null) {
						final PersistenceFileProvider pfp = getExtensionManager()
								.getExtension(PersistenceFileProvider.class);
						final InputStream is = pfp.getFileContent(this
								.getClass(), getPersistenceOptions()
								.getEAVMappingFile());
						getConfiguration().addInputStream(processEAV(is));
						is.close();
					} else {
						final PersistenceFileProvider pfp = getExtensionManager()
								.getExtension(PersistenceFileProvider.class);
						final InputStream is = pfp.getFileContent(
								EAVGenericIDUserType.class, "eav.hbm.xml");
						getConfiguration().addInputStream(processEAV(is));
						is.close();
					}
				} catch (IOException e) {
					throw new IllegalStateException(e);
				}
			}
			
			// TODO replace this
			final StringBufferInputStream is = new StringBufferInputStream(
					getMappingXML());
			getConfiguration().addInputStream(is);
		}
	}

	protected InputStream processEAV(InputStream is) {
		return new StringBufferInputStream(processEAVMapping(is));
	}

	/** Build the session factory */
	protected EntityManagerFactory buildEntityManagerFactory() {
		final EntityManagerFactory emf = getConfiguration()
				.buildEntityManagerFactory();
		return new WrappedEntityManagerFactory(emf);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.hibernate.HbDataStore#close()
	 */
	@Override
	public void close() {
		if (isInitialized()) {
			if (getEntityManagerFactory().isOpen()) {
				getEntityManagerFactory().close();
			}
			entityManagerFactory = null;
			setInitialized(false);
			// this will call the close method again but because the
			// datastore
			// is not initialized anymore it won't get here
			HbHelper.INSTANCE.deRegisterDataStore(this);
		}
		ejb3Configuration = null;
	}

	/**
	 * Note: returns an instance of the {@link WrappedEntityManagerFactory}
	 * class.
	 */
	public EntityManagerFactory getEntityManagerFactory() {
		if (!isInitialized()) {
			initialize();
		}
		assert (entityManagerFactory != null);
		return entityManagerFactory;
	}

	/** Return a new session wrapper */
	@Override
	public SessionWrapper createSessionWrapper() {
		return new HbEntityManagerWrapper(this);
	}

	/**
	 * @return the ejbConfiguration
	 */
	public Ejb3Configuration getConfiguration() {
		if (ejb3Configuration == null) {
			ejb3Configuration = createConfiguration();
		}
		return ejb3Configuration;
	}

	public void setConfiguration(Ejb3Configuration configuration) {
		ejb3Configuration = configuration;
	}

	/**
	 * @return the hbConfiguration
	 */
	@Override
	public Configuration getHibernateConfiguration() {
		return getConfiguration().getHibernateConfiguration();
	}

	/** Return the Classmappings as an iterator */
	@Override
	public Iterator<?> getClassMappings() {
		return getConfiguration().getClassMappings();
	}

	/** Is added for interface compliance with HbDataStore, should not be used */
	@Override
	public SessionFactory getSessionFactory() {
		final EntityManagerFactoryImpl entityManagerFactoryImpl;
		if (getEntityManagerFactory() instanceof WrappedEntityManagerFactory) {
			entityManagerFactoryImpl = (EntityManagerFactoryImpl) ((WrappedEntityManagerFactory) getEntityManagerFactory())
					.getDelegate();
		} else {
			entityManagerFactoryImpl = (EntityManagerFactoryImpl) getEntityManagerFactory();
		}
		return entityManagerFactoryImpl.getSessionFactory();
	}

	/**
	 * Note: returns the {@link WrappedEntityManager} class.
	 */
	public EntityManager createEntityManager() {
		return getEntityManagerFactory().createEntityManager();
	}

	/**
	 * Note: returns the {@link WrappedEntityManager} class.
	 */
	@SuppressWarnings("rawtypes")
	public EntityManager createEntityManager(Map arg0) {
		return getEntityManagerFactory().createEntityManager(arg0);
	}

	public boolean isOpen() {
		return getEntityManagerFactory().isOpen();
	}

	public Cache getCache() {
		return getEntityManagerFactory().getCache();
	}

	public CriteriaBuilder getCriteriaBuilder() {
		return getEntityManagerFactory().getCriteriaBuilder();
	}

	public Metamodel getMetamodel() {
		return getEntityManagerFactory().getMetamodel();
	}

	public PersistenceUnitUtil getPersistenceUnitUtil() {
		return getEntityManagerFactory().getPersistenceUnitUtil();
	}

	public Map<String, Object> getProperties() {
		return getEntityManagerFactory().getProperties();
	}

	/**
	 * The HbEntityDataStore uses a wrapped entity manager factory and wrapped
	 * entity manager to work around an issue that the Hibernate entity manager/
	 * query implementation does not resolve query parameters of the EntityType
	 * correctly. It determines a wrong type. See the statement about this in
	 * the javadoc of the Hibernate {@link EntityType#getReturnedClass()}
	 * method.
	 * 
	 * To get to the original Hibernate entity manager use the
	 * {@link WrappedEntityManagerFactory#getDelegate()} method.
	 * 
	 * @author mtaal
	 */
	public class WrappedEntityManagerFactory implements EntityManagerFactory {
		private EntityManagerFactory delegate;

		public WrappedEntityManagerFactory(EntityManagerFactory emf) {
			delegate = emf;
		}

		public EntityManagerFactory getDelegate() {
			return delegate;
		}

		public void setDelegate(EntityManagerFactory delegate) {
			this.delegate = delegate;
		}

		public void close() {
			delegate.close();
		}

		public EntityManager createEntityManager() {
			EntityManager em = delegate.createEntityManager();
			return new WrappedEntityManager(em);
		}

		public EntityManager createEntityManager(
				@SuppressWarnings("rawtypes") Map map) {
			EntityManager em = delegate.createEntityManager(map);
			return new WrappedEntityManager(em);
		}

		public Cache getCache() {
			return delegate.getCache();
		}

		public CriteriaBuilder getCriteriaBuilder() {
			return delegate.getCriteriaBuilder();
		}

		public Metamodel getMetamodel() {
			return delegate.getMetamodel();
		}

		public PersistenceUnitUtil getPersistenceUnitUtil() {
			return delegate.getPersistenceUnitUtil();
		}

		public Map<String, Object> getProperties() {
			return delegate.getProperties();
		}

		public boolean isOpen() {
			return delegate.isOpen();
		}
	}

	/**
	 * See {@link WrappedEntityManagerFactory} for a description why this class
	 * is needed.
	 * 
	 * To get to the original Hibernate entity manager use the
	 * {@link WrappedEntityManager#getDelegateEntityManager()} method.
	 * 
	 * @author mtaal
	 * 
	 */
	public class WrappedEntityManager implements EntityManager {
		private EntityManager delegateEntityManager;

		public WrappedEntityManager(EntityManager em) {
			delegateEntityManager = em;
		}

		public void clear() {
			delegateEntityManager.clear();
		}

		public void close() {
			if (delegateEntityManager.isOpen()) {
				delegateEntityManager.close();
			}
		}

		public boolean contains(Object arg0) {
			return delegateEntityManager.contains(arg0);
		}

		@SuppressWarnings("unchecked")
		public <T> TypedQuery<T> createNamedQuery(String arg0, Class<T> arg1) {
			return (TypedQuery<T>) HbEntityDataStore.this
					.repairParameterJavaType((QueryImpl<?>) delegateEntityManager
							.createNamedQuery(arg0, arg1));
		}

		public Query createNamedQuery(String arg0) {
			return (Query) HbEntityDataStore.this
					.repairParameterJavaType((QueryImpl<?>) delegateEntityManager
							.createNamedQuery(arg0));
		}

		public Query createNativeQuery(String arg0,
				@SuppressWarnings("rawtypes") Class arg1) {
			return (Query) HbEntityDataStore.this
					.repairParameterJavaType((QueryImpl<?>) delegateEntityManager
							.createNativeQuery(arg0, arg1));
		}

		public Query createNativeQuery(String arg0, String arg1) {
			return (Query) HbEntityDataStore.this
					.repairParameterJavaType((QueryImpl<?>) delegateEntityManager
							.createNativeQuery(arg0, arg1));
		}

		public Query createNativeQuery(String arg0) {
			return (Query) HbEntityDataStore.this
					.repairParameterJavaType((QueryImpl<?>) delegateEntityManager
							.createNativeQuery(arg0));
		}

		@SuppressWarnings("unchecked")
		public <T> TypedQuery<T> createQuery(CriteriaQuery<T> arg0) {
			return (TypedQuery<T>) HbEntityDataStore.this
					.repairParameterJavaType((QueryImpl<?>) delegateEntityManager
							.createQuery(arg0));
		}

		@SuppressWarnings("unchecked")
		public <T> TypedQuery<T> createQuery(String arg0, Class<T> arg1) {
			return (TypedQuery<T>) HbEntityDataStore.this
					.repairParameterJavaType((QueryImpl<?>) delegateEntityManager
							.createQuery(arg0, arg1));
		}

		public Query createQuery(String arg0) {
			return (Query) HbEntityDataStore.this
					.repairParameterJavaType((QueryImpl<?>) delegateEntityManager
							.createQuery(arg0));
		}

		public void detach(Object arg0) {
			delegateEntityManager.detach(arg0);
		}

		public <T> T find(Class<T> arg0, Object arg1, LockModeType arg2,
				Map<String, Object> arg3) {
			return delegateEntityManager.find(arg0, arg1, arg2, arg3);
		}

		public <T> T find(Class<T> arg0, Object arg1, LockModeType arg2) {
			return delegateEntityManager.find(arg0, arg1, arg2);
		}

		public <T> T find(Class<T> arg0, Object arg1, Map<String, Object> arg2) {
			return delegateEntityManager.find(arg0, arg1, arg2);
		}

		public <T> T find(Class<T> arg0, Object arg1) {
			return delegateEntityManager.find(arg0, arg1);
		}

		public void flush() {
			delegateEntityManager.flush();
		}

		public CriteriaBuilder getCriteriaBuilder() {
			return delegateEntityManager.getCriteriaBuilder();
		}

		public Object getDelegate() {
			return delegateEntityManager.getDelegate();
		}

		public EntityManagerFactory getEntityManagerFactory() {
			return delegateEntityManager.getEntityManagerFactory();
		}

		public FlushModeType getFlushMode() {
			return delegateEntityManager.getFlushMode();
		}

		public LockModeType getLockMode(Object arg0) {
			return delegateEntityManager.getLockMode(arg0);
		}

		public Metamodel getMetamodel() {
			return delegateEntityManager.getMetamodel();
		}

		public Map<String, Object> getProperties() {
			return delegateEntityManager.getProperties();
		}

		public <T> T getReference(Class<T> arg0, Object arg1) {
			return delegateEntityManager.getReference(arg0, arg1);
		}

		public EntityTransaction getTransaction() {
			return delegateEntityManager.getTransaction();
		}

		public boolean isOpen() {
			return delegateEntityManager.isOpen();
		}

		public void joinTransaction() {
			delegateEntityManager.joinTransaction();
		}

		public void lock(Object arg0, LockModeType arg1,
				Map<String, Object> arg2) {
			delegateEntityManager.lock(arg0, arg1, arg2);
		}

		public void lock(Object arg0, LockModeType arg1) {
			delegateEntityManager.lock(arg0, arg1);
		}

		public <T> T merge(T arg0) {
			return delegateEntityManager.merge(arg0);
		}

		public void persist(Object arg0) {
			delegateEntityManager.persist(arg0);
		}

		public void refresh(Object arg0, LockModeType arg1,
				Map<String, Object> arg2) {
			delegateEntityManager.refresh(arg0, arg1, arg2);
		}

		public void refresh(Object arg0, LockModeType arg1) {
			delegateEntityManager.refresh(arg0, arg1);
		}

		public void refresh(Object arg0, Map<String, Object> arg1) {
			delegateEntityManager.refresh(arg0, arg1);
		}

		public void refresh(Object arg0) {
			delegateEntityManager.refresh(arg0);
		}

		public void remove(Object arg0) {
			delegateEntityManager.remove(arg0);
		}

		public void setFlushMode(FlushModeType arg0) {
			delegateEntityManager.setFlushMode(arg0);
		}

		public void setProperty(String arg0, Object arg1) {
			delegateEntityManager.setProperty(arg0, arg1);
		}

		public <T> T unwrap(Class<T> arg0) {
			return delegateEntityManager.unwrap(arg0);
		}

		public EntityManager getDelegateEntityManager() {
			return delegateEntityManager;
		}

		public void setDelegateEntityManager(EntityManager delegateEntityManager) {
			this.delegateEntityManager = delegateEntityManager;
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected QueryImpl<?> repairParameterJavaType(QueryImpl<?> query) {
		try {
			final Set<Parameter<?>> repairedParameters = new HashSet<Parameter<?>>();
			final Object parametersObject = getQueryParametersField()
					.get(query);
			final AbstractQueryImpl queryImpl = AbstractQueryImpl.class
					.cast(query.getHibernateQuery());
			for (Parameter<?> parameter : (Collection<Parameter>) parametersObject) {
				if (Map.class == parameter.getParameterType()) {
					final Type type;
					if (parameter.getName() != null) {
						// repair these ones
						final NamedParameterDescriptor descriptor = queryImpl
								.getParameterMetadata()
								.getNamedParameterDescriptor(
										parameter.getName());
						type = descriptor.getExpectedType();
					} else {
						type = queryImpl.getParameterMetadata()
								.getOrdinalParameterExpectedType(
										parameter.getPosition());
					}
					if (type instanceof EntityType) {
						final Parameter<?> param = new ParameterImpl(
								parameter.getName(), parameter.getPosition(),
								Object.class);
						repairedParameters.add(param);
						// final EntityType entityType = (EntityType) type;
						// final String entityName = entityType
						// .getAssociatedEntityName();
						// final EClass eClass = HbEntityDataStore.this
						// .getEntityNameStrategy().toEClass(entityName);

					} else {
						repairedParameters.add(parameter);
					}
				} else {
					repairedParameters.add(parameter);
				}
			}
			getQueryParametersField().set(query, repairedParameters);
			return query;
		} catch (Exception e) {
			throw new IllegalStateException(e);
		}
	}

	protected Field getQueryParametersField() throws Exception {
		if (queryParametersField != null) {
			return queryParametersField;
		}
		Field field = QueryImpl.class.getDeclaredField("parameters");
		field.setAccessible(true);
		return field;
	}

	@SuppressWarnings("rawtypes")
	private static class ParameterImpl implements Parameter {
		private String name;
		private Integer position;
		private Class<?> javaClass;

		ParameterImpl(String name, Integer position, Class<?> clz) {
			this.name = name;
			this.position = position;
			this.javaClass = clz;
		}

		public Class<?> getParameterType() {
			return javaClass;
		}

		public String getName() {
			return name;
		}

		public Integer getPosition() {
			return position;
		}
	}

}