/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: JPOXMappingException.java,v 1.4 2008/02/28 07:09:03 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.mapper;

import org.eclipse.emf.teneo.annotations.mapper.StoreMappingException;

/**
 * Is thrown when something goes wrong when generating a jdo mapping file.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
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
