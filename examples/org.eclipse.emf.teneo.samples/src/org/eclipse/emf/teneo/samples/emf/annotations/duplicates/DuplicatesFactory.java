/**
 * <copyright>
 * </copyright>
 *
 * $Id: DuplicatesFactory.java,v 1.1 2006/07/11 16:57:04 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.duplicates;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.annotations.duplicates.DuplicatesPackage
 * @generated
 */
public interface DuplicatesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DuplicatesFactory eINSTANCE = org.eclipse.emf.teneo.samples.emf.annotations.duplicates.impl.DuplicatesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Child Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Child Item</em>'.
	 * @generated
	 */
	ChildItem createChildItem();

	/**
	 * Returns a new object of class '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item</em>'.
	 * @generated
	 */
	Item createItem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DuplicatesPackage getDuplicatesPackage();

} //DuplicatesFactory
