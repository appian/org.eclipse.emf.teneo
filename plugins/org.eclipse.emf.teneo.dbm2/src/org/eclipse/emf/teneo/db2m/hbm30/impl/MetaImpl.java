/**
 * <copyright>
 * </copyright>
 *
 * $Id: MetaImpl.java,v 1.1 2010/08/18 09:21:38 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;
import org.eclipse.emf.teneo.db2m.hbm30.Meta;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MetaImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MetaImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MetaImpl#isInherit <em>Inherit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetaImpl extends EObjectImpl implements Meta {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected String attribute = ATTRIBUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #isInherit() <em>Inherit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInherit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INHERIT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isInherit() <em>Inherit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInherit()
	 * @generated
	 * @ordered
	 */
	protected boolean inherit = INHERIT_EDEFAULT;

	/**
	 * This is true if the Inherit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean inheritESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getMeta();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.META__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(String newAttribute) {
		String oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.META__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInherit() {
		return inherit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInherit(boolean newInherit) {
		boolean oldInherit = inherit;
		inherit = newInherit;
		boolean oldInheritESet = inheritESet;
		inheritESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.META__INHERIT, oldInherit, inherit, !oldInheritESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInherit() {
		boolean oldInherit = inherit;
		boolean oldInheritESet = inheritESet;
		inherit = INHERIT_EDEFAULT;
		inheritESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.META__INHERIT, oldInherit, INHERIT_EDEFAULT, oldInheritESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInherit() {
		return inheritESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Hbm30Package.META__VALUE:
				return getValue();
			case Hbm30Package.META__ATTRIBUTE:
				return getAttribute();
			case Hbm30Package.META__INHERIT:
				return isInherit();
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
			case Hbm30Package.META__VALUE:
				setValue((String)newValue);
				return;
			case Hbm30Package.META__ATTRIBUTE:
				setAttribute((String)newValue);
				return;
			case Hbm30Package.META__INHERIT:
				setInherit((Boolean)newValue);
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
			case Hbm30Package.META__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case Hbm30Package.META__ATTRIBUTE:
				setAttribute(ATTRIBUTE_EDEFAULT);
				return;
			case Hbm30Package.META__INHERIT:
				unsetInherit();
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
			case Hbm30Package.META__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case Hbm30Package.META__ATTRIBUTE:
				return ATTRIBUTE_EDEFAULT == null ? attribute != null : !ATTRIBUTE_EDEFAULT.equals(attribute);
			case Hbm30Package.META__INHERIT:
				return isSetInherit();
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
		result.append(" (value: ");
		result.append(value);
		result.append(", attribute: ");
		result.append(attribute);
		result.append(", inherit: ");
		if (inheritESet) result.append(inherit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MetaImpl
