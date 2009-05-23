/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz277570Factory.java,v 1.2 2009/05/23 13:57:53 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.adept;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.adept.Bz277570Package
 * @generated
 */
public interface Bz277570Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz277570Factory eINSTANCE = org.eclipse.emf.teneo.samples.issues.adept.impl.Bz277570FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Foo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Foo</em>'.
	 * @generated
	 */
	Foo createFoo();

	/**
	 * Returns a new object of class '<em>Bar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bar</em>'.
	 * @generated
	 */
	Bar createBar();

	/**
	 * Returns a new object of class '<em>Biff</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Biff</em>'.
	 * @generated
	 */
	Biff createBiff();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Bz277570Package getBz277570Package();

} //Bz277570Factory
