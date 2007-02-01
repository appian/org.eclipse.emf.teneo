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
 * $Id: PKeyJoinAction.java,v 1.2 2007/02/01 12:35:36 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;

import org.eclipse.emf.teneo.samples.emf.annotations.primarykeyjoin.Body;
import org.eclipse.emf.teneo.samples.emf.annotations.primarykeyjoin.Head;
import org.eclipse.emf.teneo.samples.emf.annotations.primarykeyjoin.PrimarykeyjoinFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.primarykeyjoin.PrimarykeyjoinPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Testcase
 *  
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
*/
public class PKeyJoinAction extends AbstractTestAction 
{
	/**
	 * Constructor for ClassHierarchyParsing.
	 * @param arg0
	 */
	public PKeyJoinAction()  
	{
		super(PrimarykeyjoinPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	public void doAction(TestStore store)
	{
		final PrimarykeyjoinFactory factory = PrimarykeyjoinFactory.eINSTANCE;
	    	{
	    		store.beginTransaction();
	    		Body bd = factory.createBody();
	    		bd.setTheID(5);
	    		Head hd = factory.createHead();
	    		hd.setMyID(5);
	    		bd.setHead(hd);
	    		store.store(bd);
	    		store.store(hd);
	    		store.commitTransaction();
	    	}
	    	{
	    		store.beginTransaction();
	    		Body bd = (Body)store.getObject(Body.class);
	    		assertEquals(5, bd.getHead().getMyID());
	    		assertEquals(5, bd.getTheID());
	    		store.commitTransaction();
	    	}
	    	{
	    		store.beginTransaction();
	    		Body bd = factory.createBody();
	    		bd.setTheID(6);
	    		Head hd = factory.createHead();
	    		hd.setMyID(7);
	    		bd.setHead(hd);
	    		store.store(bd);
	    		store.store(hd);
	    		try {
	    			store.commitTransaction();
	    			fail("Foreign key constraint is not enforced");
	    		} catch (Exception e) {
	    			// success
	    			store.rollbackTransaction();
	    		}
	    	}
	    	
	}	
}