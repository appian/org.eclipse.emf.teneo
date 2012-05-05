/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval;

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
 * @see org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.OrphanremovalFactory
 * @model kind="package"
 * @generated
 */
public interface OrphanremovalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "orphanremoval";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/emf/jpa2/orphanremoval";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "orphanremoval";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OrphanremovalPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.impl.OrphanremovalPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.impl.EmployeeImpl
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.impl.OrphanremovalPackageImpl#getEmployee()
	 * @generated
	 */
	int EMPLOYEE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__ID = 0;

	/**
	 * The feature id for the '<em><b>Employee Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__EMPLOYEE_INFO = 1;

	/**
	 * The feature id for the '<em><b>Addresses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__ADDRESSES = 2;

	/**
	 * The number of structural features of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.impl.EmployeeInfoImpl <em>Employee Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.impl.EmployeeInfoImpl
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.impl.OrphanremovalPackageImpl#getEmployeeInfo()
	 * @generated
	 */
	int EMPLOYEE_INFO = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_INFO__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_INFO__NAME = 1;

	/**
	 * The feature id for the '<em><b>Employee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_INFO__EMPLOYEE = 2;

	/**
	 * The number of structural features of the '<em>Employee Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_INFO_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.impl.AddressImpl
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.impl.OrphanremovalPackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__NAME = 0;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.Employee
	 * @generated
	 */
	EClass getEmployee();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.Employee#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.Employee#getId()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Id();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.Employee#getEmployeeInfo <em>Employee Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Employee Info</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.Employee#getEmployeeInfo()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_EmployeeInfo();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.Employee#getAddresses <em>Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Addresses</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.Employee#getAddresses()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_Addresses();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.EmployeeInfo <em>Employee Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee Info</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.EmployeeInfo
	 * @generated
	 */
	EClass getEmployeeInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.EmployeeInfo#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.EmployeeInfo#getId()
	 * @see #getEmployeeInfo()
	 * @generated
	 */
	EAttribute getEmployeeInfo_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.EmployeeInfo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.EmployeeInfo#getName()
	 * @see #getEmployeeInfo()
	 * @generated
	 */
	EAttribute getEmployeeInfo_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.EmployeeInfo#getEmployee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Employee</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.EmployeeInfo#getEmployee()
	 * @see #getEmployeeInfo()
	 * @generated
	 */
	EReference getEmployeeInfo_Employee();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.Address#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.Address#getName()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OrphanremovalFactory getOrphanremovalFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.impl.EmployeeImpl <em>Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.impl.EmployeeImpl
		 * @see org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.impl.OrphanremovalPackageImpl#getEmployee()
		 * @generated
		 */
		EClass EMPLOYEE = eINSTANCE.getEmployee();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__ID = eINSTANCE.getEmployee_Id();

		/**
		 * The meta object literal for the '<em><b>Employee Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__EMPLOYEE_INFO = eINSTANCE.getEmployee_EmployeeInfo();

		/**
		 * The meta object literal for the '<em><b>Addresses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__ADDRESSES = eINSTANCE.getEmployee_Addresses();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.impl.EmployeeInfoImpl <em>Employee Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.impl.EmployeeInfoImpl
		 * @see org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.impl.OrphanremovalPackageImpl#getEmployeeInfo()
		 * @generated
		 */
		EClass EMPLOYEE_INFO = eINSTANCE.getEmployeeInfo();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE_INFO__ID = eINSTANCE.getEmployeeInfo_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE_INFO__NAME = eINSTANCE.getEmployeeInfo_Name();

		/**
		 * The meta object literal for the '<em><b>Employee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE_INFO__EMPLOYEE = eINSTANCE.getEmployeeInfo_Employee();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.impl.AddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.impl.AddressImpl
		 * @see org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.impl.OrphanremovalPackageImpl#getAddress()
		 * @generated
		 */
		EClass ADDRESS = eINSTANCE.getAddress();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__NAME = eINSTANCE.getAddress_Name();

	}

} //OrphanremovalPackage
