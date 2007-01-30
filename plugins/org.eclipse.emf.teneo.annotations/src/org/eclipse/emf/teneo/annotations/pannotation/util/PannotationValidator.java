/**
 * <copyright>
 * </copyright>
 *
 * $Id: PannotationValidator.java,v 1.19 2007/01/30 10:51:11 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.teneo.annotations.pannotation.AssociationOverride;
import org.eclipse.emf.teneo.annotations.pannotation.AttributeOverride;
import org.eclipse.emf.teneo.annotations.pannotation.Basic;
import org.eclipse.emf.teneo.annotations.pannotation.CascadeType;
import org.eclipse.emf.teneo.annotations.pannotation.Column;
import org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorColumn;
import org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorType;
import org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorValue;
import org.eclipse.emf.teneo.annotations.pannotation.Embeddable;
import org.eclipse.emf.teneo.annotations.pannotation.Embedded;
import org.eclipse.emf.teneo.annotations.pannotation.EmbeddedId;
import org.eclipse.emf.teneo.annotations.pannotation.Entity;
import org.eclipse.emf.teneo.annotations.pannotation.EnumType;
import org.eclipse.emf.teneo.annotations.pannotation.Enumerated;
import org.eclipse.emf.teneo.annotations.pannotation.FetchType;
import org.eclipse.emf.teneo.annotations.pannotation.GeneratedValue;
import org.eclipse.emf.teneo.annotations.pannotation.GenerationType;
import org.eclipse.emf.teneo.annotations.pannotation.Id;
import org.eclipse.emf.teneo.annotations.pannotation.IdClass;
import org.eclipse.emf.teneo.annotations.pannotation.Inheritance;
import org.eclipse.emf.teneo.annotations.pannotation.InheritanceType;
import org.eclipse.emf.teneo.annotations.pannotation.JoinColumn;
import org.eclipse.emf.teneo.annotations.pannotation.JoinTable;
import org.eclipse.emf.teneo.annotations.pannotation.Lob;
import org.eclipse.emf.teneo.annotations.pannotation.ManyToMany;
import org.eclipse.emf.teneo.annotations.pannotation.ManyToOne;
import org.eclipse.emf.teneo.annotations.pannotation.MapKey;
import org.eclipse.emf.teneo.annotations.pannotation.MappedSuperclass;
import org.eclipse.emf.teneo.annotations.pannotation.OneToMany;
import org.eclipse.emf.teneo.annotations.pannotation.OneToOne;
import org.eclipse.emf.teneo.annotations.pannotation.OrderBy;
import org.eclipse.emf.teneo.annotations.pannotation.PAnnotation;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage;
import org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumn;
import org.eclipse.emf.teneo.annotations.pannotation.SecondaryTable;
import org.eclipse.emf.teneo.annotations.pannotation.SequenceGenerator;
import org.eclipse.emf.teneo.annotations.pannotation.Table;
import org.eclipse.emf.teneo.annotations.pannotation.TableGenerator;
import org.eclipse.emf.teneo.annotations.pannotation.Temporal;
import org.eclipse.emf.teneo.annotations.pannotation.TemporalType;
import org.eclipse.emf.teneo.annotations.pannotation.Transient;
import org.eclipse.emf.teneo.annotations.pannotation.UniqueConstraint;
import org.eclipse.emf.teneo.annotations.pannotation.Version;
import org.eclipse.emf.teneo.util.EcoreDataTypes;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage
 * @generated
 */
public class PannotationValidator extends EObjectValidator {
	public static final String UNSUPPORTED_ANNOTATION_SOURCE = 
		"http://annotation.elver.org/internal/Unsupported";

	public static final List ALLOWED_VERSION_ETYPES = Collections.unmodifiableList(Arrays.asList(new EDataType[] { EcorePackage.eINSTANCE.getEInt(), EcorePackage.eINSTANCE.getELong(), EcorePackage.eINSTANCE.getEShort(), EcorePackage.eINSTANCE.getEIntegerObject(), EcorePackage.eINSTANCE.getELongObject(), EcorePackage.eINSTANCE.getEShortObject() }));

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Davide Marchignoli\n";

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PannotationValidator INSTANCE = new PannotationValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.emf.teneo.annotations.pannotation";

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
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PannotationValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPackage getEPackage() {
	  return PannotationPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresonding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map context) {
		switch (classifierID) {
			case PannotationPackage.PANNOTATION:
				return validatePAnnotation((PAnnotation)value, diagnostics, context);
			case PannotationPackage.ATTRIBUTE_OVERRIDE:
				return validateAttributeOverride((AttributeOverride)value, diagnostics, context);
			case PannotationPackage.ASSOCIATION_OVERRIDE:
				return validateAssociationOverride((AssociationOverride)value, diagnostics, context);
			case PannotationPackage.BASIC:
				return validateBasic((Basic)value, diagnostics, context);
			case PannotationPackage.COLUMN:
				return validateColumn((Column)value, diagnostics, context);
			case PannotationPackage.DISCRIMINATOR_COLUMN:
				return validateDiscriminatorColumn((DiscriminatorColumn)value, diagnostics, context);
			case PannotationPackage.DISCRIMINATOR_VALUE:
				return validateDiscriminatorValue((DiscriminatorValue)value, diagnostics, context);
			case PannotationPackage.EMBEDDABLE:
				return validateEmbeddable((Embeddable)value, diagnostics, context);
			case PannotationPackage.EMBEDDED:
				return validateEmbedded((Embedded)value, diagnostics, context);
			case PannotationPackage.EMBEDDED_ID:
				return validateEmbeddedId((EmbeddedId)value, diagnostics, context);
			case PannotationPackage.ENTITY:
				return validateEntity((Entity)value, diagnostics, context);
			case PannotationPackage.ENUMERATED:
				return validateEnumerated((Enumerated)value, diagnostics, context);
			case PannotationPackage.GENERATED_VALUE:
				return validateGeneratedValue((GeneratedValue)value, diagnostics, context);
			case PannotationPackage.ID:
				return validateId((Id)value, diagnostics, context);
			case PannotationPackage.ID_CLASS:
				return validateIdClass((IdClass)value, diagnostics, context);
			case PannotationPackage.INHERITANCE:
				return validateInheritance((Inheritance)value, diagnostics, context);
			case PannotationPackage.JOIN_COLUMN:
				return validateJoinColumn((JoinColumn)value, diagnostics, context);
			case PannotationPackage.JOIN_TABLE:
				return validateJoinTable((JoinTable)value, diagnostics, context);
			case PannotationPackage.LOB:
				return validateLob((Lob)value, diagnostics, context);
			case PannotationPackage.MANY_TO_MANY:
				return validateManyToMany((ManyToMany)value, diagnostics, context);
			case PannotationPackage.MANY_TO_ONE:
				return validateManyToOne((ManyToOne)value, diagnostics, context);
			case PannotationPackage.MAP_KEY:
				return validateMapKey((MapKey)value, diagnostics, context);
			case PannotationPackage.MAPPED_SUPERCLASS:
				return validateMappedSuperclass((MappedSuperclass)value, diagnostics, context);
			case PannotationPackage.ONE_TO_MANY:
				return validateOneToMany((OneToMany)value, diagnostics, context);
			case PannotationPackage.ONE_TO_ONE:
				return validateOneToOne((OneToOne)value, diagnostics, context);
			case PannotationPackage.ORDER_BY:
				return validateOrderBy((OrderBy)value, diagnostics, context);
			case PannotationPackage.PRIMARY_KEY_JOIN_COLUMN:
				return validatePrimaryKeyJoinColumn((PrimaryKeyJoinColumn)value, diagnostics, context);
			case PannotationPackage.SECONDARY_TABLE:
				return validateSecondaryTable((SecondaryTable)value, diagnostics, context);
			case PannotationPackage.SEQUENCE_GENERATOR:
				return validateSequenceGenerator((SequenceGenerator)value, diagnostics, context);
			case PannotationPackage.TABLE:
				return validateTable((Table)value, diagnostics, context);
			case PannotationPackage.TABLE_GENERATOR:
				return validateTableGenerator((TableGenerator)value, diagnostics, context);
			case PannotationPackage.TEMPORAL:
				return validateTemporal((Temporal)value, diagnostics, context);
			case PannotationPackage.TRANSIENT:
				return validateTransient((Transient)value, diagnostics, context);
			case PannotationPackage.UNIQUE_CONSTRAINT:
				return validateUniqueConstraint((UniqueConstraint)value, diagnostics, context);
			case PannotationPackage.VERSION:
				return validateVersion((Version)value, diagnostics, context);
			case PannotationPackage.CASCADE_TYPE:
				return validateCascadeType((CascadeType)value, diagnostics, context);
			case PannotationPackage.DISCRIMINATOR_TYPE:
				return validateDiscriminatorType((DiscriminatorType)value, diagnostics, context);
			case PannotationPackage.ENUM_TYPE:
				return validateEnumType((EnumType)value, diagnostics, context);
			case PannotationPackage.FETCH_TYPE:
				return validateFetchType((FetchType)value, diagnostics, context);
			case PannotationPackage.GENERATION_TYPE:
				return validateGenerationType((GenerationType)value, diagnostics, context);
			case PannotationPackage.INHERITANCE_TYPE:
				return validateInheritanceType((InheritanceType)value, diagnostics, context);
			case PannotationPackage.TEMPORAL_TYPE:
				return validateTemporalType((TemporalType)value, diagnostics, context);
			default: 
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePAnnotation(PAnnotation pAnnotation, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(pAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_CompatibleEModelElementType(pAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_AnnotationIsSupported(pAnnotation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CompatibleEModelElementType constraint of '<em>PAnnotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePAnnotation_CompatibleEModelElementType(PAnnotation pAnnotation, DiagnosticChain diagnostics, Map context) {
		EModelElement modelElement = pAnnotation.getEModelElement();
		if (modelElement != null && !PannotationPackage.eINSTANCE.isTarget(pAnnotation.eClass(), modelElement.eClass())) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "CompatibleEModelElementType", getObjectLabel(pAnnotation, context) }),
						 new Object[] { pAnnotation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the AnnotationIsSupported constraint of '<em>PAnnotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePAnnotation_AnnotationIsSupported(PAnnotation pAnnotation, DiagnosticChain diagnostics, Map context) {
		if (pAnnotation.eClass().getEAnnotation(UNSUPPORTED_ANNOTATION_SOURCE) != null) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "AnnotationIsSupported", getObjectLabel(pAnnotation, context) }),
						 new Object[] { pAnnotation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeOverride(AttributeOverride attributeOverride, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(attributeOverride, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeOverride, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeOverride, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeOverride, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_CompatibleEModelElementType(attributeOverride, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_AnnotationIsSupported(attributeOverride, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasic(Basic basic, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(basic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(basic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(basic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(basic, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_CompatibleEModelElementType(basic, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_AnnotationIsSupported(basic, diagnostics, context);
		if (result || diagnostics != null) result &= validateBasic_AllowedElementType(basic, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AllowedElementType constraint of '<em>Basic</em>'.
	 * <!-- begin-user-doc -->
	 * EJB3-SPEC 9.1.16
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateBasic_AllowedElementType(Basic basic, DiagnosticChain diagnostics, Map context) {
		EModelElement eModelElement = basic.getEModelElement();
		EAttribute eAttribute = eModelElement instanceof EAttribute ? (EAttribute) eModelElement : null;
		EDataType eDataType = eAttribute != null ? eAttribute.getEAttributeType() : null;
		if (eDataType != null && (!EcoreDataTypes.INSTANCE.isBasicType(eDataType) || eAttribute.isMany())) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "AllowedElementType", getObjectLabel(basic, context) }),
						 new Object[] { basic }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumn(Column column, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(column, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_CompatibleEModelElementType(column, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_AnnotationIsSupported(column, diagnostics, context);
		if (result || diagnostics != null) result &= validateColumn_ScalePrecisionForNumeric(column, diagnostics, context);
		if (result || diagnostics != null) result &= validateColumn_LengthForString(column, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ScalePrecisionForNumeric constraint of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * EJB3-SPEC 9.1.5 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateColumn_ScalePrecisionForNumeric(Column column, DiagnosticChain diagnostics, Map context) {
		if (!(column.isSetScale() || column.isSetPrecision()))
			return true;
		EModelElement eModelElement = column.getEModelElement();
		EStructuralFeature eStructuralFeature = (eModelElement instanceof EStructuralFeature) ? (EStructuralFeature) eModelElement : null;
		if (eStructuralFeature == null)
			return true;
		EClassifier eClassifier = eStructuralFeature.getEType();
		if (eClassifier == null) { // TODO replace with eClassifier is (numeric type?) 
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "ScalePrecisionForNumeric", getObjectLabel(column, context) }),
						 new Object[] { column }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the LengthForString constraint of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * EJB3-SPEC 9.1.5 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateColumn_LengthForString(Column column, DiagnosticChain diagnostics, Map context) {
		if (!column.isSetLength())
			return true;
		EModelElement eModelElement = column.getEModelElement();
		EStructuralFeature eStructuralFeature = (eModelElement instanceof EStructuralFeature) ? (EStructuralFeature) eModelElement : null;
		if (eStructuralFeature == null)
			return true;
		EClassifier eClassifier = eStructuralFeature.getEType();
		if (eClassifier != EcorePackage.eINSTANCE.getEString()) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "LengthForString", getObjectLabel(column, context) }),
						 new Object[] { column }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscriminatorColumn(DiscriminatorColumn discriminatorColumn, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(discriminatorColumn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(discriminatorColumn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(discriminatorColumn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(discriminatorColumn, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_CompatibleEModelElementType(discriminatorColumn, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_AnnotationIsSupported(discriminatorColumn, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscriminatorValue(DiscriminatorValue discriminatorValue, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(discriminatorValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(discriminatorValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(discriminatorValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(discriminatorValue, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_CompatibleEModelElementType(discriminatorValue, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_AnnotationIsSupported(discriminatorValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscriminatorValue_NoAbstract(discriminatorValue, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NoAbstract constraint of '<em>Discriminator Value</em>'.
	 * <!-- begin-user-doc -->
	 * EJB3-SPEC 9.1.29
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateDiscriminatorValue_NoAbstract(DiscriminatorValue discriminatorValue, DiagnosticChain diagnostics, Map context) {
		EModelElement eModelElement = discriminatorValue.getEModelElement();
		EClass eClass = (eModelElement instanceof EClass) ? (EClass) eModelElement : null;
		if (eClass != null && eClass.isAbstract()) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "NoAbstract", getObjectLabel(discriminatorValue, context) }),
						 new Object[] { discriminatorValue }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmbeddable(Embeddable embeddable, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(embeddable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(embeddable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(embeddable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(embeddable, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_CompatibleEModelElementType(embeddable, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_AnnotationIsSupported(embeddable, diagnostics, context);
		if (result || diagnostics != null) result &= validateEmbeddable_NoInterface(embeddable, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NoInterface constraint of '<em>Embeddable</em>'.
	 * <!-- begin-user-doc -->
	 * EJB3-SPEC 9.1.32, 2.1.5 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateEmbeddable_NoInterface(Embeddable embeddable, DiagnosticChain diagnostics, Map context) {
		EModelElement modelElement = embeddable.getEModelElement();
		EClass targetEClass = (modelElement instanceof EClass) ? (EClass) modelElement : null;
		if (targetEClass != null && (targetEClass.isInterface() || targetEClass.isAbstract())) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "NoInterface", getObjectLabel(embeddable, context) }),
						 new Object[] { embeddable }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmbedded(Embedded embedded, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(embedded, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(embedded, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(embedded, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(embedded, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_CompatibleEModelElementType(embedded, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_AnnotationIsSupported(embedded, diagnostics, context);
		if (result || diagnostics != null) result &= validateEmbedded_EmbedByValue(embedded, diagnostics, context);
		return result;
	}

	/**
	 * Validates the EmbedByValue constraint of '<em>Embedded</em>'.
	 * <!-- begin-user-doc -->
	 * EJB3-SPEC 2.1.5
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateEmbedded_EmbedByValue(Embedded embedded, DiagnosticChain diagnostics, Map context) {
		EModelElement eModelElement = embedded.getEModelElement();
		EReference eReference = (eModelElement instanceof EReference) ? (EReference) eModelElement : null;
		if (eReference != null && !eReference.isContainment()) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "EmbedByValue", getObjectLabel(embedded, context) }),
						 new Object[] { embedded }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmbeddedId(EmbeddedId embeddedId, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(embeddedId, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(embeddedId, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(embeddedId, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(embeddedId, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_CompatibleEModelElementType(embeddedId, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_AnnotationIsSupported(embeddedId, diagnostics, context);
		if (result || diagnostics != null) result &= validateEmbeddedId_EmbedByValue(embeddedId, diagnostics, context);
		return result;
	}

	/**
	 * Validates the EmbedByValue constraint of '<em>Embedded Id</em>'.
	 * <!-- begin-user-doc -->
	 * EJB3-SPEC 2.1.5
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateEmbeddedId_EmbedByValue(EmbeddedId embeddedId, DiagnosticChain diagnostics, Map context) {
		EModelElement eModelElement = embeddedId.getEModelElement();
		EReference eReference = (eModelElement instanceof EReference) ? (EReference) eModelElement : null;
		if (eReference != null && !eReference.isContainment()) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "EmbedByValue", getObjectLabel(embeddedId, context) }),
						 new Object[] { embeddedId }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_CompatibleEModelElementType(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_AnnotationIsSupported(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_NoInterface(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_NoReservedName(entity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NoInterface constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * EJB3-SPEC 2.1 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateEntity_NoInterface(Entity entity, DiagnosticChain diagnostics, Map context) {
		EModelElement modelElement = entity.getEModelElement();
		EClass targetEClass = (modelElement instanceof EClass) ? (EClass) modelElement : null;
		if (targetEClass != null && targetEClass.isInterface()) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "NoInterface", getObjectLabel(entity, context) }),
						 new Object[] { entity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NoReservedName constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_NoReservedName(Entity entity, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
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
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "NoReservedName", getObjectLabel(entity, context) }),
						 new Object[] { entity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerated(Enumerated enumerated, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(enumerated, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enumerated, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enumerated, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enumerated, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_CompatibleEModelElementType(enumerated, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_AnnotationIsSupported(enumerated, diagnostics, context);
		if (result || diagnostics != null) result &= validateEnumerated_AllowedElementType(enumerated, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AllowedElementType constraint of '<em>Enumerated</em>'.
	 * <!-- begin-user-doc -->
	 * EJB3-SPEC 9.1.19
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateEnumerated_AllowedElementType(Enumerated enumerated, DiagnosticChain diagnostics, Map context) {
		EModelElement modelElement = enumerated.getEModelElement();
		EAttribute targetEAttribute = (modelElement instanceof EAttribute) ? (EAttribute) modelElement : null;
		if (targetEAttribute != null && !EcoreDataTypes.INSTANCE.isEnum(targetEAttribute.getEType())) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "AllowedElementType", getObjectLabel(enumerated, context) }),
						 new Object[] { enumerated }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneratedValue(GeneratedValue generatedValue, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(generatedValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(generatedValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(generatedValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(generatedValue, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_CompatibleEModelElementType(generatedValue, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_AnnotationIsSupported(generatedValue, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateId(Id id, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(id, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(id, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(id, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(id, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_CompatibleEModelElementType(id, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_AnnotationIsSupported(id, diagnostics, context);
		if (result || diagnostics != null) result &= validateId_AllowedElementType(id, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AllowedElementType constraint of '<em>Id</em>'.
	 * <!-- begin-user-doc -->
	 * EJB3-SPEC 2.1.4
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateId_AllowedElementType(Id id, DiagnosticChain diagnostics, Map context) {
		EModelElement modelElement = id.getEModelElement();
		EDataType eType = (modelElement instanceof EAttribute) ? ((EAttribute) modelElement).getEAttributeType() : null;
		if (eType != null && !EcoreDataTypes.INSTANCE.isSimpleType(eType)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "AllowedElementType", getObjectLabel(id, context) }),
						 new Object[] { id }));
			}
			return false;
		}
		if (eType == EcorePackage.eINSTANCE.getEFloatObject() || eType == EcorePackage.eINSTANCE.getEDoubleObject()
				|| eType == EcorePackage.eINSTANCE.getEFloat() || eType == EcorePackage.eINSTANCE.getEDouble()) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "AllowedElementType", getObjectLabel(id, context) }),
						 new Object[] { id }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdClass(IdClass idClass, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(idClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(idClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(idClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(idClass, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_CompatibleEModelElementType(idClass, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_AnnotationIsSupported(idClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInheritance(Inheritance inheritance, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(inheritance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(inheritance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(inheritance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(inheritance, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_CompatibleEModelElementType(inheritance, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_AnnotationIsSupported(inheritance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJoinColumn(JoinColumn joinColumn, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(joinColumn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(joinColumn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(joinColumn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(joinColumn, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_CompatibleEModelElementType(joinColumn, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_AnnotationIsSupported(joinColumn, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJoinTable(JoinTable joinTable, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(joinTable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(joinTable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(joinTable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(joinTable, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_CompatibleEModelElementType(joinTable, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_AnnotationIsSupported(joinTable, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLob(Lob lob, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(lob, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(lob, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(lob, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(lob, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_CompatibleEModelElementType(lob, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_AnnotationIsSupported(lob, diagnostics, context);
		if (result || diagnostics != null) result &= validateLob_AllowedType(lob, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AllowedType constraint of '<em>Lob</em>'.
	 * <!-- begin-user-doc -->
	 * EJB3-SPEC 9.1.17
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLob_AllowedType(Lob lob, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
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
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "AllowedType", getObjectLabel(lob, context) }),
						 new Object[] { lob }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManyToMany(ManyToMany manyToMany, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(manyToMany, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(manyToMany, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(manyToMany, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(manyToMany, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_CompatibleEModelElementType(manyToMany, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_AnnotationIsSupported(manyToMany, diagnostics, context);
		if (result || diagnostics != null) result &= validateManyToMany_IsManyValued(manyToMany, diagnostics, context);
		return result;
	}

	/**
	 * Validates the IsManyValued constraint of '<em>Many To Many</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateManyToMany_IsManyValued(ManyToMany manyToMany, DiagnosticChain diagnostics, Map context) {
		EModelElement eModelElement = manyToMany.getEModelElement();
		EReference eReference = (eModelElement instanceof EReference) ? (EReference) eModelElement : null;
		// TODO also check that, if specified, the opposite agree
		if (eReference != null && !eReference.isMany()) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "IsManyValued", getObjectLabel(manyToMany, context) }),
						 new Object[] { manyToMany }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManyToOne(ManyToOne manyToOne, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(manyToOne, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(manyToOne, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(manyToOne, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(manyToOne, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_CompatibleEModelElementType(manyToOne, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_AnnotationIsSupported(manyToOne, diagnostics, context);
		if (result || diagnostics != null) result &= validateManyToOne_IsNotManyValued(manyToOne, diagnostics, context);
		return result;
	}

	/**
	 * Validates the IsNotManyValued constraint of '<em>Many To One</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManyToOne_IsNotManyValued(ManyToOne manyToOne, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
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
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "IsNotManyValued", getObjectLabel(manyToOne, context) }),
						 new Object[] { manyToOne }));
			}
			return false;
		}
		return true;
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
		if (result || diagnostics != null) result &= validatePAnnotation_CompatibleEModelElementType(mapKey, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_AnnotationIsSupported(mapKey, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMappedSuperclass(MappedSuperclass mappedSuperclass, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(mappedSuperclass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mappedSuperclass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mappedSuperclass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mappedSuperclass, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_CompatibleEModelElementType(mappedSuperclass, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_AnnotationIsSupported(mappedSuperclass, diagnostics, context);
		if (result || diagnostics != null) result &= validateMappedSuperclass_NoInterface(mappedSuperclass, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NoInterface constraint of '<em>Mapped Superclass</em>'.
	 * <!-- begin-user-doc -->
	 * EJB3-SPEC 2.1 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateMappedSuperclass_NoInterface(MappedSuperclass mappedSuperclass, DiagnosticChain diagnostics, Map context) {
		EModelElement modelElement = mappedSuperclass.getEModelElement();
		EClass targetEClass = (modelElement instanceof EClass) ? (EClass) modelElement : null;
		if (targetEClass != null && targetEClass.isInterface()) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "NoInterface", getObjectLabel(mappedSuperclass, context) }),
						 new Object[] { mappedSuperclass }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOneToMany(OneToMany oneToMany, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(oneToMany, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(oneToMany, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(oneToMany, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(oneToMany, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_CompatibleEModelElementType(oneToMany, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_AnnotationIsSupported(oneToMany, diagnostics, context);
		if (result || diagnostics != null) result &= validateOneToMany_IsManyValued(oneToMany, diagnostics, context);
		return result;
	}

	/**
	 * Validates the IsManyValued constraint of '<em>One To Many</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateOneToMany_IsManyValued(OneToMany oneToMany, DiagnosticChain diagnostics, Map context) {
		EModelElement eModelElement = oneToMany.getEModelElement();
		EStructuralFeature eFeature = (eModelElement instanceof EStructuralFeature) ? (EStructuralFeature) eModelElement : null;
		// TODO also check that, if specified, the opposite agree
		if (eFeature != null && !eFeature.isMany()) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "IsManyValued", getObjectLabel(oneToMany, context) }),
						 new Object[] { oneToMany }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOneToOne(OneToOne oneToOne, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(oneToOne, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(oneToOne, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(oneToOne, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(oneToOne, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_CompatibleEModelElementType(oneToOne, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_AnnotationIsSupported(oneToOne, diagnostics, context);
		if (result || diagnostics != null) result &= validateOneToOne_IsNotManyValued(oneToOne, diagnostics, context);
		return result;
	}

	/**
	 * Validates the IsNotManyValued constraint of '<em>One To One</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateOneToOne_IsNotManyValued(OneToOne oneToOne, DiagnosticChain diagnostics, Map context) {
		EModelElement eModelElement = oneToOne.getEModelElement();
		EReference eReference = (eModelElement instanceof EReference) ? (EReference) eModelElement : null;
		// TODO also check that, if specified, the opposite agree
		if (eReference != null && eReference.isMany()) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "IsNotManyValued", getObjectLabel(oneToOne, context) }),
						 new Object[] { oneToOne }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderBy(OrderBy orderBy, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(orderBy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(orderBy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(orderBy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(orderBy, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_CompatibleEModelElementType(orderBy, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_AnnotationIsSupported(orderBy, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrderBy_WellFormedOrder(orderBy, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrderBy_IsManyValued(orderBy, diagnostics, context);
		return result;
	}

	/**
	 * Validates the WellFormedOrder constraint of '<em>Order By</em>'.
	 * <!-- begin-user-doc -->
	 * EJB3-SPEC 9.1.26
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderBy_WellFormedOrder(OrderBy orderBy, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
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
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "WellFormedOrder", getObjectLabel(orderBy, context) }),
						 new Object[] { orderBy }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the IsManyValued constraint of '<em>Order By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateOrderBy_IsManyValued(OrderBy orderBy, DiagnosticChain diagnostics, Map context) {
		EModelElement eModelElement = orderBy.getEModelElement();
		EStructuralFeature eFeature = (eModelElement instanceof EStructuralFeature) ? (EStructuralFeature) eModelElement : null;
		if (eFeature != null && !eFeature.isMany()) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "IsManyValued", getObjectLabel(orderBy, context) }),
						 new Object[] { orderBy }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimaryKeyJoinColumn(PrimaryKeyJoinColumn primaryKeyJoinColumn, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(primaryKeyJoinColumn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(primaryKeyJoinColumn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(primaryKeyJoinColumn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(primaryKeyJoinColumn, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_CompatibleEModelElementType(primaryKeyJoinColumn, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_AnnotationIsSupported(primaryKeyJoinColumn, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecondaryTable(SecondaryTable secondaryTable, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(secondaryTable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(secondaryTable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(secondaryTable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(secondaryTable, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_CompatibleEModelElementType(secondaryTable, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_AnnotationIsSupported(secondaryTable, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceGenerator(SequenceGenerator sequenceGenerator, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(sequenceGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sequenceGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sequenceGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sequenceGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_CompatibleEModelElementType(sequenceGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_AnnotationIsSupported(sequenceGenerator, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTable(Table table, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(table, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_CompatibleEModelElementType(table, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_AnnotationIsSupported(table, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableGenerator(TableGenerator tableGenerator, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(tableGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tableGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tableGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tableGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_CompatibleEModelElementType(tableGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_AnnotationIsSupported(tableGenerator, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemporal(Temporal temporal, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(temporal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(temporal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(temporal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(temporal, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_CompatibleEModelElementType(temporal, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_AnnotationIsSupported(temporal, diagnostics, context);
		if (result || diagnostics != null) result &= validateTemporal_AllowedElementType(temporal, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AllowedElementType constraint of '<em>Temporal</em>'.
	 * <!-- begin-user-doc -->
	 * EJB3-SPEC 9.1.18
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTemporal_AllowedElementType(Temporal temporal, DiagnosticChain diagnostics, Map context) {
		EDataType eType = null;
		if (temporal.getEModelElement() instanceof EAttribute)
			eType = ((EAttribute) temporal.getEModelElement()).getEAttributeType();
		if (eType != null && eType != EcorePackage.eINSTANCE.getEDate() && eType.getInstanceClass() != java.util.Calendar.class ) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "AllowedElementType", getObjectLabel(temporal, context) }),
						 new Object[] { temporal }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransient(Transient transient_, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(transient_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(transient_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(transient_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(transient_, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_CompatibleEModelElementType(transient_, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_AnnotationIsSupported(transient_, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniqueConstraint(UniqueConstraint uniqueConstraint, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(uniqueConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(uniqueConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(uniqueConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(uniqueConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_CompatibleEModelElementType(uniqueConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_AnnotationIsSupported(uniqueConstraint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersion(Version version, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(version, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(version, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(version, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(version, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_CompatibleEModelElementType(version, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_AnnotationIsSupported(version, diagnostics, context);
		if (result || diagnostics != null) result &= validateVersion_AllowedElementType(version, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AllowedElementType constraint of '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * EJB3-SPEC 9.1.15
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateVersion_AllowedElementType(Version version, DiagnosticChain diagnostics, Map context) {
		EModelElement eModelElement = version.getEModelElement();
		EDataType eDataType = (eModelElement instanceof EAttribute) ? ((EAttribute) eModelElement).getEAttributeType() : null;
		
		if (eDataType != null && !ALLOWED_VERSION_ETYPES.contains(eDataType)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "AllowedElementType", getObjectLabel(version, context) }),
						 new Object[] { version }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCascadeType(CascadeType cascadeType, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscriminatorType(DiscriminatorType discriminatorType, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumType(EnumType enumType, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetchType(FetchType fetchType, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenerationType(GenerationType generationType, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInheritanceType(InheritanceType inheritanceType, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemporalType(TemporalType temporalType, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationOverride(AssociationOverride associationOverride, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(associationOverride, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(associationOverride, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(associationOverride, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(associationOverride, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_CompatibleEModelElementType(associationOverride, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotation_AnnotationIsSupported(associationOverride, diagnostics, context);
		return result;
	}

} //PannotationValidator
