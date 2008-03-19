/**
 * <copyright>
 * </copyright>
 *
 * $Id: TopPackageImpl.java,v 1.1 2008/03/19 22:25:40 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.top.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.teneo.samples.issues.nav.NavPackage;

import org.eclipse.emf.teneo.samples.issues.nav.impl.NavPackageImpl;

import org.eclipse.emf.teneo.samples.issues.top.ApplicationDefinition;
import org.eclipse.emf.teneo.samples.issues.top.DocumentRoot;
import org.eclipse.emf.teneo.samples.issues.top.NavigationElement;
import org.eclipse.emf.teneo.samples.issues.top.PageParams;
import org.eclipse.emf.teneo.samples.issues.top.RenderParam;
import org.eclipse.emf.teneo.samples.issues.top.Top;
import org.eclipse.emf.teneo.samples.issues.top.TopFactory;
import org.eclipse.emf.teneo.samples.issues.top.TopPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TopPackageImpl extends EPackageImpl implements TopPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationDefinitionEClass = null;

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
	private EClass navigationElementEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.issues.top.TopPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TopPackageImpl() {
		super(eNS_URI, TopFactory.eINSTANCE);
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
	public static TopPackage init() {
		if (isInited) return (TopPackage)EPackage.Registry.INSTANCE.getEPackage(TopPackage.eNS_URI);

		// Obtain or create and register package
		TopPackageImpl theTopPackage = (TopPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof TopPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new TopPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		NavPackageImpl theNavPackage = (NavPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NavPackage.eNS_URI) instanceof NavPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NavPackage.eNS_URI) : NavPackage.eINSTANCE);

		// Create package meta-data objects
		theTopPackage.createPackageContents();
		theNavPackage.createPackageContents();

		// Initialize created meta-data
		theTopPackage.initializePackageContents();
		theNavPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTopPackage.freeze();

		return theTopPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationDefinition() {
		return applicationDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationDefinition_Title() {
		return (EAttribute)applicationDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationDefinition_Description() {
		return (EAttribute)applicationDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationDefinition_NavigationElement() {
		return (EReference)applicationDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationDefinition_AppID() {
		return (EAttribute)applicationDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationDefinition_Version() {
		return (EAttribute)applicationDefinitionEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getDocumentRoot_Top() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavigationElement() {
		return navigationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNavigationElement_Title() {
		return (EAttribute)navigationElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNavigationElement_Description() {
		return (EAttribute)navigationElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavigationElement_PageParams() {
		return (EReference)navigationElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNavigationElement_UniqueName() {
		return (EAttribute)navigationElementEClass.getEStructuralFeatures().get(3);
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
	public EClass getTop() {
		return topEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTop_ApplicationDefinition() {
		return (EReference)topEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopFactory getTopFactory() {
		return (TopFactory)getEFactoryInstance();
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
		applicationDefinitionEClass = createEClass(APPLICATION_DEFINITION);
		createEAttribute(applicationDefinitionEClass, APPLICATION_DEFINITION__TITLE);
		createEAttribute(applicationDefinitionEClass, APPLICATION_DEFINITION__DESCRIPTION);
		createEReference(applicationDefinitionEClass, APPLICATION_DEFINITION__NAVIGATION_ELEMENT);
		createEAttribute(applicationDefinitionEClass, APPLICATION_DEFINITION__APP_ID);
		createEAttribute(applicationDefinitionEClass, APPLICATION_DEFINITION__VERSION);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TOP);

		navigationElementEClass = createEClass(NAVIGATION_ELEMENT);
		createEAttribute(navigationElementEClass, NAVIGATION_ELEMENT__TITLE);
		createEAttribute(navigationElementEClass, NAVIGATION_ELEMENT__DESCRIPTION);
		createEReference(navigationElementEClass, NAVIGATION_ELEMENT__PAGE_PARAMS);
		createEAttribute(navigationElementEClass, NAVIGATION_ELEMENT__UNIQUE_NAME);

		pageParamsEClass = createEClass(PAGE_PARAMS);
		createEReference(pageParamsEClass, PAGE_PARAMS__RENDER_PARAM);
		createEAttribute(pageParamsEClass, PAGE_PARAMS__PAGE_HEADER);

		renderParamEClass = createEClass(RENDER_PARAM);
		createEAttribute(renderParamEClass, RENDER_PARAM__NAME);
		createEAttribute(renderParamEClass, RENDER_PARAM__VALUE);

		topEClass = createEClass(TOP);
		createEReference(topEClass, TOP__APPLICATION_DEFINITION);
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
		initEClass(applicationDefinitionEClass, ApplicationDefinition.class, "ApplicationDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicationDefinition_Title(), theXMLTypePackage.getString(), "title", null, 1, 1, ApplicationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationDefinition_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, ApplicationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationDefinition_NavigationElement(), this.getNavigationElement(), null, "navigationElement", null, 0, -1, ApplicationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationDefinition_AppID(), theXMLTypePackage.getToken(), "appID", null, 1, 1, ApplicationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationDefinition_Version(), theXMLTypePackage.getString(), "version", null, 1, 1, ApplicationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Top(), theXMLTypePackage.getAnySimpleType(), "top", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(navigationElementEClass, NavigationElement.class, "NavigationElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNavigationElement_Title(), theXMLTypePackage.getString(), "title", null, 0, 1, NavigationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNavigationElement_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, NavigationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNavigationElement_PageParams(), this.getPageParams(), null, "pageParams", null, 0, 1, NavigationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNavigationElement_UniqueName(), theXMLTypePackage.getID(), "uniqueName", null, 1, 1, NavigationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageParamsEClass, PageParams.class, "PageParams", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPageParams_RenderParam(), this.getRenderParam(), null, "renderParam", null, 0, -1, PageParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPageParams_PageHeader(), theXMLTypePackage.getString(), "pageHeader", null, 0, -1, PageParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(renderParamEClass, RenderParam.class, "RenderParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRenderParam_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, RenderParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRenderParam_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, RenderParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topEClass, Top.class, "Top", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTop_ApplicationDefinition(), this.getApplicationDefinition(), null, "applicationDefinition", null, 1, -1, Top.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (applicationDefinitionEClass, 
		   source, 
		   new String[] {
			 "name", "ApplicationDefinition",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getApplicationDefinition_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getApplicationDefinition_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getApplicationDefinition_NavigationElement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "navigation-element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getApplicationDefinition_AppID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "appID"
		   });		
		addAnnotation
		  (getApplicationDefinition_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version"
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
		  (getDocumentRoot_Top(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "top",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (navigationElementEClass, 
		   source, 
		   new String[] {
			 "name", "NavigationElement",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNavigationElement_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNavigationElement_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNavigationElement_PageParams(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "page-params",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNavigationElement_UniqueName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "uniqueName"
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
		addAnnotation
		  (topEClass, 
		   source, 
		   new String[] {
			 "name", "Top",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTop_ApplicationDefinition(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "application-definition",
			 "namespace", "##targetNamespace"
		   });
	}

} //TopPackageImpl
