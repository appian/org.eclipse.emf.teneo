/**
 * <copyright>
 * </copyright>
 *
 * $Id: NavFactory.java,v 1.1 2008/03/19 22:25:40 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.nav;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.nav.NavPackage
 * @generated
 */
public interface NavFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NavFactory eINSTANCE = org.eclipse.emf.teneo.samples.issues.nav.impl.NavFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element</em>'.
	 * @generated
	 */
	NavElement createNavElement();

	/**
	 * Returns a new object of class '<em>Navigation Tree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Navigation Tree</em>'.
	 * @generated
	 */
	NavigationTree createNavigationTree();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NavPackage getNavPackage();

} //NavFactory
