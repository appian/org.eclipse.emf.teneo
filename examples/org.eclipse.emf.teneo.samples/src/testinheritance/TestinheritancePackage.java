/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestinheritancePackage.java,v 1.1.2.2 2007/03/18 22:34:03 mtaal Exp $
 */
package testinheritance;

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
 * @see testinheritance.TestinheritanceFactory
 * @model kind="package"
 * @generated
 */
public interface TestinheritancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "testinheritance";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://xsd.tns.example.com/testinheritance/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "testinheritance";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestinheritancePackage eINSTANCE = testinheritance.impl.TestinheritancePackageImpl.init();

	/**
	 * The meta object id for the '{@link testinheritance.impl.SomeBaseClassImpl <em>Some Base Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testinheritance.impl.SomeBaseClassImpl
	 * @see testinheritance.impl.TestinheritancePackageImpl#getSomeBaseClass()
	 * @generated
	 */
	int SOME_BASE_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Another Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_BASE_CLASS__ANOTHER_PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>Some Base Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_BASE_CLASS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link testinheritance.impl.SomeResourceImpl <em>Some Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testinheritance.impl.SomeResourceImpl
	 * @see testinheritance.impl.TestinheritancePackageImpl#getSomeResource()
	 * @generated
	 */
	int SOME_RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Another Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_RESOURCE__ANOTHER_PROPERTY = SOME_BASE_CLASS__ANOTHER_PROPERTY;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_RESOURCE__PROPERTY = SOME_BASE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name Value Pairs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_RESOURCE__NAME_VALUE_PAIRS = SOME_BASE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Some Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_RESOURCE_FEATURE_COUNT = SOME_BASE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link testinheritance.impl.SomeOtherBaseClassImpl <em>Some Other Base Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testinheritance.impl.SomeOtherBaseClassImpl
	 * @see testinheritance.impl.TestinheritancePackageImpl#getSomeOtherBaseClass()
	 * @generated
	 */
	int SOME_OTHER_BASE_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_OTHER_BASE_CLASS__PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Name Value Pairs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_OTHER_BASE_CLASS__NAME_VALUE_PAIRS = 1;

	/**
	 * The number of structural features of the '<em>Some Other Base Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_OTHER_BASE_CLASS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link testinheritance.impl.NameValuePairImpl <em>Name Value Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testinheritance.impl.NameValuePairImpl
	 * @see testinheritance.impl.TestinheritancePackageImpl#getNameValuePair()
	 * @generated
	 */
	int NAME_VALUE_PAIR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_VALUE_PAIR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_VALUE_PAIR__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Name Value Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_VALUE_PAIR_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link testinheritance.SomeResource <em>Some Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Some Resource</em>'.
	 * @see testinheritance.SomeResource
	 * @generated
	 */
	EClass getSomeResource();

	/**
	 * Returns the meta object for class '{@link testinheritance.SomeBaseClass <em>Some Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Some Base Class</em>'.
	 * @see testinheritance.SomeBaseClass
	 * @generated
	 */
	EClass getSomeBaseClass();

	/**
	 * Returns the meta object for the attribute '{@link testinheritance.SomeBaseClass#getAnotherProperty <em>Another Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Another Property</em>'.
	 * @see testinheritance.SomeBaseClass#getAnotherProperty()
	 * @see #getSomeBaseClass()
	 * @generated
	 */
	EAttribute getSomeBaseClass_AnotherProperty();

	/**
	 * Returns the meta object for class '{@link testinheritance.SomeOtherBaseClass <em>Some Other Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Some Other Base Class</em>'.
	 * @see testinheritance.SomeOtherBaseClass
	 * @generated
	 */
	EClass getSomeOtherBaseClass();

	/**
	 * Returns the meta object for the attribute '{@link testinheritance.SomeOtherBaseClass#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see testinheritance.SomeOtherBaseClass#getProperty()
	 * @see #getSomeOtherBaseClass()
	 * @generated
	 */
	EAttribute getSomeOtherBaseClass_Property();

	/**
	 * Returns the meta object for the reference list '{@link testinheritance.SomeOtherBaseClass#getNameValuePairs <em>Name Value Pairs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Name Value Pairs</em>'.
	 * @see testinheritance.SomeOtherBaseClass#getNameValuePairs()
	 * @see #getSomeOtherBaseClass()
	 * @generated
	 */
	EReference getSomeOtherBaseClass_NameValuePairs();

	/**
	 * Returns the meta object for class '{@link testinheritance.NameValuePair <em>Name Value Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Value Pair</em>'.
	 * @see testinheritance.NameValuePair
	 * @generated
	 */
	EClass getNameValuePair();

	/**
	 * Returns the meta object for the attribute '{@link testinheritance.NameValuePair#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see testinheritance.NameValuePair#getName()
	 * @see #getNameValuePair()
	 * @generated
	 */
	EAttribute getNameValuePair_Name();

	/**
	 * Returns the meta object for the attribute '{@link testinheritance.NameValuePair#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see testinheritance.NameValuePair#getValue()
	 * @see #getNameValuePair()
	 * @generated
	 */
	EAttribute getNameValuePair_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestinheritanceFactory getTestinheritanceFactory();

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
		 * The meta object literal for the '{@link testinheritance.impl.SomeResourceImpl <em>Some Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testinheritance.impl.SomeResourceImpl
		 * @see testinheritance.impl.TestinheritancePackageImpl#getSomeResource()
		 * @generated
		 */
		EClass SOME_RESOURCE = eINSTANCE.getSomeResource();

		/**
		 * The meta object literal for the '{@link testinheritance.impl.SomeBaseClassImpl <em>Some Base Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testinheritance.impl.SomeBaseClassImpl
		 * @see testinheritance.impl.TestinheritancePackageImpl#getSomeBaseClass()
		 * @generated
		 */
		EClass SOME_BASE_CLASS = eINSTANCE.getSomeBaseClass();

		/**
		 * The meta object literal for the '<em><b>Another Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOME_BASE_CLASS__ANOTHER_PROPERTY = eINSTANCE.getSomeBaseClass_AnotherProperty();

		/**
		 * The meta object literal for the '{@link testinheritance.impl.SomeOtherBaseClassImpl <em>Some Other Base Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testinheritance.impl.SomeOtherBaseClassImpl
		 * @see testinheritance.impl.TestinheritancePackageImpl#getSomeOtherBaseClass()
		 * @generated
		 */
		EClass SOME_OTHER_BASE_CLASS = eINSTANCE.getSomeOtherBaseClass();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOME_OTHER_BASE_CLASS__PROPERTY = eINSTANCE.getSomeOtherBaseClass_Property();

		/**
		 * The meta object literal for the '<em><b>Name Value Pairs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOME_OTHER_BASE_CLASS__NAME_VALUE_PAIRS = eINSTANCE.getSomeOtherBaseClass_NameValuePairs();

		/**
		 * The meta object literal for the '{@link testinheritance.impl.NameValuePairImpl <em>Name Value Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testinheritance.impl.NameValuePairImpl
		 * @see testinheritance.impl.TestinheritancePackageImpl#getNameValuePair()
		 * @generated
		 */
		EClass NAME_VALUE_PAIR = eINSTANCE.getNameValuePair();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_VALUE_PAIR__NAME = eINSTANCE.getNameValuePair_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_VALUE_PAIR__VALUE = eINSTANCE.getNameValuePair_Value();

	}

} //TestinheritancePackage
