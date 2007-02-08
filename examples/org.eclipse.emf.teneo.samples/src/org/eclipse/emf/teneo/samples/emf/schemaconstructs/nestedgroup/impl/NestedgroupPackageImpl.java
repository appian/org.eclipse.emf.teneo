/**
 * <copyright>
 * </copyright>
 *
 * $Id: NestedgroupPackageImpl.java,v 1.2 2007/02/08 23:09:17 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.nestedgroup.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.nestedgroup.CType;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.nestedgroup.Element;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.nestedgroup.NestedgroupFactory;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.nestedgroup.NestedgroupPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NestedgroupPackageImpl extends EPackageImpl implements NestedgroupPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.nestedgroup.NestedgroupPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NestedgroupPackageImpl() {
		super(eNS_URI, NestedgroupFactory.eINSTANCE);
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
	public static NestedgroupPackage init() {
		if (isInited) return (NestedgroupPackage)EPackage.Registry.INSTANCE.getEPackage(NestedgroupPackage.eNS_URI);

		// Obtain or create and register package
		NestedgroupPackageImpl theNestedgroupPackage = (NestedgroupPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof NestedgroupPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new NestedgroupPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theNestedgroupPackage.createPackageContents();

		// Initialize created meta-data
		theNestedgroupPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNestedgroupPackage.freeze();

		return theNestedgroupPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getA() {
		return aEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA_Name() {
		return (EAttribute)aEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA_Group() {
		return (EAttribute)aEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA_B() {
		return (EAttribute)aEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getA_C() {
		return (EReference)aEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCType() {
		return cTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCType_Cname() {
		return (EAttribute)cTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCType_Cvalue() {
		return (EAttribute)cTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Mixed() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Name() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_True() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_C() {
		return (EReference)elementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Recursive() {
		return (EReference)elementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedgroupFactory getNestedgroupFactory() {
		return (NestedgroupFactory)getEFactoryInstance();
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
		aEClass = createEClass(A);
		createEAttribute(aEClass, A__NAME);
		createEAttribute(aEClass, A__GROUP);
		createEAttribute(aEClass, A__B);
		createEReference(aEClass, A__C);

		cTypeEClass = createEClass(CTYPE);
		createEAttribute(cTypeEClass, CTYPE__CNAME);
		createEAttribute(cTypeEClass, CTYPE__CVALUE);

		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__MIXED);
		createEAttribute(elementEClass, ELEMENT__NAME);
		createEAttribute(elementEClass, ELEMENT__TRUE);
		createEReference(elementEClass, ELEMENT__C);
		createEReference(elementEClass, ELEMENT__RECURSIVE);
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
		initEClass(aEClass, org.eclipse.emf.teneo.samples.emf.schemaconstructs.nestedgroup.A.class, "A", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getA_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, org.eclipse.emf.teneo.samples.emf.schemaconstructs.nestedgroup.A.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getA_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, org.eclipse.emf.teneo.samples.emf.schemaconstructs.nestedgroup.A.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getA_B(), theXMLTypePackage.getString(), "b", null, 0, -1, org.eclipse.emf.teneo.samples.emf.schemaconstructs.nestedgroup.A.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getA_C(), this.getCType(), null, "c", null, 0, -1, org.eclipse.emf.teneo.samples.emf.schemaconstructs.nestedgroup.A.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(cTypeEClass, CType.class, "CType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCType_Cname(), theXMLTypePackage.getString(), "cname", null, 1, 1, CType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCType_Cvalue(), theXMLTypePackage.getDouble(), "cvalue", null, 1, 1, CType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Element.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_True(), ecorePackage.getEFeatureMapEntry(), "true", null, 1, -1, Element.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getElement_C(), this.getCType(), null, "c", null, 1, -1, Element.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Recursive(), this.getElement(), null, "recursive", null, 1, 1, Element.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

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
		  (aEClass, 
		   source, 
		   new String[] {
			 "name", "A",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getA_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getA_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });		
		addAnnotation
		  (getA_B(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "B",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getA_C(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "C",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (cTypeEClass, 
		   source, 
		   new String[] {
			 "name", "cType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCType_Cname(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cname"
		   });		
		addAnnotation
		  (getCType_Cvalue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cvalue"
		   });		
		addAnnotation
		  (elementEClass, 
		   source, 
		   new String[] {
			 "name", "element",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getElement_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getElement_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getElement_True(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "C:group"
		   });		
		addAnnotation
		  (getElement_C(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "C",
			 "group", "#C:group"
		   });		
		addAnnotation
		  (getElement_Recursive(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "recursive"
		   });
	}

} //NestedgroupPackageImpl
