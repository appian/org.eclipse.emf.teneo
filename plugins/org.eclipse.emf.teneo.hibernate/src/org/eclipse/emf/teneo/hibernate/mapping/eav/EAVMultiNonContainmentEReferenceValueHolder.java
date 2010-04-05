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
 * $Id: EAVMultiNonContainmentEReferenceValueHolder.java,v 1.7 2010/04/05 05:33:30 mtaal Exp $
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
	private EAVDelegatingList ecoreObjectList = null;

	@SuppressWarnings("unchecked")
	public void set(Object value) {
		// set to null first, if there is at least one value then it is set to a value
		setMandatoryValue(null);
		final List<?> values = (List<Object>) value;
		referenceValues = new ArrayList<EAVSingleNonContainmentEReferenceValueHolder>();
		int index = 0;
		for (Object o : values) {
			final EAVSingleNonContainmentEReferenceValueHolder eavValue = (EAVSingleNonContainmentEReferenceValueHolder) getElement(o);
			eavValue.setListIndex(index++);
			referenceValues.add(eavValue);
			setMandatoryValue(NOT_NULL_VALUE);
		}
	}

	public Object getElement(Object value) {
		EAVSingleNonContainmentEReferenceValueHolder valueHolder = new EAVSingleNonContainmentEReferenceValueHolder();
		valueHolder.setEStructuralFeature(getEStructuralFeature());
		valueHolder.setOwner(getOwner());
		valueHolder.setValueOwner(this);
		valueHolder.setHbDataStore(getHbDataStore());
		valueHolder.set(value);
		return valueHolder;
	}

	public Object get(InternalEObject owner) {
		if (ecoreObjectList != null) {
			return ecoreObjectList;
		}
		// final DelegatingLateLoadingList<Object> lateLoadingList = new DelegatingLateLoadingList<Object>();
		// lateLoadingList.setPersistentList(referenceValues);
		final EAVDelegatingEcoreEList<Object> ecoreList = new EAVDelegatingEcoreEList<Object>((InternalEObject) owner);
		ecoreList.setValueHolderOwner(this);
		ecoreList.setEStructuralFeature(getEStructuralFeature());
		ecoreList.setPersistentList(referenceValues);
		ecoreObjectList = ecoreList;
		return ecoreList;
	}

	public Object getValue() {
		return referenceValues;
	}

	public List<EAVSingleNonContainmentEReferenceValueHolder> getReferenceValues() {
		return referenceValues;
	}

	public void setReferenceValues(List<EAVSingleNonContainmentEReferenceValueHolder> referenceValues) {
		this.referenceValues = referenceValues;
			((EAVDelegatingList)get((InternalEObject)getOwner())).setPersistentList(referenceValues);
	}
}