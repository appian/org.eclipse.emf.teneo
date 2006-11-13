/**
 * <copyright>
 * </copyright>
 *
 * $Id: Item.java,v 1.2 2006/11/13 19:55:48 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.mtmsame;

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
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.mtmsame.Item#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.mtmsame.Item#getMySide <em>My Side</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.mtmsame.Item#getYourSide <em>Your Side</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.mtmsame.MtmsamePackage#getItem()
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
	 * @see org.eclipse.emf.teneo.samples.issues.mtmsame.MtmsamePackage#getItem_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.mtmsame.Item#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>My Side</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.issues.mtmsame.Item}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.issues.mtmsame.Item#getYourSide <em>Your Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Side</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Side</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.issues.mtmsame.MtmsamePackage#getItem_MySide()
	 * @see org.eclipse.emf.teneo.samples.issues.mtmsame.Item#getYourSide
	 * @model type="org.eclipse.emf.teneo.samples.issues.mtmsame.Item" opposite="yourSide"
	 *        annotation="teneo.jpa appinfo='@ManyToMany(Indexed=false)'"
	 * @generated
	 */
	EList getMySide();

	/**
	 * Returns the value of the '<em><b>Your Side</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.issues.mtmsame.Item}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.issues.mtmsame.Item#getMySide <em>My Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Your Side</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Your Side</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.issues.mtmsame.MtmsamePackage#getItem_YourSide()
	 * @see org.eclipse.emf.teneo.samples.issues.mtmsame.Item#getMySide
	 * @model type="org.eclipse.emf.teneo.samples.issues.mtmsame.Item" opposite="mySide"
	 *        annotation="teneo.jpa appinfo='@ManyToMany(Indexed=false)'"
	 * @generated
	 */
	EList getYourSide();

} // Item