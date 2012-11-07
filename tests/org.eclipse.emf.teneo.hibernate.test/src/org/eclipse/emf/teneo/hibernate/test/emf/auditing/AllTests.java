/**
 * <copyright>
 *
 * Copyright (c) 2012 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: AllTests.java,v 1.8 2010/04/03 09:21:01 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.auditing;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.teneo.hibernate.test.HibernateTestbed;
import org.eclipse.emf.teneo.test.conf.MultiCfgTestSuite;

/**
 * All auditing tests
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.8 $
 */
public class AllTests {

	public static Test suite() {
		TestSuite suite = new MultiCfgTestSuite(
				"Test for org.eclipse.emf.teneo.hibernate.test.emf.auditing", HibernateTestbed.instance()
						.getConfigurations());
		suite.addTestSuite(EMapAuditingTrueEMapAction.class);
		suite.addTestSuite(SimpleArrayAuditingAction.class);
		suite.addTestSuite(SimpleTypeAuditingAction.class);
		suite.addTestSuite(EMapAuditingNoTrueEMapAction.class);
		suite.addTestSuite(SimpleLibraryAuditingAction.class);
		return suite;
	}

}
