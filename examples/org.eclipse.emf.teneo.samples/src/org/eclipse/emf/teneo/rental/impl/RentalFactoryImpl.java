/**
 * <copyright>
 * </copyright>
 *
 * $Id: RentalFactoryImpl.java,v 1.1 2007/03/07 23:34:09 mtaal Exp $
 */
package org.eclipse.emf.teneo.rental.impl;

import java.util.Date;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.teneo.rental.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RentalFactoryImpl extends EFactoryImpl implements RentalFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RentalFactory init() {
		try {
			RentalFactory theRentalFactory = (RentalFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/rental"); 
			if (theRentalFactory != null) {
				return theRentalFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RentalFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RentalFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RentalPackage.RENTAL_BICYCLE: return createRentalBicycle();
			case RentalPackage.RENTAL_BUSINESS: return createRentalBusiness();
			case RentalPackage.RENTAL_CAR: return createRentalCar();
			case RentalPackage.RENTAL_CONTRACT: return createRentalContract();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RentalPackage.RENTAL_BICYCLE_TYPE:
				return createRentalBicycleTypeFromString(eDataType, initialValue);
			case RentalPackage.RENTAL_CAR_SIZE:
				return createRentalCarSizeFromString(eDataType, initialValue);
			case RentalPackage.DATE:
				return createDateFromString(eDataType, initialValue);
			case RentalPackage.RENTAL_BICYCLE_TYPE_OBJECT:
				return createRentalBicycleTypeObjectFromString(eDataType, initialValue);
			case RentalPackage.RENTAL_CAR_SIZE_OBJECT:
				return createRentalCarSizeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RentalPackage.RENTAL_BICYCLE_TYPE:
				return convertRentalBicycleTypeToString(eDataType, instanceValue);
			case RentalPackage.RENTAL_CAR_SIZE:
				return convertRentalCarSizeToString(eDataType, instanceValue);
			case RentalPackage.DATE:
				return convertDateToString(eDataType, instanceValue);
			case RentalPackage.RENTAL_BICYCLE_TYPE_OBJECT:
				return convertRentalBicycleTypeObjectToString(eDataType, instanceValue);
			case RentalPackage.RENTAL_CAR_SIZE_OBJECT:
				return convertRentalCarSizeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RentalBicycle createRentalBicycle() {
		RentalBicycleImpl rentalBicycle = new RentalBicycleImpl();
		return rentalBicycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RentalBusiness createRentalBusiness() {
		RentalBusinessImpl rentalBusiness = new RentalBusinessImpl();
		return rentalBusiness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RentalCar createRentalCar() {
		RentalCarImpl rentalCar = new RentalCarImpl();
		return rentalCar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RentalContract createRentalContract() {
		RentalContractImpl rentalContract = new RentalContractImpl();
		return rentalContract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RentalBicycleType createRentalBicycleTypeFromString(EDataType eDataType, String initialValue) {
		RentalBicycleType result = RentalBicycleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRentalBicycleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RentalCarSize createRentalCarSizeFromString(EDataType eDataType, String initialValue) {
		RentalCarSize result = RentalCarSize.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRentalCarSizeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDateFromString(EDataType eDataType, String initialValue) {
		return (Date)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RentalBicycleType createRentalBicycleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRentalBicycleTypeFromString(RentalPackage.Literals.RENTAL_BICYCLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRentalBicycleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRentalBicycleTypeToString(RentalPackage.Literals.RENTAL_BICYCLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RentalCarSize createRentalCarSizeObjectFromString(EDataType eDataType, String initialValue) {
		return createRentalCarSizeFromString(RentalPackage.Literals.RENTAL_CAR_SIZE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRentalCarSizeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRentalCarSizeToString(RentalPackage.Literals.RENTAL_CAR_SIZE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RentalPackage getRentalPackage() {
		return (RentalPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RentalPackage getPackage() {
		return RentalPackage.eINSTANCE;
	}

} //RentalFactoryImpl
