/**
 * <copyright>
 * </copyright>
 *
 * $Id: DetachtestFactory.java,v 1.1 2006/07/11 16:57:02 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.detach.detachtest;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.detach.detachtest.DetachtestPackage
 * @generated
 */
public interface DetachtestFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DetachtestFactory eINSTANCE = new org.eclipse.emf.teneo.samples.emf.detach.detachtest.impl.DetachtestFactoryImpl();

	/**
	 * Returns a new object of class '<em>Test A</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test A</em>'.
	 * @generated
	 */
	TestA createTestA();

	/**
	 * Returns a new object of class '<em>Test B</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test B</em>'.
	 * @generated
	 */
	TestB createTestB();

	/**
	 * Returns a new object of class '<em>Test C</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test C</em>'.
	 * @generated
	 */
	TestC createTestC();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DetachtestPackage getDetachtestPackage();

} //DetachtestFactory
