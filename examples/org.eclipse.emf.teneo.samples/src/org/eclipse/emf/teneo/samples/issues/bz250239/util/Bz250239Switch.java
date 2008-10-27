/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz250239Switch.java,v 1.1 2008/10/27 13:18:30 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz250239.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.teneo.samples.issues.bz250239.*;

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
 * @see org.eclipse.emf.teneo.samples.issues.bz250239.Bz250239Package
 * @generated
 */
public class Bz250239Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Bz250239Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz250239Switch() {
		if (modelPackage == null) {
			modelPackage = Bz250239Package.eINSTANCE;
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
			case Bz250239Package.IDENTITY_ID: {
				IdentityID identityID = (IdentityID)theEObject;
				T result = caseIdentityID(identityID);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Bz250239Package.SIMPLE_ID: {
				SimpleID simpleID = (SimpleID)theEObject;
				T result = caseSimpleID(simpleID);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Bz250239Package.TABLE_ID: {
				TableID tableID = (TableID)theEObject;
				T result = caseTableID(tableID);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Bz250239Package.TABLE_GENERATOR_ID: {
				TableGeneratorID tableGeneratorID = (TableGeneratorID)theEObject;
				T result = caseTableGeneratorID(tableGeneratorID);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Bz250239Package.AUTO_ID: {
				AutoID autoID = (AutoID)theEObject;
				T result = caseAutoID(autoID);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Bz250239Package.OTHER_TABLE_GENERATOR_ID: {
				OtherTableGeneratorID otherTableGeneratorID = (OtherTableGeneratorID)theEObject;
				T result = caseOtherTableGeneratorID(otherTableGeneratorID);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Bz250239Package.SEQUENCE_ID: {
				SequenceID sequenceID = (SequenceID)theEObject;
				T result = caseSequenceID(sequenceID);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Bz250239Package.SEQUENCE_STYLE_ID: {
				SequenceStyleID sequenceStyleID = (SequenceStyleID)theEObject;
				T result = caseSequenceStyleID(sequenceStyleID);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Bz250239Package.REAL_SEQUENCE_ID: {
				RealSequenceID realSequenceID = (RealSequenceID)theEObject;
				T result = caseRealSequenceID(realSequenceID);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identity ID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identity ID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentityID(IdentityID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple ID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple ID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleID(SimpleID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table ID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table ID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableID(TableID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Generator ID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Generator ID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableGeneratorID(TableGeneratorID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auto ID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auto ID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutoID(AutoID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Other Table Generator ID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Other Table Generator ID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOtherTableGeneratorID(OtherTableGeneratorID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence ID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence ID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceID(SequenceID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Style ID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Style ID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceStyleID(SequenceStyleID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Sequence ID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Sequence ID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealSequenceID(RealSequenceID object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //Bz250239Switch
