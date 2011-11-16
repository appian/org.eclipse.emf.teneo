/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.samples.issues.bz363777;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.bz363777.Bz363777Package
 * @generated
 */
public interface Bz363777Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz363777Factory eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz363777.impl.Bz363777FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Channel Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Channel Map</em>'.
	 * @generated
	 */
	ChannelMap createChannelMap();

	/**
	 * Returns a new object of class '<em>Channel Map Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Channel Map Service</em>'.
	 * @generated
	 */
	ChannelMapService createChannelMapService();

	/**
	 * Returns a new object of class '<em>NE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NE</em>'.
	 * @generated
	 */
	NE createNE();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Bz363777Package getBz363777Package();

} //Bz363777Factory
