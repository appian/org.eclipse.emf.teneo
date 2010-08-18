/**
 * <copyright>
 * </copyright>
 *
 * $Id: IndexManyToAnyTest.java,v 1.1 2010/08/18 09:37:15 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Factory;
import org.eclipse.emf.teneo.db2m.hbm30.IndexManyToAny;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Index Many To Any</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IndexManyToAnyTest extends TestCase {

	/**
	 * The fixture for this Index Many To Any test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexManyToAny fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IndexManyToAnyTest.class);
	}

	/**
	 * Constructs a new Index Many To Any test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexManyToAnyTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Index Many To Any test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(IndexManyToAny fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Index Many To Any test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexManyToAny getFixture() {
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
		setFixture(Hbm30Factory.eINSTANCE.createIndexManyToAny());
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

} //IndexManyToAnyTest
