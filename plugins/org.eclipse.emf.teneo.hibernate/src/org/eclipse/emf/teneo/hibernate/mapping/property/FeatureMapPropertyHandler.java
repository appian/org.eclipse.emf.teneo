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
 * $Id: FeatureMapPropertyHandler.java,v 1.1 2006/07/05 22:29:30 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.property;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.teneo.hibernate.mapping.elist.HibernatePersistableFeatureMap;
import org.eclipse.emf.teneo.util.AssertUtil;
import org.eclipse.emf.teneo.util.StoreUtil;

/**
 * Implements the accessor for EMF FeatureMap members for Hibernate. Overrides the createPersistableList to create a
 * HibernatePersistableFeatureMap instead of a normal list.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */

public class FeatureMapPropertyHandler extends EListPropertyHandler {
	/** Constructor */
	public FeatureMapPropertyHandler(EStructuralFeature eFeature) {
		super(eFeature);
		AssertUtil.assertTrue("Is not a featuremap feature " + StoreUtil.toString(eFeature), FeatureMapUtil
				.isFeatureMap(eFeature));
	}

	/** Create method can be overridden */
	protected EList createPersistableList(InternalEObject target, EStructuralFeature estruct, List list) {
		return new HibernatePersistableFeatureMap(target, estruct, list);
	}
}