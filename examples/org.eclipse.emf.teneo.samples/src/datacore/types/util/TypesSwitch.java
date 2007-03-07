/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypesSwitch.java,v 1.1 2007/03/07 23:34:09 mtaal Exp $
 */
package datacore.types.util;

import datacore.CSMType;
import datacore.CSMValue;
import datacore.CSMValueSet;

import datacore.types.*;

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
 * @see datacore.types.TypesPackage
 * @generated
 */
public class TypesSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesSwitch() {
		if (modelPackage == null) {
			modelPackage = TypesPackage.eINSTANCE;
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
			case TypesPackage.STRING_TYPE: {
				StringType stringType = (StringType)theEObject;
				T result = caseStringType(stringType);
				if (result == null) result = caseCSMType(stringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DOUBLE_TYPE: {
				DoubleType doubleType = (DoubleType)theEObject;
				T result = caseDoubleType(doubleType);
				if (result == null) result = caseCSMNumberType(doubleType);
				if (result == null) result = caseCSMType(doubleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.STRING_VALUE: {
				StringValue stringValue = (StringValue)theEObject;
				T result = caseStringValue(stringValue);
				if (result == null) result = caseCSMValue(stringValue);
				if (result == null) result = caseCSMValueSet(stringValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DOUBLE_VALUE: {
				DoubleValue doubleValue = (DoubleValue)theEObject;
				T result = caseDoubleValue(doubleValue);
				if (result == null) result = caseCSMNumberValue(doubleValue);
				if (result == null) result = caseCSMValue(doubleValue);
				if (result == null) result = caseCSMValueSet(doubleValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.CSM_NUMBER_TYPE: {
				CSMNumberType csmNumberType = (CSMNumberType)theEObject;
				T result = caseCSMNumberType(csmNumberType);
				if (result == null) result = caseCSMType(csmNumberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.CSM_NUMBER_VALUE: {
				CSMNumberValue csmNumberValue = (CSMNumberValue)theEObject;
				T result = caseCSMNumberValue(csmNumberValue);
				if (result == null) result = caseCSMValue(csmNumberValue);
				if (result == null) result = caseCSMValueSet(csmNumberValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.BOOLEAN_VALUE: {
				BooleanValue booleanValue = (BooleanValue)theEObject;
				T result = caseBooleanValue(booleanValue);
				if (result == null) result = caseCSMValue(booleanValue);
				if (result == null) result = caseCSMValueSet(booleanValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.BOOLEAN_TYPE: {
				BooleanType booleanType = (BooleanType)theEObject;
				T result = caseBooleanType(booleanType);
				if (result == null) result = caseCSMType(booleanType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.INTEGER_VALUE: {
				IntegerValue integerValue = (IntegerValue)theEObject;
				T result = caseIntegerValue(integerValue);
				if (result == null) result = caseCSMNumberValue(integerValue);
				if (result == null) result = caseCSMValue(integerValue);
				if (result == null) result = caseCSMValueSet(integerValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.INTEGER_TYPE: {
				IntegerType integerType = (IntegerType)theEObject;
				T result = caseIntegerType(integerType);
				if (result == null) result = caseCSMNumberType(integerType);
				if (result == null) result = caseCSMType(integerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.BYTE_VALUE: {
				ByteValue byteValue = (ByteValue)theEObject;
				T result = caseByteValue(byteValue);
				if (result == null) result = caseCSMNumberValue(byteValue);
				if (result == null) result = caseCSMValue(byteValue);
				if (result == null) result = caseCSMValueSet(byteValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.BYTE_TYPE: {
				ByteType byteType = (ByteType)theEObject;
				T result = caseByteType(byteType);
				if (result == null) result = caseCSMNumberType(byteType);
				if (result == null) result = caseCSMType(byteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.FLOAT_VALUE: {
				FloatValue floatValue = (FloatValue)theEObject;
				T result = caseFloatValue(floatValue);
				if (result == null) result = caseCSMNumberValue(floatValue);
				if (result == null) result = caseCSMValue(floatValue);
				if (result == null) result = caseCSMValueSet(floatValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.FLOAT_TYPE: {
				FloatType floatType = (FloatType)theEObject;
				T result = caseFloatType(floatType);
				if (result == null) result = caseCSMNumberType(floatType);
				if (result == null) result = caseCSMType(floatType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LONG_VALUE: {
				LongValue longValue = (LongValue)theEObject;
				T result = caseLongValue(longValue);
				if (result == null) result = caseCSMNumberValue(longValue);
				if (result == null) result = caseCSMValue(longValue);
				if (result == null) result = caseCSMValueSet(longValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LONG_TYPE: {
				LongType longType = (LongType)theEObject;
				T result = caseLongType(longType);
				if (result == null) result = caseCSMNumberType(longType);
				if (result == null) result = caseCSMType(longType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SHORT_VALUE: {
				ShortValue shortValue = (ShortValue)theEObject;
				T result = caseShortValue(shortValue);
				if (result == null) result = caseCSMNumberValue(shortValue);
				if (result == null) result = caseCSMValue(shortValue);
				if (result == null) result = caseCSMValueSet(shortValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SHORT_TYPE: {
				ShortType shortType = (ShortType)theEObject;
				T result = caseShortType(shortType);
				if (result == null) result = caseCSMNumberType(shortType);
				if (result == null) result = caseCSMType(shortType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>String Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>String Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringType(StringType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Double Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Double Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleType(DoubleType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>String Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>String Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringValue(StringValue object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Double Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Double Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleValue(DoubleValue object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CSM Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CSM Number Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSMNumberType(CSMNumberType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CSM Number Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CSM Number Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSMNumberValue(CSMNumberValue object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Boolean Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanValue(BooleanValue object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Boolean Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Boolean Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanType(BooleanType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Integer Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerValue(IntegerValue object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Integer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Integer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerType(IntegerType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Byte Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Byte Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseByteValue(ByteValue object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Byte Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Byte Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseByteType(ByteType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Float Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Float Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatValue(FloatValue object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Float Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Float Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatType(FloatType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Long Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Long Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLongValue(LongValue object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Long Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Long Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLongType(LongType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Short Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Short Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShortValue(ShortValue object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Short Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Short Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShortType(ShortType object) {
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

} //TypesSwitch
