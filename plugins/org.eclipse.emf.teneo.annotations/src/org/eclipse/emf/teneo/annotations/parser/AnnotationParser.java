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
 * $Id: AnnotationParser.java,v 1.2 2006/08/31 22:46:54 mtaal Exp $
 */

package org.eclipse.emf.teneo.annotations.parser;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.ENamedElement;

/**
 * Parses an annotation and creates a tree of parserNodes.
 * 
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
public class AnnotationParser {
	/** Log it */
	private final static Log log = LogFactory.getLog(AnnotationParser.class);

	/** The StringTokenizer being used */
	private AnnotationTokenizer annotationTokenizer;

	/** The list of root nodes */
	private List parserNodes = new ArrayList();

	/** Parses the content and returns a list of parsernodes */
	public List parse(ENamedElement eNamedElement, String content) {
		annotationTokenizer = new AnnotationTokenizer(eNamedElement, content);
		parserNodes.clear();
		int token;
		while (annotationTokenizer.getCurrentToken() != AnnotationTokenizer.T_EOF && 
			(token = annotationTokenizer.nextToken()) != AnnotationTokenizer.T_EOF) {
			if (token != AnnotationTokenizer.T_TYPENAME) {
				throw new AnnotationParserException("Only typenames are allowed at the root of the " +
						"annotation, see _ for the error " + annotationTokenizer.getErrorText());
			}
			parseTypeName(null);
		}
		return parserNodes;
	}

	/** Adds a child to the parent */
	private void addToParent(ParserNode parent, ParserNode child) {
		if (parent == null) return;
		if (parent instanceof ComplexNode) {
			((ComplexNode)parent).getChildren().add(child);
		} else if (parent instanceof ArrayValueNode) {
			((ArrayValueNode)parent).getChildren().add(child);
		} else if (parent instanceof ReferenceValueNode) {
			((ReferenceValueNode)parent).setValue(child);
		}
	}
	
	/** Parse a type name */
	private void parseTypeName(ParserNode pn) {
		final ComplexNode cn = new ComplexNode();
		cn.setName(annotationTokenizer.getLexeme());
		addToParent(pn, cn);
		if (pn == null) {
			parserNodes.add(cn);
		}
		
		// now parse the next token
		final int token = annotationTokenizer.nextToken();
		switch (token) {
			case AnnotationTokenizer.T_CONTENTSTART:
				parseContent(cn);
				break;
			case AnnotationTokenizer.T_TYPENAME:
				parseTypeName(null); // the next one
				break;
			case AnnotationTokenizer.T_COMMA: // in case of array
				if (!(pn instanceof ArrayValueNode)) {
					throw new AnnotationParserException("Encountered comma but not within an array definition, see _ for error location " +
							annotationTokenizer.getErrorText());
				}
				return;
			default:
				throw new AnnotationParserException("Unknown token, see _ for error position: " +
						annotationTokenizer.getErrorText());
		}
	}
	
	/** Parse the content of a typeName */
	private void parseContent(ParserNode pn) {
		// content can either be an array or a set of values
		boolean finished = false;
		while (!finished) {
			final int token = annotationTokenizer.nextToken();
			switch (token) {
				case AnnotationTokenizer.T_EOF:
					throw new AnnotationParserException("Unexcepted end to annotation string, " + 
							annotationTokenizer.getErrorText());
				case AnnotationTokenizer.T_CONTENTEND:
					return;
				case AnnotationTokenizer.T_IDENTIFIER:
					final String identifier = annotationTokenizer.getLexeme();
					// next token must be an is
					if (annotationTokenizer.nextToken() != AnnotationTokenizer.T_IS) {
						throw new AnnotationParserException("No = character after identifier, see _ for error position " +
								annotationTokenizer.getErrorText());
					}
					final int nextToken = annotationTokenizer.nextToken();
					if (nextToken == AnnotationTokenizer.T_VALUE) { 
						final String value = annotationTokenizer.getLexeme();
						final PrimitiveValueNode vn = new PrimitiveValueNode();
						vn.setName(identifier);
						vn.setValue(value);
						addToParent(pn, vn);
					} else if (nextToken == AnnotationTokenizer.T_TYPENAME) {
						final ReferenceValueNode rvn = new ReferenceValueNode();
						rvn.setName(identifier);
						parseTypeName(rvn);
						addToParent(pn, rvn);
					} else if (nextToken == AnnotationTokenizer.T_ARRAYSTART) {
						final ArrayValueNode avn = new ArrayValueNode();
						avn.setName(identifier);
						parseArray(avn);
						addToParent(pn, avn);
					} else if (annotationTokenizer.nextToken() != AnnotationTokenizer.T_VALUE) {
						throw new AnnotationParserException("No value token after =, see _ for error position " +
								annotationTokenizer.getErrorText());
					}
					break;
				case AnnotationTokenizer.T_ARRAYSTART:
					parseArray(pn);
					break;
			}
		}
	}
	
	/** Parse an array */
	private void parseArray(ParserNode pn) {
		// content can either be an array or a set of values
		final ArrayValueNode an = new ArrayValueNode();
		addToParent(pn, an);
		boolean finished = false;
		while (!finished) {
			final int token = annotationTokenizer.nextToken();
			switch (token) {
				case AnnotationTokenizer.T_EOF:
					throw new AnnotationParserException("Unexcepted end to annotation string, " + 
							annotationTokenizer.getErrorText());
				case AnnotationTokenizer.T_TYPENAME:
					parseTypeName(an);
					break;
				case AnnotationTokenizer.T_COMMA:
					break;
				case AnnotationTokenizer.T_ARRAYEND:
					return;
			}
		}
	}
}
