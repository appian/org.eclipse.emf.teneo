/**
 * <copyright>
 * </copyright>
 *
 * $Id: Address.java,v 1.1 2007/03/04 21:18:27 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.hibernate.usertype;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Address</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Address#getAddressInfo <em>Address
 * Info</em>}</li>
 * <li>
 * {@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Address#getPerson <em>Person</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.UsertypePackage#getAddress()
 * @model extendedMetaData="name='Person' kind='elementOnly'"
 * @generated
 */
public interface Address extends EObject {
	/**
	 * Returns the value of the '<em><b>Address Info</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address Info</em>' attribute isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Address Info</em>' attribute.
	 * @see #setAddressInfo(String)
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.UsertypePackage#getAddress_AddressInfo()
	 * @model unique="false" required="true" extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getAddressInfo();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Address#getAddressInfo
	 * <em>Address Info</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Address Info</em>' attribute.
	 * @see #getAddressInfo()
	 * @generated
	 */
	void setAddressInfo(String value);

	/**
	 * Returns the value of the '<em><b>Person</b></em>' reference. It is bidirectional and its
	 * opposite is ' {@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Person#getAddresses
	 * <em>Addresses</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Person</em>' reference.
	 * @see #setPerson(Person)
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.UsertypePackage#getAddress_Person()
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Person#getAddresses
	 * @model opposite="addresses"
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Address#getPerson <em>Person</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Person</em>' reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Person value);

} // Address
