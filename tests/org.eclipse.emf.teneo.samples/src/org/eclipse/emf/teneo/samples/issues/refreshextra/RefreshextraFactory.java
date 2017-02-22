/**
 */
package org.eclipse.emf.teneo.samples.issues.refreshextra;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.RefreshextraPackage
 * @generated
 */
public interface RefreshextraFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RefreshextraFactory eINSTANCE = org.eclipse.emf.teneo.samples.issues.refreshextra.impl.RefreshextraFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Item Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Container</em>'.
	 * @generated
	 */
	ItemContainer createItemContainer();

	/**
	 * Returns a new object of class '<em>Item Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Element</em>'.
	 * @generated
	 */
	ItemElement createItemElement();

	/**
	 * Returns a new object of class '<em>Item Non Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Non Container</em>'.
	 * @generated
	 */
	ItemNonContainer createItemNonContainer();

	/**
	 * Returns a new object of class '<em>Item Non Container2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Non Container2</em>'.
	 * @generated
	 */
	ItemNonContainer2 createItemNonContainer2();

	/**
	 * Returns a new object of class '<em>Item Container2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Container2</em>'.
	 * @generated
	 */
	ItemContainer2 createItemContainer2();

	/**
	 * Returns a new object of class '<em>Item Element Bidir</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Element Bidir</em>'.
	 * @generated
	 */
	ItemElementBidir createItemElementBidir();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RefreshextraPackage getRefreshextraPackage();

} //RefreshextraFactory
