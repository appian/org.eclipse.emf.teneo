/**
 */
package org.eclipse.emf.teneo.samples.issues.simplearray.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.issues.simplearray.SimpleList;
import org.eclipse.emf.teneo.samples.issues.simplearray.SimplearrayPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.simplearray.impl.SimpleListImpl#getIntArray <em>Int Array</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.simplearray.impl.SimpleListImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleListImpl extends EObjectImpl implements SimpleList {
	/**
	 * The default value of the '{@link #getIntArray() <em>Int Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntArray()
	 * @generated
	 * @ordered
	 */
	protected static final int[] INT_ARRAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntArray() <em>Int Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntArray()
	 * @generated
	 * @ordered
	 */
	protected int[] intArray = INT_ARRAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplearrayPackage.Literals.SIMPLE_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int[] getIntArray() {
		return intArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntArray(int[] newIntArray) {
		int[] oldIntArray = intArray;
		intArray = newIntArray;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplearrayPackage.SIMPLE_LIST__INT_ARRAY, oldIntArray, intArray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplearrayPackage.SIMPLE_LIST__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimplearrayPackage.SIMPLE_LIST__INT_ARRAY:
				return getIntArray();
			case SimplearrayPackage.SIMPLE_LIST__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimplearrayPackage.SIMPLE_LIST__INT_ARRAY:
				setIntArray((int[])newValue);
				return;
			case SimplearrayPackage.SIMPLE_LIST__NAME:
				setName((String)newValue);
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
			case SimplearrayPackage.SIMPLE_LIST__INT_ARRAY:
				setIntArray(INT_ARRAY_EDEFAULT);
				return;
			case SimplearrayPackage.SIMPLE_LIST__NAME:
				setName(NAME_EDEFAULT);
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
			case SimplearrayPackage.SIMPLE_LIST__INT_ARRAY:
				return INT_ARRAY_EDEFAULT == null ? intArray != null : !INT_ARRAY_EDEFAULT.equals(intArray);
			case SimplearrayPackage.SIMPLE_LIST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (intArray: ");
		result.append(intArray);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SimpleListImpl
