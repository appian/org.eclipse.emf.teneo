/**
 * <copyright>
 * </copyright>
 *
 * $Id: ContactsImpl.java,v 1.1 2006/07/11 16:57:18 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.detach.detachelist.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectEList;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.emf.detach.detachelist.Contacts;
import org.eclipse.emf.teneo.samples.emf.detach.detachelist.DetachelistPackage;
import org.eclipse.emf.teneo.samples.emf.detach.detachelist.Person;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contacts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.detach.detachelist.impl.ContactsImpl#getPersons <em>Persons</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.detach.detachelist.impl.ContactsImpl#getContainedPersons <em>Contained Persons</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContactsImpl extends EObjectImpl implements Contacts {
	/**
	 * The cached value of the '{@link #getPersons() <em>Persons</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersons()
	 * @generated
	 * @ordered
	 */
	protected EList persons = null;

	/**
	 * The cached value of the '{@link #getContainedPersons() <em>Contained Persons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedPersons()
	 * @generated
	 * @ordered
	 */
	protected EList containedPersons = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DetachelistPackage.eINSTANCE.getContacts();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPersons() {
		if (persons == null) {
			persons = new EObjectEList(Person.class, this, DetachelistPackage.CONTACTS__PERSONS);
		}
		return persons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getContainedPersons() {
		if (containedPersons == null) {
			containedPersons = new EObjectContainmentEList(Person.class, this, DetachelistPackage.CONTACTS__CONTAINED_PERSONS);
		}
		return containedPersons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case DetachelistPackage.CONTACTS__CONTAINED_PERSONS:
					return ((InternalEList)getContainedPersons()).basicRemove(otherEnd, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case DetachelistPackage.CONTACTS__PERSONS:
				return getPersons();
			case DetachelistPackage.CONTACTS__CONTAINED_PERSONS:
				return getContainedPersons();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case DetachelistPackage.CONTACTS__PERSONS:
				getPersons().clear();
				getPersons().addAll((Collection)newValue);
				return;
			case DetachelistPackage.CONTACTS__CONTAINED_PERSONS:
				getContainedPersons().clear();
				getContainedPersons().addAll((Collection)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case DetachelistPackage.CONTACTS__PERSONS:
				getPersons().clear();
				return;
			case DetachelistPackage.CONTACTS__CONTAINED_PERSONS:
				getContainedPersons().clear();
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case DetachelistPackage.CONTACTS__PERSONS:
				return persons != null && !persons.isEmpty();
			case DetachelistPackage.CONTACTS__CONTAINED_PERSONS:
				return containedPersons != null && !containedPersons.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

} //ContactsImpl
