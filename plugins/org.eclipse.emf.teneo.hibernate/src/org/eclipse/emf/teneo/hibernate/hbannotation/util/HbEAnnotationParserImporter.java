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
 * $Id: HbEAnnotationParserImporter.java,v 1.3 2006/09/27 20:37:20 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbannotation.util;

import java.util.Iterator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.teneo.annotations.parser.EAnnotationParserImporter;
import org.eclipse.emf.teneo.hibernate.HbStoreException;
import org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotationPackage;

/**
 * Overrides the default EAnnotationParserImporter to add a hibernate source
 */
public class HbEAnnotationParserImporter extends EAnnotationParserImporter {

	/** The prefix for hibernate types */
	private static final String HB_PREFIX = "hb:";

	/** Returns true if the source is a hibernate source or a generic source */
	protected boolean isValidSource(String source) {
		if (source == null)
			return false;
		return source.startsWith("teneo.hibernate") || super.isValidSource(source);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.annotations.parser.EClassResolver#getEClass(java.lang.String)
	 */
	public EClass getEClass(String name) {
		if (name.startsWith(HB_PREFIX)) {
			return (EClass) HbAnnotationPackage.eINSTANCE.getEClassifier(name.substring(HB_PREFIX.length()));
		} else {
			final EClass eClass = super.getEClass(name);
			if (eClass == null) {
				return (EClass) HbAnnotationPackage.eINSTANCE.getEClassifier(name);
			}
			return eClass;
		}
	}

	/** Find the efeature */
	public EStructuralFeature getEStructuralFeature(EClass eClass, String name) {
		for (Iterator it = eClass.getEAllStructuralFeatures().iterator(); it.hasNext();) {
			final EStructuralFeature ef = (EStructuralFeature) it.next();
			if (ef.getName().compareToIgnoreCase(name) == 0)
				return ef;
		}
		// not found try with the hb prefix
		final String hbName = "hb" + name;
		for (Iterator it = eClass.getEAllStructuralFeatures().iterator(); it.hasNext();) {
			final EStructuralFeature ef = (EStructuralFeature) it.next();
			if (ef.getName().compareToIgnoreCase(hbName) == 0)
				return ef;
		}
		throw new HbStoreException("No efeature " + name + " for eclass " + eClass.getName());
	}
}
