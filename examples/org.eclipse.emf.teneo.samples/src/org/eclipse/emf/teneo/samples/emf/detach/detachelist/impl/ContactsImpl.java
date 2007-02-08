/**
 * <copyright>
 * </copyright>
 *
 * $Id: ContactsImpl.java,v 1.2 2007/02/08 23:09:28 mtaal Exp $
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
	protected EList<Person> persons = null;

	/**
	 * The cached value of the '{@link #getContainedPersons() <em>Contained Persons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedPersons()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> containedPersons = null;

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
	@Override
	protected EClass eStaticClass() {
		return DetachelistPackage.Literals.CONTACTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getPersons() {
		if (persons == null) {
			persons = new EObjectEList<Person>(Person.class, this, DetachelistPackage.CONTACTS__PERSONS);
		}
		return persons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getContainedPersons() {
		if (containedPersons == null) {
			containedPersons = new EObjectContainmentEList<Person>(Person.class, this, DetachelistPackage.CONTACTS__CONTAINED_PERSONS);
		}
		return containedPersons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DetachelistPackage.CONTACTS__CONTAINED_PERSONS:
				return ((InternalEList<?>)getContainedPersons()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DetachelistPackage.CONTACTS__PERSONS:
				return getPersons();
			case DetachelistPackage.CONTACTS__CONTAINED_PERSONS:
				return getContainedPersons();
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
			case DetachelistPackage.CONTACTS__PERSONS:
				getPersons().clear();
				getPersons().addAll((Collection<? extends Person>)newValue);
				return;
			case DetachelistPackage.CONTACTS__CONTAINED_PERSONS:
				getContainedPersons().clear();
				getContainedPersons().addAll((Collection<? extends Person>)newValue);
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
			case DetachelistPackage.CONTACTS__PERSONS:
				getPersons().clear();
				return;
			case DetachelistPackage.CONTACTS__CONTAINED_PERSONS:
				getContainedPersons().clear();
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
			case DetachelistPackage.CONTACTS__PERSONS:
				return persons != null && !persons.isEmpty();
			case DetachelistPackage.CONTACTS__CONTAINED_PERSONS:
				return containedPersons != null && !containedPersons.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContactsImpl
