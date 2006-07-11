/**
 * <copyright>
 * </copyright>
 *
 * $Id: EnumtestFactory.java,v 1.1 2006/07/11 16:57:03 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.enumtest;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.enumtest.EnumtestPackage
 * @generated
 */
public interface EnumtestFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnumtestFactory eINSTANCE = org.eclipse.emf.teneo.samples.issues.enumtest.impl.EnumtestFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item</em>'.
	 * @generated
	 */
	Item createItem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EnumtestPackage getEnumtestPackage();

} //EnumtestFactory
