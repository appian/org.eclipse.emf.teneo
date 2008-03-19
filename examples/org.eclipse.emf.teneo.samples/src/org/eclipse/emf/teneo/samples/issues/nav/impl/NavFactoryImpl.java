/**
 * <copyright>
 * </copyright>
 *
 * $Id: NavFactoryImpl.java,v 1.1 2008/03/19 22:25:40 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.nav.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.teneo.samples.issues.nav.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NavFactoryImpl extends EFactoryImpl implements NavFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NavFactory init() {
		try {
			NavFactory theNavFactory = (NavFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.ibm.com/websphere/appserver/schemas/6.0/ibm-portal-nav.xsd"); 
			if (theNavFactory != null) {
				return theNavFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NavFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case NavPackage.NAV_ELEMENT: return createNavElement();
			case NavPackage.NAVIGATION_TREE: return createNavigationTree();
			case NavPackage.PAGE_PARAMS: return createPageParams();
			case NavPackage.RENDER_PARAM: return createRenderParam();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavElement createNavElement() {
		NavElementImpl navElement = new NavElementImpl();
		return navElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationTree createNavigationTree() {
		NavigationTreeImpl navigationTree = new NavigationTreeImpl();
		return navigationTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageParams createPageParams() {
		PageParamsImpl pageParams = new PageParamsImpl();
		return pageParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenderParam createRenderParam() {
		RenderParamImpl renderParam = new RenderParamImpl();
		return renderParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavPackage getNavPackage() {
		return (NavPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NavPackage getPackage() {
		return NavPackage.eINSTANCE;
	}

} //NavFactoryImpl
