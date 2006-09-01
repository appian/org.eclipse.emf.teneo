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
 * $Id: EcoreAccess.java,v 1.3 2006/09/01 12:19:09 mtaal Exp $
 */

package org.eclipse.emf.ecore.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Internal.DynamicValueHolder;

/**
 * Provides access to package private methods in org.eclipse.emf.ecore.impl
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class EcoreAccess extends BasicEObjectImpl {
	
	/** The singleton */
	private static EcoreAccess INSTANCE = new EcoreAccess();
	
	/** Return the DynamicValueHolder */
	public static DynamicValueHolder getValueHolder(BasicEObjectImpl deo) {
		return INSTANCE.instGetValueHolder(deo);
	}
	
	/** Sets an elist using the passed feature */
	public static void setManyEFeatureValue(EStructuralFeature eFeature, Object value, BasicEObjectImpl owner) {
		INSTANCE.instSetManyEFeatureValue(eFeature, value, owner);
	}	

	/** Gets an elist using the passed feature */
	public static EList getManyEFeatureValue(EStructuralFeature eFeature, BasicEObjectImpl owner) {
		return INSTANCE.instGetManyEFeatureValue(eFeature, owner);
	}

	/** Determines if a passed feature is a static feature */
	public static boolean isStaticFeature(EStructuralFeature eFeature, BasicEObjectImpl owner) {
		return INSTANCE.instIsStaticFeature(eFeature, owner);
	}
	
	/** Sets an elist using the passed feature */
	public void instSetManyEFeatureValue(EStructuralFeature eFeature, Object value, BasicEObjectImpl owner) {
		final DynamicValueHolder dvh = instGetValueHolder(owner);
		dvh.dynamicSet(eFeature.getFeatureID(), value);
	}	

	/** Gets an elist using the passed feature */
	public EList instGetManyEFeatureValue(EStructuralFeature eFeature, BasicEObjectImpl owner) {
		final DynamicValueHolder dvh = instGetValueHolder(owner);
		return (EList)dvh.dynamicGet(eFeature.getFeatureID());
	}

	/** Determines if a passed feature is a static feature */
	public boolean instIsStaticFeature(EStructuralFeature eFeature, BasicEObjectImpl owner) {
		return eFeature.getFeatureID() < owner.eStaticFeatureCount();
	}
	
	/** Return the DynamicValueHolder */
	public DynamicValueHolder instGetValueHolder(BasicEObjectImpl deo) {
		return deo.eSettings();
	}

}