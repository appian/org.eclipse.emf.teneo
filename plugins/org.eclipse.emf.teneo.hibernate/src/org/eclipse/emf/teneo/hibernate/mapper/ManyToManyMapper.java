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
 * $Id: ManyToManyMapper.java,v 1.1 2006/07/05 22:29:30 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapper;

import java.util.Iterator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pannotation.JoinColumn;
import org.eclipse.emf.teneo.annotations.pannotation.JoinTable;
import org.eclipse.emf.teneo.annotations.pannotation.ManyToMany;
import org.eclipse.emf.teneo.annotations.processing.ManyToManyProcessor;
import org.eclipse.emf.teneo.annotations.processing.ProcessingException;
import org.eclipse.emf.teneo.simpledom.Element;
import org.eclipse.emf.teneo.util.StoreUtil;

/**
 * Maps a many to many relation.
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
class ManyToManyMapper extends AbstractAssociationMapper implements ManyToManyProcessor {

	/** Logger */
	private static final Log log = LogFactory.getLog(ManyToManyMapper.class);

	/**
	 * @param hbmContext
	 */
	public ManyToManyMapper(MappingContext hbmContext) {
		super(hbmContext);
	}

	/**
	 * Many to Many unidirectional
	 */
	public void processMtMUni(PAnnotatedEReference paReference) {
		processMtM(paReference);
	}

	/**
	 * Many to Many bidirectional owner
	 */
	public void processMtMBidiOwner(PAnnotatedEReference paReference) {
		processMtM(paReference);
	}

	/**
	 * Many to Many bidirectional inverse
	 */
	public void processMtMBidiInverse(PAnnotatedEReference paReference) {
		processMtM(paReference);
	}

	/**
	 * Process a many to many for all cases
	 */
	public void processMtM(PAnnotatedEReference paReference) {
		log.debug("Creating many-to-many for " + paReference);

		final JoinTable jt = paReference.getJoinTable();
		final ManyToMany mtm = paReference.getManyToMany();

		if (jt == null) {
			throw new ProcessingException("Jointable is mandatory "
					+ StoreUtil.toString(paReference.getAnnotatedEReference()));
		}

		// TODO add isUnique on interface
		// TODO request EMF team to deal correctly with unique attribute on EReferences
		final Element collElement = addCollectionElement(paReference);
		final Element keyElement = collElement.addElement("key");

		if (paReference.getIndexed() != null && paReference.getIndexed().isValue()) {
			assert (paReference.getIdBag() == null);
			addListIndex(collElement, paReference);
		}
		addFetchType(collElement, mtm.getFetch());
		addCascades(collElement, mtm.getCascade(), false);

		String targetName = mtm.getTargetEntity();
		if (targetName == null) {
			log.debug("Target is name, compute it");
			targetName = getHbmContext().getEntityName(paReference.getAnnotatedEReference().getEReferenceType());
		}
		log.debug("Target entity-name " + targetName);

		Element mtmElement = collElement.addElement("many-to-many").addAttribute("entity-name", targetName)
				.addAttribute("unique", "false");

		// inverse is not supported by indexed lists
		if (mtm.getMappedBy() != null && !(paReference.getIndexed() != null && paReference.getIndexed().isValue())) {
			collElement.addAttribute("inverse", "true");
		}

		addJoinTable(collElement, keyElement, jt);
		if (jt.getInverseJoinColumns() != null) {
			for (Iterator it = jt.getInverseJoinColumns().iterator(); it.hasNext();) {
				final JoinColumn joinColumn = (JoinColumn) it.next();
				mtmElement.addElement("column").addAttribute("name", getHbmContext().trunc(joinColumn.getName()))
						.addAttribute("not-null", joinColumn.isNullable() ? "false" : "true").addAttribute("unique",
								joinColumn.isUnique() ? "true" : "false");
			}
		}
	}
}
