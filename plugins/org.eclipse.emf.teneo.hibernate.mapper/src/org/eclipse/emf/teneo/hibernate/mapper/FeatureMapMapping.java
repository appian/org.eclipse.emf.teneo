/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal
 * </copyright> $Id: FeatureMapMapping.java,v 1.21 2009/11/02 18:14:18 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pannotation.Id;
import org.eclipse.emf.teneo.annotations.pannotation.Transient;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEAttribute;
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
public class FeatureMapMapping extends AbstractMapper {

	/** Log it here */
	private static final Log log = LogFactory.getLog(FeatureMapMapping.class);

	/** The annotated feature which is a feature map */
	private final PAnnotatedEAttribute paAttribute;

	/** The mapping context */
	private final MappingContext hbmContext;

	private Element compositeElement;

	/**
	 * @param hbmContext
	 *            The context in which the mapping takes place
	 */
	public FeatureMapMapping(MappingContext hbmContext, PAnnotatedEAttribute paAttribute) {
		super.setHbmContext(hbmContext);
		log.debug("Created featuremap mapping instance for " + paAttribute);
		this.hbmContext = hbmContext;
		this.paAttribute = paAttribute;
		final EAttribute eattr = paAttribute.getModelEAttribute();
		assert (FeatureMapUtil.isFeatureMap(eattr));
	}

	/** Returns the entityName */
	public String getEntityName() {
		return StoreUtil.getEntityName(paAttribute.getModelEAttribute());
	}

	/** Processes the features of this featuremap entry */
	public void process() {
		final String entityName = StoreUtil.getEntityName(paAttribute.getModelEAttribute());
		log.debug("Processing feature map feature: " + entityName);
		Element mainElement;
		if (getHbmContext().getPersistenceOptions().isMapFeatureMapAsComponent()) {
			mainElement = getCompositeElement();

			mainElement.addElement("meta").addAttribute("attribute", HbMapperConstants.FEATUREMAP_META).addText(
					hbmContext.getEntityNameStrategy().toEntityName(
							paAttribute.getModelEAttribute().getEContainingClass()));
		} else {
			mainElement = hbmContext.getCurrent().addElement("class").addAttribute("entity-name", entityName)
					.addAttribute("lazy", "false").addAttribute("table",
							hbmContext.trunc(entityName.toUpperCase(), false));

			mainElement.addElement("meta").addAttribute("attribute", HbMapperConstants.FEATUREMAP_META).addText(
					hbmContext.getEntityNameStrategy().toEntityName(
							paAttribute.getModelEAttribute().getEContainingClass()));

			// TODO: check if id of parent can be used instead
			mainElement.addElement("id").addAttribute("type", "long").addElement("generator").addAttribute("class",
					"native");

			if (hbmContext.alwaysVersion()) {
				final Element versionElement = mainElement.addElement("version").addAttribute("name",
						hbmContext.getVersionColumnName()).addAttribute("access",
						"org.eclipse.emf.teneo.hibernate.mapping.property.VersionPropertyHandler");
				final Element meta = new Element("meta");
				meta.addAttribute("attribute", HbMapperConstants.VERSION_META).addText("true");
				versionElement.add(0, meta);
			}
		}

		final FeatureMapper fp = hbmContext.getFeatureMapper();
		hbmContext.setCurrent(mainElement);
		hbmContext.setCurrentElementFeatureMap(true);
		if (getHbmContext().getPersistenceOptions().isMapFeatureMapAsComponent()) {
			mainElement.addElement("tuplizer").addAttribute("entity-mode", "pojo").addAttribute("class",
					getHbmContext().getComponentFeatureMapTuplizer());
			mainElement.addElement("tuplizer").addAttribute("entity-mode", "map").addAttribute("class",
					getHbmContext().getComponentFeatureMapTuplizer());
		}

		mainElement.addElement("property").addAttribute("name", HbMapperConstants.PROPERTY_FEATURE).addAttribute(
				"type", "java.lang.String");

		// and now process the features of this group
		final PAnnotatedEClass paClass = paAttribute.getPaEClass();
		final boolean isWildCard = StoreUtil.isWildCard(paAttribute.getModelEAttribute());
		final boolean isMixed = StoreUtil.isMixed(paAttribute.getModelEAttribute());
		if (isWildCard) {
			addWildCardFeatureMapping(mainElement, paAttribute);
		} else {
			hbmContext.setNamePrefix(paAttribute.getModelEAttribute().getName() + "_");
			for (PAnnotatedEStructuralFeature paFeature : paClass.getPaEStructuralFeatures()) {
				EStructuralFeature eFeature = paFeature.getModelEStructuralFeature();
				final EStructuralFeature modelGroupFeature = ExtendedMetaData.INSTANCE.getGroup(eFeature);
				final boolean isEFeatureMixed = StoreUtil.isMixed(eFeature);
				// note with mixed everyone is part of the group except the
				// mixed feature itself
				if ((isMixed && !isEFeatureMixed)
						|| (modelGroupFeature != null && modelGroupFeature == paAttribute.getModelEStructuralFeature())) {
					log.debug("Feature " + StoreUtil.toString(eFeature) + " belongs to this featuremap");

					// continue if it is a id
					Id id = null;
					if (paFeature instanceof PAnnotatedEAttribute && ((PAnnotatedEAttribute) paFeature).getId() != null) {
						// Feature is an id, temporarily removing the id, otherwise
						// the fm gets confused
						id = ((PAnnotatedEAttribute) paFeature).getId();
						((PAnnotatedEAttribute) paFeature).setId(null);
					}

					// temporarily remove the transient otherwise the feature is not
					// processed
					Transient tt = paFeature.getTransient();
					paFeature.setTransient(null);
					try {
						fp.process(paFeature);
					} finally {
						// and set the temp values back
						paFeature.setTransient(tt);
						if (id != null) {
							((PAnnotatedEAttribute) paFeature).setId(id);
						}
					}
				}
			}
			hbmContext.setNamePrefix("");
		}

		if (StoreUtil.isMixed(paAttribute.getModelEAttribute())) {
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

	private void addWildCardFeatureMapping(Element mainElement, PAnnotatedEStructuralFeature paFeature) {
		mainElement.addElement("property").addAttribute("name",
				paFeature.getModelEStructuralFeature().getName() + "_" + HbMapperConstants.PROPERTY_ANY_PRIMITIVE)
				.addAttribute("type", "java.lang.String");
		final HbAnnotatedEAttribute hbAttribute = (HbAnnotatedEAttribute) paAttribute;
		final String assocName = getHbmContext().getPropertyName(paFeature.getModelEStructuralFeature());
		mainElement.addElement(createAny(assocName + "_" + HbMapperConstants.PROPERTY_ANY_REFERENCE, paFeature,
				hbAttribute.getAny(), hbAttribute.getAnyMetaDef(), false));
	}

	/** Returns the eattribute */
	public EAttribute getEAttribute() {
		return paAttribute.getModelEAttribute();
	}

	public Element getCompositeElement() {
		return compositeElement;
	}

	public void setCompositeElement(Element compositeElement) {
		this.compositeElement = compositeElement;
	}
}
