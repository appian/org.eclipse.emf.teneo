/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestinheritanceFactory.java,v 1.1.2.2 2007/03/18 22:34:03 mtaal Exp $
 */
package testinheritance;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see testinheritance.TestinheritancePackage
 * @generated
 */
public interface TestinheritanceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestinheritanceFactory eINSTANCE = testinheritance.impl.TestinheritanceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Some Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Some Resource</em>'.
	 * @generated
	 */
	SomeResource createSomeResource();

	/**
	 * Returns a new object of class '<em>Some Base Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Some Base Class</em>'.
	 * @generated
	 */
	SomeBaseClass createSomeBaseClass();

	/**
	 * Returns a new object of class '<em>Some Other Base Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Some Other Base Class</em>'.
	 * @generated
	 */
	SomeOtherBaseClass createSomeOtherBaseClass();

	/**
	 * Returns a new object of class '<em>Name Value Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Name Value Pair</em>'.
	 * @generated
	 */
	NameValuePair createNameValuePair();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TestinheritancePackage getTestinheritancePackage();

} //TestinheritanceFactory
