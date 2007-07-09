/**
 * <copyright>
 * </copyright>
 *
 * $Id: TreeFactory.java,v 1.1 2007/07/09 12:55:20 mtaal Exp $
 */
package tc.tree;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tc.tree.TreePackage
 * @generated
 */
public interface TreeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TreeFactory eINSTANCE = tc.tree.impl.TreeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Big Tree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Big Tree</em>'.
	 * @generated
	 */
	BigTree createBigTree();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TreePackage getTreePackage();

} //TreeFactory
