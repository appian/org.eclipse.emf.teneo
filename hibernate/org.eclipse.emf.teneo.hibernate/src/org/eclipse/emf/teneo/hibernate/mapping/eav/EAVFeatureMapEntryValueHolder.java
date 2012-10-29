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
 * $Id: EAVFeatureMapEntryValueHolder.java,v 1.3 2009/08/22 00:09:57 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.eav;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EStructuralFeatureImpl;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

/**
 * This class holds a feature map entry which can have a primitive value or an eReference .*
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class EAVFeatureMapEntryValueHolder extends EAVSingleEAttributeValueHolder {

	private EObject referenceValue;
	private EObject containedReferenceValue;
	private boolean isEReference;
	private boolean isContainment;

	private FeatureMap.Entry featureMapEntry;

	public void set(Object value) {

		setMandatoryValue(null);

		;
		final FeatureMap.Entry entry = (FeatureMap.Entry) value;
		featureMapEntry = entry;
		if (entry.getValue() != null) {
			setMandatoryValue(NOT_NULL_VALUE);
		}
		setEStructuralFeature(entry.getEStructuralFeature());
		if (isEReference) {
			referenceValue = (EObject) entry.getValue();
			if (isContainment) {
				containedReferenceValue = (EObject) entry.getValue();
			}
		} else {
			super.set(entry.getValue());
		}
	}

	public FeatureMap.Entry get(InternalEObject owner) {
		if (featureMapEntry != null) {
			return featureMapEntry;
		}

		featureMapEntry = ((EStructuralFeatureImpl) getEStructuralFeature())
				.getFeatureMapEntryPrototype();
		if (isEReference) {
			featureMapEntry = FeatureMapUtil.createEntry(getEStructuralFeature(), referenceValue);
		} else {
			featureMapEntry = FeatureMapUtil.createEntry(getEStructuralFeature(), super.get(owner));
		}
		return featureMapEntry;
	}

	public void setValueInOwner(InternalEObject owner) {
		throw new UnsupportedOperationException("This method should not be called");
	}

	public EObject getReferenceValue() {
		return referenceValue;
	}

	public void setReferenceValue(EObject referenceValue) {
		this.referenceValue = referenceValue;
	}

	@Override
	public void setEStructuralFeature(EStructuralFeature eStructuralFeature) {
		super.setEStructuralFeature(eStructuralFeature);
		isEReference = eStructuralFeature instanceof EReference;
		if (isEReference) {
			isContainment = ((EReference) eStructuralFeature).isContainment();
		}
	}

	public EObject getContainedReferenceValue() {
		return containedReferenceValue;
	}

	public void setContainedReferenceValue(EObject containedReferenceValue) {
		this.containedReferenceValue = containedReferenceValue;
	}

}