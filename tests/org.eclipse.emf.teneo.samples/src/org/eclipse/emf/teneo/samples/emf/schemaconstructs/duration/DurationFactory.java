/**
 * <copyright>
 * </copyright>
 *
 * $Id: DurationFactory.java,v 1.1 2008/02/03 22:37:05 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration.DurationPackage
 * @generated
 */
public interface DurationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DurationFactory eINSTANCE = org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration.impl.DurationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test</em>'.
	 * @generated
	 */
	DurationTest createDurationTest();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DurationPackage getDurationPackage();

} //DurationFactory
