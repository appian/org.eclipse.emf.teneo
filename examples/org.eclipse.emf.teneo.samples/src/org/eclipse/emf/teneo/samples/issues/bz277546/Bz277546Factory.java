/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz277546Factory.java,v 1.2 2009/05/23 10:49:52 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz277546;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.bz277546.Bz277546Package
 * @generated
 */
public interface Bz277546Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz277546Factory eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz277546.impl.Bz277546FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Another Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Another Version</em>'.
	 * @generated
	 */
	AnotherVersion createAnotherVersion();

	/**
	 * Returns a new object of class '<em>Date Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Version</em>'.
	 * @generated
	 */
	DateVersion createDateVersion();

	/**
	 * Returns a new object of class '<em>Simple Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Version</em>'.
	 * @generated
	 */
	SimpleVersion createSimpleVersion();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Bz277546Package getBz277546Package();

} //Bz277546Factory
