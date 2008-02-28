/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: OneToOneMapper.java,v 1.14 2008/02/28 07:09:04 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.mapper.association;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pannotation.CascadeType;
import org.eclipse.emf.teneo.extension.ExtensionPoint;
import org.eclipse.emf.teneo.jpox.mapper.MappingUtil;
import org.eclipse.emf.teneo.simpledom.Element;

/**
 * Generates a jpox mapping for the one to one association.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.14 $
 */

public class OneToOneMapper extends AssociationMapper implements ExtensionPoint {
	/** The logger for all these exceptions */
	protected static final Log log = LogFactory.getLog(OneToOneMapper.class);

	/** Handles a single ereference feature */
	public void map(PAnnotatedEReference aReference, Element eclassElement) {
		log.debug("Processing one to one ereference: " + aReference.getModelElement().getName());
		EReference eReference = (EReference) aReference.getModelElement();

		// TODO: cascaderemove will set dependent=true on the element maybe this is to rough for all
		// cases?
		List cascade = aReference.getOneToOne().getCascade();
		boolean cascadeRemove = cascade.contains(CascadeType.ALL) || cascade.contains(CascadeType.REMOVE);
		log.debug("Cascaderemove " + cascadeRemove);

		Element field = eclassElement.addElement("field");
		field.addAttribute("name", namingHandler.correctName(mappingContext, eReference)).addAttribute(
			"persistence-modifier", "persistent");
		setCommonReferenceAttributes(field, aReference, cascadeRemove);

		// special case if a modelField is a referencemodelfield and part of a two way relation then
		// it
		// it is always set to nullable otherwise it is impossible to de-couple an object from
		// another object
		// other behavior I noticed is that for a required dependent field the following happens:
		// - o is deleted
		// - its depedent child is deleted, the reference from o to the child is nullified
		// - exception is thrown before o can be deleted that reference to child is null
		// maybe required dependent is an uncommon model.
		boolean setNullable =
				mappingContext.isForceOptional() || aReference.getOneToOne().isOptional() ||
						eReference.getEOpposite() != null || cascadeRemove;
		field.addAttribute("null-value", setNullable ? "none" : "exception");

		if (aReference.getEmbedded() != null) {
			mappingContext.getEmbeddedMapper().map(aReference, field);
		} else {
			// CHECK: because both jpox and emf were setting the inverse, the following then
			// happens:
			// 1) item is added to list, item has oppposite pointing to the list owner.
			// 2) In the add call the item is added to the backing store and jpox sets the inverse
			// in the item
			// 3) During the add emf sets the inverse, it detects that the inverse is already set
			// and deletes the
			// item from the list.
			// -> result item points back to the list but is not present anymore in the list
			if (aReference.getOneToOne() != null && aReference.getOneToOne().getMappedBy() != null &&
					!aReference.getModelEReference().isContainment()) {
				// disabled mapped-by for now, for one reason or another jpox did not cascade the
				// persist action over a bidirectional relation, bidirectionality is controlled
				// anyway by emf.
				// field.addAttribute("mapped-by", aReference.getOneToOne().getMappedBy());
			}

			// add extra foreign key constraint
			// for embedded no foreign key constraint
			final Element fk;
			if (cascadeRemove && aReference.getEmbedded() == null) {
				fk =
						field.addElement("foreign-key").addAttribute("delete-action", "cascade").addAttribute(
							"update-action", "cascade");
			} else {
				fk = field.addElement("foreign-key");
			}
			setFKName(aReference, fk);

			if (aReference.getJoinColumns() != null && aReference.getJoinColumns().size() > 0) {
				// Element elemElement = field.addElement("element");
				mappingContext.getJoinColumnMapper().map(aReference.getJoinColumns(), field);
			}
		}

		field.addElement("extension").addAttribute("vendor-name", "jpox").addAttribute("key", "implementation-classes")
			.addAttribute("value",
				MappingUtil.getImplNameOfEClass(aReference.getOneToOne().getTargetEntity(), mappingContext));
	}
}