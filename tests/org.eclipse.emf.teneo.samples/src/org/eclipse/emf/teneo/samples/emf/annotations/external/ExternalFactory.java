/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExternalFactory.java,v 1.1 2008/12/16 20:40:24 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.external;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.annotations.external.ExternalPackage
 * @generated
 */
public interface ExternalFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExternalFactory eINSTANCE = org.eclipse.emf.teneo.samples.emf.annotations.external.impl.ExternalFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test</em>'.
	 * @generated
	 */
	ExternalTest createExternalTest();

	/**
	 * Returns a new object of class '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object</em>'.
	 * @generated
	 */
	ExternalObject createExternalObject();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExternalPackage getExternalPackage();

} //ExternalFactory
