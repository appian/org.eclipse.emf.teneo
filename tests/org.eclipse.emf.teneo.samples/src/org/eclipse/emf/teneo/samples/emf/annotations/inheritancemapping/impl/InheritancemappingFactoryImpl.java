/**
 * <copyright>
 * </copyright>
 *
 * $Id: InheritancemappingFactoryImpl.java,v 1.9 2008/03/12 07:30:27 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.*;

import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.ContentList;
import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.DistrictUKAddress;
import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.InheritancemappingFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.InheritancemappingPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.InternationalPrice;
import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.Price;
import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.UKAddress;
import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.USAddress;
import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.USState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InheritancemappingFactoryImpl extends EFactoryImpl implements InheritancemappingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InheritancemappingFactory init() {
		try {
			InheritancemappingFactory theInheritancemappingFactory = (InheritancemappingFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/emf/annotations/inheritancemapping"); 
			if (theInheritancemappingFactory != null) {
				return theInheritancemappingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InheritancemappingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritancemappingFactoryImpl() {
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
			case InheritancemappingPackage.CONTENT_LIST: return createContentList();
			case InheritancemappingPackage.DISTRICT_UK_ADDRESS: return createDistrictUKAddress();
			case InheritancemappingPackage.INTERNATIONAL_PRICE: return createInternationalPrice();
			case InheritancemappingPackage.PRICE: return createPrice();
			case InheritancemappingPackage.UK_ADDRESS: return createUKAddress();
			case InheritancemappingPackage.US_ADDRESS: return createUSAddress();
			case InheritancemappingPackage.CUSTOMER: return createCustomer();
			case InheritancemappingPackage.SPECIFIC_CUSTOMER: return createSpecificCustomer();
			case InheritancemappingPackage.UK_ADDRESS_LIST: return createUKAddressList();
			case InheritancemappingPackage.PARENT_ONE: return createParentOne();
			case InheritancemappingPackage.PARENT_TWO: return createParentTwo();
			case InheritancemappingPackage.CHILD_ONE: return createChildOne();
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
			case InheritancemappingPackage.US_STATE:
				return createUSStateFromString(eDataType, initialValue);
			case InheritancemappingPackage.US_STATE_OBJECT:
				return createUSStateObjectFromString(eDataType, initialValue);
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
			case InheritancemappingPackage.US_STATE:
				return convertUSStateToString(eDataType, instanceValue);
			case InheritancemappingPackage.US_STATE_OBJECT:
				return convertUSStateObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentList createContentList() {
		ContentListImpl contentList = new ContentListImpl();
		return contentList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistrictUKAddress createDistrictUKAddress() {
		DistrictUKAddressImpl districtUKAddress = new DistrictUKAddressImpl();
		return districtUKAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternationalPrice createInternationalPrice() {
		InternationalPriceImpl internationalPrice = new InternationalPriceImpl();
		return internationalPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Price createPrice() {
		PriceImpl price = new PriceImpl();
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UKAddress createUKAddress() {
		UKAddressImpl ukAddress = new UKAddressImpl();
		return ukAddress;
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
	public Customer createCustomer() {
		CustomerImpl customer = new CustomerImpl();
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificCustomer createSpecificCustomer() {
		SpecificCustomerImpl specificCustomer = new SpecificCustomerImpl();
		return specificCustomer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UKAddressList createUKAddressList() {
		UKAddressListImpl ukAddressList = new UKAddressListImpl();
		return ukAddressList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParentOne createParentOne() {
		ParentOneImpl parentOne = new ParentOneImpl();
		return parentOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParentTwo createParentTwo() {
		ParentTwoImpl parentTwo = new ParentTwoImpl();
		return parentTwo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChildOne createChildOne() {
		ChildOneImpl childOne = new ChildOneImpl();
		return childOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public USState createUSStateFromString(EDataType eDataType, String initialValue) {
		USState result = USState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUSStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public USState createUSStateObjectFromString(EDataType eDataType, String initialValue) {
		return createUSStateFromString(InheritancemappingPackage.Literals.US_STATE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUSStateObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUSStateToString(InheritancemappingPackage.Literals.US_STATE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritancemappingPackage getInheritancemappingPackage() {
		return (InheritancemappingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InheritancemappingPackage getPackage() {
		return InheritancemappingPackage.eINSTANCE;
	}

} //InheritancemappingFactoryImpl
