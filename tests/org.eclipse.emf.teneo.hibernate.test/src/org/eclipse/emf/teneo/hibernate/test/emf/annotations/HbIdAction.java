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
 * $Id: HbIdAction.java,v 1.4 2007/06/29 07:35:13 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.annotations;

import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.IdFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.IdPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.IdentityID;
import org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.SimpleID;
import org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.TableID;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests GenericGenerator of hibernate
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
public class HbIdAction extends AbstractTestAction {
	/** How many test objects are created */
	private static final int NO_TEST_OBJECTS = 10;

	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public HbIdAction() {
		super(IdPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		final IdFactory factory = IdFactory.eINSTANCE;
		{
			store.beginTransaction();
			for (int i = 0; i < NO_TEST_OBJECTS; i++) {
				store.store(factory.createIdentityID());
				store.store(factory.createTableID());
				store.store(factory.createSimpleID());
			}
			store.commitTransaction();
		}

		// read back and check it
		{
			store.beginTransaction();
			// test if we saved them all
			List<?> list = store.getObjects(IdentityID.class);
			HashMap<Long, EObject> testMap = new HashMap<Long, EObject>();
			for (Object name : list) {
				IdentityID iid = (IdentityID) name;
				testMap.put(new Long(iid.getMyid()), iid);
			}
			assertEquals(NO_TEST_OBJECTS, testMap.size());

			list = store.getObjects(TableID.class);
			testMap = new HashMap<Long, EObject>();
			for (Object name : list) {
				TableID sid = (TableID) name;
				testMap.put(new Long(sid.getMyid()), sid);
			}
			assertEquals(NO_TEST_OBJECTS, testMap.size());

			list = store.getObjects(SimpleID.class);
			testMap = new HashMap<Long, EObject>();
			for (Object name : list) {
				SimpleID sid = (SimpleID) name;
				testMap.put(new Long(sid.getAutoID()), sid);
			}
			assertEquals(NO_TEST_OBJECTS, testMap.size());
			store.commitTransaction();
		}
	}
}