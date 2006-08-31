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
 * $Id: HbAnnotationImporter.java,v 1.2 2006/08/31 22:47:19 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.hbannotation.util;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.teneo.annotations.pannotation.util.EAnnotationImporter;
import org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotationPackage;

/**
 * This class interprets the annotation importing process based on the hibernate.elver.org annotation model. The main
 * difference between this and EAnnotationImporter is that this class understands that hibernate annotations begin with
 * http://hibernate.elver.org/ or teneo.hibernate:.
 */
public class HbAnnotationImporter extends EAnnotationImporter {

	/** Constructor */
	public HbAnnotationImporter(Handler handler) {
		super(handler);
	}

	/** Returns true if this is a hbAnnotation */
	private final boolean isHbAnnotation(EAnnotation eAnnotation) {
		return isHbAnnotation(eAnnotation.getSource());
	}

	/** Returns true if this is a hbAnnotation */
	private final boolean isHbAnnotation(final String source) {
		return null != getHbPrefix(source);
	}

	/**
	 * Return the hbAnnotation EClass if this is an hb eannotation, otherwise redirect to superclass
	 */
	public EClass getPAnnotationEClass(EAnnotation eAnnotation) {
    	if (isHbAnnotation(eAnnotation)) { 
    		final EClass eclass = getEClass(eAnnotation.getSource(), 
    				getHbPrefix(eAnnotation.getSource()),
                HbAnnotationPackage.eINSTANCE);
    		return eclass;
    	} else {
    		return super.getPAnnotationEClass(eAnnotation);
    	}
    }

	/** Returns the prefixes, first tries the hibernate prefixes and then the general prefixes */
	protected String getPrefix(String source) {
		String result = getHbPrefix(source);
		return (null == result) ? super.getPrefix(source) : result;
	}

	/**
	 * Returns the prefix of the annotation source, search uses using the prefixes defined in the annotation
	 * teneo.mapping.source on the epackage
	 */
	private String getHbPrefix(String source) {
		if (source == null) {
			return null;
		}
		final Collection prefixes = HbAnnotationPackage.eINSTANCE.getEAnnotation("teneo.mapping.source").getDetails()
				.values();
		for (Iterator iter = prefixes.iterator(); iter.hasNext();) {
			String prefix = (String) iter.next();
			if (source.startsWith(prefix)) {
				return prefix;
			}
		}
		return null;
	}
}