/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz277570Package.java,v 1.2 2009/05/23 13:57:53 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.adept;

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
 * @see org.eclipse.emf.teneo.samples.issues.adept.Bz277570Factory
 * @model kind="package"
 * @generated
 */
public interface Bz277570Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "adept";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.emf.teneo.samples.issues.bz277570";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "adept";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz277570Package eINSTANCE = org.eclipse.emf.teneo.samples.issues.adept.impl.Bz277570PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.adept.impl.BazImpl <em>Baz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.adept.impl.BazImpl
	 * @see org.eclipse.emf.teneo.samples.issues.adept.impl.Bz277570PackageImpl#getBaz()
	 * @generated
	 */
	int BAZ = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAZ__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAZ__ID = 1;

	/**
	 * The number of structural features of the '<em>Baz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAZ_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.adept.impl.FooImpl <em>Foo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.adept.impl.FooImpl
	 * @see org.eclipse.emf.teneo.samples.issues.adept.impl.Bz277570PackageImpl#getFoo()
	 * @generated
	 */
	int FOO = 1;

	/**
	 * The feature id for the '<em><b>Bars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO__BARS = 0;

	/**
	 * The feature id for the '<em><b>Biffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO__BIFFS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO__ID = 2;

	/**
	 * The number of structural features of the '<em>Foo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.adept.impl.BarImpl <em>Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.adept.impl.BarImpl
	 * @see org.eclipse.emf.teneo.samples.issues.adept.impl.Bz277570PackageImpl#getBar()
	 * @generated
	 */
	int BAR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR__NAME = BAZ__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR__ID = BAZ__ID;

	/**
	 * The feature id for the '<em><b>Baz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR__BAZ = BAZ_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_FEATURE_COUNT = BAZ_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.adept.impl.BiffImpl <em>Biff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.adept.impl.BiffImpl
	 * @see org.eclipse.emf.teneo.samples.issues.adept.impl.Bz277570PackageImpl#getBiff()
	 * @generated
	 */
	int BIFF = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIFF__NAME = BAZ__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIFF__ID = BAZ__ID;

	/**
	 * The number of structural features of the '<em>Biff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIFF_FEATURE_COUNT = BAZ_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.adept.Baz <em>Baz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Baz</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.adept.Baz
	 * @generated
	 */
	EClass getBaz();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.adept.Baz#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.adept.Baz#getName()
	 * @see #getBaz()
	 * @generated
	 */
	EAttribute getBaz_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.adept.Baz#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.adept.Baz#getId()
	 * @see #getBaz()
	 * @generated
	 */
	EAttribute getBaz_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.adept.Foo <em>Foo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foo</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.adept.Foo
	 * @generated
	 */
	EClass getFoo();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.issues.adept.Foo#getBars <em>Bars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bars</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.adept.Foo#getBars()
	 * @see #getFoo()
	 * @generated
	 */
	EReference getFoo_Bars();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.issues.adept.Foo#getBiffs <em>Biffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Biffs</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.adept.Foo#getBiffs()
	 * @see #getFoo()
	 * @generated
	 */
	EReference getFoo_Biffs();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.adept.Foo#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.adept.Foo#getId()
	 * @see #getFoo()
	 * @generated
	 */
	EAttribute getFoo_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.adept.Bar <em>Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bar</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.adept.Bar
	 * @generated
	 */
	EClass getBar();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.issues.adept.Bar#getBaz <em>Baz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Baz</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.adept.Bar#getBaz()
	 * @see #getBar()
	 * @generated
	 */
	EReference getBar_Baz();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.adept.Biff <em>Biff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Biff</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.adept.Biff
	 * @generated
	 */
	EClass getBiff();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Bz277570Factory getBz277570Factory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.adept.impl.BazImpl <em>Baz</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.adept.impl.BazImpl
		 * @see org.eclipse.emf.teneo.samples.issues.adept.impl.Bz277570PackageImpl#getBaz()
		 * @generated
		 */
		EClass BAZ = eINSTANCE.getBaz();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAZ__NAME = eINSTANCE.getBaz_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAZ__ID = eINSTANCE.getBaz_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.adept.impl.FooImpl <em>Foo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.adept.impl.FooImpl
		 * @see org.eclipse.emf.teneo.samples.issues.adept.impl.Bz277570PackageImpl#getFoo()
		 * @generated
		 */
		EClass FOO = eINSTANCE.getFoo();

		/**
		 * The meta object literal for the '<em><b>Bars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOO__BARS = eINSTANCE.getFoo_Bars();

		/**
		 * The meta object literal for the '<em><b>Biffs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOO__BIFFS = eINSTANCE.getFoo_Biffs();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOO__ID = eINSTANCE.getFoo_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.adept.impl.BarImpl <em>Bar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.adept.impl.BarImpl
		 * @see org.eclipse.emf.teneo.samples.issues.adept.impl.Bz277570PackageImpl#getBar()
		 * @generated
		 */
		EClass BAR = eINSTANCE.getBar();

		/**
		 * The meta object literal for the '<em><b>Baz</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAR__BAZ = eINSTANCE.getBar_Baz();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.adept.impl.BiffImpl <em>Biff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.adept.impl.BiffImpl
		 * @see org.eclipse.emf.teneo.samples.issues.adept.impl.Bz277570PackageImpl#getBiff()
		 * @generated
		 */
		EClass BIFF = eINSTANCE.getBiff();

	}

} //Bz277570Package
