/**
 * <copyright>
 * </copyright>
 *
 * $Id: SqlDeleteTest.java,v 1.1 2010/08/18 09:37:15 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Factory;
import org.eclipse.emf.teneo.db2m.hbm30.SqlDelete;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sql Delete</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SqlDeleteTest extends TestCase {

	/**
	 * The fixture for this Sql Delete test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqlDelete fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SqlDeleteTest.class);
	}

	/**
	 * Constructs a new Sql Delete test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlDeleteTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Sql Delete test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SqlDelete fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Sql Delete test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqlDelete getFixture() {
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
		setFixture(Hbm30Factory.eINSTANCE.createSqlDelete());
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

} //SqlDeleteTest
