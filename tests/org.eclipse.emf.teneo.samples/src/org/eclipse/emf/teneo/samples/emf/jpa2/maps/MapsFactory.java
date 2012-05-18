/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.samples.emf.jpa2.maps;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.MapsPackage
 * @generated
 */
public interface MapsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MapsFactory eINSTANCE = org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.MapsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Images</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Images</em>'.
	 * @generated
	 */
	Images createImages();

	/**
	 * Returns a new object of class '<em>Photo Book</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Photo Book</em>'.
	 * @generated
	 */
	PhotoBook createPhotoBook();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MapsPackage getMapsPackage();

} //MapsFactory
