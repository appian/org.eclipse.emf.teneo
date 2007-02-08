/**
 * <copyright>
 * </copyright>
 *
 * $Id: ListunionFactory.java,v 1.2 2007/02/08 23:09:25 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.ListunionPackage
 * @generated
 */
public interface ListunionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ListunionFactory eINSTANCE = org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.impl.ListunionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>states By Country</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>states By Country</em>'.
	 * @generated
	 */
	statesByCountry createstatesByCountry();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ListunionPackage getListunionPackage();

} //ListunionFactory
