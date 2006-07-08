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
 * $Id: JPOXMappingException.java,v 1.1 2006/07/08 22:04:30 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.mapper;

import org.eclipse.emf.teneo.mapper.StoreMappingException;

/**
 * Is thrown when something goes wrong when generating a jdo mapping file.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */

public class JPOXMappingException extends StoreMappingException {

	/**
	 * Serial id
	 */
	private static final long serialVersionUID = 4685665979865102829L;

	/**
	 * The constructor, logs the exception also
	 */
	public JPOXMappingException(String msg, Throwable cause) {
		super(msg, cause);
	}

	/**
	 * The constructor, logs the exception also
	 */
	public JPOXMappingException(String msg) {
		super(msg);
	}
}
