/**
 * <copyright>
 * </copyright>
 *
 * $Id: ListPackage.java,v 1.1 2006/07/11 16:57:14 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.list;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.ListFactory
 * @model kind="package"
 * @generated
 */
public interface ListPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "list";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/emf/schemaconstructs/list";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "list";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ListPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.impl.ListPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.impl.statesByCountryImpl <em>states By Country</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.impl.statesByCountryImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.impl.ListPackageImpl#getstatesByCountry()
	 * @generated
	 */
	int STATES_BY_COUNTRY = 0;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATES_BY_COUNTRY__COUNTRY = 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATES_BY_COUNTRY__INDEX = 1;

	/**
	 * The feature id for the '<em><b>All States</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATES_BY_COUNTRY__ALL_STATES = 2;

	/**
	 * The feature id for the '<em><b>Six Important States</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATES_BY_COUNTRY__SIX_IMPORTANT_STATES = 3;

	/**
	 * The number of structural features of the '<em>states By Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATES_BY_COUNTRY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '<em>Six States List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.impl.ListPackageImpl#getSixStatesList()
	 * @generated
	 */
	int SIX_STATES_LIST = 1;

	/**
	 * The meta object id for the '<em>State</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.impl.ListPackageImpl#getState()
	 * @generated
	 */
	int STATE = 2;

	/**
	 * The meta object id for the '<em>State List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.impl.ListPackageImpl#getStateList()
	 * @generated
	 */
	int STATE_LIST = 3;

	/**
	 * The meta object id for the '<em>String List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.impl.ListPackageImpl#getStringList()
	 * @generated
	 */
	int STRING_LIST = 4;

	/**
	 * The meta object id for the '<em>Zip Code</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.impl.ListPackageImpl#getZipCode()
	 * @generated
	 */
	int ZIP_CODE = 5;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.statesByCountry <em>states By Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>states By Country</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.statesByCountry
	 * @generated
	 */
	EClass getstatesByCountry();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.statesByCountry#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.statesByCountry#getCountry()
	 * @see #getstatesByCountry()
	 * @generated
	 */
	EAttribute getstatesByCountry_Country();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.statesByCountry#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.statesByCountry#getIndex()
	 * @see #getstatesByCountry()
	 * @generated
	 */
	EAttribute getstatesByCountry_Index();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.statesByCountry#getAllStates <em>All States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All States</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.statesByCountry#getAllStates()
	 * @see #getstatesByCountry()
	 * @generated
	 */
	EAttribute getstatesByCountry_AllStates();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.statesByCountry#getSixImportantStates <em>Six Important States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Six Important States</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.statesByCountry#getSixImportantStates()
	 * @see #getstatesByCountry()
	 * @generated
	 */
	EAttribute getstatesByCountry_SixImportantStates();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Six States List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Six States List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='SixStatesList' baseType='StateList' length='6'" 
	 * @generated
	 */
	EDataType getSixStatesList();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>State</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='State' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='12'" 
	 * @generated
	 */
	EDataType getState();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>State List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>State List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='StateList' itemType='State'" 
	 * @generated
	 */
	EDataType getStateList();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>String List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='StringList' itemType='http://www.eclipse.org/emf/2003/XMLType#string'" 
	 * @generated
	 */
	EDataType getStringList();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Zip Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Zip Code</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='zipCode' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='6'" 
	 * @generated
	 */
	EDataType getZipCode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ListFactory getListFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.impl.statesByCountryImpl <em>states By Country</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.impl.statesByCountryImpl
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.impl.ListPackageImpl#getstatesByCountry()
		 * @generated
		 */
		EClass STATES_BY_COUNTRY = eINSTANCE.getstatesByCountry();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATES_BY_COUNTRY__COUNTRY = eINSTANCE.getstatesByCountry_Country();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATES_BY_COUNTRY__INDEX = eINSTANCE.getstatesByCountry_Index();

		/**
		 * The meta object literal for the '<em><b>All States</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATES_BY_COUNTRY__ALL_STATES = eINSTANCE.getstatesByCountry_AllStates();

		/**
		 * The meta object literal for the '<em><b>Six Important States</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATES_BY_COUNTRY__SIX_IMPORTANT_STATES = eINSTANCE.getstatesByCountry_SixImportantStates();

		/**
		 * The meta object literal for the '<em>Six States List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.impl.ListPackageImpl#getSixStatesList()
		 * @generated
		 */
		EDataType SIX_STATES_LIST = eINSTANCE.getSixStatesList();

		/**
		 * The meta object literal for the '<em>State</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.impl.ListPackageImpl#getState()
		 * @generated
		 */
		EDataType STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em>State List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.impl.ListPackageImpl#getStateList()
		 * @generated
		 */
		EDataType STATE_LIST = eINSTANCE.getStateList();

		/**
		 * The meta object literal for the '<em>String List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.impl.ListPackageImpl#getStringList()
		 * @generated
		 */
		EDataType STRING_LIST = eINSTANCE.getStringList();

		/**
		 * The meta object literal for the '<em>Zip Code</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.impl.ListPackageImpl#getZipCode()
		 * @generated
		 */
		EDataType ZIP_CODE = eINSTANCE.getZipCode();

	}

} //ListPackage
