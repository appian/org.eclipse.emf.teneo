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
 * $Id: EcoreAttrsAction.java,v 1.4 2007/02/01 12:35:37 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.schemaconstructs;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.teneo.Constants;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.EcoreattrsFactory;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.EcoreattrsPackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.Element;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.Feature;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.Mixed;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.NameList;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests number of ecore attributes.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $ 
*/
public class EcoreAttrsAction extends AbstractTestAction 
{
	
	/**
	 * Constructor for ClassHierarchyParsing.
	 * @param arg0
	 */
	public EcoreAttrsAction() 
	{
		super(EcoreattrsPackage.eINSTANCE);
	}
	
	/** Creates simple types and tests against */
	public void doAction(TestStore store)
	{
		// test a simple type
        final EcoreattrsFactory factory = EcoreattrsFactory.eINSTANCE;
    	{
	        store.beginTransaction();
	        Feature feature = factory.createFeature();
	        feature.setName("001");
	        feature.setValue(1.5);
	        store.store(feature);
	        store.commitTransaction();
	        
	        store.beginTransaction();
	        feature = (Feature)store.getObject(Feature.class);
	        assertEquals("001", feature.getAMap().getValue(0));
	        assertEquals("001", feature.getName());
	        assertEquals(1.5, ((Double)feature.getAMap().getValue(1)).doubleValue(), 0.01);
	        assertEquals(1.5, feature.getValue(), 0.01);
	        store.commitTransaction();
    	}
    	
    	{
    		store.beginTransaction();
    		Mixed mixed = factory.createMixed();
    		mixed.getMixed().add(Constants.TEXT, "001");
    		mixed.setName("name");
    		mixed.getMixed().add(Constants.TEXT, "002");
    		mixed.setValue(1.5);
    		store.store(mixed);
    		store.commitTransaction();
    		
	        store.beginTransaction();
	        mixed = (Mixed)store.getObject(Mixed.class);
	        FeatureMap.Entry entry = (FeatureMap.Entry)mixed.getMixed().get(0);
	        assertEquals(entry.getEStructuralFeature(), Constants.TEXT);
	        assertEquals("001", entry.getValue());
	        
	        entry = (FeatureMap.Entry)mixed.getMixed().get(1);
	        assertEquals(entry.getEStructuralFeature(), EcoreattrsPackage.eINSTANCE.getMixed_Name());
	        assertEquals(entry.getValue(), "name");
	        assertTrue(mixed.getName() == entry.getValue());

	        entry = (FeatureMap.Entry)mixed.getMixed().get(2);
	        assertEquals(entry.getEStructuralFeature(), Constants.TEXT);
	        assertEquals("002", entry.getValue());
	        
	        entry = (FeatureMap.Entry)mixed.getMixed().get(3);
	        assertEquals(entry.getEStructuralFeature(), EcoreattrsPackage.eINSTANCE.getMixed_Value());
	        assertEquals(1.5, ((Double)entry.getValue()).doubleValue(), 0.01);
	        assertEquals(mixed.getValue(), ((Double)entry.getValue()).doubleValue(), 0.01);

	        store.commitTransaction();
    	}
    	
    	// namelist
    	{
    		store.beginTransaction();
    		Element elem = factory.createElement();
    		NameList namelist = factory.createNameList();
    		namelist.setFirstName("first");
    		namelist.setMiddleName("middle");
    		namelist.setLastName("last");
    		elem.setNames(namelist);
    		store.store(elem);
    		store.commitTransaction();
    		
    		store.beginTransaction();
    		elem = (Element)store.getObject(Element.class);
    		namelist = (NameList)elem.getNameMap().getValue(0);
    		assertTrue(namelist == elem.getNames());
    		assertEquals(namelist.getFirstName(), "first");
    		assertEquals(namelist.getMiddleName(), "middle");
    		assertEquals(namelist.getLastName(), "last");
    		
    		store.commitTransaction();
    	}
    	
	}
}
