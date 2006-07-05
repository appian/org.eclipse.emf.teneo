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
 * $Id: EmbeddedMapper.java,v 1.1 2006/07/05 22:29:30 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pannotation.ManyToOne;
import org.eclipse.emf.teneo.annotations.pannotation.OneToOne;
import org.eclipse.emf.teneo.annotations.processing.EmbeddedProcessor;
import org.eclipse.emf.teneo.annotations.processing.ProcessingException;
import org.eclipse.emf.teneo.simpledom.Element;

/**
 * Maps Embedded properties.
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
class EmbeddedMapper extends AbstractMapper implements EmbeddedProcessor {

	private static final Log log = LogFactory.getLog(EmbeddedMapper.class);

	public EmbeddedMapper(MappingContext mappingContext) {
		super(mappingContext);
	}

	/**
	 * unsupported
	 * 
	 * @see org.eclipse.emf.teneo.annotations.processing.EmbeddedProcessor#processEmbedded(org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference,
	 *      org.eclipse.emf.teneo.annotations.pannotation.Embedded)
	 */
	public void processEmbedded(PAnnotatedEReference paReference) {
		// push the current overrides
		getHbmContext().pushOverrideOnStack();
		// and add our own
		getHbmContext().addOverrides(paReference.getAttributeOverrides());

		// push the feature is used for automatic renaming
		getHbmContext().pushEmbeddingFeature(paReference);
		try {
			// make a difference between a many-to-one component and multi-component
			if (paReference.getManyToOne() != null) {
				final ManyToOne mto = paReference.getManyToOne();
				processSingleEmbedded(paReference, mto.getTargetEntity(), paReference.getAnnotatedEReference()
						.getEReferenceType());
			} else if (paReference.getOneToOne() != null) {
				final OneToOne oto = paReference.getOneToOne();
				processSingleEmbedded(paReference, oto.getTargetEntity(), paReference.getAnnotatedEReference()
						.getEReferenceType());
			} else {
				if (paReference.getManyToMany() != null) {
					throw new ProcessingException("ManyToMany can not be combined with Embedded " + paReference);
				} else if (paReference.getOneToMany() == null) {
					throw new ProcessingException("OneToMany must be set for embedded elist type: " + paReference);
				}

				// only one to many
				processMultiEmbedded(paReference);
			}
		} finally {
			// and continue with the previous set of overrides
			getHbmContext().popOverrideStack();
			getHbmContext().popEmbeddingFeature();
		}
	}

	/** Process a many-to-one component */
	private void processSingleEmbedded(PAnnotatedEReference paReference, String targetName, EClass target) {
		if (targetName == null) {
			log.debug("Target is null, compute it");
			targetName = getHbmContext().getEntityName(target);
		}

		final Element componentElement = getHbmContext().getCurrent().addElement("component").addAttribute("name",
				paReference.getAnnotatedEReference().getName()).addAttribute("class", targetName);
		getHbmContext().setCurrent(componentElement);
		try {
			// process the features of the target
			final PAnnotatedEClass componentAClass = paReference.getPaModel().getPAnnotated(
					paReference.getAnnotatedEReference().getEReferenceType());
			getHbmContext().processFeatures(componentAClass.getPaEStructuralFeatures());
		} finally {
			getHbmContext().setCurrent(componentElement.getParent());
		}
	}

	/** Process a list of components */
	private void processMultiEmbedded(PAnnotatedEReference paReference) {
		// let the featureprocessor handle this, the one to many is handled by the OneToManyMapper
		getHbmContext().getFeatureProcessor().caseOneToMany(paReference);
	}
}
