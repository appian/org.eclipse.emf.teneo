/**
 * <copyright>
 * </copyright>
 *
 * $Id: VariousPackage.java,v 1.1 2008/07/12 13:09:07 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.various;

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
 * @see org.eclipse.emf.teneo.samples.emf.annotations.various.VariousFactory
 * @model kind="package"
 * @generated
 */
public interface VariousPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "various";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/emf/annotations/various";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "various";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VariousPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.annotations.various.impl.VariousPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.various.impl.ParentImpl <em>Parent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.various.impl.ParentImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.various.impl.VariousPackageImpl#getParent()
	 * @generated
	 */
	int PARENT = 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT__CHILDREN = 0;

	/**
	 * The feature id for the '<em><b>Total People</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT__TOTAL_PEOPLE = 1;

	/**
	 * The number of structural features of the '<em>Parent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.various.impl.ChildImpl <em>Child</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.various.impl.ChildImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.various.impl.VariousPackageImpl#getChild()
	 * @generated
	 */
	int CHILD = 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD__CHILDREN = PARENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Total People</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD__TOTAL_PEOPLE = PARENT__TOTAL_PEOPLE;

	/**
	 * The number of structural features of the '<em>Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_FEATURE_COUNT = PARENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.various.impl.ImmutableCityImpl <em>Immutable City</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.various.impl.ImmutableCityImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.various.impl.VariousPackageImpl#getImmutableCity()
	 * @generated
	 */
	int IMMUTABLE_CITY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUTABLE_CITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUTABLE_CITY__PARENTS = 1;

	/**
	 * The number of structural features of the '<em>Immutable City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUTABLE_CITY_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.various.Parent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parent</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.various.Parent
	 * @generated
	 */
	EClass getParent();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.emf.annotations.various.Parent#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.various.Parent#getChildren()
	 * @see #getParent()
	 * @generated
	 */
	EReference getParent_Children();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.various.Parent#getTotalPeople <em>Total People</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total People</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.various.Parent#getTotalPeople()
	 * @see #getParent()
	 * @generated
	 */
	EAttribute getParent_TotalPeople();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.various.Child <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.various.Child
	 * @generated
	 */
	EClass getChild();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.various.ImmutableCity <em>Immutable City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immutable City</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.various.ImmutableCity
	 * @generated
	 */
	EClass getImmutableCity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.various.ImmutableCity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.various.ImmutableCity#getName()
	 * @see #getImmutableCity()
	 * @generated
	 */
	EAttribute getImmutableCity_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.emf.annotations.various.ImmutableCity#getParents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parents</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.various.ImmutableCity#getParents()
	 * @see #getImmutableCity()
	 * @generated
	 */
	EReference getImmutableCity_Parents();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VariousFactory getVariousFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.various.impl.ParentImpl <em>Parent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.various.impl.ParentImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.various.impl.VariousPackageImpl#getParent()
		 * @generated
		 */
		EClass PARENT = eINSTANCE.getParent();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARENT__CHILDREN = eINSTANCE.getParent_Children();

		/**
		 * The meta object literal for the '<em><b>Total People</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARENT__TOTAL_PEOPLE = eINSTANCE.getParent_TotalPeople();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.various.impl.ChildImpl <em>Child</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.various.impl.ChildImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.various.impl.VariousPackageImpl#getChild()
		 * @generated
		 */
		EClass CHILD = eINSTANCE.getChild();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.various.impl.ImmutableCityImpl <em>Immutable City</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.various.impl.ImmutableCityImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.various.impl.VariousPackageImpl#getImmutableCity()
		 * @generated
		 */
		EClass IMMUTABLE_CITY = eINSTANCE.getImmutableCity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMMUTABLE_CITY__NAME = eINSTANCE.getImmutableCity_Name();

		/**
		 * The meta object literal for the '<em><b>Parents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMMUTABLE_CITY__PARENTS = eINSTANCE.getImmutableCity_Parents();

	}

} //VariousPackage
