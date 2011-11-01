/**
 * <copyright>
 * </copyright>
 *
 * $Id: Relation1to1Factory.java,v 1.2 2007/02/08 23:09:24 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.relation.relation1to1;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Relation1to1Package
 * @generated
 */
public interface Relation1to1Factory extends EFactory{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Relation1to1Factory eINSTANCE = org.eclipse.emf.teneo.samples.emf.relation.relation1to1.impl.Relation1to1FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Contained Child NR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contained Child NR</em>'.
	 * @generated
	 */
	ContainedChildNR createContainedChildNR();

	/**
	 * Returns a new object of class '<em>Contained Child R</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contained Child R</em>'.
	 * @generated
	 */
	ContainedChildR createContainedChildR();

	/**
	 * Returns a new object of class '<em>Main</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Main</em>'.
	 * @generated
	 */
	Main createMain();

	/**
	 * Returns a new object of class '<em>Not Contained Child NR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Contained Child NR</em>'.
	 * @generated
	 */
	NotContainedChildNR createNotContainedChildNR();

	/**
	 * Returns a new object of class '<em>Not Contained Child NRT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Contained Child NRT</em>'.
	 * @generated
	 */
	NotContainedChildNRT createNotContainedChildNRT();

	/**
	 * Returns a new object of class '<em>Not Contained Child NRTNR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Contained Child NRTNR</em>'.
	 * @generated
	 */
	NotContainedChildNRTNR createNotContainedChildNRTNR();

	/**
	 * Returns a new object of class '<em>Not Contained Child R</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Contained Child R</em>'.
	 * @generated
	 */
	NotContainedChildR createNotContainedChildR();

	/**
	 * Returns a new object of class '<em>Not Contained Child RTNR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Contained Child RTNR</em>'.
	 * @generated
	 */
	NotContainedChildRTNR createNotContainedChildRTNR();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Relation1to1Package getRelation1to1Package();

} //Relation1to1Factory
