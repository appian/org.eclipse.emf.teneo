/**
 * <copyright>
 * </copyright>
 *
 * $Id: Item.java,v 1.2 2006/09/29 12:30:05 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.duplicates;

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
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.duplicates.Item#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.duplicates.Item#getChildItem <em>Child Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.duplicates.DuplicatesPackage#getItem()
 * @model extendedMetaData="name='Item' kind='elementOnly'"
 * @generated
 */
public interface Item extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.duplicates.DuplicatesPackage#getItem_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.duplicates.Item#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Child Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.annotations.duplicates.ChildItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Item</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.duplicates.DuplicatesPackage#getItem_ChildItem()
	 * @model type="org.eclipse.emf.teneo.samples.emf.annotations.duplicates.ChildItem" containment="true" required="true"
	 *        annotation="teneo.jpa appinfo='@OneToMany(unique=true)'"
	 *        extendedMetaData="kind='element' name='childItem'"
	 * @generated
	 */
	EList getChildItem();

} // Item
