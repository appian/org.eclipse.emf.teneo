/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrderListImpl.java,v 1.1 2010/03/25 00:29:09 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.impl;

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

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.ModelgroupPackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.OrderList;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.PurchaseOrder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.impl.OrderListImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.impl.OrderListImpl#getOrders <em>Orders</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.impl.OrderListImpl#getPreferredOrders <em>Preferred Orders</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.impl.OrderListImpl#getStandardOrders <em>Standard Orders</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.impl.OrderListImpl#getHardCopyOrderReference <em>Hard Copy Order Reference</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.impl.OrderListImpl#getHardCopyOrderNumber <em>Hard Copy Order Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrderListImpl extends EObjectImpl implements OrderList {
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
	 * The cached value of the '{@link #getOrders() <em>Orders</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrders()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap orders;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelgroupPackage.Literals.ORDER_LIST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelgroupPackage.ORDER_LIST__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getOrders() {
		if (orders == null) {
			orders = new BasicFeatureMap(this, ModelgroupPackage.ORDER_LIST__ORDERS);
		}
		return orders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PurchaseOrder> getPreferredOrders() {
		return getOrders().list(ModelgroupPackage.Literals.ORDER_LIST__PREFERRED_ORDERS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PurchaseOrder> getStandardOrders() {
		return getOrders().list(ModelgroupPackage.Literals.ORDER_LIST__STANDARD_ORDERS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getHardCopyOrderReference() {
		return getOrders().list(ModelgroupPackage.Literals.ORDER_LIST__HARD_COPY_ORDER_REFERENCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Long> getHardCopyOrderNumber() {
		return getOrders().list(ModelgroupPackage.Literals.ORDER_LIST__HARD_COPY_ORDER_NUMBER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelgroupPackage.ORDER_LIST__ORDERS:
				return ((InternalEList<?>)getOrders()).basicRemove(otherEnd, msgs);
			case ModelgroupPackage.ORDER_LIST__PREFERRED_ORDERS:
				return ((InternalEList<?>)getPreferredOrders()).basicRemove(otherEnd, msgs);
			case ModelgroupPackage.ORDER_LIST__STANDARD_ORDERS:
				return ((InternalEList<?>)getStandardOrders()).basicRemove(otherEnd, msgs);
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
			case ModelgroupPackage.ORDER_LIST__NAME:
				return getName();
			case ModelgroupPackage.ORDER_LIST__ORDERS:
				if (coreType) return getOrders();
				return ((FeatureMap.Internal)getOrders()).getWrapper();
			case ModelgroupPackage.ORDER_LIST__PREFERRED_ORDERS:
				return getPreferredOrders();
			case ModelgroupPackage.ORDER_LIST__STANDARD_ORDERS:
				return getStandardOrders();
			case ModelgroupPackage.ORDER_LIST__HARD_COPY_ORDER_REFERENCE:
				return getHardCopyOrderReference();
			case ModelgroupPackage.ORDER_LIST__HARD_COPY_ORDER_NUMBER:
				return getHardCopyOrderNumber();
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
			case ModelgroupPackage.ORDER_LIST__NAME:
				setName((String)newValue);
				return;
			case ModelgroupPackage.ORDER_LIST__ORDERS:
				((FeatureMap.Internal)getOrders()).set(newValue);
				return;
			case ModelgroupPackage.ORDER_LIST__PREFERRED_ORDERS:
				getPreferredOrders().clear();
				getPreferredOrders().addAll((Collection<? extends PurchaseOrder>)newValue);
				return;
			case ModelgroupPackage.ORDER_LIST__STANDARD_ORDERS:
				getStandardOrders().clear();
				getStandardOrders().addAll((Collection<? extends PurchaseOrder>)newValue);
				return;
			case ModelgroupPackage.ORDER_LIST__HARD_COPY_ORDER_REFERENCE:
				getHardCopyOrderReference().clear();
				getHardCopyOrderReference().addAll((Collection<? extends String>)newValue);
				return;
			case ModelgroupPackage.ORDER_LIST__HARD_COPY_ORDER_NUMBER:
				getHardCopyOrderNumber().clear();
				getHardCopyOrderNumber().addAll((Collection<? extends Long>)newValue);
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
			case ModelgroupPackage.ORDER_LIST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelgroupPackage.ORDER_LIST__ORDERS:
				getOrders().clear();
				return;
			case ModelgroupPackage.ORDER_LIST__PREFERRED_ORDERS:
				getPreferredOrders().clear();
				return;
			case ModelgroupPackage.ORDER_LIST__STANDARD_ORDERS:
				getStandardOrders().clear();
				return;
			case ModelgroupPackage.ORDER_LIST__HARD_COPY_ORDER_REFERENCE:
				getHardCopyOrderReference().clear();
				return;
			case ModelgroupPackage.ORDER_LIST__HARD_COPY_ORDER_NUMBER:
				getHardCopyOrderNumber().clear();
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
			case ModelgroupPackage.ORDER_LIST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelgroupPackage.ORDER_LIST__ORDERS:
				return orders != null && !orders.isEmpty();
			case ModelgroupPackage.ORDER_LIST__PREFERRED_ORDERS:
				return !getPreferredOrders().isEmpty();
			case ModelgroupPackage.ORDER_LIST__STANDARD_ORDERS:
				return !getStandardOrders().isEmpty();
			case ModelgroupPackage.ORDER_LIST__HARD_COPY_ORDER_REFERENCE:
				return !getHardCopyOrderReference().isEmpty();
			case ModelgroupPackage.ORDER_LIST__HARD_COPY_ORDER_NUMBER:
				return !getHardCopyOrderNumber().isEmpty();
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
		result.append(", orders: ");
		result.append(orders);
		result.append(')');
		return result.toString();
	}

} //OrderListImpl
