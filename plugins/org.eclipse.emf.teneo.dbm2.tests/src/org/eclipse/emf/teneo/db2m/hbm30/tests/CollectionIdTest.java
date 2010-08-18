/**
 * <copyright>
 * </copyright>
 *
 * $Id: CollectionIdTest.java,v 1.1 2010/08/18 09:37:15 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.emf.teneo.db2m.hbm30.CollectionId;
import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Collection Id</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CollectionIdTest extends TestCase {

	/**
	 * The fixture for this Collection Id test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionId fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CollectionIdTest.class);
	}

	/**
	 * Constructs a new Collection Id test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionIdTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Collection Id test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CollectionId fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Collection Id test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionId getFixture() {
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
		setFixture(Hbm30Factory.eINSTANCE.createCollectionId());
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

} //CollectionIdTest
