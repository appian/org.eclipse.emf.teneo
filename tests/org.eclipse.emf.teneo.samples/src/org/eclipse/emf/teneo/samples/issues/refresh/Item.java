/**
 * <copyright>
 * </copyright>
 *
 * $Id: Item.java,v 1.1 2006/07/11 16:57:04 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.refresh;

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
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.refresh.Item#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.refresh.Item#getLineOne <em>Line One</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.refresh.Item#getLineTwo <em>Line Two</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.refresh.RefreshPackage#getItem()
 * @model extendedMetaData="name='Item' kind='elementOnly'"
 * @generated
 */
public interface Item extends EObject{
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
	 * @see org.eclipse.emf.teneo.samples.issues.refresh.RefreshPackage#getItem_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.refresh.Item#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Line One</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.issues.refresh.LineOne}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line One</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line One</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.issues.refresh.RefreshPackage#getItem_LineOne()
	 * @model type="org.eclipse.emf.teneo.samples.issues.refresh.LineOne" containment="true" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='lineOne'"
	 * @generated
	 */
	EList getLineOne();

	/**
	 * Returns the value of the '<em><b>Line Two</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.issues.refresh.LineTwo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Two</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Two</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.issues.refresh.RefreshPackage#getItem_LineTwo()
	 * @model type="org.eclipse.emf.teneo.samples.issues.refresh.LineTwo" containment="true" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='lineTwo'"
	 * @generated
	 */
	EList getLineTwo();

} // Item
