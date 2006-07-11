/**
 * <copyright>
 * </copyright>
 *
 * $Id: HeadImpl.java,v 1.1 2006/07/11 16:57:18 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.primarykeyjoin.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.emf.annotations.primarykeyjoin.Head;
import org.eclipse.emf.teneo.samples.emf.annotations.primarykeyjoin.PrimarykeyjoinPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Head</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.primarykeyjoin.impl.HeadImpl#getMyID <em>My ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HeadImpl extends EObjectImpl implements Head {
	/**
	 * The default value of the '{@link #getMyID() <em>My ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyID()
	 * @generated
	 * @ordered
	 */
	protected static final long MY_ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMyID() <em>My ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyID()
	 * @generated
	 * @ordered
	 */
	protected long myID = MY_ID_EDEFAULT;

	/**
	 * This is true if the My ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean myIDESet = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PrimarykeyjoinPackage.Literals.HEAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMyID() {
		return myID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyID(long newMyID) {
		long oldMyID = myID;
		myID = newMyID;
		boolean oldMyIDESet = myIDESet;
		myIDESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrimarykeyjoinPackage.HEAD__MY_ID, oldMyID, myID, !oldMyIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMyID() {
		long oldMyID = myID;
		boolean oldMyIDESet = myIDESet;
		myID = MY_ID_EDEFAULT;
		myIDESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PrimarykeyjoinPackage.HEAD__MY_ID, oldMyID, MY_ID_EDEFAULT, oldMyIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMyID() {
		return myIDESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PrimarykeyjoinPackage.HEAD__MY_ID:
				return new Long(getMyID());
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
			case PrimarykeyjoinPackage.HEAD__MY_ID:
				setMyID(((Long)newValue).longValue());
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
			case PrimarykeyjoinPackage.HEAD__MY_ID:
				unsetMyID();
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
			case PrimarykeyjoinPackage.HEAD__MY_ID:
				return isSetMyID();
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
		result.append(" (myID: ");
		if (myIDESet) result.append(myID); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //HeadImpl
