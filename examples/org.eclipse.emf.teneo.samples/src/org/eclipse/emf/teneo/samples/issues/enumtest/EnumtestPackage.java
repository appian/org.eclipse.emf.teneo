/**
 * <copyright>
 * </copyright>
 *
 * $Id: EnumtestPackage.java,v 1.1 2006/07/11 16:57:03 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.enumtest;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.eclipse.emf.teneo.samples.issues.enumtest.EnumtestFactory
 * @model kind="package"
 * @generated
 */
public interface EnumtestPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "enumtest";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/issues/enumtest";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "enumtest";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnumtestPackage eINSTANCE = org.eclipse.emf.teneo.samples.issues.enumtest.impl.EnumtestPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.enumtest.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.enumtest.impl.ItemImpl
	 * @see org.eclipse.emf.teneo.samples.issues.enumtest.impl.EnumtestPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 0;

	/**
	 * The feature id for the '<em><b>Item Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ITEM_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Nullable Item Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__NULLABLE_ITEM_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.enumtest.ItemType <em>Item Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.enumtest.ItemType
	 * @see org.eclipse.emf.teneo.samples.issues.enumtest.impl.EnumtestPackageImpl#getItemType()
	 * @generated
	 */
	int ITEM_TYPE = 1;

	/**
	 * The meta object id for the '<em>Item Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.enumtest.ItemType
	 * @see org.eclipse.emf.teneo.samples.issues.enumtest.impl.EnumtestPackageImpl#getItemTypeObject()
	 * @generated
	 */
	int ITEM_TYPE_OBJECT = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.enumtest.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.enumtest.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.enumtest.Item#getItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.enumtest.Item#getItemType()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_ItemType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.enumtest.Item#getNullableItemType <em>Nullable Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable Item Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.enumtest.Item#getNullableItemType()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_NullableItemType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.samples.issues.enumtest.ItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Item Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.enumtest.ItemType
	 * @generated
	 */
	EEnum getItemType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.samples.issues.enumtest.ItemType <em>Item Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Item Type Object</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.enumtest.ItemType
	 * @model instanceClass="org.eclipse.emf.teneo.samples.issues.enumtest.ItemType"
	 *        extendedMetaData="name='ItemType:Object' baseType='ItemType'" 
	 * @generated
	 */
	EDataType getItemTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EnumtestFactory getEnumtestFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.enumtest.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.enumtest.impl.ItemImpl
		 * @see org.eclipse.emf.teneo.samples.issues.enumtest.impl.EnumtestPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Item Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__ITEM_TYPE = eINSTANCE.getItem_ItemType();

		/**
		 * The meta object literal for the '<em><b>Nullable Item Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__NULLABLE_ITEM_TYPE = eINSTANCE.getItem_NullableItemType();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.enumtest.ItemType <em>Item Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.enumtest.ItemType
		 * @see org.eclipse.emf.teneo.samples.issues.enumtest.impl.EnumtestPackageImpl#getItemType()
		 * @generated
		 */
		EEnum ITEM_TYPE = eINSTANCE.getItemType();

		/**
		 * The meta object literal for the '<em>Item Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.enumtest.ItemType
		 * @see org.eclipse.emf.teneo.samples.issues.enumtest.impl.EnumtestPackageImpl#getItemTypeObject()
		 * @generated
		 */
		EDataType ITEM_TYPE_OBJECT = eINSTANCE.getItemTypeObject();

	}

} //EnumtestPackage
