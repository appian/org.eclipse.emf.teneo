/**
 * <copyright>
 * </copyright>
 *
 * $Id: DetachtestPackage.java,v 1.3 2007/07/04 19:29:56 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.detach.detachtest;

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
 * @see org.eclipse.emf.teneo.samples.emf.detach.detachtest.DetachtestFactory
 * @model kind="package"
 * @generated
 */
public interface DetachtestPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "detachtest";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/emf/detach/detachtest";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "detachtest";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DetachtestPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.detach.detachtest.impl.DetachtestPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.detach.detachtest.impl.TestAImpl <em>Test A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachtest.impl.TestAImpl
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachtest.impl.DetachtestPackageImpl#getTestA()
	 * @generated
	 */
	int TEST_A = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_A__CODE = 0;

	/**
	 * The feature id for the '<em><b>Test B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_A__TEST_B = 1;

	/**
	 * The number of structural features of the '<em>Test A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_A_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.detach.detachtest.impl.TestBImpl <em>Test B</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachtest.impl.TestBImpl
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachtest.impl.DetachtestPackageImpl#getTestB()
	 * @generated
	 */
	int TEST_B = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_B__CODE = 0;

	/**
	 * The number of structural features of the '<em>Test B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_B_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.detach.detachtest.impl.TestCImpl <em>Test C</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachtest.impl.TestCImpl
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachtest.impl.DetachtestPackageImpl#getTestC()
	 * @generated
	 */
	int TEST_C = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_C__CODE = 0;

	/**
	 * The feature id for the '<em><b>My Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_C__MY_DATE = 1;

	/**
	 * The feature id for the '<em><b>Test B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_C__TEST_B = 2;

	/**
	 * The number of structural features of the '<em>Test C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_C_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.detach.detachtest.TestA <em>Test A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test A</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachtest.TestA
	 * @generated
	 */
	EClass getTestA();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.detach.detachtest.TestA#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachtest.TestA#getCode()
	 * @see #getTestA()
	 * @generated
	 */
	EAttribute getTestA_Code();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.emf.detach.detachtest.TestA#getTestB <em>Test B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Test B</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachtest.TestA#getTestB()
	 * @see #getTestA()
	 * @generated
	 */
	EReference getTestA_TestB();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.detach.detachtest.TestB <em>Test B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test B</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachtest.TestB
	 * @generated
	 */
	EClass getTestB();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.detach.detachtest.TestB#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachtest.TestB#getCode()
	 * @see #getTestB()
	 * @generated
	 */
	EAttribute getTestB_Code();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.detach.detachtest.TestC <em>Test C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test C</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachtest.TestC
	 * @generated
	 */
	EClass getTestC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.detach.detachtest.TestC#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachtest.TestC#getCode()
	 * @see #getTestC()
	 * @generated
	 */
	EAttribute getTestC_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.detach.detachtest.TestC#getMyDate <em>My Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>My Date</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachtest.TestC#getMyDate()
	 * @see #getTestC()
	 * @generated
	 */
	EAttribute getTestC_MyDate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.emf.detach.detachtest.TestC#getTestB <em>Test B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Test B</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachtest.TestC#getTestB()
	 * @see #getTestC()
	 * @generated
	 */
	EReference getTestC_TestB();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DetachtestFactory getDetachtestFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.detach.detachtest.impl.TestAImpl <em>Test A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.detach.detachtest.impl.TestAImpl
		 * @see org.eclipse.emf.teneo.samples.emf.detach.detachtest.impl.DetachtestPackageImpl#getTestA()
		 * @generated
		 */
		EClass TEST_A = eINSTANCE.getTestA();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_A__CODE = eINSTANCE.getTestA_Code();

		/**
		 * The meta object literal for the '<em><b>Test B</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_A__TEST_B = eINSTANCE.getTestA_TestB();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.detach.detachtest.impl.TestBImpl <em>Test B</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.detach.detachtest.impl.TestBImpl
		 * @see org.eclipse.emf.teneo.samples.emf.detach.detachtest.impl.DetachtestPackageImpl#getTestB()
		 * @generated
		 */
		EClass TEST_B = eINSTANCE.getTestB();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_B__CODE = eINSTANCE.getTestB_Code();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.detach.detachtest.impl.TestCImpl <em>Test C</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.detach.detachtest.impl.TestCImpl
		 * @see org.eclipse.emf.teneo.samples.emf.detach.detachtest.impl.DetachtestPackageImpl#getTestC()
		 * @generated
		 */
		EClass TEST_C = eINSTANCE.getTestC();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_C__CODE = eINSTANCE.getTestC_Code();

		/**
		 * The meta object literal for the '<em><b>My Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_C__MY_DATE = eINSTANCE.getTestC_MyDate();

		/**
		 * The meta object literal for the '<em><b>Test B</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_C__TEST_B = eINSTANCE.getTestC_TestB();

	}

} //DetachtestPackage
