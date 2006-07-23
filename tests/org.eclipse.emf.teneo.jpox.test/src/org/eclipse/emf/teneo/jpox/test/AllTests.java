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
 * $Id: AllTests.java,v 1.2 2006/07/23 19:28:58 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.test;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Runs all hibernate tests.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("All tests for jpox");
		suite.addTest(org.eclipse.emf.teneo.jpox.test.emf.annotations.AllTests.suite());
		suite.addTest(org.eclipse.emf.teneo.jpox.test.emf.detach.AllTests.suite());
		suite.addTest(org.eclipse.emf.teneo.jpox.test.emf.elist.AllTests.suite());
		suite.addTest(org.eclipse.emf.teneo.jpox.test.emf.relation.AllTests.suite());
		suite.addTest(org.eclipse.emf.teneo.jpox.test.emf.sample.AllTests.suite());
		suite.addTest(org.eclipse.emf.teneo.jpox.test.emf.schemaconstructs.AllTests.suite());
		suite.addTest(org.eclipse.emf.teneo.jpox.test.issues.AllTests.suite());

		return suite;
	}

}
