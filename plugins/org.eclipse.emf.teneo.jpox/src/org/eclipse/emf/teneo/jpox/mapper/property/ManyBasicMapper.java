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
 * $Id: ManyBasicMapper.java,v 1.12 2008/03/19 22:25:45 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.mapper.property;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.extension.ExtensionPoint;
import org.eclipse.emf.teneo.jpox.elist.AnyFeatureMapEntry;
import org.eclipse.emf.teneo.jpox.mapper.AbstractMapper;
import org.eclipse.emf.teneo.jpox.mapper.MappingUtil;
import org.eclipse.emf.teneo.jpox.mapping.AnyTypeObject;
import org.eclipse.emf.teneo.simpledom.Element;
import org.eclipse.emf.teneo.util.StoreUtil;

/**
 * Maps a basic attribute with many=true, e.g. list of simpletypes.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.12 $
 */
public class ManyBasicMapper extends AbstractMapper implements ExtensionPoint {
	/** The logger for all these exceptions */
	protected static final Log log = LogFactory.getLog(ManyBasicMapper.class);

	/** Handles a many attribute */
	public void map(PAnnotatedEAttribute aAttribute, Element eclassElement) {
		log.debug("Processing one to many attribute: " + aAttribute.getModelElement().getName());
		Element field = eclassElement.addElement("field");
		field.addAttribute("name",
			namingHandler.correctName(mappingContext, (EStructuralFeature) aAttribute.getModelElement())).addAttribute(
			"persistence-modifier", "persistent");

		EAttribute eAttribute = (EAttribute) aAttribute.getModelElement();
		final boolean isArray =
				eAttribute.getEType().getInstanceClass() != null && eAttribute.getEType().getInstanceClass().isArray();

		Element join = null;
		if (isArray) {
			// handle arrays differently
			field.addElement("array");
			join = field.addElement("join");
			field.addElement("element");

			if (aAttribute.getJoinTable() != null && aAttribute.getJoinTable().getName() != null) {
				field.addAttribute("table", aAttribute.getJoinTable().getName());
			}
			return; // and return from here
		} else if (StoreUtil.isMixed(eAttribute)) {
			field.addElement("collection").addAttribute("element-type", AnyFeatureMapEntry.class.getName());
			join = field.addElement("join");
			MappingUtil.addFeatureMapEntryMapping(field);
		} else if (FeatureMapUtil.isFeatureMap(eAttribute)) {
			MappingUtil.addGenericFeatureMapEntryMapping(field, aAttribute, aAttribute.getOneToMany().getFetch());
		} else if (isArray) {
			field.addElement("array");
			join = field.addElement("join");
			field.addElement("element");
		} else {
			String elemType = aAttribute.getOneToMany().getTargetEntity();
			boolean isAnyType = false;
			if (elemType.indexOf(',') > -1) { // list of classes use anytypeobject for now
				elemType = AnyTypeObject.class.getName();
				isAnyType = true;
			} else if (elemType.indexOf(".") == -1) { // primitive type?
				elemType = getObjectClassName(elemType);
			}
			Element collection = field.addElement("collection").addAttribute("element-type", elemType);

			MappingUtil.addEagerLazyLoading(collection, aAttribute.getOneToMany().getFetch());

			// forces the elements to be placed in their own join table
			join = field.addElement("join");

			if (isAnyType) {
				MappingUtil.addAnytypeMapping(field);
			}
		}

		if (join != null && aAttribute.getJoinTable() != null && aAttribute.getJoinTable().getName() != null) {
			field.addAttribute("table", aAttribute.getJoinTable().getName());
		}

		Element order = field.addElement("order");
		order.addAttribute("column", namingHandler.getUniqueIndexColumnName(eAttribute));
	}

	/**
	 * Translate a primitive type name to its corresponding java Object name TODO: is there really
	 * no jdk function which does this?
	 */
	private String getObjectClassName(String primitive) {
		if (primitive.compareTo("boolean") == 0) {
			return Boolean.class.getName();
		}
		if (primitive.compareTo("int") == 0) {
			return Integer.class.getName();
		}
		if (primitive.compareTo("long") == 0) {
			return Long.class.getName();
		}
		if (primitive.compareTo("float") == 0) {
			return Float.class.getName();
		}
		if (primitive.compareTo("double") == 0) {
			return Double.class.getName();
		}
		if (primitive.compareTo("short") == 0) {
			return Short.class.getName();
		}
		if (primitive.compareTo("dateTime") == 0) {
			return Date.class.getName();
		}

		log.debug(primitive + " could not be translated to its Object type, returning passed value");
		return primitive;
	}
}