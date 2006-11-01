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
 * $Id: AbstractPropertyMapper.java,v 1.1 2006/11/01 16:18:42 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapper;

import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pannotation.Column;
import org.eclipse.emf.teneo.annotations.pannotation.EnumType;
import org.eclipse.emf.teneo.annotations.pannotation.Enumerated;
import org.eclipse.emf.teneo.simpledom.Element;

/**
 * Base class for basic, enum, id etc. mappers. Mainly provides convenience methods.
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
class AbstractPropertyMapper extends AbstractMapper {

	/**
	 * @param hbmContext
	 */
	public AbstractPropertyMapper(MappingContext hbmContext) {
		super(hbmContext);
	}

	/** Sets property attributes on the basis of the column */
	protected void addColumn(Element propertyElement, String defaultName, Column column, boolean forceNullable,
			boolean isId) {
		if (column != null) {
			if (!isId) {
				propertyElement.addAttribute("insert", column.isInsertable() ? "true" : "false");
				propertyElement.addAttribute("update", column.isUpdatable() ? "true" : "false");

				// MT: I think that the column nullability should not be used for setting not-null
				// on the property, this is already specified by the optional attribute on the
				// basic annotation. Maybe a check can be used instead to detect inconsistenties
				// in the column attributes and the basic ann.
				// Note that the ejb3 spec says that optional should be disregarded for primitive types which I
				// do not understand.
				// I disabled it for now to ignore for the test cases.
				// MT05032006: After some more thought the column nullability can be used in case of
				// single table inheritance mapping
				propertyElement.addAttribute("not-null", column.isNullable() ? "false" : "true");
				propertyElement.addAttribute("unique", column.isUnique() ? "true" : "false");
			}
			addColumnElement(propertyElement, defaultName, column, forceNullable);

		} else if (getHbmContext().getEmbeddingFeature() != null) { // embedded
			// TODO: check illegal, embedded component can not really have an id
			final PAnnotatedEReference pae = getHbmContext().getEmbeddingFeature();
			final String name = pae.getAnnotatedEReference().getName() + "_" + defaultName;
			propertyElement.addAttribute("column", getHbmContext().trunc(name));
		} else {
			propertyElement.addAttribute("column", getHbmContext().trunc(defaultName));
		}
	}

	/** Returns the correct enum primitive hibernate type, for Elver this is a hibernate user type. */
	protected String hbEnumType(Enumerated enumerated) {
		final String typeName;
		if (EnumType.STRING == enumerated.getValue().getValue()) {
			typeName = "org.eclipse.emf.teneo.hibernate.mapping.ENumUserType";
		} else {
			typeName = "org.eclipse.emf.teneo.hibernate.mapping.ENumUserIntegerType";
		}
		return typeName;
	}

	/** Returns the correct enum primitive hibernate type, for Elver this is a hibernate user type. */
	protected String hbDynamicEnumType(Enumerated enumerated) {
		final String typeName;
		if (EnumType.STRING == enumerated.getValue().getValue()) {
			typeName = "org.eclipse.emf.teneo.hibernate.mapping.DynamicENumUserType";
		} else {
			typeName = "org.eclipse.emf.teneo.hibernate.mapping.DynamicENumUserIntegerType";
		}
		return typeName;
	}
}
