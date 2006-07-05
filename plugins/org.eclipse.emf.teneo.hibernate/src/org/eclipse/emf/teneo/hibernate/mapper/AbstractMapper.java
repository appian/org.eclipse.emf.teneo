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
 * $Id: AbstractMapper.java,v 1.1 2006/07/05 22:29:30 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapper;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEModelElement;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pannotation.Column;
import org.eclipse.emf.teneo.annotations.pannotation.PAnnotation;
import org.eclipse.emf.teneo.annotations.processing.ProcessingException;
import org.eclipse.emf.teneo.annotations.util.EcoreDataTypes;
import org.eclipse.emf.teneo.simpledom.Element;

/**
 * Base class for all mapping classes. Provides access to the hbmcontext.
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
abstract class AbstractMapper {

	/** logs it all */
	private static final Log log = LogFactory.getLog(AbstractMapper.class);

	/**
	 * @return Returns the hibernate name for the given Ecore data type.
	 * @throws ProcessingException
	 *             if no corresponding hb type is defined.
	 */
	protected static String hbType(EDataType eDataType) {
		// externalise this typesource
		final String typeSource = "http://annotations.hibernate.org/Type";
		if (eDataType.getEAnnotation(typeSource) != null) {
			return (String) eDataType.getEAnnotation(typeSource).getDetails().get("type");
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
			// throw new ProcessingException("Do not know how to handle type " + eDataType);
		}
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
	 * @return Returns true if and only if the given structural feature needs an extra column to store its isSet status.
	 */
	private boolean needsIsSetColumn(PAnnotatedEStructuralFeature paAttribute) {
		// TODO change org.eclipse.emf.teneo.hibernate.mapping.EFeaturePropertyHandler so to use null for !eIsSet
		return paAttribute.getAnnotatedEStructuralFeature().isUnsettable();
	}

	/**
	 * Returns the (possibly overridden) column annotation for the given attribute.
	 */
	protected Column getColumn(PAnnotatedEAttribute paAttribute) {
		final Column defaultColumn = paAttribute.getColumn();
		final Column oc = getHbmContext().getOverride(paAttribute);
		return (oc == null) ? defaultColumn : oc;
	}

	/**
	 * Returns the (possibly overridden) JoinColumns annotations for the given reference or an empty list if no
	 * JoinColumns were defined.
	 */
	protected List getJoinColumns(PAnnotatedEReference paReference) {
		List joinColumns = getHbmContext().getOverride(paReference);
		if (joinColumns == null) {
			if (paReference.getJoinColumns() == null) {
				joinColumns = new ArrayList();
			} else {
				joinColumns = paReference.getJoinColumns().getValue();
			}
		}
		return joinColumns;
	}

	/**
	 * Add to the mapping an isSet column for the given structural feature.
	 */
	protected void addIsSetAttribute(PAnnotatedEStructuralFeature paAttribute) {
		if (true)
			return; // do nothing for now
		// TODO change org.eclipse.emf.teneo.hibernate.mapping.EFeaturePropertyHandler so to use null for !eIsSet
		if (needsIsSetColumn(paAttribute)) {
			getHbmContext().getCurrent().addElement("property").addAttribute("name",
					paAttribute.getAnnotatedEStructuralFeature().getName() + "ESet").addAttribute("access", "field")
			// TODO use custom accessor
					.addAttribute("type", hbType(EcorePackage.eINSTANCE.getEBoolean())).addAttribute("not-null",
							"false");
		}
	}

	/** Generic method to log and throw error situation */
	public void processIllFormed(PAnnotatedEModelElement paElement, String cause, PAnnotation offendingAnnotation) {
		log.error(cause + " on " + paElement);
		throw new ProcessingException(cause, offendingAnnotation);
	}

	/**
	 * Add a columnelement to the property, takes into account length, precision etc. forceNullable is set when the
	 * feature belongs to a featuremap
	 */
	protected void addColumnElement(Element propertyElement, String defaultName, Column column, boolean forceNullable) {
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
