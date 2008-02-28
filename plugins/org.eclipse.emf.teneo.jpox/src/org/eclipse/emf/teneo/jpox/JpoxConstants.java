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
 * $Id: JpoxConstants.java,v 1.3 2008/02/28 07:09:03 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox;

/**
 * Contains different constants.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $ $Date: 2008/02/28 07:09:03 $
 */

public class JpoxConstants {
	/** Extension of the ejdo property file */
	public static final String EJDO_EXTENSION = "ejdo";

	/** Default name of the jdo file */
	public static final String DEFAULT_JDO_FILENAME = "package.jdo";

	/** The ex/import format from and to xml */
	public final static int EXCHANGE_FORMAT_XML = 0;

	/** The ex/import format from and to xmi */
	public final static int EXCHANGE_FORMAT_XMI = 1;

	/**
	 * The additional suffix added to a datastore name to get the extension for which the JPOXResourceDAOFActory is
	 * registered.
	 */
	public static final String DAO_SUFFIX = "dao";

	/** Separator between package and the extension */
	public static final char EXTENSION_SEPARATOR = '.';

	/** The prefix is package */
	public static final String PREFIX_PACKAGE = "package";

	/** An option which can be used to pass a package.jdo file location to the pmf creation */
	public static final String PACKAGE_JDO_LOCATION = "org.eclipse.emf.teneo.jpox.jdolocation";
}