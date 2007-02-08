/**
 * <copyright>
 * </copyright>
 *
 * $Id: SchemaprimerpoValidator.java,v 1.1 2007/02/08 23:09:24 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.util;

import java.math.BigInteger;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.SchemaprimerpoPackage
 * @generated
 */
public class SchemaprimerpoValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SchemaprimerpoValidator INSTANCE = new SchemaprimerpoValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo";

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
	public SchemaprimerpoValidator() {
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
	  return SchemaprimerpoPackage.eINSTANCE;
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
			case SchemaprimerpoPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case SchemaprimerpoPackage.ITEM:
				return validateItem((Item)value, diagnostics, context);
			case SchemaprimerpoPackage.PURCHASE_ORDER:
				return validatePurchaseOrder((PurchaseOrder)value, diagnostics, context);
			case SchemaprimerpoPackage.US_ADDRESS:
				return validateUSAddress((USAddress)value, diagnostics, context);
			case SchemaprimerpoPackage.QUANTITY_TYPE:
				return validateQuantityType((BigInteger)value, diagnostics, context);
			case SchemaprimerpoPackage.SKU:
				return validateSKU((String)value, diagnostics, context);
			default: 
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItem(Item item, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(item, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurchaseOrder(PurchaseOrder purchaseOrder, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(purchaseOrder, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUSAddress(USAddress usAddress, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(usAddress, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityType(BigInteger quantityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validatePositiveInteger_Min(quantityType, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuantityType_Max(quantityType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateQuantityType_Max
	 */
	public static final BigInteger QUANTITY_TYPE__MAX__VALUE = new BigInteger("100");

	/**
	 * Validates the Max constraint of '<em>Quantity Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityType_Max(BigInteger quantityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = quantityType.compareTo(QUANTITY_TYPE__MAX__VALUE) < 0;
		if (!result && diagnostics != null) 
			reportMaxViolation(SchemaprimerpoPackage.Literals.QUANTITY_TYPE, quantityType, QUANTITY_TYPE__MAX__VALUE, false, diagnostics, context);
		return result; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSKU(String sku, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSKU_Pattern(sku, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSKU_Pattern
	 */
	public static final  PatternMatcher [][] SKU__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\d{3}-[A-Z]{2}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>SKU</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSKU_Pattern(String sku, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SchemaprimerpoPackage.Literals.SKU, sku, SKU__PATTERN__VALUES, diagnostics, context);
	}

} //SchemaprimerpoValidator
