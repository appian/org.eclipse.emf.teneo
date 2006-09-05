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
 *   Douglas Bitting
 * </copyright>
 *
 * $Id: HbAnnotationModelBuilder.java,v 1.5 2006/09/05 14:06:15 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbannotation.util;

import java.util.List;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEModelElement;
import org.eclipse.emf.teneo.annotations.pamodel.util.EannotationPamodelBuilder;
import org.eclipse.emf.teneo.annotations.pannotation.PAnnotation;
import org.eclipse.emf.teneo.annotations.pannotation.util.EAnnotationImporter;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbModelFactory;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbModelPackage;

/**
 * This class create the Hibernate-model versions of the various PaAnnotatedE* objects. 
 */
public class HbAnnotationModelBuilder extends EannotationPamodelBuilder {
	
	/** If true then behaves like a basic model builder */
	private final boolean disableAnnotationImport;
	
	/** Constructor */
	public HbAnnotationModelBuilder(boolean disableAnnotationImport) {
		this.disableAnnotationImport = disableAnnotationImport;
		this.eaImporter = new HbAnnotationImporter( 
			new EAnnotationImporter.Handler() {
				public void handle(PAnnotation pAnnotation) {
					// TODO handle possible exceptions and report them as error
					HbAnnotationModelBuilder.this.setPAnnotation(annotationTarget, pAnnotation);
				}
				public void warning(String msg, EAnnotation source) {
					HbAnnotationModelBuilder.this.warning(msg, source);
				}
				public void error(String msg, EAnnotation source) {
					HbAnnotationModelBuilder.this.error(msg, source);
				}
			});
	}
	
	public HbAnnotationModelBuilder() {
		this(false);
	}

	/**
	 * Add the given annotation to the given PAnnotatedEModelElement.
	 * @throws IllegalArgumentException if the given PAnnotation
	 * is not admitted for the given PAnnotatedEModelElement.
	 */
	protected void setPAnnotation(PAnnotatedEModelElement pElement, PAnnotation pAnnotation) {
		if (disableAnnotationImport) return;
		
		if (pAnnotation == null) return; //ignore to not fail on old annotations
		EReference pAnnotationRef = HbModelPackage.eINSTANCE.pAnnotationReference(pElement.eClass(), pAnnotation.eClass());
		if (pAnnotationRef == null) {
			super.setPAnnotation(pElement, pAnnotation);
		} else if (pAnnotationRef.isMany()) { 
			((List)pElement.eGet(pAnnotationRef)).add(pAnnotation);
		} else {
			pElement.eSet(pAnnotationRef, pAnnotation);
		}
	}

	protected PAnnotatedEModelElement doCreate(EModelElement eModelElement) throws AssertionError {
		final EClass eModelElementEClass = eModelElement.eClass();
		PAnnotatedEModelElement paElement;
		switch (eModelElementEClass.getClassifierID()) {
		case EcorePackage.EATTRIBUTE:
			paElement = HbModelFactory.eINSTANCE.createHbAnnotatedEAttribute();
			break;
		case EcorePackage.EREFERENCE:
			paElement = HbModelFactory.eINSTANCE.createHbAnnotatedEReference();
			break;
		case EcorePackage.ECLASS:
			paElement = HbModelFactory.eINSTANCE.createHbAnnotatedEClass();
			break;
		case EcorePackage.EPACKAGE:
			paElement = HbModelFactory.eINSTANCE.createHbAnnotatedEPackage();
			break;
		default:
			throw new AssertionError("Trying to build HbAnnotatedEModelElement for a " + eModelElementEClass);
		}
		paElement.setAnnotatedElement((ENamedElement) eModelElement);
		return paElement;
	}
}
