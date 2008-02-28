/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: AllTests.java,v 1.13 2008/02/28 07:07:57 mtaal Exp $
 */

package org.eclipse.emf.teneo.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Runs all tests.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.13 $
 */
public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Hibernate Test");
		suite.addTest(org.eclipse.emf.teneo.hibernate.test.AllTests.suite());
		return suite;
	}

}
