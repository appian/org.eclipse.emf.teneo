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
 * $Id: SQLCaseStrategyImpl.java,v 1.5 2007/02/08 23:14:41 mtaal Exp $
 */

package org.eclipse.emf.teneo.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.teneo.StoreException;
import org.eclipse.emf.teneo.classloader.ClassLoaderResolver;

/**
 * Contains number of default implementations of the sql case strategy, nl.
 * lower, upper and none
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */

public class SQLCaseStrategyImpl {

	/** The logger */
	private static Log log = LogFactory.getLog(SQLCaseStrategyImpl.class);

	/** Utility method to return an implementation of the sql case strategy */
	public static SQLCaseStrategy createSQLCaseStrategy(String option) {
		try {
			if (option.toLowerCase().compareTo("lowercase") == 0) {
				log.debug("Creating " + LowerCase.class.getName()
						+ " as case strategy");
				return new LowerCase();
			}
			if (option.toLowerCase().compareTo("uppercase") == 0) {
				log.debug("Creating " + UpperCase.class.getName()
						+ " as case strategy");
				return new UpperCase();
			}
			if (option.toLowerCase().compareTo("none") == 0) {
				log.debug("Creating " + None.class.getName()
						+ " as case strategy");
				return new None();
			}

			return (SQLCaseStrategy) ClassLoaderResolver.classForName(option)
					.newInstance();
		} catch (Exception e) {
			throw new StoreException("Could not instantiate: " + option, e);
		}
	}

	/** Lower case */
	public static class LowerCase implements SQLCaseStrategy {

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.emf.teneo.util.SQLCaseStrategy#convert(java.lang.String)
		 */
		public String convert(String name) {
			if (name == null) {
				return null;
			}
			return name.toLowerCase();
		}
	}

	/** Upper case */
	public static class UpperCase implements SQLCaseStrategy {

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.emf.teneo.util.SQLCaseStrategy#convert(java.lang.String)
		 */
		public String convert(String name) {
			if (name == null) {
				return null;
			}
			return name.toUpperCase();
		}
	}

	/** Does no conversion */
	public static class None implements SQLCaseStrategy {

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.emf.teneo.util.SQLCaseStrategy#convert(java.lang.String)
		 */
		public String convert(String name) {
			return name;
		}
	}
}