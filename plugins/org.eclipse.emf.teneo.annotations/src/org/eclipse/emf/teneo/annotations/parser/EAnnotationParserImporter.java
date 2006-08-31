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
 * $Id: EAnnotationParserImporter.java,v 1.1 2006/08/31 15:33:17 mtaal Exp $
 */

package org.eclipse.emf.teneo.annotations.parser;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;

/**
 * Walks over the pamodel and the paepackages and translates eannotations to 
 * pannotation types and sets the corresponding values in the pamodel.
 * 
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
class EAnnotationParserImporter {
	/** Log it */
	private final static Log log = LogFactory.getLog(EAnnotationParserImporter.class);

	/** annotation parser */
	private AnnotationParser annotationParser = new AnnotationParser();
	
	/** Parse an pamodel */
	public void process(PAnnotatedModel paModel) {
		for (Iterator it = paModel.getPaEPackages().iterator(); it.hasNext();) {
			final PAnnotatedEPackage pae = (PAnnotatedEPackage)it.next();
		}
	}
	
	/** Process a type with its eannotations */
	public void process(ENamedElement ene) {
		final ArrayList parsedNodes = new ArrayList();
		for (Iterator it = ene.getEAnnotations().iterator(); it.hasNext();) {
			final EAnnotation ea = (EAnnotation)it.next();
			for (Iterator i = ea.getDetails().entrySet().iterator(); i.hasNext();) {
				Map.Entry pAnnotationDetails = (Map.Entry) i.next();
				String fName = (String) pAnnotationDetails.getKey();
				if (fName.compareTo("appinfo") == 0 || fName.compareTo("value") == 0) {
					parsedNodes.addAll(
							annotationParser.parse(ene, (String)pAnnotationDetails.getValue()));
				}
			}
		}
		
		// now the parsed nodes should be translated into features of the enamedelement
		// this is done multiplelevel
	}
	
	/** Is a valid source */
	protected boolean isValidSource(String source) {
		return source.startsWith("teneo.jpa") ||
			source.startsWith("teneo.mapping");
	}
}
