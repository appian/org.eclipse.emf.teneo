/**
 * <copyright>
 * </copyright>
 *
 * $Id: RentalPackageImpl.java,v 1.6 2010/10/29 09:35:33 mtaal Exp $
 */
package org.eclipse.emf.teneo.rental.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.teneo.rental.Currency;
import org.eclipse.emf.teneo.rental.Manufacturer;
import org.eclipse.emf.teneo.rental.RentalBicycle;
import org.eclipse.emf.teneo.rental.RentalBicycleType;
import org.eclipse.emf.teneo.rental.RentalCar;
import org.eclipse.emf.teneo.rental.RentalCarSize;
import org.eclipse.emf.teneo.rental.RentalContract;
import org.eclipse.emf.teneo.rental.RentalFactory;
import org.eclipse.emf.teneo.rental.RentalPackage;
import org.eclipse.emf.teneo.rental.RentalUnit;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class RentalPackageImpl extends EPackageImpl implements RentalPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rentalBicycleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currencyEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rentalCarEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rentalContractEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rentalUnitEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manufacturerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rentalBicycleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rentalCarSizeEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rentalBicycleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rentalCarSizeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.emf.teneo.rental.RentalPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RentalPackageImpl() {
		super(eNS_URI, RentalFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RentalPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RentalPackage init() {
		if (isInited) return (RentalPackage)EPackage.Registry.INSTANCE.getEPackage(RentalPackage.eNS_URI);

		// Obtain or create and register package
		RentalPackageImpl theRentalPackage = (RentalPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RentalPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RentalPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRentalPackage.createPackageContents();

		// Initialize created meta-data
		theRentalPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRentalPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RentalPackage.eNS_URI, theRentalPackage);
		return theRentalPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRentalBicycle() {
		return rentalBicycleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRentalBicycle_Type() {
		return (EAttribute)rentalBicycleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRentalBicycle_Manufacturer() {
		return (EReference)rentalBicycleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurrency() {
		return currencyEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrency_Code() {
		return (EAttribute)currencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRentalCar() {
		return rentalCarEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRentalCar_Size() {
		return (EAttribute)rentalCarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRentalContract() {
		return rentalContractEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRentalContract_RentToBusinessPartner() {
		return (EAttribute)rentalContractEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRentalContract_StartDate() {
		return (EAttribute)rentalContractEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRentalContract_EndDate() {
		return (EAttribute)rentalContractEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRentalContract_Cost() {
		return (EAttribute)rentalContractEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRentalContract_RentalUnits() {
		return (EReference)rentalContractEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRentalContract_Currency() {
		return (EReference)rentalContractEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRentalUnit() {
		return rentalUnitEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRentalUnit_Description() {
		return (EAttribute)rentalUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManufacturer() {
		return manufacturerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManufacturer_Code() {
		return (EAttribute)manufacturerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManufacturer_Trusted() {
		return (EAttribute)manufacturerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRentalBicycleType() {
		return rentalBicycleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRentalCarSize() {
		return rentalCarSizeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDate() {
		return dateEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRentalBicycleTypeObject() {
		return rentalBicycleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRentalCarSizeObject() {
		return rentalCarSizeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RentalFactory getRentalFactory() {
		return (RentalFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		rentalBicycleEClass = createEClass(RENTAL_BICYCLE);
		createEAttribute(rentalBicycleEClass, RENTAL_BICYCLE__TYPE);
		createEReference(rentalBicycleEClass, RENTAL_BICYCLE__MANUFACTURER);

		currencyEClass = createEClass(CURRENCY);
		createEAttribute(currencyEClass, CURRENCY__CODE);

		rentalCarEClass = createEClass(RENTAL_CAR);
		createEAttribute(rentalCarEClass, RENTAL_CAR__SIZE);

		rentalContractEClass = createEClass(RENTAL_CONTRACT);
		createEAttribute(rentalContractEClass, RENTAL_CONTRACT__RENT_TO_BUSINESS_PARTNER);
		createEAttribute(rentalContractEClass, RENTAL_CONTRACT__START_DATE);
		createEAttribute(rentalContractEClass, RENTAL_CONTRACT__END_DATE);
		createEAttribute(rentalContractEClass, RENTAL_CONTRACT__COST);
		createEReference(rentalContractEClass, RENTAL_CONTRACT__RENTAL_UNITS);
		createEReference(rentalContractEClass, RENTAL_CONTRACT__CURRENCY);

		rentalUnitEClass = createEClass(RENTAL_UNIT);
		createEAttribute(rentalUnitEClass, RENTAL_UNIT__DESCRIPTION);

		manufacturerEClass = createEClass(MANUFACTURER);
		createEAttribute(manufacturerEClass, MANUFACTURER__CODE);
		createEAttribute(manufacturerEClass, MANUFACTURER__TRUSTED);

		// Create enums
		rentalBicycleTypeEEnum = createEEnum(RENTAL_BICYCLE_TYPE);
		rentalCarSizeEEnum = createEEnum(RENTAL_CAR_SIZE);

		// Create data types
		dateEDataType = createEDataType(DATE);
		rentalBicycleTypeObjectEDataType = createEDataType(RENTAL_BICYCLE_TYPE_OBJECT);
		rentalCarSizeObjectEDataType = createEDataType(RENTAL_CAR_SIZE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		rentalBicycleEClass.getESuperTypes().add(this.getRentalUnit());
		rentalCarEClass.getESuperTypes().add(this.getRentalUnit());

		// Initialize classes and features; add operations and parameters
		initEClass(rentalBicycleEClass, RentalBicycle.class, "RentalBicycle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRentalBicycle_Type(), this.getRentalBicycleType(), "type", "Standard", 1, 1, RentalBicycle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRentalBicycle_Manufacturer(), this.getManufacturer(), null, "manufacturer", null, 0, 1, RentalBicycle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(currencyEClass, Currency.class, "Currency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCurrency_Code(), theXMLTypePackage.getString(), "code", null, 1, 1, Currency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rentalCarEClass, RentalCar.class, "RentalCar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRentalCar_Size(), this.getRentalCarSize(), "size", "Small", 1, 1, RentalCar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rentalContractEClass, RentalContract.class, "RentalContract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRentalContract_RentToBusinessPartner(), theXMLTypePackage.getString(), "rentToBusinessPartner", null, 1, 1, RentalContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRentalContract_StartDate(), this.getDate(), "startDate", null, 1, 1, RentalContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRentalContract_EndDate(), this.getDate(), "endDate", null, 1, 1, RentalContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRentalContract_Cost(), theXMLTypePackage.getFloat(), "cost", null, 1, 1, RentalContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRentalContract_RentalUnits(), this.getRentalUnit(), null, "rentalUnits", null, 1, -1, RentalContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRentalContract_Currency(), this.getCurrency(), null, "currency", null, 0, 1, RentalContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rentalUnitEClass, RentalUnit.class, "RentalUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRentalUnit_Description(), theXMLTypePackage.getString(), "description", null, 1, 1, RentalUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(manufacturerEClass, Manufacturer.class, "Manufacturer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManufacturer_Code(), theXMLTypePackage.getString(), "code", null, 1, 1, Manufacturer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManufacturer_Trusted(), ecorePackage.getEBooleanObject(), "trusted", null, 0, 1, Manufacturer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(rentalBicycleTypeEEnum, RentalBicycleType.class, "RentalBicycleType");
		addEEnumLiteral(rentalBicycleTypeEEnum, RentalBicycleType.STANDARD);
		addEEnumLiteral(rentalBicycleTypeEEnum, RentalBicycleType.MOUNTAIN_BIKE);

		initEEnum(rentalCarSizeEEnum, RentalCarSize.class, "RentalCarSize");
		addEEnumLiteral(rentalCarSizeEEnum, RentalCarSize.SMALL);
		addEEnumLiteral(rentalCarSizeEEnum, RentalCarSize.MEDIUM);
		addEEnumLiteral(rentalCarSizeEEnum, RentalCarSize.FAMILY);

		// Initialize data types
		initEDataType(dateEDataType, Date.class, "Date", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(rentalBicycleTypeObjectEDataType, RentalBicycleType.class, "RentalBicycleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(rentalCarSizeObjectEDataType, RentalCarSize.class, "RentalCarSizeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// teneo.jpa
		createTeneoAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (dateEDataType, 
		   source, 
		   new String[] {
			 "name", "Date"
		   });		
		addAnnotation
		  (rentalBicycleEClass, 
		   source, 
		   new String[] {
			 "name", "RentalBicycle",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRentalBicycle_Type(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "type"
		   });		
		addAnnotation
		  (rentalBicycleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "RentalBicycleType"
		   });		
		addAnnotation
		  (rentalBicycleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "RentalBicycleType:Object",
			 "baseType", "RentalBicycleType"
		   });		
		addAnnotation
		  (getCurrency_Code(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (rentalCarEClass, 
		   source, 
		   new String[] {
			 "name", "RentalCar",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRentalCar_Size(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "size"
		   });		
		addAnnotation
		  (rentalCarSizeEEnum, 
		   source, 
		   new String[] {
			 "name", "RentalCarSize"
		   });		
		addAnnotation
		  (rentalCarSizeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "RentalCarSize:Object",
			 "baseType", "RentalCarSize"
		   });		
		addAnnotation
		  (rentalContractEClass, 
		   source, 
		   new String[] {
			 "name", "RentalContract",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRentalContract_RentToBusinessPartner(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rentToBusinessPartner"
		   });		
		addAnnotation
		  (getRentalContract_StartDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "startDate"
		   });		
		addAnnotation
		  (getRentalContract_EndDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "endDate"
		   });		
		addAnnotation
		  (getRentalContract_Cost(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cost"
		   });		
		addAnnotation
		  (getRentalContract_RentalUnits(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rentalUnits"
		   });			
		addAnnotation
		  (rentalUnitEClass, 
		   source, 
		   new String[] {
			 "name", "RentalUnit",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRentalUnit_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description"
		   });			
		addAnnotation
		  (getManufacturer_Code(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });
	}

	/**
	 * Initializes the annotations for <b>teneo.jpa</b>.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTeneoAnnotations() {
		String source = "teneo.jpa";																		
		addAnnotation
		  (getRentalContract_Currency(), 
		   source, 
		   new String[] {
			 "value", "@ManyToOne(fetch=LAZY)"
		   });				
		addAnnotation
		  (getRentalUnit_Description(), 
		   source, 
		   new String[] {
			 "appinfo", "@Id"
		   });	
	}

} // RentalPackageImpl
