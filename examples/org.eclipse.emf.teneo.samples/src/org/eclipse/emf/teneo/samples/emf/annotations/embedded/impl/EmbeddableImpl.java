/**
 * <copyright>
 * </copyright>
 *
 * $Id: EmbeddableImpl.java,v 1.4 2009/12/04 15:06:57 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.embedded.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.teneo.samples.emf.annotations.embedded.AOneToMany;
import org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embeddable;
import org.eclipse.emf.teneo.samples.emf.annotations.embedded.EmbeddedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Embeddable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.impl.EmbeddableImpl#getMyString <em>My String</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.impl.EmbeddableImpl#getMyInteger <em>My Integer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmbeddableImpl extends EObjectImpl implements Embeddable {
	/**
	 * The default value of the '{@link #getMyString() <em>My String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyString()
	 * @generated
	 * @ordered
	 */
	protected static final String MY_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMyString() <em>My String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyString()
	 * @generated
	 * @ordered
	 */
	protected String myString = MY_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getMyInteger() <em>My Integer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyInteger()
	 * @generated
	 * @ordered
	 */
	protected static final int MY_INTEGER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMyInteger() <em>My Integer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyInteger()
	 * @generated
	 * @ordered
	 */
	protected int myInteger = MY_INTEGER_EDEFAULT;

	/**
	 * This is true if the My Integer attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean myIntegerESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmbeddableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmbeddedPackage.Literals.EMBEDDABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMyString() {
		return myString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyString(String newMyString) {
		String oldMyString = myString;
		myString = newMyString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmbeddedPackage.EMBEDDABLE__MY_STRING, oldMyString, myString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMyInteger() {
		return myInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyInteger(int newMyInteger) {
		int oldMyInteger = myInteger;
		myInteger = newMyInteger;
		boolean oldMyIntegerESet = myIntegerESet;
		myIntegerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmbeddedPackage.EMBEDDABLE__MY_INTEGER, oldMyInteger, myInteger, !oldMyIntegerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMyInteger() {
		int oldMyInteger = myInteger;
		boolean oldMyIntegerESet = myIntegerESet;
		myInteger = MY_INTEGER_EDEFAULT;
		myIntegerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EmbeddedPackage.EMBEDDABLE__MY_INTEGER, oldMyInteger, MY_INTEGER_EDEFAULT, oldMyIntegerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMyInteger() {
		return myIntegerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmbeddedPackage.EMBEDDABLE__MY_STRING:
				return getMyString();
			case EmbeddedPackage.EMBEDDABLE__MY_INTEGER:
				return getMyInteger();
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
			case EmbeddedPackage.EMBEDDABLE__MY_STRING:
				setMyString((String)newValue);
				return;
			case EmbeddedPackage.EMBEDDABLE__MY_INTEGER:
				setMyInteger((Integer)newValue);
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
			case EmbeddedPackage.EMBEDDABLE__MY_STRING:
				setMyString(MY_STRING_EDEFAULT);
				return;
			case EmbeddedPackage.EMBEDDABLE__MY_INTEGER:
				unsetMyInteger();
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
			case EmbeddedPackage.EMBEDDABLE__MY_STRING:
				return MY_STRING_EDEFAULT == null ? myString != null : !MY_STRING_EDEFAULT.equals(myString);
			case EmbeddedPackage.EMBEDDABLE__MY_INTEGER:
				return isSetMyInteger();
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
		result.append(" (myString: ");
		result.append(myString);
		result.append(", myInteger: ");
		if (myIntegerESet) result.append(myInteger); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EmbeddableImpl
