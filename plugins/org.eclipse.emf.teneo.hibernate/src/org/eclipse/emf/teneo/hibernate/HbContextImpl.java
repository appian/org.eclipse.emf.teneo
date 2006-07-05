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
 * $Id: HbContextImpl.java,v 1.1 2006/07/05 22:29:30 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate;

import java.util.Properties;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.teneo.hibernate.mapping.econtainer.EContainerAccessor;
import org.eclipse.emf.teneo.hibernate.mapping.econtainer.EContainerFeatureIDAccessor;
import org.eclipse.emf.teneo.hibernate.mapping.elist.FeatureMapEntryTuplizer;
import org.eclipse.emf.teneo.hibernate.mapping.property.EAttributePropertyHandler;
import org.eclipse.emf.teneo.hibernate.mapping.property.EListPropertyHandler;
import org.eclipse.emf.teneo.hibernate.mapping.property.EReferencePropertyHandler;
import org.eclipse.emf.teneo.hibernate.mapping.property.FeatureMapEntryFeatureURIPropertyHandler;
import org.eclipse.emf.teneo.hibernate.mapping.property.FeatureMapEntryPropertyHandler;
import org.eclipse.emf.teneo.hibernate.mapping.property.FeatureMapPropertyHandler;
import org.eclipse.emf.teneo.hibernate.mapping.property.VersionPropertyHandler;
import org.eclipse.emf.teneo.hibernate.tuplizer.EMFComponentTuplizer;
import org.eclipse.emf.teneo.hibernate.tuplizer.EMFTuplizer;
import org.hibernate.Interceptor;
import org.hibernate.cfg.Configuration;
import org.hibernate.property.PropertyAccessor;

/**
 * The HbContext contains factory methods or configuration methods for different objects or other parameters used by the Hibernate EMF
 * layer. This class can be overridden to instantiate your own tuplizers, accessors etc.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class HbContextImpl implements HbContext {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.hibernate.HbContext#getEMFTuplizerClass(org.hibernate.cfg.Configuration)
	 */
	public Class getEMFTuplizerClass(Configuration hbConfiguration) {
		return EMFTuplizer.class;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.hibernate.HbContext#getEMFComponentTuplizerClass(org.hibernate.cfg.Configuration)
	 */
	public Class getEMFComponentTuplizerClass(Configuration hbConfiguration) {
		return EMFComponentTuplizer.class;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.hibernate.HbContext#getFeatureMapEntryTuplizer(org.hibernate.cfg.Configuration)
	 */
	public Class getFeatureMapEntryTuplizer(Configuration hbConfiguration) {
		return FeatureMapEntryTuplizer.class;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.hibernate.HbContext#createInterceptor(org.hibernate.cfg.Configuration)
	 */
	public Interceptor createInterceptor(Configuration hbConfiguration, Properties props) {
		return new EMFInterceptor(props);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.hibernate.HbContext#createFeatureMapEntryFeatureURIAccessor()
	 */
	public PropertyAccessor createFeatureMapEntryFeatureURIAccessor() {
		return new FeatureMapEntryFeatureURIPropertyHandler();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.hibernate.HbContext#createFeatureMapEntryAccessor(org.eclipse.emf.ecore.EStructuralFeature)
	 */
	public PropertyAccessor createFeatureMapEntryAccessor(EStructuralFeature feature) {
		return new FeatureMapEntryPropertyHandler(feature);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.hibernate.HbContext#createVersionAccessor()
	 */
	public PropertyAccessor createVersionAccessor() {
		return new VersionPropertyHandler();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.hibernate.HbContext#createEContainerAccessor()
	 */
	public PropertyAccessor createEContainerAccessor() {
		return new EContainerAccessor();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.hibernate.HbContext#createEContainerFeatureIDAccessor()
	 */
	public PropertyAccessor createEContainerFeatureIDAccessor() {
		return new EContainerFeatureIDAccessor();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.hibernate.HbContext#createFeatureMapPropertyAccessor(org.eclipse.emf.ecore.EStructuralFeature)
	 */
	public PropertyAccessor createFeatureMapPropertyAccessor(EStructuralFeature eFeature) {
		return new FeatureMapPropertyHandler(eFeature);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.hibernate.HbContext#createEListAccessor(org.eclipse.emf.ecore.EStructuralFeature)
	 */
	public PropertyAccessor createEListAccessor(EStructuralFeature eFeature) {
		return new EListPropertyHandler(eFeature);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.hibernate.HbContext#createEReferenceAccessor(org.eclipse.emf.ecore.EReference)
	 */
	public PropertyAccessor createEReferenceAccessor(EReference eReference) {
		return new EReferencePropertyHandler(eReference);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.hibernate.HbContext#createEAttributeAccessor(org.eclipse.emf.ecore.EAttribute)
	 */
	public PropertyAccessor createEAttributeAccessor(EAttribute eAttribute) {
		return new EAttributePropertyHandler(eAttribute);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.hibernate.HbContext#createConfiguration()
	 */
	public Configuration createConfiguration() {
		return new Configuration();
	}
}