/**
 * <copyright>
 * </copyright>
 *
 * $Id: OneImpl.java,v 1.1 2008/08/11 20:40:39 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz237361.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.issues.bz237361.Bz237361Package;
import org.eclipse.emf.teneo.samples.issues.bz237361.Many;
import org.eclipse.emf.teneo.samples.issues.bz237361.One;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>One</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz237361.impl.OneImpl#getManies <em>Manies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OneImpl extends EObjectImpl implements One {
	/**
	 * The cached value of the '{@link #getManies() <em>Manies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManies()
	 * @generated
	 * @ordered
	 */
	protected EList<Many> manies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bz237361Package.Literals.ONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Many> getManies() {
		if (manies == null) {
			manies = new EObjectWithInverseEList<Many>(Many.class, this, Bz237361Package.ONE__MANIES, Bz237361Package.MANY__ONE);
		}
		return manies;
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
			case Bz237361Package.ONE__MANIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getManies()).basicAdd(otherEnd, msgs);
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
			case Bz237361Package.ONE__MANIES:
				return ((InternalEList<?>)getManies()).basicRemove(otherEnd, msgs);
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
			case Bz237361Package.ONE__MANIES:
				return getManies();
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
			case Bz237361Package.ONE__MANIES:
				getManies().clear();
				getManies().addAll((Collection<? extends Many>)newValue);
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
			case Bz237361Package.ONE__MANIES:
				getManies().clear();
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
			case Bz237361Package.ONE__MANIES:
				return manies != null && !manies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OneImpl
