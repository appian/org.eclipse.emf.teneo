/**
 * <copyright>
 * </copyright>
 *
 * $Id: AnytypeFactory.java,v 1.2 2007/02/08 23:09:26 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.AnytypePackage
 * @generated
 */
public interface AnytypeFactory extends EFactory{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnytypeFactory eINSTANCE = org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.impl.AnytypeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>A</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>A</em>'.
	 * @generated
	 */
	A createA();

	/**
	 * Returns a new object of class '<em>B</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>B</em>'.
	 * @generated
	 */
	B createB();

	/**
	 * Returns a new object of class '<em>Test Any</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Any</em>'.
	 * @generated
	 */
	TestAny createTestAny();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AnytypePackage getAnytypePackage();

} //AnytypeFactory
