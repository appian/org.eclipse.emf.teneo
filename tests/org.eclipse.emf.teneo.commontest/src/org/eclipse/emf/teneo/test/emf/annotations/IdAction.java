/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * IdAction.java,v 1.4 2007/03/20 23:33:38 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;

import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.teneo.samples.emf.annotations.id.AutoID;
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
 * @version $Revision: 1.8 $
 */
public class IdAction extends AbstractTestAction {
	/** How many test objects are created */
	private static final int NO_TEST_OBJECTS = 10;

	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public IdAction() {
		super(IdPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		System.err.println(store.getMappingXML());

		final IdFactory factory = IdFactory.eINSTANCE;
		{
			store.beginTransaction();
			for (int i = 0; i < NO_TEST_OBJECTS; i++) {
				store.store(factory.createIdentityID());
				store.store(factory.createTableID());
				store.store(factory.createSimpleID());
				store.store(factory.createTableGeneratorID());

				final AutoID aid = factory.createAutoID();
				aid.setName("autoid" + i);
				store.store(aid);

			}
			store.commitTransaction();
		}

		// read back and check it
		{
			store.beginTransaction();
			// test if we saved them all
			List<?> list = store.getObjects(IdentityID.class);
			HashMap<Long, Object> testMap = new HashMap<Long, Object>();
			for (final Object element : list) {
				final IdentityID iid = (IdentityID) element;
				testMap.put(new Long(iid.getMyid()), iid);
			}
			assertEquals(NO_TEST_OBJECTS, testMap.size());

			list = store.getObjects(TableID.class);
			testMap = new HashMap<Long, Object>();
			for (final Object element : list) {
				final TableID sid = (TableID) element;
				testMap.put(new Long(sid.getMyid()), sid);
			}
			assertEquals(NO_TEST_OBJECTS, testMap.size());

			list = store.getObjects(SimpleID.class);
			testMap = new HashMap<Long, Object>();
			for (final Object element : list) {
				final SimpleID sid = (SimpleID) element;
				testMap.put(new Long(sid.getAutoID()), sid);
			}
			assertEquals(NO_TEST_OBJECTS, testMap.size());

			list = store.getObjects(TableGeneratorID.class);
			testMap = new HashMap<Long, Object>();
			for (final Object element : list) {
				final TableGeneratorID sid = (TableGeneratorID) element;
				testMap.put(new Long(sid.getMyid()), sid);
			}
			assertEquals(NO_TEST_OBJECTS, testMap.size());

			list = store.getObjects(AutoID.class);
			testMap = new HashMap<Long, Object>();
			int i = 0;
			for (final Object element : list) {
				final AutoID aid = (AutoID) element;
				assertEquals("autoid" + (i++), aid.getName());
				testMap.put(new Long(aid.getAutoID()), aid);
			}
			assertEquals(NO_TEST_OBJECTS, testMap.size());
			store.commitTransaction();
		}
	}
}