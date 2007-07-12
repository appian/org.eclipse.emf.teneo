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
 * $Id: ManyToManyMapper.java,v 1.10 2007/07/12 18:04:18 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.mapper.association;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pannotation.CascadeType;
import org.eclipse.emf.teneo.annotations.pannotation.ManyToMany;
import org.eclipse.emf.teneo.extension.ExtensionPoint;
import org.eclipse.emf.teneo.jpox.mapper.MappingUtil;
import org.eclipse.emf.teneo.simpledom.Element;

/**
 * Generates a jpox mapping file based on the pamodel.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.10 $
 */

public class ManyToManyMapper extends AssociationMapper implements ExtensionPoint {
	/** The logger for all these exceptions */
	protected static final Log log = LogFactory.getLog(ManyToManyMapper.class);

	/** Handles a many=true ereference feature */
	public void map(Element eclassElement, PAnnotatedEReference aReference) {
		log.debug("Processing many to many ereference: " + aReference.getAnnotatedElement().getName());
		EReference eReference = (EReference) aReference.getAnnotatedElement();

		// TODO: cascaderemove will set dependent=true on the element maybe this is to rough for all
		// cases?
		List cascade = aReference.getManyToMany().getCascade();
		boolean cascadeRemove = cascade.contains(CascadeType.ALL) || cascade.contains(CascadeType.REMOVE);
		log.debug("Cascaderemove " + cascadeRemove);

		if (cascadeRemove) {
			log.warn("Cascade (all) remove on a many to many relation is an unlikely case");
		}

		Element field = eclassElement.addElement("field");
		field.addAttribute("name", namingHandler.correctName(mappingContext, eReference)).addAttribute(
			"persistence-modifier", "persistent");

		// two way were the otherside is the container then the reference should be delete
		// confusing but foreign-key constraints are defined the other way around in jpox
		if (eReference.getEOpposite() != null && eReference.getEOpposite().isContainment()) {
			field.addAttribute("delete-action", "cascade");
		} else { // restrict foreign-key constraint in all other cases
			field.addAttribute("delete-action", "restrict");
		}

		// CHECK THIS ISSUE CAN OCCUR: because both jpox and emf were setting the inverse, the
		// following then happens:
		// 1) item is added to list, item has oppposite pointing to the list owner.
		// 2) In the add call the item is added to the backing store and jpox sets the inverse in
		// the item
		// 3) During the add emf sets the inverse, it detects that the inverse is already set and
		// deletes the
		// item from the list.
		// -> result item points back to the list but is not present anymore in the list
		// DISABLED this therefor
		ManyToMany mtm = aReference.getManyToMany();
		if (mtm.getMappedBy() != null && !aReference.getAnnotatedEReference().isContainment()) {
			// see above
			// field.addAttribute("mapped-by", mtm.getMappedBy());
		}

		// collection element is present befpre join element
		Element collection = field.addElement("collection");
		MappingUtil.addEagerLazyLoading(collection, mtm.getFetch());

		// use a join table for mtm relations
		Element joinElement = field.addElement("join");
		if (aReference.getJoinTable() != null) {
			log.warn("JPOX does currently not support a specific table setting for many-to-many table name ignored");
		}

		if (aReference.getJoinColumns() != null && aReference.getJoinColumns().size() > 0) {
			mappingContext.getJoinColumnMapper().map(aReference.getJoinColumns(), joinElement);
		}

		collection.addAttribute("element-type", MappingUtil.getImplNameOfEClass(aReference.getManyToMany()
			.getTargetEntity(), mappingContext));

		if (cascadeRemove) {
			collection.addAttribute("dependent-element", "true");
		} else {
			collection.addAttribute("dependent-element", "false");
		}
	}
}