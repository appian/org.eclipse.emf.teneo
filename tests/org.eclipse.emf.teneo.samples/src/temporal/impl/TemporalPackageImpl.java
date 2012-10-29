/**
 * <copyright>
 * </copyright>
 *
 * $Id: TemporalPackageImpl.java,v 1.1 2008/04/17 11:33:39 mtaal Exp $
 */
package temporal.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import temporal.Temporal;
import temporal.TemporalFactory;
import temporal.TemporalPackage;
import temporal.VersionHolder;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class TemporalPackageImpl extends EPackageImpl implements TemporalPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass temporalEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass versionHolderEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType eBooleanArrayEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package package URI
	 * value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init
	 * init()}, which also performs initialization of the package, or returns the registered package,
	 * if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see temporal.TemporalPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TemporalPackageImpl() {
		super(eNS_URI, TemporalFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon
	 * which it depends. Simple dependencies are satisfied by calling this method on all dependent
	 * packages before doing anything else. This method drives initialization for interdependent
	 * packages directly, in parallel with this package, itself.
	 * <p>
	 * Of this package and its interdependencies, all packages which have not yet been registered by
	 * their URI values are first created and registered. The packages are then initialized in two
	 * steps: meta-model objects for all of the packages are created before any are initialized, since
	 * one package's meta-model objects may refer to those of another.
	 * <p>
	 * Invocation of this method will not affect any packages that have already been initialized. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TemporalPackage init() {
		if (isInited)
			return (TemporalPackage) EPackage.Registry.INSTANCE.getEPackage(TemporalPackage.eNS_URI);

		// Obtain or create and register package
		TemporalPackageImpl theTemporalPackage = (TemporalPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI) instanceof TemporalPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI) : new TemporalPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTemporalPackage.createPackageContents();

		// Initialize created meta-data
		theTemporalPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTemporalPackage.freeze();

		return theTemporalPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getTemporal() {
		return temporalEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getTemporal_Date() {
		return (EAttribute) temporalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getTemporal_TouchedAttributes() {
		return (EAttribute) temporalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getTemporal_Continuity() {
		return (EAttribute) temporalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getTemporal_VersionHolder() {
		return (EReference) temporalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getTemporal_VersionHolderContainment() {
		return (EReference) temporalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getVersionHolder() {
		return versionHolderEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getVersionHolder_Versions() {
		return (EReference) versionHolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getVersionHolder_IndexOfContinuity() {
		return (EAttribute) versionHolderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getEBooleanArray() {
		return eBooleanArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TemporalFactory getTemporalFactory() {
		return (TemporalFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to have no affect on any
	 * invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		temporalEClass = createEClass(TEMPORAL);
		createEAttribute(temporalEClass, TEMPORAL__DATE);
		createEAttribute(temporalEClass, TEMPORAL__TOUCHED_ATTRIBUTES);
		createEAttribute(temporalEClass, TEMPORAL__CONTINUITY);
		createEReference(temporalEClass, TEMPORAL__VERSION_HOLDER);
		createEReference(temporalEClass, TEMPORAL__VERSION_HOLDER_CONTAINMENT);

		versionHolderEClass = createEClass(VERSION_HOLDER);
		createEReference(versionHolderEClass, VERSION_HOLDER__VERSIONS);
		createEAttribute(versionHolderEClass, VERSION_HOLDER__INDEX_OF_CONTINUITY);

		// Create data types
		eBooleanArrayEDataType = createEDataType(EBOOLEAN_ARRAY);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This method is guarded to have
	 * no affect on any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(temporalEClass, Temporal.class, "Temporal", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemporal_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Temporal.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTemporal_TouchedAttributes(), ecorePackage.getEByteArray(),
				"touchedAttributes", null, 0, 1, Temporal.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemporal_Continuity(), ecorePackage.getEBoolean(), "continuity", "true", 0,
				1, Temporal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTemporal_VersionHolder(), this.getVersionHolder(),
				this.getVersionHolder_Versions(), "versionHolder", null, 0, 1, Temporal.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemporal_VersionHolderContainment(), this.getVersionHolder(), null,
				"versionHolderContainment", null, 0, 1, Temporal.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		EOperation op = addEOperation(temporalEClass, this.getTemporal(), "versionAt", 0, 1);
		addEParameter(op, ecorePackage.getEDate(), "date", 0, 1);

		addEOperation(temporalEClass, this.getTemporal(), "createVersion", 0, 1);

		op = addEOperation(temporalEClass, ecorePackage.getEBoolean(), "isDateWithinVersion", 0, 1);
		addEParameter(op, ecorePackage.getEDate(), "date", 0, 1);

		addEOperation(temporalEClass, this.getTemporal(), "continuity", 0, 1);

		addEOperation(temporalEClass, this.getTemporal(), "currentVersion", 0, 1);

		addEOperation(temporalEClass, ecorePackage.getEEList(), "versions", 0, 1);

		initEClass(versionHolderEClass, VersionHolder.class, "VersionHolder", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVersionHolder_Versions(), this.getTemporal(),
				this.getTemporal_VersionHolder(), "versions", null, 0, -1, VersionHolder.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersionHolder_IndexOfContinuity(), ecorePackage.getEInt(),
				"indexOfContinuity", "0", 0, 1, VersionHolder.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(eBooleanArrayEDataType, boolean[].class, "EBooleanArray", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} // TemporalPackageImpl
