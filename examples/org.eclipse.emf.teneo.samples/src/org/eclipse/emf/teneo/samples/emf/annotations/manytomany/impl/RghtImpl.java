/**
 * <copyright>
 * </copyright>
 *
 * $Id: RghtImpl.java,v 1.1 2006/07/11 16:57:04 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.manytomany.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Cntr;
import org.eclipse.emf.teneo.samples.emf.annotations.manytomany.ManytomanyPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Rght;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rght</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.manytomany.impl.RghtImpl#getCntr <em>Cntr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RghtImpl extends EObjectImpl implements Rght {
	/**
	 * The cached value of the '{@link #getCntr() <em>Cntr</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCntr()
	 * @generated
	 * @ordered
	 */
	protected EList cntr = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RghtImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ManytomanyPackage.Literals.RGHT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCntr() {
		if (cntr == null) {
			cntr = new EObjectWithInverseEList.ManyInverse(Cntr.class, this, ManytomanyPackage.RGHT__CNTR, ManytomanyPackage.CNTR__RGHT);
		}
		return cntr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ManytomanyPackage.RGHT__CNTR:
				return ((InternalEList)getCntr()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ManytomanyPackage.RGHT__CNTR:
				return ((InternalEList)getCntr()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManytomanyPackage.RGHT__CNTR:
				return getCntr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ManytomanyPackage.RGHT__CNTR:
				getCntr().clear();
				getCntr().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case ManytomanyPackage.RGHT__CNTR:
				getCntr().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ManytomanyPackage.RGHT__CNTR:
				return cntr != null && !cntr.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RghtImpl
