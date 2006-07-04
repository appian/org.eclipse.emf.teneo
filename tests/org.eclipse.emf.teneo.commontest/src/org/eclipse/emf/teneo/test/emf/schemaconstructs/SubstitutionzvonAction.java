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
 * $Id: SubstitutionzvonAction.java,v 1.1 2006/07/04 22:12:16 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.schemaconstructs;

import java.math.BigInteger;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.ComplexOddType;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.RootType;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.SubstitutionzvonFactory;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.SubstitutionzvonPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests for the mixed construction.  
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $ 
*/
public class SubstitutionzvonAction extends AbstractTestAction 
{
	/**
	 * Constructor for ClassHierarchyParsing.
	 * @param arg0
	 */
	public SubstitutionzvonAction()  
	{
		super(SubstitutionzvonPackage.eINSTANCE);
	}
	
	/** Creates simple types and tests against */
	public void doAction(TestStore store)
	{
		// test a simple type
        final SubstitutionzvonFactory factory = SubstitutionzvonFactory.eINSTANCE;
        final SubstitutionzvonPackage pack = SubstitutionzvonPackage.eINSTANCE;
    	{
    		{
		        store.beginTransaction();
		        RootType root = factory.createRootType();
		        root.getMyAbstractGroup().add(pack.getDocumentRoot_Odd(), new BigInteger("5"));
		        ComplexOddType complexOdd = factory.createComplexOddType();
		        complexOdd.setValue(39);
		        root.getMyComplexAbstractGroup().add(pack.getDocumentRoot_ComplexOdd(), complexOdd);
		        store.store(root);
		        store.commitTransaction();
    		}
    	}
	}
}