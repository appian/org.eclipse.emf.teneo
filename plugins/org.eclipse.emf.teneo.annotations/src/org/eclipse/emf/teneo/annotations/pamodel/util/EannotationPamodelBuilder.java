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
 * $Id: EannotationPamodelBuilder.java,v 1.4 2006/08/31 22:46:54 mtaal Exp $
 */

package org.eclipse.emf.teneo.annotations.pamodel.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEModelElement;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;
import org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage;
import org.eclipse.emf.teneo.annotations.pannotation.PAnnotation;
import org.eclipse.emf.teneo.annotations.pannotation.util.EAnnotationImporter;

/**
 * Convenience class for building a PAnnotatedModel using the EAnnotation s
 * defined on ecore EModelElement s.
 * 
 * <p>
 * Whenever a model element is added for the first time to the target model, its
 * EAnnotation are interpreted as PAnnotation
 * ({@see org.eclipse.emf.teneo.annotations.pannotation.util.EAnnotationImporter})
 * and added to the target model.
 * 
 * <p>The error handling logic can be customized redefining the corresponding
 * methods.
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 */
public class EannotationPamodelBuilder extends BasicPamodelBuilder {
	
	private static final Log log = LogFactory.getLog(EannotationPamodelBuilder.class);

	protected EAnnotationImporter eaImporter = new EAnnotationImporter(
			new EAnnotationImporter.Handler() {
				public void handle(PAnnotation pAnnotation) {
					// TODO handle possible exceptions and report them as error
					EannotationPamodelBuilder.this.setPAnnotation(annotationTarget, pAnnotation);
				}
				public void warning(String msg, EAnnotation source) {
					EannotationPamodelBuilder.this.warning(msg, source);
				}
				public void error(String msg, EAnnotation source) {
					EannotationPamodelBuilder.this.error(msg, source);
				}
			});

	/** set of elements whose EAnnotation have already been processed */
	protected Set processedElements;

	/** the target of the EAnnotation processing */
	protected PAnnotatedEModelElement annotationTarget;
	
	/**
 	 * If the given argument has not yet been processed, also process and add
	 * its EAnnotation s.
	 */
	protected PAnnotatedEModelElement create(EModelElement eModelElement) {
		PAnnotatedEModelElement annotatedEModelElement = super.create(eModelElement);
		try {
			annotationTarget = annotatedEModelElement;
			eaImporter.process(eModelElement);
		} finally {
			annotationTarget = null;
		}
		return annotatedEModelElement;
	}
	
	/**
	 * Report a warning via logging.
	 */
	protected void warning(String msg, EAnnotation source) {
		log.warn(msg + " annotation: " + source.getSource() + " " + source.getEModelElement());
	}

	/**
	 * Report an error via logging and throws an IllegalArgumentException. 
	 */
	protected void error(String msg, EAnnotation source) {
		log.error(msg + " annotation: " + source.getSource() + " " + source.getEModelElement());
		throw new IllegalArgumentException(msg + " annotation: " + source.getSource() + " " + source.getEModelElement());
	}
	
	/**
	 * @see BasicPamodelBuilder#setPAnnotatedModel(PAnnotatedModel)
	 */
	public void setPAnnotatedModel(PAnnotatedModel target) {
		super.setPAnnotatedModel(target);
		processedElements = new HashSet();
	}
	
	/** Processes the annotated model and imports eannotations into it */
	public void processCurrentPAnnotatedModel() {
		Iterator it = super.getPAnnotatedModel().getPaEPackages().iterator();
		while (it.hasNext()) {
			PAnnotatedEPackage pep = (PAnnotatedEPackage)it.next();
			addRecurse(pep.getAnnotatedEPackage());
		}
	}
	
	/**
	 * Add the given annotation to the given PAnnotatedEModelElement.
	 * @throws IllegalArgumentException if the given PAnnotation
	 * is not admitted for the given PAnnotatedEModelElement.
	 */
	protected void setPAnnotation(PAnnotatedEModelElement pElement, PAnnotation pAnnotation) {
		EReference pAnnotationRef = PamodelPackage.eINSTANCE.pAnnotationReference(pElement.eClass(), pAnnotation.eClass());
		if (pAnnotationRef == null)
			throw new IllegalArgumentException("PAnnotation of type '" + pAnnotation.eClass() 
					+ "' does not apply to elements of type '" + pElement.eClass() + "'");
		pElement.eSet(pAnnotationRef, pAnnotation);
	}

	/**
	 * Interpret the EAnnotation of the given EModelElement as PAnnotation
	 * ({@see org.eclipse.emf.teneo.annotations.pannotation.util.EAnnotationImporter})
	 * and add them to the model.
	 * 
	 * <p>NOTE: the EAnnotation are reread no matter if already processed.
	 */
	public void addEAnnotations(EModelElement eModelElement) {
		PAnnotatedEModelElement pElement = pElement(eModelElement);
		try {
			annotationTarget = pElement;
			eaImporter.process(eModelElement);
			processedElements.add(eModelElement);
		} finally {
			annotationTarget = null;
		}
	}
}
