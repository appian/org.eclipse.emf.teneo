/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz245634Package.java,v 1.1 2008/09/21 18:35:58 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz245634;

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
 * @see org.eclipse.emf.teneo.samples.issues.bz245634.Bz245634Factory
 * @model kind="package"
 * @generated
 */
public interface Bz245634Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bz245634";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/issues/bz245634";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bz245634";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz245634Package eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz245634.impl.Bz245634PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz245634.impl.CityImpl <em>City</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz245634.impl.CityImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz245634.impl.Bz245634PackageImpl#getCity()
	 * @generated
	 */
	int CITY = 0;

	/**
	 * The feature id for the '<em><b>Mayor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__MAYOR = 0;

	/**
	 * The feature id for the '<em><b>Police Chief</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__POLICE_CHIEF = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__ID = 2;

	/**
	 * The feature id for the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__COUNTRY = 3;

	/**
	 * The number of structural features of the '<em>City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz245634.impl.MayorImpl <em>Mayor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz245634.impl.MayorImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz245634.impl.Bz245634PackageImpl#getMayor()
	 * @generated
	 */
	int MAYOR = 1;

	/**
	 * The feature id for the '<em><b>City</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYOR__CITY = 0;

	/**
	 * The number of structural features of the '<em>Mayor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz245634.impl.PoliceChiefImpl <em>Police Chief</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz245634.impl.PoliceChiefImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz245634.impl.Bz245634PackageImpl#getPoliceChief()
	 * @generated
	 */
	int POLICE_CHIEF = 2;

	/**
	 * The feature id for the '<em><b>City</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICE_CHIEF__CITY = 0;

	/**
	 * The number of structural features of the '<em>Police Chief</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICE_CHIEF_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz245634.impl.CountryImpl <em>Country</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz245634.impl.CountryImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz245634.impl.Bz245634PackageImpl#getCountry()
	 * @generated
	 */
	int COUNTRY = 3;

	/**
	 * The number of structural features of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz245634.City <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>City</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz245634.City
	 * @generated
	 */
	EClass getCity();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.issues.bz245634.City#getMayor <em>Mayor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mayor</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz245634.City#getMayor()
	 * @see #getCity()
	 * @generated
	 */
	EReference getCity_Mayor();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.issues.bz245634.City#getPoliceChief <em>Police Chief</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Police Chief</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz245634.City#getPoliceChief()
	 * @see #getCity()
	 * @generated
	 */
	EReference getCity_PoliceChief();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz245634.City#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz245634.City#getId()
	 * @see #getCity()
	 * @generated
	 */
	EAttribute getCity_Id();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.issues.bz245634.City#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Country</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz245634.City#getCountry()
	 * @see #getCity()
	 * @generated
	 */
	EReference getCity_Country();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz245634.Mayor <em>Mayor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mayor</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz245634.Mayor
	 * @generated
	 */
	EClass getMayor();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.issues.bz245634.Mayor#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>City</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz245634.Mayor#getCity()
	 * @see #getMayor()
	 * @generated
	 */
	EReference getMayor_City();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz245634.PoliceChief <em>Police Chief</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Police Chief</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz245634.PoliceChief
	 * @generated
	 */
	EClass getPoliceChief();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.issues.bz245634.PoliceChief#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>City</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz245634.PoliceChief#getCity()
	 * @see #getPoliceChief()
	 * @generated
	 */
	EReference getPoliceChief_City();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz245634.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz245634.Country
	 * @generated
	 */
	EClass getCountry();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Bz245634Factory getBz245634Factory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz245634.impl.CityImpl <em>City</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz245634.impl.CityImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz245634.impl.Bz245634PackageImpl#getCity()
		 * @generated
		 */
		EClass CITY = eINSTANCE.getCity();

		/**
		 * The meta object literal for the '<em><b>Mayor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY__MAYOR = eINSTANCE.getCity_Mayor();

		/**
		 * The meta object literal for the '<em><b>Police Chief</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY__POLICE_CHIEF = eINSTANCE.getCity_PoliceChief();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY__ID = eINSTANCE.getCity_Id();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY__COUNTRY = eINSTANCE.getCity_Country();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz245634.impl.MayorImpl <em>Mayor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz245634.impl.MayorImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz245634.impl.Bz245634PackageImpl#getMayor()
		 * @generated
		 */
		EClass MAYOR = eINSTANCE.getMayor();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAYOR__CITY = eINSTANCE.getMayor_City();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz245634.impl.PoliceChiefImpl <em>Police Chief</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz245634.impl.PoliceChiefImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz245634.impl.Bz245634PackageImpl#getPoliceChief()
		 * @generated
		 */
		EClass POLICE_CHIEF = eINSTANCE.getPoliceChief();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICE_CHIEF__CITY = eINSTANCE.getPoliceChief_City();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz245634.impl.CountryImpl <em>Country</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz245634.impl.CountryImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz245634.impl.Bz245634PackageImpl#getCountry()
		 * @generated
		 */
		EClass COUNTRY = eINSTANCE.getCountry();

	}

} //Bz245634Package
