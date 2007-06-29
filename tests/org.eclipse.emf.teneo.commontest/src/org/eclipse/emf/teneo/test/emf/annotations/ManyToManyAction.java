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
 * $Id: ManyToManyAction.java,v 1.5 2007/06/29 07:35:43 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.teneo.mapping.elist.PersistableEList;
import org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Cntr;
import org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Lft;
import org.eclipse.emf.teneo.samples.emf.annotations.manytomany.ManytomanyFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.manytomany.ManytomanyPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Rght;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Testcase
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */
public class ManyToManyAction extends AbstractTestAction {
	/** How many test objects are created */
	private static final int NO_TEST_OBJECTS = 10;

	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public ManyToManyAction() {
		super(ManytomanyPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		final ManytomanyFactory factory = ManytomanyFactory.eINSTANCE;
		{
			store.beginTransaction();
			final ArrayList<Cntr> centers = new ArrayList<Cntr>();
			final ArrayList<Lft> lefts = new ArrayList<Lft>();
			final ArrayList<Rght> rights = new ArrayList<Rght>();
			for (int i = 0; i < NO_TEST_OBJECTS; i++) {
				centers.add(factory.createCntr());
				lefts.add(factory.createLft());
				rights.add(factory.createRght());
			}
			for (int i = 0; i < NO_TEST_OBJECTS; i++) {
				final Cntr c = centers.get(i);
				c.getLft().addAll(lefts);
				c.getRght().addAll(rights);
				store.store(c);
			}
			store.commitTransaction();
		}

		// do some counts
		store.checkNumber(Cntr.class, NO_TEST_OBJECTS);
		store.checkNumber(Lft.class, NO_TEST_OBJECTS);
		store.checkNumber(Rght.class, NO_TEST_OBJECTS);

		// check lazy versus eager loading
		{
			store.beginTransaction();
			final List<?> lefts = store.getObjects(Lft.class);
			assertEquals(NO_TEST_OBJECTS, lefts.size());
			for (int i = 0; i < lefts.size(); i++) {
				final Lft left = (Lft) lefts.get(i);
				final PersistableEList<?> elist = (PersistableEList<?>) left.getCntr();
				assertTrue("Lft's center elist should be lazy loaded", !elist.isLoaded());
				assertEquals(NO_TEST_OBJECTS, left.getCntr().size());
			}

			// take one left and check the centers
			final List<?> centers = ((Lft) lefts.get(0)).getCntr();
			for (int i = 0; i < centers.size(); i++) {
				final Cntr c = (Cntr) centers.get(i);
				final PersistableEList<?> elist = (PersistableEList<?>) c.getRght();
				assertTrue("Cntr's right elist should be eager loaded", elist.isLoaded());
				assertEquals(NO_TEST_OBJECTS, c.getRght().size());
			}

			store.commitTransaction();
		}

		// now test noncascading delete
		{
			store.beginTransaction();
			final List<?> rights = store.getObjects(Rght.class);
			assertEquals(NO_TEST_OBJECTS, rights.size());
			for (int i = 0; i < rights.size(); i++) {
				final Rght right = (Rght) rights.get(i);
				right.getCntr().clear();
				store.store(right);
			}
			store.commitTransaction();
		}

		// check lazy versus eager loading
		{
			store.beginTransaction();
			final List<?> lefts = store.getObjects(Lft.class);
			assertEquals(NO_TEST_OBJECTS, lefts.size());
			for (int i = 0; i < lefts.size(); i++) {
				final Lft left = (Lft) lefts.get(i);
				left.getCntr().clear();
				store.store(left);
			}
			store.commitTransaction();
		}

		// do some counts
		store.checkNumber(Cntr.class, NO_TEST_OBJECTS);
		store.checkNumber(Lft.class, NO_TEST_OBJECTS);
		store.checkNumber(Rght.class, NO_TEST_OBJECTS);

		// now delete some
		{
			store.beginTransaction();
			final List<?> lefts = store.getObjects(Lft.class);
			assertEquals(NO_TEST_OBJECTS, lefts.size());
			for (int i = 0; i < lefts.size(); i++) {
				final Lft left = (Lft) lefts.get(i);
				store.deleteObject(left);
			}
			store.commitTransaction();
		}

		store.checkNumber(Cntr.class, NO_TEST_OBJECTS);
		store.checkNumber(Lft.class, 0);
		store.checkNumber(Rght.class, NO_TEST_OBJECTS);
	}
}