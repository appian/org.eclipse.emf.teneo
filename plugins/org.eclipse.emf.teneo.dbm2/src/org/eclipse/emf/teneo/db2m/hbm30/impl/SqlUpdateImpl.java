/**
 * <copyright>
 * </copyright>
 *
 * $Id: SqlUpdateImpl.java,v 1.1 2010/08/18 09:21:38 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;
import org.eclipse.emf.teneo.db2m.hbm30.SqlUpdate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sql Update</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SqlUpdateImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SqlUpdateImpl#isCallable <em>Callable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SqlUpdateImpl extends EObjectImpl implements SqlUpdate {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isCallable() <em>Callable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCallable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CALLABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCallable() <em>Callable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCallable()
	 * @generated
	 * @ordered
	 */
	protected boolean callable = CALLABLE_EDEFAULT;

	/**
	 * This is true if the Callable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean callableESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqlUpdateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getSqlUpdate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.SQL_UPDATE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCallable() {
		return callable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallable(boolean newCallable) {
		boolean oldCallable = callable;
		callable = newCallable;
		boolean oldCallableESet = callableESet;
		callableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.SQL_UPDATE__CALLABLE, oldCallable, callable, !oldCallableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCallable() {
		boolean oldCallable = callable;
		boolean oldCallableESet = callableESet;
		callable = CALLABLE_EDEFAULT;
		callableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.SQL_UPDATE__CALLABLE, oldCallable, CALLABLE_EDEFAULT, oldCallableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCallable() {
		return callableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Hbm30Package.SQL_UPDATE__VALUE:
				return getValue();
			case Hbm30Package.SQL_UPDATE__CALLABLE:
				return isCallable();
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
			case Hbm30Package.SQL_UPDATE__VALUE:
				setValue((String)newValue);
				return;
			case Hbm30Package.SQL_UPDATE__CALLABLE:
				setCallable((Boolean)newValue);
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
			case Hbm30Package.SQL_UPDATE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case Hbm30Package.SQL_UPDATE__CALLABLE:
				unsetCallable();
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
			case Hbm30Package.SQL_UPDATE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case Hbm30Package.SQL_UPDATE__CALLABLE:
				return isSetCallable();
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
		result.append(" (value: ");
		result.append(value);
		result.append(", callable: ");
		if (callableESet) result.append(callable); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SqlUpdateImpl
