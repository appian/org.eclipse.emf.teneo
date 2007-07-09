/**
 * <copyright> Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal Davide Marchignoli Brian
 * Vetter </copyright> $Id: AbstractMapper.java,v 1.21 2007/07/09 17:43:20 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapper;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedETypedElement;
import org.eclipse.emf.teneo.annotations.pannotation.Column;
import org.eclipse.emf.teneo.annotations.pannotation.EnumType;
import org.eclipse.emf.teneo.annotations.pannotation.Enumerated;
import org.eclipse.emf.teneo.annotations.pannotation.JoinColumn;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationFactory;
import org.eclipse.emf.teneo.hibernate.hbannotation.Cache;
import org.eclipse.emf.teneo.hibernate.hbannotation.Index;
import org.eclipse.emf.teneo.hibernate.hbannotation.OnDelete;
import org.eclipse.emf.teneo.hibernate.hbannotation.OnDeleteAction;
import org.eclipse.emf.teneo.hibernate.hbannotation.Parameter;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEAttribute;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEDataType;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedETypeElement;
import org.eclipse.emf.teneo.mapping.strategy.EntityNameStrategy;
import org.eclipse.emf.teneo.simpledom.Element;
import org.eclipse.emf.teneo.util.EcoreDataTypes;

/**
 * Base class for all mapping classes. Provides access to the hbmcontext.
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
public abstract class AbstractMapper {

	/** logs it all */
	// private static final Log log = LogFactory.getLog(AbstractMapper.class);
	/** return the opposite of an association */
	protected PAnnotatedEReference getOtherSide(PAnnotatedEReference paReference) {
		// TODO assuming that mappedBy coincide with opposite, check in validation
		if (paReference.getAnnotatedEReference().getEOpposite() == null) {
			return null;
		}
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

	/** Handles the type or typedef annotations */
	protected void setType(PAnnotatedEAttribute paAttribute, Element propElement) {

		// handle the type annotation
		final HbAnnotatedEAttribute hea = (HbAnnotatedEAttribute) paAttribute;
		final EDataType ed = (EDataType) hea.getAnnotatedEAttribute().getEType();
		final HbAnnotatedEDataType hed = (HbAnnotatedEDataType) hea.getPaModel().getPAnnotated(ed);

		final String name;
		final List<Parameter> params;
		if (hea.getHbType() != null) {
			name = hea.getHbType().getType();
			params = hea.getHbType().getParameters();
		} else if (hed != null && hed.getHbTypeDef() != null) {
			name = hed.getHbTypeDef().getName();
			params = null;
		} else {
			name = null;
			params = null;
		}
		if (name != null) {
			if (params == null || params.isEmpty()) {
				// simple
				propElement.addAttribute("type", name);
			} else {
				final Element typeElement = propElement.addElement("type").addAttribute("name", name);
				for (Parameter param : params) {
					typeElement.addElement("param").addAttribute("name", param.getName()).addText(param.getValue());
				}
			}
		} else if (paAttribute.getEnumerated() != null) {
			handleEnumType(paAttribute, propElement);
		} else {
			final String hType = hbType(paAttribute);
			if (hType != null) {
				propElement.addAttribute("type", hType);
			} else {
				final Element typeElement =
						propElement.addElement("type").addAttribute("name", hbmContext.getDefaultUserType());
				typeElement.addElement("param").addAttribute("name", HbMapperConstants.EDATATYPE_PARAM).addText(
					paAttribute.getAnnotatedEAttribute().getEAttributeType().getName());
				typeElement.addElement("param").addAttribute("name", HbMapperConstants.EPACKAGE_PARAM).addText(
					paAttribute.getAnnotatedEAttribute().getEType().getEPackage().getNsURI());
			}
		}
	}

	/** Handle the enum type */
	private void handleEnumType(PAnnotatedEAttribute paAttribute, Element propElement) {
		final Enumerated enumerated = paAttribute.getEnumerated();
		assert (enumerated != null);
		final EAttribute eattr = paAttribute.getAnnotatedEAttribute();
		final EClassifier eclassifier = eattr.getEType();
		if (!getHbmContext().isGeneratedByEMF() && getHbmContext().getInstanceClass(eclassifier) != null) {
			final Class<?> instanceClass = getHbmContext().getInstanceClass(eclassifier);
			propElement.addElement("type").addAttribute("name", getEnumUserType(enumerated)).addElement("param")
				.addAttribute("name", HbMapperConstants.ENUM_CLASS_PARAM).addText(instanceClass.getName());
		} else if (getHbmContext().isGeneratedByEMF() && eclassifier.getInstanceClass() != null) {
			propElement.addElement("type").addAttribute("name", getEnumUserType(enumerated)).addElement("param")
				.addAttribute("name", HbMapperConstants.ENUM_CLASS_PARAM).addText(
					eclassifier.getInstanceClass().getName());
		} else { // must be emf dynamic
			final Element typeElement =
					propElement.addElement("type").addAttribute("name", hbDynamicEnumType(enumerated));
			typeElement.addElement("param").addAttribute("name", HbMapperConstants.ECLASSIFIER_PARAM).addText(
				eclassifier.getName());
			typeElement.addElement("param").addAttribute("name", HbMapperConstants.EPACKAGE_PARAM).addText(
				eclassifier.getEPackage().getNsURI());
		}

	}

	/**
	 * @return Returns the hibernate name for the given Ecore data type.
	 * @throws MappingException
	 *             if no corresponding hb type is defined.
	 */
	protected String hbType(PAnnotatedEAttribute paAttribute) {
		final EAttribute eAttribute = paAttribute.getAnnotatedEAttribute();
		final HbAnnotatedEDataType hed =
				(HbAnnotatedEDataType) paAttribute.getPaModel().getPAnnotated(eAttribute.getEAttributeType());
		final EDataType eDataType = paAttribute.getAnnotatedEAttribute().getEAttributeType();
		if (hed != null && hed.getHbTypeDef() != null) {
			return hed.getHbTypeDef().getName();
		} else if (paAttribute.getLob() != null) {
			if (EcoreDataTypes.INSTANCE.isByteArray(eDataType)) {
				return "binary";
			} else if (EcoreDataTypes.INSTANCE.isEString(eDataType)) {
				return "text";
			} else {
				throw new MappingException("Lob annotations can only be used with Strings or byte arrays. " +
						"Attribute is of type: " + eDataType);
			}
		} else if (EcoreDataTypes.INSTANCE.isEWrapper(eDataType) || EcoreDataTypes.INSTANCE.isEPrimitive(eDataType)) {
			return eDataType.getInstanceClassName();
		} else if (EcoreDataTypes.INSTANCE.isEString(eDataType)) {
			return eDataType.getInstanceClassName();
		} else if (EcoreDataTypes.INSTANCE.isEDateTime(eDataType)) {
			return getEDateTimeClass(eDataType);
		} else if (EcoreDataTypes.INSTANCE.isEDate(eDataType)) {
			return getEDateClass(eDataType);
		} else if (eDataType.getInstanceClass() != null && eDataType.getInstanceClass() == Object.class) {
			// null forces caller to use usertype
			return null; // "org.eclipse.emf.teneo.hibernate.mapping.DefaultToStringUserType";
		} else if (eDataType.getInstanceClass() != null) {
			return eDataType.getInstanceClassName();
		} else {
			// all edatatypes are translatable to a string, done by caller
			return null; // "org.eclipse.emf.teneo.hibernate.mapping.DefaultToStringUserType";
		}
	}

	/** Returns the correct enum primitive hibernate type, for Elver this is a hibernate user type. */
	public String getEnumUserType(Enumerated enumerated) {
		if (EnumType.STRING == enumerated.getValue()) {
			return getHbmContext().getEnumUserType();
		} else {
			return getHbmContext().getEnumIntegerUserType();
		}
	}

	/** Returns the correct enum primitive hibernate type, for Elver this is a hibernate user type. */
	protected String hbDynamicEnumType(Enumerated enumerated) {
		if (EnumType.STRING == enumerated.getValue()) {
			return getHbmContext().getDynamicEnumUserType();
		} else {
			return getHbmContext().getDynamicEnumIntegerUserType();
		}
	}

	/*
	 * @return The name of the java class needed to map the date type
	 */
	public String getEDateClass(EDataType eDataType) {
		assert (EcoreDataTypes.INSTANCE.isEDate(eDataType));

		if (XMLTypePackage.eINSTANCE.getDate().equals(eDataType)) {
			return getHbmContext().getXSDDateUserType();
		}

		// only override if the user did not specify a more specific class
		if (eDataType.getInstanceClass() == Object.class ||
				(eDataType.getInstanceClassName() != null && eDataType.getInstanceClassName().compareTo(
					"javax.xml.datatype.XMLGregorianCalendar") == 0)) {
			// EMF returns an XSD Date type as an Object instance. go figure.
			// note that I would prefer to use the class instance to get the name
			// but for other reasons I do not want to have references to the
			// org.eclipse.emf.teneo.hibernate plugin.
			return getHbmContext().getXSDDateUserType();
		}
		// TODO: should it not use the eDataType.getInstanceClass()? Hmm if the user
		// really wants a different mapping he/she should use maybe a usertype??
		return Date.class.getName();
	}

	/*
	 * @return The name of the java class needed to map the datetime/timestamp type
	 */
	public String getEDateTimeClass(EDataType eDataType) {
		assert (EcoreDataTypes.INSTANCE.isEDateTime(eDataType));

		if (XMLTypePackage.eINSTANCE.getDateTime().equals(eDataType)) {
			return getHbmContext().getXSDDateTimeUserType();
		}

		if (eDataType.getInstanceClass() == Object.class) {
			// EMF returns an XSD Date type as an Object instance. go figure.
			// note that I would prefer to use the class instance to get the name
			// but for other reasons I do not want to have references to the
			// org.eclipse.emf.teneo.hibernate plugin.
			return getHbmContext().getXSDDateTimeUserType();
		}
		// TODO: should it not use the eDataType.getInstanceClass()? Hmm if the user
		// really wants a different mapping he/she should use maybe a usertype??
		return Timestamp.class.getName();
	}

	/**
	 * Returns the (possibly overridden) JoinColumns annotations for the given reference or an empty
	 * list if no JoinColumns were defined.
	 */
	protected List<JoinColumn> getJoinColumns(PAnnotatedEReference paReference) {
		List<JoinColumn> joinColumns = getHbmContext().getOverride(paReference);
		if (joinColumns == null) {
			return paReference.getJoinColumns();
		}
		return joinColumns;
	}

	/** Adds a cache element */
	protected void addCacheElement(Element parent, Cache cache) {
		// translate to hibernate specific notation
		final String usage = cache.getUsage().getName().toLowerCase().replaceAll("_", "-");

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
	protected void addColumns(PAnnotatedETypedElement pet, Element propertyElement, String defaultName,
			List<Column> columns, boolean isNullable, boolean setColumnAttributesInProperty) {
		addColumns(pet, propertyElement, defaultName, columns, isNullable, setColumnAttributesInProperty, false);
	}

	/** Same as above only handles multiple columns */
	protected void addColumns(PAnnotatedETypedElement pet, Element propertyElement, String defaultName,
			List<Column> columns, boolean isNullable, boolean setColumnAttributesInProperty, boolean isUnique) {
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
			col.setName(hbmContext.trunc(name));
			col.setNullable(isNullable);
			col.setUnique(isUnique);
			columns.add(col);
		}
		for (Column column : columns) {
			addColumn(pet, propertyElement, defaultName, column, isNullable, setColumnAttributesInProperty);
		}
	}

	/** Adds anytype columns */
	protected List<Column> getAnyTypeColumns(String featureName, boolean isNullable) {
		final ArrayList<Column> result = new ArrayList<Column>();
		final Column typeColumn = PannotationFactory.eINSTANCE.createColumn();
		typeColumn.setName(hbmContext.trunc(featureName + "_type"));
		typeColumn.setNullable(isNullable);
		result.add(typeColumn);
		final Column idColumn = PannotationFactory.eINSTANCE.createColumn();
		idColumn.setName(hbmContext.trunc(featureName + "_id"));
		idColumn.setNullable(isNullable);
		result.add(idColumn);
		return result;
	}

	/**
	 * Returns the (possibly overridden) columns annotation for the given attribute.
	 */
	protected List<Column> getColumns(PAnnotatedEAttribute paAttribute) {
		final Column defaultColumn = paAttribute.getColumn();
		final Column oc = getHbmContext().getOverride(paAttribute);

		if (oc != null) {
			final ArrayList<Column> result = new ArrayList<Column>();
			result.add(oc);
			return result;
		}
		// try multiple columns
		final HbAnnotatedEAttribute hae = (HbAnnotatedEAttribute) paAttribute;
		if (hae.getHbColumns().size() > 0) {
			return hae.getHbColumns();
		}
		final ArrayList<Column> result = new ArrayList<Column>();
		if (defaultColumn != null) {
			result.add(defaultColumn);
		}
		return result;
	}

	/** Sets property attributes on the basis of the column */
	private void addColumn(PAnnotatedETypedElement pet, Element propertyElement, String defaultName, Column column,
			boolean isNullable, boolean setColumnAttributesInProperty) {
		if (column != null) {
			if (setColumnAttributesInProperty) {
				// this is not the nicest place to do this
				if (propertyElement.getName().compareTo("property") == 0 ||
						propertyElement.getName().compareTo("many-to-one") == 0) {
					propertyElement.addAttribute("insert", column.isInsertable() ? "true" : "false");
					propertyElement.addAttribute("update", column.isUpdatable() ? "true" : "false");
				}
				// MT: I think that the column nullability should not be used for setting not-null
				// on the property, this is already specified by the optional attribute on the
				// basic annotation. Maybe a check can be used instead to detect inconsistenties
				// in the column attributes and the basic ann.
				// Note that the ejb3 spec says that optional should be disregarded for primitive
				// types which I
				// do not understand.
				// I disabled it for now to ignore for the test cases.
				// MT05032006: After some more thought the column nullability can be used in case of
				// single table inheritance mapping
				propertyElement.addAttribute("not-null", isNullable || column.isNullable() ? "false" : "true");
				propertyElement.addAttribute("unique", column.isUnique() ? "true" : "false");
			}
			addColumnElement(pet, propertyElement, defaultName, column, isNullable);
		}
	}

	/**
	 * Add a columnelement to the property, takes into account length, precision etc. forceNullable
	 * is set when the feature belongs to a featuremap
	 */
	private void addColumnElement(PAnnotatedETypedElement pet, Element propertyElement, String defaultName,
			Column column, boolean forceNullable) {
		if (column != null) {
			Element columnElement =
					propertyElement.addElement("column").addAttribute("not-null",
						column.isNullable() || forceNullable ? "false" : "true").addAttribute("unique",
						column.isUnique() ? "true" : "false");
			final String name;
			if (column.getName() != null) {
				name = column.getName();
			} else {
				name = defaultName;
			}
			columnElement.addAttribute("name", getHbmContext().trunc(name));
			if (column.isSetLength()) {
				columnElement.addAttribute("length", Integer.toString(column.getLength()));
			}
			if (column.isSetPrecision()) {
				columnElement.addAttribute("precision", Integer.toString(column.getPrecision()));
			}
			if (column.isSetScale()) {
				columnElement.addAttribute("scale", Integer.toString(column.getScale()));
			}
			if (column.getColumnDefinition() != null) {
				columnElement.addAttribute("sql-type", column.getColumnDefinition());
			}
			final String uc = getHbmContext().getUniqueConstraintKey(name);
			if (uc != null) {
				columnElement.addAttribute("unique-key", uc);
			}
			if (pet instanceof HbAnnotatedETypeElement && ((HbAnnotatedETypeElement) pet).getHbIndex() != null) {
				final Index index = ((HbAnnotatedETypeElement) pet).getHbIndex();
				columnElement.addAttribute("index", index.getName());
			}
		}
	}

	/** Add the ondelete mapping to the key */
	protected void handleOndelete(Element keyElement, OnDelete onDelete) {
		if (true || onDelete == null) {
			return;
		}

		if (onDelete.getAction().equals(OnDeleteAction.CASCADE)) {
			keyElement.addAttribute("on-delete", "cascade");
		} else {
			keyElement.addAttribute("on-delete", "noaction");
		}
	}

	/** Returns true if the target is the general EObject type */
	protected boolean isEObject(String typeName) {
		if (typeName == null) {
			return false;
		}
		return typeName.compareTo(EntityNameStrategy.EOBJECT_ECLASS_NAME) == 0;
	}
}