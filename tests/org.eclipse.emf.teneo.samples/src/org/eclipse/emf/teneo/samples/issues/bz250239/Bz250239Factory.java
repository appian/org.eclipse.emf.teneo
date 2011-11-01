/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz250239Factory.java,v 1.1 2008/10/27 13:18:30 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz250239;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.bz250239.Bz250239Package
 * @generated
 */
public interface Bz250239Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz250239Factory eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz250239.impl.Bz250239FactoryImpl.init();

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
	 * Returns a new object of class '<em>Real Sequence ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Real Sequence ID</em>'.
	 * @generated
	 */
	RealSequenceID createRealSequenceID();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Bz250239Package getBz250239Package();

} //Bz250239Factory
