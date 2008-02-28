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
 * $Id: CarAction.java,v 1.2 2008/02/28 07:08:14 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.util.Collections;
import java.util.Properties;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

import com.example.car.CarFactory;
import com.example.car.CarPackage;
import com.example.car.CarsList;

/**
 * Test bugzilla 199373
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class CarAction extends AbstractTestAction {

	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public CarAction() {
		super(CarPackage.eINSTANCE);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.test.AbstractTestAction#getExtraConfigurationProperties()
	 */
	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.DISABLE_ECONTAINER_MAPPING, "true");
		return props;
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	@SuppressWarnings("unchecked")
	public void doAction(TestStore store) {
		{
			final CarsList carsList = CarFactory.eINSTANCE.createCarsList();
			store.beginTransaction();
			store.store(carsList);
			store.commitTransaction();
		}

		try {
			final Resource dbResource = store.getResource();
			final CarsList carsList = (CarsList) dbResource.getContents().get(0);
			final EList eListDatabaseCarType = carsList.getCarType();
			final EList eListDatabaseCarLink = carsList.getCarLink();

			final Resource fileRes = new XMLResourceImpl();
			fileRes.load(CarFactory.class.getResourceAsStream("model/cars.xml"), Collections.EMPTY_MAP);

			final CarsList rootElementFile = (CarsList) fileRes.getContents().get(0);
			EList eListFileCarType = rootElementFile.getCarType();
			EList eListFileCarLink = rootElementFile.getCarLink();

			eListDatabaseCarType.addAll(eListFileCarType);
			eListDatabaseCarLink.addAll(eListFileCarLink);
			dbResource.save(Collections.EMPTY_MAP);
		} catch (Exception e) {
			throw new StoreTestException(e.getMessage(), e);
		}
	}
}
