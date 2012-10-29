/**
 * <copyright>
 * </copyright>
 *
 * $Id: KeyInfoTypeImpl.java,v 1.1 2009/06/28 02:03:49 mtaal Exp $
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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._2000._09.xmldsig.KeyInfoType;
import org.w3._2000._09.xmldsig.KeyValueType;
import org.w3._2000._09.xmldsig.PGPDataType;
import org.w3._2000._09.xmldsig.RetrievalMethodType;
import org.w3._2000._09.xmldsig.SPKIDataType;
import org.w3._2000._09.xmldsig.X509DataType;
import org.w3._2000._09.xmldsig.XmldsigPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Key Info Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.w3._2000._09.xmldsig.impl.KeyInfoTypeImpl#getMixed <em>Mixed</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.KeyInfoTypeImpl#getGroup <em>Group</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.KeyInfoTypeImpl#getKeyName <em>Key Name</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.KeyInfoTypeImpl#getKeyValue <em>Key Value</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.KeyInfoTypeImpl#getRetrievalMethod <em>Retrieval Method
 * </em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.KeyInfoTypeImpl#getX509Data <em>X509 Data</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.KeyInfoTypeImpl#getPGPData <em>PGP Data</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.KeyInfoTypeImpl#getSPKIData <em>SPKI Data</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.KeyInfoTypeImpl#getMgmtData <em>Mgmt Data</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.KeyInfoTypeImpl#getAny <em>Any</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.KeyInfoTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class KeyInfoTypeImpl extends EObjectImpl implements KeyInfoType {
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected KeyInfoTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmldsigPackage.Literals.KEY_INFO_TYPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, XmldsigPackage.KEY_INFO_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap) getMixed().<FeatureMap.Entry> list(
				XmldsigPackage.Literals.KEY_INFO_TYPE__GROUP);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<String> getKeyName() {
		return getGroup().list(XmldsigPackage.Literals.KEY_INFO_TYPE__KEY_NAME);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<KeyValueType> getKeyValue() {
		return getGroup().list(XmldsigPackage.Literals.KEY_INFO_TYPE__KEY_VALUE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<RetrievalMethodType> getRetrievalMethod() {
		return getGroup().list(XmldsigPackage.Literals.KEY_INFO_TYPE__RETRIEVAL_METHOD);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<X509DataType> getX509Data() {
		return getGroup().list(XmldsigPackage.Literals.KEY_INFO_TYPE__X509_DATA);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<PGPDataType> getPGPData() {
		return getGroup().list(XmldsigPackage.Literals.KEY_INFO_TYPE__PGP_DATA);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<SPKIDataType> getSPKIData() {
		return getGroup().list(XmldsigPackage.Literals.KEY_INFO_TYPE__SPKI_DATA);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<String> getMgmtData() {
		return getGroup().list(XmldsigPackage.Literals.KEY_INFO_TYPE__MGMT_DATA);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap) getGroup().<FeatureMap.Entry> list(
				XmldsigPackage.Literals.KEY_INFO_TYPE__ANY);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmldsigPackage.KEY_INFO_TYPE__ID,
					oldId, id));
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
		case XmldsigPackage.KEY_INFO_TYPE__MIXED:
			return ((InternalEList<?>) getMixed()).basicRemove(otherEnd, msgs);
		case XmldsigPackage.KEY_INFO_TYPE__GROUP:
			return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
		case XmldsigPackage.KEY_INFO_TYPE__KEY_VALUE:
			return ((InternalEList<?>) getKeyValue()).basicRemove(otherEnd, msgs);
		case XmldsigPackage.KEY_INFO_TYPE__RETRIEVAL_METHOD:
			return ((InternalEList<?>) getRetrievalMethod()).basicRemove(otherEnd, msgs);
		case XmldsigPackage.KEY_INFO_TYPE__X509_DATA:
			return ((InternalEList<?>) getX509Data()).basicRemove(otherEnd, msgs);
		case XmldsigPackage.KEY_INFO_TYPE__PGP_DATA:
			return ((InternalEList<?>) getPGPData()).basicRemove(otherEnd, msgs);
		case XmldsigPackage.KEY_INFO_TYPE__SPKI_DATA:
			return ((InternalEList<?>) getSPKIData()).basicRemove(otherEnd, msgs);
		case XmldsigPackage.KEY_INFO_TYPE__ANY:
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
		case XmldsigPackage.KEY_INFO_TYPE__MIXED:
			if (coreType)
				return getMixed();
			return ((FeatureMap.Internal) getMixed()).getWrapper();
		case XmldsigPackage.KEY_INFO_TYPE__GROUP:
			if (coreType)
				return getGroup();
			return ((FeatureMap.Internal) getGroup()).getWrapper();
		case XmldsigPackage.KEY_INFO_TYPE__KEY_NAME:
			return getKeyName();
		case XmldsigPackage.KEY_INFO_TYPE__KEY_VALUE:
			return getKeyValue();
		case XmldsigPackage.KEY_INFO_TYPE__RETRIEVAL_METHOD:
			return getRetrievalMethod();
		case XmldsigPackage.KEY_INFO_TYPE__X509_DATA:
			return getX509Data();
		case XmldsigPackage.KEY_INFO_TYPE__PGP_DATA:
			return getPGPData();
		case XmldsigPackage.KEY_INFO_TYPE__SPKI_DATA:
			return getSPKIData();
		case XmldsigPackage.KEY_INFO_TYPE__MGMT_DATA:
			return getMgmtData();
		case XmldsigPackage.KEY_INFO_TYPE__ANY:
			if (coreType)
				return getAny();
			return ((FeatureMap.Internal) getAny()).getWrapper();
		case XmldsigPackage.KEY_INFO_TYPE__ID:
			return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case XmldsigPackage.KEY_INFO_TYPE__MIXED:
			((FeatureMap.Internal) getMixed()).set(newValue);
			return;
		case XmldsigPackage.KEY_INFO_TYPE__GROUP:
			((FeatureMap.Internal) getGroup()).set(newValue);
			return;
		case XmldsigPackage.KEY_INFO_TYPE__KEY_NAME:
			getKeyName().clear();
			getKeyName().addAll((Collection<? extends String>) newValue);
			return;
		case XmldsigPackage.KEY_INFO_TYPE__KEY_VALUE:
			getKeyValue().clear();
			getKeyValue().addAll((Collection<? extends KeyValueType>) newValue);
			return;
		case XmldsigPackage.KEY_INFO_TYPE__RETRIEVAL_METHOD:
			getRetrievalMethod().clear();
			getRetrievalMethod().addAll((Collection<? extends RetrievalMethodType>) newValue);
			return;
		case XmldsigPackage.KEY_INFO_TYPE__X509_DATA:
			getX509Data().clear();
			getX509Data().addAll((Collection<? extends X509DataType>) newValue);
			return;
		case XmldsigPackage.KEY_INFO_TYPE__PGP_DATA:
			getPGPData().clear();
			getPGPData().addAll((Collection<? extends PGPDataType>) newValue);
			return;
		case XmldsigPackage.KEY_INFO_TYPE__SPKI_DATA:
			getSPKIData().clear();
			getSPKIData().addAll((Collection<? extends SPKIDataType>) newValue);
			return;
		case XmldsigPackage.KEY_INFO_TYPE__MGMT_DATA:
			getMgmtData().clear();
			getMgmtData().addAll((Collection<? extends String>) newValue);
			return;
		case XmldsigPackage.KEY_INFO_TYPE__ANY:
			((FeatureMap.Internal) getAny()).set(newValue);
			return;
		case XmldsigPackage.KEY_INFO_TYPE__ID:
			setId((String) newValue);
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
		case XmldsigPackage.KEY_INFO_TYPE__MIXED:
			getMixed().clear();
			return;
		case XmldsigPackage.KEY_INFO_TYPE__GROUP:
			getGroup().clear();
			return;
		case XmldsigPackage.KEY_INFO_TYPE__KEY_NAME:
			getKeyName().clear();
			return;
		case XmldsigPackage.KEY_INFO_TYPE__KEY_VALUE:
			getKeyValue().clear();
			return;
		case XmldsigPackage.KEY_INFO_TYPE__RETRIEVAL_METHOD:
			getRetrievalMethod().clear();
			return;
		case XmldsigPackage.KEY_INFO_TYPE__X509_DATA:
			getX509Data().clear();
			return;
		case XmldsigPackage.KEY_INFO_TYPE__PGP_DATA:
			getPGPData().clear();
			return;
		case XmldsigPackage.KEY_INFO_TYPE__SPKI_DATA:
			getSPKIData().clear();
			return;
		case XmldsigPackage.KEY_INFO_TYPE__MGMT_DATA:
			getMgmtData().clear();
			return;
		case XmldsigPackage.KEY_INFO_TYPE__ANY:
			getAny().clear();
			return;
		case XmldsigPackage.KEY_INFO_TYPE__ID:
			setId(ID_EDEFAULT);
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
		case XmldsigPackage.KEY_INFO_TYPE__MIXED:
			return mixed != null && !mixed.isEmpty();
		case XmldsigPackage.KEY_INFO_TYPE__GROUP:
			return !getGroup().isEmpty();
		case XmldsigPackage.KEY_INFO_TYPE__KEY_NAME:
			return !getKeyName().isEmpty();
		case XmldsigPackage.KEY_INFO_TYPE__KEY_VALUE:
			return !getKeyValue().isEmpty();
		case XmldsigPackage.KEY_INFO_TYPE__RETRIEVAL_METHOD:
			return !getRetrievalMethod().isEmpty();
		case XmldsigPackage.KEY_INFO_TYPE__X509_DATA:
			return !getX509Data().isEmpty();
		case XmldsigPackage.KEY_INFO_TYPE__PGP_DATA:
			return !getPGPData().isEmpty();
		case XmldsigPackage.KEY_INFO_TYPE__SPKI_DATA:
			return !getSPKIData().isEmpty();
		case XmldsigPackage.KEY_INFO_TYPE__MGMT_DATA:
			return !getMgmtData().isEmpty();
		case XmldsigPackage.KEY_INFO_TYPE__ANY:
			return !getAny().isEmpty();
		case XmldsigPackage.KEY_INFO_TYPE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // KeyInfoTypeImpl
