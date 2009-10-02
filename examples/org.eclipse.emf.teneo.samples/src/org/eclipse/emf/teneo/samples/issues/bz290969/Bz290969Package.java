/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz290969Package.java,v 1.1 2009/10/02 07:47:37 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz290969;

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
 * @see org.eclipse.emf.teneo.samples.issues.bz290969.Bz290969Factory
 * @model kind="package"
 * @generated
 */
public interface Bz290969Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bz290969";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/issues/bz290969";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bz290969";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz290969Package eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz290969.impl.Bz290969PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz290969.impl.BarImpl <em>Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz290969.impl.BarImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz290969.impl.Bz290969PackageImpl#getBar()
	 * @generated
	 */
	int BAR = 0;

	/**
	 * The feature id for the '<em><b>Bar Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR__BAR_KEYS = 0;

	/**
	 * The number of structural features of the '<em>Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz290969.impl.BarKeyImpl <em>Bar Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz290969.impl.BarKeyImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz290969.impl.Bz290969PackageImpl#getBarKey()
	 * @generated
	 */
	int BAR_KEY = 1;

	/**
	 * The number of structural features of the '<em>Bar Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_KEY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz290969.impl.FooImpl <em>Foo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz290969.impl.FooImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz290969.impl.Bz290969PackageImpl#getFoo()
	 * @generated
	 */
	int FOO = 2;

	/**
	 * The feature id for the '<em><b>Bar Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO__BAR_KEY = 0;

	/**
	 * The number of structural features of the '<em>Foo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz290969.Bar <em>Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bar</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz290969.Bar
	 * @generated
	 */
	EClass getBar();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.issues.bz290969.Bar#getBarKeys <em>Bar Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bar Keys</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz290969.Bar#getBarKeys()
	 * @see #getBar()
	 * @generated
	 */
	EReference getBar_BarKeys();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz290969.BarKey <em>Bar Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bar Key</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz290969.BarKey
	 * @generated
	 */
	EClass getBarKey();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz290969.Foo <em>Foo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foo</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz290969.Foo
	 * @generated
	 */
	EClass getFoo();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.issues.bz290969.Foo#getBarKey <em>Bar Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bar Key</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz290969.Foo#getBarKey()
	 * @see #getFoo()
	 * @generated
	 */
	EReference getFoo_BarKey();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Bz290969Factory getBz290969Factory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz290969.impl.BarImpl <em>Bar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz290969.impl.BarImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz290969.impl.Bz290969PackageImpl#getBar()
		 * @generated
		 */
		EClass BAR = eINSTANCE.getBar();

		/**
		 * The meta object literal for the '<em><b>Bar Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAR__BAR_KEYS = eINSTANCE.getBar_BarKeys();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz290969.impl.BarKeyImpl <em>Bar Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz290969.impl.BarKeyImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz290969.impl.Bz290969PackageImpl#getBarKey()
		 * @generated
		 */
		EClass BAR_KEY = eINSTANCE.getBarKey();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz290969.impl.FooImpl <em>Foo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz290969.impl.FooImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz290969.impl.Bz290969PackageImpl#getFoo()
		 * @generated
		 */
		EClass FOO = eINSTANCE.getFoo();

		/**
		 * The meta object literal for the '<em><b>Bar Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOO__BAR_KEY = eINSTANCE.getFoo_BarKey();

	}

} //Bz290969Package
