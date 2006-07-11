/**
 * <copyright>
 * </copyright>
 *
 * $Id: TransientsuperPackageImpl.java,v 1.1 2006/07/11 16:57:16 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.transientsuper.impl;

import java.io.Serializable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.teneo.samples.issues.transientsuper.PBaseObject;
import org.eclipse.emf.teneo.samples.issues.transientsuper.PVersionObject;
import org.eclipse.emf.teneo.samples.issues.transientsuper.TransientsuperFactory;
import org.eclipse.emf.teneo.samples.issues.transientsuper.TransientsuperPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransientsuperPackageImpl extends EPackageImpl implements TransientsuperPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pBaseObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serializableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pVersionObjectEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.issues.transientsuper.TransientsuperPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TransientsuperPackageImpl() {
		super(eNS_URI, TransientsuperFactory.eINSTANCE);
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
	public static TransientsuperPackage init() {
		if (isInited) return (TransientsuperPackage)EPackage.Registry.INSTANCE.getEPackage(TransientsuperPackage.eNS_URI);

		// Obtain or create and register package
		TransientsuperPackageImpl theTransientsuperPackage = (TransientsuperPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof TransientsuperPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new TransientsuperPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTransientsuperPackage.createPackageContents();

		// Initialize created meta-data
		theTransientsuperPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTransientsuperPackage.freeze();

		return theTransientsuperPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPBaseObject() {
		return pBaseObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPBaseObject_Id() {
		return (EAttribute)pBaseObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPBaseObject_Name() {
		return (EAttribute)pBaseObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPBaseObject_Children() {
		return (EReference)pBaseObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSerializable() {
		return serializableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPVersionObject() {
		return pVersionObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPVersionObject_VersionNumber() {
		return (EAttribute)pVersionObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPVersionObject_Comment() {
		return (EAttribute)pVersionObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransientsuperFactory getTransientsuperFactory() {
		return (TransientsuperFactory)getEFactoryInstance();
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
		pBaseObjectEClass = createEClass(PBASE_OBJECT);
		createEAttribute(pBaseObjectEClass, PBASE_OBJECT__ID);
		createEAttribute(pBaseObjectEClass, PBASE_OBJECT__NAME);
		createEReference(pBaseObjectEClass, PBASE_OBJECT__CHILDREN);

		serializableEClass = createEClass(SERIALIZABLE);

		pVersionObjectEClass = createEClass(PVERSION_OBJECT);
		createEAttribute(pVersionObjectEClass, PVERSION_OBJECT__VERSION_NUMBER);
		createEAttribute(pVersionObjectEClass, PVERSION_OBJECT__COMMENT);
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

		// Add supertypes to classes
		pBaseObjectEClass.getESuperTypes().add(this.getSerializable());
		pVersionObjectEClass.getESuperTypes().add(this.getPBaseObject());

		// Initialize classes and features; add operations and parameters
		initEClass(pBaseObjectEClass, PBaseObject.class, "PBaseObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPBaseObject_Id(), ecorePackage.getEString(), "id", null, 0, 1, PBaseObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPBaseObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, PBaseObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPBaseObject_Children(), this.getPBaseObject(), null, "children", "", 0, -1, PBaseObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serializableEClass, Serializable.class, "Serializable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(pVersionObjectEClass, PVersionObject.class, "PVersionObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPVersionObject_VersionNumber(), ecorePackage.getEInt(), "versionNumber", null, 0, 1, PVersionObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPVersionObject_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, PVersionObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://ejb.elver.org/Column
		createColumnAnnotations();
		// http://ejb.elver.org/OneToMany
		createOneToManyAnnotations();
		// http://ejb.elver.org/Transient
		createTransientAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://ejb.elver.org/Column</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createColumnAnnotations() {
		String source = "http://ejb.elver.org/Column";		
		addAnnotation
		  (getPBaseObject_Name(), 
		   source, 
		   new String[] {
			 "length", "255"
		   });				
		addAnnotation
		  (getPVersionObject_Comment(), 
		   source, 
		   new String[] {
			 "length", "4000"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://ejb.elver.org/OneToMany</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOneToManyAnnotations() {
		String source = "http://ejb.elver.org/OneToMany";			
		addAnnotation
		  (getPBaseObject_Children(), 
		   source, 
		   new String[] {
			 "cascade", "MERGE PERSIST REFRESH REMOVE"
		   });		
	}

	/**
	 * Initializes the annotations for <b>http://ejb.elver.org/Transient</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTransientAnnotations() {
		String source = "http://ejb.elver.org/Transient";				
		addAnnotation
		  (serializableEClass, 
		   source, 
		   new String[] {
		   });	
	}

} //TransientsuperPackageImpl
