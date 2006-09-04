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
 * $Id: EAnnotationParserImporter.java,v 1.3 2006/09/04 15:42:11 mtaal Exp $
 */

package org.eclipse.emf.teneo.annotations.parser;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEModelElement;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage;

/**
 * Walks over the pamodel and the paepackages and translates eannotations to 
 * pannotation types and sets the corresponding values in the pamodel.
 * 
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
public class EAnnotationParserImporter implements EClassResolver {
	/** Log it */
	private final static Log log = LogFactory.getLog(EAnnotationParserImporter.class);

	/** annotation parser */
	private AnnotationParser annotationParser = new AnnotationParser();
	
	/** Parse an pamodel */
	public void process(PAnnotatedModel paModel) {
		for (Iterator it = paModel.getPaEPackages().iterator(); it.hasNext();) {
			final PAnnotatedEPackage pap = (PAnnotatedEPackage)it.next();
			log.debug("Processing package " + pap.getAnnotatedEPackage().getName());
			processAnnotatedModelElement(pap, pap.eClass().getEPackage());

			// and now the eclasses 
			process(pap);
		}
	}
	
	/** Process package */
	protected void process(PAnnotatedEPackage pap) {
		for (Iterator it = pap.getPaEClasses().iterator(); it.hasNext();) {
			final PAnnotatedEClass pac = (PAnnotatedEClass)it.next();
			processAnnotatedModelElement(pac, pac.getAnnotatedEClass().getEPackage());
			process(pac);
		}
	}
	
	/** Process the efeatures */
	protected void process(PAnnotatedEClass pac) {
		log.debug("Processing eclass " + pac.getAnnotatedEClass().getName());
		for (Iterator it = pac.getPaEStructuralFeatures().iterator(); it.hasNext();) {
			final PAnnotatedEStructuralFeature paf = (PAnnotatedEStructuralFeature)it.next();
			processAnnotatedModelElement(paf, paf.getAnnotatedEStructuralFeature().eClass().getEPackage());
		}
	}
	
	/** Process a type with its eannotations */
	protected void processAnnotatedModelElement(PAnnotatedEModelElement pee, EPackage epack) {
		log.debug("Processing " + pee.getAnnotatedElement().getName());
		final ArrayList parsedNodes = new ArrayList();
		for (Iterator it = pee.getAnnotatedElement().getEAnnotations().iterator(); it.hasNext();) {
			parsedNodes.addAll(process((EAnnotation)it.next(), pee.getAnnotatedElement()));
		}
		
		// now also do the annotations on the edatatype (if any)
		if (pee.getAnnotatedElement() instanceof EAttribute) {
			final EAttribute eattr = (EAttribute)pee.getAnnotatedElement();
			final EDataType edt = (EDataType)eattr.getEType();
			for (Iterator it = edt.getEAnnotations().iterator(); it.hasNext();) {
				parsedNodes.addAll(process((EAnnotation)it.next(), pee.getAnnotatedElement()));
			}
		}
		
		// now the parsed nodes should be translated into features of the enamedelement
		// this is done multiplelevel
		log.debug("Number of parsed typename annotations " + parsedNodes.size());
		final ArrayList objects = new ArrayList();
		for (Iterator it = parsedNodes.iterator(); it.hasNext();) {
			final ComplexNode cn = (ComplexNode)it.next();
			if (cn.isList()) {
				// find the efeature
				final EStructuralFeature ef = ParserUtil.getEStructuralFeature(pee.eClass(), cn.getName());
				pee.eSet(ef, cn.convert(this));
			} else {
				EObject eobj = (EObject)cn.convert(this);
				boolean found = false;
				for (Iterator eit = pee.eClass().getEAllReferences().iterator(); eit.hasNext();) {
					final EReference eref = (EReference)eit.next();
					if (eref.getEReferenceType() == eobj.eClass()) {
						log.debug("Found EReference " + eref.getName() + " for " + eobj.eClass().getName());
						if (eref.isMany()) {
							((List)pee.eGet(eref)).add(eobj);
						} else {
							pee.eSet(eref, eobj);
						}
						found = true;
						break;
					}
				}
				if (!found) {
					throw new AnnotationParserException("The eclass: " + pee.eClass().getName() + 
							" does not have an efeature for " + eobj.eClass().getName());
				}
			}
		}
		
		// now for each eobject find which eref stores it!
		log.debug("Find efeature for each created eobject");
		for (Iterator it = objects.iterator(); it.hasNext();) {
			EObject eobj = (EObject)it.next();
			log.debug("EClass " + eobj.eClass().getName());
			
		}
	}

	/** Processes EAnnotations */
	private ArrayList process(EAnnotation ea, ENamedElement ene) {
		final ArrayList result = new ArrayList();

		if (!isValidSource(ea.getSource())) {
			return result;
		}
		
		log.debug("Processing annotations ");
		for (Iterator i = ea.getDetails().entrySet().iterator(); i.hasNext();) {
			final Map.Entry pAnnotationDetails = (Map.Entry) i.next();
			String fName = (String) pAnnotationDetails.getKey();
			// todo externalize
			if (fName.compareTo("appinfo") == 0 || fName.compareTo("value") == 0) {
				log.debug("Annotation content: \n " + (String)pAnnotationDetails.getValue());
				result.addAll(annotationParser.parse(ene, (String)pAnnotationDetails.getValue()));
			}
		}
		return result;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.teneo.annotations.parser.EClassResolver#getEClass(java.lang.String)
	 */
	public EClass getEClass(String name) {
		return (EClass)PannotationPackage.eINSTANCE.getEClassifier(name);
	}

	/** Is a valid source */
	protected boolean isValidSource(String source) {
		if (source == null) return false;
		return source.startsWith("teneo.jpa") ||
			source.startsWith("teneo.mapping");
	}
}