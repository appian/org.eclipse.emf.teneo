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
 * $Id: FeatureMapPropertyHandler.java,v 1.4 2007/02/08 23:11:37 mtaal Exp $
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
 * Implements the accessor for EMF FeatureMap members for Hibernate. Overrides
 * the createPersistableList to create a HibernatePersistableFeatureMap instead
 * of a normal list.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
@SuppressWarnings("unchecked")
public class FeatureMapPropertyHandler extends EListPropertyHandler {
	/**
	 * Generated Serial Version ID
	 */
	private static final long serialVersionUID = -5220024660708935714L;

	/** Constructor */
	public FeatureMapPropertyHandler(EStructuralFeature eFeature) {
		super(eFeature, false);
		AssertUtil.assertTrue("Is not a featuremap feature "
				+ StoreUtil.toString(eFeature), FeatureMapUtil
				.isFeatureMap(eFeature));
	}

	/** Create method can be overridden */
	protected EList createPersistableList(InternalEObject target,
			EStructuralFeature estruct, List list) {
		return new HibernatePersistableFeatureMap(target, estruct, list);
	}
}