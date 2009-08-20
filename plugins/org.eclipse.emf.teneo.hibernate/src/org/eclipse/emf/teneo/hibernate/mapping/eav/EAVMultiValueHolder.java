/**
 * <copyright>
 *
 * Copyright (c) 2009 Springsite BV (The Netherlands) and others
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
 * $Id: EAVMultiValueHolder.java,v 1.1 2009/08/20 15:59:38 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.eav;

import java.lang.reflect.Field;
import java.util.Map;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.InternalEObject.EStore;
import org.eclipse.emf.ecore.impl.BasicEObjectImpl;
import org.eclipse.emf.teneo.hibernate.mapping.property.EcoreAccess;
import org.eclipse.emf.teneo.util.FieldUtil;
import org.eclipse.emf.teneo.util.StoreUtil;

/**
 * This class holds a multi (ismany) EStructuralFeature value.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public abstract class EAVMultiValueHolder extends EAVValueHolder {
	public void setValueInOwner() {

		final InternalEObject target = (InternalEObject) getOwner();
		if (!EcoreAccess.isStaticFeature(getEStructuralFeature(), (BasicEObjectImpl) target)) {
			Object currentValue = EcoreAccess.getManyEFeatureValue(getEStructuralFeature(), (BasicEObjectImpl) target);

			if (StoreUtil.isEStoreList(currentValue)) {
				final EStore eStore = target.eStore();
				if (eStore.size(target, getEStructuralFeature()) != -1) {
					currentValue = eStore.get((InternalEObject) target, getEStructuralFeature(), EStore.NO_INDEX);
				}
			}

			if (currentValue instanceof EAVDelegatingEcoreEList<?>) {
				return;
			}

			final Object newValue = get();
			if (newValue instanceof Map<?, ?>) {
				EcoreAccess.setManyEFeatureValue(getEStructuralFeature(), newValue, (BasicEObjectImpl) target);
			} else {
				EcoreAccess.setManyEFeatureValue(getEStructuralFeature(), newValue, (BasicEObjectImpl) target);
			}
		} else {
			final Field javaField = FieldUtil.getField(target.getClass(), getEStructuralFeature().getName());

			try {
				final Object currentValue = javaField.get(target);
				if (currentValue instanceof EAVDelegatingEcoreEList<?>) {
					return;
				}
				final Object newValue = get();
				javaField.set(target, newValue);
			} catch (Exception e) {
				throw new IllegalStateException(e);
			}
		}
	}
}