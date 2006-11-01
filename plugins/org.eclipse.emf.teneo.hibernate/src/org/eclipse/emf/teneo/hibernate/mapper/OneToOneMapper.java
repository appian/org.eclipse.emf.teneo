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
 * $Id: OneToOneMapper.java,v 1.4 2006/11/01 11:39:23 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapper;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pannotation.OneToOne;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage;
import org.eclipse.emf.teneo.simpledom.Element;

/**
 * Maps a {@link OneToOne} element to its {@link MappingContext}.
 * <p>
 * Assumes that the given {@link PAnnotatedEStructuralFeature} is a normal OneToOne, i.e.
 * <ul>
 * <li>it is a {@link PAnnotatedEReference};
 * <li>it has a {@link OneToOne} annotation;
 * <li>each attribute on the {@link OneToOne} annotation is set possibly except for {@link OneToOne#getMappedBy()};
 * <li>TODO requirements on JoinColumns/PrimaryKeyJoinColumn
 * </ul>
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
class OneToOneMapper extends AbstractAssociationMapper {

	private static final Log log = LogFactory.getLog(OneToOneMapper.class);

	public OneToOneMapper(MappingContext hbmContext) {
		super(hbmContext);
	}

	/**
	 * @return
	 */
	private Element addOneToOne(String assocName, String targetEntity) {
		return getHbmContext().getCurrent().addElement("one-to-one").addAttribute("name", assocName).addAttribute(
				"entity-name", targetEntity);
	}

	/** Process the one-to-one */
	public void process(PAnnotatedEReference paReference) {
		if (getOtherSide(paReference) == null || 
				paReference.getOneToOne().eIsSet(PannotationPackage.eINSTANCE.getOneToOne_MappedBy())) {
			if (!paReference.getPrimaryKeyJoinColumns().isEmpty()) {
				createOneToOne(paReference);
			} else {
				createManyToOne(paReference);
			}
		} else {
			createOneToOne(paReference);
		}
	}

	/** Create hibernate many-to-one mapping */
	private void createManyToOne(PAnnotatedEReference paReference) {
		log.debug("Generating many to one mapping for onetoone" + paReference);

		final OneToOne oto = paReference.getOneToOne();
		final String specifiedName = oto.getTargetEntity();

		final Element associationElement = addManyToOne(paReference.getAnnotatedEReference().getName(),
				(specifiedName != null ? specifiedName : getHbmContext().getEntityName(
						paReference.getAnnotatedEReference().getEReferenceType())));

		addCascadesForSingle(associationElement, oto.getCascade());
		// todo default false until proxies are supported
		associationElement.addAttribute("lazy", "false");
		//addFetchType(associationElement, oto.getFetch());
		final List joinColumns = getJoinColumns(paReference);
		final boolean forceNullable = (oto.isOptional() || getHbmContext().isCurrentElementFeatureMap());
		addJoinColumns(associationElement, joinColumns, forceNullable);

		associationElement.addAttribute("unique", "true");
	}

	
	/** Create hibernate one-to-one mapping */
	private void createOneToOne(PAnnotatedEReference paReference) {
		if (log.isDebugEnabled())
			log.debug("Generating one to one bidirectional inverse mapping for " + paReference);

		final OneToOne oto = paReference.getOneToOne();
		String targetName = oto.getTargetEntity();
		if (targetName == null) {
			targetName = getHbmContext().getEntityName(paReference.getAnnotatedEReference().getEReferenceType());
		}

		Element associationElement = addOneToOne(paReference.getAnnotatedEReference().getName(), targetName);

		addCascadesForSingle(associationElement, oto.getCascade());
		addFetchType(associationElement, oto.getFetch());
		if (paReference.getPrimaryKeyJoinColumns().size() > 0) {
			associationElement.addAttribute("constrained", "true");
		}
	}
}
