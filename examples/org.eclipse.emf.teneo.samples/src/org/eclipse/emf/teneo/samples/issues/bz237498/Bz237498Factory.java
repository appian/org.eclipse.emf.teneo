/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz237498Factory.java,v 1.1 2008/06/28 22:41:35 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz237498;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.bz237498.Bz237498Package
 * @generated
 */
public interface Bz237498Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz237498Factory eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz237498.impl.Bz237498FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>One</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>One</em>'.
	 * @generated
	 */
	One createOne();

	/**
	 * Returns a new object of class '<em>Many</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Many</em>'.
	 * @generated
	 */
	Many createMany();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Bz237498Package getBz237498Package();

} //Bz237498Factory
