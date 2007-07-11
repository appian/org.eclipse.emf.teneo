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
 * </copyright>
 *
 * $Id: HibernateDefaultAnnotator.java,v 1.1 2007/07/11 14:40:45 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.annotations;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.annotations.mapper.DefaultAnnotator;
import org.eclipse.emf.teneo.annotations.mapper.StoreMappingException;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEDataType;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;
import org.eclipse.emf.teneo.ecore.EModelResolver;
import org.eclipse.emf.teneo.hibernate.hbannotation.Cache;
import org.eclipse.emf.teneo.hibernate.hbannotation.CacheConcurrencyStrategy;
import org.eclipse.emf.teneo.hibernate.hbannotation.CollectionOfElements;
import org.eclipse.emf.teneo.hibernate.hbannotation.HbannotationFactory;
import org.eclipse.emf.teneo.hibernate.hbannotation.Index;
import org.eclipse.emf.teneo.hibernate.hbannotation.Parameter;
import org.eclipse.emf.teneo.hibernate.hbannotation.Proxy;
import org.eclipse.emf.teneo.hibernate.hbannotation.TypeDef;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEAttribute;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEClass;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEDataType;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEReference;
import org.eclipse.emf.teneo.hibernate.mapper.HbMapperConstants;
import org.eclipse.emf.teneo.util.EcoreDataTypes;
import org.hibernate.type.TypeFactory;

/**
 * This class simply understands not to create a OneToMany annotation when a CollectionOfElements
 * annotation is present. The collection of elements should be treated differently, TODO: add
 * support for collection of elements annotation.
 */
public class HibernateDefaultAnnotator extends DefaultAnnotator {

	/** The logger */
	protected static final Log log = LogFactory.getLog(HibernateDefaultAnnotator.class);

	/** The default cache strategy */
	private String defaultCacheStrategy = CacheConcurrencyStrategy.NONE.getName();

	/** Add the proxy annotation to each class */
	private boolean optionSetProxy = false;

	/** Add index to foreign key */
	private boolean optionAddIndexToForeignKey = false;

	/** Map the feature if it is volatile, default is false */
	@Override
	protected boolean mapVolitatileFeature() {
		return true;
	}

	/** Pick up default cache strategy and continue with the rest */
	@Override
	protected void setLocalOptions(PersistenceOptions po) {
		defaultCacheStrategy = po.getDefaultCacheStrategy();
		optionSetProxy = po.isSetProxy();
		optionAddIndexToForeignKey = po.isAddIndexForForeignKey();

		if (!po.isAlsoMapAsClass() && optionSetProxy) {
			log
				.warn("Option set proxy is used but the option fully classify entity names is not set to true, ignoring proxy setting");
			optionSetProxy = false;
		}
		super.setLocalOptions(po);
	}

	/** Adds a typedef annotation to this edatatype, if not already present */
	@Override
	protected void processEDataType(PAnnotatedEDataType ped) {
		final HbAnnotatedEDataType hed = (HbAnnotatedEDataType) ped;
		if (hed.getHbTypeDef() != null) {
			return; // already there do nothing
		}
		final String typeClass = getCustomDataType(ped.getAnnotatedEDataType());
		if (typeClass == null) {
			log.debug("Not creating typedef for edatatype: " + ped.getAnnotatedEDataType().getName() +
					" because it is natively handled by hibernate");
			return;
		}

		// create default typedef
		log.debug("Creating default typedef for edatatype " + hed.getAnnotatedEDataType().getName());
		final TypeDef typeDef = HbannotationFactory.eINSTANCE.createTypeDef();
		typeDef.setName(hed.getAnnotatedEDataType().getEPackage().getName() + "." +
				ped.getAnnotatedEDataType().getName());
		typeDef.setTypeClass(getDefaultUserType());
		// add default parameters
		final Parameter paramPackage = HbannotationFactory.eINSTANCE.createParameter();
		paramPackage.setName(HbMapperConstants.EPACKAGE_PARAM);
		paramPackage.setValue(hed.getAnnotatedEDataType().getEPackage().getNsURI());
		typeDef.getParameters().add(paramPackage);
		final Parameter edParam = HbannotationFactory.eINSTANCE.createParameter();
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
	 * Process one to many attribute. In case collection of elements was present use it to set
	 * target entity
	 */
	@Override
	protected void processOneToManyAttribute(PAnnotatedEAttribute aAttribute) {
		boolean isCollectionOfElements =
				(aAttribute instanceof HbAnnotatedEAttribute && null != ((HbAnnotatedEAttribute) aAttribute)
					.getHbCollectionOfElements());

		final HbAnnotatedEAttribute hea = (HbAnnotatedEAttribute) aAttribute;
		final HbAnnotatedEDataType hed =
				(HbAnnotatedEDataType) aAttribute.getPaModel().getPAnnotated(
					aAttribute.getAnnotatedEAttribute().getEAttributeType());
		if (isCollectionOfElements) {
			CollectionOfElements coe = ((HbAnnotatedEAttribute) aAttribute).getHbCollectionOfElements();
			if (coe.getTargetElement() == null) {
				coe.setTargetElement(getTargetTypeName(aAttribute));
			}
		} else if (hea.getHbType() != null && hea.getOneToMany() == null &&
				!aAttribute.getAnnotatedEAttribute().isMany()) {
			// assume this to be a single attribute, we can get here when
			// the instance is an array or list in that case the user type is
			// assumed
			// to be able to handle the complete list/collection
			super.processSingleAttribute(aAttribute);
		} else if (hed != null && hed.getHbTypeDef() != null && hea.getOneToMany() == null &&
				!aAttribute.getAnnotatedEAttribute().isMany()) {
			// assume this to be a single attribute, we can get here when
			// the instance is an array or list in that case the user type is
			// assumed
			// to be able to handle the complete list/collection
			super.processSingleAttribute(aAttribute);
		} else {
			super.processOneToManyAttribute(aAttribute);
		}
	}

	/** Returns the type name of a many attribute */
	@Override
	protected String getTargetTypeName(PAnnotatedEAttribute aAttribute) {
		final HbAnnotatedEDataType ped =
				(HbAnnotatedEDataType) aAttribute.getPaModel().getPAnnotated(
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
	@Override
	protected void processClass(PAnnotatedEClass aClass) {
		super.processClass(aClass);

		final HbAnnotatedEClass hbClass = (HbAnnotatedEClass) aClass;
		final EClass eclass = aClass.getAnnotatedEClass();
		final Class<?> concreteClass = EModelResolver.instance().getJavaClass(eclass);

		// automatically add the proxy annotation
		if (optionSetProxy && hbClass.getHbProxy() == null) {
			if (concreteClass != null) {
				final Proxy proxy = HbannotationFactory.eINSTANCE.createProxy();
				proxy.setLazy(true);
				// interface class is set below.
				((HbAnnotatedEClass) aClass).setHbProxy(proxy);
				log.debug("Set proxy to true (" + proxy.getProxyClass() + ") for eclass " +
						aClass.getAnnotatedEClass().getName());
			}
		}

		if (hbClass.getHbProxy() != null && concreteClass != null) {
			// todo add check that there is an impl class
			aClass.setOnlyMapAsEntity(false);

			// set interfacename if not set
			final Proxy proxy = hbClass.getHbProxy();
			final Class<?> interfaceClass = EModelResolver.instance().getJavaInterfaceClass(eclass);
			if (interfaceClass != null) {
				proxy.setProxyClass(interfaceClass.getName());
			} else { // set the class itself
				proxy.setProxyClass(concreteClass.getName());
			}
		}

		// now handle the case of defaultCacheStrategy which is different than
		// none
		boolean hasCache = ((HbAnnotatedEClass) aClass).getHbCache() != null;

		if (aClass.getPaSuperEntity() != null && hasCache) {
			log.warn("EClass: " + aClass.getAnnotatedEClass().getName() +
					" has a cache strategy defined while it has a superclass, this strategy is ignored.");
			return;
		}

		if (!hasCache && defaultCacheStrategy.compareToIgnoreCase(CacheConcurrencyStrategy.NONE.getName()) != 0) {
			final CacheConcurrencyStrategy ccs = CacheConcurrencyStrategy.getByName(defaultCacheStrategy);
			if (ccs == null) {
				throw new StoreMappingException("The default cache strategy: " + defaultCacheStrategy +
						" is not one of the allowed values (uppercase) " +
						"as defined in the JPA Hibernate Annotation Extensions.");
			}

			log
				.debug("Setting cache strategy " + defaultCacheStrategy + " on " +
						aClass.getAnnotatedEClass().getName());
			final Cache cache = HbannotationFactory.eINSTANCE.createCache();
			cache.setUsage(ccs);
			((HbAnnotatedEClass) aClass).setHbCache(cache);
		}
	}

	/**
	 * Ignored collection of elements on many reference, collection of elements should be handled by
	 * method above. Adds default caching if set.
	 */
	@Override
	protected void processOneToManyReference(PAnnotatedEReference aReference) {
		boolean isCollectionOfElements =
				(aReference instanceof HbAnnotatedEReference && null != ((HbAnnotatedEReference) aReference)
					.getHbCollectionOfElements());

		// add an idbag annotation
		if (persistenceOptions.alwaysMapListAsIdBag() && aReference.getAnnotatedEReference().isMany() &&
				aReference.getOneToMany() == null && !aReference.getAnnotatedEReference().isContainment()) {
			((HbAnnotatedEReference) aReference).setHbIdBag(HbannotationFactory.eINSTANCE.createIdBag());
			// add a join table
		}

		if (optionAddIndexToForeignKey) {
			setIndex(aReference);
		}

		if (!isCollectionOfElements) {
			super.processOneToManyReference(aReference);
		}

		// now handle the case of defaultCacheStrategy which is different than
		// none
		boolean hasCache = ((HbAnnotatedEReference) aReference).getHbCache() != null;
		if (!hasCache && defaultCacheStrategy.compareToIgnoreCase(CacheConcurrencyStrategy.NONE.getName()) != 0) {
			final CacheConcurrencyStrategy ccs = CacheConcurrencyStrategy.getByName(defaultCacheStrategy);
			if (ccs == null) {
				throw new StoreMappingException("The default cache strategy: " + defaultCacheStrategy +
						" is not one of the allowed values (uppercase) " +
						"as defined in the JPA Hibernate Annotation Extensions.");
			}

			log.debug("Setting cache strategy " + defaultCacheStrategy + " on " +
					aReference.getAnnotatedEReference().getName());
			final Cache cache = HbannotationFactory.eINSTANCE.createCache();
			cache.setUsage(ccs);
			((HbAnnotatedEReference) aReference).setHbCache(cache);
		}
	}

	/** Adds an index */
	private void setIndex(PAnnotatedEReference aReference) {
		final String indexName =
				getEntityName(aReference.getAnnotatedEReference().getEContainingClass()) + "_" +
						aReference.getAnnotatedEReference().getName();
		final HbAnnotatedEReference haReference = (HbAnnotatedEReference) aReference;
		if (haReference.getHbIndex() == null) {
			final Index index = HbannotationFactory.eINSTANCE.createIndex();
			index.setName(indexName);
			haReference.setHbIndex(index);
		} else {
			final Index index = haReference.getHbIndex();
			if (index.getName() != null && index.getName().length() > 0) {
				index.setName(index.getName() + ",");
			}
			index.setName(index.getName() + indexName);
		}
	}

	/**
	 * If the specified classifier represents a custom data type not handled natively by Hibernate,
	 * get the Java class name of the class used to represent the custom data type.
	 * 
	 * @param classifier
	 *            non-null classifier to inspect.
	 * @return Class name of the custom data type or null if the classifier does not represent a
	 *         custom data type that is not already handled by Hibernate.
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
			// If Hibernate natively handles the type then don't bother creating
			// a typedef.
			return null;
		}
		if (typeClassName != null) {
			final Class<?> instanceClass = eDataType.getInstanceClass();
			if (instanceClass != null && instanceClass.isArray()) {
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

	/** Set the super entity */
	@Override
	protected void setSuperEntity(PAnnotatedEClass aClass) {
		assert (aClass.getPaSuperEntity() == null);
		final EClass eclass = aClass.getAnnotatedEClass();
		if (eclass.getESuperTypes().size() == 0) {
			aClass.setPaSuperEntity(null);
			return;
		}

		PAnnotatedEClass superAClass = getPaSuperEntity(aClass, false);
		if (superAClass == null) {
			superAClass = getPaSuperEntity(aClass, true);
		}
		aClass.setPaSuperEntity(superAClass);
	}

	/** Compute the annotated superclass, ignore interfaces if parameterized */
	private PAnnotatedEClass getPaSuperEntity(PAnnotatedEClass aClass, boolean allowInterfaces) {
		final PAnnotatedModel model = aClass.getPaModel();
		for (EClass superEClass : aClass.getAnnotatedEClass().getESuperTypes()) {
			final PAnnotatedEClass x = model.getPAnnotated(superEClass);
			if (x.getEntity() != null && x.getMappedSuperclass() == null &&
					(allowInterfaces || !x.getAnnotatedEClass().isInterface())) {
				return x;
			}
		}
		return null;
	}

	/**
	 * Map Interface EClasses, default false, overridden by hibernate to return true
	 */
	@Override
	protected boolean mapInterfaceEClass() {
		return true;
	}

	/** Map a mapped superclass, this differs for jpox and hibernate */
	@Override
	protected boolean mapMappedSuperEClass() {
		return true;
	}

	@Override
	protected void processManyToOneReference(PAnnotatedEReference reference) {
		if (optionAddIndexToForeignKey) {
			setIndex(reference);
		}
		super.processManyToOneReference(reference);
	}

	@Override
	protected void processOneToOneReference(PAnnotatedEReference reference) {
		if (optionAddIndexToForeignKey) {
			setIndex(reference);
		}
		super.processOneToOneReference(reference);
	}

	@Override
	protected void processUnidirectionalManyToManyReference(PAnnotatedEReference reference) {
		if (optionAddIndexToForeignKey) {
			setIndex(reference);
		}
		super.processUnidirectionalManyToManyReference(reference);
	}
}