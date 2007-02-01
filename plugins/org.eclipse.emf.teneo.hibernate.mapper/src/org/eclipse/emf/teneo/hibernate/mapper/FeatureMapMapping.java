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
 *   Davide Marchignoli
 * </copyright>
 *
 * $Id: FeatureMapMapping.java,v 1.5 2007/02/01 12:35:55 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapper;

import java.util.Iterator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pannotation.Transient;
import org.eclipse.emf.teneo.simpledom.Element;
import org.eclipse.emf.teneo.util.StoreUtil;

/**
 * The feature map mapping handles the mapping of a feature map feature, this includes group and mixed types. It is
 * created for each feature map feature during the mapping of the features of an entity. At the end of the entity
 * processing the feature map mapping instances are used to create a hibernate specific mapping and add it to the
 * resulting document.
 * 
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
class FeatureMapMapping {

	/** Log it here */
	private static final Log log = LogFactory.getLog(FeatureMapMapping.class);

	/** The annotated feature which is a feature map */
	private final PAnnotatedEAttribute paAttribute;

	/** The mapping context */
	private final MappingContext hbmContext;

	/**
	 * @param hbmContext
	 *            The context in which the mapping takes place
	 */
	public FeatureMapMapping(MappingContext hbmContext, PAnnotatedEAttribute paAttribute) {
		log.debug("Created featuremap mapping instance for " + paAttribute);
		this.hbmContext = hbmContext;
		this.paAttribute = paAttribute;
		final EAttribute eattr = paAttribute.getAnnotatedEAttribute();
		assert (FeatureMapUtil.isFeatureMap(eattr));
	}

	/** Returns the entityName */
	public String getEntityName() {
		return StoreUtil.getEntityName(paAttribute.getAnnotatedEAttribute());
	}

	/** Processes the features of this featuremap entry */
	public void process() {
		final String entityName = StoreUtil.getEntityName(paAttribute.getAnnotatedEAttribute());
		log.debug("Processing feature map feature: " + entityName);
		Element mainElement = hbmContext.getCurrent().addElement("class").addAttribute("entity-name", entityName)
				.addAttribute("lazy", "false").addAttribute("table", hbmContext.trunc(entityName.toUpperCase(), false));

		mainElement.addElement("meta").addAttribute("attribute", HbMapperConstants.FEATUREMAP_META).addText(
				hbmContext.getEClassNameStrategy().toUniqueName(paAttribute.getAnnotatedEAttribute().getEContainingClass()));

		final FeatureMapper fp = hbmContext.getFeatureMapper();
		hbmContext.setCurrent(mainElement);
		hbmContext.setCurrentElementFeatureMap(true);

		// TODO: check if id of parent can be used instead
		mainElement.addElement("id").addAttribute("type", "long").addElement("generator").addAttribute("class",
				"native");

		mainElement.addElement("version").addAttribute("name", hbmContext.getVersionColumnName()).addAttribute(
				"access", "org.eclipse.emf.teneo.hibernate.mapping.property.VersionPropertyHandler");

		mainElement.addElement("property").addAttribute("name", HbMapperConstants.PROPERTY_FEATURE).addAttribute(
				"type", "java.lang.String");

		// and now process the features of this group
		final PAnnotatedEClass paClass = paAttribute.getPaEClass();
		final boolean isMixed = StoreUtil.isMixed(paAttribute.getAnnotatedEAttribute());
		for (Iterator it = paClass.getPaEStructuralFeatures().iterator(); it.hasNext();) {
			PAnnotatedEStructuralFeature paFeature = (PAnnotatedEStructuralFeature) it.next();
			EStructuralFeature eFeature = paFeature.getAnnotatedEStructuralFeature();
			if ((isMixed && eFeature.getFeatureID() != paAttribute.getAnnotatedEAttribute().getFeatureID())
					|| StoreUtil.isElementOfGroup(eFeature, paAttribute.getAnnotatedEAttribute())) {
				log.debug("Feature " + StoreUtil.toString(eFeature) + " belongs to this featuremap");
				// temporarily remove the transient otherwise the feature is not processed
				Transient tt = paFeature.getTransient();
				paFeature.setTransient(null);
				fp.process(paFeature);
				paFeature.setTransient(tt);
			}
		}

		if (isMixed) {
			mainElement.addElement("property").addAttribute("name", HbMapperConstants.PROPERTY_MIXED_TEXT)
					.addAttribute("type", "java.lang.String");
			mainElement.addElement("property").addAttribute("name", HbMapperConstants.PROPERTY_MIXED_CDATA)
					.addAttribute("type", "java.lang.String");
			mainElement.addElement("property").addAttribute("name", HbMapperConstants.PROPERTY_MIXED_COMMENT)
					.addAttribute("type", "java.lang.String");
		}
		hbmContext.setCurrent(mainElement.getParent());
		hbmContext.setCurrentElementFeatureMap(false);
		log.debug("Finished processing featuremap");
	}

	/** Returns the eattribute */
	public EAttribute getEAttribute() {
		return paAttribute.getAnnotatedEAttribute();
	}
}
