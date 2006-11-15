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
 * $Id: ManyToOneMapper.java,v 1.3 2006/11/15 17:17:52 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapper;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pannotation.ManyToOne;
import org.eclipse.emf.teneo.simpledom.Element;

/**
 * Maps a {@link ManyToOne} element to its {@link MappingContext}.
 * <p>
 * Assumes that the given {@link PAnnotatedEStructuralFeature} is a normal ManyToOne, i.e.
 * <ul>
 * <li>it is a {@link PAnnotatedEReference};
 * <li>it has a {@link ManyToOne} annotation;
 * </ul>
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
class ManyToOneMapper extends AbstractAssociationMapper {

	/** Log it */
	private static final Log log = LogFactory.getLog(ManyToOneMapper.class);

	/** Constructor */
	public ManyToOneMapper(MappingContext hbmContext) {
		super(hbmContext);
	}

	/**
	 * Generate the hb mapping for the given reference and annotations.
	 */
	public void process(PAnnotatedEReference paReference) {
		log.debug("Process many-to-one " + paReference);

		final List jcs = getJoinColumns(paReference);
		if (jcs.size() > 1) { // TODO support multiple join columns
			log.error("Unsupported multiple join columns in " + paReference);
			throw new MappingException("Unsupported multiple join columns", paReference);
		}

		final EClass referedTo = paReference.getAnnotatedEReference().getEReferenceType();
		final ManyToOne mto = paReference.getManyToOne();
		String targetName = mto.getTargetEntity();
		final boolean isEasyEMFGenerated = getHbmContext().isEasyEMFGenerated(referedTo);
		if (isEasyEMFGenerated) {
			targetName = getHbmContext().getImpl(referedTo).getName();
		} else if (targetName == null) {
			log.debug("Target is null, compute it");
			targetName = getHbmContext().getEntityName(referedTo);
		}

		log.debug("Target " + targetName);

		final Element associationElement = addManyToOne(paReference, targetName, !isEasyEMFGenerated);

		addCascadesForSingle(associationElement, mto.getCascade());

		if (isEObject(targetName)) {
			final String erefName = paReference.getAnnotatedEReference().getName();
			addColumns(associationElement, erefName, getAnyTypeColumns(erefName, true), true, false);
		} else {
			// todo default false until proxies are supported
			if (getHbmContext().isEasyEMFGenerated(paReference.getAnnotatedEReference().getEContainingClass())) {
				addFetchType(associationElement, mto.getFetch());
			} else {
				associationElement.addAttribute("lazy", "false");
			}

			addJoinColumns(associationElement, jcs, mto.isOptional() || getHbmContext().isCurrentElementFeatureMap());

			associationElement.addAttribute("not-null", mto.isOptional()
					|| getHbmContext().isCurrentElementFeatureMap() ? "false" : "true");
		}

		// MT: TODO; the characteristic of the other side should be checked (if present), if the otherside is a onetoone
		// then this
		// should be set to true. But then this is then handled by a bidirectional onetoone (I think).
		// if (joinColumns.isEmpty())
		// associationElement.addAttribute("unique", "true");
	}
}
