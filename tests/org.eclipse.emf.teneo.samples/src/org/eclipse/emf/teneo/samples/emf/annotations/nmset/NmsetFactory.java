/**
 * <copyright>
 * </copyright>
 *
 * $Id: NmsetFactory.java,v 1.1 2006/07/11 16:56:59 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.nmset;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.annotations.nmset.NmsetPackage
 * @generated
 */
public interface NmsetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NmsetFactory eINSTANCE = org.eclipse.emf.teneo.samples.emf.annotations.nmset.impl.NmsetFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>My Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>My Item</em>'.
	 * @generated
	 */
	MyItem createMyItem();

	/**
	 * Returns a new object of class '<em>Your Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Your Item</em>'.
	 * @generated
	 */
	YourItem createYourItem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NmsetPackage getNmsetPackage();

} //NmsetFactory
