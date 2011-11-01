/**
 * <copyright>
 * </copyright>
 *
 * $Id: SubstitutionValidator.java,v 1.1 2006/07/11 16:57:10 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.util;

import java.math.BigInteger;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.SubstitutionPackage
 * @generated
 */
public class SubstitutionValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubstitutionValidator INSTANCE = new SubstitutionValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution";

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
	public SubstitutionValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPackage getEPackage() {
	  return SubstitutionPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresonding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map context) {
		switch (classifierID) {
			case SubstitutionPackage.COMPLEX_NUMBER:
				return validateComplexNumber((ComplexNumber)value, diagnostics, context);
			case SubstitutionPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case SubstitutionPackage.EVEN_COMPLEX_NUMBER_TYPE:
				return validateEvenComplexNumberType((EvenComplexNumberType)value, diagnostics, context);
			case SubstitutionPackage.MULTI_NUMBER_TYPE:
				return validateMultiNumberType((MultiNumberType)value, diagnostics, context);
			case SubstitutionPackage.NUMBER_TYPE:
				return validateNumberType((NumberType)value, diagnostics, context);
			case SubstitutionPackage.ODD_COMPLEX_NUMBER_TYPE:
				return validateOddComplexNumberType((OddComplexNumberType)value, diagnostics, context);
			case SubstitutionPackage.EVEN_TYPE:
				return validateEvenType((BigInteger)value, diagnostics, context);
			case SubstitutionPackage.ODD_TYPE:
				return validateOddType((BigInteger)value, diagnostics, context);
			case SubstitutionPackage.SIMPLE_NUMBER:
				return validateSimpleNumber((BigInteger)value, diagnostics, context);
			default: 
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexNumber(ComplexNumber complexNumber, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(complexNumber, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvenComplexNumberType(EvenComplexNumberType evenComplexNumberType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(evenComplexNumberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiNumberType(MultiNumberType multiNumberType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(multiNumberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberType(NumberType numberType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(numberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOddComplexNumberType(OddComplexNumberType oddComplexNumberType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(oddComplexNumberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvenType(BigInteger evenType, DiagnosticChain diagnostics, Map context) {
		boolean result = validateEvenType_Enumeration(evenType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateEvenType_Enumeration
	 */
	public static final Collection EVEN_TYPE__ENUMERATION__VALUES =
		wrapEnumerationValues
			(new Object[] {
				 new BigInteger("2"),
				 new BigInteger("4"),
				 new BigInteger("6"),
				 new BigInteger("8")
			 });

	/**
	 * Validates the Enumeration constraint of '<em>Even Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvenType_Enumeration(BigInteger evenType, DiagnosticChain diagnostics, Map context) {
		boolean result = EVEN_TYPE__ENUMERATION__VALUES.contains(evenType);
		if (!result && diagnostics != null) 
			reportEnumerationViolation(SubstitutionPackage.eINSTANCE.getEvenType(), evenType, EVEN_TYPE__ENUMERATION__VALUES, diagnostics, context);
		return result; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOddType(BigInteger oddType, DiagnosticChain diagnostics, Map context) {
		boolean result = validateOddType_Enumeration(oddType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateOddType_Enumeration
	 */
	public static final Collection ODD_TYPE__ENUMERATION__VALUES =
		wrapEnumerationValues
			(new Object[] {
				 new BigInteger("1"),
				 new BigInteger("3"),
				 new BigInteger("5"),
				 new BigInteger("7"),
				 new BigInteger("9")
			 });

	/**
	 * Validates the Enumeration constraint of '<em>Odd Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOddType_Enumeration(BigInteger oddType, DiagnosticChain diagnostics, Map context) {
		boolean result = ODD_TYPE__ENUMERATION__VALUES.contains(oddType);
		if (!result && diagnostics != null) 
			reportEnumerationViolation(SubstitutionPackage.eINSTANCE.getOddType(), oddType, ODD_TYPE__ENUMERATION__VALUES, diagnostics, context);
		return result; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleNumber(BigInteger simpleNumber, DiagnosticChain diagnostics, Map context) {
		boolean result = validateSimpleNumber_Min(simpleNumber, diagnostics, context);
		if (result || diagnostics != null) result &= validateSimpleNumber_Max(simpleNumber, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSimpleNumber_Min
	 */
	public static final BigInteger SIMPLE_NUMBER__MIN__VALUE = new BigInteger("1");

	/**
	 * Validates the Min constraint of '<em>Simple Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleNumber_Min(BigInteger simpleNumber, DiagnosticChain diagnostics, Map context) {
		boolean result = simpleNumber.compareTo(SIMPLE_NUMBER__MIN__VALUE) >= 0;
		if (!result && diagnostics != null) 
			reportMinViolation(SubstitutionPackage.eINSTANCE.getSimpleNumber(), simpleNumber, SIMPLE_NUMBER__MIN__VALUE, true, diagnostics, context);
		return result; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSimpleNumber_Max
	 */
	public static final BigInteger SIMPLE_NUMBER__MAX__VALUE = new BigInteger("9");

	/**
	 * Validates the Max constraint of '<em>Simple Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleNumber_Max(BigInteger simpleNumber, DiagnosticChain diagnostics, Map context) {
		boolean result = simpleNumber.compareTo(SIMPLE_NUMBER__MAX__VALUE) <= 0;
		if (!result && diagnostics != null) 
			reportMaxViolation(SubstitutionPackage.eINSTANCE.getSimpleNumber(), simpleNumber, SIMPLE_NUMBER__MAX__VALUE, true, diagnostics, context);
		return result; 
	}

} //SubstitutionValidator
