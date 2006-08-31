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
 * $Id: Test.java,v 1.1 2006/08/31 15:33:17 mtaal Exp $
 */

package org.eclipse.emf.teneo.annotations.parser;

import java.util.List;


/**
 * An array node contains a list of child values
 * 
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
public class Test{
	
	public static void main(String[] args) {
		final String test = "@Embedded\n" +
    "@AttributeOverrides({\n" +
    "@AttributeOverride(name = \"iso2\", column = @Column(name = \"bornIso2\")),\n" +
    "@AttributeOverride(name = \"name\", column = @Column(name = \"bornCountryName\"))\n" +
            "})";
		AnnotationParser ap = new AnnotationParser();
		List pn = ap.parse(null, test);
	}
}
