/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReturnColumnTest.java,v 1.1 2010/08/18 09:37:15 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Factory;
import org.eclipse.emf.teneo.db2m.hbm30.ReturnColumn;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Return Column</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReturnColumnTest extends TestCase {

	/**
	 * The fixture for this Return Column test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnColumn fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReturnColumnTest.class);
	}

	/**
	 * Constructs a new Return Column test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnColumnTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Return Column test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ReturnColumn fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Return Column test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnColumn getFixture() {
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
		setFixture(Hbm30Factory.eINSTANCE.createReturnColumn());
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

} //ReturnColumnTest
