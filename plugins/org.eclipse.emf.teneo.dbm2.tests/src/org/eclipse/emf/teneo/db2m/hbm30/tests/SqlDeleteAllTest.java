/**
 * <copyright>
 * </copyright>
 *
 * $Id: SqlDeleteAllTest.java,v 1.1 2010/08/18 09:37:15 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Factory;
import org.eclipse.emf.teneo.db2m.hbm30.SqlDeleteAll;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sql Delete All</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SqlDeleteAllTest extends TestCase {

	/**
	 * The fixture for this Sql Delete All test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqlDeleteAll fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SqlDeleteAllTest.class);
	}

	/**
	 * Constructs a new Sql Delete All test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlDeleteAllTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Sql Delete All test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SqlDeleteAll fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Sql Delete All test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqlDeleteAll getFixture() {
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
		setFixture(Hbm30Factory.eINSTANCE.createSqlDeleteAll());
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

} //SqlDeleteAllTest
