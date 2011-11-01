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
 * $Id: InterfaceTrueAction.java,v 1.6 2008/09/17 20:28:02 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.issues;

import org.eclipse.emf.teneo.samples.issues.interfacetrue.AddressList;
import org.eclipse.emf.teneo.samples.issues.interfacetrue.InterfacetrueFactory;
import org.eclipse.emf.teneo.samples.issues.interfacetrue.InterfacetruePackage;
import org.eclipse.emf.teneo.samples.issues.interfacetrue.USAddress;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests the setting interface="true" on an eclass
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $
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
	@Override
	public void doAction(TestStore store) {
		{
			store.beginTransaction();
			USAddress usAddress = InterfacetrueFactory.eINSTANCE.createUSAddress();
			usAddress.setName("myname");
			usAddress.setState("mystate");
			store.store(usAddress);
			AddressList al = InterfacetrueFactory.eINSTANCE.createAddressList();
			al.getAddresses().add(usAddress);
			store.store(al);
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			USAddress usAddress = store.getObject(USAddress.class);
			assertTrue("Name is not set", "myname".compareTo(usAddress.getName()) == 0);
			assertTrue("State is not set", "mystate".compareTo(usAddress.getState()) == 0);
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			USAddress usAddress = InterfacetrueFactory.eINSTANCE.createUSAddress();
			usAddress.setName("a2");
			usAddress.setState("s2");
			store.store(usAddress);
			AddressList al = store.getObject(AddressList.class);
			al.getAddresses().add(usAddress);
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			AddressList al = store.getObject(AddressList.class);
			assertEquals(2, al.getAddresses().size());
			assertTrue(null != al.getAddresses().get(0).getName());
			store.commitTransaction();
		}
	}
}
