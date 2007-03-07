/**
 * <copyright>
 * </copyright>
 *
 * $Id: RepresantationsPackageImpl.java,v 1.1 2007/03/07 23:34:08 mtaal Exp $
 */
package datacore.represantations.impl;

import datacore.DatacorePackage;

import datacore.impl.DatacorePackageImpl;

import datacore.represantations.CSMFileRepresentation;
import datacore.represantations.CSMUrlRepresentation;
import datacore.represantations.RepresantationsFactory;
import datacore.represantations.RepresantationsPackage;

import datacore.types.TypesPackage;

import datacore.types.impl.TypesPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RepresantationsPackageImpl extends EPackageImpl implements RepresantationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csmFileRepresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csmUrlRepresentationEClass = null;

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
	 * @see datacore.represantations.RepresantationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RepresantationsPackageImpl() {
		super(eNS_URI, RepresantationsFactory.eINSTANCE);
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
	public static RepresantationsPackage init() {
		if (isInited) return (RepresantationsPackage)EPackage.Registry.INSTANCE.getEPackage(RepresantationsPackage.eNS_URI);

		// Obtain or create and register package
		RepresantationsPackageImpl theRepresantationsPackage = (RepresantationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof RepresantationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new RepresantationsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DatacorePackageImpl theDatacorePackage = (DatacorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatacorePackage.eNS_URI) instanceof DatacorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatacorePackage.eNS_URI) : DatacorePackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theRepresantationsPackage.createPackageContents();
		theDatacorePackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theRepresantationsPackage.initializePackageContents();
		theDatacorePackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRepresantationsPackage.freeze();

		return theRepresantationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSMFileRepresentation() {
		return csmFileRepresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSMFileRepresentation_Location() {
		return (EAttribute)csmFileRepresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSMUrlRepresentation() {
		return csmUrlRepresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSMUrlRepresentation_Url() {
		return (EAttribute)csmUrlRepresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresantationsFactory getRepresantationsFactory() {
		return (RepresantationsFactory)getEFactoryInstance();
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
		csmFileRepresentationEClass = createEClass(CSM_FILE_REPRESENTATION);
		createEAttribute(csmFileRepresentationEClass, CSM_FILE_REPRESENTATION__LOCATION);

		csmUrlRepresentationEClass = createEClass(CSM_URL_REPRESENTATION);
		createEAttribute(csmUrlRepresentationEClass, CSM_URL_REPRESENTATION__URL);
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
		DatacorePackage theDatacorePackage = (DatacorePackage)EPackage.Registry.INSTANCE.getEPackage(DatacorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		csmFileRepresentationEClass.getESuperTypes().add(theDatacorePackage.getCSMRepresentation());
		csmUrlRepresentationEClass.getESuperTypes().add(theDatacorePackage.getCSMRepresentation());

		// Initialize classes and features; add operations and parameters
		initEClass(csmFileRepresentationEClass, CSMFileRepresentation.class, "CSMFileRepresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCSMFileRepresentation_Location(), ecorePackage.getEString(), "location", null, 0, 1, CSMFileRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(csmUrlRepresentationEClass, CSMUrlRepresentation.class, "CSMUrlRepresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCSMUrlRepresentation_Url(), ecorePackage.getEString(), "url", null, 0, 1, CSMUrlRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //RepresantationsPackageImpl
