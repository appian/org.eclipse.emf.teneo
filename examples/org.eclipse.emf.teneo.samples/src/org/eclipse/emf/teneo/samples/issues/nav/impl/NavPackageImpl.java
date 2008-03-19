/**
 * <copyright>
 * </copyright>
 *
 * $Id: NavPackageImpl.java,v 1.1 2008/03/19 22:25:40 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.nav.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.teneo.samples.issues.nav.NavElement;
import org.eclipse.emf.teneo.samples.issues.nav.NavFactory;
import org.eclipse.emf.teneo.samples.issues.nav.NavPackage;
import org.eclipse.emf.teneo.samples.issues.nav.NavigationTree;
import org.eclipse.emf.teneo.samples.issues.nav.PageParams;
import org.eclipse.emf.teneo.samples.issues.nav.RenderParam;

import org.eclipse.emf.teneo.samples.issues.top.TopPackage;

import org.eclipse.emf.teneo.samples.issues.top.impl.TopPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NavPackageImpl extends EPackageImpl implements NavPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationTreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageParamsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass renderParamEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.issues.nav.NavPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NavPackageImpl() {
		super(eNS_URI, NavFactory.eINSTANCE);
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
	public static NavPackage init() {
		if (isInited) return (NavPackage)EPackage.Registry.INSTANCE.getEPackage(NavPackage.eNS_URI);

		// Obtain or create and register package
		NavPackageImpl theNavPackage = (NavPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof NavPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new NavPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		TopPackageImpl theTopPackage = (TopPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TopPackage.eNS_URI) instanceof TopPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TopPackage.eNS_URI) : TopPackage.eINSTANCE);

		// Create package meta-data objects
		theNavPackage.createPackageContents();
		theTopPackage.createPackageContents();

		// Initialize created meta-data
		theNavPackage.initializePackageContents();
		theTopPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNavPackage.freeze();

		return theNavPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavElement() {
		return navElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNavElement_Title() {
		return (EAttribute)navElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNavElement_Description() {
		return (EAttribute)navElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavElement_PageParams() {
		return (EReference)navElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNavElement_ModuleID() {
		return (EAttribute)navElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNavElement_UniqueName() {
		return (EAttribute)navElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavigationTree() {
		return navigationTreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavigationTree_NavElement() {
		return (EReference)navigationTreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageParams() {
		return pageParamsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageParams_RenderParam() {
		return (EReference)pageParamsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageParams_PageHeader() {
		return (EAttribute)pageParamsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRenderParam() {
		return renderParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenderParam_Name() {
		return (EAttribute)renderParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenderParam_Value() {
		return (EAttribute)renderParamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavFactory getNavFactory() {
		return (NavFactory)getEFactoryInstance();
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
		navElementEClass = createEClass(NAV_ELEMENT);
		createEAttribute(navElementEClass, NAV_ELEMENT__TITLE);
		createEAttribute(navElementEClass, NAV_ELEMENT__DESCRIPTION);
		createEReference(navElementEClass, NAV_ELEMENT__PAGE_PARAMS);
		createEAttribute(navElementEClass, NAV_ELEMENT__MODULE_ID);
		createEAttribute(navElementEClass, NAV_ELEMENT__UNIQUE_NAME);

		navigationTreeEClass = createEClass(NAVIGATION_TREE);
		createEReference(navigationTreeEClass, NAVIGATION_TREE__NAV_ELEMENT);

		pageParamsEClass = createEClass(PAGE_PARAMS);
		createEReference(pageParamsEClass, PAGE_PARAMS__RENDER_PARAM);
		createEAttribute(pageParamsEClass, PAGE_PARAMS__PAGE_HEADER);

		renderParamEClass = createEClass(RENDER_PARAM);
		createEAttribute(renderParamEClass, RENDER_PARAM__NAME);
		createEAttribute(renderParamEClass, RENDER_PARAM__VALUE);
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
		initEClass(navElementEClass, NavElement.class, "NavElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNavElement_Title(), theXMLTypePackage.getString(), "title", null, 0, 1, NavElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNavElement_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, NavElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNavElement_PageParams(), this.getPageParams(), null, "pageParams", null, 0, 1, NavElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNavElement_ModuleID(), theXMLTypePackage.getString(), "moduleID", null, 1, 1, NavElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNavElement_UniqueName(), theXMLTypePackage.getString(), "uniqueName", null, 0, 1, NavElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(navigationTreeEClass, NavigationTree.class, "NavigationTree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNavigationTree_NavElement(), this.getNavElement(), null, "navElement", null, 0, -1, NavigationTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageParamsEClass, PageParams.class, "PageParams", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPageParams_RenderParam(), this.getRenderParam(), null, "renderParam", null, 0, -1, PageParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPageParams_PageHeader(), theXMLTypePackage.getString(), "pageHeader", null, 0, -1, PageParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(renderParamEClass, RenderParam.class, "RenderParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRenderParam_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, RenderParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRenderParam_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, RenderParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.w3.org/XML/1998/namespace
		createNamespaceAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.w3.org/XML/1998/namespace</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNamespaceAnnotations() {
		String source = "http://www.w3.org/XML/1998/namespace";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "lang", "en"
		   });														
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
		  (navElementEClass, 
		   source, 
		   new String[] {
			 "name", "NavElement",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNavElement_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNavElement_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNavElement_PageParams(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "page-params",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNavElement_ModuleID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "moduleID"
		   });		
		addAnnotation
		  (getNavElement_UniqueName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "uniqueName"
		   });		
		addAnnotation
		  (navigationTreeEClass, 
		   source, 
		   new String[] {
			 "name", "NavigationTree",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNavigationTree_NavElement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "nav-element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (pageParamsEClass, 
		   source, 
		   new String[] {
			 "name", "PageParams",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPageParams_RenderParam(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "render-param",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPageParams_PageHeader(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "page-header",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (renderParamEClass, 
		   source, 
		   new String[] {
			 "name", "RenderParam",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getRenderParam_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getRenderParam_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });
	}

} //NavPackageImpl
