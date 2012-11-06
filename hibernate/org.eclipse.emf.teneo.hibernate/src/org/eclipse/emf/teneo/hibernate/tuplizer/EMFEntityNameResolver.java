/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: EMFEntityNameResolver.java,v 1.1 2009/06/27 09:20:06 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.tuplizer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.teneo.extension.ExtensionPoint;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.hibernate.EntityNameResolver;

/**
 * Intercepts the getEntityName call to return the EClass name as the entity name.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */

public class EMFEntityNameResolver implements ExtensionPoint, EntityNameResolver {

	private HbDataStore dataStore;

	/*
	 * @see org.hibernate.EntityNameResolver#resolveEntityName(java.lang.Object)
	 */
	public String resolveEntityName(Object entity) {
		if (entity instanceof EObject) {
			// TODO handle featuremap
			EObject eobj = (EObject) entity;
			return dataStore.toEntityName(eobj.eClass());
		}
		return null;
	}

	/**
	 * @return the dataStore
	 */
	public HbDataStore getDataStore() {
		return dataStore;
	}

	/**
	 * @param dataStore
	 *          the dataStore to set
	 */
	public void setDataStore(HbDataStore dataStore) {
		this.dataStore = dataStore;
	}
}