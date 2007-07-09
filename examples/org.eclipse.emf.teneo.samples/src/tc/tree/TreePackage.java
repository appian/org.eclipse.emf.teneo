/**
 * <copyright>
 * </copyright>
 *
 * $Id: TreePackage.java,v 1.1 2007/07/09 12:55:20 mtaal Exp $
 */
package tc.tree;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tc.tree.TreeFactory
 * @model kind="package"
 *        annotation="http://www.w3.org/XML/1998/namespace lang='en'"
 * @generated
 */
public interface TreePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tree";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "tc-tree.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tree";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TreePackage eINSTANCE = tc.tree.impl.TreePackageImpl.init();

	/**
	 * The meta object id for the '{@link tc.tree.impl.BigTreeImpl <em>Big Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tc.tree.impl.BigTreeImpl
	 * @see tc.tree.impl.TreePackageImpl#getBigTree()
	 * @generated
	 */
	int BIG_TREE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TREE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Big Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TREE_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link tc.tree.BigTree <em>Big Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Big Tree</em>'.
	 * @see tc.tree.BigTree
	 * @generated
	 */
	EClass getBigTree();

	/**
	 * Returns the meta object for the attribute '{@link tc.tree.BigTree#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tc.tree.BigTree#getName()
	 * @see #getBigTree()
	 * @generated
	 */
	EAttribute getBigTree_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TreeFactory getTreeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tc.tree.impl.BigTreeImpl <em>Big Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tc.tree.impl.BigTreeImpl
		 * @see tc.tree.impl.TreePackageImpl#getBigTree()
		 * @generated
		 */
		EClass BIG_TREE = eINSTANCE.getBigTree();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIG_TREE__NAME = eINSTANCE.getBigTree_Name();

	}

} //TreePackage
