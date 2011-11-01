/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractsuperFactoryImpl.java,v 1.1 2008/03/10 22:19:02 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.abstractsuper.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.teneo.samples.issues.abstractsuper.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractsuperFactoryImpl extends EFactoryImpl implements AbstractsuperFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AbstractsuperFactory init() {
		try {
			AbstractsuperFactory theAbstractsuperFactory = (AbstractsuperFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/issues/abstractsuper"); 
			if (theAbstractsuperFactory != null) {
				return theAbstractsuperFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AbstractsuperFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractsuperFactoryImpl() {
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
			case AbstractsuperPackage.CONTENT_LIST: return createContentList();
			case AbstractsuperPackage.DISTRICT_UK_ADDRESS: return createDistrictUKAddress();
			case AbstractsuperPackage.INTERNATIONAL_PRICE: return createInternationalPrice();
			case AbstractsuperPackage.PRICE: return createPrice();
			case AbstractsuperPackage.UK_ADDRESS: return createUKAddress();
			case AbstractsuperPackage.US_ADDRESS: return createUSAddress();
			case AbstractsuperPackage.CUSTOMER: return createCustomer();
			case AbstractsuperPackage.SPECIFIC_CUSTOMER: return createSpecificCustomer();
			case AbstractsuperPackage.UK_ADDRESS_LIST: return createUKAddressList();
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
			case AbstractsuperPackage.US_STATE:
				return createUSStateFromString(eDataType, initialValue);
			case AbstractsuperPackage.US_STATE_OBJECT:
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
			case AbstractsuperPackage.US_STATE:
				return convertUSStateToString(eDataType, instanceValue);
			case AbstractsuperPackage.US_STATE_OBJECT:
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
		return createUSStateFromString(AbstractsuperPackage.Literals.US_STATE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUSStateObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUSStateToString(AbstractsuperPackage.Literals.US_STATE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractsuperPackage getAbstractsuperPackage() {
		return (AbstractsuperPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AbstractsuperPackage getPackage() {
		return AbstractsuperPackage.eINSTANCE;
	}

} //AbstractsuperFactoryImpl
