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
 * $Id: HbEAnnotationParserImporter.java,v 1.1 2006/08/31 22:47:19 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbannotation.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.teneo.annotations.parser.EAnnotationParserImporter;
import org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotationPackage;

/**
 * Overrides the default EAnnotationParserImporter to add a hibernate source
 */
public class HbEAnnotationParserImporter extends EAnnotationParserImporter {

	/** Returns true if the source is a hibernate source or a generic source */
	protected boolean isValidSource(String source) {
		if (source == null) return false;
		return source.startsWith("teneo.hibernate") || super.isValidSource(source);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.teneo.annotations.parser.EClassResolver#getEClass(java.lang.String)
	 */
	public EClass getEClass(String name) {
		final EClass eClass = (EClass)HbAnnotationPackage.eINSTANCE.getEClassifier(name);
		if (eClass == null) {
			return super.getEClass(name);
		}
		return eClass;
	}
}
