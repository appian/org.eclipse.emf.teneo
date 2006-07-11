/**
 * <copyright>
 * </copyright>
 *
 * $Id: ListValidator.java,v 1.1 2006/07/11 16:56:54 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.util;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.ListPackage
 * @generated
 */
public class ListValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ListValidator INSTANCE = new ListValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.emf.teneo.samples.emf.schemaconstructs.list";

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
	public ListValidator() {
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
	  return ListPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresonding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map context) {
		switch (classifierID) {
			case ListPackage.STATES_BY_COUNTRY:
				return validatestatesByCountry((statesByCountry)value, diagnostics, context);
			case ListPackage.SIX_STATES_LIST:
				return validateSixStatesList((List)value, diagnostics, context);
			case ListPackage.STATE:
				return validateState((String)value, diagnostics, context);
			case ListPackage.STATE_LIST:
				return validateStateList((List)value, diagnostics, context);
			case ListPackage.STRING_LIST:
				return validateStringList((List)value, diagnostics, context);
			case ListPackage.ZIP_CODE:
				return validateZipCode((String)value, diagnostics, context);
			default: 
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatestatesByCountry(statesByCountry statesByCountry, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(statesByCountry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSixStatesList(List sixStatesList, DiagnosticChain diagnostics, Map context) {
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
	public boolean validateSixStatesList_MinLength(List sixStatesList, DiagnosticChain diagnostics, Map context) {
		int length = sixStatesList.size();  
		boolean result = length >= 6;
		if (!result && diagnostics != null) 
			reportMinLengthViolation(ListPackage.Literals.SIX_STATES_LIST, sixStatesList, length, 6, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Six States List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSixStatesList_MaxLength(List sixStatesList, DiagnosticChain diagnostics, Map context) {
		int length = sixStatesList.size();  
		boolean result = length <= 6;
		if (!result && diagnostics != null) 
			reportMaxLengthViolation(ListPackage.Literals.SIX_STATES_LIST, sixStatesList, length, 6, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState(String state, DiagnosticChain diagnostics, Map context) {
		boolean result = validateState_MaxLength(state, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_MaxLength(String state, DiagnosticChain diagnostics, Map context) {
		int length = state.length();  
		boolean result = length <= 12;
		if (!result && diagnostics != null) 
			reportMaxLengthViolation(ListPackage.Literals.STATE, state, length, 12, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateList(List stateList, DiagnosticChain diagnostics, Map context) {
		boolean result = validateStateList_ItemType(stateList, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>State List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateList_ItemType(List stateList, DiagnosticChain diagnostics, Map context) {
		boolean result = true;
		for (Iterator i = stateList.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (ListPackage.Literals.STATE.isInstance(item)) {
				result &= validateState((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(ListPackage.Literals.STATE, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringList(List stringList, DiagnosticChain diagnostics, Map context) {
		boolean result = validateStringList_ItemType(stringList, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>String List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringList_ItemType(List stringList, DiagnosticChain diagnostics, Map context) {
		boolean result = true;
		for (Iterator i = stringList.iterator(); i.hasNext() && (result || diagnostics != null); ) {
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
	public boolean validateZipCode(String zipCode, DiagnosticChain diagnostics, Map context) {
		boolean result = validateZipCode_MaxLength(zipCode, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Zip Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZipCode_MaxLength(String zipCode, DiagnosticChain diagnostics, Map context) {
		int length = zipCode.length();  
		boolean result = length <= 6;
		if (!result && diagnostics != null) 
			reportMaxLengthViolation(ListPackage.Literals.ZIP_CODE, zipCode, length, 6, diagnostics, context);
		return result;
	}

} //ListValidator
