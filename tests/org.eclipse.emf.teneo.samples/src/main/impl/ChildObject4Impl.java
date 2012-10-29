/**
 * <copyright>
 * </copyright>
 *
 * $Id: ChildObject4Impl.java,v 1.1 2006/09/21 00:56:52 mtaal Exp $
 */
package main.impl;

import main.ChildObject4;
import main.MainPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Child Object4</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link main.impl.ChildObject4Impl#getThickness <em>Thickness</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ChildObject4Impl extends BaseObjectImpl implements ChildObject4 {
	/**
	 * The default value of the '{@link #getThickness() <em>Thickness</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getThickness()
	 * @generated
	 * @ordered
	 */
	protected static final Integer THICKNESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThickness() <em>Thickness</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getThickness()
	 * @generated
	 * @ordered
	 */
	protected Integer thickness = THICKNESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ChildObject4Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MainPackage.Literals.CHILD_OBJECT4;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Integer getThickness() {
		return thickness;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setThickness(Integer newThickness) {
		Integer oldThickness = thickness;
		thickness = newThickness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MainPackage.CHILD_OBJECT4__THICKNESS,
					oldThickness, thickness));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MainPackage.CHILD_OBJECT4__THICKNESS:
			return getThickness();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MainPackage.CHILD_OBJECT4__THICKNESS:
			setThickness((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
		case MainPackage.CHILD_OBJECT4__THICKNESS:
			setThickness(THICKNESS_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MainPackage.CHILD_OBJECT4__THICKNESS:
			return THICKNESS_EDEFAULT == null ? thickness != null : !THICKNESS_EDEFAULT.equals(thickness);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (thickness: ");
		result.append(thickness);
		result.append(')');
		return result.toString();
	}

} // ChildObject4Impl