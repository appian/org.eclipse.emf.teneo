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
 * $Id: EmbeddedAction.java,v 1.1 2006/07/04 22:12:15 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;


import org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embeddable;
import org.eclipse.emf.teneo.samples.emf.annotations.embedded.EmbeddedFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.embedded.EmbeddedPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embedder;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Testcase
 *  
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
*/
public class EmbeddedAction extends AbstractTestAction 
{
	/**
	 * Constructor
	 * @param arg0
	 */
	public EmbeddedAction()  
	{
		super(EmbeddedPackage.eINSTANCE);
	}

	/** Just create and store an embedded and see if it all worked without column name clashes */
	public void doAction(TestStore store)
	{
		final EmbeddedFactory factory = EmbeddedFactory.eINSTANCE;
		{
			store.beginTransaction();
	    		Embedder embedder = factory.createEmbedder();
	    		{
		    		Embeddable ea = factory.createEmbeddable();
		    		ea.setMyInteger(1);
		    		ea.setMyString("string");
		    		embedder.setFirstEmbedded(ea);
	    		}
		        
	    		{
		    		Embeddable ea = factory.createEmbeddable();
		    		ea.setMyInteger(2);
		    		ea.setMyString("string");
		    		embedder.setSecondEmbedded(ea);
	    		}
	
	    		{
		    		Embeddable ea = factory.createEmbeddable();
		    		ea.setMyInteger(3);
		    		ea.setMyString("string");
		    		embedder.setThirdEmbedded(ea);
	    		}
	
	    		{
		    		Embeddable ea = factory.createEmbeddable();
		    		ea.setMyInteger(4);
		    		ea.setMyString("string");
		    		embedder.getFourthEmbedded().add(ea);

		    		Embeddable ea2 = factory.createEmbeddable();
		    		ea2.setMyInteger(5);
		    		ea2.setMyString("string5");
		    		embedder.getFourthEmbedded().add(ea2);		    		
	    		}

	    		{
		    		Embeddable ea = factory.createEmbeddable();
		    		ea.setMyInteger(6);
		    		ea.setMyString("fifthstring");
		    		embedder.setFifthEmbedded(ea);
	    		}
	        store.store(embedder);
	        store.commitTransaction();
		}
		{
	    		store.beginTransaction();
	    		Embedder embedder = (Embedder)store.getObject(Embedder.class);
	    		assertEquals(1, embedder.getFirstEmbedded().getMyInteger());
	    		assertEquals(2, embedder.getSecondEmbedded().getMyInteger());
	    		assertEquals(3, embedder.getThirdEmbedded().getMyInteger());
	    		assertEquals(4, ((Embeddable)embedder.getFourthEmbedded().get(0)).getMyInteger());
	    		assertEquals(5, ((Embeddable)embedder.getFourthEmbedded().get(1)).getMyInteger());
	    		assertEquals(6, embedder.getFifthEmbedded().getMyInteger());
	    		store.commitTransaction();			
		}        
    	}
}