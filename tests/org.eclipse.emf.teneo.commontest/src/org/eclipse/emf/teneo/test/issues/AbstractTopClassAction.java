/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * InheritanceAnnotationAction.java,v 1.6 2007/03/20 23:33:38 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.issues;

import java.math.BigInteger;
import java.util.Collections;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.teneo.samples.issues.abstractsuper.AbstractsuperFactory;
import org.eclipse.emf.teneo.samples.issues.abstractsuper.AbstractsuperPackage;
import org.eclipse.emf.teneo.samples.issues.abstractsuper.DistrictUKAddress;
import org.eclipse.emf.teneo.samples.issues.abstractsuper.UKAddress;
import org.eclipse.emf.teneo.samples.issues.abstractsuper.USAddress;
import org.eclipse.emf.teneo.samples.issues.abstractsuper.USState;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests https://bugs.eclipse.org/bugs/show_bug.cgi?id=220106
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class AbstractTopClassAction extends AbstractTestAction {

	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public AbstractTopClassAction() {
		super(AbstractsuperPackage.eINSTANCE);
	}

	/** Creates simple types and tests against */
	@Override
	public void doAction(TestStore store) {
		// test a simple type
		final AbstractsuperFactory factory = AbstractsuperFactory.eINSTANCE;
		{
			store.beginTransaction();

			final USAddress usaddress = factory.createUSAddress();
			usaddress.setName("Montgomery");
			usaddress.setCity("Montgomery");
			usaddress.setState(USState.AL);
			usaddress.setZip(new BigInteger("36101"));
			usaddress.setStreet("Montgomery street");
			store.store(usaddress);

			// test nullable fields
			final USAddress emptyaddress = factory.createUSAddress();
			emptyaddress.setName("empty");
			emptyaddress.setCity("empty");
			emptyaddress.setStreet("empty");
			emptyaddress.setState(USState.AL);
			emptyaddress.setZip(new BigInteger("1231"));

			store.store(usaddress);
			store.store(emptyaddress);

			// create a uk address and a uk district address
			final UKAddress ukaddress = factory.createUKAddress();
			ukaddress.setCity("London");
			ukaddress.setStreet("Downingstreet 10");
			ukaddress.setName("Primeminister");
			ukaddress.setPostcode("0000");
			store.store(ukaddress);

			final DistrictUKAddress districtaddress = factory.createDistrictUKAddress();
			districtaddress.setCity("district");
			districtaddress.setDistrict("district1");
			districtaddress.setName("My districtaddress");
			districtaddress.setPostcode("postcode1");
			districtaddress.setStreet("street1");
			store.store(districtaddress);
			store.commitTransaction();
		}

		try {
			final Resource res = store.getResource();
			res.load(Collections.EMPTY_MAP);
			int cntUsAddress = 0;
			for (Object o : res.getContents()) {
				if (o instanceof USAddress) {
					cntUsAddress++;
				} else {
					fail("Unexcepted class" + o.getClass().getName());
				}
			}
			assertEquals(2, cntUsAddress);
		} catch (Exception e) {
			throw new StoreTestException(e.getMessage(), e);
		}
	}
}