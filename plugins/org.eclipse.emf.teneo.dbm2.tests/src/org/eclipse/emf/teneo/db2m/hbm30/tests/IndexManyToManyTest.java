/**
 * <copyright>
 * </copyright>
 *
 * $Id: IndexManyToManyTest.java,v 1.1 2010/08/18 09:37:15 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Factory;
import org.eclipse.emf.teneo.db2m.hbm30.IndexManyToMany;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Index Many To Many</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IndexManyToManyTest extends TestCase {

	/**
	 * The fixture for this Index Many To Many test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexManyToMany fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IndexManyToManyTest.class);
	}

	/**
	 * Constructs a new Index Many To Many test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexManyToManyTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Index Many To Many test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(IndexManyToMany fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Index Many To Many test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexManyToMany getFixture() {
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
		setFixture(Hbm30Factory.eINSTANCE.createIndexManyToMany());
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

} //IndexManyToManyTest
