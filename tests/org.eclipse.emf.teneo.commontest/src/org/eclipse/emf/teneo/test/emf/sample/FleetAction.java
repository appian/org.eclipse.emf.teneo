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
 * $Id: FleetAction.java,v 1.2 2009/03/15 14:49:53 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.util.Date;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

import temporal.TemporalPackage;
import fleet.Address;
import fleet.Car;
import fleet.Fleet;
import fleet.FleetFactory;
import fleet.FleetPackage;
import fleet.Garage;
import fleet.Person;
import fleet.Tire;
import fleet.VehicleInfo;

/**
 * Tests EStore
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class FleetAction extends AbstractTestAction {

	public FleetAction() {
		super(new EPackage[] { FleetPackage.eINSTANCE,
				TemporalPackage.eINSTANCE });
	}

	@Override
	@SuppressWarnings("unchecked")
	public void doAction(TestStore store) {
		final FleetFactory factory = FleetFactory.eINSTANCE;
		final Garage garage = factory.createGarage();
		garage.setName("Great Garage1");
		final Address address = factory.createAddress();
		address.setCity("doorn");
		address.setCountry("NL");
		address.setStreetName("Dutchlane");
		address.setStreetNumber("25");
		garage.setAddress(address);

		final Fleet fl1 = factory.createFleet();
		fl1.setId("fl1");
		fl1.setServiceGarage(garage);
		createData(fl1);

		final Fleet fl2 = factory.createFleet();
		fl2.setId("fl2");
		fl2.setServiceGarage(garage);
		createData(fl2);

		store.beginTransaction();
		store.store(garage);
		store.store(fl1);
		store.store(fl2);
		store.commitTransaction();

	}

	private void createData(Fleet fleet) {
		final FleetFactory factory = FleetFactory.eINSTANCE;

		String indexStr = fleet.getId();
		final Address address = factory.createAddress();
		address.setCity(indexStr + "doorn");
		address.setCountry(indexStr + "NL");
		address.setStreetName(indexStr + "Dutchlane");
		address.setStreetNumber(indexStr + "25");

		final Person person = factory.createPerson();
		person.setBirthAddress(address);
		person.setEmployed(false);
		person.setId(indexStr + "111-222-333-444");
		person.setName(indexStr + "Piet Hein");

		final Tire tire = factory.createTire();
		tire.setMake("michellin");
		tire.setModel("winter");
		tire.setProfile(2);
		tire.setRadius(2);
		tire.setWidth(3);

		final Car car = factory.createCar();
		car.setId(indexStr + "01-ps-fb");
		car.setBrand(indexStr + "volvo");
		car.setColor(indexStr + "dark-metalic-blue");
		car.setLength(5);
		car.setMake(indexStr + "TD5");
		car.setModel(indexStr + "v70");
		car.setNumPassengers(7);
		car.setNumTires(4);
		car.setOwner(person);

		assertTrue(person.eContainmentFeature() != null);

		car.setPassengerName(indexStr + "p");
		car.setPlate("01-ps-fb");
		car.setYear(2004);
		car.setTireSpec(tire);
		fleet.getVehicles().add(car);

		fleet.getServiceGarage().getVehicles().add(car);

		VehicleInfo vInfo = factory.createVehicleInfo();
		vInfo.setAcquisitionDate(new Date());
		vInfo.setVehicle(car);
		fleet.getVehicleInformation().add(vInfo);

	}
}
