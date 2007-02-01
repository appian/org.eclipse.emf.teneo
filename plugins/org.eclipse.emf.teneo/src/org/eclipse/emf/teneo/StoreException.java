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
 *   Martin Taal - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: StoreException.java,v 1.3 2007/02/01 12:34:21 mtaal Exp $
 */

package org.eclipse.emf.teneo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Is used to throw runtime store exceptions. This class offers automatic logging to commons logging. Note that this
 * class extends RuntimeException, so no forced throws and catch statements. Although there are very differing views on
 * this topic but it is our experience that to many checked exceptions only distract the programmer and have no added
 * value.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */

public class StoreException extends RuntimeException {
	/**
	 * Serializable id
	 */
	private static final long serialVersionUID = 7433341056815136417L;

	/** The logger for all these exceptions */
	private static Log log = LogFactory.getLog(StoreException.class);

	/**
	 * The constructor, logs the exception also
	 */
	public StoreException(String msg, Throwable cause) {
		super(msg, cause);

		// and log it
		log.error(msg, cause);
	}

	/**
	 * The constructor, logs the exception also
	 */
	public StoreException(String msg) {
		super(msg);

		// and log it
		log.error(msg, this);
	}
}
