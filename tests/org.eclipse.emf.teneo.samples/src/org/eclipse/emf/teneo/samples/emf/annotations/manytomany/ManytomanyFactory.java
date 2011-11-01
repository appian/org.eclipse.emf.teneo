/**
 * <copyright>
 * </copyright>
 *
 * $Id: ManytomanyFactory.java,v 1.1 2006/07/11 16:57:18 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.manytomany;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.annotations.manytomany.ManytomanyPackage
 * @generated
 */
public interface ManytomanyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ManytomanyFactory eINSTANCE = org.eclipse.emf.teneo.samples.emf.annotations.manytomany.impl.ManytomanyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cntr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cntr</em>'.
	 * @generated
	 */
	Cntr createCntr();

	/**
	 * Returns a new object of class '<em>Lft</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lft</em>'.
	 * @generated
	 */
	Lft createLft();

	/**
	 * Returns a new object of class '<em>Rght</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rght</em>'.
	 * @generated
	 */
	Rght createRght();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ManytomanyPackage getManytomanyPackage();

} //ManytomanyFactory
