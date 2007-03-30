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
 * $Id: BasicMapper.java,v 1.8.2.1 2007/03/30 15:38:48 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapper;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pannotation.Basic;
import org.eclipse.emf.teneo.annotations.pannotation.Enumerated;
import org.eclipse.emf.teneo.annotations.pannotation.FetchType;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationFactory;
import org.eclipse.emf.teneo.annotations.pannotation.TemporalType;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEAttribute;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEDataType;
import org.eclipse.emf.teneo.simpledom.Element;

/**
 * Maps a basic element to its mapping Context.
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
class BasicMapper extends AbstractPropertyMapper {

	/** Log it all */
	private static final Log log = LogFactory.getLog(BasicMapper.class);

	/** The list of types which translate to a hibernate types */
	private static final String[] TEMPORAL_TYPE_NAMES;

	/** Initialize TEMPORAL_TYPE_NAMES */
	static {
		TEMPORAL_TYPE_NAMES = new String[TemporalType.VALUES.size()];
		TEMPORAL_TYPE_NAMES[TemporalType.DATE] = "date";
		TEMPORAL_TYPE_NAMES[TemporalType.TIME] = "time";
		TEMPORAL_TYPE_NAMES[TemporalType.TIMESTAMP] = "timestamp";
	}

	/** Constructor */
	public BasicMapper(MappingContext mappingContext) {
		super(mappingContext);
	}

	/**
	 * Generate hb mapping for the given basic attribute.
	 */
	public void processBasic(PAnnotatedEAttribute paAttribute) {
		log.debug("processBasic " + paAttribute.getAnnotatedEAttribute().getName());

		final EAttribute eAttribute = paAttribute.getAnnotatedEAttribute();

		final EAttribute eattr = paAttribute.getAnnotatedEAttribute();
		final String attrName = getHbmContext().getPropertyName(eattr);
		final Element propElement = getHbmContext().getCurrent().addElement("property").addAttribute("name", attrName);

		Basic basic = paAttribute.getBasic();
		if (basic == null) {
			basic = PannotationFactory.eINSTANCE.createBasic();
		}

		propElement.addAttribute("lazy", FetchType.LAZY_LITERAL.equals(basic.getFetch()) ? "true" : "false");
		addColumns(propElement, eAttribute.getName(), getColumns(paAttribute), getHbmContext()
				.isCurrentElementFeatureMap()
				|| isNullable(basic, eAttribute), true);
		propElement.addAttribute("not-null", isNullable(basic, eAttribute) ? "false" : "true");
		setType(paAttribute, propElement);
	}

	/**
	 * Generate hb mapping for the given temporal attribute.
	 */
	public void processTemporal(PAnnotatedEAttribute paAttribute) {
		final EAttribute eAttribute = paAttribute.getAnnotatedEAttribute();
		log.debug("processTemporal " + paAttribute.getAnnotatedEAttribute().getName());

		TemporalType tt = paAttribute.getTemporal().getValue();
		final String attrName = getHbmContext().getPropertyName(paAttribute.getAnnotatedEAttribute());
		log.debug("addProperty: " + attrName + " temporal " + tt.getName());
		final HbAnnotatedEAttribute hea = (HbAnnotatedEAttribute) paAttribute;
		final HbAnnotatedEDataType hed = (HbAnnotatedEDataType) paAttribute.getPaModel().getPAnnotated(
				paAttribute.getAnnotatedEAttribute().getEAttributeType());

		final Element propElement = getHbmContext().getCurrent().addElement("property").addAttribute("name", attrName);

		Basic basic = paAttribute.getBasic();
		if (basic == null) {
			basic = PannotationFactory.eINSTANCE.createBasic();
		}

		propElement.addAttribute("lazy", FetchType.LAZY_LITERAL.equals(basic.getFetch()) ? "true" : "false");
		addColumns(propElement, eAttribute.getName(), getColumns(paAttribute), getHbmContext()
				.isCurrentElementFeatureMap()
				|| isNullable(basic, eAttribute), true);
		propElement.addAttribute("not-null", isNullable(basic, eAttribute) ? "false" : "true");

		if ((hed != null && hed.getHbTypeDef() != null) || hea.getHbType() != null) {
			setType(paAttribute, propElement);
		} else {
			propElement.addAttribute("type", BasicMapper.hbType(tt));
		}
	}

	/**
	 * Generate hb mapping for the given lob attribute.
	 */
	public void processLob(PAnnotatedEAttribute paAttribute) {
		final EAttribute eAttribute = paAttribute.getAnnotatedEAttribute();
		log.debug("processLob " + eAttribute.getName());

		final Element propElement = getHbmContext().getCurrent().addElement("property");
		propElement.addAttribute("name", getHbmContext().getPropertyName(eAttribute));

		Basic basic = paAttribute.getBasic();
		if (basic == null) {
			basic = PannotationFactory.eINSTANCE.createBasic();
		}

		propElement.addAttribute("lazy", FetchType.LAZY_LITERAL.equals(basic.getFetch()) ? "true" : "false");
		addColumns(propElement, paAttribute.getAnnotatedEAttribute().getName(), getColumns(paAttribute),
				getHbmContext().isCurrentElementFeatureMap() || isNullable(basic, eAttribute), true);
		propElement.addAttribute("not-null", isNullable(basic, eAttribute) ? "false" : "true");
		setType(paAttribute, propElement);
	}

	/**
	 * Generate hb mapping for the given enum attribute.
	 */
	public void processEnum(PAnnotatedEAttribute paAttribute) {
		log.debug("processEnum " + paAttribute.getAnnotatedEAttribute());

		final EAttribute eattr = paAttribute.getAnnotatedEAttribute();
		Basic basic = paAttribute.getBasic();
		if (basic == null) {
			basic = PannotationFactory.eINSTANCE.createBasic();
		}

		final List columns = getColumns(paAttribute);
		final Element propElement = getHbmContext().getCurrent().addElement("property").addAttribute("name",
				getHbmContext().getPropertyName(paAttribute.getAnnotatedEAttribute()));

		Enumerated enumerated = paAttribute.getEnumerated();

		propElement.addAttribute("lazy", FetchType.LAZY_LITERAL.equals(basic.getFetch()) ? "true" : "false");
		propElement.addAttribute("not-null", isNullable(basic, eattr) ? "false" : "true");
		addColumns(propElement, eattr.getName(), columns, isNullable(basic, eattr)
				|| getHbmContext().isCurrentElementFeatureMap(), true);

		// if an entity then add the special things
		final EClassifier eclassifier = paAttribute.getAnnotatedEAttribute().getEType();
		final HbAnnotatedEAttribute hea = (HbAnnotatedEAttribute) paAttribute;
		final EDataType ed = (EDataType) hea.getAnnotatedEAttribute().getEType();
		final HbAnnotatedEDataType hed = (HbAnnotatedEDataType) hea.getPaModel().getPAnnotated(ed);
		if (hed.getHbTypeDef() != null || hea.getHbType() != null) {
			setType(paAttribute, propElement);
		} else if (getHbmContext().isEasyEMFGenerated(eclassifier)) {
			final Class instanceClass = getHbmContext().getImpl(eclassifier);
			propElement.addElement("type").addAttribute("name", getEnumUserType(enumerated)).addElement("param")
					.addAttribute("name", "enumClassName").addText(instanceClass.getName());
		} else if (getHbmContext().isEasyEMFDynamic(eclassifier)) {
			final Element typeElement = propElement.addElement("type").addAttribute("name",
					hbDynamicEnumType(enumerated));
			typeElement.addElement("param").addAttribute("name", HbMapperConstants.ECLASSIFIER_PARAM).addText(
					paAttribute.getAnnotatedEAttribute().getEType().getName());
			typeElement.addElement("param").addAttribute("name", HbMapperConstants.EPACKAGE_PARAM).addText(
					paAttribute.getAnnotatedEAttribute().getEType().getEPackage().getNsURI());
		} else if (getHbmContext().isEMFGenerated(eclassifier)) {
			propElement.addElement("type").addAttribute("name", getEnumUserType(enumerated)).addElement("param")
					.addAttribute("name", HbMapperConstants.ENUM_CLASS_PARAM).addText(
							eattr.getEType().getInstanceClass().getName());
		} else { // must be emf dynamic
			final Element typeElement = propElement.addElement("type").addAttribute("name",
					hbDynamicEnumType(enumerated));
			typeElement.addElement("param").addAttribute("name", HbMapperConstants.ECLASSIFIER_PARAM).addText(
					paAttribute.getAnnotatedEAttribute().getEType().getName());
			typeElement.addElement("param").addAttribute("name", HbMapperConstants.EPACKAGE_PARAM).addText(
					paAttribute.getAnnotatedEAttribute().getEType().getEPackage().getNsURI());
		}
	}

	/**
	 * Generate hb mapping for the given version attribute.
	 */
	public void processVersion(PAnnotatedEAttribute paAttribute) {
		if (log.isDebugEnabled()) {
			log.debug("Generating version for " + paAttribute.getAnnotatedEAttribute().getName());
		}
		final EAttribute eAttribute = paAttribute.getAnnotatedEAttribute();
		final Element propElement = getHbmContext().getCurrent().addElement("version").addAttribute("name",
				eAttribute.getName());
		List columns = getColumns(paAttribute);
		if (columns.size() > 1) {
			log.warn("Version has more than one attribute, only using the first one, eclass: "
					+ paAttribute.getAnnotatedEAttribute().getEContainingClass().getName());
		}
		addColumns(propElement, eAttribute.getName(), columns, getHbmContext().isCurrentElementFeatureMap(), false);
		setType(paAttribute, propElement);
	}

	/**
	 * Ignore transient attributes.
	 */
	public void processTransient(PAnnotatedEStructuralFeature paFeature) {
		if (log.isDebugEnabled())
			log.debug("Skipping transient feature for " + paFeature.getAnnotatedEStructuralFeature().getName());
	}

	/** Returns the correct temporal type for hibernate */
	private static String hbType(TemporalType temporalType) {
		return BasicMapper.TEMPORAL_TYPE_NAMES[temporalType != null ? temporalType.getValue() : TemporalType.TIMESTAMP];
	}

	/**
	 * A prop is nullable if the basic is optional or the feature is part of a featuremap. The last reason is because
	 * featuremapentries will have all the features of the featuremap with only one of them filled.
	 */
	private boolean isNullable(Basic basic, EAttribute eattr) {
		return getHbmContext().isForceNullable() || basic.isOptional() || getHbmContext().isCurrentElementFeatureMap();
	}
}
