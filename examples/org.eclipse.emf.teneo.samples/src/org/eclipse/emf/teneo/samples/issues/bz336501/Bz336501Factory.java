/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz336501Factory.java,v 1.1 2011/02/21 05:47:40 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz336501;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.bz336501.Bz336501Package
 * @generated
 */
public interface Bz336501Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz336501Factory eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz336501.impl.Bz336501FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test</em>'.
	 * @generated
	 */
	Test createTest();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Bz336501Package getBz336501Package();

} //Bz336501Factory
