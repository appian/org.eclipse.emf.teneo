/**
 * <copyright>
 * </copyright>
 *
 * $Id: ItemList.java,v 1.5 2007/02/08 23:09:24 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.set.ItemList#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.set.ItemList#getContainedItem <em>Contained Item</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.set.ItemList#getItem <em>Item</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.set.ItemList#getJoinedItem <em>Joined Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.set.SetPackage#getItemList()
 * @model extendedMetaData="name='ItemList' kind='elementOnly'"
 * @generated
 */
public interface ItemList extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "";

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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.set.SetPackage#getItemList_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.set.ItemList#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Contained Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.annotations.set.ContainedItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Item</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.set.SetPackage#getItemList_ContainedItem()
	 * @model type="org.eclipse.emf.teneo.samples.emf.annotations.set.ContainedItem" containment="true" required="true"
	 *        annotation="teneo.jpa appinfo='@OneToMany(indexed=false)'"
	 *        extendedMetaData="kind='element' name='containedItem'"
	 * @generated
	 */
	EList<ContainedItem> getContainedItem();

	/**
	 * Returns the value of the '<em><b>Item</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.annotations.set.Item}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.annotations.set.Item#getItemList <em>Item List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.set.SetPackage#getItemList_Item()
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.set.Item#getItemList
	 * @model type="org.eclipse.emf.teneo.samples.emf.annotations.set.Item" opposite="itemList" required="true"
	 *        annotation="teneo.jpa appinfo='@OneToMany(indexed=false) @OrderBy(\"name desc\")'"
	 *        extendedMetaData="kind='element' name='item'"
	 * @generated
	 */
	EList<Item> getItem();

	/**
	 * Returns the value of the '<em><b>Joined Item</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.annotations.set.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Joined Item</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joined Item</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.set.SetPackage#getItemList_JoinedItem()
	 * @model type="org.eclipse.emf.teneo.samples.emf.annotations.set.Item" required="true"
	 *        annotation="teneo.jpa appinfo='@OneToMany(indexed=false unique=false)'"
	 *        extendedMetaData="kind='element' name='joinedItem'"
	 * @generated
	 */
	EList<Item> getJoinedItem();

} // ItemList
