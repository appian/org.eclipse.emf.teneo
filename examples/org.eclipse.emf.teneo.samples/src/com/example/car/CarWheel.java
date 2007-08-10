/**
 * <copyright>
 * </copyright>
 *
 * $Id: CarWheel.java,v 1.1 2007/08/10 20:17:31 mtaal Exp $
 */
package com.example.car;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wheel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.car.CarWheel#getCarTire <em>Car Tire</em>}</li>
 *   <li>{@link com.example.car.CarWheel#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.car.CarPackage#getCarWheel()
 * @model extendedMetaData="name='CarWheel' kind='elementOnly'"
 * @generated
 */
public interface CarWheel extends EObject {
	/**
	 * Returns the value of the '<em><b>Car Tire</b></em>' containment reference list.
	 * The list contents are of type {@link com.example.car.CarTire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Car Tire</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Car Tire</em>' containment reference list.
	 * @see com.example.car.CarPackage#getCarWheel_CarTire()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='carTire' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CarTire> getCarTire();

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
	 * @see com.example.car.CarPackage#getCarWheel_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.example.car.CarWheel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CarWheel
