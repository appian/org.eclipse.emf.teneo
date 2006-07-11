/**
 * <copyright>
 * </copyright>
 *
 * $Id: CTypeImpl.java,v 1.1 2006/07/11 16:56:56 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.nestedgroup.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.nestedgroup.CType;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.nestedgroup.NestedgroupPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CType</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.nestedgroup.impl.CTypeImpl#getCname <em>Cname</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.nestedgroup.impl.CTypeImpl#getCvalue <em>Cvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CTypeImpl extends EObjectImpl implements CType {
	/**
	 * The default value of the '{@link #getCname() <em>Cname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCname()
	 * @generated
	 * @ordered
	 */
	protected static final String CNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCname() <em>Cname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCname()
	 * @generated
	 * @ordered
	 */
	protected String cname = CNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCvalue() <em>Cvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCvalue()
	 * @generated
	 * @ordered
	 */
	protected static final double CVALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCvalue() <em>Cvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCvalue()
	 * @generated
	 * @ordered
	 */
	protected double cvalue = CVALUE_EDEFAULT;

	/**
	 * This is true if the Cvalue attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cvalueESet = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NestedgroupPackage.eINSTANCE.getCType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCname() {
		return cname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCname(String newCname) {
		String oldCname = cname;
		cname = newCname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NestedgroupPackage.CTYPE__CNAME, oldCname, cname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCvalue() {
		return cvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCvalue(double newCvalue) {
		double oldCvalue = cvalue;
		cvalue = newCvalue;
		boolean oldCvalueESet = cvalueESet;
		cvalueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NestedgroupPackage.CTYPE__CVALUE, oldCvalue, cvalue, !oldCvalueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCvalue() {
		double oldCvalue = cvalue;
		boolean oldCvalueESet = cvalueESet;
		cvalue = CVALUE_EDEFAULT;
		cvalueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NestedgroupPackage.CTYPE__CVALUE, oldCvalue, CVALUE_EDEFAULT, oldCvalueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCvalue() {
		return cvalueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case NestedgroupPackage.CTYPE__CNAME:
				return getCname();
			case NestedgroupPackage.CTYPE__CVALUE:
				return new Double(getCvalue());
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case NestedgroupPackage.CTYPE__CNAME:
				setCname((String)newValue);
				return;
			case NestedgroupPackage.CTYPE__CVALUE:
				setCvalue(((Double)newValue).doubleValue());
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case NestedgroupPackage.CTYPE__CNAME:
				setCname(CNAME_EDEFAULT);
				return;
			case NestedgroupPackage.CTYPE__CVALUE:
				unsetCvalue();
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case NestedgroupPackage.CTYPE__CNAME:
				return CNAME_EDEFAULT == null ? cname != null : !CNAME_EDEFAULT.equals(cname);
			case NestedgroupPackage.CTYPE__CVALUE:
				return isSetCvalue();
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (cname: ");
		result.append(cname);
		result.append(", cvalue: ");
		if (cvalueESet) result.append(cvalue); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CTypeImpl
