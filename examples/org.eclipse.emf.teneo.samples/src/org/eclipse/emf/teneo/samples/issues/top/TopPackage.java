/**
 * <copyright>
 * </copyright>
 *
 * $Id: TopPackage.java,v 1.1 2008/03/19 22:25:40 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.top;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.top.TopFactory
 * @model kind="package"
 *        annotation="http://www.w3.org/XML/1998/namespace lang='en'"
 * @generated
 */
public interface TopPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "top";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ibm.com/websphere/appserver/schemas/6.0/ibm-portal-top.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "top";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TopPackage eINSTANCE = org.eclipse.emf.teneo.samples.issues.top.impl.TopPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.top.impl.ApplicationDefinitionImpl <em>Application Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.top.impl.ApplicationDefinitionImpl
	 * @see org.eclipse.emf.teneo.samples.issues.top.impl.TopPackageImpl#getApplicationDefinition()
	 * @generated
	 */
	int APPLICATION_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DEFINITION__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DEFINITION__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Navigation Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DEFINITION__NAVIGATION_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>App ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DEFINITION__APP_ID = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DEFINITION__VERSION = 4;

	/**
	 * The number of structural features of the '<em>Application Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DEFINITION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.top.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.top.impl.DocumentRootImpl
	 * @see org.eclipse.emf.teneo.samples.issues.top.impl.TopPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TOP = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.top.impl.NavigationElementImpl <em>Navigation Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.top.impl.NavigationElementImpl
	 * @see org.eclipse.emf.teneo.samples.issues.top.impl.TopPackageImpl#getNavigationElement()
	 * @generated
	 */
	int NAVIGATION_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_ELEMENT__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_ELEMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Page Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_ELEMENT__PAGE_PARAMS = 2;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_ELEMENT__UNIQUE_NAME = 3;

	/**
	 * The number of structural features of the '<em>Navigation Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.top.impl.PageParamsImpl <em>Page Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.top.impl.PageParamsImpl
	 * @see org.eclipse.emf.teneo.samples.issues.top.impl.TopPackageImpl#getPageParams()
	 * @generated
	 */
	int PAGE_PARAMS = 3;

	/**
	 * The feature id for the '<em><b>Render Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_PARAMS__RENDER_PARAM = 0;

	/**
	 * The feature id for the '<em><b>Page Header</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_PARAMS__PAGE_HEADER = 1;

	/**
	 * The number of structural features of the '<em>Page Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_PARAMS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.top.impl.RenderParamImpl <em>Render Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.top.impl.RenderParamImpl
	 * @see org.eclipse.emf.teneo.samples.issues.top.impl.TopPackageImpl#getRenderParam()
	 * @generated
	 */
	int RENDER_PARAM = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDER_PARAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDER_PARAM__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Render Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDER_PARAM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.top.impl.TopImpl <em>Top</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.top.impl.TopImpl
	 * @see org.eclipse.emf.teneo.samples.issues.top.impl.TopPackageImpl#getTop()
	 * @generated
	 */
	int TOP = 5;

	/**
	 * The feature id for the '<em><b>Application Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP__APPLICATION_DEFINITION = 0;

	/**
	 * The number of structural features of the '<em>Top</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.top.ApplicationDefinition <em>Application Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Definition</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.top.ApplicationDefinition
	 * @generated
	 */
	EClass getApplicationDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.top.ApplicationDefinition#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.top.ApplicationDefinition#getTitle()
	 * @see #getApplicationDefinition()
	 * @generated
	 */
	EAttribute getApplicationDefinition_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.top.ApplicationDefinition#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.top.ApplicationDefinition#getDescription()
	 * @see #getApplicationDefinition()
	 * @generated
	 */
	EAttribute getApplicationDefinition_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.issues.top.ApplicationDefinition#getNavigationElement <em>Navigation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Navigation Element</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.top.ApplicationDefinition#getNavigationElement()
	 * @see #getApplicationDefinition()
	 * @generated
	 */
	EReference getApplicationDefinition_NavigationElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.top.ApplicationDefinition#getAppID <em>App ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App ID</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.top.ApplicationDefinition#getAppID()
	 * @see #getApplicationDefinition()
	 * @generated
	 */
	EAttribute getApplicationDefinition_AppID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.top.ApplicationDefinition#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.top.ApplicationDefinition#getVersion()
	 * @see #getApplicationDefinition()
	 * @generated
	 */
	EAttribute getApplicationDefinition_Version();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.top.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.top.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.issues.top.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.top.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.teneo.samples.issues.top.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.top.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.teneo.samples.issues.top.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.top.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.top.DocumentRoot#getTop <em>Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.top.DocumentRoot#getTop()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Top();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.top.NavigationElement <em>Navigation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation Element</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.top.NavigationElement
	 * @generated
	 */
	EClass getNavigationElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.top.NavigationElement#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.top.NavigationElement#getTitle()
	 * @see #getNavigationElement()
	 * @generated
	 */
	EAttribute getNavigationElement_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.top.NavigationElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.top.NavigationElement#getDescription()
	 * @see #getNavigationElement()
	 * @generated
	 */
	EAttribute getNavigationElement_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.issues.top.NavigationElement#getPageParams <em>Page Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Page Params</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.top.NavigationElement#getPageParams()
	 * @see #getNavigationElement()
	 * @generated
	 */
	EReference getNavigationElement_PageParams();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.top.NavigationElement#getUniqueName <em>Unique Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.top.NavigationElement#getUniqueName()
	 * @see #getNavigationElement()
	 * @generated
	 */
	EAttribute getNavigationElement_UniqueName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.top.PageParams <em>Page Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Params</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.top.PageParams
	 * @generated
	 */
	EClass getPageParams();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.issues.top.PageParams#getRenderParam <em>Render Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Render Param</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.top.PageParams#getRenderParam()
	 * @see #getPageParams()
	 * @generated
	 */
	EReference getPageParams_RenderParam();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.issues.top.PageParams#getPageHeader <em>Page Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Page Header</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.top.PageParams#getPageHeader()
	 * @see #getPageParams()
	 * @generated
	 */
	EAttribute getPageParams_PageHeader();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.top.RenderParam <em>Render Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Render Param</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.top.RenderParam
	 * @generated
	 */
	EClass getRenderParam();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.top.RenderParam#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.top.RenderParam#getName()
	 * @see #getRenderParam()
	 * @generated
	 */
	EAttribute getRenderParam_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.top.RenderParam#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.top.RenderParam#getValue()
	 * @see #getRenderParam()
	 * @generated
	 */
	EAttribute getRenderParam_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.top.Top <em>Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Top</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.top.Top
	 * @generated
	 */
	EClass getTop();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.issues.top.Top#getApplicationDefinition <em>Application Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Application Definition</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.top.Top#getApplicationDefinition()
	 * @see #getTop()
	 * @generated
	 */
	EReference getTop_ApplicationDefinition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TopFactory getTopFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.top.impl.ApplicationDefinitionImpl <em>Application Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.top.impl.ApplicationDefinitionImpl
		 * @see org.eclipse.emf.teneo.samples.issues.top.impl.TopPackageImpl#getApplicationDefinition()
		 * @generated
		 */
		EClass APPLICATION_DEFINITION = eINSTANCE.getApplicationDefinition();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_DEFINITION__TITLE = eINSTANCE.getApplicationDefinition_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_DEFINITION__DESCRIPTION = eINSTANCE.getApplicationDefinition_Description();

		/**
		 * The meta object literal for the '<em><b>Navigation Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_DEFINITION__NAVIGATION_ELEMENT = eINSTANCE.getApplicationDefinition_NavigationElement();

		/**
		 * The meta object literal for the '<em><b>App ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_DEFINITION__APP_ID = eINSTANCE.getApplicationDefinition_AppID();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_DEFINITION__VERSION = eINSTANCE.getApplicationDefinition_Version();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.top.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.top.impl.DocumentRootImpl
		 * @see org.eclipse.emf.teneo.samples.issues.top.impl.TopPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TOP = eINSTANCE.getDocumentRoot_Top();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.top.impl.NavigationElementImpl <em>Navigation Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.top.impl.NavigationElementImpl
		 * @see org.eclipse.emf.teneo.samples.issues.top.impl.TopPackageImpl#getNavigationElement()
		 * @generated
		 */
		EClass NAVIGATION_ELEMENT = eINSTANCE.getNavigationElement();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAVIGATION_ELEMENT__TITLE = eINSTANCE.getNavigationElement_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAVIGATION_ELEMENT__DESCRIPTION = eINSTANCE.getNavigationElement_Description();

		/**
		 * The meta object literal for the '<em><b>Page Params</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION_ELEMENT__PAGE_PARAMS = eINSTANCE.getNavigationElement_PageParams();

		/**
		 * The meta object literal for the '<em><b>Unique Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAVIGATION_ELEMENT__UNIQUE_NAME = eINSTANCE.getNavigationElement_UniqueName();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.top.impl.PageParamsImpl <em>Page Params</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.top.impl.PageParamsImpl
		 * @see org.eclipse.emf.teneo.samples.issues.top.impl.TopPackageImpl#getPageParams()
		 * @generated
		 */
		EClass PAGE_PARAMS = eINSTANCE.getPageParams();

		/**
		 * The meta object literal for the '<em><b>Render Param</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_PARAMS__RENDER_PARAM = eINSTANCE.getPageParams_RenderParam();

		/**
		 * The meta object literal for the '<em><b>Page Header</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE_PARAMS__PAGE_HEADER = eINSTANCE.getPageParams_PageHeader();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.top.impl.RenderParamImpl <em>Render Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.top.impl.RenderParamImpl
		 * @see org.eclipse.emf.teneo.samples.issues.top.impl.TopPackageImpl#getRenderParam()
		 * @generated
		 */
		EClass RENDER_PARAM = eINSTANCE.getRenderParam();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENDER_PARAM__NAME = eINSTANCE.getRenderParam_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENDER_PARAM__VALUE = eINSTANCE.getRenderParam_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.top.impl.TopImpl <em>Top</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.top.impl.TopImpl
		 * @see org.eclipse.emf.teneo.samples.issues.top.impl.TopPackageImpl#getTop()
		 * @generated
		 */
		EClass TOP = eINSTANCE.getTop();

		/**
		 * The meta object literal for the '<em><b>Application Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOP__APPLICATION_DEFINITION = eINSTANCE.getTop_ApplicationDefinition();

	}

} //TopPackage
