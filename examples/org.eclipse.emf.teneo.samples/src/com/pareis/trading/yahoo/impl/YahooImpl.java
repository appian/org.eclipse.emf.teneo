/**
 * <copyright>
 * </copyright>
 *
 * $Id: YahooImpl.java,v 1.1 2006/11/07 10:22:27 mtaal Exp $
 */
package com.pareis.trading.yahoo.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.pareis.trading.Client;
import com.pareis.trading.TradingPackage;
import com.pareis.trading.yahoo.Yahoo;
import com.pareis.trading.yahoo.YahooIndicesComponentsSource;
import com.pareis.trading.yahoo.YahooIndicesSeed;
import com.pareis.trading.yahoo.YahooPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Yahoo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.pareis.trading.yahoo.impl.YahooImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.pareis.trading.yahoo.impl.YahooImpl#getIndicesComponentsSource <em>Indices Components Source</em>}</li>
 *   <li>{@link com.pareis.trading.yahoo.impl.YahooImpl#getIndicesSeed <em>Indices Seed</em>}</li>
 *   <li>{@link com.pareis.trading.yahoo.impl.YahooImpl#getClient <em>Client</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YahooImpl extends EObjectImpl implements Yahoo {
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
	 * The cached value of the '{@link #getIndicesComponentsSource() <em>Indices Components Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicesComponentsSource()
	 * @generated
	 * @ordered
	 */
	protected YahooIndicesComponentsSource indicesComponentsSource = null;

	/**
	 * The cached value of the '{@link #getIndicesSeed() <em>Indices Seed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicesSeed()
	 * @generated
	 * @ordered
	 */
	protected YahooIndicesSeed indicesSeed = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YahooImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return YahooPackage.Literals.YAHOO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, YahooPackage.YAHOO__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YahooIndicesComponentsSource getIndicesComponentsSource() {
		return indicesComponentsSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndicesComponentsSource(YahooIndicesComponentsSource newIndicesComponentsSource, NotificationChain msgs) {
		YahooIndicesComponentsSource oldIndicesComponentsSource = indicesComponentsSource;
		indicesComponentsSource = newIndicesComponentsSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YahooPackage.YAHOO__INDICES_COMPONENTS_SOURCE, oldIndicesComponentsSource, newIndicesComponentsSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndicesComponentsSource(YahooIndicesComponentsSource newIndicesComponentsSource) {
		if (newIndicesComponentsSource != indicesComponentsSource) {
			NotificationChain msgs = null;
			if (indicesComponentsSource != null)
				msgs = ((InternalEObject)indicesComponentsSource).eInverseRemove(this, YahooPackage.YAHOO_INDICES_COMPONENTS_SOURCE__VENDOR, YahooIndicesComponentsSource.class, msgs);
			if (newIndicesComponentsSource != null)
				msgs = ((InternalEObject)newIndicesComponentsSource).eInverseAdd(this, YahooPackage.YAHOO_INDICES_COMPONENTS_SOURCE__VENDOR, YahooIndicesComponentsSource.class, msgs);
			msgs = basicSetIndicesComponentsSource(newIndicesComponentsSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YahooPackage.YAHOO__INDICES_COMPONENTS_SOURCE, newIndicesComponentsSource, newIndicesComponentsSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YahooIndicesSeed getIndicesSeed() {
		return indicesSeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndicesSeed(YahooIndicesSeed newIndicesSeed, NotificationChain msgs) {
		YahooIndicesSeed oldIndicesSeed = indicesSeed;
		indicesSeed = newIndicesSeed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YahooPackage.YAHOO__INDICES_SEED, oldIndicesSeed, newIndicesSeed);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndicesSeed(YahooIndicesSeed newIndicesSeed) {
		if (newIndicesSeed != indicesSeed) {
			NotificationChain msgs = null;
			if (indicesSeed != null)
				msgs = ((InternalEObject)indicesSeed).eInverseRemove(this, YahooPackage.YAHOO_INDICES_SEED__VENDOR, YahooIndicesSeed.class, msgs);
			if (newIndicesSeed != null)
				msgs = ((InternalEObject)newIndicesSeed).eInverseAdd(this, YahooPackage.YAHOO_INDICES_SEED__VENDOR, YahooIndicesSeed.class, msgs);
			msgs = basicSetIndicesSeed(newIndicesSeed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YahooPackage.YAHOO__INDICES_SEED, newIndicesSeed, newIndicesSeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client getClient() {
		if (eContainerFeatureID != YahooPackage.YAHOO__CLIENT) return null;
		return (Client)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClient(Client newClient, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newClient, YahooPackage.YAHOO__CLIENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClient(Client newClient) {
		if (newClient != eInternalContainer() || (eContainerFeatureID != YahooPackage.YAHOO__CLIENT && newClient != null)) {
			if (EcoreUtil.isAncestor(this, newClient))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newClient != null)
				msgs = ((InternalEObject)newClient).eInverseAdd(this, TradingPackage.CLIENT__VENDORS, Client.class, msgs);
			msgs = basicSetClient(newClient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YahooPackage.YAHOO__CLIENT, newClient, newClient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case YahooPackage.YAHOO__INDICES_COMPONENTS_SOURCE:
				if (indicesComponentsSource != null)
					msgs = ((InternalEObject)indicesComponentsSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YahooPackage.YAHOO__INDICES_COMPONENTS_SOURCE, null, msgs);
				return basicSetIndicesComponentsSource((YahooIndicesComponentsSource)otherEnd, msgs);
			case YahooPackage.YAHOO__INDICES_SEED:
				if (indicesSeed != null)
					msgs = ((InternalEObject)indicesSeed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YahooPackage.YAHOO__INDICES_SEED, null, msgs);
				return basicSetIndicesSeed((YahooIndicesSeed)otherEnd, msgs);
			case YahooPackage.YAHOO__CLIENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetClient((Client)otherEnd, msgs);
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
			case YahooPackage.YAHOO__INDICES_COMPONENTS_SOURCE:
				return basicSetIndicesComponentsSource(null, msgs);
			case YahooPackage.YAHOO__INDICES_SEED:
				return basicSetIndicesSeed(null, msgs);
			case YahooPackage.YAHOO__CLIENT:
				return basicSetClient(null, msgs);
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
			case YahooPackage.YAHOO__CLIENT:
				return eInternalContainer().eInverseRemove(this, TradingPackage.CLIENT__VENDORS, Client.class, msgs);
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
			case YahooPackage.YAHOO__ID:
				return getId();
			case YahooPackage.YAHOO__INDICES_COMPONENTS_SOURCE:
				return getIndicesComponentsSource();
			case YahooPackage.YAHOO__INDICES_SEED:
				return getIndicesSeed();
			case YahooPackage.YAHOO__CLIENT:
				return getClient();
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
			case YahooPackage.YAHOO__ID:
				setId((String)newValue);
				return;
			case YahooPackage.YAHOO__INDICES_COMPONENTS_SOURCE:
				setIndicesComponentsSource((YahooIndicesComponentsSource)newValue);
				return;
			case YahooPackage.YAHOO__INDICES_SEED:
				setIndicesSeed((YahooIndicesSeed)newValue);
				return;
			case YahooPackage.YAHOO__CLIENT:
				setClient((Client)newValue);
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
			case YahooPackage.YAHOO__ID:
				setId(ID_EDEFAULT);
				return;
			case YahooPackage.YAHOO__INDICES_COMPONENTS_SOURCE:
				setIndicesComponentsSource((YahooIndicesComponentsSource)null);
				return;
			case YahooPackage.YAHOO__INDICES_SEED:
				setIndicesSeed((YahooIndicesSeed)null);
				return;
			case YahooPackage.YAHOO__CLIENT:
				setClient((Client)null);
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
			case YahooPackage.YAHOO__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case YahooPackage.YAHOO__INDICES_COMPONENTS_SOURCE:
				return indicesComponentsSource != null;
			case YahooPackage.YAHOO__INDICES_SEED:
				return indicesSeed != null;
			case YahooPackage.YAHOO__CLIENT:
				return getClient() != null;
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

} //YahooImpl