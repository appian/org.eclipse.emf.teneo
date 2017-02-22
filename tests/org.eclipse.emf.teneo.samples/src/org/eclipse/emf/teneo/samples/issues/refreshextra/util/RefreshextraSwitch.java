/**
 */
package org.eclipse.emf.teneo.samples.issues.refreshextra.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.emf.teneo.samples.issues.refreshextra.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.RefreshextraPackage
 * @generated
 */
public class RefreshextraSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RefreshextraPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefreshextraSwitch() {
		if (modelPackage == null) {
			modelPackage = RefreshextraPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RefreshextraPackage.ITEM_CONTAINER: {
				ItemContainer itemContainer = (ItemContainer)theEObject;
				T result = caseItemContainer(itemContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefreshextraPackage.ITEM_ELEMENT: {
				ItemElement itemElement = (ItemElement)theEObject;
				T result = caseItemElement(itemElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefreshextraPackage.ITEM_NON_CONTAINER: {
				ItemNonContainer itemNonContainer = (ItemNonContainer)theEObject;
				T result = caseItemNonContainer(itemNonContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefreshextraPackage.ITEM_NON_CONTAINER2: {
				ItemNonContainer2 itemNonContainer2 = (ItemNonContainer2)theEObject;
				T result = caseItemNonContainer2(itemNonContainer2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefreshextraPackage.ITEM_CONTAINER2: {
				ItemContainer2 itemContainer2 = (ItemContainer2)theEObject;
				T result = caseItemContainer2(itemContainer2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefreshextraPackage.ITEM_ELEMENT_BIDIR: {
				ItemElementBidir itemElementBidir = (ItemElementBidir)theEObject;
				T result = caseItemElementBidir(itemElementBidir);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemContainer(ItemContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemElement(ItemElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Non Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Non Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemNonContainer(ItemNonContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Non Container2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Non Container2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemNonContainer2(ItemNonContainer2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Container2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Container2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemContainer2(ItemContainer2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Element Bidir</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Element Bidir</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemElementBidir(ItemElementBidir object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RefreshextraSwitch
