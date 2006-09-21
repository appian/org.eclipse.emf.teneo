/**
 * <copyright>
 * </copyright>
 *
 * $Id: MainFactory.java,v 1.1 2006/09/21 00:56:52 mtaal Exp $
 */
package main;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see main.MainPackage
 * @generated
 */
public interface MainFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MainFactory eINSTANCE = main.impl.MainFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Child Object2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Child Object2</em>'.
	 * @generated
	 */
	ChildObject2 createChildObject2();

	/**
	 * Returns a new object of class '<em>Child Object1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Child Object1</em>'.
	 * @generated
	 */
	ChildObject1 createChildObject1();

	/**
	 * Returns a new object of class '<em>Base Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base Object</em>'.
	 * @generated
	 */
	BaseObject createBaseObject();

	/**
	 * Returns a new object of class '<em>Base Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base Group</em>'.
	 * @generated
	 */
	BaseGroup createBaseGroup();

	/**
	 * Returns a new object of class '<em>Base Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base Component</em>'.
	 * @generated
	 */
	BaseComponent createBaseComponent();

	/**
	 * Returns a new object of class '<em>Child Object3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Child Object3</em>'.
	 * @generated
	 */
	ChildObject3 createChildObject3();

	/**
	 * Returns a new object of class '<em>Child Object4</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Child Object4</em>'.
	 * @generated
	 */
	ChildObject4 createChildObject4();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MainPackage getMainPackage();

} //MainFactory
