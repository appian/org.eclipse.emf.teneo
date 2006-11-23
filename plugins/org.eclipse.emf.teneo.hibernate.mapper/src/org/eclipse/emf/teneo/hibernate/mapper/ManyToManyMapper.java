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
 * $Id: ManyToManyMapper.java,v 1.4 2006/11/23 06:12:22 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapper;

import java.util.Iterator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pannotation.JoinColumn;
import org.eclipse.emf.teneo.annotations.pannotation.JoinTable;
import org.eclipse.emf.teneo.annotations.pannotation.ManyToMany;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEReference;
import org.eclipse.emf.teneo.simpledom.Element;
import org.eclipse.emf.teneo.util.StoreUtil;

/**
 * Maps a many to many relation.
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
class ManyToManyMapper extends AbstractAssociationMapper {

	/** Logger */
	private static final Log log = LogFactory.getLog(ManyToManyMapper.class);

	/**
	 * @param hbmContext
	 */
	public ManyToManyMapper(MappingContext hbmContext) {
		super(hbmContext);
	}

	/**
	 * Process a many to many for all cases
	 */
	public void process(PAnnotatedEReference paReference) {
		log.debug("Creating many-to-many for " + paReference);

		HbAnnotatedEReference hbReference = (HbAnnotatedEReference) paReference;

		final JoinTable jt = hbReference.getJoinTable();
		final ManyToMany mtm = hbReference.getManyToMany();

		if (jt == null) {
			throw new MappingException("Jointable is mandatory "
					+ StoreUtil.toString(hbReference.getAnnotatedEReference()));
		}

		final Element collElement = addCollectionElement(hbReference);

		if (((HbAnnotatedEReference) paReference).getHbCache() != null) {
			addCacheElement(collElement, ((HbAnnotatedEReference) paReference).getHbCache());
		}

		final Element keyElement = collElement.addElement("key");

		if (mtm.isIndexed()) {
			assert (hbReference.getHbIdBag() == null);
			addListIndex(collElement, hbReference);
		}
		addFetchType(collElement, mtm.getFetch());
		addCascades(collElement, mtm.getCascade(), false);

		final EClass referedTo = hbReference.getAnnotatedEReference().getEReferenceType();

		String targetName = mtm.getTargetEntity();
		if (targetName == null || getHbmContext().isEasyEMFGenerated(referedTo)) {
			targetName = getHbmContext().getEntityName(referedTo);
		}
		log.debug("Target entity-name " + targetName);

		boolean isEasyEMFGenerated = getHbmContext().isEasyEMFGenerated(referedTo);
		if (isEasyEMFGenerated) {
			targetName = getHbmContext().getImpl(referedTo).getName();
		}

		final Element mtmElement;
		if (isEasyEMFGenerated) {
			mtmElement = collElement.addElement("many-to-many").addAttribute("class", targetName).addAttribute(
					"unique", "false");
		} else {
			mtmElement = collElement.addElement("many-to-many").addAttribute("entity-name", targetName).addAttribute(
					"unique", "false");
		}

		// inverse is not supported by indexed lists
		if (mtm.getMappedBy() != null && !mtm.isIndexed()) {
			collElement.addAttribute("inverse", "true");
		} else if (mtm.getMappedBy() != null && !mtm.isIndexed()) {
			log
					.warn("Indexed is true but indexed is not supported for inverse=true and many-to-many, not setting inverse=true");
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
