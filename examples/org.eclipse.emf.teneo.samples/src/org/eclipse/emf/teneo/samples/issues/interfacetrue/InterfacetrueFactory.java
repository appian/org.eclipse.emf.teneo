/**
 * <copyright>
 * </copyright>
 *
 * $Id: InterfacetrueFactory.java,v 1.1 2006/07/11 16:57:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.interfacetrue;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.interfacetrue.InterfacetruePackage
 * @generated
 */
public interface InterfacetrueFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InterfacetrueFactory eINSTANCE = new org.eclipse.emf.teneo.samples.issues.interfacetrue.impl.InterfacetrueFactoryImpl();

	/**
	 * Returns a new object of class '<em>US Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>US Address</em>'.
	 * @generated
	 */
	USAddress createUSAddress();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InterfacetruePackage getInterfacetruePackage();

} //InterfacetrueFactory
