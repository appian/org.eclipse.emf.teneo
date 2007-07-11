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
 * $Id: JoinColumnMapper.java,v 1.4 2007/07/11 14:43:06 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.mapper.property;

import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.teneo.annotations.pannotation.JoinColumn;
import org.eclipse.emf.teneo.jpox.mapper.AbstractMapper;
import org.eclipse.emf.teneo.simpledom.DocumentHelper;
import org.eclipse.emf.teneo.simpledom.Element;

/**
 * Maps the column annotation to a jpox representation.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */

public class JoinColumnMapper extends AbstractMapper {
	/** The logger for all these exceptions */
	protected static final Log log = LogFactory.getLog(JoinColumnMapper.class);

	/** Handles a JoinColumns object */
	public void map(List joinColumns, Element fieldElement) {
		for (Iterator it = joinColumns.iterator(); it.hasNext();) {
			JoinColumn jc = (JoinColumn) it.next();
			map(jc, fieldElement);
		}
	}

	/** Handles a column object */
	public void map(JoinColumn joinColumn, Element fieldElement) {
		log.debug("Adding column element");
		Element columnElement = DocumentHelper.createElement("column");

		if (joinColumn.getName() != null) {
			columnElement.addAttribute("name", joinColumn.getName());
		}

		if (joinColumn.isNullable()) {
			log.debug("Allows null");
			columnElement.addAttribute("allows-null", "true");
		} else {
			columnElement.addAttribute("allows-null", "false");
		}
		fieldElement.add(columnElement);
	}
}