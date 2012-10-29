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
 * $Id: EAVFeatureMapValueHolder.java,v 1.5 2010/04/02 15:24:11 mtaal Exp $
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
		valueHolder.setOwner(getOwner());
		valueHolder.setHbDataStore(getHbDataStore());
		valueHolder.set(value);
		return valueHolder;
	}

	public Object get(InternalEObject owner) {
		final EAVDelegatingFeatureMap featureMap = new EAVDelegatingFeatureMap((InternalEObject) owner,
				getEStructuralFeature());
		// final DelegatingLateLoadingList.FeatureMapList objValues = new
		// DelegatingLateLoadingList.FeatureMapList();
		// objValues.setOwner(owner);
		// objValues.setPersistentList(values);
		featureMap.setPersistentList(values);
		return featureMap;
	}

	public List<EAVFeatureMapEntryValueHolder> getValues() {
		return values;
	}

	public void setValues(List<EAVFeatureMapEntryValueHolder> values) {
		this.values = values;
	}
}