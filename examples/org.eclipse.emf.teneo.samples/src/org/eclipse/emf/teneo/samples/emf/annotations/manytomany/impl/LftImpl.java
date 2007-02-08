/**
 * <copyright>
 * </copyright>
 *
 * $Id: LftImpl.java,v 1.2 2007/02/08 23:09:22 mtaal Exp $
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
import org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Lft;
import org.eclipse.emf.teneo.samples.emf.annotations.manytomany.ManytomanyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lft</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.manytomany.impl.LftImpl#getCntr <em>Cntr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LftImpl extends EObjectImpl implements Lft {
	/**
	 * The cached value of the '{@link #getCntr() <em>Cntr</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCntr()
	 * @generated
	 * @ordered
	 */
	protected EList<Cntr> cntr = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LftImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManytomanyPackage.Literals.LFT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cntr> getCntr() {
		if (cntr == null) {
			cntr = new EObjectWithInverseEList.ManyInverse<Cntr>(Cntr.class, this, ManytomanyPackage.LFT__CNTR, ManytomanyPackage.CNTR__LFT);
		}
		return cntr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ManytomanyPackage.LFT__CNTR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCntr()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ManytomanyPackage.LFT__CNTR:
				return ((InternalEList<?>)getCntr()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManytomanyPackage.LFT__CNTR:
				return getCntr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ManytomanyPackage.LFT__CNTR:
				getCntr().clear();
				getCntr().addAll((Collection<? extends Cntr>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ManytomanyPackage.LFT__CNTR:
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ManytomanyPackage.LFT__CNTR:
				return cntr != null && !cntr.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LftImpl
