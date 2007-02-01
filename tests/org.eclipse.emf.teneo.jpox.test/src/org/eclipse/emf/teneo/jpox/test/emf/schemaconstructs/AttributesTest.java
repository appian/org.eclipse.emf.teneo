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
 * $Id: AttributesTest.java,v 1.3 2007/02/01 12:34:05 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.test.emf.schemaconstructs;

import javax.jdo.spi.PersistenceCapable;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.teneo.test.AbstractActionTest;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.AttributesAction;

/**
 * Tests the library example of emf/xsd.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class AttributesTest extends AbstractActionTest {

	final static AttributesAction testAction = new AttributesAction() {

		protected void checkIdIs(EObject o, String id) {
			assertTrue(((PersistenceCapable) o).jdoGetObjectId().toString().indexOf("myniceid") != -1);
		}
	};

	public AttributesTest() {
		super(testAction);
	}
}
