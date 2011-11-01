/**
 * <copyright>
 * </copyright>
 *
 * $Id: OtopkFactory.java,v 1.1 2008/06/29 20:09:02 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.otopk;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.annotations.otopk.OtopkPackage
 * @generated
 */
public interface OtopkFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OtopkFactory eINSTANCE = org.eclipse.emf.teneo.samples.emf.annotations.otopk.impl.OtopkFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Employee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Employee</em>'.
	 * @generated
	 */
	Employee createEmployee();

	/**
	 * Returns a new object of class '<em>Employee Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Employee Info</em>'.
	 * @generated
	 */
	EmployeeInfo createEmployeeInfo();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OtopkPackage getOtopkPackage();

} //OtopkFactory
