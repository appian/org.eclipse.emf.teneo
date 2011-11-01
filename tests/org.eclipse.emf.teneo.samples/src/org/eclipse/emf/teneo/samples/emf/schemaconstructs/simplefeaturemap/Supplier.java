/**
 * <copyright>
 * </copyright>
 *
 * $Id: Supplier.java,v 1.1 2006/07/11 16:57:17 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supplier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.Supplier#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.Supplier#getOrders <em>Orders</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.Supplier#getPreferredOrders <em>Preferred Orders</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.Supplier#getStandardOrders <em>Standard Orders</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.Supplier#getHardCopyOrderReference <em>Hard Copy Order Reference</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.Supplier#getHardCopyOrderNumber <em>Hard Copy Order Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.SimplefeaturemapPackage#getSupplier()
 * @model extendedMetaData="name='Supplier' kind='elementOnly'"
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
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.SimplefeaturemapPackage#getSupplier_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.Supplier#getName <em>Name</em>}' attribute.
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
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.SimplefeaturemapPackage#getSupplier_Orders()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='orders:1'"
	 * @generated
	 */
	FeatureMap getOrders();

	/**
	 * Returns the value of the '<em><b>Preferred Orders</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.PurchaseOrder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preferred Orders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred Orders</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.SimplefeaturemapPackage#getSupplier_PreferredOrders()
	 * @model type="org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.PurchaseOrder" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='preferredOrders' group='#orders:1'"
	 * @generated
	 */
	EList getPreferredOrders();

	/**
	 * Returns the value of the '<em><b>Standard Orders</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.PurchaseOrder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Orders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Orders</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.SimplefeaturemapPackage#getSupplier_StandardOrders()
	 * @model type="org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.PurchaseOrder" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='standardOrders' group='#orders:1'"
	 * @generated
	 */
	EList getStandardOrders();

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
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.SimplefeaturemapPackage#getSupplier_HardCopyOrderReference()
	 * @model type="java.lang.String" unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hardCopyOrderReference' group='#orders:1'"
	 * @generated
	 */
	EList getHardCopyOrderReference();

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
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.SimplefeaturemapPackage#getSupplier_HardCopyOrderNumber()
	 * @model type="long" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Long" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hardCopyOrderNumber' group='#orders:1'"
	 * @generated
	 */
	EList getHardCopyOrderNumber();

} // Supplier
