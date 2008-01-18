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
 * </copyright>
 *
 * $Id: OneToManyMapper.java,v 1.16 2008/01/18 06:20:41 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.mapper.association;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pannotation.CascadeType;
import org.eclipse.emf.teneo.annotations.pannotation.OneToMany;
import org.eclipse.emf.teneo.extension.ExtensionPoint;
import org.eclipse.emf.teneo.jpox.elist.AnyFeatureMapEntry;
import org.eclipse.emf.teneo.jpox.mapper.MappingUtil;
import org.eclipse.emf.teneo.jpox.mapping.AnyTypeEObject;
import org.eclipse.emf.teneo.simpledom.Element;

/**
 * Generates a jpox mapping file based on the pamodel.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.16 $
 */

public class OneToManyMapper extends AssociationMapper implements ExtensionPoint {
	/** The logger for all these exceptions */
	protected static final Log log = LogFactory.getLog(OneToManyMapper.class);

	/** Handles a many=true ereference feature */
	public void map(PAnnotatedEReference aReference, Element eclassElement) {
		log.debug("Processing one to many ereference: " + aReference.getModelElement().getName());
		EReference eReference = (EReference) aReference.getModelElement();

		// TODO: cascaderemove will set dependent=true on the element maybe this is to rough for all
		// cases?
		List cascade = aReference.getOneToMany().getCascade();
		boolean cascadeRemove = cascade.contains(CascadeType.ALL) || cascade.contains(CascadeType.REMOVE);
		log.debug("Cascaderemove " + cascadeRemove);

		Element field = eclassElement.addElement("field");
		field.addAttribute("name", namingHandler.correctName(mappingContext, eReference)).addAttribute(
			"persistence-modifier", "persistent");

		OneToMany otm = aReference.getOneToMany();

		// do a mapped by, not for containment because containment does not create a
		// member on the other side
		// CHECK THIS ISSUE CAN OCCUR: because both jpox and emf were setting the inverse, the
		// following then happens:
		// 1) item is added to list, item has oppposite pointing to the list owner.
		// 2) In the add call the item is added to the backing store and jpox sets the inverse in
		// the item
		// 3) During the add emf sets the inverse, it detects that the inverse is already set and
		// deletes the
		// item from the list.
		// -> result item points back to the list but is not present anymore in the list
		if (otm.getMappedBy() != null && !aReference.getModelEReference().isContainment()) {
			field.addAttribute("mapped-by", otm.getMappedBy());
		}

		// collection element is present befpre join element
		Element collection = field.addElement("collection");
		MappingUtil.addEagerLazyLoading(collection, otm.getFetch());

		boolean isWildcard = MappingUtil.isWildcard(eReference);

		// use a join table for mtm relations and non unique relations
		boolean useJoin =
				aReference.getJoinTable() != null || isWildcard ||
						eReference.getEReferenceType().getInstanceClass().equals(EObject.class) ||
						eReference.getEReferenceType().getInstanceClass().equals(Object.class) ||
						aReference.getEmbedded() != null;
		if (useJoin) {
			Element joinElement = field.addElement("join");
			if (aReference.getJoinTable() != null && aReference.getJoinTable().getName() != null) {
				field.addAttribute("table", aReference.getJoinTable().getName());
			}
			if (aReference.getJoinColumns() != null && aReference.getJoinColumns().size() > 0) {
				mappingContext.getJoinColumnMapper().map(aReference.getJoinColumns(), joinElement);
			}
		}

		// element
		boolean embedded = false;
		if (isWildcard) {
			assert (false); // TODO check can this happen?
			log.debug("Is wildcard using any feature entry, adding embedded tags");
			collection.addAttribute("element-type", AnyFeatureMapEntry.class.getName());
			MappingUtil.addFeatureMapEntryMapping(field);
			embedded = true;
			field.addAttribute("embedded", "true");
		} else if (eReference.getEReferenceType().getInstanceClass().equals(EObject.class)) {
			log.debug("Any type of eobject");
			collection.addAttribute("element-type", AnyTypeEObject.class.getName());
			MappingUtil.addAnytypeMapping(field);
			embedded = true;
			field.addAttribute("embedded", "true");
		} else if (eReference.getEReferenceType().getInstanceClass().equals(Object.class)) {
			log.debug("Any type of object");
			collection.addAttribute("element-type", Object.class.getName());
			MappingUtil.addAnytypeMapping(field);
			embedded = true;
			field.addAttribute("embedded", "true");
		} else { // this is the normal case
			String targetEntity = aReference.getOneToMany().getTargetEntity();
			collection.addAttribute("element-type", MappingUtil.getImplNameOfEClass(targetEntity, mappingContext));
		}

		if (!embedded && aReference.getEmbedded() != null) {
			log.debug("Embedded annotation present");
			mappingContext.getEmbeddedMapper().map(aReference, field);
			embedded = true;
		}

		// set dependent attribute
		if (embedded) {
			// do nothing, embedded is dependent anyway
		} else if (cascade.contains(CascadeType.ALL) || MappingUtil.isGroup(eReference)) { // cascadeRemove
			// ||
			collection.addAttribute("dependent-element", "true");
		} else {
			collection.addAttribute("dependent-element", "false");
		}

		if (eReference.getEOpposite() == null && !useJoin && aReference.getJoinColumns() != null &&
				aReference.getJoinColumns().size() > 0) {
			final Element element = field.addElement("element");
			// Element elemElement = field.addElement("element");
			mappingContext.getJoinColumnMapper().map(aReference.getJoinColumns(), element);
		}

		// add order
		if (otm.isIndexed() || aReference.getOrderBy() != null) {
			Element order = field.addElement("order");
			if (aReference.getOrderBy() != null) {
				log.warn("JPOX does not support orderby ejb3, ignored");
				// order.addAttribute("mapped-by", aReference.getOrderBy().getValue());
			}
			order.addAttribute("column", namingHandler.getUniqueIndexColumnName(eReference));
		}

		// two way were the otherside is the container then the reference should be delete
		// confusing but foreign-key constraints are defined the other way around in jpox
		if (eReference.getEOpposite() != null && eReference.getEOpposite().isContainment()) {
			field.addAttribute("delete-action", "cascade");
		} else { // restrict foreign-key constraint in all other cases
			field.addAttribute("delete-action", "restrict");
		}

		// do foreign key
		if (!useJoin && cascadeRemove) { // containment does not need a join table
			final Element fk =
					field.addElement("foreign-key").addAttribute("delete-action", "cascade").addAttribute(
						"update-action", "cascade");
			setFKName(aReference, fk);
		} else if (!useJoin) {
			final Element fk =
					field.addElement("foreign-key").addAttribute("delete-action", "restrict").addAttribute(
						"update-action", "cascade");
			setFKName(aReference, fk);
		}
	}
}