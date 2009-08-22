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
 * $Id: EAVMultiEAttributeValueHolder.java,v 1.3 2009/08/22 00:09:59 mtaal Exp $
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

	public void set(Object value) {
		// set to null first, if there is at least one value then it is set to a value
		setMandatoryValue(null);
		final List<?> listValues = (List<?>) value;
		values = new ArrayList<EAVSingleEAttributeValueHolder>();
		for (Object o : listValues) {
			values.add((EAVSingleEAttributeValueHolder) getElement(o));
			setMandatoryValue(NOT_NULL_VALUE);
		}
	}

	public Object getValue() {
		return getValues();
	}

	public Object getElement(Object value) {
		final EAVSingleEAttributeValueHolder valueHolder = new EAVSingleEAttributeValueHolder();
		valueHolder.setEStructuralFeature(getEStructuralFeature());
		valueHolder.set(value);
		valueHolder.setOwner(getOwner());
		return valueHolder;
	}

	public Object get(InternalEObject owner) {
		final EAVDelegatingEcoreEList<Object> ecoreList = new EAVDelegatingEcoreEList<Object>((InternalEObject) owner);
		ecoreList.setEStructuralFeature(getEStructuralFeature());
		final List<Object> objValues = new ArrayList<Object>();
		for (EAVSingleEAttributeValueHolder valueHolder : values) {
			objValues.add(valueHolder.get(owner));
		}
		ecoreList.setDelegate(objValues);
		return ecoreList;
	}

	public List<EAVSingleEAttributeValueHolder> getValues() {
		return values;
	}

	public void setValues(List<EAVSingleEAttributeValueHolder> values) {
		this.values = values;
	}
}