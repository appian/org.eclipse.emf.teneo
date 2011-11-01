/**
 * <copyright>
 * </copyright>
 *
 * $Id: ClaimFactory.java,v 1.1 2008/01/18 06:20:18 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.claim;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimPackage
 * @generated
 */
public interface ClaimFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClaimFactory eINSTANCE = org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Claim</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim</em>'.
	 * @generated
	 */
	Claim createClaim();

	/**
	 * Returns a new object of class '<em>Composite Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Key</em>'.
	 * @generated
	 */
	ClaimCompositeKey createClaimCompositeKey();

	/**
	 * Returns a new object of class '<em>Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line</em>'.
	 * @generated
	 */
	ClaimLine createClaimLine();

	/**
	 * Returns a new object of class '<em>Line Composite Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line Composite Key</em>'.
	 * @generated
	 */
	ClaimLineCompositeKey createClaimLineCompositeKey();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ClaimPackage getClaimPackage();

} //ClaimFactory
