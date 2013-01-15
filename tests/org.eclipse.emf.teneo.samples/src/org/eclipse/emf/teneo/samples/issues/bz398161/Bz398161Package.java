/**
 */
package org.eclipse.emf.teneo.samples.issues.bz398161;

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
 * @see org.eclipse.emf.teneo.samples.issues.bz398161.Bz398161Factory
 * @model kind="package"
 * @generated
 */
public interface Bz398161Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bz398161";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/issues/bz398161";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bz398161";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz398161Package eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz398161.impl.Bz398161PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz398161.impl.RefOneImpl <em>Ref One</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz398161.impl.RefOneImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz398161.impl.Bz398161PackageImpl#getRefOne()
	 * @generated
	 */
	int REF_ONE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_ONE__ID = 0;

	/**
	 * The feature id for the '<em><b>Ref Two</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_ONE__REF_TWO = 1;

	/**
	 * The number of structural features of the '<em>Ref One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_ONE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz398161.impl.RefTwoImpl <em>Ref Two</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz398161.impl.RefTwoImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz398161.impl.Bz398161PackageImpl#getRefTwo()
	 * @generated
	 */
	int REF_TWO = 1;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TWO__NUMBER = 0;

	/**
	 * The number of structural features of the '<em>Ref Two</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TWO_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz398161.RefOne <em>Ref One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref One</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz398161.RefOne
	 * @generated
	 */
	EClass getRefOne();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz398161.RefOne#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz398161.RefOne#getId()
	 * @see #getRefOne()
	 * @generated
	 */
	EAttribute getRefOne_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.issues.bz398161.RefOne#getRefTwo <em>Ref Two</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ref Two</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz398161.RefOne#getRefTwo()
	 * @see #getRefOne()
	 * @generated
	 */
	EReference getRefOne_RefTwo();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz398161.RefTwo <em>Ref Two</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Two</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz398161.RefTwo
	 * @generated
	 */
	EClass getRefTwo();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz398161.RefTwo#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz398161.RefTwo#getNumber()
	 * @see #getRefTwo()
	 * @generated
	 */
	EAttribute getRefTwo_Number();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Bz398161Factory getBz398161Factory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz398161.impl.RefOneImpl <em>Ref One</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz398161.impl.RefOneImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz398161.impl.Bz398161PackageImpl#getRefOne()
		 * @generated
		 */
		EClass REF_ONE = eINSTANCE.getRefOne();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REF_ONE__ID = eINSTANCE.getRefOne_Id();

		/**
		 * The meta object literal for the '<em><b>Ref Two</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_ONE__REF_TWO = eINSTANCE.getRefOne_RefTwo();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz398161.impl.RefTwoImpl <em>Ref Two</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz398161.impl.RefTwoImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz398161.impl.Bz398161PackageImpl#getRefTwo()
		 * @generated
		 */
		EClass REF_TWO = eINSTANCE.getRefTwo();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REF_TWO__NUMBER = eINSTANCE.getRefTwo_Number();

	}

} //Bz398161Package
