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
 * $Id: OneToManyMapper.java,v 1.9 2006/09/29 12:29:47 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pannotation.JoinTable;
import org.eclipse.emf.teneo.annotations.pannotation.OneToMany;
import org.eclipse.emf.teneo.annotations.processing.OneToManyProcessor;
import org.eclipse.emf.teneo.hibernate.hbannotation.Cascade;
import org.eclipse.emf.teneo.hibernate.hbannotation.CollectionOfElements;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEReference;
import org.eclipse.emf.teneo.simpledom.Element;

/**
 * Maps a OneToMany element to its mapping Context.
 * <p>
 * Assumes that the given {@link PAnnotatedEStructuralFeature} is normal, i.e.
 * <ul>
 * <li>it is a {@link PAnnotatedEReference};
 * <li>it has a {@link OneToMany} annotation;
 * <li>TODO
 * </ul>
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
class OneToManyMapper extends AbstractAssociationMapper implements OneToManyProcessor {

	/** The log */
	private static final Log log = LogFactory.getLog(OneToManyMapper.class);

	/** Constructor */
	public OneToManyMapper(MappingContext hbmContext) {
		super(hbmContext);
	}

	/**
	 * joinTable.getInverseJoinColumns must be null TODO choose appropriate mapping according to the presence of
	 * JoinTable
	 * 
	 * @see org.eclipse.emf.teneo.annotations.processing.OneToManyProcessor#processUnidirectional(org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference,
	 *      org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass)
	 */
	public void processOtMUni(PAnnotatedEReference paReference) {
		if (log.isDebugEnabled()) {
			log.debug("Generating one to many unidirectional mapping for " + paReference);
		}

        final HbAnnotatedEReference hbReference = (HbAnnotatedEReference) paReference;
        
        EClass refType = hbReference.getAnnotatedEReference().getEReferenceType();
        
		// TODO add isUnique on interface
		// TODO request EMF team to deal correctly with unique attribute on EReferences
		final Element collElement = addCollectionElement(paReference);
		// .getAnnotatedElement().getName(),
		// paReference.getIndexed() != null && paReference.getIndexed().isValue());
		final Element keyElement = collElement.addElement("key");

		// TODO: throw error if both jointable and joincolumns have been set
		// MT: below has been added
		final List jcs = paReference.getJoinColumns() == null ? new ArrayList() : (List) paReference.getJoinColumns();
		final JoinTable jt = paReference.getJoinTable();
		if (jt != null) {
			addJoinTable(collElement, keyElement, jt);
		} else {
			addKeyColumns(keyElement, jcs);
		}

        final OneToMany otm = hbReference.getOneToMany();
        if (hbReference.getHbIdBag() != null) {
        	log.debug("Setting indexed=false because is an idbag");
        	otm.setIndexed(false);
        }
        
		if (otm.isIndexed()) {
			addListIndex(collElement, paReference);
		}

        final CollectionOfElements coe = hbReference.getHbCollectionOfElements();
        final Cascade hbCascade = hbReference.getHbCascade();
        final List hbCascadeList = (null == hbCascade) ? Collections.EMPTY_LIST : hbCascade.getValue();
        
        // TODO OneToMany and CollectionOfElements are mutually exclusive.  Should throw exception if both there?
        addFetchType(collElement, (null != coe) ? coe.getFetch() : otm.getFetch());
        addCascadesForMany(collElement, (null != coe) ? hbCascadeList : otm.getCascade());
		List inverseJoinColumns = jt != null && jt.getInverseJoinColumns() != null ? (List) jt.getInverseJoinColumns()
				: Collections.EMPTY_LIST;

        String targetName = null;
        
        targetName = otm.getTargetEntity();
        if (targetName == null) {
            targetName = getHbmContext().getEntityName(refType);
        }

		// MT a manytomany is only required in case of unique=false, note that the ejb3 spec states that for uni otm
		// always a jointable should be
		// used (as a default). This is however to heavy for cases were a jointable is not required at all. Also
		// hibernate supports uni otm without join table.
        if (hbReference.getEmbedded() != null) {
            addCompositeElement(collElement, targetName, hbReference);
		} else if (jt != null) {
			// A m2m forces a join table, note that isunique does not completely follow the semantics of emf, unique on
			// an otm means that an element can only occur once in the table, if unique is false then you in effect have
			// a
			// mtm relation
			// because an item can occur twice or more in the list.
			// To force a jointable on a real otm a jointable annotation should be specified.
			addManyToMany(collElement, targetName, inverseJoinColumns, otm.isUnique());
		} else {
			addOneToMany(collElement, targetName);
		}
		addIsSetAttribute(hbReference);
	}

    /**
	 * 
	 * @see org.eclipse.emf.teneo.annotations.processing.OneToManyProcessor#processBidirectionalInverse(org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference,
	 *      org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference)
	 */
	public void processOtMBidiInverse(PAnnotatedEReference paReference) {
		if (log.isDebugEnabled()) {
			log.debug("Generating one to many bidirectional inverse mapping for " + paReference);
		}

		// final Element collElement = addCollectionElement(paReference.getAnnotatedElement().getName(),
		// paReference.isIndexed());
		final Element collElement = addCollectionElement(paReference);

		// MT: note inverse does not work correctly with hibernate for indexed collections, see 7.3.3 of the hibernate
		// manual 3.1.1
		//collElement.addAttribute("inverse", "true");
		final Element keyElement = collElement.addElement("key");

		// MT: added handling of join info
		final List jcs = paReference.getJoinColumns() == null ? new ArrayList() : (List) paReference.getJoinColumns();
		final JoinTable jt = paReference.getJoinTable();
		if (jt != null) {
			addJoinTable(collElement, keyElement, jt);
		} else {
			addKeyColumns(keyElement, jcs);
		}

		final OneToMany otm = paReference.getOneToMany();
		addFetchType(collElement, otm.getFetch());
		addCascadesForMany(collElement, otm.getCascade());

		if (otm.isIndexed()) {
			addListIndex(collElement, paReference);
		}

		String targetName = otm.getTargetEntity();
		if (targetName == null) {
			targetName = getHbmContext().getEntityName(paReference.getAnnotatedEReference().getEReferenceType());
		}

		if (paReference.getEmbedded() != null) {
			addCompositeElement(collElement, targetName, paReference);
		} else if (jt != null) {
			final List inverseJoinColumns = jt != null && jt.getInverseJoinColumns() != null ? (List) jt
					.getInverseJoinColumns() : Collections.EMPTY_LIST;
			addManyToMany(collElement, targetName, inverseJoinColumns, otm.isUnique());
		} else {
			addOneToMany(collElement, targetName);
		}
		addIsSetAttribute(paReference);
	}

	/**
	 * Creates a onetomany element.
	 * 
	 * @param collElement
	 * @param targetEntity
	 */
	private void addOneToMany(Element collElement, String targetEntity) {
		collElement.addElement("one-to-many").addAttribute("entity-name", targetEntity);
	}

	/**
	 * Creates a many-to-many to handle the unidirectional manytomany. A unidirectional manytomany is now specified
	 * using the one to many annotation while its implementation has a join table.
	 */
	private Element addManyToMany(Element collElement, String targetEntity, List invJoinColumns, boolean unique) {
		Element manyToMany = collElement.addElement("many-to-many").addAttribute("entity-name", targetEntity)
				.addAttribute("unique", unique ? "true" : "false");
		addKeyColumns(manyToMany, invJoinColumns);
		return manyToMany;
	}

	/** Add composite-element */
	private Element addCompositeElement(Element collElement, String targetEntity, PAnnotatedEReference paReference) {
		// TODO: handle nested components: nested-composite-element
		final Element componentElement = collElement.addElement("composite-element")
				.addAttribute("class", targetEntity);
		getHbmContext().setCurrent(componentElement);

		try {
			// process the features of the target
			final PAnnotatedEClass componentAClass = paReference.getPaModel().getPAnnotated(
					paReference.getAnnotatedEReference().getEReferenceType());
			getHbmContext().processFeatures(componentAClass.getPaEStructuralFeatures());
		} finally {
			getHbmContext().setCurrent(collElement.getParent());
		}
		return componentElement;
	}
}
