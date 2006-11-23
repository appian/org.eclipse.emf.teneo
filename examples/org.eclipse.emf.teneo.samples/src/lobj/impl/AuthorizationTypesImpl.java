/**
 * <copyright>
 * </copyright>
 *
 * $Id: AuthorizationTypesImpl.java,v 1.1 2006/11/23 06:12:09 mtaal Exp $
 */
package lobj.impl;

import lobj.AuthorizationTypes;
import lobj.LobjPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authorization Types</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lobj.impl.AuthorizationTypesImpl#getAuthType <em>Auth Type</em>}</li>
 *   <li>{@link lobj.impl.AuthorizationTypesImpl#getAuthTypeDesc <em>Auth Type Desc</em>}</li>
 *   <li>{@link lobj.impl.AuthorizationTypesImpl#isReadOnly <em>Read Only</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuthorizationTypesImpl extends EObjectImpl implements AuthorizationTypes {
	/**
	 * The default value of the '{@link #getAuthType() <em>Auth Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthType()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTH_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthType() <em>Auth Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthType()
	 * @generated
	 * @ordered
	 */
	protected String authType = AUTH_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthTypeDesc() <em>Auth Type Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthTypeDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTH_TYPE_DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthTypeDesc() <em>Auth Type Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthTypeDesc()
	 * @generated
	 * @ordered
	 */
	protected String authTypeDesc = AUTH_TYPE_DESC_EDEFAULT;

	/**
	 * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean readOnly = READ_ONLY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorizationTypesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LobjPackage.Literals.AUTHORIZATION_TYPES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthType() {
		return authType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthType(String newAuthType) {
		String oldAuthType = authType;
		authType = newAuthType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.AUTHORIZATION_TYPES__AUTH_TYPE, oldAuthType, authType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthTypeDesc() {
		return authTypeDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthTypeDesc(String newAuthTypeDesc) {
		String oldAuthTypeDesc = authTypeDesc;
		authTypeDesc = newAuthTypeDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.AUTHORIZATION_TYPES__AUTH_TYPE_DESC, oldAuthTypeDesc, authTypeDesc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadOnly(boolean newReadOnly) {
		boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.AUTHORIZATION_TYPES__READ_ONLY, oldReadOnly, readOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LobjPackage.AUTHORIZATION_TYPES__AUTH_TYPE:
				return getAuthType();
			case LobjPackage.AUTHORIZATION_TYPES__AUTH_TYPE_DESC:
				return getAuthTypeDesc();
			case LobjPackage.AUTHORIZATION_TYPES__READ_ONLY:
				return isReadOnly() ? Boolean.TRUE : Boolean.FALSE;
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
			case LobjPackage.AUTHORIZATION_TYPES__AUTH_TYPE:
				setAuthType((String)newValue);
				return;
			case LobjPackage.AUTHORIZATION_TYPES__AUTH_TYPE_DESC:
				setAuthTypeDesc((String)newValue);
				return;
			case LobjPackage.AUTHORIZATION_TYPES__READ_ONLY:
				setReadOnly(((Boolean)newValue).booleanValue());
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
			case LobjPackage.AUTHORIZATION_TYPES__AUTH_TYPE:
				setAuthType(AUTH_TYPE_EDEFAULT);
				return;
			case LobjPackage.AUTHORIZATION_TYPES__AUTH_TYPE_DESC:
				setAuthTypeDesc(AUTH_TYPE_DESC_EDEFAULT);
				return;
			case LobjPackage.AUTHORIZATION_TYPES__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
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
			case LobjPackage.AUTHORIZATION_TYPES__AUTH_TYPE:
				return AUTH_TYPE_EDEFAULT == null ? authType != null : !AUTH_TYPE_EDEFAULT.equals(authType);
			case LobjPackage.AUTHORIZATION_TYPES__AUTH_TYPE_DESC:
				return AUTH_TYPE_DESC_EDEFAULT == null ? authTypeDesc != null : !AUTH_TYPE_DESC_EDEFAULT.equals(authTypeDesc);
			case LobjPackage.AUTHORIZATION_TYPES__READ_ONLY:
				return readOnly != READ_ONLY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (authType: ");
		result.append(authType);
		result.append(", authTypeDesc: ");
		result.append(authTypeDesc);
		result.append(", readOnly: ");
		result.append(readOnly);
		result.append(')');
		return result.toString();
	}

} //AuthorizationTypesImpl