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
 * $Id: RestrictionAction.java,v 1.3 2007/02/01 12:35:37 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.schemaconstructs;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.RestrictionPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests for the mixed construction.  
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $ 
*/
public class RestrictionAction extends AbstractTestAction 
{
	/**
	 * Constructor for ClassHierarchyParsing.
	 * @param arg0
	 */
	public RestrictionAction() 
	{
		super(RestrictionPackage.eINSTANCE);
	}
	
	/** Returns true if hibernate is enabled for a test, false otherwise */
	protected boolean hibernateEnabled()
	{
		return true;
	}

	/** Creates simple types and tests against */
	public void doAction(TestStore store)
	{
		// test a simple type
        //final RestrictionFactory factory = RestrictionFactory.eINSTANCE;
    	{
    		{
		        store.beginTransaction();
		        store.commitTransaction();
    		}
    	}
	}
}