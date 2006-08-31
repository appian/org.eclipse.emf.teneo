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
 * $Id: ArrayValueNode.java,v 1.1 2006/08/31 15:33:17 mtaal Exp $
 */

package org.eclipse.emf.teneo.annotations.parser;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;


/**
 * An array node contains a list of child values
 * 
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
class ArrayValueNode extends ParserNode{

	/** The value */
	private List children = new ArrayList();

	/** Returns the list */
	List getChildren() {
		return children;
	}
	
	/** Translate into a list of eobjects */
	List convert(EPackage ePackage) {
		final ArrayList result = new ArrayList();
		for (Iterator it = children.iterator(); it.hasNext();) {
			final ParserNode pn = (ParserNode)it.next();
			if (!(pn instanceof ComplexNode)) {
				throw new AnnotationParserException("An array annotation value may only contain typenames and not primitive values");
			}
			final ComplexNode cn = (ComplexNode)pn;
			result.add(cn.convert(ePackage));
		}
		return result;
	}	

}
