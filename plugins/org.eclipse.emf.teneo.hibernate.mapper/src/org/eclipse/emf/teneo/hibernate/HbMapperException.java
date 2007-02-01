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
 * $Id: HbMapperException.java,v 1.2 2007/02/01 12:35:55 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Local Runtime Exception which logs.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */

public class HbMapperException extends RuntimeException {
	/**
	 * Serializable id
	 */
	private static final long serialVersionUID = 7433341056815136417L;

	/** The logger for all these exceptions */
	private static Log log = LogFactory.getLog(HbMapperException.class);

	/**
	 * The constructor, logs the exception also
	 */
	public HbMapperException(String msg, Throwable cause) {
		super(msg, cause);

		// and log it
		log.error(msg, cause);
	}

	/**
	 * The constructor, logs the exception also
	 */
	public HbMapperException(Throwable cause) {
		super(cause);
		log.error(cause);
	}
	
	/**
	 * The constructor, logs the exception also
	 */
	public HbMapperException(String msg) {
		super(msg);

		// and log it
		log.error(msg, this);
	}	
}
