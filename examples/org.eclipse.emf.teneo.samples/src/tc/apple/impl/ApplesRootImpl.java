/**
 * <copyright>
 * </copyright>
 *
 * $Id: ApplesRootImpl.java,v 1.1 2007/07/09 12:55:20 mtaal Exp $
 */
package tc.apple.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tc.apple.ApplePackage;
import tc.apple.ApplesRoot;
import tc.apple.Fruit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Apples Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tc.apple.impl.ApplesRootImpl#getFruit <em>Fruit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplesRootImpl extends EObjectImpl implements ApplesRoot {
	/**
	 * The cached value of the '{@link #getFruit() <em>Fruit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFruit()
	 * @generated
	 * @ordered
	 */
	protected EList<Fruit> fruit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplesRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplePackage.Literals.APPLES_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fruit> getFruit() {
		if (fruit == null) {
			fruit = new EObjectContainmentEList<Fruit>(Fruit.class, this, ApplePackage.APPLES_ROOT__FRUIT);
		}
		return fruit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApplePackage.APPLES_ROOT__FRUIT:
				return ((InternalEList<?>)getFruit()).basicRemove(otherEnd, msgs);
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
			case ApplePackage.APPLES_ROOT__FRUIT:
				return getFruit();
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
			case ApplePackage.APPLES_ROOT__FRUIT:
				getFruit().clear();
				getFruit().addAll((Collection<? extends Fruit>)newValue);
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
			case ApplePackage.APPLES_ROOT__FRUIT:
				getFruit().clear();
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
			case ApplePackage.APPLES_ROOT__FRUIT:
				return fruit != null && !fruit.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ApplesRootImpl
