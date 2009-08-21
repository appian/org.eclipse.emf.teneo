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
 * $Id: EAVMultiValueHolder.java,v 1.2 2009/08/21 10:16:36 mtaal Exp $
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

	public abstract Object getElement(Object value);

	public void setValueInOwner(InternalEObject owner) {

		if (!EcoreAccess.isStaticFeature(getEStructuralFeature(), (BasicEObjectImpl) owner)) {
			Object currentValue = EcoreAccess.getManyEFeatureValue(getEStructuralFeature(), (BasicEObjectImpl) owner);

			if (StoreUtil.isEStoreList(currentValue)) {
				final EStore eStore = owner.eStore();
				if (eStore.size(owner, getEStructuralFeature()) != -1) {
					currentValue = eStore.get((InternalEObject) owner, getEStructuralFeature(), EStore.NO_INDEX);
				}
			}

			if (currentValue instanceof EAVDelegatingEcoreEList<?>) {
				return;
			}

			final Object newValue = get(owner);
			if (newValue instanceof Map<?, ?>) {
				EcoreAccess.setManyEFeatureValue(getEStructuralFeature(), newValue, (BasicEObjectImpl) owner);
			} else {
				EcoreAccess.setManyEFeatureValue(getEStructuralFeature(), newValue, (BasicEObjectImpl) owner);
			}
		} else {
			final Field javaField = FieldUtil.getField(owner.getClass(), getEStructuralFeature().getName());

			try {
				final Object currentValue = javaField.get(owner);
				if (currentValue instanceof EAVDelegatingEcoreEList<?>) {
					return;
				}
				final Object newValue = get(owner);
				javaField.set(owner, newValue);
			} catch (Exception e) {
				throw new IllegalStateException(e);
			}
		}
	}
}