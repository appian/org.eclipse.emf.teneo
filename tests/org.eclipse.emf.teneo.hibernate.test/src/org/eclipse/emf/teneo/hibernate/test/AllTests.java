/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: AllTests.java,v 1.4 2007/02/01 12:36:24 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Runs all hibernate tests.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
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
		return suite;
	}
}
