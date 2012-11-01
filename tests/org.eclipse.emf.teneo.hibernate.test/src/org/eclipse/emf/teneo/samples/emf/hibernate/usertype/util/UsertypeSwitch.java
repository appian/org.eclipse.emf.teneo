/**
 * <copyright>
 * </copyright>
 *
 * $Id: UsertypeSwitch.java,v 1.8 2010/06/03 14:06:56 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.hibernate.usertype.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.*;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Address;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Certificate;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.City;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Person;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.UsertypePackage;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.UsertypePackage
 * @generated
 */
public class UsertypeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static UsertypePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UsertypeSwitch() {
		if (modelPackage == null) {
			modelPackage = UsertypePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case UsertypePackage.PERSON: {
				Person person = (Person)theEObject;
				T result = casePerson(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsertypePackage.ADDRESS: {
				Address address = (Address)theEObject;
				T result = caseAddress(address);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsertypePackage.CITY: {
				City city = (City)theEObject;
				T result = caseCity(city);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsertypePackage.CERTIFICATE: {
				Certificate certificate = (Certificate)theEObject;
				T result = caseCertificate(certificate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of ' <em>Person</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of ' <em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of ' <em>Address</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of ' <em>Address</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddress(Address object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of ' <em>City</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of ' <em>City</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCity(City object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of ' <em>Certificate</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of ' <em>Certificate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCertificate(Certificate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of ' <em>EObject</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch, but this is the last case anyway. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of ' <em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // UsertypeSwitch
