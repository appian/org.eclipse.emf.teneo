/**
 * <copyright>
 * </copyright>
 *
 * $Id: GroupallFactory.java,v 1.1 2006/07/11 16:57:10 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.GroupallPackage
 * @generated
 */
public interface GroupallFactory extends EFactory{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GroupallFactory eINSTANCE = new org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl.GroupallFactoryImpl();

	/**
	 * Returns a new object of class '<em>Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address</em>'.
	 * @generated
	 */
	Address createAddress();

	/**
	 * Returns a new object of class '<em>Address Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address Group</em>'.
	 * @generated
	 */
	AddressGroup createAddressGroup();

	/**
	 * Returns a new object of class '<em>Address List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address List</em>'.
	 * @generated
	 */
	AddressList createAddressList();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Simple All Map Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple All Map Type</em>'.
	 * @generated
	 */
	SimpleAllMapType createSimpleAllMapType();

	/**
	 * Returns a new object of class '<em>Simple All Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple All Type</em>'.
	 * @generated
	 */
	SimpleAllType createSimpleAllType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GroupallPackage getGroupallPackage();

} //GroupallFactory
