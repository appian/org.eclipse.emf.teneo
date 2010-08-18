/**
 * <copyright>
 * </copyright>
 *
 * $Id: DatabaseObjectTest.java,v 1.1 2010/08/18 09:37:14 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.emf.teneo.db2m.hbm30.DatabaseObject;
import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Database Object</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatabaseObjectTest extends TestCase {

	/**
	 * The fixture for this Database Object test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseObject fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DatabaseObjectTest.class);
	}

	/**
	 * Constructs a new Database Object test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseObjectTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Database Object test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DatabaseObject fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Database Object test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseObject getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Hbm30Factory.eINSTANCE.createDatabaseObject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //DatabaseObjectTest
