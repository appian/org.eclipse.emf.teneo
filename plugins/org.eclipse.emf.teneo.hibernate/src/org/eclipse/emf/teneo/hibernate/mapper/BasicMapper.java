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
 * $Id: BasicMapper.java,v 1.5 2006/09/07 22:27:50 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapper;

import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pannotation.Basic;
import org.eclipse.emf.teneo.annotations.pannotation.Column;
import org.eclipse.emf.teneo.annotations.pannotation.Enumerated;
import org.eclipse.emf.teneo.annotations.pannotation.FetchType;
import org.eclipse.emf.teneo.annotations.pannotation.Lob;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationFactory;
import org.eclipse.emf.teneo.annotations.pannotation.Temporal;
import org.eclipse.emf.teneo.annotations.pannotation.TemporalType;
import org.eclipse.emf.teneo.annotations.processing.BasicProcessor;
import org.eclipse.emf.teneo.annotations.processing.ProcessingException;
import org.eclipse.emf.teneo.annotations.processing.TransientProcessor;
import org.eclipse.emf.teneo.annotations.processing.VersionProcessor;
import org.eclipse.emf.teneo.annotations.util.EcoreDataTypes;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEAttribute;
import org.eclipse.emf.teneo.hibernate.mapping.DynamicENumUserType;
import org.eclipse.emf.teneo.hibernate.mapping.ENumUserType;
import org.eclipse.emf.teneo.simpledom.Element;

/**
 * Maps a basic element to its mapping Context.
 * <p>
 * Assumes that the given {@link PAnnotatedEStructuralFeature} is normal, i.e.
 * <ul>
 * <li>it is a {@link PAnnotatedEAttribute};
 * <li>it has a {@link Basic} annotation;
 * <li>it is EEnum typed, if and only if it has an {@link Enumerated} annotation;
 * <li>it is Date or Calendar typed if and only if it has an {@link  Temporal} annotation;
 * <li>if it has a {@link Lob} annotation then it is of correct type.
 * </ul>
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
class BasicMapper extends AbstractPropertyMapper implements BasicProcessor, TransientProcessor, VersionProcessor {

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

	/** Returns the correct temporal type for hibernate */
	private static String hbType(TemporalType temporalType) {
		return BasicMapper.TEMPORAL_TYPE_NAMES[temporalType != null ? temporalType.getValue() : TemporalType.TIMESTAMP];
	}

	/** Adds a property with name and type set */
	protected Element addProperty(String attrName, EDataType attrType) {
		log.debug("addProperty " + attrName + " of type " + AbstractPropertyMapper.hbType(attrType));
		return getHbmContext().getCurrent().addElement("property").addAttribute("name", attrName).addAttribute("type",
				AbstractPropertyMapper.hbType(attrType));
	}

	/** Adds a property with the type set */
	protected Element addProperty(String attrName, TemporalType attrType) {
		log.debug("addProperty: " + attrName + " temporal " + attrType.getName());

		return getHbmContext().getCurrent().addElement("property").addAttribute("name", attrName).addAttribute("type",
				BasicMapper.hbType(attrType));
	}

	/**
	 * Generate hb mapping for the given basic attribute.
	 * 
	 * @see org.eclipse.emf.teneo.annotations.processing.BasicProcessor#processBasic(org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute,
	 *      Basic, org.eclipse.emf.teneo.annotations.pannotation.Column)
	 */
	public void processBasic(PAnnotatedEAttribute paAttribute) {
        HbAnnotatedEAttribute hbAttribute = (HbAnnotatedEAttribute) paAttribute;
        if (hbAttribute.getHbType() != null) {
            processType(hbAttribute);
        } else {
            log.debug("processBasic " + paAttribute.getAnnotatedEAttribute().getName());

            final EAttribute eAttribute = paAttribute.getAnnotatedEAttribute();

            final Element propElement = addProperty(eAttribute.getName(), eAttribute.getEAttributeType());

            Basic basic = paAttribute.getBasic();
            if (basic == null) {
                basic = PannotationFactory.eINSTANCE.createBasic();
            }

            propElement.addAttribute("lazy", FetchType.LAZY_LITERAL.equals(basic.getFetch()) ? "true" : "false");
            addColumn(propElement, eAttribute.getName(), getColumn(paAttribute), getHbmContext()
                    .isCurrentElementFeatureMap(), false);
            addIsSetAttribute(paAttribute);
            propElement.addAttribute("not-null", isNullable(basic, eAttribute) ? "false" : "true");
		//propElement.addAttribute("unique", eAttribute.isUnique() ? "true" : "false");
        }
    }

	/**
	 * Generate hb mapping for the given temporal attribute.
	 * 
	 * @see org.eclipse.emf.teneo.annotations.processing.BasicProcessor#processTemporal(org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute,
	 *      Basic, org.eclipse.emf.teneo.annotations.pannotation.Temporal,
	 *      org.eclipse.emf.teneo.annotations.pannotation.Column)
	 */
	public void processTemporal(PAnnotatedEAttribute paAttribute) {
		final EAttribute eAttribute = paAttribute.getAnnotatedEAttribute();
		log.debug("processTemporal " + paAttribute.getAnnotatedEAttribute().getName());

		// TODO consider also Calendar type
		final Element propElement = addProperty(eAttribute.getName(), paAttribute.getTemporal().getValue());

		Basic basic = paAttribute.getBasic();
		if (basic == null) {
			basic = PannotationFactory.eINSTANCE.createBasic();
		}

		propElement.addAttribute("lazy", FetchType.LAZY_LITERAL.equals(basic.getFetch()) ? "true" : "false");
		addColumn(propElement, eAttribute.getName(), getColumn(paAttribute), getHbmContext()
				.isCurrentElementFeatureMap(), false);
		addIsSetAttribute(paAttribute);
		propElement.addAttribute("not-null", isNullable(basic, eAttribute) ? "false" : "true");
		propElement.addAttribute("unique", eAttribute.isUnique() ? "true" : "false");
	}

	/**
	 * Generate hb mapping for the given lob attribute.
	 * 
	 * @see org.eclipse.emf.teneo.annotations.processing.BasicProcessor#processLob(org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute,
	 *      Basic, org.eclipse.emf.teneo.annotations.pannotation.Column)
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
			throw new ProcessingException("Lob annotations can only be used with Strings or byte arrays. "
					+ "Attribute is of type: " + eType);
		}

		final Element propElement = getHbmContext().getCurrent().addElement("property");
		propElement.addAttribute("name", eAttribute.getName());
		propElement.addAttribute("type", columnType);

		Basic basic = paAttribute.getBasic();
		if (basic == null) {
			basic = PannotationFactory.eINSTANCE.createBasic();
		}

		propElement.addAttribute("lazy", FetchType.LAZY_LITERAL.equals(basic.getFetch()) ? "true" : "false");
		addColumn(propElement, paAttribute.getAnnotatedEAttribute().getName(), getColumn(paAttribute), getHbmContext()
				.isCurrentElementFeatureMap(), false);
		addIsSetAttribute(paAttribute);
		propElement.addAttribute("not-null", isNullable(basic, eAttribute) ? "false" : "true");
		if (eAttribute.isUnique()) {
			log.warn("Unique is true for a LOB type attribute, this does not seem logical");
		}
		propElement.addAttribute("unique", eAttribute.isUnique() ? "true" : "false");
	}

	/**
	 * Generate hb mapping for the given enum attribute.
	 * 
	 * @see org.eclipse.emf.teneo.annotations.processing.BasicProcessor#processEnum(org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute,
	 *      Basic, org.eclipse.emf.teneo.annotations.pannotation.Enumerated,
	 *      org.eclipse.emf.teneo.annotations.pannotation.Column)
	 */
	public void processEnum(PAnnotatedEAttribute paAttribute) {
		log.debug("processEnum " + paAttribute.getAnnotatedEAttribute());

		final Column column = getColumn(paAttribute);
		final Element propElement = getHbmContext().getCurrent().addElement("property").addAttribute("name",
				paAttribute.getAnnotatedEAttribute().getName());

		final EAttribute eattr = paAttribute.getAnnotatedEAttribute();
		Basic basic = paAttribute.getBasic();
		if (basic == null) {
			basic = PannotationFactory.eINSTANCE.createBasic();
		}

		Enumerated enumerated = paAttribute.getEnumerated();

		propElement.addAttribute("lazy", FetchType.LAZY_LITERAL.equals(basic.getFetch()) ? "true" : "false");
		propElement.addAttribute("access", "org.eclipse.emf.teneo.hibernate.mapping.EFeatureAccessor");
		addColumn(propElement, eattr.getName(), column, getHbmContext().isCurrentElementFeatureMap(), false);
		
		if (paAttribute.getAnnotatedEAttribute().getEType().getInstanceClass() != null) {
			propElement.addElement("type"). 
				addAttribute("name", hbEnumType(enumerated)). 
				addElement("param"). 
					addAttribute("name", ENumUserType.ENUM_CLASS_PARAM).
					addText(eattr.getEType().getInstanceClass().getName());
		} else {
			final Element typeElement = propElement.addElement("type"). 
				addAttribute("name", hbDynamicEnumType(enumerated));
			typeElement.addElement("param").addAttribute("name", DynamicENumUserType.ECLASSIFIER_PARAM). 
				addText(paAttribute.getAnnotatedEAttribute().getEType().getName());
			typeElement.addElement("param").addAttribute("name", DynamicENumUserType.EPACKAGE_PARAM). 
				addText(paAttribute.getAnnotatedEAttribute().getEType().getEPackage().getNsURI());
		}

		addIsSetAttribute(paAttribute);
		propElement.addAttribute("not-null", isNullable(basic, eattr) ? "false" : "true");
		propElement.addAttribute("unique", eattr.isUnique() ? "true" : "false");
	}

	/**
	 * Process Hibernate UserTypes
	 */
	public void processType(HbAnnotatedEAttribute hbAttribute) {
		final EAttribute eAttribute = hbAttribute.getAnnotatedEAttribute();
        
		Basic basic = hbAttribute.getBasic();
		if (basic == null) {
			basic = PannotationFactory.eINSTANCE.createBasic();
		}

		final Element propertyElement = getHbmContext().getCurrent().addElement("property");
		propertyElement.addAttribute("name", eAttribute.getName());
		propertyElement.addAttribute("type", hbAttribute.getHbType().getType());
		propertyElement.addAttribute("lazy", FetchType.LAZY_LITERAL.equals(basic.getFetch()) ? "true" : "false");
		addIsSetAttribute(hbAttribute);
		propertyElement.addAttribute("not-null", isNullable(basic, eAttribute) ? "false" : "true");

		final List columns = hbAttribute.getHbColumns();
		for (Iterator it = columns.iterator(); it.hasNext();) {
			final Column column = (Column) it.next();
			addColumn(propertyElement, eAttribute.getName(), column, getHbmContext().isCurrentElementFeatureMap(),
					false);
		}
	}

	/**
	 * Generate hb mapping for the given version attribute.
	 * 
	 * @see org.eclipse.emf.teneo.annotations.processing.VersionProcessor#processVersion(org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute,
	 *      org.eclipse.emf.teneo.annotations.pannotation.Column)
	 */
	public void processVersion(PAnnotatedEAttribute paAttribute) {
		if (log.isDebugEnabled()) {
			log.debug("Generating version for " + paAttribute.getAnnotatedEAttribute().getName());
		}
		final EAttribute eAttribute = paAttribute.getAnnotatedEAttribute();
		final Element propElement = getHbmContext().getCurrent().addElement("version").addAttribute("name",
				eAttribute.getName()).addAttribute("type",
				AbstractPropertyMapper.hbType(eAttribute.getEAttributeType()));
		// .addAttribute("access",
		// "org.eclipse.emf.teneo.hibernate.mapping.identifier.VersionAccessor");
		addColumnElement(propElement, eAttribute.getName(), getColumn(paAttribute), getHbmContext()
				.isCurrentElementFeatureMap());
	}

	/**
	 * Ignore transient attributes.
	 * 
	 * @see org.eclipse.emf.teneo.annotations.processing.TransientProcessor#processTransient(org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature)
	 */
	public void processTransient(PAnnotatedEStructuralFeature paFeature) {
		if (log.isDebugEnabled())
			log.debug("Skipping transient feature for " + paFeature.getAnnotatedEStructuralFeature().getName());
	}

	/**
	 * A prop is nullable if the basic is optional or the feature is part of a featuremap. The last reason is because
	 * featuremapentries will have all the features of the featuremap with only one of them filled.
	 */
	private boolean isNullable(Basic basic, EAttribute eattr) {
		return basic.isOptional() || getHbmContext().isCurrentElementFeatureMap();
	}
}
