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
package org.eclipse.emf.extras.elistfactory.tests;

import junit.framework.Test;
import junit.framework.TestSuite;


public class AllTests {

  public static Test suite() {

    TestSuite suite = new TestSuite("Tests for org.eclipse.emf.extras.elistfactory");
    //$JUnit-BEGIN$
    suite.addTestSuite(EListFactoryUsageTest.class);
    suite.addTestSuite(EListFactoryTest.class);
    //$JUnit-END$
    return suite;
  }

}
