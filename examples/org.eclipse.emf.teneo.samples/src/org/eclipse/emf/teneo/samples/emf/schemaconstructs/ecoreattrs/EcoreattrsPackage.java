/**
 * <copyright>
 * </copyright>
 *
 * $Id: EcoreattrsPackage.java,v 1.2 2007/02/08 23:09:20 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs;

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
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.EcoreattrsFactory
 * @model kind="package"
 * @generated
 */
public interface EcoreattrsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ecoreattrs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/emf/schemaconstructs/ecoreattrs";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ecoreattrs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcoreattrsPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.impl.EcoreattrsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.impl.ElementImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.impl.EcoreattrsPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name Map</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME_MAP = 0;

	/**
	 * The feature id for the '<em><b>Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAMES = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.impl.FeatureImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.impl.EcoreattrsPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 1;

	/**
	 * The feature id for the '<em><b>AMap</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__AMAP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.impl.MixedImpl <em>Mixed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.impl.MixedImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.impl.EcoreattrsPackageImpl#getMixed()
	 * @generated
	 */
	int MIXED = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED__NAME = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Mixed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.impl.NameListImpl <em>Name List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.impl.NameListImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.impl.EcoreattrsPackageImpl#getNameList()
	 * @generated
	 */
	int NAME_LIST = 3;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_LIST__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Middle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_LIST__MIDDLE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_LIST__LAST_NAME = 2;

	/**
	 * The number of structural features of the '<em>Name List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_LIST_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.Element#getNameMap <em>Name Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Name Map</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.Element#getNameMap()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_NameMap();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.Element#getNames <em>Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Names</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.Element#getNames()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Names();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.Feature#getAMap <em>AMap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>AMap</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.Feature#getAMap()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_AMap();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.Feature#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.Feature#getValue()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.Mixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mixed</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.Mixed
	 * @generated
	 */
	EClass getMixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.Mixed#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.Mixed#getMixed()
	 * @see #getMixed()
	 * @generated
	 */
	EAttribute getMixed_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.Mixed#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.Mixed#getName()
	 * @see #getMixed()
	 * @generated
	 */
	EAttribute getMixed_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.Mixed#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.Mixed#getValue()
	 * @see #getMixed()
	 * @generated
	 */
	EAttribute getMixed_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.NameList <em>Name List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name List</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.NameList
	 * @generated
	 */
	EClass getNameList();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.NameList#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.NameList#getFirstName()
	 * @see #getNameList()
	 * @generated
	 */
	EAttribute getNameList_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.NameList#getMiddleName <em>Middle Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Middle Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.NameList#getMiddleName()
	 * @see #getNameList()
	 * @generated
	 */
	EAttribute getNameList_MiddleName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.NameList#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.NameList#getLastName()
	 * @see #getNameList()
	 * @generated
	 */
	EAttribute getNameList_LastName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EcoreattrsFactory getEcoreattrsFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.impl.ElementImpl
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.impl.EcoreattrsPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name Map</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME_MAP = eINSTANCE.getElement_NameMap();

		/**
		 * The meta object literal for the '<em><b>Names</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__NAMES = eINSTANCE.getElement_Names();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.impl.FeatureImpl
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.impl.EcoreattrsPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>AMap</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__AMAP = eINSTANCE.getFeature_AMap();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__VALUE = eINSTANCE.getFeature_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.impl.MixedImpl <em>Mixed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.impl.MixedImpl
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.impl.EcoreattrsPackageImpl#getMixed()
		 * @generated
		 */
		EClass MIXED = eINSTANCE.getMixed();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIXED__MIXED = eINSTANCE.getMixed_Mixed();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIXED__NAME = eINSTANCE.getMixed_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIXED__VALUE = eINSTANCE.getMixed_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.impl.NameListImpl <em>Name List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.impl.NameListImpl
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.impl.EcoreattrsPackageImpl#getNameList()
		 * @generated
		 */
		EClass NAME_LIST = eINSTANCE.getNameList();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_LIST__FIRST_NAME = eINSTANCE.getNameList_FirstName();

		/**
		 * The meta object literal for the '<em><b>Middle Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_LIST__MIDDLE_NAME = eINSTANCE.getNameList_MiddleName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_LIST__LAST_NAME = eINSTANCE.getNameList_LastName();

	}

} //EcoreattrsPackage
