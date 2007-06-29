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
 * $Id: QualifyingEntityNameStrategy.java,v 1.1 2007/06/29 07:31:47 mtaal Exp $
 */

package org.eclipse.emf.teneo.mapping.strategy.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.teneo.mapping.strategy.EntityNameStrategy;

/**
 * This implementation prefixes the eclass names with the epackage nsprefix. This
 * makes it possible to handle eclass name clashes between different packages.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class QualifyingEntityNameStrategy implements EntityNameStrategy {

	public static final QualifyingEntityNameStrategy INSTANCE = new QualifyingEntityNameStrategy();

	public String toEntityName(EClass eClass) {
		if (eClass == null) {
			throw new IllegalArgumentException("EClass cannot be null.");
		}
		if (eClass == EOBJECT_ECLASS) {
			return EOBJECT_ECLASS_NAME;
		}
		String nsPrefix = eClass.getEPackage().getNsPrefix();
		if (nsPrefix == null) {
			nsPrefix = eClass.getEPackage().getName();
		}
		return nsPrefix + "." + eClass.getName();
	}

	public EClass toEClass(String eClassStr, EPackage[] epackages) {
		if (eClassStr == null) {
			throw new IllegalArgumentException("eClassStr may not be null");
		}

		if (eClassStr.compareTo(EOBJECT_ECLASS_NAME) == 0) {
			return EcorePackage.eINSTANCE.getEObject();
		}

		// get prefix or name
		final int index = eClassStr.lastIndexOf(".");
		if (index == -1) {
			throw new IllegalArgumentException(
				"Illegal eClassStr for this resolver (no dot separating the epackage nsprefix and name): " + eClassStr);
		}
		final String nsPrefix = eClassStr.substring(0, index);
		final String eClassName = eClassStr.substring(index + 1);

		// now try all epackages
		EClass eClass = null;
		for (final EPackage ePackage : epackages) {
			if (ePackage.getNsPrefix().compareTo(nsPrefix) == 0 || ePackage.getName().compareTo(nsPrefix) == 0) {
				final EClassifier eClassifier = ePackage.getEClassifier(eClassName);
				if (eClassifier instanceof EClass) {
					if (eClass != null) {
						// doubly entry! Actually require different resolver
						throw new IllegalArgumentException(
							"There is more than one EClass with the same identifying String (" + eClassStr
									+ " in EPackage " + eClass.getEPackage().getName() + " and " + ePackage.getName()
									+ ". A different EClassResolver should be used.");
					}
					eClass = (EClass) eClassifier;
				}
			}
		}
		if (eClass == null) {
			throw new IllegalArgumentException("No EClass found using " + eClassStr);
		}
		return eClass;
	}
}
