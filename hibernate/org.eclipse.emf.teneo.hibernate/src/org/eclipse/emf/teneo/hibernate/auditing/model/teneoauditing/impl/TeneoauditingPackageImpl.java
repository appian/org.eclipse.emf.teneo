/**
 */
package org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditCommitInfo;
import org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditKind;
import org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditObject;
import org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingFactory;
import org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class TeneoauditingPackageImpl extends EPackageImpl implements TeneoauditingPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass teneoAuditObjectEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass teneoAuditCommitInfoEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum teneoAuditKindEEnum = null;

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
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TeneoauditingPackageImpl() {
		super(eNS_URI, TeneoauditingFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon
	 * which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link TeneoauditingPackage#eINSTANCE} when that field is
	 * accessed. Clients should not invoke it directly. Instead, they should simply access that field
	 * to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TeneoauditingPackage init() {
		if (isInited)
			return (TeneoauditingPackage) EPackage.Registry.INSTANCE
					.getEPackage(TeneoauditingPackage.eNS_URI);

		// Obtain or create and register package
		TeneoauditingPackageImpl theTeneoauditingPackage = (TeneoauditingPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof TeneoauditingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
				: new TeneoauditingPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTeneoauditingPackage.createPackageContents();

		// Initialize created meta-data
		theTeneoauditingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTeneoauditingPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TeneoauditingPackage.eNS_URI, theTeneoauditingPackage);
		return theTeneoauditingPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getTeneoAuditObject() {
		return teneoAuditObjectEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getTeneoAuditObject_Teneo_audit_id() {
		return (EAttribute) teneoAuditObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getTeneoAuditObject_Teneo_version() {
		return (EAttribute) teneoAuditObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getTeneoAuditObject_Teneo_object_id() {
		return (EAttribute) teneoAuditObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getTeneoAuditObject_Teneo_start() {
		return (EAttribute) teneoAuditObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getTeneoAuditObject_Teneo_end() {
		return (EAttribute) teneoAuditObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getTeneoAuditObject_Teneo_commit_info() {
		return (EReference) teneoAuditObjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getTeneoAuditObject_Teneo_audit_kind() {
		return (EAttribute) teneoAuditObjectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getTeneoAuditCommitInfo() {
		return teneoAuditCommitInfoEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getTeneoAuditCommitInfo_Id() {
		return (EAttribute) teneoAuditCommitInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getTeneoAuditCommitInfo_Version() {
		return (EAttribute) teneoAuditCommitInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getTeneoAuditCommitInfo_User() {
		return (EAttribute) teneoAuditCommitInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getTeneoAuditCommitInfo_Comment() {
		return (EAttribute) teneoAuditCommitInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getTeneoAuditKind() {
		return teneoAuditKindEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TeneoauditingFactory getTeneoauditingFactory() {
		return (TeneoauditingFactory) getEFactoryInstance();
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
		teneoAuditObjectEClass = createEClass(TENEO_AUDIT_OBJECT);
		createEAttribute(teneoAuditObjectEClass, TENEO_AUDIT_OBJECT__TENEO_AUDIT_ID);
		createEAttribute(teneoAuditObjectEClass, TENEO_AUDIT_OBJECT__TENEO_VERSION);
		createEAttribute(teneoAuditObjectEClass, TENEO_AUDIT_OBJECT__TENEO_OBJECT_ID);
		createEAttribute(teneoAuditObjectEClass, TENEO_AUDIT_OBJECT__TENEO_START);
		createEAttribute(teneoAuditObjectEClass, TENEO_AUDIT_OBJECT__TENEO_END);
		createEReference(teneoAuditObjectEClass, TENEO_AUDIT_OBJECT__TENEO_COMMIT_INFO);
		createEAttribute(teneoAuditObjectEClass, TENEO_AUDIT_OBJECT__TENEO_AUDIT_KIND);

		teneoAuditCommitInfoEClass = createEClass(TENEO_AUDIT_COMMIT_INFO);
		createEAttribute(teneoAuditCommitInfoEClass, TENEO_AUDIT_COMMIT_INFO__ID);
		createEAttribute(teneoAuditCommitInfoEClass, TENEO_AUDIT_COMMIT_INFO__VERSION);
		createEAttribute(teneoAuditCommitInfoEClass, TENEO_AUDIT_COMMIT_INFO__USER);
		createEAttribute(teneoAuditCommitInfoEClass, TENEO_AUDIT_COMMIT_INFO__COMMENT);

		// Create enums
		teneoAuditKindEEnum = createEEnum(TENEO_AUDIT_KIND);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(teneoAuditObjectEClass, TeneoAuditObject.class, "TeneoAuditObject", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTeneoAuditObject_Teneo_audit_id(), ecorePackage.getELong(), "teneo_audit_id",
				null, 0, 1, TeneoAuditObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeneoAuditObject_Teneo_version(), ecorePackage.getELong(), "teneo_version",
				null, 0, 1, TeneoAuditObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeneoAuditObject_Teneo_object_id(), ecorePackage.getEString(),
				"teneo_object_id", null, 0, 1, TeneoAuditObject.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeneoAuditObject_Teneo_start(), ecorePackage.getELong(), "teneo_start", null,
				0, 1, TeneoAuditObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeneoAuditObject_Teneo_end(), ecorePackage.getELong(), "teneo_end", null, 0,
				1, TeneoAuditObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeneoAuditObject_Teneo_commit_info(), this.getTeneoAuditCommitInfo(), null,
				"teneo_commit_info", null, 1, 1, TeneoAuditObject.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTeneoAuditObject_Teneo_audit_kind(), this.getTeneoAuditKind(),
				"teneo_audit_kind", null, 1, 1, TeneoAuditObject.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(teneoAuditCommitInfoEClass, TeneoAuditCommitInfo.class, "TeneoAuditCommitInfo",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTeneoAuditCommitInfo_Id(), ecorePackage.getELong(), "id", null, 0, 1,
				TeneoAuditCommitInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeneoAuditCommitInfo_Version(), ecorePackage.getELong(), "version", null, 0,
				1, TeneoAuditCommitInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeneoAuditCommitInfo_User(), ecorePackage.getEString(), "user", null, 0, 1,
				TeneoAuditCommitInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeneoAuditCommitInfo_Comment(), ecorePackage.getEString(), "comment", null,
				0, 1, TeneoAuditCommitInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(teneoAuditKindEEnum, TeneoAuditKind.class, "TeneoAuditKind");
		addEEnumLiteral(teneoAuditKindEEnum, TeneoAuditKind.ADD);
		addEEnumLiteral(teneoAuditKindEEnum, TeneoAuditKind.UPDATE);
		addEEnumLiteral(teneoAuditKindEEnum, TeneoAuditKind.DELETE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// teneo.jpa
		createTeneoAnnotations();
	}

	/**
	 * Initializes the annotations for <b>teneo.jpa</b>. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createTeneoAnnotations() {
		String source = "teneo.jpa";
		addAnnotation(teneoAuditObjectEClass, source, new String[] { "value", "@MappedSuperclass" });
		addAnnotation(getTeneoAuditObject_Teneo_audit_id(), source, new String[] { "value",
				"@Id\n@GeneratedValue" });
		addAnnotation(getTeneoAuditObject_Teneo_version(), source, new String[] { "value", "@Version" });
		addAnnotation(getTeneoAuditCommitInfo_Id(), source, new String[] { "value",
				"@Id\n@GeneratedValue" });
		addAnnotation(getTeneoAuditCommitInfo_Version(), source, new String[] { "value", "@Version" });
		addAnnotation(getTeneoAuditCommitInfo_Comment(), source, new String[] { "value", "@Lob" });
	}

} // TeneoauditingPackageImpl
