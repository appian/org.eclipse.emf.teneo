/**
 * <copyright>
 * </copyright>
 *
 * $Id: CarPackage.java,v 1.1 2007/08/10 20:17:31 mtaal Exp $
 */
package com.example.car;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta
 * objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see com.example.car.CarFactory
 * @model kind="package" annotation="http://www.w3.org/XML/1998/namespace lang='en'"
 * @generated
 */
public interface CarPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "car";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://www.example.com/car.xsd";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "car";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	CarPackage eINSTANCE = com.example.car.impl.CarPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.example.car.impl.CarFrameImpl <em>Frame</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.example.car.impl.CarFrameImpl
	 * @see com.example.car.impl.CarPackageImpl#getCarFrame()
	 * @generated
	 */
	int CAR_FRAME = 0;

	/**
	 * The feature id for the '<em><b>Car Wheel</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAR_FRAME__CAR_WHEEL = 0;

	/**
	 * The feature id for the '<em><b>Car Link Ref</b></em>' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAR_FRAME__CAR_LINK_REF = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAR_FRAME__NAME = 2;

	/**
	 * The number of structural features of the '<em>Frame</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAR_FRAME_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.example.car.impl.CarLinkImpl <em>Link</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.example.car.impl.CarLinkImpl
	 * @see com.example.car.impl.CarPackageImpl#getCarLink()
	 * @generated
	 */
	int CAR_LINK = 1;

	/**
	 * The feature id for the '<em><b>Car Link Id</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAR_LINK__CAR_LINK_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAR_LINK__NAME = 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAR_LINK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.example.car.impl.CarsListImpl <em>Cars List</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.example.car.impl.CarsListImpl
	 * @see com.example.car.impl.CarPackageImpl#getCarsList()
	 * @generated
	 */
	int CARS_LIST = 2;

	/**
	 * The feature id for the '<em><b>Car Type</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CARS_LIST__CAR_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Car Link</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CARS_LIST__CAR_LINK = 1;

	/**
	 * The number of structural features of the '<em>Cars List</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CARS_LIST_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.example.car.impl.CarTireImpl <em>Tire</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.example.car.impl.CarTireImpl
	 * @see com.example.car.impl.CarPackageImpl#getCarTire()
	 * @generated
	 */
	int CAR_TIRE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAR_TIRE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Tire</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAR_TIRE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.example.car.impl.CarTypeImpl <em>Type</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.example.car.impl.CarTypeImpl
	 * @see com.example.car.impl.CarPackageImpl#getCarType()
	 * @generated
	 */
	int CAR_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Car Frame</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAR_TYPE__CAR_FRAME = 0;

	/**
	 * The feature id for the '<em><b>Car ID</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAR_TYPE__CAR_ID = 1;

	/**
	 * The number of structural features of the '<em>Type</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAR_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.example.car.impl.CarWheelImpl <em>Wheel</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.example.car.impl.CarWheelImpl
	 * @see com.example.car.impl.CarPackageImpl#getCarWheel()
	 * @generated
	 */
	int CAR_WHEEL = 5;

	/**
	 * The feature id for the '<em><b>Car Tire</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAR_WHEEL__CAR_TIRE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAR_WHEEL__NAME = 1;

	/**
	 * The number of structural features of the '<em>Wheel</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAR_WHEEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.example.car.impl.DocumentRootImpl
	 * <em>Document Root</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.example.car.impl.DocumentRootImpl
	 * @see com.example.car.impl.CarPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 6;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Cars List</b></em>' containment reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CARS_LIST = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * Returns the meta object for class '{@link com.example.car.CarFrame <em>Frame</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Frame</em>'.
	 * @see com.example.car.CarFrame
	 * @generated
	 */
	EClass getCarFrame();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link com.example.car.CarFrame#getCarWheel <em>Car Wheel</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Car Wheel</em>'.
	 * @see com.example.car.CarFrame#getCarWheel()
	 * @see #getCarFrame()
	 * @generated
	 */
	EReference getCarFrame_CarWheel();

	/**
	 * Returns the meta object for the reference '{@link com.example.car.CarFrame#getCarLinkRef
	 * <em>Car Link Ref</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Car Link Ref</em>'.
	 * @see com.example.car.CarFrame#getCarLinkRef()
	 * @see #getCarFrame()
	 * @generated
	 */
	EReference getCarFrame_CarLinkRef();

	/**
	 * Returns the meta object for the attribute '{@link com.example.car.CarFrame#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.example.car.CarFrame#getName()
	 * @see #getCarFrame()
	 * @generated
	 */
	EAttribute getCarFrame_Name();

	/**
	 * Returns the meta object for class '{@link com.example.car.CarLink <em>Link</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Link</em>'.
	 * @see com.example.car.CarLink
	 * @generated
	 */
	EClass getCarLink();

	/**
	 * Returns the meta object for the attribute '{@link com.example.car.CarLink#getCarLinkId
	 * <em>Car Link Id</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Car Link Id</em>'.
	 * @see com.example.car.CarLink#getCarLinkId()
	 * @see #getCarLink()
	 * @generated
	 */
	EAttribute getCarLink_CarLinkId();

	/**
	 * Returns the meta object for the attribute '{@link com.example.car.CarLink#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.example.car.CarLink#getName()
	 * @see #getCarLink()
	 * @generated
	 */
	EAttribute getCarLink_Name();

	/**
	 * Returns the meta object for class '{@link com.example.car.CarsList <em>Cars List</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Cars List</em>'.
	 * @see com.example.car.CarsList
	 * @generated
	 */
	EClass getCarsList();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link com.example.car.CarsList#getCarType <em>Car Type</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Car Type</em>'.
	 * @see com.example.car.CarsList#getCarType()
	 * @see #getCarsList()
	 * @generated
	 */
	EReference getCarsList_CarType();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link com.example.car.CarsList#getCarLink <em>Car Link</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Car Link</em>'.
	 * @see com.example.car.CarsList#getCarLink()
	 * @see #getCarsList()
	 * @generated
	 */
	EReference getCarsList_CarLink();

	/**
	 * Returns the meta object for class '{@link com.example.car.CarTire <em>Tire</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Tire</em>'.
	 * @see com.example.car.CarTire
	 * @generated
	 */
	EClass getCarTire();

	/**
	 * Returns the meta object for the attribute '{@link com.example.car.CarTire#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.example.car.CarTire#getName()
	 * @see #getCarTire()
	 * @generated
	 */
	EAttribute getCarTire_Name();

	/**
	 * Returns the meta object for class '{@link com.example.car.CarType <em>Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Type</em>'.
	 * @see com.example.car.CarType
	 * @generated
	 */
	EClass getCarType();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link com.example.car.CarType#getCarFrame <em>Car Frame</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Car Frame</em>'.
	 * @see com.example.car.CarType#getCarFrame()
	 * @see #getCarType()
	 * @generated
	 */
	EReference getCarType_CarFrame();

	/**
	 * Returns the meta object for the attribute '{@link com.example.car.CarType#getCarID
	 * <em>Car ID</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Car ID</em>'.
	 * @see com.example.car.CarType#getCarID()
	 * @see #getCarType()
	 * @generated
	 */
	EAttribute getCarType_CarID();

	/**
	 * Returns the meta object for class '{@link com.example.car.CarWheel <em>Wheel</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Wheel</em>'.
	 * @see com.example.car.CarWheel
	 * @generated
	 */
	EClass getCarWheel();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link com.example.car.CarWheel#getCarTire <em>Car Tire</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Car Tire</em>'.
	 * @see com.example.car.CarWheel#getCarTire()
	 * @see #getCarWheel()
	 * @generated
	 */
	EReference getCarWheel_CarTire();

	/**
	 * Returns the meta object for the attribute '{@link com.example.car.CarWheel#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.example.car.CarWheel#getName()
	 * @see #getCarWheel()
	 * @generated
	 */
	EAttribute getCarWheel_Name();

	/**
	 * Returns the meta object for class '{@link com.example.car.DocumentRoot <em>Document Root</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see com.example.car.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link com.example.car.DocumentRoot#getMixed
	 * <em>Mixed</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see com.example.car.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link com.example.car.DocumentRoot#getXMLNSPrefixMap
	 * <em>XMLNS Prefix Map</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see com.example.car.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link com.example.car.DocumentRoot#getXSISchemaLocation
	 * <em>XSI Schema Location</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see com.example.car.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link com.example.car.DocumentRoot#getCarsList <em>Cars List</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Cars List</em>'.
	 * @see com.example.car.DocumentRoot#getCarsList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CarsList();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CarFactory getCarFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.example.car.impl.CarFrameImpl <em>Frame</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.example.car.impl.CarFrameImpl
		 * @see com.example.car.impl.CarPackageImpl#getCarFrame()
		 * @generated
		 */
		EClass CAR_FRAME = eINSTANCE.getCarFrame();

		/**
		 * The meta object literal for the '<em><b>Car Wheel</b></em>' containment reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CAR_FRAME__CAR_WHEEL = eINSTANCE.getCarFrame_CarWheel();

		/**
		 * The meta object literal for the '<em><b>Car Link Ref</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CAR_FRAME__CAR_LINK_REF = eINSTANCE.getCarFrame_CarLinkRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CAR_FRAME__NAME = eINSTANCE.getCarFrame_Name();

		/**
		 * The meta object literal for the '{@link com.example.car.impl.CarLinkImpl <em>Link</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.example.car.impl.CarLinkImpl
		 * @see com.example.car.impl.CarPackageImpl#getCarLink()
		 * @generated
		 */
		EClass CAR_LINK = eINSTANCE.getCarLink();

		/**
		 * The meta object literal for the '<em><b>Car Link Id</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CAR_LINK__CAR_LINK_ID = eINSTANCE.getCarLink_CarLinkId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CAR_LINK__NAME = eINSTANCE.getCarLink_Name();

		/**
		 * The meta object literal for the '{@link com.example.car.impl.CarsListImpl <em>Cars List</em>}
		 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.example.car.impl.CarsListImpl
		 * @see com.example.car.impl.CarPackageImpl#getCarsList()
		 * @generated
		 */
		EClass CARS_LIST = eINSTANCE.getCarsList();

		/**
		 * The meta object literal for the '<em><b>Car Type</b></em>' containment reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CARS_LIST__CAR_TYPE = eINSTANCE.getCarsList_CarType();

		/**
		 * The meta object literal for the '<em><b>Car Link</b></em>' containment reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CARS_LIST__CAR_LINK = eINSTANCE.getCarsList_CarLink();

		/**
		 * The meta object literal for the '{@link com.example.car.impl.CarTireImpl <em>Tire</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.example.car.impl.CarTireImpl
		 * @see com.example.car.impl.CarPackageImpl#getCarTire()
		 * @generated
		 */
		EClass CAR_TIRE = eINSTANCE.getCarTire();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CAR_TIRE__NAME = eINSTANCE.getCarTire_Name();

		/**
		 * The meta object literal for the '{@link com.example.car.impl.CarTypeImpl <em>Type</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.example.car.impl.CarTypeImpl
		 * @see com.example.car.impl.CarPackageImpl#getCarType()
		 * @generated
		 */
		EClass CAR_TYPE = eINSTANCE.getCarType();

		/**
		 * The meta object literal for the '<em><b>Car Frame</b></em>' containment reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CAR_TYPE__CAR_FRAME = eINSTANCE.getCarType_CarFrame();

		/**
		 * The meta object literal for the '<em><b>Car ID</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CAR_TYPE__CAR_ID = eINSTANCE.getCarType_CarID();

		/**
		 * The meta object literal for the '{@link com.example.car.impl.CarWheelImpl <em>Wheel</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.example.car.impl.CarWheelImpl
		 * @see com.example.car.impl.CarPackageImpl#getCarWheel()
		 * @generated
		 */
		EClass CAR_WHEEL = eINSTANCE.getCarWheel();

		/**
		 * The meta object literal for the '<em><b>Car Tire</b></em>' containment reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CAR_WHEEL__CAR_TIRE = eINSTANCE.getCarWheel_CarTire();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CAR_WHEEL__NAME = eINSTANCE.getCarWheel_Name();

		/**
		 * The meta object literal for the '{@link com.example.car.impl.DocumentRootImpl
		 * <em>Document Root</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.example.car.impl.DocumentRootImpl
		 * @see com.example.car.impl.CarPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Cars List</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CARS_LIST = eINSTANCE.getDocumentRoot_CarsList();

	}

} // CarPackage
