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
 *   Davide Marchignoli
 * </copyright>
 *
 * $Id: IdMapper.java,v 1.10 2007/04/07 12:44:07 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapper;

import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;
import org.eclipse.emf.teneo.annotations.pannotation.Column;
import org.eclipse.emf.teneo.annotations.pannotation.GeneratedValue;
import org.eclipse.emf.teneo.annotations.pannotation.GenerationType;
import org.eclipse.emf.teneo.annotations.pannotation.SequenceGenerator;
import org.eclipse.emf.teneo.annotations.pannotation.TableGenerator;
import org.eclipse.emf.teneo.hibernate.hbannotation.GenericGenerator;
import org.eclipse.emf.teneo.hibernate.hbannotation.Parameter;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEPackage;
import org.eclipse.emf.teneo.simpledom.DocumentHelper;
import org.eclipse.emf.teneo.simpledom.Element;

/**
 * Mapper generating id entry for Hibernate from PAnnotatedElements. Throws an
 * error if called for non-root entities.
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
class IdMapper extends AbstractPropertyMapper {

	/** The logger */
	private static final Log log = LogFactory.getLog(IdMapper.class);

	/** the hibernate generator class names */
	private static final String[] GENERATOR_CLASS_NAMES;

	/** initializes the hibernate class names array */
	static {
		GENERATOR_CLASS_NAMES = new String[GenerationType.VALUES.size()];
		GENERATOR_CLASS_NAMES[GenerationType.AUTO] = "native";
		GENERATOR_CLASS_NAMES[GenerationType.IDENTITY] = "identity";
		GENERATOR_CLASS_NAMES[GenerationType.SEQUENCE] = "sequence";
		GENERATOR_CLASS_NAMES[GenerationType.TABLE] = "hilo";
	}

	/** Util method to create an id or composite-id element */
	public static Element getCreateIdElement(Element entityElement,
			PAnnotatedEClass aClass) {
		if (aClass.getIdClass() != null) { // composite id
			Element element = entityElement.element("composite-id");
			if (element == null) {
				element = DocumentHelper.createElement("composite-id")
						.addAttribute("class", aClass.getIdClass().getValue())
						.addAttribute("mapped", "true");
				entityElement.add(0, element);
			}
			return element;
		} else {
			Element element = entityElement.element("id");
			if (element == null) {
				element = DocumentHelper.createElement("id");
				entityElement.add(0, element);
			}
			return element;
		}
	}

	/**
	 * Add synthetic id to the class
	 */
	public static Element addSyntheticId(MappingContext mc,
			Element entityElement) {
		if (entityElement.element("id") != null
				|| entityElement.element("composite-id") != null) {
			throw new MappingException(
					"Syntheticid should only be called if there is no id element");
		}

		final Element idElement = DocumentHelper.createElement("id");
		entityElement.add(0, idElement);
		idElement
				.addAttribute("type", "long")
				.
				// NOTE: the name is also set so that the property name can be
				// used later to identify an id prop,
				// TODO: improve this
				addAttribute("name", mc.getIdColumnName()).addAttribute(
						"column", mc.getIdColumnName()).addElement("generator")
				.addAttribute("class", "native");

		final Element meta = new Element("meta");
		meta.addAttribute("attribute", HbMapperConstants.ID_META).addText(
				"true");
		idElement.add(0, meta);

		idElement.addAttribute("access", mc.getIdPropertyHandlerName());

		return idElement;
	}

	/**
	 * @param hbmContext
	 */
	public IdMapper(MappingContext hbmContext) {
		super(hbmContext);
	}

	/**
	 * @return Returns the hibernate generator class for the given strategy.
	 */
	private static String hbGeneratorClass(GenerationType strategy) {
		return IdMapper.GENERATOR_CLASS_NAMES[strategy != null ? strategy
				.getValue() : GenerationType.AUTO];
	}

	/**
	 * Process embedded id.
	 */
	public void processEmbeddedId(PAnnotatedEReference aReference) {
		final EReference eReference = aReference.getAnnotatedEReference();
		final PAnnotatedEClass aClass = aReference.getPaModel().getPAnnotated(
				eReference.getEReferenceType());
		final Element compositeIdElement = getHbmContext().getCurrent()
				.addElement("composite-id");
		compositeIdElement.addAttribute("name", eReference.getName());
		final String className = getHbmContext().getInstanceClassName(
				aClass.getAnnotatedEClass());
		compositeIdElement.addAttribute("class", className);
		getHbmContext().setCurrent(compositeIdElement);
		for (PAnnotatedEStructuralFeature aFeature : aClass
				.getPaEStructuralFeatures()) {
			if (!(aFeature instanceof PAnnotatedEAttribute)) {
				continue;
			}
			PAnnotatedEAttribute aAttribute = (PAnnotatedEAttribute) aFeature;
			final Element keyPropertyElement = compositeIdElement
					.addElement("key-property");
			keyPropertyElement.addAttribute("name", aFeature
					.getAnnotatedEStructuralFeature().getName());
			addColumns(keyPropertyElement, aAttribute.getAnnotatedEAttribute()
					.getName(), getColumns(aAttribute), getHbmContext()
					.isCurrentElementFeatureMap(), false);
			setType(aAttribute, keyPropertyElement);
		}
		getHbmContext().setCurrent(compositeIdElement.getParent());
	}

	/**
	 * Add property to the mapped id element
	 */
	public void processIdProperty(PAnnotatedEAttribute id) {
		final PAnnotatedEClass aClass = id.getPaEClass();

		// check precondition
		if (aClass.getPaSuperEntity() != null
				&& aClass.getPaSuperEntity().hasIdAnnotatedFeature()) {
			log
					.error("The annotated eclass: "
							+ aClass
							+ " has an id-annotated feature: "
							+ id
							+ " while it has a "
							+ "superclass/type, id properties should always be specified in the top of the inheritance structure");
			throw new MappingException(
					"The annotated eclass: "
							+ aClass
							+ " has an id-annotated feature: "
							+ id
							+ " while it has a "
							+ "superclass/type, id properties should always be specified in the top of the inheritance structure");
		}

		final EAttribute eAttribute = id.getAnnotatedEAttribute();
		final List<Column> columns = getColumns(id);
		final GeneratedValue generatedValue = id.getGeneratedValue();

		// if (column != null && column.getColumnDefinition() != null) {
		// // TODO support
		// log.error("Unsupported, ColumnDefinition in " + column);
		// throw new MappingException("Unsupported, ColumnDefinition", column);
		// }
		// if (column != null && column.getTable() != null) {
		// // TODO support
		// log.error("Unsupported, SecondaryTable in " + column);
		// throw new MappingException("Unsupported, SecondaryTable", column);
		// }

		final Element idElement = getCreateIdElement(getHbmContext()
				.getCurrent(), aClass);
		final boolean isCompositeId = aClass.getIdClass() != null;

		final Element usedIdElement;
		if (isCompositeId) {
			usedIdElement = idElement.addElement("key-property");
		} else {
			usedIdElement = idElement;
		}

		// if idclass != null then this is a composite id which can not have a unique constraint
		// on an id column
		addColumns(usedIdElement, eAttribute.getName(), columns, false, false,
				aClass.getIdClass() == null);  

		usedIdElement.addAttribute("name", eAttribute.getName());
		if (id.getEnumerated() == null) {
			setType(id, usedIdElement);
		} else { // enumerated id
			final EClassifier eclassifier = id.getAnnotatedEAttribute()
					.getEType();
			if (!getHbmContext().isGeneratedByEMF()
					&& !getHbmContext().isDynamic(eclassifier)) {
				final String typeName = getEnumUserType(id.getEnumerated());
				final Class<?> instanceClass = getHbmContext()
						.getInstanceClass(eclassifier);
				usedIdElement.addElement("type").addAttribute("name", typeName)
						.addElement("param").addAttribute("name",
								"enumClassName").addText(
								instanceClass.getName());
			} else if (!getHbmContext().isGeneratedByEMF()
					&& getHbmContext().isDynamic(eclassifier)) {
				throw new UnsupportedOperationException(
						"DYNAMIC WITH ENUM ID NOT YET SUPPORTED");
			} else if (id.getAnnotatedEAttribute().getEType()
					.getInstanceClass() != null) {
				usedIdElement.addElement("type").addAttribute("name",
						getEnumUserType(id.getEnumerated()))
						.addElement("param").addAttribute("name",
								HbMapperConstants.ENUM_CLASS_PARAM).addText(
								eAttribute.getEType().getInstanceClass()
										.getName());
			} else {
				final Element typeElement = usedIdElement.addElement("type")
						.addAttribute("name",
								hbDynamicEnumType(id.getEnumerated()));
				typeElement.addElement("param").addAttribute("name",
						HbMapperConstants.ECLASSIFIER_PARAM).addText(
						id.getAnnotatedEAttribute().getEType().getName());
				typeElement.addElement("param").addAttribute("name",
						HbMapperConstants.EPACKAGE_PARAM).addText(
						id.getAnnotatedEAttribute().getEType().getEPackage()
								.getNsURI());
			}
		}

		// TODO define what to do for unsettable id attribute (unlikely, maybe
		// error)

		if (generatedValue != null) {

			if (isCompositeId) {
				throw new MappingException(
						"Composite id can not have a generated value "
								+ id.getAnnotatedEAttribute()
										.getEContainingClass().getName() + "/"
								+ id.getAnnotatedEAttribute().getName());
			}

			final Element generatorElement = usedIdElement
					.addElement("generator");

			GenericGenerator gg;
			if (generatedValue.getGenerator() != null
					&& (gg = getGenericGenerator(id.getPaModel(),
							generatedValue.getGenerator())) != null) {
				log
						.debug("GenericGenerator the strategy in the GeneratedValue is ignored (if even set)");
				generatorElement.addAttribute("class", gg.getStrategy());
				if (gg.getParameters() != null) {
					for (Parameter param : gg.getParameters()) {
						generatorElement.addElement("param").addAttribute(
								"name", param.getName()).addText(
								param.getValue());
					}
				}
			} else if (GenerationType.IDENTITY_LITERAL.equals(generatedValue
					.getStrategy())) {
				generatorElement.addAttribute("class", "identity");
			} else if (GenerationType.TABLE_LITERAL.equals(generatedValue
					.getStrategy())) {
				generatorElement.addAttribute("class", IdMapper
						.hbGeneratorClass(generatedValue.getStrategy()));
				if (generatedValue.getGenerator() != null) { // table
					// generator
					final TableGenerator tg = id.getPaModel()
							.getTableGenerator(id.getAnnotatedEAttribute(),
									generatedValue.getGenerator());
					generatorElement.addElement("param").addAttribute("name",
							"table").setText(
							(tg.getTable() != null ? tg.getTable()
									: "uid_table")); // externalize
					generatorElement.addElement("param").addAttribute("name",
							"column").setText(
							tg.getValueColumnName() != null ? tg
									.getValueColumnName()
									: "next_hi_value_column"); // externalize
					generatorElement.addElement("param").addAttribute("name",
							"max_lo").setText(tg.getInitialValue() + "");
				} else {
					generatorElement.addElement("param").addAttribute("name",
							"table").setText("uid_table"); // externalize
					generatorElement.addElement("param").addAttribute("name",
							"column").setText("next_hi_value_column"); // externalize
				}
			} else if (GenerationType.SEQUENCE_LITERAL.equals(generatedValue
					.getStrategy())) {
				generatorElement.addAttribute("class", IdMapper
						.hbGeneratorClass(generatedValue.getStrategy()));
				if (generatedValue.getGenerator() != null) {
					final SequenceGenerator sg = id.getPaModel()
							.getSequenceGenerator(id.getAnnotatedEAttribute(),
									generatedValue.getGenerator());
					generatorElement.addElement("param").addAttribute("name",
							"sequence").setText(sg.getSequenceName());
				}
			} else {
				generatorElement.addAttribute("class", IdMapper
						.hbGeneratorClass(generatedValue.getStrategy()));
			}
		}
	}

	/**
	 * Returns a sequence generator on the basis of its name, if not found then
	 * an exception is thrown. efeature is passed for debugging purposes.
	 */
	public GenericGenerator getGenericGenerator(PAnnotatedModel paModel,
			String name) {
		for (Iterator<PAnnotatedEPackage> it = paModel.getPaEPackages()
				.iterator(); it.hasNext();) {
			final HbAnnotatedEPackage pae = (HbAnnotatedEPackage) it.next();
			for (GenericGenerator gg : pae.getHbGenericGenerators()) {
				if (gg.getName() != null && gg.getName().compareTo(name) == 0) {
					if (gg.getStrategy() == null) {
						throw new MappingException("The GenericGenerator: "
								+ name + " has no strategy defined!");
					}

					return gg;
				}
			}
		}
		log.debug("No GenericGenerator defined under name: " + name);
		return null;
	}
}
