/**
 * <copyright>
 * </copyright>
 *
 * $Id: SpecificDocumentImpl.java,v 1.3 2007/08/10 20:30:43 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.MappedsuperclassPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.SpecificDocument;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.impl.SpecificDocumentImpl#getMySpecificInfo <em>My Specific Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecificDocumentImpl extends ParentDocumentImpl implements SpecificDocument {
	/**
	 * The default value of the '{@link #getMySpecificInfo() <em>My Specific Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMySpecificInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String MY_SPECIFIC_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMySpecificInfo() <em>My Specific Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMySpecificInfo()
	 * @generated
	 * @ordered
	 */
	protected String mySpecificInfo = MY_SPECIFIC_INFO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappedsuperclassPackage.Literals.SPECIFIC_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMySpecificInfo() {
		return mySpecificInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMySpecificInfo(String newMySpecificInfo) {
		String oldMySpecificInfo = mySpecificInfo;
		mySpecificInfo = newMySpecificInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappedsuperclassPackage.SPECIFIC_DOCUMENT__MY_SPECIFIC_INFO, oldMySpecificInfo, mySpecificInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MappedsuperclassPackage.SPECIFIC_DOCUMENT__MY_SPECIFIC_INFO:
				return getMySpecificInfo();
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
			case MappedsuperclassPackage.SPECIFIC_DOCUMENT__MY_SPECIFIC_INFO:
				setMySpecificInfo((String)newValue);
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
			case MappedsuperclassPackage.SPECIFIC_DOCUMENT__MY_SPECIFIC_INFO:
				setMySpecificInfo(MY_SPECIFIC_INFO_EDEFAULT);
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
			case MappedsuperclassPackage.SPECIFIC_DOCUMENT__MY_SPECIFIC_INFO:
				return MY_SPECIFIC_INFO_EDEFAULT == null ? mySpecificInfo != null : !MY_SPECIFIC_INFO_EDEFAULT.equals(mySpecificInfo);
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
		result.append(" (mySpecificInfo: ");
		result.append(mySpecificInfo);
		result.append(')');
		return result.toString();
	}

} //SpecificDocumentImpl
