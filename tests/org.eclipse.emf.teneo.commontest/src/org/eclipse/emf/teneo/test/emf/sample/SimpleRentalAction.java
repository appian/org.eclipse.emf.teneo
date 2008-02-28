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
 * $Id: SimpleRentalAction.java,v 1.2 2008/02/28 07:08:16 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.util.Date;
import java.util.List;

import org.eclipse.emf.teneo.rental.RentalCar;
import org.eclipse.emf.teneo.rental.RentalCarSize;
import org.eclipse.emf.teneo.rental.RentalContract;
import org.eclipse.emf.teneo.rental.RentalFactory;
import org.eclipse.emf.teneo.rental.RentalPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests creating holes in a list index in the db
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class SimpleRentalAction extends AbstractTestAction {
	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public SimpleRentalAction() {
		super(RentalPackage.eINSTANCE);
	}

	/** Test */
	@Override
	public void doAction(TestStore store) {
		final RentalFactory rf = RentalFactory.eINSTANCE;
		{
			RentalContract rcontract = rf.createRentalContract();
			RentalCar rcar1 = rf.createRentalCar();
			rcar1.setDescription("car1");
			rcar1.setSize(RentalCarSize.FAMILY);
			RentalCar rcar2 = rf.createRentalCar();
			rcar2.setDescription("car2");
			rcar2.setSize(RentalCarSize.FAMILY);
			RentalCar rcar3 = rf.createRentalCar();
			rcar3.setDescription("car3");
			rcar3.setSize(RentalCarSize.FAMILY);
			rcontract.getRentalUnits().add(rcar1);
			rcontract.getRentalUnits().add(rcar2);
			rcontract.getRentalUnits().add(rcar3);
			rcontract.setCost(4.5f);
			rcontract.setEndDate(new Date());
			rcontract.setStartDate(new Date());
			rcontract.setRentToBusinessPartner("business partner");
			store.beginTransaction();
			store.store(rcontract);
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			List<?> cars = store.getObjects(RentalCar.class);
			for (Object o : cars) {
				final RentalCar rc = (RentalCar) o;
				if (rc.getDescription().compareTo("car2") == 0) {
					store.deleteObject(rc);
				}
			}
			store.commitTransaction();
		}

		{
			try {
				store.beginTransaction();
				final RentalContract rc = store.getObject(RentalContract.class);
				assertTrue(null == rc.getRentalUnits().get(1));
				store.commitTransaction();
				fail();
			} catch (NullPointerException npe) {
				// do nothing we should get here
			}
		}

	}
}
