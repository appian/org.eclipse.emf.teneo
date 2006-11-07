/**
 * <copyright>
 * </copyright>
 *
 * $Id: YahooIndicesComponentsSourceImpl.java,v 1.1 2006/11/07 10:22:27 mtaal Exp $
 */
package com.pareis.trading.yahoo.impl;

import com.pareis.trading.yahoo.Yahoo;
import com.pareis.trading.yahoo.YahooIndicesComponentsSource;
import com.pareis.trading.yahoo.YahooPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Indices Components Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.pareis.trading.yahoo.impl.YahooIndicesComponentsSourceImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.pareis.trading.yahoo.impl.YahooIndicesComponentsSourceImpl#getVendor <em>Vendor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YahooIndicesComponentsSourceImpl extends EObjectImpl implements YahooIndicesComponentsSource {
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
	protected YahooIndicesComponentsSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return YahooPackage.Literals.YAHOO_INDICES_COMPONENTS_SOURCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, YahooPackage.YAHOO_INDICES_COMPONENTS_SOURCE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Yahoo getVendor() {
		if (eContainerFeatureID != YahooPackage.YAHOO_INDICES_COMPONENTS_SOURCE__VENDOR) return null;
		return (Yahoo)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVendor(Yahoo newVendor, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newVendor, YahooPackage.YAHOO_INDICES_COMPONENTS_SOURCE__VENDOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVendor(Yahoo newVendor) {
		if (newVendor != eInternalContainer() || (eContainerFeatureID != YahooPackage.YAHOO_INDICES_COMPONENTS_SOURCE__VENDOR && newVendor != null)) {
			if (EcoreUtil.isAncestor(this, newVendor))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newVendor != null)
				msgs = ((InternalEObject)newVendor).eInverseAdd(this, YahooPackage.YAHOO__INDICES_COMPONENTS_SOURCE, Yahoo.class, msgs);
			msgs = basicSetVendor(newVendor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YahooPackage.YAHOO_INDICES_COMPONENTS_SOURCE__VENDOR, newVendor, newVendor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addToAllStockIndices() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case YahooPackage.YAHOO_INDICES_COMPONENTS_SOURCE__VENDOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetVendor((Yahoo)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case YahooPackage.YAHOO_INDICES_COMPONENTS_SOURCE__VENDOR:
				return basicSetVendor(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case YahooPackage.YAHOO_INDICES_COMPONENTS_SOURCE__VENDOR:
				return eInternalContainer().eInverseRemove(this, YahooPackage.YAHOO__INDICES_COMPONENTS_SOURCE, Yahoo.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case YahooPackage.YAHOO_INDICES_COMPONENTS_SOURCE__ID:
				return getId();
			case YahooPackage.YAHOO_INDICES_COMPONENTS_SOURCE__VENDOR:
				return getVendor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case YahooPackage.YAHOO_INDICES_COMPONENTS_SOURCE__ID:
				setId((String)newValue);
				return;
			case YahooPackage.YAHOO_INDICES_COMPONENTS_SOURCE__VENDOR:
				setVendor((Yahoo)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case YahooPackage.YAHOO_INDICES_COMPONENTS_SOURCE__ID:
				setId(ID_EDEFAULT);
				return;
			case YahooPackage.YAHOO_INDICES_COMPONENTS_SOURCE__VENDOR:
				setVendor((Yahoo)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case YahooPackage.YAHOO_INDICES_COMPONENTS_SOURCE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case YahooPackage.YAHOO_INDICES_COMPONENTS_SOURCE__VENDOR:
				return getVendor() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //YahooIndicesComponentsSourceImpl