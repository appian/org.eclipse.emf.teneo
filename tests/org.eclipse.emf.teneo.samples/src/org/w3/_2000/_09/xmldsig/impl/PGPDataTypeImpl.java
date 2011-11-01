/**
 * <copyright>
 * </copyright>
 *
 * $Id: PGPDataTypeImpl.java,v 1.1 2009/06/28 02:03:49 mtaal Exp $
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

import org.w3._2000._09.xmldsig.PGPDataType;
import org.w3._2000._09.xmldsig.XmldsigPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PGP Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.PGPDataTypeImpl#getPGPKeyID <em>PGP Key ID</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.PGPDataTypeImpl#getPGPKeyPacket <em>PGP Key Packet</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.PGPDataTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.PGPDataTypeImpl#getPGPKeyPacket1 <em>PGP Key Packet1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.PGPDataTypeImpl#getAny1 <em>Any1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PGPDataTypeImpl extends EObjectImpl implements PGPDataType {
	/**
	 * The default value of the '{@link #getPGPKeyID() <em>PGP Key ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPGPKeyID()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] PGP_KEY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPGPKeyID() <em>PGP Key ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPGPKeyID()
	 * @generated
	 * @ordered
	 */
	protected byte[] pGPKeyID = PGP_KEY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPGPKeyPacket() <em>PGP Key Packet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPGPKeyPacket()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] PGP_KEY_PACKET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPGPKeyPacket() <em>PGP Key Packet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPGPKeyPacket()
	 * @generated
	 * @ordered
	 */
	protected byte[] pGPKeyPacket = PGP_KEY_PACKET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * The default value of the '{@link #getPGPKeyPacket1() <em>PGP Key Packet1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPGPKeyPacket1()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] PGP_KEY_PACKET1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPGPKeyPacket1() <em>PGP Key Packet1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPGPKeyPacket1()
	 * @generated
	 * @ordered
	 */
	protected byte[] pGPKeyPacket1 = PGP_KEY_PACKET1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAny1() <em>Any1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PGPDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmldsigPackage.Literals.PGP_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getPGPKeyID() {
		return pGPKeyID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPGPKeyID(byte[] newPGPKeyID) {
		byte[] oldPGPKeyID = pGPKeyID;
		pGPKeyID = newPGPKeyID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmldsigPackage.PGP_DATA_TYPE__PGP_KEY_ID, oldPGPKeyID, pGPKeyID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getPGPKeyPacket() {
		return pGPKeyPacket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPGPKeyPacket(byte[] newPGPKeyPacket) {
		byte[] oldPGPKeyPacket = pGPKeyPacket;
		pGPKeyPacket = newPGPKeyPacket;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmldsigPackage.PGP_DATA_TYPE__PGP_KEY_PACKET, oldPGPKeyPacket, pGPKeyPacket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, XmldsigPackage.PGP_DATA_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getPGPKeyPacket1() {
		return pGPKeyPacket1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPGPKeyPacket1(byte[] newPGPKeyPacket1) {
		byte[] oldPGPKeyPacket1 = pGPKeyPacket1;
		pGPKeyPacket1 = newPGPKeyPacket1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmldsigPackage.PGP_DATA_TYPE__PGP_KEY_PACKET1, oldPGPKeyPacket1, pGPKeyPacket1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny1() {
		if (any1 == null) {
			any1 = new BasicFeatureMap(this, XmldsigPackage.PGP_DATA_TYPE__ANY1);
		}
		return any1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmldsigPackage.PGP_DATA_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case XmldsigPackage.PGP_DATA_TYPE__ANY1:
				return ((InternalEList<?>)getAny1()).basicRemove(otherEnd, msgs);
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
			case XmldsigPackage.PGP_DATA_TYPE__PGP_KEY_ID:
				return getPGPKeyID();
			case XmldsigPackage.PGP_DATA_TYPE__PGP_KEY_PACKET:
				return getPGPKeyPacket();
			case XmldsigPackage.PGP_DATA_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case XmldsigPackage.PGP_DATA_TYPE__PGP_KEY_PACKET1:
				return getPGPKeyPacket1();
			case XmldsigPackage.PGP_DATA_TYPE__ANY1:
				if (coreType) return getAny1();
				return ((FeatureMap.Internal)getAny1()).getWrapper();
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
			case XmldsigPackage.PGP_DATA_TYPE__PGP_KEY_ID:
				setPGPKeyID((byte[])newValue);
				return;
			case XmldsigPackage.PGP_DATA_TYPE__PGP_KEY_PACKET:
				setPGPKeyPacket((byte[])newValue);
				return;
			case XmldsigPackage.PGP_DATA_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case XmldsigPackage.PGP_DATA_TYPE__PGP_KEY_PACKET1:
				setPGPKeyPacket1((byte[])newValue);
				return;
			case XmldsigPackage.PGP_DATA_TYPE__ANY1:
				((FeatureMap.Internal)getAny1()).set(newValue);
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
			case XmldsigPackage.PGP_DATA_TYPE__PGP_KEY_ID:
				setPGPKeyID(PGP_KEY_ID_EDEFAULT);
				return;
			case XmldsigPackage.PGP_DATA_TYPE__PGP_KEY_PACKET:
				setPGPKeyPacket(PGP_KEY_PACKET_EDEFAULT);
				return;
			case XmldsigPackage.PGP_DATA_TYPE__ANY:
				getAny().clear();
				return;
			case XmldsigPackage.PGP_DATA_TYPE__PGP_KEY_PACKET1:
				setPGPKeyPacket1(PGP_KEY_PACKET1_EDEFAULT);
				return;
			case XmldsigPackage.PGP_DATA_TYPE__ANY1:
				getAny1().clear();
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
			case XmldsigPackage.PGP_DATA_TYPE__PGP_KEY_ID:
				return PGP_KEY_ID_EDEFAULT == null ? pGPKeyID != null : !PGP_KEY_ID_EDEFAULT.equals(pGPKeyID);
			case XmldsigPackage.PGP_DATA_TYPE__PGP_KEY_PACKET:
				return PGP_KEY_PACKET_EDEFAULT == null ? pGPKeyPacket != null : !PGP_KEY_PACKET_EDEFAULT.equals(pGPKeyPacket);
			case XmldsigPackage.PGP_DATA_TYPE__ANY:
				return any != null && !any.isEmpty();
			case XmldsigPackage.PGP_DATA_TYPE__PGP_KEY_PACKET1:
				return PGP_KEY_PACKET1_EDEFAULT == null ? pGPKeyPacket1 != null : !PGP_KEY_PACKET1_EDEFAULT.equals(pGPKeyPacket1);
			case XmldsigPackage.PGP_DATA_TYPE__ANY1:
				return any1 != null && !any1.isEmpty();
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
		result.append(" (pGPKeyID: ");
		result.append(pGPKeyID);
		result.append(", pGPKeyPacket: ");
		result.append(pGPKeyPacket);
		result.append(", any: ");
		result.append(any);
		result.append(", pGPKeyPacket1: ");
		result.append(pGPKeyPacket1);
		result.append(", any1: ");
		result.append(any1);
		result.append(')');
		return result.toString();
	}

} //PGPDataTypeImpl
