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
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.various.impl.ParentImpl#getName1 <em>Name1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.various.impl.ParentImpl#getName2 <em>Name2</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.various.impl.ParentImpl#getCompleteName <em>Complete Name</em>}</li>
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
	 * The default value of the '{@link #getName1() <em>Name1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName1()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName1() <em>Name1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName1()
	 * @generated
	 * @ordered
	 */
	protected String name1 = NAME1_EDEFAULT;

	/**
	 * The default value of the '{@link #getName2() <em>Name2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName2()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName2() <em>Name2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName2()
	 * @generated
	 * @ordered
	 */
	protected String name2 = NAME2_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompleteName() <em>Complete Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompleteName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLETE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompleteName() <em>Complete Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompleteName()
	 * @generated
	 * @ordered
	 */
	protected String completeName = COMPLETE_NAME_EDEFAULT;

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
	public String getName1() {
		return name1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName1(String newName1) {
		String oldName1 = name1;
		name1 = newName1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariousPackage.PARENT__NAME1, oldName1, name1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName2() {
		return name2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName2(String newName2) {
		String oldName2 = name2;
		name2 = newName2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariousPackage.PARENT__NAME2, oldName2, name2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompleteName() {
		return completeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompleteName(String newCompleteName) {
		String oldCompleteName = completeName;
		completeName = newCompleteName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariousPackage.PARENT__COMPLETE_NAME, oldCompleteName, completeName));
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
				return getTotalPeople();
			case VariousPackage.PARENT__NAME1:
				return getName1();
			case VariousPackage.PARENT__NAME2:
				return getName2();
			case VariousPackage.PARENT__COMPLETE_NAME:
				return getCompleteName();
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
				setTotalPeople((Integer)newValue);
				return;
			case VariousPackage.PARENT__NAME1:
				setName1((String)newValue);
				return;
			case VariousPackage.PARENT__NAME2:
				setName2((String)newValue);
				return;
			case VariousPackage.PARENT__COMPLETE_NAME:
				setCompleteName((String)newValue);
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
			case VariousPackage.PARENT__NAME1:
				setName1(NAME1_EDEFAULT);
				return;
			case VariousPackage.PARENT__NAME2:
				setName2(NAME2_EDEFAULT);
				return;
			case VariousPackage.PARENT__COMPLETE_NAME:
				setCompleteName(COMPLETE_NAME_EDEFAULT);
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
			case VariousPackage.PARENT__NAME1:
				return NAME1_EDEFAULT == null ? name1 != null : !NAME1_EDEFAULT.equals(name1);
			case VariousPackage.PARENT__NAME2:
				return NAME2_EDEFAULT == null ? name2 != null : !NAME2_EDEFAULT.equals(name2);
			case VariousPackage.PARENT__COMPLETE_NAME:
				return COMPLETE_NAME_EDEFAULT == null ? completeName != null : !COMPLETE_NAME_EDEFAULT.equals(completeName);
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
		result.append(", name1: ");
		result.append(name1);
		result.append(", name2: ");
		result.append(name2);
		result.append(", completeName: ");
		result.append(completeName);
		result.append(')');
		return result.toString();
	}

} //ParentImpl
