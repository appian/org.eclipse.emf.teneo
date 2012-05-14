/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.Item#getNames <em>Names</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.Item#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.CollectiontablePackage#getItem()
 * @model
 * @generated
 */
public interface Item extends EObject {
	/**
	 * Returns the value of the '<em><b>Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Names</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.CollectiontablePackage#getItem_Names()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        annotation="teneo.jpa value='@CollectionTable(name=\"NamesTable\" joinColumns={@JoinColumn(name=\"joinColumn1\")})\n'"
	 * @generated
	 */
	EList<String> getNames();

	/**
	 * Returns the value of the '<em><b>Items</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.EmbeddedItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.CollectiontablePackage#getItem_Items()
	 * @model annotation="teneo.jpa value='@Embedded\n@CollectionTable(name=\"EmbeddedItemsTable\" joinColumns={@JoinColumn(name=\"MYJC\")})\n'"
	 * @generated
	 */
	EList<EmbeddedItem> getItems();

} // Item
