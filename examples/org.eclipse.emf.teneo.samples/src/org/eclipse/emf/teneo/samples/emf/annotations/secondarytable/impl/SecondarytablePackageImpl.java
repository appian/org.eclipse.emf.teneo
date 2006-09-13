/**
 * <copyright>
 * </copyright>
 *
 * $Id: SecondarytablePackageImpl.java,v 1.3 2006/09/13 10:39:43 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.Printer;
import org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.SecondarytableFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.SecondarytablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecondarytablePackageImpl extends EPackageImpl implements SecondarytablePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass printerEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.SecondarytablePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SecondarytablePackageImpl() {
		super(eNS_URI, SecondarytableFactory.eINSTANCE);
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
	public static SecondarytablePackage init() {
		if (isInited) return (SecondarytablePackage)EPackage.Registry.INSTANCE.getEPackage(SecondarytablePackage.eNS_URI);

		// Obtain or create and register package
		SecondarytablePackageImpl theSecondarytablePackage = (SecondarytablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof SecondarytablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new SecondarytablePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSecondarytablePackage.createPackageContents();

		// Initialize created meta-data
		theSecondarytablePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSecondarytablePackage.freeze();

		return theSecondarytablePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrinter() {
		return printerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrinter_Make() {
		return (EAttribute)printerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrinter_Model() {
		return (EAttribute)printerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrinter_TonerMake() {
		return (EAttribute)printerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrinter_TonerModel() {
		return (EAttribute)printerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecondarytableFactory getSecondarytableFactory() {
		return (SecondarytableFactory)getEFactoryInstance();
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
		printerEClass = createEClass(PRINTER);
		createEAttribute(printerEClass, PRINTER__MAKE);
		createEAttribute(printerEClass, PRINTER__MODEL);
		createEAttribute(printerEClass, PRINTER__TONER_MAKE);
		createEAttribute(printerEClass, PRINTER__TONER_MODEL);
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

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(printerEClass, Printer.class, "Printer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrinter_Make(), theXMLTypePackage.getString(), "make", null, 1, 1, Printer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrinter_Model(), theXMLTypePackage.getString(), "model", null, 1, 1, Printer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrinter_TonerMake(), theXMLTypePackage.getString(), "tonerMake", null, 1, 1, Printer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrinter_TonerModel(), theXMLTypePackage.getString(), "tonerModel", null, 1, 1, Printer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// teneo.jpa
		createTeneoAnnotations();
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
		  (printerEClass, 
		   source, 
		   new String[] {
			 "name", "Printer",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPrinter_Make(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "make"
		   });		
		addAnnotation
		  (getPrinter_Model(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "model"
		   });			
		addAnnotation
		  (getPrinter_TonerMake(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tonerMake"
		   });			
		addAnnotation
		  (getPrinter_TonerModel(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tonerModel"
		   });
	}

	/**
	 * Initializes the annotations for <b>teneo.jpa</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTeneoAnnotations() {
		String source = "teneo.jpa";		
		addAnnotation
		  (printerEClass, 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t@SecondaryTable(name=\"THETONER\" pkJoinColumns={@PrimaryKeyJoinColumn(name=\"PRINTER_ID\")})\n\t\t"
		   });					
		addAnnotation
		  (getPrinter_TonerMake(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(table=\"THETONER\")"
		   });			
		addAnnotation
		  (getPrinter_TonerModel(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(table=\"THETONER\")"
		   });	
	}

} //SecondarytablePackageImpl
