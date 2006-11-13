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
 *   Davide Marchignoli
 * </copyright>
 *
 * $Id: BasicMapper.java,v 1.4 2006/11/13 14:53:00 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapper;

import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pannotation.Basic;
import org.eclipse.emf.teneo.annotations.pannotation.Column;
import org.eclipse.emf.teneo.annotations.pannotation.Enumerated;
import org.eclipse.emf.teneo.annotations.pannotation.FetchType;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationFactory;
import org.eclipse.emf.teneo.annotations.pannotation.TemporalType;
import org.eclipse.emf.teneo.hibernate.HbMapperException;
import org.eclipse.emf.teneo.hibernate.hbannotation.Parameter;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEAttribute;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEDataType;
import org.eclipse.emf.teneo.simpledom.Element;
import org.eclipse.emf.teneo.util.EcoreDataTypes;

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

		final Element propElement = addProperty(paAttribute);

		Basic basic = paAttribute.getBasic();
		if (basic == null) {
			basic = PannotationFactory.eINSTANCE.createBasic();
		}

		// Buildtime enhancement not supported
		propElement.addAttribute("lazy", FetchType.LAZY_LITERAL.equals(basic.getFetch()) ? "true" : "false");
		addColumns(propElement, eAttribute.getName(), getColumns(paAttribute), getHbmContext()
				.isCurrentElementFeatureMap(), false);
		propElement.addAttribute("not-null", isNullable(basic, eAttribute) ? "false" : "true");

		handleTypeDef(paAttribute, propElement);
		// propElement.addAttribute("unique", eAttribute.isUnique() ? "true" : "false");
	}

	/**
	 * Generate hb mapping for the given temporal attribute.
	 */
	public void processTemporal(PAnnotatedEAttribute paAttribute) {
		final EAttribute eAttribute = paAttribute.getAnnotatedEAttribute();
		log.debug("processTemporal " + paAttribute.getAnnotatedEAttribute().getName());

		// TODO consider also Calendar type
		final Element propElement = addProperty(eAttribute, paAttribute.getTemporal().getValue());

		Basic basic = paAttribute.getBasic();
		if (basic == null) {
			basic = PannotationFactory.eINSTANCE.createBasic();
		}

		propElement.addAttribute("lazy", FetchType.LAZY_LITERAL.equals(basic.getFetch()) ? "true" : "false");
		addColumns(propElement, eAttribute.getName(), getColumns(paAttribute), getHbmContext()
				.isCurrentElementFeatureMap(), false);
		propElement.addAttribute("not-null", isNullable(basic, eAttribute) ? "false" : "true");
		handleTypeDef(paAttribute, propElement);
	}

	/**
	 * Generate hb mapping for the given lob attribute.
	 */
	public void processLob(PAnnotatedEAttribute paAttribute) {
		final EAttribute eAttribute = paAttribute.getAnnotatedEAttribute();
		log.debug("processLob " + eAttribute.getName());
		final EDataType eType = eAttribute.getEAttributeType();
		final String columnType;
		// See
		// http://www.hibernate.org/hib_docs/v3/reference/en/html/mapping.html#mapping-types-basictypes
		if (EcoreDataTypes.isByteArray(eType)) {
			columnType = "binary";
		} else if (EcoreDataTypes.INSTANCE.isEString(eType)) {
			columnType = "text";
		} else {
			throw new MappingException("Lob annotations can only be used with Strings or byte arrays. "
					+ "Attribute is of type: " + eType);
		}

		final Element propElement = getHbmContext().getCurrent().addElement("property");
		propElement.addAttribute("name", getHbmContext().getPropertyName(eAttribute));
		propElement.addAttribute("type", columnType);

		Basic basic = paAttribute.getBasic();
		if (basic == null) {
			basic = PannotationFactory.eINSTANCE.createBasic();
		}

		propElement.addAttribute("lazy", FetchType.LAZY_LITERAL.equals(basic.getFetch()) ? "true" : "false");
		addColumns(propElement, paAttribute.getAnnotatedEAttribute().getName(), getColumns(paAttribute), getHbmContext()
				.isCurrentElementFeatureMap(), false);
		propElement.addAttribute("not-null", isNullable(basic, eAttribute) ? "false" : "true");
		handleTypeDef(paAttribute, propElement);
	}

	/**
	 * Generate hb mapping for the given enum attribute.
	 */
	public void processEnum(PAnnotatedEAttribute paAttribute) {
		log.debug("processEnum " + paAttribute.getAnnotatedEAttribute());

		final List columns = getColumns(paAttribute);
		final Element propElement = getHbmContext().getCurrent().addElement("property").addAttribute("name",
				getHbmContext().getPropertyName(paAttribute.getAnnotatedEAttribute()));

		final EAttribute eattr = paAttribute.getAnnotatedEAttribute();
		Basic basic = paAttribute.getBasic();
		if (basic == null) {
			basic = PannotationFactory.eINSTANCE.createBasic();
		}

		Enumerated enumerated = paAttribute.getEnumerated();

		propElement.addAttribute("lazy", FetchType.LAZY_LITERAL.equals(basic.getFetch()) ? "true" : "false");
		propElement.addAttribute("not-null", isNullable(basic, eattr) ? "false" : "true");
		addColumns(propElement, eattr.getName(), columns, getHbmContext().isCurrentElementFeatureMap(), false);

		// if an entity then add the special things
		final EClassifier eclassifier = paAttribute.getAnnotatedEAttribute().getEType();
		final HbAnnotatedEAttribute hea = (HbAnnotatedEAttribute) paAttribute;
		final EDataType ed = (EDataType) hea.getAnnotatedEAttribute().getEType();
		final HbAnnotatedEDataType hed = (HbAnnotatedEDataType) hea.getPaModel().getPAnnotated(ed);
		if (hed.getHbTypeDef() != null || hea.getHbType() != null) {
			handleTypeDef(paAttribute, propElement);
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

	/** Handles the type or typedef annotations */
	protected void handleTypeDef(PAnnotatedEAttribute paAttribute, Element propElement) {

		// handle the type annotation
		final HbAnnotatedEAttribute hea = (HbAnnotatedEAttribute) paAttribute;
		final EDataType ed = (EDataType) hea.getAnnotatedEAttribute().getEType();
		final HbAnnotatedEDataType hed = (HbAnnotatedEDataType) hea.getPaModel().getPAnnotated(ed);

		if (hed == null) { // edatatype not defined in this epackage (probably emf native)
			return;
		}
		
		final String name;
		final List params;
		if (hea.getHbType() != null) {
			name = hea.getHbType().getType();
			params = hea.getHbType().getParameters();
		} else if (hed.getHbTypeDef() != null) {
			name = hed.getHbTypeDef().getName();
			params = null;
		} else {
			name = null;
			params = null;
		}
		if (name != null) {
			if (params == null || params.isEmpty()) {
				// simple
				propElement.addAttribute("type", name);
			} else {
				final Element typeElement = propElement.addElement("type").addAttribute("name", name);
				for (Iterator it = params.iterator(); it.hasNext();) {
					final Parameter param = (Parameter) it.next();
					typeElement.addElement("param").addAttribute("name", param.getName()).addText(param.getValue());
				}
			}
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
				eAttribute.getName()).addAttribute("type",
				hbType(paAttribute));
		List columns = getColumns(paAttribute);
		if (columns.size() == 0) {
			throw new HbMapperException("Version attribute has no columns defined, eclass " + paAttribute.getAnnotatedEAttribute().getEContainingClass().getName());
		} if (columns.size() > 1) {
			log.warn("Version has more than one attribute, only using the first one, eclass: " + paAttribute.getAnnotatedEAttribute().getEContainingClass().getName());
		}
		addColumnElement(propElement, eAttribute.getName(), (Column)columns.get(0), getHbmContext()
				.isCurrentElementFeatureMap());
		handleTypeDef(paAttribute, propElement);
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

	/** Adds a property with name and type set */
	protected Element addProperty(PAnnotatedEAttribute paAttribute) {
		final EAttribute eattr = paAttribute.getAnnotatedEAttribute();
		final String attrName = getHbmContext().getPropertyName(eattr);
		log.debug("addProperty " + attrName + " of type " + hbType(paAttribute));
		return getHbmContext().getCurrent().addElement("property").addAttribute("name", attrName).addAttribute("type",
				hbType(paAttribute));
	}

	/** Adds a property with the type set */
	protected Element addProperty(EAttribute eattr, TemporalType attrType) {
		final String attrName = getHbmContext().getPropertyName(eattr);
		log.debug("addProperty: " + attrName + " temporal " + attrType.getName());
		return getHbmContext().getCurrent().addElement("property").addAttribute("name", attrName).addAttribute("type",
				BasicMapper.hbType(attrType));
	}

	/**
	 * A prop is nullable if the basic is optional or the feature is part of a featuremap. The last reason is because
	 * featuremapentries will have all the features of the featuremap with only one of them filled.
	 */
	private boolean isNullable(Basic basic, EAttribute eattr) {
		return basic.isOptional() || getHbmContext().isCurrentElementFeatureMap();
	}
}
