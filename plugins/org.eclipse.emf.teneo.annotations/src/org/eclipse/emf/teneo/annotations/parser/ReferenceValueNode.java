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
 * $Id: ReferenceValueNode.java,v 1.1 2006/08/31 15:33:17 mtaal Exp $
 */

package org.eclipse.emf.teneo.annotations.parser;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;


/**
 * Simple value node
 * 
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
class ReferenceValueNode extends ParserNode {

	/** The value */
	private ParserNode value;

	/**
	 * @return the value
	 */
	public ParserNode getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(ParserNode value) {
		this.value = value;
	}
	
	/** Translate into a list of eobjects */
	EObject convert(EPackage ePackage) {
		if (!(value instanceof ComplexNode)) {
			throw new AnnotationParserException("An reference annotation value may only contain a typename");
		}
		final ComplexNode cn = (ComplexNode)value;
		return cn.convert(ePackage);
	}
}
