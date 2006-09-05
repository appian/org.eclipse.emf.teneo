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
 * $Id: ComplexNode.java,v 1.6 2006/09/05 12:16:57 mtaal Exp $
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
class ComplexNode extends NamedParserNode {
	
	/** Log it */
	private final static Log log = LogFactory.getLog(ComplexNode.class);

	/** The child nodes */
	private List children = new ArrayList();

	/** Is set if this is a list */
	private boolean isList = false;
	
	/** Returns the list of children */
	List getChildren() {
		return children;
	}
	
	/** Translate into an eclass */
	Object convert(EClassResolver ecr) {
		log.debug("Converting " + getName() + " to EObject ");
		
		// special case in which the main type is just a list of other types
		// for example SecondaryTables which is just a list of SecondaryTable
		if (isList()) {
			assert(children.size() == 1);
			assert(children.get(0) instanceof ArrayValueNode);
			return ((ArrayValueNode)children.get(0)).convert(ecr);
 		}
		
		final EClass eClass = ecr.getEClass(getName()); 
		if (eClass == null) {
			throw new AnnotationParserException("No eclass found with name " + getName());
		}
		final EObject eobj = EcoreUtil.create(eClass);

		for (Iterator it = children.iterator(); it.hasNext();) {
			final Object child = it.next();
			final NamedParserNode pn = (NamedParserNode)child;
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
			} else if (child instanceof ArrayValueNode && efeature instanceof EAttribute) {
				final EAttribute eattr = (EAttribute)efeature;
				if (!eattr.isMany()) {
					throw new AnnotationParserException("The EFeature " + efeature.getName() + "/" +
							eClass.getName() + " is not ismany");
				}
				log.debug("Array child with primitive values");
				List list = (List)((ArrayValueNode)child).convert(ecr);
				for (Iterator lit = list.iterator(); lit.hasNext();) {
					final String val = (String)lit.next();
					log.debug("Value " + val);
					((List)eobj.eGet(efeature)).add(ParserUtil.convertValue((EDataType)eattr.getEType(), val));
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
				log.debug("Reference child " + pn.getName());
				if (eref.isMany()) {
					((List)eobj.eGet(eref)).add(((ReferenceValueNode)child).convert(ecr));
				} else {
					eobj.eSet(eref, ((ReferenceValueNode)child).convert(ecr));
				}
			}
		}
		return eobj;
	}

	/**
	 * @return the isList
	 */
	public boolean isList() {
		return isList;
	}

	/**
	 * @param isList the isList to set
	 */
	public void setList(boolean isList) {
		this.isList = isList;
	}
}
