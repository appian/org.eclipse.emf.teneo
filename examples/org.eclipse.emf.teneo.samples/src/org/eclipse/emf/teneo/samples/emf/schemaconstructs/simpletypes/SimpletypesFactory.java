/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpletypesFactory.java,v 1.1 2006/07/11 16:57:08 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage
 * @generated
 */
public interface SimpletypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimpletypesFactory eINSTANCE = org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpletypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Simple List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple List</em>'.
	 * @generated
	 */
	SimpleList createSimpleList();

	/**
	 * Returns a new object of class '<em>Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Type</em>'.
	 * @generated
	 */
	SimpleType createSimpleType();

	/**
	 * Returns a new object of class '<em>Simple Type Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Type Object</em>'.
	 * @generated
	 */
	SimpleTypeObject createSimpleTypeObject();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SimpletypesPackage getSimpletypesPackage();

} //SimpletypesFactory
