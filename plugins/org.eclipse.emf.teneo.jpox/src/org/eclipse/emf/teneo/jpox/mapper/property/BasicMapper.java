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
 * </copyright>
 *
 * $Id: BasicMapper.java,v 1.9 2007/09/04 09:56:42 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.mapper.property;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pannotation.Column;
import org.eclipse.emf.teneo.extension.ExtensionPoint;
import org.eclipse.emf.teneo.jpox.mapper.AbstractMapper;
import org.eclipse.emf.teneo.simpledom.Element;

/**
 * The abstract class for different mappers.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.9 $
 */

public class BasicMapper extends AbstractMapper implements ExtensionPoint {
	/** The logger for all these exceptions */
	protected static final Log log = LogFactory.getLog(BasicMapper.class);

	/** Handles a normal basic attribute */
	public void map(PAnnotatedEAttribute aAttribute, Element eclassElement) {
		log.debug("Processing basic field: " + aAttribute.getAnnotatedElement().getName());
		Element field = eclassElement.addElement("field");
		field.addAttribute("name",
			namingHandler.correctName(mappingContext, (EStructuralFeature) aAttribute.getAnnotatedElement()))
			.addAttribute("persistence-modifier", "persistent");

		final EAttribute eAttribute = aAttribute.getAnnotatedEAttribute();

		// special case
		if (eAttribute.getEType().getInstanceClass() != null && eAttribute.getEType().getInstanceClass().isArray()) {
			// handle arrays differently
			field.addAttribute("embedded", "true");
			field.addElement("array").addAttribute("embedded-element", "true");
			return; // and return from here
		}

		// handle the column
		Column overridden = mappingContext.getOverride(aAttribute);
		if (overridden != null) {
			mappingContext.getColumnMapper().map(overridden, field);
		} else if (aAttribute.getColumn() != null) {
			mappingContext.getColumnMapper().map(aAttribute.getColumn(), field);
		} else if (mappingContext.getEmbeddingFeature() != null) { // embedded at least override
			final PAnnotatedEStructuralFeature pae = mappingContext.getEmbeddingFeature();
			final String name =
					pae.getAnnotatedEStructuralFeature().getName() + "_" +
							aAttribute.getAnnotatedEAttribute().getName() + "_ID";
			field.addAttribute("column", name);
		}

		// note defaults are handled by emf, so therefore no null-value=default
		field.addAttribute("null-value", (mappingContext.isForceOptional() || aAttribute.getBasic().isOptional()
				? "none" : "exception"));
		Class instanceClass = eAttribute.getEAttributeType().getInstanceClass();

		if (Object.class.equals(instanceClass)) {
			// add embedded if not part of the java.lang package or if it's the java.lang.Object
			// is done to prevent jpox from incorrectly thinking that custom types are reference
			// types
			// TODO: what to do about interfaces?
			// field.addAttribute("embedded", "true");
			field.addAttribute("serialized", "true");
		} else if (instanceClass.getName().indexOf(".") != -1 &&
				!Object.class.getPackage().equals(instanceClass.getPackage())) {
			// add embedded if not part of the java.lang package or if it's the java.lang.Object
			// is done to prevent jpox from incorrectly thinking that custom types are reference
			// types
			// TODO: what to do about interfaces?
			field.addAttribute("embedded", "true");
		}

		// handle the case of the isset members
		if (aAttribute.requiresIsSetMapping()) {
			eclassElement.addElement("field").addAttribute("name", eAttribute.getName() + "ESet").addAttribute(
				"persistence-modifier", "persistent");
		}

		// if (false && aAttribute.getAnnotatedEAttribute().isUnique()) {
		// field.addElement("unique");
		// }
	}
}