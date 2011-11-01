/**
 * <copyright>
 * </copyright>
 *
 * $Id: MainSwitch.java,v 1.1 2006/09/21 00:56:53 mtaal Exp $
 */
package main.util;

import java.util.List;

import main.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

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
 * @see main.MainPackage
 * @generated
 */
public class MainSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MainPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainSwitch() {
		if (modelPackage == null) {
			modelPackage = MainPackage.eINSTANCE;
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
			case MainPackage.CHILD_OBJECT2: {
				ChildObject2 childObject2 = (ChildObject2)theEObject;
				Object result = caseChildObject2(childObject2);
				if (result == null) result = caseBaseObject(childObject2);
				if (result == null) result = caseBaseComponent(childObject2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MainPackage.CHILD_OBJECT1: {
				ChildObject1 childObject1 = (ChildObject1)theEObject;
				Object result = caseChildObject1(childObject1);
				if (result == null) result = caseBaseObject(childObject1);
				if (result == null) result = caseBaseComponent(childObject1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MainPackage.BASE_OBJECT: {
				BaseObject baseObject = (BaseObject)theEObject;
				Object result = caseBaseObject(baseObject);
				if (result == null) result = caseBaseComponent(baseObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MainPackage.BASE_GROUP: {
				BaseGroup baseGroup = (BaseGroup)theEObject;
				Object result = caseBaseGroup(baseGroup);
				if (result == null) result = caseBaseComponent(baseGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MainPackage.BASE_COMPONENT: {
				BaseComponent baseComponent = (BaseComponent)theEObject;
				Object result = caseBaseComponent(baseComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MainPackage.CHILD_OBJECT3: {
				ChildObject3 childObject3 = (ChildObject3)theEObject;
				Object result = caseChildObject3(childObject3);
				if (result == null) result = caseBaseObject(childObject3);
				if (result == null) result = caseBaseComponent(childObject3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MainPackage.CHILD_OBJECT4: {
				ChildObject4 childObject4 = (ChildObject4)theEObject;
				Object result = caseChildObject4(childObject4);
				if (result == null) result = caseBaseObject(childObject4);
				if (result == null) result = caseBaseComponent(childObject4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Child Object2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Child Object2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseChildObject2(ChildObject2 object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Child Object1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Child Object1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseChildObject1(ChildObject1 object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Base Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Base Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBaseObject(BaseObject object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Base Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Base Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBaseGroup(BaseGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Base Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Base Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBaseComponent(BaseComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Child Object3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Child Object3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseChildObject3(ChildObject3 object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Child Object4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Child Object4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseChildObject4(ChildObject4 object) {
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

} //MainSwitch
