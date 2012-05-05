/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrphanremovalFactoryImpl extends EFactoryImpl implements OrphanremovalFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OrphanremovalFactory init() {
		try {
			OrphanremovalFactory theOrphanremovalFactory = (OrphanremovalFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/emf/jpa2/orphanremoval"); 
			if (theOrphanremovalFactory != null) {
				return theOrphanremovalFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OrphanremovalFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrphanremovalFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OrphanremovalPackage.EMPLOYEE: return createEmployee();
			case OrphanremovalPackage.EMPLOYEE_INFO: return createEmployeeInfo();
			case OrphanremovalPackage.ADDRESS: return createAddress();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee createEmployee() {
		EmployeeImpl employee = new EmployeeImpl();
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeeInfo createEmployeeInfo() {
		EmployeeInfoImpl employeeInfo = new EmployeeInfoImpl();
		return employeeInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address createAddress() {
		AddressImpl address = new AddressImpl();
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrphanremovalPackage getOrphanremovalPackage() {
		return (OrphanremovalPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OrphanremovalPackage getPackage() {
		return OrphanremovalPackage.eINSTANCE;
	}

} //OrphanremovalFactoryImpl
