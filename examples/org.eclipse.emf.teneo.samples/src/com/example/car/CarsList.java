/**
 * <copyright>
 * </copyright>
 *
 * $Id: CarsList.java,v 1.1 2007/08/10 20:17:31 mtaal Exp $
 */
package com.example.car;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cars List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.car.CarsList#getCarType <em>Car Type</em>}</li>
 *   <li>{@link com.example.car.CarsList#getCarLink <em>Car Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.car.CarPackage#getCarsList()
 * @model extendedMetaData="name='CarsList' kind='elementOnly'"
 * @generated
 */
public interface CarsList extends EObject {
	/**
	 * Returns the value of the '<em><b>Car Type</b></em>' containment reference list.
	 * The list contents are of type {@link com.example.car.CarType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Car Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Car Type</em>' containment reference list.
	 * @see com.example.car.CarPackage#getCarsList_CarType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='carType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CarType> getCarType();

	/**
	 * Returns the value of the '<em><b>Car Link</b></em>' containment reference list.
	 * The list contents are of type {@link com.example.car.CarLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Car Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Car Link</em>' containment reference list.
	 * @see com.example.car.CarPackage#getCarsList_CarLink()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='carLink' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CarLink> getCarLink();

} // CarsList
