/**
 * <copyright>
 * </copyright>
 *
 * $Id: Customer.java,v 1.1 2006/07/11 16:56:56 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.epo2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.Customer#getCustomerID <em>Customer ID</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.Customer#getOrders <em>Orders</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.EPO2Package#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends EObject {
	/**
	 * Returns the value of the '<em><b>Customer ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer ID</em>' attribute.
	 * @see #setCustomerID(int)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.EPO2Package#getCustomer_CustomerID()
	 * @model
	 * @generated
	 */
	int getCustomerID();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.Customer#getCustomerID <em>Customer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer ID</em>' attribute.
	 * @see #getCustomerID()
	 * @generated
	 */
	void setCustomerID(int value);

	/**
	 * Returns the value of the '<em><b>Orders</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.epo2.PurchaseOrder}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.PurchaseOrder#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orders</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orders</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.EPO2Package#getCustomer_Orders()
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.PurchaseOrder#getCustomer
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.epo2.PurchaseOrder" opposite="customer" resolveProxies="false"
	 * @generated
	 */
	EList getOrders();

} // Customer
