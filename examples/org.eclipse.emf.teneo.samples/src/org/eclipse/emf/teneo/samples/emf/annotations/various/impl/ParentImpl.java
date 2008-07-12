/**
 * <copyright>
 * </copyright>
 *
 * $Id: ParentImpl.java,v 1.1 2008/07/12 13:09:07 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.various.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.teneo.samples.emf.annotations.various.Child;
import org.eclipse.emf.teneo.samples.emf.annotations.various.Parent;
import org.eclipse.emf.teneo.samples.emf.annotations.various.VariousPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.various.impl.ParentImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.various.impl.ParentImpl#getTotalPeople <em>Total People</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParentImpl extends EObjectImpl implements Parent {
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
	 * The default value of the '{@link #getTotalPeople() <em>Total People</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalPeople()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_PEOPLE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotalPeople() <em>Total People</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalPeople()
	 * @generated
	 * @ordered
	 */
	protected int totalPeople = TOTAL_PEOPLE_EDEFAULT;

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
		return VariousPackage.Literals.PARENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Child> getChildren() {
		if (children == null) {
			children = new EObjectResolvingEList<Child>(Child.class, this, VariousPackage.PARENT__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotalPeople() {
		return totalPeople;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalPeople(int newTotalPeople) {
		int oldTotalPeople = totalPeople;
		totalPeople = newTotalPeople;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariousPackage.PARENT__TOTAL_PEOPLE, oldTotalPeople, totalPeople));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VariousPackage.PARENT__CHILDREN:
				return getChildren();
			case VariousPackage.PARENT__TOTAL_PEOPLE:
				return new Integer(getTotalPeople());
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
			case VariousPackage.PARENT__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Child>)newValue);
				return;
			case VariousPackage.PARENT__TOTAL_PEOPLE:
				setTotalPeople(((Integer)newValue).intValue());
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
			case VariousPackage.PARENT__CHILDREN:
				getChildren().clear();
				return;
			case VariousPackage.PARENT__TOTAL_PEOPLE:
				setTotalPeople(TOTAL_PEOPLE_EDEFAULT);
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
			case VariousPackage.PARENT__CHILDREN:
				return children != null && !children.isEmpty();
			case VariousPackage.PARENT__TOTAL_PEOPLE:
				return totalPeople != TOTAL_PEOPLE_EDEFAULT;
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
		result.append(" (totalPeople: ");
		result.append(totalPeople);
		result.append(')');
		return result.toString();
	}

} //ParentImpl
