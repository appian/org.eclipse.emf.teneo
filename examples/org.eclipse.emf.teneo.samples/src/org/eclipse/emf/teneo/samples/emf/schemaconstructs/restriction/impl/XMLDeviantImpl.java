/**
 * <copyright>
 * </copyright>
 *
 * $Id: XMLDeviantImpl.java,v 1.1 2006/07/11 16:57:15 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.RestrictionPackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.XMLDeviant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Deviant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.impl.XMLDeviantImpl#getNumPosts <em>Num Posts</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.impl.XMLDeviantImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.impl.XMLDeviantImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.impl.XMLDeviantImpl#getFirstSubscribed <em>First Subscribed</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.impl.XMLDeviantImpl#getMailReader <em>Mail Reader</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XMLDeviantImpl extends EObjectImpl implements XMLDeviant {
	/**
	 * The default value of the '{@link #getNumPosts() <em>Num Posts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPosts()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUM_POSTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumPosts() <em>Num Posts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPosts()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numPosts = NUM_POSTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected String signature = SIGNATURE_EDEFAULT;

	/**
	 * This is true if the Signature attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean signatureESet = false;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstSubscribed() <em>First Subscribed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstSubscribed()
	 * @generated
	 * @ordered
	 */
	protected static final Object FIRST_SUBSCRIBED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstSubscribed() <em>First Subscribed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstSubscribed()
	 * @generated
	 * @ordered
	 */
	protected Object firstSubscribed = FIRST_SUBSCRIBED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMailReader() <em>Mail Reader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMailReader()
	 * @generated
	 * @ordered
	 */
	protected static final String MAIL_READER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMailReader() <em>Mail Reader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMailReader()
	 * @generated
	 * @ordered
	 */
	protected String mailReader = MAIL_READER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLDeviantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RestrictionPackage.eINSTANCE.getXMLDeviant();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumPosts() {
		return numPosts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumPosts(BigInteger newNumPosts) {
		BigInteger oldNumPosts = numPosts;
		numPosts = newNumPosts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestrictionPackage.XML_DEVIANT__NUM_POSTS, oldNumPosts, numPosts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSignature() {
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature(String newSignature) {
		String oldSignature = signature;
		signature = newSignature;
		boolean oldSignatureESet = signatureESet;
		signatureESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestrictionPackage.XML_DEVIANT__SIGNATURE, oldSignature, signature, !oldSignatureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSignature() {
		String oldSignature = signature;
		boolean oldSignatureESet = signatureESet;
		signature = SIGNATURE_EDEFAULT;
		signatureESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RestrictionPackage.XML_DEVIANT__SIGNATURE, oldSignature, SIGNATURE_EDEFAULT, oldSignatureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSignature() {
		return signatureESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestrictionPackage.XML_DEVIANT__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getFirstSubscribed() {
		return firstSubscribed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstSubscribed(Object newFirstSubscribed) {
		Object oldFirstSubscribed = firstSubscribed;
		firstSubscribed = newFirstSubscribed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestrictionPackage.XML_DEVIANT__FIRST_SUBSCRIBED, oldFirstSubscribed, firstSubscribed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMailReader() {
		return mailReader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMailReader(String newMailReader) {
		String oldMailReader = mailReader;
		mailReader = newMailReader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestrictionPackage.XML_DEVIANT__MAIL_READER, oldMailReader, mailReader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case RestrictionPackage.XML_DEVIANT__NUM_POSTS:
				return getNumPosts();
			case RestrictionPackage.XML_DEVIANT__SIGNATURE:
				return getSignature();
			case RestrictionPackage.XML_DEVIANT__EMAIL:
				return getEmail();
			case RestrictionPackage.XML_DEVIANT__FIRST_SUBSCRIBED:
				return getFirstSubscribed();
			case RestrictionPackage.XML_DEVIANT__MAIL_READER:
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
			case RestrictionPackage.XML_DEVIANT__NUM_POSTS:
				setNumPosts((BigInteger)newValue);
				return;
			case RestrictionPackage.XML_DEVIANT__SIGNATURE:
				setSignature((String)newValue);
				return;
			case RestrictionPackage.XML_DEVIANT__EMAIL:
				setEmail((String)newValue);
				return;
			case RestrictionPackage.XML_DEVIANT__FIRST_SUBSCRIBED:
				setFirstSubscribed((Object)newValue);
				return;
			case RestrictionPackage.XML_DEVIANT__MAIL_READER:
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
			case RestrictionPackage.XML_DEVIANT__NUM_POSTS:
				setNumPosts(NUM_POSTS_EDEFAULT);
				return;
			case RestrictionPackage.XML_DEVIANT__SIGNATURE:
				unsetSignature();
				return;
			case RestrictionPackage.XML_DEVIANT__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case RestrictionPackage.XML_DEVIANT__FIRST_SUBSCRIBED:
				setFirstSubscribed(FIRST_SUBSCRIBED_EDEFAULT);
				return;
			case RestrictionPackage.XML_DEVIANT__MAIL_READER:
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
			case RestrictionPackage.XML_DEVIANT__NUM_POSTS:
				return NUM_POSTS_EDEFAULT == null ? numPosts != null : !NUM_POSTS_EDEFAULT.equals(numPosts);
			case RestrictionPackage.XML_DEVIANT__SIGNATURE:
				return isSetSignature();
			case RestrictionPackage.XML_DEVIANT__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case RestrictionPackage.XML_DEVIANT__FIRST_SUBSCRIBED:
				return FIRST_SUBSCRIBED_EDEFAULT == null ? firstSubscribed != null : !FIRST_SUBSCRIBED_EDEFAULT.equals(firstSubscribed);
			case RestrictionPackage.XML_DEVIANT__MAIL_READER:
				return MAIL_READER_EDEFAULT == null ? mailReader != null : !MAIL_READER_EDEFAULT.equals(mailReader);
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (numPosts: ");
		result.append(numPosts);
		result.append(", signature: ");
		if (signatureESet) result.append(signature); else result.append("<unset>");
		result.append(", email: ");
		result.append(email);
		result.append(", firstSubscribed: ");
		result.append(firstSubscribed);
		result.append(", mailReader: ");
		result.append(mailReader);
		result.append(')');
		return result.toString();
	}

} //XMLDeviantImpl
