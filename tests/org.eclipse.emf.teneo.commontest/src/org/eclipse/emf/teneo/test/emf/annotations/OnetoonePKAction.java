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
 * $Id: OnetoonePKAction.java,v 1.1 2008/06/29 20:08:59 mtaal Exp $
 */
package org.eclipse.emf.teneo.test.emf.annotations;

import org.eclipse.emf.teneo.samples.emf.annotations.otopk.Employee;
import org.eclipse.emf.teneo.samples.emf.annotations.otopk.EmployeeInfo;
import org.eclipse.emf.teneo.samples.emf.annotations.otopk.OtopkFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.otopk.OtopkPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Testcase for a one-to-one with a pk
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class OnetoonePKAction extends AbstractTestAction {
	public OnetoonePKAction() {
		super(OtopkPackage.eINSTANCE);
	}

	@Override
	public void doAction(TestStore store) {
		final OtopkFactory factory = OtopkFactory.eINSTANCE;
		{
			store.beginTransaction();
			final EmployeeInfo ei = factory.createEmployeeInfo();
			final Employee e = factory.createEmployee();
			e.setEmployeeInfo(ei);
			store.store(ei);
			store.store(e);
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			final EmployeeInfo ei = factory.createEmployeeInfo();
			final Employee e = factory.createEmployee();
			e.setEmployeeInfo(ei);
			store.store(ei);
			store.store(e);
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			for (Object o : store.getObjects(Employee.class)) {
				final Employee e = (Employee) o;
				assertEquals(e.getId(), e.getEmployeeInfo().getId());
			}
			store.commitTransaction();
		}
	}
}