/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReturnJoinImpl.java,v 1.1 2010/08/18 09:21:38 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30.impl;

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

import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;
import org.eclipse.emf.teneo.db2m.hbm30.Lockmode;
import org.eclipse.emf.teneo.db2m.hbm30.ReturnJoin;
import org.eclipse.emf.teneo.db2m.hbm30.ReturnProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Join</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ReturnJoinImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ReturnJoinImpl#getReturnProperty <em>Return Property</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ReturnJoinImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ReturnJoinImpl#getLockMode <em>Lock Mode</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ReturnJoinImpl#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReturnJoinImpl extends EObjectImpl implements ReturnJoin {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected String alias = ALIAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLockMode() <em>Lock Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockMode()
	 * @generated
	 * @ordered
	 */
	protected static final Lockmode LOCK_MODE_EDEFAULT = Lockmode.READ;

	/**
	 * The cached value of the '{@link #getLockMode() <em>Lock Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockMode()
	 * @generated
	 * @ordered
	 */
	protected Lockmode lockMode = LOCK_MODE_EDEFAULT;

	/**
	 * This is true if the Lock Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lockModeESet;

	/**
	 * The default value of the '{@link #getProperty() <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected String property = PROPERTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnJoinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getReturnJoin();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Hbm30Package.RETURN_JOIN__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReturnProperty> getReturnProperty() {
		return getGroup().list(Hbm30Package.eINSTANCE.getReturnJoin_ReturnProperty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlias(String newAlias) {
		String oldAlias = alias;
		alias = newAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.RETURN_JOIN__ALIAS, oldAlias, alias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lockmode getLockMode() {
		return lockMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLockMode(Lockmode newLockMode) {
		Lockmode oldLockMode = lockMode;
		lockMode = newLockMode == null ? LOCK_MODE_EDEFAULT : newLockMode;
		boolean oldLockModeESet = lockModeESet;
		lockModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.RETURN_JOIN__LOCK_MODE, oldLockMode, lockMode, !oldLockModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLockMode() {
		Lockmode oldLockMode = lockMode;
		boolean oldLockModeESet = lockModeESet;
		lockMode = LOCK_MODE_EDEFAULT;
		lockModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.RETURN_JOIN__LOCK_MODE, oldLockMode, LOCK_MODE_EDEFAULT, oldLockModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLockMode() {
		return lockModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(String newProperty) {
		String oldProperty = property;
		property = newProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.RETURN_JOIN__PROPERTY, oldProperty, property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Hbm30Package.RETURN_JOIN__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Hbm30Package.RETURN_JOIN__RETURN_PROPERTY:
				return ((InternalEList<?>)getReturnProperty()).basicRemove(otherEnd, msgs);
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
			case Hbm30Package.RETURN_JOIN__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Hbm30Package.RETURN_JOIN__RETURN_PROPERTY:
				return getReturnProperty();
			case Hbm30Package.RETURN_JOIN__ALIAS:
				return getAlias();
			case Hbm30Package.RETURN_JOIN__LOCK_MODE:
				return getLockMode();
			case Hbm30Package.RETURN_JOIN__PROPERTY:
				return getProperty();
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
			case Hbm30Package.RETURN_JOIN__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Hbm30Package.RETURN_JOIN__RETURN_PROPERTY:
				getReturnProperty().clear();
				getReturnProperty().addAll((Collection<? extends ReturnProperty>)newValue);
				return;
			case Hbm30Package.RETURN_JOIN__ALIAS:
				setAlias((String)newValue);
				return;
			case Hbm30Package.RETURN_JOIN__LOCK_MODE:
				setLockMode((Lockmode)newValue);
				return;
			case Hbm30Package.RETURN_JOIN__PROPERTY:
				setProperty((String)newValue);
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
			case Hbm30Package.RETURN_JOIN__GROUP:
				getGroup().clear();
				return;
			case Hbm30Package.RETURN_JOIN__RETURN_PROPERTY:
				getReturnProperty().clear();
				return;
			case Hbm30Package.RETURN_JOIN__ALIAS:
				setAlias(ALIAS_EDEFAULT);
				return;
			case Hbm30Package.RETURN_JOIN__LOCK_MODE:
				unsetLockMode();
				return;
			case Hbm30Package.RETURN_JOIN__PROPERTY:
				setProperty(PROPERTY_EDEFAULT);
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
			case Hbm30Package.RETURN_JOIN__GROUP:
				return group != null && !group.isEmpty();
			case Hbm30Package.RETURN_JOIN__RETURN_PROPERTY:
				return !getReturnProperty().isEmpty();
			case Hbm30Package.RETURN_JOIN__ALIAS:
				return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
			case Hbm30Package.RETURN_JOIN__LOCK_MODE:
				return isSetLockMode();
			case Hbm30Package.RETURN_JOIN__PROPERTY:
				return PROPERTY_EDEFAULT == null ? property != null : !PROPERTY_EDEFAULT.equals(property);
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
		result.append(" (group: ");
		result.append(group);
		result.append(", alias: ");
		result.append(alias);
		result.append(", lockMode: ");
		if (lockModeESet) result.append(lockMode); else result.append("<unset>");
		result.append(", property: ");
		result.append(property);
		result.append(')');
		return result.toString();
	}

} //ReturnJoinImpl
