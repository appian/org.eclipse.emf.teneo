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
 * $Id: EAVMultiContainmentEReferenceValueHolder.java,v 1.11 2010/04/05 05:33:31 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.eav;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.teneo.util.StoreUtil;

/**
 * Stores a multi containment EReference value.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class EAVMultiContainmentEReferenceValueHolder extends EAVMultiValueHolder {

	private List<EAVSingleContainmentEReferenceValueHolder> referenceValues;
	private EAVDelegatingList ecoreObjectList = null;

	@SuppressWarnings("unchecked")
	public void set(Object value) {
		// set to null first, if there is at least one value then it is set to a
		// value
		setMandatoryValue(null);
		final List<?> values = (List<Object>) value;
		referenceValues = new ArrayList<EAVSingleContainmentEReferenceValueHolder>();
		int index = 0;
		for (Object o : values) {
			final EAVSingleContainmentEReferenceValueHolder eavValue = (EAVSingleContainmentEReferenceValueHolder) getElement(o);
			eavValue.setVirtualListIndex(index++);
			referenceValues.add(eavValue);
			setMandatoryValue(NOT_NULL_VALUE);
		}
	}

	public Object getElement(Object value) {
		EAVSingleContainmentEReferenceValueHolder valueHolder = new EAVSingleContainmentEReferenceValueHolder();
		valueHolder.setEStructuralFeature(getEStructuralFeature());
		valueHolder.setHbDataStore(getHbDataStore());
		valueHolder.setOwner(getOwner());
		valueHolder.setValueOwner(this);
		valueHolder.set(value);
		return valueHolder;
	}

	public Object get(InternalEObject owner) {
		if (ecoreObjectList != null) {
			return ecoreObjectList;
		}
		setEcoreObjectList();
		return ecoreObjectList;
	}

	private void setEcoreObjectList() {
		if (StoreUtil.isMap(getEStructuralFeature())) {
			final EClass entryEClass = (EClass) getEStructuralFeature().getEType();
			Class<?> entryClass = entryEClass.getInstanceClass();
			// prevents a failing assertion in the EcoreEMap
			if (entryClass == null || !BasicEMap.Entry.class.isAssignableFrom(entryClass)) {
				entryClass = BasicEMap.Entry.class;
			}

			final int featureID = getOwner().eClass().getFeatureID(getEStructuralFeature());
			final EAVDelegatingEMap<Object, Object> eMap = new EAVDelegatingEMap<Object, Object>(
					entryEClass, entryClass, (InternalEObject) getOwner(), featureID);
			eMap.setValueHolderOwner(this);
			ecoreObjectList = eMap;
			eMap.setEStructuralFeature(getEStructuralFeature());
			eMap.setPersistentList(referenceValues);
		} else {
			// final DelegatingLateLoadingList<Object> lateLoadingList = new
			// DelegatingLateLoadingList<Object>();
			// lateLoadingList.setPersistentList((List<?>) referenceValues);
			final EAVDelegatingEcoreEList<Object> ecoreList = new EAVDelegatingEcoreEList<Object>(
					(InternalEObject) getOwner());
			ecoreList.setValueHolderOwner(this);
			ecoreList.setEStructuralFeature(getEStructuralFeature());
			ecoreList.setPersistentList(referenceValues);
			ecoreObjectList = ecoreList;
		}

	}

	public Object getValue() {
		return referenceValues;
	}

	public List<EAVSingleContainmentEReferenceValueHolder> getReferenceValues() {
		return referenceValues;
	}

	public void setReferenceValues(List<EAVSingleContainmentEReferenceValueHolder> referenceValues) {
		this.referenceValues = referenceValues;
		if (ecoreObjectList == null) {
			setEcoreObjectList();
		} else {
			ecoreObjectList.setPersistentList(referenceValues);
		}
	}
}