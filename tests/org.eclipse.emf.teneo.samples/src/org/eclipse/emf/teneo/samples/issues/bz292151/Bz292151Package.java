/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz292151Package.java,v 1.1 2009/10/14 22:19:41 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz292151;

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
 * @see org.eclipse.emf.teneo.samples.issues.bz292151.Bz292151Factory
 * @model kind="package"
 * @generated
 */
public interface Bz292151Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bz292151";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/issues/bz292151";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bz292151";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz292151Package eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz292151.impl.Bz292151PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz292151.impl.BaseImpl <em>Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz292151.impl.BaseImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz292151.impl.Bz292151PackageImpl#getBase()
	 * @generated
	 */
	int BASE = 0;

	/**
	 * The number of structural features of the '<em>Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz292151.impl.Sub1Impl <em>Sub1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz292151.impl.Sub1Impl
	 * @see org.eclipse.emf.teneo.samples.issues.bz292151.impl.Bz292151PackageImpl#getSub1()
	 * @generated
	 */
	int SUB1 = 1;

	/**
	 * The feature id for the '<em><b>A1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB1__A1 = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sub1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB1_FEATURE_COUNT = BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz292151.impl.Sub2Impl <em>Sub2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz292151.impl.Sub2Impl
	 * @see org.eclipse.emf.teneo.samples.issues.bz292151.impl.Bz292151PackageImpl#getSub2()
	 * @generated
	 */
	int SUB2 = 2;

	/**
	 * The feature id for the '<em><b>A1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB2__A1 = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sub2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB2_FEATURE_COUNT = BASE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz292151.Base <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz292151.Base
	 * @generated
	 */
	EClass getBase();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz292151.Sub1 <em>Sub1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub1</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz292151.Sub1
	 * @generated
	 */
	EClass getSub1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz292151.Sub1#getA1 <em>A1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>A1</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz292151.Sub1#getA1()
	 * @see #getSub1()
	 * @generated
	 */
	EAttribute getSub1_A1();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz292151.Sub2 <em>Sub2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub2</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz292151.Sub2
	 * @generated
	 */
	EClass getSub2();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.issues.bz292151.Sub2#getA1 <em>A1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>A1</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz292151.Sub2#getA1()
	 * @see #getSub2()
	 * @generated
	 */
	EReference getSub2_A1();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Bz292151Factory getBz292151Factory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz292151.impl.BaseImpl <em>Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz292151.impl.BaseImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz292151.impl.Bz292151PackageImpl#getBase()
		 * @generated
		 */
		EClass BASE = eINSTANCE.getBase();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz292151.impl.Sub1Impl <em>Sub1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz292151.impl.Sub1Impl
		 * @see org.eclipse.emf.teneo.samples.issues.bz292151.impl.Bz292151PackageImpl#getSub1()
		 * @generated
		 */
		EClass SUB1 = eINSTANCE.getSub1();

		/**
		 * The meta object literal for the '<em><b>A1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB1__A1 = eINSTANCE.getSub1_A1();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz292151.impl.Sub2Impl <em>Sub2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz292151.impl.Sub2Impl
		 * @see org.eclipse.emf.teneo.samples.issues.bz292151.impl.Bz292151PackageImpl#getSub2()
		 * @generated
		 */
		EClass SUB2 = eINSTANCE.getSub2();

		/**
		 * The meta object literal for the '<em><b>A1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB2__A1 = eINSTANCE.getSub2_A1();

	}

} //Bz292151Package
