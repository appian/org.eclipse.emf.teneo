/**
 * <copyright>
 * </copyright>
 *
 * $Id: PrimerpoValidator.java,v 1.2 2006/07/22 13:01:18 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.util;

import java.math.BigInteger;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;
import org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.DocumentRoot;
import org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.Item;
import org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.PrimerpoPackage;
import org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.PurchaseOrder;
import org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.USAddress;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.PrimerpoPackage
 * @generated
 */
public class PrimerpoValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PrimerpoValidator INSTANCE = new PrimerpoValidator();

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
//	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

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
	public PrimerpoValidator() {
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPackage getEPackage() {
	  return PrimerpoPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresonding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map context) {
		switch (classifierID) {
			case PrimerpoPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case PrimerpoPackage.ITEM:
				return validateItem((Item)value, diagnostics, context);
			case PrimerpoPackage.PURCHASE_ORDER:
				return validatePurchaseOrder((PurchaseOrder)value, diagnostics, context);
			case PrimerpoPackage.US_ADDRESS:
				return validateUSAddress((USAddress)value, diagnostics, context);
			case PrimerpoPackage.QUANTITY_TYPE:
				return validateQuantityType((BigInteger)value, diagnostics, context);
			case PrimerpoPackage.SKU:
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
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItem(Item item, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(item, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurchaseOrder(PurchaseOrder purchaseOrder, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(purchaseOrder, diagnostics, context);
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
	public boolean validateQuantityType(BigInteger quantityType, DiagnosticChain diagnostics, Map context) {
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
	public boolean validateQuantityType_Max(BigInteger quantityType, DiagnosticChain diagnostics, Map context) {
		boolean result = quantityType.compareTo(QUANTITY_TYPE__MAX__VALUE) < 0;
		if (!result && diagnostics != null) 
			reportMaxViolation(PrimerpoPackage.eINSTANCE.getQuantityType(), quantityType, QUANTITY_TYPE__MAX__VALUE, false, diagnostics, context);
		return result; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSKU(String sku, DiagnosticChain diagnostics, Map context) {
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
	public boolean validateSKU_Pattern(String sku, DiagnosticChain diagnostics, Map context) {
		return validatePattern(PrimerpoPackage.eINSTANCE.getSKU(), sku, SKU__PATTERN__VALUES, diagnostics, context);
	}

} //PrimerpoValidator
