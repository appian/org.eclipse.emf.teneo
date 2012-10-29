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
 * $Id: EAVMultiEAttributeValueHolder.java,v 1.5 2010/04/05 05:33:32 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.eav;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.InternalEObject;

/**
 * This class holds a multi (ismany) EAttribute value.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class EAVMultiEAttributeValueHolder extends EAVMultiValueHolder {

	private List<EAVSingleEAttributeValueHolder> values;
	private EAVDelegatingList ecoreObjectList = null;

	public void set(Object value) {
		// set to null first, if there is at least one value then it is set to a
		// value
		setMandatoryValue(null);
		final List<?> listValues = (List<?>) value;
		values = new ArrayList<EAVSingleEAttributeValueHolder>();
		int index = 0;
		for (Object o : listValues) {
			final EAVSingleEAttributeValueHolder eavValue = (EAVSingleEAttributeValueHolder) getElement(o);
			eavValue.setListIndex(index++);
			values.add(eavValue);
			setMandatoryValue(NOT_NULL_VALUE);
		}
	}

	public Object getValue() {
		return values;
	}

	public Object getElement(Object value) {
		final EAVSingleEAttributeValueHolder valueHolder = new EAVSingleEAttributeValueHolder();
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
		final EAVDelegatingEcoreEList<Object> ecoreList = new EAVDelegatingEcoreEList<Object>(
				(InternalEObject) owner);
		ecoreList.setValueHolderOwner(this);
		ecoreList.setEStructuralFeature(getEStructuralFeature());
		ecoreList.setPersistentList(values);
		ecoreObjectList = ecoreList;
		return ecoreList;
	}

	public List<EAVSingleEAttributeValueHolder> getValues() {
		return values;
	}

	public void setValues(List<EAVSingleEAttributeValueHolder> values) {
		this.values = values;
		((EAVDelegatingList) get((InternalEObject) getOwner())).setPersistentList(values);
	}
}