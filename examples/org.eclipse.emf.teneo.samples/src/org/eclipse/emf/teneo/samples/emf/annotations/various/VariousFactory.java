/**
 * <copyright>
 * </copyright>
 *
 * $Id: VariousFactory.java,v 1.1 2008/07/12 13:09:07 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.various;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.annotations.various.VariousPackage
 * @generated
 */
public interface VariousFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VariousFactory eINSTANCE = org.eclipse.emf.teneo.samples.emf.annotations.various.impl.VariousFactoryImpl.init();

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
	 * Returns a new object of class '<em>Immutable City</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immutable City</em>'.
	 * @generated
	 */
	ImmutableCity createImmutableCity();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VariousPackage getVariousPackage();

} //VariousFactory
