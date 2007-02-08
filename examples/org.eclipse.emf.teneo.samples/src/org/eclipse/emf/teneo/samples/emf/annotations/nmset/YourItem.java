/**
 * <copyright>
 * </copyright>
 *
 * $Id: YourItem.java,v 1.3 2007/02/08 23:09:28 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.nmset;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Your Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.nmset.YourItem#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.nmset.YourItem#getMyItem <em>My Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.nmset.NmsetPackage#getYourItem()
 * @model extendedMetaData="name='YourItem' kind='elementOnly'"
 * @generated
 */
public interface YourItem extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.nmset.NmsetPackage#getYourItem_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.nmset.YourItem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>My Item</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.annotations.nmset.MyItem}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.annotations.nmset.MyItem#getYourItem <em>Your Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Item</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Item</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.nmset.NmsetPackage#getYourItem_MyItem()
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.nmset.MyItem#getYourItem
	 * @model type="org.eclipse.emf.teneo.samples.emf.annotations.nmset.MyItem" opposite="yourItem" required="true"
	 *        annotation="teneo.jpa appinfo='@ManyToMany(Indexed=false)'"
	 *        extendedMetaData="kind='element' name='myItem'"
	 * @generated
	 */
	EList<MyItem> getMyItem();

} // YourItem
