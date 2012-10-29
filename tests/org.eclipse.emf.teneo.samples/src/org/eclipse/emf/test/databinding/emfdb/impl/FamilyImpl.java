/**
 * <copyright>
 * </copyright>
 *
 * $Id: FamilyImpl.java,v 1.1 2009/08/23 16:04:40 mtaal Exp $
 */
package org.eclipse.emf.test.databinding.emfdb.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.test.databinding.emfdb.EmfdbPackage;
import org.eclipse.emf.test.databinding.emfdb.Family;
import org.eclipse.emf.test.databinding.emfdb.Person;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Family</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.test.databinding.emfdb.impl.FamilyImpl#getString <em>String</em>}</li>
 * <li>{@link org.eclipse.emf.test.databinding.emfdb.impl.FamilyImpl#getPersons <em>Persons</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class FamilyImpl extends EObjectImpl implements Family {
	/**
	 * The default value of the '{@link #getString() <em>String</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getString()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getString() <em>String</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getString()
	 * @generated
	 * @ordered
	 */
	protected String string = STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPersons() <em>Persons</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPersons()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> persons;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected FamilyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfdbPackage.Literals.FAMILY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getString() {
		return string;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setString(String newString) {
		String oldString = string;
		string = newString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfdbPackage.FAMILY__STRING, oldString,
					string));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Person> getPersons() {
		if (persons == null) {
			persons = new EObjectContainmentEList<Person>(Person.class, this,
					EmfdbPackage.FAMILY__PERSONS);
		}
		return persons;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
		case EmfdbPackage.FAMILY__PERSONS:
			return ((InternalEList<?>) getPersons()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EmfdbPackage.FAMILY__STRING:
			return getString();
		case EmfdbPackage.FAMILY__PERSONS:
			return getPersons();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EmfdbPackage.FAMILY__STRING:
			setString((String) newValue);
			return;
		case EmfdbPackage.FAMILY__PERSONS:
			getPersons().clear();
			getPersons().addAll((Collection<? extends Person>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EmfdbPackage.FAMILY__STRING:
			setString(STRING_EDEFAULT);
			return;
		case EmfdbPackage.FAMILY__PERSONS:
			getPersons().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EmfdbPackage.FAMILY__STRING:
			return STRING_EDEFAULT == null ? string != null : !STRING_EDEFAULT.equals(string);
		case EmfdbPackage.FAMILY__PERSONS:
			return persons != null && !persons.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (string: ");
		result.append(string);
		result.append(')');
		return result.toString();
	}

} // FamilyImpl
