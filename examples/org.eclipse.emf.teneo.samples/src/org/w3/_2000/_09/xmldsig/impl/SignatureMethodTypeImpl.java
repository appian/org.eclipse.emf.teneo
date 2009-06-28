/**
 * <copyright>
 * </copyright>
 *
 * $Id: SignatureMethodTypeImpl.java,v 1.1 2009/06/28 02:03:49 mtaal Exp $
 */
package org.w3._2000._09.xmldsig.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._2000._09.xmldsig.SignatureMethodType;
import org.w3._2000._09.xmldsig.XmldsigPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signature Method Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.SignatureMethodTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.SignatureMethodTypeImpl#getHMACOutputLength <em>HMAC Output Length</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.SignatureMethodTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.SignatureMethodTypeImpl#getAlgorithm <em>Algorithm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignatureMethodTypeImpl extends EObjectImpl implements SignatureMethodType {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The default value of the '{@link #getHMACOutputLength() <em>HMAC Output Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHMACOutputLength()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger HMAC_OUTPUT_LENGTH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String algorithm = ALGORITHM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignatureMethodTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmldsigPackage.Literals.SIGNATURE_METHOD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, XmldsigPackage.SIGNATURE_METHOD_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getHMACOutputLength() {
		return (BigInteger)getMixed().get(XmldsigPackage.Literals.SIGNATURE_METHOD_TYPE__HMAC_OUTPUT_LENGTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHMACOutputLength(BigInteger newHMACOutputLength) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.SIGNATURE_METHOD_TYPE__HMAC_OUTPUT_LENGTH, newHMACOutputLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(XmldsigPackage.Literals.SIGNATURE_METHOD_TYPE__ANY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlgorithm() {
		return algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithm(String newAlgorithm) {
		String oldAlgorithm = algorithm;
		algorithm = newAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmldsigPackage.SIGNATURE_METHOD_TYPE__ALGORITHM, oldAlgorithm, algorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmldsigPackage.SIGNATURE_METHOD_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case XmldsigPackage.SIGNATURE_METHOD_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case XmldsigPackage.SIGNATURE_METHOD_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case XmldsigPackage.SIGNATURE_METHOD_TYPE__HMAC_OUTPUT_LENGTH:
				return getHMACOutputLength();
			case XmldsigPackage.SIGNATURE_METHOD_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case XmldsigPackage.SIGNATURE_METHOD_TYPE__ALGORITHM:
				return getAlgorithm();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XmldsigPackage.SIGNATURE_METHOD_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case XmldsigPackage.SIGNATURE_METHOD_TYPE__HMAC_OUTPUT_LENGTH:
				setHMACOutputLength((BigInteger)newValue);
				return;
			case XmldsigPackage.SIGNATURE_METHOD_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case XmldsigPackage.SIGNATURE_METHOD_TYPE__ALGORITHM:
				setAlgorithm((String)newValue);
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
			case XmldsigPackage.SIGNATURE_METHOD_TYPE__MIXED:
				getMixed().clear();
				return;
			case XmldsigPackage.SIGNATURE_METHOD_TYPE__HMAC_OUTPUT_LENGTH:
				setHMACOutputLength(HMAC_OUTPUT_LENGTH_EDEFAULT);
				return;
			case XmldsigPackage.SIGNATURE_METHOD_TYPE__ANY:
				getAny().clear();
				return;
			case XmldsigPackage.SIGNATURE_METHOD_TYPE__ALGORITHM:
				setAlgorithm(ALGORITHM_EDEFAULT);
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
			case XmldsigPackage.SIGNATURE_METHOD_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case XmldsigPackage.SIGNATURE_METHOD_TYPE__HMAC_OUTPUT_LENGTH:
				return HMAC_OUTPUT_LENGTH_EDEFAULT == null ? getHMACOutputLength() != null : !HMAC_OUTPUT_LENGTH_EDEFAULT.equals(getHMACOutputLength());
			case XmldsigPackage.SIGNATURE_METHOD_TYPE__ANY:
				return !getAny().isEmpty();
			case XmldsigPackage.SIGNATURE_METHOD_TYPE__ALGORITHM:
				return ALGORITHM_EDEFAULT == null ? algorithm != null : !ALGORITHM_EDEFAULT.equals(algorithm);
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", algorithm: ");
		result.append(algorithm);
		result.append(')');
		return result.toString();
	}

} //SignatureMethodTypeImpl
