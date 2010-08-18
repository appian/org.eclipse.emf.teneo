/**
 * <copyright>
 * </copyright>
 *
 * $Id: TuplizerImpl.java,v 1.1 2010/08/18 09:21:39 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.db2m.hbm30.EntityModeType;
import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;
import org.eclipse.emf.teneo.db2m.hbm30.Tuplizer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tuplizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.TuplizerImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.TuplizerImpl#getEntityMode <em>Entity Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TuplizerImpl extends EObjectImpl implements Tuplizer {
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
	 * The default value of the '{@link #getEntityMode() <em>Entity Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityMode()
	 * @generated
	 * @ordered
	 */
	protected static final EntityModeType ENTITY_MODE_EDEFAULT = EntityModeType.POJO;

	/**
	 * The cached value of the '{@link #getEntityMode() <em>Entity Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityMode()
	 * @generated
	 * @ordered
	 */
	protected EntityModeType entityMode = ENTITY_MODE_EDEFAULT;

	/**
	 * This is true if the Entity Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean entityModeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TuplizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getTuplizer();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.TUPLIZER__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityModeType getEntityMode() {
		return entityMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityMode(EntityModeType newEntityMode) {
		EntityModeType oldEntityMode = entityMode;
		entityMode = newEntityMode == null ? ENTITY_MODE_EDEFAULT : newEntityMode;
		boolean oldEntityModeESet = entityModeESet;
		entityModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.TUPLIZER__ENTITY_MODE, oldEntityMode, entityMode, !oldEntityModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEntityMode() {
		EntityModeType oldEntityMode = entityMode;
		boolean oldEntityModeESet = entityModeESet;
		entityMode = ENTITY_MODE_EDEFAULT;
		entityModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.TUPLIZER__ENTITY_MODE, oldEntityMode, ENTITY_MODE_EDEFAULT, oldEntityModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEntityMode() {
		return entityModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Hbm30Package.TUPLIZER__CLASS:
				return getClass_();
			case Hbm30Package.TUPLIZER__ENTITY_MODE:
				return getEntityMode();
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
			case Hbm30Package.TUPLIZER__CLASS:
				setClass((String)newValue);
				return;
			case Hbm30Package.TUPLIZER__ENTITY_MODE:
				setEntityMode((EntityModeType)newValue);
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
			case Hbm30Package.TUPLIZER__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case Hbm30Package.TUPLIZER__ENTITY_MODE:
				unsetEntityMode();
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
			case Hbm30Package.TUPLIZER__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case Hbm30Package.TUPLIZER__ENTITY_MODE:
				return isSetEntityMode();
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
		result.append(" (class: ");
		result.append(class_);
		result.append(", entityMode: ");
		if (entityModeESet) result.append(entityMode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TuplizerImpl
