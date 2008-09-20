/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz247785SubFactory.java,v 1.1 2008/09/20 21:20:21 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz247785.bz247785Sub;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.bz247785.bz247785Sub.Bz247785SubPackage
 * @generated
 */
public interface Bz247785SubFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz247785SubFactory eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz247785.bz247785Sub.impl.Bz247785SubFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Animal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Animal</em>'.
	 * @generated
	 */
	Animal createAnimal();

	/**
	 * Returns a new object of class '<em>Cat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cat</em>'.
	 * @generated
	 */
	Cat createCat();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Bz247785SubPackage getBz247785SubPackage();

} //Bz247785SubFactory
