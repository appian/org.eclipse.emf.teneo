/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz247785Factory.java,v 1.1 2008/09/20 21:20:21 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz247785;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.bz247785.Bz247785Package
 * @generated
 */
public interface Bz247785Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz247785Factory eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz247785.impl.Bz247785FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Owner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Owner</em>'.
	 * @generated
	 */
	Owner createOwner();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Bz247785Package getBz247785Package();

} //Bz247785Factory
