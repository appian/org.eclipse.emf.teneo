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
 *   Douglas Bitting
 * </copyright>
 *
 * $Id: HibernateDefaultAnnotator.java,v 1.5 2006/10/20 13:21:49 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbannotation.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.annotations.mapper.DefaultAnnotator;
import org.eclipse.emf.teneo.annotations.mapper.StoreMappingException;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.hibernate.hbannotation.Cache;
import org.eclipse.emf.teneo.hibernate.hbannotation.CacheConcurrencyStrategy;
import org.eclipse.emf.teneo.hibernate.hbannotation.CollectionOfElements;
import org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotationFactory;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEAttribute;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEClass;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEReference;

/**
 * This class simply understands not to create a OneToMany annotation when a CollectionOfElements
 * annotation is present. The collection of elements should be treated differently,
 * TODO: add support for collection of elements annotation.
 */
public class HibernateDefaultAnnotator extends DefaultAnnotator {

	/** The logger */
	protected static final Log log = LogFactory.getLog(HibernateDefaultAnnotator.class);

	/** The default cache strategy */
	private String defaultCacheStrategy = CacheConcurrencyStrategy.NONE_LITERAL.getName();
	
	/** Pick up default cache strategy and continue with the rest */
	protected void setLocalOptions(PersistenceOptions po) {
		defaultCacheStrategy = po.getDefaultCacheStrategy();
		super.setLocalOptions(po);
	}
	
	/** Process one to many attribute. In case collection of elements was present use it to 
	 * set target entity */
	protected void processOneToManyAttribute(PAnnotatedEAttribute aAttribute, boolean forceNullable) {
		boolean isCollectionOfElements = 
			(aAttribute instanceof HbAnnotatedEAttribute
					&& null != ((HbAnnotatedEAttribute) aAttribute).getHbCollectionOfElements());

		if (isCollectionOfElements) {
			CollectionOfElements coe = ((HbAnnotatedEAttribute) aAttribute).getHbCollectionOfElements();
			if (coe.getTargetElement() == null) {
				coe.setTargetElement(getTargetTypeName(aAttribute.getAnnotatedEAttribute()));
			}
		} else {
			super.processOneToManyAttribute(aAttribute, forceNullable);
		}
	}

	/** Handles addition of Cache if defaultCacheStrategy is set */

	protected void processClass(PAnnotatedEClass aClass) {
		super.processClass(aClass);
		
		// now do the cache
		
		// now handle the case of defaultCacheStrategy which is different than none
		boolean hasCache = ((HbAnnotatedEClass)aClass).getHbCache() != null;
		
		if (aClass.getPaSuperEntity() != null && hasCache) {
			log.warn("EClass: " + aClass.getAnnotatedEClass().getName() + " has a cache strategy defined while it has a superclass, this strategy is ignored.");
			return;
		}

		if (!hasCache && 
				defaultCacheStrategy.compareToIgnoreCase(CacheConcurrencyStrategy.NONE_LITERAL.getName()) != 0) {
			final CacheConcurrencyStrategy ccs = CacheConcurrencyStrategy.getByName(defaultCacheStrategy);
			if (ccs == null) {
				throw new StoreMappingException("The default cache strategy: " + 
						defaultCacheStrategy + " is not one of the allowed values (uppercase) " +
								"as defined in the JPA Hibernate Annotation Extensions.");
			}

			log.debug("Setting cache strategy " + defaultCacheStrategy + " on " + aClass.getAnnotatedEClass().getName());
			final Cache cache = HbAnnotationFactory.eINSTANCE.createCache();
			cache.setUsage(ccs);
			((HbAnnotatedEClass)aClass).setHbCache(cache);
		}
	}
	
	
	/** 
	 * Ignored collection of elements on many reference, collection of elements should be handled
	 * by method above.
	 * Adds default caching if set.
	 */
	protected void processOneToManyReference(PAnnotatedEReference aReference, boolean forceOptional) {
		boolean isCollectionOfElements = 
			(aReference instanceof HbAnnotatedEReference
					&& null != ((HbAnnotatedEReference) aReference).getHbCollectionOfElements());
		if (!isCollectionOfElements) {
			super.processOneToManyReference(aReference, forceOptional);
		}
		
		// now handle the case of defaultCacheStrategy which is different than none
		boolean hasCache = ((HbAnnotatedEReference)aReference).getHbCache() != null;
		if (!hasCache && 
				defaultCacheStrategy.compareToIgnoreCase(CacheConcurrencyStrategy.NONE_LITERAL.getName()) != 0) {
			final CacheConcurrencyStrategy ccs = CacheConcurrencyStrategy.getByName(defaultCacheStrategy);
			if (ccs == null) {
				throw new StoreMappingException("The default cache strategy: " + 
						defaultCacheStrategy + " is not one of the allowed values (uppercase) " +
								"as defined in the JPA Hibernate Annotation Extensions.");
			}

			log.debug("Setting cache strategy " + defaultCacheStrategy + " on " + aReference.getAnnotatedEReference().getName());
			final Cache cache = HbAnnotationFactory.eINSTANCE.createCache();
			cache.setUsage(ccs);
			((HbAnnotatedEReference)aReference).setHbCache(cache);
		}
	}
}
