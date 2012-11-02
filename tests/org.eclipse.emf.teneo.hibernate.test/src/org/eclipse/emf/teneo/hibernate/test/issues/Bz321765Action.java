/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * EmbeddedIdAction.java,v 1.3 2007/03/20 23:33:38 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.issues;

import java.math.BigInteger;
import java.util.List;

import org.eclipse.emf.teneo.samples.issues.bz321765.Bz321765Factory;
import org.eclipse.emf.teneo.samples.issues.bz321765.Bz321765Package;
import org.eclipse.emf.teneo.samples.issues.bz321765.Employee;
import org.eclipse.emf.teneo.samples.issues.bz321765.EmployeePK;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

public class Bz321765Action extends AbstractTestAction {

	private static final String FIRST_NAME = "Jan";
	private static final String LAST_NAME = "Janssen";
	private static final BigInteger ID = new BigInteger("1");

	public Bz321765Action() {
		super(Bz321765Package.eINSTANCE);
	}

	@Override
	public void doAction(TestStore store) {
		storeEmployee(store);
		testEmployee(store);
	}

	private void storeEmployee(TestStore store) {
		final Employee employee = Bz321765Factory.eINSTANCE.createEmployee();
		employee.setEmployeePK(getPK());
		employee.setSalary(new BigInteger("100"));
		employee.setTitle("Developer");
		store.beginTransaction();
		store.store(employee);
		store.commitTransaction();
	}

	private EmployeePK getPK() {
		final EmployeePK pk = Bz321765Factory.eINSTANCE.createEmployeePK();
		pk.setId(ID);
		pk.setFirstName(FIRST_NAME);
		pk.setLastName(LAST_NAME);
		return pk;
	}

	private void testEmployee(TestStore store) {
		{
			store.beginTransaction();
			final List<?> employees = store.query("select p from Employee p");
			assertEquals(1, employees.size());
			final Employee employee = (Employee) employees.get(0);
			assertEquals(FIRST_NAME, employee.getEmployeePK().getFirstName());
			assertEquals(LAST_NAME, employee.getEmployeePK().getLastName());
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			final Employee employee = (Employee) store.getObject("Employee", getPK());
			assertEquals(new BigInteger("100"), employee.getSalary());
			store.commitTransaction();
		}
	}

	@Override
	public boolean supportAuditing() {
		// has embedded id, not supported by auditing
		return false;
	}
}
