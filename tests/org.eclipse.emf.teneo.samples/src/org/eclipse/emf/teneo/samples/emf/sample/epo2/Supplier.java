/**
 * <copyright>
 * </copyright>
 *
 * $Id: Supplier.java,v 1.3 2007/02/08 23:09:20 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.epo2;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supplier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.Supplier#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.Supplier#getCustomers <em>Customers</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.Supplier#getOrders <em>Orders</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.Supplier#getPendingOrders <em>Pending Orders</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.Supplier#getShippedOrders <em>Shipped Orders</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.EPO2Package#getSupplier()
 * @model
 * @generated
 */
public interface Supplier extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.EPO2Package#getSupplier_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.Supplier#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Customers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.epo2.Customer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customers</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.EPO2Package#getSupplier_Customers()
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.epo2.Customer" containment="true"
	 * @generated
	 */
	EList<Customer> getCustomers();

	/**
	 * Returns the value of the '<em><b>Orders</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.epo2.PurchaseOrder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orders</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.EPO2Package#getSupplier_Orders()
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.epo2.PurchaseOrder" containment="true"
	 * @generated
	 */
	EList<PurchaseOrder> getOrders();

	/**
	 * Returns the value of the '<em><b>Pending Orders</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.epo2.PurchaseOrder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pending Orders</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pending Orders</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.EPO2Package#getSupplier_PendingOrders()
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.epo2.PurchaseOrder" resolveProxies="false" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	EList<PurchaseOrder> getPendingOrders();

	/**
	 * Returns the value of the '<em><b>Shipped Orders</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.epo2.PurchaseOrder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipped Orders</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipped Orders</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.EPO2Package#getSupplier_ShippedOrders()
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.epo2.PurchaseOrder" resolveProxies="false" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	EList<PurchaseOrder> getShippedOrders();

} // Supplier
