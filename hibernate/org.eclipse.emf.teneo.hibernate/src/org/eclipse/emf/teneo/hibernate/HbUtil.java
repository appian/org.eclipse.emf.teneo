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
 * $Id: HbUtil.java,v 1.38 2010/11/12 14:39:12 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.teneo.Constants;
import org.eclipse.emf.teneo.ERuntime;
import org.eclipse.emf.teneo.PackageRegistryProvider;
import org.eclipse.emf.teneo.hibernate.mapper.HbMapperConstants;
import org.eclipse.emf.teneo.hibernate.mapping.econtainer.NewEContainerFeatureIDPropertyHandler;
import org.eclipse.emf.teneo.hibernate.mapping.identifier.IdentifierCacheHandler;
import org.eclipse.emf.teneo.hibernate.mapping.identifier.IdentifierPropertyHandler;
import org.eclipse.emf.teneo.hibernate.mapping.identifier.IdentifierUtil;
import org.eclipse.emf.teneo.hibernate.mapping.property.EAttributePropertyHandler;
import org.eclipse.emf.teneo.hibernate.mapping.property.EReferencePropertyHandler;
import org.eclipse.emf.teneo.hibernate.mapping.property.SyntheticPropertyHandler;
import org.eclipse.emf.teneo.util.StoreUtil;
import org.hibernate.Session;
import org.hibernate.cfg.Environment;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.mapping.Collection;
import org.hibernate.mapping.Component;
import org.hibernate.mapping.MetaAttribute;
import org.hibernate.mapping.PersistentClass;
import org.hibernate.mapping.Property;
import org.hibernate.persister.entity.EntityPersister;
import org.hibernate.property.EmbeddedPropertyAccessor;
import org.hibernate.property.PropertyAccessor;
import org.hibernate.proxy.HibernateProxy;
import org.hibernate.type.IdentifierType;
import org.hibernate.type.PrimitiveType;
import org.hibernate.type.StringType;
import org.hibernate.type.Type;

/**
 * Contains some utility methods.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.38 $
 */
public class HbUtil {

	/** The logger */
	private static Log log = LogFactory.getLog(HbUtil.class);

	public static EClass getEClassFromMeta(Component component) {
		final MetaAttribute ePackageMetaAttribute = component
				.getMetaAttribute(HbMapperConstants.EPACKAGE_PARAM);
		if (ePackageMetaAttribute == null) {
			return null;
		}
		final EPackage epackage = PackageRegistryProvider.getInstance()
				.getPackageRegistry()
				.getEPackage(ePackageMetaAttribute.getValue());
		if (epackage == null) {
			throw new IllegalArgumentException(
					"Could not find ePackage using nsuri "
							+ ePackageMetaAttribute.getValue());
		}
		final MetaAttribute eClassMetaAttribute = component
				.getMetaAttribute(HbMapperConstants.ECLASS_NAME_META);
		if (eClassMetaAttribute == null) {
			return null;
		}
		return (EClass) epackage.getEClassifier(eClassMetaAttribute.getValue());
	}

	/**
	 * A merge method which does not use Session.merge but uses the EMF api to
	 * travers object references and execute merge through the object tree. The
	 * merge will traverse all EReferences. The maximum level it will traverse
	 * is passed in as the maxMergeLevel parameters.
	 * 
	 * @param session
	 *            the hibernate session
	 * @param eObject
	 *            the eObject to merge
	 * @return the object read from the database with Merge support.
	 */
	public static EObject merge(Session session, EObject eObject,
			int maxMergeLevel) {
		SessionImplementor sessionImplementor = (SessionImplementor) session;
		return merge(sessionImplementor, eObject,
				new HashMap<EObject, EObject>(), maxMergeLevel, 0);
	}

	private static EObject merge(SessionImplementor sessionImplementor,
			EObject eObject, Map<EObject, EObject> copyCache,
			int maxMergeLevel, int currentMergeLevel) {
		if (copyCache.containsKey(eObject)) {
			return copyCache.get(eObject);
		}
		final String entityName = sessionImplementor.guessEntityName(eObject);
		final EntityPersister persister = sessionImplementor
				.getEntityPersister(entityName, eObject);
		final Serializable id = persister.getIdentifier(eObject,
				sessionImplementor);
		if (id != null) {
			final EObject source = (EObject) ((Session) sessionImplementor)
					.get(entityName, id);
			copyCache.put(eObject, source);
			if (maxMergeLevel == currentMergeLevel) {
				return source;
			}
			// now copy the features
			for (EStructuralFeature eFeature : source.eClass()
					.getEAllStructuralFeatures()) {
				if (eFeature instanceof EAttribute) {
					source.eSet(eFeature, eObject.eGet(eFeature));
				} else if (eFeature.isMany()) {
					final List<EObject> newValues = new ArrayList<EObject>();
					@SuppressWarnings("unchecked")
					final List<EObject> currentValues = (List<EObject>) eObject
							.eGet(eFeature);
					for (EObject currentValue : currentValues) {
						newValues
								.add(merge(sessionImplementor, currentValue,
										copyCache, maxMergeLevel,
										currentMergeLevel + 1));
					}
					source.eSet(eFeature, newValues);
				} else {
					source.eSet(
							eFeature,
							merge(sessionImplementor,
									(EObject) eObject.eGet(eFeature),
									copyCache, maxMergeLevel,
									currentMergeLevel + 1));
				}
			}
			return source;
		} else {
			return eObject;
		}
	}

	public static boolean isEAVMapped(PersistentClass mappedEntity) {
		if (mappedEntity.getEntityName() != null
				&& mappedEntity.getEntityName().equals(
						Constants.EAV_EOBJECT_ENTITY_NAME)) {
			return true;
		}
		if (mappedEntity.getSuperclass() == null) {
			return false;
		}
		return isEAVMapped(mappedEntity.getSuperclass());
	}

	/** Encode the id of an eobject */
	@SuppressWarnings("unchecked")
	public static String idToString(EObject eobj, HbDataStore hd, Session session) {
		final PersistentClass pc = hd.getPersistentClass(hd
				.getEntityNameStrategy().toEntityName(eobj.eClass()));
		if (pc == null) { // can happen with map entries
			return null;
		}
		Object id;
		if (eobj instanceof HibernateProxy) {
			id = ((HibernateProxy) eobj).getHibernateLazyInitializer()
					.getIdentifier();
		} else {
			id = IdentifierUtil.getID(eobj, hd, (SessionImplementor)session);
		}
		if (id == null) {
			id = IdentifierCacheHandler.getInstance().getID(eobj);
			if (id == null) {
				return null;
			}
		}
		final Type t = pc.getIdentifierProperty().getType();
		if (t instanceof PrimitiveType) {
			return ((PrimitiveType<Object>) t).toString(id);
		} else if (t instanceof StringType) {
			return (String) id;
		}
		return null;
	}

	/** Encode the id of an eobject */
	@SuppressWarnings("unchecked")
	public static Object stringToId(EClass eclass, HbDataStore hd, String id) {
		try {
			final PersistentClass pc = hd.getPersistentClass(hd
					.getEntityNameStrategy().toEntityName(eclass));
			final Type t = pc.getIdentifierProperty().getType();
			if (t instanceof IdentifierType) {
				return ((IdentifierType<Object>) t).stringToObject(id);
			} else if (t instanceof StringType) {
				return id;
			}
			return null;
		} catch (Exception e) {
			throw new HbStoreException("Exception while converting id: " + id
					+ " of eclass " + eclass.getName());
		}
	}

	/** Returns the correct accessor on the basis of the type of property */
	public static PropertyAccessor getPropertyAccessor(Property mappedProperty,
			HbDataStore ds, String entityName, EClass mappedEClass) {
		if (mappedProperty
				.getMetaAttribute(HbConstants.SYNTHETIC_PROPERTY_INDICATOR) != null) { // synthetic
			return new SyntheticPropertyHandler(mappedProperty.getName());
		} else if (mappedProperty.getMetaAttribute(HbMapperConstants.ID_META) != null) { // synthetic
			// ID
			return new IdentifierPropertyHandler();
		} else if (mappedProperty
				.getMetaAttribute(HbMapperConstants.VERSION_META) != null) {
			return ds.getHbContext().createVersionAccessor();
		} else if (mappedProperty.getName().compareToIgnoreCase(
				"_identifierMapper") == 0) { // name
			// is
			// used
			// by
			// hb
			return new EmbeddedPropertyAccessor(); // new
			// DummyPropertyHandler();
		} else if (mappedProperty.getName().compareToIgnoreCase(
				HbConstants.PROPERTY_ECONTAINER) == 0) {
			return ds.getHbContext().createEContainerAccessor();
		} else if (mappedProperty.getName().compareToIgnoreCase(
				HbConstants.PROPERTY_ECONTAINER_FEATURE_NAME) == 0) {
			return ds.getExtensionManager().getExtension(
					NewEContainerFeatureIDPropertyHandler.class);
		} else if (mappedProperty.getName().compareToIgnoreCase(
				HbConstants.PROPERTY_ECONTAINER_FEATURE_ID) == 0) {
			return ds.getHbContext().createEContainerFeatureIDAccessor();
		}

		EClass eClass = null;
		if (mappedEClass != null) {
			eClass = mappedEClass;
		} else {
			eClass = ds.getEntityNameStrategy().toEClass(entityName);
			if (eClass == null) {
				// for components this is the case
				eClass = ERuntime.INSTANCE.getEClass(entityName);
			}
		}
		final EStructuralFeature efeature = StoreUtil.getEStructuralFeature(
				eClass, mappedProperty.getName());

		if (efeature == null) {
			throw new HbMapperException(
					"Feature not found for eclass/entity/property "
							+ eClass.getName() + "/" + entityName + "/"
							+ mappedProperty.getName());
		}

		if (log.isDebugEnabled()) {
			log.debug("Creating property accessor for " + mappedProperty.getName()
				+ "/" + entityName + "/" + efeature.getName());
		}

		// check extra lazy
		final boolean extraLazy = mappedProperty.getValue() instanceof Collection
				&& ((Collection) mappedProperty.getValue()).isExtraLazy();

		if (FeatureMapUtil.isFeatureMap(efeature)) {
			return ds.getHbContext().createFeatureMapPropertyAccessor(efeature);
		} else if (efeature instanceof EReference) {
			final EReference eref = (EReference) efeature;
			if (eref.isMany()) {
				return ds.getHbContext().createEListAccessor(efeature,
						extraLazy,
						ds.getPersistenceOptions().isMapEMapAsTrueMap());
			} else {
				PropertyAccessor erefPropertyHandler = ds.getHbContext()
						.createEReferenceAccessor(eref);
				if (erefPropertyHandler instanceof EReferencePropertyHandler) {
					if (mappedProperty.getPersistentClass() != null) {
						((EReferencePropertyHandler) erefPropertyHandler)
								.setId(mappedProperty == mappedProperty
										.getPersistentClass()
										.getIdentifierProperty());
					}
				}
				return erefPropertyHandler;
			}
		} else {
			final EAttribute eattr = (EAttribute) efeature;
			if (eattr.isMany()) {
				return ds.getHbContext().createEListAccessor(efeature,
						extraLazy,
						ds.getPersistenceOptions().isMapEMapAsTrueMap());
			} else {
				// note also array types are going here!
				final PropertyAccessor pa = ds.getHbContext()
						.createEAttributeAccessor(eattr);
				// note this check is necessary because maybe somebody override
				// HBContext.createEAttributeAccessor
				// to not return a EAttributePropertyHandler
				if (pa instanceof EAttributePropertyHandler) {
					final EAttributePropertyHandler eAttributePropertyHandler = (EAttributePropertyHandler) pa;
					eAttributePropertyHandler.setPersistenceOptions(ds
							.getPersistenceOptions());
					if (mappedProperty.getPersistentClass() != null) {
						eAttributePropertyHandler
								.setId(mappedProperty == mappedProperty
										.getPersistentClass()
										.getIdentifierProperty());
					}
				}
				return pa;
			}
		}
	}

	/** Returns the meta class uri, if not found then null is returned */
	public static String getEClassNameFromFeatureMapMeta(PersistentClass pc) {
		MetaAttribute ma = pc
				.getMetaAttribute(HbMapperConstants.FEATUREMAP_META);
		if (ma == null) {
			return null;
		}
		return ma.getValue();
	}

	/**
	 * Returns the structural feature, handles the case of structural features
	 * which are part of a feature map entry. public static EStructuralFeature
	 * getFeature(PersistentClass pc, String propName, EPackage[] epacks) {
	 * final MetaAttribute ma = pc.getMetaAttribute("eclass"); // TODO:
	 * externalize final String eclassName; if (ma != null) { eclassName =
	 * ma.getValue(); } else { eclassName = pc.getEntityName(); } return
	 * StoreUtil.getEStructuralFeature(eclassName, propName, epacks); }
	 */

	/**
	 * Creates and registers an emf data store using a set of generic store
	 * properties
	 */
	public static HbDataStore getCreateDataStore(Properties props) {
		final String name = props.getProperty(Constants.PROP_NAME);
		HbDataStore eds = HbHelper.INSTANCE.getDataStore(name);
		if (eds != null) {
			return eds;
		}

		final Properties hbProps = new Properties();
		hbProps.putAll(props);
		hbProps.put(Environment.USER,
				doTrim(props.getProperty(Constants.PROP_DB_USER)));
		hbProps.put(Environment.PASS,
				doTrim(props.getProperty(Constants.PROP_DB_PWD)));
		hbProps.put(Environment.DRIVER,
				doTrim(props.getProperty(Constants.PROP_DB_DRIVER)));
		hbProps.put(Environment.URL,
				doTrim(props.getProperty(Constants.PROP_DB_URL)));
		hbProps.put(Environment.DIALECT,
				doTrim(props.getProperty(Constants.PROP_DB_DIALECT)));

		EPackage[] epacks = StoreUtil.getEPackages(doTrim(props
				.getProperty(Constants.PROP_EPACKAGE_NSURI)));

		// create a EMF Data Store, this is retrieved later again
		eds = HbHelper.INSTANCE.createRegisterDataStore(name);
		eds.setDataStoreProperties(hbProps);
		eds.setEPackages(epacks);
		eds.initialize();
		return eds;
	}

	/** Convenience method */
	private static String doTrim(String totrim) {
		if (totrim == null) {
			return null;
		}
		return totrim.trim();
	}

}