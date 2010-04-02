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
 * $Id: AllTests.java,v 1.7 2010/04/02 15:25:13 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.elist;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.teneo.hibernate.test.HibernateTestbed;
import org.eclipse.emf.teneo.test.conf.MultiCfgTestSuite;
import org.eclipse.emf.teneo.test.emf.elist.FeatureMapAction;

/**
 * All tests
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.7 $
 */
public class AllTests {

	public static Test suite() {
		TestSuite suite = new MultiCfgTestSuite("Test for org.eclipse.emf.teneo.hibernate.test.emf.elist",
				HibernateTestbed.instance().getConfigurations());
		suite.addTestSuite(FeatureMapEAVAction.class);
		suite.addTestSuite(FeatureMapComponentAction.class);
		suite.addTestSuite(FeatureMapAction.class);

		// $JUnit-BEGIN$

		// $JUnit-END$
		return suite;
	}

}
