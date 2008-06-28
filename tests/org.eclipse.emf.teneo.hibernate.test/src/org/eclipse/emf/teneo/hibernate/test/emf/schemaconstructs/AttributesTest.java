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
 * $Id: AttributesTest.java,v 1.5 2008/06/28 22:41:25 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.schemaconstructs;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.teneo.hibernate.mapping.identifier.IdentifierCacheHandler;
import org.eclipse.emf.teneo.test.AbstractActionTest;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.AttributesAction;

/**
 * Tests the library example of emf/xsd.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */
public class AttributesTest extends AbstractActionTest {

	private static AttributesAction testAction = new AttributesAction() {

		@Override
		protected void checkIdIs(EObject o, String id) {
			assertTrue(IdentifierCacheHandler.getInstance().getID(o).toString().compareTo(id) == 0);
		}
	};

	public AttributesTest() {
		super(testAction);
	}
}
