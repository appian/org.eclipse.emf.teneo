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
 * $Id: EAVSingleEReferenceValueHolder.java,v 1.5 2010/04/04 12:10:51 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.eav;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.hibernate.HbUtil;
import org.hibernate.mapping.PersistentClass;

/**
 * Stores a single EReference value when the EReference is containment.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class EAVSingleEReferenceValueHolder extends EAVValueHolder {

	private EObject referenceValue;

	private EObject eavObjectReference;

	private EReference getEReference() {
		return (EReference) getEStructuralFeature();
	}

	public void setValueInOwner(InternalEObject owner) {
		final Object curValue = owner.eGet(getEStructuralFeature());
		final int featureId = owner.eClass().getFeatureID(
				getEStructuralFeature());
		if (curValue == referenceValue) {
			// note that == works fine if the
			// curValue and value have been read in the same jvm.
			return; // do nothing in this case
		}

		if (getEReference().getEOpposite() != null
				|| (owner instanceof DynamicEObjectImpl && getEReference()
						.isContainment())) {
			// these are handled a bit differently because
			if (referenceValue == null) { // remove
				// Note that the eInverseRemove is called on the target itself
				// and the value is passed
				// therefore the eReference featureid is passed and not the
				// opposite
				final NotificationChain nots = ((InternalEObject) owner)
						.eInverseRemove((InternalEObject) curValue, featureId,
								getEReference().getEType().getInstanceClass(),
								null);
				if (nots != null) {
					nots.dispatch();
				}
			} else {
				final NotificationChain nots = ((InternalEObject) owner)
						.eInverseAdd((InternalEObject) referenceValue,
								featureId, getEReference().getEType()
										.getInstanceClass(), null);
				if (nots != null) {
					nots.dispatch();
				}
			}
		} else {
			owner.eSet(getEReference(), referenceValue);
		}
	}

	public void set(Object value) {
		setMandatoryValue(null);
		referenceValue = (EObject) value;
		if (referenceValue != null) {
			setMandatoryValue(NOT_NULL_VALUE);
			if (isEAVMapped(referenceValue.eClass())) {
				setEavObjectReference(referenceValue);
			}
		} else {
			setEavObjectReference(null);
		}
		
	}

	public Object getValue() {
		return getReferenceValue();
	}

	public Object get(InternalEObject owner) {
		return referenceValue;
	}

	public EObject getReferenceValue() {
		return referenceValue;
	}

	public void setReferenceValue(EObject referenceValue) {
		this.referenceValue = referenceValue;
	}

	public EObject getEavObjectReference() {
		return eavObjectReference;
	}

	public void setEavObjectReference(EObject eavObjectReference) {
		this.eavObjectReference = eavObjectReference;
	}

	private boolean isEAVMapped(EClass eClass) {
		try {
			final PAnnotatedEClass paClass = getHbDataStore().getPaModel()
					.getPAnnotated(eClass);
			if (paClass.getEntity() == null) {
				return false;
			}
			final String entityName = paClass.getEntity().getName();
			final PersistentClass pc = getHbDataStore().getPersistentClass(
					entityName);
			return HbUtil.isEAVMapped(pc);
		} catch (IllegalArgumentException e) {
			// not mapped
			return false;
		}
	}

}