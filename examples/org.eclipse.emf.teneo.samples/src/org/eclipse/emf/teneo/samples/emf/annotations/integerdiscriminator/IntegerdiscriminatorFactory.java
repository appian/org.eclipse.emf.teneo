/**
 * <copyright>
 * </copyright>
 *
 * $Id: IntegerdiscriminatorFactory.java,v 1.1 2008/06/10 06:45:05 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.IntegerdiscriminatorPackage
 * @generated
 */
public interface IntegerdiscriminatorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntegerdiscriminatorFactory eINSTANCE = org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl.IntegerdiscriminatorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Super</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Super</em>'.
	 * @generated
	 */
	Super createSuper();

	/**
	 * Returns a new object of class '<em>Sub</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub</em>'.
	 * @generated
	 */
	Sub createSub();

	/**
	 * Returns a new object of class '<em>Other Sub</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Other Sub</em>'.
	 * @generated
	 */
	OtherSub createOtherSub();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IntegerdiscriminatorPackage getIntegerdiscriminatorPackage();

} //IntegerdiscriminatorFactory
