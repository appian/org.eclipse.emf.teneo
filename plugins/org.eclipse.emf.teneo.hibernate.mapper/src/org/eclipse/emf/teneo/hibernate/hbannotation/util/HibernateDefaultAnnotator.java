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
 *   Douglas Bitting
 *   Michael Kanaley, TIBCO Software Inc., custom type handling
 * </copyright>
 *
 * $Id: HibernateDefaultAnnotator.java,v 1.5 2007/02/28 11:55:11 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbannotation.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.annotations.mapper.DefaultAnnotator;
import org.eclipse.emf.teneo.annotations.mapper.StoreMappingException;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEDataType;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.hibernate.hbannotation.Cache;
import org.eclipse.emf.teneo.hibernate.hbannotation.CacheConcurrencyStrategy;
import org.eclipse.emf.teneo.hibernate.hbannotation.CollectionOfElements;
import org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotationFactory;
import org.eclipse.emf.teneo.hibernate.hbannotation.Parameter;
import org.eclipse.emf.teneo.hibernate.hbannotation.TypeDef;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEAttribute;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEClass;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEDataType;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEReference;
import org.eclipse.emf.teneo.hibernate.mapper.HbMapperConstants;
import org.eclipse.emf.teneo.util.EcoreDataTypes;
import org.hibernate.type.TypeFactory;

/**
 * This class simply understands not to create a OneToMany annotation when a CollectionOfElements annotation is present.
 * The collection of elements should be treated differently, TODO: add support for collection of elements annotation.
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

	/** Adds a typedef annotation to this edatatype, if not already present */
	protected void processEDataType(PAnnotatedEDataType ped) {
		final HbAnnotatedEDataType hed = (HbAnnotatedEDataType) ped;
		if (hed.getHbTypeDef() != null) {
			return; // already there do nothing
		}
		final String typeClass = getCustomDataType(ped.getAnnotatedEDataType());
		if (typeClass == null) {
			log.debug("Not creating typedef for edatatype: " + ped.getAnnotatedEDataType().getName()
					+ " because it is natively handled by hibernate");
			return;
		}

		// create default typedef
		log.debug("Creating default typedef for edatatype " + hed.getAnnotatedEDataType().getName());
		final TypeDef typeDef = HbAnnotationFactory.eINSTANCE.createTypeDef();
		typeDef.setName(hed.getAnnotatedEDataType().getEPackage().getName() + "."
				+ ped.getAnnotatedEDataType().getName());
		typeDef.setTypeClass(getDefaultUserType());
		// add default parameters
		final Parameter paramPackage = HbAnnotationFactory.eINSTANCE.createParameter();
		paramPackage.setName(HbMapperConstants.EPACKAGE_PARAM);
		paramPackage.setValue(hed.getAnnotatedEDataType().getEPackage().getNsURI());
		typeDef.getParameters().add(paramPackage);
		final Parameter edParam = HbAnnotationFactory.eINSTANCE.createParameter();
		edParam.setName(HbMapperConstants.EDATATYPE_PARAM);
		edParam.setValue(hed.getAnnotatedEDataType().getName());
		typeDef.getParameters().add(edParam);
		hed.setHbTypeDef(typeDef);
	}

	/** Return the default user type */
	public String getDefaultUserType() {
		return "org.eclipse.emf.teneo.hibernate.mapping.DefaultToStringUserType";
	}

	/**
	 * Process one to many attribute. In case collection of elements was present use it to set target entity
	 */
	protected void processOneToManyAttribute(PAnnotatedEAttribute aAttribute, boolean forceNullable) {
		boolean isCollectionOfElements = (aAttribute instanceof HbAnnotatedEAttribute && null != ((HbAnnotatedEAttribute) aAttribute)
				.getHbCollectionOfElements());

		final HbAnnotatedEAttribute hea = (HbAnnotatedEAttribute) aAttribute;
		final HbAnnotatedEDataType hed = (HbAnnotatedEDataType) aAttribute.getPaModel().getPAnnotated(
				aAttribute.getAnnotatedEAttribute().getEAttributeType());
		if (isCollectionOfElements) {
			CollectionOfElements coe = ((HbAnnotatedEAttribute) aAttribute).getHbCollectionOfElements();
			if (coe.getTargetElement() == null) {
				coe.setTargetElement(getTargetTypeName(aAttribute));
			}
		} else if (hea.getHbType() != null && hea.getOneToMany() == null
				&& !aAttribute.getAnnotatedEAttribute().isMany()) {
			// assume this to be a single attribute, we can get here when
			// the instance is an array or list in that case the user type is assumed
			// to be able to handle the complete list/collection
			super.processSingleAttribute(aAttribute, forceNullable);
		} else if (hed != null && hed.getHbTypeDef() != null && hea.getOneToMany() == null
				&& !aAttribute.getAnnotatedEAttribute().isMany()) {
			// assume this to be a single attribute, we can get here when
			// the instance is an array or list in that case the user type is assumed
			// to be able to handle the complete list/collection
			super.processSingleAttribute(aAttribute, forceNullable);
		} else {
			super.processOneToManyAttribute(aAttribute, forceNullable);
		}
	}

	/** Returns the type name of a many attribute */
	protected String getTargetTypeName(PAnnotatedEAttribute aAttribute) {
		final HbAnnotatedEDataType ped = (HbAnnotatedEDataType) aAttribute.getPaModel().getPAnnotated(
				aAttribute.getAnnotatedEAttribute().getEAttributeType());
		if (ped != null && ped.getHbTypeDef() != null) {
			return ped.getHbTypeDef().getName();
		}
		if (((HbAnnotatedEAttribute) aAttribute).getHbType() != null) {
			return ((HbAnnotatedEAttribute) aAttribute).getHbType().getType();
		}
		return super.getTargetTypeName(aAttribute);
	}

	/** Handles addition of Cache if defaultCacheStrategy is set */

	protected void processClass(PAnnotatedEClass aClass) {
		super.processClass(aClass);

		// now handle the case of defaultCacheStrategy which is different than none
		boolean hasCache = ((HbAnnotatedEClass) aClass).getHbCache() != null;

		if (aClass.getPaSuperEntity() != null && hasCache) {
			log.warn("EClass: " + aClass.getAnnotatedEClass().getName()
					+ " has a cache strategy defined while it has a superclass, this strategy is ignored.");
			return;
		}

		if (!hasCache && defaultCacheStrategy.compareToIgnoreCase(CacheConcurrencyStrategy.NONE_LITERAL.getName()) != 0) {
			final CacheConcurrencyStrategy ccs = CacheConcurrencyStrategy.getByName(defaultCacheStrategy);
			if (ccs == null) {
				throw new StoreMappingException("The default cache strategy: " + defaultCacheStrategy
						+ " is not one of the allowed values (uppercase) "
						+ "as defined in the JPA Hibernate Annotation Extensions.");
			}

			log
					.debug("Setting cache strategy " + defaultCacheStrategy + " on "
							+ aClass.getAnnotatedEClass().getName());
			final Cache cache = HbAnnotationFactory.eINSTANCE.createCache();
			cache.setUsage(ccs);
			((HbAnnotatedEClass) aClass).setHbCache(cache);
		}
	}

	/**
	 * Ignored collection of elements on many reference, collection of elements should be handled by method above. Adds
	 * default caching if set.
	 */
	protected void processOneToManyReference(PAnnotatedEReference aReference, boolean forceOptional) {
		boolean isCollectionOfElements = (aReference instanceof HbAnnotatedEReference && null != ((HbAnnotatedEReference) aReference)
				.getHbCollectionOfElements());
		if (!isCollectionOfElements) {
			super.processOneToManyReference(aReference, forceOptional);
		}

		// now handle the case of defaultCacheStrategy which is different than none
		boolean hasCache = ((HbAnnotatedEReference) aReference).getHbCache() != null;
		if (!hasCache && defaultCacheStrategy.compareToIgnoreCase(CacheConcurrencyStrategy.NONE_LITERAL.getName()) != 0) {
			final CacheConcurrencyStrategy ccs = CacheConcurrencyStrategy.getByName(defaultCacheStrategy);
			if (ccs == null) {
				throw new StoreMappingException("The default cache strategy: " + defaultCacheStrategy
						+ " is not one of the allowed values (uppercase) "
						+ "as defined in the JPA Hibernate Annotation Extensions.");
			}

			log.debug("Setting cache strategy " + defaultCacheStrategy + " on "
					+ aReference.getAnnotatedEReference().getName());
			final Cache cache = HbAnnotationFactory.eINSTANCE.createCache();
			cache.setUsage(ccs);
			((HbAnnotatedEReference) aReference).setHbCache(cache);
		}
	}

	/**
	 * If the specified classifier represents a custom data type not handled natively by Hibernate, get the Java class
	 * name of the class used to represent the custom data type.
	 * 
	 * @param classifier
	 *            non-null classifier to inspect.
	 * @return Class name of the custom data type or null if the classifier does not represent a custom data type that
	 *         is not already handled by Hibernate.
	 */
	private String getCustomDataType(EDataType eDataType) {
		final String typeClassName = eDataType.getInstanceClassName();
		if (EcoreDataTypes.INSTANCE.isSimpleType(eDataType)) {
			return null;
		} else if (EcoreDataTypes.INSTANCE.isEnum(eDataType)) {
			return null;
		} else if (eDataType.getInstanceClass() == Object.class) {
			return null;
		} else if (typeClassName != null && TypeFactory.basic(typeClassName) != null) {
			// If Hibernate natively handles the type then don't bother creating a typedef.
			return null;
		}
		if (typeClassName != null) {
			final Class<?> instanceClass = eDataType.getInstanceClass();
			if (instanceClass.isArray()) {
				// get rid of the [] at the end
				final String primType = typeClassName.substring(0, typeClassName.length() - 2);
				// check if hb supports it
				// no dots is primitve
				if (TypeFactory.basic(primType) != null) {
					return null; // if so let hb do it
				}
			}
		}

		return typeClassName;
	}
}