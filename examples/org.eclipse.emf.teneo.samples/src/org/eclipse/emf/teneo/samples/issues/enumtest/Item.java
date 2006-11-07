/**
 * <copyright>
 * </copyright>
 *
 * $Id: Item.java,v 1.2 2006/11/07 10:22:29 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.enumtest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.enumtest.Item#getItemType <em>Item Type</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.enumtest.Item#getNullableItemType <em>Nullable Item Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.enumtest.EnumtestPackage#getItem()
 * @model extendedMetaData="name='Item' kind='elementOnly'"
 * @generated
 */
public interface Item extends EObject {
	/**
	 * Returns the value of the '<em><b>Item Type</b></em>' attribute.
	 * The default value is <code>"Product"</code>.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.samples.issues.enumtest.ItemType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Type</em>' attribute.
	 * @see org.eclipse.emf.teneo.samples.issues.enumtest.ItemType
	 * @see #isSetItemType()
	 * @see #unsetItemType()
	 * @see #setItemType(ItemType)
	 * @see org.eclipse.emf.teneo.samples.issues.enumtest.EnumtestPackage#getItem_ItemType()
	 * @model default="Product" unique="false" unsettable="true" required="true"
	 *        annotation="teneo.jpa appinfo='@Id'"
	 *        extendedMetaData="kind='element' name='itemType'"
	 * @generated
	 */
	ItemType getItemType();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.enumtest.Item#getItemType <em>Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Type</em>' attribute.
	 * @see org.eclipse.emf.teneo.samples.issues.enumtest.ItemType
	 * @see #isSetItemType()
	 * @see #unsetItemType()
	 * @see #getItemType()
	 * @generated
	 */
	void setItemType(ItemType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.issues.enumtest.Item#getItemType <em>Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetItemType()
	 * @see #getItemType()
	 * @see #setItemType(ItemType)
	 * @generated
	 */
	void unsetItemType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.issues.enumtest.Item#getItemType <em>Item Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Item Type</em>' attribute is set.
	 * @see #unsetItemType()
	 * @see #getItemType()
	 * @see #setItemType(ItemType)
	 * @generated
	 */
	boolean isSetItemType();

	/**
	 * Returns the value of the '<em><b>Nullable Item Type</b></em>' attribute.
	 * The default value is <code>"Product"</code>.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.samples.issues.enumtest.ItemType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nullable Item Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nullable Item Type</em>' attribute.
	 * @see org.eclipse.emf.teneo.samples.issues.enumtest.ItemType
	 * @see #isSetNullableItemType()
	 * @see #unsetNullableItemType()
	 * @see #setNullableItemType(ItemType)
	 * @see org.eclipse.emf.teneo.samples.issues.enumtest.EnumtestPackage#getItem_NullableItemType()
	 * @model default="Product" unique="false" unsettable="true"
	 *        extendedMetaData="kind='element' name='nullableItemType'"
	 * @generated
	 */
	ItemType getNullableItemType();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.enumtest.Item#getNullableItemType <em>Nullable Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nullable Item Type</em>' attribute.
	 * @see org.eclipse.emf.teneo.samples.issues.enumtest.ItemType
	 * @see #isSetNullableItemType()
	 * @see #unsetNullableItemType()
	 * @see #getNullableItemType()
	 * @generated
	 */
	void setNullableItemType(ItemType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.issues.enumtest.Item#getNullableItemType <em>Nullable Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNullableItemType()
	 * @see #getNullableItemType()
	 * @see #setNullableItemType(ItemType)
	 * @generated
	 */
	void unsetNullableItemType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.issues.enumtest.Item#getNullableItemType <em>Nullable Item Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nullable Item Type</em>' attribute is set.
	 * @see #unsetNullableItemType()
	 * @see #getNullableItemType()
	 * @see #setNullableItemType(ItemType)
	 * @generated
	 */
	boolean isSetNullableItemType();

} // Item
