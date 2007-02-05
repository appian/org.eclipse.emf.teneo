/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExtensionValidator.java,v 1.2 2007/02/05 16:13:46 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.ExtensionPackage
 * @generated
 */
public class ExtensionValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ExtensionValidator INSTANCE = new ExtensionValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension";

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
	public ExtensionValidator() {
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
	  return ExtensionPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresonding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map context) {
		switch (classifierID) {
			case ExtensionPackage.ADDRESS:
				return validateAddress((Address)value, diagnostics, context);
			case ExtensionPackage.ADDRESS_LIST:
				return validateAddressList((AddressList)value, diagnostics, context);
			case ExtensionPackage.DISTRICT_UK_ADDRESS:
				return validateDistrictUKAddress((DistrictUKAddress)value, diagnostics, context);
			case ExtensionPackage.FIRST_ADDRESS_HOLDER:
				return validateFirstAddressHolder((FirstAddressHolder)value, diagnostics, context);
			case ExtensionPackage.INTERNATIONAL_PRICE:
				return validateInternationalPrice((InternationalPrice)value, diagnostics, context);
			case ExtensionPackage.UK_ADDRESS:
				return validateUKAddress((UKAddress)value, diagnostics, context);
			case ExtensionPackage.US_ADDRESS:
				return validateUSAddress((USAddress)value, diagnostics, context);
			case ExtensionPackage.US_STATE:
				return validateUSState((USState)value, diagnostics, context);
			case ExtensionPackage.POSTCODE:
				return validatePostcode((String)value, diagnostics, context);
			case ExtensionPackage.UK_POSTCODE:
				return validateUKPostcode((String)value, diagnostics, context);
			case ExtensionPackage.US_STATE_OBJECT:
				return validateUSStateObject((USState)value, diagnostics, context);
			default: 
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddress(Address address, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(address, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressList(AddressList addressList, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(addressList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDistrictUKAddress(DistrictUKAddress districtUKAddress, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(districtUKAddress, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirstAddressHolder(FirstAddressHolder firstAddressHolder, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(firstAddressHolder, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternationalPrice(InternationalPrice internationalPrice, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(internationalPrice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUKAddress(UKAddress ukAddress, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(ukAddress, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUSAddress(USAddress usAddress, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(usAddress, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUSState(USState usState, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostcode(String postcode, DiagnosticChain diagnostics, Map context) {
		boolean result = validatePostcode_MinLength(postcode, diagnostics, context);
		if (result || diagnostics != null) result &= validatePostcode_MaxLength(postcode, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Postcode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostcode_MinLength(String postcode, DiagnosticChain diagnostics, Map context) {
		int length = postcode.length();  
		boolean result = length >= 7;
		if (!result && diagnostics != null) 
			reportMinLengthViolation(ExtensionPackage.Literals.POSTCODE, postcode, length, 7, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Postcode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostcode_MaxLength(String postcode, DiagnosticChain diagnostics, Map context) {
		int length = postcode.length();  
		boolean result = length <= 7;
		if (!result && diagnostics != null) 
			reportMaxLengthViolation(ExtensionPackage.Literals.POSTCODE, postcode, length, 7, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUKPostcode(String ukPostcode, DiagnosticChain diagnostics, Map context) {
		boolean result = validatePostcode_MinLength(ukPostcode, diagnostics, context);
		if (result || diagnostics != null) result &= validatePostcode_MaxLength(ukPostcode, diagnostics, context);
		if (result || diagnostics != null) result &= validateUKPostcode_Pattern(ukPostcode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUKPostcode_Pattern
	 */
	public static final  PatternMatcher [][] UK_POSTCODE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[A-Z]{2}\\d\\s\\d[A-Z]{2}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>UK Postcode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUKPostcode_Pattern(String ukPostcode, DiagnosticChain diagnostics, Map context) {
		return validatePattern(ExtensionPackage.Literals.UK_POSTCODE, ukPostcode, UK_POSTCODE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUSStateObject(USState usStateObject, DiagnosticChain diagnostics, Map context) {
		return true;
	}

} //ExtensionValidator
