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
 * $Id: IdMapper.java,v 1.8 2006/09/26 13:23:06 mtaal Exp $
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
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;
import org.eclipse.emf.teneo.annotations.pannotation.Column;
import org.eclipse.emf.teneo.annotations.pannotation.GeneratedValue;
import org.eclipse.emf.teneo.annotations.pannotation.GenerationType;
import org.eclipse.emf.teneo.annotations.pannotation.SequenceGenerator;
import org.eclipse.emf.teneo.annotations.pannotation.TableGenerator;
import org.eclipse.emf.teneo.annotations.processing.IdProcessor;
import org.eclipse.emf.teneo.annotations.processing.ProcessingException;
import org.eclipse.emf.teneo.hibernate.hbannotation.GenericGenerator;
import org.eclipse.emf.teneo.hibernate.hbannotation.Parameter;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEPackage;
import org.eclipse.emf.teneo.hibernate.mapping.DynamicENumUserType;
import org.eclipse.emf.teneo.hibernate.mapping.ENumUserType;
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

		final Element idElement = DocumentHelper.createElement("id");
		entityElement.add(0, idElement);
		idElement.addAttribute("type", "long").
			// NOTE: the name is also set so that the property name can be 
			// used later to identify an id prop, 
			// TODO: improve this
			addAttribute("name", mc.getIdColumnName()).
			addAttribute("column", mc.getIdColumnName()).
			addElement("generator").
			addAttribute("class", "native");
		
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
					getHbmContext().isCurrentElementFeatureMap(), true);
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
			if (id.getAnnotatedEAttribute().getEType().getInstanceClass() != null) {
				usedIdElement.addElement("type"). 
					addAttribute("name", hbEnumType(id.getEnumerated())). 
					addElement("param"). 
						addAttribute("name", ENumUserType.ENUM_CLASS_PARAM).
						addText(eAttribute.getEType().getInstanceClass().getName());
			} else {
				final Element typeElement = usedIdElement.addElement("type"). 
					addAttribute("name", hbDynamicEnumType(id.getEnumerated()));
				typeElement.addElement("param").addAttribute("name", DynamicENumUserType.ECLASSIFIER_PARAM). 
					addText(id.getAnnotatedEAttribute().getEType().getName());
				typeElement.addElement("param").addAttribute("name", DynamicENumUserType.EPACKAGE_PARAM). 
					addText(id.getAnnotatedEAttribute().getEType().getEPackage().getNsURI());
			}
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
			
			GenericGenerator gg;
			if (generatedValue.getGenerator() != null && 
				(gg = getGenericGenerator(id.getPaModel(), generatedValue.getGenerator())) != null) {
				log.debug("GenericGenerator the strategy in the GeneratedValue is ignored (if even set)");
				generatorElement.addAttribute("class", gg.getStrategy());
				if (gg.getParameters() != null) {
					for (Iterator params = gg.getParameters().iterator(); params.hasNext();) {
						final Parameter param = (Parameter)params.next();
						generatorElement.addElement("param").addAttribute("name", param.getName()).addText(param.getValue());
					}
				}
			} else if (GenerationType.IDENTITY_LITERAL.equals(generatedValue.getStrategy())) {
				generatorElement.addAttribute("class", "identity");
			} else if (GenerationType.TABLE_LITERAL.equals(generatedValue.getStrategy())) {
				generatorElement.addAttribute("class", IdMapper.hbGeneratorClass(generatedValue.getStrategy()));
				if (generatedValue.getGenerator() != null) { // table generator
					final TableGenerator tg = id.getPaModel().getTableGenerator(id.getAnnotatedEAttribute(),
							generatedValue.getGenerator());
					generatorElement.addElement("param").addAttribute("name", "table").
						setText((tg.getTable() != null ? tg.getTable() : "uid_table")); // externalize
					generatorElement.addElement("param").addAttribute("name", "column").
						setText(tg.getValueColumnName() != null ? tg.getValueColumnName() : "next_hi_value_column"); // externalize
					generatorElement.addElement("param").addAttribute("name", "max_lo"). 
						setText(tg.getInitialValue() + "");
				} else {				
					generatorElement.addElement("param").addAttribute("name", "table").setText("uid_table"); // externalize
					generatorElement.addElement("param").addAttribute("name", "column").setText("next_hi_value_column"); // externalize
				}
			} else if (GenerationType.SEQUENCE_LITERAL.equals(generatedValue.getStrategy())) {
				generatorElement.addAttribute("class", IdMapper.hbGeneratorClass(generatedValue.getStrategy()));
				if (generatedValue.getGenerator() != null) {
					final SequenceGenerator sg = id.getPaModel().getSequenceGenerator(id.getAnnotatedEAttribute(),
							generatedValue.getGenerator());
					generatorElement.addElement("param").addAttribute("name", "sequence").setText(sg.getSequenceName());
				}
			} else {
				generatorElement.addAttribute("class", IdMapper.hbGeneratorClass(generatedValue.getStrategy()));
			}
		}
	}
	

	/** Returns a sequence generator on the basis of its name, if not found then an exception is thrown.
	 * efeature is passed for debugging purposes. */
	public GenericGenerator getGenericGenerator(PAnnotatedModel paModel, String name) {
		for (Iterator it = paModel.getPaEPackages().iterator(); it.hasNext();) {
			final HbAnnotatedEPackage pae = (HbAnnotatedEPackage)it.next();
			for (Iterator sit = pae.getHbGenericGenerators().iterator(); sit.hasNext();) {
				final GenericGenerator gg = (GenericGenerator)sit.next();
				if (gg.getName() != null && gg.getName().compareTo(name) == 0) {
					if (gg.getStrategy() == null) {
						throw new ProcessingException("The GenericGenerator: " + name + " has no strategy defined!");
					}
					
					return gg;
				}
			}
		}
		log.debug("No GenericGenerator defined under name: " + name);
		return null;
	}
}
