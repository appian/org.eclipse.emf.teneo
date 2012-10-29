/**
 * <copyright>
 * </copyright>
 *
 * $Id: ChildObject3Impl.java,v 1.1 2006/09/21 00:56:52 mtaal Exp $
 */
package main.impl;

import main.ChildObject3;
import main.MainPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Child Object3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link main.impl.ChildObject3Impl#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ChildObject3Impl extends BaseObjectImpl implements ChildObject3 {
	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected Integer width = WIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ChildObject3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MainPackage.Literals.CHILD_OBJECT3;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Integer getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setWidth(Integer newWidth) {
		Integer oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MainPackage.CHILD_OBJECT3__WIDTH,
					oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MainPackage.CHILD_OBJECT3__WIDTH:
			return getWidth();
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
		case MainPackage.CHILD_OBJECT3__WIDTH:
			setWidth((Integer) newValue);
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
		case MainPackage.CHILD_OBJECT3__WIDTH:
			setWidth(WIDTH_EDEFAULT);
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
		case MainPackage.CHILD_OBJECT3__WIDTH:
			return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
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
		result.append(" (width: ");
		result.append(width);
		result.append(')');
		return result.toString();
	}

} // ChildObject3Impl