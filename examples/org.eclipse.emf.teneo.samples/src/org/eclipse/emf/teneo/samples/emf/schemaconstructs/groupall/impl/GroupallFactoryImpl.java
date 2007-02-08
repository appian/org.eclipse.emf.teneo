/**
 * <copyright>
 * </copyright>
 *
 * $Id: GroupallFactoryImpl.java,v 1.2 2007/02/08 23:09:21 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GroupallFactoryImpl extends EFactoryImpl implements GroupallFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GroupallFactory init() {
		try {
			GroupallFactory theGroupallFactory = (GroupallFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/emf/schemaconstructs/groupall"); 
			if (theGroupallFactory != null) {
				return theGroupallFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GroupallFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupallFactoryImpl() {
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
			case GroupallPackage.ADDRESS: return createAddress();
			case GroupallPackage.ADDRESS_GROUP: return createAddressGroup();
			case GroupallPackage.ADDRESS_LIST: return createAddressList();
			case GroupallPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case GroupallPackage.SIMPLE_ALL_MAP_TYPE: return createSimpleAllMapType();
			case GroupallPackage.SIMPLE_ALL_TYPE: return createSimpleAllType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public AddressGroup createAddressGroup() {
		AddressGroupImpl addressGroup = new AddressGroupImpl();
		return addressGroup;
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
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleAllMapType createSimpleAllMapType() {
		SimpleAllMapTypeImpl simpleAllMapType = new SimpleAllMapTypeImpl();
		return simpleAllMapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleAllType createSimpleAllType() {
		SimpleAllTypeImpl simpleAllType = new SimpleAllTypeImpl();
		return simpleAllType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupallPackage getGroupallPackage() {
		return (GroupallPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GroupallPackage getPackage() {
		return GroupallPackage.eINSTANCE;
	}

} //GroupallFactoryImpl
