/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.samples.issues.bz363777.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.issues.bz363777.Bz363777Package;
import org.eclipse.emf.teneo.samples.issues.bz363777.ChannelMap;
import org.eclipse.emf.teneo.samples.issues.bz363777.ChannelMapService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chanel Map To Chanel Map Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz363777.impl.ChanelMapToChanelMapServiceImpl#getTypedValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz363777.impl.ChanelMapToChanelMapServiceImpl#getTypedKey <em>Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChanelMapToChanelMapServiceImpl extends EObjectImpl implements BasicEMap.Entry<ChannelMap,ChannelMapService> {
	/**
	 * The cached value of the '{@link #getTypedValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedValue()
	 * @generated
	 * @ordered
	 */
	protected ChannelMapService value;

	/**
	 * The cached value of the '{@link #getTypedKey() <em>Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedKey()
	 * @generated
	 * @ordered
	 */
	protected ChannelMap key;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChanelMapToChanelMapServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bz363777Package.Literals.CHANEL_MAP_TO_CHANEL_MAP_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelMapService getTypedValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject)value;
			value = (ChannelMapService)eResolveProxy(oldValue);
			if (value != oldValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Bz363777Package.CHANEL_MAP_TO_CHANEL_MAP_SERVICE__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelMapService basicGetTypedValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypedValue(ChannelMapService newValue) {
		ChannelMapService oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz363777Package.CHANEL_MAP_TO_CHANEL_MAP_SERVICE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelMap getTypedKey() {
		if (key != null && key.eIsProxy()) {
			InternalEObject oldKey = (InternalEObject)key;
			key = (ChannelMap)eResolveProxy(oldKey);
			if (key != oldKey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Bz363777Package.CHANEL_MAP_TO_CHANEL_MAP_SERVICE__KEY, oldKey, key));
			}
		}
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelMap basicGetTypedKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypedKey(ChannelMap newKey) {
		ChannelMap oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz363777Package.CHANEL_MAP_TO_CHANEL_MAP_SERVICE__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bz363777Package.CHANEL_MAP_TO_CHANEL_MAP_SERVICE__VALUE:
				if (resolve) return getTypedValue();
				return basicGetTypedValue();
			case Bz363777Package.CHANEL_MAP_TO_CHANEL_MAP_SERVICE__KEY:
				if (resolve) return getTypedKey();
				return basicGetTypedKey();
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
			case Bz363777Package.CHANEL_MAP_TO_CHANEL_MAP_SERVICE__VALUE:
				setTypedValue((ChannelMapService)newValue);
				return;
			case Bz363777Package.CHANEL_MAP_TO_CHANEL_MAP_SERVICE__KEY:
				setTypedKey((ChannelMap)newValue);
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
			case Bz363777Package.CHANEL_MAP_TO_CHANEL_MAP_SERVICE__VALUE:
				setTypedValue((ChannelMapService)null);
				return;
			case Bz363777Package.CHANEL_MAP_TO_CHANEL_MAP_SERVICE__KEY:
				setTypedKey((ChannelMap)null);
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
			case Bz363777Package.CHANEL_MAP_TO_CHANEL_MAP_SERVICE__VALUE:
				return value != null;
			case Bz363777Package.CHANEL_MAP_TO_CHANEL_MAP_SERVICE__KEY:
				return key != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected int hash = -1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHash() {
		if (hash == -1) {
			Object theKey = getKey();
			hash = (theKey == null ? 0 : theKey.hashCode());
		}
		return hash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHash(int hash) {
		this.hash = hash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelMap getKey() {
		return getTypedKey();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(ChannelMap key) {
		setTypedKey(key);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelMapService getValue() {
		return getTypedValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelMapService setValue(ChannelMapService value) {
		ChannelMapService oldValue = getValue();
		setTypedValue(value);
		return oldValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<ChannelMap, ChannelMapService> getEMap() {
		EObject container = eContainer();
		return container == null ? null : (EMap<ChannelMap, ChannelMapService>)container.eGet(eContainmentFeature());
	}

} //ChanelMapToChanelMapServiceImpl
