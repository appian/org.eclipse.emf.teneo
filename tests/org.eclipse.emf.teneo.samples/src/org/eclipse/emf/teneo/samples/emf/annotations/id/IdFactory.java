/**
 * <copyright>
 * </copyright>
 *
 * $Id: IdFactory.java,v 1.4 2007/11/15 14:48:27 mtaal Exp $
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
	 * Returns a new object of class '<em>Auto ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auto ID</em>'.
	 * @generated
	 */
	AutoID createAutoID();

	/**
	 * Returns a new object of class '<em>Other Table Generator ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Other Table Generator ID</em>'.
	 * @generated
	 */
	OtherTableGeneratorID createOtherTableGeneratorID();

	/**
	 * Returns a new object of class '<em>Sequence ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence ID</em>'.
	 * @generated
	 */
	SequenceID createSequenceID();

	/**
	 * Returns a new object of class '<em>Sequence Style ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Style ID</em>'.
	 * @generated
	 */
	SequenceStyleID createSequenceStyleID();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IdPackage getIdPackage();

} //IdFactory
