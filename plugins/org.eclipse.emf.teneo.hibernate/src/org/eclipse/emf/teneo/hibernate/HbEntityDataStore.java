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
 * $Id: HbEntityDataStore.java,v 1.2 2007/03/21 20:40:41 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate;

import java.io.StringBufferInputStream;
import java.util.Iterator;
import java.util.Properties;

import javax.persistence.EntityManagerFactory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.teneo.ERuntime;
import org.eclipse.emf.teneo.util.StoreUtil;
import org.hibernate.Interceptor;
import org.hibernate.SessionFactory;
import org.hibernate.cache.HashtableCacheProvider;
import org.hibernate.cfg.Configuration;
import org.hibernate.ejb.Ejb3Configuration;

/**
 * Adds Hibernate Entitymanager behavior to the hbDataStore.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class HbEntityDataStore extends HbDataStore {

	/** The logger */
	private static Log log = LogFactory.getLog(HbEntityDataStore.class);

	/** The persistency manager factory */
	private EntityManagerFactory entityManagerFactory;

	/** The used Hibernate configuration */
	private Ejb3Configuration ejb3Configuration;

	/** Initializes this Data Store */
	public void initialize() {
		log.debug("Initializing EJB3 Hb Entity DataStore");
		// check a few things
		if (getEPackages() == null)
			throw new HbMapperException("EPackages are not set");
		// if (getName() == null)
		// throw new HbStoreException("Name is not set");

		log.debug(">>>>> Creating EJB3 Configuration");
		ejb3Configuration = createConfiguration();

		mapModel();
		
		setPropertiesInConfiguration();
		
		initializeDataStore();
		
		// wait for the session factory until the database is (re)created
		if (entityManagerFactory != null && entityManagerFactory.isOpen())
			entityManagerFactory.close();
		entityManagerFactory = buildEntityManagerFactory();

		// register ourselves
		HbHelper.INSTANCE.register(this);
		
		setInitialized(true);
	}

	/** Build the mappings in the configuration */
	protected void buildMappings() {
		getConfiguration().buildMappings();
	}

	/** Sets the interceptor */
	protected void setInterceptor() {
		final Interceptor interceptor = getHbContext().createInterceptor(
				getHibernateConfiguration(), getPersistenceOptions());
		getConfiguration().setInterceptor(interceptor);
		setInterceptor(interceptor);
	}

	/** Returns a new ejb3 configuration object */
	protected Ejb3Configuration createConfiguration() {
		return new Ejb3Configuration();
	}

	/** Sets the properties in the Hibernate Configuration. */
	protected void setPropertiesInConfiguration() {
		Properties properties = getHibernateProperties();
		if (properties != null) {
			if (properties.getProperty("hibernate.cache.provider_class") == null) {
				log.warn("No hibernate cache provider set, using "
						+ HashtableCacheProvider.class.getName());
				log
						.warn("For production use please set the ehcache (or other) provider explicitly and configure it");
				properties.setProperty("hibernate.cache.provider_class",
						HashtableCacheProvider.class.getName());
			}
			log.debug("Setting properties in Hibernate Configuration:");
			logProperties(properties);
			getConfiguration().setProperties(properties);
		}
	}

	/**
	 * Maps an ecore model of one ore more epackages into a hibernate xml String
	 * which is added to the passed configuration
	 */
	protected void mapModel() {
		if (getPersistenceOptions().isUseMappingFile()) {

			// register otherwise the getFileList will not work
			ERuntime.INSTANCE.register(getEPackages());

			log.debug("Searching hbm files in class paths of epackages");
			final String[] fileList = StoreUtil.getFileList(
					HbConstants.HBM_FILE_NAME, null);
			for (int i = 0; i < fileList.length; i++) {
				log.debug("Adding file " + fileList[i]
						+ " to Hibernate Configuration");
				getConfiguration().addInputStream(
						this.getClass().getResourceAsStream(fileList[i]));
			}
		} else {
			setMappingXML(mapEPackages());
			// TODO replace this
			final StringBufferInputStream is = new StringBufferInputStream(getMappingXML());
			getConfiguration().addInputStream(is);
		}
	}

	/** Build the session factory */
	protected EntityManagerFactory buildEntityManagerFactory() {
		return getConfiguration().createEntityManagerFactory();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.jpox.emf.IEMFDataStore#close()
	 */
	public void close() {
		if (getEntityManagerFactory().isOpen()) {
			getEntityManagerFactory().close();
		}
	}

	/** Get the session factory */
	public EntityManagerFactory getEntityManagerFactory() {
		if (!isInitialized()) {
			initialize();
		}
		assert (entityManagerFactory != null);
		return entityManagerFactory;
	}
	
	/** Return a new session wrapper */
	public SessionWrapper createSessionWrapper() {
		return new HbEntityManagerWrapper(this);
	}

	/**
	 * @return the ejbConfiguration
	 */
	public Ejb3Configuration getConfiguration() {
		return ejb3Configuration;
	}

	/**
	 * @return the hbConfiguration
	 */
	public Configuration getHibernateConfiguration() {
		return ejb3Configuration.getHibernateConfiguration();
	}

	/** Return the Classmappings as an iterator */
	protected Iterator<?> getClassMappings() {
		return getConfiguration().getClassMappings();
	}
	
	/** Is added for interface compliance with HbDataStore, should not be used */
	public SessionFactory getSessionFactory() {
		throw new UnsupportedOperationException("This method should not be called, use getEntityManagerFactory");
	}
}