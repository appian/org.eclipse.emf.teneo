/**
 * <copyright>
 * </copyright>
 *
 * $Id: DigestMethodTypeImpl.java,v 1.1 2009/06/28 02:03:49 mtaal Exp $
 */
package org.w3._2000._09.xmldsig.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._2000._09.xmldsig.DigestMethodType;
import org.w3._2000._09.xmldsig.XmldsigPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Digest Method Type</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.w3._2000._09.xmldsig.impl.DigestMethodTypeImpl#getMixed <em>Mixed</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.DigestMethodTypeImpl#getAny <em>Any</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.DigestMethodTypeImpl#getAlgorithm <em>Algorithm</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class DigestMethodTypeImpl extends EObjectImpl implements DigestMethodType {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The default value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String algorithm = ALGORITHM_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DigestMethodTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmldsigPackage.Literals.DIGEST_METHOD_TYPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, XmldsigPackage.DIGEST_METHOD_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap) getMixed().<FeatureMap.Entry> list(
				XmldsigPackage.Literals.DIGEST_METHOD_TYPE__ANY);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getAlgorithm() {
		return algorithm;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAlgorithm(String newAlgorithm) {
		String oldAlgorithm = algorithm;
		algorithm = newAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					XmldsigPackage.DIGEST_METHOD_TYPE__ALGORITHM, oldAlgorithm, algorithm));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
		case XmldsigPackage.DIGEST_METHOD_TYPE__MIXED:
			return ((InternalEList<?>) getMixed()).basicRemove(otherEnd, msgs);
		case XmldsigPackage.DIGEST_METHOD_TYPE__ANY:
			return ((InternalEList<?>) getAny()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case XmldsigPackage.DIGEST_METHOD_TYPE__MIXED:
			if (coreType)
				return getMixed();
			return ((FeatureMap.Internal) getMixed()).getWrapper();
		case XmldsigPackage.DIGEST_METHOD_TYPE__ANY:
			if (coreType)
				return getAny();
			return ((FeatureMap.Internal) getAny()).getWrapper();
		case XmldsigPackage.DIGEST_METHOD_TYPE__ALGORITHM:
			return getAlgorithm();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case XmldsigPackage.DIGEST_METHOD_TYPE__MIXED:
			((FeatureMap.Internal) getMixed()).set(newValue);
			return;
		case XmldsigPackage.DIGEST_METHOD_TYPE__ANY:
			((FeatureMap.Internal) getAny()).set(newValue);
			return;
		case XmldsigPackage.DIGEST_METHOD_TYPE__ALGORITHM:
			setAlgorithm((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case XmldsigPackage.DIGEST_METHOD_TYPE__MIXED:
			getMixed().clear();
			return;
		case XmldsigPackage.DIGEST_METHOD_TYPE__ANY:
			getAny().clear();
			return;
		case XmldsigPackage.DIGEST_METHOD_TYPE__ALGORITHM:
			setAlgorithm(ALGORITHM_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case XmldsigPackage.DIGEST_METHOD_TYPE__MIXED:
			return mixed != null && !mixed.isEmpty();
		case XmldsigPackage.DIGEST_METHOD_TYPE__ANY:
			return !getAny().isEmpty();
		case XmldsigPackage.DIGEST_METHOD_TYPE__ALGORITHM:
			return ALGORITHM_EDEFAULT == null ? algorithm != null : !ALGORITHM_EDEFAULT.equals(algorithm);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", algorithm: ");
		result.append(algorithm);
		result.append(')');
		return result.toString();
	}

} // DigestMethodTypeImpl
