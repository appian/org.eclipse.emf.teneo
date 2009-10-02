/**
 * <copyright>
 * </copyright>
 *
 * $Id: BarImpl.java,v 1.1 2009/10/02 07:47:37 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz290969.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.issues.bz290969.Bar;
import org.eclipse.emf.teneo.samples.issues.bz290969.BarKey;
import org.eclipse.emf.teneo.samples.issues.bz290969.Bz290969Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz290969.impl.BarImpl#getBarKeys <em>Bar Keys</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BarImpl extends EObjectImpl implements Bar {
	/**
	 * The cached value of the '{@link #getBarKeys() <em>Bar Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<BarKey> barKeys;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bz290969Package.Literals.BAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BarKey> getBarKeys() {
		if (barKeys == null) {
			barKeys = new EObjectContainmentEList<BarKey>(BarKey.class, this, Bz290969Package.BAR__BAR_KEYS);
		}
		return barKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bz290969Package.BAR__BAR_KEYS:
				return ((InternalEList<?>)getBarKeys()).basicRemove(otherEnd, msgs);
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
			case Bz290969Package.BAR__BAR_KEYS:
				return getBarKeys();
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
			case Bz290969Package.BAR__BAR_KEYS:
				getBarKeys().clear();
				getBarKeys().addAll((Collection<? extends BarKey>)newValue);
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
			case Bz290969Package.BAR__BAR_KEYS:
				getBarKeys().clear();
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
			case Bz290969Package.BAR__BAR_KEYS:
				return barKeys != null && !barKeys.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BarImpl
