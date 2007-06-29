/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: EntityNameStrategy.java,v 1.1 2007/06/29 07:31:47 mtaal Exp $
 */

package org.eclipse.emf.teneo.mapping.strategy;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

/**
 * Converter from entityname to and from an eclass. The entityname is used in the
 * hql, etc.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public interface EntityNameStrategy {

	/** The EObject eclass */
	public static EClass EOBJECT_ECLASS = (EClass) EcorePackage.eINSTANCE.getEClassifier("EObject");

	/** The EObject eclass name */
	public static String EOBJECT_ECLASS_NAME = EcorePackage.eINSTANCE.getName() + "_" + EOBJECT_ECLASS.getName();

	/**
	 * Determines the name for a given EClass. This name can be used in jsf
	 * pages and queries.
	 * 
	 * Note if the eClass is the EObject eclass then the string
	 * EOBJECT_ECLASS_NAME must be returned.
	 */
	public String toEntityName(EClass eClass);

	/**
	 * Return the EClass for a certain name, searches in the array of epackages
	 */
	public EClass toEClass(String eClassName, EPackage[] epackages);
}