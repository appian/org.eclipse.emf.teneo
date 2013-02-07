/**
 */
package org.eclipse.emf.teneo.samples.issues.bz400088;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.bz400088.Bz400088Package
 * @generated
 */
public interface Bz400088Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz400088Factory eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz400088.impl.Bz400088FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Case1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case1</em>'.
	 * @generated
	 */
	Case1 createCase1();

	/**
	 * Returns a new object of class '<em>Case2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case2</em>'.
	 * @generated
	 */
	Case2 createCase2();

	/**
	 * Returns a new object of class '<em>Ref400088</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ref400088</em>'.
	 * @generated
	 */
	Ref400088 createRef400088();

	/**
	 * Returns a new object of class '<em>Ref Other400088</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ref Other400088</em>'.
	 * @generated
	 */
	RefOther400088 createRefOther400088();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Bz400088Package getBz400088Package();

} //Bz400088Factory
