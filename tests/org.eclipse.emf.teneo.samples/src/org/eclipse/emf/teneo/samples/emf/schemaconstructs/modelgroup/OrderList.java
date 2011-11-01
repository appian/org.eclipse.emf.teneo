/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrderList.java,v 1.1 2010/03/25 00:29:09 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.OrderList#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.OrderList#getOrders <em>Orders</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.OrderList#getPreferredOrders <em>Preferred Orders</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.OrderList#getStandardOrders <em>Standard Orders</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.OrderList#getHardCopyOrderReference <em>Hard Copy Order Reference</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.OrderList#getHardCopyOrderNumber <em>Hard Copy Order Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.ModelgroupPackage#getOrderList()
 * @model extendedMetaData="name='OrderList' kind='elementOnly'"
 * @generated
 */
public interface OrderList extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.ModelgroupPackage#getOrderList_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.OrderList#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Orders</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orders</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orders</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.ModelgroupPackage#getOrderList_Orders()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='orders:1'"
	 * @generated
	 */
	FeatureMap getOrders();

	/**
	 * Returns the value of the '<em><b>Preferred Orders</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.PurchaseOrder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preferred Orders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred Orders</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.ModelgroupPackage#getOrderList_PreferredOrders()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='preferredOrders' group='#orders:1'"
	 * @generated
	 */
	EList<PurchaseOrder> getPreferredOrders();

	/**
	 * Returns the value of the '<em><b>Standard Orders</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.PurchaseOrder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Orders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Orders</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.ModelgroupPackage#getOrderList_StandardOrders()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='standardOrders' group='#orders:1'"
	 * @generated
	 */
	EList<PurchaseOrder> getStandardOrders();

	/**
	 * Returns the value of the '<em><b>Hard Copy Order Reference</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hard Copy Order Reference</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hard Copy Order Reference</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.ModelgroupPackage#getOrderList_HardCopyOrderReference()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hardCopyOrderReference' group='#orders:1'"
	 * @generated
	 */
	EList<String> getHardCopyOrderReference();

	/**
	 * Returns the value of the '<em><b>Hard Copy Order Number</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hard Copy Order Number</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hard Copy Order Number</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.ModelgroupPackage#getOrderList_HardCopyOrderNumber()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Long" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hardCopyOrderNumber' group='#orders:1'"
	 * @generated
	 */
	EList<Long> getHardCopyOrderNumber();

} // OrderList
