/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.samples.issues.bz390773;

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
 * @see org.eclipse.emf.teneo.samples.issues.bz390773.Bz390773Factory
 * @model kind="package"
 * @generated
 */
public interface Bz390773Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bz390773";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/issues/bz390773";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bz390773";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz390773Package eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz390773.impl.Bz390773PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz390773.impl.MainImpl <em>Main</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz390773.impl.MainImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz390773.impl.Bz390773PackageImpl#getMain()
	 * @generated
	 */
	int MAIN = 0;

	/**
	 * The feature id for the '<em><b>Other</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__OTHER = 0;

	/**
	 * The number of structural features of the '<em>Main</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz390773.impl.OtherImpl <em>Other</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz390773.impl.OtherImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz390773.impl.Bz390773PackageImpl#getOther()
	 * @generated
	 */
	int OTHER = 1;

	/**
	 * The feature id for the '<em><b>Main</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER__MAIN = 0;

	/**
	 * The number of structural features of the '<em>Other</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz390773.Main <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz390773.Main
	 * @generated
	 */
	EClass getMain();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.issues.bz390773.Main#getOther <em>Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Other</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz390773.Main#getOther()
	 * @see #getMain()
	 * @generated
	 */
	EReference getMain_Other();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz390773.Other <em>Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Other</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz390773.Other
	 * @generated
	 */
	EClass getOther();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.teneo.samples.issues.bz390773.Other#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Main</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz390773.Other#getMain()
	 * @see #getOther()
	 * @generated
	 */
	EReference getOther_Main();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Bz390773Factory getBz390773Factory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz390773.impl.MainImpl <em>Main</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz390773.impl.MainImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz390773.impl.Bz390773PackageImpl#getMain()
		 * @generated
		 */
		EClass MAIN = eINSTANCE.getMain();

		/**
		 * The meta object literal for the '<em><b>Other</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN__OTHER = eINSTANCE.getMain_Other();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz390773.impl.OtherImpl <em>Other</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz390773.impl.OtherImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz390773.impl.Bz390773PackageImpl#getOther()
		 * @generated
		 */
		EClass OTHER = eINSTANCE.getOther();

		/**
		 * The meta object literal for the '<em><b>Main</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OTHER__MAIN = eINSTANCE.getOther_Main();

	}

} //Bz390773Package
