/**
 * <copyright>
 * </copyright>
 *
 * $Id: TopFactory.java,v 1.1 2008/03/19 22:25:40 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.top;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.top.TopPackage
 * @generated
 */
public interface TopFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TopFactory eINSTANCE = org.eclipse.emf.teneo.samples.issues.top.impl.TopFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Application Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Definition</em>'.
	 * @generated
	 */
	ApplicationDefinition createApplicationDefinition();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Navigation Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Navigation Element</em>'.
	 * @generated
	 */
	NavigationElement createNavigationElement();

	/**
	 * Returns a new object of class '<em>Page Params</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page Params</em>'.
	 * @generated
	 */
	PageParams createPageParams();

	/**
	 * Returns a new object of class '<em>Render Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Render Param</em>'.
	 * @generated
	 */
	RenderParam createRenderParam();

	/**
	 * Returns a new object of class '<em>Top</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Top</em>'.
	 * @generated
	 */
	Top createTop();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TopPackage getTopPackage();

} //TopFactory
