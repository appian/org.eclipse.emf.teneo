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
 * </copyright>
 *
 * $Id: AbstractMapper.java,v 1.1 2006/07/08 22:04:30 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.mapper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * The abstract class for different mappers.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */

public class AbstractMapper {
	/** The logger for all these exceptions */
	protected static final Log log = LogFactory.getLog(AbstractMapper.class);

	/** The naming handler to handles names of columns */
	protected NamingHandler namingHandler;

	/** The mappingcontext */
	protected MappingContext mappingContext;

	/** Constructor */
	public AbstractMapper(MappingContext mappingContext) {
		this.namingHandler = mappingContext.getNamingHandler();
		this.mappingContext = mappingContext;
	}
}