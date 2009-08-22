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
 * $Id: EAVMultiNonContainmentEReferenceValueHolder.java,v 1.3 2009/08/22 00:09:55 mtaal Exp $
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
		// set to null first, if there is at least one value then it is set to a value
		setMandatoryValue(null);
		final List<?> values = (List<Object>) value;
		referenceValues = new ArrayList<EAVSingleNonContainmentEReferenceValueHolder>();
		for (Object o : values) {
			referenceValues.add((EAVSingleNonContainmentEReferenceValueHolder) getElement(o));
			setMandatoryValue(NOT_NULL_VALUE);
		}
	}

	public Object getElement(Object value) {
		EAVSingleNonContainmentEReferenceValueHolder valueHolder = new EAVSingleNonContainmentEReferenceValueHolder();
		valueHolder.setEStructuralFeature(getEStructuralFeature());
		valueHolder.set(value);
		valueHolder.setOwner(getOwner());
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