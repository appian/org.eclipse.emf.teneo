/**
 * <copyright>
 * </copyright>
 *
 * $Id: AppleFactory.java,v 1.1 2007/07/09 12:55:20 mtaal Exp $
 */
package tc.apple;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tc.apple.ApplePackage
 * @generated
 */
public interface AppleFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AppleFactory eINSTANCE = tc.apple.impl.AppleFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Apples Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apples Root</em>'.
	 * @generated
	 */
	ApplesRoot createApplesRoot();

	/**
	 * Returns a new object of class '<em>Stem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stem</em>'.
	 * @generated
	 */
	AppleStem createAppleStem();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Fruit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fruit</em>'.
	 * @generated
	 */
	Fruit createFruit();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApplePackage getApplePackage();

} //AppleFactory
