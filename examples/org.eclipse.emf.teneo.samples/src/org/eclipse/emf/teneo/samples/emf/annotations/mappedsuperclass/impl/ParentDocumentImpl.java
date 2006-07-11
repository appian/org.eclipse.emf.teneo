/**
 * <copyright>
 * </copyright>
 *
 * $Id: ParentDocumentImpl.java,v 1.1 2006/07/11 16:56:58 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.MappedsuperclassPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.ParentDocument;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parent Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.impl.ParentDocumentImpl#getMyName <em>My Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParentDocumentImpl extends DocumentImpl implements ParentDocument {
	/**
	 * The default value of the '{@link #getMyName() <em>My Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyName()
	 * @generated
	 * @ordered
	 */
	protected static final String MY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMyName() <em>My Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyName()
	 * @generated
	 * @ordered
	 */
	protected String myName = MY_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParentDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MappedsuperclassPackage.Literals.PARENT_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMyName() {
		return myName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyName(String newMyName) {
		String oldMyName = myName;
		myName = newMyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappedsuperclassPackage.PARENT_DOCUMENT__MY_NAME, oldMyName, myName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MappedsuperclassPackage.PARENT_DOCUMENT__MY_NAME:
				return getMyName();
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
			case MappedsuperclassPackage.PARENT_DOCUMENT__MY_NAME:
				setMyName((String)newValue);
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
			case MappedsuperclassPackage.PARENT_DOCUMENT__MY_NAME:
				setMyName(MY_NAME_EDEFAULT);
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
			case MappedsuperclassPackage.PARENT_DOCUMENT__MY_NAME:
				return MY_NAME_EDEFAULT == null ? myName != null : !MY_NAME_EDEFAULT.equals(myName);
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
		result.append(" (myName: ");
		result.append(myName);
		result.append(')');
		return result.toString();
	}

} //ParentDocumentImpl
