/**
 * <copyright>
 * </copyright>
 *
 * $Id: ParentImpl.java,v 1.1 2011/01/20 17:13:39 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.hbcascade.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.teneo.samples.emf.annotations.hbcascade.Child;
import org.eclipse.emf.teneo.samples.emf.annotations.hbcascade.HbCascadePackage;
import org.eclipse.emf.teneo.samples.emf.annotations.hbcascade.Parent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.hbcascade.impl.ParentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.hbcascade.impl.ParentImpl#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParentImpl extends EObjectImpl implements Parent {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Child> children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HbCascadePackage.Literals.PARENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbCascadePackage.PARENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Child> getChildren() {
		if (children == null) {
			children = new EObjectResolvingEList<Child>(Child.class, this, HbCascadePackage.PARENT__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HbCascadePackage.PARENT__NAME:
				return getName();
			case HbCascadePackage.PARENT__CHILDREN:
				return getChildren();
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
			case HbCascadePackage.PARENT__NAME:
				setName((String)newValue);
				return;
			case HbCascadePackage.PARENT__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Child>)newValue);
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
			case HbCascadePackage.PARENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HbCascadePackage.PARENT__CHILDREN:
				getChildren().clear();
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
			case HbCascadePackage.PARENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HbCascadePackage.PARENT__CHILDREN:
				return children != null && !children.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ParentImpl
