/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz302933_2Factory.java,v 1.1 2010/03/02 21:43:54 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_2.Bz302933_2Package
 * @generated
 */
public interface Bz302933_2Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz302933_2Factory eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_2.impl.Bz302933_2FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Transient Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transient Type</em>'.
	 * @generated
	 */
	TransientType createTransientType();

	/**
	 * Returns a new object of class '<em>Not Transient Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Transient Type</em>'.
	 * @generated
	 */
	NotTransientType createNotTransientType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Bz302933_2Package getBz302933_2Package();

} //Bz302933_2Factory
