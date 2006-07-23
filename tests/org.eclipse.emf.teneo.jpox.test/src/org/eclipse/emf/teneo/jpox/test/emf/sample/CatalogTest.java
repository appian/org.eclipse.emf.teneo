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
 * $Id: CatalogTest.java,v 1.3 2006/07/23 19:28:58 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.test.emf.sample;

import org.eclipse.emf.teneo.test.AbstractActionTest;
import org.eclipse.emf.teneo.test.emf.sample.CatalogAction;

/**
 * Tests the library example of emf/xsd.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class CatalogTest extends AbstractActionTest {

	static final CatalogAction testAction = new CatalogAction() {

		protected String getQueryText() {
			return "SELECT FROM org.eclipse.emf.teneo.samples.emf.sample.catalog.impl.ProductTypeImpl WHERE remark.contains(rem) && rem.value == \"remarka\" VARIABLES org.eclipse.emf.teneo.samples.emf.sample.catalog.impl.StringTypeImpl rem";
		}
	};

	public CatalogTest() {
		super(testAction);
	}
}
