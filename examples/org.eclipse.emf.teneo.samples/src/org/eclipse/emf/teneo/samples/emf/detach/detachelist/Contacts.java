/**
 * <copyright>
 * </copyright>
 *
 * $Id: Contacts.java,v 1.1 2006/07/11 16:57:10 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.detach.detachelist;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contacts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.detach.detachelist.Contacts#getPersons <em>Persons</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.detach.detachelist.Contacts#getContainedPersons <em>Contained Persons</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.detach.detachelist.DetachelistPackage#getContacts()
 * @model extendedMetaData="name='Contacts' kind='elementOnly'"
 * @generated
 */
public interface Contacts extends EObject{
	/**
	 * Returns the value of the '<em><b>Persons</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.detach.detachelist.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persons</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachelist.DetachelistPackage#getContacts_Persons()
	 * @model type="org.eclipse.emf.teneo.samples.emf.detach.detachelist.Person" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='persons'"
	 * @generated
	 */
	EList getPersons();

	/**
	 * Returns the value of the '<em><b>Contained Persons</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.detach.detachelist.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Persons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Persons</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachelist.DetachelistPackage#getContacts_ContainedPersons()
	 * @model type="org.eclipse.emf.teneo.samples.emf.detach.detachelist.Person" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='containedPersons'"
	 * @generated
	 */
	EList getContainedPersons();

} // Contacts
