/**
 * <copyright>
 * </copyright>
 *
 * $Id: DatacoreSwitch.java,v 1.1 2007/03/07 23:34:07 mtaal Exp $
 */
package datacore.util;

import datacore.*;

import java.util.List;

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
 * @see datacore.DatacorePackage
 * @generated
 */
public class DatacoreSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DatacorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatacoreSwitch() {
		if (modelPackage == null) {
			modelPackage = DatacorePackage.eINSTANCE;
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
			case DatacorePackage.CSMXML: {
				CSMXML csmxml = (CSMXML)theEObject;
				T result = caseCSMXML(csmxml);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatacorePackage.CSM_ELEMENT: {
				CSMElement csmElement = (CSMElement)theEObject;
				T result = caseCSMElement(csmElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatacorePackage.CSM_META_ELEMENT: {
				CSMMetaElement csmMetaElement = (CSMMetaElement)theEObject;
				T result = caseCSMMetaElement(csmMetaElement);
				if (result == null) result = caseCSMElement(csmMetaElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatacorePackage.CSM_CLASS: {
				CSMClass csmClass = (CSMClass)theEObject;
				T result = caseCSMClass(csmClass);
				if (result == null) result = caseCSMMetaElement(csmClass);
				if (result == null) result = caseCSMElement(csmClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION: {
				CSMCharacteristicDefinition csmCharacteristicDefinition = (CSMCharacteristicDefinition)theEObject;
				T result = caseCSMCharacteristicDefinition(csmCharacteristicDefinition);
				if (result == null) result = caseCSMMetaElement(csmCharacteristicDefinition);
				if (result == null) result = caseCSMElement(csmCharacteristicDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatacorePackage.CSM_INSTANCE: {
				CSMInstance csmInstance = (CSMInstance)theEObject;
				T result = caseCSMInstance(csmInstance);
				if (result == null) result = caseCSMObject(csmInstance);
				if (result == null) result = caseCSMElement(csmInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER: {
				CSMCharacteristicValueContainer csmCharacteristicValueContainer = (CSMCharacteristicValueContainer)theEObject;
				T result = caseCSMCharacteristicValueContainer(csmCharacteristicValueContainer);
				if (result == null) result = caseCSMObject(csmCharacteristicValueContainer);
				if (result == null) result = caseCSMElement(csmCharacteristicValueContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatacorePackage.CSM_VALUE_SET: {
				CSMValueSet csmValueSet = (CSMValueSet)theEObject;
				T result = caseCSMValueSet(csmValueSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatacorePackage.CSM_TYPE: {
				CSMType csmType = (CSMType)theEObject;
				T result = caseCSMType(csmType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatacorePackage.CSM_OBJECT: {
				CSMObject csmObject = (CSMObject)theEObject;
				T result = caseCSMObject(csmObject);
				if (result == null) result = caseCSMElement(csmObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatacorePackage.CSM_REPRESENTATION_ROOT: {
				CSMRepresentationRoot csmRepresentationRoot = (CSMRepresentationRoot)theEObject;
				T result = caseCSMRepresentationRoot(csmRepresentationRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatacorePackage.CSM_VALUE: {
				CSMValue csmValue = (CSMValue)theEObject;
				T result = caseCSMValue(csmValue);
				if (result == null) result = caseCSMValueSet(csmValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatacorePackage.INTERVAL: {
				Interval interval = (Interval)theEObject;
				T result = caseInterval(interval);
				if (result == null) result = caseCSMValueSet(interval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatacorePackage.USER_PROPERTY: {
				UserProperty userProperty = (UserProperty)theEObject;
				T result = caseUserProperty(userProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatacorePackage.CSM_REPRESENTATION: {
				CSMRepresentation csmRepresentation = (CSMRepresentation)theEObject;
				T result = caseCSMRepresentation(csmRepresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatacorePackage.DATA_SOURCE_DEFINITIONS: {
				DataSourceDefinitions dataSourceDefinitions = (DataSourceDefinitions)theEObject;
				T result = caseDataSourceDefinitions(dataSourceDefinitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatacorePackage.COLUMN_DEFINITION: {
				ColumnDefinition columnDefinition = (ColumnDefinition)theEObject;
				T result = caseColumnDefinition(columnDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatacorePackage.CSM_REPRESENTATION_ROOT_DESCRIPTOR: {
				CSMRepresentationRootDescriptor csmRepresentationRootDescriptor = (CSMRepresentationRootDescriptor)theEObject;
				T result = caseCSMRepresentationRootDescriptor(csmRepresentationRootDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CSMXML</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CSMXML</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSMXML(CSMXML object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CSM Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CSM Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSMElement(CSMElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CSM Meta Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CSM Meta Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSMMetaElement(CSMMetaElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CSM Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CSM Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSMClass(CSMClass object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CSM Characteristic Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CSM Characteristic Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSMCharacteristicDefinition(CSMCharacteristicDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CSM Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CSM Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSMInstance(CSMInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CSM Characteristic Value Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CSM Characteristic Value Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSMCharacteristicValueContainer(CSMCharacteristicValueContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CSM Value Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CSM Value Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSMValueSet(CSMValueSet object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CSM Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CSM Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSMType(CSMType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CSM Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CSM Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSMObject(CSMObject object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CSM Representation Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CSM Representation Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSMRepresentationRoot(CSMRepresentationRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CSM Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CSM Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSMValue(CSMValue object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterval(Interval object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>User Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>User Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserProperty(UserProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CSM Representation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CSM Representation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSMRepresentation(CSMRepresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Data Source Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Data Source Definitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSourceDefinitions(DataSourceDefinitions object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Column Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Column Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnDefinition(ColumnDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CSM Representation Root Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CSM Representation Root Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSMRepresentationRootDescriptor(CSMRepresentationRootDescriptor object) {
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

} //DatacoreSwitch
