/**
 * <copyright>
 * </copyright>
 *
 * $Id: TopFactoryImpl.java,v 1.1 2008/03/19 22:25:40 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.top.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.teneo.samples.issues.top.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TopFactoryImpl extends EFactoryImpl implements TopFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TopFactory init() {
		try {
			TopFactory theTopFactory = (TopFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.ibm.com/websphere/appserver/schemas/6.0/ibm-portal-top.xsd"); 
			if (theTopFactory != null) {
				return theTopFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TopFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopFactoryImpl() {
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
			case TopPackage.APPLICATION_DEFINITION: return createApplicationDefinition();
			case TopPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case TopPackage.NAVIGATION_ELEMENT: return createNavigationElement();
			case TopPackage.PAGE_PARAMS: return createPageParams();
			case TopPackage.RENDER_PARAM: return createRenderParam();
			case TopPackage.TOP: return createTop();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationDefinition createApplicationDefinition() {
		ApplicationDefinitionImpl applicationDefinition = new ApplicationDefinitionImpl();
		return applicationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationElement createNavigationElement() {
		NavigationElementImpl navigationElement = new NavigationElementImpl();
		return navigationElement;
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
	public Top createTop() {
		TopImpl top = new TopImpl();
		return top;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopPackage getTopPackage() {
		return (TopPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TopPackage getPackage() {
		return TopPackage.eINSTANCE;
	}

} //TopFactoryImpl
