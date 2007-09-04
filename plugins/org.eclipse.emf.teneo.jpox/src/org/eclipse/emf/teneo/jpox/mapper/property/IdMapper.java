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
 * $Id: IdMapper.java,v 1.9 2007/09/04 09:56:42 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.mapper.property;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pannotation.Column;
import org.eclipse.emf.teneo.annotations.pannotation.GeneratedValue;
import org.eclipse.emf.teneo.annotations.pannotation.GenerationType;
import org.eclipse.emf.teneo.annotations.pannotation.SequenceGenerator;
import org.eclipse.emf.teneo.annotations.pannotation.TableGenerator;
import org.eclipse.emf.teneo.extension.ExtensionPoint;
import org.eclipse.emf.teneo.jpox.mapper.AbstractMapper;
import org.eclipse.emf.teneo.simpledom.Element;

/**
 * The abstract class for different mappers.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.9 $
 */

public class IdMapper extends AbstractMapper implements ExtensionPoint {
	/** The logger for all these exceptions */
	protected static final Log log = LogFactory.getLog(IdMapper.class);

	/** Process the id annotation */
	public void map(PAnnotatedEAttribute aAttribute, Element classElement) {
		log.debug("Processing id annotation:" + aAttribute.getAnnotatedElement().getName());
		Element fieldElement = classElement.addElement("field");
		fieldElement.addAttribute("name",
			namingHandler.correctName(mappingContext, (EStructuralFeature) aAttribute.getAnnotatedElement()))
			.addAttribute("persistence-modifier", "persistent");
		fieldElement.addAttribute("primary-key", "true");

		// handle the column
		Column overridden = mappingContext.getOverride(aAttribute);
		if (overridden != null) {
			mappingContext.getColumnMapper().map(overridden, fieldElement);
		} else if (aAttribute.getColumn() != null) {
			mappingContext.getColumnMapper().map(aAttribute.getColumn(), fieldElement);
		} else if (mappingContext.getEmbeddingFeature() != null) { // embedded at least override
			// TODO: check illegal, embedded component can not really have an id
			final PAnnotatedEStructuralFeature pae = mappingContext.getEmbeddingFeature();
			final String name =
					pae.getAnnotatedEStructuralFeature().getName() + "_" +
							aAttribute.getAnnotatedEAttribute().getName() + "_ID";
			fieldElement.addAttribute("column", name);
		}

		GeneratedValue gv = aAttribute.getGeneratedValue();
		if (gv != null) { // normal primary key
			if (gv.getStrategy() == GenerationType.AUTO) {
				fieldElement.addAttribute("value-strategy", "auto");
			} else if (gv.getStrategy() == GenerationType.SEQUENCE) {
				log.warn("The identity value-strategy of sequence is only supported for a limited set of databases");
				fieldElement.addAttribute("value-strategy", "sequence");
			} else if (gv.getStrategy() == GenerationType.IDENTITY) {
				fieldElement.addAttribute("value-strategy", "identity");
			} else if (gv.getStrategy() == GenerationType.TABLE) {
				fieldElement.addAttribute("value-strategy", "increment");
			} else {
				log.error("VALUE-STRATEGY: " + gv.getStrategy().getName() + " not supported for field " +
						aAttribute.getAnnotatedElement().getName());
			}
			fieldElement.addAttribute("indexed", "true");

			// get the sequence from the global generator
			if (gv.getGenerator() != null) {
				if (GenerationType.TABLE.equals(gv.getStrategy())) {
					fieldElement.addAttribute("strategy", "increment");
					final TableGenerator tg =
							aAttribute.getPaModel().getTableGenerator(aAttribute.getAnnotatedEAttribute(),
								gv.getGenerator());
					if (tg.getTable() != null) {
						fieldElement.addAttribute("sequence-table-name", tg.getTable());
					}
					if (tg.getPkColumnName() != null) {
						fieldElement.addAttribute("sequence-name-column-name", tg.getPkColumnName());
					}
					if (tg.getValueColumnName() != null) {
						fieldElement.addAttribute("sequence-nextval-column-name", tg.getValueColumnName());
					}
				} else {
					final SequenceGenerator sg =
							aAttribute.getPaModel().getSequenceGenerator(aAttribute.getAnnotatedEAttribute(),
								gv.getGenerator());
					fieldElement.addAttribute("sequence", sg.getSequenceName());
				}
			}
		}
	}
}