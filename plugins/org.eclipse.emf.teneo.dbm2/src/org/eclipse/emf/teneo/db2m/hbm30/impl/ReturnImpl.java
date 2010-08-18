/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReturnImpl.java,v 1.1 2010/08/18 09:21:39 cbouhier Exp $
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
import org.eclipse.emf.teneo.db2m.hbm30.Return;
import org.eclipse.emf.teneo.db2m.hbm30.ReturnDiscriminator;
import org.eclipse.emf.teneo.db2m.hbm30.ReturnProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ReturnImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ReturnImpl#getReturnDiscriminator <em>Return Discriminator</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ReturnImpl#getReturnProperty <em>Return Property</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ReturnImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ReturnImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ReturnImpl#getEntityName <em>Entity Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ReturnImpl#getLockMode <em>Lock Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReturnImpl extends EObjectImpl implements Return {
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
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntityName() <em>Entity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityName()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntityName() <em>Entity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityName()
	 * @generated
	 * @ordered
	 */
	protected String entityName = ENTITY_NAME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getReturn();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Hbm30Package.RETURN__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReturnDiscriminator> getReturnDiscriminator() {
		return getGroup().list(Hbm30Package.eINSTANCE.getReturn_ReturnDiscriminator());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReturnProperty> getReturnProperty() {
		return getGroup().list(Hbm30Package.eINSTANCE.getReturn_ReturnProperty());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.RETURN__ALIAS, oldAlias, alias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.RETURN__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntityName() {
		return entityName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityName(String newEntityName) {
		String oldEntityName = entityName;
		entityName = newEntityName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.RETURN__ENTITY_NAME, oldEntityName, entityName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.RETURN__LOCK_MODE, oldLockMode, lockMode, !oldLockModeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.RETURN__LOCK_MODE, oldLockMode, LOCK_MODE_EDEFAULT, oldLockModeESet));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Hbm30Package.RETURN__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Hbm30Package.RETURN__RETURN_DISCRIMINATOR:
				return ((InternalEList<?>)getReturnDiscriminator()).basicRemove(otherEnd, msgs);
			case Hbm30Package.RETURN__RETURN_PROPERTY:
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
			case Hbm30Package.RETURN__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Hbm30Package.RETURN__RETURN_DISCRIMINATOR:
				return getReturnDiscriminator();
			case Hbm30Package.RETURN__RETURN_PROPERTY:
				return getReturnProperty();
			case Hbm30Package.RETURN__ALIAS:
				return getAlias();
			case Hbm30Package.RETURN__CLASS:
				return getClass_();
			case Hbm30Package.RETURN__ENTITY_NAME:
				return getEntityName();
			case Hbm30Package.RETURN__LOCK_MODE:
				return getLockMode();
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
			case Hbm30Package.RETURN__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Hbm30Package.RETURN__RETURN_DISCRIMINATOR:
				getReturnDiscriminator().clear();
				getReturnDiscriminator().addAll((Collection<? extends ReturnDiscriminator>)newValue);
				return;
			case Hbm30Package.RETURN__RETURN_PROPERTY:
				getReturnProperty().clear();
				getReturnProperty().addAll((Collection<? extends ReturnProperty>)newValue);
				return;
			case Hbm30Package.RETURN__ALIAS:
				setAlias((String)newValue);
				return;
			case Hbm30Package.RETURN__CLASS:
				setClass((String)newValue);
				return;
			case Hbm30Package.RETURN__ENTITY_NAME:
				setEntityName((String)newValue);
				return;
			case Hbm30Package.RETURN__LOCK_MODE:
				setLockMode((Lockmode)newValue);
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
			case Hbm30Package.RETURN__GROUP:
				getGroup().clear();
				return;
			case Hbm30Package.RETURN__RETURN_DISCRIMINATOR:
				getReturnDiscriminator().clear();
				return;
			case Hbm30Package.RETURN__RETURN_PROPERTY:
				getReturnProperty().clear();
				return;
			case Hbm30Package.RETURN__ALIAS:
				setAlias(ALIAS_EDEFAULT);
				return;
			case Hbm30Package.RETURN__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case Hbm30Package.RETURN__ENTITY_NAME:
				setEntityName(ENTITY_NAME_EDEFAULT);
				return;
			case Hbm30Package.RETURN__LOCK_MODE:
				unsetLockMode();
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
			case Hbm30Package.RETURN__GROUP:
				return group != null && !group.isEmpty();
			case Hbm30Package.RETURN__RETURN_DISCRIMINATOR:
				return !getReturnDiscriminator().isEmpty();
			case Hbm30Package.RETURN__RETURN_PROPERTY:
				return !getReturnProperty().isEmpty();
			case Hbm30Package.RETURN__ALIAS:
				return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
			case Hbm30Package.RETURN__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case Hbm30Package.RETURN__ENTITY_NAME:
				return ENTITY_NAME_EDEFAULT == null ? entityName != null : !ENTITY_NAME_EDEFAULT.equals(entityName);
			case Hbm30Package.RETURN__LOCK_MODE:
				return isSetLockMode();
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
		result.append(", class: ");
		result.append(class_);
		result.append(", entityName: ");
		result.append(entityName);
		result.append(", lockMode: ");
		if (lockModeESet) result.append(lockMode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ReturnImpl
