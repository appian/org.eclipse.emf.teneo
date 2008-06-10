/**
 * <copyright>
 * </copyright>
 *
 * $Id: SecondaryFactory.java,v 1.1 2008/06/10 05:25:51 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.secondary;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.secondary.SecondaryPackage
 * @generated
 */
public interface SecondaryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecondaryFactory eINSTANCE = org.eclipse.emf.teneo.samples.issues.secondary.impl.SecondaryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Generic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic</em>'.
	 * @generated
	 */
	Generic createGeneric();

	/**
	 * Returns a new object of class '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
	Person createPerson();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SecondaryPackage getSecondaryPackage();

} //SecondaryFactory
