/**
 * <copyright>
 * </copyright>
 *
 * $Id: WriterTest.java,v 1.1 2008/04/01 07:32:44 mtaal Exp $
 */
package org.eclipse.example.library.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.example.library.LibraryFactory;
import org.eclipse.example.library.Writer;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Writer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WriterTest extends TestCase {

	/**
	 * The fixture for this Writer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Writer fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WriterTest.class);
	}

	/**
	 * Constructs a new Writer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriterTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Writer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Writer fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Writer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Writer getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(LibraryFactory.eINSTANCE.createWriter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //WriterTest
