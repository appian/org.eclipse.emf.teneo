/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.CollectiontableFactory
 * @model kind="package"
 * @generated
 */
public interface CollectiontablePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "collectiontable";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/emf/jpa2/collectiontable";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "collectiontable";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CollectiontablePackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.impl.CollectiontablePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.impl.ItemImpl
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.impl.CollectiontablePackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 0;

	/**
	 * The feature id for the '<em><b>Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__NAMES = 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ITEMS = 1;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.impl.EmbeddedItemImpl <em>Embedded Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.impl.EmbeddedItemImpl
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.impl.CollectiontablePackageImpl#getEmbeddedItem()
	 * @generated
	 */
	int EMBEDDED_ITEM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_ITEM__NAME = 0;

	/**
	 * The number of structural features of the '<em>Embedded Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_ITEM_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.Item#getNames <em>Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Names</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.Item#getNames()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Names();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.Item#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Items</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.Item#getItems()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Items();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.EmbeddedItem <em>Embedded Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Embedded Item</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.EmbeddedItem
	 * @generated
	 */
	EClass getEmbeddedItem();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.EmbeddedItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.EmbeddedItem#getName()
	 * @see #getEmbeddedItem()
	 * @generated
	 */
	EAttribute getEmbeddedItem_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CollectiontableFactory getCollectiontableFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.impl.ItemImpl
		 * @see org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.impl.CollectiontablePackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__NAMES = eINSTANCE.getItem_Names();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__ITEMS = eINSTANCE.getItem_Items();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.impl.EmbeddedItemImpl <em>Embedded Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.impl.EmbeddedItemImpl
		 * @see org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.impl.CollectiontablePackageImpl#getEmbeddedItem()
		 * @generated
		 */
		EClass EMBEDDED_ITEM = eINSTANCE.getEmbeddedItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBEDDED_ITEM__NAME = eINSTANCE.getEmbeddedItem_Name();

	}

} //CollectiontablePackage
