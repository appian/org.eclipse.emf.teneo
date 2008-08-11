/**
 * <copyright>
 * </copyright>
 *
 * $Id: HibernateFactory.java,v 1.2 2008/08/11 20:40:39 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.hibernate;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.annotations.hibernate.HibernatePackage
 * @generated
 */
public interface HibernateFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HibernateFactory eINSTANCE = org.eclipse.emf.teneo.samples.emf.annotations.hibernate.impl.HibernateFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>City</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>City</em>'.
	 * @generated
	 */
	City createCity();

	/**
	 * Returns a new object of class '<em>Street</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Street</em>'.
	 * @generated
	 */
	Street createStreet();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>State Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Detail</em>'.
	 * @generated
	 */
	StateDetail createStateDetail();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HibernatePackage getHibernatePackage();

} //HibernateFactory
