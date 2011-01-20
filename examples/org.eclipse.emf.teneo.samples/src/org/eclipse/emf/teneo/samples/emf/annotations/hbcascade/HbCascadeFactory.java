/**
 * <copyright>
 * </copyright>
 *
 * $Id: HbCascadeFactory.java,v 1.1 2011/01/20 17:13:16 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.hbcascade;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbcascade.HbCascadePackage
 * @generated
 */
public interface HbCascadeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HbCascadeFactory eINSTANCE = org.eclipse.emf.teneo.samples.emf.annotations.hbcascade.impl.HbCascadeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Parent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parent</em>'.
	 * @generated
	 */
	Parent createParent();

	/**
	 * Returns a new object of class '<em>Child</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Child</em>'.
	 * @generated
	 */
	Child createChild();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HbCascadePackage getHbCascadePackage();

} //HbCascadeFactory
