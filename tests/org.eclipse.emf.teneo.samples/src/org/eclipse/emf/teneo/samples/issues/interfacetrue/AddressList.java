/**
 * <copyright>
 * </copyright>
 *
 * $Id: AddressList.java,v 1.1 2008/09/17 20:28:01 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.interfacetrue;

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
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.interfacetrue.AddressList#getAddresses <em>Addresses</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.interfacetrue.InterfacetruePackage#getAddressList()
 * @model
 * @generated
 */
public interface AddressList extends EObject {
	/**
	 * Returns the value of the '<em><b>Addresses</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.issues.interfacetrue.Address}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addresses</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addresses</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.issues.interfacetrue.InterfacetruePackage#getAddressList_Addresses()
	 * @model
	 * @generated
	 */
	EList<Address> getAddresses();

} // AddressList
