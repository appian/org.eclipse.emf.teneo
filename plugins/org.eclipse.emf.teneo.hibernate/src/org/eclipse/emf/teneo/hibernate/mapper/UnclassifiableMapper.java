package org.eclipse.emf.teneo.hibernate.mapper;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEModelElement;
import org.eclipse.emf.teneo.annotations.pannotation.PAnnotation;
import org.eclipse.emf.teneo.annotations.processing.FeatureProcessor;
import org.eclipse.emf.teneo.annotations.processing.PAnnotatedProcessor;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEAttribute;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEReference;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbModelPackage;

/**
 * Class that provides one last chance to catch/process Hibernate specific annotations.
 */
public class UnclassifiableMapper extends AbstractMapper implements
		PAnnotatedProcessor {

	private static final EStructuralFeature COLLECTION_OF_ELEMENTS = 
		HbModelPackage.eINSTANCE.getHbAnnotatedETypeElement_HbCollectionOfElements();
	private FeatureProcessor featureProcessor;

	public UnclassifiableMapper(MappingContext hbmContext, FeatureProcessor featureProcessor) {
		super(hbmContext);
		this.featureProcessor = featureProcessor;
	}

	public void processIllFormed(PAnnotatedEModelElement paElement, String cause, PAnnotation offendingAnnotation) {
		boolean handled = false;
		
		if (null == offendingAnnotation) {
			// Caused by unclassifiable paElement.  Check for Hibernate specifics
			if (paElement instanceof HbAnnotatedEAttribute) {
				handled = processHbAttribute((HbAnnotatedEAttribute) paElement);
			} else if (paElement instanceof HbAnnotatedEReference) {
				handled = processHbReference((HbAnnotatedEReference) paElement);
			}
		}
		
		if (!handled) {
			super.processIllFormed(paElement, cause, offendingAnnotation);

		}	
	}

	private boolean processHbReference(HbAnnotatedEReference hbReference) {
		boolean handled = false;
		if (hbReference.eIsSet(COLLECTION_OF_ELEMENTS)) {
			this.featureProcessor.caseOneToMany(hbReference);
			handled = true;
		}
		return handled;
	}

	private boolean processHbAttribute(HbAnnotatedEAttribute hbAttribute) {
		boolean handled = false;
		if (hbAttribute.eIsSet(COLLECTION_OF_ELEMENTS)) {
			this.featureProcessor.caseOneToMany(hbAttribute);
			handled = true;
		}
		return handled;
	}
}
