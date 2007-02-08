/**
 * <copyright>
 * </copyright>
 *
 * $Id: CntrImpl.java,v 1.2 2007/02/08 23:09:22 mtaal Exp $
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
import org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Rght;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cntr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.manytomany.impl.CntrImpl#getRght <em>Rght</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.manytomany.impl.CntrImpl#getLft <em>Lft</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CntrImpl extends EObjectImpl implements Cntr {
	/**
	 * The cached value of the '{@link #getRght() <em>Rght</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRght()
	 * @generated
	 * @ordered
	 */
	protected EList<Rght> rght = null;

	/**
	 * The cached value of the '{@link #getLft() <em>Lft</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLft()
	 * @generated
	 * @ordered
	 */
	protected EList<Lft> lft = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CntrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManytomanyPackage.Literals.CNTR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rght> getRght() {
		if (rght == null) {
			rght = new EObjectWithInverseEList.ManyInverse<Rght>(Rght.class, this, ManytomanyPackage.CNTR__RGHT, ManytomanyPackage.RGHT__CNTR);
		}
		return rght;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lft> getLft() {
		if (lft == null) {
			lft = new EObjectWithInverseEList.ManyInverse<Lft>(Lft.class, this, ManytomanyPackage.CNTR__LFT, ManytomanyPackage.LFT__CNTR);
		}
		return lft;
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
			case ManytomanyPackage.CNTR__RGHT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRght()).basicAdd(otherEnd, msgs);
			case ManytomanyPackage.CNTR__LFT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLft()).basicAdd(otherEnd, msgs);
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
			case ManytomanyPackage.CNTR__RGHT:
				return ((InternalEList<?>)getRght()).basicRemove(otherEnd, msgs);
			case ManytomanyPackage.CNTR__LFT:
				return ((InternalEList<?>)getLft()).basicRemove(otherEnd, msgs);
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
			case ManytomanyPackage.CNTR__RGHT:
				return getRght();
			case ManytomanyPackage.CNTR__LFT:
				return getLft();
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
			case ManytomanyPackage.CNTR__RGHT:
				getRght().clear();
				getRght().addAll((Collection<? extends Rght>)newValue);
				return;
			case ManytomanyPackage.CNTR__LFT:
				getLft().clear();
				getLft().addAll((Collection<? extends Lft>)newValue);
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
			case ManytomanyPackage.CNTR__RGHT:
				getRght().clear();
				return;
			case ManytomanyPackage.CNTR__LFT:
				getLft().clear();
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
			case ManytomanyPackage.CNTR__RGHT:
				return rght != null && !rght.isEmpty();
			case ManytomanyPackage.CNTR__LFT:
				return lft != null && !lft.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CntrImpl
