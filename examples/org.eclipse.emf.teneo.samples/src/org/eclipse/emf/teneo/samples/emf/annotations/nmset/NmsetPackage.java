/**
 * <copyright>
 * </copyright>
 *
 * $Id: NmsetPackage.java,v 1.1 2006/07/11 16:56:59 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.nmset;

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
 * @see org.eclipse.emf.teneo.samples.emf.annotations.nmset.NmsetFactory
 * @model kind="package"
 * @generated
 */
public interface NmsetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "nmset";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/emf/annotations/nmset";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nmset";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NmsetPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.annotations.nmset.impl.NmsetPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.nmset.impl.MyItemImpl <em>My Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.nmset.impl.MyItemImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.nmset.impl.NmsetPackageImpl#getMyItem()
	 * @generated
	 */
	int MY_ITEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_ITEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Your Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_ITEM__YOUR_ITEM = 1;

	/**
	 * The number of structural features of the '<em>My Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_ITEM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.nmset.impl.YourItemImpl <em>Your Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.nmset.impl.YourItemImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.nmset.impl.NmsetPackageImpl#getYourItem()
	 * @generated
	 */
	int YOUR_ITEM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOUR_ITEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>My Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOUR_ITEM__MY_ITEM = 1;

	/**
	 * The number of structural features of the '<em>Your Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOUR_ITEM_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.nmset.MyItem <em>My Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>My Item</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.nmset.MyItem
	 * @generated
	 */
	EClass getMyItem();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.nmset.MyItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.nmset.MyItem#getName()
	 * @see #getMyItem()
	 * @generated
	 */
	EAttribute getMyItem_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.emf.annotations.nmset.MyItem#getYourItem <em>Your Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Your Item</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.nmset.MyItem#getYourItem()
	 * @see #getMyItem()
	 * @generated
	 */
	EReference getMyItem_YourItem();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.nmset.YourItem <em>Your Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Your Item</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.nmset.YourItem
	 * @generated
	 */
	EClass getYourItem();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.nmset.YourItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.nmset.YourItem#getName()
	 * @see #getYourItem()
	 * @generated
	 */
	EAttribute getYourItem_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.emf.annotations.nmset.YourItem#getMyItem <em>My Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>My Item</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.nmset.YourItem#getMyItem()
	 * @see #getYourItem()
	 * @generated
	 */
	EReference getYourItem_MyItem();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NmsetFactory getNmsetFactory();

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
	interface Literals  {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.nmset.impl.MyItemImpl <em>My Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.nmset.impl.MyItemImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.nmset.impl.NmsetPackageImpl#getMyItem()
		 * @generated
		 */
		EClass MY_ITEM = eINSTANCE.getMyItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MY_ITEM__NAME = eINSTANCE.getMyItem_Name();

		/**
		 * The meta object literal for the '<em><b>Your Item</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MY_ITEM__YOUR_ITEM = eINSTANCE.getMyItem_YourItem();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.nmset.impl.YourItemImpl <em>Your Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.nmset.impl.YourItemImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.nmset.impl.NmsetPackageImpl#getYourItem()
		 * @generated
		 */
		EClass YOUR_ITEM = eINSTANCE.getYourItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YOUR_ITEM__NAME = eINSTANCE.getYourItem_Name();

		/**
		 * The meta object literal for the '<em><b>My Item</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YOUR_ITEM__MY_ITEM = eINSTANCE.getYourItem_MyItem();

	}

} //NmsetPackage
