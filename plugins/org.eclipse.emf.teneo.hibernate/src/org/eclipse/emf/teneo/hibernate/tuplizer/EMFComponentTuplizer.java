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
 * $Id: EMFComponentTuplizer.java,v 1.2 2006/07/22 13:09:55 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.tuplizer;

import java.lang.reflect.Method;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.eclipse.emf.teneo.hibernate.HbStoreException;
import org.eclipse.emf.teneo.hibernate.HbUtil;
import org.eclipse.emf.teneo.util.StoreUtil;
import org.hibernate.engine.SessionFactoryImplementor;
import org.hibernate.mapping.Component;
import org.hibernate.mapping.Property;
import org.hibernate.property.Getter;
import org.hibernate.property.PropertyAccessor;
import org.hibernate.property.Setter;
import org.hibernate.tuple.AbstractComponentTuplizer;
import org.hibernate.tuple.Instantiator;

/**
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */

public class EMFComponentTuplizer extends AbstractComponentTuplizer {

	/** The logger */
//	private static Log log = LogFactory.getLog(EMFComponentTuplizer.class);

	/** Constructor */
	public EMFComponentTuplizer(Component component) {
		super(component);
	}

	/** Creates an EMF Instantiator */
	protected Instantiator buildInstantiator(Component component, Property property) {
		return buildInstantiator(component);
	}

	/** Creates an EMF Instantiator */
	protected Instantiator buildInstantiator(Component component) {
		final HbDataStore ds = HbHelper.INSTANCE.getDataStore(component);
		final EClass eclass = StoreUtil.getEClassFromURI(component.getComponentClassName(), ds.getEPackages());
		if (eclass == null) {
			throw new HbStoreException("No eclass found for entityname: " + component.getComponentClassName());
		}
		return new EMFInstantiator(eclass, component);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.tuple.AbstractEntityTuplizer#buildPropertyGetter(org.hibernate.mapping.Property,
	 *      org.hibernate.mapping.PersistentClass)
	 */
	protected Getter buildGetter(Component component, Property mappedProperty) {
		return getPropertyAccessor(mappedProperty, component).getGetter(null, mappedProperty.getName());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.tuple.AbstractEntityTuplizer#buildPropertySetter(org.hibernate.mapping.Property,
	 *      org.hibernate.mapping.PersistentClass)
	 */
	protected Setter buildSetter(Component component, Property mappedProperty) {
		return getPropertyAccessor(mappedProperty, component).getSetter(null, mappedProperty.getName());
	}

	/** Returns the correct accessor on the basis of the type of property */
	public static PropertyAccessor getPropertyAccessor(Property mappedProperty, Component comp) {
		final HbDataStore ds = HbHelper.INSTANCE.getDataStore(comp);
		return HbUtil.getPropertyAccessor(mappedProperty, ds, comp.getComponentClassName());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.tuple.Tuplizer#getMappedClass()
	 */
	public Class getMappedClass() {
		return EObject.class;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.tuple.ComponentTuplizer#getParent(java.lang.Object)
	 */
	public Object getParent(Object component) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.tuple.ComponentTuplizer#hasParentProperty()
	 */
	public boolean hasParentProperty() {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.tuple.ComponentTuplizer#isMethodOf(java.lang.reflect.Method)
	 */
	public boolean isMethodOf(Method method) {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.tuple.ComponentTuplizer#setParent(java.lang.Object, java.lang.Object,
	 *      org.hibernate.engine.SessionFactoryImplementor)
	 */
	public void setParent(Object component, Object parent, SessionFactoryImplementor factory) {
	}
}