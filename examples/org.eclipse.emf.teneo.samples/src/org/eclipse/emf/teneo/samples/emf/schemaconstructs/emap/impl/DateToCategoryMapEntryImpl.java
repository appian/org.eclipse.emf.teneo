/**
 * <copyright>
 * </copyright>
 *
 * $Id: DateToCategoryMapEntryImpl.java,v 1.1 2007/07/09 12:55:20 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.Category;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.EmapPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date To Category Map Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.impl.DateToCategoryMapEntryImpl#getTypedKey <em>Key</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.impl.DateToCategoryMapEntryImpl#getTypedValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DateToCategoryMapEntryImpl extends EObjectImpl implements BasicEMap.Entry<Date,Category> {
	/**
	 * The default value of the '{@link #getTypedKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedKey()
	 * @generated
	 * @ordered
	 */
	protected static final Date KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypedKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedKey()
	 * @generated
	 * @ordered
	 */
	protected Date key = KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypedValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedValue()
	 * @generated
	 * @ordered
	 */
	protected static final Category VALUE_EDEFAULT = Category.COMPLEX;

	/**
	 * The cached value of the '{@link #getTypedValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedValue()
	 * @generated
	 * @ordered
	 */
	protected Category value = VALUE_EDEFAULT;

	/**
	 * This is true if the Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateToCategoryMapEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmapPackage.Literals.DATE_TO_CATEGORY_MAP_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTypedKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypedKey(Date newKey) {
		Date oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmapPackage.DATE_TO_CATEGORY_MAP_ENTRY__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getTypedValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypedValue(Category newValue) {
		Category oldValue = value;
		value = newValue == null ? VALUE_EDEFAULT : newValue;
		boolean oldValueESet = valueESet;
		valueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmapPackage.DATE_TO_CATEGORY_MAP_ENTRY__VALUE, oldValue, value, !oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypedValue() {
		Category oldValue = value;
		boolean oldValueESet = valueESet;
		value = VALUE_EDEFAULT;
		valueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EmapPackage.DATE_TO_CATEGORY_MAP_ENTRY__VALUE, oldValue, VALUE_EDEFAULT, oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypedValue() {
		return valueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmapPackage.DATE_TO_CATEGORY_MAP_ENTRY__KEY:
				return getTypedKey();
			case EmapPackage.DATE_TO_CATEGORY_MAP_ENTRY__VALUE:
				return getTypedValue();
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
			case EmapPackage.DATE_TO_CATEGORY_MAP_ENTRY__KEY:
				setTypedKey((Date)newValue);
				return;
			case EmapPackage.DATE_TO_CATEGORY_MAP_ENTRY__VALUE:
				setTypedValue((Category)newValue);
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
			case EmapPackage.DATE_TO_CATEGORY_MAP_ENTRY__KEY:
				setTypedKey(KEY_EDEFAULT);
				return;
			case EmapPackage.DATE_TO_CATEGORY_MAP_ENTRY__VALUE:
				unsetTypedValue();
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
			case EmapPackage.DATE_TO_CATEGORY_MAP_ENTRY__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case EmapPackage.DATE_TO_CATEGORY_MAP_ENTRY__VALUE:
				return isSetTypedValue();
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
		result.append(" (key: ");
		result.append(key);
		result.append(", value: ");
		if (valueESet) result.append(value); else result.append("<unset>");
		result.append(')');
		return result.toString();
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
	public Date getKey() {
		return getTypedKey();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(Date key) {
		setTypedKey(key);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getValue() {
		return getTypedValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category setValue(Category value) {
		Category oldValue = getValue();
		setTypedValue(value);
		return oldValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<Date, Category> getEMap() {
		EObject container = eContainer();
		return container == null ? null : (EMap<Date, Category>)container.eGet(eContainmentFeature());
	}

} //DateToCategoryMapEntryImpl
