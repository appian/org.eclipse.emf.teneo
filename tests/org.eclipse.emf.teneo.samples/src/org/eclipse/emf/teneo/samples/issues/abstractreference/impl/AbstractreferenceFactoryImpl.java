/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractreferenceFactoryImpl.java,v 1.1 2006/07/11 16:57:15 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.abstractreference.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.teneo.samples.issues.abstractreference.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractreferenceFactoryImpl extends EFactoryImpl implements AbstractreferenceFactory {
	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractreferenceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AbstractreferencePackage.PERSON: return createPerson();
			case AbstractreferencePackage.US_ADDRESS: return createUSAddress();
			case AbstractreferencePackage.US_CITY: return createUSCity();
			case AbstractreferencePackage.US_OFFICE_ADDRESS: return createUSOfficeAddress();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
	public USAddress createUSAddress() {
		USAddressImpl usAddress = new USAddressImpl();
		return usAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public USCity createUSCity() {
		USCityImpl usCity = new USCityImpl();
		return usCity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public USOfficeAddress createUSOfficeAddress() {
		USOfficeAddressImpl usOfficeAddress = new USOfficeAddressImpl();
		return usOfficeAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractreferencePackage getAbstractreferencePackage() {
		return (AbstractreferencePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static AbstractreferencePackage getPackage() {
		return AbstractreferencePackage.eINSTANCE;
	}

} //AbstractreferenceFactoryImpl
