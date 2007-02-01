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
 * $Id: ManyToOneMapper.java,v 1.8 2007/02/01 12:36:36 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.mapper.association;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pannotation.CascadeType;
import org.eclipse.emf.teneo.ecore.EClassNameStrategy;
import org.eclipse.emf.teneo.jpox.mapper.MappingContext;
import org.eclipse.emf.teneo.jpox.mapper.MappingUtil;
import org.eclipse.emf.teneo.jpox.mapping.AnyTypeEObject;
import org.eclipse.emf.teneo.simpledom.Element;

/**
 * Generates a jpox mapping for the one to one association.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.8 $
 */

public class ManyToOneMapper extends AssociationMapper {
	/** The logger for all these exceptions */
	protected static final Log log = LogFactory.getLog(ManyToOneMapper.class);

	/** Constructor */
	public ManyToOneMapper(MappingContext mappingContext) {
		super(mappingContext);
	}

	/** Handles a single ereference feature */
	public void map(PAnnotatedEReference aReference, Element eclassElement) {
		log.debug("Processing many to one ereference: " + aReference.getAnnotatedElement().getName());
		EReference eReference = (EReference) aReference.getAnnotatedElement();

		// TODO: cascaderemove will set dependent=true on the element maybe this is to rough for all cases?
		List cascade = aReference.getManyToOne().getCascade();
		boolean cascadeRemove = cascade.contains(CascadeType.ALL_LITERAL)
				|| cascade.contains(CascadeType.REMOVE_LITERAL);
		log.debug("Cascaderemove " + cascadeRemove);

		Element field = eclassElement.addElement("field");
		field.addAttribute("name", namingHandler.correctName(mappingContext, eReference)).addAttribute(
				"persistence-modifier", "persistent");
		setCommonReferenceAttributes(field, aReference, cascadeRemove);

		// special case if a modelField is a referencemodelfield and part of a two way relation then it
		// it is always set to nullable otherwise it is impossible to de-couple an object from another object
		// other behavior I noticed is that for a required dependent field the following happens:
		// - o is deleted
		// - its depedent child is deleted, the reference from o to the child is nullified
		// - exception is thrown before o can be deleted that reference to child is null
		// maybe required dependent is an uncommon model.
		boolean setNullable = aReference.getManyToOne().isOptional() || eReference.getEOpposite() != null
				|| cascadeRemove;
		field.addAttribute("null-value", setNullable ? "none" : "exception");

		if (aReference.getEmbedded() != null) {
			mappingContext.getEmbeddedMapper().map(aReference, field);
		} else {

			// add extra foreign key constraint
			// for embedded no foreign key constraint
			Element fk = null;
			if (cascadeRemove && aReference.getEmbedded() == null) {
				fk = field.addElement("foreign-key").addAttribute("delete-action", "cascade").addAttribute(
						"update-action", "cascade");
			} else {
				fk = field.addElement("foreign-key");
			}

			if (aReference.getJoinColumns() != null && aReference.getJoinColumns().size() > 0) {
				// Element elemElement = field.addElement("element");
				mappingContext.getJoinColumnMapper().map(aReference.getJoinColumns(), fk);
			}
		}

		String targetEntity = aReference.getManyToOne().getTargetEntity();
		String implName = null;
		if (targetEntity.compareTo(EClassNameStrategy.EOBJECT_ECLASS_URI) == 0) {
			implName = AnyTypeEObject.class.getName();
		} else {
			implName = MappingUtil.getImplNameOfEClass(aReference.getManyToOne().getTargetEntity(), mappingContext);
		}

		field.addElement("extension").addAttribute("vendor-name", "jpox").addAttribute("key", "implementation-classes")
				.addAttribute("value", implName);
	}
}