/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz321773Factory.java,v 1.1 2010/08/19 08:34:51 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz321773;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.bz321773.Bz321773Package
 * @generated
 */
public interface Bz321773Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz321773Factory eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz321773.impl.Bz321773FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Item1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item1</em>'.
	 * @generated
	 */
	Item1 createItem1();

	/**
	 * Returns a new object of class '<em>Item2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item2</em>'.
	 * @generated
	 */
	Item2 createItem2();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Bz321773Package getBz321773Package();

} //Bz321773Factory
