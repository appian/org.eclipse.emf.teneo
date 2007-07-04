/**
 * <copyright>
 * </copyright>
 *
 * $Id: Address.java,v 1.1 2007/07/04 19:29:56 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.generaltest;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.generaltest.Address#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.generaltest.Address#getContacts <em>Contacts</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.generaltest.Address#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.generaltest.Address#getCountry <em>Country</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.generaltest.Address#getCity <em>City</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.generaltest.Address#getTc <em>Tc</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.generaltest.GeneralTestPackage#getAddress()
 * @model
 * @generated
 */
public interface Address extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.teneo.samples.issues.generaltest.GeneralTestPackage#getAddress_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.generaltest.Address#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Contacts</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.issues.generaltest.Contact}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.issues.generaltest.Contact#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contacts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contacts</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.issues.generaltest.GeneralTestPackage#getAddress_Contacts()
	 * @see org.eclipse.emf.teneo.samples.issues.generaltest.Contact#getAddress
	 * @model opposite="address" containment="true"
	 * @generated
	 */
	EList<Contact> getContacts();

	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(State)
	 * @see org.eclipse.emf.teneo.samples.issues.generaltest.GeneralTestPackage#getAddress_State()
	 * @model required="true"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.generaltest.Address#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' reference.
	 * @see #setCountry(Country)
	 * @see org.eclipse.emf.teneo.samples.issues.generaltest.GeneralTestPackage#getAddress_Country()
	 * @model
	 * @generated
	 */
	Country getCountry();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.generaltest.Address#getCountry <em>Country</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' reference.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(Country value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' containment reference.
	 * @see #setCity(City)
	 * @see org.eclipse.emf.teneo.samples.issues.generaltest.GeneralTestPackage#getAddress_City()
	 * @model containment="true"
	 * @generated
	 */
	City getCity();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.generaltest.Address#getCity <em>City</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' containment reference.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(City value);

	/**
	 * Returns the value of the '<em><b>Tc</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.issues.generaltest.TC}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.issues.generaltest.TC#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tc</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tc</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.issues.generaltest.GeneralTestPackage#getAddress_Tc()
	 * @see org.eclipse.emf.teneo.samples.issues.generaltest.TC#getAddress
	 * @model opposite="address" containment="true" transient="true"
	 * @generated
	 */
	EList<TC> getTc();

} // Address
