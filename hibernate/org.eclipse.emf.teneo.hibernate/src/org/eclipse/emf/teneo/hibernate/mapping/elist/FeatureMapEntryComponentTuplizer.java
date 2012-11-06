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
 * $Id: FeatureMapEntryComponentTuplizer.java,v 1.3 2010/02/04 10:53:08 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.elist;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.teneo.Constants;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.eclipse.emf.teneo.hibernate.HbMapperException;
import org.eclipse.emf.teneo.hibernate.mapper.HbMapperConstants;
import org.eclipse.emf.teneo.hibernate.mapping.property.WildCardAttributePropertyHandler;
import org.eclipse.emf.teneo.hibernate.mapping.property.WildCardReferencePropertyHandler;
import org.eclipse.emf.teneo.util.StoreUtil;
import org.hibernate.mapping.Component;
import org.hibernate.mapping.MetaAttribute;
import org.hibernate.mapping.Property;
import org.hibernate.property.Getter;
import org.hibernate.property.PropertyAccessor;
import org.hibernate.property.Setter;
import org.hibernate.tuple.Instantiator;
import org.hibernate.tuple.component.AbstractComponentTuplizer;

/**
 * Tuplizer for feature map entries. These types are mapped using the dynamic capabilities of
 * Hibernate.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */

public class FeatureMapEntryComponentTuplizer extends AbstractComponentTuplizer {

	private static final long serialVersionUID = 1L;
	private static Log log = LogFactory.getLog(FeatureMapEntryComponentTuplizer.class);

	public FeatureMapEntryComponentTuplizer(Component component) {
		super(component);
	}

	protected Instantiator buildInstantiator(Component component) {
		return new FeatureMapEntryComponentInstantiator(component);
	}

	protected Getter buildGetter(Component component, Property prop) {
		return getPropertyAccessor(prop, component).getGetter(component.getComponentClass(),
				prop.getName());
	}

	protected Setter buildSetter(Component component, Property prop) {
		return getPropertyAccessor(prop, component).getSetter(component.getComponentClass(),
				prop.getName());
	}

	protected PropertyAccessor getPropertyAccessor(Property mappedProperty, Component component) {
		final HbDataStore hds = HbHelper.INSTANCE.getDataStore(component.getOwner());
		if (mappedProperty.getMetaAttribute(HbMapperConstants.VERSION_META) != null) {
			return hds.getHbContext().createVersionAccessor();
		} else if (mappedProperty.getName().compareToIgnoreCase(HbMapperConstants.PROPERTY_FEATURE) == 0) {
			return hds.getHbContext().createFeatureMapEntryFeatureURIAccessor();
		} else if (mappedProperty.getName().compareToIgnoreCase(HbMapperConstants.PROPERTY_MIXED_CDATA) == 0) {
			return hds.getHbContext().createFeatureMapEntryAccessor(Constants.CDATA);
		} else if (mappedProperty.getName().compareToIgnoreCase(
				HbMapperConstants.PROPERTY_MIXED_COMMENT) == 0) {
			return hds.getHbContext().createFeatureMapEntryAccessor(Constants.COMMENT);
		} else if (mappedProperty.getName().compareToIgnoreCase(HbMapperConstants.PROPERTY_MIXED_TEXT) == 0) {
			return hds.getHbContext().createFeatureMapEntryAccessor(Constants.TEXT);
		} else if (mappedProperty.getName().endsWith(HbMapperConstants.PROPERTY_ANY_PRIMITIVE)) {
			return hds.getExtensionManager().getExtension(WildCardAttributePropertyHandler.class);
		} else if (mappedProperty.getName().endsWith(HbMapperConstants.PROPERTY_ANY_REFERENCE)) {
			return hds.getExtensionManager().getExtension(WildCardReferencePropertyHandler.class);
		}

		final MetaAttribute ma = component.getMetaAttribute(HbMapperConstants.FEATUREMAP_META);
		final String eclassUri = ma.getValue();
		final EClass eClass = hds.toEClass(eclassUri);
		final EStructuralFeature efeature = StoreUtil.getEStructuralFeature(eClass,
				mappedProperty.getName());

		if (efeature == null) {
			throw new HbMapperException("Feature not found for property " + mappedProperty.getName());
		}

		if (log.isDebugEnabled()) {
			log.debug("Creating property accessor for " + mappedProperty.getName() + "/" + eclassUri
					+ "/" + efeature.getName());
		}

		return hds.getHbContext().createFeatureMapEntryAccessor(efeature);
	}

	@SuppressWarnings("rawtypes")
	public Class getMappedClass() {
		return HibernateFeatureMapEntry.class;
	}
}