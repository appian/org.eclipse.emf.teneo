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
 * $Id: ListUnionAction.java,v 1.3 2008/02/28 07:08:16 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.schemaconstructs;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.ListunionFactory;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.ListunionPackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.statesByCountry;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Simple test for: xsd:group, xsd:all, ecore:name on xsd:group, repeating xsd:sequence, repeating
 * xsd:group
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class ListUnionAction extends AbstractTestAction {
	/** The number of test objects created */
	private static final int NO_TEST_OBJECTS = 5;

	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public ListUnionAction() {
		super(ListunionPackage.eINSTANCE);
	}

	/** Creates simple types and tests against */
	public void doAction(TestStore store) {
		// test a simple type
		final ListunionFactory factory = ListunionFactory.eINSTANCE;

		// store an all type
		{
			store.beginTransaction();

			for (int i = 0; i < NO_TEST_OBJECTS; i++) {
				statesByCountry sbc = factory.createstatesByCountry();
				sbc.setCountry(i + "NL");
				sbc.setSimpleStringUnion(i + "union");
				sbc.setSimpleUnion(new BigInteger(i + ""));
				sbc.setZipUnion(i + "AK");
				final ArrayList allStates = new ArrayList();
				for (int j = 0; j < i; j++) {
					allStates.add(j + "AL");
				}
				sbc.setAllStates(allStates);
				final ArrayList sixStates = new ArrayList();
				for (int j = 0; j < i; j++) {
					sixStates.add(j + "AR");
					sbc.getSimpleUnions().add(new BigInteger(j + ""));
					sbc.getSimpleStringUnions().add(j + "AK");
				}
				sbc.setSixImportantStates(sixStates);

				store.store(sbc);
			}
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			final Collection coll = store.getObjects(statesByCountry.class);
			assertEquals(NO_TEST_OBJECTS, coll.size());
			final Iterator it = coll.iterator();
			while (it.hasNext()) {
				final statesByCountry sbc = (statesByCountry) it.next();
				final int index = ((BigInteger) sbc.getSimpleUnion()).intValue();
				assertEquals(index + "NL", sbc.getCountry());
				assertEquals(index + "union", sbc.getSimpleStringUnion());
				assertEquals(index + "AK", sbc.getZipUnion());
				for (int i = 0; i < index; i++) {
					assertEquals(i + "AL", sbc.getAllStates().get(i));
					assertEquals(i + "AR", sbc.getSixImportantStates().get(i));
					assertEquals(i, ((BigInteger) sbc.getSimpleUnions().get(i)).intValue());
					assertEquals(i + "AK", sbc.getSimpleStringUnions().get(i));
				}
			}
			store.commitTransaction();
		}
	}

}