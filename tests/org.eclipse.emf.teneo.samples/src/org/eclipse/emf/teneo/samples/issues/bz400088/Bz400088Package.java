/**
 */
package org.eclipse.emf.teneo.samples.issues.bz400088;

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
 * @see org.eclipse.emf.teneo.samples.issues.bz400088.Bz400088Factory
 * @model kind="package"
 * @generated
 */
public interface Bz400088Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bz400088";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/issues/bz400088";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bz400088";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz400088Package eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz400088.impl.Bz400088PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz400088.impl.Case1Impl <em>Case1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz400088.impl.Case1Impl
	 * @see org.eclipse.emf.teneo.samples.issues.bz400088.impl.Bz400088PackageImpl#getCase1()
	 * @generated
	 */
	int CASE1 = 0;

	/**
	 * The feature id for the '<em><b>Case2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE1__CASE2 = 0;

	/**
	 * The feature id for the '<em><b>Bds Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE1__BDS_ID = 1;

	/**
	 * The feature id for the '<em><b>Bds Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE1__BDS_VERSION = 2;

	/**
	 * The number of structural features of the '<em>Case1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE1_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz400088.impl.Case2Impl <em>Case2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz400088.impl.Case2Impl
	 * @see org.eclipse.emf.teneo.samples.issues.bz400088.impl.Bz400088PackageImpl#getCase2()
	 * @generated
	 */
	int CASE2 = 1;

	/**
	 * The feature id for the '<em><b>Case1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE2__CASE1 = 0;

	/**
	 * The feature id for the '<em><b>Bds Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE2__BDS_ID = 1;

	/**
	 * The feature id for the '<em><b>Bds Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE2__BDS_VERSION = 2;

	/**
	 * The number of structural features of the '<em>Case2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE2_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz400088.impl.Ref400088Impl <em>Ref400088</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz400088.impl.Ref400088Impl
	 * @see org.eclipse.emf.teneo.samples.issues.bz400088.impl.Bz400088PackageImpl#getRef400088()
	 * @generated
	 */
	int REF400088 = 2;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF400088__REF = 0;

	/**
	 * The number of structural features of the '<em>Ref400088</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF400088_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz400088.impl.RefOther400088Impl <em>Ref Other400088</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz400088.impl.RefOther400088Impl
	 * @see org.eclipse.emf.teneo.samples.issues.bz400088.impl.Bz400088PackageImpl#getRefOther400088()
	 * @generated
	 */
	int REF_OTHER400088 = 3;

	/**
	 * The feature id for the '<em><b>Ref Other</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_OTHER400088__REF_OTHER = 0;

	/**
	 * The number of structural features of the '<em>Ref Other400088</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_OTHER400088_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz400088.Case1 <em>Case1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case1</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz400088.Case1
	 * @generated
	 */
	EClass getCase1();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.issues.bz400088.Case1#getCase2 <em>Case2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Case2</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz400088.Case1#getCase2()
	 * @see #getCase1()
	 * @generated
	 */
	EReference getCase1_Case2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz400088.Case1#getBdsId <em>Bds Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bds Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz400088.Case1#getBdsId()
	 * @see #getCase1()
	 * @generated
	 */
	EAttribute getCase1_BdsId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz400088.Case1#getBdsVersion <em>Bds Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bds Version</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz400088.Case1#getBdsVersion()
	 * @see #getCase1()
	 * @generated
	 */
	EAttribute getCase1_BdsVersion();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz400088.Case2 <em>Case2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case2</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz400088.Case2
	 * @generated
	 */
	EClass getCase2();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.issues.bz400088.Case2#getCase1 <em>Case1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Case1</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz400088.Case2#getCase1()
	 * @see #getCase2()
	 * @generated
	 */
	EReference getCase2_Case1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz400088.Case2#getBdsId <em>Bds Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bds Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz400088.Case2#getBdsId()
	 * @see #getCase2()
	 * @generated
	 */
	EAttribute getCase2_BdsId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz400088.Case2#getBdsVersion <em>Bds Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bds Version</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz400088.Case2#getBdsVersion()
	 * @see #getCase2()
	 * @generated
	 */
	EAttribute getCase2_BdsVersion();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz400088.Ref400088 <em>Ref400088</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref400088</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz400088.Ref400088
	 * @generated
	 */
	EClass getRef400088();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.issues.bz400088.Ref400088#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ref</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz400088.Ref400088#getRef()
	 * @see #getRef400088()
	 * @generated
	 */
	EReference getRef400088_Ref();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz400088.RefOther400088 <em>Ref Other400088</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Other400088</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz400088.RefOther400088
	 * @generated
	 */
	EClass getRefOther400088();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.teneo.samples.issues.bz400088.RefOther400088#getRefOther <em>Ref Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Ref Other</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz400088.RefOther400088#getRefOther()
	 * @see #getRefOther400088()
	 * @generated
	 */
	EReference getRefOther400088_RefOther();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Bz400088Factory getBz400088Factory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz400088.impl.Case1Impl <em>Case1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz400088.impl.Case1Impl
		 * @see org.eclipse.emf.teneo.samples.issues.bz400088.impl.Bz400088PackageImpl#getCase1()
		 * @generated
		 */
		EClass CASE1 = eINSTANCE.getCase1();

		/**
		 * The meta object literal for the '<em><b>Case2</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE1__CASE2 = eINSTANCE.getCase1_Case2();

		/**
		 * The meta object literal for the '<em><b>Bds Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASE1__BDS_ID = eINSTANCE.getCase1_BdsId();

		/**
		 * The meta object literal for the '<em><b>Bds Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASE1__BDS_VERSION = eINSTANCE.getCase1_BdsVersion();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz400088.impl.Case2Impl <em>Case2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz400088.impl.Case2Impl
		 * @see org.eclipse.emf.teneo.samples.issues.bz400088.impl.Bz400088PackageImpl#getCase2()
		 * @generated
		 */
		EClass CASE2 = eINSTANCE.getCase2();

		/**
		 * The meta object literal for the '<em><b>Case1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE2__CASE1 = eINSTANCE.getCase2_Case1();

		/**
		 * The meta object literal for the '<em><b>Bds Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASE2__BDS_ID = eINSTANCE.getCase2_BdsId();

		/**
		 * The meta object literal for the '<em><b>Bds Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASE2__BDS_VERSION = eINSTANCE.getCase2_BdsVersion();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz400088.impl.Ref400088Impl <em>Ref400088</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz400088.impl.Ref400088Impl
		 * @see org.eclipse.emf.teneo.samples.issues.bz400088.impl.Bz400088PackageImpl#getRef400088()
		 * @generated
		 */
		EClass REF400088 = eINSTANCE.getRef400088();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF400088__REF = eINSTANCE.getRef400088_Ref();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz400088.impl.RefOther400088Impl <em>Ref Other400088</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz400088.impl.RefOther400088Impl
		 * @see org.eclipse.emf.teneo.samples.issues.bz400088.impl.Bz400088PackageImpl#getRefOther400088()
		 * @generated
		 */
		EClass REF_OTHER400088 = eINSTANCE.getRefOther400088();

		/**
		 * The meta object literal for the '<em><b>Ref Other</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_OTHER400088__REF_OTHER = eINSTANCE.getRefOther400088_RefOther();

	}

} //Bz400088Package
