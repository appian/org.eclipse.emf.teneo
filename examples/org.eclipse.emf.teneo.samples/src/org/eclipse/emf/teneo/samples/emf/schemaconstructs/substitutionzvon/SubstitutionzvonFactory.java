/**
 * <copyright>
 * </copyright>
 *
 * $Id: SubstitutionzvonFactory.java,v 1.1 2006/07/11 16:56:58 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.SubstitutionzvonPackage
 * @generated
 */
public interface SubstitutionzvonFactory extends EFactory{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SubstitutionzvonFactory eINSTANCE = new org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.impl.SubstitutionzvonFactoryImpl();

	/**
	 * Returns a new object of class '<em>Complex AAA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex AAA</em>'.
	 * @generated
	 */
	ComplexAAA createComplexAAA();

	/**
	 * Returns a new object of class '<em>Complex Even Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Even Type</em>'.
	 * @generated
	 */
	ComplexEvenType createComplexEvenType();

	/**
	 * Returns a new object of class '<em>Complex Odd Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Odd Type</em>'.
	 * @generated
	 */
	ComplexOddType createComplexOddType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Root Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Type</em>'.
	 * @generated
	 */
	RootType createRootType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SubstitutionzvonPackage getSubstitutionzvonPackage();

} //SubstitutionzvonFactory
