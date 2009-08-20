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
 * $Id: EAVMultiEAttributeValueHolder.java,v 1.1 2009/08/20 15:59:38 mtaal Exp $
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
		final List<?> listValues = (List<?>) value;
		values = new ArrayList<EAVSingleEAttributeValueHolder>();
		for (Object o : listValues) {
			final EAVSingleEAttributeValueHolder valueHolder = new EAVSingleEAttributeValueHolder();
			valueHolder.setOwner(getOwner());
			valueHolder.setEStructuralFeature(getEStructuralFeature());
			valueHolder.set(o);
			values.add(valueHolder);
		}
	}

	public Object get() {
		final EAVDelegatingEcoreEList<Object> ecoreList = new EAVDelegatingEcoreEList<Object>(
				(InternalEObject) getOwner());
		ecoreList.setEStructuralFeature(getEStructuralFeature());
		final List<Object> objValues = new ArrayList<Object>();
		for (EAVSingleEAttributeValueHolder valueHolder : values) {
			objValues.add(valueHolder.get());
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