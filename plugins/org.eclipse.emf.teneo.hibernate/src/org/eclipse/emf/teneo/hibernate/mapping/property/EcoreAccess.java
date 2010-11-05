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
 * $Id: EcoreAccess.java,v 1.9 2010/11/05 09:23:32 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.property;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Internal.DynamicValueHolder;
import org.eclipse.emf.ecore.impl.BasicEObjectImpl;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.emf.teneo.util.FieldUtil;

/**
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.9 $
 */
public class EcoreAccess {

	/** Return the DynamicValueHolder */
	public static DynamicValueHolder getValueHolder(BasicEObjectImpl deo) {
		if (deo instanceof DynamicValueHolder
				&& !(deo instanceof DynamicEObjectImpl)) {
			return (DynamicValueHolder) deo;
		}
		return (DynamicValueHolder) FieldUtil
				.callMethod(deo, "eSettings", null);
	}

	/** Sets an elist using the passed feature */
	public static void setManyEFeatureValue(EStructuralFeature eFeature,
			Object value, BasicEObjectImpl owner) {
		final DynamicValueHolder dvh = getValueHolder(owner);
		dvh.dynamicSet(getFeatureId(owner, eFeature), value);
	}

	/** Gets an elist using the passed feature */
	public static EList<?> getManyEFeatureValue(EStructuralFeature eFeature,
			BasicEObjectImpl owner) {
		final DynamicValueHolder dvh = getValueHolder(owner);
		return (EList<?>) dvh.dynamicGet(getFeatureId(owner, eFeature));
	}

	public static int getFeatureId(BasicEObjectImpl owner,
			EStructuralFeature eFeature) {
		int featureId = owner.eClass().getFeatureID(eFeature);
		if (!isStaticFeature(eFeature, owner)) {
			final int staticFeatureCount = (Integer) FieldUtil.callMethod(
					owner, "eStaticFeatureCount", null);
			featureId = featureId - staticFeatureCount;
		}
		return featureId;
	}

	/** Determines if a passed feature is a static feature */
	public static boolean isStaticFeature(EStructuralFeature eFeature,
			BasicEObjectImpl owner) {
		Integer staticFeatureCount = (Integer) FieldUtil.callMethod(owner,
				"eStaticFeatureCount", null);
		return owner.eClass().getFeatureID(eFeature) < staticFeatureCount
				.intValue();
	}
}