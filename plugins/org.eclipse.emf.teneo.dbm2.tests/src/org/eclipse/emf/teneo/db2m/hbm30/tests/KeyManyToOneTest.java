/**
 * <copyright>
 * </copyright>
 *
 * $Id: KeyManyToOneTest.java,v 1.1 2010/08/18 09:37:14 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Factory;
import org.eclipse.emf.teneo.db2m.hbm30.KeyManyToOne;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Key Many To One</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class KeyManyToOneTest extends TestCase {

	/**
	 * The fixture for this Key Many To One test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyManyToOne fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(KeyManyToOneTest.class);
	}

	/**
	 * Constructs a new Key Many To One test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyManyToOneTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Key Many To One test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(KeyManyToOne fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Key Many To One test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyManyToOne getFixture() {
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
		setFixture(Hbm30Factory.eINSTANCE.createKeyManyToOne());
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

} //KeyManyToOneTest
