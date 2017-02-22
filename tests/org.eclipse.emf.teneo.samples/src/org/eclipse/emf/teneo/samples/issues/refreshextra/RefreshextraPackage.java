/**
 */
package org.eclipse.emf.teneo.samples.issues.refreshextra;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.RefreshextraFactory
 * @model kind="package"
 * @generated
 */
public interface RefreshextraPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "refreshextra";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/issues/refreshextra";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "refreshextra";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RefreshextraPackage eINSTANCE = org.eclipse.emf.teneo.samples.issues.refreshextra.impl.RefreshextraPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.refreshextra.impl.ItemContainerImpl <em>Item Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.impl.ItemContainerImpl
	 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.impl.RefreshextraPackageImpl#getItemContainer()
	 * @generated
	 */
	int ITEM_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_CONTAINER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_CONTAINER__ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Item Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Item Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.refreshextra.impl.ItemElementImpl <em>Item Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.impl.ItemElementImpl
	 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.impl.RefreshextraPackageImpl#getItemElement()
	 * @generated
	 */
	int ITEM_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Item Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Item Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.refreshextra.impl.ItemNonContainerImpl <em>Item Non Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.impl.ItemNonContainerImpl
	 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.impl.RefreshextraPackageImpl#getItemNonContainer()
	 * @generated
	 */
	int ITEM_NON_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_NON_CONTAINER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_NON_CONTAINER__ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Item Non Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_NON_CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Item Non Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_NON_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.refreshextra.impl.ItemNonContainer2Impl <em>Item Non Container2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.impl.ItemNonContainer2Impl
	 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.impl.RefreshextraPackageImpl#getItemNonContainer2()
	 * @generated
	 */
	int ITEM_NON_CONTAINER2 = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_NON_CONTAINER2__NAME = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_NON_CONTAINER2__ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Item Non Container2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_NON_CONTAINER2_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Item Non Container2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_NON_CONTAINER2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.refreshextra.impl.ItemContainer2Impl <em>Item Container2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.impl.ItemContainer2Impl
	 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.impl.RefreshextraPackageImpl#getItemContainer2()
	 * @generated
	 */
	int ITEM_CONTAINER2 = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_CONTAINER2__NAME = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_CONTAINER2__ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Item Container2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_CONTAINER2_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Item Container2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_CONTAINER2_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.refreshextra.impl.ItemElementBidirImpl <em>Item Element Bidir</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.impl.ItemElementBidirImpl
	 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.impl.RefreshextraPackageImpl#getItemElementBidir()
	 * @generated
	 */
	int ITEM_ELEMENT_BIDIR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ELEMENT_BIDIR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Item</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ELEMENT_BIDIR__ITEM = 1;

	/**
	 * The number of structural features of the '<em>Item Element Bidir</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ELEMENT_BIDIR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Item Element Bidir</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ELEMENT_BIDIR_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.refreshextra.ItemContainer <em>Item Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Container</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.ItemContainer
	 * @generated
	 */
	EClass getItemContainer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.refreshextra.ItemContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.ItemContainer#getName()
	 * @see #getItemContainer()
	 * @generated
	 */
	EAttribute getItemContainer_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.issues.refreshextra.ItemContainer#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.ItemContainer#getElements()
	 * @see #getItemContainer()
	 * @generated
	 */
	EReference getItemContainer_Elements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.refreshextra.ItemElement <em>Item Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Element</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.ItemElement
	 * @generated
	 */
	EClass getItemElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.refreshextra.ItemElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.ItemElement#getName()
	 * @see #getItemElement()
	 * @generated
	 */
	EAttribute getItemElement_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.refreshextra.ItemNonContainer <em>Item Non Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Non Container</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.ItemNonContainer
	 * @generated
	 */
	EClass getItemNonContainer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.refreshextra.ItemNonContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.ItemNonContainer#getName()
	 * @see #getItemNonContainer()
	 * @generated
	 */
	EAttribute getItemNonContainer_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.issues.refreshextra.ItemNonContainer#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.ItemNonContainer#getElements()
	 * @see #getItemNonContainer()
	 * @generated
	 */
	EReference getItemNonContainer_Elements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.refreshextra.ItemNonContainer2 <em>Item Non Container2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Non Container2</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.ItemNonContainer2
	 * @generated
	 */
	EClass getItemNonContainer2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.refreshextra.ItemNonContainer2#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.ItemNonContainer2#getName()
	 * @see #getItemNonContainer2()
	 * @generated
	 */
	EAttribute getItemNonContainer2_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.issues.refreshextra.ItemNonContainer2#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.ItemNonContainer2#getElements()
	 * @see #getItemNonContainer2()
	 * @generated
	 */
	EReference getItemNonContainer2_Elements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.refreshextra.ItemContainer2 <em>Item Container2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Container2</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.ItemContainer2
	 * @generated
	 */
	EClass getItemContainer2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.refreshextra.ItemContainer2#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.ItemContainer2#getName()
	 * @see #getItemContainer2()
	 * @generated
	 */
	EAttribute getItemContainer2_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.issues.refreshextra.ItemContainer2#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.ItemContainer2#getElements()
	 * @see #getItemContainer2()
	 * @generated
	 */
	EReference getItemContainer2_Elements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.refreshextra.ItemElementBidir <em>Item Element Bidir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Element Bidir</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.ItemElementBidir
	 * @generated
	 */
	EClass getItemElementBidir();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.refreshextra.ItemElementBidir#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.ItemElementBidir#getName()
	 * @see #getItemElementBidir()
	 * @generated
	 */
	EAttribute getItemElementBidir_Name();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.teneo.samples.issues.refreshextra.ItemElementBidir#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Item</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.ItemElementBidir#getItem()
	 * @see #getItemElementBidir()
	 * @generated
	 */
	EReference getItemElementBidir_Item();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RefreshextraFactory getRefreshextraFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.refreshextra.impl.ItemContainerImpl <em>Item Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.impl.ItemContainerImpl
		 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.impl.RefreshextraPackageImpl#getItemContainer()
		 * @generated
		 */
		EClass ITEM_CONTAINER = eINSTANCE.getItemContainer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_CONTAINER__NAME = eINSTANCE.getItemContainer_Name();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_CONTAINER__ELEMENTS = eINSTANCE.getItemContainer_Elements();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.refreshextra.impl.ItemElementImpl <em>Item Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.impl.ItemElementImpl
		 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.impl.RefreshextraPackageImpl#getItemElement()
		 * @generated
		 */
		EClass ITEM_ELEMENT = eINSTANCE.getItemElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_ELEMENT__NAME = eINSTANCE.getItemElement_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.refreshextra.impl.ItemNonContainerImpl <em>Item Non Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.impl.ItemNonContainerImpl
		 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.impl.RefreshextraPackageImpl#getItemNonContainer()
		 * @generated
		 */
		EClass ITEM_NON_CONTAINER = eINSTANCE.getItemNonContainer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_NON_CONTAINER__NAME = eINSTANCE.getItemNonContainer_Name();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_NON_CONTAINER__ELEMENTS = eINSTANCE.getItemNonContainer_Elements();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.refreshextra.impl.ItemNonContainer2Impl <em>Item Non Container2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.impl.ItemNonContainer2Impl
		 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.impl.RefreshextraPackageImpl#getItemNonContainer2()
		 * @generated
		 */
		EClass ITEM_NON_CONTAINER2 = eINSTANCE.getItemNonContainer2();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_NON_CONTAINER2__NAME = eINSTANCE.getItemNonContainer2_Name();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_NON_CONTAINER2__ELEMENTS = eINSTANCE.getItemNonContainer2_Elements();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.refreshextra.impl.ItemContainer2Impl <em>Item Container2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.impl.ItemContainer2Impl
		 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.impl.RefreshextraPackageImpl#getItemContainer2()
		 * @generated
		 */
		EClass ITEM_CONTAINER2 = eINSTANCE.getItemContainer2();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_CONTAINER2__NAME = eINSTANCE.getItemContainer2_Name();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_CONTAINER2__ELEMENTS = eINSTANCE.getItemContainer2_Elements();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.refreshextra.impl.ItemElementBidirImpl <em>Item Element Bidir</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.impl.ItemElementBidirImpl
		 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.impl.RefreshextraPackageImpl#getItemElementBidir()
		 * @generated
		 */
		EClass ITEM_ELEMENT_BIDIR = eINSTANCE.getItemElementBidir();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_ELEMENT_BIDIR__NAME = eINSTANCE.getItemElementBidir_Name();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_ELEMENT_BIDIR__ITEM = eINSTANCE.getItemElementBidir_Item();

	}

} //RefreshextraPackage
