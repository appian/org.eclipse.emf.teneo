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
 * $Id: EmbeddedMapper.java,v 1.11 2008/07/13 13:12:38 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.mapper.association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.extension.ExtensionPoint;
import org.eclipse.emf.teneo.jpox.mapper.AbstractMapper;
import org.eclipse.emf.teneo.simpledom.Element;

/**
 * The abstract class for different mappers.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.11 $
 */

public class EmbeddedMapper extends AbstractMapper implements ExtensionPoint {
	/** The logger for all these exceptions */
	protected static final Log log = LogFactory.getLog(EmbeddedMapper.class);

	/** Handles a normal basic attribute */
	public void map(PAnnotatedEReference aReference, Element fieldElement) {
		log.debug("Processing embedded field: " + aReference.getModelElement().getName());

		mappingContext.pushOverrideOnStack();
		mappingContext.addAttributeOverrides(aReference.getAttributeOverrides());
		mappingContext.addAssociationOverrides(aReference.getAssociationOverrides());

		EReference eReference = aReference.getModelEReference();
		if (eReference.isMany() || eReference.getEOpposite() != null || aReference.getAttributeOverrides().size() > 0) {
			Element embeddedElement = fieldElement.addElement("embedded");
			if (eReference.getEOpposite() != null) {
				embeddedElement.addAttribute("owner-field", namingHandler.correctName(mappingContext, eReference
					.getEOpposite()));
			}

			// now map the embedded class
			PAnnotatedEClass aClass = aReference.getPaModel().getPAnnotated(eReference.getEReferenceType());
			mappingContext.getEClassFeatureMapper().map(aClass, embeddedElement);
		} else {
			fieldElement.addAttribute("embedded", "true");
		}
		mappingContext.popOverrideStack();
	}
}