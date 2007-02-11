/**
 * <copyright>
 * </copyright>
 *
 * $Id: UniqueconstraintsFactory.java,v 1.1.4.1 2007/02/11 20:43:03 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.uniqueconstraints;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.annotations.uniqueconstraints.UniqueconstraintsPackage
 * @generated
 */
public interface UniqueconstraintsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UniqueconstraintsFactory eINSTANCE = org.eclipse.emf.teneo.samples.emf.annotations.uniqueconstraints.impl.UniqueconstraintsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item</em>'.
	 * @generated
	 */
	Item createItem();

	/**
	 * Returns a new object of class '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project</em>'.
	 * @generated
	 */
	Project createProject();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UniqueconstraintsPackage getUniqueconstraintsPackage();

} //UniqueconstraintsFactory
