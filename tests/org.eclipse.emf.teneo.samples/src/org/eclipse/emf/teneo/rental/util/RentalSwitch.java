/**
 * <copyright>
 * </copyright>
 *
 * $Id: RentalSwitch.java,v 1.4 2008/08/11 21:54:33 mtaal Exp $
 */
package org.eclipse.emf.teneo.rental.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.emf.teneo.rental.*;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.rental.RentalPackage
 * @generated
 */
public class RentalSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static RentalPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RentalSwitch() {
		if (modelPackage == null) {
			modelPackage = RentalPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
			case RentalPackage.RENTAL_BICYCLE: {
				RentalBicycle rentalBicycle = (RentalBicycle)theEObject;
				T result = caseRentalBicycle(rentalBicycle);
				if (result == null) result = caseRentalUnit(rentalBicycle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RentalPackage.CURRENCY: {
				Currency currency = (Currency)theEObject;
				T result = caseCurrency(currency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RentalPackage.RENTAL_CAR: {
				RentalCar rentalCar = (RentalCar)theEObject;
				T result = caseRentalCar(rentalCar);
				if (result == null) result = caseRentalUnit(rentalCar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RentalPackage.RENTAL_CONTRACT: {
				RentalContract rentalContract = (RentalContract)theEObject;
				T result = caseRentalContract(rentalContract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RentalPackage.RENTAL_UNIT: {
				RentalUnit rentalUnit = (RentalUnit)theEObject;
				T result = caseRentalUnit(rentalUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RentalPackage.MANUFACTURER: {
				Manufacturer manufacturer = (Manufacturer)theEObject;
				T result = caseManufacturer(manufacturer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bicycle</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bicycle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRentalBicycle(RentalBicycle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Currency</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Currency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrency(Currency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Car</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Car</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRentalCar(RentalCar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRentalContract(RentalContract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRentalUnit(RentalUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manufacturer</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manufacturer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManufacturer(Manufacturer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch, but this is the last case anyway. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // RentalSwitch
