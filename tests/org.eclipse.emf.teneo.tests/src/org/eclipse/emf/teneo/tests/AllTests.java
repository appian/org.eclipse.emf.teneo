/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: AllTests.java,v 1.6 2006/07/23 19:38:49 mtaal Exp $
 */

package org.eclipse.emf.teneo.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Runs all tests.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $
 */
public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("All tests for hibernate");
		suite.addTest(org.eclipse.emf.teneo.hibernate.test.emf.annotations.AllTests.suite());
		suite.addTest(org.eclipse.emf.teneo.hibernate.test.emf.detach.AllTests.suite());
		suite.addTest(org.eclipse.emf.teneo.hibernate.test.emf.elist.AllTests.suite());
		suite.addTest(org.eclipse.emf.teneo.hibernate.test.emf.relation.AllTests.suite());
		suite.addTest(org.eclipse.emf.teneo.hibernate.test.emf.sample.AllTests.suite());
		suite.addTest(org.eclipse.emf.teneo.hibernate.test.emf.schemaconstructs.AllTests.suite());
		suite.addTest(org.eclipse.emf.teneo.hibernate.test.issues.AllTests.suite());
		suite.addTest(org.eclipse.emf.teneo.hibernate.test.test.AllTests.suite());

//		suite.addTest(org.eclipse.emf.teneo.jpox.test.emf.annotations.AllGenerateTests.suite());
//		suite.addTest(org.eclipse.emf.teneo.jpox.test.emf.detach.AllGenerateTests.suite());
//		suite.addTest(org.eclipse.emf.teneo.jpox.test.emf.elist.AllGenerateTests.suite());
//		suite.addTest(org.eclipse.emf.teneo.jpox.test.emf.relation.AllGenerateTests.suite());
//		suite.addTest(org.eclipse.emf.teneo.jpox.test.emf.sample.AllGenerateTests.suite());
//		suite.addTest(org.eclipse.emf.teneo.jpox.test.emf.schemaconstructs.AllGenerateTests.suite());
//		suite.addTest(org.eclipse.emf.teneo.jpox.test.issues.AllGenerateTests.suite());
//
//		suite.addTest(org.eclipse.emf.teneo.jpox.test.emf.annotations.AllTests.suite());
//		suite.addTest(org.eclipse.emf.teneo.jpox.test.emf.detach.AllTests.suite());
//		suite.addTest(org.eclipse.emf.teneo.jpox.test.emf.elist.AllTests.suite());
//		suite.addTest(org.eclipse.emf.teneo.jpox.test.emf.relation.AllTests.suite());
//		suite.addTest(org.eclipse.emf.teneo.jpox.test.emf.sample.AllTests.suite());
//		suite.addTest(org.eclipse.emf.teneo.jpox.test.emf.schemaconstructs.AllTests.suite());
//		suite.addTest(org.eclipse.emf.teneo.jpox.test.issues.AllTests.suite());
		
		return suite;
	}

}
