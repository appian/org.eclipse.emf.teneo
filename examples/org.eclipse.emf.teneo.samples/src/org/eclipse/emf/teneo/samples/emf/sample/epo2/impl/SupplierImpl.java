/**
 * <copyright>
 * </copyright>
 *
 * $Id: SupplierImpl.java,v 1.3 2007/02/08 23:09:21 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.epo2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.teneo.samples.emf.sample.epo2.Customer;
import org.eclipse.emf.teneo.samples.emf.sample.epo2.EPO2Package;
import org.eclipse.emf.teneo.samples.emf.sample.epo2.PurchaseOrder;
import org.eclipse.emf.teneo.samples.emf.sample.epo2.Supplier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supplier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.SupplierImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.SupplierImpl#getCustomers <em>Customers</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.SupplierImpl#getOrders <em>Orders</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.SupplierImpl#getPendingOrders <em>Pending Orders</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.SupplierImpl#getShippedOrders <em>Shipped Orders</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SupplierImpl extends EObjectImpl implements Supplier {
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
	 * The cached value of the '{@link #getCustomers() <em>Customers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomers()
	 * @generated
	 * @ordered
	 */
	protected EList<Customer> customers = null;

	/**
	 * The cached value of the '{@link #getOrders() <em>Orders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrders()
	 * @generated
	 * @ordered
	 */
	protected EList<PurchaseOrder> orders = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EPO2Package.Literals.SUPPLIER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EPO2Package.SUPPLIER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Customer> getCustomers() {
		if (customers == null) {
			customers = new EObjectContainmentEList<Customer>(Customer.class, this, EPO2Package.SUPPLIER__CUSTOMERS);
		}
		return customers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PurchaseOrder> getOrders() {
		if (orders == null) {
			orders = new EObjectContainmentEList<PurchaseOrder>(PurchaseOrder.class, this, EPO2Package.SUPPLIER__ORDERS);
		}
		return orders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PurchaseOrder> getPendingOrders() {
		// TODO: implement this method to return the 'Pending Orders' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PurchaseOrder> getShippedOrders() {
		// TODO: implement this method to return the 'Shipped Orders' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EPO2Package.SUPPLIER__CUSTOMERS:
				return ((InternalEList<?>)getCustomers()).basicRemove(otherEnd, msgs);
			case EPO2Package.SUPPLIER__ORDERS:
				return ((InternalEList<?>)getOrders()).basicRemove(otherEnd, msgs);
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
			case EPO2Package.SUPPLIER__NAME:
				return getName();
			case EPO2Package.SUPPLIER__CUSTOMERS:
				return getCustomers();
			case EPO2Package.SUPPLIER__ORDERS:
				return getOrders();
			case EPO2Package.SUPPLIER__PENDING_ORDERS:
				return getPendingOrders();
			case EPO2Package.SUPPLIER__SHIPPED_ORDERS:
				return getShippedOrders();
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
			case EPO2Package.SUPPLIER__NAME:
				setName((String)newValue);
				return;
			case EPO2Package.SUPPLIER__CUSTOMERS:
				getCustomers().clear();
				getCustomers().addAll((Collection<? extends Customer>)newValue);
				return;
			case EPO2Package.SUPPLIER__ORDERS:
				getOrders().clear();
				getOrders().addAll((Collection<? extends PurchaseOrder>)newValue);
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
			case EPO2Package.SUPPLIER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EPO2Package.SUPPLIER__CUSTOMERS:
				getCustomers().clear();
				return;
			case EPO2Package.SUPPLIER__ORDERS:
				getOrders().clear();
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
			case EPO2Package.SUPPLIER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EPO2Package.SUPPLIER__CUSTOMERS:
				return customers != null && !customers.isEmpty();
			case EPO2Package.SUPPLIER__ORDERS:
				return orders != null && !orders.isEmpty();
			case EPO2Package.SUPPLIER__PENDING_ORDERS:
				return !getPendingOrders().isEmpty();
			case EPO2Package.SUPPLIER__SHIPPED_ORDERS:
				return !getShippedOrders().isEmpty();
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

} //SupplierImpl
