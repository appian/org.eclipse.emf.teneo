/**
 * <copyright>
 * </copyright>
 *
 * $Id: IdFactory.java,v 1.2 2007/01/24 23:30:16 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.id;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.IdPackage
 * @generated
 */
public interface IdFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IdFactory eINSTANCE = org.eclipse.emf.teneo.samples.emf.annotations.id.impl.IdFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Identity ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identity ID</em>'.
	 * @generated
	 */
	IdentityID createIdentityID();

	/**
	 * Returns a new object of class '<em>Simple ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple ID</em>'.
	 * @generated
	 */
	SimpleID createSimpleID();

	/**
	 * Returns a new object of class '<em>Table ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table ID</em>'.
	 * @generated
	 */
	TableID createTableID();

	/**
	 * Returns a new object of class '<em>Table Generator ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Generator ID</em>'.
	 * @generated
	 */
	TableGeneratorID createTableGeneratorID();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IdPackage getIdPackage();

} //IdFactory
