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
 * $Id: RentalResourceReferenceAction.java,v 1.2 2007/03/29 22:13:54 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Date;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.emf.teneo.rental.Manufacturer;
import org.eclipse.emf.teneo.rental.RentalBicycle;
import org.eclipse.emf.teneo.rental.RentalBicycleType;
import org.eclipse.emf.teneo.rental.RentalCar;
import org.eclipse.emf.teneo.rental.RentalCarSize;
import org.eclipse.emf.teneo.rental.RentalContract;
import org.eclipse.emf.teneo.rental.RentalFactory;
import org.eclipse.emf.teneo.rental.RentalPackage;
import org.eclipse.emf.teneo.resource.StoreResource;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests references from an xml to a db resource.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class RentalResourceReferenceAction extends AbstractTestAction {
	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public RentalResourceReferenceAction() {
		super(RentalPackage.eINSTANCE);
	}

	/** Test */
	public void doAction(TestStore store) {
		final RentalFactory rf = RentalFactory.eINSTANCE;
		byte[] bytes = null;
		
		try {
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
				rcontract.setEndDate(new Date());
				rcontract.setRentToBusinessPartner("business partner");
				
				// save the car and bicycle in a database resource
				Resource res = store.getResource();
				res.load(null);
				res.getContents().add(rcar);
				res.getContents().add(rb);
				res.save(Collections.EMPTY_MAP);
				
				// save the contract in an xml file
				final ByteArrayOutputStream bos = new ByteArrayOutputStream();
				final Resource resource = new XMLResourceImpl();
				resource.getContents().add(rcontract);
				resource.save(bos, Collections.EMPTY_MAP);
				
				// now also save to a file
//				final FileOutputStream fos = new FileOutputStream("/home/mtaal/mytmp/rental.xml");
//				resource.save(fos, Collections.EMPTY_MAP);
				bytes = bos.toByteArray();
		} catch (IOException e) {
			throw new StoreTestException("IOException during save", e);
		}
		
		try {
			final ResourceSet rs = new ResourceSetImpl();
			rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new XMLResourceFactoryImpl());
			final Resource new_resource = rs.createResource(URI.createFileURI("rental.xml"));
			new_resource.load(new ByteArrayInputStream(bytes), Collections.EMPTY_MAP);
			final RentalContract rc = (RentalContract)new_resource.getContents().get(0);
			assertEquals(2, rc.getRentalUnits().size());
			final RentalCar rcar = (RentalCar)rc.getRentalUnits().get(0);
			final RentalBicycle rb = (RentalBicycle)rc.getRentalUnits().get(1);
			assertEquals("car", rcar.getDescription());
			assertEquals(rb.eResource(), rcar.eResource());
			assertTrue(rb.eResource() instanceof StoreResource);
			assertEquals(RentalBicycleType.MOUNTAIN_BIKE, rb.getType());
			assertEquals("bicycle", rb.getDescription());
		} catch (IOException e) {
			throw new StoreTestException("IOException during save", e);
		}
	}
}