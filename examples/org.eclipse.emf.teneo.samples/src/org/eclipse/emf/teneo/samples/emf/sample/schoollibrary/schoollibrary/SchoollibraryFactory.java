/**
 * <copyright>
 * </copyright>
 *
 * $Id: SchoollibraryFactory.java,v 1.2 2007/02/08 23:09:22 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.schoollibrary;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.schoollibrary.SchoollibraryPackage
 * @generated
 */
public interface SchoollibraryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchoollibraryFactory eINSTANCE = org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.schoollibrary.impl.SchoollibraryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Asset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asset</em>'.
	 * @generated
	 */
	Asset createAsset();

	/**
	 * Returns a new object of class '<em>School Book</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>School Book</em>'.
	 * @generated
	 */
	SchoolBook createSchoolBook();

	/**
	 * Returns a new object of class '<em>School Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>School Library</em>'.
	 * @generated
	 */
	SchoolLibrary createSchoolLibrary();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SchoollibraryPackage getSchoollibraryPackage();

} //SchoollibraryFactory
