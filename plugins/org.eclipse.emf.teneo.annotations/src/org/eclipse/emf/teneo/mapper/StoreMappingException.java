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
 * $Id: StoreMappingException.java,v 1.2 2006/07/23 19:38:45 mtaal Exp $
 */

package org.eclipse.emf.teneo.mapper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * This exception is the base class of all exceptions which occur in the mapping process. This class offers automatic
 * logging to commons logging. Note that this class extends RuntimeException, so no forced throws and catch statements.
 * Although there are very differing views on this topic but it is our experience that to many checked exceptions only
 * distract the programmer and have no added value.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */

public class StoreMappingException extends RuntimeException {
	/**
	 * Serial id
	 */
	private static final long serialVersionUID = 4685665979865102829L;

	/**
	 * The constructor, logs the exception also
	 */
	public StoreMappingException(String msg, Throwable cause) {
		super(msg, cause);

		// and log it, note the logger is recreated to automatically
		// log for subclasses.
		final Log log = LogFactory.getLog(this.getClass());
		log.error(msg, cause);
	}

	/**
	 * The constructor, logs the exception also
	 */
	public StoreMappingException(String msg) {
		super(msg);

		// and log it, note the logger is recreated to automatically
		// log for subclasses.
		final Log log = LogFactory.getLog(this.getClass());
		log.error(msg, this);
	}
}
