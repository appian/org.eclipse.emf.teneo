/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz280355Factory.java,v 1.1.2.2 2009/06/29 23:03:16 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz280355;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.bz280355.Bz280355Package
 * @generated
 */
public interface Bz280355Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz280355Factory eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz280355.impl.Bz280355FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Leiter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Leiter</em>'.
	 * @generated
	 */
	Leiter createLeiter();

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
	Bz280355Package getBz280355Package();

} //Bz280355Factory
