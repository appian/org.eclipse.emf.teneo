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
 * $Id: HbBaseSessionDataStore.java,v 1.11 2010/11/11 10:28:18 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate;

import java.io.Serializable;
import java.sql.Connection;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.naming.NamingException;
import javax.naming.Reference;

import org.hibernate.Cache;
import org.hibernate.CustomEntityDirtinessStrategy;
import org.hibernate.HibernateException;
import org.hibernate.Interceptor;
import org.hibernate.MappingException;
import org.hibernate.Session;
import org.hibernate.SessionBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.SessionFactoryObserver;
import org.hibernate.StatelessSession;
import org.hibernate.StatelessSessionBuilder;
import org.hibernate.TypeHelper;
import org.hibernate.cache.spi.QueryCache;
import org.hibernate.cache.spi.Region;
import org.hibernate.cache.spi.UpdateTimestampsCache;
import org.hibernate.cfg.Settings;
import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.hibernate.dialect.Dialect;
import org.hibernate.dialect.function.SQLFunctionRegistry;
import org.hibernate.engine.ResultSetMappingDefinition;
import org.hibernate.engine.jdbc.spi.JdbcServices;
import org.hibernate.engine.jdbc.spi.SqlExceptionHelper;
import org.hibernate.engine.profile.FetchProfile;
import org.hibernate.engine.query.spi.QueryPlanCache;
import org.hibernate.engine.spi.FilterDefinition;
import org.hibernate.engine.spi.NamedQueryDefinition;
import org.hibernate.engine.spi.NamedSQLQueryDefinition;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.exception.spi.SQLExceptionConverter;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.id.factory.IdentifierGeneratorFactory;
import org.hibernate.internal.SessionFactoryImpl;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.metadata.CollectionMetadata;
import org.hibernate.persister.collection.CollectionPersister;
import org.hibernate.persister.entity.EntityPersister;
import org.hibernate.proxy.EntityNotFoundDelegate;
import org.hibernate.service.jdbc.connections.spi.ConnectionProvider;
import org.hibernate.service.spi.ServiceRegistryImplementor;
import org.hibernate.stat.Statistics;
import org.hibernate.stat.spi.StatisticsImplementor;
import org.hibernate.type.Type;
import org.hibernate.type.TypeResolver;

/**
 * Holds the sessionfactory related methods, makes the HbSessionDataStore better readable.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.11 $
 */
public abstract class HbBaseSessionDataStore extends HbDataStore implements SessionFactory,
		SessionFactoryImplementor {

	private static final long serialVersionUID = 1L;

	/** The persistency manager factory */
	private SessionFactory sessionFactory;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.hibernate.HbDataStore#close()
	 */
	@Override
	public void close() {
		if (isInitialized()) {
			closeSessionFactory();
			// this will call the close method again but because the
			// datastore
			// is not initialized anymore it won't get here
			HbHelper.INSTANCE.deRegisterDataStore(this);
		}
	}

	/**
	 * @return the sessionFactory
	 */
	@Override
	public SessionFactory getSessionFactory() {
		if (!isInitialized()) {
			initialize();
		}
		return sessionFactory;
	}

	// close session factory if set
	protected void closeSessionFactory() {
		if (sessionFactory != null && !sessionFactory.isClosed()) {
			sessionFactory.close();
			sessionFactory = null;
		}
		// do set initialized false after closing it
		setInitialized(false);
	}

	/**
	 * @param sessionFactory
	 *          the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public void evict(Class persistentClass, Serializable id) throws HibernateException {
		getSessionFactory().evict(persistentClass, id);
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public void evict(Class persistentClass) throws HibernateException {
		getSessionFactory().evict(persistentClass);
	}

	@SuppressWarnings({ "deprecation" })
	public void evictCollection(String roleName, Serializable id) throws HibernateException {
		getSessionFactory().evictCollection(roleName, id);
	}

	@SuppressWarnings({ "deprecation" })
	public void evictCollection(String roleName) throws HibernateException {
		getSessionFactory().evictCollection(roleName);
	}

	@SuppressWarnings({ "deprecation" })
	public void evictEntity(String entityName, Serializable id) throws HibernateException {
		getSessionFactory().evictEntity(entityName, id);
	}

	@SuppressWarnings({ "deprecation" })
	public void evictEntity(String entityName) throws HibernateException {
		getSessionFactory().evictEntity(entityName);
	}

	@SuppressWarnings({ "deprecation" })
	public void evictQueries() throws HibernateException {
		getSessionFactory().evictQueries();
	}

	@SuppressWarnings({ "deprecation" })
	public void evictQueries(String cacheRegion) throws HibernateException {
		getSessionFactory().evictQueries(cacheRegion);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Map getAllClassMetadata() throws HibernateException {
		return getSessionFactory().getAllClassMetadata();
	}

	@SuppressWarnings({ "rawtypes" })
	public Map getAllCollectionMetadata() throws HibernateException {
		return getSessionFactory().getAllCollectionMetadata();
	}

	@SuppressWarnings({ "rawtypes" })
	public ClassMetadata getClassMetadata(Class persistentClass) throws HibernateException {
		return getSessionFactory().getClassMetadata(persistentClass);
	}

	public ClassMetadata getClassMetadata(String entityName) throws HibernateException {
		return getSessionFactory().getClassMetadata(entityName);
	}

	public CollectionMetadata getCollectionMetadata(String roleName) throws HibernateException {
		return getSessionFactory().getCollectionMetadata(roleName);
	}

	public Session getCurrentSession() throws HibernateException {
		return getSessionFactory().getCurrentSession();
	}

	@SuppressWarnings("rawtypes")
	public Set getDefinedFilterNames() {
		return getSessionFactory().getDefinedFilterNames();
	}

	public FilterDefinition getFilterDefinition(String filterName) throws HibernateException {
		return getSessionFactory().getFilterDefinition(filterName);
	}

	public Reference getReference() throws NamingException {
		return getSessionFactory().getReference();
	}

	public Statistics getStatistics() {
		return getSessionFactory().getStatistics();
	}

	public boolean isClosed() {
		return getSessionFactory().isClosed();
	}

	public Session openSession() throws HibernateException {
		return getSessionFactory().openSession();
	}

	public Session openSession(Connection connection, Interceptor interceptor) {
		return ((SessionFactoryImpl) getSessionFactory()).withOptions().interceptor(interceptor)
				.connection(connection).openSession();
	}

	public Session openSession(Connection connection) {
		return ((SessionFactoryImpl) getSessionFactory()).withOptions().connection(connection)
				.openSession();
	}

	public Session openSession(Interceptor interceptor) throws HibernateException {
		return ((SessionFactoryImpl) getSessionFactory()).withOptions().interceptor(interceptor)
				.openSession();
	}

	public StatelessSession openStatelessSession() {
		return getSessionFactory().openStatelessSession();
	}

	public StatelessSession openStatelessSession(Connection connection) {
		return getSessionFactory().openStatelessSession(connection);
	}

	public SessionFactoryImplementor getSessionFactoryImplementor() {
		return (SessionFactoryImplementor) getSessionFactory();
	}

	public void addObserver(SessionFactoryObserver arg0) {
		getSessionFactoryImplementor().addObserver(arg0);
	}

	public boolean containsFetchProfileDefinition(String arg0) {
		return getSessionFactoryImplementor().containsFetchProfileDefinition(arg0);
	}

	@SuppressWarnings("rawtypes")
	public Map getAllSecondLevelCacheRegions() {
		return getSessionFactoryImplementor().getAllSecondLevelCacheRegions();
	}

	public Cache getCache() {
		return getSessionFactoryImplementor().getCache();
	}

	public CollectionPersister getCollectionPersister(String arg0) throws MappingException {
		return getSessionFactoryImplementor().getCollectionPersister(arg0);
	}

	public Set<String> getCollectionRolesByEntityParticipant(String arg0) {
		return getSessionFactoryImplementor().getCollectionRolesByEntityParticipant(arg0);
	}

	public ConnectionProvider getConnectionProvider() {
		return getSessionFactoryImplementor().getConnectionProvider();
	}

	public CurrentTenantIdentifierResolver getCurrentTenantIdentifierResolver() {
		return getSessionFactoryImplementor().getCurrentTenantIdentifierResolver();
	}

	public CustomEntityDirtinessStrategy getCustomEntityDirtinessStrategy() {
		return getSessionFactoryImplementor().getCustomEntityDirtinessStrategy();
	}

	public Dialect getDialect() {
		return getSessionFactoryImplementor().getDialect();
	}

	public EntityNotFoundDelegate getEntityNotFoundDelegate() {
		return getSessionFactoryImplementor().getEntityNotFoundDelegate();
	}

	public EntityPersister getEntityPersister(String arg0) throws MappingException {
		return getSessionFactoryImplementor().getEntityPersister(arg0);
	}

	public FetchProfile getFetchProfile(String arg0) {
		return getSessionFactoryImplementor().getFetchProfile(arg0);
	}

	public IdentifierGenerator getIdentifierGenerator(String arg0) {
		return getSessionFactoryImplementor().getIdentifierGenerator(arg0);
	}

	@Deprecated
	public IdentifierGeneratorFactory getIdentifierGeneratorFactory() {
		return getSessionFactoryImplementor().getIdentifierGeneratorFactory();
	}

	public String getIdentifierPropertyName(String arg0) throws MappingException {
		return getSessionFactoryImplementor().getIdentifierPropertyName(arg0);
	}

	public Type getIdentifierType(String arg0) throws MappingException {
		return getSessionFactoryImplementor().getIdentifierType(arg0);
	}

	public String[] getImplementors(String arg0) throws MappingException {
		return getSessionFactoryImplementor().getImplementors(arg0);
	}

	public String getImportedClassName(String arg0) {
		return getSessionFactoryImplementor().getImportedClassName(arg0);
	}

	public JdbcServices getJdbcServices() {
		return getSessionFactoryImplementor().getJdbcServices();
	}

	public NamedQueryDefinition getNamedQuery(String arg0) {
		return getSessionFactoryImplementor().getNamedQuery(arg0);
	}

	public NamedSQLQueryDefinition getNamedSQLQuery(String arg0) {
		return getSessionFactoryImplementor().getNamedSQLQuery(arg0);
	}

	public Region getNaturalIdCacheRegion(String arg0) {
		return getSessionFactoryImplementor().getNaturalIdCacheRegion(arg0);
	}

	public Properties getProperties() {
		return getSessionFactoryImplementor().getProperties();
	}

	public QueryCache getQueryCache() {
		return getSessionFactoryImplementor().getQueryCache();
	}

	public QueryCache getQueryCache(String arg0) throws HibernateException {
		return getSessionFactoryImplementor().getQueryCache(arg0);
	}

	public QueryPlanCache getQueryPlanCache() {
		return getSessionFactoryImplementor().getQueryPlanCache();
	}

	public Type getReferencedPropertyType(String arg0, String arg1) throws MappingException {
		return getSessionFactoryImplementor().getReferencedPropertyType(arg0, arg1);
	}

	public ResultSetMappingDefinition getResultSetMapping(String arg0) {
		return getSessionFactoryImplementor().getResultSetMapping(arg0);
	}

	public String[] getReturnAliases(String arg0) throws HibernateException {
		return getSessionFactoryImplementor().getReturnAliases(arg0);
	}

	public Type[] getReturnTypes(String arg0) throws HibernateException {
		return getSessionFactoryImplementor().getReturnTypes(arg0);
	}

	public SQLExceptionConverter getSQLExceptionConverter() {
		return getSessionFactoryImplementor().getSQLExceptionConverter();
	}

	public SqlExceptionHelper getSQLExceptionHelper() {
		return getSessionFactoryImplementor().getSQLExceptionHelper();
	}

	public Region getSecondLevelCacheRegion(String arg0) {
		return getSessionFactoryImplementor().getSecondLevelCacheRegion(arg0);
	}

	public ServiceRegistryImplementor getServiceRegistry() {
		return getSessionFactoryImplementor().getServiceRegistry();
	}

	public SessionFactoryOptions getSessionFactoryOptions() {
		return getSessionFactoryImplementor().getSessionFactoryOptions();
	}

	public Settings getSettings() {
		return getSessionFactoryImplementor().getSettings();
	}

	public SQLFunctionRegistry getSqlFunctionRegistry() {
		return getSessionFactoryImplementor().getSqlFunctionRegistry();
	}

	public StatisticsImplementor getStatisticsImplementor() {
		return getSessionFactoryImplementor().getStatisticsImplementor();
	}

	public TypeHelper getTypeHelper() {
		return getSessionFactoryImplementor().getTypeHelper();
	}

	public TypeResolver getTypeResolver() {
		return getSessionFactoryImplementor().getTypeResolver();
	}

	public UpdateTimestampsCache getUpdateTimestampsCache() {
		return getSessionFactoryImplementor().getUpdateTimestampsCache();
	}

	public Session openTemporarySession() throws HibernateException {
		return getSessionFactoryImplementor().openTemporarySession();
	}

	public SessionBuilder withOptions() {
		return getSessionFactoryImplementor().withOptions();
	}

	public StatelessSessionBuilder withStatelessOptions() {
		return getSessionFactoryImplementor().withStatelessOptions();
	}
}