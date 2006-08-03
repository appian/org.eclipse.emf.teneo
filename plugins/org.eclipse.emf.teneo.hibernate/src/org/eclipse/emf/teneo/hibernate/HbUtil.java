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
 * $Id: HbUtil.java,v 1.3 2006/08/03 09:58:19 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate;

import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.teneo.Constants;
import org.eclipse.emf.teneo.hibernate.mapper.HbMapperConstants;
import org.eclipse.emf.teneo.hibernate.mapping.identifier.IdentifierPropertyHandler;
import org.eclipse.emf.teneo.util.StoreUtil;
import org.hibernate.cfg.Environment;
import org.hibernate.mapping.Collection;
import org.hibernate.mapping.MetaAttribute;
import org.hibernate.mapping.PersistentClass;
import org.hibernate.mapping.Property;
import org.hibernate.property.EmbeddedPropertyAccessor;
import org.hibernate.property.PropertyAccessor;

/**
 * Contains some utility methods.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class HbUtil {

	/** The logger */
	private static Log log = LogFactory.getLog(HbUtil.class);

	/** Returns the correct accessor on the basis of the type of property */
	public static PropertyAccessor getPropertyAccessor(Property mappedProperty, HbDataStore ds, String entityName) {
		final String versionPropName = ds.getPersistenceOptions().getVersionColumnName();
		final String idPropName = ds.getPersistenceOptions().getIdColumnName();
		
		if (mappedProperty.getName().compareToIgnoreCase(idPropName) == 0) {
			return new IdentifierPropertyHandler();			
		} else if (mappedProperty.getName().compareToIgnoreCase(versionPropName) == 0) {
			return ds.getHbContext().createVersionAccessor();
		} else if (mappedProperty.getName().compareToIgnoreCase("_identifierMapper") == 0) { // name is used by hb
			return new EmbeddedPropertyAccessor(); // new DummyPropertyHandler();
		} else if (mappedProperty.getName().compareToIgnoreCase(HbConstants.PROPERTY_ECONTAINER) == 0) {
			return ds.getHbContext().createEContainerAccessor();
		} else if (mappedProperty.getName().compareToIgnoreCase(HbConstants.PROPERTY_ECONTAINER_FEATURE_ID) == 0) {
			return ds.getHbContext().createEContainerFeatureIDAccessor();
		}

		final EStructuralFeature efeature = StoreUtil.getEStructuralFeature(entityName, mappedProperty.getName(), ds.getEPackages());

		if (efeature == null) {
			throw new HbStoreException("Feature not found for entity/property " + entityName + "/" + mappedProperty.getName());
		}

		log.debug("Creating property accessor for " + mappedProperty.getName() + "/" + entityName + "/" + efeature.getName());

		// check extra lazy
		final boolean extraLazy = mappedProperty.getValue() instanceof Collection &&
			((Collection)mappedProperty.getValue()).isExtraLazy();
		
		if (FeatureMapUtil.isFeatureMap(efeature)) {
			return ds.getHbContext().createFeatureMapPropertyAccessor(efeature);
		} else if (efeature instanceof EReference) {
			final EReference eref = (EReference) efeature;
			if (eref.isMany()) {
				return ds.getHbContext().createEListAccessor(efeature, extraLazy);
			} else {
				return ds.getHbContext().createEReferenceAccessor(eref);
			}
		} else {
			final EAttribute eattr = (EAttribute) efeature;
			if (eattr.isMany()) {
				return ds.getHbContext().createEListAccessor(efeature, extraLazy);
			} else {
				return ds.getHbContext().createEAttributeAccessor(eattr);
			}
		}
	}

	/** Returns the meta class uri, if not found then null is returned */
	public static String getEClassNameFromMeta(PersistentClass pc) {
		final MetaAttribute ma = pc.getMetaAttribute(HbMapperConstants.ECLASS_META);
		if (ma == null) return null;
		return ma.getValue();
	}

	/**
	 * Returns the structural feature, handles the case of structural features which are part of a feature map entry.
	 */
	public static EStructuralFeature getFeature(PersistentClass pc, String propName, EPackage[] epacks) {
		final MetaAttribute ma = pc.getMetaAttribute("eclass"); // TODO: externalize
		final String eclassName;
		if (ma != null) {
			eclassName = ma.getValue();
		} else {
			eclassName = pc.getEntityName();
		}
		return StoreUtil.getEStructuralFeature(eclassName, propName, epacks);
	}

	/** Creates and registers an emf data store using a set of generic store properties */
	public static HbDataStore getCreateDataStore(Properties props) {
		final String name = props.getProperty(Constants.PROP_NAME);
		HbDataStore eds = HbHelper.INSTANCE.getDataStore(name);
		if (eds != null) return eds;

		final Properties hbProps = new Properties();
		hbProps.put(Environment.USER, doTrim(props.getProperty(Constants.PROP_DB_USER)));
		hbProps.put(Environment.PASS, doTrim(props.getProperty(Constants.PROP_DB_PWD)));
		hbProps.put(Environment.DRIVER, doTrim(props.getProperty(Constants.PROP_DB_DRIVER)));
		hbProps.put(Environment.URL, doTrim(props.getProperty(Constants.PROP_DB_URL)));
		hbProps.put(Environment.DIALECT, doTrim(props.getProperty(Constants.PROP_DB_DIALECT)));

		EPackage[] epacks = StoreUtil.getEPackages(doTrim(props.getProperty(Constants.PROP_EPACKAGE_NSURI)));

		// create a EMF Data Store, this is retrieved later again
		eds = HbHelper.INSTANCE.createRegisterDataStore(name);
		eds.setPersistenceProperties(hbProps);
		eds.setHibernateProperties(hbProps);
		eds.setEPackages(epacks);
		eds.initialize();
		return eds;
	}

	/** Convenience method */
	private static String doTrim(String totrim) {
		if (totrim == null) return null;
		return totrim.trim();
	}
}