/**
 * <copyright>
 * </copyright>
 *
 * $Id: AttroverridesecondarytableFactoryImpl.java,v 1.1 2008/07/13 13:12:37 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.attroverridesecondarytable.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.teneo.samples.emf.annotations.attroverridesecondarytable.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttroverridesecondarytableFactoryImpl extends EFactoryImpl implements AttroverridesecondarytableFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AttroverridesecondarytableFactory init() {
		try {
			AttroverridesecondarytableFactory theAttroverridesecondarytableFactory = (AttroverridesecondarytableFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/emf/annotations/attroverridesecondarytable"); 
			if (theAttroverridesecondarytableFactory != null) {
				return theAttroverridesecondarytableFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AttroverridesecondarytableFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttroverridesecondarytableFactoryImpl() {
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
			case AttroverridesecondarytablePackage.ADDRESS: return createAddress();
			case AttroverridesecondarytablePackage.PERSON: return createPerson();
			case AttroverridesecondarytablePackage.EMPLOYEE: return createEmployee();
			case AttroverridesecondarytablePackage.NON_EMPLOYEE: return createNonEmployee();
			case AttroverridesecondarytablePackage.COUNTRY: return createCountry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
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
	public NonEmployee createNonEmployee() {
		NonEmployeeImpl nonEmployee = new NonEmployeeImpl();
		return nonEmployee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country createCountry() {
		CountryImpl country = new CountryImpl();
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttroverridesecondarytablePackage getAttroverridesecondarytablePackage() {
		return (AttroverridesecondarytablePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AttroverridesecondarytablePackage getPackage() {
		return AttroverridesecondarytablePackage.eINSTANCE;
	}

} //AttroverridesecondarytableFactoryImpl
