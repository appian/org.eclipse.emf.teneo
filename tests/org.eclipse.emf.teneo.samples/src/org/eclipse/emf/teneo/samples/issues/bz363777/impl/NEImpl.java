/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.samples.issues.bz363777.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.issues.bz363777.Bz363777Package;
import org.eclipse.emf.teneo.samples.issues.bz363777.ChannelMap;
import org.eclipse.emf.teneo.samples.issues.bz363777.ChannelMapService;
import org.eclipse.emf.teneo.samples.issues.bz363777.NE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz363777.impl.NEImpl#getMapChannels <em>Map Channels</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NEImpl extends EObjectImpl implements NE {
	/**
	 * The cached value of the '{@link #getMapChannels() <em>Map Channels</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapChannels()
	 * @generated
	 * @ordered
	 */
	protected EMap<ChannelMap, ChannelMapService> mapChannels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bz363777Package.Literals.NE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<ChannelMap, ChannelMapService> getMapChannels() {
		if (mapChannels == null) {
			mapChannels = new EcoreEMap<ChannelMap,ChannelMapService>(Bz363777Package.Literals.CHANEL_MAP_TO_CHANEL_MAP_SERVICE, ChanelMapToChanelMapServiceImpl.class, this, Bz363777Package.NE__MAP_CHANNELS);
		}
		return mapChannels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bz363777Package.NE__MAP_CHANNELS:
				return ((InternalEList<?>)getMapChannels()).basicRemove(otherEnd, msgs);
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
			case Bz363777Package.NE__MAP_CHANNELS:
				if (coreType) return getMapChannels();
				else return getMapChannels().map();
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
			case Bz363777Package.NE__MAP_CHANNELS:
				((EStructuralFeature.Setting)getMapChannels()).set(newValue);
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
			case Bz363777Package.NE__MAP_CHANNELS:
				getMapChannels().clear();
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
			case Bz363777Package.NE__MAP_CHANNELS:
				return mapChannels != null && !mapChannels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NEImpl
