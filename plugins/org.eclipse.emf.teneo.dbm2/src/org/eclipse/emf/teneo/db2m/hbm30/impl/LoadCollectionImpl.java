/**
 * <copyright>
 * </copyright>
 *
 * $Id: LoadCollectionImpl.java,v 1.1 2010/08/18 09:21:38 cbouhier Exp $
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
import org.eclipse.emf.teneo.db2m.hbm30.LoadCollection;
import org.eclipse.emf.teneo.db2m.hbm30.Lockmode;
import org.eclipse.emf.teneo.db2m.hbm30.ReturnProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.LoadCollectionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.LoadCollectionImpl#getReturnProperty <em>Return Property</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.LoadCollectionImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.LoadCollectionImpl#getLockMode <em>Lock Mode</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.LoadCollectionImpl#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoadCollectionImpl extends EObjectImpl implements LoadCollection {
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
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getLoadCollection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Hbm30Package.LOAD_COLLECTION__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReturnProperty> getReturnProperty() {
		return getGroup().list(Hbm30Package.eINSTANCE.getLoadCollection_ReturnProperty());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.LOAD_COLLECTION__ALIAS, oldAlias, alias));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.LOAD_COLLECTION__LOCK_MODE, oldLockMode, lockMode, !oldLockModeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.LOAD_COLLECTION__LOCK_MODE, oldLockMode, LOCK_MODE_EDEFAULT, oldLockModeESet));
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
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(String newRole) {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.LOAD_COLLECTION__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Hbm30Package.LOAD_COLLECTION__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Hbm30Package.LOAD_COLLECTION__RETURN_PROPERTY:
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
			case Hbm30Package.LOAD_COLLECTION__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Hbm30Package.LOAD_COLLECTION__RETURN_PROPERTY:
				return getReturnProperty();
			case Hbm30Package.LOAD_COLLECTION__ALIAS:
				return getAlias();
			case Hbm30Package.LOAD_COLLECTION__LOCK_MODE:
				return getLockMode();
			case Hbm30Package.LOAD_COLLECTION__ROLE:
				return getRole();
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
			case Hbm30Package.LOAD_COLLECTION__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Hbm30Package.LOAD_COLLECTION__RETURN_PROPERTY:
				getReturnProperty().clear();
				getReturnProperty().addAll((Collection<? extends ReturnProperty>)newValue);
				return;
			case Hbm30Package.LOAD_COLLECTION__ALIAS:
				setAlias((String)newValue);
				return;
			case Hbm30Package.LOAD_COLLECTION__LOCK_MODE:
				setLockMode((Lockmode)newValue);
				return;
			case Hbm30Package.LOAD_COLLECTION__ROLE:
				setRole((String)newValue);
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
			case Hbm30Package.LOAD_COLLECTION__GROUP:
				getGroup().clear();
				return;
			case Hbm30Package.LOAD_COLLECTION__RETURN_PROPERTY:
				getReturnProperty().clear();
				return;
			case Hbm30Package.LOAD_COLLECTION__ALIAS:
				setAlias(ALIAS_EDEFAULT);
				return;
			case Hbm30Package.LOAD_COLLECTION__LOCK_MODE:
				unsetLockMode();
				return;
			case Hbm30Package.LOAD_COLLECTION__ROLE:
				setRole(ROLE_EDEFAULT);
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
			case Hbm30Package.LOAD_COLLECTION__GROUP:
				return group != null && !group.isEmpty();
			case Hbm30Package.LOAD_COLLECTION__RETURN_PROPERTY:
				return !getReturnProperty().isEmpty();
			case Hbm30Package.LOAD_COLLECTION__ALIAS:
				return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
			case Hbm30Package.LOAD_COLLECTION__LOCK_MODE:
				return isSetLockMode();
			case Hbm30Package.LOAD_COLLECTION__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
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
		result.append(", role: ");
		result.append(role);
		result.append(')');
		return result.toString();
	}

} //LoadCollectionImpl
