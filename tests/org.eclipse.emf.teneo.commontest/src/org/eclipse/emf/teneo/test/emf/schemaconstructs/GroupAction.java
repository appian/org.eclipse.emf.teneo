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
 * $Id: GroupAction.java,v 1.1 2006/07/04 22:12:15 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.schemaconstructs;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.Address;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.AddressGroup;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.AddressList;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.GroupallFactory;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.GroupallPackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.SimpleAllMapType;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.SimpleAllType;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Simple test for: xsd:group, xsd:all, ecore:name on xsd:group, repeating xsd:sequence, repeating xsd:group  
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $ 
*/
public class GroupAction extends AbstractTestAction 
{
	/**
	 * Constructor for ClassHierarchyParsing.
	 * @param arg0
	 */
	public GroupAction() 
	{
		super(GroupallPackage.eINSTANCE);
	}
	
	/** Creates simple types and tests against */
	public void doAction(TestStore store)
	{
		// test a simple type
        final GroupallFactory factory = GroupallFactory.eINSTANCE;
        // store an all type
    	{
	        store.beginTransaction();
	        SimpleAllType all = factory.createSimpleAllType();
	        all.setAaa("aaa");
	        all.setBbb("bbb");
	        all.setCcc("ccc");
	        store.store(all);
	        store.commitTransaction();
    	}
    	
    	// get an all type
    	{
	        store.beginTransaction();
	        SimpleAllType all = (SimpleAllType)store.getObject(SimpleAllType.class);
	        assertEquals(all.getAaa(), "aaa");
	        assertEquals(all.getBbb(), "bbb");
	        assertEquals(all.getCcc(), "ccc");
	        store.commitTransaction();
    	}
    	
    	// store a featuremap all type
    	{
    		store.beginTransaction();
    		SimpleAllMapType all = factory.createSimpleAllMapType();
	        all.setBbb("bbb"); // note the ordering, test below
	        all.setAaa("aaa");
	        all.setCcc("ccc");
	        store.store(all);
    		store.commitTransaction();
    	}
    	
    	// get a featuremap all type
    	{
    		store.beginTransaction();
	        SimpleAllMapType all = (SimpleAllMapType)store.getObject(SimpleAllMapType.class);
	        assertEquals(all.getAllMap().getValue(0), "bbb");
	        assertEquals(all.getAllMap().getValue(1), "aaa");
	        assertEquals(all.getAllMap().getValue(2), "ccc");
	        assertEquals(all.getAllMap().getEStructuralFeature(0), GroupallPackage.eINSTANCE.getSimpleAllMapType_Bbb());
	        assertEquals(all.getAllMap().getEStructuralFeature(1), GroupallPackage.eINSTANCE.getSimpleAllMapType_Aaa());
	        assertEquals(all.getAllMap().getEStructuralFeature(2), GroupallPackage.eINSTANCE.getSimpleAllMapType_Ccc());
	        store.store(all);
    		store.commitTransaction();
    	}
    	
    	// store an address group
    	{
	        store.beginTransaction();
    		AddressGroup group0 = factory.createAddressGroup();
    		group0.setGroupName("mygroup0");
    		group0.setBillTo(createAddress(factory, 0));
    		group0.setShipTo(createAddress(factory, 1));
    		store.store(group0);

    		AddressGroup group1 = factory.createAddressGroup();
    		group1.setGroupName("mygroup1");
    		group1.setSimpleAddress("s0");
    		store.store(group1);
	        store.commitTransaction();
    	}
    	
    	// check the address group
    	{
	        store.beginTransaction();
	        Collection coll = store.getObjects(AddressGroup.class);
	        Iterator it = coll.iterator();
	        while (it.hasNext())
	        {
	        	AddressGroup group = (AddressGroup)it.next();
	        	if (group.getGroupName().endsWith("1")) // group0
	        	{
	        		assertEquals(group.getBillTo(), null);
	        		assertEquals(group.getShipTo(), null);
	        		assertEquals(group.getSimpleAddress(), "s0");
	        	}
	        	else if (group.getGroupName().endsWith("0")) // group1
	        	{
	        		checkAddress(group.getBillTo(), 0);
	        		checkAddress(group.getShipTo(), 1);
	        	}
	        	else
	        	{
	        		assertTrue("Group with name: " + group.getGroupName() + " unknown ", false);
	        	}
	        }
	        store.commitTransaction();
    	}
    	
    	// store a address list
    	{
	        store.beginTransaction();
    		AddressList list0 = factory.createAddressList();
    		list0.setGroupName("list0");
    		list0.getBillTo().add(createAddress(factory, 2));
    		list0.getShipTo().add(createAddress(factory, 3));
    		list0.getBillTo().add(createAddress(factory, 4));
    		list0.getShipTo().add(createAddress(factory, 5));
    		store.store(list0);
	        store.commitTransaction();
    	}

    	store.checkNumber(Address.class, 6);
    	
    	// now test if it was all stored correctly
    	// addresslit
    	{
	        store.beginTransaction();
    		AddressList list0 = (AddressList)store.getObject(AddressList.class);
    		checkAddress((Address)((FeatureMap.Entry)list0.getAddrs().get(0)).getValue(), 2);
    		checkAddress((Address)((FeatureMap.Entry)list0.getAddrs().get(1)).getValue(), 3);
    		checkAddress((Address)((FeatureMap.Entry)list0.getAddrs().get(2)).getValue(), 4);
    		checkAddress((Address)((FeatureMap.Entry)list0.getAddrs().get(3)).getValue(), 5);
    		store.commitTransaction();
    	}
    	
	}
	
	/** Creates an address */
	private Address createAddress(GroupallFactory factory, int index)
	{
		Address adr = factory.createAddress();
		adr.getGroup().add(GroupallPackage.eINSTANCE.getAddress_Name(), index + "n1");
		adr.getGroup().add(GroupallPackage.eINSTANCE.getAddress_LongName(), index + "l1");
		adr.getGroup().add(GroupallPackage.eINSTANCE.getAddress_Name(), index + "n2");
		adr.getGroup().add(GroupallPackage.eINSTANCE.getAddress_LongName(), index + "l2");
		return adr;
	}
	
	/** Checks if an address is valid */
	private void checkAddress(Address adr, int index)
	{
		assertEquals(adr.getLongName().get(0), index + "l1");
		assertEquals(adr.getLongName().get(1), index + "l2");
		assertEquals(adr.getName().get(0), index + "n1");
		assertEquals(adr.getName().get(1), index + "n2");
		
		assertEquals(adr.getGroup().getValue(0), index + "n1");
		assertEquals(adr.getGroup().getValue(1), index + "l1");
		assertEquals(adr.getGroup().getValue(2), index + "n2");
		assertEquals(adr.getGroup().getValue(3), index + "l2");
	}
}