/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz321765Factory.java,v 1.1 2011/03/17 09:47:34 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz321765;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.bz321765.Bz321765Package
 * @generated
 */
public interface Bz321765Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz321765Factory eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz321765.impl.Bz321765FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Employee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Employee</em>'.
	 * @generated
	 */
	Employee createEmployee();

	/**
	 * Returns a new object of class '<em>Employee PK</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Employee PK</em>'.
	 * @generated
	 */
	EmployeePK createEmployeePK();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Bz321765Package getBz321765Package();

} //Bz321765Factory
