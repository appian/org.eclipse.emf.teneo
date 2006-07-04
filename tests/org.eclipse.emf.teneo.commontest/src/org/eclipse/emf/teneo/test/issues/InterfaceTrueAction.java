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
 * $Id: InterfaceTrueAction.java,v 1.1 2006/07/04 22:12:16 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.issues;

import org.eclipse.emf.teneo.samples.issues.interfacetrue.InterfacetrueFactory;
import org.eclipse.emf.teneo.samples.issues.interfacetrue.InterfacetruePackage;
import org.eclipse.emf.teneo.samples.issues.interfacetrue.USAddress;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests the setting interface="true" on an eclass
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class InterfaceTrueAction extends AbstractTestAction {
	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public InterfaceTrueAction() {
		super(InterfacetruePackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	public void doAction(TestStore store) {
		{
			store.beginTransaction();
			USAddress usAddress = InterfacetrueFactory.eINSTANCE.createUSAddress();
			usAddress.setName("myname");
			usAddress.setState("mystate");
			store.store(usAddress);
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			USAddress usAddress = (USAddress) store.getObject(USAddress.class);
			assertTrue("Name is not set", "myname".compareTo(usAddress.getName()) == 0);
			assertTrue("State is not set", "mystate".compareTo(usAddress.getState()) == 0);
			store.commitTransaction();
		}
	}
}
