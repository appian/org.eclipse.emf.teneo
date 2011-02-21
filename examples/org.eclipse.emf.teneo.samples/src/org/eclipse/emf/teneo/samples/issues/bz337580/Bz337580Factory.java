/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz337580Factory.java,v 1.1 2011/02/21 06:40:19 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz337580;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.bz337580.Bz337580Package
 * @generated
 */
public interface Bz337580Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz337580Factory eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz337580.impl.Bz337580FactoryImpl.init();

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
	Bz337580Package getBz337580Package();

} //Bz337580Factory
