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
 * $Id: EAVMultiNonContainmentEReferenceValueHolder.java,v 1.2 2009/08/21 10:16:36 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.eav;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.InternalEObject;

/**
 * Stores a multi containment EReference value.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class EAVMultiNonContainmentEReferenceValueHolder extends EAVMultiValueHolder {

	private List<EAVSingleNonContainmentEReferenceValueHolder> referenceValues;

	@SuppressWarnings("unchecked")
	public void set(Object value) {
		final List<?> values = (List<Object>) value;
		referenceValues = new ArrayList<EAVSingleNonContainmentEReferenceValueHolder>();
		for (Object o : values) {
			referenceValues.add((EAVSingleNonContainmentEReferenceValueHolder) getElement(o));
		}
	}

	public Object getElement(Object value) {
		EAVSingleNonContainmentEReferenceValueHolder valueHolder = new EAVSingleNonContainmentEReferenceValueHolder();
		valueHolder.setEStructuralFeature(getEStructuralFeature());
		valueHolder.set(value);
		return valueHolder;
	}

	public Object get(InternalEObject owner) {
		final List<Object> values = new ArrayList<Object>();
		for (EAVSingleNonContainmentEReferenceValueHolder valueHolder : referenceValues) {
			values.add(valueHolder.getReferenceValue());
		}
		final EAVDelegatingEcoreEList<Object> ecoreList = new EAVDelegatingEcoreEList<Object>((InternalEObject) owner);
		ecoreList.setEStructuralFeature(getEStructuralFeature());
		ecoreList.setDelegate(values);
		return ecoreList;
	}

	public Object getValue() {
		return getReferenceValues();
	}

	public List<EAVSingleNonContainmentEReferenceValueHolder> getReferenceValues() {
		return referenceValues;
	}

	public void setReferenceValues(List<EAVSingleNonContainmentEReferenceValueHolder> referenceValues) {
		this.referenceValues = referenceValues;
	}
}