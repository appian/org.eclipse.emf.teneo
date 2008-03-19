/**
 * <copyright>
 * </copyright>
 *
 * $Id: NavPackage.java,v 1.1 2008/03/19 22:25:40 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.nav;

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
 * @see org.eclipse.emf.teneo.samples.issues.nav.NavFactory
 * @model kind="package"
 *        annotation="http://www.w3.org/XML/1998/namespace lang='en'"
 * @generated
 */
public interface NavPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "nav";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ibm.com/websphere/appserver/schemas/6.0/ibm-portal-nav.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nav";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NavPackage eINSTANCE = org.eclipse.emf.teneo.samples.issues.nav.impl.NavPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.nav.impl.NavElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.nav.impl.NavElementImpl
	 * @see org.eclipse.emf.teneo.samples.issues.nav.impl.NavPackageImpl#getNavElement()
	 * @generated
	 */
	int NAV_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_ELEMENT__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_ELEMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Page Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_ELEMENT__PAGE_PARAMS = 2;

	/**
	 * The feature id for the '<em><b>Module ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_ELEMENT__MODULE_ID = 3;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_ELEMENT__UNIQUE_NAME = 4;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_ELEMENT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.nav.impl.NavigationTreeImpl <em>Navigation Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.nav.impl.NavigationTreeImpl
	 * @see org.eclipse.emf.teneo.samples.issues.nav.impl.NavPackageImpl#getNavigationTree()
	 * @generated
	 */
	int NAVIGATION_TREE = 1;

	/**
	 * The feature id for the '<em><b>Nav Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_TREE__NAV_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Navigation Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_TREE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.nav.impl.PageParamsImpl <em>Page Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.nav.impl.PageParamsImpl
	 * @see org.eclipse.emf.teneo.samples.issues.nav.impl.NavPackageImpl#getPageParams()
	 * @generated
	 */
	int PAGE_PARAMS = 2;

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
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.nav.impl.RenderParamImpl <em>Render Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.nav.impl.RenderParamImpl
	 * @see org.eclipse.emf.teneo.samples.issues.nav.impl.NavPackageImpl#getRenderParam()
	 * @generated
	 */
	int RENDER_PARAM = 3;

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
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.nav.NavElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nav.NavElement
	 * @generated
	 */
	EClass getNavElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.nav.NavElement#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nav.NavElement#getTitle()
	 * @see #getNavElement()
	 * @generated
	 */
	EAttribute getNavElement_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.nav.NavElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nav.NavElement#getDescription()
	 * @see #getNavElement()
	 * @generated
	 */
	EAttribute getNavElement_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.issues.nav.NavElement#getPageParams <em>Page Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Page Params</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nav.NavElement#getPageParams()
	 * @see #getNavElement()
	 * @generated
	 */
	EReference getNavElement_PageParams();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.nav.NavElement#getModuleID <em>Module ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module ID</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nav.NavElement#getModuleID()
	 * @see #getNavElement()
	 * @generated
	 */
	EAttribute getNavElement_ModuleID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.nav.NavElement#getUniqueName <em>Unique Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nav.NavElement#getUniqueName()
	 * @see #getNavElement()
	 * @generated
	 */
	EAttribute getNavElement_UniqueName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.nav.NavigationTree <em>Navigation Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation Tree</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nav.NavigationTree
	 * @generated
	 */
	EClass getNavigationTree();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.issues.nav.NavigationTree#getNavElement <em>Nav Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nav Element</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nav.NavigationTree#getNavElement()
	 * @see #getNavigationTree()
	 * @generated
	 */
	EReference getNavigationTree_NavElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.nav.PageParams <em>Page Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Params</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nav.PageParams
	 * @generated
	 */
	EClass getPageParams();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.issues.nav.PageParams#getRenderParam <em>Render Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Render Param</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nav.PageParams#getRenderParam()
	 * @see #getPageParams()
	 * @generated
	 */
	EReference getPageParams_RenderParam();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.issues.nav.PageParams#getPageHeader <em>Page Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Page Header</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nav.PageParams#getPageHeader()
	 * @see #getPageParams()
	 * @generated
	 */
	EAttribute getPageParams_PageHeader();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.nav.RenderParam <em>Render Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Render Param</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nav.RenderParam
	 * @generated
	 */
	EClass getRenderParam();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.nav.RenderParam#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nav.RenderParam#getName()
	 * @see #getRenderParam()
	 * @generated
	 */
	EAttribute getRenderParam_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.nav.RenderParam#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nav.RenderParam#getValue()
	 * @see #getRenderParam()
	 * @generated
	 */
	EAttribute getRenderParam_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NavFactory getNavFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.nav.impl.NavElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.nav.impl.NavElementImpl
		 * @see org.eclipse.emf.teneo.samples.issues.nav.impl.NavPackageImpl#getNavElement()
		 * @generated
		 */
		EClass NAV_ELEMENT = eINSTANCE.getNavElement();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAV_ELEMENT__TITLE = eINSTANCE.getNavElement_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAV_ELEMENT__DESCRIPTION = eINSTANCE.getNavElement_Description();

		/**
		 * The meta object literal for the '<em><b>Page Params</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAV_ELEMENT__PAGE_PARAMS = eINSTANCE.getNavElement_PageParams();

		/**
		 * The meta object literal for the '<em><b>Module ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAV_ELEMENT__MODULE_ID = eINSTANCE.getNavElement_ModuleID();

		/**
		 * The meta object literal for the '<em><b>Unique Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAV_ELEMENT__UNIQUE_NAME = eINSTANCE.getNavElement_UniqueName();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.nav.impl.NavigationTreeImpl <em>Navigation Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.nav.impl.NavigationTreeImpl
		 * @see org.eclipse.emf.teneo.samples.issues.nav.impl.NavPackageImpl#getNavigationTree()
		 * @generated
		 */
		EClass NAVIGATION_TREE = eINSTANCE.getNavigationTree();

		/**
		 * The meta object literal for the '<em><b>Nav Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION_TREE__NAV_ELEMENT = eINSTANCE.getNavigationTree_NavElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.nav.impl.PageParamsImpl <em>Page Params</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.nav.impl.PageParamsImpl
		 * @see org.eclipse.emf.teneo.samples.issues.nav.impl.NavPackageImpl#getPageParams()
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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.nav.impl.RenderParamImpl <em>Render Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.nav.impl.RenderParamImpl
		 * @see org.eclipse.emf.teneo.samples.issues.nav.impl.NavPackageImpl#getRenderParam()
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

	}

} //NavPackage
