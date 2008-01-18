/**
 * <copyright>
 * </copyright>
 *
 * $Id: ClaimFactoryImpl.java,v 1.1 2008/01/18 06:20:17 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.claim.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.teneo.samples.emf.sample.claim.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClaimFactoryImpl extends EFactoryImpl implements ClaimFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClaimFactory init() {
		try {
			ClaimFactory theClaimFactory = (ClaimFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/emf/sample/claim"); 
			if (theClaimFactory != null) {
				return theClaimFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ClaimFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ClaimPackage.CLAIM: return createClaim();
			case ClaimPackage.CLAIM_COMPOSITE_KEY: return createClaimCompositeKey();
			case ClaimPackage.CLAIM_LINE: return createClaimLine();
			case ClaimPackage.CLAIM_LINE_COMPOSITE_KEY: return createClaimLineCompositeKey();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Claim createClaim() {
		ClaimImpl claim = new ClaimImpl();
		return claim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimCompositeKey createClaimCompositeKey() {
		ClaimCompositeKeyImpl claimCompositeKey = new ClaimCompositeKeyImpl();
		return claimCompositeKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimLine createClaimLine() {
		ClaimLineImpl claimLine = new ClaimLineImpl();
		return claimLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimLineCompositeKey createClaimLineCompositeKey() {
		ClaimLineCompositeKeyImpl claimLineCompositeKey = new ClaimLineCompositeKeyImpl();
		return claimLineCompositeKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimPackage getClaimPackage() {
		return (ClaimPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ClaimPackage getPackage() {
		return ClaimPackage.eINSTANCE;
	}

} //ClaimFactoryImpl
