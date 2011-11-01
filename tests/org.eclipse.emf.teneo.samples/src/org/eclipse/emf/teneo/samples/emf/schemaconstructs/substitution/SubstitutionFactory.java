/**
 * <copyright>
 * </copyright>
 *
 * $Id: SubstitutionFactory.java,v 1.1 2006/07/11 16:57:16 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.SubstitutionPackage
 * @generated
 */
public interface SubstitutionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SubstitutionFactory eINSTANCE = new org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.SubstitutionFactoryImpl();

	/**
	 * Returns a new object of class '<em>Complex Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Number</em>'.
	 * @generated
	 */
	ComplexNumber createComplexNumber();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Even Complex Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Even Complex Number Type</em>'.
	 * @generated
	 */
	EvenComplexNumberType createEvenComplexNumberType();

	/**
	 * Returns a new object of class '<em>Multi Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Number Type</em>'.
	 * @generated
	 */
	MultiNumberType createMultiNumberType();

	/**
	 * Returns a new object of class '<em>Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Type</em>'.
	 * @generated
	 */
	NumberType createNumberType();

	/**
	 * Returns a new object of class '<em>Odd Complex Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Odd Complex Number Type</em>'.
	 * @generated
	 */
	OddComplexNumberType createOddComplexNumberType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SubstitutionPackage getSubstitutionPackage();

} //SubstitutionFactory
