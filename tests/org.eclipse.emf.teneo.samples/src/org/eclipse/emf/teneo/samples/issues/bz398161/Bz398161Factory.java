/**
 */
package org.eclipse.emf.teneo.samples.issues.bz398161;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.bz398161.Bz398161Package
 * @generated
 */
public interface Bz398161Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz398161Factory eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz398161.impl.Bz398161FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ref One</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ref One</em>'.
	 * @generated
	 */
	RefOne createRefOne();

	/**
	 * Returns a new object of class '<em>Ref Two</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ref Two</em>'.
	 * @generated
	 */
	RefTwo createRefTwo();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Bz398161Package getBz398161Package();

} //Bz398161Factory
