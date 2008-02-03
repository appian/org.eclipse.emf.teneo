/**
 * <copyright>
 * </copyright>
 *
 * $Id: DurationPackage.java,v 1.1 2008/02/03 22:37:05 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration;

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
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration.DurationFactory
 * @model kind="package"
 * @generated
 */
public interface DurationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "duration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/emf/schemaconstructs/duration";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "duration";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DurationPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration.impl.DurationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration.impl.DurationTestImpl <em>Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration.impl.DurationTestImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration.impl.DurationPackageImpl#getDurationTest()
	 * @generated
	 */
	int DURATION_TEST = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_TEST__NAME = 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_TEST__DURATION = 1;

	/**
	 * The feature id for the '<em><b>Durations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_TEST__DURATIONS = 2;

	/**
	 * The number of structural features of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_TEST_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration.DurationTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration.DurationTest
	 * @generated
	 */
	EClass getDurationTest();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration.DurationTest#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration.DurationTest#getName()
	 * @see #getDurationTest()
	 * @generated
	 */
	EAttribute getDurationTest_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration.DurationTest#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration.DurationTest#getDuration()
	 * @see #getDurationTest()
	 * @generated
	 */
	EAttribute getDurationTest_Duration();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration.DurationTest#getDurations <em>Durations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Durations</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration.DurationTest#getDurations()
	 * @see #getDurationTest()
	 * @generated
	 */
	EAttribute getDurationTest_Durations();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DurationFactory getDurationFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration.impl.DurationTestImpl <em>Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration.impl.DurationTestImpl
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration.impl.DurationPackageImpl#getDurationTest()
		 * @generated
		 */
		EClass DURATION_TEST = eINSTANCE.getDurationTest();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION_TEST__NAME = eINSTANCE.getDurationTest_Name();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION_TEST__DURATION = eINSTANCE.getDurationTest_Duration();

		/**
		 * The meta object literal for the '<em><b>Durations</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION_TEST__DURATIONS = eINSTANCE.getDurationTest_Durations();

	}

} //DurationPackage
