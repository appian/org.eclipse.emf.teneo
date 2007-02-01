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
 * $Id: NonLoadingDiagnostician.java,v 1.2 2007/02/01 12:34:22 mtaal Exp $
 */

package org.eclipse.emf.teneo.resource;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;

/**
 * Extends the default EMF Diagnostican to prevent the validation to load unloaded lists.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */

public class NonLoadingDiagnostician extends Diagnostician {

	/** The instance */
	public static NonLoadingDiagnostician INSTANCE = new NonLoadingDiagnostician();

	/** Overriden to prevent loading of complete content */
	protected boolean doValidateContents(EObject eObject, DiagnosticChain diagnostics, Map context) {
		List eContents = NonLoadingEContentsEList.create(eObject, true);
		if (!eContents.isEmpty()) {
			Iterator i = eContents.iterator();
			EObject child = (EObject) i.next();
			boolean result = validate(child, diagnostics, context);
			while (i.hasNext() && (result || diagnostics != null)) {
				child = (EObject) i.next();
				result &= validate(child, diagnostics, context);
			}
			return result;
		} else {
			return true;
		}
	}
}
