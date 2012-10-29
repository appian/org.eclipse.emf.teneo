/**
 * <copyright>
 * </copyright>
 *
 * $Id: CarFactoryImpl.java,v 1.1 2007/08/10 20:17:32 mtaal Exp $
 */
package com.example.car.impl;

import com.example.car.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class CarFactoryImpl extends EFactoryImpl implements CarFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static CarFactory init() {
		try {
			CarFactory theCarFactory = (CarFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.example.com/car.xsd");
			if (theCarFactory != null) {
				return theCarFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CarFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CarFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CarPackage.CAR_FRAME:
			return createCarFrame();
		case CarPackage.CAR_LINK:
			return createCarLink();
		case CarPackage.CARS_LIST:
			return createCarsList();
		case CarPackage.CAR_TIRE:
			return createCarTire();
		case CarPackage.CAR_TYPE:
			return createCarType();
		case CarPackage.CAR_WHEEL:
			return createCarWheel();
		case CarPackage.DOCUMENT_ROOT:
			return createDocumentRoot();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CarFrame createCarFrame() {
		CarFrameImpl carFrame = new CarFrameImpl();
		return carFrame;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CarLink createCarLink() {
		CarLinkImpl carLink = new CarLinkImpl();
		return carLink;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CarsList createCarsList() {
		CarsListImpl carsList = new CarsListImpl();
		return carsList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CarTire createCarTire() {
		CarTireImpl carTire = new CarTireImpl();
		return carTire;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CarType createCarType() {
		CarTypeImpl carType = new CarTypeImpl();
		return carType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CarWheel createCarWheel() {
		CarWheelImpl carWheel = new CarWheelImpl();
		return carWheel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CarPackage getCarPackage() {
		return (CarPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CarPackage getPackage() {
		return CarPackage.eINSTANCE;
	}

} // CarFactoryImpl
