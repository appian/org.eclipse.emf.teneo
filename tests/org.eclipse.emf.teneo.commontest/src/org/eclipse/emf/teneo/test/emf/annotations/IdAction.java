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
 * $Id: IdAction.java,v 1.3 2007/02/01 12:35:36 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;


import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.teneo.samples.emf.annotations.id.IdFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.id.IdPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.id.IdentityID;
import org.eclipse.emf.teneo.samples.emf.annotations.id.SimpleID;
import org.eclipse.emf.teneo.samples.emf.annotations.id.TableGeneratorID;
import org.eclipse.emf.teneo.samples.emf.annotations.id.TableID;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Testcase
 *  
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
*/
public class IdAction extends AbstractTestAction 
{
	/** How many test objects are created */
	private static final int NO_TEST_OBJECTS = 10;
	
	/**
	 * Constructor for ClassHierarchyParsing.
	 * @param arg0
	 */
	public IdAction()  
	{
		super(IdPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	public void doAction(TestStore store)
	{
		final IdFactory factory = IdFactory.eINSTANCE;
		store.disableDrop();
	    	{
	    		store.beginTransaction();
	    		for (int i = 0; i < NO_TEST_OBJECTS; i++) {
		    		store.store(factory.createIdentityID());
		    		store.store(factory.createTableID());
		    		store.store(factory.createSimpleID());
		    		store.store(factory.createTableGeneratorID());
	    		}
	    		store.commitTransaction();
	    	}
    	
	    	// read back and check it
	    	{
	    		store.beginTransaction();
	    		// test if we saved them all
	    		List list = (List)store.getObjects(IdentityID.class);
	    		HashMap testMap = new HashMap();
	    		for (Iterator it = list.iterator(); it.hasNext();) {
	    			IdentityID iid = (IdentityID)it.next();
	    			testMap.put(new Long(iid.getMyid()), iid);
	    		}
	    		assertEquals(NO_TEST_OBJECTS, testMap.size());
	    		
	    		list = (List)store.getObjects(TableID.class);
	    		testMap = new HashMap();
	    		for (Iterator it = list.iterator(); it.hasNext();) {
	    			TableID sid = (TableID)it.next();
	    			testMap.put(new Long(sid.getMyid()), sid);
	    		}
	    		assertEquals(NO_TEST_OBJECTS, testMap.size());
	    		
	    		list = (List)store.getObjects(SimpleID.class);
	    		testMap = new HashMap();
	    		for (Iterator it = list.iterator(); it.hasNext();) {
	    			SimpleID sid = (SimpleID)it.next();
	    			testMap.put(new Long(sid.getAutoID()), sid);
	    		}
	    		assertEquals(NO_TEST_OBJECTS, testMap.size());

	    		list = (List)store.getObjects(TableGeneratorID.class);
	    		testMap = new HashMap();
	    		for (Iterator it = list.iterator(); it.hasNext();) {
	    			final TableGeneratorID sid = (TableGeneratorID)it.next();
	    			testMap.put(new Long(sid.getMyid()), sid);
	    		}
	    		assertEquals(NO_TEST_OBJECTS, testMap.size());
	    		store.commitTransaction();
	    	}
	}	
}