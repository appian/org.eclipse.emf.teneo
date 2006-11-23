/**
 * <copyright>
 * </copyright>
 *
 * $Id: UserauthorizationImpl.java,v 1.1 2006/11/23 06:12:09 mtaal Exp $
 */
package lobj.impl;

import lobj.AuthorizationTypes;
import lobj.LobjPackage;
import lobj.User;
import lobj.Userauthorization;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Userauthorization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lobj.impl.UserauthorizationImpl#getUser <em>User</em>}</li>
 *   <li>{@link lobj.impl.UserauthorizationImpl#getAuthType <em>Auth Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserauthorizationImpl extends EObjectImpl implements Userauthorization {
	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected User user = null;

	/**
	 * The cached value of the '{@link #getAuthType() <em>Auth Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthType()
	 * @generated
	 * @ordered
	 */
	protected AuthorizationTypes authType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserauthorizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LobjPackage.Literals.USERAUTHORIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getUser() {
		if (user != null && user.eIsProxy()) {
			InternalEObject oldUser = (InternalEObject)user;
			user = (User)eResolveProxy(oldUser);
			if (user != oldUser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LobjPackage.USERAUTHORIZATION__USER, oldUser, user));
			}
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(User newUser) {
		User oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.USERAUTHORIZATION__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationTypes getAuthType() {
		if (authType != null && authType.eIsProxy()) {
			InternalEObject oldAuthType = (InternalEObject)authType;
			authType = (AuthorizationTypes)eResolveProxy(oldAuthType);
			if (authType != oldAuthType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LobjPackage.USERAUTHORIZATION__AUTH_TYPE, oldAuthType, authType));
			}
		}
		return authType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationTypes basicGetAuthType() {
		return authType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthType(AuthorizationTypes newAuthType) {
		AuthorizationTypes oldAuthType = authType;
		authType = newAuthType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.USERAUTHORIZATION__AUTH_TYPE, oldAuthType, authType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LobjPackage.USERAUTHORIZATION__USER:
				if (resolve) return getUser();
				return basicGetUser();
			case LobjPackage.USERAUTHORIZATION__AUTH_TYPE:
				if (resolve) return getAuthType();
				return basicGetAuthType();
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
			case LobjPackage.USERAUTHORIZATION__USER:
				setUser((User)newValue);
				return;
			case LobjPackage.USERAUTHORIZATION__AUTH_TYPE:
				setAuthType((AuthorizationTypes)newValue);
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
			case LobjPackage.USERAUTHORIZATION__USER:
				setUser((User)null);
				return;
			case LobjPackage.USERAUTHORIZATION__AUTH_TYPE:
				setAuthType((AuthorizationTypes)null);
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
			case LobjPackage.USERAUTHORIZATION__USER:
				return user != null;
			case LobjPackage.USERAUTHORIZATION__AUTH_TYPE:
				return authType != null;
		}
		return super.eIsSet(featureID);
	}

} //UserauthorizationImpl