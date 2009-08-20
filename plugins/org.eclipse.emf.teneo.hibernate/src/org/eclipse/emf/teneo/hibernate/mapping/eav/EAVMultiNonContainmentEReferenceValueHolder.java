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
 * $Id: EAVMultiNonContainmentEReferenceValueHolder.java,v 1.1 2009/08/20 15:59:38 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.eav;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * Stores a multi containment EReference value.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class EAVMultiNonContainmentEReferenceValueHolder extends EAVMultiValueHolder {

	private List<Object> referenceValues;

	@SuppressWarnings("unchecked")
	public void set(Object value) {
		referenceValues = (List<Object>) value;
	}

	public Object get() {
		if (referenceValues instanceof EList<?>) {
			return referenceValues;
		}
		final EAVDelegatingEcoreEList<Object> ecoreList = new EAVDelegatingEcoreEList<Object>(
				(InternalEObject) getOwner());
		ecoreList.setEStructuralFeature(getEStructuralFeature());
		ecoreList.setDelegate(referenceValues);
		return ecoreList;
	}

	public List<Object> getReferenceValues() {
		return referenceValues;
	}

	public void setReferenceValues(List<Object> referenceValues) {
		this.referenceValues = referenceValues;
	}
}