/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestinheritanceSwitch.java,v 1.2 2007/03/21 15:45:37 mtaal Exp $
 */
package testinheritance.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import testinheritance.*;

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
 * @see testinheritance.TestinheritancePackage
 * @generated
 */
public class TestinheritanceSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TestinheritancePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestinheritanceSwitch() {
		if (modelPackage == null) {
			modelPackage = TestinheritancePackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TestinheritancePackage.SOME_RESOURCE: {
				SomeResource someResource = (SomeResource)theEObject;
				T result = caseSomeResource(someResource);
				if (result == null) result = caseSomeBaseClass(someResource);
				if (result == null) result = caseSomeOtherBaseClass(someResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestinheritancePackage.SOME_BASE_CLASS: {
				SomeBaseClass someBaseClass = (SomeBaseClass)theEObject;
				T result = caseSomeBaseClass(someBaseClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestinheritancePackage.SOME_OTHER_BASE_CLASS: {
				SomeOtherBaseClass someOtherBaseClass = (SomeOtherBaseClass)theEObject;
				T result = caseSomeOtherBaseClass(someOtherBaseClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestinheritancePackage.NAME_VALUE_PAIR: {
				NameValuePair nameValuePair = (NameValuePair)theEObject;
				T result = caseNameValuePair(nameValuePair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestinheritancePackage.PARENT_ONE: {
				ParentOne parentOne = (ParentOne)theEObject;
				T result = caseParentOne(parentOne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestinheritancePackage.PARENT_TWO: {
				ParentTwo parentTwo = (ParentTwo)theEObject;
				T result = caseParentTwo(parentTwo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestinheritancePackage.PARENT_ZERO: {
				ParentZero parentZero = (ParentZero)theEObject;
				T result = caseParentZero(parentZero);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestinheritancePackage.CHILD: {
				Child child = (Child)theEObject;
				T result = caseChild(child);
				if (result == null) result = caseParentZero(child);
				if (result == null) result = caseParentTwo(child);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestinheritancePackage.CHILD2: {
				Child2 child2 = (Child2)theEObject;
				T result = caseChild2(child2);
				if (result == null) result = caseParentZero(child2);
				if (result == null) result = caseParentOne(child2);
				if (result == null) result = caseParentTwo(child2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Some Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Some Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSomeResource(SomeResource object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Some Base Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Some Base Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSomeBaseClass(SomeBaseClass object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Some Other Base Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Some Other Base Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSomeOtherBaseClass(SomeOtherBaseClass object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Name Value Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Name Value Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameValuePair(NameValuePair object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Parent One</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Parent One</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParentOne(ParentOne object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Parent Two</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Parent Two</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParentTwo(ParentTwo object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Parent Zero</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Parent Zero</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParentZero(ParentZero object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChild(Child object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Child2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Child2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChild2(Child2 object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //TestinheritanceSwitch
