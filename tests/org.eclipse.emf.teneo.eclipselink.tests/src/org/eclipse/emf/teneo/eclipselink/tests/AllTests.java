/*******************************************************************************
 * Copyright (c) 2008 Oracle and Geensys.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oracle and Geensys - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.teneo.eclipselink.tests;

import junit.framework.Test;
import junit.framework.TestSuite;


public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("org.eclipse.emf.teneo.eclipselink.tests");
		// TODO: enable EMap support
		//suite.addTest(org.eclipse.emf.teneo.eclipselink.emap.tests.AllTests.suite());
		//$JUnit-BEGIN$
		suite.addTest(org.eclipse.emf.teneo.eclipselink.elist.tests.AllTests.suite());
		//$JUnit-END$
		return suite;
	}

}
