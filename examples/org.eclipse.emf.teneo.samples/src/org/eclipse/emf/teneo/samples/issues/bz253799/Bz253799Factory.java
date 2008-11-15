/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz253799Factory.java,v 1.1 2008/11/15 21:37:31 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz253799;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.bz253799.Bz253799Package
 * @generated
 */
public interface Bz253799Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz253799Factory eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz253799.impl.Bz253799FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>One</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>One</em>'.
	 * @generated
	 */
	One createOne();

	/**
	 * Returns a new object of class '<em>Two</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Two</em>'.
	 * @generated
	 */
	Two createTwo();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Bz253799Package getBz253799Package();

} //Bz253799Factory
