/**
 * <copyright>
 * </copyright>
 *
 * $Id: InterfacetrueFactoryImpl.java,v 1.2 2008/09/17 20:28:01 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.interfacetrue.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.teneo.samples.issues.interfacetrue.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InterfacetrueFactoryImpl extends EFactoryImpl implements InterfacetrueFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InterfacetrueFactory init() {
		try {
			InterfacetrueFactory theInterfacetrueFactory = (InterfacetrueFactory)EPackage.Registry.INSTANCE.getEFactory("http:///org/elver/store/test/issues/interfacetrue.ecore"); 
			if (theInterfacetrueFactory != null) {
				return theInterfacetrueFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InterfacetrueFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacetrueFactoryImpl() {
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
			case InterfacetruePackage.US_ADDRESS: return createUSAddress();
			case InterfacetruePackage.ADDRESS_LIST: return createAddressList();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public AddressList createAddressList() {
		AddressListImpl addressList = new AddressListImpl();
		return addressList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacetruePackage getInterfacetruePackage() {
		return (InterfacetruePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InterfacetruePackage getPackage() {
		return InterfacetruePackage.eINSTANCE;
	}

} //InterfacetrueFactoryImpl
