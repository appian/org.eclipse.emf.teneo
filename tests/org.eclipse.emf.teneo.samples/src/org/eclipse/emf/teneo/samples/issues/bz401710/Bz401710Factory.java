/**
 */
package org.eclipse.emf.teneo.samples.issues.bz401710;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.bz401710.Bz401710Package
 * @generated
 */
public interface Bz401710Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz401710Factory eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz401710.impl.Bz401710FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Real Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Real Class</em>'.
	 * @generated
	 */
	RealClass createRealClass();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Bz401710Package getBz401710Package();

} //Bz401710Factory
