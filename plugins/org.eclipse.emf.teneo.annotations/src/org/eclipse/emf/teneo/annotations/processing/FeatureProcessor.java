/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 *   Davide Marchignoli
 * </copyright>
 *
 * $Id: FeatureProcessor.java,v 1.3 2006/08/24 22:12:35 mtaal Exp $
 */

package org.eclipse.emf.teneo.annotations.processing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEModelElement;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage;
import org.eclipse.emf.teneo.annotations.pannotation.PAnnotation;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage;

/**
 * Dispatch events to the appropriate processor.
 * 
 * Reworked this from a previous implementation because: - The switch was only partially used, the superclass switch
 * also switches on eclass while this was not used - The actual switch was on the features of the PAnnotation model not
 * of the PAModel features. Use of the switch does not seem to add value and makes the structure much more complex to
 * follow. - The case methods were expected to return something while in reality they did not do that at all - using the
 * superclass ment that in the end a more anonymous doswitch method was used, although this gives a 'generic feeling' it
 * also means hiding details and casting from and to different types. In the end I felt that a more specific
 * implementation is easier to understand and less complex although less generic. - In a way the feature processor also
 * models a context because it contains context-type information such as the level (nestedBegin) and the idstrategy. I
 * prefer to move this context outside of the featureprocessor itself - The feature processor was also handling begin
 * and end of processing an eclass, this is moved to another layer
 * 
 * Overall the implementation was more complex than required at the moment resulting in less understandable code (for
 * me).
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
public class FeatureProcessor {

	/** The logger */
	private static final Log log = LogFactory.getLog(FeatureProcessor.class);

	/** Switch features for the annotated eattribute */
	private static final EStructuralFeature[] PAEATTRIBUTE_DISCR_FEATURES = new EStructuralFeature[] {
			PamodelPackage.eINSTANCE.getPAnnotatedEModelElement_Transient(),
			PamodelPackage.eINSTANCE.getPAnnotatedEAttribute_Basic(),
			PamodelPackage.eINSTANCE.getPAnnotatedEAttribute_Id(),
			PamodelPackage.eINSTANCE.getPAnnotatedEStructuralFeature_OneToMany(),
			PamodelPackage.eINSTANCE.getPAnnotatedEAttribute_Version() };

	/** Switch features for the annotated ereference */
	private static final EStructuralFeature[] PAEREFERENCE_DISCR_FEATURES = new EStructuralFeature[] {
			PamodelPackage.eINSTANCE.getPAnnotatedEModelElement_Transient(),
			PamodelPackage.eINSTANCE.getPAnnotatedEStructuralFeature_OneToMany(),
			PamodelPackage.eINSTANCE.getPAnnotatedEReference_Embedded(),
			PamodelPackage.eINSTANCE.getPAnnotatedEReference_EmbeddedId(),
			PamodelPackage.eINSTANCE.getPAnnotatedEReference_ManyToMany(),
			PamodelPackage.eINSTANCE.getPAnnotatedEReference_ManyToOne(),
			PamodelPackage.eINSTANCE.getPAnnotatedEReference_OneToOne() };

	/** processor used by default for unclassifiables */
	private static final PAnnotatedProcessor DEFAULT_FAILURE_PROCESSOR = new PAnnotatedProcessor() {
		public void processIllFormed(PAnnotatedEModelElement paElement, String cause, PAnnotation offendingAnnotation) {
			log.error("Error processing Unclassifiable element " + paElement);
			throw new ProcessingException("Error processing Unclassifiable element", paElement);
		}
	};

	/** return the opposite of an association */
	private PAnnotatedEReference getOtherSide(PAnnotatedEReference paReference) {
		// TODO assuming that mappedBy coincide with opposite, check in validation
		return paReference.getPaModel().getPAnnotated(paReference.getAnnotatedEReference().getEOpposite());
	}

	/** Different processors used in the switches below, each processor handles a specific annotation case */
	private BasicProcessor basicProcessor = null;

	private EmbeddedProcessor embeddedProcessor = null;

	private IdProcessor idProcessor = null;

	private ManyToManyProcessor manyToManyProcessor = null;

	private ManyToOneProcessor manyToOneProcessor = null;

	private ManyAttributeProcessor manyAttributeProcessor = null;

	private OneToManyProcessor oneToManyProcessor = null;

	private OneToOneProcessor oneToOneProcessor = null;

	private TransientProcessor transientProcessor = null;

	private VersionProcessor versionProcessor = null;

	private PAnnotatedProcessor failureProcessor = DEFAULT_FAILURE_PROCESSOR;

	/**
	 * Used to signal the beggining of a class or mapped superclass. public void begin(PAnnotatedEClass paEClass) { if
	 * (nestedBegin == 0) { idStrategy = paEClass.getPaSuperEntity() == null ? ID_ROOT_STRATEGY : ID_INNER_STRATEGY; }
	 * nestedBegin++; idStrategy.begin(paEClass); }
	 */

	/**
	 * Used to process the given feature.
	 * 
	 * @see org.eclipse.emf.teneo.annotations.builder.DelegatingBuilder#process(org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature)
	 */
	public void process(PAnnotatedEStructuralFeature paFeature) {
		if (paFeature instanceof PAnnotatedEAttribute) {
			processPAnnotatedEAttribute((PAnnotatedEAttribute) paFeature);
		} else {
			processPAnnotatedEReference((PAnnotatedEReference) paFeature);
		}
	}

	/**
	 * Used to signal the end of a class or mapped superclass. public void end() { if (nestedBegin <= 0) throw new
	 * IllegalStateException("Unexpected end"); nestedBegin--; if (idStrategy != null) idStrategy.end(); // can happen
	 * in case of featuremap if (nestedBegin == 0) idStrategy = null; }
	 */

	/** Find the feature to switch on */
	public static final EStructuralFeature getSwitchFeature(EObject eObject, EStructuralFeature[] features) {
		for (int i = 0; i < features.length; i++) {
			if (eObject.eIsSet(features[i]))
				return features[i];
		}
		return null;
	}

	/** Process the eattribute */
	private void processPAnnotatedEAttribute(PAnnotatedEAttribute pAnnotatedEAttribute) {
		final EStructuralFeature discrFeature;
		if (pAnnotatedEAttribute.getAnnotations().isEmpty()) {
			discrFeature = PamodelPackage.eINSTANCE.getPAnnotatedEAttribute_Basic();
		} else {
			discrFeature = getSwitchFeature(pAnnotatedEAttribute, PAEATTRIBUTE_DISCR_FEATURES);
		}
		if (discrFeature == null) {
			caseUnclassifiable(pAnnotatedEAttribute);
		} else {
			switch (discrFeature.getFeatureID()) {
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__TRANSIENT:
				caseTransient(pAnnotatedEAttribute);
				break;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__BASIC:
				caseBasic(pAnnotatedEAttribute);
				// if (result == null) result = caseProperty(pAnnotatedEAttribute);
				break;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__ID:
				caseId(pAnnotatedEAttribute);
				break;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__ONE_TO_MANY:
				caseOneToMany(pAnnotatedEAttribute);
				break;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__VERSION:
				caseVersion(pAnnotatedEAttribute);
				break;
			default:
				throw new AssertionError("unexpected case");
			}
		}
	}

	/** Process the ereference */
	private void processPAnnotatedEReference(PAnnotatedEReference pAnnotatedEReference) {
		final EStructuralFeature discrFeature;
		if (pAnnotatedEReference.getAnnotations().isEmpty()) {
			discrFeature = PamodelPackage.eINSTANCE.getPAnnotatedEReference_Embedded();
		} else {
			discrFeature = getSwitchFeature(pAnnotatedEReference, PAEREFERENCE_DISCR_FEATURES);
		}
		if (discrFeature == null) {
			caseUnclassifiable(pAnnotatedEReference);
		} else {
			switch (discrFeature.getFeatureID()) {
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__TRANSIENT:
				caseTransient(pAnnotatedEReference);
				break;
			case PamodelPackage.PANNOTATED_EREFERENCE__EMBEDDED:
				caseEmbedded(pAnnotatedEReference);
				break;
			case PamodelPackage.PANNOTATED_EREFERENCE__EMBEDDED_ID:
				caseId(pAnnotatedEReference);
				break;
			case PamodelPackage.PANNOTATED_EREFERENCE__MANY_TO_MANY:
				caseManyToMany(pAnnotatedEReference);
				break;
			case PamodelPackage.PANNOTATED_EREFERENCE__MANY_TO_ONE:
				caseManyToOne(pAnnotatedEReference);
				break;
			case PamodelPackage.PANNOTATED_EREFERENCE__ONE_TO_MANY:
				caseOneToMany(pAnnotatedEReference);
				break;
			case PamodelPackage.PANNOTATED_EREFERENCE__ONE_TO_ONE:
				caseOneToOne(pAnnotatedEReference);
				break;
			default:
				throw new AssertionError("unexpected case");
			}
		}
	}

	/** Handle basic annotation, is basic, enumerated, temporal */
	public Object caseBasic(PAnnotatedEAttribute paAttribute) {
		if (paAttribute.getEnumerated() != null)
			basicProcessor.processEnum(paAttribute);
		else if (paAttribute.getLob() != null)
			basicProcessor.processLob(paAttribute);
		else if (paAttribute.getTemporal() != null)
			basicProcessor.processTemporal(paAttribute);
		else
			basicProcessor.processBasic(paAttribute);
		return Boolean.TRUE;
	}

	/** Handle version */
	public void caseVersion(PAnnotatedEAttribute paAttribute) {
		versionProcessor.processVersion(paAttribute);
	}

	public void caseOneToMany(PAnnotatedEAttribute paAttribute) {
		manyAttributeProcessor.processManyAttribute(paAttribute);
	}

	public void caseEmbedded(PAnnotatedEReference paReference) {
		embeddedProcessor.processEmbedded(paReference);
	}

	public void caseId(PAnnotatedEReference annotatedEReference) {
		idProcessor.processEmbeddedId(annotatedEReference);
	}

	public void caseId(PAnnotatedEAttribute paAttribute) {
		idProcessor.processIdProperty(paAttribute);
	}

	public void caseManyToMany(PAnnotatedEReference paReference) {
		if (getOtherSide(paReference) == null) {
			manyToManyProcessor.processMtMUni(paReference);
		} else if (!paReference.getManyToMany().eIsSet(PannotationPackage.eINSTANCE.getManyToMany_MappedBy())) {
			manyToManyProcessor.processMtMBidiInverse(paReference);
		} else {
			manyToManyProcessor.processMtMBidiOwner(paReference);
		}
	}

	public void caseManyToOne(PAnnotatedEReference paReference) {
		if (getOtherSide(paReference) == null) {
			manyToOneProcessor.processMtOUni(paReference);
		} else {
			manyToOneProcessor.processMtOBidiOwner(paReference);
		}
	}

	public void caseOneToMany(PAnnotatedEReference paReference) {
		// TODO assuming it coincides with specified targetEntity, correct? Guaranteed by validation?
		if (getOtherSide(paReference) == null) {
			oneToManyProcessor.processOtMUni(paReference);
		} else if (!paReference.getOneToMany().eIsSet(PannotationPackage.eINSTANCE.getOneToMany_MappedBy())) {
			failureProcessor.processIllFormed(paReference,
					"The many side of a bidirectional one to many association must be the owning side", paReference
							.getOneToMany());
		} else {
			// MT: TODO add check, in this case unique should always true because an child can only occur once within
			// the collection because
			// of the bidirectional behavior.
			oneToManyProcessor.processOtMBidiInverse(paReference);
		}
	}

	public void caseOneToOne(PAnnotatedEReference paReference) {
		// TODO assuming it coincides with specified targetEntity, correct? Guaranteed by validation?
		if (getOtherSide(paReference) == null) {
			oneToOneProcessor.processOtOUni(paReference);
		} else if (paReference.getOneToOne().eIsSet(PannotationPackage.eINSTANCE.getOneToOne_MappedBy())) {
			// TODO validation should check not both are set
			oneToOneProcessor.processOtOBidiOwner(paReference);
		} else {
			oneToOneProcessor.processOtOBidilInverse(paReference);
		}
	}

	public void caseTransient(PAnnotatedEStructuralFeature paFeature) {
		transientProcessor.processTransient(paFeature);
	}

	public void caseUnclassifiable(PAnnotatedEStructuralFeature paFeature) {
		// MT: features which belong to a featuremap are transient but should still be mapped
		// as part of the mapping of the featuremap, The default annotator will automatically
		// annotate these featuremap features also while they also have a transient feature
		// in summary: these features should just be ignored and no error should be thrown
		// the validatidStrategyion should be done separately and this should take this case into account
		failureProcessor.processIllFormed(paFeature, "Unclassifiable feature", null);
	}

	public Object defaultCase(EObject object) {
		throw new IllegalArgumentException("Unexpected argument " + object);
	}

	public void setBasicProcessor(BasicProcessor basicProcessor) {
		this.basicProcessor = basicProcessor;
	}

	public void setEmbeddedProcessor(EmbeddedProcessor embeddedProcessor) {
		this.embeddedProcessor = embeddedProcessor;
	}

	public void setIdProcessor(IdProcessor idProcessor) {
		this.idProcessor = idProcessor;
	}

	public void setManyToManyProcessor(ManyToManyProcessor manyToManyProcessor) {
		this.manyToManyProcessor = manyToManyProcessor;
	}

	public void setManyToOneProcessor(ManyToOneProcessor manyToOneProcessor) {
		this.manyToOneProcessor = manyToOneProcessor;
	}

	public void setManyAttributeProcessor(ManyAttributeProcessor manyAttributeProcessor) {
		this.manyAttributeProcessor = manyAttributeProcessor;
	}

	public void setOneToManyProcessor(OneToManyProcessor oneToManyProcessor) {
		this.oneToManyProcessor = oneToManyProcessor;
	}

	public void setOneToOneProcessor(OneToOneProcessor oneToOneProcessor) {
		this.oneToOneProcessor = oneToOneProcessor;
	}

	public void setTransientProcessor(TransientProcessor transientProcessor) {
		this.transientProcessor = transientProcessor;
	}

	public void setVersionProcessor(VersionProcessor versionProcessor) {
		this.versionProcessor = versionProcessor;
	}

	public void setUnclassifiableProcessor(PAnnotatedProcessor failureProcessor) {
		this.failureProcessor = failureProcessor;
	}
}