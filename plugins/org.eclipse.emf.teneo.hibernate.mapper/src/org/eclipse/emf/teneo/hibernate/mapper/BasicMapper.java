/**
 * <copyright> Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal Davide Marchignoli
 * </copyright> $Id: BasicMapper.java,v 1.24 2007/12/28 14:36:40 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapper;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pannotation.Basic;
import org.eclipse.emf.teneo.annotations.pannotation.Column;
import org.eclipse.emf.teneo.annotations.pannotation.FetchType;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationFactory;
import org.eclipse.emf.teneo.annotations.pannotation.TemporalType;
import org.eclipse.emf.teneo.extension.ExtensionPoint;
import org.eclipse.emf.teneo.hibernate.hbannotation.Index;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEAttribute;
import org.eclipse.emf.teneo.simpledom.Element;

/**
 * Maps a basic element to its mapping Context.
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
public class BasicMapper extends AbstractMapper implements ExtensionPoint {

	/** Log it all */
	private static final Log log = LogFactory.getLog(BasicMapper.class);

	/**
	 * Generate hb mapping for the given basic attribute.
	 */
	public void processBasic(PAnnotatedEAttribute paAttribute) {
		log.debug("processBasic " + paAttribute.getAnnotatedEAttribute().getName());

		final EAttribute eattr = paAttribute.getAnnotatedEAttribute();
		final String attrName = getHbmContext().getPropertyName(eattr);
		final Element propElement = getHbmContext().getCurrent().addElement("property").addAttribute("name", attrName);

		Basic basic = paAttribute.getBasic();
		if (basic == null) {
			basic = PannotationFactory.eINSTANCE.createBasic();
		}

		propElement.addAttribute("lazy", FetchType.LAZY.equals(basic.getFetch()) ? "true" : "false");
		addColumns(propElement, paAttribute, getColumns(paAttribute), getHbmContext().isCurrentElementFeatureMap() ||
				isNullable(basic, paAttribute), true);
		// todo check: not-null is also set in the call to addcolumns, decide were to do what!
		propElement.addAttribute("not-null", isNullable(basic, paAttribute) ? "false" : "true");
		setType(paAttribute, propElement);

		if (((HbAnnotatedEAttribute) paAttribute).getGenerated() != null &&
				((HbAnnotatedEAttribute) paAttribute).getGenerated().getValue() != null) {
			propElement.addAttribute("generated", ((HbAnnotatedEAttribute) paAttribute).getGenerated().getValue()
				.getName().toLowerCase());
		}

		if (((HbAnnotatedEAttribute) paAttribute).getHbIndex() != null) {
			final Index index = ((HbAnnotatedEAttribute) paAttribute).getHbIndex();
			propElement.addAttribute("index", index.getName());
		}
	}

	/**
	 * Generate hb mapping for the given temporal attribute.
	 */
	public void processTemporal(PAnnotatedEAttribute paAttribute) {
		log.debug("processTemporal " + paAttribute.getAnnotatedEAttribute().getName());

		TemporalType tt = paAttribute.getTemporal().getValue();
		final String attrName = getHbmContext().getPropertyName(paAttribute.getAnnotatedEAttribute());
		log.debug("addProperty: " + attrName + " temporal " + tt.getName());

		final Element propElement = getHbmContext().getCurrent().addElement("property").addAttribute("name", attrName);

		Basic basic = paAttribute.getBasic();
		if (basic == null) {
			basic = PannotationFactory.eINSTANCE.createBasic();
		}

		propElement.addAttribute("lazy", FetchType.LAZY.equals(basic.getFetch()) ? "true" : "false");
		addColumns(propElement, paAttribute, getColumns(paAttribute), getHbmContext().isCurrentElementFeatureMap() ||
				isNullable(basic, paAttribute), true);
		// todo check: not-null is also set in the call to addcolumns, decide were to do what!
		propElement.addAttribute("not-null", isNullable(basic, paAttribute) ? "false" : "true");

		if (((HbAnnotatedEAttribute) paAttribute).getGenerated() != null &&
				((HbAnnotatedEAttribute) paAttribute).getGenerated().getValue() != null) {
			propElement.addAttribute("generated", ((HbAnnotatedEAttribute) paAttribute).getGenerated().getValue()
				.getName().toLowerCase());
		}

		// #191463
		setType(paAttribute, propElement);
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

		propElement.addAttribute("lazy", FetchType.LAZY.equals(basic.getFetch()) ? "true" : "false");
		addColumns(propElement, paAttribute, getColumns(paAttribute), getHbmContext().isCurrentElementFeatureMap() ||
				isNullable(basic, paAttribute), true);
		propElement.addAttribute("not-null", isNullable(basic, paAttribute) ? "false" : "true");
		setType(paAttribute, propElement);
	}

	/**
	 * Generate hb mapping for the given enum attribute.
	 */
	public void processEnum(PAnnotatedEAttribute paAttribute) {
		log.debug("processEnum " + paAttribute.getAnnotatedEAttribute());

		Basic basic = paAttribute.getBasic();
		if (basic == null) {
			basic = PannotationFactory.eINSTANCE.createBasic();
		}

		final List<Column> columns = getColumns(paAttribute);
		final Element propElement =
				getHbmContext().getCurrent().addElement("property").addAttribute("name",
					getHbmContext().getPropertyName(paAttribute.getAnnotatedEAttribute()));
		propElement.addAttribute("lazy", FetchType.LAZY.equals(basic.getFetch()) ? "true" : "false");
		propElement.addAttribute("not-null", isNullable(basic, paAttribute) ? "false" : "true");
		addColumns(propElement, paAttribute, columns, isNullable(basic, paAttribute) ||
				getHbmContext().isCurrentElementFeatureMap(), true);
		setType(paAttribute, propElement);
	}

	/**
	 * Generate hb mapping for the given version attribute.
	 */
	public void processVersion(PAnnotatedEAttribute paAttribute) {
		if (log.isDebugEnabled()) {
			log.debug("Generating version for " + paAttribute.getAnnotatedEAttribute().getName());
		}
		final EAttribute eAttribute = paAttribute.getAnnotatedEAttribute();
		final Element propElement =
				getHbmContext().getCurrent().addElement("version").addAttribute("name", eAttribute.getName());
		List<Column> columns = getColumns(paAttribute);
		if (columns.size() > 1) {
			log.warn("Version has more than one attribute, only using the first one, eclass: " +
					paAttribute.getAnnotatedEAttribute().getEContainingClass().getName());
		}
		addColumns(propElement, paAttribute, columns, getHbmContext().isCurrentElementFeatureMap(), false);
		setType(paAttribute, propElement);
	}

	/**
	 * Ignore transient attributes.
	 */
	public void processTransient(PAnnotatedEStructuralFeature paFeature) {
		if (log.isDebugEnabled()) {
			log.debug("Skipping transient feature for " + paFeature.getAnnotatedEStructuralFeature().getName());
		}
	}

	/**
	 * A prop is nullable if the basic is optional or the feature is part of a featuremap. The last
	 * reason is because featuremapentries will have all the features of the featuremap with only
	 * one of them filled.
	 */
	private boolean isNullable(Basic basic, PAnnotatedEAttribute aattr) {
		return getHbmContext().isForceOptional() || basic.isOptional() ||
				getHbmContext().isCurrentElementFeatureMap() &&
				(aattr.getColumn() == null || aattr.getColumn().isNullable());
	}
}
