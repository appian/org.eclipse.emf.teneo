/**
 * <copyright>
 * </copyright>
 *
 * $Id: AnytypePackage.java,v 1.2 2007/02/08 23:09:26 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype;

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
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.AnytypeFactory
 * @model kind="package"
 * @generated
 */
public interface AnytypePackage extends EPackage{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "anytype";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/emf/schemaconstructs/anytype";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "anytype";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnytypePackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.impl.AnytypePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.impl.AImpl <em>A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.impl.AImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.impl.AnytypePackageImpl#getA()
	 * @generated
	 */
	int A = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__NAME = 0;

	/**
	 * The feature id for the '<em><b>Doub</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__DOUB = 1;

	/**
	 * The feature id for the '<em><b>Lon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__LON = 2;

	/**
	 * The feature id for the '<em><b>My B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__MY_B = 3;

	/**
	 * The number of structural features of the '<em>A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.impl.BImpl <em>B</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.impl.BImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.impl.AnytypePackageImpl#getB()
	 * @generated
	 */
	int B = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__NAME = 0;

	/**
	 * The number of structural features of the '<em>B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.impl.TestAnyImpl <em>Test Any</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.impl.TestAnyImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.impl.AnytypePackageImpl#getTestAny()
	 * @generated
	 */
	int TEST_ANY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ANY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Single Any Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ANY__SINGLE_ANY_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Multi Any Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ANY__MULTI_ANY_TYPE = 2;

	/**
	 * The feature id for the '<em><b>My Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ANY__MY_ANY = 3;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ANY__ANY = 4;

	/**
	 * The number of structural features of the '<em>Test Any</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ANY_FEATURE_COUNT = 5;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.A <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.A
	 * @generated
	 */
	EClass getA();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.A#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.A#getName()
	 * @see #getA()
	 * @generated
	 */
	EAttribute getA_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.A#getDoub <em>Doub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doub</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.A#getDoub()
	 * @see #getA()
	 * @generated
	 */
	EAttribute getA_Doub();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.A#getLon <em>Lon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lon</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.A#getLon()
	 * @see #getA()
	 * @generated
	 */
	EAttribute getA_Lon();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.A#getMyB <em>My B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>My B</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.A#getMyB()
	 * @see #getA()
	 * @generated
	 */
	EReference getA_MyB();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.B <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>B</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.B
	 * @generated
	 */
	EClass getB();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.B#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.B#getName()
	 * @see #getB()
	 * @generated
	 */
	EAttribute getB_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.TestAny <em>Test Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Any</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.TestAny
	 * @generated
	 */
	EClass getTestAny();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.TestAny#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.TestAny#getName()
	 * @see #getTestAny()
	 * @generated
	 */
	EAttribute getTestAny_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.TestAny#getSingleAnyType <em>Single Any Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Single Any Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.TestAny#getSingleAnyType()
	 * @see #getTestAny()
	 * @generated
	 */
	EReference getTestAny_SingleAnyType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.TestAny#getMultiAnyType <em>Multi Any Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Multi Any Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.TestAny#getMultiAnyType()
	 * @see #getTestAny()
	 * @generated
	 */
	EReference getTestAny_MultiAnyType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.TestAny#getMyAny <em>My Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>My Any</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.TestAny#getMyAny()
	 * @see #getTestAny()
	 * @generated
	 */
	EAttribute getTestAny_MyAny();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.TestAny#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.TestAny#getAny()
	 * @see #getTestAny()
	 * @generated
	 */
	EAttribute getTestAny_Any();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AnytypeFactory getAnytypeFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.impl.AImpl <em>A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.impl.AImpl
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.impl.AnytypePackageImpl#getA()
		 * @generated
		 */
		EClass A = eINSTANCE.getA();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A__NAME = eINSTANCE.getA_Name();

		/**
		 * The meta object literal for the '<em><b>Doub</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A__DOUB = eINSTANCE.getA_Doub();

		/**
		 * The meta object literal for the '<em><b>Lon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A__LON = eINSTANCE.getA_Lon();

		/**
		 * The meta object literal for the '<em><b>My B</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference A__MY_B = eINSTANCE.getA_MyB();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.impl.BImpl <em>B</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.impl.BImpl
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.impl.AnytypePackageImpl#getB()
		 * @generated
		 */
		EClass B = eINSTANCE.getB();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute B__NAME = eINSTANCE.getB_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.impl.TestAnyImpl <em>Test Any</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.impl.TestAnyImpl
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.impl.AnytypePackageImpl#getTestAny()
		 * @generated
		 */
		EClass TEST_ANY = eINSTANCE.getTestAny();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_ANY__NAME = eINSTANCE.getTestAny_Name();

		/**
		 * The meta object literal for the '<em><b>Single Any Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_ANY__SINGLE_ANY_TYPE = eINSTANCE.getTestAny_SingleAnyType();

		/**
		 * The meta object literal for the '<em><b>Multi Any Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_ANY__MULTI_ANY_TYPE = eINSTANCE.getTestAny_MultiAnyType();

		/**
		 * The meta object literal for the '<em><b>My Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_ANY__MY_ANY = eINSTANCE.getTestAny_MyAny();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_ANY__ANY = eINSTANCE.getTestAny_Any();

	}

} //AnytypePackage
