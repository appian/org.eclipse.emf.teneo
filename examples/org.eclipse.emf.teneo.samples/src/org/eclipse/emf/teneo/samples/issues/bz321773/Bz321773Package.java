/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz321773Package.java,v 1.1 2010/08/19 08:34:51 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz321773;

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
 * @see org.eclipse.emf.teneo.samples.issues.bz321773.Bz321773Factory
 * @model kind="package"
 * @generated
 */
public interface Bz321773Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bz321773";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/issues/bz321773";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bz321773";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz321773Package eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz321773.impl.Bz321773PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz321773.impl.Item1Impl <em>Item1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz321773.impl.Item1Impl
	 * @see org.eclipse.emf.teneo.samples.issues.bz321773.impl.Bz321773PackageImpl#getItem1()
	 * @generated
	 */
	int ITEM1 = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM1__ID = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM1__DATA = 1;

	/**
	 * The number of structural features of the '<em>Item1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM1_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz321773.impl.Item2Impl <em>Item2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz321773.impl.Item2Impl
	 * @see org.eclipse.emf.teneo.samples.issues.bz321773.impl.Bz321773PackageImpl#getItem2()
	 * @generated
	 */
	int ITEM2 = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM2__ID = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM2__DATA = 1;

	/**
	 * The number of structural features of the '<em>Item2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM2_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz321773.Item1 <em>Item1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item1</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz321773.Item1
	 * @generated
	 */
	EClass getItem1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz321773.Item1#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz321773.Item1#getId()
	 * @see #getItem1()
	 * @generated
	 */
	EAttribute getItem1_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz321773.Item1#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz321773.Item1#getData()
	 * @see #getItem1()
	 * @generated
	 */
	EAttribute getItem1_Data();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz321773.Item2 <em>Item2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item2</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz321773.Item2
	 * @generated
	 */
	EClass getItem2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz321773.Item2#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz321773.Item2#getId()
	 * @see #getItem2()
	 * @generated
	 */
	EAttribute getItem2_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz321773.Item2#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz321773.Item2#getData()
	 * @see #getItem2()
	 * @generated
	 */
	EAttribute getItem2_Data();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Bz321773Factory getBz321773Factory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz321773.impl.Item1Impl <em>Item1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz321773.impl.Item1Impl
		 * @see org.eclipse.emf.teneo.samples.issues.bz321773.impl.Bz321773PackageImpl#getItem1()
		 * @generated
		 */
		EClass ITEM1 = eINSTANCE.getItem1();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM1__ID = eINSTANCE.getItem1_Id();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM1__DATA = eINSTANCE.getItem1_Data();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz321773.impl.Item2Impl <em>Item2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz321773.impl.Item2Impl
		 * @see org.eclipse.emf.teneo.samples.issues.bz321773.impl.Bz321773PackageImpl#getItem2()
		 * @generated
		 */
		EClass ITEM2 = eINSTANCE.getItem2();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM2__ID = eINSTANCE.getItem2_Id();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM2__DATA = eINSTANCE.getItem2_Data();

	}

} //Bz321773Package
