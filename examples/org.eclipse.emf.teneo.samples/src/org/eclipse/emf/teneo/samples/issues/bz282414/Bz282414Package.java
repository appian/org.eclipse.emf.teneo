/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz282414Package.java,v 1.1 2009/07/05 00:09:05 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz282414;

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
 * @see org.eclipse.emf.teneo.samples.issues.bz282414.Bz282414Factory
 * @model kind="package"
 * @generated
 */
public interface Bz282414Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bz282414";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/issues/bz282414";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bz282414";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz282414Package eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz282414.impl.Bz282414PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz282414.impl.BarImpl <em>Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz282414.impl.BarImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz282414.impl.Bz282414PackageImpl#getBar()
	 * @generated
	 */
	int BAR = 0;

	/**
	 * The feature id for the '<em><b>Bar Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR__BAR_KEY = 0;

	/**
	 * The number of structural features of the '<em>Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz282414.impl.BarKeyImpl <em>Bar Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz282414.impl.BarKeyImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz282414.impl.Bz282414PackageImpl#getBarKey()
	 * @generated
	 */
	int BAR_KEY = 1;

	/**
	 * The feature id for the '<em><b>Class Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_KEY__CLASS_ID = 0;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_KEY__GROUP_ID = 1;

	/**
	 * The number of structural features of the '<em>Bar Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_KEY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz282414.impl.FooImpl <em>Foo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz282414.impl.FooImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz282414.impl.Bz282414PackageImpl#getFoo()
	 * @generated
	 */
	int FOO = 2;

	/**
	 * The feature id for the '<em><b>Bag Of Bars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO__BAG_OF_BARS = 0;

	/**
	 * The feature id for the '<em><b>Client Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO__CLIENT_ID = 1;

	/**
	 * The feature id for the '<em><b>Dnm SK</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO__DNM_SK = 2;

	/**
	 * The number of structural features of the '<em>Foo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz282414.Bar <em>Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bar</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz282414.Bar
	 * @generated
	 */
	EClass getBar();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.issues.bz282414.Bar#getBarKey <em>Bar Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bar Key</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz282414.Bar#getBarKey()
	 * @see #getBar()
	 * @generated
	 */
	EReference getBar_BarKey();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz282414.BarKey <em>Bar Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bar Key</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz282414.BarKey
	 * @generated
	 */
	EClass getBarKey();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz282414.BarKey#getClassId <em>Class Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz282414.BarKey#getClassId()
	 * @see #getBarKey()
	 * @generated
	 */
	EAttribute getBarKey_ClassId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz282414.BarKey#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz282414.BarKey#getGroupId()
	 * @see #getBarKey()
	 * @generated
	 */
	EAttribute getBarKey_GroupId();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz282414.Foo <em>Foo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foo</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz282414.Foo
	 * @generated
	 */
	EClass getFoo();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.issues.bz282414.Foo#getBagOfBars <em>Bag Of Bars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bag Of Bars</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz282414.Foo#getBagOfBars()
	 * @see #getFoo()
	 * @generated
	 */
	EReference getFoo_BagOfBars();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz282414.Foo#getClientId <em>Client Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz282414.Foo#getClientId()
	 * @see #getFoo()
	 * @generated
	 */
	EAttribute getFoo_ClientId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz282414.Foo#getDnmSK <em>Dnm SK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dnm SK</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz282414.Foo#getDnmSK()
	 * @see #getFoo()
	 * @generated
	 */
	EAttribute getFoo_DnmSK();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Bz282414Factory getBz282414Factory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz282414.impl.BarImpl <em>Bar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz282414.impl.BarImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz282414.impl.Bz282414PackageImpl#getBar()
		 * @generated
		 */
		EClass BAR = eINSTANCE.getBar();

		/**
		 * The meta object literal for the '<em><b>Bar Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAR__BAR_KEY = eINSTANCE.getBar_BarKey();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz282414.impl.BarKeyImpl <em>Bar Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz282414.impl.BarKeyImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz282414.impl.Bz282414PackageImpl#getBarKey()
		 * @generated
		 */
		EClass BAR_KEY = eINSTANCE.getBarKey();

		/**
		 * The meta object literal for the '<em><b>Class Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAR_KEY__CLASS_ID = eINSTANCE.getBarKey_ClassId();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAR_KEY__GROUP_ID = eINSTANCE.getBarKey_GroupId();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz282414.impl.FooImpl <em>Foo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz282414.impl.FooImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz282414.impl.Bz282414PackageImpl#getFoo()
		 * @generated
		 */
		EClass FOO = eINSTANCE.getFoo();

		/**
		 * The meta object literal for the '<em><b>Bag Of Bars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOO__BAG_OF_BARS = eINSTANCE.getFoo_BagOfBars();

		/**
		 * The meta object literal for the '<em><b>Client Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOO__CLIENT_ID = eINSTANCE.getFoo_ClientId();

		/**
		 * The meta object literal for the '<em><b>Dnm SK</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOO__DNM_SK = eINSTANCE.getFoo_DnmSK();

	}

} //Bz282414Package
