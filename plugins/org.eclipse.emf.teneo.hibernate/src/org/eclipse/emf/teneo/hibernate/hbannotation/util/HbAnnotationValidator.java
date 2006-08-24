/**
 * <copyright>
 * </copyright>
 *
 * $Id: HbAnnotationValidator.java,v 1.1 2006/08/24 22:12:52 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbannotation.util;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.teneo.annotations.pannotation.util.PannotationValidator;

import org.eclipse.emf.teneo.hibernate.hbannotation.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotationPackage
 * @generated
 */
public class HbAnnotationValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static final HbAnnotationValidator INSTANCE = new HbAnnotationValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
    public static final String DIAGNOSTIC_SOURCE = "org.eclipse.emf.teneo.hibernate.hbannotation";

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
    protected PannotationValidator pannotationValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public HbAnnotationValidator() {
		super();
		pannotationValidator = PannotationValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected EPackage getEPackage() {
	  return HbAnnotationPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresonding classifier of the model.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map context) {
		switch (classifierID) {
			case HbAnnotationPackage.HB_ANNOTATION:
				return validateHbAnnotation((HbAnnotation)value, diagnostics, context);
			case HbAnnotationPackage.COLLECTION_OF_ELEMENTS:
				return validateCollectionOfElements((CollectionOfElements)value, diagnostics, context);
			case HbAnnotationPackage.WHERE:
				return validateWhere((Where)value, diagnostics, context);
			case HbAnnotationPackage.CASCADE:
				return validateCascade((Cascade)value, diagnostics, context);
			case HbAnnotationPackage.COLUMNS:
				return validateColumns((Columns)value, diagnostics, context);
			case HbAnnotationPackage.MAP_KEY:
				return validateMapKey((MapKey)value, diagnostics, context);
			case HbAnnotationPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case HbAnnotationPackage.TYPE:
				return validateType((Type)value, diagnostics, context);
			case HbAnnotationPackage.ID_BAG:
				return validateIdBag((IdBag)value, diagnostics, context);
			default: 
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateHbAnnotation(HbAnnotation hbAnnotation, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(hbAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hbAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hbAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hbAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validateHbAnnotation_CompatibleEModelElementType(hbAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validateHbAnnotation_AnnotationIsSupported(hbAnnotation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CompatibleEModelElementType constraint of '<em>Hb Annotation</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateHbAnnotation_CompatibleEModelElementType(HbAnnotation hbAnnotation, DiagnosticChain diagnostics, Map context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "CompatibleEModelElementType", getObjectLabel(hbAnnotation, context) }),
						 new Object[] { hbAnnotation }));
			}
			return false;
		}
		return pannotationValidator.validatePAnnotation_CompatibleEModelElementType(hbAnnotation, diagnostics, context);
	}

	/**
	 * Validates the AnnotationIsSupported constraint of '<em>Hb Annotation</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateHbAnnotation_AnnotationIsSupported(HbAnnotation hbAnnotation, DiagnosticChain diagnostics, Map context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "AnnotationIsSupported", getObjectLabel(hbAnnotation, context) }),
						 new Object[] { hbAnnotation }));
			}
			return false;
		}
		return pannotationValidator.validatePAnnotation_AnnotationIsSupported(hbAnnotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateCollectionOfElements(CollectionOfElements collectionOfElements, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(collectionOfElements, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(collectionOfElements, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(collectionOfElements, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(collectionOfElements, diagnostics, context);
		if (result || diagnostics != null) result &= validateHbAnnotation_CompatibleEModelElementType(collectionOfElements, diagnostics, context);
		if (result || diagnostics != null) result &= validateHbAnnotation_AnnotationIsSupported(collectionOfElements, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateWhere(Where where, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(where, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(where, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(where, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(where, diagnostics, context);
		if (result || diagnostics != null) result &= validateHbAnnotation_CompatibleEModelElementType(where, diagnostics, context);
		if (result || diagnostics != null) result &= validateHbAnnotation_AnnotationIsSupported(where, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateCascade(Cascade cascade, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(cascade, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cascade, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cascade, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cascade, diagnostics, context);
		if (result || diagnostics != null) result &= validateHbAnnotation_CompatibleEModelElementType(cascade, diagnostics, context);
		if (result || diagnostics != null) result &= validateHbAnnotation_AnnotationIsSupported(cascade, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateColumns(Columns columns, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(columns, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(columns, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(columns, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(columns, diagnostics, context);
		if (result || diagnostics != null) result &= validateHbAnnotation_CompatibleEModelElementType(columns, diagnostics, context);
		if (result || diagnostics != null) result &= validateHbAnnotation_AnnotationIsSupported(columns, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateMapKey(MapKey mapKey, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(mapKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mapKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mapKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mapKey, diagnostics, context);
		if (result || diagnostics != null) result &= validateHbAnnotation_CompatibleEModelElementType(mapKey, diagnostics, context);
		if (result || diagnostics != null) result &= validateHbAnnotation_AnnotationIsSupported(mapKey, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateType(Type type, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(type, diagnostics, context);
		if (result || diagnostics != null) result &= validateHbAnnotation_CompatibleEModelElementType(type, diagnostics, context);
		if (result || diagnostics != null) result &= validateHbAnnotation_AnnotationIsSupported(type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateIdBag(IdBag idBag, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(idBag, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(idBag, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(idBag, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(idBag, diagnostics, context);
		if (result || diagnostics != null) result &= validateHbAnnotation_CompatibleEModelElementType(idBag, diagnostics, context);
		if (result || diagnostics != null) result &= validateHbAnnotation_AnnotationIsSupported(idBag, diagnostics, context);
		return result;
	}

} //HbAnnotationValidator
