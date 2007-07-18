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
 * $Id: TeneoSQLNameStrategy.java,v 1.1 2007/07/18 16:10:08 mtaal Exp $
 */

package org.eclipse.emf.teneo.mapping.strategy.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Differences between this implementation and the ClassicSQLNameStrategy are in the way: -
 * truncation: if a name needs to be truncated because of length constraints then this class tries
 * to truncate two parts of the name (separated by _) together, for example the name child_parent
 * will be truncated to c_p.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class TeneoSQLNameStrategy extends ClassicSQLNameStrategy {

	// The logger
	protected static final Log log = LogFactory.getLog(TeneoSQLNameStrategy.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.mapping.strategy.impl.ClassicSQLNameStrategy#trunc(int,
	 *      java.lang.String, boolean)
	 */
	@Override
	public String trunc(int optionMaximumSqlLength, String truncName, boolean truncPrefix) {
		final String correctedName = truncName.replace('.', '_');

		if (optionMaximumSqlLength == -1) {
			return correctedName;
		}
		if (correctedName.length() <= optionMaximumSqlLength) {
			return correctedName;
		}
		final int underscore = correctedName.lastIndexOf('_');
		if (underscore == -1) {
			return correctedName.substring(0, optionMaximumSqlLength);
		}

		// now do the complex logic to truncate different parts
		final String[] parts = correctedName.split("_");
		int maxLength = -1;
		for (String part : parts) {
			if (part.length() > maxLength && part.length() > 0) {
				maxLength = part.length();
			}
		}

		// can this ever happen
		int totalLength = correctedName.length();
		while (maxLength > 1 && totalLength > optionMaximumSqlLength) {
			totalLength = 0;
			int newMax = 0;
			for (int i = 0; i < parts.length; i++) {
				if (parts[i].length() == maxLength) {
					parts[i] = parts[i].substring(0, maxLength - 1);
				}
				if (parts[i].length() > newMax) {
					newMax = parts[i].length();
				}
				totalLength += parts[i].length();
			}
			totalLength += parts.length - 1; // count the underscores
			maxLength = newMax;
		}

		final StringBuffer result = new StringBuffer();
		for (String part : parts) {
			if (result.length() > 0) {
				result.append("_");
			}
			result.append(part);
		}

		return result.toString();
	}
}