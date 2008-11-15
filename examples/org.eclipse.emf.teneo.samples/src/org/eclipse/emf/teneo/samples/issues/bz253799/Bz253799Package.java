/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz253799Package.java,v 1.1 2008/11/15 21:37:31 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz253799;

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
 * @see org.eclipse.emf.teneo.samples.issues.bz253799.Bz253799Factory
 * @model kind="package"
 * @generated
 */
public interface Bz253799Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bz253799";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/issues/bz253799";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bz253799";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz253799Package eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz253799.impl.Bz253799PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz253799.impl.OneImpl <em>One</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz253799.impl.OneImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz253799.impl.Bz253799PackageImpl#getOne()
	 * @generated
	 */
	int ONE = 0;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE__REF = 0;

	/**
	 * The number of structural features of the '<em>One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz253799.impl.TwoImpl <em>Two</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz253799.impl.TwoImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz253799.impl.Bz253799PackageImpl#getTwo()
	 * @generated
	 */
	int TWO = 1;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO__REF = 0;

	/**
	 * The number of structural features of the '<em>Two</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz253799.One <em>One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz253799.One
	 * @generated
	 */
	EClass getOne();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.issues.bz253799.One#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz253799.One#getRef()
	 * @see #getOne()
	 * @generated
	 */
	EReference getOne_Ref();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz253799.Two <em>Two</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Two</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz253799.Two
	 * @generated
	 */
	EClass getTwo();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.issues.bz253799.Two#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz253799.Two#getRef()
	 * @see #getTwo()
	 * @generated
	 */
	EReference getTwo_Ref();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Bz253799Factory getBz253799Factory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz253799.impl.OneImpl <em>One</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz253799.impl.OneImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz253799.impl.Bz253799PackageImpl#getOne()
		 * @generated
		 */
		EClass ONE = eINSTANCE.getOne();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE__REF = eINSTANCE.getOne_Ref();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz253799.impl.TwoImpl <em>Two</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz253799.impl.TwoImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz253799.impl.Bz253799PackageImpl#getTwo()
		 * @generated
		 */
		EClass TWO = eINSTANCE.getTwo();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWO__REF = eINSTANCE.getTwo_Ref();

	}

} //Bz253799Package
