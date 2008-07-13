/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal</copyright>
 * $Id: OverrideSecondaryAction.java,v 1.1 2008/07/13 13:13:39 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.eclipse.emf.teneo.samples.emf.annotations.attroverridesecondarytable.Address;
import org.eclipse.emf.teneo.samples.emf.annotations.attroverridesecondarytable.AttroverridesecondarytableFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.attroverridesecondarytable.AttroverridesecondarytablePackage;
import org.eclipse.emf.teneo.samples.emf.annotations.attroverridesecondarytable.Country;
import org.eclipse.emf.teneo.samples.emf.annotations.attroverridesecondarytable.Employee;
import org.eclipse.emf.teneo.samples.emf.annotations.attroverridesecondarytable.NonEmployee;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * See bugzilla 239800
 * 
 * @author mtaal@elver.org
 */
public class OverrideSecondaryAction extends AbstractTestAction {

	private static final String VERIFICATION_QUERY1 = "select count(*) from secondary_table where emp_num is not null";
	private static final String VERIFICATION_QUERY2 =
			"select count(*) from secondary_table where other_name is not null";

	public OverrideSecondaryAction() {
		super(AttroverridesecondarytablePackage.eINSTANCE);
	}

	@Override
	public void doAction(TestStore store) {
		{
			store.beginTransaction();
			final AttroverridesecondarytableFactory factory = AttroverridesecondarytableFactory.eINSTANCE;
			final Employee e = factory.createEmployee();
			String prefix = "abc";
			e.setName(prefix + "_name");
			e.setAddress(createAddress(prefix));
			e.setEmployeeNumber(prefix);
			store.store(e);
			final NonEmployee ne = factory.createNonEmployee();
			prefix = "def";
			ne.setName(prefix + "_name");
			ne.setAddress(createAddress(prefix));
			store.store(ne);
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			final Employee e = store.getObject(Employee.class);
			assertTrue(e.getName().startsWith("abc"));
			assertTrue(e.getAddress().getCity().startsWith("abc"));
			final NonEmployee ne = store.getObject(NonEmployee.class);
			assertTrue(ne.getName().startsWith("def"));
			assertTrue(ne.getAddress().getStreet().startsWith("def"));
			store.commitTransaction();
		}

		testTable(store);
	}

	private Address createAddress(String prefix) {
		final AttroverridesecondarytableFactory factory = AttroverridesecondarytableFactory.eINSTANCE;
		final Address address = factory.createAddress();
		address.setName(prefix + "_name");
		address.setStreet(prefix + "_street");
		address.setCity(prefix + "_city");
		final Country c = factory.createCountry();
		c.setName(prefix);
		address.setCountry(c);
		return address;
	}

	private void testTable(TestStore store) {
		final Connection conn = store.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(VERIFICATION_QUERY1);
			rs.next();
			assertEquals(1, rs.getInt(1));
			rs.close();
			rs = stmt.executeQuery(VERIFICATION_QUERY2);
			rs.next();
			assertEquals(1, rs.getInt(1));
			rs.close();
		} catch (final SQLException e) {
			assertTrue(e.getMessage(), false);
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (final SQLException e) {
			}
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (final SQLException e) {
			}
		}
	}
}
