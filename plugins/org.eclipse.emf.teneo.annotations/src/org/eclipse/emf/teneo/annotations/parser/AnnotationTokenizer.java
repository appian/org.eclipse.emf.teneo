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
 * $Id: AnnotationTokenizer.java,v 1.10 2007/02/08 23:12:34 mtaal Exp $
 */

package org.eclipse.emf.teneo.annotations.parser;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.ENamedElement;

/**
 * Tokenizes a java annotation. The main tokens are: - TypeName - Identifier -
 * Value - Array
 * 
 * For example the following java annotation
 * 
 * @GenericGenerator(name="hibseq", strategy = "hilo", parameters = {
 * @Parameter(name="table", value = "hilo_table"),
 * @Parameter(name="column", value="the_hilo_column")} } )
 * 
 * Here GenericGenerator is a TypeName, name and strategy are Identifiers and
 * "hilo_table" is a value, the array is the part between the {}.
 * 
 * There is a special case where the typename is actually a list of values, e.g.
 * SecondaryTables. These are treated as a special type of TypeName which is
 * translated into a ComplexNode with isList=true. This is currently only
 * supported at the top level.
 * 
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
class AnnotationTokenizer {
	/** Log it */
	private final static Log log = LogFactory.getLog(AnnotationTokenizer.class);

	/** Character Codes */
	private static final int K_CR = 13;

	private static final int K_LF = 10;

	/** Special Tokens */
	static final int T_EOF = 0;

	private static final int T_EOL = -1;

	private static final int T_UNKNOWN = -2;

	/**
	 * Annotation tokens
	 */
	static final int T_TYPENAME = 1;

	static final int T_IDENTIFIER = 2;

	static final int T_ARRAYSTART = 3;

	static final int T_ARRAYEND = 4;

	static final int T_VALUE = 5;

	static final int T_IS = 6;

	static final int T_CONTENTSTART = 7;

	static final int T_CONTENTEND = 8;

	static final int T_COMMA = 9;

	/** Data */
	private char[] data;

	/** Length */
	private int length;

	/** Points to the start of the current token */

	private int tokBeg;

	/** Ponts to the end of the current token. */
	private int tokEnd;

	/** For which model element are we doing this */
	private ENamedElement eNamedElement;

	/** The last returned token */
	private int currentToken = T_EOF - 1;

	/**
	 * Constructor
	 */

	AnnotationTokenizer(ENamedElement eNamedElement, String source) {
		this.eNamedElement = eNamedElement;
		setSource(source.toCharArray());
	}

	/**
	 * Sets the source to be tokenized form a character array.
	 */

	private void setSource(char[] iSource) {
		length = iSource.length;
		// Append three null-characters as sentinel since three
		// look-ahead characters are required (e.g. for the '>>>=' token).
		data = new char[length + 3];
		System.arraycopy(iSource, 0, data, 0, length);

		data[length] = 0; // Append the sentinel characters.
		data[length + 1] = 0;
		data[length + 2] = 0;

		tokBeg = 0;
		tokEnd = 0;

		log.debug(dump());
	}

	/**
	 * Returns the next token.
	 */

	final int nextToken() {
		currentToken = getNextToken();
		return currentToken;
	}

	/** Return the curren token */
	final int getCurrentToken() {
		return currentToken;
	}

	/**
	 * Returns the next token.
	 */

	final int getNextToken() {
		int lCur = tokEnd;

		Loop: for (;;) {
			char lChar = data[lCur]; // Grab next character.

			switch (lChar) {
			case ' ': // Skip leading whitespace!
			case K_LF: // Single Line Feed.
			case K_CR: // Carriage Return, optionally followed by a Line Feed.
			case '\t': {
				lCur++;
				continue Loop; // --> Keep on skipping leading whitespace!
			}

			case 0: // End of buffer.
			{
				if (lCur == length) // Guard against embedded nulls in the
									// Source.
				{
					// EOBuf may only occur at the first non whitespace char.

					return T_EOF; // --> End of file.
				}
				throw new AnnotationParserException(
						"Char is 0 but end not reached " + lCur + " " + length);
			}

				// TYPENAME
			case '@': {
				++lCur; // get rid of the @
				tokBeg = lCur; // Save starting point of current lexeme.

				do {
					lChar = data[++lCur];
				} while (lChar == '-' || lChar == '_' || lChar == '/'
						|| lChar == '@' || ('0' <= lChar && lChar <= '9')
						|| lChar == ':' || ('a' <= lChar && lChar <= 'z')
						|| ('A' <= lChar && lChar <= 'Z'));

				tokEnd = lCur; // Save endpoint of current lexeme.

				return T_TYPENAME; // --> Identifier.
			}
				// VALUE with double quotes
			case '"': {
				// after the dollar the identifier part needs to be found
				tokBeg = lCur; // Save starting point of current lexeme.

				do {
					lChar = data[++lCur];
				} while (lChar == ',' || lChar == '-' || lChar == '.'
						|| lChar == ' ' || lChar == '_' || lChar == '/'
						|| lChar == '@' || lChar == ':' || lChar == '='
						|| lChar == '\'' || ('0' <= lChar && lChar <= '9')
						|| ('a' <= lChar && lChar <= 'z')
						|| ('A' <= lChar && lChar <= 'Z'));

				if (lChar != '\"') {
					throw new AnnotationParserException(
							"Value not closed with double quote, see the _ for the location "
									+ getErrorText());
				}
				tokEnd = lCur + 1;
				return T_VALUE;
			}
			case '(': {
				tokBeg = lCur;
				tokEnd = lCur + 1;
				return T_CONTENTSTART;
			}
			case ')': {
				tokBeg = lCur;
				tokEnd = lCur + 1;
				return T_CONTENTEND;
			}
			case '{': {
				tokBeg = lCur;
				tokEnd = lCur + 1;
				return T_ARRAYSTART;
			}
			case '}': {
				tokBeg = lCur;
				tokEnd = lCur + 1;
				return T_ARRAYEND;
			}
			case ',': {
				tokBeg = lCur;
				tokEnd = lCur + 1;
				return T_COMMA;
			}
			case '=': {
				tokBeg = lCur;
				tokEnd = lCur + 1;
				return T_IS;
			}
			default: // the rest must be identifiers
			{
				// after the dollar the identifier part needs to be found
				tokBeg = lCur; // Save starting point of current lexeme.

				do {
					lChar = data[++lCur];
				} while (lChar == '.' || lChar == '-' || lChar == '_'
						|| lChar == '/' || lChar == '@'
						|| ('0' <= lChar && lChar <= '9')
						|| ('a' <= lChar && lChar <= 'z')
						|| ('A' <= lChar && lChar <= 'Z'));

				tokEnd = lCur; // Save endpoint of current lexeme.

				return T_IDENTIFIER; // --> Identifier.
			}
			}
		}
	}

	/**
	 * Returns the current lexeme.
	 */

	final String getLexeme() {
		return new String(data, tokBeg, tokEnd - tokBeg);
	}

	/**
	 * Returns an error version of the query with a _ at the error location.
	 */
	final String getErrorText() {
		final StringBuffer result = new StringBuffer();
		result.append("E Element: " + eNamedElement.getName() + "\n");
		result.append("Begin: " + tokBeg + "\n");
		result.append("End: " + tokEnd + "\n");
		result.append("Length: " + data.length + "\n");
		result.append("first part: " + new String(data, 0, tokEnd) + "\n");
		result.append("Last part: "
				+ new String(data, tokEnd, data.length - tokEnd - 2) + "\n");

		return new String(data, 0, tokEnd) + "_"
				+ new String(data, tokEnd, data.length - tokEnd - 2);
	}

	/**
	 * Dumps the tokens.
	 */

	final String dump() {
		final StringBuffer result = new StringBuffer();
		int oldTokBeg = tokBeg;
		int oldTokEnd = tokEnd;
		int oldCurrentToken = currentToken;

		// Reset pointers.
		tokBeg = 0;
		tokEnd = 0;

		boolean lFinished = false;
		int lTok = 0;
		while (!lFinished) {
			try {
				lTok = nextToken();
				if (lTok != T_EOL) // Don't log End-of-line tokens.
				{
					result.append("Tok: " + lTok + ": '" + getLexeme() + "'\n");
				}
			} catch (AnnotationParserException e) {
				result.append("Tok: " + T_UNKNOWN + ": " + getLexeme() + "'");
			}
			lFinished = lTok == T_EOF;
		}

		// Restore state.
		tokBeg = oldTokBeg;
		tokEnd = oldTokEnd;
		currentToken = oldCurrentToken;
		return result.toString();
	}
}
