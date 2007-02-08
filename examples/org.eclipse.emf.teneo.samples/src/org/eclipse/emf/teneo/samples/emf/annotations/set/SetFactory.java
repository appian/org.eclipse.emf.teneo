/**
 * <copyright>
 * </copyright>
 *
 * $Id: SetFactory.java,v 1.2 2007/02/08 23:09:24 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.set;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.annotations.set.SetPackage
 * @generated
 */
public interface SetFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "";
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SetFactory eINSTANCE = org.eclipse.emf.teneo.samples.emf.annotations.set.impl.SetFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Contained Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contained Item</em>'.
	 * @generated
	 */
	ContainedItem createContainedItem();

	/**
	 * Returns a new object of class '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item</em>'.
	 * @generated
	 */
	Item createItem();

	/**
	 * Returns a new object of class '<em>Item List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item List</em>'.
	 * @generated
	 */
	ItemList createItemList();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SetPackage getSetPackage();

} //SetFactory
