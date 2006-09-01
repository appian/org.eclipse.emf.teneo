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
 * $Id: ArrayValueNode.java,v 1.4 2006/09/01 07:02:28 mtaal Exp $
 */

package org.eclipse.emf.teneo.annotations.parser;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * An array node contains a list of child values.
 * 
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
class ArrayValueNode extends ParserNode{
	/** Log it */
	private final static Log log = LogFactory.getLog(ArrayValueNode.class);

	/** The value */
	private List children = new ArrayList();

	/** Returns the list */
	List getChildren() {
		return children;
	}
	
	/** Translate into a list of eobjects */
	List convert(EClassResolver ecr) {
		log.debug("Converting array value node");

		final ArrayList result = new ArrayList();
		for (Iterator it = children.iterator(); it.hasNext();) {
			final ParserNode pn = (ParserNode)it.next();
			if (pn instanceof ComplexNode) {
				final ComplexNode cn = (ComplexNode)pn;
				result.add(cn.convert(ecr));
			} else if (pn instanceof ReferenceValueNode) {
				final ReferenceValueNode rvn = (ReferenceValueNode)pn;
				result.add(rvn.convert(ecr));
			} else if (pn instanceof ArrayValueNode) {
				final ArrayValueNode avn = (ArrayValueNode)pn;
				result.addAll(avn.convert(ecr));
			} else {
				throw new AnnotationParserException("Type " + pn.getClass().getName() + "/" + pn.getName() +
						" not supported here");
			}
		}
		return result;
	}	

}
