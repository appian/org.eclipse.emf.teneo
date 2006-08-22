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
 * $Id: Relation1to1Action.java,v 1.3 2006/08/22 22:24:51 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.relation;

import org.eclipse.emf.teneo.samples.emf.relation.relation1to1.ContainedChildNR;
import org.eclipse.emf.teneo.samples.emf.relation.relation1to1.ContainedChildR;
import org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main;
import org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildNR;
import org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildNRT;
import org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildNRTNR;
import org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildR;
import org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildRTNR;
import org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Relation1to1Factory;
import org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Relation1to1Package;
import org.eclipse.emf.teneo.samples.emf.relation.relation1to1.impl.MainImpl;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests many different kinds of 1:1 relations
 *  
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $ 
*/
public class Relation1to1Action extends AbstractTestAction 
{
	/**
	 * Constructor
	 * @param arg0
	 */
	public Relation1to1Action() 
	{
		super(Relation1to1Package.eINSTANCE);
	}
		
	/** Tests cascading deletes, required relations, etc. for 1:1 relations */
	public void doAction(TestStore store)
	{
		// are not able to generate correct foreign key constraints in the generated sql, therefor this does 
		// not work.
		
		final Relation1to1Factory factory = Relation1to1Factory.eINSTANCE;
		
    	{
    		store.beginTransaction();

    		Main main = factory.createMain();
    		main.setName("main");
    		
    		// 	<element name="containedonewayrequired" type="this:ContainedChildR"/>
    		ContainedChildR containedChildR = factory.createContainedChildR();
    		containedChildR.setName("contained one way required");
    		main.setContainedonewayrequired(containedChildR);

			//<element name="containedoneWaynotrequired" type="this:ContainedChildNR" minOccurs="0"/>
    		ContainedChildNR containedChildNR = factory.createContainedChildNR();
    		containedChildNR.setName("contained one way not required");
    		main.setContainedoneWaynotrequired(containedChildNR);
    		
    		//<element name="notcontainedonewayrequired" type="xsd:IDREF" ecore:reference="this:NotContainedChildR"/>
    		NotContainedChildR notContainedChildR = factory.createNotContainedChildR();
    		notContainedChildR.setName("not contained one way required");
    		main.setNotcontainedonewayrequired(notContainedChildR);
    		
			//<element name="notcontainedonewaynotrequired" type="xsd:IDREF" ecore:reference="this:NotContainedChildNR" minOccurs="0"/>
    		NotContainedChildNR notContainedChildNR = factory.createNotContainedChildNR();
    		notContainedChildNR.setName("not contained one way not required");
    		main.setNotcontainedonewaynotrequired(notContainedChildNR);
    		
			//<element name="notcontainedtwowaynotrequired" type="xsd:IDREF" ecore:reference="this:NotContainedChildNRT" minOccurs="0" ecore:opposite="main"/>
    		NotContainedChildNRT notContainedChildNRT = factory.createNotContainedChildNRT();
    		notContainedChildNRT.setName("not contained two wat not required");
    		main.setNotcontainedtwowaynotrequired(notContainedChildNRT);
    		
    		assertTrue(notContainedChildNRT.getMain() != null);
    		
			//<element name="notcontainedtwowayrequirednr" type="xsd:IDREF" ecore:reference="this:NotContainedChildRTNR" ecore:opposite="main"/>
    		NotContainedChildRTNR notContainedChildRTNR = factory.createNotContainedChildRTNR();
    		notContainedChildRTNR.setName("not contained two way required - not required");
    		main.setNotcontainedtwowayrequirednr(notContainedChildRTNR);
    		
    		//<element name="notcontainedtwowaynotrequirednr" type="xsd:IDREF" ecore:reference="this:NotContainedChildNRTNR" minOccurs="0" ecore:opposite="main"/>
    		NotContainedChildNRTNR notContainedChildNRTNR = factory.createNotContainedChildNRTNR();
    		notContainedChildNRTNR.setName("not contained two way not required - not required");
    		main.setNotcontainedtwowaynotrequirednr(notContainedChildNRTNR);
    		
    		store.store(main);
    		
    		store.commitTransaction();
    	}
    	
    	// check that the main object can not be deleted
    	{
    		store.checkDeleteFails(Main.class);
    	}
    	
		// 	<element name="containedonewayrequired" type="this:ContainedChildR"/>
    	// 1) we should check here that this child can not be deleted separately
    	// 2) if the main object is deleted then this child should also be deleted!
		//ContainedChildR containedChildR = factory.createContainedChildR();
    	{
 
    		// check 1
    		store.checkDeleteFails(ContainedChildR.class);
    	}

    	//<element name="containedoneWaynotrequired" type="this:ContainedChildNR" minOccurs="0"/>
    	// 3) Direct delete of the child should not be possible as the parent points to it
    	// 4) if the main object is deleted then this child should also be deleted automatically
		//ContainedChildNR containedChildNR = factory.createContainedChildNR();
    	{	
    		// check 3
    		store.checkDeleteFails(ContainedChildNR.class);
    		
    		// restore again
       		store.beginTransaction();
       	 	MainImpl main = (MainImpl)store.getObject(Main.class);
       	 	
       	 	// check the econtainer
       	 	assertTrue("EContainer is null", main.getContainedoneWaynotrequired().eContainer() != null);
       	 	assertTrue("EContainer is null", main.getContainedonewayrequired().eContainer() != null);

       	 	ContainedChildNR containedChildNR = factory.createContainedChildNR();
    		containedChildNR.setName("test1");
    		main.setContainedoneWaynotrequired(containedChildNR);
    		store.commitTransaction();
    		
    		// should be two now
    		store.beginTransaction();
    		store.checkNumber(ContainedChildNR.class, 2);
    		store.commitTransaction();
    	}

		//<element name="notcontainedonewayrequired" type="xsd:IDREF" ecore:reference="this:NotContainedChildR"/>
    	// 6) Child can not be deleted without first removing the reference from the parent
    	// 6b) Element has to be set when parent is saved
    	// 7) The main object can not be deleted 
		//NotContainedChildR notContainedChildR = factory.createNotContainedChildR();
    	{
    		// check 6
    		store.checkDeleteFails(NotContainedChildR.class);
    		
    		// check 6b
    		store.beginTransaction();
    		MainImpl main = (MainImpl)store.getObject(Main.class);
    		main.setNotcontainedonewayrequired(null);
    		try
    		{
    			store.commitTransaction();
    			assertTrue(false);    			
    		}
    		catch (Exception e)
    		{
    			store.rollbackTransaction();
    		}
    	}
    	
		//<element name="notcontainedtwowaynotrequired" type="xsd:IDREF" ecore:reference="this:NotContainedChildNRT" minOccurs="0" ecore:opposite="main"/>
		//NotContainedChildNRT notContainedChildNRT = factory.createNotContainedChildNRT();
    	// 11) The main object can not be deleted without removing the ref to the child    	
    	// 12) Reference to child can be set to nullable and child/main object can be deleted
    	{
    		store.beginTransaction();
    		// check 11 and 12
    		MainImpl main = (MainImpl)store.getObject(Main.class);
    		NotContainedChildNRT delChild = main.getNotcontainedtwowaynotrequired();
    		main.setNotcontainedtwowaynotrequired(null);
    		store.deleteObject(delChild);
    		store.commitTransaction();
    	}

    	//<element name="notcontainedtwowayrequirednr" type="xsd:IDREF" ecore:reference="this:NotContainedChildRTNR" ecore:opposite="main"/>
		//NotContainedChildRTNR notContainedChildRTNR = factory.createNotContainedChildRTNR();
    	// 13) The main object can not be deleted without removing the ref to the child
    	// 14) The ref to the child can be replaced with a reference to another child
    	{
    		// check 14
    		store.checkDeleteFails(NotContainedChildRTNR.class);
    		
    		// check 14
    		/*
    		store.beginTransaction();
    		MainImpl main = (MainImpl)store.getObject(Main.class);
    		NotContainedChildRTNR curChild = main.getNotcontainedtwowayrequirednr();
    		NotContainedChildRTNR newChild = factory.createNotContainedChildRTNR();
    		newChild.setName("test");
    		main.setNotcontainedtwowayrequirednr(newChild);
    		store.deleteObject(curChild);
    		store.commitTransaction();
    		*/
    	}
		
		//<element name="notcontainedtwowaynotrequirednr" type="xsd:IDREF" ecore:reference="this:NotContainedChildNRTNR" minOccurs="0" ecore:opposite="main"/>
		//NotContainedChildNRTNR notContainedChildNRTNR = factory.createNotContainedChildNRTNR();
    	// 15) the child object can be deleted because all references are null
    	// 16) The child object can be unset from the main object
    	{
    		// check 14
    		store.beginTransaction();
    		MainImpl main = (MainImpl)store.getObject(Main.class);
    		NotContainedChildNRTNR child = main.getNotcontainedtwowaynotrequirednr(); 
    		main.setNotcontainedtwowaynotrequirednr(null);
    		store.deleteObject(child);
    		store.commitTransaction();
    	}
    	
    	// now make the main object deletable!
    	{
    		store.beginTransaction();

    		MainImpl main = (MainImpl)store.getObject(Main.class);

    		main.setNotcontainedonewaynotrequired(null);
    		
    		// is null so can not be deleted
    		//store.deleteObject(main.getNotcontainedtwowaynotrequired());

    		main.setNotcontainedtwowaynotrequirednr(null);
    		main.setNotcontainedtwowayrequirednr(null);
    		
    		store.deleteObject(main);
    		
    		store.commitTransaction();
    	}
    	
    	// and do some counts
    	{
    		store.beginTransaction();
    		store.checkNumber(ContainedChildR.class, 0);
    		store.checkNumber(ContainedChildNR.class, 1);
    		store.checkNumber(NotContainedChildNR.class, 1);
    		store.checkNumber(NotContainedChildNRTNR.class, 0);
    		store.checkNumber(NotContainedChildRTNR.class, 1);
    		store.checkNumber(NotContainedChildNRT.class, 0);
    		store.checkNumber(NotContainedChildR.class, 1);
    		store.commitTransaction();
    		
    	}
	}
}
