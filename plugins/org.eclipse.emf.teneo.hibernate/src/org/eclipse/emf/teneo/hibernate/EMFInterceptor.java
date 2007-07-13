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
 * $Id: EMFInterceptor.java,v 1.9 2007/07/13 12:21:13 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.teneo.extension.ExtensionInitializable;
import org.eclipse.emf.teneo.extension.ExtensionManager;
import org.eclipse.emf.teneo.extension.ExtensionManagerAware;
import org.eclipse.emf.teneo.extension.ExtensionPoint;
import org.eclipse.emf.teneo.mapping.strategy.EntityNameStrategy;
import org.hibernate.EmptyInterceptor;

/**
 * Intercepts the getEntityName call to return the EClass name as the entity name.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.9 $
 */

public class EMFInterceptor extends EmptyInterceptor implements ExtensionPoint, ExtensionManagerAware,
		ExtensionInitializable {

	/**
	 * Generated Serial Version ID
	 */
	private static final long serialVersionUID = 1680117509182298808L;

	/** The qualify property used to compute the eclassname */
	private EntityNameStrategy qualifyStrategy;

	private ExtensionManager extensionManager;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.extension.ExtensionManagerAware#setExtensionManager(org.eclipse.emf.teneo.extension.ExtensionManager)
	 */
	public void setExtensionManager(ExtensionManager extensionManager) {
		this.extensionManager = extensionManager;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.extension.ExtensionInitializable#initializeExtension()
	 */
	public void initializeExtension() {
		qualifyStrategy = extensionManager.getExtension(EntityNameStrategy.class);
	}

	/**
	 * Is overridden to return the eclass uri as the entity name.
	 * 
	 * @see org.hibernate.EmptyInterceptor#getEntityName(java.lang.Object)
	 */
	@Override
	public String getEntityName(Object object) {
		if (object instanceof EObject) {
			// TODO handle featuremap
			EObject eobj = (EObject) object;
			return qualifyStrategy.toEntityName(eobj.eClass());
		}

		return super.getEntityName(object);
	}
}