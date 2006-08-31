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
 * $Id: ParserUtil.java,v 1.3 2006/08/31 23:47:09 mtaal Exp $
 */

package org.eclipse.emf.teneo.annotations.parser;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * Util class
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */

public class ParserUtil {

	/**
	 * @return Returns the result of converting the String value to the given data type.
	 * @throws EAnnotationImportException
	 */
	public static Object convertValue(EDataType eType, String value)  {
		try {
			return EcoreUtil.createFromString(eType, value);
		} catch (IllegalArgumentException e) {
			throw new AnnotationParserException("Cannot convert '" + value + "' to '" + eType.getName() + "' type", e);
		}
	}
	
	/** Get a structuralfeature */
	public static EStructuralFeature getEStructuralFeature(EClass eClass, String name)  {
		try {
			return eClass.getEStructuralFeature(name);
		} catch (IllegalArgumentException e) {
			throw new AnnotationParserException("Cannot convert '" + name + "' to an efeature for eclass " + eClass.getName());
		}
	}
}
