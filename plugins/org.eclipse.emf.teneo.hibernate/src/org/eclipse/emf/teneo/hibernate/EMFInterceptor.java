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
 *   Martin Taal
 * </copyright>
 *
 * $Id: EMFInterceptor.java,v 1.5 2007/02/08 23:11:37 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.ecore.EClassNameStrategy;
import org.hibernate.EmptyInterceptor;

/**
 * Intercepts the getEntityName call to return the EClass name as the entity
 * name.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */

public class EMFInterceptor extends EmptyInterceptor {

	/**
	 * Generated Serial Version ID
	 */
	private static final long serialVersionUID = 1680117509182298808L;

	/** The qualify property used to compute the eclassname */
	private final EClassNameStrategy qualifyStrategy;

	/** Constructor */
	public EMFInterceptor(PersistenceOptions po) {
		qualifyStrategy = po.getEClassNameStrategy();
	}

	/**
	 * Is overridden to return the eclass uri as the entity name.
	 * 
	 * @see org.hibernate.EmptyInterceptor#getEntityName(java.lang.Object)
	 */
	public String getEntityName(Object object) {
		if (object instanceof EObject) {
			// TODO handle featuremap
			EObject eobj = (EObject) object;
			return qualifyStrategy.toUniqueName(eobj.eClass());
		}

		return super.getEntityName(object);
	}
}