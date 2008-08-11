/**
 * <copyright>
 * </copyright>
 *
 * $Id: HibernatePackage.java,v 1.3 2008/08/11 20:40:39 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.hibernate;

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
 * @see org.eclipse.emf.teneo.samples.emf.annotations.hibernate.HibernateFactory
 * @model kind="package"
 * @generated
 */
public interface HibernatePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hibernate";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/emf/annotations/hibernate";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hibernate";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HibernatePackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.annotations.hibernate.impl.HibernatePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.hibernate.impl.CityImpl <em>City</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hibernate.impl.CityImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hibernate.impl.HibernatePackageImpl#getCity()
	 * @generated
	 */
	int CITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Streets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__STREETS = 1;

	/**
	 * The number of structural features of the '<em>City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.hibernate.impl.StreetImpl <em>Street</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hibernate.impl.StreetImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hibernate.impl.HibernatePackageImpl#getStreet()
	 * @generated
	 */
	int STREET = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET__NAME = 0;

	/**
	 * The feature id for the '<em><b>City</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET__CITY = 1;

	/**
	 * The number of structural features of the '<em>Street</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.hibernate.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hibernate.impl.StateImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hibernate.impl.HibernatePackageImpl#getState()
	 * @generated
	 */
	int STATE = 2;

	/**
	 * The feature id for the '<em><b>State Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STATE_DETAIL = 0;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.hibernate.impl.StateDetailImpl <em>State Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hibernate.impl.StateDetailImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hibernate.impl.HibernatePackageImpl#getStateDetail()
	 * @generated
	 */
	int STATE_DETAIL = 3;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_DETAIL__STATE = 0;

	/**
	 * The number of structural features of the '<em>State Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_DETAIL_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.hibernate.City <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>City</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hibernate.City
	 * @generated
	 */
	EClass getCity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.hibernate.City#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hibernate.City#getName()
	 * @see #getCity()
	 * @generated
	 */
	EAttribute getCity_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.emf.annotations.hibernate.City#getStreets <em>Streets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Streets</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hibernate.City#getStreets()
	 * @see #getCity()
	 * @generated
	 */
	EReference getCity_Streets();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.hibernate.Street <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Street</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hibernate.Street
	 * @generated
	 */
	EClass getStreet();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.hibernate.Street#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hibernate.Street#getName()
	 * @see #getStreet()
	 * @generated
	 */
	EAttribute getStreet_Name();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.teneo.samples.emf.annotations.hibernate.Street#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>City</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hibernate.Street#getCity()
	 * @see #getStreet()
	 * @generated
	 */
	EReference getStreet_City();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.hibernate.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hibernate.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.emf.annotations.hibernate.State#getStateDetail <em>State Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State Detail</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hibernate.State#getStateDetail()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_StateDetail();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.hibernate.StateDetail <em>State Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Detail</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hibernate.StateDetail
	 * @generated
	 */
	EClass getStateDetail();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.emf.annotations.hibernate.StateDetail#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hibernate.StateDetail#getState()
	 * @see #getStateDetail()
	 * @generated
	 */
	EReference getStateDetail_State();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HibernateFactory getHibernateFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.hibernate.impl.CityImpl <em>City</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.hibernate.impl.CityImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.hibernate.impl.HibernatePackageImpl#getCity()
		 * @generated
		 */
		EClass CITY = eINSTANCE.getCity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY__NAME = eINSTANCE.getCity_Name();

		/**
		 * The meta object literal for the '<em><b>Streets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY__STREETS = eINSTANCE.getCity_Streets();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.hibernate.impl.StreetImpl <em>Street</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.hibernate.impl.StreetImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.hibernate.impl.HibernatePackageImpl#getStreet()
		 * @generated
		 */
		EClass STREET = eINSTANCE.getStreet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREET__NAME = eINSTANCE.getStreet_Name();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREET__CITY = eINSTANCE.getStreet_City();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.hibernate.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.hibernate.impl.StateImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.hibernate.impl.HibernatePackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>State Detail</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__STATE_DETAIL = eINSTANCE.getState_StateDetail();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.hibernate.impl.StateDetailImpl <em>State Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.hibernate.impl.StateDetailImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.hibernate.impl.HibernatePackageImpl#getStateDetail()
		 * @generated
		 */
		EClass STATE_DETAIL = eINSTANCE.getStateDetail();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_DETAIL__STATE = eINSTANCE.getStateDetail_State();

	}

} //HibernatePackage
