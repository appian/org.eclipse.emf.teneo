/**
 */
package org.eclipse.emf.teneo.samples.issues.bz401710;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.eclipse.emf.teneo.samples.issues.bz401710.Bz401710Factory
 * @model kind="package"
 * @generated
 */
public interface Bz401710Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bz401710";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/issues/bz401710";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bz401710";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz401710Package eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz401710.impl.Bz401710PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz401710.IDummy <em>IDummy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz401710.IDummy
	 * @see org.eclipse.emf.teneo.samples.issues.bz401710.impl.Bz401710PackageImpl#getIDummy()
	 * @generated
	 */
	int IDUMMY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDUMMY__NAME = 0;

	/**
	 * The number of structural features of the '<em>IDummy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDUMMY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz401710.IIdentifiable <em>IIdentifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz401710.IIdentifiable
	 * @see org.eclipse.emf.teneo.samples.issues.bz401710.impl.Bz401710PackageImpl#getIIdentifiable()
	 * @generated
	 */
	int IIDENTIFIABLE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IIDENTIFIABLE__ID = 0;

	/**
	 * The feature id for the '<em><b>Bds Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IIDENTIFIABLE__BDS_VERSION = 1;

	/**
	 * The number of structural features of the '<em>IIdentifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IIDENTIFIABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz401710.impl.RealClassImpl <em>Real Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz401710.impl.RealClassImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz401710.impl.Bz401710PackageImpl#getRealClass()
	 * @generated
	 */
	int REAL_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_CLASS__NAME = IDUMMY__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_CLASS__ID = IDUMMY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bds Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_CLASS__BDS_VERSION = IDUMMY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Real Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_CLASS_FEATURE_COUNT = IDUMMY_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz401710.IDummy <em>IDummy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDummy</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz401710.IDummy
	 * @generated
	 */
	EClass getIDummy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz401710.IDummy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz401710.IDummy#getName()
	 * @see #getIDummy()
	 * @generated
	 */
	EAttribute getIDummy_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz401710.IIdentifiable <em>IIdentifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IIdentifiable</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz401710.IIdentifiable
	 * @generated
	 */
	EClass getIIdentifiable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz401710.IIdentifiable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz401710.IIdentifiable#getId()
	 * @see #getIIdentifiable()
	 * @generated
	 */
	EAttribute getIIdentifiable_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz401710.IIdentifiable#getBdsVersion <em>Bds Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bds Version</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz401710.IIdentifiable#getBdsVersion()
	 * @see #getIIdentifiable()
	 * @generated
	 */
	EAttribute getIIdentifiable_BdsVersion();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz401710.RealClass <em>Real Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Class</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz401710.RealClass
	 * @generated
	 */
	EClass getRealClass();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Bz401710Factory getBz401710Factory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz401710.IDummy <em>IDummy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz401710.IDummy
		 * @see org.eclipse.emf.teneo.samples.issues.bz401710.impl.Bz401710PackageImpl#getIDummy()
		 * @generated
		 */
		EClass IDUMMY = eINSTANCE.getIDummy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDUMMY__NAME = eINSTANCE.getIDummy_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz401710.IIdentifiable <em>IIdentifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz401710.IIdentifiable
		 * @see org.eclipse.emf.teneo.samples.issues.bz401710.impl.Bz401710PackageImpl#getIIdentifiable()
		 * @generated
		 */
		EClass IIDENTIFIABLE = eINSTANCE.getIIdentifiable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IIDENTIFIABLE__ID = eINSTANCE.getIIdentifiable_Id();

		/**
		 * The meta object literal for the '<em><b>Bds Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IIDENTIFIABLE__BDS_VERSION = eINSTANCE.getIIdentifiable_BdsVersion();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz401710.impl.RealClassImpl <em>Real Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz401710.impl.RealClassImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz401710.impl.Bz401710PackageImpl#getRealClass()
		 * @generated
		 */
		EClass REAL_CLASS = eINSTANCE.getRealClass();

	}

} //Bz401710Package
