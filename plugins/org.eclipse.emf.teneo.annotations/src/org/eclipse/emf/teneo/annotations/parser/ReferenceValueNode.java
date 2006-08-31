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
 * $Id: ReferenceValueNode.java,v 1.3 2006/08/31 23:47:09 mtaal Exp $
 */

package org.eclipse.emf.teneo.annotations.parser;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EObject;


/**
 * Simple value node
 * 
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
class ReferenceValueNode extends ParserNode {
	/** Log it */
	private final static Log log = LogFactory.getLog(ArrayValueNode.class);

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
	EObject convert(EClassResolver ecr) {
		log.debug("Converting reference node " + getName());
		if (!(value instanceof ComplexNode)) {
			throw new AnnotationParserException("A reference annotation value may only " +
					"contain a typename");
		}
		final ComplexNode cn = (ComplexNode)value;
		return cn.convert(ecr);
	}
}
