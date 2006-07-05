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
 * $Id: EMFTuplizer.java,v 1.1 2006/07/05 22:29:30 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.tuplizer;

import java.io.Serializable;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.eclipse.emf.teneo.hibernate.HbStoreException;
import org.eclipse.emf.teneo.hibernate.HbUtil;
import org.eclipse.emf.teneo.hibernate.mapping.identifier.IdentifierCacheHandler;
import org.eclipse.emf.teneo.util.StoreUtil;
import org.hibernate.EntityMode;
import org.hibernate.HibernateException;
import org.hibernate.mapping.PersistentClass;
import org.hibernate.mapping.Property;
import org.hibernate.property.Getter;
import org.hibernate.property.PropertyAccessor;
import org.hibernate.property.Setter;
import org.hibernate.proxy.ProxyFactory;
import org.hibernate.tuple.AbstractEntityTuplizer;
import org.hibernate.tuple.EntityMetamodel;
import org.hibernate.tuple.Instantiator;

/**
 * Overrides the get and setidentifier methods to get the identifier from an internal cache instead of from the EMF object itself. The
 * same behavior for the getVersion methods. Also a specific object instantiator is used to make use of the emf efactories.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */

public class EMFTuplizer extends AbstractEntityTuplizer {

	/** The logger */
	private static Log log = LogFactory.getLog(EMFTuplizer.class);

	/** The entitymetamodel for which this is all done */
	private final EntityMetamodel theEntityMetamodel;

	/** Constructor */
	public EMFTuplizer(EntityMetamodel entityMetamodel, PersistentClass mappedEntity) {
		super(entityMetamodel, mappedEntity);
		theEntityMetamodel = entityMetamodel;
	}

	/**
	 * First checks the id cache and if not found uses the superclass.
	 */
	public Serializable getIdentifier(Object object) throws HibernateException {
		Serializable id = (Serializable) IdentifierCacheHandler.getID(object);
		if (id != null) return id;
		return super.getIdentifier(object);
	}

	/**
	 * Uses the identifiercache to get the version.
	 */
	public Object getVersion(Object object) throws HibernateException {
		final Object version = super.getVersion(object);
		if (version != null) return version;

		return IdentifierCacheHandler.getVersion(object);
	}

	/**
	 * Sets the identifier in the cache.
	 */
	public void setIdentifier(Object object, Serializable id) throws HibernateException {
		IdentifierCacheHandler.setID(object, id);
		super.setIdentifier(object, id);
	}

	/** Creates an EMF Instantiator */
	protected Instantiator buildInstantiator(PersistentClass persistentClass) {
		final HbDataStore ds = HbHelper.INSTANCE.getDataStore(persistentClass);
		final EClass eclass = StoreUtil.getEClassFromURI(persistentClass.getEntityName(), ds.getEPackages());
		if (eclass == null) {
			throw new HbStoreException("No eclass found for entityname: " + persistentClass.getEntityName());
		}
		return new EMFInstantiator(eclass, persistentClass);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.tuple.AbstractEntityTuplizer#buildPropertyGetter(org.hibernate.mapping.Property,
	 *      org.hibernate.mapping.PersistentClass)
	 */
	protected Getter buildPropertyGetter(Property mappedProperty, PersistentClass mappedEntity) {
		return getPropertyAccessor(mappedProperty, mappedEntity).getGetter(null, mappedProperty.getName());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.tuple.AbstractEntityTuplizer#buildPropertySetter(org.hibernate.mapping.Property,
	 *      org.hibernate.mapping.PersistentClass)
	 */
	protected Setter buildPropertySetter(Property mappedProperty, PersistentClass mappedEntity) {
		return getPropertyAccessor(mappedProperty, mappedEntity).getSetter(null, mappedProperty.getName());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.tuple.AbstractEntityTuplizer#buildProxyFactory(org.hibernate.mapping.PersistentClass,
	 *      org.hibernate.property.Getter, org.hibernate.property.Setter)
	 */
	protected ProxyFactory buildProxyFactory(PersistentClass mappingInfo, Getter idGetter, Setter idSetter) {

		return null;
		/*
		ProxyFactory pf = new MapProxyFactory();
		try {
			// TODO: design new lifecycle for ProxyFactory
			pf.postInstantiate(getEntityName(), null, null, null, null, null);
		} catch (HibernateException he) {
			log.warn("could not create proxy factory for:" + getEntityName(), he);
			pf = null;
		}
		return pf;
		*/
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.tuple.AbstractEntityTuplizer#getEntityMode()
	 */
	protected EntityMode getEntityMode() {
		return EntityMode.POJO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.tuple.EntityTuplizer#getConcreteProxyClass()
	 */
	public Class getConcreteProxyClass() {
		return EObject.class;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.tuple.EntityTuplizer#isInstrumented()
	 */
	public boolean isInstrumented() {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.tuple.Tuplizer#getMappedClass()
	 */
	public Class getMappedClass() {
		return EObject.class;
	}

	/** Returns the correct accessor on the basis of the type of property */
	protected PropertyAccessor getPropertyAccessor(Property mappedProperty, PersistentClass pc) {
		final HbDataStore ds = HbHelper.INSTANCE.getDataStore(pc);
		return HbUtil.getPropertyAccessor(mappedProperty, ds, pc.getEntityName());
	}
}