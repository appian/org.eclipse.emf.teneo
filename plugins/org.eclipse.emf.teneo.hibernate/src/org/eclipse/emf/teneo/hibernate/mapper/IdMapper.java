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
 * $Id: IdMapper.java,v 1.1 2006/07/05 22:29:30 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapper;

import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pannotation.Column;
import org.eclipse.emf.teneo.annotations.pannotation.GeneratedValue;
import org.eclipse.emf.teneo.annotations.pannotation.GenerationType;
import org.eclipse.emf.teneo.annotations.pannotation.SequenceGenerator;
import org.eclipse.emf.teneo.annotations.processing.IdProcessor;
import org.eclipse.emf.teneo.annotations.processing.ProcessingException;
import org.eclipse.emf.teneo.simpledom.DocumentHelper;
import org.eclipse.emf.teneo.simpledom.Element;

/**
 * Mapper generating id entry for Hibernate from PAnnotatedElements. Throws an error if called for non-root entities.
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
class IdMapper extends AbstractPropertyMapper implements IdProcessor {

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
	public static Element getCreateIdElement(Element entityElement, PAnnotatedEClass aClass) {
		if (aClass.getIdClass() != null) { // composite id
			Element element = entityElement.element("composite-id");
			if (element == null) {
				element = DocumentHelper.createElement("composite-id").addAttribute("class",
						aClass.getIdClass().getValue()).addAttribute("mapped", "true");
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
	public static Element addSyntheticId(MappingContext mc, Element entityElement) {
		if (entityElement.element("id") != null || entityElement.element("composite-id") != null) {
			throw new ProcessingException("Syntheticid should only be called if there is no id element");
		}

		final Element idElement = DocumentHelper.createElement(mc.getIdColumnName());
		entityElement.add(0, idElement);
		idElement.addAttribute("type", "long").addElement("generator").addAttribute("class", "native");
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
		return IdMapper.GENERATOR_CLASS_NAMES[strategy != null ? strategy.getValue() : GenerationType.AUTO];
	}

	/**
	 * Process embedded id.
	 * 
	 * @see org.eclipse.emf.teneo.annotations.processing.IdProcessor#processEmbeddedId(org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute,
	 *      org.eclipse.emf.teneo.annotations.pannotation.AttributeOverrides)
	 */
	public void processEmbeddedId(PAnnotatedEReference aReference) {
		final EReference eReference = aReference.getAnnotatedEReference();
		final PAnnotatedEClass aClass = aReference.getPaModel().getPAnnotated(eReference.getEReferenceType());
		final Element compositeIdElement = getHbmContext().getCurrent().addElement("composite-id");
		compositeIdElement.addAttribute("name", eReference.getName());
		final String className = getHbmContext().getInstanceClassName(aClass.getPaModel(), aClass.getAnnotatedEClass());
		compositeIdElement.addAttribute("class", className);
		getHbmContext().setCurrent(compositeIdElement);
		final List aFeatures = aClass.getPaEStructuralFeatures();
		for (Iterator iter = aFeatures.iterator(); iter.hasNext();) {
			PAnnotatedEStructuralFeature aFeature = (PAnnotatedEStructuralFeature) iter.next();
			if (!(aFeature instanceof PAnnotatedEAttribute)) {
				continue;
			}
			PAnnotatedEAttribute aAttribute = (PAnnotatedEAttribute) aFeature;
			final Element keyPropertyElement = compositeIdElement.addElement("key-property");
			keyPropertyElement.addAttribute("name", aFeature.getAnnotatedEStructuralFeature().getName());
			addColumn(keyPropertyElement, aAttribute.getAnnotatedEAttribute().getName(), getColumn(aAttribute),
					getHbmContext().isCurrentElementFeatureMap(), false);
			keyPropertyElement.addAttribute("type", hbType(aAttribute.getAnnotatedEAttribute().getEAttributeType()));
		}
		getHbmContext().setCurrent(compositeIdElement.getParent());
	}

	/**
	 * Add property to the mapped id element
	 */
	public void processIdProperty(PAnnotatedEAttribute id) {
		final PAnnotatedEClass aClass = id.getPaEClass();

		// check precondition
		if (aClass.getPaSuperEntity() != null || aClass.getPaMappedSuper() != null) {
			log
					.error("The annotated eclass: "
							+ aClass
							+ " has an id-annotated feature: "
							+ id
							+ " while it has a "
							+ "superclass/type, id properties should always be specified in the top of the inheritance structure");
			throw new ProcessingException(
					"The annotated eclass: "
							+ aClass
							+ " has an id-annotated feature: "
							+ id
							+ " while it has a "
							+ "superclass/type, id properties should always be specified in the top of the inheritance structure");
		}

		final EAttribute eAttribute = id.getAnnotatedEAttribute();
		final Column column = getColumn(id);
		final GeneratedValue generatedValue = id.getGeneratedValue();

		if (column != null && column.getColumnDefinition() != null) {
			// TODO support
			log.error("Unsupported, ColumnDefinition  in " + column);
			throw new ProcessingException("Unsupported, ColumnDefinition", column);
		}
		if (column != null && column.getTable() != null) {
			// TODO support
			log.error("Unsupported, SecondaryTable in " + column);
			throw new ProcessingException("Unsupported, SecondaryTable", column);
		}

		final Element idElement = getCreateIdElement(getHbmContext().getCurrent(), aClass);
		final boolean isCompositeId = aClass.getIdClass() != null;

		final Element usedIdElement;
		if (isCompositeId) {
			usedIdElement = idElement.addElement("key-property");
		} else {
			usedIdElement = idElement;
		}

		usedIdElement.addAttribute("name", eAttribute.getName());
		if (id.getEnumerated() == null) {
			usedIdElement.addAttribute("type", AbstractPropertyMapper.hbType(eAttribute.getEAttributeType()));
		} else { // enumerated id
			usedIdElement.addElement("type").addAttribute("name", hbEnumType(id.getEnumerated())).addElement("param")
					.addAttribute("name", "enumClass").addText(
							id.getAnnotatedEAttribute().getEType().getInstanceClassName());
		}

		addColumn(usedIdElement, eAttribute.getName(), column, false, true);

		// TODO define what to do for unsettable id attribute (unlikely, maybe
		// error)

		if (generatedValue != null) {

			if (isCompositeId) {
				throw new ProcessingException("Composite id can not have a generated value "
						+ id.getAnnotatedEAttribute().getEContainingClass().getName() + "/"
						+ id.getAnnotatedEAttribute().getName());
			}

			final Element generatorElement = usedIdElement.addElement("generator");
			generatorElement.addAttribute("class", IdMapper.hbGeneratorClass(generatedValue.getStrategy()));
			if (GenerationType.TABLE_LITERAL.equals(generatedValue.getStrategy())) {
				generatorElement.addElement("param").addAttribute("name", "table").setText("uid_table"); // externalize
				// this
				generatorElement.addElement("param").addAttribute("name", "column").setText("next_hi_value_column"); // externalize
				// this
			}
			if (generatedValue.getGenerator() != null) {
				final SequenceGenerator sg = id.getPaModel().getSequenceGenerator(id.getAnnotatedEAttribute(),
						generatedValue.getGenerator());
				generatorElement.addElement("param").addAttribute("name", "sequence").setText(sg.getSequenceName());
			}
		}
	}
}
