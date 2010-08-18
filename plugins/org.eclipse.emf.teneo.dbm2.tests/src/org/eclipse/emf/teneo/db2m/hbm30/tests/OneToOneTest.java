/**
 * <copyright>
 * </copyright>
 *
 * $Id: OneToOneTest.java,v 1.1 2010/08/18 09:37:15 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Factory;
import org.eclipse.emf.teneo.db2m.hbm30.OneToOne;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>One To One</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OneToOneTest extends TestCase {

	/**
	 * The fixture for this One To One test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OneToOne fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OneToOneTest.class);
	}

	/**
	 * Constructs a new One To One test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneToOneTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this One To One test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(OneToOne fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this One To One test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OneToOne getFixture() {
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
		setFixture(Hbm30Factory.eINSTANCE.createOneToOne());
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

} //OneToOneTest
