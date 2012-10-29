/**
 * <copyright>
 * </copyright>
 *
 * $Id: CarFactory.java,v 1.1 2007/08/10 20:17:31 mtaal Exp $
 */
package com.example.car;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each
 * non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see com.example.car.CarPackage
 * @generated
 */
public interface CarFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	CarFactory eINSTANCE = com.example.car.impl.CarFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Frame</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Frame</em>'.
	 * @generated
	 */
	CarFrame createCarFrame();

	/**
	 * Returns a new object of class '<em>Link</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	CarLink createCarLink();

	/**
	 * Returns a new object of class '<em>Cars List</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return a new object of class '<em>Cars List</em>'.
	 * @generated
	 */
	CarsList createCarsList();

	/**
	 * Returns a new object of class '<em>Tire</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Tire</em>'.
	 * @generated
	 */
	CarTire createCarTire();

	/**
	 * Returns a new object of class '<em>Type</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	CarType createCarType();

	/**
	 * Returns a new object of class '<em>Wheel</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Wheel</em>'.
	 * @generated
	 */
	CarWheel createCarWheel();

	/**
	 * Returns a new object of class '<em>Document Root</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	CarPackage getCarPackage();

} // CarFactory
