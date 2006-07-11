/**
 * <copyright>
 * </copyright>
 *
 * $Id: ManytomanyPackage.java,v 1.1 2006/07/11 16:57:17 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.manytomany;

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
 * @see org.eclipse.emf.teneo.samples.emf.annotations.manytomany.ManytomanyFactory
 * @model kind="package"
 * @generated
 */
public interface ManytomanyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "manytomany";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/emf/annotations/manytomany";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "manytomany";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ManytomanyPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.annotations.manytomany.impl.ManytomanyPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.manytomany.impl.CntrImpl <em>Cntr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.manytomany.impl.CntrImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.manytomany.impl.ManytomanyPackageImpl#getCntr()
	 * @generated
	 */
	int CNTR = 0;

	/**
	 * The feature id for the '<em><b>Rght</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CNTR__RGHT = 0;

	/**
	 * The feature id for the '<em><b>Lft</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CNTR__LFT = 1;

	/**
	 * The number of structural features of the '<em>Cntr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CNTR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.manytomany.impl.LftImpl <em>Lft</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.manytomany.impl.LftImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.manytomany.impl.ManytomanyPackageImpl#getLft()
	 * @generated
	 */
	int LFT = 1;

	/**
	 * The feature id for the '<em><b>Cntr</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LFT__CNTR = 0;

	/**
	 * The number of structural features of the '<em>Lft</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LFT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.manytomany.impl.RghtImpl <em>Rght</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.manytomany.impl.RghtImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.manytomany.impl.ManytomanyPackageImpl#getRght()
	 * @generated
	 */
	int RGHT = 2;

	/**
	 * The feature id for the '<em><b>Cntr</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGHT__CNTR = 0;

	/**
	 * The number of structural features of the '<em>Rght</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGHT_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Cntr <em>Cntr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cntr</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Cntr
	 * @generated
	 */
	EClass getCntr();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Cntr#getRght <em>Rght</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rght</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Cntr#getRght()
	 * @see #getCntr()
	 * @generated
	 */
	EReference getCntr_Rght();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Cntr#getLft <em>Lft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lft</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Cntr#getLft()
	 * @see #getCntr()
	 * @generated
	 */
	EReference getCntr_Lft();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Lft <em>Lft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lft</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Lft
	 * @generated
	 */
	EClass getLft();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Lft#getCntr <em>Cntr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cntr</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Lft#getCntr()
	 * @see #getLft()
	 * @generated
	 */
	EReference getLft_Cntr();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Rght <em>Rght</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rght</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Rght
	 * @generated
	 */
	EClass getRght();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Rght#getCntr <em>Cntr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cntr</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Rght#getCntr()
	 * @see #getRght()
	 * @generated
	 */
	EReference getRght_Cntr();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ManytomanyFactory getManytomanyFactory();

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
	interface Literals  {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.manytomany.impl.CntrImpl <em>Cntr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.manytomany.impl.CntrImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.manytomany.impl.ManytomanyPackageImpl#getCntr()
		 * @generated
		 */
		EClass CNTR = eINSTANCE.getCntr();

		/**
		 * The meta object literal for the '<em><b>Rght</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CNTR__RGHT = eINSTANCE.getCntr_Rght();

		/**
		 * The meta object literal for the '<em><b>Lft</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CNTR__LFT = eINSTANCE.getCntr_Lft();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.manytomany.impl.LftImpl <em>Lft</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.manytomany.impl.LftImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.manytomany.impl.ManytomanyPackageImpl#getLft()
		 * @generated
		 */
		EClass LFT = eINSTANCE.getLft();

		/**
		 * The meta object literal for the '<em><b>Cntr</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LFT__CNTR = eINSTANCE.getLft_Cntr();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.manytomany.impl.RghtImpl <em>Rght</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.manytomany.impl.RghtImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.manytomany.impl.ManytomanyPackageImpl#getRght()
		 * @generated
		 */
		EClass RGHT = eINSTANCE.getRght();

		/**
		 * The meta object literal for the '<em><b>Cntr</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RGHT__CNTR = eINSTANCE.getRght_Cntr();

	}

} //ManytomanyPackage
