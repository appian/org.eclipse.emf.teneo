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
 * $Id: ExtendedPO2Test.java,v 1.3 2007/02/01 12:36:24 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.sample;

import org.eclipse.emf.teneo.test.AbstractActionTest;
import org.eclipse.emf.teneo.test.emf.sample.ExtendedPO2Action;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests the library example of emf/xsd.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class ExtendedPO2Test extends AbstractActionTest {

	private static ExtendedPO2Action testAction = new ExtendedPO2Action() {

		protected void checkContainerForSeparatelyReadItem(TestStore store) {
			// TODO Auto-generated method stub
		}
	};

	public ExtendedPO2Test() {
		super(testAction);
	}
}
