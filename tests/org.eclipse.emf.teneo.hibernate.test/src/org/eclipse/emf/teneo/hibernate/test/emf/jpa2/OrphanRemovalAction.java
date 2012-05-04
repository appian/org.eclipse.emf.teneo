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
 * $Id: AnyAction.java,v 1.2 2009/06/30 05:30:52 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.jpa2;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.teneo.samples.emf.annotations.any.AnyFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.any.AnyObject;
import org.eclipse.emf.teneo.samples.emf.annotations.any.AnyPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.any.GlobalObjectType;
import org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.Address;
import org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.Employee;
import org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.EmployeeInfo;
import org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.OrphanremovalFactory;
import org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.OrphanremovalPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests new orhanremoval annotation for jpa2.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class OrphanRemovalAction extends AbstractTestAction {
	private final OrphanremovalFactory factory = OrphanremovalFactory.eINSTANCE;

	public OrphanRemovalAction() {
		super(OrphanremovalPackage.eINSTANCE);
	}

	@Override
	public void doAction(TestStore store) {
		final String name1 = "name1";
		final String name2 = "name2";
		store.beginTransaction();
		{
			final Employee employee = factory.createEmployee();
			final EmployeeInfo info = factory.createEmployeeInfo();
			employee.setEmployeeInfo(info);
			info.setName(name1);
			for (int i = 0; i < 4; i++) {
				final Address address = factory.createAddress();
				address.setName(i + "");
				employee.getAddresses().add(address);
			}
			store.store(employee);
		}
		store.commitTransaction();
		
		store.checkNumber(Employee.class, 1);
		store.checkNumber(EmployeeInfo.class, 1);
		store.checkNumber(Address.class, 4);
		
		store.beginTransaction();
		{
			final Employee employee = store.getObject(Employee.class);
			
			final EmployeeInfo info = factory.createEmployeeInfo();
			info.setName(name2);

			// https://hibernate.onjira.com/browse/HHH-5559
			// https://hibernate.onjira.com/browse/HHH-6484
			// first do this:
			employee.setEmployeeInfo(null);
			store.flush();
			// before doing this:
			employee.setEmployeeInfo(info);

			employee.getAddresses().remove(1);
			
			store.flush();
		}
		store.commitTransaction();

		// only 3 remaining
		store.checkNumber(Address.class, 3);

		// still one
		store.checkNumber(EmployeeInfo.class, 1);
		
		store.beginTransaction();
		{
			final EmployeeInfo info = store.getObject(EmployeeInfo.class);
			assertEquals(name2, info.getName());
		}
		store.commitTransaction();
		
		// delete the parent, everything should be gone now...
		store.beginTransaction();
		{
			final Employee employee = store.getObject(Employee.class);
			store.deleteObject(employee);
		}
		store.commitTransaction();
		
		store.checkNumber(Employee.class, 0);
		store.checkNumber(Address.class, 0);
		store.checkNumber(EmployeeInfo.class, 0);
		
	}
}