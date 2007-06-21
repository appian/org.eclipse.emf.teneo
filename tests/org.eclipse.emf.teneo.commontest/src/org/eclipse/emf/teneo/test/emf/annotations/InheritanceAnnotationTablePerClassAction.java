/**
 * <copyright> Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * InheritanceAnnotationTablePerClassAction.java,v 1.3 2007/03/20 23:33:38 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.teneo.annotations.pannotation.InheritanceType;
import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.Address;
import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.ContentList;
import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.DistrictUKAddress;
import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.InheritancemappingFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.InheritancemappingPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.InternationalPrice;
import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.Price;
import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.UKAddress;
import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.USAddress;
import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.USState;
import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.DistrictUKAddressImpl;
import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.InternationalPriceImpl;
import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.UKAddressImpl;
import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.USAddressImpl;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests annotations to direct the inheritance mapping.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
public class InheritanceAnnotationTablePerClassAction extends AbstractTestAction {

	/** UGLY, at least ensure that at least one of the three tests is run */
	private static int ignored_tests = 0;

	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public InheritanceAnnotationTablePerClassAction() {
		super(InheritancemappingPackage.eINSTANCE);
	}

	/** Creates simple types and tests against */
	@Override
	public void doAction(TestStore store) {
		if (store.isInheritanceStrategy(InternationalPriceImpl.class, InheritanceType.SINGLE_TABLE_LITERAL)) {
			ignored_tests++;
			assertTrue(ignored_tests < 4);
			return; // not the correct test, should only run xml tests, need to change the whole
			// test framework to do this
		}

		// test a simple type
		final InheritancemappingFactory factory = InheritancemappingFactory.eINSTANCE;
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
			if (emptyaddress.isSetState()) {
				emptyaddress.unsetState();
			}
			if (emptyaddress.isSetZip()) {
				emptyaddress.unsetZip();
			}

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
			districtaddress.setName("My districtaddress");
			districtaddress.setPostcode("postcode1");
			districtaddress.setStreet("street1");
			store.store(districtaddress);
			ContentList contentlist = factory.createContentList();
			contentlist.setName("testme");
			contentlist.getAddress().add(usaddress);
			contentlist.getAddress().add(emptyaddress);
			contentlist.getAddress().add(ukaddress);
			contentlist.getAddress().add(districtaddress);
			store.store(contentlist);

			InternationalPrice intprice = factory.createInternationalPrice();
			intprice.setName("euro");
			intprice.setCurrency("EUR");
			intprice.setValue(new BigDecimal("100.50"));

			Price price = factory.createPrice();
			price.setName("mycurrency");
			price.setValue(new BigDecimal("99.30"));
			store.store(price);
			store.store(intprice);

			store.store(contentlist);
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			ContentList contentList = (ContentList) store.getObject(ContentList.class);
			checkAddressList(contentList.getAddress().iterator());

			List<?> prices = store.getObjects(Price.class);
			assertEquals(2, prices.size());
			InternationalPrice ip;
			Price p;
			if (prices.get(0) instanceof InternationalPrice) {
				ip = (InternationalPrice) prices.get(0);
				p = (Price) prices.get(1);
			} else {
				ip = (InternationalPrice) prices.get(1);
				p = (Price) prices.get(0);
			}
			assertTrue(ip.getName().compareTo("euro") == 0);
			assertTrue(p.getName().compareTo("mycurrency") == 0);

			store.commitTransaction();
		}

		// eventhough at global level one inheritance strategy is used this should differ for
		// individual
		// class hierarchies as enforced by the annotations
		assertTrue(store.isInheritanceStrategy(InternationalPriceImpl.class, InheritanceType.TABLE_PER_CLASS_LITERAL));
		assertTrue(store.isInheritanceStrategy(UKAddressImpl.class, InheritanceType.JOINED_LITERAL));
		assertTrue(store.isInheritanceStrategy(USAddressImpl.class, InheritanceType.JOINED_LITERAL));
		assertTrue(store.isInheritanceStrategy(DistrictUKAddressImpl.class, InheritanceType.JOINED_LITERAL));

		// do some sql queries to check if the name column is present in the subclass
		Connection conn = null;
		Statement stmt = null;
		try {
			try {
				conn = store.getConnection();
				stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("select * from internationalprice where name='euro'");
				int cnt = 0;
				while (rs.next()) {
					cnt++;
				}
				rs.close();

				assertEquals(1, cnt);
				rs = stmt.executeQuery("select * from myprice where name='mycurrency'");
				cnt = 0;
				while (rs.next()) {
					cnt++;
				}
				rs.close();
				assertEquals(1, cnt);
			} finally {
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			}
		} catch (SQLException e) {
			throw new StoreTestException("Sql exception when retrieving objects based on discriminator values", e);
		}
	}

	/** Checks that the address types occur in the passed list */
	private void checkAddressList(Iterator<?> it) {
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
					assertTrue(address instanceof UKAddress);
				}
			} else if (address instanceof USAddress) {
				cntus++;

				if (address.getName().compareTo("empty") == 0) {
					assertFalse(((USAddress) address).isSetState());
					assertFalse(((USAddress) address).isSetZip());
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