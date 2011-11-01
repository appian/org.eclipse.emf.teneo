/**
 * <copyright>
 * </copyright>
 *
 * $Id: CarLink.java,v 1.1 2007/08/10 20:17:31 mtaal Exp $
 */
package com.example.car;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.car.CarLink#getCarLinkId <em>Car Link Id</em>}</li>
 *   <li>{@link com.example.car.CarLink#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.car.CarPackage#getCarLink()
 * @model extendedMetaData="name='CarLink' kind='empty'"
 * @generated
 */
public interface CarLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Car Link Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Car Link Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Car Link Id</em>' attribute.
	 * @see #setCarLinkId(String)
	 * @see com.example.car.CarPackage#getCarLink_CarLinkId()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='carLinkId'"
	 * @generated
	 */
	String getCarLinkId();

	/**
	 * Sets the value of the '{@link com.example.car.CarLink#getCarLinkId <em>Car Link Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Car Link Id</em>' attribute.
	 * @see #getCarLinkId()
	 * @generated
	 */
	void setCarLinkId(String value);

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
	 * @see com.example.car.CarPackage#getCarLink_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.example.car.CarLink#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CarLink
