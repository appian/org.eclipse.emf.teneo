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
 * $Id: RentalMapAsClassAction.java,v 1.4 2008/02/28 07:08:14 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.rental.Currency;
import org.eclipse.emf.teneo.rental.Manufacturer;
import org.eclipse.emf.teneo.rental.RentalBicycle;
import org.eclipse.emf.teneo.rental.RentalBicycleType;
import org.eclipse.emf.teneo.rental.RentalCar;
import org.eclipse.emf.teneo.rental.RentalCarSize;
import org.eclipse.emf.teneo.rental.RentalContract;
import org.eclipse.emf.teneo.rental.RentalFactory;
import org.eclipse.emf.teneo.rental.RentalPackage;
import org.eclipse.emf.teneo.rental.impl.RentalContractImpl;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests mapping an eclass as a class.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
public class RentalMapAsClassAction extends AbstractTestAction {
	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public RentalMapAsClassAction() {
		super(RentalPackage.eINSTANCE);
	}

	/**
	 * Set the SET_PROXY property to true.
	 * 
	 * @see org.eclipse.emf.teneo.test.AbstractTestAction#getExtraConfigurationProperties()
	 */
	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.SET_PROXY, "true");
		props.setProperty(PersistenceOptions.SET_DEFAULT_CASCADE_ON_NON_CONTAINMENT, "true");
		return props;
	}

	/** Test */
	@Override
	public void doAction(TestStore store) {
		final RentalFactory rf = RentalFactory.eINSTANCE;

		{
			RentalContract rcontract = rf.createRentalContract();
			RentalCar rcar = rf.createRentalCar();
			RentalBicycle rb = rf.createRentalBicycle();
			rcar.setDescription("car");
			rcar.setSize(RentalCarSize.FAMILY);
			rb.setDescription("bicycle");
			rb.setType(RentalBicycleType.MOUNTAIN_BIKE);
			Manufacturer m = rf.createManufacturer();
			m.setCode("gazelle");
			rb.setManufacturer(m);
			rcontract.getRentalUnits().add(rcar);
			rcontract.getRentalUnits().add(rb);
			rcontract.setCost(4.5f);
			rcontract.setStartDate(new Date());
			rcontract.setEndDate(new Date());
			rcontract.setRentToBusinessPartner("business partner");

			Currency c = rf.createCurrency();
			c.setCode("EUR");
			rcontract.setCurrency(c);
			store.beginTransaction();
			store.store(rcontract.getRentalUnits());
			store.store(rcontract);
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			final RentalContract rc = (RentalContract) store.query("select rc from RentalContract as rc")
					.get(0);
			assertEquals(2, rc.getRentalUnits().size());
			final RentalCar rcar = (RentalCar) rc.getRentalUnits().get(0);
			final RentalBicycle rb = (RentalBicycle) rc.getRentalUnits().get(1);
			Currency c = rc.getCurrency();
			assertEquals("EUR", c.getCode());
			assertTrue(c.getClass().getSimpleName().indexOf("$$") != -1); // rough test, no
			// dependencies on
			// hibernate from this
			// package
			assertEquals("car", rcar.getDescription());
			assertEquals(RentalBicycleType.MOUNTAIN_BIKE, rb.getType());
			assertEquals("bicycle", rb.getDescription());
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			List<?> list = store.query("select rc from " + RentalContractImpl.class.getName() + " as rc");
			RentalContract rc = (RentalContract) list.get(0);
			assertEquals(2, rc.getRentalUnits().size());
			final RentalCar rcar = (RentalCar) rc.getRentalUnits().get(0);
			final RentalBicycle rb = (RentalBicycle) rc.getRentalUnits().get(1);
			Currency c = rc.getCurrency();
			assertEquals("EUR", c.getCode());
			assertTrue(c.getClass().getSimpleName().indexOf("$$") != -1); // rough test, no
			// dependencies on
			// hibernate from this
			// package
			assertEquals("car", rcar.getDescription());
			assertEquals(RentalBicycleType.MOUNTAIN_BIKE, rb.getType());
			assertEquals("bicycle", rb.getDescription());
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			List<?> list = store.query("select rc from " + RentalContract.class.getName() + " as rc");
			RentalContract rc = (RentalContract) list.get(0);
			assertEquals(2, rc.getRentalUnits().size());
			final RentalCar rcar = (RentalCar) rc.getRentalUnits().get(0);
			final RentalBicycle rb = (RentalBicycle) rc.getRentalUnits().get(1);
			Currency c = rc.getCurrency();
			assertEquals("EUR", c.getCode());
			assertTrue(c.getClass().getSimpleName().indexOf("$$") != -1); // rough test, no
			// dependencies on
			// hibernate from this
			// package
			assertEquals("car", rcar.getDescription());
			assertEquals(RentalBicycleType.MOUNTAIN_BIKE, rb.getType());
			assertEquals("bicycle", rb.getDescription());
			store.commitTransaction();
		}

		try {
			Resource res = store.getResource();
			res.load(Collections.EMPTY_MAP);
			assertEquals(5, res.getContents().size());
		} catch (Exception e) {
			throw new StoreTestException(e.getMessage(), e);
		}
	}
}