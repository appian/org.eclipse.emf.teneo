/**
 * <copyright>
 * </copyright>
 *
 * $Id: NaturalIdFactory.java,v 1.1 2008/06/29 14:23:14 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.naturalId;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.annotations.naturalId.NaturalIdPackage
 * @generated
 */
public interface NaturalIdFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NaturalIdFactory eINSTANCE = org.eclipse.emf.teneo.samples.emf.annotations.naturalId.impl.NaturalIdFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
	Person createPerson();

	/**
	 * Returns a new object of class '<em>Family</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Family</em>'.
	 * @generated
	 */
	Family createFamily();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NaturalIdPackage getNaturalIdPackage();

} //NaturalIdFactory
