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
 * $Id: EAVFeatureMapValueHolder.java,v 1.3 2009/09/12 05:47:13 mtaal Exp $
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
public class EAVFeatureMapValueHolder extends EAVMultiValueHolder {

	private List<EAVFeatureMapEntryValueHolder> values;

	public void set(Object value) {
		setMandatoryValue(null);
		final List<?> listValues = (List<?>) value;
		values = new ArrayList<EAVFeatureMapEntryValueHolder>();
		for (Object o : listValues) {
			values.add((EAVFeatureMapEntryValueHolder) getElement(o));
			setMandatoryValue(NOT_NULL_VALUE);
		}
	}

	public Object getValue() {
		return getValues();
	}

	public Object getElement(Object value) {
		final EAVFeatureMapEntryValueHolder valueHolder = new EAVFeatureMapEntryValueHolder();
		valueHolder.set(value);
		valueHolder.setOwner(getOwner());
		return valueHolder;
	}

	public Object get(InternalEObject owner) {
		final EAVDelegatingFeatureMap featureMap = new EAVDelegatingFeatureMap((InternalEObject) owner,
				getEStructuralFeature());
		final DelegatingLateLoadingList.FeatureMapList objValues = new DelegatingLateLoadingList.FeatureMapList();
		objValues.setOwner(owner);
		objValues.setPersistentList(values);
		featureMap.setDelegate(objValues);
		return featureMap;
	}

	public List<EAVFeatureMapEntryValueHolder> getValues() {
		return values;
	}

	public void setValues(List<EAVFeatureMapEntryValueHolder> values) {
		this.values = values;
	}
}