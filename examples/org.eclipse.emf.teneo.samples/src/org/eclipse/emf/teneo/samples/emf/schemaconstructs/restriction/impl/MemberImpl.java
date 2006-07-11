/**
 * <copyright>
 * </copyright>
 *
 * $Id: MemberImpl.java,v 1.1 2006/07/11 16:57:15 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.impl;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.Member;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.RestrictionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MemberImpl extends XMLDeviantImpl implements Member {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RestrictionPackage.eINSTANCE.getMember();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case RestrictionPackage.MEMBER__NUM_POSTS:
				return getNumPosts();
			case RestrictionPackage.MEMBER__SIGNATURE:
				return getSignature();
			case RestrictionPackage.MEMBER__EMAIL:
				return getEmail();
			case RestrictionPackage.MEMBER__FIRST_SUBSCRIBED:
				return getFirstSubscribed();
			case RestrictionPackage.MEMBER__MAIL_READER:
				return getMailReader();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case RestrictionPackage.MEMBER__NUM_POSTS:
				setNumPosts((BigInteger)newValue);
				return;
			case RestrictionPackage.MEMBER__SIGNATURE:
				setSignature((String)newValue);
				return;
			case RestrictionPackage.MEMBER__EMAIL:
				setEmail((String)newValue);
				return;
			case RestrictionPackage.MEMBER__FIRST_SUBSCRIBED:
				setFirstSubscribed((Object)newValue);
				return;
			case RestrictionPackage.MEMBER__MAIL_READER:
				setMailReader((String)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case RestrictionPackage.MEMBER__NUM_POSTS:
				setNumPosts(NUM_POSTS_EDEFAULT);
				return;
			case RestrictionPackage.MEMBER__SIGNATURE:
				unsetSignature();
				return;
			case RestrictionPackage.MEMBER__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case RestrictionPackage.MEMBER__FIRST_SUBSCRIBED:
				setFirstSubscribed(FIRST_SUBSCRIBED_EDEFAULT);
				return;
			case RestrictionPackage.MEMBER__MAIL_READER:
				setMailReader(MAIL_READER_EDEFAULT);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case RestrictionPackage.MEMBER__NUM_POSTS:
				return NUM_POSTS_EDEFAULT == null ? numPosts != null : !NUM_POSTS_EDEFAULT.equals(numPosts);
			case RestrictionPackage.MEMBER__SIGNATURE:
				return isSetSignature();
			case RestrictionPackage.MEMBER__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case RestrictionPackage.MEMBER__FIRST_SUBSCRIBED:
				return FIRST_SUBSCRIBED_EDEFAULT == null ? firstSubscribed != null : !FIRST_SUBSCRIBED_EDEFAULT.equals(firstSubscribed);
			case RestrictionPackage.MEMBER__MAIL_READER:
				return MAIL_READER_EDEFAULT == null ? mailReader != null : !MAIL_READER_EDEFAULT.equals(mailReader);
		}
		return eDynamicIsSet(eFeature);
	}

} //MemberImpl
