/**
 */
package org.eclipse.emf.teneo.samples.issues.simplearray;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.eclipse.emf.teneo.samples.issues.simplearray.SimplearrayFactory
 * @model kind="package"
 * @generated
 */
public interface SimplearrayPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simplearray";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/issues/simplearray";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simplearray";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimplearrayPackage eINSTANCE = org.eclipse.emf.teneo.samples.issues.simplearray.impl.SimplearrayPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.simplearray.impl.SimpleListImpl <em>Simple List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.simplearray.impl.SimpleListImpl
	 * @see org.eclipse.emf.teneo.samples.issues.simplearray.impl.SimplearrayPackageImpl#getSimpleList()
	 * @generated
	 */
	int SIMPLE_LIST = 0;

	/**
	 * The feature id for the '<em><b>Int Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LIST__INT_ARRAY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LIST__NAME = 1;

	/**
	 * The number of structural features of the '<em>Simple List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LIST_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '<em>Int</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see org.eclipse.emf.teneo.samples.issues.simplearray.impl.SimplearrayPackageImpl#getInt()
	 * @generated
	 */
	int INT = 1;

	/**
	 * The meta object id for the '<em>Int Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.simplearray.impl.SimplearrayPackageImpl#getIntArray()
	 * @generated
	 */
	int INT_ARRAY = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.simplearray.SimpleList <em>Simple List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple List</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.simplearray.SimpleList
	 * @generated
	 */
	EClass getSimpleList();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.simplearray.SimpleList#getIntArray <em>Int Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int Array</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.simplearray.SimpleList#getIntArray()
	 * @see #getSimpleList()
	 * @generated
	 */
	EAttribute getSimpleList_IntArray();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.simplearray.SimpleList#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.simplearray.SimpleList#getName()
	 * @see #getSimpleList()
	 * @generated
	 */
	EAttribute getSimpleList_Name();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Int</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="name='Int'"
	 * @generated
	 */
	EDataType getInt();

	/**
	 * Returns the meta object for data type '<em>Int Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Int Array</em>'.
	 * @model instanceClass="int[]"
	 *        extendedMetaData="name='IntArray'"
	 * @generated
	 */
	EDataType getIntArray();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimplearrayFactory getSimplearrayFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.simplearray.impl.SimpleListImpl <em>Simple List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.simplearray.impl.SimpleListImpl
		 * @see org.eclipse.emf.teneo.samples.issues.simplearray.impl.SimplearrayPackageImpl#getSimpleList()
		 * @generated
		 */
		EClass SIMPLE_LIST = eINSTANCE.getSimpleList();

		/**
		 * The meta object literal for the '<em><b>Int Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_LIST__INT_ARRAY = eINSTANCE.getSimpleList_IntArray();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_LIST__NAME = eINSTANCE.getSimpleList_Name();

		/**
		 * The meta object literal for the '<em>Int</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see org.eclipse.emf.teneo.samples.issues.simplearray.impl.SimplearrayPackageImpl#getInt()
		 * @generated
		 */
		EDataType INT = eINSTANCE.getInt();

		/**
		 * The meta object literal for the '<em>Int Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.simplearray.impl.SimplearrayPackageImpl#getIntArray()
		 * @generated
		 */
		EDataType INT_ARRAY = eINSTANCE.getIntArray();

	}

} //SimplearrayPackage
