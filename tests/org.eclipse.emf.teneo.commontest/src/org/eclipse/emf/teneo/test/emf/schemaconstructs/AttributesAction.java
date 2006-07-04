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
 * $Id: AttributesAction.java,v 1.1 2006/07/04 22:12:15 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.schemaconstructs;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.attributes.A;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.attributes.AttributesFactory;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.attributes.AttributesPackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.attributes.R;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Very simple test to test that attributes also work.  
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $ 
*/
public abstract class AttributesAction extends AbstractTestAction 
{
	/**
	 * Constructor for ClassHierarchyParsing.
	 * @param arg0
	 */
	public AttributesAction()  
	{
		super(AttributesPackage.eINSTANCE);
	}
	
	/** Creates simple types and tests against */
	public void doAction(TestStore store)
	{
		// test a simple type
        final AttributesFactory factory = AttributesFactory.eINSTANCE;
    	{
    		{
		        store.beginTransaction();
		        A a = factory.createA();
		        a.setId("myniceid");
		        a.setB(500);
		        a.setC("c");
		        a.setComment(100.4);
		        a.setD("myd");
		        R r = factory.createR();
		        r.setName("myr");
		        a.setMyR(r);
		        a.setName("name");
		        store.store(a);
		        store.commitTransaction();
    		}
    		{
    			store.beginTransaction();
    			A a = (A)store.getObject(A.class);
    			assertEquals(500, a.getB());
    			assertEquals("c", a.getC());
    			assertTrue(100.4 == a.getComment());
    			assertEquals("myd", a.getD());
    			assertEquals("myr", a.getMyR().getName());
    			
    			// rough test that an id attribute works
    			checkIdIs(a, "myniceid");
    			
    			store.commitTransaction();
    		}
    		
    		{
    			store.beginTransaction();
    			A a = (A)store.getObject(A.class);
    			try
    			{
	    			a.setD(null); // this is not allowed a required attribute
	    			store.commitTransaction();
	    			fail("The D field is mandatory and should not be allowed to be set to empty");
    			}
    			catch (Exception e)
    			{
    				// this is good
    				store.rollbackTransaction();
    			}
    		}
    		
    		// all the other fields (except name) are optional
    		{
    			store.beginTransaction();
    			A a = (A)store.getObject(A.class);
    			a.setName(null);
    			a.unsetB();
    			a.unsetComment();
    			a.setC(null);
    			a.setMyR(null);
		        store.commitTransaction();
    		}
    	}
	}

	protected abstract void checkIdIs(EObject a, String string);
// TODO specialize for jpox/hibernate was:
//		if (store instanceof JPOXTestStore)
//			assertTrue(((PersistenceCapable)a).jdoGetObjectId().toString().indexOf("myniceid") != -1);
//		else if (store instanceof HibernateTestStore)
//			assertTrue(IdentifierCacheHandler.getID(a).toString().compareTo("myniceid") == 0);
	
}