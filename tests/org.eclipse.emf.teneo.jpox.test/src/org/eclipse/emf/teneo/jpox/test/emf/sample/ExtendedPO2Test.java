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
 * $Id: ExtendedPO2Test.java,v 1.4 2006/10/26 14:19:10 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.test.emf.sample;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.teneo.samples.emf.sample.epo2.Item;
import org.eclipse.emf.teneo.test.AbstractActionTest;
import org.eclipse.emf.teneo.test.emf.sample.ExtendedPO2Action;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
public class ExtendedPO2Test extends AbstractActionTest {

	final static ExtendedPO2Action testAction = new ExtendedPO2Action() {

		protected void checkContainerForSeparatelyReadItem(TestStore store) {
			store.beginTransaction();
			List list = store.getObjects(Item.class);
			for (Iterator it = list.iterator(); it.hasNext();) {
				Item itemtest2 = (Item) it.next();
				assertTrue(itemtest2.eContainer() == null);
			}
			store.commitTransaction();
		}
	};

	public ExtendedPO2Test() {
		super(testAction);
	}
}
