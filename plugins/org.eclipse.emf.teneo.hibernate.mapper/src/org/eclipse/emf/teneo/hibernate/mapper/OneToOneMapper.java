/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others
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
 * $Id: OneToOneMapper.java,v 1.8 2007/02/08 23:13:12 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapper;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pannotation.JoinColumn;
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

	/** Process the one-to-one */
	public void process(PAnnotatedEReference paReference) {
		if (getOtherSide(paReference) == null
				|| paReference.getOneToOne().eIsSet(PannotationPackage.eINSTANCE.getOneToOne_MappedBy())) {
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
		final EReference eref = paReference.getAnnotatedEReference();
		String specifiedName = oto.getTargetEntity();

		final EClass referedTo = eref.getEReferenceType();
		final boolean isEasyEMFGenerated = getHbmContext().isEasyEMFGenerated(referedTo);
		if (specifiedName == null || isEasyEMFGenerated) {
			specifiedName = getHbmContext().getEntityName(referedTo);
		}

		final Element associationElement = addManyToOne(paReference, (specifiedName != null ? specifiedName
				: getHbmContext().getEntityName(eref.getEReferenceType())), !isEasyEMFGenerated);

		addCascadesForSingle(associationElement, oto.getCascade());

		if (isEObject(specifiedName)) {
			addColumns(associationElement, eref.getName(), getAnyTypeColumns(eref.getName(), true), true, false);
		} else {
			if (getHbmContext().isEasyEMFGenerated(eref.getEContainingClass())) {
				addFetchType(associationElement, oto.getFetch(), true);
			} else {
				associationElement.addAttribute("lazy", "false");
			}
			final List<JoinColumn> joinColumns = getJoinColumns(paReference);
			final boolean forceNullable = (oto.isOptional() || getHbmContext().isCurrentElementFeatureMap());
			addJoinColumns(associationElement, joinColumns, forceNullable);

			associationElement.addAttribute("unique", "true");
		}
	}

	/** Create hibernate one-to-one mapping */
	private void createOneToOne(PAnnotatedEReference paReference) {
		if (log.isDebugEnabled())
			log.debug("Generating one to one bidirectional inverse mapping for " + paReference);

		final OneToOne oto = paReference.getOneToOne();
		String targetName = oto.getTargetEntity();
		final EClass referedTo = paReference.getAnnotatedEReference().getEReferenceType();
		final boolean isEasyEMFGenerated = getHbmContext().isEasyEMFGenerated(referedTo);
		if (targetName == null || isEasyEMFGenerated) {
			targetName = getHbmContext().getEntityName(referedTo);
		}

		final EReference eref = paReference.getAnnotatedEReference();
		final EReference otherSide = eref.getEOpposite();
		final Element associationElement = addOneToOne(getHbmContext().getPropertyName(eref), targetName,
				!isEasyEMFGenerated);

		addCascadesForSingle(associationElement, oto.getCascade());

		// add the other-side
		if (otherSide != null) {
			associationElement.addAttribute("property-ref", getHbmContext().getPropertyName(otherSide));
		}

		addFetchType(associationElement, oto.getFetch(), true);
		if (paReference.getPrimaryKeyJoinColumns().size() > 0) {
			associationElement.addAttribute("constrained", "true");
		}
	}

	/**
	 * @return
	 */
	private Element addOneToOne(String assocName, String targetEntity, boolean isEntity) {
		if (isEntity) {
			return getHbmContext().getCurrent().addElement("one-to-one").addAttribute("name", assocName).addAttribute(
					"entity-name", targetEntity);
		} else {
			return getHbmContext().getCurrent().addElement("one-to-one").addAttribute("name", assocName).addAttribute(
					"class", targetEntity);
		}
	}
}
