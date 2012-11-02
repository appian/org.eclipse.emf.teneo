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
 * $Id: HbSessionDataStore.java,v 1.32 2011/07/05 05:09:41 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.teneo.PackageRegistryProvider;
import org.eclipse.emf.teneo.annotations.mapper.PersistenceFileProvider;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage;
import org.eclipse.emf.teneo.hibernate.auditing.AuditProcessHandler;
import org.eclipse.emf.teneo.hibernate.mapper.MappingUtil;
import org.eclipse.emf.teneo.hibernate.mapping.EMFInitializeCollectionEventListener;
import org.eclipse.emf.teneo.hibernate.mapping.eav.EAVGenericIDUserType;
import org.hibernate.Cache;
import org.hibernate.Interceptor;
import org.hibernate.SessionBuilder;
import org.hibernate.StatelessSessionBuilder;
import org.hibernate.TypeHelper;
import org.hibernate.cfg.Configuration;
import org.hibernate.event.service.spi.EventListenerRegistry;
import org.hibernate.event.spi.EventType;
import org.hibernate.internal.SessionFactoryImpl;
import org.hibernate.service.ServiceRegistry;

/**
 * Holds the SessionFactory and performs different initialization related actions. Initializes the
 * database and offers xml import and export methods. In addition can be used to retrieve all
 * referers to a certain eobject.
 * <p>
 * The behavior can be overridden by overriding the protected methods and implementing/registering
 * your own HbDataStoreFactory in the HibernateHelper.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.32 $
 */

@SuppressWarnings("unchecked")
public class HbSessionDataStore extends HbBaseSessionDataStore {

	private static final long serialVersionUID = 1L;

	/** The logger */
	private static Log log = LogFactory.getLog(HbSessionDataStore.class);

	/** The used Hibernate configuration */
	private Configuration hbConfiguration;

	@Override
	public void close() {
		super.close();
		hbConfiguration = null;
	}

	/** Initializes this Data Store */
	@Override
	public void initialize() {

		// start with a fresh one
		setAuditHandler(null);

		if (hbConfiguration != null && isResetConfigurationOnInitialization()) {
			hbConfiguration = null;
		}

		MappingUtil.registerHbExtensions(getExtensionManager());

		PackageRegistryProvider.getInstance().setThreadPackageRegistry(getPackageRegistry());

		try {
			if (log.isDebugEnabled()) {
				log.debug("Initializing Hb Session DataStore");
			}

			// check a few things
			if (getEPackages() == null) {
				throw new HbMapperException("EPackages are not set");
				// if (getName() == null)
				// throw new HbStoreException("Name is not set");
			}

			// reset interceptor
			setInterceptor(null);

			if (log.isDebugEnabled()) {
				log.debug(">>>>> Creating HB Configuration");
			}

			getConfiguration();

			mapModel();

			setPropertiesInConfiguration();

			initializeDataStore();

			// will close the current sessionfactory if it was set
			closeSessionFactory();

			buildSessionFactory();

			setInitialized(true);

			setEventListeners();
		} finally {
			PackageRegistryProvider.getInstance().setThreadPackageRegistry(null);
		}
	}

	/** Set the event listener, can be overridden */
	@Override
	protected void setEventListeners() {
		final EMFInitializeCollectionEventListener initializeCollectionEventListener = getExtensionManager()
				.getExtension(EMFInitializeCollectionEventListener.class);
		final ServiceRegistry serviceRegistry = ((SessionFactoryImpl) getSessionFactory())
				.getServiceRegistry();
		final EventListenerRegistry eventListenerRegistry = serviceRegistry
				.getService(EventListenerRegistry.class);
		eventListenerRegistry.appendListeners(EventType.INIT_COLLECTION,
				initializeCollectionEventListener);

		if (isAuditing()) {
			final AuditProcessHandler auditProcessHandler = getExtensionManager().getExtension(
					AuditProcessHandler.class);
			auditProcessHandler.setDataStore(this);
			eventListenerRegistry.appendListeners(EventType.POST_DELETE, auditProcessHandler);
			eventListenerRegistry.appendListeners(EventType.POST_INSERT, auditProcessHandler);
			eventListenerRegistry.appendListeners(EventType.POST_UPDATE, auditProcessHandler);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.hibernate.HbContext#createConfiguration()
	 */
	protected Configuration createConfiguration() {
		return new Configuration();
	}

	/** Return the Classmappings as an iterator */
	@Override
	public Iterator<?> getClassMappings() {
		return getConfiguration().getClassMappings();
	}

	/** Build the mappings in the configuration */
	@Override
	protected void buildMappings() {
		getConfiguration().buildMappings();
	}

	/** Sets the interceptor */
	@Override
	protected void setInterceptor() {
		if (getInterceptor() != null) { // probably overridden
			return;
		}
		final Interceptor interceptor = getHbContext().createInterceptor(getHibernateConfiguration(),
				getEntityNameStrategy());
		getConfiguration().setInterceptor(interceptor);
		setInterceptor(interceptor);
	}

	/** Sets the properties in the Hibernate Configuration. */
	protected void setPropertiesInConfiguration() {
		Properties properties = getDataStoreProperties();
		if (properties != null) {
			setDefaultProperties(properties);
			getConfiguration().addProperties(properties);
		}
	}

	/**
	 * Maps an ecore model of one ore more epackages into a hibernate xml String which is added to the
	 * passed configuration
	 */
	protected void mapModel() {

		if (getPersistenceOptions().getMappingFilePath() != null
				|| getPersistenceOptions().isUseMappingFile()) {
			final String[] fileList = getMappingFileList();
			for (String element : fileList) {
				if (log.isDebugEnabled()) {
					log.debug("Adding file " + element + " to Hibernate Configuration");
				}
				final PersistenceFileProvider pfp = getExtensionManager().getExtension(
						PersistenceFileProvider.class);
				final InputStream is = pfp.getFileContent(this.getClass(), element);
				if (is == null) {
					throw new HbStoreException("Path to mapping file: " + element + " does not exist!");
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
						final PersistenceFileProvider pfp = getExtensionManager().getExtension(
								PersistenceFileProvider.class);
						final InputStream is = pfp.getFileContent(this.getClass(), getPersistenceOptions()
								.getEAVMappingFile());
						getConfiguration().addXML(processEAVMapping(is));
						is.close();
					} else {
						final PersistenceFileProvider pfp = getExtensionManager().getExtension(
								PersistenceFileProvider.class);
						final InputStream is = pfp.getFileContent(EAVGenericIDUserType.class, "eav.hbm.xml");
						getConfiguration().addXML(processEAVMapping(is));
						is.close();
					}
				} catch (IOException e) {
					throw new IllegalStateException(e);
				}
			}

			// System.err.println(getMappingXML());

			getConfiguration().addXML(getMappingXML());
		}
	}

	/** Build the session factory */
	@SuppressWarnings("deprecation")
	protected void buildSessionFactory() {
		setSessionFactory(getConfiguration().buildSessionFactory());
	}

	/** Return a new session wrapper */
	@Override
	public SessionWrapper createSessionWrapper() {
		return new HbSessionWrapper(this);
	}

	/**
	 * @return the hbConfiguration
	 */
	public Configuration getConfiguration() {
		if (hbConfiguration == null) {
			hbConfiguration = createConfiguration();
		}
		return hbConfiguration;
	}

	public void setConfiguration(Configuration configuration) {
		hbConfiguration = configuration;
	}

	/**
	 * @return the hbConfiguration
	 */
	@Override
	public Configuration getHibernateConfiguration() {
		return getConfiguration();
	}

	public boolean containsFetchProfileDefinition(String arg0) {
		return getSessionFactory().containsFetchProfileDefinition(arg0);
	}

	public Cache getCache() {
		return getSessionFactory().getCache();
	}

	public TypeHelper getTypeHelper() {
		return getSessionFactory().getTypeHelper();
	}

	public SessionFactoryOptions getSessionFactoryOptions() {
		return getSessionFactory().getSessionFactoryOptions();
	}

	public SessionBuilder withOptions() {
		return getSessionFactory().withOptions();
	}

	public StatelessSessionBuilder withStatelessOptions() {
		return getSessionFactory().withStatelessOptions();
	}
}