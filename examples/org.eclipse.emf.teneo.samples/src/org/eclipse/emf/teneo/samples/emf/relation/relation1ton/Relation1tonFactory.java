/**
 * <copyright>
 * </copyright>
 *
 * $Id: Relation1tonFactory.java,v 1.1 2006/07/11 16:57:14 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.relation.relation1ton;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Relation1tonPackage
 * @generated
 */
public interface Relation1tonFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Relation1tonFactory eINSTANCE = org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.Relation1tonFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Main</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Main</em>'.
	 * @generated
	 */
	Main createMain();

	/**
	 * Returns a new object of class '<em>One CN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>One CN</em>'.
	 * @generated
	 */
	OneCN createOneCN();

	/**
	 * Returns a new object of class '<em>One CR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>One CR</em>'.
	 * @generated
	 */
	OneCR createOneCR();

	/**
	 * Returns a new object of class '<em>One NN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>One NN</em>'.
	 * @generated
	 */
	OneNN createOneNN();

	/**
	 * Returns a new object of class '<em>One NR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>One NR</em>'.
	 * @generated
	 */
	OneNR createOneNR();

	/**
	 * Returns a new object of class '<em>Two CN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Two CN</em>'.
	 * @generated
	 */
	TwoCN createTwoCN();

	/**
	 * Returns a new object of class '<em>Two CR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Two CR</em>'.
	 * @generated
	 */
	TwoCR createTwoCR();

	/**
	 * Returns a new object of class '<em>Two NN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Two NN</em>'.
	 * @generated
	 */
	TwoNN createTwoNN();

	/**
	 * Returns a new object of class '<em>Two NR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Two NR</em>'.
	 * @generated
	 */
	TwoNR createTwoNR();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Relation1tonPackage getRelation1tonPackage();

} //Relation1tonFactory
