/**
 * <copyright>
 * </copyright>
 *
 * $Id: LargemapvalueFactory.java,v 1.1 2008/04/11 03:21:47 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.largemapvalue;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.largemapvalue.LargemapvaluePackage
 * @generated
 */
public interface LargemapvalueFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LargemapvalueFactory eINSTANCE = org.eclipse.emf.teneo.samples.issues.largemapvalue.impl.LargemapvalueFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Test Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Element</em>'.
	 * @generated
	 */
	TestElement createTestElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LargemapvaluePackage getLargemapvaluePackage();

} //LargemapvalueFactory
