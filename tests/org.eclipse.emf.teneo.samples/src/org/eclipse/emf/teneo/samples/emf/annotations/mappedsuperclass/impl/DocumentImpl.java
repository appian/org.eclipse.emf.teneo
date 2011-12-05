/**
 * <copyright>
 * </copyright>
 *
 * $Id: DocumentImpl.java,v 1.4 2007/08/10 20:30:43 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.Document;
import org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.MappedsuperclassPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.TestReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.impl.DocumentImpl#getMyGenericInfo <em>My Generic Info</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.impl.DocumentImpl#getMyTestReference <em>My Test Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentImpl extends EObjectImpl implements Document {
	/**
	 * The default value of the '{@link #getMyGenericInfo() <em>My Generic Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyGenericInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String MY_GENERIC_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMyGenericInfo() <em>My Generic Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyGenericInfo()
	 * @generated
	 * @ordered
	 */
	protected String myGenericInfo = MY_GENERIC_INFO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMyTestReference() <em>My Test Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyTestReference()
	 * @generated
	 * @ordered
	 */
	protected TestReference myTestReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappedsuperclassPackage.Literals.DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMyGenericInfo() {
		return myGenericInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyGenericInfo(String newMyGenericInfo) {
		String oldMyGenericInfo = myGenericInfo;
		myGenericInfo = newMyGenericInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappedsuperclassPackage.DOCUMENT__MY_GENERIC_INFO, oldMyGenericInfo, myGenericInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReference getMyTestReference() {
		return myTestReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyTestReference(TestReference newMyTestReference) {
		TestReference oldMyTestReference = myTestReference;
		myTestReference = newMyTestReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappedsuperclassPackage.DOCUMENT__MY_TEST_REFERENCE, oldMyTestReference, myTestReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MappedsuperclassPackage.DOCUMENT__MY_GENERIC_INFO:
				return getMyGenericInfo();
			case MappedsuperclassPackage.DOCUMENT__MY_TEST_REFERENCE:
				return getMyTestReference();
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
			case MappedsuperclassPackage.DOCUMENT__MY_GENERIC_INFO:
				setMyGenericInfo((String)newValue);
				return;
			case MappedsuperclassPackage.DOCUMENT__MY_TEST_REFERENCE:
				setMyTestReference((TestReference)newValue);
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
			case MappedsuperclassPackage.DOCUMENT__MY_GENERIC_INFO:
				setMyGenericInfo(MY_GENERIC_INFO_EDEFAULT);
				return;
			case MappedsuperclassPackage.DOCUMENT__MY_TEST_REFERENCE:
				setMyTestReference((TestReference)null);
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
			case MappedsuperclassPackage.DOCUMENT__MY_GENERIC_INFO:
				return MY_GENERIC_INFO_EDEFAULT == null ? myGenericInfo != null : !MY_GENERIC_INFO_EDEFAULT.equals(myGenericInfo);
			case MappedsuperclassPackage.DOCUMENT__MY_TEST_REFERENCE:
				return myTestReference != null;
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
		result.append(" (myGenericInfo: ");
		result.append(myGenericInfo);
		result.append(')');
		return result.toString();
	}

} //DocumentImpl
