/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz225296Factory.java,v 1.1 2008/04/04 11:50:23 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz225296;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.bz225296.Bz225296Package
 * @generated
 */
public interface Bz225296Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz225296Factory eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz225296.impl.Bz225296FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block</em>'.
	 * @generated
	 */
	Block createBlock();

	/**
	 * Returns a new object of class '<em>VServer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VServer</em>'.
	 * @generated
	 */
	VServer createVServer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Bz225296Package getBz225296Package();

} //Bz225296Factory
