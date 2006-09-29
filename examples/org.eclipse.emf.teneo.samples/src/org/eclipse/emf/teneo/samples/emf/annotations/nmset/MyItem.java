/**
 * <copyright>
 * </copyright>
 *
 * $Id: MyItem.java,v 1.2 2006/09/29 12:30:05 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.nmset;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>My Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.nmset.MyItem#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.nmset.MyItem#getYourItem <em>Your Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.nmset.NmsetPackage#getMyItem()
 * @model extendedMetaData="name='MyItem' kind='elementOnly'"
 * @generated
 */
public interface MyItem extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.nmset.NmsetPackage#getMyItem_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.nmset.MyItem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Your Item</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.annotations.nmset.YourItem}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.annotations.nmset.YourItem#getMyItem <em>My Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Your Item</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Your Item</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.nmset.NmsetPackage#getMyItem_YourItem()
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.nmset.YourItem#getMyItem
	 * @model type="org.eclipse.emf.teneo.samples.emf.annotations.nmset.YourItem" opposite="myItem" required="true"
	 *        annotation="teneo.jpa appinfo='@ManyToMany(Indexed=false)'"
	 *        extendedMetaData="kind='element' name='yourItem'"
	 * @generated
	 */
	EList getYourItem();

} // MyItem
