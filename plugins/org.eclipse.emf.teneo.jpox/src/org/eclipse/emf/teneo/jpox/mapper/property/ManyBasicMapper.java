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
 * </copyright>
 *
 * $Id: ManyBasicMapper.java,v 1.2 2006/08/14 05:09:18 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.mapper.property;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.teneo.simpledom.Element;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.jpox.emf.elist.AnyFeatureMapEntry;
import org.eclipse.emf.teneo.jpox.emf.mapping.AnyTypeObject;
import org.eclipse.emf.teneo.jpox.mapper.AbstractMapper;
import org.eclipse.emf.teneo.jpox.mapper.MappingContext;
import org.eclipse.emf.teneo.jpox.mapper.MappingUtil;
import org.eclipse.emf.teneo.util.StoreUtil;

/**
 * Maps a basic attribute with many=true, e.g. list of simpletypes.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class ManyBasicMapper extends AbstractMapper {
	/** The logger for all these exceptions */
	protected static final Log log = LogFactory.getLog(ManyBasicMapper.class);

	/** Constructor */
	public ManyBasicMapper(MappingContext mappingContext) {
		super(mappingContext);
	}

	/** Handles a many attribute */
	public void map(PAnnotatedEAttribute aAttribute, Element eclassElement) {
		log.debug("Processing one to many attribute: " + aAttribute.getAnnotatedElement().getName());
		Element field = eclassElement.addElement("field");
		field.addAttribute("name", namingHandler.correctName(mappingContext, (EStructuralFeature) aAttribute.getAnnotatedElement())).addAttribute(
				"persistence-modifier", "persistent");

		EAttribute eAttribute = (EAttribute) aAttribute.getAnnotatedElement();

		if (eAttribute.getEType().getInstanceClass() != null && eAttribute.getEType().getInstanceClass().isArray()) {
			// handle arrays differently
			field.addAttribute("embedded", "true");
			field.addElement("array").addAttribute("embedded-element", "true");
			return; // and return from here
		} else if (StoreUtil.isMixed(eAttribute)) {
			field.addElement("collection").addAttribute("element-type", AnyFeatureMapEntry.class.getName());
			field.addElement("join");
			MappingUtil.addFeatureMapEntryMapping(field);
		} else if (FeatureMapUtil.isFeatureMap(eAttribute)) {
			MappingUtil.addGenericFeatureMapEntryMapping(field, aAttribute, aAttribute.getOneToMany().getFetch());
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
			field.addElement("join");

			if (isAnyType) {
				MappingUtil.addAnytypeMapping(field);
			}
		}
		
		Element order = field.addElement("order");
		order.addAttribute("column", namingHandler.getUniqueIndexColumnName(eAttribute));
	}
	
	/** Translate a primitive type name to its corresponding java Object name 
	 * TODO: is there really no jdk function which does this?
	 * */
	private String getObjectClassName(String primitive) {
		if (primitive.compareTo("boolean") == 0) return Boolean.class.getName();
		if (primitive.compareTo("int") == 0) return Integer.class.getName();
		if (primitive.compareTo("long") == 0) return Long.class.getName();
		if (primitive.compareTo("float") == 0) return Float.class.getName();
		if (primitive.compareTo("double") == 0) return Double.class.getName();
		if (primitive.compareTo("short") == 0) return Short.class.getName();
		if (primitive.compareTo("dateTime") == 0) return Date.class.getName();
		
		log.debug(primitive + " could not be translated to its Object type, returning passed value");
		return primitive;
	}
}