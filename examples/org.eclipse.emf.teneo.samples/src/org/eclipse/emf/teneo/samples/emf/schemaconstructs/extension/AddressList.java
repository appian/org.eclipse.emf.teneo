/**
 * <copyright>
 * </copyright>
 *
 * $Id: AddressList.java,v 1.3 2007/02/08 23:09:20 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.AddressList#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.AddressList#getFirstAddress <em>First Address</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.AddressList#getSecondAddress <em>Second Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.ExtensionPackage#getAddressList()
 * @model extendedMetaData="name='AddressList' kind='elementOnly'"
 * @generated
 */
public interface AddressList extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.ExtensionPackage#getAddressList_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.AddressList#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>First Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Address</em>' containment reference.
	 * @see #setFirstAddress(FirstAddressHolder)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.ExtensionPackage#getAddressList_FirstAddress()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='firstAddress'"
	 * @generated
	 */
	FirstAddressHolder getFirstAddress();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.AddressList#getFirstAddress <em>First Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Address</em>' containment reference.
	 * @see #getFirstAddress()
	 * @generated
	 */
	void setFirstAddress(FirstAddressHolder value);

	/**
	 * Returns the value of the '<em><b>Second Address</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.Address}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Address</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Address</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.ExtensionPackage#getAddressList_SecondAddress()
	 * @model type="org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.Address" required="true"
	 *        extendedMetaData="kind='element' name='secondAddress'"
	 * @generated
	 */
	EList<Address> getSecondAddress();

} // AddressList
