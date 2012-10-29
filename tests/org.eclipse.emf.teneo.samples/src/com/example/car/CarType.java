/**
 * <copyright>
 * </copyright>
 *
 * $Id: CarType.java,v 1.1 2007/08/10 20:17:31 mtaal Exp $
 */
package com.example.car;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Type</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.example.car.CarType#getCarFrame <em>Car Frame</em>}</li>
 * <li>{@link com.example.car.CarType#getCarID <em>Car ID</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.example.car.CarPackage#getCarType()
 * @model extendedMetaData="name='CarType' kind='elementOnly'"
 * @generated
 */
public interface CarType extends EObject {
	/**
	 * Returns the value of the '<em><b>Car Frame</b></em>' containment reference list. The list
	 * contents are of type {@link com.example.car.CarFrame}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Car Frame</em>' containment reference list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Car Frame</em>' containment reference list.
	 * @see com.example.car.CarPackage#getCarType_CarFrame()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='carFrame' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CarFrame> getCarFrame();

	/**
	 * Returns the value of the '<em><b>Car ID</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Car ID</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Car ID</em>' attribute.
	 * @see #setCarID(String)
	 * @see com.example.car.CarPackage#getCarType_CarID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='carID'"
	 * @generated
	 */
	String getCarID();

	/**
	 * Sets the value of the '{@link com.example.car.CarType#getCarID <em>Car ID</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Car ID</em>' attribute.
	 * @see #getCarID()
	 * @generated
	 */
	void setCarID(String value);

} // CarType
