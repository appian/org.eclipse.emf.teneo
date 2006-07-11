/**
 * <copyright>
 * </copyright>
 *
 * $Id: Relation1tonSwitch.java,v 1.1 2006/07/11 16:57:05 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.relation.relation1ton.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.*;

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
 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Relation1tonPackage
 * @generated
 */
public class Relation1tonSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Relation1tonPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation1tonSwitch() {
		if (modelPackage == null) {
			modelPackage = Relation1tonPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Relation1tonPackage.MAIN: {
				Main main = (Main)theEObject;
				Object result = caseMain(main);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Relation1tonPackage.ONE_CN: {
				OneCN oneCN = (OneCN)theEObject;
				Object result = caseOneCN(oneCN);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Relation1tonPackage.ONE_CR: {
				OneCR oneCR = (OneCR)theEObject;
				Object result = caseOneCR(oneCR);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Relation1tonPackage.ONE_NN: {
				OneNN oneNN = (OneNN)theEObject;
				Object result = caseOneNN(oneNN);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Relation1tonPackage.ONE_NR: {
				OneNR oneNR = (OneNR)theEObject;
				Object result = caseOneNR(oneNR);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Relation1tonPackage.TWO_CN: {
				TwoCN twoCN = (TwoCN)theEObject;
				Object result = caseTwoCN(twoCN);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Relation1tonPackage.TWO_CR: {
				TwoCR twoCR = (TwoCR)theEObject;
				Object result = caseTwoCR(twoCR);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Relation1tonPackage.TWO_NN: {
				TwoNN twoNN = (TwoNN)theEObject;
				Object result = caseTwoNN(twoNN);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Relation1tonPackage.TWO_NR: {
				TwoNR twoNR = (TwoNR)theEObject;
				Object result = caseTwoNR(twoNR);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Main</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Main</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMain(Main object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>One CN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>One CN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOneCN(OneCN object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>One CR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>One CR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOneCR(OneCR object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>One NN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>One NN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOneNN(OneNN object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>One NR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>One NR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOneNR(OneNR object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Two CN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Two CN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTwoCN(TwoCN object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Two CR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Two CR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTwoCR(TwoCR object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Two NN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Two NN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTwoNN(TwoNN object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Two NR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Two NR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTwoNR(TwoNR object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //Relation1tonSwitch
