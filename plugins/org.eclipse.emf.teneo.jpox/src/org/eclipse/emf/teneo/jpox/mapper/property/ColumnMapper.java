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
 * $Id: ColumnMapper.java,v 1.6 2007/07/11 14:43:06 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.mapper.property;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.teneo.annotations.pannotation.Column;
import org.eclipse.emf.teneo.jpox.mapper.AbstractMapper;
import org.eclipse.emf.teneo.simpledom.DocumentHelper;
import org.eclipse.emf.teneo.simpledom.Element;

/**
 * Maps the column annotation to a jpox representation.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $
 */

public class ColumnMapper extends AbstractMapper {
	/** The logger for all these exceptions */
	protected static final Log log = LogFactory.getLog(ColumnMapper.class);

	/** Handles a column object */
	public void map(Column column, Element fieldElement) {
		log.debug("Adding column element");
		Element columnElement = DocumentHelper.createElement("column");

		if (column.getName() != null && column.getName().length() > 0) {
			columnElement.addAttribute("name", column.getName());
		}

		if (column.isNullable()) {
			log.debug("Allows null");
			columnElement.addAttribute("allows-null", "true");
		} else {
			columnElement.addAttribute("allows-null", "false");
		}

		if (column.isSetLength()) {
			log.debug("Set length " + column.getLength());
			columnElement.addAttribute("length", Integer.toString(column.getLength()));
		}
		if (column.isSetPrecision()) {
			log.debug("Set precision (using length attribute) " + column.getPrecision());
			columnElement.addAttribute("length", Integer.toString(column.getPrecision()));
		}
		if (column.isSetScale()) {
			log.debug("Set scale " + column.getScale());
			columnElement.addAttribute("scale", Integer.toString(column.getScale()));
		}

		// if unique then add the column in the unique subelement
		if (column.isUnique()) {
			fieldElement.add(columnElement);
			Element unique = fieldElement.addElement("unique");
			unique.add((Element) columnElement.clone());
		} else { // otherwise add directly to field
			fieldElement.add(columnElement);
		}

		if (column.getTable() != null) {
			fieldElement.addAttribute("table", column.getTable());
		}
	}
}