/**
 * <copyright>
 * </copyright>
 *
 * $Id: CarFrame.java,v 1.1 2007/08/10 20:17:31 mtaal Exp $
 */
package com.example.car;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frame</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.car.CarFrame#getCarWheel <em>Car Wheel</em>}</li>
 *   <li>{@link com.example.car.CarFrame#getCarLinkRef <em>Car Link Ref</em>}</li>
 *   <li>{@link com.example.car.CarFrame#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.car.CarPackage#getCarFrame()
 * @model extendedMetaData="name='CarFrame' kind='elementOnly'"
 * @generated
 */
public interface CarFrame extends EObject {
	/**
	 * Returns the value of the '<em><b>Car Wheel</b></em>' containment reference list.
	 * The list contents are of type {@link com.example.car.CarWheel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Car Wheel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Car Wheel</em>' containment reference list.
	 * @see com.example.car.CarPackage#getCarFrame_CarWheel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='carWheel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CarWheel> getCarWheel();

	/**
	 * Returns the value of the '<em><b>Car Link Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Car Link Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Car Link Ref</em>' reference.
	 * @see #setCarLinkRef(CarLink)
	 * @see com.example.car.CarPackage#getCarFrame_CarLinkRef()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='carLinkRef'"
	 * @generated
	 */
	CarLink getCarLinkRef();

	/**
	 * Sets the value of the '{@link com.example.car.CarFrame#getCarLinkRef <em>Car Link Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Car Link Ref</em>' reference.
	 * @see #getCarLinkRef()
	 * @generated
	 */
	void setCarLinkRef(CarLink value);

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
	 * @see com.example.car.CarPackage#getCarFrame_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.example.car.CarFrame#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CarFrame
