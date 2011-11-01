/**
 * <copyright>
 * </copyright>
 *
 * $Id: GroupallPackageImpl.java,v 1.2 2007/02/08 23:09:21 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.Address;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.AddressGroup;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.AddressList;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.DocumentRoot;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.GroupallFactory;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.GroupallPackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.SimpleAllMapType;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.SimpleAllType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GroupallPackageImpl extends EPackageImpl implements GroupallPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleAllMapTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleAllTypeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.GroupallPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GroupallPackageImpl() {
		super(eNS_URI, GroupallFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GroupallPackage init() {
		if (isInited) return (GroupallPackage)EPackage.Registry.INSTANCE.getEPackage(GroupallPackage.eNS_URI);

		// Obtain or create and register package
		GroupallPackageImpl theGroupallPackage = (GroupallPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof GroupallPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new GroupallPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGroupallPackage.createPackageContents();

		// Initialize created meta-data
		theGroupallPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGroupallPackage.freeze();

		return theGroupallPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddress() {
		return addressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddress_Group() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddress_Name() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddress_LongName() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressGroup() {
		return addressGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressGroup_GroupName() {
		return (EAttribute)addressGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressGroup_ShipTo() {
		return (EReference)addressGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressGroup_BillTo() {
		return (EReference)addressGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressGroup_SimpleAddress() {
		return (EAttribute)addressGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressList() {
		return addressListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressList_GroupName() {
		return (EAttribute)addressListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressList_Addrs() {
		return (EAttribute)addressListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressList_ShipTo() {
		return (EReference)addressListEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressList_BillTo() {
		return (EReference)addressListEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SimpleAll() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SimpleAllMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleAllMapType() {
		return simpleAllMapTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleAllMapType_AllMap() {
		return (EAttribute)simpleAllMapTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleAllMapType_Aaa() {
		return (EAttribute)simpleAllMapTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleAllMapType_Bbb() {
		return (EAttribute)simpleAllMapTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleAllMapType_Ccc() {
		return (EAttribute)simpleAllMapTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleAllType() {
		return simpleAllTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleAllType_Aaa() {
		return (EAttribute)simpleAllTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleAllType_Bbb() {
		return (EAttribute)simpleAllTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleAllType_Ccc() {
		return (EAttribute)simpleAllTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupallFactory getGroupallFactory() {
		return (GroupallFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		addressEClass = createEClass(ADDRESS);
		createEAttribute(addressEClass, ADDRESS__GROUP);
		createEAttribute(addressEClass, ADDRESS__NAME);
		createEAttribute(addressEClass, ADDRESS__LONG_NAME);

		addressGroupEClass = createEClass(ADDRESS_GROUP);
		createEAttribute(addressGroupEClass, ADDRESS_GROUP__GROUP_NAME);
		createEReference(addressGroupEClass, ADDRESS_GROUP__SHIP_TO);
		createEReference(addressGroupEClass, ADDRESS_GROUP__BILL_TO);
		createEAttribute(addressGroupEClass, ADDRESS_GROUP__SIMPLE_ADDRESS);

		addressListEClass = createEClass(ADDRESS_LIST);
		createEAttribute(addressListEClass, ADDRESS_LIST__GROUP_NAME);
		createEAttribute(addressListEClass, ADDRESS_LIST__ADDRS);
		createEReference(addressListEClass, ADDRESS_LIST__SHIP_TO);
		createEReference(addressListEClass, ADDRESS_LIST__BILL_TO);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SIMPLE_ALL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SIMPLE_ALL_MAP);

		simpleAllMapTypeEClass = createEClass(SIMPLE_ALL_MAP_TYPE);
		createEAttribute(simpleAllMapTypeEClass, SIMPLE_ALL_MAP_TYPE__ALL_MAP);
		createEAttribute(simpleAllMapTypeEClass, SIMPLE_ALL_MAP_TYPE__AAA);
		createEAttribute(simpleAllMapTypeEClass, SIMPLE_ALL_MAP_TYPE__BBB);
		createEAttribute(simpleAllMapTypeEClass, SIMPLE_ALL_MAP_TYPE__CCC);

		simpleAllTypeEClass = createEClass(SIMPLE_ALL_TYPE);
		createEAttribute(simpleAllTypeEClass, SIMPLE_ALL_TYPE__AAA);
		createEAttribute(simpleAllTypeEClass, SIMPLE_ALL_TYPE__BBB);
		createEAttribute(simpleAllTypeEClass, SIMPLE_ALL_TYPE__CCC);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(addressEClass, Address.class, "Address", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddress_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddress_Name(), theXMLTypePackage.getString(), "name", null, 1, -1, Address.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddress_LongName(), theXMLTypePackage.getString(), "longName", null, 1, -1, Address.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(addressGroupEClass, AddressGroup.class, "AddressGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddressGroup_GroupName(), theXMLTypePackage.getString(), "groupName", null, 1, 1, AddressGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddressGroup_ShipTo(), this.getAddress(), null, "shipTo", null, 0, 1, AddressGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddressGroup_BillTo(), this.getAddress(), null, "billTo", null, 0, 1, AddressGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressGroup_SimpleAddress(), theXMLTypePackage.getString(), "simpleAddress", null, 0, 1, AddressGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addressListEClass, AddressList.class, "AddressList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddressList_GroupName(), theXMLTypePackage.getString(), "groupName", null, 1, 1, AddressList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressList_Addrs(), ecorePackage.getEFeatureMapEntry(), "addrs", null, 0, -1, AddressList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddressList_ShipTo(), this.getAddress(), null, "shipTo", null, 1, -1, AddressList.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAddressList_BillTo(), this.getAddress(), null, "billTo", null, 1, -1, AddressList.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SimpleAll(), this.getSimpleAllType(), null, "simpleAll", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SimpleAllMap(), this.getSimpleAllMapType(), null, "simpleAllMap", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(simpleAllMapTypeEClass, SimpleAllMapType.class, "SimpleAllMapType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleAllMapType_AllMap(), ecorePackage.getEFeatureMapEntry(), "allMap", null, 0, -1, SimpleAllMapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleAllMapType_Aaa(), theXMLTypePackage.getString(), "aaa", null, 1, 1, SimpleAllMapType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleAllMapType_Bbb(), theXMLTypePackage.getString(), "bbb", null, 1, 1, SimpleAllMapType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleAllMapType_Ccc(), theXMLTypePackage.getString(), "ccc", null, 1, 1, SimpleAllMapType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(simpleAllTypeEClass, SimpleAllType.class, "SimpleAllType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleAllType_Aaa(), theXMLTypePackage.getString(), "aaa", null, 1, 1, SimpleAllType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleAllType_Bbb(), theXMLTypePackage.getString(), "bbb", null, 1, 1, SimpleAllType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleAllType_Ccc(), theXMLTypePackage.getString(), "ccc", null, 1, 1, SimpleAllType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (addressEClass, 
		   source, 
		   new String[] {
			 "name", "Address",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAddress_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getAddress_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getAddress_LongName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "longName",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (addressGroupEClass, 
		   source, 
		   new String[] {
			 "name", "AddressGroup",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAddressGroup_GroupName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getAddressGroup_ShipTo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "shipTo"
		   });		
		addAnnotation
		  (getAddressGroup_BillTo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "billTo"
		   });		
		addAnnotation
		  (getAddressGroup_SimpleAddress(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "simpleAddress"
		   });		
		addAnnotation
		  (addressListEClass, 
		   source, 
		   new String[] {
			 "name", "AddressList",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAddressList_GroupName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getAddressList_Addrs(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "addrs:1"
		   });		
		addAnnotation
		  (getAddressList_ShipTo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "shipTo",
			 "group", "#addrs:1"
		   });		
		addAnnotation
		  (getAddressList_BillTo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "billTo",
			 "group", "#addrs:1"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_SimpleAll(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "simpleAll",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SimpleAllMap(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "simpleAllMap",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (simpleAllMapTypeEClass, 
		   source, 
		   new String[] {
			 "name", "simpleAllMap_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSimpleAllMapType_AllMap(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "allMap:0"
		   });		
		addAnnotation
		  (getSimpleAllMapType_Aaa(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "aaa",
			 "group", "#allMap:0"
		   });		
		addAnnotation
		  (getSimpleAllMapType_Bbb(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bbb",
			 "group", "#allMap:0"
		   });		
		addAnnotation
		  (getSimpleAllMapType_Ccc(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ccc",
			 "group", "#allMap:0"
		   });		
		addAnnotation
		  (simpleAllTypeEClass, 
		   source, 
		   new String[] {
			 "name", "simpleAll_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSimpleAllType_Aaa(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "aaa"
		   });		
		addAnnotation
		  (getSimpleAllType_Bbb(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bbb"
		   });		
		addAnnotation
		  (getSimpleAllType_Ccc(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ccc"
		   });
	}

} //GroupallPackageImpl
