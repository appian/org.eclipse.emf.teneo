/**
 * <copyright>
 * </copyright>
 *
 * $Id: UsertypeFactoryImpl.java,v 1.7 2009/06/11 04:59:10 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsertypeFactoryImpl extends EFactoryImpl implements UsertypeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UsertypeFactory init() {
		try {
			UsertypeFactory theUsertypeFactory = (UsertypeFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.elver.org/samples/emf/hibernate/usertype"); 
			if (theUsertypeFactory != null) {
				return theUsertypeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UsertypeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsertypeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UsertypePackage.PERSON: return createPerson();
			case UsertypePackage.ADDRESS: return createAddress();
			case UsertypePackage.CITY: return createCity();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case UsertypePackage.CITY_SIZE:
				return createCitySizeFromString(eDataType, initialValue);
			case UsertypePackage.NAME:
				return createNameFromString(eDataType, initialValue);
			case UsertypePackage.PHONE_NUMBER:
				return createPhoneNumberFromString(eDataType, initialValue);
			case UsertypePackage.INT_ARRAY:
				return createIntArrayFromString(eDataType, initialValue);
			case UsertypePackage.MY_DOUBLE_TYPE:
				return createmyDoubleTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case UsertypePackage.CITY_SIZE:
				return convertCitySizeToString(eDataType, instanceValue);
			case UsertypePackage.NAME:
				return convertNameToString(eDataType, instanceValue);
			case UsertypePackage.PHONE_NUMBER:
				return convertPhoneNumberToString(eDataType, instanceValue);
			case UsertypePackage.INT_ARRAY:
				return convertIntArrayToString(eDataType, instanceValue);
			case UsertypePackage.MY_DOUBLE_TYPE:
				return convertmyDoubleTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address createAddress() {
		AddressImpl address = new AddressImpl();
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public City createCity() {
		CityImpl city = new CityImpl();
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitySize createCitySizeFromString(EDataType eDataType, String initialValue) {
		CitySize result = CitySize.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCitySizeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name createNameFromString(EDataType eDataType, String initialValue) {
		return (Name)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsaPhoneNumber createPhoneNumberFromString(EDataType eDataType, String initialValue) {
		return (UsaPhoneNumber)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPhoneNumberToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generatedNOT
	 */
	public int[] createIntArrayFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		final String[] vals = initialValue.split("_");
		final int[] result = new int[vals.length];
		for (int i = 0; i < vals.length; i++) {
			result[i] = Integer.parseInt(vals[i]);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generatedNOT
	 */
	public String convertIntArrayToString(EDataType eDataType, Object instanceValue) {
		final int[] vals = (int[])instanceValue;
		final StringBuffer result = new StringBuffer();
		for (int i = 0; i < vals.length; i++) {
			if (i > 0) result.append("_");
			result.append(vals[i] + "");
		}
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createmyDoubleTypeFromString(EDataType eDataType, String initialValue) {
		return (Double)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertmyDoubleTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsertypePackage getUsertypePackage() {
		return (UsertypePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static UsertypePackage getPackage() {
		return UsertypePackage.eINSTANCE;
	}

} //UsertypeFactoryImpl
