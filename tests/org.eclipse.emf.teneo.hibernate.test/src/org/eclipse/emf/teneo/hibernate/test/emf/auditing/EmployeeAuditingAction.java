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
 * $Id: EmployeeAction.java,v 1.1 2008/04/23 15:45:19 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.auditing;

import java.util.Date;
import java.util.List;

import org.eclipse.emf.teneo.hibernate.test.stores.HibernateTestStore;
import org.eclipse.emf.teneo.samples.emf.sample.employee.Department;
import org.eclipse.emf.teneo.samples.emf.sample.employee.Employee;
import org.eclipse.emf.teneo.samples.emf.sample.employee.EmployeeFactory;
import org.eclipse.emf.teneo.samples.emf.sample.employee.EmployeePackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;
import org.hibernate.Session;

/**
 * Tests filteres
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class EmployeeAuditingAction extends AbstractTestAction {
	public EmployeeAuditingAction() {
		super(EmployeePackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		final EmployeeFactory f = EmployeeFactory.eINSTANCE;

		{
			final Employee e1 = f.createEmployee();
			e1.setName("e1");
			e1.setAge(29);
			e1.setSalary(100);
			e1.setHireDate(new Date(System.currentTimeMillis() + 100000));

			final Employee e2 = f.createEmployee();
			e2.setName("e2");
			e2.setAge(39);
			e2.setSalary(1000);
			final long ONE_DAY = 3600 * 1000 * 24;
			e2.setHireDate(new Date(System.currentTimeMillis() - ONE_DAY - ONE_DAY));

			final Employee e3 = f.createEmployee();
			e3.setName("e3");
			e3.setAge(49);
			e3.setSalary(10000);
			e3.setHireDate(new Date(System.currentTimeMillis() + 100000));

			final Employee e4 = f.createEmployee();
			e4.setName("e4");
			e4.setAge(59);
			e4.setSalary(100000);
			e4.setHireDate(new Date(System.currentTimeMillis() + 100000));

			final Department d = f.createDepartment();
			d.setName("d1");
			d.getEmployees().add(e1);
			d.getEmployees().add(e2);
			d.getEmployees().add(e3);
			d.getEmployees().add(e4);

			store.beginTransaction();
			store.store(d);
			store.commitTransaction();
		}

		{
			final Session s = ((HibernateTestStore) store).getSession();
			store.beginTransaction();
			List<?> es = store.getObjects(Employee.class);
			checkList(es, new String[] { "e1", "e2", "e3", "e4" });

			s.enableFilter("ageRange").setParameter("fromAge", 35).setParameter("toAge", 55);
			es = store.getObjects(Employee.class);
			checkList(es, new String[] { "e2", "e3" });

			s.enableFilter("salaryHigherThan").setParameter("salary", 5000);
			es = store.getObjects(Employee.class);
			checkList(es, new String[] { "e3" });

			s.disableFilter("salaryHigherThan");
			s.enableFilter("ageRange").setParameter("fromAge", 25).setParameter("toAge", 55);
			es = store.getObjects(Employee.class);
			checkList(es, new String[] { "e1", "e2", "e3" });

			s.enableFilter("salaryHigherThan").setParameter("salary", 500);
			es = store.getObjects(Employee.class);
			checkList(es, new String[] { "e2", "e3" });

			final Date dt = new Date();
			s.enableFilter("hireDate").setParameter("date", dt);
			es = store.getObjects(Employee.class);
			checkList(es, new String[] { "e3" });

			s.disableFilter("salaryHigherThan");
			s.disableFilter("ageRange");
			s.disableFilter("hireDate");

			store.commitTransaction();
		}
		{
			Session s = ((HibernateTestStore) store).getSession();
			store.beginTransaction();
			Department d = store.getObject(Department.class);
			List<?> es = d.getEmployees();
			checkList(es, new String[] { "e1", "e2", "e3", "e4" });
			store.commitTransaction();

			store.beginTransaction();
			s = ((HibernateTestStore) store).getSession();
			s.enableFilter("ageRange").setParameter("fromAge", 35).setParameter("toAge", 55);
			d = store.getObject(Department.class);
			es = d.getEmployees();
			checkList(es, new String[] { "e2", "e3" });
			store.commitTransaction();

			store.beginTransaction();
			s = ((HibernateTestStore) store).getSession();
			s.enableFilter("ageRange").setParameter("fromAge", 35).setParameter("toAge", 55);
			s.enableFilter("salaryHigherThan").setParameter("salary", 5000);
			d = store.getObject(Department.class);
			es = d.getEmployees();
			checkList(es, new String[] { "e3" });
			store.commitTransaction();

			store.beginTransaction();
			s = ((HibernateTestStore) store).getSession();
			s.enableFilter("ageRange").setParameter("fromAge", 25).setParameter("toAge", 55);
			d = store.getObject(Department.class);
			es = d.getEmployees();
			checkList(es, new String[] { "e1", "e2", "e3" });
			store.commitTransaction();

			store.beginTransaction();
			s = ((HibernateTestStore) store).getSession();
			s.enableFilter("ageRange").setParameter("fromAge", 25).setParameter("toAge", 55);
			s.enableFilter("salaryHigherThan").setParameter("salary", 500);
			d = store.getObject(Department.class);
			es = d.getEmployees();
			checkList(es, new String[] { "e2", "e3" });
			store.commitTransaction();
		}
	}

	private void checkList(List<?> es, String[] expected) {
		assertEquals(expected.length, es.size());
		for (Object o : es) {
			final Employee e = (Employee) o;
			for (int i = 0; i < expected.length; i++) {
				if (expected[i].compareTo(e.getName()) == 0) {
					expected[i] = "";
					break;
				}
			}
		}
		for (String str : expected) {
			assertEquals("", str);
		}
	}
}
