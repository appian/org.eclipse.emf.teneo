/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpletypesValidator.java,v 1.4 2007/03/05 20:51:07 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.util;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage
 * @generated
 */
public class SimpletypesValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SimpletypesValidator INSTANCE = new SimpletypesValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpletypesValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return SimpletypesPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresonding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case SimpletypesPackage.SIMPLE_LIST:
				return validateSimpleList((SimpleList)value, diagnostics, context);
			case SimpletypesPackage.SIMPLE_TYPE:
				return validateSimpleType((SimpleType)value, diagnostics, context);
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT:
				return validateSimpleTypeObject((SimpleTypeObject)value, diagnostics, context);
			case SimpletypesPackage.SIMPLE_ENUM:
				return validateSimpleEnum((SimpleEnum)value, diagnostics, context);
			case SimpletypesPackage.BOOL:
				return validateBool((Boolean)value, diagnostics, context);
			case SimpletypesPackage.BYTE:
				return validateByte((Byte)value, diagnostics, context);
			case SimpletypesPackage.BYTE_ARRAY:
				return validateByteArray((byte[])value, diagnostics, context);
			case SimpletypesPackage.DATE:
				return validateDate((Date)value, diagnostics, context);
			case SimpletypesPackage.DOUBLE:
				return validateDouble((Double)value, diagnostics, context);
			case SimpletypesPackage.DOUBLE_ARRAY:
				return validateDoubleArray((double[])value, diagnostics, context);
			case SimpletypesPackage.EXTRA_LIMITED_STRING:
				return validateExtraLimitedString((String)value, diagnostics, context);
			case SimpletypesPackage.FLOAT:
				return validateFloat((Float)value, diagnostics, context);
			case SimpletypesPackage.INT:
				return validateInt((Integer)value, diagnostics, context);
			case SimpletypesPackage.INT_ARRAY:
				return validateIntArray((int[])value, diagnostics, context);
			case SimpletypesPackage.LIMITED_DECIMAL:
				return validateLimitedDecimal((BigDecimal)value, diagnostics, context);
			case SimpletypesPackage.LIMITED_STRING:
				return validateLimitedString((String)value, diagnostics, context);
			case SimpletypesPackage.LONG:
				return validateLong((Long)value, diagnostics, context);
			case SimpletypesPackage.SIMPLE_ENUM_OBJECT:
				return validateSimpleEnumObject((SimpleEnum)value, diagnostics, context);
			case SimpletypesPackage.STRING_ARRAY:
				return validateStringArray((String[])value, diagnostics, context);
			default: 
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleList(SimpleList simpleList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simpleList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleType(SimpleType simpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simpleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleTypeObject(SimpleTypeObject simpleTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simpleTypeObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleEnum(SimpleEnum simpleEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBool(Boolean bool, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateByte(Byte byte_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateByteArray(byte[] byteArray, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDate(Date date, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble(Double double_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleArray(double[] doubleArray, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtraLimitedString(String extraLimitedString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateExtraLimitedString_MaxLength(extraLimitedString, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Extra Limited String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtraLimitedString_MaxLength(String extraLimitedString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = extraLimitedString.length();  
		boolean result = length <= 5;
		if (!result && diagnostics != null) 
			reportMaxLengthViolation(SimpletypesPackage.Literals.EXTRA_LIMITED_STRING, extraLimitedString, length, 5, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloat(Float float_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInt(Integer int_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntArray(int[] intArray, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLimitedDecimal(BigDecimal limitedDecimal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLimitedDecimal_TotalDigits(limitedDecimal, diagnostics, context);
		if (result || diagnostics != null) result &= validateLimitedDecimal_FractionDigits(limitedDecimal, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TotalDigits constraint of '<em>Limited Decimal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLimitedDecimal_TotalDigits(BigDecimal limitedDecimal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = limitedDecimal.unscaledValue().abs().toString().length() <= 4;
		if (!result && diagnostics != null) 
			reportTotalDigitsViolation(SimpletypesPackage.Literals.LIMITED_DECIMAL, limitedDecimal, 4, diagnostics, context);
		return result; 
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Limited Decimal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLimitedDecimal_FractionDigits(BigDecimal limitedDecimal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = limitedDecimal.scale() <= 1;
		if (!result && diagnostics != null) 
			reportFractionDigitsViolation(SimpletypesPackage.Literals.LIMITED_DECIMAL, limitedDecimal, 1, diagnostics, context);
		return result; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLimitedString(String limitedString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLimitedString_MinLength(limitedString, diagnostics, context);
		if (result || diagnostics != null) result &= validateLimitedString_MaxLength(limitedString, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Limited String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLimitedString_MinLength(String limitedString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = limitedString.length();  
		boolean result = length >= 10;
		if (!result && diagnostics != null) 
			reportMinLengthViolation(SimpletypesPackage.Literals.LIMITED_STRING, limitedString, length, 10, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Limited String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLimitedString_MaxLength(String limitedString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = limitedString.length();  
		boolean result = length <= 10;
		if (!result && diagnostics != null) 
			reportMaxLengthViolation(SimpletypesPackage.Literals.LIMITED_STRING, limitedString, length, 10, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLong(Long long_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleEnumObject(SimpleEnum simpleEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringArray(String[] stringArray, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

} //SimpletypesValidator
