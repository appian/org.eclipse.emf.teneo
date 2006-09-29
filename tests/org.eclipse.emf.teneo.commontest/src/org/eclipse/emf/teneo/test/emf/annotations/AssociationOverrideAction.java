/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 *   Laurens Fridael
 * </copyright>
 *
 * $Id: AssociationOverrideAction.java,v 1.3 2006/09/29 12:30:28 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.samples.emf.annotations.associationoverride.Address;
import org.eclipse.emf.teneo.samples.emf.annotations.associationoverride.AssociationoverrideFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.associationoverride.AssociationoverridePackage;
import org.eclipse.emf.teneo.samples.emf.annotations.associationoverride.Employee;
import org.eclipse.emf.teneo.samples.emf.annotations.associationoverride.Student;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Simple test for AssociationOverride.
 * 
 * @author <a href="mailto:lmfridael@elver.org">Laurens Fridael</a>
 * 
 */
public class AssociationOverrideAction extends AbstractTestAction {
	private static final AssociationoverrideFactory FACTORY = AssociationoverrideFactory.eINSTANCE;

	private static final String STUDENT_NAME = "Jan Janssen";

	private static final String STUDENT_FACULTY = "Biology";

	private static final String EMPLOYEE_NAME = "Piet Pietersen";

	private static final String EMPLOYEE_DEPARTMENT = "R&D";

	private static final Address DEFAULT_ADDRESS = FACTORY.createAddress();	
	static {
		DEFAULT_ADDRESS.setStreet("Amsterdamseweg 123");
		DEFAULT_ADDRESS.setPostalCode("1234 AZ");
	}

	private static final String STUDENT_VERIFICATION_QUERY = 
		"SELECT COUNT(*) FROM STUDENT A INNER JOIN ADDRESS B ON A.ADDRESS_ADDRESS_ID = B.MYID".toLowerCase();

	private static final String EMPLOYEE_VERIFICATION_QUERY = 
		"SELECT COUNT(*) FROM EMPLOYEE A INNER JOIN ADDRESS B ON A.EMPLOYEE_ADDRESS_ID = B.MYID".toLowerCase();

	public AssociationOverrideAction() {
		super(AssociationoverridePackage.eINSTANCE);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.teneo.test.AbstractTestAction#getExtraConfigurationProperties()
	 */
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.put(PersistenceOptions.ID_COLUMN_NAME, "myid");
		return props;
	}

	public void doAction(TestStore store) {
		storeStudent(store);
		storeEmployee(store);
		testStudent(store);
		testEmployee(store);
		testTables(store);
	}

	private void storeStudent(TestStore store) {
		store.beginTransaction();
		final Student student = FACTORY.createStudent();
		student.setName(STUDENT_NAME);
		student.setAddress(getAddress());
		student.setFaculty(STUDENT_FACULTY);
		store.store(student);
		store.commitTransaction();
	}

	private void storeEmployee(TestStore store) {
		store.beginTransaction();
		final Employee employee = FACTORY.createEmployee();
		employee.setName(EMPLOYEE_NAME);
		employee.setDepartment(EMPLOYEE_DEPARTMENT);
		employee.setAddress(getAddress());
		store.store(employee);
		store.commitTransaction();
	}

	private void testStudent(TestStore store) {
		store.beginTransaction();
		List results = store.query("FROM Student");
		assertEquals(1, results.size());
		Student student = (Student) results.get(0);
		assertEquals(STUDENT_NAME, student.getName());
		assertEquals(STUDENT_FACULTY, student.getFaculty());
		testAddress(student.getAddress());
		store.commitTransaction();
	}

	private void testEmployee(TestStore store) {
		store.beginTransaction();
		List results = store.query("FROM Employee");
		assertEquals(1, results.size());
		Employee employee = (Employee) results.get(0);
		assertEquals(EMPLOYEE_NAME, employee.getName());
		assertEquals(EMPLOYEE_DEPARTMENT, employee.getDepartment());
		testAddress(employee.getAddress());
		store.commitTransaction();
	}

	private void testAddress(Address address) {
		assertEquals(DEFAULT_ADDRESS.getStreet(), address.getStreet());
		assertEquals(DEFAULT_ADDRESS.getPostalCode(), address.getPostalCode());
	}

	private Address getAddress() {
		final Address address = FACTORY.createAddress();
		address.setStreet(DEFAULT_ADDRESS.getStreet());
		address.setPostalCode(DEFAULT_ADDRESS.getPostalCode());
		return address;
	}
	
	private void testTables(TestStore store) {
		final Connection conn = store.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(STUDENT_VERIFICATION_QUERY);
			rs.next();
			assertEquals(1, rs.getInt(1));
			rs.close();
			rs = stmt.executeQuery(EMPLOYEE_VERIFICATION_QUERY);
			rs.next();
			assertEquals(1, rs.getInt(1));
		} catch (SQLException e) {
			assertTrue(e.getMessage(), false);
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
			}
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
			}
		}
	}
}
