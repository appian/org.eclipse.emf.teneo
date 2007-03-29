/**
 * <copyright>
 * </copyright>
 *
 * $Id: RentalPackage.java,v 1.2 2007/03/29 14:59:35 mtaal Exp $
 */
package org.eclipse.emf.teneo.rental;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.rental.RentalFactory
 * @model kind="package"
 * @generated
 */
public interface RentalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rental";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/rental";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rental";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RentalPackage eINSTANCE = org.eclipse.emf.teneo.rental.impl.RentalPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.rental.impl.RentalUnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.rental.impl.RentalUnitImpl
	 * @see org.eclipse.emf.teneo.rental.impl.RentalPackageImpl#getRentalUnit()
	 * @generated
	 */
	int RENTAL_UNIT = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_UNIT__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_UNIT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.rental.impl.RentalBicycleImpl <em>Bicycle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.rental.impl.RentalBicycleImpl
	 * @see org.eclipse.emf.teneo.rental.impl.RentalPackageImpl#getRentalBicycle()
	 * @generated
	 */
	int RENTAL_BICYCLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_BICYCLE__DESCRIPTION = RENTAL_UNIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_BICYCLE__TYPE = RENTAL_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bicycle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_BICYCLE_FEATURE_COUNT = RENTAL_UNIT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.rental.impl.CurrencyImpl <em>Currency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.rental.impl.CurrencyImpl
	 * @see org.eclipse.emf.teneo.rental.impl.RentalPackageImpl#getCurrency()
	 * @generated
	 */
	int CURRENCY = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY__CODE = 0;

	/**
	 * The number of structural features of the '<em>Currency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.rental.impl.RentalCarImpl <em>Car</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.rental.impl.RentalCarImpl
	 * @see org.eclipse.emf.teneo.rental.impl.RentalPackageImpl#getRentalCar()
	 * @generated
	 */
	int RENTAL_CAR = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_CAR__DESCRIPTION = RENTAL_UNIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_CAR__SIZE = RENTAL_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Car</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_CAR_FEATURE_COUNT = RENTAL_UNIT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.rental.impl.RentalContractImpl <em>Contract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.rental.impl.RentalContractImpl
	 * @see org.eclipse.emf.teneo.rental.impl.RentalPackageImpl#getRentalContract()
	 * @generated
	 */
	int RENTAL_CONTRACT = 3;

	/**
	 * The feature id for the '<em><b>Rent To Business Partner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_CONTRACT__RENT_TO_BUSINESS_PARTNER = 0;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_CONTRACT__START_DATE = 1;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_CONTRACT__END_DATE = 2;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_CONTRACT__COST = 3;

	/**
	 * The feature id for the '<em><b>Rental Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_CONTRACT__RENTAL_UNITS = 4;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_CONTRACT__CURRENCY = 5;

	/**
	 * The number of structural features of the '<em>Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_CONTRACT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.rental.RentalBicycleType <em>Bicycle Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.rental.RentalBicycleType
	 * @see org.eclipse.emf.teneo.rental.impl.RentalPackageImpl#getRentalBicycleType()
	 * @generated
	 */
	int RENTAL_BICYCLE_TYPE = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.rental.RentalCarSize <em>Car Size</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.rental.RentalCarSize
	 * @see org.eclipse.emf.teneo.rental.impl.RentalPackageImpl#getRentalCarSize()
	 * @generated
	 */
	int RENTAL_CAR_SIZE = 6;

	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see org.eclipse.emf.teneo.rental.impl.RentalPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 7;

	/**
	 * The meta object id for the '<em>Bicycle Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.rental.RentalBicycleType
	 * @see org.eclipse.emf.teneo.rental.impl.RentalPackageImpl#getRentalBicycleTypeObject()
	 * @generated
	 */
	int RENTAL_BICYCLE_TYPE_OBJECT = 8;

	/**
	 * The meta object id for the '<em>Car Size Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.rental.RentalCarSize
	 * @see org.eclipse.emf.teneo.rental.impl.RentalPackageImpl#getRentalCarSizeObject()
	 * @generated
	 */
	int RENTAL_CAR_SIZE_OBJECT = 9;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.rental.RentalBicycle <em>Bicycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bicycle</em>'.
	 * @see org.eclipse.emf.teneo.rental.RentalBicycle
	 * @generated
	 */
	EClass getRentalBicycle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.rental.RentalBicycle#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.emf.teneo.rental.RentalBicycle#getType()
	 * @see #getRentalBicycle()
	 * @generated
	 */
	EAttribute getRentalBicycle_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.rental.Currency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Currency</em>'.
	 * @see org.eclipse.emf.teneo.rental.Currency
	 * @generated
	 */
	EClass getCurrency();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.rental.Currency#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.eclipse.emf.teneo.rental.Currency#getCode()
	 * @see #getCurrency()
	 * @generated
	 */
	EAttribute getCurrency_Code();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.rental.RentalCar <em>Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Car</em>'.
	 * @see org.eclipse.emf.teneo.rental.RentalCar
	 * @generated
	 */
	EClass getRentalCar();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.rental.RentalCar#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.eclipse.emf.teneo.rental.RentalCar#getSize()
	 * @see #getRentalCar()
	 * @generated
	 */
	EAttribute getRentalCar_Size();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.rental.RentalContract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contract</em>'.
	 * @see org.eclipse.emf.teneo.rental.RentalContract
	 * @generated
	 */
	EClass getRentalContract();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.rental.RentalContract#getRentToBusinessPartner <em>Rent To Business Partner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rent To Business Partner</em>'.
	 * @see org.eclipse.emf.teneo.rental.RentalContract#getRentToBusinessPartner()
	 * @see #getRentalContract()
	 * @generated
	 */
	EAttribute getRentalContract_RentToBusinessPartner();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.rental.RentalContract#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see org.eclipse.emf.teneo.rental.RentalContract#getStartDate()
	 * @see #getRentalContract()
	 * @generated
	 */
	EAttribute getRentalContract_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.rental.RentalContract#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see org.eclipse.emf.teneo.rental.RentalContract#getEndDate()
	 * @see #getRentalContract()
	 * @generated
	 */
	EAttribute getRentalContract_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.rental.RentalContract#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see org.eclipse.emf.teneo.rental.RentalContract#getCost()
	 * @see #getRentalContract()
	 * @generated
	 */
	EAttribute getRentalContract_Cost();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.rental.RentalContract#getRentalUnits <em>Rental Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rental Units</em>'.
	 * @see org.eclipse.emf.teneo.rental.RentalContract#getRentalUnits()
	 * @see #getRentalContract()
	 * @generated
	 */
	EReference getRentalContract_RentalUnits();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.rental.RentalContract#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency</em>'.
	 * @see org.eclipse.emf.teneo.rental.RentalContract#getCurrency()
	 * @see #getRentalContract()
	 * @generated
	 */
	EReference getRentalContract_Currency();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.rental.RentalUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see org.eclipse.emf.teneo.rental.RentalUnit
	 * @generated
	 */
	EClass getRentalUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.rental.RentalUnit#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.emf.teneo.rental.RentalUnit#getDescription()
	 * @see #getRentalUnit()
	 * @generated
	 */
	EAttribute getRentalUnit_Description();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.rental.RentalBicycleType <em>Bicycle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bicycle Type</em>'.
	 * @see org.eclipse.emf.teneo.rental.RentalBicycleType
	 * @generated
	 */
	EEnum getRentalBicycleType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.rental.RentalCarSize <em>Car Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Car Size</em>'.
	 * @see org.eclipse.emf.teneo.rental.RentalCarSize
	 * @generated
	 */
	EEnum getRentalCarSize();

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 *        extendedMetaData="name='Date'" 
	 * @generated
	 */
	EDataType getDate();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.rental.RentalBicycleType <em>Bicycle Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bicycle Type Object</em>'.
	 * @see org.eclipse.emf.teneo.rental.RentalBicycleType
	 * @model instanceClass="org.eclipse.emf.teneo.rental.RentalBicycleType"
	 *        extendedMetaData="name='RentalBicycleType:Object' baseType='RentalBicycleType'" 
	 * @generated
	 */
	EDataType getRentalBicycleTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.rental.RentalCarSize <em>Car Size Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Car Size Object</em>'.
	 * @see org.eclipse.emf.teneo.rental.RentalCarSize
	 * @model instanceClass="org.eclipse.emf.teneo.rental.RentalCarSize"
	 *        extendedMetaData="name='RentalCarSize:Object' baseType='RentalCarSize'" 
	 * @generated
	 */
	EDataType getRentalCarSizeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RentalFactory getRentalFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.rental.impl.RentalBicycleImpl <em>Bicycle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.rental.impl.RentalBicycleImpl
		 * @see org.eclipse.emf.teneo.rental.impl.RentalPackageImpl#getRentalBicycle()
		 * @generated
		 */
		EClass RENTAL_BICYCLE = eINSTANCE.getRentalBicycle();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENTAL_BICYCLE__TYPE = eINSTANCE.getRentalBicycle_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.rental.impl.CurrencyImpl <em>Currency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.rental.impl.CurrencyImpl
		 * @see org.eclipse.emf.teneo.rental.impl.RentalPackageImpl#getCurrency()
		 * @generated
		 */
		EClass CURRENCY = eINSTANCE.getCurrency();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY__CODE = eINSTANCE.getCurrency_Code();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.rental.impl.RentalCarImpl <em>Car</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.rental.impl.RentalCarImpl
		 * @see org.eclipse.emf.teneo.rental.impl.RentalPackageImpl#getRentalCar()
		 * @generated
		 */
		EClass RENTAL_CAR = eINSTANCE.getRentalCar();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENTAL_CAR__SIZE = eINSTANCE.getRentalCar_Size();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.rental.impl.RentalContractImpl <em>Contract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.rental.impl.RentalContractImpl
		 * @see org.eclipse.emf.teneo.rental.impl.RentalPackageImpl#getRentalContract()
		 * @generated
		 */
		EClass RENTAL_CONTRACT = eINSTANCE.getRentalContract();

		/**
		 * The meta object literal for the '<em><b>Rent To Business Partner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENTAL_CONTRACT__RENT_TO_BUSINESS_PARTNER = eINSTANCE.getRentalContract_RentToBusinessPartner();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENTAL_CONTRACT__START_DATE = eINSTANCE.getRentalContract_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENTAL_CONTRACT__END_DATE = eINSTANCE.getRentalContract_EndDate();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENTAL_CONTRACT__COST = eINSTANCE.getRentalContract_Cost();

		/**
		 * The meta object literal for the '<em><b>Rental Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENTAL_CONTRACT__RENTAL_UNITS = eINSTANCE.getRentalContract_RentalUnits();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENTAL_CONTRACT__CURRENCY = eINSTANCE.getRentalContract_Currency();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.rental.impl.RentalUnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.rental.impl.RentalUnitImpl
		 * @see org.eclipse.emf.teneo.rental.impl.RentalPackageImpl#getRentalUnit()
		 * @generated
		 */
		EClass RENTAL_UNIT = eINSTANCE.getRentalUnit();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENTAL_UNIT__DESCRIPTION = eINSTANCE.getRentalUnit_Description();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.rental.RentalBicycleType <em>Bicycle Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.rental.RentalBicycleType
		 * @see org.eclipse.emf.teneo.rental.impl.RentalPackageImpl#getRentalBicycleType()
		 * @generated
		 */
		EEnum RENTAL_BICYCLE_TYPE = eINSTANCE.getRentalBicycleType();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.rental.RentalCarSize <em>Car Size</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.rental.RentalCarSize
		 * @see org.eclipse.emf.teneo.rental.impl.RentalPackageImpl#getRentalCarSize()
		 * @generated
		 */
		EEnum RENTAL_CAR_SIZE = eINSTANCE.getRentalCarSize();

		/**
		 * The meta object literal for the '<em>Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see org.eclipse.emf.teneo.rental.impl.RentalPackageImpl#getDate()
		 * @generated
		 */
		EDataType DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '<em>Bicycle Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.rental.RentalBicycleType
		 * @see org.eclipse.emf.teneo.rental.impl.RentalPackageImpl#getRentalBicycleTypeObject()
		 * @generated
		 */
		EDataType RENTAL_BICYCLE_TYPE_OBJECT = eINSTANCE.getRentalBicycleTypeObject();

		/**
		 * The meta object literal for the '<em>Car Size Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.rental.RentalCarSize
		 * @see org.eclipse.emf.teneo.rental.impl.RentalPackageImpl#getRentalCarSizeObject()
		 * @generated
		 */
		EDataType RENTAL_CAR_SIZE_OBJECT = eINSTANCE.getRentalCarSizeObject();

	}

} //RentalPackage
