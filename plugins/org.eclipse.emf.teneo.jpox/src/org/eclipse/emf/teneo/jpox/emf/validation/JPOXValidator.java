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
 * $Id: JPOXValidator.java,v 1.1 2006/07/08 22:04:29 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.emf.validation;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * Overrides the standard validator for only one purpose to prevent the is every reference contained in the same
 * resource check. With a relational store there is not always a resource!
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $ $Date: 2006/07/08 22:04:29 $
 */

public class JPOXValidator extends EObjectValidator {
	/**
	 * Overrides the method from the superclass to prevent this check because it is not required in the context of a jdo
	 * store. Note that this assumes that an object and its references are all stored in the same jpox database.
	 */
	public boolean validate_EveryReferenceIsContained(EObject eObject, DiagnosticChain diagnostics, Map context) {
		return true;
	}
}
