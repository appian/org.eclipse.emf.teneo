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
 * $Id: EAVValueHolder.java,v 1.1 2009/08/20 15:59:38 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.eav;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * The base class of the value stored in an EAV schema. The value in an EAV schema is both the type (the
 * EStructuralFeature) and its value. The following different types of values can be identified:
 * <ul>
 * <li>EAttribute: a single primitive value</li>
 * <li>EReference: a single reference to another object, containment or non-containment</li>
 * <li>MultiEAttribute: a multi-occurrence EAttribute</li>
 * <li>MultiEReference: a multi-occurrence EReference</li>
 * </ul>
 * In addition there is the FeatureMap and Map support which needs to be handled. In EMF both are lists with
 * EAttributes.
 * 
 * The above structure is reflected in the EAVValueHolder class hierarchy.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */

// NOTES:
// the container reference is stored in the eobject itself!

public abstract class EAVValueHolder {

	public static EAVValueHolder create(EStructuralFeature eFeature) {
		final EAVValueHolder valueHolder;
		if (eFeature instanceof EReference) {
			final EReference eReference = (EReference) eFeature;
			if (eReference.isMany()) {
				if (eReference.isContainment()) {
					valueHolder = new EAVMultiContainmentEReferenceValueHolder();
				} else {
					valueHolder = new EAVMultiNonContainmentEReferenceValueHolder();
				}
			} else {
				if (eReference.isContainment()) {
					valueHolder = new EAVSingleContainmentEReferenceValueHolder();
				} else {
					valueHolder = new EAVSingleNonContainmentEReferenceValueHolder();
				}
			}
		} else {
			if (eFeature.isMany()) {
				valueHolder = new EAVMultiEAttributeValueHolder();
			} else {
				valueHolder = new EAVSingleEAttributeValueHolder();
			}
		}
		valueHolder.setEStructuralFeature(eFeature);
		return valueHolder;
	}

	private EObject owner;
	private long id;
	private int version;
	private EStructuralFeature eStructuralFeature;

	public abstract void set(Object value);

	public abstract Object get();

	public abstract void setValueInOwner();

	public int getFeatureId() {
		return getOwner().eClass().getFeatureID(getEStructuralFeature());
	}

	public EObject getOwner() {
		return owner;
	}

	public void setOwner(EObject owner) {
		this.owner = owner;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public EStructuralFeature getEStructuralFeature() {
		return eStructuralFeature;
	}

	public void setEStructuralFeature(EStructuralFeature eStructuralFeature) {
		this.eStructuralFeature = eStructuralFeature;
	}

	// extra getter and setter because hibernate gets confused with the other
	// getter/setter and the uppercase 2 characters
	public EStructuralFeature getFeature() {
		return eStructuralFeature;
	}

	public void setFeature(EStructuralFeature eStructuralFeature) {
		this.eStructuralFeature = eStructuralFeature;
	}
}