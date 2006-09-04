/**
 * <copyright>
 * </copyright>
 *
 * $Id: PamodelValidator.java,v 1.7 2006/09/04 15:42:11 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pamodel.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEModelElement;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;
import org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage;
import org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorColumn;
import org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorValue;
import org.eclipse.emf.teneo.annotations.pannotation.InheritanceType;
import org.eclipse.emf.teneo.annotations.pannotation.PAnnotation;
import org.eclipse.emf.teneo.annotations.pannotation.Transient;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage
 * @generated
 */
public class PamodelValidator extends EObjectValidator {
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
	public static final PamodelValidator INSTANCE = new PamodelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.emf.teneo.annotations.pamodel";

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
	public PamodelValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPackage getEPackage() {
	  return PamodelPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresonding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map context) {
		switch (classifierID) {
			case PamodelPackage.PANNOTATED_EMODEL_ELEMENT:
				return validatePAnnotatedEModelElement((PAnnotatedEModelElement)value, diagnostics, context);
			case PamodelPackage.PANNOTATED_MODEL:
				return validatePAnnotatedModel((PAnnotatedModel)value, diagnostics, context);
			case PamodelPackage.PANNOTATED_EPACKAGE:
				return validatePAnnotatedEPackage((PAnnotatedEPackage)value, diagnostics, context);
			case PamodelPackage.PANNOTATED_ECLASS:
				return validatePAnnotatedEClass((PAnnotatedEClass)value, diagnostics, context);
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE:
				return validatePAnnotatedEStructuralFeature((PAnnotatedEStructuralFeature)value, diagnostics, context);
			case PamodelPackage.PANNOTATED_EATTRIBUTE:
				return validatePAnnotatedEAttribute((PAnnotatedEAttribute)value, diagnostics, context);
			case PamodelPackage.PANNOTATED_EREFERENCE:
				return validatePAnnotatedEReference((PAnnotatedEReference)value, diagnostics, context);
			default: 
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePAnnotatedEModelElement(PAnnotatedEModelElement pAnnotatedEModelElement, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(pAnnotatedEModelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pAnnotatedEModelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pAnnotatedEModelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pAnnotatedEModelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotatedEModelElement_PAnnotationElementCommutes(pAnnotatedEModelElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PAnnotationElementCommutes constraint of '<em>PAnnotated EModel Element</em>'.
	 * <!-- begin-user-doc -->
	 * Check that each contained PAnnotation references the same eModelElement
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePAnnotatedEModelElement_PAnnotationElementCommutes(PAnnotatedEModelElement pAnnotatedEModelElement, DiagnosticChain diagnostics, Map context) {
		ENamedElement target = pAnnotatedEModelElement.getAnnotatedElement();
		if (target == null)
			return true;
		PAnnotation pAnnotation = null;
		Iterator i = pAnnotatedEModelElement.getAnnotations().iterator();
		while (pAnnotation == null && i.hasNext()) {
			PAnnotation next = (PAnnotation) i.next();
			if (next.getEModelElement() != target) 
				pAnnotation = (PAnnotation) next;
		}
		if (pAnnotation != null) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "PAnnotationElementCommutes", getObjectLabel(pAnnotatedEModelElement, context) }),
						 new Object[] { pAnnotatedEModelElement }));
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
	public boolean validatePAnnotatedModel(PAnnotatedModel pAnnotatedModel, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(pAnnotatedModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pAnnotatedModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pAnnotatedModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pAnnotatedModel, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotatedModel_AtMostOnePackage(pAnnotatedModel, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotatedModel_DistinctGenerators(pAnnotatedModel, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AtMostOnePackage constraint of '<em>PAnnotated Model</em>'.
	 * Verifies that the model does not contain distinct PAnnotatedEPackage refering
	 * to the same EPackage.
	 * @generated NOT
	 */
	public boolean validatePAnnotatedModel_AtMostOnePackage(PAnnotatedModel pAnnotatedModel, DiagnosticChain diagnostics, Map context) {
		EPackage dupPackage = null;
		Set containedEPackages = new HashSet();
		for (Iterator i = pAnnotatedModel.getPaEPackages().iterator(); i.hasNext() && dupPackage == null; ) {
			EPackage ep = ((PAnnotatedEPackage) i.next()).getAnnotatedEPackage();
			if (ep != null && !containedEPackages.add(ep))
				dupPackage = ep;
		}
		if (dupPackage != null) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "AtMostOnePackage", getObjectLabel(pAnnotatedModel, context) }),
						 new Object[] { pAnnotatedModel }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the DistinctGenerators constraint of '<em>PAnnotated Model</em>'.
	 * <!-- begin-user-doc -->
	 * Check that each in each scope no distinct TableGenerator or SequenceGenerator use
	 * the same name.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePAnnotatedModel_DistinctGenerators(PAnnotatedModel pAnnotatedModel, DiagnosticChain diagnostics, Map context) {
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
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "DistinctGenerators", getObjectLabel(pAnnotatedModel, context) }),
						 new Object[] { pAnnotatedModel }));
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
	public boolean validatePAnnotatedEPackage(PAnnotatedEPackage pAnnotatedEPackage, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(pAnnotatedEPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pAnnotatedEPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pAnnotatedEPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pAnnotatedEPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotatedEModelElement_PAnnotationElementCommutes(pAnnotatedEPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotatedEPackage_AtMostOneEClass(pAnnotatedEPackage, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AtMostOneEClass constraint of '<em>PAnnotated EPackage</em>'.
	 * Verifies that the package does not contain distinct PAnnotatedEClass refering
	 * to the same EClass.
	 * @generated NOT
	 */
	public boolean validatePAnnotatedEPackage_AtMostOneEClass(PAnnotatedEPackage pAnnotatedEPackage, DiagnosticChain diagnostics, Map context) {
		EClass dupClass = null;
		Set containedEClasses = new HashSet();
		for (Iterator i = pAnnotatedEPackage.getPaEClasses().iterator(); i.hasNext() && dupClass == null; ) {
			EClass x = ((PAnnotatedEClass) i.next()).getAnnotatedEClass();
			if (x != null && !containedEClasses.add(x))
				dupClass = x;
		}
		if (dupClass != null) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "AtMostOneEClass", getObjectLabel(pAnnotatedEPackage, context) }),
						 new Object[] { pAnnotatedEPackage }));
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
	public boolean validatePAnnotatedEClass(PAnnotatedEClass pAnnotatedEClass, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(pAnnotatedEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pAnnotatedEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pAnnotatedEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pAnnotatedEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotatedEModelElement_PAnnotationElementCommutes(pAnnotatedEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotatedEClass_SameEFeatures(pAnnotatedEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotatedEClass_EPackageCommutes(pAnnotatedEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotatedEClass_ProperPrimaryKey(pAnnotatedEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotatedEClass_EntityOrEmbeddableOrMappedSuper(pAnnotatedEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotatedEClass_OverriddenAreDefined(pAnnotatedEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotatedEClass_ProperInheritance(pAnnotatedEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotatedEClass_ProperDiscriminator(pAnnotatedEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotatedEClass_SingleTableForSingleStrategy(pAnnotatedEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotatedEClass_ProperPKJoin(pAnnotatedEClass, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SameEFeatures constraint of '<em>PAnnotated EClass</em>'.
	 * <!-- begin-user-doc -->
	 * Check that each of the annotated EClass features are annotated exactly once.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePAnnotatedEClass_SameEFeatures(PAnnotatedEClass pAnnotatedEClass, DiagnosticChain diagnostics, Map context) {
		EClass annotatedEClass = pAnnotatedEClass.getAnnotatedEClass();
		if (annotatedEClass == null)
			return true;
		EStructuralFeature dupFeature = null;
		Set containedEFeatures = new HashSet();
		for (Iterator i = pAnnotatedEClass.getPaEStructuralFeatures().iterator(); i.hasNext() && dupFeature == null; ) {
			EStructuralFeature x = ((PAnnotatedEStructuralFeature) i.next()).getAnnotatedEStructuralFeature();
			if (x != null && !containedEFeatures.add(x))
				dupFeature = x;
		}
		if (pAnnotatedEClass.getPaEStructuralFeatures().size() !=
					annotatedEClass.getEStructuralFeatures().size() || dupFeature != null) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "SameEFeatures", getObjectLabel(pAnnotatedEClass, context) }),
						 new Object[] { pAnnotatedEClass }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the EPackageCommutes constraint of '<em>PAnnotated EClass</em>'.
	 * Verifies that the containing (if specified) PAnnotatedEPackage corresponds
	 * to the containing EPackage of the referenced EClass (if specified).
	 * @generated NOT
	 */
	public boolean validatePAnnotatedEClass_EPackageCommutes(PAnnotatedEClass pAnnotatedEClass, DiagnosticChain diagnostics, Map context) {
		PAnnotatedEPackage ru = pAnnotatedEClass.getPaEPackage();
		EPackage rd = ru != null ? ru.getAnnotatedEPackage() : null;
		EClass dl = pAnnotatedEClass.eClass();
		EPackage dr = dl != null ? dl.getEPackage() : null;
		if (rd != dr) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "EPackageCommutes", getObjectLabel(pAnnotatedEClass, context) }),
						 new Object[] { pAnnotatedEClass }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ProperPrimaryKey constraint of '<em>PAnnotated EClass</em>'.
	 * <!-- begin-user-doc -->
	 * EJB3-SPEC 2.1.4
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePAnnotatedEClass_ProperPrimaryKey(PAnnotatedEClass pAnnotatedEClass, DiagnosticChain diagnostics, Map context) {
		if (pAnnotatedEClass.getIdClass() != null) {
			; // TODO check 9.1.13
		}
		if (pAnnotatedEClass.getMappedSuperclass() != null)
			return true;
		if (!pAnnotatedEClass.hasIdAnnotatedFeature())
			return true; // TODO forcing specification here, we allow not specifying primary key
		if (pAnnotatedEClass.getEmbeddable() != null) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "ProperPrimaryKey", getObjectLabel(pAnnotatedEClass, context) }),
						 new Object[] { pAnnotatedEClass }));
			}
			return false;
		}
		// it is an entity with id, check it does not have a mapped superclass that has id
		PAnnotatedEClass paMappedSuper = pAnnotatedEClass.getPaMappedSuper();
		if (paMappedSuper != null && paMappedSuper.hasIdAnnotatedFeature()) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "ProperPrimaryKey", getObjectLabel(pAnnotatedEClass, context) }),
						 new Object[] { pAnnotatedEClass }));
			}
			return false;
		}
		// check that it is a root entity
		if (paMappedSuper.getPaSuperEntity() != null) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "ProperPrimaryKey", getObjectLabel(pAnnotatedEClass, context) }),
						 new Object[] { pAnnotatedEClass }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the EntityOrEmbeddableOrMappedSuper constraint of '<em>PAnnotated EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePAnnotatedEClass_EntityOrEmbeddableOrMappedSuper(PAnnotatedEClass pAnnotatedEClass, DiagnosticChain diagnostics, Map context) {
		int roles = (pAnnotatedEClass.getEntity() == null ? 0 : 1)
				+ (pAnnotatedEClass.getMappedSuperclass() == null ? 0 : 1)
					+ (pAnnotatedEClass.getEmbeddable() == null ? 0 : 1);
		if (roles > 1) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "EntityOrEmbeddableOrMappedSuper", getObjectLabel(pAnnotatedEClass, context) }),
						 new Object[] { pAnnotatedEClass }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the OverriddenAreDefined constraint of '<em>PAnnotated EClass</em>'.
	 * <!-- begin-user-doc -->
	 * EJB3-SPEC 9.1.10
	 * <p>Check that each overridden property is defined in a mapped superclass.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePAnnotatedEClass_OverriddenAreDefined(PAnnotatedEClass pAnnotatedEClass, DiagnosticChain diagnostics, Map context) {
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
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "OverriddenAreDefined", getObjectLabel(pAnnotatedEClass, context) }),
						 new Object[] { pAnnotatedEClass }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ProperInheritance constraint of '<em>PAnnotated EClass</em>'.
	 * <!-- begin-user-doc -->
	 * EJB3-SPEC 9.1.27
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePAnnotatedEClass_ProperInheritance(PAnnotatedEClass pAnnotatedEClass, DiagnosticChain diagnostics, Map context) {
		if (pAnnotatedEClass.getInheritance() != null && pAnnotatedEClass.getEntity() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "ProperInheritance", getObjectLabel(pAnnotatedEClass, context) }),
						 new Object[] { pAnnotatedEClass }));
			}
			return false;
		}
		// TODO issue a warning if strategy is redefined with same value
		return true;
	}

	/**
	 * Validates the ProperDiscriminator constraint of '<em>PAnnotated EClass</em>'.
	 * <!-- begin-user-doc -->
	 * EJB3-SPEC 9.1.28
	 * EJB3-SPEC 9.1.29
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePAnnotatedEClass_ProperDiscriminator(PAnnotatedEClass pAnnotatedEClass, DiagnosticChain diagnostics, Map context) {
		DiscriminatorColumn dCol = pAnnotatedEClass.getDiscriminatorColumn();
		DiscriminatorValue dValue = pAnnotatedEClass.getDiscriminatorValue();
		if (dCol == null && dValue == null)
			return true;
		if (pAnnotatedEClass.getEntity() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "ProperDiscriminator", getObjectLabel(pAnnotatedEClass, context) }),
						 new Object[] { pAnnotatedEClass }));
			}
			return false;
		}
		if (dValue != null && pAnnotatedEClass.getAnnotatedEClass() != null && pAnnotatedEClass.getAnnotatedEClass().isAbstract()) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "ProperDiscriminator", getObjectLabel(pAnnotatedEClass, context) }),
						 new Object[] { pAnnotatedEClass }));
			}
			return false;
		}
		InheritanceType inheritanceStrategy = pAnnotatedEClass.getInheritanceStrategy();
		if (InheritanceType.TABLE_PER_CLASS_LITERAL.equals(inheritanceStrategy)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "ProperDiscriminator", getObjectLabel(pAnnotatedEClass, context) }),
						 new Object[] { pAnnotatedEClass }));
			}
			return false;
		}
		PAnnotatedEClass paSuper = pAnnotatedEClass.getPaSuperEntity();
		if (dCol != null && paSuper != null && inheritanceStrategy.equals(paSuper.getInheritanceStrategy())) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "ProperDiscriminator", getObjectLabel(pAnnotatedEClass, context) }),
						 new Object[] { pAnnotatedEClass }));
			}
			return false;
		}
		// TODO check discriminator value agree with discriminator coulmn type
		return true;
	}

	/**
	 * Validates the SingleTableForSingleStrategy constraint of '<em>PAnnotated EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePAnnotatedEClass_SingleTableForSingleStrategy(PAnnotatedEClass pAnnotatedEClass, DiagnosticChain diagnostics, Map context) {
		if (pAnnotatedEClass.getTable() == null)
			return true;
		if (pAnnotatedEClass.getEntity() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "SingleTableForSingleStrategy", getObjectLabel(pAnnotatedEClass, context) }),
						 new Object[] { pAnnotatedEClass }));
			}
			return false;
		}
		if (InheritanceType.SINGLE_TABLE_LITERAL.equals(pAnnotatedEClass.getInheritanceStrategy())
				&& pAnnotatedEClass.getPaSuperEntity() != null) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "SingleTableForSingleStrategy", getObjectLabel(pAnnotatedEClass, context) }),
						 new Object[] { pAnnotatedEClass }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ProperPKJoin constraint of '<em>PAnnotated EClass</em>'.
	 * <!-- begin-user-doc -->
	 * EJB3-SPEC 9.1.30
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePAnnotatedEClass_ProperPKJoin(PAnnotatedEClass pAnnotatedEClass, DiagnosticChain diagnostics, Map context) {
		if (pAnnotatedEClass.getPrimaryKeyJoinColumns() == null || pAnnotatedEClass.getPrimaryKeyJoinColumns().size() == 0)
			return true;
		if (pAnnotatedEClass.getEntity() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "ProperPKJoin", getObjectLabel(pAnnotatedEClass, context) }),
						 new Object[] { pAnnotatedEClass }));
			}
			return false;
		}
		// TODO check usage with secondary table
		if (!InheritanceType.JOINED_LITERAL.equals(pAnnotatedEClass.getInheritanceStrategy())) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "ProperPKJoin", getObjectLabel(pAnnotatedEClass, context) }),
						 new Object[] { pAnnotatedEClass }));
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
	public boolean validatePAnnotatedEStructuralFeature(PAnnotatedEStructuralFeature pAnnotatedEStructuralFeature, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(pAnnotatedEStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pAnnotatedEStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pAnnotatedEStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pAnnotatedEStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotatedEModelElement_PAnnotationElementCommutes(pAnnotatedEStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotatedEStructuralFeature_EClassCommutes(pAnnotatedEStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotatedEStructuralFeature_TransientNotAnnotated(pAnnotatedEStructuralFeature, diagnostics, context);
		return result;
	}

	/**
	 * Validates the EClassCommutes constraint of '<em>PAnnotated EStructural Feature</em>'.
	 * Verifies that the containing (if specified) PAnnotatedEClass corresponds
	 * to the containing EClass of the referenced EStructuralFeature (if specified).
	 * @generated NOT
	 */
	public boolean validatePAnnotatedEStructuralFeature_EClassCommutes(PAnnotatedEStructuralFeature pAnnotatedEStructuralFeature, DiagnosticChain diagnostics, Map context) {
		PAnnotatedEClass ru = pAnnotatedEStructuralFeature.getPaEClass();
		EClass rd = ru != null ? ru.getAnnotatedEClass() : null;
		EStructuralFeature dl = pAnnotatedEStructuralFeature.getAnnotatedEStructuralFeature();
		EClass dr = dl != null ? dl.getEContainingClass() : null;
		if (dr != rd) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "EClassCommutes", getObjectLabel(pAnnotatedEStructuralFeature, context) }),
						 new Object[] { pAnnotatedEStructuralFeature }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the TransientNotAnnotated constraint of '<em>PAnnotated EStructural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * EJB3-SPEC 2.1.1
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePAnnotatedEStructuralFeature_TransientNotAnnotated(PAnnotatedEStructuralFeature pAnnotatedEStructuralFeature, DiagnosticChain diagnostics, Map context) {
		// issue a warning for eCore Transient non @Transient?
		Transient transientAnnotation = pAnnotatedEStructuralFeature.getTransient();
		if (pAnnotatedEStructuralFeature.getAnnotatedEStructuralFeature() != null
				&& pAnnotatedEStructuralFeature.getAnnotatedEStructuralFeature().isTransient() 
					&& transientAnnotation == null) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "TransientNotAnnotated", getObjectLabel(pAnnotatedEStructuralFeature, context) }),
						 new Object[] { pAnnotatedEStructuralFeature }));
			}
			return false;
		}
		if (transientAnnotation == null)
			return true;
		if (pAnnotatedEStructuralFeature.getAnnotations().size() > 1 ) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "TransientNotAnnotated", getObjectLabel(pAnnotatedEStructuralFeature, context) }),
						 new Object[] { pAnnotatedEStructuralFeature }));
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
	public boolean validatePAnnotatedEAttribute(PAnnotatedEAttribute pAnnotatedEAttribute, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(pAnnotatedEAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pAnnotatedEAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pAnnotatedEAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pAnnotatedEAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotatedEModelElement_PAnnotationElementCommutes(pAnnotatedEAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotatedEStructuralFeature_EClassCommutes(pAnnotatedEAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotatedEStructuralFeature_TransientNotAnnotated(pAnnotatedEAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotatedEAttribute_NotAnnotatedAsBasic(pAnnotatedEAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotatedEAttribute_GeneratedOnId(pAnnotatedEAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotatedEAttribute_DefinedGenerator(pAnnotatedEAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotatedEAttribute_IdOnEntityOrMappedSuper(pAnnotatedEAttribute, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NotAnnotatedAsBasic constraint of '<em>PAnnotated EAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePAnnotatedEAttribute_NotAnnotatedAsBasic(PAnnotatedEAttribute pAnnotatedEAttribute, DiagnosticChain diagnostics, Map context) {
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
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "NotAnnotatedAsBasic", getObjectLabel(pAnnotatedEAttribute, context) }),
						 new Object[] { pAnnotatedEAttribute }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the GeneratedOnId constraint of '<em>PAnnotated EAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * EJB3-SPEC 9.1.9
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePAnnotatedEAttribute_GeneratedOnId(PAnnotatedEAttribute pAnnotatedEAttribute, DiagnosticChain diagnostics, Map context) {
		if (pAnnotatedEAttribute.getGeneratedValue() != null && pAnnotatedEAttribute.getId() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "GeneratedOnId", getObjectLabel(pAnnotatedEAttribute, context) }),
						 new Object[] { pAnnotatedEAttribute }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the DefinedGenerator constraint of '<em>PAnnotated EAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePAnnotatedEAttribute_DefinedGenerator(PAnnotatedEAttribute pAnnotatedEAttribute, DiagnosticChain diagnostics, Map context) {
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
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "DefinedGenerator", getObjectLabel(pAnnotatedEAttribute, context) }),
						 new Object[] { pAnnotatedEAttribute }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the IdOnEntityOrMappedSuper constraint of '<em>PAnnotated EAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePAnnotatedEAttribute_IdOnEntityOrMappedSuper(PAnnotatedEAttribute pAnnotatedEAttribute, DiagnosticChain diagnostics, Map context) {
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
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "IdOnEntityOrMappedSuper", getObjectLabel(pAnnotatedEAttribute, context) }),
						 new Object[] { pAnnotatedEAttribute }));
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
	public boolean validatePAnnotatedEReference(PAnnotatedEReference pAnnotatedEReference, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(pAnnotatedEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pAnnotatedEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pAnnotatedEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pAnnotatedEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotatedEModelElement_PAnnotationElementCommutes(pAnnotatedEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotatedEStructuralFeature_EClassCommutes(pAnnotatedEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotatedEStructuralFeature_TransientNotAnnotated(pAnnotatedEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotatedEReference_NotAnnotatedAsEmbed(pAnnotatedEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotatedEReference_AssociationAgreeWithReference(pAnnotatedEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validatePAnnotatedEReference_AssociationWellFormed(pAnnotatedEReference, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NotAnnotatedAsEmbed constraint of '<em>PAnnotated EReference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePAnnotatedEReference_NotAnnotatedAsEmbed(PAnnotatedEReference pAnnotatedEReference, DiagnosticChain diagnostics, Map context) {
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
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "NotAnnotatedAsEmbed", getObjectLabel(pAnnotatedEReference, context) }),
						 new Object[] { pAnnotatedEReference }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the AssociationAgreeWithReference constraint of '<em>PAnnotated EReference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePAnnotatedEReference_AssociationAgreeWithReference(PAnnotatedEReference pAnnotatedEReference, DiagnosticChain diagnostics, Map context) {
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
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "AssociationAgreeWithReference", getObjectLabel(pAnnotatedEReference, context) }),
						 new Object[] { pAnnotatedEReference }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the AssociationWellFormed constraint of '<em>PAnnotated EReference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePAnnotatedEReference_AssociationWellFormed(PAnnotatedEReference pAnnotatedEReference, DiagnosticChain diagnostics, Map context) {
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
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "AssociationWellFormed", getObjectLabel(pAnnotatedEReference, context) }),
						 new Object[] { pAnnotatedEReference }));
			}
			return false;
		}
		return true;
	}

} //PamodelValidator
