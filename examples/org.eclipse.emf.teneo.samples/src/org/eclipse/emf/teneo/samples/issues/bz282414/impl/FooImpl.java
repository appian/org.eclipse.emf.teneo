/**
 * <copyright>
 * </copyright>
 *
 * $Id: FooImpl.java,v 1.1 2009/07/05 00:09:05 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz282414.impl;

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

import org.eclipse.emf.teneo.samples.issues.bz282414.Bar;
import org.eclipse.emf.teneo.samples.issues.bz282414.Bz282414Package;
import org.eclipse.emf.teneo.samples.issues.bz282414.Foo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz282414.impl.FooImpl#getBagOfBars <em>Bag Of Bars</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz282414.impl.FooImpl#getClientId <em>Client Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz282414.impl.FooImpl#getDnmSK <em>Dnm SK</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FooImpl extends EObjectImpl implements Foo {
	/**
	 * The cached value of the '{@link #getBagOfBars() <em>Bag Of Bars</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBagOfBars()
	 * @generated
	 * @ordered
	 */
	protected EList<Bar> bagOfBars;

	/**
	 * The default value of the '{@link #getClientId() <em>Client Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientId()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_ID_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getClientId() <em>Client Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientId()
	 * @generated
	 * @ordered
	 */
	protected String clientId = CLIENT_ID_EDEFAULT;

	/**
	 * This is true if the Client Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean clientIdESet;

	/**
	 * The default value of the '{@link #getDnmSK() <em>Dnm SK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDnmSK()
	 * @generated
	 * @ordered
	 */
	protected static final long DNM_SK_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDnmSK() <em>Dnm SK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDnmSK()
	 * @generated
	 * @ordered
	 */
	protected long dnmSK = DNM_SK_EDEFAULT;

	/**
	 * This is true if the Dnm SK attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dnmSKESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FooImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bz282414Package.Literals.FOO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bar> getBagOfBars() {
		if (bagOfBars == null) {
			bagOfBars = new EObjectContainmentEList<Bar>(Bar.class, this, Bz282414Package.FOO__BAG_OF_BARS);
		}
		return bagOfBars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClientId() {
		return clientId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientId(String newClientId) {
		String oldClientId = clientId;
		clientId = newClientId;
		boolean oldClientIdESet = clientIdESet;
		clientIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz282414Package.FOO__CLIENT_ID, oldClientId, clientId, !oldClientIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClientId() {
		String oldClientId = clientId;
		boolean oldClientIdESet = clientIdESet;
		clientId = CLIENT_ID_EDEFAULT;
		clientIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Bz282414Package.FOO__CLIENT_ID, oldClientId, CLIENT_ID_EDEFAULT, oldClientIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClientId() {
		return clientIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDnmSK() {
		return dnmSK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDnmSK(long newDnmSK) {
		long oldDnmSK = dnmSK;
		dnmSK = newDnmSK;
		boolean oldDnmSKESet = dnmSKESet;
		dnmSKESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz282414Package.FOO__DNM_SK, oldDnmSK, dnmSK, !oldDnmSKESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDnmSK() {
		long oldDnmSK = dnmSK;
		boolean oldDnmSKESet = dnmSKESet;
		dnmSK = DNM_SK_EDEFAULT;
		dnmSKESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Bz282414Package.FOO__DNM_SK, oldDnmSK, DNM_SK_EDEFAULT, oldDnmSKESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDnmSK() {
		return dnmSKESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bz282414Package.FOO__BAG_OF_BARS:
				return ((InternalEList<?>)getBagOfBars()).basicRemove(otherEnd, msgs);
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
			case Bz282414Package.FOO__BAG_OF_BARS:
				return getBagOfBars();
			case Bz282414Package.FOO__CLIENT_ID:
				return getClientId();
			case Bz282414Package.FOO__DNM_SK:
				return getDnmSK();
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
			case Bz282414Package.FOO__BAG_OF_BARS:
				getBagOfBars().clear();
				getBagOfBars().addAll((Collection<? extends Bar>)newValue);
				return;
			case Bz282414Package.FOO__CLIENT_ID:
				setClientId((String)newValue);
				return;
			case Bz282414Package.FOO__DNM_SK:
				setDnmSK((Long)newValue);
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
			case Bz282414Package.FOO__BAG_OF_BARS:
				getBagOfBars().clear();
				return;
			case Bz282414Package.FOO__CLIENT_ID:
				unsetClientId();
				return;
			case Bz282414Package.FOO__DNM_SK:
				unsetDnmSK();
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
			case Bz282414Package.FOO__BAG_OF_BARS:
				return bagOfBars != null && !bagOfBars.isEmpty();
			case Bz282414Package.FOO__CLIENT_ID:
				return isSetClientId();
			case Bz282414Package.FOO__DNM_SK:
				return isSetDnmSK();
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
		result.append(" (clientId: ");
		if (clientIdESet) result.append(clientId); else result.append("<unset>");
		result.append(", dnmSK: ");
		if (dnmSKESet) result.append(dnmSK); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FooImpl
