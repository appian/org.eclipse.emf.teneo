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
 * $Id: AbstractMapper.java,v 1.4 2006/11/13 19:55:09 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pannotation.Column;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationFactory;
import org.eclipse.emf.teneo.hibernate.hbannotation.Cache;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEAttribute;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEDataType;
import org.eclipse.emf.teneo.simpledom.Element;
import org.eclipse.emf.teneo.util.EcoreDataTypes;

/**
 * Base class for all mapping classes. Provides access to the hbmcontext.
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
abstract class AbstractMapper {

	/** logs it all */
	// private static final Log log = LogFactory.getLog(AbstractMapper.class);
	/** return the opposite of an association */
	protected PAnnotatedEReference getOtherSide(PAnnotatedEReference paReference) {
		// TODO assuming that mappedBy coincide with opposite, check in validation
		return paReference.getPaModel().getPAnnotated(paReference.getAnnotatedEReference().getEOpposite());
	}

	/** The mapping context of this mapping action */
	protected final MappingContext hbmContext;

	/** Constructor */
	public AbstractMapper(final MappingContext hbmContext) {
		this.hbmContext = hbmContext;
	}

	/**
	 * @return The mapping context used by this mapper
	 */
	protected MappingContext getHbmContext() {
		return hbmContext;
	}

	/**
	 * @return Returns the hibernate name for the given Ecore data type.
	 * @throws MappingException
	 *             if no corresponding hb type is defined.
	 */
	protected String hbType(PAnnotatedEAttribute paAttribute) {
		final EAttribute eAttribute = paAttribute.getAnnotatedEAttribute();
		final HbAnnotatedEDataType hed = (HbAnnotatedEDataType) paAttribute.getPaModel().getPAnnotated(
				eAttribute.getEAttributeType());
		final EDataType eDataType = paAttribute.getAnnotatedEAttribute().getEAttributeType();
		if (hed != null && hed.getHbTypeDef() != null) {
			return hed.getHbTypeDef().getName();
		} else if (EcoreDataTypes.INSTANCE.isEWrapper(eDataType) || EcoreDataTypes.INSTANCE.isEPrimitive(eDataType)) {
			return eDataType.getInstanceClassName();
		} else if (EcoreDataTypes.INSTANCE.isEString(eDataType)) {
			return eDataType.getInstanceClassName();
		} else if (EcoreDataTypes.INSTANCE.isEDate(eDataType)) {
			return "java.util.Date";
		} else if (eDataType.getInstanceClass() == Object.class) {
			return "serializable"; // MT: this is sometimes the best/robust approach
		} else if (eDataType.getInstanceClass() != null) {
			return eDataType.getInstanceClassName();
		} else {
			return "serializable"; // MT: this is sometimes the best/robust approach
			// throw new MappingException("Do not know how to handle type " + eDataType);
		}
	}

	/**
	 * Returns the (possibly overridden) JoinColumns annotations for the given reference or an empty list if no
	 * JoinColumns were defined.
	 */
	protected List getJoinColumns(PAnnotatedEReference paReference) {
		List joinColumns = getHbmContext().getOverride(paReference);
		if (joinColumns == null) {
			return paReference.getJoinColumns();
		}
		return joinColumns;
	}

	/** Adds a cache element */
	protected void addCacheElement(Element parent, Cache cache) {
		// translate to hibernate specific notation
		final String usage = cache.getUsage().getName().toLowerCase().replaceAll("_", "-");

		// note a trick because the name of the
		Element cacheElement = parent.addElement("cache").addAttribute("usage", usage);
		if (cache.getRegion() != null) {
			cacheElement.addAttribute("region", cache.getRegion());
		}
		if (cache.getInclude() != null) {
			cacheElement.addAttribute("include", cache.getInclude());
		}
		parent.remove(cacheElement);
		parent.add(0, cacheElement);
	}

	/** Same as above only handles multiple columns */
	protected void addColumns(Element propertyElement, String defaultName, List columns, boolean isNullable,
			boolean setColumnAttributesInProperty) {
		// if no columns set then use some default
		if (columns.isEmpty()) {
			final String name;
			if (getHbmContext().getEmbeddingFeature() != null) { // embedded
				// TODO: check illegal, embedded component can not really have an id
				final PAnnotatedEReference pae = getHbmContext().getEmbeddingFeature();
				name = getHbmContext().trunc(pae.getAnnotatedEReference().getName() + "_" + defaultName);
			} else {
				name = getHbmContext().trunc(defaultName);
			}
			final Column col = PannotationFactory.eINSTANCE.createColumn();
			col.setName(name);
			col.setNullable(isNullable);
			columns.add(col);
		}
		for (Iterator it = columns.iterator(); it.hasNext();) {
			final Column column = (Column) it.next();
			addColumn(propertyElement, defaultName, column, isNullable, setColumnAttributesInProperty);
		}
	}

	/**
	 * Returns the (possibly overridden) columns annotation for the given attribute.
	 */
	protected List getColumns(PAnnotatedEAttribute paAttribute) {
		final Column defaultColumn = paAttribute.getColumn();
		final Column oc = getHbmContext().getOverride(paAttribute);

		if (oc != null) {
			final ArrayList result = new ArrayList();
			result.add(oc);
			return result;
		}
		// try multiple columns
		final HbAnnotatedEAttribute hae = (HbAnnotatedEAttribute) paAttribute;
		if (hae.getHbColumns().size() > 0) {
			return hae.getHbColumns();
		}
		final ArrayList result = new ArrayList();
		if (defaultColumn != null) {
			result.add(defaultColumn);
		}
		return result;
	}

	/** Sets property attributes on the basis of the column */
	private void addColumn(Element propertyElement, String defaultName, Column column, boolean isNullable,
			boolean setColumnAttributesInProperty) {
		if (column != null) {
			if (setColumnAttributesInProperty) {
				// this is not the nicest place to do this
				if (propertyElement.getName().compareTo("property") == 0
						|| propertyElement.getName().compareTo("many-to-one") == 0) {
					propertyElement.addAttribute("insert", column.isInsertable() ? "true" : "false");
					propertyElement.addAttribute("update", column.isUpdatable() ? "true" : "false");
				}
				// MT: I think that the column nullability should not be used for setting not-null
				// on the property, this is already specified by the optional attribute on the
				// basic annotation. Maybe a check can be used instead to detect inconsistenties
				// in the column attributes and the basic ann.
				// Note that the ejb3 spec says that optional should be disregarded for primitive types which I
				// do not understand.
				// I disabled it for now to ignore for the test cases.
				// MT05032006: After some more thought the column nullability can be used in case of
				// single table inheritance mapping
				propertyElement.addAttribute("not-null", isNullable || column.isNullable() ? "false" : "true");
				propertyElement.addAttribute("unique", column.isUnique() ? "true" : "false");
			}
			addColumnElement(propertyElement, defaultName, column, isNullable);
		}
	}

	/**
	 * Add a columnelement to the property, takes into account length, precision etc. forceNullable is set when the
	 * feature belongs to a featuremap
	 */
	private void addColumnElement(Element propertyElement, String defaultName, Column column, boolean forceNullable) {
		if (column != null) {
			Element columnElement = propertyElement.addElement("column").addAttribute("not-null",
					column.isNullable() || forceNullable ? "false" : "true").addAttribute("unique",
					column.isUnique() ? "true" : "false");
			final String name;
			if (column.getName() != null) {
				name = column.getName();
			} else {
				name = defaultName;
			}
			columnElement.addAttribute("name", getHbmContext().trunc(name));
			if (column.isSetLength())
				columnElement.addAttribute("length", Integer.toString(column.getLength()));
			if (column.isSetPrecision())
				columnElement.addAttribute("precision", Integer.toString(column.getPrecision()));
			if (column.isSetScale())
				columnElement.addAttribute("scale", Integer.toString(column.getScale()));
			if (column.getColumnDefinition() != null) {
				columnElement.addAttribute("sql-type", column.getColumnDefinition());
			}
			final String uc = getHbmContext().getUniqueConstraintKey(name);
			if (uc != null) {
				columnElement.addAttribute("unique-key", uc);
			}
		}
	}
}