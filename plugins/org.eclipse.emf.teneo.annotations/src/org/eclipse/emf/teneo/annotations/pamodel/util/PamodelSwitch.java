/**
 * <copyright>
 * </copyright>
 *
 * $Id: PamodelSwitch.java,v 1.10 2006/09/06 21:59:50 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pamodel.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.teneo.annotations.pamodel.*;

import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEModelElement;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;
import org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage;

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
 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage
 * @generated
 */
public class PamodelSwitch {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Davide Marchignoli\n";

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PamodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PamodelSwitch() {
		if (modelPackage == null) {
			modelPackage = PamodelPackage.eINSTANCE;
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
			case PamodelPackage.PANNOTATED_EMODEL_ELEMENT: {
				PAnnotatedEModelElement pAnnotatedEModelElement = (PAnnotatedEModelElement)theEObject;
				Object result = casePAnnotatedEModelElement(pAnnotatedEModelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PamodelPackage.PANNOTATED_MODEL: {
				PAnnotatedModel pAnnotatedModel = (PAnnotatedModel)theEObject;
				Object result = casePAnnotatedModel(pAnnotatedModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PamodelPackage.PANNOTATED_EPACKAGE: {
				PAnnotatedEPackage pAnnotatedEPackage = (PAnnotatedEPackage)theEObject;
				Object result = casePAnnotatedEPackage(pAnnotatedEPackage);
				if (result == null) result = casePAnnotatedEModelElement(pAnnotatedEPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PamodelPackage.PANNOTATED_ECLASS: {
				PAnnotatedEClass pAnnotatedEClass = (PAnnotatedEClass)theEObject;
				Object result = casePAnnotatedEClass(pAnnotatedEClass);
				if (result == null) result = casePAnnotatedEModelElement(pAnnotatedEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE: {
				PAnnotatedEStructuralFeature pAnnotatedEStructuralFeature = (PAnnotatedEStructuralFeature)theEObject;
				Object result = casePAnnotatedEStructuralFeature(pAnnotatedEStructuralFeature);
				if (result == null) result = casePAnnotatedETypedElement(pAnnotatedEStructuralFeature);
				if (result == null) result = casePAnnotatedEModelElement(pAnnotatedEStructuralFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PamodelPackage.PANNOTATED_EATTRIBUTE: {
				PAnnotatedEAttribute pAnnotatedEAttribute = (PAnnotatedEAttribute)theEObject;
				Object result = casePAnnotatedEAttribute(pAnnotatedEAttribute);
				if (result == null) result = casePAnnotatedEStructuralFeature(pAnnotatedEAttribute);
				if (result == null) result = casePAnnotatedETypedElement(pAnnotatedEAttribute);
				if (result == null) result = casePAnnotatedEModelElement(pAnnotatedEAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PamodelPackage.PANNOTATED_EREFERENCE: {
				PAnnotatedEReference pAnnotatedEReference = (PAnnotatedEReference)theEObject;
				Object result = casePAnnotatedEReference(pAnnotatedEReference);
				if (result == null) result = casePAnnotatedEStructuralFeature(pAnnotatedEReference);
				if (result == null) result = casePAnnotatedETypedElement(pAnnotatedEReference);
				if (result == null) result = casePAnnotatedEModelElement(pAnnotatedEReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PamodelPackage.PANNOTATED_ETYPED_ELEMENT: {
				PAnnotatedETypedElement pAnnotatedETypedElement = (PAnnotatedETypedElement)theEObject;
				Object result = casePAnnotatedETypedElement(pAnnotatedETypedElement);
				if (result == null) result = casePAnnotatedEModelElement(pAnnotatedETypedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PamodelPackage.PANNOTATED_EDATA_TYPE: {
				PAnnotatedEDataType pAnnotatedEDataType = (PAnnotatedEDataType)theEObject;
				Object result = casePAnnotatedEDataType(pAnnotatedEDataType);
				if (result == null) result = casePAnnotatedETypedElement(pAnnotatedEDataType);
				if (result == null) result = casePAnnotatedEModelElement(pAnnotatedEDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>PAnnotated EModel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>PAnnotated EModel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePAnnotatedEModelElement(PAnnotatedEModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>PAnnotated Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>PAnnotated Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePAnnotatedModel(PAnnotatedModel object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>PAnnotated EPackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>PAnnotated EPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePAnnotatedEPackage(PAnnotatedEPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>PAnnotated EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>PAnnotated EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePAnnotatedEClass(PAnnotatedEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>PAnnotated EStructural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>PAnnotated EStructural Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePAnnotatedEStructuralFeature(PAnnotatedEStructuralFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>PAnnotated EAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>PAnnotated EAttribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePAnnotatedEAttribute(PAnnotatedEAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>PAnnotated EData Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>PAnnotated EData Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePAnnotatedEDataType(PAnnotatedEDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>PAnnotated EReference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>PAnnotated EReference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePAnnotatedEReference(PAnnotatedEReference object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>PAnnotated ETyped Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>PAnnotated ETyped Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePAnnotatedETypedElement(PAnnotatedETypedElement object) {
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

} //PamodelSwitch
