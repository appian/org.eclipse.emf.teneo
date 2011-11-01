/**
 * <copyright>
 * </copyright>
 *
 * $Id: ListFactory.java,v 1.1 2006/07/11 16:57:14 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.list;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.ListPackage
 * @generated
 */
public interface ListFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ListFactory eINSTANCE = org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.impl.ListFactoryImpl.init();

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
	ListPackage getListPackage();

} //ListFactory
