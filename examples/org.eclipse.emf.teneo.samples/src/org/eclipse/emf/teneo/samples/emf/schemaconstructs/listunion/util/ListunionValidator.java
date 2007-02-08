/**
 * <copyright>
 * </copyright>
 *
 * $Id: ListunionValidator.java,v 1.2 2007/02/08 23:09:23 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.util;

import java.math.BigInteger;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.ListunionPackage
 * @generated
 */
public class ListunionValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ListunionValidator INSTANCE = new ListunionValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion";

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
	public ListunionValidator() {
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
	  return ListunionPackage.eINSTANCE;
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
			case ListunionPackage.STATES_BY_COUNTRY:
				return validatestatesByCountry((statesByCountry)value, diagnostics, context);
			case ListunionPackage.SIMPLE_STRING_UNION_TYPE:
				return validateSimpleStringUnionType((String)value, diagnostics, context);
			case ListunionPackage.SIMPLE_STRING_UNION_TYPE_MEMBER0:
				return validateSimpleStringUnionTypeMember0((String)value, diagnostics, context);
			case ListunionPackage.SIMPLE_STRING_UNION_TYPE_MEMBER1:
				return validateSimpleStringUnionTypeMember1((String)value, diagnostics, context);
			case ListunionPackage.SIMPLE_UNION_TYPE:
				return validateSimpleUnionType(value, diagnostics, context);
			case ListunionPackage.SIMPLE_UNION_TYPE_MEMBER0:
				return validateSimpleUnionTypeMember0((BigInteger)value, diagnostics, context);
			case ListunionPackage.SIMPLE_UNION_TYPE_MEMBER1:
				return validateSimpleUnionTypeMember1((String)value, diagnostics, context);
			case ListunionPackage.SIX_STATES_LIST:
				return validateSixStatesList((List<?>)value, diagnostics, context);
			case ListunionPackage.STATE:
				return validateState((String)value, diagnostics, context);
			case ListunionPackage.STATE_LIST:
				return validateStateList((List<?>)value, diagnostics, context);
			case ListunionPackage.STRING_LIST:
				return validateStringList((List<?>)value, diagnostics, context);
			case ListunionPackage.ZIP_CODE:
				return validateZipCode((String)value, diagnostics, context);
			case ListunionPackage.ZIP_UNIONS_TYPE:
				return validateZipUnionsType((String)value, diagnostics, context);
			case ListunionPackage.ZIP_UNION_TYPE:
				return validateZipUnionType((String)value, diagnostics, context);
			default: 
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatestatesByCountry(statesByCountry statesByCountry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(statesByCountry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleStringUnionType(String simpleStringUnionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSimpleStringUnionType_MemberTypes(simpleStringUnionType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Simple String Union Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleStringUnionType_MemberTypes(String simpleStringUnionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (ListunionPackage.Literals.SIMPLE_STRING_UNION_TYPE_MEMBER0.isInstance(simpleStringUnionType)) {
				if (validateSimpleStringUnionTypeMember0(simpleStringUnionType, tempDiagnostics, context)) return true;
			}
			if (ListunionPackage.Literals.SIMPLE_STRING_UNION_TYPE_MEMBER1.isInstance(simpleStringUnionType)) {
				if (validateSimpleStringUnionTypeMember1(simpleStringUnionType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (ListunionPackage.Literals.SIMPLE_STRING_UNION_TYPE_MEMBER0.isInstance(simpleStringUnionType)) {
				if (validateSimpleStringUnionTypeMember0(simpleStringUnionType, null, context)) return true;
			}
			if (ListunionPackage.Literals.SIMPLE_STRING_UNION_TYPE_MEMBER1.isInstance(simpleStringUnionType)) {
				if (validateSimpleStringUnionTypeMember1(simpleStringUnionType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleStringUnionTypeMember0(String simpleStringUnionTypeMember0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSimpleStringUnionTypeMember0_MinLength(simpleStringUnionTypeMember0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Simple String Union Type Member0</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleStringUnionTypeMember0_MinLength(String simpleStringUnionTypeMember0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = simpleStringUnionTypeMember0.length();  
		boolean result = length >= 1;
		if (!result && diagnostics != null) 
			reportMinLengthViolation(ListunionPackage.Literals.SIMPLE_STRING_UNION_TYPE_MEMBER0, simpleStringUnionTypeMember0, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleStringUnionTypeMember1(String simpleStringUnionTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSimpleStringUnionTypeMember1_MaxLength(simpleStringUnionTypeMember1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Simple String Union Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleStringUnionTypeMember1_MaxLength(String simpleStringUnionTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = simpleStringUnionTypeMember1.length();  
		boolean result = length <= 5;
		if (!result && diagnostics != null) 
			reportMaxLengthViolation(ListunionPackage.Literals.SIMPLE_STRING_UNION_TYPE_MEMBER1, simpleStringUnionTypeMember1, length, 5, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleUnionType(Object simpleUnionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSimpleUnionType_MemberTypes(simpleUnionType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Simple Union Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleUnionType_MemberTypes(Object simpleUnionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (ListunionPackage.Literals.SIMPLE_UNION_TYPE_MEMBER0.isInstance(simpleUnionType)) {
				if (validateSimpleUnionTypeMember0((BigInteger)simpleUnionType, tempDiagnostics, context)) return true;
			}
			if (ListunionPackage.Literals.SIMPLE_UNION_TYPE_MEMBER1.isInstance(simpleUnionType)) {
				if (validateSimpleUnionTypeMember1((String)simpleUnionType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (ListunionPackage.Literals.SIMPLE_UNION_TYPE_MEMBER0.isInstance(simpleUnionType)) {
				if (validateSimpleUnionTypeMember0((BigInteger)simpleUnionType, null, context)) return true;
			}
			if (ListunionPackage.Literals.SIMPLE_UNION_TYPE_MEMBER1.isInstance(simpleUnionType)) {
				if (validateSimpleUnionTypeMember1((String)simpleUnionType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleUnionTypeMember0(BigInteger simpleUnionTypeMember0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleUnionTypeMember1(String simpleUnionTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSimpleUnionTypeMember1_Enumeration(simpleUnionTypeMember1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSimpleUnionTypeMember1_Enumeration
	 */
	public static final Collection SIMPLE_UNION_TYPE_MEMBER1__ENUMERATION__VALUES =
		wrapEnumerationValues
			(new Object[] {
				 "N/A"
			 });

	/**
	 * Validates the Enumeration constraint of '<em>Simple Union Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleUnionTypeMember1_Enumeration(String simpleUnionTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = SIMPLE_UNION_TYPE_MEMBER1__ENUMERATION__VALUES.contains(simpleUnionTypeMember1);
		if (!result && diagnostics != null) 
			reportEnumerationViolation(ListunionPackage.Literals.SIMPLE_UNION_TYPE_MEMBER1, simpleUnionTypeMember1, SIMPLE_UNION_TYPE_MEMBER1__ENUMERATION__VALUES, diagnostics, context);
		return result; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSixStatesList(List<?> sixStatesList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStateList_ItemType(sixStatesList, diagnostics, context);
		if (result || diagnostics != null) result &= validateSixStatesList_MinLength(sixStatesList, diagnostics, context);
		if (result || diagnostics != null) result &= validateSixStatesList_MaxLength(sixStatesList, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Six States List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSixStatesList_MinLength(List<?> sixStatesList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = sixStatesList.size();  
		boolean result = length >= 6;
		if (!result && diagnostics != null) 
			reportMinLengthViolation(ListunionPackage.Literals.SIX_STATES_LIST, sixStatesList, length, 6, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Six States List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSixStatesList_MaxLength(List<?> sixStatesList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = sixStatesList.size();  
		boolean result = length <= 6;
		if (!result && diagnostics != null) 
			reportMaxLengthViolation(ListunionPackage.Literals.SIX_STATES_LIST, sixStatesList, length, 6, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState(String state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateState_MaxLength(state, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_MaxLength(String state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = state.length();  
		boolean result = length <= 12;
		if (!result && diagnostics != null) 
			reportMaxLengthViolation(ListunionPackage.Literals.STATE, state, length, 12, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateList(List<?> stateList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStateList_ItemType(stateList, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>State List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateList_ItemType(List<?> stateList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = stateList.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (ListunionPackage.Literals.STATE.isInstance(item)) {
				result &= validateState((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(ListunionPackage.Literals.STATE, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringList(List<?> stringList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStringList_ItemType(stringList, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>String List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringList_ItemType(List<?> stringList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = stringList.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.STRING.isInstance(item)) {
				result &= xmlTypeValidator.validateString((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.STRING, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZipCode(String zipCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateZipCode_MaxLength(zipCode, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Zip Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZipCode_MaxLength(String zipCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = zipCode.length();  
		boolean result = length <= 6;
		if (!result && diagnostics != null) 
			reportMaxLengthViolation(ListunionPackage.Literals.ZIP_CODE, zipCode, length, 6, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZipUnionsType(String zipUnionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateZipUnionsType_MemberTypes(zipUnionsType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Zip Unions Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZipUnionsType_MemberTypes(String zipUnionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (ListunionPackage.Literals.ZIP_CODE.isInstance(zipUnionsType)) {
				if (validateZipCode(zipUnionsType, tempDiagnostics, context)) return true;
			}
			if (ListunionPackage.Literals.STATE.isInstance(zipUnionsType)) {
				if (validateState(zipUnionsType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (ListunionPackage.Literals.ZIP_CODE.isInstance(zipUnionsType)) {
				if (validateZipCode(zipUnionsType, null, context)) return true;
			}
			if (ListunionPackage.Literals.STATE.isInstance(zipUnionsType)) {
				if (validateState(zipUnionsType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZipUnionType(String zipUnionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateZipUnionType_MemberTypes(zipUnionType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Zip Union Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZipUnionType_MemberTypes(String zipUnionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (ListunionPackage.Literals.ZIP_CODE.isInstance(zipUnionType)) {
				if (validateZipCode(zipUnionType, tempDiagnostics, context)) return true;
			}
			if (ListunionPackage.Literals.STATE.isInstance(zipUnionType)) {
				if (validateState(zipUnionType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (ListunionPackage.Literals.ZIP_CODE.isInstance(zipUnionType)) {
				if (validateZipCode(zipUnionType, null, context)) return true;
			}
			if (ListunionPackage.Literals.STATE.isInstance(zipUnionType)) {
				if (validateState(zipUnionType, null, context)) return true;
			}
		}
		return false;
	}

} //ListunionValidator
