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
 * $Id: ComplexNode.java,v 1.4 2006/09/01 07:02:28 mtaal Exp $
 */

package org.eclipse.emf.teneo.annotations.parser;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;


/**
 * Models a real type (a complex type in xml schema speak), an EClass.
 * 
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
class ComplexNode extends ParserNode {
	
	/** Log it */
	private final static Log log = LogFactory.getLog(ComplexNode.class);

	/** The child nodes */
	private List children = new ArrayList();

	/** Returns the list of children */
	List getChildren() {
		return children;
	}
	
	/** Translate into an eclass */
	EObject convert(EClassResolver ecr) {
		log.debug("Converting " + getName() + " to EObject ");
		
		final EClass eClass = ecr.getEClass(getName()); 
		if (eClass == null) {
			throw new AnnotationParserException("No eclass found with name " + getName());
		}
		final EObject eobj = EcoreUtil.create(eClass);

		for (Iterator it = children.iterator(); it.hasNext();) {
			final Object child = it.next();
			final ParserNode pn = (ParserNode)child;
			final EStructuralFeature efeature = ParserUtil.getEStructuralFeature(eClass, pn.getName());
			if (child instanceof PrimitiveValueNode) {
				final PrimitiveValueNode pvn = (PrimitiveValueNode)child;
				log.debug("Primitive child: " + pvn.getName() + ": " + pvn.getValue());
				if (!(efeature instanceof EAttribute)) {
					throw new AnnotationParserException("The EFeature " + efeature.getName() + "/" +
							eClass.getName() + " is not an eattribute but a " + efeature.getClass().getName());
				}
				final EClassifier eType = efeature.getEType();
				if (!efeature.isMany()) {
					eobj.eSet(efeature, ParserUtil.convertValue((EDataType)eType, pvn.getValue()));
				} else {
					final String[] sources = pvn.getValue().split("\\s+");
					log.debug("Child is many, splitting content into " + sources.length + " parts");
					final List referenced = new ArrayList(sources.length);
					for (int i = 0; i < sources.length; i++) {
						referenced.add(ParserUtil.convertValue((EDataType)eType, sources[i]));
					}
					((List) eobj.eGet(efeature)).addAll(referenced);
				}
			} else if (child instanceof ArrayValueNode) {
				if (!(efeature instanceof EReference)) {
					throw new AnnotationParserException("The EFeature " + efeature.getName() + "/" +
							eClass.getName() + " is not an ereference but a " + efeature.getClass().getName());
				}
				final EReference eref = (EReference)efeature;
				if (!eref.isMany()) {
					throw new AnnotationParserException("The EFeature " + efeature.getName() + "/" +
							eClass.getName() + " is not ismany");
				}
				log.debug("Array child");
				eobj.eSet(eref, ((ArrayValueNode)child).convert(ecr));
			} else if (child instanceof ReferenceValueNode) {
				if (!(efeature instanceof EReference)) {
					throw new AnnotationParserException("The EFeature " + efeature.getName() + "/" +
							eClass.getName() + " is not an ereference but a " + efeature.getClass().getName());
				}
				final EReference eref = (EReference)efeature;
				if (eref.isMany()) {
					throw new AnnotationParserException("The EFeature " + efeature.getName() + "/" +
							eClass.getName() + " is ismany, while a not ismany is expected");
				}
				log.debug("Reference child " + pn.getName());
				eobj.eSet(eref, ((ReferenceValueNode)child).convert(ecr));
			}
		}
		return eobj;
	}
}
