/**
 * <copyright>
 * </copyright>
 *
 * $Id: MappedsuperclassSwitch.java,v 1.4 2007/08/10 20:30:43 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.*;
import org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.AddIDDocument;
import org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.Document;
import org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.MappedsuperclassPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.ParentDocument;
import org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.SpecificDocument;
import org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.TestReference;

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
 * @see org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.MappedsuperclassPackage
 * @generated
 */
public class MappedsuperclassSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MappedsuperclassPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappedsuperclassSwitch() {
		if (modelPackage == null) {
			modelPackage = MappedsuperclassPackage.eINSTANCE;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MappedsuperclassPackage.ADD_ID_DOCUMENT: {
				AddIDDocument addIDDocument = (AddIDDocument)theEObject;
				T result = caseAddIDDocument(addIDDocument);
				if (result == null) result = caseDocument(addIDDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappedsuperclassPackage.DOCUMENT: {
				Document document = (Document)theEObject;
				T result = caseDocument(document);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappedsuperclassPackage.PARENT_DOCUMENT: {
				ParentDocument parentDocument = (ParentDocument)theEObject;
				T result = caseParentDocument(parentDocument);
				if (result == null) result = caseDocument(parentDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappedsuperclassPackage.SPECIFIC_DOCUMENT: {
				SpecificDocument specificDocument = (SpecificDocument)theEObject;
				T result = caseSpecificDocument(specificDocument);
				if (result == null) result = caseParentDocument(specificDocument);
				if (result == null) result = caseDocument(specificDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappedsuperclassPackage.TEST_REFERENCE: {
				TestReference testReference = (TestReference)theEObject;
				T result = caseTestReference(testReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add ID Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add ID Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddIDDocument(AddIDDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocument(Document object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parent Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parent Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParentDocument(ParentDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificDocument(SpecificDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestReference(TestReference object) {
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

} //MappedsuperclassSwitch
