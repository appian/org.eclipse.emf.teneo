/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz302933_1Package.java,v 1.1 2010/03/02 21:43:54 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_1;

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
 * @see org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_1.Bz302933_1Factory
 * @model kind="package"
 * @generated
 */
public interface Bz302933_1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bz302933_1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/issues/bz302933/subpackage1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bz302933_1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz302933_1Package eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_1.impl.Bz302933_1PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_1.impl.TestTypeImpl <em>Test Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_1.impl.TestTypeImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_1.impl.Bz302933_1PackageImpl#getTestType()
	 * @generated
	 */
	int TEST_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Transient Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_TYPE__TRANSIENT_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Not Transient Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_TYPE__NOT_TRANSIENT_REFERENCE = 1;

	/**
	 * The number of structural features of the '<em>Test Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_TYPE_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_1.TestType <em>Test Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_1.TestType
	 * @generated
	 */
	EClass getTestType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_1.TestType#getTransientReference <em>Transient Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transient Reference</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_1.TestType#getTransientReference()
	 * @see #getTestType()
	 * @generated
	 */
	EReference getTestType_TransientReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_1.TestType#getNotTransientReference <em>Not Transient Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Not Transient Reference</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_1.TestType#getNotTransientReference()
	 * @see #getTestType()
	 * @generated
	 */
	EReference getTestType_NotTransientReference();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Bz302933_1Factory getBz302933_1Factory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_1.impl.TestTypeImpl <em>Test Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_1.impl.TestTypeImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_1.impl.Bz302933_1PackageImpl#getTestType()
		 * @generated
		 */
		EClass TEST_TYPE = eINSTANCE.getTestType();

		/**
		 * The meta object literal for the '<em><b>Transient Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_TYPE__TRANSIENT_REFERENCE = eINSTANCE.getTestType_TransientReference();

		/**
		 * The meta object literal for the '<em><b>Not Transient Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_TYPE__NOT_TRANSIENT_REFERENCE = eINSTANCE.getTestType_NotTransientReference();

	}

} //Bz302933_1Package
