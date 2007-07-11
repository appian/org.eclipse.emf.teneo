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
 * $Id: HbContext.java,v 1.7 2007/07/11 14:40:54 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.teneo.mapping.strategy.EntityNameStrategy;
import org.hibernate.Interceptor;
import org.hibernate.cfg.Configuration;
import org.hibernate.property.PropertyAccessor;

/**
 * The HbContext contains factory methods or configuration methods for different objects or other
 * parameters used by the Hibernate EMF layer. This class can be overridden to instantiate your own
 * tuplizers, accessors etc.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.7 $
 */
public interface HbContext {

	/** Return the Tuplizer class used by the Hibernate EMF layer */
	public abstract Class<?> getEMFTuplizerClass(Configuration hbConfiguration);

	/** Return the Tuplizer class used by the Hibernate EMF layer for Components */
	public abstract Class<?> getEMFComponentTuplizerClass(Configuration hbConfiguration);

	/** Returns the Tuplizer used for featuremap entries */
	public abstract Class<?> getFeatureMapEntryTuplizer(Configuration hbConfiguration);

	/** Return the Interceptor class used */
	public abstract Interceptor createInterceptor(Configuration hbConfiguration, EntityNameStrategy ens);

	/**
	 * Return the accessor used to acces the string repr. of the feature in the featuremapentry
	 */
	public abstract PropertyAccessor createFeatureMapEntryFeatureURIAccessor();

	/** Return the accessor used to acces the features of a feature map */
	public abstract PropertyAccessor createFeatureMapEntryAccessor(EStructuralFeature feature);

	/** Return the accessor used to acces version props */
	public abstract PropertyAccessor createVersionAccessor();

	/** Return the accessor for the econtainer fields */
	public abstract PropertyAccessor createEContainerAccessor();

	/** Return the econtainer feature id accessor */
	public abstract PropertyAccessor createEContainerFeatureIDAccessor();

	/** Return the featuremap accessor */
	public abstract PropertyAccessor createFeatureMapPropertyAccessor(EStructuralFeature eFeature);

	/** Return the elist accessor */
	public abstract PropertyAccessor createEListAccessor(EStructuralFeature eFeature, boolean extraLazy,
			boolean newEMapMapping);

	/** Return the EReference accessor */
	public abstract PropertyAccessor createEReferenceAccessor(EReference eReference);

	/** Return the general EFeatureAccessor */
	public abstract PropertyAccessor createEAttributeAccessor(EAttribute eAttribute);
}