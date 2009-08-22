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
 * $Id: ExtensionAction.java,v 1.7 2009/08/22 00:10:03 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.schemaconstructs;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.Address;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.AddressList;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.DistrictUKAddress;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.ExtensionFactory;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.ExtensionPackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.FirstAddressHolder;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.InternationalPrice;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.UKAddress;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.USAddress;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.USState;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests for: - Restriction simple type - Extension from simple to complex type - Abstract type - IDREFS - Inheritance
 * and abstract - Extension of complex type - Reference to abstract type - nillable of string (district) and integer
 * (zip)
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.7 $
 */
public class ExtensionAction extends AbstractTestAction {

	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public ExtensionAction() {
		super(ExtensionPackage.eINSTANCE);
	}

	/** Creates simple types and tests against */
	@Override
	public void doAction(TestStore store) {
		// test a simple type
		final ExtensionFactory factory = ExtensionFactory.eINSTANCE;
		{
			store.beginTransaction();

			USAddress usaddress = factory.createUSAddress();
			usaddress.setName("Montgomery");
			usaddress.setCity("Montgomery");
			usaddress.setState(USState.AL_LITERAL);
			usaddress.setZip(new BigInteger("36101"));
			usaddress.setStreet("Montgomery street");
			store.store(usaddress);

			// test nullable fields
			USAddress emptyaddress = factory.createUSAddress();
			emptyaddress.setName("empty");
			emptyaddress.setCity("empty");
			emptyaddress.setStreet("empty");
			emptyaddress.setState(USState.AL_LITERAL);
			emptyaddress.setZip(new BigInteger("12313"));
			// if (emptyaddress.isSetState())
			// {
			// emptyaddress.unsetState();
			// }
			// if (emptyaddress.isSetZip())
			// {
			// emptyaddress.unsetZip();
			// }

			store.store(usaddress);
			store.store(emptyaddress);

			// create a uk address and a uk district address
			UKAddress ukaddress = factory.createUKAddress();
			ukaddress.setCity("London");
			ukaddress.setStreet("Downingstreet 10");
			ukaddress.setName("Primeminister");
			ukaddress.setPostcode("0000");
			store.store(ukaddress);

			DistrictUKAddress districtaddress = factory.createDistrictUKAddress();
			districtaddress.setCity("district");
			districtaddress.setDistrict("district1");
			districtaddress.setExportCode(new BigInteger("500"));
			districtaddress.setName("My districtaddress");
			districtaddress.setPostcode("postcode1");
			districtaddress.setStreet("street1");
			store.store(districtaddress);

			FirstAddressHolder holder = factory.createFirstAddressHolder();
			holder.getValue().add(usaddress);
			holder.getValue().add(emptyaddress);
			holder.getValue().add(ukaddress);
			holder.getValue().add(districtaddress);

			AddressList addresslist = factory.createAddressList();
			addresslist.setName("addressList");
			addresslist.setFirstAddress(holder);
			addresslist.getSecondAddress().add(usaddress);
			addresslist.getSecondAddress().add(emptyaddress);
			addresslist.getSecondAddress().add(ukaddress);
			addresslist.getSecondAddress().add(districtaddress);
			store.store(addresslist);

			InternationalPrice price = factory.createInternationalPrice();
			price.setCurrency("EUR");
			price.setValue(new BigDecimal("100.50"));
			store.store(price);

			store.commitTransaction();
		}

		{
			store.beginTransaction();
			AddressList addressList = store.getObject(AddressList.class);
			checkAddressList(addressList.getFirstAddress().getValue().iterator());
			checkAddressList(addressList.getSecondAddress().iterator());
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			InternationalPrice price = store.getObject(InternationalPrice.class);
			assertTrue(price.getValue() != null);
			assertTrue(price.getCurrency() != null);
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			List list = store.getObjects(Address.class);
			checkAddressList(list.iterator());

			if (!isEAVTest()) {
				// take one address and check its crossreferencers, there should be two
				final Object[] crs = store.getCrossReferencers((EObject) list.get(0), false);
				assertEquals(2, crs.length);
			}

			store.commitTransaction();
		}
	}

	/** Checks that the address types occur in the passed list */
	private void checkAddressList(Iterator it) {
		int cntus = 0;
		int cntuk = 0;
		int cntdistrict = 0;
		while (it.hasNext()) {
			Address address = (Address) it.next();
			if (address instanceof DistrictUKAddress) {
				cntdistrict++;
			} else if (address instanceof UKAddress) {
				cntuk++;
				if (address.getName().compareTo("Primeminister") == 0) {
					UKAddress ukaddress = (UKAddress) address;
					assertTrue(ukaddress.getExportCode().intValue() == 1);
					assertTrue(!ukaddress.isSetExportCode());
				}
			} else if (address instanceof USAddress) {
				cntus++;

				if (address.getName().compareTo("empty") == 0) {
					// assertFalse(((USAddress) address).isSetState());
					// assertFalse(((USAddress) address).isSetZip());
				} else {
					assertTrue(((USAddress) address).isSetState());
					assertTrue(((USAddress) address).isSetZip());
				}
			}
		}
		assertTrue(cntus == 2);
		assertTrue(cntuk == 1);
		assertTrue(cntdistrict == 1);
	}
}