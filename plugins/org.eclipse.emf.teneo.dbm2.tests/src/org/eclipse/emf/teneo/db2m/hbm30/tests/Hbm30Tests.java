/**
 * <copyright>
 * </copyright>
 *
 * $Id: Hbm30Tests.java,v 1.1 2010/08/18 09:37:14 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>hbm30</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class Hbm30Tests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new Hbm30Tests("hbm30 Tests");
		suite.addTestSuite(ClassTest.class);
		suite.addTestSuite(ComponentTest.class);
		suite.addTestSuite(CompositeElementTest.class);
		suite.addTestSuite(CompositeIdTest.class);
		suite.addTestSuite(CompositeIndexTest.class);
		suite.addTestSuite(CompositeMapKeyTest.class);
		suite.addTestSuite(DynamicComponentTest.class);
		suite.addTestSuite(ElementTest.class);
		suite.addTestSuite(FilterDefTest.class);
		suite.addTestSuite(HibernateMappingTest.class);
		suite.addTestSuite(JoinTest.class);
		suite.addTestSuite(JoinedSubclassTest.class);
		suite.addTestSuite(LoadCollectionTest.class);
		suite.addTestSuite(ManyToManyTest.class);
		suite.addTestSuite(ManyToOneTest.class);
		suite.addTestSuite(MapKeyTest.class);
		suite.addTestSuite(MapKeyManyToManyTest.class);
		suite.addTestSuite(NaturalIdTest.class);
		suite.addTestSuite(NestedCompositeElementTest.class);
		suite.addTestSuite(PropertiesTest.class);
		suite.addTestSuite(PropertyTest.class);
		suite.addTestSuite(QueryTest.class);
		suite.addTestSuite(ResultsetTest.class);
		suite.addTestSuite(ReturnTest.class);
		suite.addTestSuite(ReturnJoinTest.class);
		suite.addTestSuite(SqlQueryTest.class);
		suite.addTestSuite(SubclassTest.class);
		suite.addTestSuite(UnionSubclassTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hbm30Tests(String name) {
		super(name);
	}

} //Hbm30Tests
