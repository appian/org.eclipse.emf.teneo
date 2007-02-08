/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExtensionFactoryImpl.java,v 1.3 2007/02/08 23:09:20 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtensionFactoryImpl extends EFactoryImpl implements ExtensionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExtensionFactory init() {
		try {
			ExtensionFactory theExtensionFactory = (ExtensionFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/emf/schemaconstructs/extension"); 
			if (theExtensionFactory != null) {
				return theExtensionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExtensionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionFactoryImpl() {
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
			case ExtensionPackage.ADDRESS_LIST: return createAddressList();
			case ExtensionPackage.DISTRICT_UK_ADDRESS: return createDistrictUKAddress();
			case ExtensionPackage.FIRST_ADDRESS_HOLDER: return createFirstAddressHolder();
			case ExtensionPackage.INTERNATIONAL_PRICE: return createInternationalPrice();
			case ExtensionPackage.UK_ADDRESS: return createUKAddress();
			case ExtensionPackage.US_ADDRESS: return createUSAddress();
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
			case ExtensionPackage.US_STATE:
				return createUSStateFromString(eDataType, initialValue);
			case ExtensionPackage.POSTCODE:
				return createPostcodeFromString(eDataType, initialValue);
			case ExtensionPackage.UK_POSTCODE:
				return createUKPostcodeFromString(eDataType, initialValue);
			case ExtensionPackage.US_STATE_OBJECT:
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
			case ExtensionPackage.US_STATE:
				return convertUSStateToString(eDataType, instanceValue);
			case ExtensionPackage.POSTCODE:
				return convertPostcodeToString(eDataType, instanceValue);
			case ExtensionPackage.UK_POSTCODE:
				return convertUKPostcodeToString(eDataType, instanceValue);
			case ExtensionPackage.US_STATE_OBJECT:
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
	public AddressList createAddressList() {
		AddressListImpl addressList = new AddressListImpl();
		return addressList;
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
	public FirstAddressHolder createFirstAddressHolder() {
		FirstAddressHolderImpl firstAddressHolder = new FirstAddressHolderImpl();
		return firstAddressHolder;
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
	public String createPostcodeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPostcodeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUKPostcodeFromString(EDataType eDataType, String initialValue) {
		return createPostcodeFromString(ExtensionPackage.Literals.POSTCODE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUKPostcodeToString(EDataType eDataType, Object instanceValue) {
		return convertPostcodeToString(ExtensionPackage.Literals.POSTCODE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public USState createUSStateObjectFromString(EDataType eDataType, String initialValue) {
		return createUSStateFromString(ExtensionPackage.Literals.US_STATE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUSStateObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUSStateToString(ExtensionPackage.Literals.US_STATE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionPackage getExtensionPackage() {
		return (ExtensionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExtensionPackage getPackage() {
		return ExtensionPackage.eINSTANCE;
	}

} //ExtensionFactoryImpl
