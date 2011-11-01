/**
 * <copyright>
 * </copyright>
 *
 * $Id: ForcedidbagFactory.java,v 1.1 2007/03/21 15:45:37 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.forcedidbag;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.annotations.forcedidbag.ForcedidbagPackage
 * @generated
 */
public interface ForcedidbagFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ForcedidbagFactory eINSTANCE = org.eclipse.emf.teneo.samples.emf.annotations.forcedidbag.impl.ForcedidbagFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	Role createRole();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ForcedidbagPackage getForcedidbagPackage();

} //ForcedidbagFactory
