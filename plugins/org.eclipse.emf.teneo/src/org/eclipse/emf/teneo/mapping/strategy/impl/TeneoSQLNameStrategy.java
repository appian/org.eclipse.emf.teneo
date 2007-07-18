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
 * $Id: TeneoSQLNameStrategy.java,v 1.2 2007/07/18 18:57:16 mtaal Exp $
 */

package org.eclipse.emf.teneo.mapping.strategy.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Differences between this implementation and the ClassicSQLNameStrategy is the way truncation is
 * done if a name is longer than the sql name length constraint. To truncate a name this class will
 * first remove vowels (in the order: u, o, a, e, i) and if that is not enough it will truncate the
 * different parts of a name (separated by _).
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class TeneoSQLNameStrategy extends ClassicSQLNameStrategy {

	// The logger
	protected static final Log log = LogFactory.getLog(TeneoSQLNameStrategy.class);

	private static String[] removables = new String[] { "u", "o", "a", "e", "i" };

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.mapping.strategy.impl.ClassicSQLNameStrategy#trunc(int,
	 *      java.lang.String, boolean)
	 */
	@Override
	public String trunc(int maxSqlLength, String truncName, boolean truncPrefix) {
		String correctedName = truncName.replace('.', '_');

		if (maxSqlLength == -1) {
			return correctedName;
		}
		if (correctedName.length() <= maxSqlLength) {
			return correctedName;
		}

		// first do some standard things
		// truncate the standard e_id
		correctedName = correctedName.replaceAll("e_id", "id");
		if (correctedName.length() <= maxSqlLength) {
			return correctedName;
		}

		// now do vowel truncation
		for (String vowel : getRemovableCharacters()) {
			while (correctedName.indexOf(vowel) != -1 || correctedName.indexOf(vowel.toUpperCase()) != -1) {
				if (correctedName.indexOf(vowel) != -1) {
					correctedName = correctedName.replaceFirst(vowel, "");
				} else {
					correctedName = correctedName.replaceFirst(vowel.toUpperCase(), "");
				}
				correctedName = correctedName.replaceAll("__", "_");
				if (correctedName.startsWith("_")) {
					correctedName = correctedName.substring(1);
				}
				if (correctedName.length() <= maxSqlLength) {
					return correctedName;
				}
			}
		}

		// still failed do length truncation
		return doLengthTruncation(maxSqlLength, correctedName);
	}

	private String doLengthTruncation(int maxSqlLength, String correctedName) {
		// failed do length truncation with the remainder
		final int underscore = correctedName.lastIndexOf('_');
		if (underscore == -1) {
			return correctedName.substring(0, maxSqlLength);
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
		while (maxLength > 1 && totalLength > maxSqlLength) {
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

	/**
	 * Return the characters to remove, the character removal is done in order of the returned
	 * array. This method is provided to be overridden to pass a custom set of removable characters.
	 */
	protected String[] getRemovableCharacters() {
		return removables;
	}
}