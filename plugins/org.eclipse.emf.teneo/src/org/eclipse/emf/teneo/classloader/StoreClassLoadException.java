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
 * $Id: StoreClassLoadException.java,v 1.4 2007/06/29 07:31:48 mtaal Exp $
 */

package org.eclipse.emf.teneo.classloader;

import org.eclipse.emf.teneo.TeneoException;

/**
 * Is used to throw exception when getting a class in the classloader
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */

public class StoreClassLoadException extends TeneoException {

	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = -952752250000575101L;

	/**
	 * The constructor, logs the exception also
	 */
	public StoreClassLoadException(String msg, Throwable cause) {
		super(msg, cause);
	}

	/**
	 * The constructor, logs the exception also
	 */
	public StoreClassLoadException(String msg) {
		super(msg);
	}
}
