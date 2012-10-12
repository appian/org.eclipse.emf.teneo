/**
 */
package org.eclipse.emf.teneo.samples.issues.nonmandatoryjoincolumn;

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
 * @see org.eclipse.emf.teneo.samples.issues.nonmandatoryjoincolumn.NonmandatoryjoincolumnFactory
 * @model kind="package"
 * @generated
 */
public interface NonmandatoryjoincolumnPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "nonmandatoryjoincolumn";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/issues/nonmandatoryjoincolumn";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nonmandatoryjoincolumn";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NonmandatoryjoincolumnPackage eINSTANCE = org.eclipse.emf.teneo.samples.issues.nonmandatoryjoincolumn.impl.NonmandatoryjoincolumnPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.nonmandatoryjoincolumn.impl.FooImpl <em>Foo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.nonmandatoryjoincolumn.impl.FooImpl
	 * @see org.eclipse.emf.teneo.samples.issues.nonmandatoryjoincolumn.impl.NonmandatoryjoincolumnPackageImpl#getFoo()
	 * @generated
	 */
	int FOO = 0;

	/**
	 * The feature id for the '<em><b>Bar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO__BAR = 0;

	/**
	 * The number of structural features of the '<em>Foo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.nonmandatoryjoincolumn.impl.BarImpl <em>Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.nonmandatoryjoincolumn.impl.BarImpl
	 * @see org.eclipse.emf.teneo.samples.issues.nonmandatoryjoincolumn.impl.NonmandatoryjoincolumnPackageImpl#getBar()
	 * @generated
	 */
	int BAR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR__NAME = 0;

	/**
	 * The number of structural features of the '<em>Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.nonmandatoryjoincolumn.Foo <em>Foo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foo</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nonmandatoryjoincolumn.Foo
	 * @generated
	 */
	EClass getFoo();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.issues.nonmandatoryjoincolumn.Foo#getBar <em>Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bar</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nonmandatoryjoincolumn.Foo#getBar()
	 * @see #getFoo()
	 * @generated
	 */
	EReference getFoo_Bar();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.nonmandatoryjoincolumn.Bar <em>Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bar</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nonmandatoryjoincolumn.Bar
	 * @generated
	 */
	EClass getBar();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.nonmandatoryjoincolumn.Bar#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nonmandatoryjoincolumn.Bar#getName()
	 * @see #getBar()
	 * @generated
	 */
	EAttribute getBar_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NonmandatoryjoincolumnFactory getNonmandatoryjoincolumnFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.nonmandatoryjoincolumn.impl.FooImpl <em>Foo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.nonmandatoryjoincolumn.impl.FooImpl
		 * @see org.eclipse.emf.teneo.samples.issues.nonmandatoryjoincolumn.impl.NonmandatoryjoincolumnPackageImpl#getFoo()
		 * @generated
		 */
		EClass FOO = eINSTANCE.getFoo();

		/**
		 * The meta object literal for the '<em><b>Bar</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOO__BAR = eINSTANCE.getFoo_Bar();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.nonmandatoryjoincolumn.impl.BarImpl <em>Bar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.nonmandatoryjoincolumn.impl.BarImpl
		 * @see org.eclipse.emf.teneo.samples.issues.nonmandatoryjoincolumn.impl.NonmandatoryjoincolumnPackageImpl#getBar()
		 * @generated
		 */
		EClass BAR = eINSTANCE.getBar();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAR__NAME = eINSTANCE.getBar_Name();

	}

} //NonmandatoryjoincolumnPackage
