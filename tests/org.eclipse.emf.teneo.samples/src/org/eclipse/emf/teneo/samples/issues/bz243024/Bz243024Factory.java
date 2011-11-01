/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz243024Factory.java,v 1.1 2008/09/01 12:45:05 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz243024;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.bz243024.Bz243024Package
 * @generated
 */
public interface Bz243024Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz243024Factory eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz243024.impl.Bz243024FactoryImpl.init();

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
	Bz243024Package getBz243024Package();

} //Bz243024Factory
