/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz284859Factory.java,v 1.1 2009/10/09 22:59:57 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz284859;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.bz284859.Bz284859Package
 * @generated
 */
public interface Bz284859Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz284859Factory eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz284859.impl.Bz284859FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Bar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bar</em>'.
	 * @generated
	 */
	Bar createBar();

	/**
	 * Returns a new object of class '<em>Foo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Foo</em>'.
	 * @generated
	 */
	Foo createFoo();

	/**
	 * Returns a new object of class '<em>Bar Derived</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bar Derived</em>'.
	 * @generated
	 */
	BarDerived createBarDerived();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Bz284859Package getBz284859Package();

} //Bz284859Factory
