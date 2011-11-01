/**
 * <copyright>
 * </copyright>
 *
 * $Id: SignedInfoTypeImpl.java,v 1.1 2009/06/28 02:03:49 mtaal Exp $
 */
package org.w3._2000._09.xmldsig.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._2000._09.xmldsig.CanonicalizationMethodType;
import org.w3._2000._09.xmldsig.ReferenceType;
import org.w3._2000._09.xmldsig.SignatureMethodType;
import org.w3._2000._09.xmldsig.SignedInfoType;
import org.w3._2000._09.xmldsig.XmldsigPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signed Info Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.SignedInfoTypeImpl#getCanonicalizationMethod <em>Canonicalization Method</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.SignedInfoTypeImpl#getSignatureMethod <em>Signature Method</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.SignedInfoTypeImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.SignedInfoTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignedInfoTypeImpl extends EObjectImpl implements SignedInfoType {
	/**
	 * The cached value of the '{@link #getCanonicalizationMethod() <em>Canonicalization Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanonicalizationMethod()
	 * @generated
	 * @ordered
	 */
	protected CanonicalizationMethodType canonicalizationMethod;

	/**
	 * The cached value of the '{@link #getSignatureMethod() <em>Signature Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureMethod()
	 * @generated
	 * @ordered
	 */
	protected SignatureMethodType signatureMethod;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferenceType> reference;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignedInfoTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmldsigPackage.Literals.SIGNED_INFO_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanonicalizationMethodType getCanonicalizationMethod() {
		return canonicalizationMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCanonicalizationMethod(CanonicalizationMethodType newCanonicalizationMethod, NotificationChain msgs) {
		CanonicalizationMethodType oldCanonicalizationMethod = canonicalizationMethod;
		canonicalizationMethod = newCanonicalizationMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmldsigPackage.SIGNED_INFO_TYPE__CANONICALIZATION_METHOD, oldCanonicalizationMethod, newCanonicalizationMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanonicalizationMethod(CanonicalizationMethodType newCanonicalizationMethod) {
		if (newCanonicalizationMethod != canonicalizationMethod) {
			NotificationChain msgs = null;
			if (canonicalizationMethod != null)
				msgs = ((InternalEObject)canonicalizationMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmldsigPackage.SIGNED_INFO_TYPE__CANONICALIZATION_METHOD, null, msgs);
			if (newCanonicalizationMethod != null)
				msgs = ((InternalEObject)newCanonicalizationMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmldsigPackage.SIGNED_INFO_TYPE__CANONICALIZATION_METHOD, null, msgs);
			msgs = basicSetCanonicalizationMethod(newCanonicalizationMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmldsigPackage.SIGNED_INFO_TYPE__CANONICALIZATION_METHOD, newCanonicalizationMethod, newCanonicalizationMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureMethodType getSignatureMethod() {
		return signatureMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignatureMethod(SignatureMethodType newSignatureMethod, NotificationChain msgs) {
		SignatureMethodType oldSignatureMethod = signatureMethod;
		signatureMethod = newSignatureMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmldsigPackage.SIGNED_INFO_TYPE__SIGNATURE_METHOD, oldSignatureMethod, newSignatureMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignatureMethod(SignatureMethodType newSignatureMethod) {
		if (newSignatureMethod != signatureMethod) {
			NotificationChain msgs = null;
			if (signatureMethod != null)
				msgs = ((InternalEObject)signatureMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmldsigPackage.SIGNED_INFO_TYPE__SIGNATURE_METHOD, null, msgs);
			if (newSignatureMethod != null)
				msgs = ((InternalEObject)newSignatureMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmldsigPackage.SIGNED_INFO_TYPE__SIGNATURE_METHOD, null, msgs);
			msgs = basicSetSignatureMethod(newSignatureMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmldsigPackage.SIGNED_INFO_TYPE__SIGNATURE_METHOD, newSignatureMethod, newSignatureMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceType> getReference() {
		if (reference == null) {
			reference = new EObjectContainmentEList<ReferenceType>(ReferenceType.class, this, XmldsigPackage.SIGNED_INFO_TYPE__REFERENCE);
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmldsigPackage.SIGNED_INFO_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmldsigPackage.SIGNED_INFO_TYPE__CANONICALIZATION_METHOD:
				return basicSetCanonicalizationMethod(null, msgs);
			case XmldsigPackage.SIGNED_INFO_TYPE__SIGNATURE_METHOD:
				return basicSetSignatureMethod(null, msgs);
			case XmldsigPackage.SIGNED_INFO_TYPE__REFERENCE:
				return ((InternalEList<?>)getReference()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmldsigPackage.SIGNED_INFO_TYPE__CANONICALIZATION_METHOD:
				return getCanonicalizationMethod();
			case XmldsigPackage.SIGNED_INFO_TYPE__SIGNATURE_METHOD:
				return getSignatureMethod();
			case XmldsigPackage.SIGNED_INFO_TYPE__REFERENCE:
				return getReference();
			case XmldsigPackage.SIGNED_INFO_TYPE__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XmldsigPackage.SIGNED_INFO_TYPE__CANONICALIZATION_METHOD:
				setCanonicalizationMethod((CanonicalizationMethodType)newValue);
				return;
			case XmldsigPackage.SIGNED_INFO_TYPE__SIGNATURE_METHOD:
				setSignatureMethod((SignatureMethodType)newValue);
				return;
			case XmldsigPackage.SIGNED_INFO_TYPE__REFERENCE:
				getReference().clear();
				getReference().addAll((Collection<? extends ReferenceType>)newValue);
				return;
			case XmldsigPackage.SIGNED_INFO_TYPE__ID:
				setId((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XmldsigPackage.SIGNED_INFO_TYPE__CANONICALIZATION_METHOD:
				setCanonicalizationMethod((CanonicalizationMethodType)null);
				return;
			case XmldsigPackage.SIGNED_INFO_TYPE__SIGNATURE_METHOD:
				setSignatureMethod((SignatureMethodType)null);
				return;
			case XmldsigPackage.SIGNED_INFO_TYPE__REFERENCE:
				getReference().clear();
				return;
			case XmldsigPackage.SIGNED_INFO_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XmldsigPackage.SIGNED_INFO_TYPE__CANONICALIZATION_METHOD:
				return canonicalizationMethod != null;
			case XmldsigPackage.SIGNED_INFO_TYPE__SIGNATURE_METHOD:
				return signatureMethod != null;
			case XmldsigPackage.SIGNED_INFO_TYPE__REFERENCE:
				return reference != null && !reference.isEmpty();
			case XmldsigPackage.SIGNED_INFO_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //SignedInfoTypeImpl
